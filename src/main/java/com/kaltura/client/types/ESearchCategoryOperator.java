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
import com.kaltura.client.enums.ESearchOperatorType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchCategoryOperator.Tokenizer.class)
public class ESearchCategoryOperator extends ESearchCategoryBaseItem {
	
	public interface Tokenizer extends ESearchCategoryBaseItem.Tokenizer {
		String operator();
		RequestBuilder.ListTokenizer<ESearchCategoryBaseItem.Tokenizer> searchItems();
	}

	private ESearchOperatorType operator;
	private List<ESearchCategoryBaseItem> searchItems;

	// operator:
	public ESearchOperatorType getOperator(){
		return this.operator;
	}
	public void setOperator(ESearchOperatorType operator){
		this.operator = operator;
	}

	public void operator(String multirequestToken){
		setToken("operator", multirequestToken);
	}

	// searchItems:
	public List<ESearchCategoryBaseItem> getSearchItems(){
		return this.searchItems;
	}
	public void setSearchItems(List<ESearchCategoryBaseItem> searchItems){
		this.searchItems = searchItems;
	}


	public ESearchCategoryOperator() {
		super();
	}

	public ESearchCategoryOperator(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		operator = ESearchOperatorType.get(GsonParser.parseInt(jsonObject.get("operator")));
		searchItems = GsonParser.parseArray(jsonObject.getAsJsonArray("searchItems"), ESearchCategoryBaseItem.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchCategoryOperator");
		kparams.add("operator", this.operator);
		kparams.add("searchItems", this.searchItems);
		return kparams;
	}

}

