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
@MultiRequestBuilder.Tokenizer(CrossKalturaDistributionProfile.Tokenizer.class)
public class CrossKalturaDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String targetServiceUrl();
		String targetAccountId();
		String targetLoginId();
		String targetLoginPassword();
		String metadataXslt();
		RequestBuilder.ListTokenizer<StringValue.Tokenizer> metadataXpathsTriggerUpdate();
		String distributeCaptions();
		String designatedCategories();
		String distributeCategories();
		String collaboratorsCustomMetadataProfileId();
		String collaboratorsFromCustomMetadataProfile();
		String distributeCuePoints();
		String distributeRemoteFlavorAssetContent();
		String distributeRemoteThumbAssetContent();
		String distributeRemoteCaptionAssetContent();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> mapAccessControlProfileIds();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> mapConversionProfileIds();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> mapMetadataProfileIds();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> mapStorageProfileIds();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> mapFlavorParamsIds();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> mapThumbParamsIds();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> mapCaptionParamsIds();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> mapAttachmentParamsIds();
	}

	private String targetServiceUrl;
	private Integer targetAccountId;
	private String targetLoginId;
	private String targetLoginPassword;
	private String metadataXslt;
	private List<StringValue> metadataXpathsTriggerUpdate;
	private Boolean distributeCaptions;
	private String designatedCategories;
	private Boolean distributeCategories;
	private String collaboratorsCustomMetadataProfileId;
	private Boolean collaboratorsFromCustomMetadataProfile;
	private Boolean distributeCuePoints;
	private Boolean distributeRemoteFlavorAssetContent;
	private Boolean distributeRemoteThumbAssetContent;
	private Boolean distributeRemoteCaptionAssetContent;
	private List<KeyValue> mapAccessControlProfileIds;
	private List<KeyValue> mapConversionProfileIds;
	private List<KeyValue> mapMetadataProfileIds;
	private List<KeyValue> mapStorageProfileIds;
	private List<KeyValue> mapFlavorParamsIds;
	private List<KeyValue> mapThumbParamsIds;
	private List<KeyValue> mapCaptionParamsIds;
	private List<KeyValue> mapAttachmentParamsIds;

	// targetServiceUrl:
	public String getTargetServiceUrl(){
		return this.targetServiceUrl;
	}
	public void setTargetServiceUrl(String targetServiceUrl){
		this.targetServiceUrl = targetServiceUrl;
	}

	public void targetServiceUrl(String multirequestToken){
		setToken("targetServiceUrl", multirequestToken);
	}

	// targetAccountId:
	public Integer getTargetAccountId(){
		return this.targetAccountId;
	}
	public void setTargetAccountId(Integer targetAccountId){
		this.targetAccountId = targetAccountId;
	}

	public void targetAccountId(String multirequestToken){
		setToken("targetAccountId", multirequestToken);
	}

	// targetLoginId:
	public String getTargetLoginId(){
		return this.targetLoginId;
	}
	public void setTargetLoginId(String targetLoginId){
		this.targetLoginId = targetLoginId;
	}

	public void targetLoginId(String multirequestToken){
		setToken("targetLoginId", multirequestToken);
	}

	// targetLoginPassword:
	public String getTargetLoginPassword(){
		return this.targetLoginPassword;
	}
	public void setTargetLoginPassword(String targetLoginPassword){
		this.targetLoginPassword = targetLoginPassword;
	}

	public void targetLoginPassword(String multirequestToken){
		setToken("targetLoginPassword", multirequestToken);
	}

	// metadataXslt:
	public String getMetadataXslt(){
		return this.metadataXslt;
	}
	public void setMetadataXslt(String metadataXslt){
		this.metadataXslt = metadataXslt;
	}

	public void metadataXslt(String multirequestToken){
		setToken("metadataXslt", multirequestToken);
	}

	// metadataXpathsTriggerUpdate:
	public List<StringValue> getMetadataXpathsTriggerUpdate(){
		return this.metadataXpathsTriggerUpdate;
	}
	public void setMetadataXpathsTriggerUpdate(List<StringValue> metadataXpathsTriggerUpdate){
		this.metadataXpathsTriggerUpdate = metadataXpathsTriggerUpdate;
	}

	// distributeCaptions:
	public Boolean getDistributeCaptions(){
		return this.distributeCaptions;
	}
	public void setDistributeCaptions(Boolean distributeCaptions){
		this.distributeCaptions = distributeCaptions;
	}

	public void distributeCaptions(String multirequestToken){
		setToken("distributeCaptions", multirequestToken);
	}

	// designatedCategories:
	public String getDesignatedCategories(){
		return this.designatedCategories;
	}
	public void setDesignatedCategories(String designatedCategories){
		this.designatedCategories = designatedCategories;
	}

	public void designatedCategories(String multirequestToken){
		setToken("designatedCategories", multirequestToken);
	}

	// distributeCategories:
	public Boolean getDistributeCategories(){
		return this.distributeCategories;
	}
	public void setDistributeCategories(Boolean distributeCategories){
		this.distributeCategories = distributeCategories;
	}

	public void distributeCategories(String multirequestToken){
		setToken("distributeCategories", multirequestToken);
	}

	// collaboratorsCustomMetadataProfileId:
	public String getCollaboratorsCustomMetadataProfileId(){
		return this.collaboratorsCustomMetadataProfileId;
	}
	public void setCollaboratorsCustomMetadataProfileId(String collaboratorsCustomMetadataProfileId){
		this.collaboratorsCustomMetadataProfileId = collaboratorsCustomMetadataProfileId;
	}

	public void collaboratorsCustomMetadataProfileId(String multirequestToken){
		setToken("collaboratorsCustomMetadataProfileId", multirequestToken);
	}

	// collaboratorsFromCustomMetadataProfile:
	public Boolean getCollaboratorsFromCustomMetadataProfile(){
		return this.collaboratorsFromCustomMetadataProfile;
	}
	public void setCollaboratorsFromCustomMetadataProfile(Boolean collaboratorsFromCustomMetadataProfile){
		this.collaboratorsFromCustomMetadataProfile = collaboratorsFromCustomMetadataProfile;
	}

	public void collaboratorsFromCustomMetadataProfile(String multirequestToken){
		setToken("collaboratorsFromCustomMetadataProfile", multirequestToken);
	}

	// distributeCuePoints:
	public Boolean getDistributeCuePoints(){
		return this.distributeCuePoints;
	}
	public void setDistributeCuePoints(Boolean distributeCuePoints){
		this.distributeCuePoints = distributeCuePoints;
	}

	public void distributeCuePoints(String multirequestToken){
		setToken("distributeCuePoints", multirequestToken);
	}

	// distributeRemoteFlavorAssetContent:
	public Boolean getDistributeRemoteFlavorAssetContent(){
		return this.distributeRemoteFlavorAssetContent;
	}
	public void setDistributeRemoteFlavorAssetContent(Boolean distributeRemoteFlavorAssetContent){
		this.distributeRemoteFlavorAssetContent = distributeRemoteFlavorAssetContent;
	}

	public void distributeRemoteFlavorAssetContent(String multirequestToken){
		setToken("distributeRemoteFlavorAssetContent", multirequestToken);
	}

	// distributeRemoteThumbAssetContent:
	public Boolean getDistributeRemoteThumbAssetContent(){
		return this.distributeRemoteThumbAssetContent;
	}
	public void setDistributeRemoteThumbAssetContent(Boolean distributeRemoteThumbAssetContent){
		this.distributeRemoteThumbAssetContent = distributeRemoteThumbAssetContent;
	}

	public void distributeRemoteThumbAssetContent(String multirequestToken){
		setToken("distributeRemoteThumbAssetContent", multirequestToken);
	}

	// distributeRemoteCaptionAssetContent:
	public Boolean getDistributeRemoteCaptionAssetContent(){
		return this.distributeRemoteCaptionAssetContent;
	}
	public void setDistributeRemoteCaptionAssetContent(Boolean distributeRemoteCaptionAssetContent){
		this.distributeRemoteCaptionAssetContent = distributeRemoteCaptionAssetContent;
	}

	public void distributeRemoteCaptionAssetContent(String multirequestToken){
		setToken("distributeRemoteCaptionAssetContent", multirequestToken);
	}

	// mapAccessControlProfileIds:
	public List<KeyValue> getMapAccessControlProfileIds(){
		return this.mapAccessControlProfileIds;
	}
	public void setMapAccessControlProfileIds(List<KeyValue> mapAccessControlProfileIds){
		this.mapAccessControlProfileIds = mapAccessControlProfileIds;
	}

	// mapConversionProfileIds:
	public List<KeyValue> getMapConversionProfileIds(){
		return this.mapConversionProfileIds;
	}
	public void setMapConversionProfileIds(List<KeyValue> mapConversionProfileIds){
		this.mapConversionProfileIds = mapConversionProfileIds;
	}

	// mapMetadataProfileIds:
	public List<KeyValue> getMapMetadataProfileIds(){
		return this.mapMetadataProfileIds;
	}
	public void setMapMetadataProfileIds(List<KeyValue> mapMetadataProfileIds){
		this.mapMetadataProfileIds = mapMetadataProfileIds;
	}

	// mapStorageProfileIds:
	public List<KeyValue> getMapStorageProfileIds(){
		return this.mapStorageProfileIds;
	}
	public void setMapStorageProfileIds(List<KeyValue> mapStorageProfileIds){
		this.mapStorageProfileIds = mapStorageProfileIds;
	}

	// mapFlavorParamsIds:
	public List<KeyValue> getMapFlavorParamsIds(){
		return this.mapFlavorParamsIds;
	}
	public void setMapFlavorParamsIds(List<KeyValue> mapFlavorParamsIds){
		this.mapFlavorParamsIds = mapFlavorParamsIds;
	}

	// mapThumbParamsIds:
	public List<KeyValue> getMapThumbParamsIds(){
		return this.mapThumbParamsIds;
	}
	public void setMapThumbParamsIds(List<KeyValue> mapThumbParamsIds){
		this.mapThumbParamsIds = mapThumbParamsIds;
	}

	// mapCaptionParamsIds:
	public List<KeyValue> getMapCaptionParamsIds(){
		return this.mapCaptionParamsIds;
	}
	public void setMapCaptionParamsIds(List<KeyValue> mapCaptionParamsIds){
		this.mapCaptionParamsIds = mapCaptionParamsIds;
	}

	// mapAttachmentParamsIds:
	public List<KeyValue> getMapAttachmentParamsIds(){
		return this.mapAttachmentParamsIds;
	}
	public void setMapAttachmentParamsIds(List<KeyValue> mapAttachmentParamsIds){
		this.mapAttachmentParamsIds = mapAttachmentParamsIds;
	}


	public CrossKalturaDistributionProfile() {
		super();
	}

	public CrossKalturaDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		targetServiceUrl = GsonParser.parseString(jsonObject.get("targetServiceUrl"));
		targetAccountId = GsonParser.parseInt(jsonObject.get("targetAccountId"));
		targetLoginId = GsonParser.parseString(jsonObject.get("targetLoginId"));
		targetLoginPassword = GsonParser.parseString(jsonObject.get("targetLoginPassword"));
		metadataXslt = GsonParser.parseString(jsonObject.get("metadataXslt"));
		metadataXpathsTriggerUpdate = GsonParser.parseArray(jsonObject.getAsJsonArray("metadataXpathsTriggerUpdate"), StringValue.class);
		distributeCaptions = GsonParser.parseBoolean(jsonObject.get("distributeCaptions"));
		designatedCategories = GsonParser.parseString(jsonObject.get("designatedCategories"));
		distributeCategories = GsonParser.parseBoolean(jsonObject.get("distributeCategories"));
		collaboratorsCustomMetadataProfileId = GsonParser.parseString(jsonObject.get("collaboratorsCustomMetadataProfileId"));
		collaboratorsFromCustomMetadataProfile = GsonParser.parseBoolean(jsonObject.get("collaboratorsFromCustomMetadataProfile"));
		distributeCuePoints = GsonParser.parseBoolean(jsonObject.get("distributeCuePoints"));
		distributeRemoteFlavorAssetContent = GsonParser.parseBoolean(jsonObject.get("distributeRemoteFlavorAssetContent"));
		distributeRemoteThumbAssetContent = GsonParser.parseBoolean(jsonObject.get("distributeRemoteThumbAssetContent"));
		distributeRemoteCaptionAssetContent = GsonParser.parseBoolean(jsonObject.get("distributeRemoteCaptionAssetContent"));
		mapAccessControlProfileIds = GsonParser.parseArray(jsonObject.getAsJsonArray("mapAccessControlProfileIds"), KeyValue.class);
		mapConversionProfileIds = GsonParser.parseArray(jsonObject.getAsJsonArray("mapConversionProfileIds"), KeyValue.class);
		mapMetadataProfileIds = GsonParser.parseArray(jsonObject.getAsJsonArray("mapMetadataProfileIds"), KeyValue.class);
		mapStorageProfileIds = GsonParser.parseArray(jsonObject.getAsJsonArray("mapStorageProfileIds"), KeyValue.class);
		mapFlavorParamsIds = GsonParser.parseArray(jsonObject.getAsJsonArray("mapFlavorParamsIds"), KeyValue.class);
		mapThumbParamsIds = GsonParser.parseArray(jsonObject.getAsJsonArray("mapThumbParamsIds"), KeyValue.class);
		mapCaptionParamsIds = GsonParser.parseArray(jsonObject.getAsJsonArray("mapCaptionParamsIds"), KeyValue.class);
		mapAttachmentParamsIds = GsonParser.parseArray(jsonObject.getAsJsonArray("mapAttachmentParamsIds"), KeyValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCrossKalturaDistributionProfile");
		kparams.add("targetServiceUrl", this.targetServiceUrl);
		kparams.add("targetAccountId", this.targetAccountId);
		kparams.add("targetLoginId", this.targetLoginId);
		kparams.add("targetLoginPassword", this.targetLoginPassword);
		kparams.add("metadataXslt", this.metadataXslt);
		kparams.add("metadataXpathsTriggerUpdate", this.metadataXpathsTriggerUpdate);
		kparams.add("distributeCaptions", this.distributeCaptions);
		kparams.add("designatedCategories", this.designatedCategories);
		kparams.add("distributeCategories", this.distributeCategories);
		kparams.add("collaboratorsCustomMetadataProfileId", this.collaboratorsCustomMetadataProfileId);
		kparams.add("collaboratorsFromCustomMetadataProfile", this.collaboratorsFromCustomMetadataProfile);
		kparams.add("distributeCuePoints", this.distributeCuePoints);
		kparams.add("distributeRemoteFlavorAssetContent", this.distributeRemoteFlavorAssetContent);
		kparams.add("distributeRemoteThumbAssetContent", this.distributeRemoteThumbAssetContent);
		kparams.add("distributeRemoteCaptionAssetContent", this.distributeRemoteCaptionAssetContent);
		kparams.add("mapAccessControlProfileIds", this.mapAccessControlProfileIds);
		kparams.add("mapConversionProfileIds", this.mapConversionProfileIds);
		kparams.add("mapMetadataProfileIds", this.mapMetadataProfileIds);
		kparams.add("mapStorageProfileIds", this.mapStorageProfileIds);
		kparams.add("mapFlavorParamsIds", this.mapFlavorParamsIds);
		kparams.add("mapThumbParamsIds", this.mapThumbParamsIds);
		kparams.add("mapCaptionParamsIds", this.mapCaptionParamsIds);
		kparams.add("mapAttachmentParamsIds", this.mapAttachmentParamsIds);
		return kparams;
	}

}

