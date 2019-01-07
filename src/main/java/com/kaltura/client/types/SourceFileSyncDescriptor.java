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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SourceFileSyncDescriptor.Tokenizer.class)
public class SourceFileSyncDescriptor extends FileSyncDescriptor {
	
	public interface Tokenizer extends FileSyncDescriptor.Tokenizer {
		String actualFileSyncLocalPath();
		String assetId();
		String assetParamsId();
	}

	/**
	 * The translated path as used by the scheduler
	 */
	private String actualFileSyncLocalPath;
	private String assetId;
	private Integer assetParamsId;

	// actualFileSyncLocalPath:
	public String getActualFileSyncLocalPath(){
		return this.actualFileSyncLocalPath;
	}
	public void setActualFileSyncLocalPath(String actualFileSyncLocalPath){
		this.actualFileSyncLocalPath = actualFileSyncLocalPath;
	}

	public void actualFileSyncLocalPath(String multirequestToken){
		setToken("actualFileSyncLocalPath", multirequestToken);
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

	// assetParamsId:
	public Integer getAssetParamsId(){
		return this.assetParamsId;
	}
	public void setAssetParamsId(Integer assetParamsId){
		this.assetParamsId = assetParamsId;
	}

	public void assetParamsId(String multirequestToken){
		setToken("assetParamsId", multirequestToken);
	}


	public SourceFileSyncDescriptor() {
		super();
	}

	public SourceFileSyncDescriptor(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		actualFileSyncLocalPath = GsonParser.parseString(jsonObject.get("actualFileSyncLocalPath"));
		assetId = GsonParser.parseString(jsonObject.get("assetId"));
		assetParamsId = GsonParser.parseInt(jsonObject.get("assetParamsId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSourceFileSyncDescriptor");
		kparams.add("actualFileSyncLocalPath", this.actualFileSyncLocalPath);
		kparams.add("assetId", this.assetId);
		kparams.add("assetParamsId", this.assetParamsId);
		return kparams;
	}

}

