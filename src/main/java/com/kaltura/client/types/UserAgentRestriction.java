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
import com.kaltura.client.enums.UserAgentRestrictionType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserAgentRestriction.Tokenizer.class)
public class UserAgentRestriction extends BaseRestriction {
	
	public interface Tokenizer extends BaseRestriction.Tokenizer {
		String userAgentRestrictionType();
		String userAgentRegexList();
	}

	/**  User agent restriction type (Allow or deny)  */
	private UserAgentRestrictionType userAgentRestrictionType;
	/**  A comma seperated list of user agent regular expressions  */
	private String userAgentRegexList;

	// userAgentRestrictionType:
	public UserAgentRestrictionType getUserAgentRestrictionType(){
		return this.userAgentRestrictionType;
	}
	public void setUserAgentRestrictionType(UserAgentRestrictionType userAgentRestrictionType){
		this.userAgentRestrictionType = userAgentRestrictionType;
	}

	public void userAgentRestrictionType(String multirequestToken){
		setToken("userAgentRestrictionType", multirequestToken);
	}

	// userAgentRegexList:
	public String getUserAgentRegexList(){
		return this.userAgentRegexList;
	}
	public void setUserAgentRegexList(String userAgentRegexList){
		this.userAgentRegexList = userAgentRegexList;
	}

	public void userAgentRegexList(String multirequestToken){
		setToken("userAgentRegexList", multirequestToken);
	}


	public UserAgentRestriction() {
		super();
	}

	public UserAgentRestriction(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		userAgentRestrictionType = UserAgentRestrictionType.get(GsonParser.parseInt(jsonObject.get("userAgentRestrictionType")));
		userAgentRegexList = GsonParser.parseString(jsonObject.get("userAgentRegexList"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserAgentRestriction");
		kparams.add("userAgentRestrictionType", this.userAgentRestrictionType);
		kparams.add("userAgentRegexList", this.userAgentRegexList);
		return kparams;
	}

}

