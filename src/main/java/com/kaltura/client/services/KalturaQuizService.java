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
 * @date Thu, 13 Aug 15 01:52:47 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Allows user to handle quizzes    */
@SuppressWarnings("serial")
public class KalturaQuizService extends KalturaServiceBase {
    public KalturaQuizService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Allows to add a quiz to an entry     */
    public KalturaQuiz add(String entryId, KalturaQuiz quiz) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("quiz", quiz);
        this.kalturaClient.queueServiceCall("quiz_quiz", "add", kparams, KalturaQuiz.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaQuiz.class, resultXmlElement);
    }

	/**  Allows to update a quiz     */
    public KalturaQuiz update(String entryId, KalturaQuiz quiz) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("quiz", quiz);
        this.kalturaClient.queueServiceCall("quiz_quiz", "update", kparams, KalturaQuiz.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaQuiz.class, resultXmlElement);
    }

	/**  Allows to get a quiz     */
    public KalturaQuiz get(String entryId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        this.kalturaClient.queueServiceCall("quiz_quiz", "get", kparams, KalturaQuiz.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaQuiz.class, resultXmlElement);
    }

    public KalturaQuizListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaQuizListResponse list(KalturaQuizFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List quiz objects by filter and pager     */
    public KalturaQuizListResponse list(KalturaQuizFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("quiz_quiz", "list", kparams, KalturaQuizListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaQuizListResponse.class, resultXmlElement);
    }
}
