/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.css;

import org.w3c.dom.DOMException;

/**
 * The <code>CSS2PlayDuring</code> interface represents the play-during CSS
 * Level 2 property.
 * 
 * @since DOM Level 2
 */
public interface CSS2PlayDuring extends CSSValue {
	/**
	 * A code defining the type of the value as define in <code>CSSvalue</code>.
	 * It would be one of <code>CSS_UNKNOWN</code> or <code>CSS_IDENT</code>.
	 */
	public short getPlayDuringType();

	/**
	 * One of <code>"inherit"</code>, <code>"auto"</code>, <code>"none"</code>
	 * or the empty string if the <code>playDuringType</code> is
	 * <code>CSS_UNKNOWN</code>. On setting, it will set the <code>uri</code> to
	 * the empty string and <code>mix</code> and <code>repeat</code> to
	 * <code>false</code>.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the specified CSS string value has a
	 *                syntax error and is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this declaration is
	 *                readonly.
	 */
	public String getPlayDuringIdentifier();

	public void setPlayDuringIdentifier(String playDuringIdentifier)
			throws CSSException, DOMException;

	/**
	 * The sound specified by the <code>uri</code>. It will set the
	 * <code>playDuringType</code> attribute to <code>CSS_UNKNOWN</code>.
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
	 * <code>true</code> if the sound should be mixed. It will be ignored if the
	 * attribute doesn't contain a <code>uri</code>.
	 * 
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this declaration is
	 *                readonly.
	 */
	public boolean getMix();

	public void setMix(boolean mix) throws DOMException;

	/**
	 * <code>true</code> if the sound should be repeated. It will be ignored if
	 * the attribute doesn't contain a <code>uri</code>.
	 * 
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this declaration is
	 *                readonly.
	 */
	public boolean getRepeat();

	public void setRepeat(boolean repeat) throws DOMException;
}
