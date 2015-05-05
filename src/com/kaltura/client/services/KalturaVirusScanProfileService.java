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
 * @date Tue, 05 May 15 00:19:59 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Virus scan profile service    */
@SuppressWarnings("serial")
public class KalturaVirusScanProfileService extends KalturaServiceBase {
    public KalturaVirusScanProfileService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public KalturaVirusScanProfileListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaVirusScanProfileListResponse list(KalturaVirusScanProfileFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List virus scan profile objects by filter and pager     */
    public KalturaVirusScanProfileListResponse list(KalturaVirusScanProfileFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("virusscan_virusscanprofile", "list", kparams, KalturaVirusScanProfileListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaVirusScanProfileListResponse.class, resultXmlElement);
    }

	/**  Allows you to add an virus scan profile object and virus scan profile content
	  associated with Kaltura object     */
    public KalturaVirusScanProfile add(KalturaVirusScanProfile virusScanProfile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("virusScanProfile", virusScanProfile);
        this.kalturaClient.queueServiceCall("virusscan_virusscanprofile", "add", kparams, KalturaVirusScanProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaVirusScanProfile.class, resultXmlElement);
    }

	/**  Retrieve an virus scan profile object by id     */
    public KalturaVirusScanProfile get(int virusScanProfileId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("virusScanProfileId", virusScanProfileId);
        this.kalturaClient.queueServiceCall("virusscan_virusscanprofile", "get", kparams, KalturaVirusScanProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaVirusScanProfile.class, resultXmlElement);
    }

	/**  Update exisitng virus scan profile, it is possible to update the virus scan
	  profile id too     */
    public KalturaVirusScanProfile update(int virusScanProfileId, KalturaVirusScanProfile virusScanProfile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("virusScanProfileId", virusScanProfileId);
        kparams.add("virusScanProfile", virusScanProfile);
        this.kalturaClient.queueServiceCall("virusscan_virusscanprofile", "update", kparams, KalturaVirusScanProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaVirusScanProfile.class, resultXmlElement);
    }

	/**  Mark the virus scan profile as deleted     */
    public KalturaVirusScanProfile delete(int virusScanProfileId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("virusScanProfileId", virusScanProfileId);
        this.kalturaClient.queueServiceCall("virusscan_virusscanprofile", "delete", kparams, KalturaVirusScanProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaVirusScanProfile.class, resultXmlElement);
    }

    public int scan(String flavorAssetId) throws KalturaApiException {
        return this.scan(flavorAssetId, Integer.MIN_VALUE);
    }

	/**  Scan flavor asset according to virus scan profile     */
    public int scan(String flavorAssetId, int virusScanProfileId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("flavorAssetId", flavorAssetId);
        kparams.add("virusScanProfileId", virusScanProfileId);
        this.kalturaClient.queueServiceCall("virusscan_virusscanprofile", "scan", kparams);
        if (this.kalturaClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }
}
