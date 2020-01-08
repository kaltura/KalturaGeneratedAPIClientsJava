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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.enums.VendorCatalogItemStatus;
import com.kaltura.client.enums.VendorServiceFeature;
import com.kaltura.client.enums.VendorServiceTurnAroundTime;
import com.kaltura.client.enums.VendorServiceType;
import com.kaltura.client.types.ObjectBase;
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
@MultiRequestBuilder.Tokenizer(VendorCatalogItem.Tokenizer.class)
public abstract class VendorCatalogItem extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String vendorPartnerId();
		String name();
		String systemName();
		String createdAt();
		String updatedAt();
		String status();
		String serviceType();
		String serviceFeature();
		String turnAroundTime();
		VendorCatalogItemPricing.Tokenizer pricing();
	}

	private Integer id;
	private Integer vendorPartnerId;
	private String name;
	private String systemName;
	private Integer createdAt;
	private Integer updatedAt;
	private VendorCatalogItemStatus status;
	private VendorServiceType serviceType;
	private VendorServiceFeature serviceFeature;
	private VendorServiceTurnAroundTime turnAroundTime;
	private VendorCatalogItemPricing pricing;

	// id:
	public Integer getId(){
		return this.id;
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

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// status:
	public VendorCatalogItemStatus getStatus(){
		return this.status;
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

	// serviceFeature:
	public VendorServiceFeature getServiceFeature(){
		return this.serviceFeature;
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

	// pricing:
	public VendorCatalogItemPricing getPricing(){
		return this.pricing;
	}
	public void setPricing(VendorCatalogItemPricing pricing){
		this.pricing = pricing;
	}


	public VendorCatalogItem() {
		super();
	}

	public VendorCatalogItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		vendorPartnerId = GsonParser.parseInt(jsonObject.get("vendorPartnerId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		status = VendorCatalogItemStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		serviceType = VendorServiceType.get(GsonParser.parseInt(jsonObject.get("serviceType")));
		serviceFeature = VendorServiceFeature.get(GsonParser.parseInt(jsonObject.get("serviceFeature")));
		turnAroundTime = VendorServiceTurnAroundTime.get(GsonParser.parseInt(jsonObject.get("turnAroundTime")));
		pricing = GsonParser.parseObject(jsonObject.getAsJsonObject("pricing"), VendorCatalogItemPricing.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorCatalogItem");
		kparams.add("vendorPartnerId", this.vendorPartnerId);
		kparams.add("name", this.name);
		kparams.add("systemName", this.systemName);
		kparams.add("serviceType", this.serviceType);
		kparams.add("turnAroundTime", this.turnAroundTime);
		kparams.add("pricing", this.pricing);
		return kparams;
	}

}

