/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.css;

import org.w3c.dom.DOMException;

/**
 * The <code>CSS2Properties</code> interface represents a convenience mechanism
 * for retrieving and setting properties within a
 * <code>CSSStyleDeclaration</code>. The attributes of this interface correspond
 * to all the properties specified in CSS2. Getting an attribute of this
 * interface is equivalent to calling the <code>getPropertyValue</code> method
 * of the <code>CSSStyleDeclaration</code> interface. Setting an attribute of
 * this interface is equivalent to calling the <code>setProperty</code> method
 * of the <code>CSSStyleDeclaration</code> interface.
 * <p>
 * A compliant implementation is not required to implement the
 * <code>CSS2Properties</code> interface. If an implementation does implement
 * this interface, the expectation is that language-specific methods can be used
 * to cast from an instance of the <code>CSSStyleDeclaration</code> interface to
 * the <code>CSS2Properties</code> interface.
 * <p>
 * If an implementation does implement this interface, it is expected to
 * understand the specific syntax of the shorthand properties, and apply their
 * semantics; when the <code>margin</code> property is set, for example, the
 * <code>marginTop</code>, <code>marginRight</code>, <code>marginBottom</code>
 * and <code>marginLeft</code> properties are actually being set by the
 * underlying implementation.
 * <p>
 * When dealing with CSS "shorthand" properties, the shorthand properties should
 * be decomposed into their component longhand properties as appropriate, and
 * when querying for their value, the form returned should be the shortest form
 * exactly equivalent to the declarations made in the ruleset. However, if there
 * is no shorthand declaration that could be added to the ruleset without
 * changing in any way the rules already declared in the ruleset (i.e., by
 * adding longhand rules that were previously not declared in the ruleset), then
 * the empty string should be returned for the shorthand property.
 * <p>
 * For example, querying for the <code>font</code> property should not return
 * "normal normal normal 14pt/normal Arial, sans-serif", when "14pt Arial,
 * sans-serif" suffices (the normals are initial values, and are implied by use
 * of the longhand property).
 * <p>
 * If the values for all the longhand properties that compose a particular
 * string are the initial values, then a string consisting of all the initial
 * values should be returned (e.g. a <code>border-width</code> value of "medium"
 * should be returned as such, not as "").
 * <p>
 * For some shorthand properties that take missing values from other sides, such
 * as the <code>margin</code>, <code>padding</code>, and
 * <code>border-[width|style|color]</code> properties, the minimum number of
 * sides possible should be used, i.e., "0px 10px" will be returned instead of
 * "0px 10px 0px 10px".
 * <p>
 * If the value of a shorthand property can not be decomposed into its component
 * longhand properties, as is the case for the <code>font</code> property with a
 * value of "menu", querying for the values of the component longhand properties
 * should return the empty string.
 * 
 * @since DOM Level 2
 */
