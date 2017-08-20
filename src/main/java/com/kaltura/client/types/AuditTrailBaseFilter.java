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
import com.kaltura.client.enums.AuditTrailAction;
import com.kaltura.client.enums.AuditTrailContext;
import com.kaltura.client.enums.AuditTrailObjectType;
import com.kaltura.client.enums.AuditTrailStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AuditTrailBaseFilter.Tokenizer.class)
public abstract class AuditTrailBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String idEqual();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String parsedAtGreaterThanOrEqual();
		String parsedAtLessThanOrEqual();
		String statusEqual();
		String statusIn();
		String auditObjectTypeEqual();
		String auditObjectTypeIn();
		String objectIdEqual();
		String objectIdIn();
		String relatedObjectIdEqual();
		String relatedObjectIdIn();
		String relatedObjectTypeEqual();
		String relatedObjectTypeIn();
		String entryIdEqual();
		String entryIdIn();
		String masterPartnerIdEqual();
		String masterPartnerIdIn();
		String partnerIdEqual();
		String partnerIdIn();
		String requestIdEqual();
		String requestIdIn();
		String userIdEqual();
		String userIdIn();
		String actionEqual();
		String actionIn();
		String ksEqual();
		String contextEqual();
		String contextIn();
		String entryPointEqual();
		String entryPointIn();
		String serverNameEqual();
		String serverNameIn();
		String ipAddressEqual();
		String ipAddressIn();
		String clientTagEqual();
	}

	private Integer idEqual;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer parsedAtGreaterThanOrEqual;
	private Integer parsedAtLessThanOrEqual;
	private AuditTrailStatus statusEqual;
	private String statusIn;
	private AuditTrailObjectType auditObjectTypeEqual;
	private String auditObjectTypeIn;
	private String objectIdEqual;
	private String objectIdIn;
	private String relatedObjectIdEqual;
	private String relatedObjectIdIn;
	private AuditTrailObjectType relatedObjectTypeEqual;
	private String relatedObjectTypeIn;
	private String entryIdEqual;
	private String entryIdIn;
	private Integer masterPartnerIdEqual;
	private String masterPartnerIdIn;
	private Integer partnerIdEqual;
	private String partnerIdIn;
	private String requestIdEqual;
	private String requestIdIn;
	private String userIdEqual;
	private String userIdIn;
	private AuditTrailAction actionEqual;
	private String actionIn;
	private String ksEqual;
	private AuditTrailContext contextEqual;
	private String contextIn;
	private String entryPointEqual;
	private String entryPointIn;
	private String serverNameEqual;
	private String serverNameIn;
	private String ipAddressEqual;
	private String ipAddressIn;
	private String clientTagEqual;

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

	// parsedAtGreaterThanOrEqual:
	public Integer getParsedAtGreaterThanOrEqual(){
		return this.parsedAtGreaterThanOrEqual;
	}
	public void setParsedAtGreaterThanOrEqual(Integer parsedAtGreaterThanOrEqual){
		this.parsedAtGreaterThanOrEqual = parsedAtGreaterThanOrEqual;
	}

	public void parsedAtGreaterThanOrEqual(String multirequestToken){
		setToken("parsedAtGreaterThanOrEqual", multirequestToken);
	}

	// parsedAtLessThanOrEqual:
	public Integer getParsedAtLessThanOrEqual(){
		return this.parsedAtLessThanOrEqual;
	}
	public void setParsedAtLessThanOrEqual(Integer parsedAtLessThanOrEqual){
		this.parsedAtLessThanOrEqual = parsedAtLessThanOrEqual;
	}

	public void parsedAtLessThanOrEqual(String multirequestToken){
		setToken("parsedAtLessThanOrEqual", multirequestToken);
	}

	// statusEqual:
	public AuditTrailStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(AuditTrailStatus statusEqual){
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

	// auditObjectTypeEqual:
	public AuditTrailObjectType getAuditObjectTypeEqual(){
		return this.auditObjectTypeEqual;
	}
	public void setAuditObjectTypeEqual(AuditTrailObjectType auditObjectTypeEqual){
		this.auditObjectTypeEqual = auditObjectTypeEqual;
	}

	public void auditObjectTypeEqual(String multirequestToken){
		setToken("auditObjectTypeEqual", multirequestToken);
	}

	// auditObjectTypeIn:
	public String getAuditObjectTypeIn(){
		return this.auditObjectTypeIn;
	}
	public void setAuditObjectTypeIn(String auditObjectTypeIn){
		this.auditObjectTypeIn = auditObjectTypeIn;
	}

	public void auditObjectTypeIn(String multirequestToken){
		setToken("auditObjectTypeIn", multirequestToken);
	}

	// objectIdEqual:
	public String getObjectIdEqual(){
		return this.objectIdEqual;
	}
	public void setObjectIdEqual(String objectIdEqual){
		this.objectIdEqual = objectIdEqual;
	}

	public void objectIdEqual(String multirequestToken){
		setToken("objectIdEqual", multirequestToken);
	}

	// objectIdIn:
	public String getObjectIdIn(){
		return this.objectIdIn;
	}
	public void setObjectIdIn(String objectIdIn){
		this.objectIdIn = objectIdIn;
	}

	public void objectIdIn(String multirequestToken){
		setToken("objectIdIn", multirequestToken);
	}

	// relatedObjectIdEqual:
	public String getRelatedObjectIdEqual(){
		return this.relatedObjectIdEqual;
	}
	public void setRelatedObjectIdEqual(String relatedObjectIdEqual){
		this.relatedObjectIdEqual = relatedObjectIdEqual;
	}

	public void relatedObjectIdEqual(String multirequestToken){
		setToken("relatedObjectIdEqual", multirequestToken);
	}

	// relatedObjectIdIn:
	public String getRelatedObjectIdIn(){
		return this.relatedObjectIdIn;
	}
	public void setRelatedObjectIdIn(String relatedObjectIdIn){
		this.relatedObjectIdIn = relatedObjectIdIn;
	}

	public void relatedObjectIdIn(String multirequestToken){
		setToken("relatedObjectIdIn", multirequestToken);
	}

	// relatedObjectTypeEqual:
	public AuditTrailObjectType getRelatedObjectTypeEqual(){
		return this.relatedObjectTypeEqual;
	}
	public void setRelatedObjectTypeEqual(AuditTrailObjectType relatedObjectTypeEqual){
		this.relatedObjectTypeEqual = relatedObjectTypeEqual;
	}

	public void relatedObjectTypeEqual(String multirequestToken){
		setToken("relatedObjectTypeEqual", multirequestToken);
	}

	// relatedObjectTypeIn:
	public String getRelatedObjectTypeIn(){
		return this.relatedObjectTypeIn;
	}
	public void setRelatedObjectTypeIn(String relatedObjectTypeIn){
		this.relatedObjectTypeIn = relatedObjectTypeIn;
	}

	public void relatedObjectTypeIn(String multirequestToken){
		setToken("relatedObjectTypeIn", multirequestToken);
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

	// entryIdIn:
	public String getEntryIdIn(){
		return this.entryIdIn;
	}
	public void setEntryIdIn(String entryIdIn){
		this.entryIdIn = entryIdIn;
	}

	public void entryIdIn(String multirequestToken){
		setToken("entryIdIn", multirequestToken);
	}

	// masterPartnerIdEqual:
	public Integer getMasterPartnerIdEqual(){
		return this.masterPartnerIdEqual;
	}
	public void setMasterPartnerIdEqual(Integer masterPartnerIdEqual){
		this.masterPartnerIdEqual = masterPartnerIdEqual;
	}

	public void masterPartnerIdEqual(String multirequestToken){
		setToken("masterPartnerIdEqual", multirequestToken);
	}

	// masterPartnerIdIn:
	public String getMasterPartnerIdIn(){
		return this.masterPartnerIdIn;
	}
	public void setMasterPartnerIdIn(String masterPartnerIdIn){
		this.masterPartnerIdIn = masterPartnerIdIn;
	}

	public void masterPartnerIdIn(String multirequestToken){
		setToken("masterPartnerIdIn", multirequestToken);
	}

	// partnerIdEqual:
	public Integer getPartnerIdEqual(){
		return this.partnerIdEqual;
	}
	public void setPartnerIdEqual(Integer partnerIdEqual){
		this.partnerIdEqual = partnerIdEqual;
	}

	public void partnerIdEqual(String multirequestToken){
		setToken("partnerIdEqual", multirequestToken);
	}

	// partnerIdIn:
	public String getPartnerIdIn(){
		return this.partnerIdIn;
	}
	public void setPartnerIdIn(String partnerIdIn){
		this.partnerIdIn = partnerIdIn;
	}

	public void partnerIdIn(String multirequestToken){
		setToken("partnerIdIn", multirequestToken);
	}

	// requestIdEqual:
	public String getRequestIdEqual(){
		return this.requestIdEqual;
	}
	public void setRequestIdEqual(String requestIdEqual){
		this.requestIdEqual = requestIdEqual;
	}

	public void requestIdEqual(String multirequestToken){
		setToken("requestIdEqual", multirequestToken);
	}

	// requestIdIn:
	public String getRequestIdIn(){
		return this.requestIdIn;
	}
	public void setRequestIdIn(String requestIdIn){
		this.requestIdIn = requestIdIn;
	}

	public void requestIdIn(String multirequestToken){
		setToken("requestIdIn", multirequestToken);
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

	// userIdIn:
	public String getUserIdIn(){
		return this.userIdIn;
	}
	public void setUserIdIn(String userIdIn){
		this.userIdIn = userIdIn;
	}

	public void userIdIn(String multirequestToken){
		setToken("userIdIn", multirequestToken);
	}

	// actionEqual:
	public AuditTrailAction getActionEqual(){
		return this.actionEqual;
	}
	public void setActionEqual(AuditTrailAction actionEqual){
		this.actionEqual = actionEqual;
	}

	public void actionEqual(String multirequestToken){
		setToken("actionEqual", multirequestToken);
	}

	// actionIn:
	public String getActionIn(){
		return this.actionIn;
	}
	public void setActionIn(String actionIn){
		this.actionIn = actionIn;
	}

	public void actionIn(String multirequestToken){
		setToken("actionIn", multirequestToken);
	}

	// ksEqual:
	public String getKsEqual(){
		return this.ksEqual;
	}
	public void setKsEqual(String ksEqual){
		this.ksEqual = ksEqual;
	}

	public void ksEqual(String multirequestToken){
		setToken("ksEqual", multirequestToken);
	}

	// contextEqual:
	public AuditTrailContext getContextEqual(){
		return this.contextEqual;
	}
	public void setContextEqual(AuditTrailContext contextEqual){
		this.contextEqual = contextEqual;
	}

	public void contextEqual(String multirequestToken){
		setToken("contextEqual", multirequestToken);
	}

	// contextIn:
	public String getContextIn(){
		return this.contextIn;
	}
	public void setContextIn(String contextIn){
		this.contextIn = contextIn;
	}

	public void contextIn(String multirequestToken){
		setToken("contextIn", multirequestToken);
	}

	// entryPointEqual:
	public String getEntryPointEqual(){
		return this.entryPointEqual;
	}
	public void setEntryPointEqual(String entryPointEqual){
		this.entryPointEqual = entryPointEqual;
	}

	public void entryPointEqual(String multirequestToken){
		setToken("entryPointEqual", multirequestToken);
	}

	// entryPointIn:
	public String getEntryPointIn(){
		return this.entryPointIn;
	}
	public void setEntryPointIn(String entryPointIn){
		this.entryPointIn = entryPointIn;
	}

	public void entryPointIn(String multirequestToken){
		setToken("entryPointIn", multirequestToken);
	}

	// serverNameEqual:
	public String getServerNameEqual(){
		return this.serverNameEqual;
	}
	public void setServerNameEqual(String serverNameEqual){
		this.serverNameEqual = serverNameEqual;
	}

	public void serverNameEqual(String multirequestToken){
		setToken("serverNameEqual", multirequestToken);
	}

	// serverNameIn:
	public String getServerNameIn(){
		return this.serverNameIn;
	}
	public void setServerNameIn(String serverNameIn){
		this.serverNameIn = serverNameIn;
	}

	public void serverNameIn(String multirequestToken){
		setToken("serverNameIn", multirequestToken);
	}

	// ipAddressEqual:
	public String getIpAddressEqual(){
		return this.ipAddressEqual;
	}
	public void setIpAddressEqual(String ipAddressEqual){
		this.ipAddressEqual = ipAddressEqual;
	}

	public void ipAddressEqual(String multirequestToken){
		setToken("ipAddressEqual", multirequestToken);
	}

	// ipAddressIn:
	public String getIpAddressIn(){
		return this.ipAddressIn;
	}
	public void setIpAddressIn(String ipAddressIn){
		this.ipAddressIn = ipAddressIn;
	}

	public void ipAddressIn(String multirequestToken){
		setToken("ipAddressIn", multirequestToken);
	}

	// clientTagEqual:
	public String getClientTagEqual(){
		return this.clientTagEqual;
	}
	public void setClientTagEqual(String clientTagEqual){
		this.clientTagEqual = clientTagEqual;
	}

	public void clientTagEqual(String multirequestToken){
		setToken("clientTagEqual", multirequestToken);
	}


	public AuditTrailBaseFilter() {
		super();
	}

	public AuditTrailBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		parsedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("parsedAtGreaterThanOrEqual"));
		parsedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("parsedAtLessThanOrEqual"));
		statusEqual = AuditTrailStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		auditObjectTypeEqual = AuditTrailObjectType.get(GsonParser.parseString(jsonObject.get("auditObjectTypeEqual")));
		auditObjectTypeIn = GsonParser.parseString(jsonObject.get("auditObjectTypeIn"));
		objectIdEqual = GsonParser.parseString(jsonObject.get("objectIdEqual"));
		objectIdIn = GsonParser.parseString(jsonObject.get("objectIdIn"));
		relatedObjectIdEqual = GsonParser.parseString(jsonObject.get("relatedObjectIdEqual"));
		relatedObjectIdIn = GsonParser.parseString(jsonObject.get("relatedObjectIdIn"));
		relatedObjectTypeEqual = AuditTrailObjectType.get(GsonParser.parseString(jsonObject.get("relatedObjectTypeEqual")));
		relatedObjectTypeIn = GsonParser.parseString(jsonObject.get("relatedObjectTypeIn"));
		entryIdEqual = GsonParser.parseString(jsonObject.get("entryIdEqual"));
		entryIdIn = GsonParser.parseString(jsonObject.get("entryIdIn"));
		masterPartnerIdEqual = GsonParser.parseInt(jsonObject.get("masterPartnerIdEqual"));
		masterPartnerIdIn = GsonParser.parseString(jsonObject.get("masterPartnerIdIn"));
		partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
		partnerIdIn = GsonParser.parseString(jsonObject.get("partnerIdIn"));
		requestIdEqual = GsonParser.parseString(jsonObject.get("requestIdEqual"));
		requestIdIn = GsonParser.parseString(jsonObject.get("requestIdIn"));
		userIdEqual = GsonParser.parseString(jsonObject.get("userIdEqual"));
		userIdIn = GsonParser.parseString(jsonObject.get("userIdIn"));
		actionEqual = AuditTrailAction.get(GsonParser.parseString(jsonObject.get("actionEqual")));
		actionIn = GsonParser.parseString(jsonObject.get("actionIn"));
		ksEqual = GsonParser.parseString(jsonObject.get("ksEqual"));
		contextEqual = AuditTrailContext.get(GsonParser.parseInt(jsonObject.get("contextEqual")));
		contextIn = GsonParser.parseString(jsonObject.get("contextIn"));
		entryPointEqual = GsonParser.parseString(jsonObject.get("entryPointEqual"));
		entryPointIn = GsonParser.parseString(jsonObject.get("entryPointIn"));
		serverNameEqual = GsonParser.parseString(jsonObject.get("serverNameEqual"));
		serverNameIn = GsonParser.parseString(jsonObject.get("serverNameIn"));
		ipAddressEqual = GsonParser.parseString(jsonObject.get("ipAddressEqual"));
		ipAddressIn = GsonParser.parseString(jsonObject.get("ipAddressIn"));
		clientTagEqual = GsonParser.parseString(jsonObject.get("clientTagEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAuditTrailBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("parsedAtGreaterThanOrEqual", this.parsedAtGreaterThanOrEqual);
		kparams.add("parsedAtLessThanOrEqual", this.parsedAtLessThanOrEqual);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("auditObjectTypeEqual", this.auditObjectTypeEqual);
		kparams.add("auditObjectTypeIn", this.auditObjectTypeIn);
		kparams.add("objectIdEqual", this.objectIdEqual);
		kparams.add("objectIdIn", this.objectIdIn);
		kparams.add("relatedObjectIdEqual", this.relatedObjectIdEqual);
		kparams.add("relatedObjectIdIn", this.relatedObjectIdIn);
		kparams.add("relatedObjectTypeEqual", this.relatedObjectTypeEqual);
		kparams.add("relatedObjectTypeIn", this.relatedObjectTypeIn);
		kparams.add("entryIdEqual", this.entryIdEqual);
		kparams.add("entryIdIn", this.entryIdIn);
		kparams.add("masterPartnerIdEqual", this.masterPartnerIdEqual);
		kparams.add("masterPartnerIdIn", this.masterPartnerIdIn);
		kparams.add("partnerIdEqual", this.partnerIdEqual);
		kparams.add("partnerIdIn", this.partnerIdIn);
		kparams.add("requestIdEqual", this.requestIdEqual);
		kparams.add("requestIdIn", this.requestIdIn);
		kparams.add("userIdEqual", this.userIdEqual);
		kparams.add("userIdIn", this.userIdIn);
		kparams.add("actionEqual", this.actionEqual);
		kparams.add("actionIn", this.actionIn);
		kparams.add("ksEqual", this.ksEqual);
		kparams.add("contextEqual", this.contextEqual);
		kparams.add("contextIn", this.contextIn);
		kparams.add("entryPointEqual", this.entryPointEqual);
		kparams.add("entryPointIn", this.entryPointIn);
		kparams.add("serverNameEqual", this.serverNameEqual);
		kparams.add("serverNameIn", this.serverNameIn);
		kparams.add("ipAddressEqual", this.ipAddressEqual);
		kparams.add("ipAddressIn", this.ipAddressIn);
		kparams.add("clientTagEqual", this.clientTagEqual);
		return kparams;
	}

}

