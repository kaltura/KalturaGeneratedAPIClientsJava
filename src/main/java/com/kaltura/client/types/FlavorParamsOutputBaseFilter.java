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
// Copyright (C) 2006-2020  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(FlavorParamsOutputBaseFilter.Tokenizer.class)
public abstract class FlavorParamsOutputBaseFilter extends FlavorParamsFilter {
	
	public interface Tokenizer extends FlavorParamsFilter.Tokenizer {
		String flavorParamsIdEqual();
		String flavorParamsVersionEqual();
		String flavorAssetIdEqual();
		String flavorAssetVersionEqual();
	}

	private Integer flavorParamsIdEqual;
	private String flavorParamsVersionEqual;
	private String flavorAssetIdEqual;
	private String flavorAssetVersionEqual;

	// flavorParamsIdEqual:
	public Integer getFlavorParamsIdEqual(){
		return this.flavorParamsIdEqual;
	}
	public void setFlavorParamsIdEqual(Integer flavorParamsIdEqual){
		this.flavorParamsIdEqual = flavorParamsIdEqual;
	}

	public void flavorParamsIdEqual(String multirequestToken){
		setToken("flavorParamsIdEqual", multirequestToken);
	}

	// flavorParamsVersionEqual:
	public String getFlavorParamsVersionEqual(){
		return this.flavorParamsVersionEqual;
	}
	public void setFlavorParamsVersionEqual(String flavorParamsVersionEqual){
		this.flavorParamsVersionEqual = flavorParamsVersionEqual;
	}

	public void flavorParamsVersionEqual(String multirequestToken){
		setToken("flavorParamsVersionEqual", multirequestToken);
	}

	// flavorAssetIdEqual:
	public String getFlavorAssetIdEqual(){
		return this.flavorAssetIdEqual;
	}
	public void setFlavorAssetIdEqual(String flavorAssetIdEqual){
		this.flavorAssetIdEqual = flavorAssetIdEqual;
	}

	public void flavorAssetIdEqual(String multirequestToken){
		setToken("flavorAssetIdEqual", multirequestToken);
	}

	// flavorAssetVersionEqual:
	public String getFlavorAssetVersionEqual(){
		return this.flavorAssetVersionEqual;
	}
	public void setFlavorAssetVersionEqual(String flavorAssetVersionEqual){
		this.flavorAssetVersionEqual = flavorAssetVersionEqual;
	}

	public void flavorAssetVersionEqual(String multirequestToken){
		setToken("flavorAssetVersionEqual", multirequestToken);
	}


	public FlavorParamsOutputBaseFilter() {
		super();
	}

	public FlavorParamsOutputBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		flavorParamsIdEqual = GsonParser.parseInt(jsonObject.get("flavorParamsIdEqual"));
		flavorParamsVersionEqual = GsonParser.parseString(jsonObject.get("flavorParamsVersionEqual"));
		flavorAssetIdEqual = GsonParser.parseString(jsonObject.get("flavorAssetIdEqual"));
		flavorAssetVersionEqual = GsonParser.parseString(jsonObject.get("flavorAssetVersionEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFlavorParamsOutputBaseFilter");
		kparams.add("flavorParamsIdEqual", this.flavorParamsIdEqual);
		kparams.add("flavorParamsVersionEqual", this.flavorParamsVersionEqual);
		kparams.add("flavorAssetIdEqual", this.flavorAssetIdEqual);
		kparams.add("flavorAssetVersionEqual", this.flavorAssetVersionEqual);
		return kparams;
	}

}

