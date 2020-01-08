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
import com.kaltura.client.enums.AttachmentAssetStatus;
import com.kaltura.client.enums.AttachmentType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AttachmentAssetBaseFilter.Tokenizer.class)
public abstract class AttachmentAssetBaseFilter extends AssetFilter {
	
	public interface Tokenizer extends AssetFilter.Tokenizer {
		String formatEqual();
		String formatIn();
		String statusEqual();
		String statusIn();
		String statusNotIn();
	}

	private AttachmentType formatEqual;
	private String formatIn;
	private AttachmentAssetStatus statusEqual;
	private String statusIn;
	private String statusNotIn;

	// formatEqual:
	public AttachmentType getFormatEqual(){
		return this.formatEqual;
	}
	public void setFormatEqual(AttachmentType formatEqual){
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
	public AttachmentAssetStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(AttachmentAssetStatus statusEqual){
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


	public AttachmentAssetBaseFilter() {
		super();
	}

	public AttachmentAssetBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		formatEqual = AttachmentType.get(GsonParser.parseString(jsonObject.get("formatEqual")));
		formatIn = GsonParser.parseString(jsonObject.get("formatIn"));
		statusEqual = AttachmentAssetStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		statusNotIn = GsonParser.parseString(jsonObject.get("statusNotIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAttachmentAssetBaseFilter");
		kparams.add("formatEqual", this.formatEqual);
		kparams.add("formatIn", this.formatIn);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("statusNotIn", this.statusNotIn);
		return kparams;
	}

}

