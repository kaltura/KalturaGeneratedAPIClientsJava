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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserEntryFilter.Tokenizer.class)
public class UserEntryFilter extends UserEntryBaseFilter {
	
	public interface Tokenizer extends UserEntryBaseFilter.Tokenizer {
		String userIdEqualCurrent();
		String isAnonymous();
		String privacyContextEqual();
		String privacyContextIn();
	}

	private Boolean userIdEqualCurrent;
	private Boolean isAnonymous;
	private String privacyContextEqual;
	private String privacyContextIn;

	// userIdEqualCurrent:
	public Boolean getUserIdEqualCurrent(){
		return this.userIdEqualCurrent;
	}
	public void setUserIdEqualCurrent(Boolean userIdEqualCurrent){
		this.userIdEqualCurrent = userIdEqualCurrent;
	}

	public void userIdEqualCurrent(String multirequestToken){
		setToken("userIdEqualCurrent", multirequestToken);
	}

	// isAnonymous:
	public Boolean getIsAnonymous(){
		return this.isAnonymous;
	}
	public void setIsAnonymous(Boolean isAnonymous){
		this.isAnonymous = isAnonymous;
	}

	public void isAnonymous(String multirequestToken){
		setToken("isAnonymous", multirequestToken);
	}

	// privacyContextEqual:
	public String getPrivacyContextEqual(){
		return this.privacyContextEqual;
	}
	public void setPrivacyContextEqual(String privacyContextEqual){
		this.privacyContextEqual = privacyContextEqual;
	}

	public void privacyContextEqual(String multirequestToken){
		setToken("privacyContextEqual", multirequestToken);
	}

	// privacyContextIn:
	public String getPrivacyContextIn(){
		return this.privacyContextIn;
	}
	public void setPrivacyContextIn(String privacyContextIn){
		this.privacyContextIn = privacyContextIn;
	}

	public void privacyContextIn(String multirequestToken){
		setToken("privacyContextIn", multirequestToken);
	}


	public UserEntryFilter() {
		super();
	}

	public UserEntryFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		userIdEqualCurrent = GsonParser.parseBoolean(jsonObject.get("userIdEqualCurrent"));
		isAnonymous = GsonParser.parseBoolean(jsonObject.get("isAnonymous"));
		privacyContextEqual = GsonParser.parseString(jsonObject.get("privacyContextEqual"));
		privacyContextIn = GsonParser.parseString(jsonObject.get("privacyContextIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserEntryFilter");
		kparams.add("userIdEqualCurrent", this.userIdEqualCurrent);
		kparams.add("isAnonymous", this.isAnonymous);
		kparams.add("privacyContextEqual", this.privacyContextEqual);
		kparams.add("privacyContextIn", this.privacyContextIn);
		return kparams;
	}

}

