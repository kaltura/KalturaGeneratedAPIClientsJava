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
import com.kaltura.client.types.ScheduleEventResource;
import com.kaltura.client.types.ScheduleEventResourceFilter;
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
 * The ScheduleEventResource service enables you create and manage (update, delete,
  retrieve, etc.) the connections between recording events and the resources
  required for these events (cameras, capture devices, etc.).
 * 
 * @param scheduleEventResource 
 * @param scheduleEventId 
 * @param scheduleResourceId 
 * @param scheduleEventId 
 * @param scheduleResourceId 
 * @param filter 
 * @param pager 
 * @param scheduleEventId 
 * @param scheduleResourceId 
 * @param scheduleEventResource 
 */
public class ScheduleEventResourceService {
	
	public static class AddScheduleEventResourceBuilder extends RequestBuilder<ScheduleEventResource, ScheduleEventResource.Tokenizer, AddScheduleEventResourceBuilder> {
		
		public AddScheduleEventResourceBuilder(ScheduleEventResource scheduleEventResource) {
			super(ScheduleEventResource.class, "schedule_scheduleeventresource", "add");
			params.add("scheduleEventResource", scheduleEventResource);
		}
	}

	/**
	 * Allows you to add a new KalturaScheduleEventResource object
	 * 
	 * @param scheduleEventResource 
	 */
    public static AddScheduleEventResourceBuilder add(ScheduleEventResource scheduleEventResource)  {
		return new AddScheduleEventResourceBuilder(scheduleEventResource);
	}
	
	public static class DeleteScheduleEventResourceBuilder extends NullRequestBuilder {
		
		public DeleteScheduleEventResourceBuilder(int scheduleEventId, int scheduleResourceId) {
			super("schedule_scheduleeventresource", "delete");
			params.add("scheduleEventId", scheduleEventId);
			params.add("scheduleResourceId", scheduleResourceId);
		}
		
		public void scheduleEventId(String multirequestToken) {
			params.add("scheduleEventId", multirequestToken);
		}
		
		public void scheduleResourceId(String multirequestToken) {
			params.add("scheduleResourceId", multirequestToken);
		}
	}

	/**
	 * Mark the KalturaScheduleEventResource object as deleted
	 * 
	 * @param scheduleEventId 
	 * @param scheduleResourceId 
	 */
    public static DeleteScheduleEventResourceBuilder delete(int scheduleEventId, int scheduleResourceId)  {
		return new DeleteScheduleEventResourceBuilder(scheduleEventId, scheduleResourceId);
	}
	
	public static class GetScheduleEventResourceBuilder extends RequestBuilder<ScheduleEventResource, ScheduleEventResource.Tokenizer, GetScheduleEventResourceBuilder> {
		
		public GetScheduleEventResourceBuilder(int scheduleEventId, int scheduleResourceId) {
			super(ScheduleEventResource.class, "schedule_scheduleeventresource", "get");
			params.add("scheduleEventId", scheduleEventId);
			params.add("scheduleResourceId", scheduleResourceId);
		}
		
		public void scheduleEventId(String multirequestToken) {
			params.add("scheduleEventId", multirequestToken);
		}
		
		public void scheduleResourceId(String multirequestToken) {
			params.add("scheduleResourceId", multirequestToken);
		}
	}

	/**
	 * Retrieve a KalturaScheduleEventResource object by ID
	 * 
	 * @param scheduleEventId 
	 * @param scheduleResourceId 
	 */
    public static GetScheduleEventResourceBuilder get(int scheduleEventId, int scheduleResourceId)  {
		return new GetScheduleEventResourceBuilder(scheduleEventId, scheduleResourceId);
	}
	
	public static class ListScheduleEventResourceBuilder extends ListResponseRequestBuilder<ScheduleEventResource, ScheduleEventResource.Tokenizer, ListScheduleEventResourceBuilder> {
		
		public ListScheduleEventResourceBuilder(ScheduleEventResourceFilter filter, FilterPager pager) {
			super(ScheduleEventResource.class, "schedule_scheduleeventresource", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListScheduleEventResourceBuilder list()  {
		return list(null);
	}

	public static ListScheduleEventResourceBuilder list(ScheduleEventResourceFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List KalturaScheduleEventResource objects
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListScheduleEventResourceBuilder list(ScheduleEventResourceFilter filter, FilterPager pager)  {
		return new ListScheduleEventResourceBuilder(filter, pager);
	}
	
	public static class UpdateScheduleEventResourceBuilder extends RequestBuilder<ScheduleEventResource, ScheduleEventResource.Tokenizer, UpdateScheduleEventResourceBuilder> {
		
		public UpdateScheduleEventResourceBuilder(int scheduleEventId, int scheduleResourceId, ScheduleEventResource scheduleEventResource) {
			super(ScheduleEventResource.class, "schedule_scheduleeventresource", "update");
			params.add("scheduleEventId", scheduleEventId);
			params.add("scheduleResourceId", scheduleResourceId);
			params.add("scheduleEventResource", scheduleEventResource);
		}
		
		public void scheduleEventId(String multirequestToken) {
			params.add("scheduleEventId", multirequestToken);
		}
		
		public void scheduleResourceId(String multirequestToken) {
			params.add("scheduleResourceId", multirequestToken);
		}
	}

	/**
	 * Update an existing KalturaScheduleEventResource object
	 * 
	 * @param scheduleEventId 
	 * @param scheduleResourceId 
	 * @param scheduleEventResource 
	 */
    public static UpdateScheduleEventResourceBuilder update(int scheduleEventId, int scheduleResourceId, ScheduleEventResource scheduleEventResource)  {
		return new UpdateScheduleEventResourceBuilder(scheduleEventId, scheduleResourceId, scheduleEventResource);
	}
}
