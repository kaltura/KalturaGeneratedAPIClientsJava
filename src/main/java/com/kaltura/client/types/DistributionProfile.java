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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.enums.DistributionProfileActionStatus;
import com.kaltura.client.enums.DistributionProfileStatus;
import com.kaltura.client.enums.DistributionProviderType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DistributionProfile.Tokenizer.class)
public abstract class DistributionProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String createdAt();
		String updatedAt();
		String partnerId();
		String providerType();
		String name();
		String status();
		String submitEnabled();
		String updateEnabled();
		String deleteEnabled();
		String reportEnabled();
		String autoCreateFlavors();
		String autoCreateThumb();
		String optionalFlavorParamsIds();
		String requiredFlavorParamsIds();
		RequestBuilder.ListTokenizer<DistributionThumbDimensions.Tokenizer> optionalThumbDimensions();
		RequestBuilder.ListTokenizer<DistributionThumbDimensions.Tokenizer> requiredThumbDimensions();
		RequestBuilder.ListTokenizer<AssetDistributionRule.Tokenizer> optionalAssetDistributionRules();
		RequestBuilder.ListTokenizer<AssetDistributionRule.Tokenizer> requiredAssetDistributionRules();
		String sunriseDefaultOffset();
		String sunsetDefaultOffset();
		String recommendedStorageProfileForDownload();
		String recommendedDcForDownload();
		String recommendedDcForExecute();
	}

	/**
	 * Auto generated unique id
	 */
	private Integer id;
	/**
	 * Profile creation date as Unix timestamp (In seconds)
	 */
	private Integer createdAt;
	/**
	 * Profile last update date as Unix timestamp (In seconds)
	 */
	private Integer updatedAt;
	private Integer partnerId;
	private DistributionProviderType providerType;
	private String name;
	private DistributionProfileStatus status;
	private DistributionProfileActionStatus submitEnabled;
	private DistributionProfileActionStatus updateEnabled;
	private DistributionProfileActionStatus deleteEnabled;
	private DistributionProfileActionStatus reportEnabled;
	/**
	 * Comma separated flavor params ids that should be auto converted
	 */
	private String autoCreateFlavors;
	/**
	 * Comma separated thumbnail params ids that should be auto generated
	 */
	private String autoCreateThumb;
	/**
	 * Comma separated flavor params ids that should be submitted if ready
	 */
	private String optionalFlavorParamsIds;
	/**
	 * Comma separated flavor params ids that required to be ready before submission
	 */
	private String requiredFlavorParamsIds;
	/**
	 * Thumbnail dimensions that should be submitted if ready
	 */
	private List<DistributionThumbDimensions> optionalThumbDimensions;
	/**
	 * Thumbnail dimensions that required to be readt before submission
	 */
	private List<DistributionThumbDimensions> requiredThumbDimensions;
	/**
	 * Asset Distribution Rules for assets that should be submitted if ready
	 */
	private List<AssetDistributionRule> optionalAssetDistributionRules;
	/**
	 * Assets Asset Distribution Rules for assets that are required to be ready before
	  submission
	 */
	private List<AssetDistributionRule> requiredAssetDistributionRules;
	/**
	 * If entry distribution sunrise not specified that will be the default since entry
	  creation time, in seconds
	 */
	private Integer sunriseDefaultOffset;
	/**
	 * If entry distribution sunset not specified that will be the default since entry
	  creation time, in seconds
	 */
	private Integer sunsetDefaultOffset;
	/**
	 * The best external storage to be used to download the asset files from
	 */
	private Integer recommendedStorageProfileForDownload;
	/**
	 * The best Kaltura data center to be used to download the asset files to
	 */
	private Integer recommendedDcForDownload;
	/**
	 * The best Kaltura data center to be used to execute the distribution job
	 */
	private Integer recommendedDcForExecute;

	// id:
	public Integer getId(){
		return this.id;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// providerType:
	public DistributionProviderType getProviderType(){
		return this.providerType;
	}
	public void setProviderType(DistributionProviderType providerType){
		this.providerType = providerType;
	}

	public void providerType(String multirequestToken){
		setToken("providerType", multirequestToken);
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

	// status:
	public DistributionProfileStatus getStatus(){
		return this.status;
	}
	public void setStatus(DistributionProfileStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// submitEnabled:
	public DistributionProfileActionStatus getSubmitEnabled(){
		return this.submitEnabled;
	}
	public void setSubmitEnabled(DistributionProfileActionStatus submitEnabled){
		this.submitEnabled = submitEnabled;
	}

	public void submitEnabled(String multirequestToken){
		setToken("submitEnabled", multirequestToken);
	}

	// updateEnabled:
	public DistributionProfileActionStatus getUpdateEnabled(){
		return this.updateEnabled;
	}
	public void setUpdateEnabled(DistributionProfileActionStatus updateEnabled){
		this.updateEnabled = updateEnabled;
	}

	public void updateEnabled(String multirequestToken){
		setToken("updateEnabled", multirequestToken);
	}

	// deleteEnabled:
	public DistributionProfileActionStatus getDeleteEnabled(){
		return this.deleteEnabled;
	}
	public void setDeleteEnabled(DistributionProfileActionStatus deleteEnabled){
		this.deleteEnabled = deleteEnabled;
	}

	public void deleteEnabled(String multirequestToken){
		setToken("deleteEnabled", multirequestToken);
	}

	// reportEnabled:
	public DistributionProfileActionStatus getReportEnabled(){
		return this.reportEnabled;
	}
	public void setReportEnabled(DistributionProfileActionStatus reportEnabled){
		this.reportEnabled = reportEnabled;
	}

	public void reportEnabled(String multirequestToken){
		setToken("reportEnabled", multirequestToken);
	}

	// autoCreateFlavors:
	public String getAutoCreateFlavors(){
		return this.autoCreateFlavors;
	}
	public void setAutoCreateFlavors(String autoCreateFlavors){
		this.autoCreateFlavors = autoCreateFlavors;
	}

	public void autoCreateFlavors(String multirequestToken){
		setToken("autoCreateFlavors", multirequestToken);
	}

	// autoCreateThumb:
	public String getAutoCreateThumb(){
		return this.autoCreateThumb;
	}
	public void setAutoCreateThumb(String autoCreateThumb){
		this.autoCreateThumb = autoCreateThumb;
	}

	public void autoCreateThumb(String multirequestToken){
		setToken("autoCreateThumb", multirequestToken);
	}

	// optionalFlavorParamsIds:
	public String getOptionalFlavorParamsIds(){
		return this.optionalFlavorParamsIds;
	}
	public void setOptionalFlavorParamsIds(String optionalFlavorParamsIds){
		this.optionalFlavorParamsIds = optionalFlavorParamsIds;
	}

	public void optionalFlavorParamsIds(String multirequestToken){
		setToken("optionalFlavorParamsIds", multirequestToken);
	}

	// requiredFlavorParamsIds:
	public String getRequiredFlavorParamsIds(){
		return this.requiredFlavorParamsIds;
	}
	public void setRequiredFlavorParamsIds(String requiredFlavorParamsIds){
		this.requiredFlavorParamsIds = requiredFlavorParamsIds;
	}

	public void requiredFlavorParamsIds(String multirequestToken){
		setToken("requiredFlavorParamsIds", multirequestToken);
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

	public void sunriseDefaultOffset(String multirequestToken){
		setToken("sunriseDefaultOffset", multirequestToken);
	}

	// sunsetDefaultOffset:
	public Integer getSunsetDefaultOffset(){
		return this.sunsetDefaultOffset;
	}
	public void setSunsetDefaultOffset(Integer sunsetDefaultOffset){
		this.sunsetDefaultOffset = sunsetDefaultOffset;
	}

	public void sunsetDefaultOffset(String multirequestToken){
		setToken("sunsetDefaultOffset", multirequestToken);
	}

	// recommendedStorageProfileForDownload:
	public Integer getRecommendedStorageProfileForDownload(){
		return this.recommendedStorageProfileForDownload;
	}
	public void setRecommendedStorageProfileForDownload(Integer recommendedStorageProfileForDownload){
		this.recommendedStorageProfileForDownload = recommendedStorageProfileForDownload;
	}

	public void recommendedStorageProfileForDownload(String multirequestToken){
		setToken("recommendedStorageProfileForDownload", multirequestToken);
	}

	// recommendedDcForDownload:
	public Integer getRecommendedDcForDownload(){
		return this.recommendedDcForDownload;
	}
	public void setRecommendedDcForDownload(Integer recommendedDcForDownload){
		this.recommendedDcForDownload = recommendedDcForDownload;
	}

	public void recommendedDcForDownload(String multirequestToken){
		setToken("recommendedDcForDownload", multirequestToken);
	}

	// recommendedDcForExecute:
	public Integer getRecommendedDcForExecute(){
		return this.recommendedDcForExecute;
	}
	public void setRecommendedDcForExecute(Integer recommendedDcForExecute){
		this.recommendedDcForExecute = recommendedDcForExecute;
	}

	public void recommendedDcForExecute(String multirequestToken){
		setToken("recommendedDcForExecute", multirequestToken);
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

