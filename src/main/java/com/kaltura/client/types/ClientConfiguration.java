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

/**  Define client optional configurations  /  */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ClientConfiguration.Tokenizer.class)
public class ClientConfiguration extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String clientTag();
		String apiVersion();
	}

	private String clientTag;
	private String apiVersion;

	// clientTag:
	public String getClientTag(){
		return this.clientTag;
	}
	public void setClientTag(String clientTag){
		this.clientTag = clientTag;
	}

	public void clientTag(String multirequestToken){
		setToken("clientTag", multirequestToken);
	}

	// apiVersion:
	public String getApiVersion(){
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion){
		this.apiVersion = apiVersion;
	}

	public void apiVersion(String multirequestToken){
		setToken("apiVersion", multirequestToken);
	}


	public ClientConfiguration() {
		super();
	}

	public ClientConfiguration(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		clientTag = GsonParser.parseString(jsonObject.get("clientTag"));
		apiVersion = GsonParser.parseString(jsonObject.get("apiVersion"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaClientConfiguration");
		kparams.add("clientTag", this.clientTag);
		kparams.add("apiVersion", this.apiVersion);
		return kparams;
	}

}

