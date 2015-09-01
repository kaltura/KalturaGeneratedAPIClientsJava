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
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.kaltura.client.KalturaFiles;
import com.kaltura.client.KalturaFile;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Tue, 01 Sep 15 01:39:59 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Add & Manage CategoryUser - membership of a user in a category    */
@SuppressWarnings("serial")
public class KalturaCategoryUserService extends KalturaServiceBase {
    public KalturaCategoryUserService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new CategoryUser     */
    public KalturaCategoryUser add(KalturaCategoryUser categoryUser) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("categoryUser", categoryUser);
        this.kalturaClient.queueServiceCall("categoryuser", "add", kparams, KalturaCategoryUser.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCategoryUser.class, resultXmlElement);
    }

	/**  Get CategoryUser by id     */
    public KalturaCategoryUser get(int categoryId, String userId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("categoryId", categoryId);
        kparams.add("userId", userId);
        this.kalturaClient.queueServiceCall("categoryuser", "get", kparams, KalturaCategoryUser.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCategoryUser.class, resultXmlElement);
    }

    public KalturaCategoryUser update(int categoryId, String userId, KalturaCategoryUser categoryUser) throws KalturaApiException {
        return this.update(categoryId, userId, categoryUser, false);
    }

	/**  Update CategoryUser by id     */
    public KalturaCategoryUser update(int categoryId, String userId, KalturaCategoryUser categoryUser, boolean override) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("categoryId", categoryId);
        kparams.add("userId", userId);
        kparams.add("categoryUser", categoryUser);
        kparams.add("override", override);
        this.kalturaClient.queueServiceCall("categoryuser", "update", kparams, KalturaCategoryUser.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCategoryUser.class, resultXmlElement);
    }

	/**  Delete a CategoryUser     */
    public void delete(int categoryId, String userId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("categoryId", categoryId);
        kparams.add("userId", userId);
        this.kalturaClient.queueServiceCall("categoryuser", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

	/**  activate CategoryUser     */
    public KalturaCategoryUser activate(int categoryId, String userId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("categoryId", categoryId);
        kparams.add("userId", userId);
        this.kalturaClient.queueServiceCall("categoryuser", "activate", kparams, KalturaCategoryUser.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCategoryUser.class, resultXmlElement);
    }

	/**  reject CategoryUser     */
    public KalturaCategoryUser deactivate(int categoryId, String userId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("categoryId", categoryId);
        kparams.add("userId", userId);
        this.kalturaClient.queueServiceCall("categoryuser", "deactivate", kparams, KalturaCategoryUser.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCategoryUser.class, resultXmlElement);
    }

    public KalturaCategoryUserListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaCategoryUserListResponse list(KalturaCategoryUserFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List all categories     */
    public KalturaCategoryUserListResponse list(KalturaCategoryUserFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("categoryuser", "list", kparams, KalturaCategoryUserListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCategoryUserListResponse.class, resultXmlElement);
    }

	/**  Copy all memeber from parent category     */
    public void copyFromCategory(int categoryId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("categoryId", categoryId);
        this.kalturaClient.queueServiceCall("categoryuser", "copyFromCategory", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public int index(String userId, int categoryId) throws KalturaApiException {
        return this.index(userId, categoryId, true);
    }

	/**  Index CategoryUser by userid and category id     */
    public int index(String userId, int categoryId, boolean shouldUpdate) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("userId", userId);
        kparams.add("categoryId", categoryId);
        kparams.add("shouldUpdate", shouldUpdate);
        this.kalturaClient.queueServiceCall("categoryuser", "index", kparams);
        if (this.kalturaClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
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

    public KalturaBulkUpload addFromBulkUpload(KalturaFile fileData, KalturaBulkUploadJobData bulkUploadData) throws KalturaApiException {
        return this.addFromBulkUpload(fileData, bulkUploadData, null);
    }

    public KalturaBulkUpload addFromBulkUpload(File fileData, KalturaBulkUploadJobData bulkUploadData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData), bulkUploadData, null);
    }

    public KalturaBulkUpload addFromBulkUpload(InputStream fileData, String fileDataName, long fileDataSize, KalturaBulkUploadJobData bulkUploadData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData, fileDataName, fileDataSize), bulkUploadData, null);
    }

    public KalturaBulkUpload addFromBulkUpload(FileInputStream fileData, String fileDataName, KalturaBulkUploadJobData bulkUploadData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData, fileDataName), bulkUploadData, null);
    }

    public KalturaBulkUpload addFromBulkUpload(File fileData, KalturaBulkUploadJobData bulkUploadData, KalturaBulkUploadCategoryUserData bulkUploadCategoryUserData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData), bulkUploadData, bulkUploadCategoryUserData);
    }

    public KalturaBulkUpload addFromBulkUpload(InputStream fileData, String fileDataName, long fileDataSize, KalturaBulkUploadJobData bulkUploadData, KalturaBulkUploadCategoryUserData bulkUploadCategoryUserData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData, fileDataName, fileDataSize), bulkUploadData, bulkUploadCategoryUserData);
    }

    public KalturaBulkUpload addFromBulkUpload(FileInputStream fileData, String fileDataName, KalturaBulkUploadJobData bulkUploadData, KalturaBulkUploadCategoryUserData bulkUploadCategoryUserData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData, fileDataName), bulkUploadData, bulkUploadCategoryUserData);
    }

    public KalturaBulkUpload addFromBulkUpload(KalturaFile fileData, KalturaBulkUploadJobData bulkUploadData, KalturaBulkUploadCategoryUserData bulkUploadCategoryUserData) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        KalturaFiles kfiles = new KalturaFiles();
        kfiles.add("fileData", fileData);
        kparams.add("bulkUploadData", bulkUploadData);
        kparams.add("bulkUploadCategoryUserData", bulkUploadCategoryUserData);
        this.kalturaClient.queueServiceCall("categoryuser", "addFromBulkUpload", kparams, kfiles, KalturaBulkUpload.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaBulkUpload.class, resultXmlElement);
    }
}
