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
 * @date Sun, 26 Jul 15 00:33:16 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Add & Manage Caption Params    */
@SuppressWarnings("serial")
public class KalturaCaptionParamsService extends KalturaServiceBase {
    public KalturaCaptionParamsService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new Caption Params     */
    public KalturaCaptionParams add(KalturaCaptionParams captionParams) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("captionParams", captionParams);
        this.kalturaClient.queueServiceCall("caption_captionparams", "add", kparams, KalturaCaptionParams.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCaptionParams.class, resultXmlElement);
    }

	/**  Get Caption Params by ID     */
    public KalturaCaptionParams get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("caption_captionparams", "get", kparams, KalturaCaptionParams.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCaptionParams.class, resultXmlElement);
    }

	/**  Update Caption Params by ID     */
    public KalturaCaptionParams update(int id, KalturaCaptionParams captionParams) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("captionParams", captionParams);
        this.kalturaClient.queueServiceCall("caption_captionparams", "update", kparams, KalturaCaptionParams.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCaptionParams.class, resultXmlElement);
    }

	/**  Delete Caption Params by ID     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("caption_captionparams", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaCaptionParamsListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaCaptionParamsListResponse list(KalturaCaptionParamsFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List Caption Params by filter with paging support (By default - all system
	  default params will be listed too)     */
    public KalturaCaptionParamsListResponse list(KalturaCaptionParamsFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("caption_captionparams", "list", kparams, KalturaCaptionParamsListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCaptionParamsListResponse.class, resultXmlElement);
    }
}
