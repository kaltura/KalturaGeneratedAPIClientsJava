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
import com.kaltura.client.enums.CaptionAssetStatus;
import com.kaltura.client.enums.CaptionType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CaptionAssetBaseFilter.Tokenizer.class)
public abstract class CaptionAssetBaseFilter extends AssetFilter {
	
	public interface Tokenizer extends AssetFilter.Tokenizer {
		String captionParamsIdEqual();
		String captionParamsIdIn();
		String formatEqual();
		String formatIn();
		String statusEqual();
		String statusIn();
		String statusNotIn();
	}

	private Integer captionParamsIdEqual;
	private String captionParamsIdIn;
	private CaptionType formatEqual;
	private String formatIn;
	private CaptionAssetStatus statusEqual;
	private String statusIn;
	private String statusNotIn;

	// captionParamsIdEqual:
	public Integer getCaptionParamsIdEqual(){
		return this.captionParamsIdEqual;
	}
	public void setCaptionParamsIdEqual(Integer captionParamsIdEqual){
		this.captionParamsIdEqual = captionParamsIdEqual;
	}

	public void captionParamsIdEqual(String multirequestToken){
		setToken("captionParamsIdEqual", multirequestToken);
	}

	// captionParamsIdIn:
	public String getCaptionParamsIdIn(){
		return this.captionParamsIdIn;
	}
	public void setCaptionParamsIdIn(String captionParamsIdIn){
		this.captionParamsIdIn = captionParamsIdIn;
	}

	public void captionParamsIdIn(String multirequestToken){
		setToken("captionParamsIdIn", multirequestToken);
	}

	// formatEqual:
	public CaptionType getFormatEqual(){
		return this.formatEqual;
	}
	public void setFormatEqual(CaptionType formatEqual){
		this.formatEqual = formatEqual;
	}

	public void formatEqual(String multirequestToken){
		setToken("formatEqual", multirequestToken);
	}

	// formatIn:
	public String getFormatIn(){
		return this.formatIn;
	}
	public void setFormatIn(String formatIn){
		this.formatIn = formatIn;
	}

	public void formatIn(String multirequestToken){
		setToken("formatIn", multirequestToken);
	}

	// statusEqual:
	public CaptionAssetStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(CaptionAssetStatus statusEqual){
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


	public CaptionAssetBaseFilter() {
		super();
	}

	public CaptionAssetBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		captionParamsIdEqual = GsonParser.parseInt(jsonObject.get("captionParamsIdEqual"));
		captionParamsIdIn = GsonParser.parseString(jsonObject.get("captionParamsIdIn"));
		formatEqual = CaptionType.get(GsonParser.parseString(jsonObject.get("formatEqual")));
		formatIn = GsonParser.parseString(jsonObject.get("formatIn"));
		statusEqual = CaptionAssetStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		statusNotIn = GsonParser.parseString(jsonObject.get("statusNotIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCaptionAssetBaseFilter");
		kparams.add("captionParamsIdEqual", this.captionParamsIdEqual);
		kparams.add("captionParamsIdIn", this.captionParamsIdIn);
		kparams.add("formatEqual", this.formatEqual);
		kparams.add("formatIn", this.formatIn);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("statusNotIn", this.statusNotIn);
		return kparams;
	}

}

