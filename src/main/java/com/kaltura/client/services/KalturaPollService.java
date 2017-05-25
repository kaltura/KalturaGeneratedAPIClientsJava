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
import org.w3c.dom.Element;
import com.kaltura.client.utils.ParseUtils;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Poll service  The poll service works against the cache entirely no DB instance
  should be used here  */
@SuppressWarnings("serial")
public class KalturaPollService extends KalturaServiceBase {
    public KalturaPollService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public String add() throws KalturaApiException {
        return this.add("SINGLE_ANONYMOUS");
    }

	/**  Add Action  */
    public String add(String pollType) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("pollType", pollType);
        this.kalturaClient.queueServiceCall("poll_poll", "add", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public String getVotes(String pollId, String answerIds) throws KalturaApiException {
        return this.getVotes(pollId, answerIds, null);
    }

	/**  Get Votes Action  */
    public String getVotes(String pollId, String answerIds, String otherDCVotes) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("pollId", pollId);
        kparams.add("answerIds", answerIds);
        kparams.add("otherDCVotes", otherDCVotes);
        this.kalturaClient.queueServiceCall("poll_poll", "getVotes", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

	/**  Vote Action  */
    public String vote(String pollId, String userId, String answerIds) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("pollId", pollId);
        kparams.add("userId", userId);
        kparams.add("answerIds", answerIds);
        this.kalturaClient.queueServiceCall("poll_poll", "vote", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }
}
