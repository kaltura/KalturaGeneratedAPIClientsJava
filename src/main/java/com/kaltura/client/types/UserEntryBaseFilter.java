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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.UserEntryExtendedStatus;
import com.kaltura.client.enums.UserEntryStatus;
import com.kaltura.client.enums.UserEntryType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserEntryBaseFilter.Tokenizer.class)
public abstract class UserEntryBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String idEqual();
		String idIn();
		String idNotIn();
		String entryIdEqual();
		String entryIdIn();
		String entryIdNotIn();
		String userIdEqual();
		String userIdIn();
		String userIdNotIn();
		String statusEqual();
		String createdAtLessThanOrEqual();
		String createdAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String typeEqual();
		String extendedStatusEqual();
		String extendedStatusIn();
		String extendedStatusNotIn();
	}

	private Integer idEqual;
	private String idIn;
	private String idNotIn;
	private String entryIdEqual;
	private String entryIdIn;
	private String entryIdNotIn;
	private String userIdEqual;
	private String userIdIn;
	private String userIdNotIn;
	private UserEntryStatus statusEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer createdAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;
	private Integer updatedAtGreaterThanOrEqual;
	private UserEntryType typeEqual;
	private UserEntryExtendedStatus extendedStatusEqual;
	private String extendedStatusIn;
	private String extendedStatusNotIn;

	// idEqual:
	public Integer getIdEqual(){
		return this.idEqual;
	}
	public void setIdEqual(Integer idEqual){
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

	// idNotIn:
	public String getIdNotIn(){
		return this.idNotIn;
	}
	public void setIdNotIn(String idNotIn){
		this.idNotIn = idNotIn;
	}

	public void idNotIn(String multirequestToken){
		setToken("idNotIn", multirequestToken);
	}

	// entryIdEqual:
	public String getEntryIdEqual(){
		return this.entryIdEqual;
	}
	public void setEntryIdEqual(String entryIdEqual){
		this.entryIdEqual = entryIdEqual;
	}

	public void entryIdEqual(String multirequestToken){
		setToken("entryIdEqual", multirequestToken);
	}

	// entryIdIn:
	public String getEntryIdIn(){
		return this.entryIdIn;
	}
	public void setEntryIdIn(String entryIdIn){
		this.entryIdIn = entryIdIn;
	}

	public void entryIdIn(String multirequestToken){
		setToken("entryIdIn", multirequestToken);
	}

	// entryIdNotIn:
	public String getEntryIdNotIn(){
		return this.entryIdNotIn;
	}
	public void setEntryIdNotIn(String entryIdNotIn){
		this.entryIdNotIn = entryIdNotIn;
	}

	public void entryIdNotIn(String multirequestToken){
		setToken("entryIdNotIn", multirequestToken);
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

	// userIdNotIn:
	public String getUserIdNotIn(){
		return this.userIdNotIn;
	}
	public void setUserIdNotIn(String userIdNotIn){
		this.userIdNotIn = userIdNotIn;
	}

	public void userIdNotIn(String multirequestToken){
		setToken("userIdNotIn", multirequestToken);
	}

	// statusEqual:
	public UserEntryStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(UserEntryStatus statusEqual){
		this.statusEqual = statusEqual;
	}

	public void statusEqual(String multirequestToken){
		setToken("statusEqual", multirequestToken);
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

	// typeEqual:
	public UserEntryType getTypeEqual(){
		return this.typeEqual;
	}
	public void setTypeEqual(UserEntryType typeEqual){
		this.typeEqual = typeEqual;
	}

	public void typeEqual(String multirequestToken){
		setToken("typeEqual", multirequestToken);
	}

	// extendedStatusEqual:
	public UserEntryExtendedStatus getExtendedStatusEqual(){
		return this.extendedStatusEqual;
	}
	public void setExtendedStatusEqual(UserEntryExtendedStatus extendedStatusEqual){
		this.extendedStatusEqual = extendedStatusEqual;
	}

	public void extendedStatusEqual(String multirequestToken){
		setToken("extendedStatusEqual", multirequestToken);
	}

	// extendedStatusIn:
	public String getExtendedStatusIn(){
		return this.extendedStatusIn;
	}
	public void setExtendedStatusIn(String extendedStatusIn){
		this.extendedStatusIn = extendedStatusIn;
	}

	public void extendedStatusIn(String multirequestToken){
		setToken("extendedStatusIn", multirequestToken);
	}

	// extendedStatusNotIn:
	public String getExtendedStatusNotIn(){
		return this.extendedStatusNotIn;
	}
	public void setExtendedStatusNotIn(String extendedStatusNotIn){
		this.extendedStatusNotIn = extendedStatusNotIn;
	}

	public void extendedStatusNotIn(String multirequestToken){
		setToken("extendedStatusNotIn", multirequestToken);
	}


	public UserEntryBaseFilter() {
		super();
	}

	public UserEntryBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		idNotIn = GsonParser.parseString(jsonObject.get("idNotIn"));
		entryIdEqual = GsonParser.parseString(jsonObject.get("entryIdEqual"));
		entryIdIn = GsonParser.parseString(jsonObject.get("entryIdIn"));
		entryIdNotIn = GsonParser.parseString(jsonObject.get("entryIdNotIn"));
		userIdEqual = GsonParser.parseString(jsonObject.get("userIdEqual"));
		userIdIn = GsonParser.parseString(jsonObject.get("userIdIn"));
		userIdNotIn = GsonParser.parseString(jsonObject.get("userIdNotIn"));
		statusEqual = UserEntryStatus.get(GsonParser.parseString(jsonObject.get("statusEqual")));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		typeEqual = UserEntryType.get(GsonParser.parseString(jsonObject.get("typeEqual")));
		extendedStatusEqual = UserEntryExtendedStatus.get(GsonParser.parseString(jsonObject.get("extendedStatusEqual")));
		extendedStatusIn = GsonParser.parseString(jsonObject.get("extendedStatusIn"));
		extendedStatusNotIn = GsonParser.parseString(jsonObject.get("extendedStatusNotIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserEntryBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("idNotIn", this.idNotIn);
		kparams.add("entryIdEqual", this.entryIdEqual);
		kparams.add("entryIdIn", this.entryIdIn);
		kparams.add("entryIdNotIn", this.entryIdNotIn);
		kparams.add("userIdEqual", this.userIdEqual);
		kparams.add("userIdIn", this.userIdIn);
		kparams.add("userIdNotIn", this.userIdNotIn);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("typeEqual", this.typeEqual);
		kparams.add("extendedStatusEqual", this.extendedStatusEqual);
		kparams.add("extendedStatusIn", this.extendedStatusIn);
		kparams.add("extendedStatusNotIn", this.extendedStatusNotIn);
		return kparams;
	}

}

