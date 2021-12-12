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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(StorageExportJobData.Tokenizer.class)
public class StorageExportJobData extends StorageJobData {
	
	public interface Tokenizer extends StorageJobData.Tokenizer {
		String force();
		String createLink();
		String assetId();
		String externalUrl();
		String port();
	}

	private Boolean force;
	private Boolean createLink;
	private String assetId;
	private String externalUrl;
	private Integer port;

	// force:
	public Boolean getForce(){
		return this.force;
	}
	public void setForce(Boolean force){
		this.force = force;
	}

	public void force(String multirequestToken){
		setToken("force", multirequestToken);
	}

	// createLink:
	public Boolean getCreateLink(){
		return this.createLink;
	}
	public void setCreateLink(Boolean createLink){
		this.createLink = createLink;
	}

	public void createLink(String multirequestToken){
		setToken("createLink", multirequestToken);
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

	// externalUrl:
	public String getExternalUrl(){
		return this.externalUrl;
	}
	public void setExternalUrl(String externalUrl){
		this.externalUrl = externalUrl;
	}

	public void externalUrl(String multirequestToken){
		setToken("externalUrl", multirequestToken);
	}

	// port:
	public Integer getPort(){
		return this.port;
	}
	public void setPort(Integer port){
		this.port = port;
	}

	public void port(String multirequestToken){
		setToken("port", multirequestToken);
	}


	public StorageExportJobData() {
		super();
	}

	public StorageExportJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		force = GsonParser.parseBoolean(jsonObject.get("force"));
		createLink = GsonParser.parseBoolean(jsonObject.get("createLink"));
		assetId = GsonParser.parseString(jsonObject.get("assetId"));
		externalUrl = GsonParser.parseString(jsonObject.get("externalUrl"));
		port = GsonParser.parseInt(jsonObject.get("port"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaStorageExportJobData");
		kparams.add("force", this.force);
		kparams.add("createLink", this.createLink);
		kparams.add("assetId", this.assetId);
		kparams.add("externalUrl", this.externalUrl);
		kparams.add("port", this.port);
		return kparams;
	}

}

