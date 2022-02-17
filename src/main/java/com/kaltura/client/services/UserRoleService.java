// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platforms allow them to do with
// text.
//
// Copyright (C) 2006-2022  Kaltura Inc.
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
import com.kaltura.client.types.UserRole;
import com.kaltura.client.types.UserRoleFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * UserRole service lets you create and manage user roles
 * 
 * @param userRole A new role
 * @param userRoleId The user role's unique identifier
 * @param userRoleId The user role's unique identifier
 * @param userRoleId The user role's unique identifier
 * @param filter A filter used to exclude specific types of user roles
 * @param pager A limit for the number of records to display on a page
 * @param userRoleId The user role's unique identifier
 * @param userRole Id The user role's unique identifier
 */
public class UserRoleService {
	
	public static class AddUserRoleBuilder extends RequestBuilder<UserRole, UserRole.Tokenizer, AddUserRoleBuilder> {
		
		public AddUserRoleBuilder(UserRole userRole) {
			super(UserRole.class, "userrole", "add");
			params.add("userRole", userRole);
		}
	}

	/**
	 * Adds a new user role object to the account.
	 * 
	 * @param userRole A new role
	 */
    public static AddUserRoleBuilder add(UserRole userRole)  {
		return new AddUserRoleBuilder(userRole);
	}
	
	public static class CloneUserRoleBuilder extends RequestBuilder<UserRole, UserRole.Tokenizer, CloneUserRoleBuilder> {
		
		public CloneUserRoleBuilder(int userRoleId) {
			super(UserRole.class, "userrole", "clone");
			params.add("userRoleId", userRoleId);
		}
		
		public void userRoleId(String multirequestToken) {
			params.add("userRoleId", multirequestToken);
		}
	}

	/**
	 * Creates a new user role object that is a duplicate of an existing role.
	 * 
	 * @param userRoleId The user role's unique identifier
	 */
    public static CloneUserRoleBuilder clone(int userRoleId)  {
		return new CloneUserRoleBuilder(userRoleId);
	}
	
	public static class DeleteUserRoleBuilder extends RequestBuilder<UserRole, UserRole.Tokenizer, DeleteUserRoleBuilder> {
		
		public DeleteUserRoleBuilder(int userRoleId) {
			super(UserRole.class, "userrole", "delete");
			params.add("userRoleId", userRoleId);
		}
		
		public void userRoleId(String multirequestToken) {
			params.add("userRoleId", multirequestToken);
		}
	}

	/**
	 * Deletes an existing user role object.
	 * 
	 * @param userRoleId The user role's unique identifier
	 */
    public static DeleteUserRoleBuilder delete(int userRoleId)  {
		return new DeleteUserRoleBuilder(userRoleId);
	}
	
	public static class GetUserRoleBuilder extends RequestBuilder<UserRole, UserRole.Tokenizer, GetUserRoleBuilder> {
		
		public GetUserRoleBuilder(int userRoleId) {
			super(UserRole.class, "userrole", "get");
			params.add("userRoleId", userRoleId);
		}
		
		public void userRoleId(String multirequestToken) {
			params.add("userRoleId", multirequestToken);
		}
	}

	/**
	 * Retrieves a user role object using its ID.
	 * 
	 * @param userRoleId The user role's unique identifier
	 */
    public static GetUserRoleBuilder get(int userRoleId)  {
		return new GetUserRoleBuilder(userRoleId);
	}
	
	public static class ListUserRoleBuilder extends ListResponseRequestBuilder<UserRole, UserRole.Tokenizer, ListUserRoleBuilder> {
		
		public ListUserRoleBuilder(UserRoleFilter filter, FilterPager pager) {
			super(UserRole.class, "userrole", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListUserRoleBuilder list()  {
		return list(null);
	}

	public static ListUserRoleBuilder list(UserRoleFilter filter)  {
		return list(filter, null);
	}

	/**
	 * Lists user role objects that are associated with an account.   Blocked user
	  roles are listed unless you use a filter to exclude them.   Deleted user roles
	  are not listed unless you use a filter to include them.
	 * 
	 * @param filter A filter used to exclude specific types of user roles
	 * @param pager A limit for the number of records to display on a page
	 */
    public static ListUserRoleBuilder list(UserRoleFilter filter, FilterPager pager)  {
		return new ListUserRoleBuilder(filter, pager);
	}
	
	public static class UpdateUserRoleBuilder extends RequestBuilder<UserRole, UserRole.Tokenizer, UpdateUserRoleBuilder> {
		
		public UpdateUserRoleBuilder(int userRoleId, UserRole userRole) {
			super(UserRole.class, "userrole", "update");
			params.add("userRoleId", userRoleId);
			params.add("userRole", userRole);
		}
		
		public void userRoleId(String multirequestToken) {
			params.add("userRoleId", multirequestToken);
		}
	}

	/**
	 * Updates an existing user role object.
	 * 
	 * @param userRoleId The user role's unique identifier
	 * @param userRole Id The user role's unique identifier
	 */
    public static UpdateUserRoleBuilder update(int userRoleId, UserRole userRole)  {
		return new UpdateUserRoleBuilder(userRoleId, userRole);
	}
}
