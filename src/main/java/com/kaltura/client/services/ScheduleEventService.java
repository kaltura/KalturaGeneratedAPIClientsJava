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

import com.kaltura.client.FileHolder;
import com.kaltura.client.Files;
import com.kaltura.client.enums.ScheduleEventConflictType;
import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.BulkUploadICalJobData;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ScheduleEvent;
import com.kaltura.client.types.ScheduleEventFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * The ScheduleEvent service enables you to create and manage (update, delete,
  retrieve, etc.) scheduled recording events.
 * 
 * @param scheduleEvent 
 * @param fileData 
 * @param bulkUploadData 
 * @param scheduleEventId 
 * @param scheduleEventId 
 * @param scheduleEventId 
 * @param resourceIds comma separated
 * @param scheduleEvent 
 * @param scheduleEventIdToIgnore 
 * @param scheduleEventConflictType 
 * @param filter 
 * @param pager 
 * @param scheduleEventId 
 * @param scheduleEvent Id
 */
public class ScheduleEventService {
	
	public static class AddScheduleEventBuilder extends RequestBuilder<ScheduleEvent, ScheduleEvent.Tokenizer, AddScheduleEventBuilder> {
		
		public AddScheduleEventBuilder(ScheduleEvent scheduleEvent) {
			super(ScheduleEvent.class, "schedule_scheduleevent", "add");
			params.add("scheduleEvent", scheduleEvent);
		}
	}

	/**
	 * Allows you to add a new KalturaScheduleEvent object
	 * 
	 * @param scheduleEvent 
	 */
    public static AddScheduleEventBuilder add(ScheduleEvent scheduleEvent)  {
		return new AddScheduleEventBuilder(scheduleEvent);
	}
	
	public static class AddFromBulkUploadScheduleEventBuilder extends RequestBuilder<BulkUpload, BulkUpload.Tokenizer, AddFromBulkUploadScheduleEventBuilder> {
		
		public AddFromBulkUploadScheduleEventBuilder(FileHolder fileData, BulkUploadICalJobData bulkUploadData) {
			super(BulkUpload.class, "schedule_scheduleevent", "addFromBulkUpload");
			files = new Files();
			files.add("fileData", fileData);
			params.add("bulkUploadData", bulkUploadData);
		}
	}

	public static AddFromBulkUploadScheduleEventBuilder addFromBulkUpload(FileHolder fileData)  {
		return addFromBulkUpload(fileData, null);
	}

	public static AddFromBulkUploadScheduleEventBuilder addFromBulkUpload(File fileData)  {
		return addFromBulkUpload(new FileHolder(fileData), null);
	}

