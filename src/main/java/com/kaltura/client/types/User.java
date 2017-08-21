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
import com.kaltura.client.enums.Gender;
import com.kaltura.client.enums.LanguageCode;
import com.kaltura.client.enums.UserStatus;
import com.kaltura.client.enums.UserType;
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
@MultiRequestBuilder.Tokenizer(User.Tokenizer.class)
public class User extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String type();
		String screenName();
		String fullName();
		String email();
		String dateOfBirth();
		String country();
		String state();
		String city();
		String zip();
		String thumbnailUrl();
		String description();
		String tags();
		String adminTags();
		String gender();
		String status();
		String createdAt();
		String updatedAt();
		String partnerData();
		String indexedPartnerDataInt();
		String indexedPartnerDataString();
		String storageSize();
		String password();
		String firstName();
		String lastName();
		String isAdmin();
		String language();
		String lastLoginTime();
		String statusUpdatedAt();
		String deletedAt();
		String loginEnabled();
		String roleIds();
		String roleNames();
		String isAccountOwner();
		String allowedPartnerIds();
		String allowedPartnerPackages();
	}

	private String id;
	private Integer partnerId;
	private UserType type;
	private String screenName;
	private String fullName;
	private String email;
	private Integer dateOfBirth;
	private String country;
	private String state;
	private String city;
	private String zip;
	private String thumbnailUrl;
	private String description;
	private String tags;
	/**  Admin tags can be updated only by using an admin session  */
	private String adminTags;
	private Gender gender;
	private UserStatus status;
	/**  Creation date as Unix timestamp (In seconds)  */
	private Integer createdAt;
	/**  Last update date as Unix timestamp (In seconds)  */
	private Integer updatedAt;
	/**  Can be used to store various partner related data as a string  */
	private String partnerData;
	private Integer indexedPartnerDataInt;
	private String indexedPartnerDataString;
	private Integer storageSize;
	private String password;
	private String firstName;
	private String lastName;
	private Boolean isAdmin;
	private LanguageCode language;
	private Integer lastLoginTime;
	private Integer statusUpdatedAt;
	private Integer deletedAt;
	private Boolean loginEnabled;
	private String roleIds;
	private String roleNames;
	private Boolean isAccountOwner;
	private String allowedPartnerIds;
	private String allowedPartnerPackages;

	// id:
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
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

	// screenName:
	public String getScreenName(){
		return this.screenName;
	}
	public void setScreenName(String screenName){
		this.screenName = screenName;
	}

	public void screenName(String multirequestToken){
		setToken("screenName", multirequestToken);
	}

	// fullName:
	public String getFullName(){
		return this.fullName;
	}
	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public void fullName(String multirequestToken){
		setToken("fullName", multirequestToken);
	}

	// email:
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}

	public void email(String multirequestToken){
		setToken("email", multirequestToken);
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

	// country:
	public String getCountry(){
		return this.country;
	}
	public void setCountry(String country){
		this.country = country;
	}

	public void country(String multirequestToken){
		setToken("country", multirequestToken);
	}

	// state:
	public String getState(){
		return this.state;
	}
	public void setState(String state){
		this.state = state;
	}

	public void state(String multirequestToken){
		setToken("state", multirequestToken);
	}

	// city:
	public String getCity(){
		return this.city;
	}
	public void setCity(String city){
		this.city = city;
	}

	public void city(String multirequestToken){
		setToken("city", multirequestToken);
	}

	// zip:
	public String getZip(){
		return this.zip;
	}
	public void setZip(String zip){
		this.zip = zip;
	}

	public void zip(String multirequestToken){
		setToken("zip", multirequestToken);
	}

	// thumbnailUrl:
	public String getThumbnailUrl(){
		return this.thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl){
		this.thumbnailUrl = thumbnailUrl;
	}

	public void thumbnailUrl(String multirequestToken){
		setToken("thumbnailUrl", multirequestToken);
	}

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// tags:
	public String getTags(){
		return this.tags;
	}
	public void setTags(String tags){
		this.tags = tags;
	}

	public void tags(String multirequestToken){
		setToken("tags", multirequestToken);
	}

	// adminTags:
	public String getAdminTags(){
		return this.adminTags;
	}
	public void setAdminTags(String adminTags){
		this.adminTags = adminTags;
	}

	public void adminTags(String multirequestToken){
		setToken("adminTags", multirequestToken);
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

	// status:
	public UserStatus getStatus(){
		return this.status;
	}
	public void setStatus(UserStatus status){
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

	// partnerData:
	public String getPartnerData(){
		return this.partnerData;
	}
	public void setPartnerData(String partnerData){
		this.partnerData = partnerData;
	}

	public void partnerData(String multirequestToken){
		setToken("partnerData", multirequestToken);
	}

	// indexedPartnerDataInt:
	public Integer getIndexedPartnerDataInt(){
		return this.indexedPartnerDataInt;
	}
	public void setIndexedPartnerDataInt(Integer indexedPartnerDataInt){
		this.indexedPartnerDataInt = indexedPartnerDataInt;
	}

	public void indexedPartnerDataInt(String multirequestToken){
		setToken("indexedPartnerDataInt", multirequestToken);
	}

	// indexedPartnerDataString:
	public String getIndexedPartnerDataString(){
		return this.indexedPartnerDataString;
	}
	public void setIndexedPartnerDataString(String indexedPartnerDataString){
		this.indexedPartnerDataString = indexedPartnerDataString;
	}

	public void indexedPartnerDataString(String multirequestToken){
		setToken("indexedPartnerDataString", multirequestToken);
	}

	// storageSize:
	public Integer getStorageSize(){
		return this.storageSize;
	}
	public void setStorageSize(Integer storageSize){
		this.storageSize = storageSize;
	}

	public void storageSize(String multirequestToken){
		setToken("storageSize", multirequestToken);
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

	// language:
	public LanguageCode getLanguage(){
		return this.language;
	}
	public void setLanguage(LanguageCode language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
	}

	// lastLoginTime:
	public Integer getLastLoginTime(){
		return this.lastLoginTime;
	}
	public void setLastLoginTime(Integer lastLoginTime){
		this.lastLoginTime = lastLoginTime;
	}

	public void lastLoginTime(String multirequestToken){
		setToken("lastLoginTime", multirequestToken);
	}

	// statusUpdatedAt:
	public Integer getStatusUpdatedAt(){
		return this.statusUpdatedAt;
	}
	public void setStatusUpdatedAt(Integer statusUpdatedAt){
		this.statusUpdatedAt = statusUpdatedAt;
	}

	public void statusUpdatedAt(String multirequestToken){
		setToken("statusUpdatedAt", multirequestToken);
	}

	// deletedAt:
	public Integer getDeletedAt(){
		return this.deletedAt;
	}
	public void setDeletedAt(Integer deletedAt){
		this.deletedAt = deletedAt;
	}

	public void deletedAt(String multirequestToken){
		setToken("deletedAt", multirequestToken);
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
	public void setRoleNames(String roleNames){
		this.roleNames = roleNames;
	}

	public void roleNames(String multirequestToken){
		setToken("roleNames", multirequestToken);
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

	// allowedPartnerIds:
	public String getAllowedPartnerIds(){
		return this.allowedPartnerIds;
	}
	public void setAllowedPartnerIds(String allowedPartnerIds){
		this.allowedPartnerIds = allowedPartnerIds;
	}

	public void allowedPartnerIds(String multirequestToken){
		setToken("allowedPartnerIds", multirequestToken);
	}

	// allowedPartnerPackages:
	public String getAllowedPartnerPackages(){
		return this.allowedPartnerPackages;
	}
	public void setAllowedPartnerPackages(String allowedPartnerPackages){
		this.allowedPartnerPackages = allowedPartnerPackages;
	}

	public void allowedPartnerPackages(String multirequestToken){
		setToken("allowedPartnerPackages", multirequestToken);
	}


	public User() {
		super();
	}

	public User(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		type = UserType.get(GsonParser.parseInt(jsonObject.get("type")));
		screenName = GsonParser.parseString(jsonObject.get("screenName"));
		fullName = GsonParser.parseString(jsonObject.get("fullName"));
		email = GsonParser.parseString(jsonObject.get("email"));
		dateOfBirth = GsonParser.parseInt(jsonObject.get("dateOfBirth"));
		country = GsonParser.parseString(jsonObject.get("country"));
		state = GsonParser.parseString(jsonObject.get("state"));
		city = GsonParser.parseString(jsonObject.get("city"));
		zip = GsonParser.parseString(jsonObject.get("zip"));
		thumbnailUrl = GsonParser.parseString(jsonObject.get("thumbnailUrl"));
		description = GsonParser.parseString(jsonObject.get("description"));
		tags = GsonParser.parseString(jsonObject.get("tags"));
		adminTags = GsonParser.parseString(jsonObject.get("adminTags"));
		gender = Gender.get(GsonParser.parseInt(jsonObject.get("gender")));
		status = UserStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		partnerData = GsonParser.parseString(jsonObject.get("partnerData"));
		indexedPartnerDataInt = GsonParser.parseInt(jsonObject.get("indexedPartnerDataInt"));
		indexedPartnerDataString = GsonParser.parseString(jsonObject.get("indexedPartnerDataString"));
		storageSize = GsonParser.parseInt(jsonObject.get("storageSize"));
		password = GsonParser.parseString(jsonObject.get("password"));
		firstName = GsonParser.parseString(jsonObject.get("firstName"));
		lastName = GsonParser.parseString(jsonObject.get("lastName"));
		isAdmin = GsonParser.parseBoolean(jsonObject.get("isAdmin"));
		language = LanguageCode.get(GsonParser.parseString(jsonObject.get("language")));
		lastLoginTime = GsonParser.parseInt(jsonObject.get("lastLoginTime"));
		statusUpdatedAt = GsonParser.parseInt(jsonObject.get("statusUpdatedAt"));
		deletedAt = GsonParser.parseInt(jsonObject.get("deletedAt"));
		loginEnabled = GsonParser.parseBoolean(jsonObject.get("loginEnabled"));
		roleIds = GsonParser.parseString(jsonObject.get("roleIds"));
		roleNames = GsonParser.parseString(jsonObject.get("roleNames"));
		isAccountOwner = GsonParser.parseBoolean(jsonObject.get("isAccountOwner"));
		allowedPartnerIds = GsonParser.parseString(jsonObject.get("allowedPartnerIds"));
		allowedPartnerPackages = GsonParser.parseString(jsonObject.get("allowedPartnerPackages"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUser");
		kparams.add("id", this.id);
		kparams.add("type", this.type);
		kparams.add("screenName", this.screenName);
		kparams.add("fullName", this.fullName);
		kparams.add("email", this.email);
		kparams.add("dateOfBirth", this.dateOfBirth);
		kparams.add("country", this.country);
		kparams.add("state", this.state);
		kparams.add("city", this.city);
		kparams.add("zip", this.zip);
		kparams.add("thumbnailUrl", this.thumbnailUrl);
		kparams.add("description", this.description);
		kparams.add("tags", this.tags);
		kparams.add("adminTags", this.adminTags);
		kparams.add("gender", this.gender);
		kparams.add("status", this.status);
		kparams.add("partnerData", this.partnerData);
		kparams.add("indexedPartnerDataInt", this.indexedPartnerDataInt);
		kparams.add("indexedPartnerDataString", this.indexedPartnerDataString);
		kparams.add("password", this.password);
		kparams.add("firstName", this.firstName);
		kparams.add("lastName", this.lastName);
		kparams.add("isAdmin", this.isAdmin);
		kparams.add("language", this.language);
		kparams.add("roleIds", this.roleIds);
		kparams.add("allowedPartnerIds", this.allowedPartnerIds);
		kparams.add("allowedPartnerPackages", this.allowedPartnerPackages);
		return kparams;
	}

}

