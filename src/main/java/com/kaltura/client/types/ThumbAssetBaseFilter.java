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
import com.kaltura.client.enums.ThumbAssetStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ThumbAssetBaseFilter.Tokenizer.class)
public abstract class ThumbAssetBaseFilter extends AssetFilter {
	
	public interface Tokenizer extends AssetFilter.Tokenizer {
		String thumbParamsIdEqual();
		String thumbParamsIdIn();
		String statusEqual();
		String statusIn();
		String statusNotIn();
	}

	private Integer thumbParamsIdEqual;
	private String thumbParamsIdIn;
	private ThumbAssetStatus statusEqual;
	private String statusIn;
	private String statusNotIn;

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

	// thumbParamsIdIn:
	public String getThumbParamsIdIn(){
		return this.thumbParamsIdIn;
	}
	public void setThumbParamsIdIn(String thumbParamsIdIn){
		this.thumbParamsIdIn = thumbParamsIdIn;
	}

	public void thumbParamsIdIn(String multirequestToken){
		setToken("thumbParamsIdIn", multirequestToken);
	}

	// statusEqual:
	public ThumbAssetStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(ThumbAssetStatus statusEqual){
		this.statusEqual = statusEqual;
	}

	public void statusEqual(String multirequestToken){
		setToken("statusEqual", multirequestToken);
	}

	// statusIn:
	public String getStatusIn(){
		return this.statusIn;
	}
	public void setStatusIn(String statusIn){
		this.statusIn = statusIn;
	}

	public void statusIn(String multirequestToken){
		setToken("statusIn", multirequestToken);
	}

	// statusNotIn:
	public String getStatusNotIn(){
		return this.statusNotIn;
	}
	public void setStatusNotIn(String statusNotIn){
		this.statusNotIn = statusNotIn;
	}

	public void statusNotIn(String multirequestToken){
		setToken("statusNotIn", multirequestToken);
	}


	public ThumbAssetBaseFilter() {
		super();
	}

	public ThumbAssetBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		thumbParamsIdEqual = GsonParser.parseInt(jsonObject.get("thumbParamsIdEqual"));
		thumbParamsIdIn = GsonParser.parseString(jsonObject.get("thumbParamsIdIn"));
		statusEqual = ThumbAssetStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		statusNotIn = GsonParser.parseString(jsonObject.get("statusNotIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaThumbAssetBaseFilter");
		kparams.add("thumbParamsIdEqual", this.thumbParamsIdEqual);
		kparams.add("thumbParamsIdIn", this.thumbParamsIdIn);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("statusNotIn", this.statusNotIn);
		return kparams;
	}

}

