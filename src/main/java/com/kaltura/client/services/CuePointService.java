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

import com.kaltura.client.FileHolder;
import com.kaltura.client.Files;
import com.kaltura.client.Params;
import com.kaltura.client.enums.CuePointStatus;
import com.kaltura.client.types.CuePoint;
import com.kaltura.client.types.CuePointFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Cue Point service  */
public class CuePointService {

	/**  Allows you to add an cue point object associated with an entry  */
    public static RequestBuilder<CuePoint> add(CuePoint cuePoint)  {
        Params kparams = new Params();
        kparams.add("cuePoint", cuePoint);

        return new RequestBuilder<CuePoint>(CuePoint.class, "cuepoint_cuepoint", "add", kparams);
    }

    public static RequestBuilder<ListResponse<CuePoint>> addFromBulk(File fileData)  {
        return addFromBulk(new FileHolder(fileData));
    }

    public static RequestBuilder<ListResponse<CuePoint>> addFromBulk(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
        return addFromBulk(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
    }

    public static RequestBuilder<ListResponse<CuePoint>> addFromBulk(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
        return addFromBulk(new FileHolder(fileData, fileDataMimeType, fileDataName));
    }

	/**  Allows you to add multiple cue points objects by uploading XML that contains
	  multiple cue point definitions  */
    public static RequestBuilder<ListResponse<CuePoint>> addFromBulk(FileHolder fileData)  {
        Params kparams = new Params();
        Files kfiles = new Files();
        kfiles.add("fileData", fileData);

        return new ListResponseRequestBuilder<CuePoint>(CuePoint.class, "cuepoint_cuepoint", "addFromBulk", kparams, kfiles);
    }

	/**  Clone cuePoint with id to given entry  */
    public static RequestBuilder<CuePoint> clone(String id, String entryId)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("entryId", entryId);

        return new RequestBuilder<CuePoint>(CuePoint.class, "cuepoint_cuepoint", "clone", kparams);
    }

    public static RequestBuilder<Integer> count()  {
        return count(null);
    }

	/**  count cue point objects by filter  */
    public static RequestBuilder<Integer> count(CuePointFilter filter)  {
        Params kparams = new Params();
        kparams.add("filter", filter);

        return new RequestBuilder<Integer>(Integer.class, "cuepoint_cuepoint", "count", kparams);
    }

	/**  delete cue point by id, and delete all children cue points  */
    public static RequestBuilder<Void> delete(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("cuepoint_cuepoint", "delete", kparams);
    }

	/**  Retrieve an CuePoint object by id  */
    public static RequestBuilder<CuePoint> get(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<CuePoint>(CuePoint.class, "cuepoint_cuepoint", "get", kparams);
    }

    public static RequestBuilder<ListResponse<CuePoint>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<CuePoint>> list(CuePointFilter filter)  {
        return list(filter, null);
    }

	/**  List cue point objects by filter and pager  */
    public static RequestBuilder<ListResponse<CuePoint>> list(CuePointFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<CuePoint>(CuePoint.class, "cuepoint_cuepoint", "list", kparams);
    }

    public static RequestBuilder<String> serveBulk()  {
        return serveBulk(null);
    }

    public static RequestBuilder<String> serveBulk(CuePointFilter filter)  {
        return serveBulk(filter, null);
    }

	/**  Download multiple cue points objects as XML definitions  */
    public static RequestBuilder<String> serveBulk(CuePointFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ServeRequestBuilder("cuepoint_cuepoint", "serveBulk", kparams);
    }

	/**  Update cue point by id  */
    public static RequestBuilder<CuePoint> update(String id, CuePoint cuePoint)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("cuePoint", cuePoint);

        return new RequestBuilder<CuePoint>(CuePoint.class, "cuepoint_cuepoint", "update", kparams);
    }

	/**  Update cuePoint status by id  */
    public static RequestBuilder<Void> updateStatus(String id, CuePointStatus status)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("status", status);

        return new NullRequestBuilder("cuepoint_cuepoint", "updateStatus", kparams);
    }
}
