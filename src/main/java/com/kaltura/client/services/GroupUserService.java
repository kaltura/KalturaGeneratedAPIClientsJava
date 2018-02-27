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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.types.GroupUser;
import com.kaltura.client.types.GroupUserFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Add &amp; Manage GroupUser
 * 
 * @param groupUser 
 * @param userId 
 * @param groupId 
 * @param filter 
 * @param pager 
 */
public class GroupUserService {
	
	public static class AddGroupUserBuilder extends RequestBuilder<GroupUser, GroupUser.Tokenizer, AddGroupUserBuilder> {
		
		public AddGroupUserBuilder(GroupUser groupUser) {
			super(GroupUser.class, "groupuser", "add");
			params.add("groupUser", groupUser);
		}
	}

	/**
	 * Add new GroupUser
	 * 
	 * @param groupUser 
	 */
    public static AddGroupUserBuilder add(GroupUser groupUser)  {
		return new AddGroupUserBuilder(groupUser);
	}
	
	public static class DeleteGroupUserBuilder extends NullRequestBuilder {
		
		public DeleteGroupUserBuilder(String userId, String groupId) {
			super("groupuser", "delete");
			params.add("userId", userId);
			params.add("groupId", groupId);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
		
		public void groupId(String multirequestToken) {
			params.add("groupId", multirequestToken);
		}
	}

	/**
	 * delete by userId and groupId
	 * 
	 * @param userId 
	 * @param groupId 
	 */
    public static DeleteGroupUserBuilder delete(String userId, String groupId)  {
		return new DeleteGroupUserBuilder(userId, groupId);
	}
	
	public static class ListGroupUserBuilder extends ListResponseRequestBuilder<GroupUser, GroupUser.Tokenizer, ListGroupUserBuilder> {
		
		public ListGroupUserBuilder(GroupUserFilter filter, FilterPager pager) {
			super(GroupUser.class, "groupuser", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListGroupUserBuilder list()  {
		return list(null);
	}

	public static ListGroupUserBuilder list(GroupUserFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List all GroupUsers
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListGroupUserBuilder list(GroupUserFilter filter, FilterPager pager)  {
		return new ListGroupUserBuilder(filter, pager);
	}
}
