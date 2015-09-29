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
 * @date Tue, 29 Sep 15 01:18:50 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Manage response profiles    */
@SuppressWarnings("serial")
public class KalturaResponseProfileService extends KalturaServiceBase {
    public KalturaResponseProfileService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new response profile     */
    public KalturaResponseProfile add(KalturaResponseProfile addResponseProfile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("addResponseProfile", addResponseProfile);
        this.kalturaClient.queueServiceCall("responseprofile", "add", kparams, KalturaResponseProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaResponseProfile.class, resultXmlElement);
    }

	/**  Get response profile by id     */
    public KalturaResponseProfile get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("responseprofile", "get", kparams, KalturaResponseProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaResponseProfile.class, resultXmlElement);
    }

	/**  Update response profile by id     */
    public KalturaResponseProfile update(int id, KalturaResponseProfile updateResponseProfile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("updateResponseProfile", updateResponseProfile);
        this.kalturaClient.queueServiceCall("responseprofile", "update", kparams, KalturaResponseProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaResponseProfile.class, resultXmlElement);
    }

	/**  Update response profile status by id     */
    public KalturaResponseProfile updateStatus(int id, KalturaResponseProfileStatus status) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("status", status);
        this.kalturaClient.queueServiceCall("responseprofile", "updateStatus", kparams, KalturaResponseProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaResponseProfile.class, resultXmlElement);
    }

	/**  Delete response profile by id     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("responseprofile", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaResponseProfileListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaResponseProfileListResponse list(KalturaResponseProfileFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List response profiles by filter and pager     */
    public KalturaResponseProfileListResponse list(KalturaResponseProfileFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("responseprofile", "list", kparams, KalturaResponseProfileListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaResponseProfileListResponse.class, resultXmlElement);
    }

	/**  Recalculate response profile cached objects     */
    public KalturaResponseProfileCacheRecalculateResults recalculate(KalturaResponseProfileCacheRecalculateOptions options) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("options", options);
        this.kalturaClient.queueServiceCall("responseprofile", "recalculate", kparams, KalturaResponseProfileCacheRecalculateResults.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaResponseProfileCacheRecalculateResults.class, resultXmlElement);
    }

	/**  Clone an existing response profile     */
    public KalturaResponseProfile clone(int id, KalturaResponseProfile profile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("profile", profile);
        this.kalturaClient.queueServiceCall("responseprofile", "clone", kparams, KalturaResponseProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaResponseProfile.class, resultXmlElement);
    }
}
