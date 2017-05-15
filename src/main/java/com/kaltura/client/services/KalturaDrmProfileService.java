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
// Copyright (C) 2006-2017  Kaltura Inc.
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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaDrmProfileService extends KalturaServiceBase {
    public KalturaDrmProfileService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Allows you to add a new DrmProfile object  */
    public KalturaDrmProfile add(KalturaDrmProfile drmProfile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("drmProfile", drmProfile);
        this.kalturaClient.queueServiceCall("drm_drmprofile", "add", kparams, KalturaDrmProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDrmProfile.class, resultXmlElement);
    }

	/**  Mark the KalturaDrmProfile object as deleted  */
    public KalturaDrmProfile delete(int drmProfileId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("drmProfileId", drmProfileId);
        this.kalturaClient.queueServiceCall("drm_drmprofile", "delete", kparams, KalturaDrmProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDrmProfile.class, resultXmlElement);
    }

	/**  Retrieve a KalturaDrmProfile object by ID  */
    public KalturaDrmProfile get(int drmProfileId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("drmProfileId", drmProfileId);
        this.kalturaClient.queueServiceCall("drm_drmprofile", "get", kparams, KalturaDrmProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDrmProfile.class, resultXmlElement);
    }

	/**  Retrieve a KalturaDrmProfile object by provider, if no specific profile defined
	  return default profile  */
    public KalturaDrmProfile getByProvider(KalturaDrmProviderType provider) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("provider", provider);
        this.kalturaClient.queueServiceCall("drm_drmprofile", "getByProvider", kparams, KalturaDrmProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDrmProfile.class, resultXmlElement);
    }

    public KalturaDrmProfileListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaDrmProfileListResponse list(KalturaDrmProfileFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List KalturaDrmProfile objects  */
    public KalturaDrmProfileListResponse list(KalturaDrmProfileFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("drm_drmprofile", "list", kparams, KalturaDrmProfileListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDrmProfileListResponse.class, resultXmlElement);
    }

	/**  Update an existing KalturaDrmProfile object  */
    public KalturaDrmProfile update(int drmProfileId, KalturaDrmProfile drmProfile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("drmProfileId", drmProfileId);
        kparams.add("drmProfile", drmProfile);
        this.kalturaClient.queueServiceCall("drm_drmprofile", "update", kparams, KalturaDrmProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDrmProfile.class, resultXmlElement);
    }
}
