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

import com.kaltura.client.FileHolder;
import com.kaltura.client.Files;
import com.kaltura.client.Params;
import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.BulkUploadCsvJobData;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.ScheduleResource;
import com.kaltura.client.types.ScheduleResourceFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  The ScheduleResource service enables you to create and manage (update, delete,
  retrieve, etc.) the resources required for scheduled events (cameras, capture
  devices, etc.).  */
public class ScheduleResourceService {

	/**  Allows you to add a new KalturaScheduleResource object  */
    public static RequestBuilder<ScheduleResource> add(ScheduleResource scheduleResource)  {
        Params kparams = new Params();
        kparams.add("scheduleResource", scheduleResource);

        return new RequestBuilder<ScheduleResource>(ScheduleResource.class, "schedule_scheduleresource", "add", kparams);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileHolder fileData)  {
        return addFromBulkUpload(fileData, null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(File fileData)  {
        return addFromBulkUpload(new FileHolder(fileData), null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(File fileData, BulkUploadCsvJobData bulkUploadData)  {
        return addFromBulkUpload(new FileHolder(fileData), bulkUploadData);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadCsvJobData bulkUploadData)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadCsvJobData bulkUploadData)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData);
    }

	/**  Add new bulk upload batch job  */
    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileHolder fileData, BulkUploadCsvJobData bulkUploadData)  {
        Params kparams = new Params();
        Files kfiles = new Files();
        kfiles.add("fileData", fileData);
        kparams.add("bulkUploadData", bulkUploadData);

        return new RequestBuilder<BulkUpload>(BulkUpload.class, "schedule_scheduleresource", "addFromBulkUpload", kparams, kfiles);
    }

	/**  Mark the KalturaScheduleResource object as deleted  */
    public static RequestBuilder<ScheduleResource> delete(int scheduleResourceId)  {
        Params kparams = new Params();
        kparams.add("scheduleResourceId", scheduleResourceId);

        return new RequestBuilder<ScheduleResource>(ScheduleResource.class, "schedule_scheduleresource", "delete", kparams);
    }

	/**  Retrieve a KalturaScheduleResource object by ID  */
    public static RequestBuilder<ScheduleResource> get(int scheduleResourceId)  {
        Params kparams = new Params();
        kparams.add("scheduleResourceId", scheduleResourceId);

        return new RequestBuilder<ScheduleResource>(ScheduleResource.class, "schedule_scheduleresource", "get", kparams);
    }

    public static RequestBuilder<ListResponse<ScheduleResource>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<ScheduleResource>> list(ScheduleResourceFilter filter)  {
        return list(filter, null);
    }

	/**  List KalturaScheduleResource objects  */
    public static RequestBuilder<ListResponse<ScheduleResource>> list(ScheduleResourceFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<ScheduleResource>(ScheduleResource.class, "schedule_scheduleresource", "list", kparams);
    }

	/**  Update an existing KalturaScheduleResource object  */
    public static RequestBuilder<ScheduleResource> update(int scheduleResourceId, ScheduleResource scheduleResource)  {
        Params kparams = new Params();
        kparams.add("scheduleResourceId", scheduleResourceId);
        kparams.add("scheduleResource", scheduleResource);

        return new RequestBuilder<ScheduleResource>(ScheduleResource.class, "schedule_scheduleresource", "update", kparams);
    }
}
