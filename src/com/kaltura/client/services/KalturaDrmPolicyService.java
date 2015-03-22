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
// Copyright (C) 2006-2011  Kaltura Inc.
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
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaDrmPolicyService extends KalturaServiceBase {
    public KalturaDrmPolicyService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Allows you to add a new DrmPolicy object     */
    public KalturaDrmPolicy add(KalturaDrmPolicy drmPolicy) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("drmPolicy", drmPolicy);
        this.kalturaClient.queueServiceCall("drm_drmpolicy", "add", kparams, KalturaDrmPolicy.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDrmPolicy.class, resultXmlElement);
    }

	/**  Retrieve a KalturaDrmPolicy object by ID     */
    public KalturaDrmPolicy get(int drmPolicyId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("drmPolicyId", drmPolicyId);
        this.kalturaClient.queueServiceCall("drm_drmpolicy", "get", kparams, KalturaDrmPolicy.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDrmPolicy.class, resultXmlElement);
    }

	/**  Update an existing KalturaDrmPolicy object     */
    public KalturaDrmPolicy update(int drmPolicyId, KalturaDrmPolicy drmPolicy) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("drmPolicyId", drmPolicyId);
        kparams.add("drmPolicy", drmPolicy);
        this.kalturaClient.queueServiceCall("drm_drmpolicy", "update", kparams, KalturaDrmPolicy.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDrmPolicy.class, resultXmlElement);
    }

	/**  Mark the KalturaDrmPolicy object as deleted     */
    public KalturaDrmPolicy delete(int drmPolicyId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("drmPolicyId", drmPolicyId);
        this.kalturaClient.queueServiceCall("drm_drmpolicy", "delete", kparams, KalturaDrmPolicy.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDrmPolicy.class, resultXmlElement);
    }

    public KalturaDrmPolicyListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaDrmPolicyListResponse list(KalturaDrmPolicyFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List KalturaDrmPolicy objects     */
    public KalturaDrmPolicyListResponse list(KalturaDrmPolicyFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("drm_drmpolicy", "list", kparams, KalturaDrmPolicyListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDrmPolicyListResponse.class, resultXmlElement);
    }
}
