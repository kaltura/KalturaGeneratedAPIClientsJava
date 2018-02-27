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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.DrmSchemeName;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DrmPlaybackPluginData.Tokenizer.class)
public class DrmPlaybackPluginData extends PluginData {
	
	public interface Tokenizer extends PluginData.Tokenizer {
		String scheme();
		String licenseURL();
	}

	private DrmSchemeName scheme;
	private String licenseURL;

	// scheme:
	public DrmSchemeName getScheme(){
		return this.scheme;
	}
	public void setScheme(DrmSchemeName scheme){
		this.scheme = scheme;
	}

	public void scheme(String multirequestToken){
		setToken("scheme", multirequestToken);
	}

	// licenseURL:
	public String getLicenseURL(){
		return this.licenseURL;
	}
	public void setLicenseURL(String licenseURL){
		this.licenseURL = licenseURL;
	}

	public void licenseURL(String multirequestToken){
		setToken("licenseURL", multirequestToken);
	}


	public DrmPlaybackPluginData() {
		super();
	}

	public DrmPlaybackPluginData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		scheme = DrmSchemeName.get(GsonParser.parseString(jsonObject.get("scheme")));
		licenseURL = GsonParser.parseString(jsonObject.get("licenseURL"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDrmPlaybackPluginData");
		kparams.add("scheme", this.scheme);
		kparams.add("licenseURL", this.licenseURL);
		return kparams;
	}

}

