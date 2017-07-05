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

import com.kaltura.client.Params;
import com.kaltura.client.enums.SessionType;
import com.kaltura.client.types.SessionInfo;
import com.kaltura.client.types.StartWidgetSessionResponse;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Session service  */
public class SessionService {

	/**  End a session with the Kaltura server, making the current KS invalid.  */
    public static RequestBuilder<Void> end()  {
        Params kparams = new Params();

        return new NullRequestBuilder("session", "end", kparams);
    }

    public static RequestBuilder<SessionInfo> get()  {
        return get(null);
    }

	/**  Parse session key and return its info  */
    public static RequestBuilder<SessionInfo> get(String session)  {
        Params kparams = new Params();
        kparams.add("session", session);

        return new RequestBuilder<SessionInfo>(SessionInfo.class, "session", "get", kparams);
    }

    public static RequestBuilder<String> impersonate(String secret, int impersonatedPartnerId)  {
        return impersonate(secret, impersonatedPartnerId, "");
    }

    public static RequestBuilder<String> impersonate(String secret, int impersonatedPartnerId, String userId)  {
        return impersonate(secret, impersonatedPartnerId, userId, SessionType.get(0));
    }

    public static RequestBuilder<String> impersonate(String secret, int impersonatedPartnerId, String userId, SessionType type)  {
        return impersonate(secret, impersonatedPartnerId, userId, type, Integer.MIN_VALUE);
    }

    public static RequestBuilder<String> impersonate(String secret, int impersonatedPartnerId, String userId, SessionType type, int partnerId)  {
        return impersonate(secret, impersonatedPartnerId, userId, type, partnerId, 86400);
    }

    public static RequestBuilder<String> impersonate(String secret, int impersonatedPartnerId, String userId, SessionType type, int partnerId, int expiry)  {
        return impersonate(secret, impersonatedPartnerId, userId, type, partnerId, expiry, null);
    }

	/**  Start an impersonated session with Kaltura's server.   The result KS is the
	  session key that you should pass to all services that requires a ticket.  */
    public static RequestBuilder<String> impersonate(String secret, int impersonatedPartnerId, String userId, SessionType type, int partnerId, int expiry, String privileges)  {
        Params kparams = new Params();
        kparams.add("secret", secret);
        kparams.add("impersonatedPartnerId", impersonatedPartnerId);
        kparams.add("userId", userId);
        kparams.add("type", type);
        kparams.add("partnerId", partnerId);
        kparams.add("expiry", expiry);
        kparams.add("privileges", privileges);

        return new RequestBuilder<String>(String.class, "session", "impersonate", kparams);
    }

    public static RequestBuilder<SessionInfo> impersonateByKs(String session)  {
        return impersonateByKs(session, SessionType.get(Integer.MIN_VALUE));
    }

    public static RequestBuilder<SessionInfo> impersonateByKs(String session, SessionType type)  {
        return impersonateByKs(session, type, Integer.MIN_VALUE);
    }

    public static RequestBuilder<SessionInfo> impersonateByKs(String session, SessionType type, int expiry)  {
        return impersonateByKs(session, type, expiry, null);
    }

	/**  Start an impersonated session with Kaltura's server.   The result KS info
	  contains the session key that you should pass to all services that requires a
	  ticket.   Type, expiry and privileges won't be changed if they're not set  */
    public static RequestBuilder<SessionInfo> impersonateByKs(String session, SessionType type, int expiry, String privileges)  {
        Params kparams = new Params();
        kparams.add("session", session);
        kparams.add("type", type);
        kparams.add("expiry", expiry);
        kparams.add("privileges", privileges);

        return new RequestBuilder<SessionInfo>(SessionInfo.class, "session", "impersonateByKs", kparams);
    }

    public static RequestBuilder<String> start(String secret)  {
        return start(secret, "");
    }

    public static RequestBuilder<String> start(String secret, String userId)  {
        return start(secret, userId, SessionType.get(0));
    }

    public static RequestBuilder<String> start(String secret, String userId, SessionType type)  {
        return start(secret, userId, type, Integer.MIN_VALUE);
    }

    public static RequestBuilder<String> start(String secret, String userId, SessionType type, int partnerId)  {
        return start(secret, userId, type, partnerId, 86400);
    }

    public static RequestBuilder<String> start(String secret, String userId, SessionType type, int partnerId, int expiry)  {
        return start(secret, userId, type, partnerId, expiry, null);
    }

	/**  Start a session with Kaltura's server.   The result KS is the session key that
	  you should pass to all services that requires a ticket.  */
    public static RequestBuilder<String> start(String secret, String userId, SessionType type, int partnerId, int expiry, String privileges)  {
        Params kparams = new Params();
        kparams.add("secret", secret);
        kparams.add("userId", userId);
        kparams.add("type", type);
        kparams.add("partnerId", partnerId);
        kparams.add("expiry", expiry);
        kparams.add("privileges", privileges);

        return new RequestBuilder<String>(String.class, "session", "start", kparams);
    }

    public static RequestBuilder<StartWidgetSessionResponse> startWidgetSession(String widgetId)  {
        return startWidgetSession(widgetId, 86400);
    }

	/**  Start a session for Kaltura's flash widgets  */
    public static RequestBuilder<StartWidgetSessionResponse> startWidgetSession(String widgetId, int expiry)  {
        Params kparams = new Params();
        kparams.add("widgetId", widgetId);
        kparams.add("expiry", expiry);

        return new RequestBuilder<StartWidgetSessionResponse>(StartWidgetSessionResponse.class, "session", "startWidgetSession", kparams);
    }
}
