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
 * @date Thu, 16 Jul 15 05:54:31 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Retrieve information and invoke actions on attachment Asset    */
@SuppressWarnings("serial")
public class KalturaAttachmentAssetService extends KalturaServiceBase {
    public KalturaAttachmentAssetService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add attachment asset        */
    public KalturaAttachmentAsset add(String entryId, KalturaAttachmentAsset attachmentAsset) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("attachmentAsset", attachmentAsset);
        this.kalturaClient.queueServiceCall("attachment_attachmentasset", "add", kparams, KalturaAttachmentAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAttachmentAsset.class, resultXmlElement);
    }

	/**  Update content of attachment asset        */
    public KalturaAttachmentAsset setContent(String id, KalturaContentResource contentResource) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("contentResource", contentResource);
        this.kalturaClient.queueServiceCall("attachment_attachmentasset", "setContent", kparams, KalturaAttachmentAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAttachmentAsset.class, resultXmlElement);
    }

	/**  Update attachment asset        */
    public KalturaAttachmentAsset update(String id, KalturaAttachmentAsset attachmentAsset) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("attachmentAsset", attachmentAsset);
        this.kalturaClient.queueServiceCall("attachment_attachmentasset", "update", kparams, KalturaAttachmentAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAttachmentAsset.class, resultXmlElement);
    }

    public String getUrl(String id) throws KalturaApiException {
        return this.getUrl(id, Integer.MIN_VALUE);
    }

	/**  Get download URL for the asset     */
    public String getUrl(String id, int storageId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("storageId", storageId);
        this.kalturaClient.queueServiceCall("attachment_attachmentasset", "getUrl", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

	/**  Get remote storage existing paths for the asset     */
    public KalturaRemotePathListResponse getRemotePaths(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("attachment_attachmentasset", "getRemotePaths", kparams, KalturaRemotePathListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaRemotePathListResponse.class, resultXmlElement);
    }

	/**  Serves attachment by its id     */
    public String serve(String attachmentAssetId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("attachmentAssetId", attachmentAssetId);
        this.kalturaClient.queueServiceCall("attachment_attachmentasset", "serve", kparams);
        return this.kalturaClient.serve();
    }

    public KalturaAttachmentAsset get(String attachmentAssetId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("attachmentAssetId", attachmentAssetId);
        this.kalturaClient.queueServiceCall("attachment_attachmentasset", "get", kparams, KalturaAttachmentAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAttachmentAsset.class, resultXmlElement);
    }

    public KalturaAttachmentAssetListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaAttachmentAssetListResponse list(KalturaAssetFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List attachment Assets by filter and pager     */
    public KalturaAttachmentAssetListResponse list(KalturaAssetFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("attachment_attachmentasset", "list", kparams, KalturaAttachmentAssetListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAttachmentAssetListResponse.class, resultXmlElement);
    }

    public void delete(String attachmentAssetId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("attachmentAssetId", attachmentAssetId);
        this.kalturaClient.queueServiceCall("attachment_attachmentasset", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }
}
