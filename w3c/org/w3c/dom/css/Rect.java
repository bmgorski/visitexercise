/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.css;

/**
 * The <code>Rect</code> interface is used to represent any rect value. This
 * interface reflects the values in the underlying style property. Hence,
 * modifications made through this interface modify the style property.
 * 
 * @since DOM Level 2
 */
public interface Rect {
	/**
	 * This attribute is used for the top of the rect.
	 */
	public CSSPrimitiveValue getTop();

	/**
	 * This attribute is used for the right of the rect.
	 */
	public CSSPrimitiveValue getRight();

	/**
	 * This attribute is used for the bottom of the rect.
	 */
	public CSSPrimitiveValue getBottom();

	/**
	 * This attribute is used for the left of the rect.
	 */
	public CSSPrimitiveValue getLeft();
}
