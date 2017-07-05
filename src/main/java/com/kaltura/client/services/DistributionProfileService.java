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
import com.kaltura.client.enums.DistributionProfileStatus;
import com.kaltura.client.types.DistributionProfile;
import com.kaltura.client.types.DistributionProfileFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.PartnerFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Distribution Profile service  */
public class DistributionProfileService {

	/**  Add new Distribution Profile  */
    public static RequestBuilder<DistributionProfile> add(DistributionProfile distributionProfile)  {
        Params kparams = new Params();
        kparams.add("distributionProfile", distributionProfile);

        return new RequestBuilder<DistributionProfile>(DistributionProfile.class, "contentdistribution_distributionprofile", "add", kparams);
    }

	/**  Delete Distribution Profile by id  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("contentdistribution_distributionprofile", "delete", kparams);
    }

	/**  Get Distribution Profile by id  */
    public static RequestBuilder<DistributionProfile> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<DistributionProfile>(DistributionProfile.class, "contentdistribution_distributionprofile", "get", kparams);
    }

    public static RequestBuilder<ListResponse<DistributionProfile>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<DistributionProfile>> list(DistributionProfileFilter filter)  {
        return list(filter, null);
    }

	/**  List all distribution providers  */
    public static RequestBuilder<ListResponse<DistributionProfile>> list(DistributionProfileFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<DistributionProfile>(DistributionProfile.class, "contentdistribution_distributionprofile", "list", kparams);
    }

    public static RequestBuilder<ListResponse<DistributionProfile>> listByPartner()  {
        return listByPartner(null);
    }

    public static RequestBuilder<ListResponse<DistributionProfile>> listByPartner(PartnerFilter filter)  {
        return listByPartner(filter, null);
    }

    public static RequestBuilder<ListResponse<DistributionProfile>> listByPartner(PartnerFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<DistributionProfile>(DistributionProfile.class, "contentdistribution_distributionprofile", "listByPartner", kparams);
    }

	/**  Update Distribution Profile by id  */
    public static RequestBuilder<DistributionProfile> update(int id, DistributionProfile distributionProfile)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("distributionProfile", distributionProfile);

        return new RequestBuilder<DistributionProfile>(DistributionProfile.class, "contentdistribution_distributionprofile", "update", kparams);
    }

	/**  Update Distribution Profile status by id  */
    public static RequestBuilder<DistributionProfile> updateStatus(int id, DistributionProfileStatus status)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("status", status);

        return new RequestBuilder<DistributionProfile>(DistributionProfile.class, "contentdistribution_distributionprofile", "updateStatus", kparams);
    }
}
