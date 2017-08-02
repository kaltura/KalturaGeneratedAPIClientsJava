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
import com.kaltura.client.types.QuizUserEntry;
import com.kaltura.client.types.UserEntry;
import com.kaltura.client.types.UserEntryFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class UserEntryService {

	/**  Adds a user_entry to the Kaltura DB.  */
    public static RequestBuilder<UserEntry> add(UserEntry userEntry)  {
        Params kparams = new Params();
        kparams.add("userEntry", userEntry);

        return new RequestBuilder<UserEntry>(UserEntry.class, "userentry", "add", kparams);
    }

    public static RequestBuilder<Integer> bulkDelete(UserEntryFilter filter)  {
        Params kparams = new Params();
        kparams.add("filter", filter);

        return new RequestBuilder<Integer>(Integer.class, "userentry", "bulkDelete", kparams);
    }

    public static RequestBuilder<UserEntry> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<UserEntry>(UserEntry.class, "userentry", "delete", kparams);
    }

    public static RequestBuilder<UserEntry> get(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<UserEntry>(UserEntry.class, "userentry", "get", kparams);
    }

    public static RequestBuilder<ListResponse<UserEntry>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<UserEntry>> list(UserEntryFilter filter)  {
        return list(filter, null);
    }

    public static RequestBuilder<ListResponse<UserEntry>> list(UserEntryFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<UserEntry>(UserEntry.class, "userentry", "list", kparams);
    }

	/**  Submits the quiz so that it's status will be submitted and calculates the score
	  for the quiz  */
    public static RequestBuilder<QuizUserEntry> submitQuiz(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<QuizUserEntry>(QuizUserEntry.class, "userentry", "submitQuiz", kparams);
    }

    public static RequestBuilder<Void> update(int id, UserEntry userEntry)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("userEntry", userEntry);

        return new NullRequestBuilder("userentry", "update", kparams);
    }
}
