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
import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.BulkUploadCsvJobData;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ScheduleResource;
import com.kaltura.client.types.ScheduleResourceFilter;
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
 * The ScheduleResource service enables you to create and manage (update, delete,
  retrieve, etc.) the resources required for scheduled events (cameras, capture
  devices, etc.).
 * 
 * @param scheduleResource 
 * @param fileData 
 * @param bulkUploadData 
 * @param scheduleResourceId 
 * @param scheduleResourceId 
 * @param filter 
 * @param pager 
 * @param scheduleResourceId 
 * @param scheduleResource Id
 */
public class ScheduleResourceService {
	
	public static class AddScheduleResourceBuilder extends RequestBuilder<ScheduleResource, ScheduleResource.Tokenizer, AddScheduleResourceBuilder> {
		
		public AddScheduleResourceBuilder(ScheduleResource scheduleResource) {
			super(ScheduleResource.class, "schedule_scheduleresource", "add");
			params.add("scheduleResource", scheduleResource);
		}
	}

	/**
	 * Allows you to add a new KalturaScheduleResource object
	 * 
	 * @param scheduleResource 
	 */
    public static AddScheduleResourceBuilder add(ScheduleResource scheduleResource)  {
		return new AddScheduleResourceBuilder(scheduleResource);
	}
	
	public static class AddFromBulkUploadScheduleResourceBuilder extends RequestBuilder<BulkUpload, BulkUpload.Tokenizer, AddFromBulkUploadScheduleResourceBuilder> {
		
		public AddFromBulkUploadScheduleResourceBuilder(FileHolder fileData, BulkUploadCsvJobData bulkUploadData) {
			super(BulkUpload.class, "schedule_scheduleresource", "addFromBulkUpload");
			files = new Files();
			files.add("fileData", fileData);
			params.add("bulkUploadData", bulkUploadData);
		}
	}

	public static AddFromBulkUploadScheduleResourceBuilder addFromBulkUpload(FileHolder fileData)  {
		return addFromBulkUpload(fileData, null);
	}

	public static AddFromBulkUploadScheduleResourceBuilder addFromBulkUpload(File fileData)  {
		return addFromBulkUpload(new FileHolder(fileData), null);
	}

	public static AddFromBulkUploadScheduleResourceBuilder addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), null);
	}

	public static AddFromBulkUploadScheduleResourceBuilder addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), null);
	}

	public static AddFromBulkUploadScheduleResourceBuilder addFromBulkUpload(File fileData, BulkUploadCsvJobData bulkUploadData)  {
		return addFromBulkUpload(new FileHolder(fileData), bulkUploadData);
	}

	public static AddFromBulkUploadScheduleResourceBuilder addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadCsvJobData bulkUploadData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData);
	}

	public static AddFromBulkUploadScheduleResourceBuilder addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadCsvJobData bulkUploadData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData);
	}

	/**
	 * Add new bulk upload batch job
	 * 
	 * @param fileData 
	 * @param bulkUploadData 
	 */
    public static AddFromBulkUploadScheduleResourceBuilder addFromBulkUpload(FileHolder fileData, BulkUploadCsvJobData bulkUploadData)  {
		return new AddFromBulkUploadScheduleResourceBuilder(fileData, bulkUploadData);
	}
	
	public static class DeleteScheduleResourceBuilder extends RequestBuilder<ScheduleResource, ScheduleResource.Tokenizer, DeleteScheduleResourceBuilder> {
		
		public DeleteScheduleResourceBuilder(int scheduleResourceId) {
			super(ScheduleResource.class, "schedule_scheduleresource", "delete");
			params.add("scheduleResourceId", scheduleResourceId);
		}
		
		public void scheduleResourceId(String multirequestToken) {
			params.add("scheduleResourceId", multirequestToken);
		}
	}

	/**
	 * Mark the KalturaScheduleResource object as deleted
	 * 
	 * @param scheduleResourceId 
	 */
    public static DeleteScheduleResourceBuilder delete(int scheduleResourceId)  {
		return new DeleteScheduleResourceBuilder(scheduleResourceId);
	}
	
	public static class GetScheduleResourceBuilder extends RequestBuilder<ScheduleResource, ScheduleResource.Tokenizer, GetScheduleResourceBuilder> {
		
		public GetScheduleResourceBuilder(int scheduleResourceId) {
			super(ScheduleResource.class, "schedule_scheduleresource", "get");
			params.add("scheduleResourceId", scheduleResourceId);
		}
		
		public void scheduleResourceId(String multirequestToken) {
			params.add("scheduleResourceId", multirequestToken);
		}
	}

	/**
	 * Retrieve a KalturaScheduleResource object by ID
	 * 
	 * @param scheduleResourceId 
	 */
    public static GetScheduleResourceBuilder get(int scheduleResourceId)  {
		return new GetScheduleResourceBuilder(scheduleResourceId);
	}
	
	public static class ListScheduleResourceBuilder extends ListResponseRequestBuilder<ScheduleResource, ScheduleResource.Tokenizer, ListScheduleResourceBuilder> {
		
		public ListScheduleResourceBuilder(ScheduleResourceFilter filter, FilterPager pager) {
			super(ScheduleResource.class, "schedule_scheduleresource", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListScheduleResourceBuilder list()  {
		return list(null);
	}

	public static ListScheduleResourceBuilder list(ScheduleResourceFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List KalturaScheduleResource objects
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListScheduleResourceBuilder list(ScheduleResourceFilter filter, FilterPager pager)  {
		return new ListScheduleResourceBuilder(filter, pager);
	}
	
	public static class UpdateScheduleResourceBuilder extends RequestBuilder<ScheduleResource, ScheduleResource.Tokenizer, UpdateScheduleResourceBuilder> {
		
		public UpdateScheduleResourceBuilder(int scheduleResourceId, ScheduleResource scheduleResource) {
			super(ScheduleResource.class, "schedule_scheduleresource", "update");
			params.add("scheduleResourceId", scheduleResourceId);
			params.add("scheduleResource", scheduleResource);
		}
		
		public void scheduleResourceId(String multirequestToken) {
			params.add("scheduleResourceId", multirequestToken);
		}
	}

	/**
	 * Update an existing KalturaScheduleResource object
	 * 
	 * @param scheduleResourceId 
	 * @param scheduleResource Id
	 */
    public static UpdateScheduleResourceBuilder update(int scheduleResourceId, ScheduleResource scheduleResource)  {
		return new UpdateScheduleResourceBuilder(scheduleResourceId, scheduleResource);
	}
}
