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
import com.kaltura.client.types.FlavorParams;
import com.kaltura.client.types.FlavorParamsFilter;
import com.kaltura.client.types.ListResponse;
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

/**  Add &amp; Manage Flavor Params  */
public class FlavorParamsService {

	/**  Add new Flavor Params  */
    public static RequestBuilder<FlavorParams> add(FlavorParams flavorParams)  {
        Params kparams = new Params();
        kparams.add("flavorParams", flavorParams);

        return new RequestBuilder<FlavorParams>(FlavorParams.class, "flavorparams", "add", kparams);
    }

	/**  Delete Flavor Params by ID  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("flavorparams", "delete", kparams);
    }

	/**  Get Flavor Params by ID  */
    public static RequestBuilder<FlavorParams> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<FlavorParams>(FlavorParams.class, "flavorparams", "get", kparams);
    }

	/**  Get Flavor Params by Conversion Profile ID  */
    public static RequestBuilder<List<FlavorParams>> getByConversionProfileId(int conversionProfileId)  {
        Params kparams = new Params();
        kparams.add("conversionProfileId", conversionProfileId);

        return new ArrayRequestBuilder<FlavorParams>(FlavorParams.class, "flavorparams", "getByConversionProfileId", kparams);
    }

    public static RequestBuilder<ListResponse<FlavorParams>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<FlavorParams>> list(FlavorParamsFilter filter)  {
        return list(filter, null);
    }

	/**  List Flavor Params by filter with paging support (By default - all system
	  default params will be listed too)  */
    public static RequestBuilder<ListResponse<FlavorParams>> list(FlavorParamsFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<FlavorParams>(FlavorParams.class, "flavorparams", "list", kparams);
    }

	/**  Update Flavor Params by ID  */
    public static RequestBuilder<FlavorParams> update(int id, FlavorParams flavorParams)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("flavorParams", flavorParams);

        return new RequestBuilder<FlavorParams>(FlavorParams.class, "flavorparams", "update", kparams);
    }
}
