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
import com.kaltura.client.types.Like;
import com.kaltura.client.types.LikeFilter;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Allows user to 'like' or 'unlike' and entry  */
public class LikeService {

    public static RequestBuilder<Boolean> checkLikeExists(String entryId)  {
        return checkLikeExists(entryId, null);
    }

    public static RequestBuilder<Boolean> checkLikeExists(String entryId, String userId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("userId", userId);

        return new RequestBuilder<Boolean>(Boolean.class, "like_like", "checkLikeExists", kparams);
    }

    public static RequestBuilder<Boolean> like(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new RequestBuilder<Boolean>(Boolean.class, "like_like", "like", kparams);
    }

    public static RequestBuilder<ListResponse<Like>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<Like>> list(LikeFilter filter)  {
        return list(filter, null);
    }

    public static RequestBuilder<ListResponse<Like>> list(LikeFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<Like>(Like.class, "like_like", "list", kparams);
    }

    public static RequestBuilder<Boolean> unlike(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new RequestBuilder<Boolean>(Boolean.class, "like_like", "unlike", kparams);
    }
}
