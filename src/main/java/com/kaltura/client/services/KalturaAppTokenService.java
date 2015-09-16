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
 * @date Wed, 16 Sep 15 01:39:39 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Manage application authentication tokens    */
@SuppressWarnings("serial")
public class KalturaAppTokenService extends KalturaServiceBase {
    public KalturaAppTokenService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new application authentication token     */
    public KalturaAppToken add(KalturaAppToken appToken) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("appToken", appToken);
        this.kalturaClient.queueServiceCall("apptoken", "add", kparams, KalturaAppToken.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAppToken.class, resultXmlElement);
    }

	/**  Get application authentication token by id     */
    public KalturaAppToken get(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("apptoken", "get", kparams, KalturaAppToken.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAppToken.class, resultXmlElement);
    }

	/**  Update application authentication token by id     */
    public KalturaAppToken update(String id, KalturaAppToken appToken) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("appToken", appToken);
        this.kalturaClient.queueServiceCall("apptoken", "update", kparams, KalturaAppToken.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAppToken.class, resultXmlElement);
    }

	/**  Delete application authentication token by id     */
    public void delete(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("apptoken", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaAppTokenListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaAppTokenListResponse list(KalturaAppTokenFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List application authentication tokens by filter and pager     */
    public KalturaAppTokenListResponse list(KalturaAppTokenFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("apptoken", "list", kparams, KalturaAppTokenListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAppTokenListResponse.class, resultXmlElement);
    }

    public KalturaSessionInfo startSession(String id, String tokenHash) throws KalturaApiException {
        return this.startSession(id, tokenHash, null);
    }

    public KalturaSessionInfo startSession(String id, String tokenHash, String userId) throws KalturaApiException {
        return this.startSession(id, tokenHash, userId, KalturaSessionType.get(Integer.MIN_VALUE));
    }

    public KalturaSessionInfo startSession(String id, String tokenHash, String userId, KalturaSessionType type) throws KalturaApiException {
        return this.startSession(id, tokenHash, userId, type, Integer.MIN_VALUE);
    }

	/**  Starts a new KS (kaltura Session) based on application authentication token id  
	    */
    public KalturaSessionInfo startSession(String id, String tokenHash, String userId, KalturaSessionType type, int expiry) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("tokenHash", tokenHash);
        kparams.add("userId", userId);
        kparams.add("type", type);
        kparams.add("expiry", expiry);
        this.kalturaClient.queueServiceCall("apptoken", "startSession", kparams, KalturaSessionInfo.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaSessionInfo.class, resultXmlElement);
    }
}
