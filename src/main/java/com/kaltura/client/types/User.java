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
import com.kaltura.client.enums.Gender;
import com.kaltura.client.enums.UserType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(User.Tokenizer.class)
public class User extends BaseUser {
	
	public interface Tokenizer extends BaseUser.Tokenizer {
		String type();
		String dateOfBirth();
		String gender();
		String isAdmin();
		String isGuest();
		String roleIds();
		String roleNames();
		String isAccountOwner();
		String password();
		String firstName();
		String lastName();
		String loginEnabled();
		String registrationInfo();
		String attendanceInfo();
		String title();
		String company();
		String ksPrivileges();
		String encryptedSeed();
		String isSsoExcluded();
		String externalId();
	}

	private UserType type;
	private Integer dateOfBirth;
	private Gender gender;
	private Boolean isAdmin;
	private Boolean isGuest;
	private String roleIds;
	private String roleNames;
	private Boolean isAccountOwner;
	private String password;
	private String firstName;
	private String lastName;
	private Boolean loginEnabled;
	private String registrationInfo;
	private String attendanceInfo;
	private String title;
	private String company;
	private String ksPrivileges;
	private String encryptedSeed;
	private Boolean isSsoExcluded;
	/**
	 * This field should be sent instead of the id field whenever you want to work with
	  hashed user ids
	 */
	private String externalId;

