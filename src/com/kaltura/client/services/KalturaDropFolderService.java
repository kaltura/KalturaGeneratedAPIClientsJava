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
 * @date Sun, 28 Jun 15 09:32:27 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  DropFolder service lets you create and manage drop folders    */
@SuppressWarnings("serial")
public class KalturaDropFolderService extends KalturaServiceBase {
    public KalturaDropFolderService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Allows you to add a new KalturaDropFolder object     */
    public KalturaDropFolder add(KalturaDropFolder dropFolder) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("dropFolder", dropFolder);
        this.kalturaClient.queueServiceCall("dropfolder_dropfolder", "add", kparams, KalturaDropFolder.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDropFolder.class, resultXmlElement);
    }

	/**  Retrieve a KalturaDropFolder object by ID     */
    public KalturaDropFolder get(int dropFolderId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("dropFolderId", dropFolderId);
        this.kalturaClient.queueServiceCall("dropfolder_dropfolder", "get", kparams, KalturaDropFolder.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDropFolder.class, resultXmlElement);
    }

	/**  Update an existing KalturaDropFolder object     */
    public KalturaDropFolder update(int dropFolderId, KalturaDropFolder dropFolder) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("dropFolderId", dropFolderId);
        kparams.add("dropFolder", dropFolder);
        this.kalturaClient.queueServiceCall("dropfolder_dropfolder", "update", kparams, KalturaDropFolder.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDropFolder.class, resultXmlElement);
    }

	/**  Mark the KalturaDropFolder object as deleted     */
    public KalturaDropFolder delete(int dropFolderId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("dropFolderId", dropFolderId);
        this.kalturaClient.queueServiceCall("dropfolder_dropfolder", "delete", kparams, KalturaDropFolder.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDropFolder.class, resultXmlElement);
    }

    public KalturaDropFolderListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaDropFolderListResponse list(KalturaDropFolderFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List KalturaDropFolder objects     */
    public KalturaDropFolderListResponse list(KalturaDropFolderFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("dropfolder_dropfolder", "list", kparams, KalturaDropFolderListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDropFolderListResponse.class, resultXmlElement);
    }
}
