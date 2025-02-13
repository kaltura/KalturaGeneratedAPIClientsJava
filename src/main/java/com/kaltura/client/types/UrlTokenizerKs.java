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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UrlTokenizerKs.Tokenizer.class)
public class UrlTokenizerKs extends UrlTokenizer {
	
	public interface Tokenizer extends UrlTokenizer.Tokenizer {
		String usePath();
		String additionalUris();
	}

	private Boolean usePath;
	private String additionalUris;

	// usePath:
	public Boolean getUsePath(){
		return this.usePath;
	}
	public void setUsePath(Boolean usePath){
		this.usePath = usePath;
	}

	public void usePath(String multirequestToken){
		setToken("usePath", multirequestToken);
	}

	// additionalUris:
	public String getAdditionalUris(){
		return this.additionalUris;
	}
	public void setAdditionalUris(String additionalUris){
		this.additionalUris = additionalUris;
	}

	public void additionalUris(String multirequestToken){
		setToken("additionalUris", multirequestToken);
	}


	public UrlTokenizerKs() {
		super();
	}

	public UrlTokenizerKs(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		usePath = GsonParser.parseBoolean(jsonObject.get("usePath"));
		additionalUris = GsonParser.parseString(jsonObject.get("additionalUris"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUrlTokenizerKs");
		kparams.add("usePath", this.usePath);
		kparams.add("additionalUris", this.additionalUris);
		return kparams;
	}

}

