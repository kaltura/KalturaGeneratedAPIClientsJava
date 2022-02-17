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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchRange.Tokenizer.class)
public class ESearchRange extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String greaterThanOrEqual();
		String lessThanOrEqual();
		String greaterThan();
		String lessThan();
	}

	private Integer greaterThanOrEqual;
	private Integer lessThanOrEqual;
	private Integer greaterThan;
	private Integer lessThan;

	// greaterThanOrEqual:
	public Integer getGreaterThanOrEqual(){
		return this.greaterThanOrEqual;
	}
	public void setGreaterThanOrEqual(Integer greaterThanOrEqual){
		this.greaterThanOrEqual = greaterThanOrEqual;
	}

	public void greaterThanOrEqual(String multirequestToken){
		setToken("greaterThanOrEqual", multirequestToken);
	}

	// lessThanOrEqual:
	public Integer getLessThanOrEqual(){
		return this.lessThanOrEqual;
	}
	public void setLessThanOrEqual(Integer lessThanOrEqual){
		this.lessThanOrEqual = lessThanOrEqual;
	}

	public void lessThanOrEqual(String multirequestToken){
		setToken("lessThanOrEqual", multirequestToken);
	}

	// greaterThan:
	public Integer getGreaterThan(){
		return this.greaterThan;
	}
	public void setGreaterThan(Integer greaterThan){
		this.greaterThan = greaterThan;
	}

	public void greaterThan(String multirequestToken){
		setToken("greaterThan", multirequestToken);
	}

	// lessThan:
	public Integer getLessThan(){
		return this.lessThan;
	}
	public void setLessThan(Integer lessThan){
		this.lessThan = lessThan;
	}

	public void lessThan(String multirequestToken){
		setToken("lessThan", multirequestToken);
	}


	public ESearchRange() {
		super();
	}

	public ESearchRange(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		greaterThanOrEqual = GsonParser.parseInt(jsonObject.get("greaterThanOrEqual"));
		lessThanOrEqual = GsonParser.parseInt(jsonObject.get("lessThanOrEqual"));
		greaterThan = GsonParser.parseInt(jsonObject.get("greaterThan"));
		lessThan = GsonParser.parseInt(jsonObject.get("lessThan"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchRange");
		kparams.add("greaterThanOrEqual", this.greaterThanOrEqual);
		kparams.add("lessThanOrEqual", this.lessThanOrEqual);
		kparams.add("greaterThan", this.greaterThan);
		kparams.add("lessThan", this.lessThan);
		return kparams;
	}

}

