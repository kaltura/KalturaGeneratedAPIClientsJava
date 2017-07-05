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
import com.kaltura.client.types.ShortLink;
import com.kaltura.client.types.ShortLinkFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Short link service  */
public class ShortLinkService {

	/**  Allows you to add a short link object  */
    public static RequestBuilder<ShortLink> add(ShortLink shortLink)  {
        Params kparams = new Params();
        kparams.add("shortLink", shortLink);

        return new RequestBuilder<ShortLink>(ShortLink.class, "shortlink_shortlink", "add", kparams);
    }

	/**  Mark the short link as deleted  */
    public static RequestBuilder<ShortLink> delete(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<ShortLink>(ShortLink.class, "shortlink_shortlink", "delete", kparams);
    }

	/**  Retrieve an short link object by id  */
    public static RequestBuilder<ShortLink> get(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<ShortLink>(ShortLink.class, "shortlink_shortlink", "get", kparams);
    }

    public static RequestBuilder<String> goto_(String id)  {
        return goto_(id, false);
    }

	/**  Serves short link  */
    public static RequestBuilder<String> goto_(String id, boolean proxy)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("proxy", proxy);

        return new ServeRequestBuilder("shortlink_shortlink", "goto_", kparams);
    }

    public static RequestBuilder<ListResponse<ShortLink>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<ShortLink>> list(ShortLinkFilter filter)  {
        return list(filter, null);
    }

	/**  List short link objects by filter and pager  */
    public static RequestBuilder<ListResponse<ShortLink>> list(ShortLinkFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<ShortLink>(ShortLink.class, "shortlink_shortlink", "list", kparams);
    }

	/**  Update exisitng short link  */
    public static RequestBuilder<ShortLink> update(String id, ShortLink shortLink)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("shortLink", shortLink);

        return new RequestBuilder<ShortLink>(ShortLink.class, "shortlink_shortlink", "update", kparams);
    }
}
