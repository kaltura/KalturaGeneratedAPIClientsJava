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
// Copyright (C) 2006-2021  Kaltura Inc.
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
import com.kaltura.client.enums.ZoomUsersMatching;
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
@MultiRequestBuilder.Tokenizer(ZoomIntegrationSetting.Tokenizer.class)
public class ZoomIntegrationSetting extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String defaultUserId();
		String zoomCategory();
		String accountId();
		String enableRecordingUpload();
		String createUserIfNotExist();
		String handleParticipantsMode();
		String zoomUserMatchingMode();
		String zoomUserPostfix();
		String zoomWebinarCategory();
		String enableWebinarUploads();
		String conversionProfileId();
		String jwtToken();
		String deletionPolicy();
		String enableZoomTranscription();
		String zoomAccountDescription();
		String createdAt();
		String updatedAt();
		String enableMeetingUpload();
	}

	private String defaultUserId;
	private String zoomCategory;
	private String accountId;
	private Boolean enableRecordingUpload;
	private Boolean createUserIfNotExist;
	private HandleParticipantsMode handleParticipantsMode;
	private ZoomUsersMatching zoomUserMatchingMode;
	private String zoomUserPostfix;
	private String zoomWebinarCategory;
	private Boolean enableWebinarUploads;
	private Integer conversionProfileId;
	private String jwtToken;
	private Boolean deletionPolicy;
	private Boolean enableZoomTranscription;
	private String zoomAccountDescription;
	private String createdAt;
	private String updatedAt;
	private Boolean enableMeetingUpload;

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

	// zoomCategory:
	public String getZoomCategory(){
		return this.zoomCategory;
	}
	public void setZoomCategory(String zoomCategory){
		this.zoomCategory = zoomCategory;
	}

	public void zoomCategory(String multirequestToken){
		setToken("zoomCategory", multirequestToken);
	}

	// accountId:
	public String getAccountId(){
		return this.accountId;
	}
	// enableRecordingUpload:
	public Boolean getEnableRecordingUpload(){
		return this.enableRecordingUpload;
	}
	public void setEnableRecordingUpload(Boolean enableRecordingUpload){
		this.enableRecordingUpload = enableRecordingUpload;
	}

	public void enableRecordingUpload(String multirequestToken){
		setToken("enableRecordingUpload", multirequestToken);
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

	// zoomUserMatchingMode:
	public ZoomUsersMatching getZoomUserMatchingMode(){
		return this.zoomUserMatchingMode;
	}
	public void setZoomUserMatchingMode(ZoomUsersMatching zoomUserMatchingMode){
		this.zoomUserMatchingMode = zoomUserMatchingMode;
	}

	public void zoomUserMatchingMode(String multirequestToken){
		setToken("zoomUserMatchingMode", multirequestToken);
	}

	// zoomUserPostfix:
	public String getZoomUserPostfix(){
		return this.zoomUserPostfix;
	}
	public void setZoomUserPostfix(String zoomUserPostfix){
		this.zoomUserPostfix = zoomUserPostfix;
	}

	public void zoomUserPostfix(String multirequestToken){
		setToken("zoomUserPostfix", multirequestToken);
	}

	// zoomWebinarCategory:
	public String getZoomWebinarCategory(){
		return this.zoomWebinarCategory;
	}
	public void setZoomWebinarCategory(String zoomWebinarCategory){
		this.zoomWebinarCategory = zoomWebinarCategory;
	}

	public void zoomWebinarCategory(String multirequestToken){
		setToken("zoomWebinarCategory", multirequestToken);
	}

	// enableWebinarUploads:
	public Boolean getEnableWebinarUploads(){
		return this.enableWebinarUploads;
	}
	public void setEnableWebinarUploads(Boolean enableWebinarUploads){
		this.enableWebinarUploads = enableWebinarUploads;
	}

	public void enableWebinarUploads(String multirequestToken){
		setToken("enableWebinarUploads", multirequestToken);
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

	// jwtToken:
	public String getJwtToken(){
		return this.jwtToken;
	}
	public void setJwtToken(String jwtToken){
		this.jwtToken = jwtToken;
	}

	public void jwtToken(String multirequestToken){
		setToken("jwtToken", multirequestToken);
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

	// enableZoomTranscription:
	public Boolean getEnableZoomTranscription(){
		return this.enableZoomTranscription;
	}
	public void setEnableZoomTranscription(Boolean enableZoomTranscription){
		this.enableZoomTranscription = enableZoomTranscription;
	}

	public void enableZoomTranscription(String multirequestToken){
		setToken("enableZoomTranscription", multirequestToken);
	}

	// zoomAccountDescription:
	public String getZoomAccountDescription(){
		return this.zoomAccountDescription;
	}
	public void setZoomAccountDescription(String zoomAccountDescription){
		this.zoomAccountDescription = zoomAccountDescription;
	}

	public void zoomAccountDescription(String multirequestToken){
		setToken("zoomAccountDescription", multirequestToken);
	}

	// createdAt:
	public String getCreatedAt(){
		return this.createdAt;
	}
	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public void createdAt(String multirequestToken){
		setToken("createdAt", multirequestToken);
	}

	// updatedAt:
	public String getUpdatedAt(){
		return this.updatedAt;
	}
	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public void updatedAt(String multirequestToken){
		setToken("updatedAt", multirequestToken);
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


	public ZoomIntegrationSetting() {
		super();
	}

	public ZoomIntegrationSetting(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		defaultUserId = GsonParser.parseString(jsonObject.get("defaultUserId"));
		zoomCategory = GsonParser.parseString(jsonObject.get("zoomCategory"));
		accountId = GsonParser.parseString(jsonObject.get("accountId"));
		enableRecordingUpload = GsonParser.parseBoolean(jsonObject.get("enableRecordingUpload"));
		createUserIfNotExist = GsonParser.parseBoolean(jsonObject.get("createUserIfNotExist"));
		handleParticipantsMode = HandleParticipantsMode.get(GsonParser.parseInt(jsonObject.get("handleParticipantsMode")));
		zoomUserMatchingMode = ZoomUsersMatching.get(GsonParser.parseInt(jsonObject.get("zoomUserMatchingMode")));
		zoomUserPostfix = GsonParser.parseString(jsonObject.get("zoomUserPostfix"));
		zoomWebinarCategory = GsonParser.parseString(jsonObject.get("zoomWebinarCategory"));
		enableWebinarUploads = GsonParser.parseBoolean(jsonObject.get("enableWebinarUploads"));
		conversionProfileId = GsonParser.parseInt(jsonObject.get("conversionProfileId"));
		jwtToken = GsonParser.parseString(jsonObject.get("jwtToken"));
		deletionPolicy = GsonParser.parseBoolean(jsonObject.get("deletionPolicy"));
		enableZoomTranscription = GsonParser.parseBoolean(jsonObject.get("enableZoomTranscription"));
		zoomAccountDescription = GsonParser.parseString(jsonObject.get("zoomAccountDescription"));
		createdAt = GsonParser.parseString(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseString(jsonObject.get("updatedAt"));
		enableMeetingUpload = GsonParser.parseBoolean(jsonObject.get("enableMeetingUpload"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaZoomIntegrationSetting");
		kparams.add("defaultUserId", this.defaultUserId);
		kparams.add("zoomCategory", this.zoomCategory);
		kparams.add("enableRecordingUpload", this.enableRecordingUpload);
		kparams.add("createUserIfNotExist", this.createUserIfNotExist);
		kparams.add("handleParticipantsMode", this.handleParticipantsMode);
		kparams.add("zoomUserMatchingMode", this.zoomUserMatchingMode);
		kparams.add("zoomUserPostfix", this.zoomUserPostfix);
		kparams.add("zoomWebinarCategory", this.zoomWebinarCategory);
		kparams.add("enableWebinarUploads", this.enableWebinarUploads);
		kparams.add("conversionProfileId", this.conversionProfileId);
		kparams.add("jwtToken", this.jwtToken);
		kparams.add("deletionPolicy", this.deletionPolicy);
		kparams.add("enableZoomTranscription", this.enableZoomTranscription);
		kparams.add("zoomAccountDescription", this.zoomAccountDescription);
		kparams.add("createdAt", this.createdAt);
		kparams.add("updatedAt", this.updatedAt);
		kparams.add("enableMeetingUpload", this.enableMeetingUpload);
		return kparams;
	}

}

