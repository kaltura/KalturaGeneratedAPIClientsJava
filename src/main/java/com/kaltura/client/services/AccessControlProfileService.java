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

import com.kaltura.client.types.AccessControlProfile;
import com.kaltura.client.types.AccessControlProfileFilter;
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

/**  Manage access control profiles  */
public class AccessControlProfileService {
	
	public static class AddAccessControlProfileBuilder extends RequestBuilder<AccessControlProfile, AccessControlProfile.Tokenizer, AddAccessControlProfileBuilder> {
		
		public AddAccessControlProfileBuilder(AccessControlProfile accessControlProfile) {
			super(AccessControlProfile.class, "accesscontrolprofile", "add");
			params.add("accessControlProfile", accessControlProfile);
		}
	}

	/**  Add new access control profile  */
    public static AddAccessControlProfileBuilder add(AccessControlProfile accessControlProfile)  {
		return new AddAccessControlProfileBuilder(accessControlProfile);
	}
	
	public static class DeleteAccessControlProfileBuilder extends NullRequestBuilder {
		
		public DeleteAccessControlProfileBuilder(int id) {
			super("accesscontrolprofile", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Delete access control profile by id  */
    public static DeleteAccessControlProfileBuilder delete(int id)  {
		return new DeleteAccessControlProfileBuilder(id);
	}
	
	public static class GetAccessControlProfileBuilder extends RequestBuilder<AccessControlProfile, AccessControlProfile.Tokenizer, GetAccessControlProfileBuilder> {
		
		public GetAccessControlProfileBuilder(int id) {
			super(AccessControlProfile.class, "accesscontrolprofile", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Get access control profile by id  */
    public static GetAccessControlProfileBuilder get(int id)  {
		return new GetAccessControlProfileBuilder(id);
	}
	
	public static class ListAccessControlProfileBuilder extends ListResponseRequestBuilder<AccessControlProfile, AccessControlProfile.Tokenizer, ListAccessControlProfileBuilder> {
		
		public ListAccessControlProfileBuilder(AccessControlProfileFilter filter, FilterPager pager) {
			super(AccessControlProfile.class, "accesscontrolprofile", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListAccessControlProfileBuilder list()  {
		return list(null);
	}

	public static ListAccessControlProfileBuilder list(AccessControlProfileFilter filter)  {
		return list(filter, null);
	}

	/**  List access control profiles by filter and pager  */
    public static ListAccessControlProfileBuilder list(AccessControlProfileFilter filter, FilterPager pager)  {
		return new ListAccessControlProfileBuilder(filter, pager);
	}
	
	public static class UpdateAccessControlProfileBuilder extends RequestBuilder<AccessControlProfile, AccessControlProfile.Tokenizer, UpdateAccessControlProfileBuilder> {
		
		public UpdateAccessControlProfileBuilder(int id, AccessControlProfile accessControlProfile) {
			super(AccessControlProfile.class, "accesscontrolprofile", "update");
			params.add("id", id);
			params.add("accessControlProfile", accessControlProfile);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Update access control profile by id  */
    public static UpdateAccessControlProfileBuilder update(int id, AccessControlProfile accessControlProfile)  {
		return new UpdateAccessControlProfileBuilder(id, accessControlProfile);
	}
}
