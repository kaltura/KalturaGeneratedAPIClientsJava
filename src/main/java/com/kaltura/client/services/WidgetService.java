// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2017  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.services;

import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.Widget;
import com.kaltura.client.types.WidgetFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  widget service for full widget management  */
public class WidgetService {
	
	public static class AddWidgetBuilder extends RequestBuilder<Widget, Widget.Tokenizer, AddWidgetBuilder> {
		
		public AddWidgetBuilder(Widget widget) {
			super(Widget.class, "widget", "add");
			params.add("widget", widget);
		}
	}

	/**  Add new widget, can be attached to entry or kshow   SourceWidget is ignored.  */
    public static AddWidgetBuilder add(Widget widget)  {
		return new AddWidgetBuilder(widget);
	}
	
	public static class CloneWidgetBuilder extends RequestBuilder<Widget, Widget.Tokenizer, CloneWidgetBuilder> {
		
		public CloneWidgetBuilder(Widget widget) {
			super(Widget.class, "widget", "clone");
			params.add("widget", widget);
		}
	}

	/**  Add widget based on existing widget.   Must provide valid sourceWidgetId  */
    public static CloneWidgetBuilder clone(Widget widget)  {
		return new CloneWidgetBuilder(widget);
	}
	
	public static class GetWidgetBuilder extends RequestBuilder<Widget, Widget.Tokenizer, GetWidgetBuilder> {
		
		public GetWidgetBuilder(String id) {
			super(Widget.class, "widget", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Get widget by id  */
    public static GetWidgetBuilder get(String id)  {
		return new GetWidgetBuilder(id);
	}
	
	public static class ListWidgetBuilder extends ListResponseRequestBuilder<Widget, Widget.Tokenizer, ListWidgetBuilder> {
		
		public ListWidgetBuilder(WidgetFilter filter, FilterPager pager) {
			super(Widget.class, "widget", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListWidgetBuilder list()  {
		return list(null);
	}

	public static ListWidgetBuilder list(WidgetFilter filter)  {
		return list(filter, null);
	}

	/**  Retrieve a list of available widget depends on the filter given  */
    public static ListWidgetBuilder list(WidgetFilter filter, FilterPager pager)  {
		return new ListWidgetBuilder(filter, pager);
	}
	
	public static class UpdateWidgetBuilder extends RequestBuilder<Widget, Widget.Tokenizer, UpdateWidgetBuilder> {
		
		public UpdateWidgetBuilder(String id, Widget widget) {
			super(Widget.class, "widget", "update");
			params.add("id", id);
			params.add("widget", widget);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Update exisiting widget  */
    public static UpdateWidgetBuilder update(String id, Widget widget)  {
		return new UpdateWidgetBuilder(id, widget);
	}
}
