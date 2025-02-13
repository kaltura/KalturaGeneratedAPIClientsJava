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
// Copyright (C) 2006-2023  Kaltura Inc.
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
import com.kaltura.client.types.UserAppRole;
import com.kaltura.client.types.UserAppRoleFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Manage application based roles for user
 * 
 * @param userAppRole 
 * @param userId the user id
 * @param appGuid the app-registry id
 * @param userId the user id
 * @param appGuid the app-registry id
 * @param filter 
 * @param pager 
 * @param userId 
 * @param appGuid 
 * @param userAppRole 
 */
public class UserAppRoleService {
	
	public static class AddUserAppRoleBuilder extends RequestBuilder<UserAppRole, UserAppRole.Tokenizer, AddUserAppRoleBuilder> {
		
		public AddUserAppRoleBuilder(UserAppRole userAppRole) {
			super(UserAppRole.class, "userapprole", "add");
			params.add("userAppRole", userAppRole);
		}
	}

	/**
	 * Assign an application role for a user
	 * 
	 * @param userAppRole 
	 */
    public static AddUserAppRoleBuilder add(UserAppRole userAppRole)  {
		return new AddUserAppRoleBuilder(userAppRole);
	}
	
	public static class DeleteUserAppRoleBuilder extends RequestBuilder<Boolean, String, DeleteUserAppRoleBuilder> {
		
		public DeleteUserAppRoleBuilder(String userId, String appGuid) {
			super(Boolean.class, "userapprole", "delete");
			params.add("userId", userId);
			params.add("appGuid", appGuid);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
		
		public void appGuid(String multirequestToken) {
			params.add("appGuid", multirequestToken);
		}
	}

	/**
	 * Delete an application role for a user and app guid
	 * 
	 * @param userId the user id
	 * @param appGuid the app-registry id
	 */
    public static DeleteUserAppRoleBuilder delete(String userId, String appGuid)  {
		return new DeleteUserAppRoleBuilder(userId, appGuid);
	}
	
	public static class GetUserAppRoleBuilder extends RequestBuilder<UserAppRole, UserAppRole.Tokenizer, GetUserAppRoleBuilder> {
		
		public GetUserAppRoleBuilder(String userId, String appGuid) {
			super(UserAppRole.class, "userapprole", "get");
			params.add("userId", userId);
			params.add("appGuid", appGuid);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
		
		public void appGuid(String multirequestToken) {
			params.add("appGuid", multirequestToken);
		}
	}

	/**
	 * Get an application role for a user and app guid
	 * 
	 * @param userId the user id
	 * @param appGuid the app-registry id
	 */
    public static GetUserAppRoleBuilder get(String userId, String appGuid)  {
		return new GetUserAppRoleBuilder(userId, appGuid);
	}
	
	public static class ListUserAppRoleBuilder extends ListResponseRequestBuilder<UserAppRole, UserAppRole.Tokenizer, ListUserAppRoleBuilder> {
		
		public ListUserAppRoleBuilder(UserAppRoleFilter filter, FilterPager pager) {
			super(UserAppRole.class, "userapprole", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListUserAppRoleBuilder list()  {
		return list(null);
	}

	public static ListUserAppRoleBuilder list(UserAppRoleFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List an application roles by filter and pager
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListUserAppRoleBuilder list(UserAppRoleFilter filter, FilterPager pager)  {
		return new ListUserAppRoleBuilder(filter, pager);
	}
	
	public static class UpdateUserAppRoleBuilder extends RequestBuilder<UserAppRole, UserAppRole.Tokenizer, UpdateUserAppRoleBuilder> {
		
		public UpdateUserAppRoleBuilder(String userId, String appGuid, UserAppRole userAppRole) {
			super(UserAppRole.class, "userapprole", "update");
			params.add("userId", userId);
			params.add("appGuid", appGuid);
			params.add("userAppRole", userAppRole);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
		
		public void appGuid(String multirequestToken) {
			params.add("appGuid", multirequestToken);
		}
	}

	/**
	 * Update an application role for a user
	 * 
	 * @param userId 
	 * @param appGuid 
	 * @param userAppRole 
	 */
    public static UpdateUserAppRoleBuilder update(String userId, String appGuid, UserAppRole userAppRole)  {
		return new UpdateUserAppRoleBuilder(userId, appGuid, userAppRole);
	}
}
