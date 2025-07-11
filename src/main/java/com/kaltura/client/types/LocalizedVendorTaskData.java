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
import com.kaltura.client.enums.Language;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LocalizedVendorTaskData.Tokenizer.class)
public class LocalizedVendorTaskData extends VendorTaskData {
	
	public interface Tokenizer extends VendorTaskData.Tokenizer {
		String outputLanguage();
		String outputJson();
	}

	/**
	 * Language code
	 */
	private Language outputLanguage;
	/**
	 * result as JSON string.
	 */
	private String outputJson;

	// outputLanguage:
	public Language getOutputLanguage(){
		return this.outputLanguage;
	}
	public void setOutputLanguage(Language outputLanguage){
		this.outputLanguage = outputLanguage;
	}

	public void outputLanguage(String multirequestToken){
		setToken("outputLanguage", multirequestToken);
	}

	// outputJson:
	public String getOutputJson(){
		return this.outputJson;
	}
	public void setOutputJson(String outputJson){
		this.outputJson = outputJson;
	}

	public void outputJson(String multirequestToken){
		setToken("outputJson", multirequestToken);
	}


	public LocalizedVendorTaskData() {
		super();
	}

	public LocalizedVendorTaskData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		outputLanguage = Language.get(GsonParser.parseString(jsonObject.get("outputLanguage")));
		outputJson = GsonParser.parseString(jsonObject.get("outputJson"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLocalizedVendorTaskData");
		kparams.add("outputLanguage", this.outputLanguage);
		kparams.add("outputJson", this.outputJson);
		return kparams;
	}

}

