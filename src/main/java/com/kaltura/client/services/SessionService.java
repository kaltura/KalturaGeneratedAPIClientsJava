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

import com.kaltura.client.enums.SessionType;
import com.kaltura.client.types.SessionInfo;
import com.kaltura.client.types.StartWidgetSessionResponse;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Session service  */
public class SessionService {
	
	public static class EndSessionBuilder extends NullRequestBuilder {
		
		public EndSessionBuilder() {
			super("session", "end");
		}
	}

	/**  End a session with the Kaltura server, making the current KS invalid.  */
    public static EndSessionBuilder end()  {
		return new EndSessionBuilder();
	}
	
	public static class GetSessionBuilder extends RequestBuilder<SessionInfo, SessionInfo.Tokenizer, GetSessionBuilder> {
		
		public GetSessionBuilder(String session) {
			super(SessionInfo.class, "session", "get");
			params.add("session", session);
		}
		
		public void session(String multirequestToken) {
			params.add("session", multirequestToken);
		}
	}

	public static GetSessionBuilder get()  {
		return get(null);
	}

	/**  Parse session key and return its info  */
    public static GetSessionBuilder get(String session)  {
		return new GetSessionBuilder(session);
	}
	
	public static class ImpersonateSessionBuilder extends RequestBuilder<String, String, ImpersonateSessionBuilder> {
		
		public ImpersonateSessionBuilder(String secret, int impersonatedPartnerId, String userId, SessionType type, int partnerId, int expiry, String privileges) {
			super(String.class, "session", "impersonate");
			params.add("secret", secret);
			params.add("impersonatedPartnerId", impersonatedPartnerId);
			params.add("userId", userId);
			params.add("type", type);
			params.add("partnerId", partnerId);
			params.add("expiry", expiry);
			params.add("privileges", privileges);
		}
		
		public void secret(String multirequestToken) {
			params.add("secret", multirequestToken);
		}
		
		public void impersonatedPartnerId(String multirequestToken) {
			params.add("impersonatedPartnerId", multirequestToken);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
		
		public void type(String multirequestToken) {
			params.add("type", multirequestToken);
		}
		
		public void partnerId(String multirequestToken) {
			params.add("partnerId", multirequestToken);
		}
		
		public void expiry(String multirequestToken) {
			params.add("expiry", multirequestToken);
		}
		
		public void privileges(String multirequestToken) {
			params.add("privileges", multirequestToken);
		}
	}

	public static ImpersonateSessionBuilder impersonate(String secret, int impersonatedPartnerId)  {
		return impersonate(secret, impersonatedPartnerId, "");
	}

	public static ImpersonateSessionBuilder impersonate(String secret, int impersonatedPartnerId, String userId)  {
		return impersonate(secret, impersonatedPartnerId, userId, SessionType.get(0));
	}

	public static ImpersonateSessionBuilder impersonate(String secret, int impersonatedPartnerId, String userId, SessionType type)  {
		return impersonate(secret, impersonatedPartnerId, userId, type, Integer.MIN_VALUE);
	}

	public static ImpersonateSessionBuilder impersonate(String secret, int impersonatedPartnerId, String userId, SessionType type, int partnerId)  {
		return impersonate(secret, impersonatedPartnerId, userId, type, partnerId, 86400);
	}

	public static ImpersonateSessionBuilder impersonate(String secret, int impersonatedPartnerId, String userId, SessionType type, int partnerId, int expiry)  {
		return impersonate(secret, impersonatedPartnerId, userId, type, partnerId, expiry, null);
	}

	/**  Start an impersonated session with Kaltura's server.   The result KS is the
	  session key that you should pass to all services that requires a ticket.  */
    public static ImpersonateSessionBuilder impersonate(String secret, int impersonatedPartnerId, String userId, SessionType type, int partnerId, int expiry, String privileges)  {
		return new ImpersonateSessionBuilder(secret, impersonatedPartnerId, userId, type, partnerId, expiry, privileges);
	}
	
	public static class ImpersonateByKsSessionBuilder extends RequestBuilder<SessionInfo, SessionInfo.Tokenizer, ImpersonateByKsSessionBuilder> {
		
		public ImpersonateByKsSessionBuilder(String session, SessionType type, int expiry, String privileges) {
			super(SessionInfo.class, "session", "impersonateByKs");
			params.add("session", session);
			params.add("type", type);
			params.add("expiry", expiry);
			params.add("privileges", privileges);
		}
		
