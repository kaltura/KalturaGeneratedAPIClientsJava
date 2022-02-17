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

import com.kaltura.client.types.DrmPolicy;
import com.kaltura.client.types.DrmPolicyFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class DrmPolicyService {
	
	public static class AddDrmPolicyBuilder extends RequestBuilder<DrmPolicy, DrmPolicy.Tokenizer, AddDrmPolicyBuilder> {
		
		public AddDrmPolicyBuilder(DrmPolicy drmPolicy) {
			super(DrmPolicy.class, "drm_drmpolicy", "add");
			params.add("drmPolicy", drmPolicy);
		}
	}

	/**
	 * Allows you to add a new DrmPolicy object
	 * 
	 * @param drmPolicy 
	 */
    public static AddDrmPolicyBuilder add(DrmPolicy drmPolicy)  {
		return new AddDrmPolicyBuilder(drmPolicy);
	}
	
	public static class DeleteDrmPolicyBuilder extends RequestBuilder<DrmPolicy, DrmPolicy.Tokenizer, DeleteDrmPolicyBuilder> {
		
		public DeleteDrmPolicyBuilder(int drmPolicyId) {
			super(DrmPolicy.class, "drm_drmpolicy", "delete");
			params.add("drmPolicyId", drmPolicyId);
		}
		
		public void drmPolicyId(String multirequestToken) {
			params.add("drmPolicyId", multirequestToken);
		}
	}

	/**
	 * Mark the KalturaDrmPolicy object as deleted
	 * 
	 * @param drmPolicyId 
	 */
    public static DeleteDrmPolicyBuilder delete(int drmPolicyId)  {
		return new DeleteDrmPolicyBuilder(drmPolicyId);
	}
	
	public static class GetDrmPolicyBuilder extends RequestBuilder<DrmPolicy, DrmPolicy.Tokenizer, GetDrmPolicyBuilder> {
		
		public GetDrmPolicyBuilder(int drmPolicyId) {
			super(DrmPolicy.class, "drm_drmpolicy", "get");
			params.add("drmPolicyId", drmPolicyId);
		}
		
		public void drmPolicyId(String multirequestToken) {
			params.add("drmPolicyId", multirequestToken);
		}
	}

	/**
	 * Retrieve a KalturaDrmPolicy object by ID
	 * 
	 * @param drmPolicyId 
	 */
    public static GetDrmPolicyBuilder get(int drmPolicyId)  {
		return new GetDrmPolicyBuilder(drmPolicyId);
	}
	
	public static class ListDrmPolicyBuilder extends ListResponseRequestBuilder<DrmPolicy, DrmPolicy.Tokenizer, ListDrmPolicyBuilder> {
		
		public ListDrmPolicyBuilder(DrmPolicyFilter filter, FilterPager pager) {
			super(DrmPolicy.class, "drm_drmpolicy", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListDrmPolicyBuilder list()  {
		return list(null);
	}

	public static ListDrmPolicyBuilder list(DrmPolicyFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List KalturaDrmPolicy objects
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListDrmPolicyBuilder list(DrmPolicyFilter filter, FilterPager pager)  {
		return new ListDrmPolicyBuilder(filter, pager);
	}
	
	public static class UpdateDrmPolicyBuilder extends RequestBuilder<DrmPolicy, DrmPolicy.Tokenizer, UpdateDrmPolicyBuilder> {
		
		public UpdateDrmPolicyBuilder(int drmPolicyId, DrmPolicy drmPolicy) {
			super(DrmPolicy.class, "drm_drmpolicy", "update");
			params.add("drmPolicyId", drmPolicyId);
			params.add("drmPolicy", drmPolicy);
		}
		
		public void drmPolicyId(String multirequestToken) {
			params.add("drmPolicyId", multirequestToken);
		}
	}

	/**
	 * Update an existing KalturaDrmPolicy object
	 * 
	 * @param drmPolicyId 
	 * @param drmPolicy Id
	 */
    public static UpdateDrmPolicyBuilder update(int drmPolicyId, DrmPolicy drmPolicy)  {
		return new UpdateDrmPolicyBuilder(drmPolicyId, drmPolicy);
	}
}
