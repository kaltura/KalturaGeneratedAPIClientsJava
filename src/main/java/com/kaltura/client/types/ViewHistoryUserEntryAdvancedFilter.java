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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ViewHistoryUserEntryAdvancedFilter.Tokenizer.class)
public class ViewHistoryUserEntryAdvancedFilter extends SearchItem {
	
	public interface Tokenizer extends SearchItem.Tokenizer {
		String idEqual();
		String idIn();
		String userIdEqual();
		String userIdIn();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String extendedStatusEqual();
		String extendedStatusIn();
	}

	private String idEqual;
	private String idIn;
	private String userIdEqual;
	private String userIdIn;
	private String updatedAtGreaterThanOrEqual;
	private String updatedAtLessThanOrEqual;
	private UserEntryExtendedStatus extendedStatusEqual;
	private String extendedStatusIn;

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

	// updatedAtGreaterThanOrEqual:
	public String getUpdatedAtGreaterThanOrEqual(){
		return this.updatedAtGreaterThanOrEqual;
	}
	public void setUpdatedAtGreaterThanOrEqual(String updatedAtGreaterThanOrEqual){
		this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
	}

	public void updatedAtGreaterThanOrEqual(String multirequestToken){
		setToken("updatedAtGreaterThanOrEqual", multirequestToken);
	}

	// updatedAtLessThanOrEqual:
	public String getUpdatedAtLessThanOrEqual(){
		return this.updatedAtLessThanOrEqual;
	}
	public void setUpdatedAtLessThanOrEqual(String updatedAtLessThanOrEqual){
		this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
	}

	public void updatedAtLessThanOrEqual(String multirequestToken){
		setToken("updatedAtLessThanOrEqual", multirequestToken);
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


	public ViewHistoryUserEntryAdvancedFilter() {
		super();
	}

	public ViewHistoryUserEntryAdvancedFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseString(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		userIdEqual = GsonParser.parseString(jsonObject.get("userIdEqual"));
		userIdIn = GsonParser.parseString(jsonObject.get("userIdIn"));
		updatedAtGreaterThanOrEqual = GsonParser.parseString(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseString(jsonObject.get("updatedAtLessThanOrEqual"));
		extendedStatusEqual = UserEntryExtendedStatus.get(GsonParser.parseString(jsonObject.get("extendedStatusEqual")));
		extendedStatusIn = GsonParser.parseString(jsonObject.get("extendedStatusIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaViewHistoryUserEntryAdvancedFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("userIdEqual", this.userIdEqual);
		kparams.add("userIdIn", this.userIdIn);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("extendedStatusEqual", this.extendedStatusEqual);
		kparams.add("extendedStatusIn", this.extendedStatusIn);
		return kparams;
	}

}

