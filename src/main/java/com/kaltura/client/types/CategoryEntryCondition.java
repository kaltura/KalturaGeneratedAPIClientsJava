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
import com.kaltura.client.enums.CategoryUserPermissionLevel;
import com.kaltura.client.enums.SearchConditionComparison;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CategoryEntryCondition.Tokenizer.class)
public class CategoryEntryCondition extends Condition {
	
	public interface Tokenizer extends Condition.Tokenizer {
		String categoryId();
		String categoryIds();
		String categoryUserPermission();
		String comparison();
	}

	/**
	 * Category id to check condition for
	 */
	private Integer categoryId;
	/**
	 * Category id's to check condition for
	 */
	private String categoryIds;
	/**
	 * Minimum category user level permission to validate
	 */
	private CategoryUserPermissionLevel categoryUserPermission;
	/**
	 * Comparing operator
	 */
	private SearchConditionComparison comparison;

	// categoryId:
	public Integer getCategoryId(){
		return this.categoryId;
	}
	public void setCategoryId(Integer categoryId){
		this.categoryId = categoryId;
	}

	public void categoryId(String multirequestToken){
		setToken("categoryId", multirequestToken);
	}

	// categoryIds:
	public String getCategoryIds(){
		return this.categoryIds;
	}
	public void setCategoryIds(String categoryIds){
		this.categoryIds = categoryIds;
	}

	public void categoryIds(String multirequestToken){
		setToken("categoryIds", multirequestToken);
	}

	// categoryUserPermission:
	public CategoryUserPermissionLevel getCategoryUserPermission(){
		return this.categoryUserPermission;
	}
	public void setCategoryUserPermission(CategoryUserPermissionLevel categoryUserPermission){
		this.categoryUserPermission = categoryUserPermission;
	}

	public void categoryUserPermission(String multirequestToken){
		setToken("categoryUserPermission", multirequestToken);
	}

	// comparison:
	public SearchConditionComparison getComparison(){
		return this.comparison;
	}
	public void setComparison(SearchConditionComparison comparison){
		this.comparison = comparison;
	}

	public void comparison(String multirequestToken){
		setToken("comparison", multirequestToken);
	}


	public CategoryEntryCondition() {
		super();
	}

	public CategoryEntryCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		categoryId = GsonParser.parseInt(jsonObject.get("categoryId"));
		categoryIds = GsonParser.parseString(jsonObject.get("categoryIds"));
		categoryUserPermission = CategoryUserPermissionLevel.get(GsonParser.parseInt(jsonObject.get("categoryUserPermission")));
		comparison = SearchConditionComparison.get(GsonParser.parseString(jsonObject.get("comparison")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCategoryEntryCondition");
		kparams.add("categoryId", this.categoryId);
		kparams.add("categoryIds", this.categoryIds);
		kparams.add("categoryUserPermission", this.categoryUserPermission);
		kparams.add("comparison", this.comparison);
		return kparams;
	}

}

