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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EntryVendorTaskFilter.Tokenizer.class)
public class EntryVendorTaskFilter extends EntryVendorTaskBaseFilter {
	
	public interface Tokenizer extends EntryVendorTaskBaseFilter.Tokenizer {
		String freeText();
		String expectedFinishTimeGreaterThanOrEqual();
		String expectedFinishTimeLessThanOrEqual();
	}

	private String freeText;
	private Integer expectedFinishTimeGreaterThanOrEqual;
	private Integer expectedFinishTimeLessThanOrEqual;

	// freeText:
	public String getFreeText(){
		return this.freeText;
	}
	public void setFreeText(String freeText){
		this.freeText = freeText;
	}

	public void freeText(String multirequestToken){
		setToken("freeText", multirequestToken);
	}

	// expectedFinishTimeGreaterThanOrEqual:
	public Integer getExpectedFinishTimeGreaterThanOrEqual(){
		return this.expectedFinishTimeGreaterThanOrEqual;
	}
	public void setExpectedFinishTimeGreaterThanOrEqual(Integer expectedFinishTimeGreaterThanOrEqual){
		this.expectedFinishTimeGreaterThanOrEqual = expectedFinishTimeGreaterThanOrEqual;
	}

	public void expectedFinishTimeGreaterThanOrEqual(String multirequestToken){
		setToken("expectedFinishTimeGreaterThanOrEqual", multirequestToken);
	}

	// expectedFinishTimeLessThanOrEqual:
	public Integer getExpectedFinishTimeLessThanOrEqual(){
		return this.expectedFinishTimeLessThanOrEqual;
	}
	public void setExpectedFinishTimeLessThanOrEqual(Integer expectedFinishTimeLessThanOrEqual){
		this.expectedFinishTimeLessThanOrEqual = expectedFinishTimeLessThanOrEqual;
	}

	public void expectedFinishTimeLessThanOrEqual(String multirequestToken){
		setToken("expectedFinishTimeLessThanOrEqual", multirequestToken);
	}


	public EntryVendorTaskFilter() {
		super();
	}

	public EntryVendorTaskFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		freeText = GsonParser.parseString(jsonObject.get("freeText"));
		expectedFinishTimeGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("expectedFinishTimeGreaterThanOrEqual"));
		expectedFinishTimeLessThanOrEqual = GsonParser.parseInt(jsonObject.get("expectedFinishTimeLessThanOrEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryVendorTaskFilter");
		kparams.add("freeText", this.freeText);
		kparams.add("expectedFinishTimeGreaterThanOrEqual", this.expectedFinishTimeGreaterThanOrEqual);
		kparams.add("expectedFinishTimeLessThanOrEqual", this.expectedFinishTimeLessThanOrEqual);
		return kparams;
	}

}

