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

import com.kaltura.client.enums.ResponseProfileStatus;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ResponseProfile;
import com.kaltura.client.types.ResponseProfileCacheRecalculateOptions;
import com.kaltura.client.types.ResponseProfileCacheRecalculateResults;
import com.kaltura.client.types.ResponseProfileFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Manage response profiles  */
public class ResponseProfileService {
	
	public static class AddResponseProfileBuilder extends RequestBuilder<ResponseProfile, ResponseProfile.Tokenizer, AddResponseProfileBuilder> {
		
		public AddResponseProfileBuilder(ResponseProfile addResponseProfile) {
			super(ResponseProfile.class, "responseprofile", "add");
			params.add("addResponseProfile", addResponseProfile);
		}
	}

	/**  Add new response profile  */
    public static AddResponseProfileBuilder add(ResponseProfile addResponseProfile)  {
		return new AddResponseProfileBuilder(addResponseProfile);
	}
	
	public static class CloneResponseProfileBuilder extends RequestBuilder<ResponseProfile, ResponseProfile.Tokenizer, CloneResponseProfileBuilder> {
		
		public CloneResponseProfileBuilder(int id, ResponseProfile profile) {
			super(ResponseProfile.class, "responseprofile", "clone");
			params.add("id", id);
			params.add("profile", profile);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Clone an existing response profile  */
    public static CloneResponseProfileBuilder clone(int id, ResponseProfile profile)  {
		return new CloneResponseProfileBuilder(id, profile);
	}
	
	public static class DeleteResponseProfileBuilder extends NullRequestBuilder {
		
		public DeleteResponseProfileBuilder(int id) {
			super("responseprofile", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Delete response profile by id  */
    public static DeleteResponseProfileBuilder delete(int id)  {
		return new DeleteResponseProfileBuilder(id);
	}
	
	public static class GetResponseProfileBuilder extends RequestBuilder<ResponseProfile, ResponseProfile.Tokenizer, GetResponseProfileBuilder> {
		
		public GetResponseProfileBuilder(int id) {
			super(ResponseProfile.class, "responseprofile", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Get response profile by id  */
    public static GetResponseProfileBuilder get(int id)  {
		return new GetResponseProfileBuilder(id);
	}
	
	public static class ListResponseProfileBuilder extends ListResponseRequestBuilder<ResponseProfile, ResponseProfile.Tokenizer, ListResponseProfileBuilder> {
		
		public ListResponseProfileBuilder(ResponseProfileFilter filter, FilterPager pager) {
			super(ResponseProfile.class, "responseprofile", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListResponseProfileBuilder list()  {
		return list(null);
	}

	public static ListResponseProfileBuilder list(ResponseProfileFilter filter)  {
		return list(filter, null);
	}

	/**  List response profiles by filter and pager  */
    public static ListResponseProfileBuilder list(ResponseProfileFilter filter, FilterPager pager)  {
		return new ListResponseProfileBuilder(filter, pager);
	}
	
	public static class RecalculateResponseProfileBuilder extends RequestBuilder<ResponseProfileCacheRecalculateResults, ResponseProfileCacheRecalculateResults.Tokenizer, RecalculateResponseProfileBuilder> {
		
		public RecalculateResponseProfileBuilder(ResponseProfileCacheRecalculateOptions options) {
			super(ResponseProfileCacheRecalculateResults.class, "responseprofile", "recalculate");
			params.add("options", options);
		}
	}

	/**  Recalculate response profile cached objects  */
    public static RecalculateResponseProfileBuilder recalculate(ResponseProfileCacheRecalculateOptions options)  {
		return new RecalculateResponseProfileBuilder(options);
	}
	
	public static class UpdateResponseProfileBuilder extends RequestBuilder<ResponseProfile, ResponseProfile.Tokenizer, UpdateResponseProfileBuilder> {
		
		public UpdateResponseProfileBuilder(int id, ResponseProfile updateResponseProfile) {
			super(ResponseProfile.class, "responseprofile", "update");
			params.add("id", id);
			params.add("updateResponseProfile", updateResponseProfile);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Update response profile by id  */
    public static UpdateResponseProfileBuilder update(int id, ResponseProfile updateResponseProfile)  {
		return new UpdateResponseProfileBuilder(id, updateResponseProfile);
	}
	
	public static class UpdateStatusResponseProfileBuilder extends RequestBuilder<ResponseProfile, ResponseProfile.Tokenizer, UpdateStatusResponseProfileBuilder> {
		
		public UpdateStatusResponseProfileBuilder(int id, ResponseProfileStatus status) {
			super(ResponseProfile.class, "responseprofile", "updateStatus");
			params.add("id", id);
			params.add("status", status);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void status(String multirequestToken) {
			params.add("status", multirequestToken);
		}
	}

	/**  Update response profile status by id  */
    public static UpdateStatusResponseProfileBuilder updateStatus(int id, ResponseProfileStatus status)  {
		return new UpdateStatusResponseProfileBuilder(id, status);
	}
}
