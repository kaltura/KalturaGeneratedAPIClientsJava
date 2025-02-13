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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AppRole.Tokenizer.class)
public abstract class AppRole extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String appGuid();
		String userRoleId();
		String createdAt();
		String updatedAt();
	}

	private String appGuid;
	private Integer userRoleId;
	/**
	 * Entry creation date as Unix timestamp (In seconds)
	 */
	private Long createdAt;
	/**
	 * Entry updated date as Unix timestamp (In seconds)
	 */
	private Long updatedAt;

	// appGuid:
	public String getAppGuid(){
		return this.appGuid;
	}
	public void setAppGuid(String appGuid){
		this.appGuid = appGuid;
	}

	public void appGuid(String multirequestToken){
		setToken("appGuid", multirequestToken);
	}

	// userRoleId:
	public Integer getUserRoleId(){
		return this.userRoleId;
	}
	public void setUserRoleId(Integer userRoleId){
		this.userRoleId = userRoleId;
	}

	public void userRoleId(String multirequestToken){
		setToken("userRoleId", multirequestToken);
	}

	// createdAt:
	public Long getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Long getUpdatedAt(){
		return this.updatedAt;
	}

	public AppRole() {
		super();
	}

	public AppRole(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		appGuid = GsonParser.parseString(jsonObject.get("appGuid"));
		userRoleId = GsonParser.parseInt(jsonObject.get("userRoleId"));
		createdAt = GsonParser.parseLong(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseLong(jsonObject.get("updatedAt"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAppRole");
		kparams.add("appGuid", this.appGuid);
		kparams.add("userRoleId", this.userRoleId);
		return kparams;
	}

}

