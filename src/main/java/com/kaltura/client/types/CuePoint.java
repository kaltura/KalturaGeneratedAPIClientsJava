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
import com.kaltura.client.enums.CuePointStatus;
import com.kaltura.client.enums.CuePointType;
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
@MultiRequestBuilder.Tokenizer(CuePoint.Tokenizer.class)
public abstract class CuePoint extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String intId();
		String cuePointType();
		String status();
		String entryId();
		String partnerId();
		String createdAt();
		String updatedAt();
		String triggeredAt();
		String tags();
		String startTime();
		String userId();
		String partnerData();
		String partnerSortValue();
		String forceStop();
		String thumbOffset();
		String systemName();
		String isMomentary();
		String copiedFrom();
	}

	private String id;
	private Integer intId;
	private CuePointType cuePointType;
	private CuePointStatus status;
	private String entryId;
	private Integer partnerId;
	private Integer createdAt;
	private Integer updatedAt;
	private Integer triggeredAt;
	private String tags;
	/**
	 * Start time in milliseconds
	 */
	private Integer startTime;
	private String userId;
	private String partnerData;
	private Integer partnerSortValue;
	private Boolean forceStop;
	private Integer thumbOffset;
	private String systemName;
	private Boolean isMomentary;
	private String copiedFrom;

	// id:
	public String getId(){
		return this.id;
	}
	// intId:
	public Integer getIntId(){
		return this.intId;
	}
	// cuePointType:
	public CuePointType getCuePointType(){
		return this.cuePointType;
	}
	// status:
	public CuePointStatus getStatus(){
		return this.status;
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

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// triggeredAt:
	public Integer getTriggeredAt(){
		return this.triggeredAt;
	}
	public void setTriggeredAt(Integer triggeredAt){
		this.triggeredAt = triggeredAt;
	}

	public void triggeredAt(String multirequestToken){
		setToken("triggeredAt", multirequestToken);
	}

	// tags:
	public String getTags(){
		return this.tags;
	}
	public void setTags(String tags){
		this.tags = tags;
	}

	public void tags(String multirequestToken){
		setToken("tags", multirequestToken);
	}

	// startTime:
	public Integer getStartTime(){
		return this.startTime;
	}
	public void setStartTime(Integer startTime){
		this.startTime = startTime;
	}

	public void startTime(String multirequestToken){
		setToken("startTime", multirequestToken);
	}

	// userId:
	public String getUserId(){
		return this.userId;
	}
	// partnerData:
	public String getPartnerData(){
		return this.partnerData;
	}
	public void setPartnerData(String partnerData){
		this.partnerData = partnerData;
	}

	public void partnerData(String multirequestToken){
		setToken("partnerData", multirequestToken);
	}

	// partnerSortValue:
	public Integer getPartnerSortValue(){
		return this.partnerSortValue;
	}
	public void setPartnerSortValue(Integer partnerSortValue){
		this.partnerSortValue = partnerSortValue;
	}

	public void partnerSortValue(String multirequestToken){
		setToken("partnerSortValue", multirequestToken);
	}

	// forceStop:
	public Boolean getForceStop(){
		return this.forceStop;
	}
	public void setForceStop(Boolean forceStop){
		this.forceStop = forceStop;
	}

	public void forceStop(String multirequestToken){
		setToken("forceStop", multirequestToken);
	}

	// thumbOffset:
	public Integer getThumbOffset(){
		return this.thumbOffset;
	}
	public void setThumbOffset(Integer thumbOffset){
		this.thumbOffset = thumbOffset;
	}

	public void thumbOffset(String multirequestToken){
		setToken("thumbOffset", multirequestToken);
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

	// isMomentary:
	public Boolean getIsMomentary(){
		return this.isMomentary;
	}
	// copiedFrom:
	public String getCopiedFrom(){
		return this.copiedFrom;
	}

	public CuePoint() {
		super();
	}

	public CuePoint(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		intId = GsonParser.parseInt(jsonObject.get("intId"));
		cuePointType = CuePointType.get(GsonParser.parseString(jsonObject.get("cuePointType")));
		status = CuePointStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		triggeredAt = GsonParser.parseInt(jsonObject.get("triggeredAt"));
		tags = GsonParser.parseString(jsonObject.get("tags"));
		startTime = GsonParser.parseInt(jsonObject.get("startTime"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		partnerData = GsonParser.parseString(jsonObject.get("partnerData"));
		partnerSortValue = GsonParser.parseInt(jsonObject.get("partnerSortValue"));
		forceStop = GsonParser.parseBoolean(jsonObject.get("forceStop"));
		thumbOffset = GsonParser.parseInt(jsonObject.get("thumbOffset"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		isMomentary = GsonParser.parseBoolean(jsonObject.get("isMomentary"));
		copiedFrom = GsonParser.parseString(jsonObject.get("copiedFrom"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCuePoint");
		kparams.add("entryId", this.entryId);
		kparams.add("triggeredAt", this.triggeredAt);
		kparams.add("tags", this.tags);
		kparams.add("startTime", this.startTime);
		kparams.add("partnerData", this.partnerData);
		kparams.add("partnerSortValue", this.partnerSortValue);
		kparams.add("forceStop", this.forceStop);
		kparams.add("thumbOffset", this.thumbOffset);
		kparams.add("systemName", this.systemName);
		return kparams;
	}

}

