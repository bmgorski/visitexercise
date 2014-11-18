/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.css;

import org.w3c.dom.DOMException;

/**
 * The <code>CSS2Cursor</code> interface represents the src CSS Level 2
 * descriptor.
 * 
 * @since DOM Level 2
 */
public interface CSS2FontFaceSrc {
	/**
	 * Specifies the source of the font, empty string otherwise.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the specified CSS string value has a
	 *                syntax error and is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this declaration is
	 *                readonly.
	 */
	public String getUri();

	public void setUri(String uri) throws CSSException, DOMException;

	/**
	 * This attribute contains a list of strings for the format CSS function.
	 */
	public CSSValueList getFormat();

	/**
	 * Specifies the full font name of a locally installed font.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the specified CSS string value has a
	 *                syntax error and is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this declaration is
	 *                readonly.
	 */
	public String getFontFaceName();

	public void setFontFaceName(String fontFaceName) throws CSSException,
			DOMException;
}
