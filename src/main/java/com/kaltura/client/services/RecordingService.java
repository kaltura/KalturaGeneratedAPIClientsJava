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
import com.kaltura.client.types.Recording;
import com.kaltura.client.types.RecordingFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class RecordingService {

	/**  Issue a record request for a program  */
    public static RequestBuilder<Recording> add(Recording recording)  {
        Params kparams = new Params();
        kparams.add("recording", recording);

        return new RequestBuilder<Recording>(Recording.class, "recording", "add", kparams);
    }

	/**  Cancel a previously requested recording. Cancel recording can be called for
	  recording in status Scheduled or Recording Only  */
    public static RequestBuilder<Recording> cancel(long id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Recording>(Recording.class, "recording", "cancel", kparams);
    }

	/**  Delete one or more user recording(s). Delete recording can be called only for
	  recordings in status Recorded  */
    public static RequestBuilder<Recording> delete(long id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Recording>(Recording.class, "recording", "delete", kparams);
    }

	/**  Returns recording object by internal identifier  */
    public static RequestBuilder<Recording> get(long id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Recording>(Recording.class, "recording", "get", kparams);
    }

    public static RequestBuilder<ListResponse<Recording>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<Recording>> list(RecordingFilter filter)  {
        return list(filter, null);
    }

	/**  Return a list of recordings for the household with optional filter by status and
	  KSQL.  */
    public static RequestBuilder<ListResponse<Recording>> list(RecordingFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<Recording>(Recording.class, "recording", "list", kparams);
    }

	/**  Protects an existing recording from the cleanup process for the defined
	  protection period  */
    public static RequestBuilder<Recording> protect(long id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Recording>(Recording.class, "recording", "protect", kparams);
    }
}
