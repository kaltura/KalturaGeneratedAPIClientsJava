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
 * @date Thu, 09 Jul 15 10:16:21 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Storage Profiles service    */
@SuppressWarnings("serial")
public class KalturaStorageProfileService extends KalturaServiceBase {
    public KalturaStorageProfileService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Adds a storage profile to the Kaltura DB.     */
    public KalturaStorageProfile add(KalturaStorageProfile storageProfile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("storageProfile", storageProfile);
        this.kalturaClient.queueServiceCall("storageprofile", "add", kparams, KalturaStorageProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaStorageProfile.class, resultXmlElement);
    }

    public void updateStatus(int storageId, KalturaStorageProfileStatus status) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("storageId", storageId);
        kparams.add("status", status);
        this.kalturaClient.queueServiceCall("storageprofile", "updateStatus", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

	/**  Get storage profile by id     */
    public KalturaStorageProfile get(int storageProfileId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("storageProfileId", storageProfileId);
        this.kalturaClient.queueServiceCall("storageprofile", "get", kparams, KalturaStorageProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaStorageProfile.class, resultXmlElement);
    }

	/**  Update storage profile by id      */
    public KalturaStorageProfile update(int storageProfileId, KalturaStorageProfile storageProfile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("storageProfileId", storageProfileId);
        kparams.add("storageProfile", storageProfile);
        this.kalturaClient.queueServiceCall("storageprofile", "update", kparams, KalturaStorageProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaStorageProfile.class, resultXmlElement);
    }

    public KalturaStorageProfileListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaStorageProfileListResponse list(KalturaStorageProfileFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

    public KalturaStorageProfileListResponse list(KalturaStorageProfileFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("storageprofile", "list", kparams, KalturaStorageProfileListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaStorageProfileListResponse.class, resultXmlElement);
    }
}
