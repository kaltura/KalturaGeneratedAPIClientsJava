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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UrlTokenizerVnpt.Tokenizer.class)
public class UrlTokenizerVnpt extends UrlTokenizer {
	
	public interface Tokenizer extends UrlTokenizer.Tokenizer {
		String tokenizationFormat();
		String shouldIncludeClientIp();
	}

	private Integer tokenizationFormat;
	private Boolean shouldIncludeClientIp;

	// tokenizationFormat:
	public Integer getTokenizationFormat(){
		return this.tokenizationFormat;
	}
	public void setTokenizationFormat(Integer tokenizationFormat){
		this.tokenizationFormat = tokenizationFormat;
	}

	public void tokenizationFormat(String multirequestToken){
		setToken("tokenizationFormat", multirequestToken);
	}

	// shouldIncludeClientIp:
	public Boolean getShouldIncludeClientIp(){
		return this.shouldIncludeClientIp;
	}
	public void setShouldIncludeClientIp(Boolean shouldIncludeClientIp){
		this.shouldIncludeClientIp = shouldIncludeClientIp;
	}

	public void shouldIncludeClientIp(String multirequestToken){
		setToken("shouldIncludeClientIp", multirequestToken);
	}


	public UrlTokenizerVnpt() {
		super();
	}

	public UrlTokenizerVnpt(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		tokenizationFormat = GsonParser.parseInt(jsonObject.get("tokenizationFormat"));
		shouldIncludeClientIp = GsonParser.parseBoolean(jsonObject.get("shouldIncludeClientIp"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUrlTokenizerVnpt");
		kparams.add("tokenizationFormat", this.tokenizationFormat);
		kparams.add("shouldIncludeClientIp", this.shouldIncludeClientIp);
		return kparams;
	}

}

