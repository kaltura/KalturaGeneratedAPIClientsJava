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
 * @date Mon, 25 May 15 00:21:59 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Retrieve information and invoke actions on caption Asset    */
@SuppressWarnings("serial")
public class KalturaCaptionAssetService extends KalturaServiceBase {
    public KalturaCaptionAssetService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add caption asset        */
    public KalturaCaptionAsset add(String entryId, KalturaCaptionAsset captionAsset) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("captionAsset", captionAsset);
        this.kalturaClient.queueServiceCall("caption_captionasset", "add", kparams, KalturaCaptionAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCaptionAsset.class, resultXmlElement);
    }

	/**  Update content of caption asset        */
    public KalturaCaptionAsset setContent(String id, KalturaContentResource contentResource) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("contentResource", contentResource);
        this.kalturaClient.queueServiceCall("caption_captionasset", "setContent", kparams, KalturaCaptionAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCaptionAsset.class, resultXmlElement);
    }

	/**  Update caption asset        */
    public KalturaCaptionAsset update(String id, KalturaCaptionAsset captionAsset) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("captionAsset", captionAsset);
        this.kalturaClient.queueServiceCall("caption_captionasset", "update", kparams, KalturaCaptionAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCaptionAsset.class, resultXmlElement);
    }

    public String serveByEntryId(String entryId) throws KalturaApiException {
        return this.serveByEntryId(entryId, Integer.MIN_VALUE);
    }

	/**  Serves caption by entry id and thumnail params id     */
    public String serveByEntryId(String entryId, int captionParamId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("captionParamId", captionParamId);
        this.kalturaClient.queueServiceCall("caption_captionasset", "serveByEntryId", kparams);
        return this.kalturaClient.serve();
    }

    public String getUrl(String id) throws KalturaApiException {
        return this.getUrl(id, Integer.MIN_VALUE);
    }

	/**  Get download URL for the asset     */
    public String getUrl(String id, int storageId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("storageId", storageId);
        this.kalturaClient.queueServiceCall("caption_captionasset", "getUrl", kparams);
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
        this.kalturaClient.queueServiceCall("caption_captionasset", "getRemotePaths", kparams, KalturaRemotePathListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaRemotePathListResponse.class, resultXmlElement);
    }

	/**  Serves caption by its id     */
    public String serve(String captionAssetId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("captionAssetId", captionAssetId);
        this.kalturaClient.queueServiceCall("caption_captionasset", "serve", kparams);
        return this.kalturaClient.serve();
    }

    public String serveWebVTT(String captionAssetId) throws KalturaApiException {
        return this.serveWebVTT(captionAssetId, 30);
    }

    public String serveWebVTT(String captionAssetId, int segmentDuration) throws KalturaApiException {
        return this.serveWebVTT(captionAssetId, segmentDuration, Integer.MIN_VALUE);
    }

    public String serveWebVTT(String captionAssetId, int segmentDuration, int segmentIndex) throws KalturaApiException {
        return this.serveWebVTT(captionAssetId, segmentDuration, segmentIndex, 10000);
    }

	/**  Serves caption by its id converting it to segmented WebVTT     */
    public String serveWebVTT(String captionAssetId, int segmentDuration, int segmentIndex, int localTimestamp) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("captionAssetId", captionAssetId);
        kparams.add("segmentDuration", segmentDuration);
        kparams.add("segmentIndex", segmentIndex);
        kparams.add("localTimestamp", localTimestamp);
        this.kalturaClient.queueServiceCall("caption_captionasset", "serveWebVTT", kparams);
        return this.kalturaClient.serve();
    }

	/**  Markss the caption as default and removes that mark from all other caption
	  assets of the entry.     */
    public void setAsDefault(String captionAssetId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("captionAssetId", captionAssetId);
        this.kalturaClient.queueServiceCall("caption_captionasset", "setAsDefault", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaCaptionAsset get(String captionAssetId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("captionAssetId", captionAssetId);
        this.kalturaClient.queueServiceCall("caption_captionasset", "get", kparams, KalturaCaptionAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCaptionAsset.class, resultXmlElement);
    }

    public KalturaCaptionAssetListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaCaptionAssetListResponse list(KalturaAssetFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List caption Assets by filter and pager     */
    public KalturaCaptionAssetListResponse list(KalturaAssetFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("caption_captionasset", "list", kparams, KalturaCaptionAssetListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCaptionAssetListResponse.class, resultXmlElement);
    }

    public void delete(String captionAssetId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("captionAssetId", captionAssetId);
        this.kalturaClient.queueServiceCall("caption_captionasset", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }
}
