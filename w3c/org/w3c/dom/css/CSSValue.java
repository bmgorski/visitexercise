/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.css;

import org.w3c.dom.DOMException;

/**
 * The <code>CSSValue</code> interface represents a simple or a complex value.
 * 
 * @since DOM Level 2
 */
public interface CSSValue {
	// UnitTypes
	public static final short CSS_INHERIT = 0;
	public static final short CSS_PRIMITIVE_VALUE = 1;
	public static final short CSS_VALUE_LIST = 2;
	public static final short CSS_CUSTOM = 3;

	/**
	 * A string representation of the current value.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the specified CSS string value has a
	 *                syntax error and is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this value is
	 *                readonly.
	 */
	public String getCssText();

	public void setCssText(String cssText) throws CSSException, DOMException;

	/**
	 * A code defining the type of the value as defined above.
	 */
	public short getValueType();
}
