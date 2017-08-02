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

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.enums.ConversionProfileStatus;
import com.kaltura.client.enums.ConversionProfileType;
import com.kaltura.client.enums.MediaParserType;
import com.kaltura.client.types.CropDimensions;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ConversionProfile extends ObjectBase {

	/**  The id of the Conversion Profile  */
    private Integer id;
    private Integer partnerId;
    private ConversionProfileStatus status;
    private ConversionProfileType type;
	/**  The name of the Conversion Profile  */
    private String name;
	/**  System name of the Conversion Profile  */
    private String systemName;
	/**  Comma separated tags  */
    private String tags;
	/**  The description of the Conversion Profile  */
    private String description;
	/**  ID of the default entry to be used for template data  */
    private String defaultEntryId;
	/**  Creation date as Unix timestamp (In seconds)  */
    private Integer createdAt;
	/**  List of included flavor ids (comma separated)  */
    private String flavorParamsIds;
	/**  Indicates that this conversion profile is system default  */
    private Boolean isDefault;
	/**  Indicates that this conversion profile is partner default  */
    private Boolean isPartnerDefault;
	/**  Cropping dimensions  */
    private CropDimensions cropDimensions;
	/**  Clipping start position (in miliseconds)  */
    private Integer clipStart;
	/**  Clipping duration (in miliseconds)  */
    private Integer clipDuration;
	/**  XSL to transform ingestion MRSS XML  */
    private String xslTransformation;
	/**  ID of default storage profile to be used for linked net-storage file syncs  */
    private Integer storageProfileId;
	/**  Media parser type to be used for extract media  */
    private MediaParserType mediaParserType;
	/**  Should calculate file conversion complexity  */
    private Boolean calculateComplexity;
	/**  Defines the tags that should be used to define 'collective'/group/multi-flavor
	  processing,   like 'mbr' or 'ism'  */
    private String collectionTags;
	/**  JSON string with array of "condition,profile-id" pairs.  */
    private String conditionalProfiles;
	/**  When set, the ExtractMedia job should detect the source file GOP using this
	  value as the max calculated period  */
    private Integer detectGOP;
	/**  XSL to transform ingestion Media Info XML  */
    private String mediaInfoXslTransformation;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // status:
    public ConversionProfileStatus getStatus(){
        return this.status;
    }
    public void setStatus(ConversionProfileStatus status){
        this.status = status;
    }

    // type:
    public ConversionProfileType getType(){
        return this.type;
    }
    public void setType(ConversionProfileType type){
        this.type = type;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // systemName:
    public String getSystemName(){
        return this.systemName;
    }
    public void setSystemName(String systemName){
        this.systemName = systemName;
    }

    // tags:
    public String getTags(){
        return this.tags;
    }
    public void setTags(String tags){
        this.tags = tags;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // defaultEntryId:
    public String getDefaultEntryId(){
        return this.defaultEntryId;
    }
    public void setDefaultEntryId(String defaultEntryId){
        this.defaultEntryId = defaultEntryId;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // flavorParamsIds:
    public String getFlavorParamsIds(){
        return this.flavorParamsIds;
    }
    public void setFlavorParamsIds(String flavorParamsIds){
        this.flavorParamsIds = flavorParamsIds;
    }

    // isDefault:
    public Boolean getIsDefault(){
        return this.isDefault;
    }
    public void setIsDefault(Boolean isDefault){
        this.isDefault = isDefault;
    }

    // isPartnerDefault:
    public Boolean getIsPartnerDefault(){
        return this.isPartnerDefault;
    }
    public void setIsPartnerDefault(Boolean isPartnerDefault){
        this.isPartnerDefault = isPartnerDefault;
    }

    // cropDimensions:
    public CropDimensions getCropDimensions(){
        return this.cropDimensions;
    }
    public void setCropDimensions(CropDimensions cropDimensions){
        this.cropDimensions = cropDimensions;
    }

    // clipStart:
    public Integer getClipStart(){
        return this.clipStart;
    }
    public void setClipStart(Integer clipStart){
        this.clipStart = clipStart;
    }

    // clipDuration:
    public Integer getClipDuration(){
        return this.clipDuration;
    }
    public void setClipDuration(Integer clipDuration){
        this.clipDuration = clipDuration;
    }

    // xslTransformation:
    public String getXslTransformation(){
        return this.xslTransformation;
    }
    public void setXslTransformation(String xslTransformation){
        this.xslTransformation = xslTransformation;
    }

    // storageProfileId:
    public Integer getStorageProfileId(){
        return this.storageProfileId;
    }
    public void setStorageProfileId(Integer storageProfileId){
        this.storageProfileId = storageProfileId;
    }

    // mediaParserType:
    public MediaParserType getMediaParserType(){
        return this.mediaParserType;
    }
    public void setMediaParserType(MediaParserType mediaParserType){
        this.mediaParserType = mediaParserType;
    }

    // calculateComplexity:
    public Boolean getCalculateComplexity(){
        return this.calculateComplexity;
    }
    public void setCalculateComplexity(Boolean calculateComplexity){
        this.calculateComplexity = calculateComplexity;
    }

    // collectionTags:
    public String getCollectionTags(){
        return this.collectionTags;
    }
    public void setCollectionTags(String collectionTags){
        this.collectionTags = collectionTags;
    }

    // conditionalProfiles:
    public String getConditionalProfiles(){
        return this.conditionalProfiles;
    }
    public void setConditionalProfiles(String conditionalProfiles){
        this.conditionalProfiles = conditionalProfiles;
    }

    // detectGOP:
    public Integer getDetectGOP(){
        return this.detectGOP;
    }
    public void setDetectGOP(Integer detectGOP){
        this.detectGOP = detectGOP;
    }

    // mediaInfoXslTransformation:
    public String getMediaInfoXslTransformation(){
        return this.mediaInfoXslTransformation;
    }
    public void setMediaInfoXslTransformation(String mediaInfoXslTransformation){
        this.mediaInfoXslTransformation = mediaInfoXslTransformation;
    }


    public ConversionProfile() {
       super();
    }

    public ConversionProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        status = ConversionProfileStatus.get(GsonParser.parseString(jsonObject.get("status")));
        type = ConversionProfileType.get(GsonParser.parseString(jsonObject.get("type")));
        name = GsonParser.parseString(jsonObject.get("name"));
        systemName = GsonParser.parseString(jsonObject.get("systemName"));
        tags = GsonParser.parseString(jsonObject.get("tags"));
        description = GsonParser.parseString(jsonObject.get("description"));
        defaultEntryId = GsonParser.parseString(jsonObject.get("defaultEntryId"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        flavorParamsIds = GsonParser.parseString(jsonObject.get("flavorParamsIds"));
        isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));
        isPartnerDefault = GsonParser.parseBoolean(jsonObject.get("isPartnerDefault"));
        cropDimensions = GsonParser.parseObject(jsonObject.getAsJsonObject("cropDimensions"), CropDimensions.class);
        clipStart = GsonParser.parseInt(jsonObject.get("clipStart"));
        clipDuration = GsonParser.parseInt(jsonObject.get("clipDuration"));
        xslTransformation = GsonParser.parseString(jsonObject.get("xslTransformation"));
        storageProfileId = GsonParser.parseInt(jsonObject.get("storageProfileId"));
        mediaParserType = MediaParserType.get(GsonParser.parseString(jsonObject.get("mediaParserType")));
        calculateComplexity = GsonParser.parseBoolean(jsonObject.get("calculateComplexity"));
        collectionTags = GsonParser.parseString(jsonObject.get("collectionTags"));
        conditionalProfiles = GsonParser.parseString(jsonObject.get("conditionalProfiles"));
        detectGOP = GsonParser.parseInt(jsonObject.get("detectGOP"));
        mediaInfoXslTransformation = GsonParser.parseString(jsonObject.get("mediaInfoXslTransformation"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaConversionProfile");
        kparams.add("status", this.status);
        kparams.add("type", this.type);
        kparams.add("name", this.name);
        kparams.add("systemName", this.systemName);
        kparams.add("tags", this.tags);
        kparams.add("description", this.description);
        kparams.add("defaultEntryId", this.defaultEntryId);
        kparams.add("flavorParamsIds", this.flavorParamsIds);
        kparams.add("isDefault", this.isDefault);
        kparams.add("cropDimensions", this.cropDimensions);
        kparams.add("clipStart", this.clipStart);
        kparams.add("clipDuration", this.clipDuration);
        kparams.add("xslTransformation", this.xslTransformation);
        kparams.add("storageProfileId", this.storageProfileId);
        kparams.add("mediaParserType", this.mediaParserType);
        kparams.add("calculateComplexity", this.calculateComplexity);
        kparams.add("collectionTags", this.collectionTags);
        kparams.add("conditionalProfiles", this.conditionalProfiles);
        kparams.add("detectGOP", this.detectGOP);
        kparams.add("mediaInfoXslTransformation", this.mediaInfoXslTransformation);
        return kparams;
    }

}

