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
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaPlayReadyDrmService extends KalturaServiceBase {
    public KalturaPlayReadyDrmService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Generate key id and content key for PlayReady encryption     */
    public KalturaPlayReadyContentKey generateKey() throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        this.kalturaClient.queueServiceCall("playready_playreadydrm", "generateKey", kparams, KalturaPlayReadyContentKey.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPlayReadyContentKey.class, resultXmlElement);
    }

	/**  Get content keys for input key ids     */
    public List<KalturaPlayReadyContentKey> getContentKeys(String keyIds) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("keyIds", keyIds);
        this.kalturaClient.queueServiceCall("playready_playreadydrm", "getContentKeys", kparams, KalturaPlayReadyContentKey.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaPlayReadyContentKey.class, resultXmlElement);
    }

    public KalturaPlayReadyContentKey getEntryContentKey(String entryId) throws KalturaApiException {
        return this.getEntryContentKey(entryId, false);
    }

	/**  Get content key and key id for the given entry     */
    public KalturaPlayReadyContentKey getEntryContentKey(String entryId, boolean createIfMissing) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("createIfMissing", createIfMissing);
        this.kalturaClient.queueServiceCall("playready_playreadydrm", "getEntryContentKey", kparams, KalturaPlayReadyContentKey.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPlayReadyContentKey.class, resultXmlElement);
    }

    public KalturaPlayReadyLicenseDetails getLicenseDetails(String keyId, String deviceId, int deviceType) throws KalturaApiException {
        return this.getLicenseDetails(keyId, deviceId, deviceType, null);
    }

    public KalturaPlayReadyLicenseDetails getLicenseDetails(String keyId, String deviceId, int deviceType, String entryId) throws KalturaApiException {
        return this.getLicenseDetails(keyId, deviceId, deviceType, entryId, null);
    }

	/**  Get Play Ready policy and dates for license creation     */
    public KalturaPlayReadyLicenseDetails getLicenseDetails(String keyId, String deviceId, int deviceType, String entryId, String referrer) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("keyId", keyId);
        kparams.add("deviceId", deviceId);
        kparams.add("deviceType", deviceType);
        kparams.add("entryId", entryId);
        kparams.add("referrer", referrer);
        this.kalturaClient.queueServiceCall("playready_playreadydrm", "getLicenseDetails", kparams, KalturaPlayReadyLicenseDetails.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPlayReadyLicenseDetails.class, resultXmlElement);
    }
}
