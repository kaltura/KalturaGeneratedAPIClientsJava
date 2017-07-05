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

import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.enums.EntryModerationStatus;
import com.kaltura.client.enums.EmailIngestionProfileStatus;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class EmailIngestionProfile extends ObjectBase {

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
    public void setId(Integer id){
        this.id = id;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // emailAddress:
    public String getEmailAddress(){
        return this.emailAddress;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    // mailboxId:
    public String getMailboxId(){
        return this.mailboxId;
    }
    public void setMailboxId(String mailboxId){
        this.mailboxId = mailboxId;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // conversionProfile2Id:
    public Integer getConversionProfile2Id(){
        return this.conversionProfile2Id;
    }
    public void setConversionProfile2Id(Integer conversionProfile2Id){
        this.conversionProfile2Id = conversionProfile2Id;
    }

    // moderationStatus:
    public EntryModerationStatus getModerationStatus(){
        return this.moderationStatus;
    }
    public void setModerationStatus(EntryModerationStatus moderationStatus){
        this.moderationStatus = moderationStatus;
    }

    // status:
    public EmailIngestionProfileStatus getStatus(){
        return this.status;
    }
    public void setStatus(EmailIngestionProfileStatus status){
        this.status = status;
    }

    // createdAt:
    public String getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(String createdAt){
        this.createdAt = createdAt;
    }

    // defaultCategory:
    public String getDefaultCategory(){
        return this.defaultCategory;
    }
    public void setDefaultCategory(String defaultCategory){
        this.defaultCategory = defaultCategory;
    }

    // defaultUserId:
    public String getDefaultUserId(){
        return this.defaultUserId;
    }
    public void setDefaultUserId(String defaultUserId){
        this.defaultUserId = defaultUserId;
    }

    // defaultTags:
    public String getDefaultTags(){
        return this.defaultTags;
    }
    public void setDefaultTags(String defaultTags){
        this.defaultTags = defaultTags;
    }

    // defaultAdminTags:
    public String getDefaultAdminTags(){
        return this.defaultAdminTags;
    }
    public void setDefaultAdminTags(String defaultAdminTags){
        this.defaultAdminTags = defaultAdminTags;
    }

    // maxAttachmentSizeKbytes:
    public Integer getMaxAttachmentSizeKbytes(){
        return this.maxAttachmentSizeKbytes;
    }
    public void setMaxAttachmentSizeKbytes(Integer maxAttachmentSizeKbytes){
        this.maxAttachmentSizeKbytes = maxAttachmentSizeKbytes;
    }

    // maxAttachmentsPerMail:
    public Integer getMaxAttachmentsPerMail(){
        return this.maxAttachmentsPerMail;
    }
    public void setMaxAttachmentsPerMail(Integer maxAttachmentsPerMail){
        this.maxAttachmentsPerMail = maxAttachmentsPerMail;
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

