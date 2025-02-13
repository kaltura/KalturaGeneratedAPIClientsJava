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
import com.kaltura.client.types.WebexAPIIntegrationSetting;
import com.kaltura.client.types.WebexAPIIntegrationSettingResponse;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class WebexVendorService {
	
	public static class FetchRegistrationPageWebexVendorBuilder extends NullRequestBuilder {
		
		public FetchRegistrationPageWebexVendorBuilder(String tokensData, String iv) {
			super("webexapidropfolder_webexvendor", "fetchRegistrationPage");
			params.add("tokensData", tokensData);
			params.add("iv", iv);
		}
		
		public void tokensData(String multirequestToken) {
			params.add("tokensData", multirequestToken);
		}
		
		public void iv(String multirequestToken) {
			params.add("iv", multirequestToken);
		}
	}

    public static FetchRegistrationPageWebexVendorBuilder fetchRegistrationPage(String tokensData, String iv)  {
		return new FetchRegistrationPageWebexVendorBuilder(tokensData, iv);
	}
	
	public static class ListWebexVendorBuilder extends RequestBuilder<WebexAPIIntegrationSettingResponse, WebexAPIIntegrationSettingResponse.Tokenizer, ListWebexVendorBuilder> {
		
		public ListWebexVendorBuilder(FilterPager pager) {
			super(WebexAPIIntegrationSettingResponse.class, "webexapidropfolder_webexvendor", "list");
			params.add("pager", pager);
		}
	}

	public static ListWebexVendorBuilder list()  {
		return list(null);
	}

	/**
	 * List KalturaWebexAPIIntegrationSetting objects
	 * 
	 * @param pager Pager
	 */
    public static ListWebexVendorBuilder list(FilterPager pager)  {
		return new ListWebexVendorBuilder(pager);
	}
	
	public static class OauthValidationWebexVendorBuilder extends RequestBuilder<String, String, OauthValidationWebexVendorBuilder> {
		
		public OauthValidationWebexVendorBuilder() {
			super(String.class, "webexapidropfolder_webexvendor", "oauthValidation");
		}
	}

    public static OauthValidationWebexVendorBuilder oauthValidation()  {
		return new OauthValidationWebexVendorBuilder();
	}
	
	public static class PreOauthValidationWebexVendorBuilder extends NullRequestBuilder {
		
		public PreOauthValidationWebexVendorBuilder() {
			super("webexapidropfolder_webexvendor", "preOauthValidation");
		}
	}

    public static PreOauthValidationWebexVendorBuilder preOauthValidation()  {
		return new PreOauthValidationWebexVendorBuilder();
	}
	
	public static class SubmitRegistrationWebexVendorBuilder extends RequestBuilder<String, String, SubmitRegistrationWebexVendorBuilder> {
		
		public SubmitRegistrationWebexVendorBuilder(String accountId, WebexAPIIntegrationSetting integrationSetting) {
			super(String.class, "webexapidropfolder_webexvendor", "submitRegistration");
			params.add("accountId", accountId);
			params.add("integrationSetting", integrationSetting);
		}
		
		public void accountId(String multirequestToken) {
			params.add("accountId", multirequestToken);
		}
	}

    public static SubmitRegistrationWebexVendorBuilder submitRegistration(String accountId, WebexAPIIntegrationSetting integrationSetting)  {
		return new SubmitRegistrationWebexVendorBuilder(accountId, integrationSetting);
	}
}
