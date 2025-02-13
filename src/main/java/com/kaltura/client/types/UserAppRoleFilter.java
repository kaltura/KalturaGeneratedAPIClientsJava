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
import com.kaltura.client.enums.UserStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserAppRoleFilter.Tokenizer.class)
public class UserAppRoleFilter extends UserAppRoleBaseFilter {
	
	public interface Tokenizer extends UserAppRoleBaseFilter.Tokenizer {
		String userIdEqual();
		String userIdIn();
		String userStatusEqual();
		String userStatusIn();
	}

	/**
	 * The User Id to search for
	 */
	private String userIdEqual;
	/**
	 * Users Ids csv list
	 */
	private String userIdIn;
	/**
	 * User Status
	 */
	private UserStatus userStatusEqual;
	/**
	 * User Status csv list (0 = Blocked | 1 = Active)
	 */
	private String userStatusIn;

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

	// userStatusEqual:
	public UserStatus getUserStatusEqual(){
		return this.userStatusEqual;
	}
	public void setUserStatusEqual(UserStatus userStatusEqual){
		this.userStatusEqual = userStatusEqual;
	}

	public void userStatusEqual(String multirequestToken){
		setToken("userStatusEqual", multirequestToken);
	}

	// userStatusIn:
	public String getUserStatusIn(){
		return this.userStatusIn;
	}
	public void setUserStatusIn(String userStatusIn){
		this.userStatusIn = userStatusIn;
	}

	public void userStatusIn(String multirequestToken){
		setToken("userStatusIn", multirequestToken);
	}


	public UserAppRoleFilter() {
		super();
	}

	public UserAppRoleFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		userIdEqual = GsonParser.parseString(jsonObject.get("userIdEqual"));
		userIdIn = GsonParser.parseString(jsonObject.get("userIdIn"));
		userStatusEqual = UserStatus.get(GsonParser.parseInt(jsonObject.get("userStatusEqual")));
		userStatusIn = GsonParser.parseString(jsonObject.get("userStatusIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserAppRoleFilter");
		kparams.add("userIdEqual", this.userIdEqual);
		kparams.add("userIdIn", this.userIdIn);
		kparams.add("userStatusEqual", this.userStatusEqual);
		kparams.add("userStatusIn", this.userStatusIn);
		return kparams;
	}

}

