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
import com.kaltura.client.types.FlavorAsset;
import com.kaltura.client.types.FlavorParams;
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
@MultiRequestBuilder.Tokenizer(FlavorAssetWithParams.Tokenizer.class)
public class FlavorAssetWithParams extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		FlavorAsset.Tokenizer flavorAsset();
		FlavorParams.Tokenizer flavorParams();
		String entryId();
	}

	/**
	 * The Flavor Asset (Can be null when there are params without asset)
	 */
	private FlavorAsset flavorAsset;
	/**
	 * The Flavor Params
	 */
	private FlavorParams flavorParams;
	/**
	 * The entry id
	 */
	private String entryId;

	// flavorAsset:
	public FlavorAsset getFlavorAsset(){
		return this.flavorAsset;
	}
	public void setFlavorAsset(FlavorAsset flavorAsset){
		this.flavorAsset = flavorAsset;
	}

	// flavorParams:
	public FlavorParams getFlavorParams(){
		return this.flavorParams;
	}
	public void setFlavorParams(FlavorParams flavorParams){
		this.flavorParams = flavorParams;
	}

	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}


	public FlavorAssetWithParams() {
		super();
	}

	public FlavorAssetWithParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		flavorAsset = GsonParser.parseObject(jsonObject.getAsJsonObject("flavorAsset"), FlavorAsset.class);
		flavorParams = GsonParser.parseObject(jsonObject.getAsJsonObject("flavorParams"), FlavorParams.class);
		entryId = GsonParser.parseString(jsonObject.get("entryId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFlavorAssetWithParams");
		kparams.add("flavorAsset", this.flavorAsset);
		kparams.add("flavorParams", this.flavorParams);
		kparams.add("entryId", this.entryId);
		return kparams;
	}

}

