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
import com.kaltura.client.types.Group;
import com.kaltura.client.types.GroupFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class GroupService {
	
	public static class AddGroupBuilder extends RequestBuilder<Group, Group.Tokenizer, AddGroupBuilder> {
		
		public AddGroupBuilder(Group group) {
			super(Group.class, "group_group", "add");
			params.add("group", group);
		}
	}

	/**
	 * Adds a new group (user of type group).
	 * 
	 * @param group a new group
	 */
    public static AddGroupBuilder add(Group group)  {
		return new AddGroupBuilder(group);
	}
	
	public static class CloneGroupBuilder extends RequestBuilder<Group, Group.Tokenizer, CloneGroupBuilder> {
		
		public CloneGroupBuilder(String originalGroupId, String newGroupId, String newGroupName) {
			super(Group.class, "group_group", "clone");
			params.add("originalGroupId", originalGroupId);
			params.add("newGroupId", newGroupId);
			params.add("newGroupName", newGroupName);
		}
		
		public void originalGroupId(String multirequestToken) {
			params.add("originalGroupId", multirequestToken);
		}
		
		public void newGroupId(String multirequestToken) {
			params.add("newGroupId", multirequestToken);
		}
		
		public void newGroupName(String multirequestToken) {
			params.add("newGroupName", multirequestToken);
		}
	}

	public static CloneGroupBuilder clone(String originalGroupId, String newGroupId)  {
		return clone(originalGroupId, newGroupId, null);
	}

	/**
	 * clone the group (groupId), and set group id with the neeGroupName.
	 * 
	 * @param originalGroupId The unique identifier in the partner's system
	 * @param newGroupId The unique identifier in the partner's system
	 * @param newGroupName The name of the new cloned group
	 */
    public static CloneGroupBuilder clone(String originalGroupId, String newGroupId, String newGroupName)  {
		return new CloneGroupBuilder(originalGroupId, newGroupId, newGroupName);
	}
	
	public static class DeleteGroupBuilder extends RequestBuilder<Group, Group.Tokenizer, DeleteGroupBuilder> {
		
		public DeleteGroupBuilder(String groupId) {
			super(Group.class, "group_group", "delete");
			params.add("groupId", groupId);
		}
		
		public void groupId(String multirequestToken) {
			params.add("groupId", multirequestToken);
		}
	}

	/**
	 * Delete group by ID
	 * 
	 * @param groupId The unique identifier in the partner's system
	 */
    public static DeleteGroupBuilder delete(String groupId)  {
		return new DeleteGroupBuilder(groupId);
	}
	
	public static class GetGroupBuilder extends RequestBuilder<Group, Group.Tokenizer, GetGroupBuilder> {
		
		public GetGroupBuilder(String groupId) {
			super(Group.class, "group_group", "get");
			params.add("groupId", groupId);
		}
		
		public void groupId(String multirequestToken) {
			params.add("groupId", multirequestToken);
		}
	}

	/**
	 * Retrieves a group object for a specified group ID.
	 * 
	 * @param groupId The unique identifier in the partner's system
	 */
    public static GetGroupBuilder get(String groupId)  {
		return new GetGroupBuilder(groupId);
	}
	
	public static class ListGroupBuilder extends ListResponseRequestBuilder<Group, Group.Tokenizer, ListGroupBuilder> {
		
		public ListGroupBuilder(GroupFilter filter, FilterPager pager) {
			super(Group.class, "group_group", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListGroupBuilder list()  {
		return list(null);
	}

	public static ListGroupBuilder list(GroupFilter filter)  {
		return list(filter, null);
	}

	/**
	 * Lists group  objects that are associated with an account.   Blocked users are
	  listed unless you use a filter to exclude them.   Deleted users are not listed
	  unless you use a filter to include them.
	 * 
	 * @param filter 
	 * @param pager A limit for the number of records to display on a page
	 */
    public static ListGroupBuilder list(GroupFilter filter, FilterPager pager)  {
		return new ListGroupBuilder(filter, pager);
	}
	
	public static class UpdateGroupBuilder extends RequestBuilder<Group, Group.Tokenizer, UpdateGroupBuilder> {
		
		public UpdateGroupBuilder(String groupId, Group group) {
			super(Group.class, "group_group", "update");
			params.add("groupId", groupId);
			params.add("group", group);
		}
		
		public void groupId(String multirequestToken) {
			params.add("groupId", multirequestToken);
		}
	}

	/**
	 * Update group by ID
	 * 
	 * @param groupId The unique identifier in the partner's system
	 * @param group Id The unique identifier in the partner's system
	 */
    public static UpdateGroupBuilder update(String groupId, Group group)  {
		return new UpdateGroupBuilder(groupId, group);
	}
}
