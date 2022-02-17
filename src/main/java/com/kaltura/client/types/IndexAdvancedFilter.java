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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(IndexAdvancedFilter.Tokenizer.class)
public class IndexAdvancedFilter extends SearchItem {
	
	public interface Tokenizer extends SearchItem.Tokenizer {
		String indexIdGreaterThan();
		String depthGreaterThanEqual();
	}

	private Integer indexIdGreaterThan;
	private Integer depthGreaterThanEqual;

	// indexIdGreaterThan:
	public Integer getIndexIdGreaterThan(){
		return this.indexIdGreaterThan;
	}
	public void setIndexIdGreaterThan(Integer indexIdGreaterThan){
		this.indexIdGreaterThan = indexIdGreaterThan;
	}

	public void indexIdGreaterThan(String multirequestToken){
		setToken("indexIdGreaterThan", multirequestToken);
	}

	// depthGreaterThanEqual:
	public Integer getDepthGreaterThanEqual(){
		return this.depthGreaterThanEqual;
	}
	public void setDepthGreaterThanEqual(Integer depthGreaterThanEqual){
		this.depthGreaterThanEqual = depthGreaterThanEqual;
	}

	public void depthGreaterThanEqual(String multirequestToken){
		setToken("depthGreaterThanEqual", multirequestToken);
	}


	public IndexAdvancedFilter() {
		super();
	}

	public IndexAdvancedFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		indexIdGreaterThan = GsonParser.parseInt(jsonObject.get("indexIdGreaterThan"));
		depthGreaterThanEqual = GsonParser.parseInt(jsonObject.get("depthGreaterThanEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIndexAdvancedFilter");
		kparams.add("indexIdGreaterThan", this.indexIdGreaterThan);
		kparams.add("depthGreaterThanEqual", this.depthGreaterThanEqual);
		return kparams;
	}

}

