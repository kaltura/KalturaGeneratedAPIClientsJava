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
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.kaltura.client.KalturaFiles;
import com.kaltura.client.KalturaFile;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Sat, 07 Mar 15 12:17:54 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Retrieve information and invoke actions on Thumb Asset    */
@SuppressWarnings("serial")
public class KalturaThumbAssetService extends KalturaServiceBase {
    public KalturaThumbAssetService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add thumbnail asset        */
    public KalturaThumbAsset add(String entryId, KalturaThumbAsset thumbAsset) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("thumbAsset", thumbAsset);
        this.kalturaClient.queueServiceCall("thumbasset", "add", kparams, KalturaThumbAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaThumbAsset.class, resultXmlElement);
    }

	/**  Update content of thumbnail asset        */
    public KalturaThumbAsset setContent(String id, KalturaContentResource contentResource) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("contentResource", contentResource);
        this.kalturaClient.queueServiceCall("thumbasset", "setContent", kparams, KalturaThumbAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaThumbAsset.class, resultXmlElement);
    }

	/**  Update thumbnail asset        */
    public KalturaThumbAsset update(String id, KalturaThumbAsset thumbAsset) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("thumbAsset", thumbAsset);
        this.kalturaClient.queueServiceCall("thumbasset", "update", kparams, KalturaThumbAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaThumbAsset.class, resultXmlElement);
    }

    public String serveByEntryId(String entryId) throws KalturaApiException {
        return this.serveByEntryId(entryId, Integer.MIN_VALUE);
    }

	/**  Serves thumbnail by entry id and thumnail params id     */
    public String serveByEntryId(String entryId, int thumbParamId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("thumbParamId", thumbParamId);
        this.kalturaClient.queueServiceCall("thumbasset", "serveByEntryId", kparams);
        return this.kalturaClient.serve();
    }

    public String serve(String thumbAssetId) throws KalturaApiException {
        return this.serve(thumbAssetId, Integer.MIN_VALUE);
    }

    public String serve(String thumbAssetId, int version) throws KalturaApiException {
        return this.serve(thumbAssetId, version, null);
    }

    public String serve(String thumbAssetId, int version, KalturaThumbParams thumbParams) throws KalturaApiException {
        return this.serve(thumbAssetId, version, thumbParams, null);
    }

	/**  Serves thumbnail by its id     */
    public String serve(String thumbAssetId, int version, KalturaThumbParams thumbParams, KalturaThumbnailServeOptions options) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("thumbAssetId", thumbAssetId);
        kparams.add("version", version);
        kparams.add("thumbParams", thumbParams);
        kparams.add("options", options);
        this.kalturaClient.queueServiceCall("thumbasset", "serve", kparams);
        return this.kalturaClient.serve();
    }

	/**  Tags the thumbnail as DEFAULT_THUMB and removes that tag from all other
	  thumbnail assets of the entry.   Create a new file sync link on the entry
	  thumbnail that points to the thumbnail asset file sync.     */
    public void setAsDefault(String thumbAssetId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("thumbAssetId", thumbAssetId);
        this.kalturaClient.queueServiceCall("thumbasset", "setAsDefault", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaThumbAsset generateByEntryId(String entryId, int destThumbParamsId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("destThumbParamsId", destThumbParamsId);
        this.kalturaClient.queueServiceCall("thumbasset", "generateByEntryId", kparams, KalturaThumbAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaThumbAsset.class, resultXmlElement);
    }

    public KalturaThumbAsset generate(String entryId, KalturaThumbParams thumbParams) throws KalturaApiException {
        return this.generate(entryId, thumbParams, null);
    }

    public KalturaThumbAsset generate(String entryId, KalturaThumbParams thumbParams, String sourceAssetId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("thumbParams", thumbParams);
        kparams.add("sourceAssetId", sourceAssetId);
        this.kalturaClient.queueServiceCall("thumbasset", "generate", kparams, KalturaThumbAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaThumbAsset.class, resultXmlElement);
    }

    public KalturaThumbAsset regenerate(String thumbAssetId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("thumbAssetId", thumbAssetId);
        this.kalturaClient.queueServiceCall("thumbasset", "regenerate", kparams, KalturaThumbAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaThumbAsset.class, resultXmlElement);
    }

    public KalturaThumbAsset get(String thumbAssetId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("thumbAssetId", thumbAssetId);
        this.kalturaClient.queueServiceCall("thumbasset", "get", kparams, KalturaThumbAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaThumbAsset.class, resultXmlElement);
    }

    public List<KalturaThumbAsset> getByEntryId(String entryId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        this.kalturaClient.queueServiceCall("thumbasset", "getByEntryId", kparams, KalturaThumbAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaThumbAsset.class, resultXmlElement);
    }

    public KalturaThumbAssetListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaThumbAssetListResponse list(KalturaAssetFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List Thumbnail Assets by filter and pager     */
    public KalturaThumbAssetListResponse list(KalturaAssetFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("thumbasset", "list", kparams, KalturaThumbAssetListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaThumbAssetListResponse.class, resultXmlElement);
    }

    public KalturaThumbAsset addFromUrl(String entryId, String url) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("url", url);
        this.kalturaClient.queueServiceCall("thumbasset", "addFromUrl", kparams, KalturaThumbAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaThumbAsset.class, resultXmlElement);
    }

    public KalturaThumbAsset addFromImage(String entryId, File fileData) throws KalturaApiException {
        return this.addFromImage(entryId, new KalturaFile(fileData));
    }

    public KalturaThumbAsset addFromImage(String entryId, InputStream fileData, String fileDataName, long fileDataSize) throws KalturaApiException {
        return this.addFromImage(entryId, new KalturaFile(fileData, fileDataName, fileDataSize));
    }

    public KalturaThumbAsset addFromImage(String entryId, FileInputStream fileData, String fileDataName) throws KalturaApiException {
        return this.addFromImage(entryId, new KalturaFile(fileData, fileDataName));
    }

    public KalturaThumbAsset addFromImage(String entryId, KalturaFile fileData) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        KalturaFiles kfiles = new KalturaFiles();
        kfiles.add("fileData", fileData);
        this.kalturaClient.queueServiceCall("thumbasset", "addFromImage", kparams, kfiles, KalturaThumbAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaThumbAsset.class, resultXmlElement);
    }

    public void delete(String thumbAssetId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("thumbAssetId", thumbAssetId);
        this.kalturaClient.queueServiceCall("thumbasset", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public String getUrl(String id) throws KalturaApiException {
        return this.getUrl(id, Integer.MIN_VALUE);
    }

    public String getUrl(String id, int storageId) throws KalturaApiException {
        return this.getUrl(id, storageId, null);
    }

	/**  Get download URL for the asset     */
    public String getUrl(String id, int storageId, KalturaThumbParams thumbParams) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("storageId", storageId);
        kparams.add("thumbParams", thumbParams);
        this.kalturaClient.queueServiceCall("thumbasset", "getUrl", kparams);
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
        this.kalturaClient.queueServiceCall("thumbasset", "getRemotePaths", kparams, KalturaRemotePathListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaRemotePathListResponse.class, resultXmlElement);
    }
}
