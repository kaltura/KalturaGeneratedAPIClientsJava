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
import com.kaltura.client.enums.CuePointStatus;
import com.kaltura.client.enums.CuePointType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CuePointBaseFilter.Tokenizer.class)
public abstract class CuePointBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String idEqual();
		String idIn();
		String cuePointTypeEqual();
		String cuePointTypeIn();
		String statusEqual();
		String statusIn();
		String entryIdEqual();
		String entryIdIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String triggeredAtGreaterThanOrEqual();
		String triggeredAtLessThanOrEqual();
		String tagsLike();
		String tagsMultiLikeOr();
		String tagsMultiLikeAnd();
		String startTimeGreaterThanOrEqual();
		String startTimeLessThanOrEqual();
		String userIdEqual();
		String userIdIn();
		String partnerSortValueEqual();
		String partnerSortValueIn();
		String partnerSortValueGreaterThanOrEqual();
		String partnerSortValueLessThanOrEqual();
		String forceStopEqual();
		String systemNameEqual();
		String systemNameIn();
	}

	private String idEqual;
	private String idIn;
	private CuePointType cuePointTypeEqual;
	private String cuePointTypeIn;
	private CuePointStatus statusEqual;
	private String statusIn;
	private String entryIdEqual;
	private String entryIdIn;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer updatedAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;
	private Integer triggeredAtGreaterThanOrEqual;
	private Integer triggeredAtLessThanOrEqual;
	private String tagsLike;
	private String tagsMultiLikeOr;
	private String tagsMultiLikeAnd;
	private Integer startTimeGreaterThanOrEqual;
	private Integer startTimeLessThanOrEqual;
	private String userIdEqual;
	private String userIdIn;
	private Integer partnerSortValueEqual;
	private String partnerSortValueIn;
	private Integer partnerSortValueGreaterThanOrEqual;
	private Integer partnerSortValueLessThanOrEqual;
	private Boolean forceStopEqual;
	private String systemNameEqual;
	private String systemNameIn;

	// idEqual:
	public String getIdEqual(){
		return this.idEqual;
	}
	public void setIdEqual(String idEqual){
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

	// cuePointTypeEqual:
	public CuePointType getCuePointTypeEqual(){
		return this.cuePointTypeEqual;
	}
	public void setCuePointTypeEqual(CuePointType cuePointTypeEqual){
		this.cuePointTypeEqual = cuePointTypeEqual;
	}

	public void cuePointTypeEqual(String multirequestToken){
		setToken("cuePointTypeEqual", multirequestToken);
	}

	// cuePointTypeIn:
	public String getCuePointTypeIn(){
		return this.cuePointTypeIn;
	}
	public void setCuePointTypeIn(String cuePointTypeIn){
		this.cuePointTypeIn = cuePointTypeIn;
	}

	public void cuePointTypeIn(String multirequestToken){
		setToken("cuePointTypeIn", multirequestToken);
	}

	// statusEqual:
	public CuePointStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(CuePointStatus statusEqual){
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

	// triggeredAtGreaterThanOrEqual:
	public Integer getTriggeredAtGreaterThanOrEqual(){
		return this.triggeredAtGreaterThanOrEqual;
	}
	public void setTriggeredAtGreaterThanOrEqual(Integer triggeredAtGreaterThanOrEqual){
		this.triggeredAtGreaterThanOrEqual = triggeredAtGreaterThanOrEqual;
	}

	public void triggeredAtGreaterThanOrEqual(String multirequestToken){
		setToken("triggeredAtGreaterThanOrEqual", multirequestToken);
	}

	// triggeredAtLessThanOrEqual:
	public Integer getTriggeredAtLessThanOrEqual(){
		return this.triggeredAtLessThanOrEqual;
	}
	public void setTriggeredAtLessThanOrEqual(Integer triggeredAtLessThanOrEqual){
		this.triggeredAtLessThanOrEqual = triggeredAtLessThanOrEqual;
	}

	public void triggeredAtLessThanOrEqual(String multirequestToken){
		setToken("triggeredAtLessThanOrEqual", multirequestToken);
	}

	// tagsLike:
	public String getTagsLike(){
		return this.tagsLike;
	}
	public void setTagsLike(String tagsLike){
		this.tagsLike = tagsLike;
	}

	public void tagsLike(String multirequestToken){
		setToken("tagsLike", multirequestToken);
	}

	// tagsMultiLikeOr:
	public String getTagsMultiLikeOr(){
		return this.tagsMultiLikeOr;
	}
	public void setTagsMultiLikeOr(String tagsMultiLikeOr){
		this.tagsMultiLikeOr = tagsMultiLikeOr;
	}

	public void tagsMultiLikeOr(String multirequestToken){
		setToken("tagsMultiLikeOr", multirequestToken);
	}

	// tagsMultiLikeAnd:
	public String getTagsMultiLikeAnd(){
		return this.tagsMultiLikeAnd;
	}
	public void setTagsMultiLikeAnd(String tagsMultiLikeAnd){
		this.tagsMultiLikeAnd = tagsMultiLikeAnd;
	}

	public void tagsMultiLikeAnd(String multirequestToken){
		setToken("tagsMultiLikeAnd", multirequestToken);
	}

	// startTimeGreaterThanOrEqual:
	public Integer getStartTimeGreaterThanOrEqual(){
		return this.startTimeGreaterThanOrEqual;
	}
	public void setStartTimeGreaterThanOrEqual(Integer startTimeGreaterThanOrEqual){
		this.startTimeGreaterThanOrEqual = startTimeGreaterThanOrEqual;
	}

	public void startTimeGreaterThanOrEqual(String multirequestToken){
		setToken("startTimeGreaterThanOrEqual", multirequestToken);
	}

	// startTimeLessThanOrEqual:
	public Integer getStartTimeLessThanOrEqual(){
		return this.startTimeLessThanOrEqual;
	}
	public void setStartTimeLessThanOrEqual(Integer startTimeLessThanOrEqual){
		this.startTimeLessThanOrEqual = startTimeLessThanOrEqual;
	}

	public void startTimeLessThanOrEqual(String multirequestToken){
		setToken("startTimeLessThanOrEqual", multirequestToken);
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

	// partnerSortValueEqual:
	public Integer getPartnerSortValueEqual(){
		return this.partnerSortValueEqual;
	}
	public void setPartnerSortValueEqual(Integer partnerSortValueEqual){
		this.partnerSortValueEqual = partnerSortValueEqual;
	}

	public void partnerSortValueEqual(String multirequestToken){
		setToken("partnerSortValueEqual", multirequestToken);
	}

	// partnerSortValueIn:
	public String getPartnerSortValueIn(){
		return this.partnerSortValueIn;
	}
	public void setPartnerSortValueIn(String partnerSortValueIn){
		this.partnerSortValueIn = partnerSortValueIn;
	}

	public void partnerSortValueIn(String multirequestToken){
		setToken("partnerSortValueIn", multirequestToken);
	}

	// partnerSortValueGreaterThanOrEqual:
	public Integer getPartnerSortValueGreaterThanOrEqual(){
		return this.partnerSortValueGreaterThanOrEqual;
	}
	public void setPartnerSortValueGreaterThanOrEqual(Integer partnerSortValueGreaterThanOrEqual){
		this.partnerSortValueGreaterThanOrEqual = partnerSortValueGreaterThanOrEqual;
	}

	public void partnerSortValueGreaterThanOrEqual(String multirequestToken){
		setToken("partnerSortValueGreaterThanOrEqual", multirequestToken);
	}

	// partnerSortValueLessThanOrEqual:
	public Integer getPartnerSortValueLessThanOrEqual(){
		return this.partnerSortValueLessThanOrEqual;
	}
	public void setPartnerSortValueLessThanOrEqual(Integer partnerSortValueLessThanOrEqual){
		this.partnerSortValueLessThanOrEqual = partnerSortValueLessThanOrEqual;
	}

	public void partnerSortValueLessThanOrEqual(String multirequestToken){
		setToken("partnerSortValueLessThanOrEqual", multirequestToken);
	}

	// forceStopEqual:
	public Boolean getForceStopEqual(){
		return this.forceStopEqual;
	}
	public void setForceStopEqual(Boolean forceStopEqual){
		this.forceStopEqual = forceStopEqual;
	}

	public void forceStopEqual(String multirequestToken){
		setToken("forceStopEqual", multirequestToken);
	}

	// systemNameEqual:
	public String getSystemNameEqual(){
		return this.systemNameEqual;
	}
	public void setSystemNameEqual(String systemNameEqual){
		this.systemNameEqual = systemNameEqual;
	}

	public void systemNameEqual(String multirequestToken){
		setToken("systemNameEqual", multirequestToken);
	}

	// systemNameIn:
	public String getSystemNameIn(){
		return this.systemNameIn;
	}
	public void setSystemNameIn(String systemNameIn){
		this.systemNameIn = systemNameIn;
	}

	public void systemNameIn(String multirequestToken){
		setToken("systemNameIn", multirequestToken);
	}


	public CuePointBaseFilter() {
		super();
	}

	public CuePointBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseString(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		cuePointTypeEqual = CuePointType.get(GsonParser.parseString(jsonObject.get("cuePointTypeEqual")));
		cuePointTypeIn = GsonParser.parseString(jsonObject.get("cuePointTypeIn"));
		statusEqual = CuePointStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		entryIdEqual = GsonParser.parseString(jsonObject.get("entryIdEqual"));
		entryIdIn = GsonParser.parseString(jsonObject.get("entryIdIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
		triggeredAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("triggeredAtGreaterThanOrEqual"));
		triggeredAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("triggeredAtLessThanOrEqual"));
		tagsLike = GsonParser.parseString(jsonObject.get("tagsLike"));
		tagsMultiLikeOr = GsonParser.parseString(jsonObject.get("tagsMultiLikeOr"));
		tagsMultiLikeAnd = GsonParser.parseString(jsonObject.get("tagsMultiLikeAnd"));
		startTimeGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("startTimeGreaterThanOrEqual"));
		startTimeLessThanOrEqual = GsonParser.parseInt(jsonObject.get("startTimeLessThanOrEqual"));
		userIdEqual = GsonParser.parseString(jsonObject.get("userIdEqual"));
		userIdIn = GsonParser.parseString(jsonObject.get("userIdIn"));
		partnerSortValueEqual = GsonParser.parseInt(jsonObject.get("partnerSortValueEqual"));
		partnerSortValueIn = GsonParser.parseString(jsonObject.get("partnerSortValueIn"));
		partnerSortValueGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("partnerSortValueGreaterThanOrEqual"));
		partnerSortValueLessThanOrEqual = GsonParser.parseInt(jsonObject.get("partnerSortValueLessThanOrEqual"));
		forceStopEqual = GsonParser.parseBoolean(jsonObject.get("forceStopEqual"));
		systemNameEqual = GsonParser.parseString(jsonObject.get("systemNameEqual"));
		systemNameIn = GsonParser.parseString(jsonObject.get("systemNameIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCuePointBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("cuePointTypeEqual", this.cuePointTypeEqual);
		kparams.add("cuePointTypeIn", this.cuePointTypeIn);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("entryIdEqual", this.entryIdEqual);
		kparams.add("entryIdIn", this.entryIdIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("triggeredAtGreaterThanOrEqual", this.triggeredAtGreaterThanOrEqual);
		kparams.add("triggeredAtLessThanOrEqual", this.triggeredAtLessThanOrEqual);
		kparams.add("tagsLike", this.tagsLike);
		kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
		kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
		kparams.add("startTimeGreaterThanOrEqual", this.startTimeGreaterThanOrEqual);
		kparams.add("startTimeLessThanOrEqual", this.startTimeLessThanOrEqual);
		kparams.add("userIdEqual", this.userIdEqual);
		kparams.add("userIdIn", this.userIdIn);
		kparams.add("partnerSortValueEqual", this.partnerSortValueEqual);
		kparams.add("partnerSortValueIn", this.partnerSortValueIn);
		kparams.add("partnerSortValueGreaterThanOrEqual", this.partnerSortValueGreaterThanOrEqual);
		kparams.add("partnerSortValueLessThanOrEqual", this.partnerSortValueLessThanOrEqual);
		kparams.add("forceStopEqual", this.forceStopEqual);
		kparams.add("systemNameEqual", this.systemNameEqual);
		kparams.add("systemNameIn", this.systemNameIn);
		return kparams;
	}

}

