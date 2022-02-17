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
import com.kaltura.client.enums.UserType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserBaseFilter.Tokenizer.class)
public abstract class UserBaseFilter extends BaseUserFilter {
	
	public interface Tokenizer extends BaseUserFilter.Tokenizer {
		String typeEqual();
		String typeIn();
		String isAdminEqual();
		String firstNameStartsWith();
		String lastNameStartsWith();
	}

	private UserType typeEqual;
	private String typeIn;
	private Boolean isAdminEqual;
	private String firstNameStartsWith;
	private String lastNameStartsWith;

	// typeEqual:
	public UserType getTypeEqual(){
		return this.typeEqual;
	}
	public void setTypeEqual(UserType typeEqual){
		this.typeEqual = typeEqual;
	}

	public void typeEqual(String multirequestToken){
		setToken("typeEqual", multirequestToken);
	}

	// typeIn:
	public String getTypeIn(){
		return this.typeIn;
	}
	public void setTypeIn(String typeIn){
		this.typeIn = typeIn;
	}

	public void typeIn(String multirequestToken){
		setToken("typeIn", multirequestToken);
	}

	// isAdminEqual:
	public Boolean getIsAdminEqual(){
		return this.isAdminEqual;
	}
	public void setIsAdminEqual(Boolean isAdminEqual){
		this.isAdminEqual = isAdminEqual;
	}

	public void isAdminEqual(String multirequestToken){
		setToken("isAdminEqual", multirequestToken);
	}

	// firstNameStartsWith:
	public String getFirstNameStartsWith(){
		return this.firstNameStartsWith;
	}
	public void setFirstNameStartsWith(String firstNameStartsWith){
		this.firstNameStartsWith = firstNameStartsWith;
	}

	public void firstNameStartsWith(String multirequestToken){
		setToken("firstNameStartsWith", multirequestToken);
	}

	// lastNameStartsWith:
	public String getLastNameStartsWith(){
		return this.lastNameStartsWith;
	}
	public void setLastNameStartsWith(String lastNameStartsWith){
		this.lastNameStartsWith = lastNameStartsWith;
	}

	public void lastNameStartsWith(String multirequestToken){
		setToken("lastNameStartsWith", multirequestToken);
	}


	public UserBaseFilter() {
		super();
	}

	public UserBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		typeEqual = UserType.get(GsonParser.parseInt(jsonObject.get("typeEqual")));
		typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
		isAdminEqual = GsonParser.parseBoolean(jsonObject.get("isAdminEqual"));
		firstNameStartsWith = GsonParser.parseString(jsonObject.get("firstNameStartsWith"));
		lastNameStartsWith = GsonParser.parseString(jsonObject.get("lastNameStartsWith"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserBaseFilter");
		kparams.add("typeEqual", this.typeEqual);
		kparams.add("typeIn", this.typeIn);
		kparams.add("isAdminEqual", this.isAdminEqual);
		kparams.add("firstNameStartsWith", this.firstNameStartsWith);
		kparams.add("lastNameStartsWith", this.lastNameStartsWith);
		return kparams;
	}

}

