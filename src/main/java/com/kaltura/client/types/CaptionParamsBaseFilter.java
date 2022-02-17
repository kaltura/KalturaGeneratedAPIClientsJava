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
// Copyright (C) 2006-2022  Kaltura Inc.
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
import com.kaltura.client.enums.CaptionType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CaptionParamsBaseFilter.Tokenizer.class)
public abstract class CaptionParamsBaseFilter extends AssetParamsFilter {
	
	public interface Tokenizer extends AssetParamsFilter.Tokenizer {
		String formatEqual();
		String formatIn();
	}

	private CaptionType formatEqual;
	private String formatIn;

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


	public CaptionParamsBaseFilter() {
		super();
	}

	public CaptionParamsBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		formatEqual = CaptionType.get(GsonParser.parseString(jsonObject.get("formatEqual")));
		formatIn = GsonParser.parseString(jsonObject.get("formatIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCaptionParamsBaseFilter");
		kparams.add("formatEqual", this.formatEqual);
		kparams.add("formatIn", this.formatIn);
		return kparams;
	}

}

