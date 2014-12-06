package edu.stthomas.node;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.*;
import java.util.*;

import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import com.hilbertinc.base.HException;

import edu.stthomas.node.interfaces.Visitable;
import edu.stthomas.node.interfaces.Visitor;

public class HTMLReflectiveVisitorWriter implements Visitor {
	private Writer writer = null;
	private int nodeLevel = 0;
	
	public String getIndent(){
		StringBuilder stringBuilder = new StringBuilder();
		for(int i = 0; i < nodeLevel; i++){
			stringBuilder.append("  ");
		}
		return stringBuilder.toString();
	}
	
	// ClassMap is a static cache hashmap of hashmaps that
	// stores previously located visit methods on visitor
	// classes. The visitor class is the outer key of this
	// cache. The element-visited class is the inner key.
	// The values of the inner hashmaps are the visit methods
	// located on the respective visitor classes.
	protected static Hashtable<Object, Hashtable<Object, Object>> ClassMap = new Hashtable<Object, Hashtable<Object, Object>>();

	// VISITOR METHODS

	public String dispatch(Object object) {
		try {
			// find the method to invoke
			Method method = getMethod(object.getClass());
						
			// invoke the visitXXX method where XXX is the
			// visitedelementclassname
			Object result = method.invoke(this, new Object[] { object });
			
			// lastly, invoke callAccept ONLY if the element is of Visitable type
			if (result != null && !Boolean.FALSE.equals(result) && object instanceof Visitable){
				callAccept((edu.stthomas.node.interfaces.Visitable) object);
			}
			
			if(result == null){
				return null;
			}
			else{
				return result.toString();
			}
		} catch (InvocationTargetException ex) {
			ex.getTargetException().printStackTrace();
			throw new RuntimeException(ex.toString());
		} catch (Exception e) {
			throw new RuntimeException(e.toString());
		}
	}

	// VISIT METHODS
	@Override
	public void visit(Object object) {
		//Should not get here
		System.out.println(object.toString() + ": was not visited properly");
	}
	
	public String visitElement(Element element) throws IOException{
		writer.write(getIndent() + "&#60;" + element.getNodeName() + "&#62;\n");
		
		return getIndent() + "&#60;/" + element.getNodeName() + "&#62;\n";
	}
	
	public String visitDocument(Document document) throws IOException{
		writer.write("<!DOCTYPE html>\n");
		writer.write("<html>\n   <head></head>\n   <body><pre>\n");
		
		return ("   </pre></body>\n</html>");
	}
	
	public String visitDocumentType(DocumentType documentType) throws IOException{
		//I choose not to do anything here because its part of a document but not the first
		//element in a document so you can't use it to write out a doc type
		//for this example you always write out html anyways
		return null;
	}
	
	public String visitText(Text text) throws IOException{
		String textString = HTMLUtil.trim(text);
		if(textString.length() > 0){
			writer.write(getIndent() + textString + "\n");
		}
		
		return null;
	}

	// SUPPORT METHODS
	public void callAccept(edu.stthomas.node.interfaces.Visitable v) throws Exception {
		v.accept(this);
	}

	protected Method getMethod(Class c) {
		if (c == null){
			return null;
		}
		
		// create methods dictionary from the entry of the hashtable ClassMap
		// whose key is this visitor's class. MAY BE NULL.
		Hashtable<Object, Object> methods = ClassMap.get(getClass());
		
		if (methods == null){
			ClassMap.put(getClass(), methods = new Hashtable<Object, Object>(10));
		}
		
		Method m = (Method) methods.get(c);
		
		if (m != null){
			return m;
		}

		// thisclass is set to the class of this visitor.
		Class<? extends HTMLReflectiveVisitorWriter> thisclass = this.getClass();
		
		// newc is set to the class of the element to be visited (parameter of this method)
		Class newc = c;
				
		// Try the superclasses
		while (m == null && newc != null && newc != Object.class) {
			// set method to the name of the element's class.
			String method = "visit" + newc.getName();
			try {
				// try to set m to a method of this visitor with the
				// name = the "visit" + elementclassname,
				// and with one parameter, which is of elementclass type
				m = thisclass.getMethod(method, new Class[] { newc });
			} catch (NoSuchMethodException e) {
				// if no match on method name, set and try superclasses of
				// elements
				// until Object is reached (per the while loop test above)
				newc = newc.getSuperclass();
			}
		}

		// Try the interfaces of the element if the method has not yet been determined
		if (m == null){
			newc = c;
		}
		
		while (m == null && newc != null && newc != Object.class) {
			Class<?>[] interfaces = newc.getInterfaces();
			
			for (int i = 0; m == null && i < interfaces.length; i++) {
				String method = interfaces[i].getName();
				method = "visit" + method.substring(method.lastIndexOf('.') + 1);
				
				try {
					m = thisclass.getMethod(method, new Class[] { interfaces[i] });
				} catch (NoSuchMethodException e) {
					Method rval = getMethod(interfaces[i]);
					if (rval != null){
						return rval;
					}
				}
			}
			
			newc = newc.getSuperclass();
		}

		// Lastly, if no method has been found before this, locate the default visit method
		if (!c.isInterface() && m == null) {
			try {
				m = thisclass.getMethod("visit", new Class[] { Object.class });
			} catch (Exception e) {
				// this shouldn't happen, since this abstract class defines
				// a visit(Object object) null behavior method for all
				// AbstractReflectiveVisitor subclasses to inherit.
			}
		}

		// if a method was found, cache it, keyed by class c, in the methods hashmap
		if (m != null){
			methods.put(c, m);
		}
		
		return m;
	}

	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}

	public int getNodeLevel() {
		return nodeLevel;
	}

	public void addLevel() {
		nodeLevel++;
	}

	public void subtractLevel() {
		nodeLevel--;
	}

	public void write(String close) throws IOException {
		writer.write(close);
	}
}
