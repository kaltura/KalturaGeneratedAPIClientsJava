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

import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.types.ScheduledTaskProfile;
import com.kaltura.client.types.ScheduledTaskProfileFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Schedule task service lets you create and manage scheduled task profiles
 * 
 * @param scheduledTaskProfile 
 * @param id 
 * @param id 
 * @param requestId 
 * @param filter 
 * @param pager 
 * @param scheduledTaskProfileId 
 * @param maxResults 
 * @param requestId 
 * @param id 
 * @param scheduledTaskProfile 
 */
public class ScheduledTaskProfileService {
	
	public static class AddScheduledTaskProfileBuilder extends RequestBuilder<ScheduledTaskProfile, ScheduledTaskProfile.Tokenizer, AddScheduledTaskProfileBuilder> {
		
		public AddScheduledTaskProfileBuilder(ScheduledTaskProfile scheduledTaskProfile) {
			super(ScheduledTaskProfile.class, "scheduledtask_scheduledtaskprofile", "add");
			params.add("scheduledTaskProfile", scheduledTaskProfile);
		}
	}

	/**
	 * Add a new scheduled task profile
	 * 
	 * @param scheduledTaskProfile 
	 */
    public static AddScheduledTaskProfileBuilder add(ScheduledTaskProfile scheduledTaskProfile)  {
		return new AddScheduledTaskProfileBuilder(scheduledTaskProfile);
	}
	
	public static class DeleteScheduledTaskProfileBuilder extends NullRequestBuilder {
		
		public DeleteScheduledTaskProfileBuilder(int id) {
			super("scheduledtask_scheduledtaskprofile", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete a scheduled task profile
	 * 
	 * @param id 
	 */
    public static DeleteScheduledTaskProfileBuilder delete(int id)  {
		return new DeleteScheduledTaskProfileBuilder(id);
	}
	
	public static class GetScheduledTaskProfileBuilder extends RequestBuilder<ScheduledTaskProfile, ScheduledTaskProfile.Tokenizer, GetScheduledTaskProfileBuilder> {
		
		public GetScheduledTaskProfileBuilder(int id) {
			super(ScheduledTaskProfile.class, "scheduledtask_scheduledtaskprofile", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Retrieve a scheduled task profile by id
	 * 
	 * @param id 
	 */
    public static GetScheduledTaskProfileBuilder get(int id)  {
		return new GetScheduledTaskProfileBuilder(id);
	}
	
	public static class GetDryRunResultsScheduledTaskProfileBuilder extends ListResponseRequestBuilder<ObjectBase, ObjectBase.Tokenizer, GetDryRunResultsScheduledTaskProfileBuilder> {
		
		public GetDryRunResultsScheduledTaskProfileBuilder(int requestId) {
			super(ObjectBase.class, "scheduledtask_scheduledtaskprofile", "getDryRunResults");
			params.add("requestId", requestId);
		}
		
		public void requestId(String multirequestToken) {
			params.add("requestId", multirequestToken);
		}
	}

    public static GetDryRunResultsScheduledTaskProfileBuilder getDryRunResults(int requestId)  {
		return new GetDryRunResultsScheduledTaskProfileBuilder(requestId);
	}
	
	public static class ListScheduledTaskProfileBuilder extends ListResponseRequestBuilder<ScheduledTaskProfile, ScheduledTaskProfile.Tokenizer, ListScheduledTaskProfileBuilder> {
		
		public ListScheduledTaskProfileBuilder(ScheduledTaskProfileFilter filter, FilterPager pager) {
			super(ScheduledTaskProfile.class, "scheduledtask_scheduledtaskprofile", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListScheduledTaskProfileBuilder list()  {
		return list(null);
	}

	public static ListScheduledTaskProfileBuilder list(ScheduledTaskProfileFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List scheduled task profiles
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListScheduledTaskProfileBuilder list(ScheduledTaskProfileFilter filter, FilterPager pager)  {
		return new ListScheduledTaskProfileBuilder(filter, pager);
	}
	
	public static class RequestDryRunScheduledTaskProfileBuilder extends RequestBuilder<Integer, String, RequestDryRunScheduledTaskProfileBuilder> {
		
		public RequestDryRunScheduledTaskProfileBuilder(int scheduledTaskProfileId, int maxResults) {
			super(Integer.class, "scheduledtask_scheduledtaskprofile", "requestDryRun");
			params.add("scheduledTaskProfileId", scheduledTaskProfileId);
			params.add("maxResults", maxResults);
		}
		
		public void scheduledTaskProfileId(String multirequestToken) {
			params.add("scheduledTaskProfileId", multirequestToken);
		}
		
		public void maxResults(String multirequestToken) {
			params.add("maxResults", multirequestToken);
		}
	}

	public static RequestDryRunScheduledTaskProfileBuilder requestDryRun(int scheduledTaskProfileId)  {
		return requestDryRun(scheduledTaskProfileId, 500);
	}

    public static RequestDryRunScheduledTaskProfileBuilder requestDryRun(int scheduledTaskProfileId, int maxResults)  {
		return new RequestDryRunScheduledTaskProfileBuilder(scheduledTaskProfileId, maxResults);
	}
	
	public static class ServeDryRunResultsScheduledTaskProfileBuilder extends ServeRequestBuilder {
		
		public ServeDryRunResultsScheduledTaskProfileBuilder(int requestId) {
			super("scheduledtask_scheduledtaskprofile", "serveDryRunResults");
			params.add("requestId", requestId);
		}
		
		public void requestId(String multirequestToken) {
			params.add("requestId", multirequestToken);
		}
	}

	/**
	 * Serves dry run results by its request id
	 * 
	 * @param requestId 
	 */
    public static ServeDryRunResultsScheduledTaskProfileBuilder serveDryRunResults(int requestId)  {
		return new ServeDryRunResultsScheduledTaskProfileBuilder(requestId);
	}
	
	public static class UpdateScheduledTaskProfileBuilder extends RequestBuilder<ScheduledTaskProfile, ScheduledTaskProfile.Tokenizer, UpdateScheduledTaskProfileBuilder> {
		
		public UpdateScheduledTaskProfileBuilder(int id, ScheduledTaskProfile scheduledTaskProfile) {
			super(ScheduledTaskProfile.class, "scheduledtask_scheduledtaskprofile", "update");
			params.add("id", id);
			params.add("scheduledTaskProfile", scheduledTaskProfile);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update an existing scheduled task profile
	 * 
	 * @param id 
	 * @param scheduledTaskProfile 
	 */
    public static UpdateScheduledTaskProfileBuilder update(int id, ScheduledTaskProfile scheduledTaskProfile)  {
		return new UpdateScheduledTaskProfileBuilder(id, scheduledTaskProfile);
	}
}
