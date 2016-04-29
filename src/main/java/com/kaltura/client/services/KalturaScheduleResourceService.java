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
// Copyright (C) 2006-2016  Kaltura Inc.
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

import com.kaltura.client.KalturaClient;
import com.kaltura.client.KalturaServiceBase;
import com.kaltura.client.types.*;
import org.w3c.dom.Element;
import com.kaltura.client.utils.ParseUtils;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.kaltura.client.KalturaFiles;
import com.kaltura.client.KalturaFile;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  ScheduleResource service lets you create and manage schedule events    */
@SuppressWarnings("serial")
public class KalturaScheduleResourceService extends KalturaServiceBase {
    public KalturaScheduleResourceService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Allows you to add a new KalturaScheduleResource object     */
    public KalturaScheduleResource add(KalturaScheduleResource scheduleResource) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("scheduleResource", scheduleResource);
        this.kalturaClient.queueServiceCall("schedule_scheduleresource", "add", kparams, KalturaScheduleResource.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaScheduleResource.class, resultXmlElement);
    }

	/**  Retrieve a KalturaScheduleResource object by ID     */
    public KalturaScheduleResource get(int scheduleResourceId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("scheduleResourceId", scheduleResourceId);
        this.kalturaClient.queueServiceCall("schedule_scheduleresource", "get", kparams, KalturaScheduleResource.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaScheduleResource.class, resultXmlElement);
    }

	/**  Update an existing KalturaScheduleResource object     */
    public KalturaScheduleResource update(int scheduleResourceId, KalturaScheduleResource scheduleResource) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("scheduleResourceId", scheduleResourceId);
        kparams.add("scheduleResource", scheduleResource);
        this.kalturaClient.queueServiceCall("schedule_scheduleresource", "update", kparams, KalturaScheduleResource.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaScheduleResource.class, resultXmlElement);
    }

	/**  Mark the KalturaScheduleResource object as deleted     */
    public KalturaScheduleResource delete(int scheduleResourceId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("scheduleResourceId", scheduleResourceId);
        this.kalturaClient.queueServiceCall("schedule_scheduleresource", "delete", kparams, KalturaScheduleResource.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaScheduleResource.class, resultXmlElement);
    }

    public KalturaScheduleResourceListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaScheduleResourceListResponse list(KalturaScheduleResourceFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List KalturaScheduleResource objects     */
    public KalturaScheduleResourceListResponse list(KalturaScheduleResourceFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("schedule_scheduleresource", "list", kparams, KalturaScheduleResourceListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaScheduleResourceListResponse.class, resultXmlElement);
    }

    public KalturaBulkUpload addFromBulkUpload(KalturaFile fileData) throws KalturaApiException {
        return this.addFromBulkUpload(fileData, null);
    }

    public KalturaBulkUpload addFromBulkUpload(File fileData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData), null);
    }

    public KalturaBulkUpload addFromBulkUpload(InputStream fileData, String fileDataName, long fileDataSize) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData, fileDataName, fileDataSize), null);
    }

    public KalturaBulkUpload addFromBulkUpload(FileInputStream fileData, String fileDataName) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData, fileDataName), null);
    }

    public KalturaBulkUpload addFromBulkUpload(File fileData, KalturaBulkUploadCsvJobData bulkUploadData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData), bulkUploadData);
    }

    public KalturaBulkUpload addFromBulkUpload(InputStream fileData, String fileDataName, long fileDataSize, KalturaBulkUploadCsvJobData bulkUploadData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData, fileDataName, fileDataSize), bulkUploadData);
    }

    public KalturaBulkUpload addFromBulkUpload(FileInputStream fileData, String fileDataName, KalturaBulkUploadCsvJobData bulkUploadData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData, fileDataName), bulkUploadData);
    }

	/**  Add new bulk upload batch job     */
    public KalturaBulkUpload addFromBulkUpload(KalturaFile fileData, KalturaBulkUploadCsvJobData bulkUploadData) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        KalturaFiles kfiles = new KalturaFiles();
        kfiles.add("fileData", fileData);
        kparams.add("bulkUploadData", bulkUploadData);
        this.kalturaClient.queueServiceCall("schedule_scheduleresource", "addFromBulkUpload", kparams, kfiles, KalturaBulkUpload.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaBulkUpload.class, resultXmlElement);
    }
}
