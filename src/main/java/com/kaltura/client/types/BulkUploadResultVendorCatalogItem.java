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
// Copyright (C) 2006-2022  Kaltura Inc.
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
import com.kaltura.client.enums.CatalogItemLanguage;
import com.kaltura.client.enums.VendorCatalogItemOutputFormat;
import com.kaltura.client.enums.VendorServiceFeature;
import com.kaltura.client.enums.VendorServiceTurnAroundTime;
import com.kaltura.client.enums.VendorServiceType;
import com.kaltura.client.types.VendorCatalogItemPricing;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUploadResultVendorCatalogItem.Tokenizer.class)
public class BulkUploadResultVendorCatalogItem extends BulkUploadResult {
	
	public interface Tokenizer extends BulkUploadResult.Tokenizer {
		String vendorCatalogItemId();
		String vendorPartnerId();
		String name();
		String systemName();
		String serviceFeature();
		String serviceType();
		String turnAroundTime();
		String sourceLanguage();
		String targetLanguage();
		String outputFormat();
		String enableSpeakerId();
		String fixedPriceAddons();
		VendorCatalogItemPricing.Tokenizer pricing();
		String flavorParamsId();
		String clearAudioFlavorParamsId();
	}

	private Integer vendorCatalogItemId;
	private Integer vendorPartnerId;
	private String name;
	private String systemName;
	private VendorServiceFeature serviceFeature;
	private VendorServiceType serviceType;
	private VendorServiceTurnAroundTime turnAroundTime;
	private CatalogItemLanguage sourceLanguage;
	private CatalogItemLanguage targetLanguage;
	private VendorCatalogItemOutputFormat outputFormat;
	private Boolean enableSpeakerId;
	private Integer fixedPriceAddons;
	private VendorCatalogItemPricing pricing;
	private Integer flavorParamsId;
	private Integer clearAudioFlavorParamsId;

	// vendorCatalogItemId:
	public Integer getVendorCatalogItemId(){
		return this.vendorCatalogItemId;
	}
	public void setVendorCatalogItemId(Integer vendorCatalogItemId){
		this.vendorCatalogItemId = vendorCatalogItemId;
	}

	public void vendorCatalogItemId(String multirequestToken){
		setToken("vendorCatalogItemId", multirequestToken);
	}

	// vendorPartnerId:
	public Integer getVendorPartnerId(){
		return this.vendorPartnerId;
	}
	public void setVendorPartnerId(Integer vendorPartnerId){
		this.vendorPartnerId = vendorPartnerId;
	}

