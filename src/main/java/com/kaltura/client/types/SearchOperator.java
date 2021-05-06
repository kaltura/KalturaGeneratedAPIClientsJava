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
import com.kaltura.client.enums.SearchOperatorType;
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
@MultiRequestBuilder.Tokenizer(SearchOperator.Tokenizer.class)
public class SearchOperator extends SearchItem {
	
	public interface Tokenizer extends SearchItem.Tokenizer {
		String type();
		RequestBuilder.ListTokenizer<SearchItem.Tokenizer> items();
	}

	private SearchOperatorType type;
	private List<SearchItem> items;

	// type:
	public SearchOperatorType getType(){
		return this.type;
	}
	public void setType(SearchOperatorType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// items:
	public List<SearchItem> getItems(){
		return this.items;
	}
	public void setItems(List<SearchItem> items){
		this.items = items;
	}


	public SearchOperator() {
		super();
	}

	public SearchOperator(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		type = SearchOperatorType.get(GsonParser.parseInt(jsonObject.get("type")));
		items = GsonParser.parseArray(jsonObject.getAsJsonArray("items"), SearchItem.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSearchOperator");
		kparams.add("type", this.type);
		kparams.add("items", this.items);
		return kparams;
	}

}

