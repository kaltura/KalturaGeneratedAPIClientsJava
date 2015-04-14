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
 * @date Tue, 14 Apr 15 00:25:39 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Annotation service - Video Annotation    */
@SuppressWarnings("serial")
public class KalturaAnnotationService extends KalturaServiceBase {
    public KalturaAnnotationService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Allows you to add an annotation object associated with an entry     */
    public KalturaAnnotation add(KalturaCuePoint annotation) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("annotation", annotation);
        this.kalturaClient.queueServiceCall("annotation_annotation", "add", kparams, KalturaAnnotation.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAnnotation.class, resultXmlElement);
    }

	/**  Update annotation by id     */
    public KalturaAnnotation update(String id, KalturaCuePoint annotation) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("annotation", annotation);
        this.kalturaClient.queueServiceCall("annotation_annotation", "update", kparams, KalturaAnnotation.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAnnotation.class, resultXmlElement);
    }

    public KalturaAnnotationListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaAnnotationListResponse list(KalturaCuePointFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List annotation objects by filter and pager    */
    public KalturaAnnotationListResponse list(KalturaCuePointFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("annotation_annotation", "list", kparams, KalturaAnnotationListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAnnotationListResponse.class, resultXmlElement);
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
        this.kalturaClient.queueServiceCall("annotation_annotation", "addFromBulk", kparams, kfiles, KalturaCuePointListResponse.class);
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
        this.kalturaClient.queueServiceCall("annotation_annotation", "serveBulk", kparams);
        return this.kalturaClient.serve();
    }

	/**  Retrieve an CuePoint object by id     */
    public KalturaCuePoint get(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("annotation_annotation", "get", kparams, KalturaCuePoint.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCuePoint.class, resultXmlElement);
    }

    public int count() throws KalturaApiException {
        return this.count(null);
    }

	/**  count cue point objects by filter     */
    public int count(KalturaCuePointFilter filter) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        this.kalturaClient.queueServiceCall("annotation_annotation", "count", kparams);
        if (this.kalturaClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

	/**  delete cue point by id, and delete all children cue points     */
    public void delete(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("annotation_annotation", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }
}