	public void vendorPartnerId(String multirequestToken){
		setToken("vendorPartnerId", multirequestToken);
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

	// systemName:
	public String getSystemName(){
		return this.systemName;
	}
	public void setSystemName(String systemName){
		this.systemName = systemName;
	}

	public void systemName(String multirequestToken){
		setToken("systemName", multirequestToken);
	}

	// serviceFeature:
	public VendorServiceFeature getServiceFeature(){
		return this.serviceFeature;
	}
	public void setServiceFeature(VendorServiceFeature serviceFeature){
		this.serviceFeature = serviceFeature;
	}

	public void serviceFeature(String multirequestToken){
		setToken("serviceFeature", multirequestToken);
	}

	// serviceType:
	public VendorServiceType getServiceType(){
		return this.serviceType;
	}
	public void setServiceType(VendorServiceType serviceType){
		this.serviceType = serviceType;
	}

	public void serviceType(String multirequestToken){
		setToken("serviceType", multirequestToken);
	}

	// turnAroundTime:
	public VendorServiceTurnAroundTime getTurnAroundTime(){
		return this.turnAroundTime;
	}
	public void setTurnAroundTime(VendorServiceTurnAroundTime turnAroundTime){
		this.turnAroundTime = turnAroundTime;
	}

	public void turnAroundTime(String multirequestToken){
		setToken("turnAroundTime", multirequestToken);
	}

	// sourceLanguage:
	public CatalogItemLanguage getSourceLanguage(){
		return this.sourceLanguage;
	}
	public void setSourceLanguage(CatalogItemLanguage sourceLanguage){
		this.sourceLanguage = sourceLanguage;
	}

	public void sourceLanguage(String multirequestToken){
		setToken("sourceLanguage", multirequestToken);
	}

	// targetLanguage:
	public CatalogItemLanguage getTargetLanguage(){
		return this.targetLanguage;
	}
	public void setTargetLanguage(CatalogItemLanguage targetLanguage){
		this.targetLanguage = targetLanguage;
	}

	public void targetLanguage(String multirequestToken){
		setToken("targetLanguage", multirequestToken);
	}

	// outputFormat:
	public VendorCatalogItemOutputFormat getOutputFormat(){
		return this.outputFormat;
	}
	public void setOutputFormat(VendorCatalogItemOutputFormat outputFormat){
		this.outputFormat = outputFormat;
	}

	public void outputFormat(String multirequestToken){
		setToken("outputFormat", multirequestToken);
	}

	// enableSpeakerId:
	public Boolean getEnableSpeakerId(){
		return this.enableSpeakerId;
	}
	public void setEnableSpeakerId(Boolean enableSpeakerId){
		this.enableSpeakerId = enableSpeakerId;
	}

	public void enableSpeakerId(String multirequestToken){
		setToken("enableSpeakerId", multirequestToken);
	}

	// fixedPriceAddons:
	public Integer getFixedPriceAddons(){
		return this.fixedPriceAddons;
	}
	public void setFixedPriceAddons(Integer fixedPriceAddons){
		this.fixedPriceAddons = fixedPriceAddons;
	}

	public void fixedPriceAddons(String multirequestToken){
		setToken("fixedPriceAddons", multirequestToken);
	}

	// pricing:
	public VendorCatalogItemPricing getPricing(){
		return this.pricing;
	}
	public void setPricing(VendorCatalogItemPricing pricing){
		this.pricing = pricing;
	}

	// flavorParamsId:
	public Integer getFlavorParamsId(){
		return this.flavorParamsId;
	}
	public void setFlavorParamsId(Integer flavorParamsId){
		this.flavorParamsId = flavorParamsId;
	}

	public void flavorParamsId(String multirequestToken){
		setToken("flavorParamsId", multirequestToken);
	}

	// clearAudioFlavorParamsId:
	public Integer getClearAudioFlavorParamsId(){
		return this.clearAudioFlavorParamsId;
	}
	public void setClearAudioFlavorParamsId(Integer clearAudioFlavorParamsId){
		this.clearAudioFlavorParamsId = clearAudioFlavorParamsId;
	}

	public void clearAudioFlavorParamsId(String multirequestToken){
		setToken("clearAudioFlavorParamsId", multirequestToken);
	}


	public BulkUploadResultVendorCatalogItem() {
		super();
	}

	public BulkUploadResultVendorCatalogItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		vendorCatalogItemId = GsonParser.parseInt(jsonObject.get("vendorCatalogItemId"));
		vendorPartnerId = GsonParser.parseInt(jsonObject.get("vendorPartnerId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		serviceFeature = VendorServiceFeature.get(GsonParser.parseInt(jsonObject.get("serviceFeature")));
		serviceType = VendorServiceType.get(GsonParser.parseInt(jsonObject.get("serviceType")));
		turnAroundTime = VendorServiceTurnAroundTime.get(GsonParser.parseInt(jsonObject.get("turnAroundTime")));
		sourceLanguage = CatalogItemLanguage.get(GsonParser.parseString(jsonObject.get("sourceLanguage")));
		targetLanguage = CatalogItemLanguage.get(GsonParser.parseString(jsonObject.get("targetLanguage")));
		outputFormat = VendorCatalogItemOutputFormat.get(GsonParser.parseInt(jsonObject.get("outputFormat")));
		enableSpeakerId = GsonParser.parseBoolean(jsonObject.get("enableSpeakerId"));
		fixedPriceAddons = GsonParser.parseInt(jsonObject.get("fixedPriceAddons"));
		pricing = GsonParser.parseObject(jsonObject.getAsJsonObject("pricing"), VendorCatalogItemPricing.class);
		flavorParamsId = GsonParser.parseInt(jsonObject.get("flavorParamsId"));
		clearAudioFlavorParamsId = GsonParser.parseInt(jsonObject.get("clearAudioFlavorParamsId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUploadResultVendorCatalogItem");
		kparams.add("vendorCatalogItemId", this.vendorCatalogItemId);
		kparams.add("vendorPartnerId", this.vendorPartnerId);
		kparams.add("name", this.name);
		kparams.add("systemName", this.systemName);
		kparams.add("serviceFeature", this.serviceFeature);
		kparams.add("serviceType", this.serviceType);
		kparams.add("turnAroundTime", this.turnAroundTime);
		kparams.add("sourceLanguage", this.sourceLanguage);
		kparams.add("targetLanguage", this.targetLanguage);
		kparams.add("outputFormat", this.outputFormat);
		kparams.add("enableSpeakerId", this.enableSpeakerId);
		kparams.add("fixedPriceAddons", this.fixedPriceAddons);
		kparams.add("pricing", this.pricing);
		kparams.add("flavorParamsId", this.flavorParamsId);
		kparams.add("clearAudioFlavorParamsId", this.clearAudioFlavorParamsId);
		return kparams;
	}

}

