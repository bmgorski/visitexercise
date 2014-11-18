/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.css;

import org.w3c.dom.DOMException;

/**
 * The <code>CSS2CounterIncrement</code> interface represents a simple value for
 * the counter-increment CSS Level 2 property.
 * 
 * @since DOM Level 2
 */
public interface CSS2CounterIncrement extends CSSValue {
	/**
	 * The element name.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the specified identifier has a
	 *                syntax error and is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this identifier is
	 *                readonly.
	 */
	public String getIdentifier();

	public void setIdentifier(String identifier) throws CSSException,
			DOMException;

	/**
	 * The increment (default value is 1).
	 * 
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this identifier is
	 *                readonly.
	 */
	public short getIncrement();

	public void setIncrement(short increment) throws DOMException;
}
