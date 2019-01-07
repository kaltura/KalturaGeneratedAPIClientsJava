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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.enums.UserStatus;
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
public abstract class UserBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String partnerIdEqual();
		String typeEqual();
		String typeIn();
		String screenNameLike();
		String screenNameStartsWith();
		String emailLike();
		String emailStartsWith();
		String tagsMultiLikeOr();
		String tagsMultiLikeAnd();
		String statusEqual();
		String statusIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String firstNameStartsWith();
		String lastNameStartsWith();
		String isAdminEqual();
	}

	private Integer partnerIdEqual;
	private UserType typeEqual;
	private String typeIn;
	private String screenNameLike;
	private String screenNameStartsWith;
	private String emailLike;
	private String emailStartsWith;
	private String tagsMultiLikeOr;
	private String tagsMultiLikeAnd;
	private UserStatus statusEqual;
	private String statusIn;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private String firstNameStartsWith;
	private String lastNameStartsWith;
	private Boolean isAdminEqual;

	// partnerIdEqual:
	public Integer getPartnerIdEqual(){
		return this.partnerIdEqual;
	}
	public void setPartnerIdEqual(Integer partnerIdEqual){
		this.partnerIdEqual = partnerIdEqual;
	}

	public void partnerIdEqual(String multirequestToken){
		setToken("partnerIdEqual", multirequestToken);
	}

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

	// screenNameLike:
	public String getScreenNameLike(){
		return this.screenNameLike;
	}
	public void setScreenNameLike(String screenNameLike){
		this.screenNameLike = screenNameLike;
	}

	public void screenNameLike(String multirequestToken){
		setToken("screenNameLike", multirequestToken);
	}

	// screenNameStartsWith:
	public String getScreenNameStartsWith(){
		return this.screenNameStartsWith;
	}
	public void setScreenNameStartsWith(String screenNameStartsWith){
		this.screenNameStartsWith = screenNameStartsWith;
	}

	public void screenNameStartsWith(String multirequestToken){
		setToken("screenNameStartsWith", multirequestToken);
	}

	// emailLike:
	public String getEmailLike(){
		return this.emailLike;
	}
	public void setEmailLike(String emailLike){
		this.emailLike = emailLike;
	}

	public void emailLike(String multirequestToken){
		setToken("emailLike", multirequestToken);
	}

	// emailStartsWith:
	public String getEmailStartsWith(){
		return this.emailStartsWith;
	}
	public void setEmailStartsWith(String emailStartsWith){
		this.emailStartsWith = emailStartsWith;
	}

	public void emailStartsWith(String multirequestToken){
		setToken("emailStartsWith", multirequestToken);
	}

	// tagsMultiLikeOr:
	public String getTagsMultiLikeOr(){
		return this.tagsMultiLikeOr;
	}
	public void setTagsMultiLikeOr(String tagsMultiLikeOr){
		this.tagsMultiLikeOr = tagsMultiLikeOr;
	}

	public void tagsMultiLikeOr(String multirequestToken){
		setToken("tagsMultiLikeOr", multirequestToken);
	}

	// tagsMultiLikeAnd:
	public String getTagsMultiLikeAnd(){
		return this.tagsMultiLikeAnd;
	}
	public void setTagsMultiLikeAnd(String tagsMultiLikeAnd){
		this.tagsMultiLikeAnd = tagsMultiLikeAnd;
	}

	public void tagsMultiLikeAnd(String multirequestToken){
		setToken("tagsMultiLikeAnd", multirequestToken);
	}

	// statusEqual:
	public UserStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(UserStatus statusEqual){
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


	public UserBaseFilter() {
		super();
	}

	public UserBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
		typeEqual = UserType.get(GsonParser.parseInt(jsonObject.get("typeEqual")));
		typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
		screenNameLike = GsonParser.parseString(jsonObject.get("screenNameLike"));
		screenNameStartsWith = GsonParser.parseString(jsonObject.get("screenNameStartsWith"));
		emailLike = GsonParser.parseString(jsonObject.get("emailLike"));
		emailStartsWith = GsonParser.parseString(jsonObject.get("emailStartsWith"));
		tagsMultiLikeOr = GsonParser.parseString(jsonObject.get("tagsMultiLikeOr"));
		tagsMultiLikeAnd = GsonParser.parseString(jsonObject.get("tagsMultiLikeAnd"));
		statusEqual = UserStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		firstNameStartsWith = GsonParser.parseString(jsonObject.get("firstNameStartsWith"));
		lastNameStartsWith = GsonParser.parseString(jsonObject.get("lastNameStartsWith"));
		isAdminEqual = GsonParser.parseBoolean(jsonObject.get("isAdminEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserBaseFilter");
		kparams.add("partnerIdEqual", this.partnerIdEqual);
		kparams.add("typeEqual", this.typeEqual);
		kparams.add("typeIn", this.typeIn);
		kparams.add("screenNameLike", this.screenNameLike);
		kparams.add("screenNameStartsWith", this.screenNameStartsWith);
		kparams.add("emailLike", this.emailLike);
		kparams.add("emailStartsWith", this.emailStartsWith);
		kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
		kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("firstNameStartsWith", this.firstNameStartsWith);
		kparams.add("lastNameStartsWith", this.lastNameStartsWith);
		kparams.add("isAdminEqual", this.isAdminEqual);
		return kparams;
	}

}

