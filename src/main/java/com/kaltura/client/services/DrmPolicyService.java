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
import com.kaltura.client.types.DrmPolicy;
import com.kaltura.client.types.DrmPolicyFilter;
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

public class DrmPolicyService {

	/**  Allows you to add a new DrmPolicy object  */
    public static RequestBuilder<DrmPolicy> add(DrmPolicy drmPolicy)  {
        Params kparams = new Params();
        kparams.add("drmPolicy", drmPolicy);

        return new RequestBuilder<DrmPolicy>(DrmPolicy.class, "drm_drmpolicy", "add", kparams);
    }

	/**  Mark the KalturaDrmPolicy object as deleted  */
    public static RequestBuilder<DrmPolicy> delete(int drmPolicyId)  {
        Params kparams = new Params();
        kparams.add("drmPolicyId", drmPolicyId);

        return new RequestBuilder<DrmPolicy>(DrmPolicy.class, "drm_drmpolicy", "delete", kparams);
    }

	/**  Retrieve a KalturaDrmPolicy object by ID  */
    public static RequestBuilder<DrmPolicy> get(int drmPolicyId)  {
        Params kparams = new Params();
        kparams.add("drmPolicyId", drmPolicyId);

        return new RequestBuilder<DrmPolicy>(DrmPolicy.class, "drm_drmpolicy", "get", kparams);
    }

    public static RequestBuilder<ListResponse<DrmPolicy>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<DrmPolicy>> list(DrmPolicyFilter filter)  {
        return list(filter, null);
    }

	/**  List KalturaDrmPolicy objects  */
    public static RequestBuilder<ListResponse<DrmPolicy>> list(DrmPolicyFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<DrmPolicy>(DrmPolicy.class, "drm_drmpolicy", "list", kparams);
    }

	/**  Update an existing KalturaDrmPolicy object  */
    public static RequestBuilder<DrmPolicy> update(int drmPolicyId, DrmPolicy drmPolicy)  {
        Params kparams = new Params();
        kparams.add("drmPolicyId", drmPolicyId);
        kparams.add("drmPolicy", drmPolicy);

        return new RequestBuilder<DrmPolicy>(DrmPolicy.class, "drm_drmpolicy", "update", kparams);
    }
}
