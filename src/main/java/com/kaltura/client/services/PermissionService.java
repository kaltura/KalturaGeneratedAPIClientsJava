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
// Copyright (C) 2006-2021  Kaltura Inc.
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

import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.Permission;
import com.kaltura.client.types.PermissionFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Permission service lets you create and manage user permissions
 * 
 * @param permission The new permission
 * @param permissionName The name assigned to the permission
 * @param permissionName The name assigned to the permission
 * @param filter A filter used to exclude specific types of permissions
 * @param pager A limit for the number of records to display on a page
 * @param permissionName The name assigned to the permission
 * @param permission Name The name assigned to the permission
 */
public class PermissionService {
	
	public static class AddPermissionBuilder extends RequestBuilder<Permission, Permission.Tokenizer, AddPermissionBuilder> {
		
		public AddPermissionBuilder(Permission permission) {
			super(Permission.class, "permission", "add");
			params.add("permission", permission);
		}
	}

	/**
	 * Adds a new permission object to the account.
	 * 
	 * @param permission The new permission
	 */
    public static AddPermissionBuilder add(Permission permission)  {
		return new AddPermissionBuilder(permission);
	}
	
	public static class DeletePermissionBuilder extends RequestBuilder<Permission, Permission.Tokenizer, DeletePermissionBuilder> {
		
		public DeletePermissionBuilder(String permissionName) {
			super(Permission.class, "permission", "delete");
			params.add("permissionName", permissionName);
		}
		
		public void permissionName(String multirequestToken) {
			params.add("permissionName", multirequestToken);
		}
	}

	/**
	 * Deletes an existing permission object.
	 * 
	 * @param permissionName The name assigned to the permission
	 */
    public static DeletePermissionBuilder delete(String permissionName)  {
		return new DeletePermissionBuilder(permissionName);
	}
	
	public static class GetPermissionBuilder extends RequestBuilder<Permission, Permission.Tokenizer, GetPermissionBuilder> {
		
		public GetPermissionBuilder(String permissionName) {
			super(Permission.class, "permission", "get");
			params.add("permissionName", permissionName);
		}
		
		public void permissionName(String multirequestToken) {
			params.add("permissionName", multirequestToken);
		}
	}

	/**
	 * Retrieves a permission object using its ID.
	 * 
	 * @param permissionName The name assigned to the permission
	 */
    public static GetPermissionBuilder get(String permissionName)  {
		return new GetPermissionBuilder(permissionName);
	}
	
	public static class GetCurrentPermissionsPermissionBuilder extends RequestBuilder<String, String, GetCurrentPermissionsPermissionBuilder> {
		
		public GetCurrentPermissionsPermissionBuilder() {
			super(String.class, "permission", "getCurrentPermissions");
		}
	}

	/**
	 * Retrieves a list of permissions that apply to the current KS.
	 */
    public static GetCurrentPermissionsPermissionBuilder getCurrentPermissions()  {
		return new GetCurrentPermissionsPermissionBuilder();
	}
	
	public static class ListPermissionBuilder extends ListResponseRequestBuilder<Permission, Permission.Tokenizer, ListPermissionBuilder> {
		
		public ListPermissionBuilder(PermissionFilter filter, FilterPager pager) {
			super(Permission.class, "permission", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListPermissionBuilder list()  {
		return list(null);
	}

	public static ListPermissionBuilder list(PermissionFilter filter)  {
		return list(filter, null);
	}

	/**
	 * Lists permission objects that are associated with an account.   Blocked
	  permissions are listed unless you use a filter to exclude them.   Blocked
	  permissions are listed unless you use a filter to exclude them.
	 * 
	 * @param filter A filter used to exclude specific types of permissions
	 * @param pager A limit for the number of records to display on a page
	 */
    public static ListPermissionBuilder list(PermissionFilter filter, FilterPager pager)  {
		return new ListPermissionBuilder(filter, pager);
	}
	
	public static class UpdatePermissionBuilder extends RequestBuilder<Permission, Permission.Tokenizer, UpdatePermissionBuilder> {
		
		public UpdatePermissionBuilder(String permissionName, Permission permission) {
			super(Permission.class, "permission", "update");
			params.add("permissionName", permissionName);
			params.add("permission", permission);
		}
		
		public void permissionName(String multirequestToken) {
			params.add("permissionName", multirequestToken);
		}
	}

	/**
	 * Updates an existing permission object.
	 * 
	 * @param permissionName The name assigned to the permission
	 * @param permission Name The name assigned to the permission
	 */
    public static UpdatePermissionBuilder update(String permissionName, Permission permission)  {
		return new UpdatePermissionBuilder(permissionName, permission);
	}
}
