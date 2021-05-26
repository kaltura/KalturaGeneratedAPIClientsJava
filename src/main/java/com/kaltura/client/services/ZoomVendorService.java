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
// Copyright (C) 2006-2021  Kaltura Inc.
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
import com.kaltura.client.types.ZoomIntegrationSetting;
import com.kaltura.client.types.ZoomIntegrationSettingResponse;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class ZoomVendorService {
	
	public static class DeAuthorizationZoomVendorBuilder extends RequestBuilder<String, String, DeAuthorizationZoomVendorBuilder> {
		
		public DeAuthorizationZoomVendorBuilder() {
			super(String.class, "vendor_zoomvendor", "deAuthorization");
		}
	}

    public static DeAuthorizationZoomVendorBuilder deAuthorization()  {
		return new DeAuthorizationZoomVendorBuilder();
	}
	
	public static class FetchRegistrationPageZoomVendorBuilder extends NullRequestBuilder {
		
		public FetchRegistrationPageZoomVendorBuilder(String tokensData, String iv) {
			super("vendor_zoomvendor", "fetchRegistrationPage");
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

    public static FetchRegistrationPageZoomVendorBuilder fetchRegistrationPage(String tokensData, String iv)  {
		return new FetchRegistrationPageZoomVendorBuilder(tokensData, iv);
	}
	
	public static class GetZoomVendorBuilder extends RequestBuilder<ZoomIntegrationSetting, ZoomIntegrationSetting.Tokenizer, GetZoomVendorBuilder> {
		
		public GetZoomVendorBuilder(int partnerId) {
			super(ZoomIntegrationSetting.class, "vendor_zoomvendor", "get");
			params.add("partnerId", partnerId);
		}
		
		public void partnerId(String multirequestToken) {
			params.add("partnerId", multirequestToken);
		}
	}

	/**
	 * Retrieve zoom integration setting object by partner id
	 * 
	 * @param partnerId 
	 */
    public static GetZoomVendorBuilder get(int partnerId)  {
		return new GetZoomVendorBuilder(partnerId);
	}
	
	public static class ListZoomVendorBuilder extends RequestBuilder<ZoomIntegrationSettingResponse, ZoomIntegrationSettingResponse.Tokenizer, ListZoomVendorBuilder> {
		
		public ListZoomVendorBuilder(FilterPager pager) {
			super(ZoomIntegrationSettingResponse.class, "vendor_zoomvendor", "list");
			params.add("pager", pager);
		}
	}

	public static ListZoomVendorBuilder list()  {
		return list(null);
	}

	/**
	 * List KalturaZoomIntegrationSetting objects
	 * 
	 * @param pager Pager
	 */
    public static ListZoomVendorBuilder list(FilterPager pager)  {
		return new ListZoomVendorBuilder(pager);
	}
	
	public static class LocalRegistrationPageZoomVendorBuilder extends NullRequestBuilder {
		
		public LocalRegistrationPageZoomVendorBuilder(String jwt) {
			super("vendor_zoomvendor", "localRegistrationPage");
			params.add("jwt", jwt);
		}
		
		public void jwt(String multirequestToken) {
			params.add("jwt", multirequestToken);
		}
	}

    public static LocalRegistrationPageZoomVendorBuilder localRegistrationPage(String jwt)  {
		return new LocalRegistrationPageZoomVendorBuilder(jwt);
	}
	
	public static class OauthValidationZoomVendorBuilder extends NullRequestBuilder {
		
		public OauthValidationZoomVendorBuilder() {
			super("vendor_zoomvendor", "oauthValidation");
		}
	}

	/**
	 * load html page the that will ask the user for its KMC URL, derive the region of
	  the user from it,   and redirect to the registration page in the correct region,
	  while forwarding the necessary code for registration
	 */
    public static OauthValidationZoomVendorBuilder oauthValidation()  {
		return new OauthValidationZoomVendorBuilder();
	}
	
	public static class PreOauthValidationZoomVendorBuilder extends RequestBuilder<String, String, PreOauthValidationZoomVendorBuilder> {
		
		public PreOauthValidationZoomVendorBuilder() {
			super(String.class, "vendor_zoomvendor", "preOauthValidation");
		}
	}

    public static PreOauthValidationZoomVendorBuilder preOauthValidation()  {
		return new PreOauthValidationZoomVendorBuilder();
	}
	
	public static class RecordingCompleteZoomVendorBuilder extends NullRequestBuilder {
		
		public RecordingCompleteZoomVendorBuilder() {
			super("vendor_zoomvendor", "recordingComplete");
		}
	}

    public static RecordingCompleteZoomVendorBuilder recordingComplete()  {
		return new RecordingCompleteZoomVendorBuilder();
	}
	
	public static class SubmitRegistrationZoomVendorBuilder extends RequestBuilder<String, String, SubmitRegistrationZoomVendorBuilder> {
		
		public SubmitRegistrationZoomVendorBuilder(String accountId, ZoomIntegrationSetting integrationSetting) {
			super(String.class, "vendor_zoomvendor", "submitRegistration");
			params.add("accountId", accountId);
			params.add("integrationSetting", integrationSetting);
		}
		
		public void accountId(String multirequestToken) {
			params.add("accountId", multirequestToken);
		}
	}

    public static SubmitRegistrationZoomVendorBuilder submitRegistration(String accountId, ZoomIntegrationSetting integrationSetting)  {
		return new SubmitRegistrationZoomVendorBuilder(accountId, integrationSetting);
	}
}
