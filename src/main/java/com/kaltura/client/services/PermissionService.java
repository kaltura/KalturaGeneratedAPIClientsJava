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
import com.kaltura.client.types.Permission;
import com.kaltura.client.types.PermissionFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Permission service lets you create and manage user permissions  */
public class PermissionService {

	/**  Adds a new permission object to the account.  */
    public static RequestBuilder<Permission> add(Permission permission)  {
        Params kparams = new Params();
        kparams.add("permission", permission);

        return new RequestBuilder<Permission>(Permission.class, "permission", "add", kparams);
    }

	/**  Deletes an existing permission object.  */
    public static RequestBuilder<Permission> delete(String permissionName)  {
        Params kparams = new Params();
        kparams.add("permissionName", permissionName);

        return new RequestBuilder<Permission>(Permission.class, "permission", "delete", kparams);
    }

	/**  Retrieves a permission object using its ID.  */
    public static RequestBuilder<Permission> get(String permissionName)  {
        Params kparams = new Params();
        kparams.add("permissionName", permissionName);

        return new RequestBuilder<Permission>(Permission.class, "permission", "get", kparams);
    }

	/**  Retrieves a list of permissions that apply to the current KS.  */
    public static RequestBuilder<String> getCurrentPermissions()  {
        Params kparams = new Params();

        return new RequestBuilder<String>(String.class, "permission", "getCurrentPermissions", kparams);
    }

    public static RequestBuilder<ListResponse<Permission>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<Permission>> list(PermissionFilter filter)  {
        return list(filter, null);
    }

	/**  Lists permission objects that are associated with an account.   Blocked
	  permissions are listed unless you use a filter to exclude them.   Blocked
	  permissions are listed unless you use a filter to exclude them.  */
    public static RequestBuilder<ListResponse<Permission>> list(PermissionFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<Permission>(Permission.class, "permission", "list", kparams);
    }

	/**  Updates an existing permission object.  */
    public static RequestBuilder<Permission> update(String permissionName, Permission permission)  {
        Params kparams = new Params();
        kparams.add("permissionName", permissionName);
        kparams.add("permission", permission);

        return new RequestBuilder<Permission>(Permission.class, "permission", "update", kparams);
    }
}
