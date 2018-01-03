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
import com.kaltura.client.enums.*;
import org.w3c.dom.Element;
import com.kaltura.client.utils.ParseUtils;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Sending beacons on objects  */
@SuppressWarnings("serial")
public class KalturaBeaconService extends KalturaServiceBase {
    public KalturaBeaconService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public boolean add(KalturaBeacon beacon) throws KalturaApiException {
        return this.add(beacon, KalturaNullableBoolean.get(0));
    }

    public boolean add(KalturaBeacon beacon, KalturaNullableBoolean shouldLog) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("beacon", beacon);
        kparams.add("shouldLog", shouldLog);
        this.kalturaClient.queueServiceCall("beacon_beacon", "add", kparams);
        if (this.kalturaClient.isMultiRequest())
            return false;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseBool(resultText);
    }

    public KalturaBeaconListResponse enhanceSearch() throws KalturaApiException {
        return this.enhanceSearch(null);
    }

    public KalturaBeaconListResponse enhanceSearch(KalturaBeaconEnhanceFilter filter) throws KalturaApiException {
        return this.enhanceSearch(filter, null);
    }

    public KalturaBeaconListResponse enhanceSearch(KalturaBeaconEnhanceFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("beacon_beacon", "enhanceSearch", kparams, KalturaBeaconListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaBeaconListResponse.class, resultXmlElement);
    }

    public KalturaBeaconListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaBeaconListResponse list(KalturaBeaconFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

    public KalturaBeaconListResponse list(KalturaBeaconFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("beacon_beacon", "list", kparams, KalturaBeaconListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaBeaconListResponse.class, resultXmlElement);
    }
}
