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
@MultiRequestBuilder.Tokenizer(FacebookCaptionDistributionInfo.Tokenizer.class)
public class FacebookCaptionDistributionInfo extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String language();
		String label();
		String filePath();
		String remoteId();
		String version();
		String assetId();
	}

	private String language;
	private String label;
	private String filePath;
	private String remoteId;
	private String version;
	private String assetId;

	// language:
	public String getLanguage(){
		return this.language;
	}
	public void setLanguage(String language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
	}

	// label:
	public String getLabel(){
		return this.label;
	}
	public void setLabel(String label){
		this.label = label;
	}

	public void label(String multirequestToken){
		setToken("label", multirequestToken);
	}

	// filePath:
	public String getFilePath(){
		return this.filePath;
	}
	public void setFilePath(String filePath){
		this.filePath = filePath;
	}

	public void filePath(String multirequestToken){
		setToken("filePath", multirequestToken);
	}

	// remoteId:
	public String getRemoteId(){
		return this.remoteId;
	}
	public void setRemoteId(String remoteId){
		this.remoteId = remoteId;
	}

	public void remoteId(String multirequestToken){
		setToken("remoteId", multirequestToken);
	}

	// version:
	public String getVersion(){
		return this.version;
	}
	public void setVersion(String version){
		this.version = version;
	}

	public void version(String multirequestToken){
		setToken("version", multirequestToken);
	}

	// assetId:
	public String getAssetId(){
		return this.assetId;
	}
	public void setAssetId(String assetId){
		this.assetId = assetId;
	}

	public void assetId(String multirequestToken){
		setToken("assetId", multirequestToken);
	}


	public FacebookCaptionDistributionInfo() {
		super();
	}

	public FacebookCaptionDistributionInfo(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		language = GsonParser.parseString(jsonObject.get("language"));
		label = GsonParser.parseString(jsonObject.get("label"));
		filePath = GsonParser.parseString(jsonObject.get("filePath"));
		remoteId = GsonParser.parseString(jsonObject.get("remoteId"));
		version = GsonParser.parseString(jsonObject.get("version"));
		assetId = GsonParser.parseString(jsonObject.get("assetId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFacebookCaptionDistributionInfo");
		kparams.add("language", this.language);
		kparams.add("label", this.label);
		kparams.add("filePath", this.filePath);
		kparams.add("remoteId", this.remoteId);
		kparams.add("version", this.version);
		kparams.add("assetId", this.assetId);
		return kparams;
	}

}

