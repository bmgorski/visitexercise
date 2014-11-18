/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.css;

import org.w3c.dom.DOMException;

/**
 * The <code>CSS2Cursor</code> interface represents the cursor CSS Level 2
 * property.
 * 
 * @since DOM Level 2
 */
public interface CSS2Cursor extends CSSValue {
	/**
	 * <code>uris</code> represents the list of URIs (<code>CSS_URI</code>) on
	 * the cursor property. The list can be empty.
	 */
	public CSSValueList getUris();

	/**
	 * This identifier represents a generic cursor name or an empty string.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the specified CSS string value has a
	 *                syntax error and is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this declaration is
	 *                readonly.
	 */
	public String getPredefinedCursor();

	public void setPredefinedCursor(String predefinedCursor)
			throws CSSException, DOMException;
}
