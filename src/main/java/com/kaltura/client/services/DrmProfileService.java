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

import com.kaltura.client.enums.DrmProviderType;
import com.kaltura.client.types.DrmProfile;
import com.kaltura.client.types.DrmProfileFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class DrmProfileService {
	
	public static class AddDrmProfileBuilder extends RequestBuilder<DrmProfile, DrmProfile.Tokenizer, AddDrmProfileBuilder> {
		
		public AddDrmProfileBuilder(DrmProfile drmProfile) {
			super(DrmProfile.class, "drm_drmprofile", "add");
			params.add("drmProfile", drmProfile);
		}
	}

	/**
	 * Allows you to add a new DrmProfile object
	 * 
	 * @param drmProfile 
	 */
    public static AddDrmProfileBuilder add(DrmProfile drmProfile)  {
		return new AddDrmProfileBuilder(drmProfile);
	}
	
	public static class DeleteDrmProfileBuilder extends RequestBuilder<DrmProfile, DrmProfile.Tokenizer, DeleteDrmProfileBuilder> {
		
		public DeleteDrmProfileBuilder(int drmProfileId) {
			super(DrmProfile.class, "drm_drmprofile", "delete");
			params.add("drmProfileId", drmProfileId);
		}
		
		public void drmProfileId(String multirequestToken) {
			params.add("drmProfileId", multirequestToken);
		}
	}

	/**
	 * Mark the KalturaDrmProfile object as deleted
	 * 
	 * @param drmProfileId 
	 */
    public static DeleteDrmProfileBuilder delete(int drmProfileId)  {
		return new DeleteDrmProfileBuilder(drmProfileId);
	}
	
	public static class GetDrmProfileBuilder extends RequestBuilder<DrmProfile, DrmProfile.Tokenizer, GetDrmProfileBuilder> {
		
		public GetDrmProfileBuilder(int drmProfileId) {
			super(DrmProfile.class, "drm_drmprofile", "get");
			params.add("drmProfileId", drmProfileId);
		}
		
		public void drmProfileId(String multirequestToken) {
			params.add("drmProfileId", multirequestToken);
		}
	}

	/**
	 * Retrieve a KalturaDrmProfile object by ID
	 * 
	 * @param drmProfileId 
	 */
    public static GetDrmProfileBuilder get(int drmProfileId)  {
		return new GetDrmProfileBuilder(drmProfileId);
	}
	
	public static class GetByProviderDrmProfileBuilder extends RequestBuilder<DrmProfile, DrmProfile.Tokenizer, GetByProviderDrmProfileBuilder> {
		
		public GetByProviderDrmProfileBuilder(DrmProviderType provider) {
			super(DrmProfile.class, "drm_drmprofile", "getByProvider");
			params.add("provider", provider);
		}
		
		public void provider(String multirequestToken) {
			params.add("provider", multirequestToken);
		}
	}

	/**
	 * Retrieve a KalturaDrmProfile object by provider, if no specific profile defined
	  return default profile
	 * 
	 * @param provider 
	 */
    public static GetByProviderDrmProfileBuilder getByProvider(DrmProviderType provider)  {
		return new GetByProviderDrmProfileBuilder(provider);
	}
	
	public static class ListDrmProfileBuilder extends ListResponseRequestBuilder<DrmProfile, DrmProfile.Tokenizer, ListDrmProfileBuilder> {
		
		public ListDrmProfileBuilder(DrmProfileFilter filter, FilterPager pager) {
			super(DrmProfile.class, "drm_drmprofile", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListDrmProfileBuilder list()  {
		return list(null);
	}

	public static ListDrmProfileBuilder list(DrmProfileFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List KalturaDrmProfile objects
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListDrmProfileBuilder list(DrmProfileFilter filter, FilterPager pager)  {
		return new ListDrmProfileBuilder(filter, pager);
	}
	
	public static class UpdateDrmProfileBuilder extends RequestBuilder<DrmProfile, DrmProfile.Tokenizer, UpdateDrmProfileBuilder> {
		
		public UpdateDrmProfileBuilder(int drmProfileId, DrmProfile drmProfile) {
			super(DrmProfile.class, "drm_drmprofile", "update");
			params.add("drmProfileId", drmProfileId);
			params.add("drmProfile", drmProfile);
		}
		
		public void drmProfileId(String multirequestToken) {
			params.add("drmProfileId", multirequestToken);
		}
	}

	/**
	 * Update an existing KalturaDrmProfile object
	 * 
	 * @param drmProfileId 
	 * @param drmProfile Id
	 */
    public static UpdateDrmProfileBuilder update(int drmProfileId, DrmProfile drmProfile)  {
		return new UpdateDrmProfileBuilder(drmProfileId, drmProfile);
	}
}
