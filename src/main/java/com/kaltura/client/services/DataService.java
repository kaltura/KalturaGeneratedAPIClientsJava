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
import com.kaltura.client.types.DataEntry;
import com.kaltura.client.types.DataEntryFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Data service lets you manage data content (textual content)  */
public class DataService {

	/**  Adds a new data entry  */
    public static RequestBuilder<DataEntry> add(DataEntry dataEntry)  {
        Params kparams = new Params();
        kparams.add("dataEntry", dataEntry);

        return new RequestBuilder<DataEntry>(DataEntry.class, "data", "add", kparams);
    }

	/**  Delete a data entry.  */
    public static RequestBuilder<Void> delete(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new NullRequestBuilder("data", "delete", kparams);
    }

    public static RequestBuilder<DataEntry> get(String entryId)  {
        return get(entryId, -1);
    }

	/**  Get data entry by ID.  */
    public static RequestBuilder<DataEntry> get(String entryId, int version)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("version", version);

        return new RequestBuilder<DataEntry>(DataEntry.class, "data", "get", kparams);
    }

    public static RequestBuilder<ListResponse<DataEntry>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<DataEntry>> list(DataEntryFilter filter)  {
        return list(filter, null);
    }

	/**  List data entries by filter with paging support.  */
    public static RequestBuilder<ListResponse<DataEntry>> list(DataEntryFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<DataEntry>(DataEntry.class, "data", "list", kparams);
    }

    public static RequestBuilder<String> serve(String entryId)  {
        return serve(entryId, -1);
    }

    public static RequestBuilder<String> serve(String entryId, int version)  {
        return serve(entryId, version, false);
    }

	/**  serve action returan the file from dataContent field.  */
    public static RequestBuilder<String> serve(String entryId, int version, boolean forceProxy)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("version", version);
        kparams.add("forceProxy", forceProxy);

        return new ServeRequestBuilder("data", "serve", kparams);
    }

	/**  Update data entry. Only the properties that were set will be updated.  */
    public static RequestBuilder<DataEntry> update(String entryId, DataEntry documentEntry)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("documentEntry", documentEntry);

        return new RequestBuilder<DataEntry>(DataEntry.class, "data", "update", kparams);
    }
}
