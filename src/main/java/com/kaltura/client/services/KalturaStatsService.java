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
 * @date Sun, 04 Oct 15 01:24:24 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Stats Service    */
@SuppressWarnings("serial")
public class KalturaStatsService extends KalturaServiceBase {
    public KalturaStatsService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Will write to the event log a single line representing the event   client
	  version - will help interprete the line structure. different client versions
	  might have slightly different data/data formats in the line event_id - number is
	  the row number in yuval's excel datetime - same format as MySql's datetime - can
	  change and should reflect the time zone session id - can be some big random
	  number or guid partner id entry id unique viewer widget id ui_conf id uid - the
	  puser id as set by the ppartner current point - in milliseconds duration -
	  milliseconds user ip process duration - in milliseconds control id seek new
	  point referrer       KalturaStatsEvent $event     */
    public boolean collect(KalturaStatsEvent event) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("event", event);
        this.kalturaClient.queueServiceCall("stats", "collect", kparams);
        if (this.kalturaClient.isMultiRequest())
            return false;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseBool(resultText);
    }

	/**  Will collect the kmcEvent sent form the KMC client   // this will actually be an
	  empty function because all events will be sent using GET and will anyway be
	  logged in the apache log     */
    public void kmcCollect(KalturaStatsKmcEvent kmcEvent) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("kmcEvent", kmcEvent);
        this.kalturaClient.queueServiceCall("stats", "kmcCollect", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaCEError reportKceError(KalturaCEError kalturaCEError) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("kalturaCEError", kalturaCEError);
        this.kalturaClient.queueServiceCall("stats", "reportKceError", kparams, KalturaCEError.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCEError.class, resultXmlElement);
    }

	/**  Use this action to report errors to the kaltura server.     */
    public void reportError(String errorCode, String errorMessage) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("errorCode", errorCode);
        kparams.add("errorMessage", errorMessage);
        this.kalturaClient.queueServiceCall("stats", "reportError", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }
}
