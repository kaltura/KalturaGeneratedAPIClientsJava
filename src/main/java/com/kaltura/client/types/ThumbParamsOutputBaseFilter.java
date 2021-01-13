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
@MultiRequestBuilder.Tokenizer(ThumbParamsOutputBaseFilter.Tokenizer.class)
public abstract class ThumbParamsOutputBaseFilter extends ThumbParamsFilter {
	
	public interface Tokenizer extends ThumbParamsFilter.Tokenizer {
		String thumbParamsIdEqual();
		String thumbParamsVersionEqual();
		String thumbAssetIdEqual();
		String thumbAssetVersionEqual();
	}

	private Integer thumbParamsIdEqual;
	private String thumbParamsVersionEqual;
	private String thumbAssetIdEqual;
	private String thumbAssetVersionEqual;

	// thumbParamsIdEqual:
	public Integer getThumbParamsIdEqual(){
		return this.thumbParamsIdEqual;
	}
	public void setThumbParamsIdEqual(Integer thumbParamsIdEqual){
		this.thumbParamsIdEqual = thumbParamsIdEqual;
	}

	public void thumbParamsIdEqual(String multirequestToken){
		setToken("thumbParamsIdEqual", multirequestToken);
	}

	// thumbParamsVersionEqual:
	public String getThumbParamsVersionEqual(){
		return this.thumbParamsVersionEqual;
	}
	public void setThumbParamsVersionEqual(String thumbParamsVersionEqual){
		this.thumbParamsVersionEqual = thumbParamsVersionEqual;
	}

	public void thumbParamsVersionEqual(String multirequestToken){
		setToken("thumbParamsVersionEqual", multirequestToken);
	}

	// thumbAssetIdEqual:
	public String getThumbAssetIdEqual(){
		return this.thumbAssetIdEqual;
	}
	public void setThumbAssetIdEqual(String thumbAssetIdEqual){
		this.thumbAssetIdEqual = thumbAssetIdEqual;
	}

	public void thumbAssetIdEqual(String multirequestToken){
		setToken("thumbAssetIdEqual", multirequestToken);
	}

	// thumbAssetVersionEqual:
	public String getThumbAssetVersionEqual(){
		return this.thumbAssetVersionEqual;
	}
	public void setThumbAssetVersionEqual(String thumbAssetVersionEqual){
		this.thumbAssetVersionEqual = thumbAssetVersionEqual;
	}

	public void thumbAssetVersionEqual(String multirequestToken){
		setToken("thumbAssetVersionEqual", multirequestToken);
	}


	public ThumbParamsOutputBaseFilter() {
		super();
	}

	public ThumbParamsOutputBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		thumbParamsIdEqual = GsonParser.parseInt(jsonObject.get("thumbParamsIdEqual"));
		thumbParamsVersionEqual = GsonParser.parseString(jsonObject.get("thumbParamsVersionEqual"));
		thumbAssetIdEqual = GsonParser.parseString(jsonObject.get("thumbAssetIdEqual"));
		thumbAssetVersionEqual = GsonParser.parseString(jsonObject.get("thumbAssetVersionEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaThumbParamsOutputBaseFilter");
		kparams.add("thumbParamsIdEqual", this.thumbParamsIdEqual);
		kparams.add("thumbParamsVersionEqual", this.thumbParamsVersionEqual);
		kparams.add("thumbAssetIdEqual", this.thumbAssetIdEqual);
		kparams.add("thumbAssetVersionEqual", this.thumbAssetVersionEqual);
		return kparams;
	}

}

