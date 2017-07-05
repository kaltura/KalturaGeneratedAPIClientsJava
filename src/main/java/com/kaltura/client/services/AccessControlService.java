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
import com.kaltura.client.types.AccessControl;
import com.kaltura.client.types.AccessControlFilter;
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

/**  Add &amp; Manage Access Controls  */
public class AccessControlService {

	/**  Add new Access Control Profile  */
    public static RequestBuilder<AccessControl> add(AccessControl accessControl)  {
        Params kparams = new Params();
        kparams.add("accessControl", accessControl);

        return new RequestBuilder<AccessControl>(AccessControl.class, "accesscontrol", "add", kparams);
    }

	/**  Delete Access Control Profile by id  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("accesscontrol", "delete", kparams);
    }

	/**  Get Access Control Profile by id  */
    public static RequestBuilder<AccessControl> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<AccessControl>(AccessControl.class, "accesscontrol", "get", kparams);
    }

    public static RequestBuilder<ListResponse<AccessControl>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<AccessControl>> list(AccessControlFilter filter)  {
        return list(filter, null);
    }

	/**  List Access Control Profiles by filter and pager  */
    public static RequestBuilder<ListResponse<AccessControl>> list(AccessControlFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<AccessControl>(AccessControl.class, "accesscontrol", "list", kparams);
    }

	/**  Update Access Control Profile by id  */
    public static RequestBuilder<AccessControl> update(int id, AccessControl accessControl)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("accessControl", accessControl);

        return new RequestBuilder<AccessControl>(AccessControl.class, "accesscontrol", "update", kparams);
    }
}
