/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.range;

/**
 * The Range object needs additional exception codes to thosein DOM Level 1.
 * These codes will need to be consolidated withother exception codes added to
 * DOM Level 2.
 */
public abstract class RangeException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public RangeException(short code, String message) {
		super(message);
		this.code = code;
	}

	public short code;
	// RangeExceptionCode
	public static final short BAD_ENDPOINTS_ERR = 201;
	public static final short INVALID_NODE_TYPE_ERR = 202;
	public static final short NULL_NODE_ERR = 203;

}
