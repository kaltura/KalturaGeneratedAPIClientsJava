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
import com.kaltura.client.types.ThumbParams;
import com.kaltura.client.types.ThumbParamsFilter;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Add &amp; Manage Thumb Params  */
public class ThumbParamsService {

	/**  Add new Thumb Params  */
    public static RequestBuilder<ThumbParams> add(ThumbParams thumbParams)  {
        Params kparams = new Params();
        kparams.add("thumbParams", thumbParams);

        return new RequestBuilder<ThumbParams>(ThumbParams.class, "thumbparams", "add", kparams);
    }

	/**  Delete Thumb Params by ID  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("thumbparams", "delete", kparams);
    }

	/**  Get Thumb Params by ID  */
    public static RequestBuilder<ThumbParams> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<ThumbParams>(ThumbParams.class, "thumbparams", "get", kparams);
    }

	/**  Get Thumb Params by Conversion Profile ID  */
    public static RequestBuilder<List<ThumbParams>> getByConversionProfileId(int conversionProfileId)  {
        Params kparams = new Params();
        kparams.add("conversionProfileId", conversionProfileId);

        return new ArrayRequestBuilder<ThumbParams>(ThumbParams.class, "thumbparams", "getByConversionProfileId", kparams);
    }

    public static RequestBuilder<ListResponse<ThumbParams>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<ThumbParams>> list(ThumbParamsFilter filter)  {
        return list(filter, null);
    }

	/**  List Thumb Params by filter with paging support (By default - all system default
	  params will be listed too)  */
    public static RequestBuilder<ListResponse<ThumbParams>> list(ThumbParamsFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<ThumbParams>(ThumbParams.class, "thumbparams", "list", kparams);
    }

	/**  Update Thumb Params by ID  */
    public static RequestBuilder<ThumbParams> update(int id, ThumbParams thumbParams)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("thumbParams", thumbParams);

        return new RequestBuilder<ThumbParams>(ThumbParams.class, "thumbparams", "update", kparams);
    }
}
