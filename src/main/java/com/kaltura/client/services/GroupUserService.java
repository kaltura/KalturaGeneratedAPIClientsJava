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

import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.GroupUser;
import com.kaltura.client.types.GroupUserFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
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
 * @param userId 
 * @param groupIds 
 * @param removeFromExistingGroups 
 * @param createNewGroups 
 * @param groupUserId 
 * @param groupUser Id
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
	
	public static class SyncGroupUserBuilder extends RequestBuilder<BulkUpload, BulkUpload.Tokenizer, SyncGroupUserBuilder> {
		
		public SyncGroupUserBuilder(String userId, String groupIds, boolean removeFromExistingGroups, boolean createNewGroups) {
			super(BulkUpload.class, "groupuser", "sync");
			params.add("userId", userId);
			params.add("groupIds", groupIds);
			params.add("removeFromExistingGroups", removeFromExistingGroups);
			params.add("createNewGroups", createNewGroups);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
		
		public void groupIds(String multirequestToken) {
			params.add("groupIds", multirequestToken);
		}
		
		public void removeFromExistingGroups(String multirequestToken) {
			params.add("removeFromExistingGroups", multirequestToken);
		}
		
		public void createNewGroups(String multirequestToken) {
			params.add("createNewGroups", multirequestToken);
		}
	}

	public static SyncGroupUserBuilder sync(String userId)  {
		return sync(userId, null);
	}

	public static SyncGroupUserBuilder sync(String userId, String groupIds)  {
		return sync(userId, groupIds, true);
	}

	public static SyncGroupUserBuilder sync(String userId, String groupIds, boolean removeFromExistingGroups)  {
		return sync(userId, groupIds, removeFromExistingGroups, true);
	}

	/**
	 * sync by userId and groupIds
	 * 
	 * @param userId 
	 * @param groupIds 
	 * @param removeFromExistingGroups 
	 * @param createNewGroups 
	 */
    public static SyncGroupUserBuilder sync(String userId, String groupIds, boolean removeFromExistingGroups, boolean createNewGroups)  {
		return new SyncGroupUserBuilder(userId, groupIds, removeFromExistingGroups, createNewGroups);
	}
	
	public static class UpdateGroupUserBuilder extends RequestBuilder<GroupUser, GroupUser.Tokenizer, UpdateGroupUserBuilder> {
		
		public UpdateGroupUserBuilder(String groupUserId, GroupUser groupUser) {
			super(GroupUser.class, "groupuser", "update");
			params.add("groupUserId", groupUserId);
			params.add("groupUser", groupUser);
		}
		
		public void groupUserId(String multirequestToken) {
			params.add("groupUserId", multirequestToken);
		}
	}

	/**
	 * update GroupUser
	 * 
	 * @param groupUserId 
	 * @param groupUser Id
	 */
    public static UpdateGroupUserBuilder update(String groupUserId, GroupUser groupUser)  {
		return new UpdateGroupUserBuilder(groupUserId, groupUser);
	}
}
