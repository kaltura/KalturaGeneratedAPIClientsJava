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
import com.kaltura.client.enums.EntryVendorTaskStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EntryVendorTaskBaseFilter.Tokenizer.class)
public abstract class EntryVendorTaskBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String idEqual();
		String idIn();
		String vendorPartnerIdEqual();
		String vendorPartnerIdIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String queueTimeGreaterThanOrEqual();
		String queueTimeLessThanOrEqual();
		String finishTimeGreaterThanOrEqual();
		String finishTimeLessThanOrEqual();
		String entryIdEqual();
		String statusEqual();
		String statusIn();
		String reachProfileIdEqual();
		String reachProfileIdIn();
		String catalogItemIdEqual();
		String catalogItemIdIn();
		String userIdEqual();
		String contextEqual();
	}

	private Long idEqual;
	private String idIn;
	private Integer vendorPartnerIdEqual;
	private String vendorPartnerIdIn;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer updatedAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;
	private Integer queueTimeGreaterThanOrEqual;
	private Integer queueTimeLessThanOrEqual;
	private Integer finishTimeGreaterThanOrEqual;
	private Integer finishTimeLessThanOrEqual;
	private String entryIdEqual;
	private EntryVendorTaskStatus statusEqual;
	private String statusIn;
	private Integer reachProfileIdEqual;
	private String reachProfileIdIn;
	private Integer catalogItemIdEqual;
	private String catalogItemIdIn;
	private String userIdEqual;
	private String contextEqual;

	// idEqual:
	public Long getIdEqual(){
		return this.idEqual;
	}
	public void setIdEqual(Long idEqual){
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

	// queueTimeGreaterThanOrEqual:
	public Integer getQueueTimeGreaterThanOrEqual(){
		return this.queueTimeGreaterThanOrEqual;
	}
	public void setQueueTimeGreaterThanOrEqual(Integer queueTimeGreaterThanOrEqual){
		this.queueTimeGreaterThanOrEqual = queueTimeGreaterThanOrEqual;
	}

	public void queueTimeGreaterThanOrEqual(String multirequestToken){
		setToken("queueTimeGreaterThanOrEqual", multirequestToken);
	}

	// queueTimeLessThanOrEqual:
	public Integer getQueueTimeLessThanOrEqual(){
		return this.queueTimeLessThanOrEqual;
	}
	public void setQueueTimeLessThanOrEqual(Integer queueTimeLessThanOrEqual){
		this.queueTimeLessThanOrEqual = queueTimeLessThanOrEqual;
	}

	public void queueTimeLessThanOrEqual(String multirequestToken){
		setToken("queueTimeLessThanOrEqual", multirequestToken);
	}

	// finishTimeGreaterThanOrEqual:
	public Integer getFinishTimeGreaterThanOrEqual(){
		return this.finishTimeGreaterThanOrEqual;
	}
	public void setFinishTimeGreaterThanOrEqual(Integer finishTimeGreaterThanOrEqual){
		this.finishTimeGreaterThanOrEqual = finishTimeGreaterThanOrEqual;
	}

	public void finishTimeGreaterThanOrEqual(String multirequestToken){
		setToken("finishTimeGreaterThanOrEqual", multirequestToken);
	}

	// finishTimeLessThanOrEqual:
	public Integer getFinishTimeLessThanOrEqual(){
		return this.finishTimeLessThanOrEqual;
	}
	public void setFinishTimeLessThanOrEqual(Integer finishTimeLessThanOrEqual){
		this.finishTimeLessThanOrEqual = finishTimeLessThanOrEqual;
	}

	public void finishTimeLessThanOrEqual(String multirequestToken){
		setToken("finishTimeLessThanOrEqual", multirequestToken);
	}

	// entryIdEqual:
	public String getEntryIdEqual(){
		return this.entryIdEqual;
	}
	public void setEntryIdEqual(String entryIdEqual){
		this.entryIdEqual = entryIdEqual;
	}

	public void entryIdEqual(String multirequestToken){
		setToken("entryIdEqual", multirequestToken);
	}

	// statusEqual:
	public EntryVendorTaskStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(EntryVendorTaskStatus statusEqual){
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

	// reachProfileIdEqual:
	public Integer getReachProfileIdEqual(){
		return this.reachProfileIdEqual;
	}
	public void setReachProfileIdEqual(Integer reachProfileIdEqual){
		this.reachProfileIdEqual = reachProfileIdEqual;
	}

	public void reachProfileIdEqual(String multirequestToken){
		setToken("reachProfileIdEqual", multirequestToken);
	}

	// reachProfileIdIn:
	public String getReachProfileIdIn(){
		return this.reachProfileIdIn;
	}
	public void setReachProfileIdIn(String reachProfileIdIn){
		this.reachProfileIdIn = reachProfileIdIn;
	}

	public void reachProfileIdIn(String multirequestToken){
		setToken("reachProfileIdIn", multirequestToken);
	}

	// catalogItemIdEqual:
	public Integer getCatalogItemIdEqual(){
		return this.catalogItemIdEqual;
	}
	public void setCatalogItemIdEqual(Integer catalogItemIdEqual){
		this.catalogItemIdEqual = catalogItemIdEqual;
	}

	public void catalogItemIdEqual(String multirequestToken){
		setToken("catalogItemIdEqual", multirequestToken);
	}

	// catalogItemIdIn:
	public String getCatalogItemIdIn(){
		return this.catalogItemIdIn;
	}
	public void setCatalogItemIdIn(String catalogItemIdIn){
		this.catalogItemIdIn = catalogItemIdIn;
	}

	public void catalogItemIdIn(String multirequestToken){
		setToken("catalogItemIdIn", multirequestToken);
	}

	// userIdEqual:
	public String getUserIdEqual(){
		return this.userIdEqual;
	}
	public void setUserIdEqual(String userIdEqual){
		this.userIdEqual = userIdEqual;
	}

	public void userIdEqual(String multirequestToken){
		setToken("userIdEqual", multirequestToken);
	}

	// contextEqual:
	public String getContextEqual(){
		return this.contextEqual;
	}
	public void setContextEqual(String contextEqual){
		this.contextEqual = contextEqual;
	}

	public void contextEqual(String multirequestToken){
		setToken("contextEqual", multirequestToken);
	}


	public EntryVendorTaskBaseFilter() {
		super();
	}

	public EntryVendorTaskBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseLong(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		vendorPartnerIdEqual = GsonParser.parseInt(jsonObject.get("vendorPartnerIdEqual"));
		vendorPartnerIdIn = GsonParser.parseString(jsonObject.get("vendorPartnerIdIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
		queueTimeGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("queueTimeGreaterThanOrEqual"));
		queueTimeLessThanOrEqual = GsonParser.parseInt(jsonObject.get("queueTimeLessThanOrEqual"));
		finishTimeGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("finishTimeGreaterThanOrEqual"));
		finishTimeLessThanOrEqual = GsonParser.parseInt(jsonObject.get("finishTimeLessThanOrEqual"));
		entryIdEqual = GsonParser.parseString(jsonObject.get("entryIdEqual"));
		statusEqual = EntryVendorTaskStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		reachProfileIdEqual = GsonParser.parseInt(jsonObject.get("reachProfileIdEqual"));
		reachProfileIdIn = GsonParser.parseString(jsonObject.get("reachProfileIdIn"));
		catalogItemIdEqual = GsonParser.parseInt(jsonObject.get("catalogItemIdEqual"));
		catalogItemIdIn = GsonParser.parseString(jsonObject.get("catalogItemIdIn"));
		userIdEqual = GsonParser.parseString(jsonObject.get("userIdEqual"));
		contextEqual = GsonParser.parseString(jsonObject.get("contextEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryVendorTaskBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("vendorPartnerIdEqual", this.vendorPartnerIdEqual);
		kparams.add("vendorPartnerIdIn", this.vendorPartnerIdIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("queueTimeGreaterThanOrEqual", this.queueTimeGreaterThanOrEqual);
		kparams.add("queueTimeLessThanOrEqual", this.queueTimeLessThanOrEqual);
		kparams.add("finishTimeGreaterThanOrEqual", this.finishTimeGreaterThanOrEqual);
		kparams.add("finishTimeLessThanOrEqual", this.finishTimeLessThanOrEqual);
		kparams.add("entryIdEqual", this.entryIdEqual);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("reachProfileIdEqual", this.reachProfileIdEqual);
		kparams.add("reachProfileIdIn", this.reachProfileIdIn);
		kparams.add("catalogItemIdEqual", this.catalogItemIdEqual);
		kparams.add("catalogItemIdIn", this.catalogItemIdIn);
		kparams.add("userIdEqual", this.userIdEqual);
		kparams.add("contextEqual", this.contextEqual);
		return kparams;
	}

}

