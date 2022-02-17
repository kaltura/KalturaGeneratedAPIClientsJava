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
import com.kaltura.client.enums.CatalogItemLanguage;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VendorTranslationCatalogItemBaseFilter.Tokenizer.class)
public abstract class VendorTranslationCatalogItemBaseFilter extends VendorCaptionsCatalogItemFilter {
	
	public interface Tokenizer extends VendorCaptionsCatalogItemFilter.Tokenizer {
		String targetLanguageEqual();
		String targetLanguageIn();
	}

	private CatalogItemLanguage targetLanguageEqual;
	private String targetLanguageIn;

	// targetLanguageEqual:
	public CatalogItemLanguage getTargetLanguageEqual(){
		return this.targetLanguageEqual;
	}
	public void setTargetLanguageEqual(CatalogItemLanguage targetLanguageEqual){
		this.targetLanguageEqual = targetLanguageEqual;
	}

	public void targetLanguageEqual(String multirequestToken){
		setToken("targetLanguageEqual", multirequestToken);
	}

	// targetLanguageIn:
	public String getTargetLanguageIn(){
		return this.targetLanguageIn;
	}
	public void setTargetLanguageIn(String targetLanguageIn){
		this.targetLanguageIn = targetLanguageIn;
	}

	public void targetLanguageIn(String multirequestToken){
		setToken("targetLanguageIn", multirequestToken);
	}


	public VendorTranslationCatalogItemBaseFilter() {
		super();
	}

	public VendorTranslationCatalogItemBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		targetLanguageEqual = CatalogItemLanguage.get(GsonParser.parseString(jsonObject.get("targetLanguageEqual")));
		targetLanguageIn = GsonParser.parseString(jsonObject.get("targetLanguageIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorTranslationCatalogItemBaseFilter");
		kparams.add("targetLanguageEqual", this.targetLanguageEqual);
		kparams.add("targetLanguageIn", this.targetLanguageIn);
		return kparams;
	}

}

