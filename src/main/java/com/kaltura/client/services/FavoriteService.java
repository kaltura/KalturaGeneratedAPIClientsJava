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
import com.kaltura.client.types.Favorite;
import com.kaltura.client.types.FavoriteFilter;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class FavoriteService {

	/**  Add media to user&amp;#39;s favorite list  */
    public static RequestBuilder<Favorite> add(Favorite favorite)  {
        Params kparams = new Params();
        kparams.add("favorite", favorite);

        return new RequestBuilder<Favorite>(Favorite.class, "favorite", "add", kparams);
    }

	/**  Remove media from user&amp;#39;s favorite list  */
    public static RequestBuilder<Boolean> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Boolean>(Boolean.class, "favorite", "delete", kparams);
    }

    public static RequestBuilder<ListResponse<Favorite>> list()  {
        return list(null);
    }

	/**  Retrieving users&amp;#39; favorites  */
    public static RequestBuilder<ListResponse<Favorite>> list(FavoriteFilter filter)  {
        Params kparams = new Params();
        kparams.add("filter", filter);

        return new ListResponseRequestBuilder<Favorite>(Favorite.class, "favorite", "list", kparams);
    }
}
