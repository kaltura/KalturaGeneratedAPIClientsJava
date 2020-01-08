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
@MultiRequestBuilder.Tokenizer(UrlTokenizerLevel3.Tokenizer.class)
public class UrlTokenizerLevel3 extends UrlTokenizer {
	
	public interface Tokenizer extends UrlTokenizer.Tokenizer {
		String paramName();
		String expiryName();
		String gen();
	}

	/**
	 * paramName
	 */
	private String paramName;
	/**
	 * expiryName
	 */
	private String expiryName;
	/**
	 * gen
	 */
	private String gen;

	// paramName:
	public String getParamName(){
		return this.paramName;
	}
	public void setParamName(String paramName){
		this.paramName = paramName;
	}

	public void paramName(String multirequestToken){
		setToken("paramName", multirequestToken);
	}

	// expiryName:
	public String getExpiryName(){
		return this.expiryName;
	}
	public void setExpiryName(String expiryName){
		this.expiryName = expiryName;
	}

	public void expiryName(String multirequestToken){
		setToken("expiryName", multirequestToken);
	}

	// gen:
	public String getGen(){
		return this.gen;
	}
	public void setGen(String gen){
		this.gen = gen;
	}

	public void gen(String multirequestToken){
		setToken("gen", multirequestToken);
	}


	public UrlTokenizerLevel3() {
		super();
	}

	public UrlTokenizerLevel3(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		paramName = GsonParser.parseString(jsonObject.get("paramName"));
		expiryName = GsonParser.parseString(jsonObject.get("expiryName"));
		gen = GsonParser.parseString(jsonObject.get("gen"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUrlTokenizerLevel3");
		kparams.add("paramName", this.paramName);
		kparams.add("expiryName", this.expiryName);
		kparams.add("gen", this.gen);
		return kparams;
	}

}

