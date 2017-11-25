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

import com.kaltura.client.types.AccessControl;
import com.kaltura.client.types.AccessControlFilter;
import com.kaltura.client.types.FilterPager;
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
 * Add &amp; Manage Access Controls
 * 
 * @param accessControl 
 * @param id 
 * @param id 
 * @param filter 
 * @param pager 
 * @param id 
 * @param accessControl 
 */
public class AccessControlService {
	
	public static class AddAccessControlBuilder extends RequestBuilder<AccessControl, AccessControl.Tokenizer, AddAccessControlBuilder> {
		
		public AddAccessControlBuilder(AccessControl accessControl) {
			super(AccessControl.class, "accesscontrol", "add");
			params.add("accessControl", accessControl);
		}
	}

	/**
	 * Add new Access Control Profile
	 * 
	 * @param accessControl 
	 */
    public static AddAccessControlBuilder add(AccessControl accessControl)  {
		return new AddAccessControlBuilder(accessControl);
	}
	
	public static class DeleteAccessControlBuilder extends NullRequestBuilder {
		
		public DeleteAccessControlBuilder(int id) {
			super("accesscontrol", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete Access Control Profile by id
	 * 
	 * @param id 
	 */
    public static DeleteAccessControlBuilder delete(int id)  {
		return new DeleteAccessControlBuilder(id);
	}
	
	public static class GetAccessControlBuilder extends RequestBuilder<AccessControl, AccessControl.Tokenizer, GetAccessControlBuilder> {
		
		public GetAccessControlBuilder(int id) {
			super(AccessControl.class, "accesscontrol", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get Access Control Profile by id
	 * 
	 * @param id 
	 */
    public static GetAccessControlBuilder get(int id)  {
		return new GetAccessControlBuilder(id);
	}
	
	public static class ListAccessControlBuilder extends ListResponseRequestBuilder<AccessControl, AccessControl.Tokenizer, ListAccessControlBuilder> {
		
		public ListAccessControlBuilder(AccessControlFilter filter, FilterPager pager) {
			super(AccessControl.class, "accesscontrol", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListAccessControlBuilder list()  {
		return list(null);
	}

	public static ListAccessControlBuilder list(AccessControlFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List Access Control Profiles by filter and pager
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListAccessControlBuilder list(AccessControlFilter filter, FilterPager pager)  {
		return new ListAccessControlBuilder(filter, pager);
	}
	
	public static class UpdateAccessControlBuilder extends RequestBuilder<AccessControl, AccessControl.Tokenizer, UpdateAccessControlBuilder> {
		
		public UpdateAccessControlBuilder(int id, AccessControl accessControl) {
			super(AccessControl.class, "accesscontrol", "update");
			params.add("id", id);
			params.add("accessControl", accessControl);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update Access Control Profile by id
	 * 
	 * @param id 
	 * @param accessControl 
	 */
    public static UpdateAccessControlBuilder update(int id, AccessControl accessControl)  {
		return new UpdateAccessControlBuilder(id, accessControl);
	}
}
