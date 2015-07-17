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
 * @date Fri, 17 Jul 15 08:34:46 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  EmailIngestionProfile service lets you manage email ingestion profile records    */
@SuppressWarnings("serial")
public class KalturaEmailIngestionProfileService extends KalturaServiceBase {
    public KalturaEmailIngestionProfileService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  EmailIngestionProfile Add action allows you to add a EmailIngestionProfile to
	  Kaltura DB     */
    public KalturaEmailIngestionProfile add(KalturaEmailIngestionProfile EmailIP) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("EmailIP", EmailIP);
        this.kalturaClient.queueServiceCall("emailingestionprofile", "add", kparams, KalturaEmailIngestionProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEmailIngestionProfile.class, resultXmlElement);
    }

	/**  Retrieve a EmailIngestionProfile by email address     */
    public KalturaEmailIngestionProfile getByEmailAddress(String emailAddress) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("emailAddress", emailAddress);
        this.kalturaClient.queueServiceCall("emailingestionprofile", "getByEmailAddress", kparams, KalturaEmailIngestionProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEmailIngestionProfile.class, resultXmlElement);
    }

	/**  Retrieve a EmailIngestionProfile by id     */
    public KalturaEmailIngestionProfile get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("emailingestionprofile", "get", kparams, KalturaEmailIngestionProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEmailIngestionProfile.class, resultXmlElement);
    }

	/**  Update an existing EmailIngestionProfile     */
    public KalturaEmailIngestionProfile update(int id, KalturaEmailIngestionProfile EmailIP) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("EmailIP", EmailIP);
        this.kalturaClient.queueServiceCall("emailingestionprofile", "update", kparams, KalturaEmailIngestionProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEmailIngestionProfile.class, resultXmlElement);
    }

	/**  Delete an existing EmailIngestionProfile     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("emailingestionprofile", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

	/**  add KalturaMediaEntry from email ingestion     */
    public KalturaMediaEntry addMediaEntry(KalturaMediaEntry mediaEntry, String uploadTokenId, int emailProfId, String fromAddress, String emailMsgId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("mediaEntry", mediaEntry);
        kparams.add("uploadTokenId", uploadTokenId);
        kparams.add("emailProfId", emailProfId);
        kparams.add("fromAddress", fromAddress);
        kparams.add("emailMsgId", emailMsgId);
        this.kalturaClient.queueServiceCall("emailingestionprofile", "addMediaEntry", kparams, KalturaMediaEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaMediaEntry.class, resultXmlElement);
    }
}
