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
import com.kaltura.client.enums.DistributionProviderType;
import com.kaltura.client.enums.DistributionProfileStatus;
import com.kaltura.client.enums.DistributionProfileActionStatus;
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class DistributionProfile extends ObjectBase {

	/**  Auto generated unique id  */
    private Integer id;
	/**  Profile creation date as Unix timestamp (In seconds)  */
    private Integer createdAt;
	/**  Profile last update date as Unix timestamp (In seconds)  */
    private Integer updatedAt;
    private Integer partnerId;
    private DistributionProviderType providerType;
    private String name;
    private DistributionProfileStatus status;
    private DistributionProfileActionStatus submitEnabled;
    private DistributionProfileActionStatus updateEnabled;
    private DistributionProfileActionStatus deleteEnabled;
    private DistributionProfileActionStatus reportEnabled;
	/**  Comma separated flavor params ids that should be auto converted  */
    private String autoCreateFlavors;
	/**  Comma separated thumbnail params ids that should be auto generated  */
    private String autoCreateThumb;
	/**  Comma separated flavor params ids that should be submitted if ready  */
    private String optionalFlavorParamsIds;
	/**  Comma separated flavor params ids that required to be ready before submission  */
    private String requiredFlavorParamsIds;
	/**  Thumbnail dimensions that should be submitted if ready  */
    private List<DistributionThumbDimensions> optionalThumbDimensions;
	/**  Thumbnail dimensions that required to be readt before submission  */
    private List<DistributionThumbDimensions> requiredThumbDimensions;
	/**  Asset Distribution Rules for assets that should be submitted if ready  */
    private List<AssetDistributionRule> optionalAssetDistributionRules;
	/**  Assets Asset Distribution Rules for assets that are required to be ready before
	  submission  */
    private List<AssetDistributionRule> requiredAssetDistributionRules;
	/**  If entry distribution sunrise not specified that will be the default since entry
	  creation time, in seconds  */
    private Integer sunriseDefaultOffset;
	/**  If entry distribution sunset not specified that will be the default since entry
	  creation time, in seconds  */
    private Integer sunsetDefaultOffset;
	/**  The best external storage to be used to download the asset files from  */
    private Integer recommendedStorageProfileForDownload;
	/**  The best Kaltura data center to be used to download the asset files to  */
    private Integer recommendedDcForDownload;
	/**  The best Kaltura data center to be used to execute the distribution job  */
    private Integer recommendedDcForExecute;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // updatedAt:
    public Integer getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(Integer updatedAt){
        this.updatedAt = updatedAt;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // providerType:
    public DistributionProviderType getProviderType(){
        return this.providerType;
    }
    public void setProviderType(DistributionProviderType providerType){
        this.providerType = providerType;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // status:
    public DistributionProfileStatus getStatus(){
        return this.status;
    }
    public void setStatus(DistributionProfileStatus status){
        this.status = status;
    }

    // submitEnabled:
    public DistributionProfileActionStatus getSubmitEnabled(){
        return this.submitEnabled;
    }
    public void setSubmitEnabled(DistributionProfileActionStatus submitEnabled){
        this.submitEnabled = submitEnabled;
    }

    // updateEnabled:
    public DistributionProfileActionStatus getUpdateEnabled(){
        return this.updateEnabled;
    }
    public void setUpdateEnabled(DistributionProfileActionStatus updateEnabled){
        this.updateEnabled = updateEnabled;
    }

    // deleteEnabled:
    public DistributionProfileActionStatus getDeleteEnabled(){
        return this.deleteEnabled;
    }
    public void setDeleteEnabled(DistributionProfileActionStatus deleteEnabled){
        this.deleteEnabled = deleteEnabled;
    }

    // reportEnabled:
    public DistributionProfileActionStatus getReportEnabled(){
        return this.reportEnabled;
    }
    public void setReportEnabled(DistributionProfileActionStatus reportEnabled){
        this.reportEnabled = reportEnabled;
    }

    // autoCreateFlavors:
    public String getAutoCreateFlavors(){
        return this.autoCreateFlavors;
    }
    public void setAutoCreateFlavors(String autoCreateFlavors){
        this.autoCreateFlavors = autoCreateFlavors;
    }

    // autoCreateThumb:
    public String getAutoCreateThumb(){
        return this.autoCreateThumb;
    }
    public void setAutoCreateThumb(String autoCreateThumb){
        this.autoCreateThumb = autoCreateThumb;
    }

    // optionalFlavorParamsIds:
    public String getOptionalFlavorParamsIds(){
        return this.optionalFlavorParamsIds;
    }
    public void setOptionalFlavorParamsIds(String optionalFlavorParamsIds){
        this.optionalFlavorParamsIds = optionalFlavorParamsIds;
    }

    // requiredFlavorParamsIds:
    public String getRequiredFlavorParamsIds(){
        return this.requiredFlavorParamsIds;
    }
    public void setRequiredFlavorParamsIds(String requiredFlavorParamsIds){
        this.requiredFlavorParamsIds = requiredFlavorParamsIds;
    }

    // optionalThumbDimensions:
    public List<DistributionThumbDimensions> getOptionalThumbDimensions(){
        return this.optionalThumbDimensions;
    }
    public void setOptionalThumbDimensions(List<DistributionThumbDimensions> optionalThumbDimensions){
        this.optionalThumbDimensions = optionalThumbDimensions;
    }

    // requiredThumbDimensions:
    public List<DistributionThumbDimensions> getRequiredThumbDimensions(){
        return this.requiredThumbDimensions;
    }
    public void setRequiredThumbDimensions(List<DistributionThumbDimensions> requiredThumbDimensions){
        this.requiredThumbDimensions = requiredThumbDimensions;
    }

    // optionalAssetDistributionRules:
    public List<AssetDistributionRule> getOptionalAssetDistributionRules(){
        return this.optionalAssetDistributionRules;
    }
    public void setOptionalAssetDistributionRules(List<AssetDistributionRule> optionalAssetDistributionRules){
        this.optionalAssetDistributionRules = optionalAssetDistributionRules;
    }

    // requiredAssetDistributionRules:
    public List<AssetDistributionRule> getRequiredAssetDistributionRules(){
        return this.requiredAssetDistributionRules;
    }
    public void setRequiredAssetDistributionRules(List<AssetDistributionRule> requiredAssetDistributionRules){
        this.requiredAssetDistributionRules = requiredAssetDistributionRules;
    }

    // sunriseDefaultOffset:
    public Integer getSunriseDefaultOffset(){
        return this.sunriseDefaultOffset;
    }
    public void setSunriseDefaultOffset(Integer sunriseDefaultOffset){
        this.sunriseDefaultOffset = sunriseDefaultOffset;
    }

    // sunsetDefaultOffset:
    public Integer getSunsetDefaultOffset(){
        return this.sunsetDefaultOffset;
    }
    public void setSunsetDefaultOffset(Integer sunsetDefaultOffset){
        this.sunsetDefaultOffset = sunsetDefaultOffset;
    }

    // recommendedStorageProfileForDownload:
    public Integer getRecommendedStorageProfileForDownload(){
        return this.recommendedStorageProfileForDownload;
    }
    public void setRecommendedStorageProfileForDownload(Integer recommendedStorageProfileForDownload){
        this.recommendedStorageProfileForDownload = recommendedStorageProfileForDownload;
    }

    // recommendedDcForDownload:
    public Integer getRecommendedDcForDownload(){
        return this.recommendedDcForDownload;
    }
    public void setRecommendedDcForDownload(Integer recommendedDcForDownload){
        this.recommendedDcForDownload = recommendedDcForDownload;
    }

    // recommendedDcForExecute:
    public Integer getRecommendedDcForExecute(){
        return this.recommendedDcForExecute;
    }
    public void setRecommendedDcForExecute(Integer recommendedDcForExecute){
        this.recommendedDcForExecute = recommendedDcForExecute;
    }


    public DistributionProfile() {
       super();
    }

    public DistributionProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        providerType = DistributionProviderType.get(GsonParser.parseString(jsonObject.get("providerType")));
        name = GsonParser.parseString(jsonObject.get("name"));
        status = DistributionProfileStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        submitEnabled = DistributionProfileActionStatus.get(GsonParser.parseInt(jsonObject.get("submitEnabled")));
        updateEnabled = DistributionProfileActionStatus.get(GsonParser.parseInt(jsonObject.get("updateEnabled")));
        deleteEnabled = DistributionProfileActionStatus.get(GsonParser.parseInt(jsonObject.get("deleteEnabled")));
        reportEnabled = DistributionProfileActionStatus.get(GsonParser.parseInt(jsonObject.get("reportEnabled")));
        autoCreateFlavors = GsonParser.parseString(jsonObject.get("autoCreateFlavors"));
        autoCreateThumb = GsonParser.parseString(jsonObject.get("autoCreateThumb"));
        optionalFlavorParamsIds = GsonParser.parseString(jsonObject.get("optionalFlavorParamsIds"));
        requiredFlavorParamsIds = GsonParser.parseString(jsonObject.get("requiredFlavorParamsIds"));
        optionalThumbDimensions = GsonParser.parseArray(jsonObject.getAsJsonArray("optionalThumbDimensions"), DistributionThumbDimensions.class);
        requiredThumbDimensions = GsonParser.parseArray(jsonObject.getAsJsonArray("requiredThumbDimensions"), DistributionThumbDimensions.class);
        optionalAssetDistributionRules = GsonParser.parseArray(jsonObject.getAsJsonArray("optionalAssetDistributionRules"), AssetDistributionRule.class);
        requiredAssetDistributionRules = GsonParser.parseArray(jsonObject.getAsJsonArray("requiredAssetDistributionRules"), AssetDistributionRule.class);
        sunriseDefaultOffset = GsonParser.parseInt(jsonObject.get("sunriseDefaultOffset"));
        sunsetDefaultOffset = GsonParser.parseInt(jsonObject.get("sunsetDefaultOffset"));
        recommendedStorageProfileForDownload = GsonParser.parseInt(jsonObject.get("recommendedStorageProfileForDownload"));
        recommendedDcForDownload = GsonParser.parseInt(jsonObject.get("recommendedDcForDownload"));
        recommendedDcForExecute = GsonParser.parseInt(jsonObject.get("recommendedDcForExecute"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaDistributionProfile");
        kparams.add("providerType", this.providerType);
        kparams.add("name", this.name);
        kparams.add("status", this.status);
        kparams.add("submitEnabled", this.submitEnabled);
        kparams.add("updateEnabled", this.updateEnabled);
        kparams.add("deleteEnabled", this.deleteEnabled);
        kparams.add("reportEnabled", this.reportEnabled);
        kparams.add("autoCreateFlavors", this.autoCreateFlavors);
        kparams.add("autoCreateThumb", this.autoCreateThumb);
        kparams.add("optionalFlavorParamsIds", this.optionalFlavorParamsIds);
        kparams.add("requiredFlavorParamsIds", this.requiredFlavorParamsIds);
        kparams.add("optionalThumbDimensions", this.optionalThumbDimensions);
        kparams.add("requiredThumbDimensions", this.requiredThumbDimensions);
        kparams.add("optionalAssetDistributionRules", this.optionalAssetDistributionRules);
        kparams.add("requiredAssetDistributionRules", this.requiredAssetDistributionRules);
        kparams.add("sunriseDefaultOffset", this.sunriseDefaultOffset);
        kparams.add("sunsetDefaultOffset", this.sunsetDefaultOffset);
        kparams.add("recommendedStorageProfileForDownload", this.recommendedStorageProfileForDownload);
        kparams.add("recommendedDcForDownload", this.recommendedDcForDownload);
        kparams.add("recommendedDcForExecute", this.recommendedDcForExecute);
        return kparams;
    }

}

