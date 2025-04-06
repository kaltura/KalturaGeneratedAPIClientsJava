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
import com.kaltura.client.enums.GroupType;
import com.kaltura.client.enums.GroupUserCreationMode;
import com.kaltura.client.enums.GroupUserRole;
import com.kaltura.client.enums.GroupUserStatus;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(GroupUser.Tokenizer.class)
public class GroupUser extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String userId();
		String groupId();
		String status();
		String partnerId();
		String createdAt();
		String updatedAt();
		String creationMode();
		String userRole();
		String groupType();
	}

	private String id;
	private String userId;
	private String groupId;
	private GroupUserStatus status;
	private Integer partnerId;
	/**
	 * Creation date as Unix timestamp (In seconds)
	 */
	private Long createdAt;
	/**
	 * Last update date as Unix timestamp (In seconds)
	 */
	private Long updatedAt;
	private GroupUserCreationMode creationMode;
	private GroupUserRole userRole;
	private GroupType groupType;

	// id:
	public String getId(){
		return this.id;
	}
	// userId:
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
	}

	// groupId:
	public String getGroupId(){
		return this.groupId;
	}
	public void setGroupId(String groupId){
		this.groupId = groupId;
	}

	public void groupId(String multirequestToken){
		setToken("groupId", multirequestToken);
	}

	// status:
	public GroupUserStatus getStatus(){
		return this.status;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// createdAt:
	public Long getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Long getUpdatedAt(){
		return this.updatedAt;
	}
	// creationMode:
	public GroupUserCreationMode getCreationMode(){
		return this.creationMode;
	}
	public void setCreationMode(GroupUserCreationMode creationMode){
		this.creationMode = creationMode;
	}

	public void creationMode(String multirequestToken){
		setToken("creationMode", multirequestToken);
	}

	// userRole:
	public GroupUserRole getUserRole(){
		return this.userRole;
	}
	public void setUserRole(GroupUserRole userRole){
		this.userRole = userRole;
	}

	public void userRole(String multirequestToken){
		setToken("userRole", multirequestToken);
	}

	// groupType:
	public GroupType getGroupType(){
		return this.groupType;
	}

	public GroupUser() {
		super();
	}

	public GroupUser(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		groupId = GsonParser.parseString(jsonObject.get("groupId"));
		status = GroupUserStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		createdAt = GsonParser.parseLong(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseLong(jsonObject.get("updatedAt"));
		creationMode = GroupUserCreationMode.get(GsonParser.parseInt(jsonObject.get("creationMode")));
		userRole = GroupUserRole.get(GsonParser.parseInt(jsonObject.get("userRole")));
		groupType = GroupType.get(GsonParser.parseInt(jsonObject.get("groupType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaGroupUser");
		kparams.add("userId", this.userId);
		kparams.add("groupId", this.groupId);
		kparams.add("creationMode", this.creationMode);
		kparams.add("userRole", this.userRole);
		return kparams;
	}

}