	public static AddFromBulkUploadScheduleEventBuilder addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), null);
	}

	public static AddFromBulkUploadScheduleEventBuilder addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), null);
	}

	public static AddFromBulkUploadScheduleEventBuilder addFromBulkUpload(File fileData, BulkUploadICalJobData bulkUploadData)  {
		return addFromBulkUpload(new FileHolder(fileData), bulkUploadData);
	}

	public static AddFromBulkUploadScheduleEventBuilder addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadICalJobData bulkUploadData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData);
	}

	public static AddFromBulkUploadScheduleEventBuilder addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadICalJobData bulkUploadData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData);
	}

	/**
	 * Add new bulk upload batch job
	 * 
	 * @param fileData 
	 * @param bulkUploadData 
	 */
    public static AddFromBulkUploadScheduleEventBuilder addFromBulkUpload(FileHolder fileData, BulkUploadICalJobData bulkUploadData)  {
		return new AddFromBulkUploadScheduleEventBuilder(fileData, bulkUploadData);
	}
	
	public static class CancelScheduleEventBuilder extends RequestBuilder<ScheduleEvent, ScheduleEvent.Tokenizer, CancelScheduleEventBuilder> {
		
		public CancelScheduleEventBuilder(int scheduleEventId) {
			super(ScheduleEvent.class, "schedule_scheduleevent", "cancel");
			params.add("scheduleEventId", scheduleEventId);
		}
		
		public void scheduleEventId(String multirequestToken) {
			params.add("scheduleEventId", multirequestToken);
		}
	}

	/**
	 * Mark the KalturaScheduleEvent object as cancelled
	 * 
	 * @param scheduleEventId 
	 */
    public static CancelScheduleEventBuilder cancel(int scheduleEventId)  {
		return new CancelScheduleEventBuilder(scheduleEventId);
	}
	
	public static class DeleteScheduleEventBuilder extends RequestBuilder<ScheduleEvent, ScheduleEvent.Tokenizer, DeleteScheduleEventBuilder> {
		
		public DeleteScheduleEventBuilder(int scheduleEventId) {
			super(ScheduleEvent.class, "schedule_scheduleevent", "delete");
			params.add("scheduleEventId", scheduleEventId);
		}
		
		public void scheduleEventId(String multirequestToken) {
			params.add("scheduleEventId", multirequestToken);
		}
	}

	/**
	 * Mark the KalturaScheduleEvent object as deleted
	 * 
	 * @param scheduleEventId 
	 */
    public static DeleteScheduleEventBuilder delete(int scheduleEventId)  {
		return new DeleteScheduleEventBuilder(scheduleEventId);
	}
	
	public static class GetScheduleEventBuilder extends RequestBuilder<ScheduleEvent, ScheduleEvent.Tokenizer, GetScheduleEventBuilder> {
		
		public GetScheduleEventBuilder(int scheduleEventId) {
			super(ScheduleEvent.class, "schedule_scheduleevent", "get");
			params.add("scheduleEventId", scheduleEventId);
		}
		
		public void scheduleEventId(String multirequestToken) {
			params.add("scheduleEventId", multirequestToken);
		}
	}

	/**
	 * Retrieve a KalturaScheduleEvent object by ID
	 * 
	 * @param scheduleEventId 
	 */
    public static GetScheduleEventBuilder get(int scheduleEventId)  {
		return new GetScheduleEventBuilder(scheduleEventId);
	}
	
	public static class GetConflictsScheduleEventBuilder extends ListResponseRequestBuilder<ScheduleEvent, ScheduleEvent.Tokenizer, GetConflictsScheduleEventBuilder> {
		
		public GetConflictsScheduleEventBuilder(String resourceIds, ScheduleEvent scheduleEvent, String scheduleEventIdToIgnore, ScheduleEventConflictType scheduleEventConflictType) {
			super(ScheduleEvent.class, "schedule_scheduleevent", "getConflicts");
			params.add("resourceIds", resourceIds);
			params.add("scheduleEvent", scheduleEvent);
			params.add("scheduleEventIdToIgnore", scheduleEventIdToIgnore);
			params.add("scheduleEventConflictType", scheduleEventConflictType);
		}
		
		public void resourceIds(String multirequestToken) {
			params.add("resourceIds", multirequestToken);
		}
		
		public void scheduleEventIdToIgnore(String multirequestToken) {
			params.add("scheduleEventIdToIgnore", multirequestToken);
		}
		
		public void scheduleEventConflictType(String multirequestToken) {
			params.add("scheduleEventConflictType", multirequestToken);
		}
	}

	public static GetConflictsScheduleEventBuilder getConflicts(String resourceIds, ScheduleEvent scheduleEvent)  {
		return getConflicts(resourceIds, scheduleEvent, null);
	}

	public static GetConflictsScheduleEventBuilder getConflicts(String resourceIds, ScheduleEvent scheduleEvent, String scheduleEventIdToIgnore)  {
		return getConflicts(resourceIds, scheduleEvent, scheduleEventIdToIgnore, ScheduleEventConflictType.get(1));
	}

	/**
	 * List conflicting events for resourcesIds by event's dates
	 * 
	 * @param resourceIds comma separated
	 * @param scheduleEvent 
	 * @param scheduleEventIdToIgnore 
	 * @param scheduleEventConflictType 
	 */
    public static GetConflictsScheduleEventBuilder getConflicts(String resourceIds, ScheduleEvent scheduleEvent, String scheduleEventIdToIgnore, ScheduleEventConflictType scheduleEventConflictType)  {
		return new GetConflictsScheduleEventBuilder(resourceIds, scheduleEvent, scheduleEventIdToIgnore, scheduleEventConflictType);
	}
	
	public static class ListScheduleEventBuilder extends ListResponseRequestBuilder<ScheduleEvent, ScheduleEvent.Tokenizer, ListScheduleEventBuilder> {
		
		public ListScheduleEventBuilder(ScheduleEventFilter filter, FilterPager pager) {
			super(ScheduleEvent.class, "schedule_scheduleevent", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListScheduleEventBuilder list()  {
		return list(null);
	}

	public static ListScheduleEventBuilder list(ScheduleEventFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List KalturaScheduleEvent objects
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListScheduleEventBuilder list(ScheduleEventFilter filter, FilterPager pager)  {
		return new ListScheduleEventBuilder(filter, pager);
	}
	
	public static class UpdateScheduleEventBuilder extends RequestBuilder<ScheduleEvent, ScheduleEvent.Tokenizer, UpdateScheduleEventBuilder> {
		
		public UpdateScheduleEventBuilder(int scheduleEventId, ScheduleEvent scheduleEvent) {
			super(ScheduleEvent.class, "schedule_scheduleevent", "update");
			params.add("scheduleEventId", scheduleEventId);
			params.add("scheduleEvent", scheduleEvent);
		}
		
		public void scheduleEventId(String multirequestToken) {
			params.add("scheduleEventId", multirequestToken);
		}
	}

	/**
	 * Update an existing KalturaScheduleEvent object
	 * 
	 * @param scheduleEventId 
	 * @param scheduleEvent Id
	 */
    public static UpdateScheduleEventBuilder update(int scheduleEventId, ScheduleEvent scheduleEvent)  {
		return new UpdateScheduleEventBuilder(scheduleEventId, scheduleEvent);
	}
}
