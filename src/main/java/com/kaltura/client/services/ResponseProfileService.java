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
import com.kaltura.client.enums.ResponseProfileStatus;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.ResponseProfile;
import com.kaltura.client.types.ResponseProfileCacheRecalculateOptions;
import com.kaltura.client.types.ResponseProfileCacheRecalculateResults;
import com.kaltura.client.types.ResponseProfileFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Manage response profiles  */
public class ResponseProfileService {

	/**  Add new response profile  */
    public static RequestBuilder<ResponseProfile> add(ResponseProfile addResponseProfile)  {
        Params kparams = new Params();
        kparams.add("addResponseProfile", addResponseProfile);

        return new RequestBuilder<ResponseProfile>(ResponseProfile.class, "responseprofile", "add", kparams);
    }

	/**  Clone an existing response profile  */
    public static RequestBuilder<ResponseProfile> clone(int id, ResponseProfile profile)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("profile", profile);

        return new RequestBuilder<ResponseProfile>(ResponseProfile.class, "responseprofile", "clone", kparams);
    }

	/**  Delete response profile by id  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("responseprofile", "delete", kparams);
    }

	/**  Get response profile by id  */
    public static RequestBuilder<ResponseProfile> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<ResponseProfile>(ResponseProfile.class, "responseprofile", "get", kparams);
    }

    public static RequestBuilder<ListResponse<ResponseProfile>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<ResponseProfile>> list(ResponseProfileFilter filter)  {
        return list(filter, null);
    }

	/**  List response profiles by filter and pager  */
    public static RequestBuilder<ListResponse<ResponseProfile>> list(ResponseProfileFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<ResponseProfile>(ResponseProfile.class, "responseprofile", "list", kparams);
    }

	/**  Recalculate response profile cached objects  */
    public static RequestBuilder<ResponseProfileCacheRecalculateResults> recalculate(ResponseProfileCacheRecalculateOptions options)  {
        Params kparams = new Params();
        kparams.add("options", options);

        return new RequestBuilder<ResponseProfileCacheRecalculateResults>(ResponseProfileCacheRecalculateResults.class, "responseprofile", "recalculate", kparams);
    }

	/**  Update response profile by id  */
    public static RequestBuilder<ResponseProfile> update(int id, ResponseProfile updateResponseProfile)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("updateResponseProfile", updateResponseProfile);

        return new RequestBuilder<ResponseProfile>(ResponseProfile.class, "responseprofile", "update", kparams);
    }

	/**  Update response profile status by id  */
    public static RequestBuilder<ResponseProfile> updateStatus(int id, ResponseProfileStatus status)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("status", status);

        return new RequestBuilder<ResponseProfile>(ResponseProfile.class, "responseprofile", "updateStatus", kparams);
    }
}
