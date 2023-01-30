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
import com.kaltura.client.enums.VendorServiceFeature;
import com.kaltura.client.enums.VendorServiceTurnAroundTime;
import com.kaltura.client.enums.VendorServiceType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CatalogItemAdvancedFilter.Tokenizer.class)
public class CatalogItemAdvancedFilter extends SearchItem {
	
	public interface Tokenizer extends SearchItem.Tokenizer {
		String serviceTypeEqual();
		String serviceTypeIn();
		String serviceFeatureEqual();
		String serviceFeatureIn();
		String turnAroundTimeEqual();
		String turnAroundTimeIn();
		String sourceLanguageEqual();
		String targetLanguageEqual();
	}

	private VendorServiceType serviceTypeEqual;
	private String serviceTypeIn;
	private VendorServiceFeature serviceFeatureEqual;
	private String serviceFeatureIn;
	private VendorServiceTurnAroundTime turnAroundTimeEqual;
	private String turnAroundTimeIn;
	private CatalogItemLanguage sourceLanguageEqual;
	private CatalogItemLanguage targetLanguageEqual;

	// serviceTypeEqual:
	public VendorServiceType getServiceTypeEqual(){
		return this.serviceTypeEqual;
	}
	public void setServiceTypeEqual(VendorServiceType serviceTypeEqual){
		this.serviceTypeEqual = serviceTypeEqual;
	}

	public void serviceTypeEqual(String multirequestToken){
		setToken("serviceTypeEqual", multirequestToken);
	}

	// serviceTypeIn:
	public String getServiceTypeIn(){
		return this.serviceTypeIn;
	}
	public void setServiceTypeIn(String serviceTypeIn){
		this.serviceTypeIn = serviceTypeIn;
	}

	public void serviceTypeIn(String multirequestToken){
		setToken("serviceTypeIn", multirequestToken);
	}

	// serviceFeatureEqual:
	public VendorServiceFeature getServiceFeatureEqual(){
		return this.serviceFeatureEqual;
	}
	public void setServiceFeatureEqual(VendorServiceFeature serviceFeatureEqual){
		this.serviceFeatureEqual = serviceFeatureEqual;
	}

	public void serviceFeatureEqual(String multirequestToken){
		setToken("serviceFeatureEqual", multirequestToken);
	}

	// serviceFeatureIn:
	public String getServiceFeatureIn(){
		return this.serviceFeatureIn;
	}
	public void setServiceFeatureIn(String serviceFeatureIn){
		this.serviceFeatureIn = serviceFeatureIn;
	}

	public void serviceFeatureIn(String multirequestToken){
		setToken("serviceFeatureIn", multirequestToken);
	}

	// turnAroundTimeEqual:
	public VendorServiceTurnAroundTime getTurnAroundTimeEqual(){
		return this.turnAroundTimeEqual;
	}
	public void setTurnAroundTimeEqual(VendorServiceTurnAroundTime turnAroundTimeEqual){
		this.turnAroundTimeEqual = turnAroundTimeEqual;
	}

	public void turnAroundTimeEqual(String multirequestToken){
		setToken("turnAroundTimeEqual", multirequestToken);
	}

	// turnAroundTimeIn:
	public String getTurnAroundTimeIn(){
		return this.turnAroundTimeIn;
	}
	public void setTurnAroundTimeIn(String turnAroundTimeIn){
		this.turnAroundTimeIn = turnAroundTimeIn;
	}

	public void turnAroundTimeIn(String multirequestToken){
		setToken("turnAroundTimeIn", multirequestToken);
	}

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


	public CatalogItemAdvancedFilter() {
		super();
	}

	public CatalogItemAdvancedFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		serviceTypeEqual = VendorServiceType.get(GsonParser.parseInt(jsonObject.get("serviceTypeEqual")));
		serviceTypeIn = GsonParser.parseString(jsonObject.get("serviceTypeIn"));
		serviceFeatureEqual = VendorServiceFeature.get(GsonParser.parseInt(jsonObject.get("serviceFeatureEqual")));
		serviceFeatureIn = GsonParser.parseString(jsonObject.get("serviceFeatureIn"));
		turnAroundTimeEqual = VendorServiceTurnAroundTime.get(GsonParser.parseInt(jsonObject.get("turnAroundTimeEqual")));
		turnAroundTimeIn = GsonParser.parseString(jsonObject.get("turnAroundTimeIn"));
		sourceLanguageEqual = CatalogItemLanguage.get(GsonParser.parseString(jsonObject.get("sourceLanguageEqual")));
		targetLanguageEqual = CatalogItemLanguage.get(GsonParser.parseString(jsonObject.get("targetLanguageEqual")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCatalogItemAdvancedFilter");
		kparams.add("serviceTypeEqual", this.serviceTypeEqual);
		kparams.add("serviceTypeIn", this.serviceTypeIn);
		kparams.add("serviceFeatureEqual", this.serviceFeatureEqual);
		kparams.add("serviceFeatureIn", this.serviceFeatureIn);
		kparams.add("turnAroundTimeEqual", this.turnAroundTimeEqual);
		kparams.add("turnAroundTimeIn", this.turnAroundTimeIn);
		kparams.add("sourceLanguageEqual", this.sourceLanguageEqual);
		kparams.add("targetLanguageEqual", this.targetLanguageEqual);
		return kparams;
	}

}

