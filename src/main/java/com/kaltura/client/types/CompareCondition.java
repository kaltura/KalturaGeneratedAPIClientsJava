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
import com.kaltura.client.enums.SearchConditionComparison;
import com.kaltura.client.types.IntegerValue;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CompareCondition.Tokenizer.class)
public abstract class CompareCondition extends Condition {
	
	public interface Tokenizer extends Condition.Tokenizer {
		IntegerValue.Tokenizer value();
		String comparison();
	}

	/**
	 * Value to evaluate against the field and operator
	 */
	private IntegerValue value;
	/**
	 * Comparing operator
	 */
	private SearchConditionComparison comparison;

	// value:
	public IntegerValue getValue(){
		return this.value;
	}
	public void setValue(IntegerValue value){
		this.value = value;
	}

	// comparison:
	public SearchConditionComparison getComparison(){
		return this.comparison;
	}
	public void setComparison(SearchConditionComparison comparison){
		this.comparison = comparison;
	}

	public void comparison(String multirequestToken){
		setToken("comparison", multirequestToken);
	}


	public CompareCondition() {
		super();
	}

	public CompareCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		value = GsonParser.parseObject(jsonObject.getAsJsonObject("value"), IntegerValue.class);
		comparison = SearchConditionComparison.get(GsonParser.parseString(jsonObject.get("comparison")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCompareCondition");
		kparams.add("value", this.value);
		kparams.add("comparison", this.comparison);
		return kparams;
	}

}

