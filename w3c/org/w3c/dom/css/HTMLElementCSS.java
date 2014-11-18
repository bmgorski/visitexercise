/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.css;

import org.w3c.dom.html.HTMLElement;

/**
 * Inline style information attached to HTML elements is exposed through the
 * <code>style</code> attribute. This represents the contents of the STYLE
 * attribute for HTML elements.
 * 
 * @since DOM Level 2
 */
public interface HTMLElementCSS extends HTMLElement {
	/**
	 * The style attribute.
	 */
	public CSSStyleDeclaration getStyle();
}
