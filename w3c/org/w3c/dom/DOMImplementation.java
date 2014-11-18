/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom;

/**
 * The <code>DOMImplementation</code> interface provides a number of methods for
 * performing operations that are independent of any particular instance of the
 * document object model.
 */
public interface DOMImplementation {
	/**
	 * Test if the DOM implementation implements a specific feature.
	 * 
	 * @param feature
	 *            The package name of the feature to test (case-insensitive).
	 *            The legal values are defined throughout this specification.
	 *            The DOM Level 2 includes "HTML", "XML", as well as the several
	 *            others.
	 * @param version
	 *            This is the version number of the package name to test. In
	 *            Level 2, this is the string "2.0". If the version is not
	 *            specified, supporting any version of the feature will cause
	 *            the method to return <code>true</code>.
	 * @return <code>true</code> if the feature is implemented in the specified
	 *         version, <code>false</code> otherwise.
	 */
	public boolean hasFeature(String feature, String version);

	/**
	 * Creates an empty <code>DocumentType</code> node. HTML-only DOM
	 * implementations do not need to implement this method.
	 * 
	 * @since DOM Level 2
	 * @param qualifiedName
	 *            The qualified name of the document type to be created.
	 * @param publicID
	 *            The document type public identifier.
	 * @param systemID
	 *            The document type system identifier.
	 * @return A new <code>DocumentType</code> node with
	 *         <code>Node.ownerDocument</code> set to <code>null</code>.
	 */
	public DocumentType createDocumentType(String qualifiedName,
			String publicID, String systemID);

	/**
	 * Creates an XML <code>Document</code> object of the specified type with
	 * its document element. HTML-only DOM implementations do not need to
	 * implement this method.
	 * 
	 * @since DOM Level 2
	 * @param namespaceURI
	 *            The namespace URI of the document element to create, or
	 *            <code>null</code>.
	 * @param qualifiedName
	 *            The qualified name of the document element to be created.
	 * @param doctype
	 *            The type of document to be created or <code>null</code>. When
	 *            <code>doctype</code> is not <code>null</code>, its
	 *            <code>Node.ownerDocument</code> attribute is set to the
	 *            document being created.
	 * @return A new <code>Document</code> object.
	 * @exception DOMException
	 *                WRONG_DOCUMENT_ERR: Raised if <code>doctype</code> has
	 *                already been used with a different document.
	 */
	public Document createDocument(String namespaceURI, String qualifiedName,
			DocumentType doctype) throws DOMException;
}
