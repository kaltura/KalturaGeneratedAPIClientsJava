// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platforms allow them to do with
// text.
//
// Copyright (C) 2006-2023  Kaltura Inc.
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

import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.Sso;
import com.kaltura.client.types.SsoFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class SsoService {
	
	public static class AddSsoBuilder extends RequestBuilder<Sso, Sso.Tokenizer, AddSsoBuilder> {
		
		public AddSsoBuilder(Sso sso) {
			super(Sso.class, "sso_sso", "add");
			params.add("sso", sso);
		}
	}

	/**
	 * Adds a new sso configuration.
	 * 
	 * @param sso a new sso configuration
	 */
    public static AddSsoBuilder add(Sso sso)  {
		return new AddSsoBuilder(sso);
	}
	
	public static class DeleteSsoBuilder extends RequestBuilder<Sso, Sso.Tokenizer, DeleteSsoBuilder> {
		
		public DeleteSsoBuilder(int ssoId) {
			super(Sso.class, "sso_sso", "delete");
			params.add("ssoId", ssoId);
		}
		
		public void ssoId(String multirequestToken) {
			params.add("ssoId", multirequestToken);
		}
	}

	/**
	 * Delete sso by ID
	 * 
	 * @param ssoId The unique identifier in the sso's object
	 */
    public static DeleteSsoBuilder delete(int ssoId)  {
		return new DeleteSsoBuilder(ssoId);
	}
	
	public static class GetSsoBuilder extends RequestBuilder<Sso, Sso.Tokenizer, GetSsoBuilder> {
		
		public GetSsoBuilder(int ssoId) {
			super(Sso.class, "sso_sso", "get");
			params.add("ssoId", ssoId);
		}
		
		public void ssoId(String multirequestToken) {
			params.add("ssoId", multirequestToken);
		}
	}

	/**
	 * Retrieves sso object
	 * 
	 * @param ssoId The unique identifier in the sso's object
	 */
    public static GetSsoBuilder get(int ssoId)  {
		return new GetSsoBuilder(ssoId);
	}
	
	public static class ListSsoBuilder extends ListResponseRequestBuilder<Sso, Sso.Tokenizer, ListSsoBuilder> {
		
		public ListSsoBuilder(SsoFilter filter, FilterPager pager) {
			super(Sso.class, "sso_sso", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListSsoBuilder list()  {
		return list(null);
	}

	public static ListSsoBuilder list(SsoFilter filter)  {
		return list(filter, null);
	}

	/**
	 * Lists sso objects that are associated with an account.
	 * 
	 * @param filter 
	 * @param pager A limit for the number of records to display on a page
	 */
    public static ListSsoBuilder list(SsoFilter filter, FilterPager pager)  {
		return new ListSsoBuilder(filter, pager);
	}
	
	public static class LoginSsoBuilder extends RequestBuilder<String, String, LoginSsoBuilder> {
		
		public LoginSsoBuilder(String userId, String applicationType, int partnerId) {
			super(String.class, "sso_sso", "login");
			params.add("userId", userId);
			params.add("applicationType", applicationType);
			params.add("partnerId", partnerId);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
		
		public void applicationType(String multirequestToken) {
			params.add("applicationType", multirequestToken);
		}
		
		public void partnerId(String multirequestToken) {
			params.add("partnerId", multirequestToken);
		}
	}

	public static LoginSsoBuilder login(String userId, String applicationType)  {
		return login(userId, applicationType, Integer.MIN_VALUE);
	}

	/**
	 * Login with SSO, getting redirect url according to application type and partner
	  Id   or according to application type and domain
	 * 
	 * @param userId 
	 * @param applicationType 
	 * @param partnerId 
	 */
    public static LoginSsoBuilder login(String userId, String applicationType, int partnerId)  {
		return new LoginSsoBuilder(userId, applicationType, partnerId);
	}
	
	public static class UpdateSsoBuilder extends RequestBuilder<Sso, Sso.Tokenizer, UpdateSsoBuilder> {
		
		public UpdateSsoBuilder(int ssoId, Sso sso) {
			super(Sso.class, "sso_sso", "update");
			params.add("ssoId", ssoId);
			params.add("sso", sso);
		}
		
		public void ssoId(String multirequestToken) {
			params.add("ssoId", multirequestToken);
		}
	}

	/**
	 * Update sso by ID
	 * 
	 * @param ssoId The unique identifier in the sso's object
	 * @param sso Id The unique identifier in the sso's object
	 */
    public static UpdateSsoBuilder update(int ssoId, Sso sso)  {
		return new UpdateSsoBuilder(ssoId, sso);
	}
}
