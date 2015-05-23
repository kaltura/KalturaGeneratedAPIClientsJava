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
 * @date Sat, 23 May 15 00:21:31 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Cue Point service    */
@SuppressWarnings("serial")
public class KalturaCuePointService extends KalturaServiceBase {
    public KalturaCuePointService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Allows you to add an cue point object associated with an entry     */
    public KalturaCuePoint add(KalturaCuePoint cuePoint) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("cuePoint", cuePoint);
        this.kalturaClient.queueServiceCall("cuepoint_cuepoint", "add", kparams, KalturaCuePoint.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCuePoint.class, resultXmlElement);
    }

    public KalturaCuePointListResponse addFromBulk(File fileData) throws KalturaApiException {
        return this.addFromBulk(new KalturaFile(fileData));
    }

    public KalturaCuePointListResponse addFromBulk(InputStream fileData, String fileDataName, long fileDataSize) throws KalturaApiException {
        return this.addFromBulk(new KalturaFile(fileData, fileDataName, fileDataSize));
    }

    public KalturaCuePointListResponse addFromBulk(FileInputStream fileData, String fileDataName) throws KalturaApiException {
        return this.addFromBulk(new KalturaFile(fileData, fileDataName));
    }

	/**  Allows you to add multiple cue points objects by uploading XML that contains
	  multiple cue point definitions     */
    public KalturaCuePointListResponse addFromBulk(KalturaFile fileData) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        KalturaFiles kfiles = new KalturaFiles();
        kfiles.add("fileData", fileData);
        this.kalturaClient.queueServiceCall("cuepoint_cuepoint", "addFromBulk", kparams, kfiles, KalturaCuePointListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCuePointListResponse.class, resultXmlElement);
    }

    public String serveBulk() throws KalturaApiException {
        return this.serveBulk(null);
    }

    public String serveBulk(KalturaCuePointFilter filter) throws KalturaApiException {
        return this.serveBulk(filter, null);
    }

	/**  Download multiple cue points objects as XML definitions     */
    public String serveBulk(KalturaCuePointFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("cuepoint_cuepoint", "serveBulk", kparams);
        return this.kalturaClient.serve();
    }

	/**  Retrieve an CuePoint object by id     */
    public KalturaCuePoint get(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("cuepoint_cuepoint", "get", kparams, KalturaCuePoint.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCuePoint.class, resultXmlElement);
    }

    public KalturaCuePointListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaCuePointListResponse list(KalturaCuePointFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List cue point objects by filter and pager     */
    public KalturaCuePointListResponse list(KalturaCuePointFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("cuepoint_cuepoint", "list", kparams, KalturaCuePointListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCuePointListResponse.class, resultXmlElement);
    }

    public int count() throws KalturaApiException {
        return this.count(null);
    }

	/**  count cue point objects by filter     */
    public int count(KalturaCuePointFilter filter) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        this.kalturaClient.queueServiceCall("cuepoint_cuepoint", "count", kparams);
        if (this.kalturaClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

	/**  Update cue point by id      */
    public KalturaCuePoint update(String id, KalturaCuePoint cuePoint) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("cuePoint", cuePoint);
        this.kalturaClient.queueServiceCall("cuepoint_cuepoint", "update", kparams, KalturaCuePoint.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCuePoint.class, resultXmlElement);
    }

	/**  delete cue point by id, and delete all children cue points     */
    public void delete(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("cuepoint_cuepoint", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }
}
