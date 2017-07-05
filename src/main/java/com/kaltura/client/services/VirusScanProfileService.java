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
import com.kaltura.client.types.VirusScanProfile;
import com.kaltura.client.types.VirusScanProfileFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Virus scan profile service  */
public class VirusScanProfileService {

	/**  Allows you to add an virus scan profile object and virus scan profile content
	  associated with Kaltura object  */
    public static RequestBuilder<VirusScanProfile> add(VirusScanProfile virusScanProfile)  {
        Params kparams = new Params();
        kparams.add("virusScanProfile", virusScanProfile);

        return new RequestBuilder<VirusScanProfile>(VirusScanProfile.class, "virusscan_virusscanprofile", "add", kparams);
    }

	/**  Mark the virus scan profile as deleted  */
    public static RequestBuilder<VirusScanProfile> delete(int virusScanProfileId)  {
        Params kparams = new Params();
        kparams.add("virusScanProfileId", virusScanProfileId);

        return new RequestBuilder<VirusScanProfile>(VirusScanProfile.class, "virusscan_virusscanprofile", "delete", kparams);
    }

	/**  Retrieve an virus scan profile object by id  */
    public static RequestBuilder<VirusScanProfile> get(int virusScanProfileId)  {
        Params kparams = new Params();
        kparams.add("virusScanProfileId", virusScanProfileId);

        return new RequestBuilder<VirusScanProfile>(VirusScanProfile.class, "virusscan_virusscanprofile", "get", kparams);
    }

    public static RequestBuilder<ListResponse<VirusScanProfile>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<VirusScanProfile>> list(VirusScanProfileFilter filter)  {
        return list(filter, null);
    }

	/**  List virus scan profile objects by filter and pager  */
    public static RequestBuilder<ListResponse<VirusScanProfile>> list(VirusScanProfileFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<VirusScanProfile>(VirusScanProfile.class, "virusscan_virusscanprofile", "list", kparams);
    }

    public static RequestBuilder<Integer> scan(String flavorAssetId)  {
        return scan(flavorAssetId, Integer.MIN_VALUE);
    }

	/**  Scan flavor asset according to virus scan profile  */
    public static RequestBuilder<Integer> scan(String flavorAssetId, int virusScanProfileId)  {
        Params kparams = new Params();
        kparams.add("flavorAssetId", flavorAssetId);
        kparams.add("virusScanProfileId", virusScanProfileId);

        return new RequestBuilder<Integer>(Integer.class, "virusscan_virusscanprofile", "scan", kparams);
    }

	/**  Update exisitng virus scan profile, it is possible to update the virus scan
	  profile id too  */
    public static RequestBuilder<VirusScanProfile> update(int virusScanProfileId, VirusScanProfile virusScanProfile)  {
        Params kparams = new Params();
        kparams.add("virusScanProfileId", virusScanProfileId);
        kparams.add("virusScanProfile", virusScanProfile);

        return new RequestBuilder<VirusScanProfile>(VirusScanProfile.class, "virusscan_virusscanprofile", "update", kparams);
    }
}
