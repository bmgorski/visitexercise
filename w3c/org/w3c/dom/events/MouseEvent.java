/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.events;

import org.w3c.dom.Node;
import org.w3c.dom.views.AbstractView;

/**
 * The <code>MouseEvent</code> interface provides specific contextual
 * information associated with Mouse events.
 * <p>
 * The <code>detail</code> attribute inherited from <code>UIEvent</code>
 * indicates the number of times a mouse button has been pressed and released
 * over the same screen location during a user action. The attribute value is 1
 * when the user begins this action and increments by 1 for each full sequence
 * of pressing and releasing. If the user moves the mouse between the mousedown
 * and mouseup the value will be set to 0, indicating that no click is
 * occurring.
 * 
 * @since DOM Level 2
 */
public interface MouseEvent extends UIEvent {
	/**
	 * <code>screenX</code> indicates the horizontal coordinate at which the
	 * event occurred in relative to the origin of the screen coordinate system.
	 */
	public int getScreenX();

	/**
	 * <code>screenY</code> indicates the vertical coordinate at which the event
	 * occurred relative to the origin of the screen coordinate system.
	 */
	public int getScreenY();

	/**
	 * <code>clientX</code> indicates the horizontal coordinate at which the
	 * event occurred relative to the DOM implementation's client area.
	 */
	public int getClientX();

	/**
	 * <code>clientY</code> indicates the vertical coordinate at which the event
	 * occurred relative to the DOM implementation's client area.
	 */
	public int getClientY();

	/**
	 * <code>ctrlKey</code> indicates whether the 'ctrl' key was depressed
	 * during the firing of the event.
	 */
	public boolean getCtrlKey();

	/**
	 * <code>shiftKey</code> indicates whether the 'shift' key was depressed
	 * during the firing of the event.
	 */
	public boolean getShiftKey();

	/**
	 * <code>altKey</code> indicates whether the 'alt' key was depressed during
	 * the firing of the event. On some platforms this key may map to an
	 * alternative key name.
	 */
	public boolean getAltKey();

	/**
	 * <code>metaKey</code> indicates whether the 'meta' key was depressed
	 * during the firing of the event. On some platforms this key may map to an
	 * alternative key name.
	 */
	public boolean getMetaKey();

	/**
	 * During mouse events caused by the depression or release of a mouse
	 * button, <code>button</code> is used to indicate which mouse button
	 * changed state.
	 */
	public short getButton();

	/**
	 * <code>relatedNode</code> is used to identify a secondary node related to
	 * a UI event.
	 */
	public Node getRelatedNode();

	/**
	 * 
	 * @param typeArg
	 *            Specifies the event type.
	 * @param canBubbleArg
	 *            Specifies whether or not the event can bubble.
	 * @param cancelableArg
	 *            Specifies whether or not the event's default action can be
	 *            prevent.
	 * @param viewArg
	 *            Specifies the <code>Event</code>'s <code>AbstractView</code>.
	 * @param detailArg
	 *            Specifies the <code>Event</code>'s mouse click count.
	 * @param screenXArg
	 *            Specifies the <code>Event</code>'s screen x coordinate
	 * @param screenYArg
	 *            Specifies the <code>Event</code>'s screen y coordinate
	 * @param clientXArg
	 *            Specifies the <code>Event</code>'s client x coordinate
	 * @param clientYArg
	 *            Specifies the <code>Event</code>'s client y coordinate
	 * @param ctrlKeyArg
	 *            Specifies whether or not control key was depressed during the
	 *            <code>Event</code>.
	 * @param altKeyArg
	 *            Specifies whether or not alt key was depressed during the
	 *            <code>Event</code>.
	 * @param shiftKeyArg
	 *            Specifies whether or not shift key was depressed during the
	 *            <code>Event</code>.
	 * @param metaKeyArg
	 *            Specifies whether or not meta key was depressed during the
	 *            <code>Event</code>.
	 * @param buttonArg
	 *            Specifies the <code>Event</code>'s mouse button.
	 * @param relatedNodeArg
	 *            Specifies the <code>Event</code>'s related Node.
	 */
	public void initMouseEvent(String typeArg, boolean canBubbleArg,
			boolean cancelableArg, AbstractView viewArg, short detailArg,
			int screenXArg, int screenYArg, int clientXArg, int clientYArg,
			boolean ctrlKeyArg, boolean altKeyArg, boolean shiftKeyArg,
			boolean metaKeyArg, short buttonArg, Node relatedNodeArg);
}
