/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.css;

import org.w3c.dom.DOMException;

/**
 * The <code>CSSStyleDeclaration</code> interface represents a single CSS
 * declaration block. This interface may be used to determine the style
 * properties currently set in a block or to set style properties explicitly
 * within the block.
 * <p>
 * While an implementation may not recognize all CSS properties within a CSS
 * declaration block, it is expected to provide access to all specified
 * properties through the <code>CSSStyleDeclaration</code> interface.
 * Furthermore, implementations that support a specific level of CSS should
 * correctly handle CSS shorthand properties for that level. For a further
 * discussion of shorthand properties, see the <code>CSS2Properties</code>
 * interface.
 * 
 * @since DOM Level 2
 */
public interface CSSStyleDeclaration {
	/**
	 * The parsable textual representation of the declaration block (including
	 * the surrounding curly braces). Setting this attribute will result in the
	 * parsing of the new value and resetting of the properties in the
	 * declaration block.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the specified CSS string value has a
	 *                syntax error and is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this declaration is
	 *                readonly.
	 */
	public String getCssText();

	public void setCssText(String cssText) throws CSSException, DOMException;

	/**
	 * Used to retrieve the value of a CSS property if it has been explicitly
	 * set within this declaration block.
	 * 
	 * @param propertyName
	 *            The name of the CSS property. See the CSS property index.
	 * @return Returns the value of the property if it has been explicitly set
	 *         for this declaration block. Returns the empty string if the
	 *         property has not been set.
	 */
	public String getPropertyValue(String propertyName);

	/**
	 * Used to retrieve the object representation of the value of a CSS property
	 * if it has been explicitly set within this declaration block. This method
	 * returns <code>null</code> if the property is a shorthand property.
	 * Shorthand property values can only be accessed and modified as strings,
	 * using the <code>getPropertyValue</code> and <code>setProperty</code>
	 * methods.
	 * 
	 * @param propertyName
	 *            The name of the CSS property. See the CSS property index.
	 * @return Returns the value of the property if it has been explicitly set
	 *         for this declaration block. Returns the <code>null</code> if the
	 *         property has not been set.
	 */
	public CSSValue getPropertyCSSValue(String propertyName);

	/**
	 * Used to remove a CSS property if it has been explicitly set within this
	 * declaration block.
	 * 
	 * @param propertyName
	 *            The name of the CSS property. See the CSS property index.
	 * @return Returns the value of the property if it has been explicitly set
	 *         for this declaration block. Returns the empty string if the
	 *         property has not been set or the property name does not
	 *         correspond to a valid CSS2 property.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this declaration is
	 *                readonly.
	 */
	public String removeProperty(String propertyName) throws DOMException;

	/**
	 * Used to retrieve the priority of a CSS property (e.g. the
	 * <code>"important"</code> qualifier) if the property has been explicitly
	 * set in this declaration block.
	 * 
	 * @param propertyName
	 *            The name of the CSS property. See the CSS property index.
	 * @return A string representing the priority (e.g. <code>"important"</code>
	 *         ) if one exists. The empty string if none exists.
	 */
	public String getPropertyPriority(String propertyName);

	/**
	 * Used to set a property value and priority within this declaration block.
	 * 
	 * @param propertyName
	 *            The name of the CSS property. See the CSS property index.
	 * @param value
	 *            The new value of the property.
	 * @param priority
	 *            The new priority of the property (e.g.
	 *            <code>"important"</code>).
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the specified value has a syntax
	 *                error and is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this declaration is
	 *                readonly.
	 */
	public void setProperty(String propertyName, String value, String priority)
			throws CSSException, DOMException;

	/**
	 * The number of properties that have been explicitly set in this
	 * declaration block.
	 */
	public int getLength();

	/**
	 * Used to retrieve the properties that have been explicitly set in this
	 * declaration block. The order of the properties retrieved using this
	 * method does not have to be the order in which they were set. This method
	 * can be used to iterate over all properties in this declaration block.
	 * 
	 * @param index
	 *            Index of the property name to retrieve.
	 * @return The name of the property at this ordinal position. The empty
	 *         string if no property exists at this position.
	 */
	public String item(int index);

	/**
	 * The CSS rule that contains this declaration block or <code>null</code> if
	 * this <code>CSSStyleDeclaration</code> is not attached to a
	 * <code>CSSRule</code>.
	 */
	public CSSRule getParentRule();
}