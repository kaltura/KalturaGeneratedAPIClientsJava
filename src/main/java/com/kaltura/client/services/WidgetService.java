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

import com.kaltura.client.Params;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.Widget;
import com.kaltura.client.types.WidgetFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  widget service for full widget management  */
public class WidgetService {

	/**  Add new widget, can be attached to entry or kshow   SourceWidget is ignored.  */
    public static RequestBuilder<Widget> add(Widget widget)  {
        Params kparams = new Params();
        kparams.add("widget", widget);

        return new RequestBuilder<Widget>(Widget.class, "widget", "add", kparams);
    }

	/**  Add widget based on existing widget.   Must provide valid sourceWidgetId  */
    public static RequestBuilder<Widget> clone(Widget widget)  {
        Params kparams = new Params();
        kparams.add("widget", widget);

        return new RequestBuilder<Widget>(Widget.class, "widget", "clone", kparams);
    }

	/**  Get widget by id  */
    public static RequestBuilder<Widget> get(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Widget>(Widget.class, "widget", "get", kparams);
    }

    public static RequestBuilder<ListResponse<Widget>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<Widget>> list(WidgetFilter filter)  {
        return list(filter, null);
    }

	/**  Retrieve a list of available widget depends on the filter given  */
    public static RequestBuilder<ListResponse<Widget>> list(WidgetFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<Widget>(Widget.class, "widget", "list", kparams);
    }

	/**  Update exisiting widget  */
    public static RequestBuilder<Widget> update(String id, Widget widget)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("widget", widget);

        return new RequestBuilder<Widget>(Widget.class, "widget", "update", kparams);
    }
}
