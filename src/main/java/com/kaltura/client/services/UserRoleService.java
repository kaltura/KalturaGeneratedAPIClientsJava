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
import com.kaltura.client.types.UserRole;
import com.kaltura.client.types.UserRoleFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  UserRole service lets you create and manage user roles  */
public class UserRoleService {

	/**  Adds a new user role object to the account.  */
    public static RequestBuilder<UserRole> add(UserRole userRole)  {
        Params kparams = new Params();
        kparams.add("userRole", userRole);

        return new RequestBuilder<UserRole>(UserRole.class, "userrole", "add", kparams);
    }

	/**  Creates a new user role object that is a duplicate of an existing role.  */
    public static RequestBuilder<UserRole> clone(int userRoleId)  {
        Params kparams = new Params();
        kparams.add("userRoleId", userRoleId);

        return new RequestBuilder<UserRole>(UserRole.class, "userrole", "clone", kparams);
    }

	/**  Deletes an existing user role object.  */
    public static RequestBuilder<UserRole> delete(int userRoleId)  {
        Params kparams = new Params();
        kparams.add("userRoleId", userRoleId);

        return new RequestBuilder<UserRole>(UserRole.class, "userrole", "delete", kparams);
    }

	/**  Retrieves a user role object using its ID.  */
    public static RequestBuilder<UserRole> get(int userRoleId)  {
        Params kparams = new Params();
        kparams.add("userRoleId", userRoleId);

        return new RequestBuilder<UserRole>(UserRole.class, "userrole", "get", kparams);
    }

    public static RequestBuilder<ListResponse<UserRole>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<UserRole>> list(UserRoleFilter filter)  {
        return list(filter, null);
    }

	/**  Lists user role objects that are associated with an account.   Blocked user
	  roles are listed unless you use a filter to exclude them.   Deleted user roles
	  are not listed unless you use a filter to include them.  */
    public static RequestBuilder<ListResponse<UserRole>> list(UserRoleFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<UserRole>(UserRole.class, "userrole", "list", kparams);
    }

	/**  Updates an existing user role object.  */
    public static RequestBuilder<UserRole> update(int userRoleId, UserRole userRole)  {
        Params kparams = new Params();
        kparams.add("userRoleId", userRoleId);
        kparams.add("userRole", userRole);

        return new RequestBuilder<UserRole>(UserRole.class, "userrole", "update", kparams);
    }
}
