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
import com.kaltura.client.types.ExternalMediaEntry;
import com.kaltura.client.types.ExternalMediaEntryFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  External media service lets you upload and manage embed codes and external
  playable content  */
public class ExternalMediaService {

	/**  Add external media entry  */
    public static RequestBuilder<ExternalMediaEntry> add(ExternalMediaEntry entry)  {
        Params kparams = new Params();
        kparams.add("entry", entry);

        return new RequestBuilder<ExternalMediaEntry>(ExternalMediaEntry.class, "externalmedia_externalmedia", "add", kparams);
    }

    public static RequestBuilder<Integer> count()  {
        return count(null);
    }

	/**  Count media entries by filter.  */
    public static RequestBuilder<Integer> count(ExternalMediaEntryFilter filter)  {
        Params kparams = new Params();
        kparams.add("filter", filter);

        return new RequestBuilder<Integer>(Integer.class, "externalmedia_externalmedia", "count", kparams);
    }

	/**  Delete a external media entry.  */
    public static RequestBuilder<Void> delete(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("externalmedia_externalmedia", "delete", kparams);
    }

	/**  Get external media entry by ID.  */
    public static RequestBuilder<ExternalMediaEntry> get(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<ExternalMediaEntry>(ExternalMediaEntry.class, "externalmedia_externalmedia", "get", kparams);
    }

    public static RequestBuilder<ListResponse<ExternalMediaEntry>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<ExternalMediaEntry>> list(ExternalMediaEntryFilter filter)  {
        return list(filter, null);
    }

	/**  List media entries by filter with paging support.  */
    public static RequestBuilder<ListResponse<ExternalMediaEntry>> list(ExternalMediaEntryFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<ExternalMediaEntry>(ExternalMediaEntry.class, "externalmedia_externalmedia", "list", kparams);
    }

	/**  Update external media entry. Only the properties that were set will be updated.  */
    public static RequestBuilder<ExternalMediaEntry> update(String id, ExternalMediaEntry entry)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("entry", entry);

        return new RequestBuilder<ExternalMediaEntry>(ExternalMediaEntry.class, "externalmedia_externalmedia", "update", kparams);
    }
}
