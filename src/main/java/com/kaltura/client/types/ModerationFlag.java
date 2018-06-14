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
import com.kaltura.client.enums.ModerationFlagStatus;
import com.kaltura.client.enums.ModerationFlagType;
import com.kaltura.client.enums.ModerationObjectType;
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
@MultiRequestBuilder.Tokenizer(ModerationFlag.Tokenizer.class)
public class ModerationFlag extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String userId();
		String moderationObjectType();
		String flaggedEntryId();
		String flaggedUserId();
		String status();
		String comments();
		String flagType();
		String createdAt();
		String updatedAt();
	}

	/**
	 * Moderation flag id
	 */
	private Integer id;
	private Integer partnerId;
	/**
	 * The user id that added the moderation flag
	 */
	private String userId;
	/**
	 * The type of the moderation flag (entry or user)
	 */
	private ModerationObjectType moderationObjectType;
	/**
	 * If moderation flag is set for entry, this is the flagged entry id
	 */
	private String flaggedEntryId;
	/**
	 * If moderation flag is set for user, this is the flagged user id
	 */
	private String flaggedUserId;
	/**
	 * The moderation flag status
	 */
	private ModerationFlagStatus status;
	/**
	 * The comment that was added to the flag
	 */
	private String comments;
	private ModerationFlagType flagType;
	private Integer createdAt;
	private Integer updatedAt;

	// id:
	public Integer getId(){
		return this.id;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// userId:
	public String getUserId(){
		return this.userId;
	}
	// moderationObjectType:
	public ModerationObjectType getModerationObjectType(){
		return this.moderationObjectType;
	}
	// flaggedEntryId:
	public String getFlaggedEntryId(){
		return this.flaggedEntryId;
	}
	public void setFlaggedEntryId(String flaggedEntryId){
		this.flaggedEntryId = flaggedEntryId;
	}

	public void flaggedEntryId(String multirequestToken){
		setToken("flaggedEntryId", multirequestToken);
	}

	// flaggedUserId:
	public String getFlaggedUserId(){
		return this.flaggedUserId;
	}
	public void setFlaggedUserId(String flaggedUserId){
		this.flaggedUserId = flaggedUserId;
	}

	public void flaggedUserId(String multirequestToken){
		setToken("flaggedUserId", multirequestToken);
	}

	// status:
	public ModerationFlagStatus getStatus(){
		return this.status;
	}
	// comments:
	public String getComments(){
		return this.comments;
	}
	public void setComments(String comments){
		this.comments = comments;
	}

	public void comments(String multirequestToken){
		setToken("comments", multirequestToken);
	}

	// flagType:
	public ModerationFlagType getFlagType(){
		return this.flagType;
	}
	public void setFlagType(ModerationFlagType flagType){
		this.flagType = flagType;
	}

	public void flagType(String multirequestToken){
		setToken("flagType", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}

	public ModerationFlag() {
		super();
	}

	public ModerationFlag(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		moderationObjectType = ModerationObjectType.get(GsonParser.parseString(jsonObject.get("moderationObjectType")));
		flaggedEntryId = GsonParser.parseString(jsonObject.get("flaggedEntryId"));
		flaggedUserId = GsonParser.parseString(jsonObject.get("flaggedUserId"));
		status = ModerationFlagStatus.get(GsonParser.parseString(jsonObject.get("status")));
		comments = GsonParser.parseString(jsonObject.get("comments"));
		flagType = ModerationFlagType.get(GsonParser.parseInt(jsonObject.get("flagType")));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaModerationFlag");
		kparams.add("flaggedEntryId", this.flaggedEntryId);
		kparams.add("flaggedUserId", this.flaggedUserId);
		kparams.add("comments", this.comments);
		kparams.add("flagType", this.flagType);
		return kparams;
	}

}

