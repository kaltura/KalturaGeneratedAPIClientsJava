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
import com.kaltura.client.enums.ConversionProfileType;
import com.kaltura.client.types.ConversionProfile;
import com.kaltura.client.types.ConversionProfileFilter;
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

/**  Add &amp; Manage Conversion Profiles  */
public class ConversionProfileService {

	/**  Add new Conversion Profile  */
    public static RequestBuilder<ConversionProfile> add(ConversionProfile conversionProfile)  {
        Params kparams = new Params();
        kparams.add("conversionProfile", conversionProfile);

        return new RequestBuilder<ConversionProfile>(ConversionProfile.class, "conversionprofile", "add", kparams);
    }

	/**  Delete Conversion Profile by ID  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("conversionprofile", "delete", kparams);
    }

	/**  Get Conversion Profile by ID  */
    public static RequestBuilder<ConversionProfile> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<ConversionProfile>(ConversionProfile.class, "conversionprofile", "get", kparams);
    }

    public static RequestBuilder<ConversionProfile> getDefault()  {
        return getDefault(null);
    }

	/**  Get the partner's default conversion profile  */
    public static RequestBuilder<ConversionProfile> getDefault(ConversionProfileType type)  {
        Params kparams = new Params();
        kparams.add("type", type);

        return new RequestBuilder<ConversionProfile>(ConversionProfile.class, "conversionprofile", "getDefault", kparams);
    }

    public static RequestBuilder<ListResponse<ConversionProfile>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<ConversionProfile>> list(ConversionProfileFilter filter)  {
        return list(filter, null);
    }

	/**  List Conversion Profiles by filter with paging support  */
    public static RequestBuilder<ListResponse<ConversionProfile>> list(ConversionProfileFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<ConversionProfile>(ConversionProfile.class, "conversionprofile", "list", kparams);
    }

	/**  Set Conversion Profile to be the partner default  */
    public static RequestBuilder<ConversionProfile> setAsDefault(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<ConversionProfile>(ConversionProfile.class, "conversionprofile", "setAsDefault", kparams);
    }

	/**  Update Conversion Profile by ID  */
    public static RequestBuilder<ConversionProfile> update(int id, ConversionProfile conversionProfile)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("conversionProfile", conversionProfile);

        return new RequestBuilder<ConversionProfile>(ConversionProfile.class, "conversionprofile", "update", kparams);
    }
}
