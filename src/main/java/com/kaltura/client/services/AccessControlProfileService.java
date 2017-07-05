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
import com.kaltura.client.types.AccessControlProfile;
import com.kaltura.client.types.AccessControlProfileFilter;
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

/**  Manage access control profiles  */
public class AccessControlProfileService {

	/**  Add new access control profile  */
    public static RequestBuilder<AccessControlProfile> add(AccessControlProfile accessControlProfile)  {
        Params kparams = new Params();
        kparams.add("accessControlProfile", accessControlProfile);

        return new RequestBuilder<AccessControlProfile>(AccessControlProfile.class, "accesscontrolprofile", "add", kparams);
    }

	/**  Delete access control profile by id  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("accesscontrolprofile", "delete", kparams);
    }

	/**  Get access control profile by id  */
    public static RequestBuilder<AccessControlProfile> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<AccessControlProfile>(AccessControlProfile.class, "accesscontrolprofile", "get", kparams);
    }

    public static RequestBuilder<ListResponse<AccessControlProfile>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<AccessControlProfile>> list(AccessControlProfileFilter filter)  {
        return list(filter, null);
    }

	/**  List access control profiles by filter and pager  */
    public static RequestBuilder<ListResponse<AccessControlProfile>> list(AccessControlProfileFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<AccessControlProfile>(AccessControlProfile.class, "accesscontrolprofile", "list", kparams);
    }

	/**  Update access control profile by id  */
    public static RequestBuilder<AccessControlProfile> update(int id, AccessControlProfile accessControlProfile)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("accessControlProfile", accessControlProfile);

        return new RequestBuilder<AccessControlProfile>(AccessControlProfile.class, "accesscontrolprofile", "update", kparams);
    }
}
