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
@MultiRequestBuilder.Tokenizer(KontikiStorageExportJobData.Tokenizer.class)
public class KontikiStorageExportJobData extends StorageExportJobData {
	
	public interface Tokenizer extends StorageExportJobData.Tokenizer {
		String flavorAssetId();
		String contentMoid();
		String serviceToken();
	}

	/**
	 * Holds the id of the exported asset
	 */
	private String flavorAssetId;
	/**
	 * Unique Kontiki MOID for the content uploaded to Kontiki
	 */
	private String contentMoid;
	private String serviceToken;

	// flavorAssetId:
	public String getFlavorAssetId(){
		return this.flavorAssetId;
	}
	public void setFlavorAssetId(String flavorAssetId){
		this.flavorAssetId = flavorAssetId;
	}

	public void flavorAssetId(String multirequestToken){
		setToken("flavorAssetId", multirequestToken);
	}

	// contentMoid:
	public String getContentMoid(){
		return this.contentMoid;
	}
	public void setContentMoid(String contentMoid){
		this.contentMoid = contentMoid;
	}

	public void contentMoid(String multirequestToken){
		setToken("contentMoid", multirequestToken);
	}

	// serviceToken:
	public String getServiceToken(){
		return this.serviceToken;
	}
	public void setServiceToken(String serviceToken){
		this.serviceToken = serviceToken;
	}

	public void serviceToken(String multirequestToken){
		setToken("serviceToken", multirequestToken);
	}


	public KontikiStorageExportJobData() {
		super();
	}

	public KontikiStorageExportJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
		contentMoid = GsonParser.parseString(jsonObject.get("contentMoid"));
		serviceToken = GsonParser.parseString(jsonObject.get("serviceToken"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaKontikiStorageExportJobData");
		kparams.add("flavorAssetId", this.flavorAssetId);
		kparams.add("contentMoid", this.contentMoid);
		kparams.add("serviceToken", this.serviceToken);
		return kparams;
	}

}

