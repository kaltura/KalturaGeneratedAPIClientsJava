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
import com.kaltura.client.types.Bookmark;
import com.kaltura.client.types.BookmarkFilter;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class BookmarkService {

	/**  Report player position and action for the user on the watched asset. Player
	  position is used to later allow resume watching.  */
    public static RequestBuilder<Boolean> add(Bookmark bookmark)  {
        Params kparams = new Params();
        kparams.add("bookmark", bookmark);

        return new RequestBuilder<Boolean>(Boolean.class, "bookmark", "add", kparams);
    }

	/**  Returns player position record/s for the requested asset and the requesting
	  user.               If default user makes the request – player position
	  records are provided for all of the users in the household.              If
	  non-default user makes the request - player position records are provided for
	  the requesting user and the default user of the household.  */
    public static RequestBuilder<ListResponse<Bookmark>> list(BookmarkFilter filter)  {
        Params kparams = new Params();
        kparams.add("filter", filter);

        return new ListResponseRequestBuilder<Bookmark>(Bookmark.class, "bookmark", "list", kparams);
    }
}
