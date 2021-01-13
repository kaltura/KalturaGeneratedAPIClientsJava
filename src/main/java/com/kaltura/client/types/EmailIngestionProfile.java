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
import com.kaltura.client.enums.EmailIngestionProfileStatus;
import com.kaltura.client.enums.EntryModerationStatus;
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
@MultiRequestBuilder.Tokenizer(EmailIngestionProfile.Tokenizer.class)
public class EmailIngestionProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String description();
		String emailAddress();
		String mailboxId();
		String partnerId();
		String conversionProfile2Id();
		String moderationStatus();
		String status();
		String createdAt();
		String defaultCategory();
		String defaultUserId();
		String defaultTags();
		String defaultAdminTags();
		String maxAttachmentSizeKbytes();
		String maxAttachmentsPerMail();
	}

	private Integer id;
	private String name;
	private String description;
	private String emailAddress;
	private String mailboxId;
	private Integer partnerId;
	private Integer conversionProfile2Id;
	private EntryModerationStatus moderationStatus;
	private EmailIngestionProfileStatus status;
	private String createdAt;
	private String defaultCategory;
	private String defaultUserId;
	private String defaultTags;
	private String defaultAdminTags;
	private Integer maxAttachmentSizeKbytes;
	private Integer maxAttachmentsPerMail;

	// id:
	public Integer getId(){
		return this.id;
	}
	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
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

	// emailAddress:
	public String getEmailAddress(){
		return this.emailAddress;
	}
	public void setEmailAddress(String emailAddress){
		this.emailAddress = emailAddress;
	}

	public void emailAddress(String multirequestToken){
		setToken("emailAddress", multirequestToken);
	}

	// mailboxId:
	public String getMailboxId(){
		return this.mailboxId;
	}
	public void setMailboxId(String mailboxId){
		this.mailboxId = mailboxId;
	}

	public void mailboxId(String multirequestToken){
		setToken("mailboxId", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// conversionProfile2Id:
	public Integer getConversionProfile2Id(){
		return this.conversionProfile2Id;
	}
	public void setConversionProfile2Id(Integer conversionProfile2Id){
		this.conversionProfile2Id = conversionProfile2Id;
	}

	public void conversionProfile2Id(String multirequestToken){
		setToken("conversionProfile2Id", multirequestToken);
	}

	// moderationStatus:
	public EntryModerationStatus getModerationStatus(){
		return this.moderationStatus;
	}
	public void setModerationStatus(EntryModerationStatus moderationStatus){
		this.moderationStatus = moderationStatus;
	}

	public void moderationStatus(String multirequestToken){
		setToken("moderationStatus", multirequestToken);
	}

	// status:
	public EmailIngestionProfileStatus getStatus(){
		return this.status;
	}
	// createdAt:
	public String getCreatedAt(){
		return this.createdAt;
	}
	// defaultCategory:
	public String getDefaultCategory(){
		return this.defaultCategory;
	}
	public void setDefaultCategory(String defaultCategory){
		this.defaultCategory = defaultCategory;
	}

	public void defaultCategory(String multirequestToken){
		setToken("defaultCategory", multirequestToken);
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

	// defaultTags:
	public String getDefaultTags(){
		return this.defaultTags;
	}
	public void setDefaultTags(String defaultTags){
		this.defaultTags = defaultTags;
	}

	public void defaultTags(String multirequestToken){
		setToken("defaultTags", multirequestToken);
	}

	// defaultAdminTags:
	public String getDefaultAdminTags(){
		return this.defaultAdminTags;
	}
	public void setDefaultAdminTags(String defaultAdminTags){
		this.defaultAdminTags = defaultAdminTags;
	}

	public void defaultAdminTags(String multirequestToken){
		setToken("defaultAdminTags", multirequestToken);
	}

	// maxAttachmentSizeKbytes:
	public Integer getMaxAttachmentSizeKbytes(){
		return this.maxAttachmentSizeKbytes;
	}
	public void setMaxAttachmentSizeKbytes(Integer maxAttachmentSizeKbytes){
		this.maxAttachmentSizeKbytes = maxAttachmentSizeKbytes;
	}

	public void maxAttachmentSizeKbytes(String multirequestToken){
		setToken("maxAttachmentSizeKbytes", multirequestToken);
	}

	// maxAttachmentsPerMail:
	public Integer getMaxAttachmentsPerMail(){
		return this.maxAttachmentsPerMail;
	}
	public void setMaxAttachmentsPerMail(Integer maxAttachmentsPerMail){
		this.maxAttachmentsPerMail = maxAttachmentsPerMail;
	}

	public void maxAttachmentsPerMail(String multirequestToken){
		setToken("maxAttachmentsPerMail", multirequestToken);
	}


	public EmailIngestionProfile() {
		super();
	}

	public EmailIngestionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		description = GsonParser.parseString(jsonObject.get("description"));
		emailAddress = GsonParser.parseString(jsonObject.get("emailAddress"));
		mailboxId = GsonParser.parseString(jsonObject.get("mailboxId"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		conversionProfile2Id = GsonParser.parseInt(jsonObject.get("conversionProfile2Id"));
		moderationStatus = EntryModerationStatus.get(GsonParser.parseInt(jsonObject.get("moderationStatus")));
		status = EmailIngestionProfileStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		createdAt = GsonParser.parseString(jsonObject.get("createdAt"));
		defaultCategory = GsonParser.parseString(jsonObject.get("defaultCategory"));
		defaultUserId = GsonParser.parseString(jsonObject.get("defaultUserId"));
		defaultTags = GsonParser.parseString(jsonObject.get("defaultTags"));
		defaultAdminTags = GsonParser.parseString(jsonObject.get("defaultAdminTags"));
		maxAttachmentSizeKbytes = GsonParser.parseInt(jsonObject.get("maxAttachmentSizeKbytes"));
		maxAttachmentsPerMail = GsonParser.parseInt(jsonObject.get("maxAttachmentsPerMail"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEmailIngestionProfile");
		kparams.add("name", this.name);
		kparams.add("description", this.description);
		kparams.add("emailAddress", this.emailAddress);
		kparams.add("mailboxId", this.mailboxId);
		kparams.add("conversionProfile2Id", this.conversionProfile2Id);
		kparams.add("moderationStatus", this.moderationStatus);
		kparams.add("defaultCategory", this.defaultCategory);
		kparams.add("defaultUserId", this.defaultUserId);
		kparams.add("defaultTags", this.defaultTags);
		kparams.add("defaultAdminTags", this.defaultAdminTags);
		kparams.add("maxAttachmentSizeKbytes", this.maxAttachmentSizeKbytes);
		kparams.add("maxAttachmentsPerMail", this.maxAttachmentsPerMail);
		return kparams;
	}

}

