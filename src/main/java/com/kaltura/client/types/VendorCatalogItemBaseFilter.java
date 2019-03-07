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
import com.kaltura.client.enums.VendorCatalogItemStatus;
import com.kaltura.client.enums.VendorServiceFeature;
import com.kaltura.client.enums.VendorServiceTurnAroundTime;
import com.kaltura.client.enums.VendorServiceType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VendorCatalogItemBaseFilter.Tokenizer.class)
public abstract class VendorCatalogItemBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String idEqual();
		String idIn();
		String idNotIn();
		String vendorPartnerIdEqual();
		String vendorPartnerIdIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String statusEqual();
		String statusIn();
		String serviceTypeEqual();
		String serviceTypeIn();
		String serviceFeatureEqual();
		String serviceFeatureIn();
		String turnAroundTimeEqual();
		String turnAroundTimeIn();
	}

	private Integer idEqual;
	private String idIn;
	private String idNotIn;
	private Integer vendorPartnerIdEqual;
	private String vendorPartnerIdIn;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer updatedAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;
	private VendorCatalogItemStatus statusEqual;
	private String statusIn;
	private VendorServiceType serviceTypeEqual;
	private String serviceTypeIn;
	private VendorServiceFeature serviceFeatureEqual;
	private String serviceFeatureIn;
	private VendorServiceTurnAroundTime turnAroundTimeEqual;
	private String turnAroundTimeIn;

	// idEqual:
	public Integer getIdEqual(){
		return this.idEqual;
	}
	public void setIdEqual(Integer idEqual){
		this.idEqual = idEqual;
	}

	public void idEqual(String multirequestToken){
		setToken("idEqual", multirequestToken);
	}

	// idIn:
	public String getIdIn(){
		return this.idIn;
	}
	public void setIdIn(String idIn){
		this.idIn = idIn;
	}

	public void idIn(String multirequestToken){
		setToken("idIn", multirequestToken);
	}

	// idNotIn:
	public String getIdNotIn(){
		return this.idNotIn;
	}
	public void setIdNotIn(String idNotIn){
		this.idNotIn = idNotIn;
	}

	public void idNotIn(String multirequestToken){
		setToken("idNotIn", multirequestToken);
	}

	// vendorPartnerIdEqual:
	public Integer getVendorPartnerIdEqual(){
		return this.vendorPartnerIdEqual;
	}
	public void setVendorPartnerIdEqual(Integer vendorPartnerIdEqual){
		this.vendorPartnerIdEqual = vendorPartnerIdEqual;
	}

	public void vendorPartnerIdEqual(String multirequestToken){
		setToken("vendorPartnerIdEqual", multirequestToken);
	}

	// vendorPartnerIdIn:
	public String getVendorPartnerIdIn(){
		return this.vendorPartnerIdIn;
	}
	public void setVendorPartnerIdIn(String vendorPartnerIdIn){
		this.vendorPartnerIdIn = vendorPartnerIdIn;
	}

	public void vendorPartnerIdIn(String multirequestToken){
		setToken("vendorPartnerIdIn", multirequestToken);
	}

	// createdAtGreaterThanOrEqual:
	public Integer getCreatedAtGreaterThanOrEqual(){
		return this.createdAtGreaterThanOrEqual;
	}
	public void setCreatedAtGreaterThanOrEqual(Integer createdAtGreaterThanOrEqual){
		this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
	}

	public void createdAtGreaterThanOrEqual(String multirequestToken){
		setToken("createdAtGreaterThanOrEqual", multirequestToken);
	}

	// createdAtLessThanOrEqual:
	public Integer getCreatedAtLessThanOrEqual(){
		return this.createdAtLessThanOrEqual;
	}
	public void setCreatedAtLessThanOrEqual(Integer createdAtLessThanOrEqual){
		this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
	}

	public void createdAtLessThanOrEqual(String multirequestToken){
		setToken("createdAtLessThanOrEqual", multirequestToken);
	}

	// updatedAtGreaterThanOrEqual:
	public Integer getUpdatedAtGreaterThanOrEqual(){
		return this.updatedAtGreaterThanOrEqual;
	}
	public void setUpdatedAtGreaterThanOrEqual(Integer updatedAtGreaterThanOrEqual){
		this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
	}

	public void updatedAtGreaterThanOrEqual(String multirequestToken){
		setToken("updatedAtGreaterThanOrEqual", multirequestToken);
	}

	// updatedAtLessThanOrEqual:
	public Integer getUpdatedAtLessThanOrEqual(){
		return this.updatedAtLessThanOrEqual;
	}
	public void setUpdatedAtLessThanOrEqual(Integer updatedAtLessThanOrEqual){
		this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
	}

	public void updatedAtLessThanOrEqual(String multirequestToken){
		setToken("updatedAtLessThanOrEqual", multirequestToken);
	}

	// statusEqual:
	public VendorCatalogItemStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(VendorCatalogItemStatus statusEqual){
		this.statusEqual = statusEqual;
	}

	public void statusEqual(String multirequestToken){
		setToken("statusEqual", multirequestToken);
	}

	// statusIn:
	public String getStatusIn(){
		return this.statusIn;
	}
	public void setStatusIn(String statusIn){
		this.statusIn = statusIn;
	}

	public void statusIn(String multirequestToken){
		setToken("statusIn", multirequestToken);
	}

	// serviceTypeEqual:
	public VendorServiceType getServiceTypeEqual(){
		return this.serviceTypeEqual;
	}
	public void setServiceTypeEqual(VendorServiceType serviceTypeEqual){
		this.serviceTypeEqual = serviceTypeEqual;
	}

	public void serviceTypeEqual(String multirequestToken){
		setToken("serviceTypeEqual", multirequestToken);
	}

	// serviceTypeIn:
	public String getServiceTypeIn(){
		return this.serviceTypeIn;
	}
	public void setServiceTypeIn(String serviceTypeIn){
		this.serviceTypeIn = serviceTypeIn;
	}

	public void serviceTypeIn(String multirequestToken){
		setToken("serviceTypeIn", multirequestToken);
	}

	// serviceFeatureEqual:
	public VendorServiceFeature getServiceFeatureEqual(){
		return this.serviceFeatureEqual;
	}
	public void setServiceFeatureEqual(VendorServiceFeature serviceFeatureEqual){
		this.serviceFeatureEqual = serviceFeatureEqual;
	}

	public void serviceFeatureEqual(String multirequestToken){
		setToken("serviceFeatureEqual", multirequestToken);
	}

	// serviceFeatureIn:
	public String getServiceFeatureIn(){
		return this.serviceFeatureIn;
	}
	public void setServiceFeatureIn(String serviceFeatureIn){
		this.serviceFeatureIn = serviceFeatureIn;
	}

	public void serviceFeatureIn(String multirequestToken){
		setToken("serviceFeatureIn", multirequestToken);
	}

	// turnAroundTimeEqual:
	public VendorServiceTurnAroundTime getTurnAroundTimeEqual(){
		return this.turnAroundTimeEqual;
	}
	public void setTurnAroundTimeEqual(VendorServiceTurnAroundTime turnAroundTimeEqual){
		this.turnAroundTimeEqual = turnAroundTimeEqual;
	}

	public void turnAroundTimeEqual(String multirequestToken){
		setToken("turnAroundTimeEqual", multirequestToken);
	}

	// turnAroundTimeIn:
	public String getTurnAroundTimeIn(){
		return this.turnAroundTimeIn;
	}
	public void setTurnAroundTimeIn(String turnAroundTimeIn){
		this.turnAroundTimeIn = turnAroundTimeIn;
	}

	public void turnAroundTimeIn(String multirequestToken){
		setToken("turnAroundTimeIn", multirequestToken);
	}


	public VendorCatalogItemBaseFilter() {
		super();
	}

	public VendorCatalogItemBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		idNotIn = GsonParser.parseString(jsonObject.get("idNotIn"));
		vendorPartnerIdEqual = GsonParser.parseInt(jsonObject.get("vendorPartnerIdEqual"));
		vendorPartnerIdIn = GsonParser.parseString(jsonObject.get("vendorPartnerIdIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
		statusEqual = VendorCatalogItemStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		serviceTypeEqual = VendorServiceType.get(GsonParser.parseInt(jsonObject.get("serviceTypeEqual")));
		serviceTypeIn = GsonParser.parseString(jsonObject.get("serviceTypeIn"));
		serviceFeatureEqual = VendorServiceFeature.get(GsonParser.parseInt(jsonObject.get("serviceFeatureEqual")));
		serviceFeatureIn = GsonParser.parseString(jsonObject.get("serviceFeatureIn"));
		turnAroundTimeEqual = VendorServiceTurnAroundTime.get(GsonParser.parseInt(jsonObject.get("turnAroundTimeEqual")));
		turnAroundTimeIn = GsonParser.parseString(jsonObject.get("turnAroundTimeIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorCatalogItemBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("idNotIn", this.idNotIn);
		kparams.add("vendorPartnerIdEqual", this.vendorPartnerIdEqual);
		kparams.add("vendorPartnerIdIn", this.vendorPartnerIdIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("serviceTypeEqual", this.serviceTypeEqual);
		kparams.add("serviceTypeIn", this.serviceTypeIn);
		kparams.add("serviceFeatureEqual", this.serviceFeatureEqual);
		kparams.add("serviceFeatureIn", this.serviceFeatureIn);
		kparams.add("turnAroundTimeEqual", this.turnAroundTimeEqual);
		kparams.add("turnAroundTimeIn", this.turnAroundTimeIn);
		return kparams;
	}

}

