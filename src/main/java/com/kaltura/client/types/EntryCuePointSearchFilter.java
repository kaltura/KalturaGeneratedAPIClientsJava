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
@MultiRequestBuilder.Tokenizer(EntryCuePointSearchFilter.Tokenizer.class)
public class EntryCuePointSearchFilter extends SearchItem {
	
	public interface Tokenizer extends SearchItem.Tokenizer {
		String cuePointsFreeText();
		String cuePointTypeIn();
		String cuePointSubTypeEqual();
	}

	private String cuePointsFreeText;
	private String cuePointTypeIn;
	private Integer cuePointSubTypeEqual;

	// cuePointsFreeText:
	public String getCuePointsFreeText(){
		return this.cuePointsFreeText;
	}
	public void setCuePointsFreeText(String cuePointsFreeText){
		this.cuePointsFreeText = cuePointsFreeText;
	}

	public void cuePointsFreeText(String multirequestToken){
		setToken("cuePointsFreeText", multirequestToken);
	}

	// cuePointTypeIn:
	public String getCuePointTypeIn(){
		return this.cuePointTypeIn;
	}
	public void setCuePointTypeIn(String cuePointTypeIn){
		this.cuePointTypeIn = cuePointTypeIn;
	}

	public void cuePointTypeIn(String multirequestToken){
		setToken("cuePointTypeIn", multirequestToken);
	}

	// cuePointSubTypeEqual:
	public Integer getCuePointSubTypeEqual(){
		return this.cuePointSubTypeEqual;
	}
	public void setCuePointSubTypeEqual(Integer cuePointSubTypeEqual){
		this.cuePointSubTypeEqual = cuePointSubTypeEqual;
	}

	public void cuePointSubTypeEqual(String multirequestToken){
		setToken("cuePointSubTypeEqual", multirequestToken);
	}


	public EntryCuePointSearchFilter() {
		super();
	}

	public EntryCuePointSearchFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		cuePointsFreeText = GsonParser.parseString(jsonObject.get("cuePointsFreeText"));
		cuePointTypeIn = GsonParser.parseString(jsonObject.get("cuePointTypeIn"));
		cuePointSubTypeEqual = GsonParser.parseInt(jsonObject.get("cuePointSubTypeEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryCuePointSearchFilter");
		kparams.add("cuePointsFreeText", this.cuePointsFreeText);
		kparams.add("cuePointTypeIn", this.cuePointTypeIn);
		kparams.add("cuePointSubTypeEqual", this.cuePointSubTypeEqual);
		return kparams;
	}

}

