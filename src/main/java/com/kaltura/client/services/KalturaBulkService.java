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
// Copyright (C) 2006-2015  Kaltura Inc.
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

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Sat, 12 Sep 15 02:29:48 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Bulk upload service is used to upload & manage bulk uploads    */
@SuppressWarnings("serial")
public class KalturaBulkService extends KalturaServiceBase {
    public KalturaBulkService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Get bulk upload batch job by id     */
    public KalturaBulkUpload get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("bulkupload_bulk", "get", kparams, KalturaBulkUpload.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaBulkUpload.class, resultXmlElement);
    }

    public KalturaBulkUploadListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaBulkUploadListResponse list(KalturaBulkUploadFilter bulkUploadFilter) throws KalturaApiException {
        return this.list(bulkUploadFilter, null);
    }

	/**  List bulk upload batch jobs     */
    public KalturaBulkUploadListResponse list(KalturaBulkUploadFilter bulkUploadFilter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("bulkUploadFilter", bulkUploadFilter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("bulkupload_bulk", "list", kparams, KalturaBulkUploadListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaBulkUploadListResponse.class, resultXmlElement);
    }

	/**  serve action returns the original file.     */
    public String serve(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("bulkupload_bulk", "serve", kparams);
        return this.kalturaClient.serve();
    }

	/**  serveLog action returns the log file for the bulk-upload job.     */
    public String serveLog(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("bulkupload_bulk", "serveLog", kparams);
        return this.kalturaClient.serve();
    }

	/**  Aborts the bulk upload and all its child jobs     */
    public KalturaBulkUpload abort(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("bulkupload_bulk", "abort", kparams, KalturaBulkUpload.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaBulkUpload.class, resultXmlElement);
    }
}
