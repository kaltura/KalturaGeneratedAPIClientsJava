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
import com.kaltura.client.enums.*;
import org.w3c.dom.Element;
import com.kaltura.client.utils.ParseUtils;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import com.kaltura.client.types.*;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Sat, 15 Aug 15 02:41:30 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Session service    */
@SuppressWarnings("serial")
public class KalturaSessionService extends KalturaServiceBase {
    public KalturaSessionService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public String start(String secret) throws KalturaApiException {
        return this.start(secret, "");
    }

    public String start(String secret, String userId) throws KalturaApiException {
        return this.start(secret, userId, KalturaSessionType.get(0));
    }

    public String start(String secret, String userId, KalturaSessionType type) throws KalturaApiException {
        return this.start(secret, userId, type, Integer.MIN_VALUE);
    }

    public String start(String secret, String userId, KalturaSessionType type, int partnerId) throws KalturaApiException {
        return this.start(secret, userId, type, partnerId, 86400);
    }

    public String start(String secret, String userId, KalturaSessionType type, int partnerId, int expiry) throws KalturaApiException {
        return this.start(secret, userId, type, partnerId, expiry, null);
    }

	/**  Start a session with Kaltura's server.   The result KS is the session key that
	  you should pass to all services that requires a ticket.     */
    public String start(String secret, String userId, KalturaSessionType type, int partnerId, int expiry, String privileges) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("secret", secret);
        kparams.add("userId", userId);
        kparams.add("type", type);
        kparams.add("partnerId", partnerId);
        kparams.add("expiry", expiry);
        kparams.add("privileges", privileges);
        this.kalturaClient.queueServiceCall("session", "start", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

	/**  End a session with the Kaltura server, making the current KS invalid.     */
    public void end() throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        this.kalturaClient.queueServiceCall("session", "end", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public String impersonate(String secret, int impersonatedPartnerId) throws KalturaApiException {
        return this.impersonate(secret, impersonatedPartnerId, "");
    }

    public String impersonate(String secret, int impersonatedPartnerId, String userId) throws KalturaApiException {
        return this.impersonate(secret, impersonatedPartnerId, userId, KalturaSessionType.get(0));
    }

    public String impersonate(String secret, int impersonatedPartnerId, String userId, KalturaSessionType type) throws KalturaApiException {
        return this.impersonate(secret, impersonatedPartnerId, userId, type, Integer.MIN_VALUE);
    }

    public String impersonate(String secret, int impersonatedPartnerId, String userId, KalturaSessionType type, int partnerId) throws KalturaApiException {
        return this.impersonate(secret, impersonatedPartnerId, userId, type, partnerId, 86400);
    }

    public String impersonate(String secret, int impersonatedPartnerId, String userId, KalturaSessionType type, int partnerId, int expiry) throws KalturaApiException {
        return this.impersonate(secret, impersonatedPartnerId, userId, type, partnerId, expiry, null);
    }

	/**  Start an impersonated session with Kaltura's server.   The result KS is the
	  session key that you should pass to all services that requires a ticket.     */
    public String impersonate(String secret, int impersonatedPartnerId, String userId, KalturaSessionType type, int partnerId, int expiry, String privileges) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("secret", secret);
        kparams.add("impersonatedPartnerId", impersonatedPartnerId);
        kparams.add("userId", userId);
        kparams.add("type", type);
        kparams.add("partnerId", partnerId);
        kparams.add("expiry", expiry);
        kparams.add("privileges", privileges);
        this.kalturaClient.queueServiceCall("session", "impersonate", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public KalturaSessionInfo impersonateByKs(String session) throws KalturaApiException {
        return this.impersonateByKs(session, KalturaSessionType.get(Integer.MIN_VALUE));
    }

    public KalturaSessionInfo impersonateByKs(String session, KalturaSessionType type) throws KalturaApiException {
        return this.impersonateByKs(session, type, Integer.MIN_VALUE);
    }

    public KalturaSessionInfo impersonateByKs(String session, KalturaSessionType type, int expiry) throws KalturaApiException {
        return this.impersonateByKs(session, type, expiry, null);
    }

	/**  Start an impersonated session with Kaltura's server.   The result KS info
	  contains the session key that you should pass to all services that requires a
	  ticket.   Type, expiry and privileges won't be changed if they're not set     */
    public KalturaSessionInfo impersonateByKs(String session, KalturaSessionType type, int expiry, String privileges) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("session", session);
        kparams.add("type", type);
        kparams.add("expiry", expiry);
        kparams.add("privileges", privileges);
        this.kalturaClient.queueServiceCall("session", "impersonateByKs", kparams, KalturaSessionInfo.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaSessionInfo.class, resultXmlElement);
    }

    public KalturaSessionInfo get() throws KalturaApiException {
        return this.get(null);
    }

	/**  Parse session key and return its info     */
    public KalturaSessionInfo get(String session) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("session", session);
        this.kalturaClient.queueServiceCall("session", "get", kparams, KalturaSessionInfo.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaSessionInfo.class, resultXmlElement);
    }

    public KalturaStartWidgetSessionResponse startWidgetSession(String widgetId) throws KalturaApiException {
        return this.startWidgetSession(widgetId, 86400);
    }

	/**  Start a session for Kaltura's flash widgets     */
    public KalturaStartWidgetSessionResponse startWidgetSession(String widgetId, int expiry) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("widgetId", widgetId);
        kparams.add("expiry", expiry);
        this.kalturaClient.queueServiceCall("session", "startWidgetSession", kparams, KalturaStartWidgetSessionResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaStartWidgetSessionResponse.class, resultXmlElement);
    }
}
