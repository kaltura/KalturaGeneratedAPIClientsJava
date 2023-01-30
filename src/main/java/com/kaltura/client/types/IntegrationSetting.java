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
import com.kaltura.client.enums.HandleParticipantsMode;
import com.kaltura.client.enums.VendorIntegrationStatus;
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
@MultiRequestBuilder.Tokenizer(IntegrationSetting.Tokenizer.class)
public abstract class IntegrationSetting extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String status();
		String defaultUserId();
		String accountId();
		String createUserIfNotExist();
		String conversionProfileId();
		String handleParticipantsMode();
		String deletionPolicy();
		String createdAt();
		String updatedAt();
		String partnerId();
		String enableMeetingUpload();
		String enableMeetingChat();
	}

	private Integer id;
	private VendorIntegrationStatus status;
	private String defaultUserId;
	private String accountId;
	private Boolean createUserIfNotExist;
	private Integer conversionProfileId;
	private HandleParticipantsMode handleParticipantsMode;
	private Boolean deletionPolicy;
	private String createdAt;
	private String updatedAt;
	private Integer partnerId;
	private Boolean enableMeetingUpload;
	private Boolean enableMeetingChat;

	// id:
	public Integer getId(){
		return this.id;
	}
	// status:
	public VendorIntegrationStatus getStatus(){
		return this.status;
	}
	// defaultUserId:
	public String getDefaultUserId(){
		return this.defaultUserId;
	}
	public void setDefaultUserId(String defaultUserId){
		this.defaultUserId = defaultUserId;
	}

	public void defaultUserId(String multirequestToken){
		setToken("defaultUserId", multirequestToken);
	}

	// accountId:
	public String getAccountId(){
		return this.accountId;
	}
	// createUserIfNotExist:
	public Boolean getCreateUserIfNotExist(){
		return this.createUserIfNotExist;
	}
	public void setCreateUserIfNotExist(Boolean createUserIfNotExist){
		this.createUserIfNotExist = createUserIfNotExist;
	}

	public void createUserIfNotExist(String multirequestToken){
		setToken("createUserIfNotExist", multirequestToken);
	}

	// conversionProfileId:
	public Integer getConversionProfileId(){
		return this.conversionProfileId;
	}
	public void setConversionProfileId(Integer conversionProfileId){
		this.conversionProfileId = conversionProfileId;
	}

	public void conversionProfileId(String multirequestToken){
		setToken("conversionProfileId", multirequestToken);
	}

	// handleParticipantsMode:
	public HandleParticipantsMode getHandleParticipantsMode(){
		return this.handleParticipantsMode;
	}
	public void setHandleParticipantsMode(HandleParticipantsMode handleParticipantsMode){
		this.handleParticipantsMode = handleParticipantsMode;
	}

	public void handleParticipantsMode(String multirequestToken){
		setToken("handleParticipantsMode", multirequestToken);
	}

	// deletionPolicy:
	public Boolean getDeletionPolicy(){
		return this.deletionPolicy;
	}
	public void setDeletionPolicy(Boolean deletionPolicy){
		this.deletionPolicy = deletionPolicy;
	}

	public void deletionPolicy(String multirequestToken){
		setToken("deletionPolicy", multirequestToken);
	}

	// createdAt:
	public String getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public String getUpdatedAt(){
		return this.updatedAt;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// enableMeetingUpload:
	public Boolean getEnableMeetingUpload(){
		return this.enableMeetingUpload;
	}
	public void setEnableMeetingUpload(Boolean enableMeetingUpload){
		this.enableMeetingUpload = enableMeetingUpload;
	}

	public void enableMeetingUpload(String multirequestToken){
		setToken("enableMeetingUpload", multirequestToken);
	}

	// enableMeetingChat:
	public Boolean getEnableMeetingChat(){
		return this.enableMeetingChat;
	}
	public void setEnableMeetingChat(Boolean enableMeetingChat){
		this.enableMeetingChat = enableMeetingChat;
	}

	public void enableMeetingChat(String multirequestToken){
		setToken("enableMeetingChat", multirequestToken);
	}


	public IntegrationSetting() {
		super();
	}

	public IntegrationSetting(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		status = VendorIntegrationStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		defaultUserId = GsonParser.parseString(jsonObject.get("defaultUserId"));
		accountId = GsonParser.parseString(jsonObject.get("accountId"));
		createUserIfNotExist = GsonParser.parseBoolean(jsonObject.get("createUserIfNotExist"));
		conversionProfileId = GsonParser.parseInt(jsonObject.get("conversionProfileId"));
		handleParticipantsMode = HandleParticipantsMode.get(GsonParser.parseInt(jsonObject.get("handleParticipantsMode")));
		deletionPolicy = GsonParser.parseBoolean(jsonObject.get("deletionPolicy"));
		createdAt = GsonParser.parseString(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseString(jsonObject.get("updatedAt"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		enableMeetingUpload = GsonParser.parseBoolean(jsonObject.get("enableMeetingUpload"));
		enableMeetingChat = GsonParser.parseBoolean(jsonObject.get("enableMeetingChat"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIntegrationSetting");
		kparams.add("defaultUserId", this.defaultUserId);
		kparams.add("createUserIfNotExist", this.createUserIfNotExist);
		kparams.add("conversionProfileId", this.conversionProfileId);
		kparams.add("handleParticipantsMode", this.handleParticipantsMode);
		kparams.add("deletionPolicy", this.deletionPolicy);
		kparams.add("enableMeetingUpload", this.enableMeetingUpload);
		kparams.add("enableMeetingChat", this.enableMeetingChat);
		return kparams;
	}

}

