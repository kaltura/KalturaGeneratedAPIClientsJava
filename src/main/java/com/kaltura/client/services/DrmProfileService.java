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
import com.kaltura.client.enums.DrmProviderType;
import com.kaltura.client.types.DrmProfile;
import com.kaltura.client.types.DrmProfileFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class DrmProfileService {

	/**  Allows you to add a new DrmProfile object  */
    public static RequestBuilder<DrmProfile> add(DrmProfile drmProfile)  {
        Params kparams = new Params();
        kparams.add("drmProfile", drmProfile);

        return new RequestBuilder<DrmProfile>(DrmProfile.class, "drm_drmprofile", "add", kparams);
    }

	/**  Mark the KalturaDrmProfile object as deleted  */
    public static RequestBuilder<DrmProfile> delete(int drmProfileId)  {
        Params kparams = new Params();
        kparams.add("drmProfileId", drmProfileId);

        return new RequestBuilder<DrmProfile>(DrmProfile.class, "drm_drmprofile", "delete", kparams);
    }

	/**  Retrieve a KalturaDrmProfile object by ID  */
    public static RequestBuilder<DrmProfile> get(int drmProfileId)  {
        Params kparams = new Params();
        kparams.add("drmProfileId", drmProfileId);

        return new RequestBuilder<DrmProfile>(DrmProfile.class, "drm_drmprofile", "get", kparams);
    }

	/**  Retrieve a KalturaDrmProfile object by provider, if no specific profile defined
	  return default profile  */
    public static RequestBuilder<DrmProfile> getByProvider(DrmProviderType provider)  {
        Params kparams = new Params();
        kparams.add("provider", provider);

        return new RequestBuilder<DrmProfile>(DrmProfile.class, "drm_drmprofile", "getByProvider", kparams);
    }

    public static RequestBuilder<ListResponse<DrmProfile>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<DrmProfile>> list(DrmProfileFilter filter)  {
        return list(filter, null);
    }

	/**  List KalturaDrmProfile objects  */
    public static RequestBuilder<ListResponse<DrmProfile>> list(DrmProfileFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<DrmProfile>(DrmProfile.class, "drm_drmprofile", "list", kparams);
    }

	/**  Update an existing KalturaDrmProfile object  */
    public static RequestBuilder<DrmProfile> update(int drmProfileId, DrmProfile drmProfile)  {
        Params kparams = new Params();
        kparams.add("drmProfileId", drmProfileId);
        kparams.add("drmProfile", drmProfile);

        return new RequestBuilder<DrmProfile>(DrmProfile.class, "drm_drmprofile", "update", kparams);
    }
}
