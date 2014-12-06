package edu.stthomas.node;

import org.w3c.dom.*;

/**
 * This is a collection of utility methods on the Document Object Model document
 */
public class HTMLUtil {

	/**
	 * Construct a utility class
	 */
	public HTMLUtil() {
		super();
	}

	/**
	 * This will trim trailing and leading white space from a Text node in a DOM
	 * structure.
	 * 
	 * @return java.lang.String
	 * @param textNode
	 *            org.w3c.dom.Text
	 */
	public static String trim(Text textNode) {
		return textNode.getNodeValue().trim();
	}
}