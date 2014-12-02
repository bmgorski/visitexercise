/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.css;

/**
 * This exception is raised when a specific CSS operation is impossible to
 * perform.
 */
public abstract class CSSException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CSSException(short code, String message) {
		super(message);
		this.code = code;
	}

	public short code;
	// CSSExceptionCode
	public static final short SYNTAX_ERR = 0;
	public static final short INVALID_MODIFICATION_ERR = 1;

}
