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
import com.kaltura.client.enums.CatalogItemLanguage;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VendorTranslationCatalogItem.Tokenizer.class)
public class VendorTranslationCatalogItem extends VendorCaptionsCatalogItem {
	
	public interface Tokenizer extends VendorCaptionsCatalogItem.Tokenizer {
		String targetLanguage();
		String requireSource();
	}

	private CatalogItemLanguage targetLanguage;
	private Boolean requireSource;

	// targetLanguage:
	public CatalogItemLanguage getTargetLanguage(){
		return this.targetLanguage;
	}
	public void setTargetLanguage(CatalogItemLanguage targetLanguage){
		this.targetLanguage = targetLanguage;
	}

	public void targetLanguage(String multirequestToken){
		setToken("targetLanguage", multirequestToken);
	}

	// requireSource:
	public Boolean getRequireSource(){
		return this.requireSource;
	}
	public void setRequireSource(Boolean requireSource){
		this.requireSource = requireSource;
	}

	public void requireSource(String multirequestToken){
		setToken("requireSource", multirequestToken);
	}


	public VendorTranslationCatalogItem() {
		super();
	}

	public VendorTranslationCatalogItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		targetLanguage = CatalogItemLanguage.get(GsonParser.parseString(jsonObject.get("targetLanguage")));
		requireSource = GsonParser.parseBoolean(jsonObject.get("requireSource"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorTranslationCatalogItem");
		kparams.add("targetLanguage", this.targetLanguage);
		kparams.add("requireSource", this.requireSource);
		return kparams;
	}

}

