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
package com.kaltura.client.types;

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FacebookDistributionProfile.Tokenizer.class)
public class FacebookDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String apiAuthorizeUrl();
		String pageId();
		String pageAccessToken();
		String userAccessToken();
		String state();
		String permissions();
		String reRequestPermissions();
	}

	private String apiAuthorizeUrl;
	private String pageId;
	private String pageAccessToken;
	private String userAccessToken;
	private String state;
	private String permissions;
	private Integer reRequestPermissions;

	// apiAuthorizeUrl:
	public String getApiAuthorizeUrl(){
		return this.apiAuthorizeUrl;
	}
	public void setApiAuthorizeUrl(String apiAuthorizeUrl){
		this.apiAuthorizeUrl = apiAuthorizeUrl;
	}

	public void apiAuthorizeUrl(String multirequestToken){
		setToken("apiAuthorizeUrl", multirequestToken);
	}

	// pageId:
	public String getPageId(){
		return this.pageId;
	}
	public void setPageId(String pageId){
		this.pageId = pageId;
	}

	public void pageId(String multirequestToken){
		setToken("pageId", multirequestToken);
	}

	// pageAccessToken:
	public String getPageAccessToken(){
		return this.pageAccessToken;
	}
	public void setPageAccessToken(String pageAccessToken){
		this.pageAccessToken = pageAccessToken;
	}

	public void pageAccessToken(String multirequestToken){
		setToken("pageAccessToken", multirequestToken);
	}

	// userAccessToken:
	public String getUserAccessToken(){
		return this.userAccessToken;
	}
	public void setUserAccessToken(String userAccessToken){
		this.userAccessToken = userAccessToken;
	}

	public void userAccessToken(String multirequestToken){
		setToken("userAccessToken", multirequestToken);
	}

	// state:
	public String getState(){
		return this.state;
	}
	public void setState(String state){
		this.state = state;
	}

	public void state(String multirequestToken){
		setToken("state", multirequestToken);
	}

	// permissions:
	public String getPermissions(){
		return this.permissions;
	}
	public void setPermissions(String permissions){
		this.permissions = permissions;
	}

	public void permissions(String multirequestToken){
		setToken("permissions", multirequestToken);
	}

	// reRequestPermissions:
	public Integer getReRequestPermissions(){
		return this.reRequestPermissions;
	}
	public void setReRequestPermissions(Integer reRequestPermissions){
		this.reRequestPermissions = reRequestPermissions;
	}

	public void reRequestPermissions(String multirequestToken){
		setToken("reRequestPermissions", multirequestToken);
	}


	public FacebookDistributionProfile() {
		super();
	}

	public FacebookDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		apiAuthorizeUrl = GsonParser.parseString(jsonObject.get("apiAuthorizeUrl"));
		pageId = GsonParser.parseString(jsonObject.get("pageId"));
		pageAccessToken = GsonParser.parseString(jsonObject.get("pageAccessToken"));
		userAccessToken = GsonParser.parseString(jsonObject.get("userAccessToken"));
		state = GsonParser.parseString(jsonObject.get("state"));
		permissions = GsonParser.parseString(jsonObject.get("permissions"));
		reRequestPermissions = GsonParser.parseInt(jsonObject.get("reRequestPermissions"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFacebookDistributionProfile");
		kparams.add("apiAuthorizeUrl", this.apiAuthorizeUrl);
		kparams.add("pageId", this.pageId);
		kparams.add("pageAccessToken", this.pageAccessToken);
		kparams.add("userAccessToken", this.userAccessToken);
		kparams.add("state", this.state);
		kparams.add("permissions", this.permissions);
		kparams.add("reRequestPermissions", this.reRequestPermissions);
		return kparams;
	}

}

