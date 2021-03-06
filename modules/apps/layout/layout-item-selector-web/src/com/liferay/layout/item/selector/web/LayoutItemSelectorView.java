/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.layout.item.selector.web;

import com.liferay.item.selector.ItemSelectorView;

import java.io.IOException;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.portlet.PortletURL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author Roberto Díaz
 */
public class LayoutItemSelectorView
	implements ItemSelectorView<LayoutItemSelectorCriterion> {

	public static final String ITEM_SELECTED_CALLBACK =
		LayoutItemSelectorView.class.getName() + "#ITEM_SELECTED_CALLBACK";

	public static final String LAYOUT_ITEM_SELECTOR_CRITERION =
		LayoutItemSelectorView.class.getName() +
			"#LAYOUT_ITEM_SELECTOR_CRITERION";

	public static final String PORTLET_URL =
		LayoutItemSelectorView.class.getName() + "#PORTLET_URL";

	@Override
	public Class<LayoutItemSelectorCriterion> getItemSelectorCriterionClass() {
		return LayoutItemSelectorCriterion.class;
	}

	@Override
	public String getTitle(Locale locale) {
		ResourceBundle resourceBundle = ResourceBundle.getBundle(
			"content/Language", locale);

		return resourceBundle.getString("layouts");
	}

	@Override
	public void renderHTML(
			ServletRequest request, ServletResponse response,
			LayoutItemSelectorCriterion layoutItemSelectorCriterion,
			PortletURL portletURL, String itemSelectedCallback)
		throws IOException, ServletException {

		request.setAttribute(ITEM_SELECTED_CALLBACK, itemSelectedCallback);
		request.setAttribute(
			LAYOUT_ITEM_SELECTOR_CRITERION, layoutItemSelectorCriterion);
		request.setAttribute(PORTLET_URL, portletURL);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher(
			"/o/layout-item-selector-web/layouts.jsp");

		requestDispatcher.include(request, response);
	}

}