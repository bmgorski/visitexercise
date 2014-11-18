/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.css;

import org.w3c.dom.DOMException;

/**
 * The <code>CSSPageRule</code> interface represents a @page rule within a CSS
 * style sheet. The <code>@page</code> rule is used to specify the dimensions,
 * orientation, margins, etc. of a page box for paged media.
 * 
 * @since DOM Level 2
 */
public interface CSSPageRule extends CSSRule {
	/**
	 * The parsable textual representation of the page selector for the rule.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the specified CSS string value has a
	 *                syntax error and is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this rule is
	 *                readonly.
	 */
	public String getSelectorText();

	public void setSelectorText(String selectorText) throws CSSException,
			DOMException;

	/**
	 * The declaration-block of this rule.
	 */
	public CSSStyleDeclaration getStyle();
}
