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
import com.kaltura.client.enums.AuditTrailAction;
import com.kaltura.client.enums.AuditTrailContext;
import com.kaltura.client.enums.AuditTrailObjectType;
import com.kaltura.client.enums.AuditTrailStatus;
import com.kaltura.client.types.AuditTrailInfo;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AuditTrail.Tokenizer.class)
public class AuditTrail extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String createdAt();
		String parsedAt();
		String status();
		String auditObjectType();
		String objectId();
		String relatedObjectId();
		String relatedObjectType();
		String entryId();
		String masterPartnerId();
		String partnerId();
		String requestId();
		String userId();
		String action();
		AuditTrailInfo.Tokenizer data();
		String ks();
		String context();
		String entryPoint();
		String serverName();
		String ipAddress();
		String userAgent();
		String clientTag();
		String description();
		String errorDescription();
	}

	private Integer id;
	private Integer createdAt;
	/**
	 * Indicates when the data was parsed
	 */
	private Integer parsedAt;
	private AuditTrailStatus status;
	private AuditTrailObjectType auditObjectType;
	private String objectId;
	private String relatedObjectId;
	private AuditTrailObjectType relatedObjectType;
	private String entryId;
	private Integer masterPartnerId;
	private Integer partnerId;
	private String requestId;
	private String userId;
	private AuditTrailAction action;
	private AuditTrailInfo data;
	private String ks;
	private AuditTrailContext context;
	/**
	 * The API service and action that called and caused this audit
	 */
	private String entryPoint;
	private String serverName;
	private String ipAddress;
	private String userAgent;
	private String clientTag;
	private String description;
	private String errorDescription;

	// id:
	public Integer getId(){
		return this.id;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// parsedAt:
	public Integer getParsedAt(){
		return this.parsedAt;
	}
	// status:
	public AuditTrailStatus getStatus(){
		return this.status;
	}
	// auditObjectType:
	public AuditTrailObjectType getAuditObjectType(){
		return this.auditObjectType;
	}
	public void setAuditObjectType(AuditTrailObjectType auditObjectType){
		this.auditObjectType = auditObjectType;
	}

	public void auditObjectType(String multirequestToken){
		setToken("auditObjectType", multirequestToken);
	}

	// objectId:
	public String getObjectId(){
		return this.objectId;
	}
	public void setObjectId(String objectId){
		this.objectId = objectId;
	}

	public void objectId(String multirequestToken){
		setToken("objectId", multirequestToken);
	}

	// relatedObjectId:
	public String getRelatedObjectId(){
		return this.relatedObjectId;
	}
	public void setRelatedObjectId(String relatedObjectId){
		this.relatedObjectId = relatedObjectId;
	}

	public void relatedObjectId(String multirequestToken){
		setToken("relatedObjectId", multirequestToken);
	}

	// relatedObjectType:
	public AuditTrailObjectType getRelatedObjectType(){
		return this.relatedObjectType;
	}
	public void setRelatedObjectType(AuditTrailObjectType relatedObjectType){
		this.relatedObjectType = relatedObjectType;
	}

	public void relatedObjectType(String multirequestToken){
		setToken("relatedObjectType", multirequestToken);
	}

	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}

	// masterPartnerId:
	public Integer getMasterPartnerId(){
		return this.masterPartnerId;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// requestId:
	public String getRequestId(){
		return this.requestId;
	}
	// userId:
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
	}

	// action:
	public AuditTrailAction getAction(){
		return this.action;
	}
	public void setAction(AuditTrailAction action){
		this.action = action;
	}

	public void action(String multirequestToken){
		setToken("action", multirequestToken);
	}

	// data:
	public AuditTrailInfo getData(){
		return this.data;
	}
	public void setData(AuditTrailInfo data){
		this.data = data;
	}

	// ks:
	public String getKs(){
		return this.ks;
	}
	// context:
	public AuditTrailContext getContext(){
		return this.context;
	}
	// entryPoint:
	public String getEntryPoint(){
		return this.entryPoint;
	}
	// serverName:
	public String getServerName(){
		return this.serverName;
	}
	// ipAddress:
	public String getIpAddress(){
		return this.ipAddress;
	}
	// userAgent:
	public String getUserAgent(){
		return this.userAgent;
	}
	// clientTag:
	public String getClientTag(){
		return this.clientTag;
	}
	public void setClientTag(String clientTag){
		this.clientTag = clientTag;
	}

	public void clientTag(String multirequestToken){
		setToken("clientTag", multirequestToken);
	}

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// errorDescription:
	public String getErrorDescription(){
		return this.errorDescription;
	}

	public AuditTrail() {
		super();
	}

	public AuditTrail(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		parsedAt = GsonParser.parseInt(jsonObject.get("parsedAt"));
		status = AuditTrailStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		auditObjectType = AuditTrailObjectType.get(GsonParser.parseString(jsonObject.get("auditObjectType")));
		objectId = GsonParser.parseString(jsonObject.get("objectId"));
		relatedObjectId = GsonParser.parseString(jsonObject.get("relatedObjectId"));
		relatedObjectType = AuditTrailObjectType.get(GsonParser.parseString(jsonObject.get("relatedObjectType")));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		masterPartnerId = GsonParser.parseInt(jsonObject.get("masterPartnerId"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		requestId = GsonParser.parseString(jsonObject.get("requestId"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		action = AuditTrailAction.get(GsonParser.parseString(jsonObject.get("action")));
		data = GsonParser.parseObject(jsonObject.getAsJsonObject("data"), AuditTrailInfo.class);
		ks = GsonParser.parseString(jsonObject.get("ks"));
		context = AuditTrailContext.get(GsonParser.parseInt(jsonObject.get("context")));
		entryPoint = GsonParser.parseString(jsonObject.get("entryPoint"));
		serverName = GsonParser.parseString(jsonObject.get("serverName"));
		ipAddress = GsonParser.parseString(jsonObject.get("ipAddress"));
		userAgent = GsonParser.parseString(jsonObject.get("userAgent"));
		clientTag = GsonParser.parseString(jsonObject.get("clientTag"));
		description = GsonParser.parseString(jsonObject.get("description"));
		errorDescription = GsonParser.parseString(jsonObject.get("errorDescription"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAuditTrail");
		kparams.add("auditObjectType", this.auditObjectType);
		kparams.add("objectId", this.objectId);
		kparams.add("relatedObjectId", this.relatedObjectId);
		kparams.add("relatedObjectType", this.relatedObjectType);
		kparams.add("entryId", this.entryId);
		kparams.add("userId", this.userId);
		kparams.add("action", this.action);
		kparams.add("data", this.data);
		kparams.add("clientTag", this.clientTag);
		kparams.add("description", this.description);
		return kparams;
	}

}

