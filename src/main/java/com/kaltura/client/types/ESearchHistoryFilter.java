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
// Copyright (C) 2006-2019  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(ESearchHistoryFilter.Tokenizer.class)
public class ESearchHistoryFilter extends ESearchBaseFilter {
	
	public interface Tokenizer extends ESearchBaseFilter.Tokenizer {
		String searchTermStartsWith();
		String searchedObjectIn();
	}

	private String searchTermStartsWith;
	private String searchedObjectIn;

	// searchTermStartsWith:
	public String getSearchTermStartsWith(){
		return this.searchTermStartsWith;
	}
	public void setSearchTermStartsWith(String searchTermStartsWith){
		this.searchTermStartsWith = searchTermStartsWith;
	}

	public void searchTermStartsWith(String multirequestToken){
		setToken("searchTermStartsWith", multirequestToken);
	}

	// searchedObjectIn:
	public String getSearchedObjectIn(){
		return this.searchedObjectIn;
	}
	public void setSearchedObjectIn(String searchedObjectIn){
		this.searchedObjectIn = searchedObjectIn;
	}

	public void searchedObjectIn(String multirequestToken){
		setToken("searchedObjectIn", multirequestToken);
	}


	public ESearchHistoryFilter() {
		super();
	}

	public ESearchHistoryFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		searchTermStartsWith = GsonParser.parseString(jsonObject.get("searchTermStartsWith"));
		searchedObjectIn = GsonParser.parseString(jsonObject.get("searchedObjectIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchHistoryFilter");
		kparams.add("searchTermStartsWith", this.searchTermStartsWith);
		kparams.add("searchedObjectIn", this.searchedObjectIn);
		return kparams;
	}

}

