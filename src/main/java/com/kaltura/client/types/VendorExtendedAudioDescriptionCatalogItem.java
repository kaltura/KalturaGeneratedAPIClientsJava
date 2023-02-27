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
import com.kaltura.client.enums.VendorCatalogItemOutputFormat;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VendorExtendedAudioDescriptionCatalogItem.Tokenizer.class)
public class VendorExtendedAudioDescriptionCatalogItem extends VendorCatalogItem {
	
	public interface Tokenizer extends VendorCatalogItem.Tokenizer {
		String flavorParamsId();
		String clearAudioFlavorParamsId();
		String outputFormat();
	}

	private Integer flavorParamsId;
	private Integer clearAudioFlavorParamsId;
	private VendorCatalogItemOutputFormat outputFormat;

	// flavorParamsId:
	public Integer getFlavorParamsId(){
		return this.flavorParamsId;
	}
	public void setFlavorParamsId(Integer flavorParamsId){
		this.flavorParamsId = flavorParamsId;
	}

	public void flavorParamsId(String multirequestToken){
		setToken("flavorParamsId", multirequestToken);
	}

	// clearAudioFlavorParamsId:
	public Integer getClearAudioFlavorParamsId(){
		return this.clearAudioFlavorParamsId;
	}
	public void setClearAudioFlavorParamsId(Integer clearAudioFlavorParamsId){
		this.clearAudioFlavorParamsId = clearAudioFlavorParamsId;
	}

	public void clearAudioFlavorParamsId(String multirequestToken){
		setToken("clearAudioFlavorParamsId", multirequestToken);
	}

	// outputFormat:
	public VendorCatalogItemOutputFormat getOutputFormat(){
		return this.outputFormat;
	}
	public void setOutputFormat(VendorCatalogItemOutputFormat outputFormat){
		this.outputFormat = outputFormat;
	}

	public void outputFormat(String multirequestToken){
		setToken("outputFormat", multirequestToken);
	}


	public VendorExtendedAudioDescriptionCatalogItem() {
		super();
	}

	public VendorExtendedAudioDescriptionCatalogItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		flavorParamsId = GsonParser.parseInt(jsonObject.get("flavorParamsId"));
		clearAudioFlavorParamsId = GsonParser.parseInt(jsonObject.get("clearAudioFlavorParamsId"));
		outputFormat = VendorCatalogItemOutputFormat.get(GsonParser.parseInt(jsonObject.get("outputFormat")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorExtendedAudioDescriptionCatalogItem");
		kparams.add("flavorParamsId", this.flavorParamsId);
		kparams.add("clearAudioFlavorParamsId", this.clearAudioFlavorParamsId);
		kparams.add("outputFormat", this.outputFormat);
		return kparams;
	}

}

