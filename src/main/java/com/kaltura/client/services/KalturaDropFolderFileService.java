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
import com.kaltura.client.enums.*;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Sat, 12 Sep 15 02:29:48 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  DropFolderFile service lets you create and manage drop folder files    */
@SuppressWarnings("serial")
public class KalturaDropFolderFileService extends KalturaServiceBase {
    public KalturaDropFolderFileService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Allows you to add a new KalturaDropFolderFile object     */
    public KalturaDropFolderFile add(KalturaDropFolderFile dropFolderFile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("dropFolderFile", dropFolderFile);
        this.kalturaClient.queueServiceCall("dropfolder_dropfolderfile", "add", kparams, KalturaDropFolderFile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDropFolderFile.class, resultXmlElement);
    }

	/**  Retrieve a KalturaDropFolderFile object by ID     */
    public KalturaDropFolderFile get(int dropFolderFileId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("dropFolderFileId", dropFolderFileId);
        this.kalturaClient.queueServiceCall("dropfolder_dropfolderfile", "get", kparams, KalturaDropFolderFile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDropFolderFile.class, resultXmlElement);
    }

	/**  Update an existing KalturaDropFolderFile object     */
    public KalturaDropFolderFile update(int dropFolderFileId, KalturaDropFolderFile dropFolderFile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("dropFolderFileId", dropFolderFileId);
        kparams.add("dropFolderFile", dropFolderFile);
        this.kalturaClient.queueServiceCall("dropfolder_dropfolderfile", "update", kparams, KalturaDropFolderFile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDropFolderFile.class, resultXmlElement);
    }

	/**  Update status of KalturaDropFolderFile     */
    public KalturaDropFolderFile updateStatus(int dropFolderFileId, KalturaDropFolderFileStatus status) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("dropFolderFileId", dropFolderFileId);
        kparams.add("status", status);
        this.kalturaClient.queueServiceCall("dropfolder_dropfolderfile", "updateStatus", kparams, KalturaDropFolderFile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDropFolderFile.class, resultXmlElement);
    }

	/**  Mark the KalturaDropFolderFile object as deleted     */
    public KalturaDropFolderFile delete(int dropFolderFileId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("dropFolderFileId", dropFolderFileId);
        this.kalturaClient.queueServiceCall("dropfolder_dropfolderfile", "delete", kparams, KalturaDropFolderFile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDropFolderFile.class, resultXmlElement);
    }

    public KalturaDropFolderFileListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaDropFolderFileListResponse list(KalturaDropFolderFileFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List KalturaDropFolderFile objects     */
    public KalturaDropFolderFileListResponse list(KalturaDropFolderFileFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("dropfolder_dropfolderfile", "list", kparams, KalturaDropFolderFileListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDropFolderFileListResponse.class, resultXmlElement);
    }

	/**  Set the KalturaDropFolderFile status to ignore
	  (KalturaDropFolderFileStatus::IGNORE)     */
    public KalturaDropFolderFile ignore(int dropFolderFileId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("dropFolderFileId", dropFolderFileId);
        this.kalturaClient.queueServiceCall("dropfolder_dropfolderfile", "ignore", kparams, KalturaDropFolderFile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDropFolderFile.class, resultXmlElement);
    }
}
