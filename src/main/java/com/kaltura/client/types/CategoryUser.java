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
// Copyright (C) 2006-2017  Kaltura Inc.
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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CategoryUser.Tokenizer.class)
public class CategoryUser extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String categoryId();
		String userId();
		String partnerId();
		String permissionLevel();
		String status();
		String createdAt();
		String updatedAt();
		String updateMethod();
		String categoryFullIds();
		String permissionNames();
	}

	private Integer categoryId;
	/**
	 * User id
	 */
	private String userId;
	/**
	 * Partner id
	 */
	private Integer partnerId;
	/**
	 * Permission level
	 */
	private CategoryUserPermissionLevel permissionLevel;
	/**
	 * Status
	 */
	private CategoryUserStatus status;
	/**
	 * CategoryUser creation date as Unix timestamp (In seconds)
	 */
	private Integer createdAt;
	/**
	 * CategoryUser update date as Unix timestamp (In seconds)
	 */
	private Integer updatedAt;
	/**
	 * Update method can be either manual or automatic to distinguish between manual
	  operations (for example in KMC) on automatic - using bulk upload
	 */
	private UpdateMethodType updateMethod;
	/**
	 * The full ids of the Category
	 */
	private String categoryFullIds;
	/**
	 * Set of category-related permissions for the current category user.
	 */
	private String permissionNames;

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

	// userId:
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	public void setPartnerId(Integer partnerId){
		this.partnerId = partnerId;
	}

	public void partnerId(String multirequestToken){
		setToken("partnerId", multirequestToken);
	}

	// permissionLevel:
	public CategoryUserPermissionLevel getPermissionLevel(){
		return this.permissionLevel;
	}
	public void setPermissionLevel(CategoryUserPermissionLevel permissionLevel){
		this.permissionLevel = permissionLevel;
	}

	public void permissionLevel(String multirequestToken){
		setToken("permissionLevel", multirequestToken);
	}

	// status:
	public CategoryUserStatus getStatus(){
		return this.status;
	}
	public void setStatus(CategoryUserStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	public void setCreatedAt(Integer createdAt){
		this.createdAt = createdAt;
	}

	public void createdAt(String multirequestToken){
		setToken("createdAt", multirequestToken);
	}

	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	public void setUpdatedAt(Integer updatedAt){
		this.updatedAt = updatedAt;
	}

	public void updatedAt(String multirequestToken){
		setToken("updatedAt", multirequestToken);
	}

	// updateMethod:
	public UpdateMethodType getUpdateMethod(){
		return this.updateMethod;
	}
	public void setUpdateMethod(UpdateMethodType updateMethod){
		this.updateMethod = updateMethod;
	}

	public void updateMethod(String multirequestToken){
		setToken("updateMethod", multirequestToken);
	}

	// categoryFullIds:
	public String getCategoryFullIds(){
		return this.categoryFullIds;
	}
	public void setCategoryFullIds(String categoryFullIds){
		this.categoryFullIds = categoryFullIds;
	}

	public void categoryFullIds(String multirequestToken){
		setToken("categoryFullIds", multirequestToken);
	}

	// permissionNames:
	public String getPermissionNames(){
		return this.permissionNames;
	}
	public void setPermissionNames(String permissionNames){
		this.permissionNames = permissionNames;
	}

	public void permissionNames(String multirequestToken){
		setToken("permissionNames", multirequestToken);
	}


	public CategoryUser() {
		super();
	}

	public CategoryUser(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		categoryId = GsonParser.parseInt(jsonObject.get("categoryId"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		permissionLevel = CategoryUserPermissionLevel.get(GsonParser.parseInt(jsonObject.get("permissionLevel")));
		status = CategoryUserStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		updateMethod = UpdateMethodType.get(GsonParser.parseInt(jsonObject.get("updateMethod")));
		categoryFullIds = GsonParser.parseString(jsonObject.get("categoryFullIds"));
		permissionNames = GsonParser.parseString(jsonObject.get("permissionNames"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCategoryUser");
		kparams.add("categoryId", this.categoryId);
		kparams.add("userId", this.userId);
		kparams.add("permissionLevel", this.permissionLevel);
		kparams.add("updateMethod", this.updateMethod);
		kparams.add("permissionNames", this.permissionNames);
		return kparams;
	}

}

