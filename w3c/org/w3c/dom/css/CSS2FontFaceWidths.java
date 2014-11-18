/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.css;

import org.w3c.dom.DOMException;

/**
 * The <code>CSS2Cursor</code> interface represents a simple value for the
 * widths CSS Level 2 descriptor.
 * 
 * @since DOM Level 2
 */
public interface CSS2FontFaceWidths {
	/**
	 * The range for the characters.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the specified CSS string value has a
	 *                syntax error and is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this declaration is
	 *                readonly.
	 */
	public String getUrange();

	public void setUrange(String urange) throws CSSException, DOMException;

	/**
	 * A list of numbers representing the glyph widths.
	 */
	public CSSValueList getNumbers();
}
