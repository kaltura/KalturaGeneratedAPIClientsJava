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
import com.kaltura.client.types.PermissionItem;
import com.kaltura.client.types.PermissionItemFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  PermissionItem service lets you create and manage permission items  */
public class PermissionItemService {

	/**  Adds a new permission item object to the account.   This action is available
	  only to Kaltura system administrators.  */
    public static RequestBuilder<PermissionItem> add(PermissionItem permissionItem)  {
        Params kparams = new Params();
        kparams.add("permissionItem", permissionItem);

        return new RequestBuilder<PermissionItem>(PermissionItem.class, "permissionitem", "add", kparams);
    }

	/**  Deletes an existing permission item object.   This action is available only to
	  Kaltura system administrators.  */
    public static RequestBuilder<PermissionItem> delete(int permissionItemId)  {
        Params kparams = new Params();
        kparams.add("permissionItemId", permissionItemId);

        return new RequestBuilder<PermissionItem>(PermissionItem.class, "permissionitem", "delete", kparams);
    }

	/**  Retrieves a permission item object using its ID.  */
    public static RequestBuilder<PermissionItem> get(int permissionItemId)  {
        Params kparams = new Params();
        kparams.add("permissionItemId", permissionItemId);

        return new RequestBuilder<PermissionItem>(PermissionItem.class, "permissionitem", "get", kparams);
    }

    public static RequestBuilder<ListResponse<PermissionItem>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<PermissionItem>> list(PermissionItemFilter filter)  {
        return list(filter, null);
    }

	/**  Lists permission item objects that are associated with an account.  */
    public static RequestBuilder<ListResponse<PermissionItem>> list(PermissionItemFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<PermissionItem>(PermissionItem.class, "permissionitem", "list", kparams);
    }

	/**  Updates an existing permission item object.   This action is available only to
	  Kaltura system administrators.  */
    public static RequestBuilder<PermissionItem> update(int permissionItemId, PermissionItem permissionItem)  {
        Params kparams = new Params();
        kparams.add("permissionItemId", permissionItemId);
        kparams.add("permissionItem", permissionItem);

        return new RequestBuilder<PermissionItem>(PermissionItem.class, "permissionitem", "update", kparams);
    }
}
