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
 * @date Mon, 16 Mar 15 00:23:51 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Add & Manage CategoryEntry - assign entry to category    */
@SuppressWarnings("serial")
public class KalturaCategoryEntryService extends KalturaServiceBase {
    public KalturaCategoryEntryService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new CategoryEntry     */
    public KalturaCategoryEntry add(KalturaCategoryEntry categoryEntry) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("categoryEntry", categoryEntry);
        this.kalturaClient.queueServiceCall("categoryentry", "add", kparams, KalturaCategoryEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCategoryEntry.class, resultXmlElement);
    }

	/**  Delete CategoryEntry     */
    public void delete(String entryId, int categoryId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("categoryId", categoryId);
        this.kalturaClient.queueServiceCall("categoryentry", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaCategoryEntryListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaCategoryEntryListResponse list(KalturaCategoryEntryFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List all categoryEntry     */
    public KalturaCategoryEntryListResponse list(KalturaCategoryEntryFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("categoryentry", "list", kparams, KalturaCategoryEntryListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCategoryEntryListResponse.class, resultXmlElement);
    }

    public int index(String entryId, int categoryId) throws KalturaApiException {
        return this.index(entryId, categoryId, true);
    }

	/**  Index CategoryEntry by Id     */
    public int index(String entryId, int categoryId, boolean shouldUpdate) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("categoryId", categoryId);
        kparams.add("shouldUpdate", shouldUpdate);
        this.kalturaClient.queueServiceCall("categoryentry", "index", kparams);
        if (this.kalturaClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

	/**  activate CategoryEntry when it is pending moderation     */
    public void activate(String entryId, int categoryId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("categoryId", categoryId);
        this.kalturaClient.queueServiceCall("categoryentry", "activate", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

	/**  activate CategoryEntry when it is pending moderation     */
    public void reject(String entryId, int categoryId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("categoryId", categoryId);
        this.kalturaClient.queueServiceCall("categoryentry", "reject", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

	/**  update privacy context from the category     */
    public void syncPrivacyContext(String entryId, int categoryId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("categoryId", categoryId);
        this.kalturaClient.queueServiceCall("categoryentry", "syncPrivacyContext", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaBulkUpload addFromBulkUpload(KalturaBulkServiceData bulkUploadData) throws KalturaApiException {
        return this.addFromBulkUpload(bulkUploadData, null);
    }

    public KalturaBulkUpload addFromBulkUpload(KalturaBulkServiceData bulkUploadData, KalturaBulkUploadCategoryEntryData bulkUploadCategoryEntryData) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("bulkUploadData", bulkUploadData);
        kparams.add("bulkUploadCategoryEntryData", bulkUploadCategoryEntryData);
        this.kalturaClient.queueServiceCall("categoryentry", "addFromBulkUpload", kparams, KalturaBulkUpload.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaBulkUpload.class, resultXmlElement);
    }
}
