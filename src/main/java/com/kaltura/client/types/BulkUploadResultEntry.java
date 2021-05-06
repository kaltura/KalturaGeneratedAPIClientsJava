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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUploadResultEntry.Tokenizer.class)
public class BulkUploadResultEntry extends BulkUploadResult {
	
	public interface Tokenizer extends BulkUploadResult.Tokenizer {
		String entryId();
		String title();
		String description();
		String tags();
		String url();
		String contentType();
		String conversionProfileId();
		String accessControlProfileId();
		String category();
		String scheduleStartDate();
		String scheduleEndDate();
		String entryStatus();
		String thumbnailUrl();
		String thumbnailSaved();
		String sshPrivateKey();
		String sshPublicKey();
		String sshKeyPassphrase();
		String creatorId();
		String entitledUsersEdit();
		String entitledUsersPublish();
		String ownerId();
		String referenceId();
		String templateEntryId();
	}

	private String entryId;
	private String title;
	private String description;
	private String tags;
	private String url;
	private String contentType;
	private Integer conversionProfileId;
	private Integer accessControlProfileId;
	private String category;
	private Integer scheduleStartDate;
	private Integer scheduleEndDate;
	private Integer entryStatus;
	private String thumbnailUrl;
	private Boolean thumbnailSaved;
	private String sshPrivateKey;
	private String sshPublicKey;
	private String sshKeyPassphrase;
	private String creatorId;
	private String entitledUsersEdit;
	private String entitledUsersPublish;
	private String ownerId;
	private String referenceId;
	private String templateEntryId;

	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}

	// title:
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}

	public void title(String multirequestToken){
		setToken("title", multirequestToken);
	}

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// tags:
	public String getTags(){
		return this.tags;
	}
	public void setTags(String tags){
		this.tags = tags;
	}

	public void tags(String multirequestToken){
		setToken("tags", multirequestToken);
	}

	// url:
	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url = url;
	}

	public void url(String multirequestToken){
		setToken("url", multirequestToken);
	}

	// contentType:
	public String getContentType(){
		return this.contentType;
	}
	public void setContentType(String contentType){
		this.contentType = contentType;
	}

	public void contentType(String multirequestToken){
		setToken("contentType", multirequestToken);
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

	// accessControlProfileId:
	public Integer getAccessControlProfileId(){
		return this.accessControlProfileId;
	}
	public void setAccessControlProfileId(Integer accessControlProfileId){
		this.accessControlProfileId = accessControlProfileId;
	}

	public void accessControlProfileId(String multirequestToken){
		setToken("accessControlProfileId", multirequestToken);
	}

	// category:
	public String getCategory(){
		return this.category;
	}
	public void setCategory(String category){
		this.category = category;
	}

	public void category(String multirequestToken){
		setToken("category", multirequestToken);
	}

	// scheduleStartDate:
	public Integer getScheduleStartDate(){
		return this.scheduleStartDate;
	}
	public void setScheduleStartDate(Integer scheduleStartDate){
		this.scheduleStartDate = scheduleStartDate;
	}

	public void scheduleStartDate(String multirequestToken){
		setToken("scheduleStartDate", multirequestToken);
	}

	// scheduleEndDate:
	public Integer getScheduleEndDate(){
		return this.scheduleEndDate;
	}
	public void setScheduleEndDate(Integer scheduleEndDate){
		this.scheduleEndDate = scheduleEndDate;
	}

	public void scheduleEndDate(String multirequestToken){
		setToken("scheduleEndDate", multirequestToken);
	}

	// entryStatus:
	public Integer getEntryStatus(){
		return this.entryStatus;
	}
	public void setEntryStatus(Integer entryStatus){
		this.entryStatus = entryStatus;
	}

	public void entryStatus(String multirequestToken){
		setToken("entryStatus", multirequestToken);
	}

	// thumbnailUrl:
	public String getThumbnailUrl(){
		return this.thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl){
		this.thumbnailUrl = thumbnailUrl;
	}

	public void thumbnailUrl(String multirequestToken){
		setToken("thumbnailUrl", multirequestToken);
	}

	// thumbnailSaved:
	public Boolean getThumbnailSaved(){
		return this.thumbnailSaved;
	}
	public void setThumbnailSaved(Boolean thumbnailSaved){
		this.thumbnailSaved = thumbnailSaved;
	}

	public void thumbnailSaved(String multirequestToken){
		setToken("thumbnailSaved", multirequestToken);
	}

	// sshPrivateKey:
	public String getSshPrivateKey(){
		return this.sshPrivateKey;
	}
	public void setSshPrivateKey(String sshPrivateKey){
		this.sshPrivateKey = sshPrivateKey;
	}

	public void sshPrivateKey(String multirequestToken){
		setToken("sshPrivateKey", multirequestToken);
	}

	// sshPublicKey:
	public String getSshPublicKey(){
		return this.sshPublicKey;
	}
	public void setSshPublicKey(String sshPublicKey){
		this.sshPublicKey = sshPublicKey;
	}

	public void sshPublicKey(String multirequestToken){
		setToken("sshPublicKey", multirequestToken);
	}

	// sshKeyPassphrase:
	public String getSshKeyPassphrase(){
		return this.sshKeyPassphrase;
	}
	public void setSshKeyPassphrase(String sshKeyPassphrase){
		this.sshKeyPassphrase = sshKeyPassphrase;
	}

	public void sshKeyPassphrase(String multirequestToken){
		setToken("sshKeyPassphrase", multirequestToken);
	}

	// creatorId:
	public String getCreatorId(){
		return this.creatorId;
	}
	public void setCreatorId(String creatorId){
		this.creatorId = creatorId;
	}

	public void creatorId(String multirequestToken){
		setToken("creatorId", multirequestToken);
	}

	// entitledUsersEdit:
	public String getEntitledUsersEdit(){
		return this.entitledUsersEdit;
	}
	public void setEntitledUsersEdit(String entitledUsersEdit){
		this.entitledUsersEdit = entitledUsersEdit;
	}

	public void entitledUsersEdit(String multirequestToken){
		setToken("entitledUsersEdit", multirequestToken);
	}

	// entitledUsersPublish:
	public String getEntitledUsersPublish(){
		return this.entitledUsersPublish;
	}
	public void setEntitledUsersPublish(String entitledUsersPublish){
		this.entitledUsersPublish = entitledUsersPublish;
	}

	public void entitledUsersPublish(String multirequestToken){
		setToken("entitledUsersPublish", multirequestToken);
	}

	// ownerId:
	public String getOwnerId(){
		return this.ownerId;
	}
	public void setOwnerId(String ownerId){
		this.ownerId = ownerId;
	}

	public void ownerId(String multirequestToken){
		setToken("ownerId", multirequestToken);
	}

	// referenceId:
	public String getReferenceId(){
		return this.referenceId;
	}
	public void setReferenceId(String referenceId){
		this.referenceId = referenceId;
	}

	public void referenceId(String multirequestToken){
		setToken("referenceId", multirequestToken);
	}

	// templateEntryId:
	public String getTemplateEntryId(){
		return this.templateEntryId;
	}
	public void setTemplateEntryId(String templateEntryId){
		this.templateEntryId = templateEntryId;
	}

	public void templateEntryId(String multirequestToken){
		setToken("templateEntryId", multirequestToken);
	}


	public BulkUploadResultEntry() {
		super();
	}

	public BulkUploadResultEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		title = GsonParser.parseString(jsonObject.get("title"));
		description = GsonParser.parseString(jsonObject.get("description"));
		tags = GsonParser.parseString(jsonObject.get("tags"));
		url = GsonParser.parseString(jsonObject.get("url"));
		contentType = GsonParser.parseString(jsonObject.get("contentType"));
		conversionProfileId = GsonParser.parseInt(jsonObject.get("conversionProfileId"));
		accessControlProfileId = GsonParser.parseInt(jsonObject.get("accessControlProfileId"));
		category = GsonParser.parseString(jsonObject.get("category"));
		scheduleStartDate = GsonParser.parseInt(jsonObject.get("scheduleStartDate"));
		scheduleEndDate = GsonParser.parseInt(jsonObject.get("scheduleEndDate"));
		entryStatus = GsonParser.parseInt(jsonObject.get("entryStatus"));
		thumbnailUrl = GsonParser.parseString(jsonObject.get("thumbnailUrl"));
		thumbnailSaved = GsonParser.parseBoolean(jsonObject.get("thumbnailSaved"));
		sshPrivateKey = GsonParser.parseString(jsonObject.get("sshPrivateKey"));
		sshPublicKey = GsonParser.parseString(jsonObject.get("sshPublicKey"));
		sshKeyPassphrase = GsonParser.parseString(jsonObject.get("sshKeyPassphrase"));
		creatorId = GsonParser.parseString(jsonObject.get("creatorId"));
		entitledUsersEdit = GsonParser.parseString(jsonObject.get("entitledUsersEdit"));
		entitledUsersPublish = GsonParser.parseString(jsonObject.get("entitledUsersPublish"));
		ownerId = GsonParser.parseString(jsonObject.get("ownerId"));
		referenceId = GsonParser.parseString(jsonObject.get("referenceId"));
		templateEntryId = GsonParser.parseString(jsonObject.get("templateEntryId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUploadResultEntry");
		kparams.add("entryId", this.entryId);
		kparams.add("title", this.title);
		kparams.add("description", this.description);
		kparams.add("tags", this.tags);
		kparams.add("url", this.url);
		kparams.add("contentType", this.contentType);
		kparams.add("conversionProfileId", this.conversionProfileId);
		kparams.add("accessControlProfileId", this.accessControlProfileId);
		kparams.add("category", this.category);
		kparams.add("scheduleStartDate", this.scheduleStartDate);
		kparams.add("scheduleEndDate", this.scheduleEndDate);
		kparams.add("entryStatus", this.entryStatus);
		kparams.add("thumbnailUrl", this.thumbnailUrl);
		kparams.add("thumbnailSaved", this.thumbnailSaved);
		kparams.add("sshPrivateKey", this.sshPrivateKey);
		kparams.add("sshPublicKey", this.sshPublicKey);
		kparams.add("sshKeyPassphrase", this.sshKeyPassphrase);
		kparams.add("creatorId", this.creatorId);
		kparams.add("entitledUsersEdit", this.entitledUsersEdit);
		kparams.add("entitledUsersPublish", this.entitledUsersPublish);
		kparams.add("ownerId", this.ownerId);
		kparams.add("referenceId", this.referenceId);
		kparams.add("templateEntryId", this.templateEntryId);
		return kparams;
	}

}

