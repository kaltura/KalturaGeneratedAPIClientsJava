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
 * @date Thu, 30 Apr 15 00:20:29 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  delivery service is used to control delivery objects    */
@SuppressWarnings("serial")
public class KalturaDeliveryProfileService extends KalturaServiceBase {
    public KalturaDeliveryProfileService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new delivery.     */
    public KalturaDeliveryProfile add(KalturaDeliveryProfile delivery) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("delivery", delivery);
        this.kalturaClient.queueServiceCall("deliveryprofile", "add", kparams, KalturaDeliveryProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDeliveryProfile.class, resultXmlElement);
    }

	/**  Update exisiting delivery     */
    public KalturaDeliveryProfile update(String id, KalturaDeliveryProfile delivery) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("delivery", delivery);
        this.kalturaClient.queueServiceCall("deliveryprofile", "update", kparams, KalturaDeliveryProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDeliveryProfile.class, resultXmlElement);
    }

	/**  Get delivery by id    */
    public KalturaDeliveryProfile get(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("deliveryprofile", "get", kparams, KalturaDeliveryProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDeliveryProfile.class, resultXmlElement);
    }

	/**  Add delivery based on existing delivery.  Must provide valid sourceDeliveryId    */
    public KalturaDeliveryProfile clone(int deliveryId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("deliveryId", deliveryId);
        this.kalturaClient.queueServiceCall("deliveryprofile", "clone", kparams, KalturaDeliveryProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDeliveryProfile.class, resultXmlElement);
    }

    public KalturaDeliveryProfileListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaDeliveryProfileListResponse list(KalturaDeliveryProfileFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  Retrieve a list of available delivery depends on the filter given    */
    public KalturaDeliveryProfileListResponse list(KalturaDeliveryProfileFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("deliveryprofile", "list", kparams, KalturaDeliveryProfileListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDeliveryProfileListResponse.class, resultXmlElement);
    }
}
