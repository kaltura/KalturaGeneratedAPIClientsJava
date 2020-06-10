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
@MultiRequestBuilder.Tokenizer(BaseEntryFilter.Tokenizer.class)
public class BaseEntryFilter extends BaseEntryBaseFilter {
	
	public interface Tokenizer extends BaseEntryBaseFilter.Tokenizer {
		String freeText();
		String excludedFreeTextGroups();
		String isRoot();
		String categoriesFullNameIn();
		String categoryAncestorIdIn();
		String redirectFromEntryId();
	}

	private String freeText;
	private String excludedFreeTextGroups;
	private Boolean isRoot;
	private String categoriesFullNameIn;
	/**
	 * All entries within this categoy or in child categories
	 */
	private String categoryAncestorIdIn;
	/**
	 * The id of the original entry
	 */
	private String redirectFromEntryId;

	// freeText:
	public String getFreeText(){
		return this.freeText;
	}
	public void setFreeText(String freeText){
		this.freeText = freeText;
	}

	public void freeText(String multirequestToken){
		setToken("freeText", multirequestToken);
	}

	// excludedFreeTextGroups:
	public String getExcludedFreeTextGroups(){
		return this.excludedFreeTextGroups;
	}
	public void setExcludedFreeTextGroups(String excludedFreeTextGroups){
		this.excludedFreeTextGroups = excludedFreeTextGroups;
	}

	public void excludedFreeTextGroups(String multirequestToken){
		setToken("excludedFreeTextGroups", multirequestToken);
	}

	// isRoot:
	public Boolean getIsRoot(){
		return this.isRoot;
	}
	public void setIsRoot(Boolean isRoot){
		this.isRoot = isRoot;
	}

	public void isRoot(String multirequestToken){
		setToken("isRoot", multirequestToken);
	}

	// categoriesFullNameIn:
	public String getCategoriesFullNameIn(){
		return this.categoriesFullNameIn;
	}
	public void setCategoriesFullNameIn(String categoriesFullNameIn){
		this.categoriesFullNameIn = categoriesFullNameIn;
	}

	public void categoriesFullNameIn(String multirequestToken){
		setToken("categoriesFullNameIn", multirequestToken);
	}

	// categoryAncestorIdIn:
	public String getCategoryAncestorIdIn(){
		return this.categoryAncestorIdIn;
	}
	public void setCategoryAncestorIdIn(String categoryAncestorIdIn){
		this.categoryAncestorIdIn = categoryAncestorIdIn;
	}

	public void categoryAncestorIdIn(String multirequestToken){
		setToken("categoryAncestorIdIn", multirequestToken);
	}

	// redirectFromEntryId:
	public String getRedirectFromEntryId(){
		return this.redirectFromEntryId;
	}
	public void setRedirectFromEntryId(String redirectFromEntryId){
		this.redirectFromEntryId = redirectFromEntryId;
	}

	public void redirectFromEntryId(String multirequestToken){
		setToken("redirectFromEntryId", multirequestToken);
	}


	public BaseEntryFilter() {
		super();
	}

	public BaseEntryFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		freeText = GsonParser.parseString(jsonObject.get("freeText"));
		excludedFreeTextGroups = GsonParser.parseString(jsonObject.get("excludedFreeTextGroups"));
		isRoot = GsonParser.parseBoolean(jsonObject.get("isRoot"));
		categoriesFullNameIn = GsonParser.parseString(jsonObject.get("categoriesFullNameIn"));
		categoryAncestorIdIn = GsonParser.parseString(jsonObject.get("categoryAncestorIdIn"));
		redirectFromEntryId = GsonParser.parseString(jsonObject.get("redirectFromEntryId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBaseEntryFilter");
		kparams.add("freeText", this.freeText);
		kparams.add("excludedFreeTextGroups", this.excludedFreeTextGroups);
		kparams.add("isRoot", this.isRoot);
		kparams.add("categoriesFullNameIn", this.categoriesFullNameIn);
		kparams.add("categoryAncestorIdIn", this.categoryAncestorIdIn);
		kparams.add("redirectFromEntryId", this.redirectFromEntryId);
		return kparams;
	}

}

