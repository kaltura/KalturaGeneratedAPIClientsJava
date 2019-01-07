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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.types.PermissionItem;
import com.kaltura.client.types.PermissionItemFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * PermissionItem service lets you create and manage permission items
 * 
 * @param permissionItem The new permission item
 * @param permissionItemId The permission item's unique identifier
 * @param permissionItemId The permission item's unique identifier
 * @param filter A filter used to exclude specific types of permission items
 * @param pager A limit for the number of records to display on a page
 * @param permissionItemId The permission item's unique identifier
 * @param permissionItem Id The permission item's unique identifier
 */
public class PermissionItemService {
	
	public static class AddPermissionItemBuilder extends RequestBuilder<PermissionItem, PermissionItem.Tokenizer, AddPermissionItemBuilder> {
		
		public AddPermissionItemBuilder(PermissionItem permissionItem) {
			super(PermissionItem.class, "permissionitem", "add");
			params.add("permissionItem", permissionItem);
		}
	}

	/**
	 * Adds a new permission item object to the account.   This action is available
	  only to Kaltura system administrators.
	 * 
	 * @param permissionItem The new permission item
	 */
    public static AddPermissionItemBuilder add(PermissionItem permissionItem)  {
		return new AddPermissionItemBuilder(permissionItem);
	}
	
	public static class DeletePermissionItemBuilder extends RequestBuilder<PermissionItem, PermissionItem.Tokenizer, DeletePermissionItemBuilder> {
		
		public DeletePermissionItemBuilder(int permissionItemId) {
			super(PermissionItem.class, "permissionitem", "delete");
			params.add("permissionItemId", permissionItemId);
		}
		
		public void permissionItemId(String multirequestToken) {
			params.add("permissionItemId", multirequestToken);
		}
	}

	/**
	 * Deletes an existing permission item object.   This action is available only to
	  Kaltura system administrators.
	 * 
	 * @param permissionItemId The permission item's unique identifier
	 */
    public static DeletePermissionItemBuilder delete(int permissionItemId)  {
		return new DeletePermissionItemBuilder(permissionItemId);
	}
	
	public static class GetPermissionItemBuilder extends RequestBuilder<PermissionItem, PermissionItem.Tokenizer, GetPermissionItemBuilder> {
		
		public GetPermissionItemBuilder(int permissionItemId) {
			super(PermissionItem.class, "permissionitem", "get");
			params.add("permissionItemId", permissionItemId);
		}
		
		public void permissionItemId(String multirequestToken) {
			params.add("permissionItemId", multirequestToken);
		}
	}

	/**
	 * Retrieves a permission item object using its ID.
	 * 
	 * @param permissionItemId The permission item's unique identifier
	 */
    public static GetPermissionItemBuilder get(int permissionItemId)  {
		return new GetPermissionItemBuilder(permissionItemId);
	}
	
	public static class ListPermissionItemBuilder extends ListResponseRequestBuilder<PermissionItem, PermissionItem.Tokenizer, ListPermissionItemBuilder> {
		
		public ListPermissionItemBuilder(PermissionItemFilter filter, FilterPager pager) {
			super(PermissionItem.class, "permissionitem", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListPermissionItemBuilder list()  {
		return list(null);
	}

	public static ListPermissionItemBuilder list(PermissionItemFilter filter)  {
		return list(filter, null);
	}

	/**
	 * Lists permission item objects that are associated with an account.
	 * 
	 * @param filter A filter used to exclude specific types of permission items
	 * @param pager A limit for the number of records to display on a page
	 */
    public static ListPermissionItemBuilder list(PermissionItemFilter filter, FilterPager pager)  {
		return new ListPermissionItemBuilder(filter, pager);
	}
	
	public static class UpdatePermissionItemBuilder extends RequestBuilder<PermissionItem, PermissionItem.Tokenizer, UpdatePermissionItemBuilder> {
		
		public UpdatePermissionItemBuilder(int permissionItemId, PermissionItem permissionItem) {
			super(PermissionItem.class, "permissionitem", "update");
			params.add("permissionItemId", permissionItemId);
			params.add("permissionItem", permissionItem);
		}
		
		public void permissionItemId(String multirequestToken) {
			params.add("permissionItemId", multirequestToken);
		}
	}

	/**
	 * Updates an existing permission item object.   This action is available only to
	  Kaltura system administrators.
	 * 
	 * @param permissionItemId The permission item's unique identifier
	 * @param permissionItem Id The permission item's unique identifier
	 */
    public static UpdatePermissionItemBuilder update(int permissionItemId, PermissionItem permissionItem)  {
		return new UpdatePermissionItemBuilder(permissionItemId, permissionItem);
	}
}
