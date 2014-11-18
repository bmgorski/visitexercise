/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.css;

import org.w3c.dom.DOMException;

/**
 * The <code>CSSCharsetRule</code> interface a @charset rule in a CSS style
 * sheet. A <code>@charset</code> rule can be used to define the encoding of the
 * style sheet.
 * 
 * @since DOM Level 2
 */
public interface CSSCharsetRule extends CSSRule {
	/**
	 * The encoding information used in this <code>@charset</code> rule.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the specified encoding value has a
	 *                syntax error and is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this encoding rule
	 *                is readonly.
	 */
	public String getEncoding();

	public void setEncoding(String encoding) throws CSSException, DOMException;
}
