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
import com.kaltura.client.enums.StorageProfileStatus;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.StorageProfile;
import com.kaltura.client.types.StorageProfileFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Storage Profiles service  */
public class StorageProfileService {

	/**  Adds a storage profile to the Kaltura DB.  */
    public static RequestBuilder<StorageProfile> add(StorageProfile storageProfile)  {
        Params kparams = new Params();
        kparams.add("storageProfile", storageProfile);

        return new RequestBuilder<StorageProfile>(StorageProfile.class, "storageprofile", "add", kparams);
    }

	/**  Get storage profile by id  */
    public static RequestBuilder<StorageProfile> get(int storageProfileId)  {
        Params kparams = new Params();
        kparams.add("storageProfileId", storageProfileId);

        return new RequestBuilder<StorageProfile>(StorageProfile.class, "storageprofile", "get", kparams);
    }

    public static RequestBuilder<ListResponse<StorageProfile>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<StorageProfile>> list(StorageProfileFilter filter)  {
        return list(filter, null);
    }

    public static RequestBuilder<ListResponse<StorageProfile>> list(StorageProfileFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<StorageProfile>(StorageProfile.class, "storageprofile", "list", kparams);
    }

	/**  Update storage profile by id  */
    public static RequestBuilder<StorageProfile> update(int storageProfileId, StorageProfile storageProfile)  {
        Params kparams = new Params();
        kparams.add("storageProfileId", storageProfileId);
        kparams.add("storageProfile", storageProfile);

        return new RequestBuilder<StorageProfile>(StorageProfile.class, "storageprofile", "update", kparams);
    }

    public static RequestBuilder<Void> updateStatus(int storageId, StorageProfileStatus status)  {
        Params kparams = new Params();
        kparams.add("storageId", storageId);
        kparams.add("status", status);

        return new NullRequestBuilder("storageprofile", "updateStatus", kparams);
    }
}