		public void session(String multirequestToken) {
			params.add("session", multirequestToken);
		}
		
		public void type(String multirequestToken) {
			params.add("type", multirequestToken);
		}
		
		public void expiry(String multirequestToken) {
			params.add("expiry", multirequestToken);
		}
		
		public void privileges(String multirequestToken) {
			params.add("privileges", multirequestToken);
		}
	}

	public static ImpersonateByKsSessionBuilder impersonateByKs(String session)  {
		return impersonateByKs(session, SessionType.get(Integer.MIN_VALUE));
	}

	public static ImpersonateByKsSessionBuilder impersonateByKs(String session, SessionType type)  {
		return impersonateByKs(session, type, Integer.MIN_VALUE);
	}

	public static ImpersonateByKsSessionBuilder impersonateByKs(String session, SessionType type, int expiry)  {
		return impersonateByKs(session, type, expiry, null);
	}

	/**  Start an impersonated session with Kaltura's server.   The result KS info
	  contains the session key that you should pass to all services that requires a
	  ticket.   Type, expiry and privileges won't be changed if they're not set  */
    public static ImpersonateByKsSessionBuilder impersonateByKs(String session, SessionType type, int expiry, String privileges)  {
		return new ImpersonateByKsSessionBuilder(session, type, expiry, privileges);
	}
	
	public static class StartSessionBuilder extends RequestBuilder<String, String, StartSessionBuilder> {
		
		public StartSessionBuilder(String secret, String userId, SessionType type, int partnerId, int expiry, String privileges) {
			super(String.class, "session", "start");
			params.add("secret", secret);
			params.add("userId", userId);
			params.add("type", type);
			params.add("partnerId", partnerId);
			params.add("expiry", expiry);
			params.add("privileges", privileges);
		}
		
		public void secret(String multirequestToken) {
			params.add("secret", multirequestToken);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
		
		public void type(String multirequestToken) {
			params.add("type", multirequestToken);
		}
		
		public void partnerId(String multirequestToken) {
			params.add("partnerId", multirequestToken);
		}
		
		public void expiry(String multirequestToken) {
			params.add("expiry", multirequestToken);
		}
		
		public void privileges(String multirequestToken) {
			params.add("privileges", multirequestToken);
		}
	}

	public static StartSessionBuilder start(String secret)  {
		return start(secret, "");
	}

	public static StartSessionBuilder start(String secret, String userId)  {
		return start(secret, userId, SessionType.get(0));
	}

	public static StartSessionBuilder start(String secret, String userId, SessionType type)  {
		return start(secret, userId, type, Integer.MIN_VALUE);
	}

	public static StartSessionBuilder start(String secret, String userId, SessionType type, int partnerId)  {
		return start(secret, userId, type, partnerId, 86400);
	}

	public static StartSessionBuilder start(String secret, String userId, SessionType type, int partnerId, int expiry)  {
		return start(secret, userId, type, partnerId, expiry, null);
	}

	/**  Start a session with Kaltura's server.   The result KS is the session key that
	  you should pass to all services that requires a ticket.  */
    public static StartSessionBuilder start(String secret, String userId, SessionType type, int partnerId, int expiry, String privileges)  {
		return new StartSessionBuilder(secret, userId, type, partnerId, expiry, privileges);
	}
	
	public static class StartWidgetSessionSessionBuilder extends RequestBuilder<StartWidgetSessionResponse, StartWidgetSessionResponse.Tokenizer, StartWidgetSessionSessionBuilder> {
		
		public StartWidgetSessionSessionBuilder(String widgetId, int expiry) {
			super(StartWidgetSessionResponse.class, "session", "startWidgetSession");
			params.add("widgetId", widgetId);
			params.add("expiry", expiry);
		}
		
		public void widgetId(String multirequestToken) {
			params.add("widgetId", multirequestToken);
		}
		
		public void expiry(String multirequestToken) {
			params.add("expiry", multirequestToken);
		}
	}

	public static StartWidgetSessionSessionBuilder startWidgetSession(String widgetId)  {
		return startWidgetSession(widgetId, 86400);
	}

	/**  Start a session for Kaltura's flash widgets  */
    public static StartWidgetSessionSessionBuilder startWidgetSession(String widgetId, int expiry)  {
		return new StartWidgetSessionSessionBuilder(widgetId, expiry);
	}
}
