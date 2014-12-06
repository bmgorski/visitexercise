package edu.stthomas.node;

import java.io.*;

import com.hilbertinc.base.HException;
import com.ibm.xml.parser.*;

import edu.stthomas.node.interfaces.NodeVisitor;

import org.w3c.dom.*;

/**
 * This will parse XML for database interaction (i.e. the DTD of db.dtd) and
 * generate SQL and Java classes for access the persistent storage
 */
public class NodeTraversal {
	private Document document;

	/**
	 * HXmlParser constructor comment.
	 */
	public NodeTraversal() {
		super();
	}

	/**
	 * Access the DOM document that is the result of the parsed XML document.
	 * 
	 * @return org.w3c.dom.Document
	 */
	public Document getDocument() {
		return document;
	}

	/**
	 * This will parse the XML data from the input stream passed
	 * 
	 * @param xmlstream
	 *            InputStream
	 */
	public void parse(InputStream xmlstream) throws HException {
		Parser parser = new Parser("XML from stream");
		setDocument(parser.readStream(xmlstream));
	}

	/**
	 * This will parse the XML data from the input stream passed
	 * 
	 * @param xmlstream
	 *            InputStream
	 */
	public void parse(InputStream xmlstream, String name) throws HException {
		Parser parser = new Parser(name);
		setDocument(parser.readStream(xmlstream));
	}

	/**
	 * This is a convenience method that will build a FileInputStream from the
	 * file name passed and call the parser on the stream
	 * 
	 * @param fileName
	 *            java.lang.String
	 */
	public void parse(String fileName) throws HException {
		try {
			FileInputStream stream = new FileInputStream(fileName);
			parse(stream, fileName);
		} catch (IOException exception) {
			HException hException = new HException(exception,
					"I/O error parsing file: " + fileName);
			hException.setClassName("HDOMParser");
			hException.setMethod("parse(String)");
			throw hException;
		}
	}

	/**
	 * Access the DOM document that is the result of the parsed XML document.
	 * 
	 * @param dom
	 *            org.w3c.dom.Document
	 */
	public void setDocument(Document dom) {
		document = dom;
	}

	/**
	 * This will traverse the DOM tree and perform actions on a node within the tree
	 * 
	 * @param visitor HDOMVisitor
	 * 
	 */
	public void traverse(NodeVisitor visitor) throws Exception {		
		if (null == getDocument())
			return; // Nothing to traverse
		
		if (null == visitor)
			return; // Nothing to do once we get to a node, so we might as well leave now
		
		processNode(visitor, document);
	}
	
	protected void processNode(NodeVisitor visitor, Node node) throws Exception {
    	int nodeType = node.getNodeType();
    	
    	if (!visitor.continueTraversal()){
    		return;
    	}
    	    	
		switch (nodeType) {
			case Node.DOCUMENT_TYPE_NODE:
				visitor.processDocumentTypeProlog((DocumentType) node);
			break;
		
			case Node.ELEMENT_NODE:
    			visitor.processElementProlog((Element) node);
			break;
			
			case Node.DOCUMENT_NODE:
    			visitor.processDocumentProlog((Document) node);	
			break;
			
			case Node.TEXT_NODE:
				visitor.processText((Text) node);
			return;
			
			default:
    			Class<? extends Node> nodeClass = node.getClass();
    			System.out.println("Unsupported DOM node type in HDOMParser::processNode. Type is: " + nodeClass.getName());
			break;
    	}
		
		NodeList nodeList = node.getChildNodes();
		for(int i = 0; i < nodeList.getLength(); i++){
			processNode(visitor, nodeList.item(i));
		}
		
		switch (nodeType) {
			case Node.ELEMENT_NODE:
				visitor.processElementEpilog((Element) node);
			break;
			
			case Node.DOCUMENT_NODE:
				visitor.processDocumentEpilog((Document) node);	
			break;
		}
	}
	
	
	
	/**
	 * This will traverse the DOM tree and perform actions on a node within the tree
	 * 
	 * @param visitor HDOMVisitor
	 * 
	 */
	public void traverse(HTMLReflectiveVisitorWriter visitor) throws Exception {		
		if (null == getDocument())
			return; // Nothing to traverse
		
		if (null == visitor)
			return; // Nothing to do once we get to a node, so we might as well leave now
	
		processNode(visitor, document);
	}
	
	protected void processNode(HTMLReflectiveVisitorWriter visitor, Node node) throws Exception {		
		NodeList nodeList = node.getChildNodes();
		
		String close = visitor.dispatch(node);
		
		if(close != null){
			visitor.addLevel();
		}
		
		for(int i = 0; i < nodeList.getLength(); i++){
			processNode(visitor, nodeList.item(i));
		}
		
		if(close != null){
			visitor.write(close);
			visitor.subtractLevel();
		}

	}
}