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
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class BulkUploadResultCategory extends BulkUploadResult {

    private String relativePath;
    private String name;
    private String referenceId;
    private String description;
    private String tags;
    private Integer appearInList;
    private Integer privacy;
    private Integer inheritanceType;
    private Integer userJoinPolicy;
    private Integer defaultPermissionLevel;
    private String owner;
    private Integer contributionPolicy;
    private Integer partnerSortValue;
    private Boolean moderation;

    // relativePath:
    public String getRelativePath(){
        return this.relativePath;
    }
    public void setRelativePath(String relativePath){
        this.relativePath = relativePath;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // referenceId:
    public String getReferenceId(){
        return this.referenceId;
    }
    public void setReferenceId(String referenceId){
        this.referenceId = referenceId;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // tags:
    public String getTags(){
        return this.tags;
    }
    public void setTags(String tags){
        this.tags = tags;
    }

    // appearInList:
    public Integer getAppearInList(){
        return this.appearInList;
    }
    public void setAppearInList(Integer appearInList){
        this.appearInList = appearInList;
    }

    // privacy:
    public Integer getPrivacy(){
        return this.privacy;
    }
    public void setPrivacy(Integer privacy){
        this.privacy = privacy;
    }

    // inheritanceType:
    public Integer getInheritanceType(){
        return this.inheritanceType;
    }
    public void setInheritanceType(Integer inheritanceType){
        this.inheritanceType = inheritanceType;
    }

    // userJoinPolicy:
    public Integer getUserJoinPolicy(){
        return this.userJoinPolicy;
    }
    public void setUserJoinPolicy(Integer userJoinPolicy){
        this.userJoinPolicy = userJoinPolicy;
    }

    // defaultPermissionLevel:
    public Integer getDefaultPermissionLevel(){
        return this.defaultPermissionLevel;
    }
    public void setDefaultPermissionLevel(Integer defaultPermissionLevel){
        this.defaultPermissionLevel = defaultPermissionLevel;
    }

    // owner:
    public String getOwner(){
        return this.owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }

    // contributionPolicy:
    public Integer getContributionPolicy(){
        return this.contributionPolicy;
    }
    public void setContributionPolicy(Integer contributionPolicy){
        this.contributionPolicy = contributionPolicy;
    }

    // partnerSortValue:
    public Integer getPartnerSortValue(){
        return this.partnerSortValue;
    }
    public void setPartnerSortValue(Integer partnerSortValue){
        this.partnerSortValue = partnerSortValue;
    }

    // moderation:
    public Boolean getModeration(){
        return this.moderation;
    }
    public void setModeration(Boolean moderation){
        this.moderation = moderation;
    }


    public BulkUploadResultCategory() {
       super();
    }

    public BulkUploadResultCategory(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        relativePath = GsonParser.parseString(jsonObject.get("relativePath"));
        name = GsonParser.parseString(jsonObject.get("name"));
        referenceId = GsonParser.parseString(jsonObject.get("referenceId"));
        description = GsonParser.parseString(jsonObject.get("description"));
        tags = GsonParser.parseString(jsonObject.get("tags"));
        appearInList = GsonParser.parseInt(jsonObject.get("appearInList"));
        privacy = GsonParser.parseInt(jsonObject.get("privacy"));
        inheritanceType = GsonParser.parseInt(jsonObject.get("inheritanceType"));
        userJoinPolicy = GsonParser.parseInt(jsonObject.get("userJoinPolicy"));
        defaultPermissionLevel = GsonParser.parseInt(jsonObject.get("defaultPermissionLevel"));
        owner = GsonParser.parseString(jsonObject.get("owner"));
        contributionPolicy = GsonParser.parseInt(jsonObject.get("contributionPolicy"));
        partnerSortValue = GsonParser.parseInt(jsonObject.get("partnerSortValue"));
        moderation = GsonParser.parseBoolean(jsonObject.get("moderation"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaBulkUploadResultCategory");
        kparams.add("relativePath", this.relativePath);
        kparams.add("name", this.name);
        kparams.add("referenceId", this.referenceId);
        kparams.add("description", this.description);
        kparams.add("tags", this.tags);
        kparams.add("appearInList", this.appearInList);
        kparams.add("privacy", this.privacy);
        kparams.add("inheritanceType", this.inheritanceType);
        kparams.add("userJoinPolicy", this.userJoinPolicy);
        kparams.add("defaultPermissionLevel", this.defaultPermissionLevel);
        kparams.add("owner", this.owner);
        kparams.add("contributionPolicy", this.contributionPolicy);
        kparams.add("partnerSortValue", this.partnerSortValue);
        kparams.add("moderation", this.moderation);
        return kparams;
    }

}

