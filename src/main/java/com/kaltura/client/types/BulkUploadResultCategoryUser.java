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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUploadResultCategoryUser.Tokenizer.class)
public class BulkUploadResultCategoryUser extends BulkUploadResult {
	
	public interface Tokenizer extends BulkUploadResult.Tokenizer {
		String categoryId();
		String categoryReferenceId();
		String userId();
		String permissionLevel();
		String updateMethod();
		String requiredObjectStatus();
	}

	private Integer categoryId;
	private String categoryReferenceId;
	private String userId;
	private Integer permissionLevel;
	private Integer updateMethod;
	private Integer requiredObjectStatus;

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

	// categoryReferenceId:
	public String getCategoryReferenceId(){
		return this.categoryReferenceId;
	}
	public void setCategoryReferenceId(String categoryReferenceId){
		this.categoryReferenceId = categoryReferenceId;
	}

	public void categoryReferenceId(String multirequestToken){
		setToken("categoryReferenceId", multirequestToken);
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

	// permissionLevel:
	public Integer getPermissionLevel(){
		return this.permissionLevel;
	}
	public void setPermissionLevel(Integer permissionLevel){
		this.permissionLevel = permissionLevel;
	}

	public void permissionLevel(String multirequestToken){
		setToken("permissionLevel", multirequestToken);
	}

	// updateMethod:
	public Integer getUpdateMethod(){
		return this.updateMethod;
	}
	public void setUpdateMethod(Integer updateMethod){
		this.updateMethod = updateMethod;
	}

	public void updateMethod(String multirequestToken){
		setToken("updateMethod", multirequestToken);
	}

	// requiredObjectStatus:
	public Integer getRequiredObjectStatus(){
		return this.requiredObjectStatus;
	}
	public void setRequiredObjectStatus(Integer requiredObjectStatus){
		this.requiredObjectStatus = requiredObjectStatus;
	}

	public void requiredObjectStatus(String multirequestToken){
		setToken("requiredObjectStatus", multirequestToken);
	}


	public BulkUploadResultCategoryUser() {
		super();
	}

	public BulkUploadResultCategoryUser(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		categoryId = GsonParser.parseInt(jsonObject.get("categoryId"));
		categoryReferenceId = GsonParser.parseString(jsonObject.get("categoryReferenceId"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		permissionLevel = GsonParser.parseInt(jsonObject.get("permissionLevel"));
		updateMethod = GsonParser.parseInt(jsonObject.get("updateMethod"));
		requiredObjectStatus = GsonParser.parseInt(jsonObject.get("requiredObjectStatus"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUploadResultCategoryUser");
		kparams.add("categoryId", this.categoryId);
		kparams.add("categoryReferenceId", this.categoryReferenceId);
		kparams.add("userId", this.userId);
		kparams.add("permissionLevel", this.permissionLevel);
		kparams.add("updateMethod", this.updateMethod);
		kparams.add("requiredObjectStatus", this.requiredObjectStatus);
		return kparams;
	}

}

