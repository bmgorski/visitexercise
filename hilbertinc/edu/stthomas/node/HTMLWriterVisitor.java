package edu.stthomas.node;

import java.io.*;

import org.w3c.dom.*;

import edu.stthomas.node.interfaces.NodeVisitor;

/**
 * This is a utility class that demonstrates a simple visitor class that is
 * called via the traverse(...) method of a DOMTree.
 */
public class HTMLWriterVisitor implements NodeVisitor {
	private Writer writer = null;
	private int indent = 0;

	/**
	 * HDumper constructor comment.
	 */
	public HTMLWriterVisitor() {
		super();
	}

	/**
	 * Indicates when we are finished traversing the tree
	 * 
	 * @return boolean
	 */
	@Override
	public boolean continueTraversal() {
		return true;
	}

	/**
	 * Dump the buffered contents of the writer
	 */
	public void flush() throws IOException {
		getWriter().flush();
	}

	/**
	 * This will return an indent string of the proper length
	 * 
	 * @return java.lang.String
	 */
	protected String getIndent() {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < indent; ++i)
			buffer.append(' ');
		return buffer.toString();
	}

	/**
	 * Access the writer to which with dump the XML data. Note that this will
	 * lazy-construct a writer to the standard output if one isn't explicitly
	 * set by the caller.
	 * 
	 * @return java.io.Writer
	 */
	public Writer getWriter() {
		if (null == writer)
			writer = new PrintWriter(System.out);
		return writer;
	}

	/**
	 * Increment the indent level one less tab stop
	 */
	protected void indentLess() {
		indent -= 3;
	}

	/**
	 * Increment the indent level one tag stop
	 */
	protected void indentMore() {
		indent += 3;
	}

	/**
	 * This is called after a Document node is found in the DOM document tree
	 */
	@Override
	public void processDocumentEpilog(org.w3c.dom.Document document)
			throws Exception {
		getWriter().write("</pre></body></html>");
	}

	/**
	 * This is called after a Document node is found in the DOM document tree
	 */
	@Override
	public void processDocumentProlog(org.w3c.dom.Document document)
			throws Exception {
	}

	/**
	 * This will process a DTD node in the tree
	 */
	@Override
	public void processDocumentTypeProlog(DocumentType dtd) throws Exception {
		Writer xml = getWriter();
		xml.write("<!DOCTYPE html>\n");
		xml.write("<html><head></head><body><pre>\n");
	}

	/**
	 * This will post-process an element node
	 */
	@Override
	public void processElementEpilog(Element node) throws Exception {
		Writer xml = getWriter();
		indentLess();
		xml.write(getIndent());
		xml.write("&#60;/");
		xml.write(node.getNodeName());
		xml.write("&#62;\n");
	}

	/**
	 * Pre-process an element in the DOM tree
	 */
	@Override
	public void processElementProlog(Element node) throws Exception {
		Writer xml = getWriter();
		xml.write(getIndent());
		xml.write("&#60;");
		xml.write(node.getTagName());
		xml.write("&#62;\n");
		indentMore();
	}

	/**
	 * Handle text nodes in the document tree
	 */
	@Override
	public void processText(org.w3c.dom.Text text) throws Exception {
		String stringText = HTMLUtil.trim(text);
		
		if(stringText.length() > 0){
			Writer xml = getWriter();
			xml.write(getIndent());
			xml.write(stringText + "\n");
		}
	}

	/**
	 * Access the writer object to which we write the XML data
	 * 
	 * @param xmlWriter
	 *            java.io.Writer
	 */
	public void setWriter(Writer xmlWriter) {
		writer = xmlWriter;
	}
}
