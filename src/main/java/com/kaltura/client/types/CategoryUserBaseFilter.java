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
import com.kaltura.client.enums.CategoryUserStatus;
import com.kaltura.client.enums.UpdateMethodType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CategoryUserBaseFilter.Tokenizer.class)
public abstract class CategoryUserBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String categoryIdEqual();
		String categoryIdIn();
		String userIdEqual();
		String userIdIn();
		String permissionLevelEqual();
		String permissionLevelIn();
		String statusEqual();
		String statusIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String updateMethodEqual();
		String updateMethodIn();
		String categoryFullIdsStartsWith();
		String categoryFullIdsEqual();
		String permissionNamesMatchAnd();
		String permissionNamesMatchOr();
		String permissionNamesNotContains();
	}

	private Integer categoryIdEqual;
	private String categoryIdIn;
	private String userIdEqual;
	private String userIdIn;
	private CategoryUserPermissionLevel permissionLevelEqual;
	private String permissionLevelIn;
	private CategoryUserStatus statusEqual;
	private String statusIn;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer updatedAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;
	private UpdateMethodType updateMethodEqual;
	private String updateMethodIn;
	private String categoryFullIdsStartsWith;
	private String categoryFullIdsEqual;
	private String permissionNamesMatchAnd;
	private String permissionNamesMatchOr;
	private String permissionNamesNotContains;

	// categoryIdEqual:
	public Integer getCategoryIdEqual(){
		return this.categoryIdEqual;
	}
	public void setCategoryIdEqual(Integer categoryIdEqual){
		this.categoryIdEqual = categoryIdEqual;
	}

	public void categoryIdEqual(String multirequestToken){
		setToken("categoryIdEqual", multirequestToken);
	}

	// categoryIdIn:
	public String getCategoryIdIn(){
		return this.categoryIdIn;
	}
	public void setCategoryIdIn(String categoryIdIn){
		this.categoryIdIn = categoryIdIn;
	}

	public void categoryIdIn(String multirequestToken){
		setToken("categoryIdIn", multirequestToken);
	}

	// userIdEqual:
	public String getUserIdEqual(){
		return this.userIdEqual;
	}
	public void setUserIdEqual(String userIdEqual){
		this.userIdEqual = userIdEqual;
	}

	public void userIdEqual(String multirequestToken){
		setToken("userIdEqual", multirequestToken);
	}

	// userIdIn:
	public String getUserIdIn(){
		return this.userIdIn;
	}
	public void setUserIdIn(String userIdIn){
		this.userIdIn = userIdIn;
	}

	public void userIdIn(String multirequestToken){
		setToken("userIdIn", multirequestToken);
	}

	// permissionLevelEqual:
	public CategoryUserPermissionLevel getPermissionLevelEqual(){
		return this.permissionLevelEqual;
	}
	public void setPermissionLevelEqual(CategoryUserPermissionLevel permissionLevelEqual){
		this.permissionLevelEqual = permissionLevelEqual;
	}

	public void permissionLevelEqual(String multirequestToken){
		setToken("permissionLevelEqual", multirequestToken);
	}

	// permissionLevelIn:
	public String getPermissionLevelIn(){
		return this.permissionLevelIn;
	}
	public void setPermissionLevelIn(String permissionLevelIn){
		this.permissionLevelIn = permissionLevelIn;
	}

	public void permissionLevelIn(String multirequestToken){
		setToken("permissionLevelIn", multirequestToken);
	}

	// statusEqual:
	public CategoryUserStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(CategoryUserStatus statusEqual){
		this.statusEqual = statusEqual;
	}

	public void statusEqual(String multirequestToken){
		setToken("statusEqual", multirequestToken);
	}

	// statusIn:
	public String getStatusIn(){
		return this.statusIn;
	}
	public void setStatusIn(String statusIn){
		this.statusIn = statusIn;
	}

	public void statusIn(String multirequestToken){
		setToken("statusIn", multirequestToken);
	}

	// createdAtGreaterThanOrEqual:
	public Integer getCreatedAtGreaterThanOrEqual(){
		return this.createdAtGreaterThanOrEqual;
	}
	public void setCreatedAtGreaterThanOrEqual(Integer createdAtGreaterThanOrEqual){
		this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
	}

	public void createdAtGreaterThanOrEqual(String multirequestToken){
		setToken("createdAtGreaterThanOrEqual", multirequestToken);
	}

	// createdAtLessThanOrEqual:
	public Integer getCreatedAtLessThanOrEqual(){
		return this.createdAtLessThanOrEqual;
	}
	public void setCreatedAtLessThanOrEqual(Integer createdAtLessThanOrEqual){
		this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
	}

	public void createdAtLessThanOrEqual(String multirequestToken){
		setToken("createdAtLessThanOrEqual", multirequestToken);
	}

	// updatedAtGreaterThanOrEqual:
	public Integer getUpdatedAtGreaterThanOrEqual(){
		return this.updatedAtGreaterThanOrEqual;
	}
	public void setUpdatedAtGreaterThanOrEqual(Integer updatedAtGreaterThanOrEqual){
		this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
	}

	public void updatedAtGreaterThanOrEqual(String multirequestToken){
		setToken("updatedAtGreaterThanOrEqual", multirequestToken);
	}

	// updatedAtLessThanOrEqual:
	public Integer getUpdatedAtLessThanOrEqual(){
		return this.updatedAtLessThanOrEqual;
	}
	public void setUpdatedAtLessThanOrEqual(Integer updatedAtLessThanOrEqual){
		this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
	}

	public void updatedAtLessThanOrEqual(String multirequestToken){
		setToken("updatedAtLessThanOrEqual", multirequestToken);
	}

	// updateMethodEqual:
	public UpdateMethodType getUpdateMethodEqual(){
		return this.updateMethodEqual;
	}
	public void setUpdateMethodEqual(UpdateMethodType updateMethodEqual){
		this.updateMethodEqual = updateMethodEqual;
	}

	public void updateMethodEqual(String multirequestToken){
		setToken("updateMethodEqual", multirequestToken);
	}

	// updateMethodIn:
	public String getUpdateMethodIn(){
		return this.updateMethodIn;
	}
	public void setUpdateMethodIn(String updateMethodIn){
		this.updateMethodIn = updateMethodIn;
	}

	public void updateMethodIn(String multirequestToken){
		setToken("updateMethodIn", multirequestToken);
	}

	// categoryFullIdsStartsWith:
	public String getCategoryFullIdsStartsWith(){
		return this.categoryFullIdsStartsWith;
	}
	public void setCategoryFullIdsStartsWith(String categoryFullIdsStartsWith){
		this.categoryFullIdsStartsWith = categoryFullIdsStartsWith;
	}

	public void categoryFullIdsStartsWith(String multirequestToken){
		setToken("categoryFullIdsStartsWith", multirequestToken);
	}

	// categoryFullIdsEqual:
	public String getCategoryFullIdsEqual(){
		return this.categoryFullIdsEqual;
	}
	public void setCategoryFullIdsEqual(String categoryFullIdsEqual){
		this.categoryFullIdsEqual = categoryFullIdsEqual;
	}

	public void categoryFullIdsEqual(String multirequestToken){
		setToken("categoryFullIdsEqual", multirequestToken);
	}

	// permissionNamesMatchAnd:
	public String getPermissionNamesMatchAnd(){
		return this.permissionNamesMatchAnd;
	}
	public void setPermissionNamesMatchAnd(String permissionNamesMatchAnd){
		this.permissionNamesMatchAnd = permissionNamesMatchAnd;
	}

	public void permissionNamesMatchAnd(String multirequestToken){
		setToken("permissionNamesMatchAnd", multirequestToken);
	}

	// permissionNamesMatchOr:
	public String getPermissionNamesMatchOr(){
		return this.permissionNamesMatchOr;
	}
	public void setPermissionNamesMatchOr(String permissionNamesMatchOr){
		this.permissionNamesMatchOr = permissionNamesMatchOr;
	}

	public void permissionNamesMatchOr(String multirequestToken){
		setToken("permissionNamesMatchOr", multirequestToken);
	}

	// permissionNamesNotContains:
	public String getPermissionNamesNotContains(){
		return this.permissionNamesNotContains;
	}
	public void setPermissionNamesNotContains(String permissionNamesNotContains){
		this.permissionNamesNotContains = permissionNamesNotContains;
	}

	public void permissionNamesNotContains(String multirequestToken){
		setToken("permissionNamesNotContains", multirequestToken);
	}


	public CategoryUserBaseFilter() {
		super();
	}

	public CategoryUserBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		categoryIdEqual = GsonParser.parseInt(jsonObject.get("categoryIdEqual"));
		categoryIdIn = GsonParser.parseString(jsonObject.get("categoryIdIn"));
		userIdEqual = GsonParser.parseString(jsonObject.get("userIdEqual"));
		userIdIn = GsonParser.parseString(jsonObject.get("userIdIn"));
		permissionLevelEqual = CategoryUserPermissionLevel.get(GsonParser.parseInt(jsonObject.get("permissionLevelEqual")));
		permissionLevelIn = GsonParser.parseString(jsonObject.get("permissionLevelIn"));
		statusEqual = CategoryUserStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
		updateMethodEqual = UpdateMethodType.get(GsonParser.parseInt(jsonObject.get("updateMethodEqual")));
		updateMethodIn = GsonParser.parseString(jsonObject.get("updateMethodIn"));
		categoryFullIdsStartsWith = GsonParser.parseString(jsonObject.get("categoryFullIdsStartsWith"));
		categoryFullIdsEqual = GsonParser.parseString(jsonObject.get("categoryFullIdsEqual"));
		permissionNamesMatchAnd = GsonParser.parseString(jsonObject.get("permissionNamesMatchAnd"));
		permissionNamesMatchOr = GsonParser.parseString(jsonObject.get("permissionNamesMatchOr"));
		permissionNamesNotContains = GsonParser.parseString(jsonObject.get("permissionNamesNotContains"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCategoryUserBaseFilter");
		kparams.add("categoryIdEqual", this.categoryIdEqual);
		kparams.add("categoryIdIn", this.categoryIdIn);
		kparams.add("userIdEqual", this.userIdEqual);
		kparams.add("userIdIn", this.userIdIn);
		kparams.add("permissionLevelEqual", this.permissionLevelEqual);
		kparams.add("permissionLevelIn", this.permissionLevelIn);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("updateMethodEqual", this.updateMethodEqual);
		kparams.add("updateMethodIn", this.updateMethodIn);
		kparams.add("categoryFullIdsStartsWith", this.categoryFullIdsStartsWith);
		kparams.add("categoryFullIdsEqual", this.categoryFullIdsEqual);
		kparams.add("permissionNamesMatchAnd", this.permissionNamesMatchAnd);
		kparams.add("permissionNamesMatchOr", this.permissionNamesMatchOr);
		kparams.add("permissionNamesNotContains", this.permissionNamesNotContains);
		return kparams;
	}

}

