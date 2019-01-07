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

import com.kaltura.client.enums.StorageProfileStatus;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.StorageProfile;
import com.kaltura.client.types.StorageProfileFilter;
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
 * Storage Profiles service
 * 
 * @param storageProfile 
 * @param storageProfileId 
 * @param filter 
 * @param pager 
 * @param storageProfileId 
 * @param storageProfile Id
 * @param storageId 
 * @param status 
 */
public class StorageProfileService {
	
	public static class AddStorageProfileBuilder extends RequestBuilder<StorageProfile, StorageProfile.Tokenizer, AddStorageProfileBuilder> {
		
		public AddStorageProfileBuilder(StorageProfile storageProfile) {
			super(StorageProfile.class, "storageprofile", "add");
			params.add("storageProfile", storageProfile);
		}
	}

	/**
	 * Adds a storage profile to the Kaltura DB.
	 * 
	 * @param storageProfile 
	 */
    public static AddStorageProfileBuilder add(StorageProfile storageProfile)  {
		return new AddStorageProfileBuilder(storageProfile);
	}
	
	public static class GetStorageProfileBuilder extends RequestBuilder<StorageProfile, StorageProfile.Tokenizer, GetStorageProfileBuilder> {
		
		public GetStorageProfileBuilder(int storageProfileId) {
			super(StorageProfile.class, "storageprofile", "get");
			params.add("storageProfileId", storageProfileId);
		}
		
		public void storageProfileId(String multirequestToken) {
			params.add("storageProfileId", multirequestToken);
		}
	}

	/**
	 * Get storage profile by id
	 * 
	 * @param storageProfileId 
	 */
    public static GetStorageProfileBuilder get(int storageProfileId)  {
		return new GetStorageProfileBuilder(storageProfileId);
	}
	
	public static class ListStorageProfileBuilder extends ListResponseRequestBuilder<StorageProfile, StorageProfile.Tokenizer, ListStorageProfileBuilder> {
		
		public ListStorageProfileBuilder(StorageProfileFilter filter, FilterPager pager) {
			super(StorageProfile.class, "storageprofile", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListStorageProfileBuilder list()  {
		return list(null);
	}

	public static ListStorageProfileBuilder list(StorageProfileFilter filter)  {
		return list(filter, null);
	}

    public static ListStorageProfileBuilder list(StorageProfileFilter filter, FilterPager pager)  {
		return new ListStorageProfileBuilder(filter, pager);
	}
	
	public static class UpdateStorageProfileBuilder extends RequestBuilder<StorageProfile, StorageProfile.Tokenizer, UpdateStorageProfileBuilder> {
		
		public UpdateStorageProfileBuilder(int storageProfileId, StorageProfile storageProfile) {
			super(StorageProfile.class, "storageprofile", "update");
			params.add("storageProfileId", storageProfileId);
			params.add("storageProfile", storageProfile);
		}
		
		public void storageProfileId(String multirequestToken) {
			params.add("storageProfileId", multirequestToken);
		}
	}

	/**
	 * Update storage profile by id
	 * 
	 * @param storageProfileId 
	 * @param storageProfile Id
	 */
    public static UpdateStorageProfileBuilder update(int storageProfileId, StorageProfile storageProfile)  {
		return new UpdateStorageProfileBuilder(storageProfileId, storageProfile);
	}
	
	public static class UpdateStatusStorageProfileBuilder extends NullRequestBuilder {
		
		public UpdateStatusStorageProfileBuilder(int storageId, StorageProfileStatus status) {
			super("storageprofile", "updateStatus");
			params.add("storageId", storageId);
			params.add("status", status);
		}
		
		public void storageId(String multirequestToken) {
			params.add("storageId", multirequestToken);
		}
		
		public void status(String multirequestToken) {
			params.add("status", multirequestToken);
		}
	}

    public static UpdateStatusStorageProfileBuilder updateStatus(int storageId, StorageProfileStatus status)  {
		return new UpdateStatusStorageProfileBuilder(storageId, status);
	}
}
