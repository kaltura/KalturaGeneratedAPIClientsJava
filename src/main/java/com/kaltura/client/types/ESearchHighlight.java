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
// Copyright (C) 2006-2023  Kaltura Inc.
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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchHighlight.Tokenizer.class)
public class ESearchHighlight extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String fieldName();
		RequestBuilder.ListTokenizer<StringHolder.Tokenizer> hits();
	}

	private String fieldName;
	private List<StringHolder> hits;

	// fieldName:
	public String getFieldName(){
		return this.fieldName;
	}
	public void setFieldName(String fieldName){
		this.fieldName = fieldName;
	}

	public void fieldName(String multirequestToken){
		setToken("fieldName", multirequestToken);
	}

	// hits:
	public List<StringHolder> getHits(){
		return this.hits;
	}
	public void setHits(List<StringHolder> hits){
		this.hits = hits;
	}


	public ESearchHighlight() {
		super();
	}

	public ESearchHighlight(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fieldName = GsonParser.parseString(jsonObject.get("fieldName"));
		hits = GsonParser.parseArray(jsonObject.getAsJsonArray("hits"), StringHolder.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchHighlight");
		kparams.add("fieldName", this.fieldName);
		kparams.add("hits", this.hits);
		return kparams;
	}

}

