/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de Recherche
 *  en Informatique et en Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package org.w3c.dom.events;

import org.w3c.dom.views.AbstractView;

/**
 * The <code>UIEvent</code> interface provides specific contextual information
 * associated with User Interface events.
 * 
 * @since DOM Level 2
 */
public interface UIEvent extends Event {
	/**
	 * The <code>view</code> attribute identifies the <code>AbstractView</code>
	 * from which the event was generated.
	 */
	public AbstractView getView();

	/**
	 * Specifies some detail information about the <code>Event</code>, depending
	 * on the type of event.
	 */
	public short getDetail();

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
	 *            Specifies the <code>Event</code>'s detail.
	 */
	public void initUIEvent(String typeArg, boolean canBubbleArg,
			boolean cancelableArg, AbstractView viewArg, short detailArg);
}
