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
import com.kaltura.client.types.BulkUploadICalJobData;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.ScheduleEvent;
import com.kaltura.client.types.ScheduleEventFilter;
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

/**  The ScheduleEvent service enables you to create and manage (update, delete,
  retrieve, etc.) scheduled recording events.  */
public class ScheduleEventService {

	/**  Allows you to add a new KalturaScheduleEvent object  */
    public static RequestBuilder<ScheduleEvent> add(ScheduleEvent scheduleEvent)  {
        Params kparams = new Params();
        kparams.add("scheduleEvent", scheduleEvent);

        return new RequestBuilder<ScheduleEvent>(ScheduleEvent.class, "schedule_scheduleevent", "add", kparams);
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

    public static RequestBuilder<BulkUpload> addFromBulkUpload(File fileData, BulkUploadICalJobData bulkUploadData)  {
        return addFromBulkUpload(new FileHolder(fileData), bulkUploadData);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadICalJobData bulkUploadData)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadICalJobData bulkUploadData)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData);
    }

	/**  Add new bulk upload batch job  */
    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileHolder fileData, BulkUploadICalJobData bulkUploadData)  {
        Params kparams = new Params();
        Files kfiles = new Files();
        kfiles.add("fileData", fileData);
        kparams.add("bulkUploadData", bulkUploadData);

        return new RequestBuilder<BulkUpload>(BulkUpload.class, "schedule_scheduleevent", "addFromBulkUpload", kparams, kfiles);
    }

	/**  Mark the KalturaScheduleEvent object as cancelled  */
    public static RequestBuilder<ScheduleEvent> cancel(int scheduleEventId)  {
        Params kparams = new Params();
        kparams.add("scheduleEventId", scheduleEventId);

        return new RequestBuilder<ScheduleEvent>(ScheduleEvent.class, "schedule_scheduleevent", "cancel", kparams);
    }

	/**  Mark the KalturaScheduleEvent object as deleted  */
    public static RequestBuilder<ScheduleEvent> delete(int scheduleEventId)  {
        Params kparams = new Params();
        kparams.add("scheduleEventId", scheduleEventId);

        return new RequestBuilder<ScheduleEvent>(ScheduleEvent.class, "schedule_scheduleevent", "delete", kparams);
    }

	/**  Retrieve a KalturaScheduleEvent object by ID  */
    public static RequestBuilder<ScheduleEvent> get(int scheduleEventId)  {
        Params kparams = new Params();
        kparams.add("scheduleEventId", scheduleEventId);

        return new RequestBuilder<ScheduleEvent>(ScheduleEvent.class, "schedule_scheduleevent", "get", kparams);
    }

    public static RequestBuilder<ListResponse<ScheduleEvent>> getConflicts(String resourceIds, ScheduleEvent scheduleEvent)  {
        return getConflicts(resourceIds, scheduleEvent, null);
    }

	/**  List conflicting events for resourcesIds by event's dates  */
    public static RequestBuilder<ListResponse<ScheduleEvent>> getConflicts(String resourceIds, ScheduleEvent scheduleEvent, String scheduleEventIdToIgnore)  {
        Params kparams = new Params();
        kparams.add("resourceIds", resourceIds);
        kparams.add("scheduleEvent", scheduleEvent);
        kparams.add("scheduleEventIdToIgnore", scheduleEventIdToIgnore);

        return new ListResponseRequestBuilder<ScheduleEvent>(ScheduleEvent.class, "schedule_scheduleevent", "getConflicts", kparams);
    }

    public static RequestBuilder<ListResponse<ScheduleEvent>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<ScheduleEvent>> list(ScheduleEventFilter filter)  {
        return list(filter, null);
    }

	/**  List KalturaScheduleEvent objects  */
    public static RequestBuilder<ListResponse<ScheduleEvent>> list(ScheduleEventFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<ScheduleEvent>(ScheduleEvent.class, "schedule_scheduleevent", "list", kparams);
    }

	/**  Update an existing KalturaScheduleEvent object  */
    public static RequestBuilder<ScheduleEvent> update(int scheduleEventId, ScheduleEvent scheduleEvent)  {
        Params kparams = new Params();
        kparams.add("scheduleEventId", scheduleEventId);
        kparams.add("scheduleEvent", scheduleEvent);

        return new RequestBuilder<ScheduleEvent>(ScheduleEvent.class, "schedule_scheduleevent", "update", kparams);
    }
}
