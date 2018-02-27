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
// Copyright (C) 2006-2018  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(CuePointFilter.Tokenizer.class)
public class CuePointFilter extends CuePointBaseFilter {
	
	public interface Tokenizer extends CuePointBaseFilter.Tokenizer {
		String freeText();
		String userIdEqualCurrent();
		String userIdCurrent();
	}

	private String freeText;
	private Boolean userIdEqualCurrent;
	private Boolean userIdCurrent;

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

	// userIdEqualCurrent:
	public Boolean getUserIdEqualCurrent(){
		return this.userIdEqualCurrent;
	}
	public void setUserIdEqualCurrent(Boolean userIdEqualCurrent){
		this.userIdEqualCurrent = userIdEqualCurrent;
	}

	public void userIdEqualCurrent(String multirequestToken){
		setToken("userIdEqualCurrent", multirequestToken);
	}

	// userIdCurrent:
	public Boolean getUserIdCurrent(){
		return this.userIdCurrent;
	}
	public void setUserIdCurrent(Boolean userIdCurrent){
		this.userIdCurrent = userIdCurrent;
	}

	public void userIdCurrent(String multirequestToken){
		setToken("userIdCurrent", multirequestToken);
	}


	public CuePointFilter() {
		super();
	}

	public CuePointFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		freeText = GsonParser.parseString(jsonObject.get("freeText"));
		userIdEqualCurrent = GsonParser.parseBoolean(jsonObject.get("userIdEqualCurrent"));
		userIdCurrent = GsonParser.parseBoolean(jsonObject.get("userIdCurrent"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCuePointFilter");
		kparams.add("freeText", this.freeText);
		kparams.add("userIdEqualCurrent", this.userIdEqualCurrent);
		kparams.add("userIdCurrent", this.userIdCurrent);
		return kparams;
	}

}

