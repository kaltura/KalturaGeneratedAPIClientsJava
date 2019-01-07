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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SearchAuthData.Tokenizer.class)
public class SearchAuthData extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String authData();
		String loginUrl();
		String message();
	}

	/**
	 * The authentication data that further should be used for search
	 */
	private String authData;
	/**
	 * Login URL when user need to sign-in and authorize the search
	 */
	private String loginUrl;
	/**
	 * Information when there was an error
	 */
	private String message;

	// authData:
	public String getAuthData(){
		return this.authData;
	}
	public void setAuthData(String authData){
		this.authData = authData;
	}

	public void authData(String multirequestToken){
		setToken("authData", multirequestToken);
	}

	// loginUrl:
	public String getLoginUrl(){
		return this.loginUrl;
	}
	public void setLoginUrl(String loginUrl){
		this.loginUrl = loginUrl;
	}

	public void loginUrl(String multirequestToken){
		setToken("loginUrl", multirequestToken);
	}

	// message:
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}

	public void message(String multirequestToken){
		setToken("message", multirequestToken);
	}


	public SearchAuthData() {
		super();
	}

	public SearchAuthData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		authData = GsonParser.parseString(jsonObject.get("authData"));
		loginUrl = GsonParser.parseString(jsonObject.get("loginUrl"));
		message = GsonParser.parseString(jsonObject.get("message"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSearchAuthData");
		kparams.add("authData", this.authData);
		kparams.add("loginUrl", this.loginUrl);
		kparams.add("message", this.message);
		return kparams;
	}

}

