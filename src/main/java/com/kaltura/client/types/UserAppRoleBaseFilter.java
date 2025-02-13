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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserAppRoleBaseFilter.Tokenizer.class)
public abstract class UserAppRoleBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String appGuidEqual();
		String appGuidIn();
		String userRoleIdEqual();
		String userRoleIdIn();
		String createdAtLessThanOrEqual();
		String createdAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
	}

	/**
	 * The app-registry id to search for
	 */
	private String appGuidEqual;
	/**
	 * Apps-registries ids csv list
	 */
	private String appGuidIn;
	/**
	 * The user-role id to search for
	 */
	private String userRoleIdEqual;
	/**
	 * Users-roles ids csv list
	 */
	private String userRoleIdIn;
	/**
	 * Unix timestamp
	 */
	private Long createdAtLessThanOrEqual;
	/**
	 * Unix timestamp
	 */
	private Long createdAtGreaterThanOrEqual;
	/**
	 * Unix timestamp
	 */
	private Long updatedAtLessThanOrEqual;
	/**
	 * Unix timestamp
	 */
	private Long updatedAtGreaterThanOrEqual;

	// appGuidEqual:
	public String getAppGuidEqual(){
		return this.appGuidEqual;
	}
	public void setAppGuidEqual(String appGuidEqual){
		this.appGuidEqual = appGuidEqual;
	}

	public void appGuidEqual(String multirequestToken){
		setToken("appGuidEqual", multirequestToken);
	}

	// appGuidIn:
	public String getAppGuidIn(){
		return this.appGuidIn;
	}
	public void setAppGuidIn(String appGuidIn){
		this.appGuidIn = appGuidIn;
	}

	public void appGuidIn(String multirequestToken){
		setToken("appGuidIn", multirequestToken);
	}

	// userRoleIdEqual:
	public String getUserRoleIdEqual(){
		return this.userRoleIdEqual;
	}
	public void setUserRoleIdEqual(String userRoleIdEqual){
		this.userRoleIdEqual = userRoleIdEqual;
	}

	public void userRoleIdEqual(String multirequestToken){
		setToken("userRoleIdEqual", multirequestToken);
	}

	// userRoleIdIn:
	public String getUserRoleIdIn(){
		return this.userRoleIdIn;
	}
	public void setUserRoleIdIn(String userRoleIdIn){
		this.userRoleIdIn = userRoleIdIn;
	}

	public void userRoleIdIn(String multirequestToken){
		setToken("userRoleIdIn", multirequestToken);
	}

	// createdAtLessThanOrEqual:
	public Long getCreatedAtLessThanOrEqual(){
		return this.createdAtLessThanOrEqual;
	}
	public void setCreatedAtLessThanOrEqual(Long createdAtLessThanOrEqual){
		this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
	}

	public void createdAtLessThanOrEqual(String multirequestToken){
		setToken("createdAtLessThanOrEqual", multirequestToken);
	}

	// createdAtGreaterThanOrEqual:
	public Long getCreatedAtGreaterThanOrEqual(){
		return this.createdAtGreaterThanOrEqual;
	}
	public void setCreatedAtGreaterThanOrEqual(Long createdAtGreaterThanOrEqual){
		this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
	}

	public void createdAtGreaterThanOrEqual(String multirequestToken){
		setToken("createdAtGreaterThanOrEqual", multirequestToken);
	}

	// updatedAtLessThanOrEqual:
	public Long getUpdatedAtLessThanOrEqual(){
		return this.updatedAtLessThanOrEqual;
	}
	public void setUpdatedAtLessThanOrEqual(Long updatedAtLessThanOrEqual){
		this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
	}

	public void updatedAtLessThanOrEqual(String multirequestToken){
		setToken("updatedAtLessThanOrEqual", multirequestToken);
	}

	// updatedAtGreaterThanOrEqual:
	public Long getUpdatedAtGreaterThanOrEqual(){
		return this.updatedAtGreaterThanOrEqual;
	}
	public void setUpdatedAtGreaterThanOrEqual(Long updatedAtGreaterThanOrEqual){
		this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
	}

	public void updatedAtGreaterThanOrEqual(String multirequestToken){
		setToken("updatedAtGreaterThanOrEqual", multirequestToken);
	}


	public UserAppRoleBaseFilter() {
		super();
	}

	public UserAppRoleBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		appGuidEqual = GsonParser.parseString(jsonObject.get("appGuidEqual"));
		appGuidIn = GsonParser.parseString(jsonObject.get("appGuidIn"));
		userRoleIdEqual = GsonParser.parseString(jsonObject.get("userRoleIdEqual"));
		userRoleIdIn = GsonParser.parseString(jsonObject.get("userRoleIdIn"));
		createdAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtLessThanOrEqual"));
		createdAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtGreaterThanOrEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserAppRoleBaseFilter");
		kparams.add("appGuidEqual", this.appGuidEqual);
		kparams.add("appGuidIn", this.appGuidIn);
		kparams.add("userRoleIdEqual", this.userRoleIdEqual);
		kparams.add("userRoleIdIn", this.userRoleIdIn);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		return kparams;
	}

}