public interface CSS2Properties {
	/**
	 * See the azimuth property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getAzimuth();

	public void setAzimuth(String azimuth) throws CSSException, DOMException;

	/**
	 * See the background property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBackground();

	public void setBackground(String background) throws CSSException,
			DOMException;

	/**
	 * See the background-attachment property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBackgroundAttachment();

	public void setBackgroundAttachment(String backgroundAttachment)
			throws CSSException, DOMException;

	/**
	 * See the background-color property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBackgroundColor();

	public void setBackgroundColor(String backgroundColor) throws CSSException,
			DOMException;

	/**
	 * See the background-image property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBackgroundImage();

	public void setBackgroundImage(String backgroundImage) throws CSSException,
			DOMException;

	/**
	 * See the background-position property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBackgroundPosition();

	public void setBackgroundPosition(String backgroundPosition)
			throws CSSException, DOMException;

	/**
	 * See the background-repeat property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBackgroundRepeat();

	public void setBackgroundRepeat(String backgroundRepeat)
			throws CSSException, DOMException;

	/**
	 * See the border property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorder();

	public void setBorder(String border) throws CSSException, DOMException;

	/**
	 * See the border-collapse property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderCollapse();

	public void setBorderCollapse(String borderCollapse) throws CSSException,
			DOMException;

	/**
	 * See the border-color property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderColor();

	public void setBorderColor(String borderColor) throws CSSException,
			DOMException;

	/**
	 * See the border-spacing property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderSpacing();

	public void setBorderSpacing(String borderSpacing) throws CSSException,
			DOMException;

	/**
	 * See the border-style property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderStyle();

	public void setBorderStyle(String borderStyle) throws CSSException,
			DOMException;

	/**
	 * See the border-top property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderTop();

	public void setBorderTop(String borderTop) throws CSSException,
			DOMException;

	/**
	 * See the border-right property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderRight();

	public void setBorderRight(String borderRight) throws CSSException,
			DOMException;

	/**
	 * See the border-bottom property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderBottom();

	public void setBorderBottom(String borderBottom) throws CSSException,
			DOMException;

	/**
	 * See the border-left property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderLeft();

	public void setBorderLeft(String borderLeft) throws CSSException,
			DOMException;

	/**
	 * See the border-top-color property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderTopColor();

	public void setBorderTopColor(String borderTopColor) throws CSSException,
			DOMException;

	/**
	 * See the border-right-color property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderRightColor();

	public void setBorderRightColor(String borderRightColor)
			throws CSSException, DOMException;

	/**
	 * See the border-bottom-color property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderBottomColor();

	public void setBorderBottomColor(String borderBottomColor)
			throws CSSException, DOMException;

	/**
	 * See the border-left-color property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderLeftColor();

	public void setBorderLeftColor(String borderLeftColor) throws CSSException,
			DOMException;

	/**
	 * See the border-top-style property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderTopStyle();

	public void setBorderTopStyle(String borderTopStyle) throws CSSException,
			DOMException;

	/**
	 * See the border-right-style property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderRightStyle();

	public void setBorderRightStyle(String borderRightStyle)
			throws CSSException, DOMException;

	/**
	 * See the border-bottom-style property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderBottomStyle();

	public void setBorderBottomStyle(String borderBottomStyle)
			throws CSSException, DOMException;

	/**
	 * See the border-left-style property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderLeftStyle();

	public void setBorderLeftStyle(String borderLeftStyle) throws CSSException,
			DOMException;

	/**
	 * See the border-top-width property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderTopWidth();

	public void setBorderTopWidth(String borderTopWidth) throws CSSException,
			DOMException;

	/**
	 * See the border-right-width property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderRightWidth();

	public void setBorderRightWidth(String borderRightWidth)
			throws CSSException, DOMException;

	/**
	 * See the border-bottom-width property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderBottomWidth();

	public void setBorderBottomWidth(String borderBottomWidth)
			throws CSSException, DOMException;

	/**
	 * See the border-left-width property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderLeftWidth();

	public void setBorderLeftWidth(String borderLeftWidth) throws CSSException,
			DOMException;

	/**
	 * See the border-width property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBorderWidth();

	public void setBorderWidth(String borderWidth) throws CSSException,
			DOMException;

	/**
	 * See the bottom property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getBottom();

	public void setBottom(String bottom) throws CSSException, DOMException;

	/**
	 * See the caption-side property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getCaptionSide();

	public void setCaptionSide(String captionSide) throws CSSException,
			DOMException;

	/**
	 * See the clear property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getClear();

	public void setClear(String clear) throws CSSException, DOMException;

	/**
	 * See the clip property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getClip();

	public void setClip(String clip) throws CSSException, DOMException;

	/**
	 * See the color property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getColor();

	public void setColor(String color) throws CSSException, DOMException;

	/**
	 * See the content property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getContent();

	public void setContent(String content) throws CSSException, DOMException;

	/**
	 * See the counter-increment property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getCounterIncrement();

	public void setCounterIncrement(String counterIncrement)
			throws CSSException, DOMException;

	/**
	 * See the counter-reset property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getCounterReset();

	public void setCounterReset(String counterReset) throws CSSException,
			DOMException;

	/**
	 * See the cue property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getCue();

	public void setCue(String cue) throws CSSException, DOMException;

	/**
	 * See the cue-after property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getCueAfter();

	public void setCueAfter(String cueAfter) throws CSSException, DOMException;

	/**
	 * See the cue-before property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getCueBefore();

	public void setCueBefore(String cueBefore) throws CSSException,
			DOMException;

	/**
	 * See the cursor property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getCursor();

	public void setCursor(String cursor) throws CSSException, DOMException;

	/**
	 * See the direction property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getDirection();

	public void setDirection(String direction) throws CSSException,
			DOMException;

	/**
	 * See the display property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getDisplay();

	public void setDisplay(String display) throws CSSException, DOMException;

	/**
	 * See the elevation property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getElevation();

	public void setElevation(String elevation) throws CSSException,
			DOMException;

	/**
	 * See the empty-cells property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getEmptyCells();

	public void setEmptyCells(String emptyCells) throws CSSException,
			DOMException;

	/**
	 * See the float property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getCssFloat();

	public void setCssFloat(String cssFloat) throws CSSException, DOMException;

	/**
	 * See the font property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getFont();

	public void setFont(String font) throws CSSException, DOMException;

	/**
	 * See the font-family property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getFontFamily();

	public void setFontFamily(String fontFamily) throws CSSException,
			DOMException;

	/**
	 * See the font-size property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getFontSize();

	public void setFontSize(String fontSize) throws CSSException, DOMException;

	/**
	 * See the font-size-adjust property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getFontSizeAdjust();

	public void setFontSizeAdjust(String fontSizeAdjust) throws CSSException,
			DOMException;

	/**
	 * See the font-stretch property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getFontStretch();

	public void setFontStretch(String fontStretch) throws CSSException,
			DOMException;

	/**
	 * See the font-style property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getFontStyle();

	public void setFontStyle(String fontStyle) throws CSSException,
			DOMException;

	/**
	 * See the font-variant property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getFontVariant();

	public void setFontVariant(String fontVariant) throws CSSException,
			DOMException;

	/**
	 * See the font-weight property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getFontWeight();

	public void setFontWeight(String fontWeight) throws CSSException,
			DOMException;

	/**
	 * See the height property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getHeight();

	public void setHeight(String height) throws CSSException, DOMException;

	/**
	 * See the left property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getLeft();

	public void setLeft(String left) throws CSSException, DOMException;

	/**
	 * See the letter-spacing property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getLetterSpacing();

	public void setLetterSpacing(String letterSpacing) throws CSSException,
			DOMException;

	/**
	 * See the line-height property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getLineHeight();

	public void setLineHeight(String lineHeight) throws CSSException,
			DOMException;

	/**
	 * See the list-style property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getListStyle();

	public void setListStyle(String listStyle) throws CSSException,
			DOMException;

	/**
	 * See the list-style-image property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getListStyleImage();

	public void setListStyleImage(String listStyleImage) throws CSSException,
			DOMException;

	/**
	 * See the list-style-position property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getListStylePosition();

	public void setListStylePosition(String listStylePosition)
			throws CSSException, DOMException;

	/**
	 * See the list-style-type property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getListStyleType();

	public void setListStyleType(String listStyleType) throws CSSException,
			DOMException;

	/**
	 * See the margin property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getMargin();

	public void setMargin(String margin) throws CSSException, DOMException;

	/**
	 * See the margin-top property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getMarginTop();

	public void setMarginTop(String marginTop) throws CSSException,
			DOMException;

	/**
	 * See the margin-right property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getMarginRight();

	public void setMarginRight(String marginRight) throws CSSException,
			DOMException;

	/**
	 * See the margin-bottom property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getMarginBottom();

	public void setMarginBottom(String marginBottom) throws CSSException,
			DOMException;

	/**
	 * See the margin-left property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getMarginLeft();

	public void setMarginLeft(String marginLeft) throws CSSException,
			DOMException;

	/**
	 * See the marker-offset property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getMarkerOffset();

	public void setMarkerOffset(String markerOffset) throws CSSException,
			DOMException;

	/**
	 * See the marks property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getMarks();

	public void setMarks(String marks) throws CSSException, DOMException;

	/**
	 * See the max-height property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getMaxHeight();

	public void setMaxHeight(String maxHeight) throws CSSException,
			DOMException;

	/**
	 * See the max-width property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getMaxWidth();

	public void setMaxWidth(String maxWidth) throws CSSException, DOMException;

	/**
	 * See the min-height property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getMinHeight();

	public void setMinHeight(String minHeight) throws CSSException,
			DOMException;

	/**
	 * See the min-width property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getMinWidth();

	public void setMinWidth(String minWidth) throws CSSException, DOMException;

	/**
	 * See the orphans property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getOrphans();

	public void setOrphans(String orphans) throws CSSException, DOMException;

	/**
	 * See the outline property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getOutline();

	public void setOutline(String outline) throws CSSException, DOMException;

	/**
	 * See the outline-color property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getOutlineColor();

	public void setOutlineColor(String outlineColor) throws CSSException,
			DOMException;

	/**
	 * See the outline-style property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getOutlineStyle();

	public void setOutlineStyle(String outlineStyle) throws CSSException,
			DOMException;

	/**
	 * See the outline-width property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getOutlineWidth();

	public void setOutlineWidth(String outlineWidth) throws CSSException,
			DOMException;

	/**
	 * See the overflow property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getOverflow();

	public void setOverflow(String overflow) throws CSSException, DOMException;

	/**
	 * See the padding property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPadding();

	public void setPadding(String padding) throws CSSException, DOMException;

	/**
	 * See the padding-top property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPaddingTop();

	public void setPaddingTop(String paddingTop) throws CSSException,
			DOMException;

	/**
	 * See the padding-right property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPaddingRight();

	public void setPaddingRight(String paddingRight) throws CSSException,
			DOMException;

	/**
	 * See the padding-bottom property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPaddingBottom();

	public void setPaddingBottom(String paddingBottom) throws CSSException,
			DOMException;

	/**
	 * See the padding-left property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPaddingLeft();

	public void setPaddingLeft(String paddingLeft) throws CSSException,
			DOMException;

	/**
	 * See the page property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPage();

	public void setPage(String page) throws CSSException, DOMException;

	/**
	 * See the page-break-after property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPageBreakAfter();

	public void setPageBreakAfter(String pageBreakAfter) throws CSSException,
			DOMException;

	/**
	 * See the page-break-before property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPageBreakBefore();

	public void setPageBreakBefore(String pageBreakBefore) throws CSSException,
			DOMException;

	/**
	 * See the page-break-inside property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPageBreakInside();

	public void setPageBreakInside(String pageBreakInside) throws CSSException,
			DOMException;

	/**
	 * See the pause property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPause();

	public void setPause(String pause) throws CSSException, DOMException;

	/**
	 * See the pause-after property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPauseAfter();

	public void setPauseAfter(String pauseAfter) throws CSSException,
			DOMException;

	/**
	 * See the pause-before property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPauseBefore();

	public void setPauseBefore(String pauseBefore) throws CSSException,
			DOMException;

	/**
	 * See the pitch property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPitch();

	public void setPitch(String pitch) throws CSSException, DOMException;

	/**
	 * See the pitch-range property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPitchRange();

	public void setPitchRange(String pitchRange) throws CSSException,
			DOMException;

	/**
	 * See the play-during property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPlayDuring();

	public void setPlayDuring(String playDuring) throws CSSException,
			DOMException;

	/**
	 * See the position property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getPosition();

	public void setPosition(String position) throws CSSException, DOMException;

	/**
	 * See the quotes property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getQuotes();

	public void setQuotes(String quotes) throws CSSException, DOMException;

	/**
	 * See the richness property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getRichness();

	public void setRichness(String richness) throws CSSException, DOMException;

	/**
	 * See the right property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getRight();

	public void setRight(String right) throws CSSException, DOMException;

	/**
	 * See the size property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getSize();

	public void setSize(String size) throws CSSException, DOMException;

	/**
	 * See the speak property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getSpeak();

	public void setSpeak(String speak) throws CSSException, DOMException;

	/**
	 * See the speak-header property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getSpeakHeader();

	public void setSpeakHeader(String speakHeader) throws CSSException,
			DOMException;

	/**
	 * See the speak-numeral property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getSpeakNumeral();

	public void setSpeakNumeral(String speakNumeral) throws CSSException,
			DOMException;

	/**
	 * See the speak-punctuation property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getSpeakPunctuation();

	public void setSpeakPunctuation(String speakPunctuation)
			throws CSSException, DOMException;

	/**
	 * See the speech-rate property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getSpeechRate();

	public void setSpeechRate(String speechRate) throws CSSException,
			DOMException;

	/**
	 * See the stress property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getStress();

	public void setStress(String stress) throws CSSException, DOMException;

	/**
	 * See the table-layout property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getTableLayout();

	public void setTableLayout(String tableLayout) throws CSSException,
			DOMException;

	/**
	 * See the text-align property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getTextAlign();

	public void setTextAlign(String textAlign) throws CSSException,
			DOMException;

	/**
	 * See the text-decoration property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getTextDecoration();

	public void setTextDecoration(String textDecoration) throws CSSException,
			DOMException;

	/**
	 * See the text-indent property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getTextIndent();

	public void setTextIndent(String textIndent) throws CSSException,
			DOMException;

	/**
	 * See the text-shadow property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getTextShadow();

	public void setTextShadow(String textShadow) throws CSSException,
			DOMException;

	/**
	 * See the text-transform property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getTextTransform();

	public void setTextTransform(String textTransform) throws CSSException,
			DOMException;

	/**
	 * See the top property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getTop();

	public void setTop(String top) throws CSSException, DOMException;

	/**
	 * See the unicode-bidi property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getUnicodeBidi();

	public void setUnicodeBidi(String unicodeBidi) throws CSSException,
			DOMException;

	/**
	 * See the vertical-align property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getVerticalAlign();

	public void setVerticalAlign(String verticalAlign) throws CSSException,
			DOMException;

	/**
	 * See the visibility property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getVisibility();

	public void setVisibility(String visibility) throws CSSException,
			DOMException;

	/**
	 * See the voice-family property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getVoiceFamily();

	public void setVoiceFamily(String voiceFamily) throws CSSException,
			DOMException;

	/**
	 * See the volume property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getVolume();

	public void setVolume(String volume) throws CSSException, DOMException;

	/**
	 * See the white-space property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getWhiteSpace();

	public void setWhiteSpace(String whiteSpace) throws CSSException,
			DOMException;

	/**
	 * See the widows property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getWidows();

	public void setWidows(String widows) throws CSSException, DOMException;

	/**
	 * See the width property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getWidth();

	public void setWidth(String width) throws CSSException, DOMException;

	/**
	 * See the word-spacing property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getWordSpacing();

	public void setWordSpacing(String wordSpacing) throws CSSException,
			DOMException;

	/**
	 * See the z-index property definition in CSS2.
	 * 
	 * @exception CSSException
	 *                SYNTAX_ERR: Raised if the new value has a syntax error and
	 *                is unparsable.
	 * @exception DOMException
	 *                NO_MODIFICATION_ALLOWED_ERR: Raised if this property is
	 *                readonly.
	 */
	public String getZIndex();

	public void setZIndex(String zIndex) throws CSSException, DOMException;
}