	// type:
	public UserType getType(){
		return this.type;
	}
	public void setType(UserType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// dateOfBirth:
	public Integer getDateOfBirth(){
		return this.dateOfBirth;
	}
	public void setDateOfBirth(Integer dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}

	public void dateOfBirth(String multirequestToken){
		setToken("dateOfBirth", multirequestToken);
	}

	// gender:
	public Gender getGender(){
		return this.gender;
	}
	public void setGender(Gender gender){
		this.gender = gender;
	}

	public void gender(String multirequestToken){
		setToken("gender", multirequestToken);
	}

	// isAdmin:
	public Boolean getIsAdmin(){
		return this.isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin){
		this.isAdmin = isAdmin;
	}

	public void isAdmin(String multirequestToken){
		setToken("isAdmin", multirequestToken);
	}

	// isGuest:
	public Boolean getIsGuest(){
		return this.isGuest;
	}
	public void setIsGuest(Boolean isGuest){
		this.isGuest = isGuest;
	}

	public void isGuest(String multirequestToken){
		setToken("isGuest", multirequestToken);
	}

	// roleIds:
	public String getRoleIds(){
		return this.roleIds;
	}
	public void setRoleIds(String roleIds){
		this.roleIds = roleIds;
	}

	public void roleIds(String multirequestToken){
		setToken("roleIds", multirequestToken);
	}

	// roleNames:
	public String getRoleNames(){
		return this.roleNames;
	}
	// isAccountOwner:
	public Boolean getIsAccountOwner(){
		return this.isAccountOwner;
	}
	public void setIsAccountOwner(Boolean isAccountOwner){
		this.isAccountOwner = isAccountOwner;
	}

	public void isAccountOwner(String multirequestToken){
		setToken("isAccountOwner", multirequestToken);
	}

	// password:
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public void password(String multirequestToken){
		setToken("password", multirequestToken);
	}

	// firstName:
	public String getFirstName(){
		return this.firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public void firstName(String multirequestToken){
		setToken("firstName", multirequestToken);
	}

	// lastName:
	public String getLastName(){
		return this.lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public void lastName(String multirequestToken){
		setToken("lastName", multirequestToken);
	}

	// loginEnabled:
	public Boolean getLoginEnabled(){
		return this.loginEnabled;
	}
	public void setLoginEnabled(Boolean loginEnabled){
		this.loginEnabled = loginEnabled;
	}

	public void loginEnabled(String multirequestToken){
		setToken("loginEnabled", multirequestToken);
	}

	// registrationInfo:
	public String getRegistrationInfo(){
		return this.registrationInfo;
	}
	public void setRegistrationInfo(String registrationInfo){
		this.registrationInfo = registrationInfo;
	}

	public void registrationInfo(String multirequestToken){
		setToken("registrationInfo", multirequestToken);
	}

	// attendanceInfo:
	public String getAttendanceInfo(){
		return this.attendanceInfo;
	}
	public void setAttendanceInfo(String attendanceInfo){
		this.attendanceInfo = attendanceInfo;
	}

	public void attendanceInfo(String multirequestToken){
		setToken("attendanceInfo", multirequestToken);
	}

	// title:
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}

	public void title(String multirequestToken){
		setToken("title", multirequestToken);
	}

	// company:
	public String getCompany(){
		return this.company;
	}
	public void setCompany(String company){
		this.company = company;
	}

	public void company(String multirequestToken){
		setToken("company", multirequestToken);
	}

	// ksPrivileges:
	public String getKsPrivileges(){
		return this.ksPrivileges;
	}
	public void setKsPrivileges(String ksPrivileges){
		this.ksPrivileges = ksPrivileges;
	}

	public void ksPrivileges(String multirequestToken){
		setToken("ksPrivileges", multirequestToken);
	}

	// encryptedSeed:
	public String getEncryptedSeed(){
		return this.encryptedSeed;
	}
	// isSsoExcluded:
	public Boolean getIsSsoExcluded(){
		return this.isSsoExcluded;
	}
	public void setIsSsoExcluded(Boolean isSsoExcluded){
		this.isSsoExcluded = isSsoExcluded;
	}

	public void isSsoExcluded(String multirequestToken){
		setToken("isSsoExcluded", multirequestToken);
	}

	// externalId:
	public String getExternalId(){
		return this.externalId;
	}
	public void setExternalId(String externalId){
		this.externalId = externalId;
	}

	public void externalId(String multirequestToken){
		setToken("externalId", multirequestToken);
	}


	public User() {
		super();
	}

	public User(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		type = UserType.get(GsonParser.parseInt(jsonObject.get("type")));
		dateOfBirth = GsonParser.parseInt(jsonObject.get("dateOfBirth"));
		gender = Gender.get(GsonParser.parseInt(jsonObject.get("gender")));
		isAdmin = GsonParser.parseBoolean(jsonObject.get("isAdmin"));
		isGuest = GsonParser.parseBoolean(jsonObject.get("isGuest"));
		roleIds = GsonParser.parseString(jsonObject.get("roleIds"));
		roleNames = GsonParser.parseString(jsonObject.get("roleNames"));
		isAccountOwner = GsonParser.parseBoolean(jsonObject.get("isAccountOwner"));
		password = GsonParser.parseString(jsonObject.get("password"));
		firstName = GsonParser.parseString(jsonObject.get("firstName"));
		lastName = GsonParser.parseString(jsonObject.get("lastName"));
		loginEnabled = GsonParser.parseBoolean(jsonObject.get("loginEnabled"));
		registrationInfo = GsonParser.parseString(jsonObject.get("registrationInfo"));
		attendanceInfo = GsonParser.parseString(jsonObject.get("attendanceInfo"));
		title = GsonParser.parseString(jsonObject.get("title"));
		company = GsonParser.parseString(jsonObject.get("company"));
		ksPrivileges = GsonParser.parseString(jsonObject.get("ksPrivileges"));
		encryptedSeed = GsonParser.parseString(jsonObject.get("encryptedSeed"));
		isSsoExcluded = GsonParser.parseBoolean(jsonObject.get("isSsoExcluded"));
		externalId = GsonParser.parseString(jsonObject.get("externalId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUser");
		kparams.add("type", this.type);
		kparams.add("dateOfBirth", this.dateOfBirth);
		kparams.add("gender", this.gender);
		kparams.add("isAdmin", this.isAdmin);
		kparams.add("isGuest", this.isGuest);
		kparams.add("roleIds", this.roleIds);
		kparams.add("isAccountOwner", this.isAccountOwner);
		kparams.add("password", this.password);
		kparams.add("firstName", this.firstName);
		kparams.add("lastName", this.lastName);
		kparams.add("loginEnabled", this.loginEnabled);
		kparams.add("registrationInfo", this.registrationInfo);
		kparams.add("attendanceInfo", this.attendanceInfo);
		kparams.add("title", this.title);
		kparams.add("company", this.company);
		kparams.add("ksPrivileges", this.ksPrivileges);
		kparams.add("isSsoExcluded", this.isSsoExcluded);
		kparams.add("externalId", this.externalId);
		return kparams;
	}

}

