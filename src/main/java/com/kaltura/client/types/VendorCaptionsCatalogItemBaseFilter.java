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
import com.kaltura.client.enums.CatalogItemLanguage;
import com.kaltura.client.enums.VendorCatalogItemOutputFormat;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VendorCaptionsCatalogItemBaseFilter.Tokenizer.class)
public abstract class VendorCaptionsCatalogItemBaseFilter extends VendorCatalogItemFilter {
	
	public interface Tokenizer extends VendorCatalogItemFilter.Tokenizer {
		String sourceLanguageEqual();
		String sourceLanguageIn();
		String outputFormatEqual();
		String outputFormatIn();
	}

	private CatalogItemLanguage sourceLanguageEqual;
	private String sourceLanguageIn;
	private VendorCatalogItemOutputFormat outputFormatEqual;
	private String outputFormatIn;

	// sourceLanguageEqual:
	public CatalogItemLanguage getSourceLanguageEqual(){
		return this.sourceLanguageEqual;
	}
	public void setSourceLanguageEqual(CatalogItemLanguage sourceLanguageEqual){
		this.sourceLanguageEqual = sourceLanguageEqual;
	}

	public void sourceLanguageEqual(String multirequestToken){
		setToken("sourceLanguageEqual", multirequestToken);
	}

	// sourceLanguageIn:
	public String getSourceLanguageIn(){
		return this.sourceLanguageIn;
	}
	public void setSourceLanguageIn(String sourceLanguageIn){
		this.sourceLanguageIn = sourceLanguageIn;
	}

	public void sourceLanguageIn(String multirequestToken){
		setToken("sourceLanguageIn", multirequestToken);
	}

	// outputFormatEqual:
	public VendorCatalogItemOutputFormat getOutputFormatEqual(){
		return this.outputFormatEqual;
	}
	public void setOutputFormatEqual(VendorCatalogItemOutputFormat outputFormatEqual){
		this.outputFormatEqual = outputFormatEqual;
	}

	public void outputFormatEqual(String multirequestToken){
		setToken("outputFormatEqual", multirequestToken);
	}

	// outputFormatIn:
	public String getOutputFormatIn(){
		return this.outputFormatIn;
	}
	public void setOutputFormatIn(String outputFormatIn){
		this.outputFormatIn = outputFormatIn;
	}

	public void outputFormatIn(String multirequestToken){
		setToken("outputFormatIn", multirequestToken);
	}


	public VendorCaptionsCatalogItemBaseFilter() {
		super();
	}

	public VendorCaptionsCatalogItemBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		sourceLanguageEqual = CatalogItemLanguage.get(GsonParser.parseString(jsonObject.get("sourceLanguageEqual")));
		sourceLanguageIn = GsonParser.parseString(jsonObject.get("sourceLanguageIn"));
		outputFormatEqual = VendorCatalogItemOutputFormat.get(GsonParser.parseInt(jsonObject.get("outputFormatEqual")));
		outputFormatIn = GsonParser.parseString(jsonObject.get("outputFormatIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorCaptionsCatalogItemBaseFilter");
		kparams.add("sourceLanguageEqual", this.sourceLanguageEqual);
		kparams.add("sourceLanguageIn", this.sourceLanguageIn);
		kparams.add("outputFormatEqual", this.outputFormatEqual);
		kparams.add("outputFormatIn", this.outputFormatIn);
		return kparams;
	}

}

