/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.traversal;

import org.w3c.dom.Node;

/**
 * NodeIterators are used to step through a set of nodes, e.g. the set of nodes
 * in a NodeList, the document subtree governed by a particular node, the
 * results of a query, or any other set of nodes. The set of nodes to be
 * iterated is determined by the implementation of the NodeIterator. DOM Level 2
 * specifies a single NodeIterator implementation for document-order traversal
 * of a document subtree. Instances of these iterators are created by calling
 * DocumentTraversal.createNodeIterator().
 * <p>
 * Any Iterator that returns nodes may implement the <code>NodeIterator</code>
 * interface. Users and vendor libraries may also choose to create Iterators
 * that implement the <code>NodeIterator</code> interface.
 * 
 * @since DOM Level 2
 */
public interface NodeIterator {
	/**
	 * This attribute determines which node types are presented via the
	 * Iterator.
	 */
	public int getWhatToShow();

	// Constants for whatToShow
	public static final int SHOW_ALL = 0x0000FFFF;
	public static final int SHOW_ELEMENT = 0x00000001;
	public static final int SHOW_ATTRIBUTE = 0x00000002;
	public static final int SHOW_TEXT = 0x00000004;
	public static final int SHOW_CDATA_SECTION = 0x00000008;
	public static final int SHOW_ENTITY_REFERENCE = 0x00000010;
	public static final int SHOW_ENTITY = 0x00000020;
	public static final int SHOW_PROCESSING_INSTRUCTION = 0x00000040;
	public static final int SHOW_COMMENT = 0x00000080;
	public static final int SHOW_DOCUMENT = 0x00000100;
	public static final int SHOW_DOCUMENT_TYPE = 0x00000200;
	public static final int SHOW_DOCUMENT_FRAGMENT = 0x00000400;
	public static final int SHOW_NOTATION = 0x00000800;

	/**
	 * The filter used to screen nodes.
	 */
	public NodeFilter getFilter();

	/**
	 * The value of this flag determines whether entity reference nodes are
	 * expanded. To produce a view of the document that has entity references
	 * expanded and does not expose the entity reference node itself, use the
	 * whatToShow flags to hide the entity reference node and set
	 * expandEntityReferences to true when creating the iterator. To produce a
	 * view of the document that has entity reference nodes but no entity
	 * expansion, use the whatToShow flags to show the entity reference node and
	 * set expandEntityReferences to true.
	 */
	public boolean getExpandEntityReferences();

	/**
	 * Returns the next node in the set and advances the position of the
	 * Iterator in the set. After a NodeIterator is created, the first call to
	 * nextNode() returns the first node in the set.
	 * 
	 * @return The next <code>Node</code> in the set being iterated over, or
	 *         <code>null</code> if there are no more members in that set.
	 */
	public Node nextNode();

	/**
	 * Returns the previous node in the set and moves the position of the
	 * Iterator backwards in the set.
	 * 
	 * @return The previous <code>Node</code> in the set being iterated over, or
	 *         <code>null</code> if there are no more members in that set.
	 */
	public Node previousNode();
}
