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
// Copyright (C) 2006-2021  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(UserFilter.Tokenizer.class)
public class UserFilter extends UserBaseFilter {
	
	public interface Tokenizer extends UserBaseFilter.Tokenizer {
		String idOrScreenNameStartsWith();
		String idEqual();
		String idIn();
		String loginEnabledEqual();
		String roleIdEqual();
		String roleIdsEqual();
		String roleIdsIn();
		String firstNameOrLastNameStartsWith();
		String permissionNamesMultiLikeOr();
		String permissionNamesMultiLikeAnd();
	}

	private String idOrScreenNameStartsWith;
	private String idEqual;
	private String idIn;
	private Boolean loginEnabledEqual;
	private String roleIdEqual;
	private String roleIdsEqual;
	private String roleIdsIn;
	private String firstNameOrLastNameStartsWith;
	/**
	 * Permission names filter expression
	 */
	private String permissionNamesMultiLikeOr;
	/**
	 * Permission names filter expression
	 */
	private String permissionNamesMultiLikeAnd;

	// idOrScreenNameStartsWith:
	public String getIdOrScreenNameStartsWith(){
		return this.idOrScreenNameStartsWith;
	}
	public void setIdOrScreenNameStartsWith(String idOrScreenNameStartsWith){
		this.idOrScreenNameStartsWith = idOrScreenNameStartsWith;
	}

	public void idOrScreenNameStartsWith(String multirequestToken){
		setToken("idOrScreenNameStartsWith", multirequestToken);
	}

	// idEqual:
	public String getIdEqual(){
		return this.idEqual;
	}
	public void setIdEqual(String idEqual){
		this.idEqual = idEqual;
	}

	public void idEqual(String multirequestToken){
		setToken("idEqual", multirequestToken);
	}

	// idIn:
	public String getIdIn(){
		return this.idIn;
	}
	public void setIdIn(String idIn){
		this.idIn = idIn;
	}

	public void idIn(String multirequestToken){
		setToken("idIn", multirequestToken);
	}

	// loginEnabledEqual:
	public Boolean getLoginEnabledEqual(){
		return this.loginEnabledEqual;
	}
	public void setLoginEnabledEqual(Boolean loginEnabledEqual){
		this.loginEnabledEqual = loginEnabledEqual;
	}

	public void loginEnabledEqual(String multirequestToken){
		setToken("loginEnabledEqual", multirequestToken);
	}

	// roleIdEqual:
	public String getRoleIdEqual(){
		return this.roleIdEqual;
	}
	public void setRoleIdEqual(String roleIdEqual){
		this.roleIdEqual = roleIdEqual;
	}

	public void roleIdEqual(String multirequestToken){
		setToken("roleIdEqual", multirequestToken);
	}

	// roleIdsEqual:
	public String getRoleIdsEqual(){
		return this.roleIdsEqual;
	}
	public void setRoleIdsEqual(String roleIdsEqual){
		this.roleIdsEqual = roleIdsEqual;
	}

	public void roleIdsEqual(String multirequestToken){
		setToken("roleIdsEqual", multirequestToken);
	}

	// roleIdsIn:
	public String getRoleIdsIn(){
		return this.roleIdsIn;
	}
	public void setRoleIdsIn(String roleIdsIn){
		this.roleIdsIn = roleIdsIn;
	}

	public void roleIdsIn(String multirequestToken){
		setToken("roleIdsIn", multirequestToken);
	}

	// firstNameOrLastNameStartsWith:
	public String getFirstNameOrLastNameStartsWith(){
		return this.firstNameOrLastNameStartsWith;
	}
	public void setFirstNameOrLastNameStartsWith(String firstNameOrLastNameStartsWith){
		this.firstNameOrLastNameStartsWith = firstNameOrLastNameStartsWith;
	}

	public void firstNameOrLastNameStartsWith(String multirequestToken){
		setToken("firstNameOrLastNameStartsWith", multirequestToken);
	}

	// permissionNamesMultiLikeOr:
	public String getPermissionNamesMultiLikeOr(){
		return this.permissionNamesMultiLikeOr;
	}
	public void setPermissionNamesMultiLikeOr(String permissionNamesMultiLikeOr){
		this.permissionNamesMultiLikeOr = permissionNamesMultiLikeOr;
	}

	public void permissionNamesMultiLikeOr(String multirequestToken){
		setToken("permissionNamesMultiLikeOr", multirequestToken);
	}

	// permissionNamesMultiLikeAnd:
	public String getPermissionNamesMultiLikeAnd(){
		return this.permissionNamesMultiLikeAnd;
	}
	public void setPermissionNamesMultiLikeAnd(String permissionNamesMultiLikeAnd){
		this.permissionNamesMultiLikeAnd = permissionNamesMultiLikeAnd;
	}

	public void permissionNamesMultiLikeAnd(String multirequestToken){
		setToken("permissionNamesMultiLikeAnd", multirequestToken);
	}


	public UserFilter() {
		super();
	}

	public UserFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idOrScreenNameStartsWith = GsonParser.parseString(jsonObject.get("idOrScreenNameStartsWith"));
		idEqual = GsonParser.parseString(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		loginEnabledEqual = GsonParser.parseBoolean(jsonObject.get("loginEnabledEqual"));
		roleIdEqual = GsonParser.parseString(jsonObject.get("roleIdEqual"));
		roleIdsEqual = GsonParser.parseString(jsonObject.get("roleIdsEqual"));
		roleIdsIn = GsonParser.parseString(jsonObject.get("roleIdsIn"));
		firstNameOrLastNameStartsWith = GsonParser.parseString(jsonObject.get("firstNameOrLastNameStartsWith"));
		permissionNamesMultiLikeOr = GsonParser.parseString(jsonObject.get("permissionNamesMultiLikeOr"));
		permissionNamesMultiLikeAnd = GsonParser.parseString(jsonObject.get("permissionNamesMultiLikeAnd"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserFilter");
		kparams.add("idOrScreenNameStartsWith", this.idOrScreenNameStartsWith);
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("loginEnabledEqual", this.loginEnabledEqual);
		kparams.add("roleIdEqual", this.roleIdEqual);
		kparams.add("roleIdsEqual", this.roleIdsEqual);
		kparams.add("roleIdsIn", this.roleIdsIn);
		kparams.add("firstNameOrLastNameStartsWith", this.firstNameOrLastNameStartsWith);
		kparams.add("permissionNamesMultiLikeOr", this.permissionNamesMultiLikeOr);
		kparams.add("permissionNamesMultiLikeAnd", this.permissionNamesMultiLikeAnd);
		return kparams;
	}

}

