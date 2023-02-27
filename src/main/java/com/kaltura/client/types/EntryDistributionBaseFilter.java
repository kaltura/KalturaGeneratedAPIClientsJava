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
import com.kaltura.client.enums.EntryDistributionFlag;
import com.kaltura.client.enums.EntryDistributionStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EntryDistributionBaseFilter.Tokenizer.class)
public abstract class EntryDistributionBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String idEqual();
		String idIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String submittedAtGreaterThanOrEqual();
		String submittedAtLessThanOrEqual();
		String entryIdEqual();
		String entryIdIn();
		String distributionProfileIdEqual();
		String distributionProfileIdIn();
		String statusEqual();
		String statusIn();
		String dirtyStatusEqual();
		String dirtyStatusIn();
		String sunriseGreaterThanOrEqual();
		String sunriseLessThanOrEqual();
		String sunsetGreaterThanOrEqual();
		String sunsetLessThanOrEqual();
	}

	private Integer idEqual;
	private String idIn;
	private Long createdAtGreaterThanOrEqual;
	private Long createdAtLessThanOrEqual;
	private Long updatedAtGreaterThanOrEqual;
	private Long updatedAtLessThanOrEqual;
	private Long submittedAtGreaterThanOrEqual;
	private Long submittedAtLessThanOrEqual;
	private String entryIdEqual;
	private String entryIdIn;
	private Integer distributionProfileIdEqual;
	private String distributionProfileIdIn;
	private EntryDistributionStatus statusEqual;
	private String statusIn;
	private EntryDistributionFlag dirtyStatusEqual;
	private String dirtyStatusIn;
	private Long sunriseGreaterThanOrEqual;
	private Long sunriseLessThanOrEqual;
	private Long sunsetGreaterThanOrEqual;
	private Long sunsetLessThanOrEqual;

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

	// createdAtGreaterThanOrEqual:
	public Long getCreatedAtGreaterThanOrEqual(){
		return this.createdAtGreaterThanOrEqual;
	}
	public void setCreatedAtGreaterThanOrEqual(Long createdAtGreaterThanOrEqual){
		this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
	}

	public void createdAtGreaterThanOrEqual(String multirequestToken){
		setToken("createdAtGreaterThanOrEqual", multirequestToken);
	}

	// createdAtLessThanOrEqual:
	public Long getCreatedAtLessThanOrEqual(){
		return this.createdAtLessThanOrEqual;
	}
	public void setCreatedAtLessThanOrEqual(Long createdAtLessThanOrEqual){
		this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
	}

	public void createdAtLessThanOrEqual(String multirequestToken){
		setToken("createdAtLessThanOrEqual", multirequestToken);
	}

	// updatedAtGreaterThanOrEqual:
	public Long getUpdatedAtGreaterThanOrEqual(){
		return this.updatedAtGreaterThanOrEqual;
	}
	public void setUpdatedAtGreaterThanOrEqual(Long updatedAtGreaterThanOrEqual){
		this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
	}

	public void updatedAtGreaterThanOrEqual(String multirequestToken){
		setToken("updatedAtGreaterThanOrEqual", multirequestToken);
	}

	// updatedAtLessThanOrEqual:
	public Long getUpdatedAtLessThanOrEqual(){
		return this.updatedAtLessThanOrEqual;
	}
	public void setUpdatedAtLessThanOrEqual(Long updatedAtLessThanOrEqual){
		this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
	}

	public void updatedAtLessThanOrEqual(String multirequestToken){
		setToken("updatedAtLessThanOrEqual", multirequestToken);
	}

	// submittedAtGreaterThanOrEqual:
	public Long getSubmittedAtGreaterThanOrEqual(){
		return this.submittedAtGreaterThanOrEqual;
	}
	public void setSubmittedAtGreaterThanOrEqual(Long submittedAtGreaterThanOrEqual){
		this.submittedAtGreaterThanOrEqual = submittedAtGreaterThanOrEqual;
	}

	public void submittedAtGreaterThanOrEqual(String multirequestToken){
		setToken("submittedAtGreaterThanOrEqual", multirequestToken);
	}

	// submittedAtLessThanOrEqual:
	public Long getSubmittedAtLessThanOrEqual(){
		return this.submittedAtLessThanOrEqual;
	}
	public void setSubmittedAtLessThanOrEqual(Long submittedAtLessThanOrEqual){
		this.submittedAtLessThanOrEqual = submittedAtLessThanOrEqual;
	}

	public void submittedAtLessThanOrEqual(String multirequestToken){
		setToken("submittedAtLessThanOrEqual", multirequestToken);
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

	// distributionProfileIdEqual:
	public Integer getDistributionProfileIdEqual(){
		return this.distributionProfileIdEqual;
	}
	public void setDistributionProfileIdEqual(Integer distributionProfileIdEqual){
		this.distributionProfileIdEqual = distributionProfileIdEqual;
	}

	public void distributionProfileIdEqual(String multirequestToken){
		setToken("distributionProfileIdEqual", multirequestToken);
	}

	// distributionProfileIdIn:
	public String getDistributionProfileIdIn(){
		return this.distributionProfileIdIn;
	}
	public void setDistributionProfileIdIn(String distributionProfileIdIn){
		this.distributionProfileIdIn = distributionProfileIdIn;
	}

	public void distributionProfileIdIn(String multirequestToken){
		setToken("distributionProfileIdIn", multirequestToken);
	}

	// statusEqual:
	public EntryDistributionStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(EntryDistributionStatus statusEqual){
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

	// dirtyStatusEqual:
	public EntryDistributionFlag getDirtyStatusEqual(){
		return this.dirtyStatusEqual;
	}
	public void setDirtyStatusEqual(EntryDistributionFlag dirtyStatusEqual){
		this.dirtyStatusEqual = dirtyStatusEqual;
	}

	public void dirtyStatusEqual(String multirequestToken){
		setToken("dirtyStatusEqual", multirequestToken);
	}

	// dirtyStatusIn:
	public String getDirtyStatusIn(){
		return this.dirtyStatusIn;
	}
	public void setDirtyStatusIn(String dirtyStatusIn){
		this.dirtyStatusIn = dirtyStatusIn;
	}

	public void dirtyStatusIn(String multirequestToken){
		setToken("dirtyStatusIn", multirequestToken);
	}

	// sunriseGreaterThanOrEqual:
	public Long getSunriseGreaterThanOrEqual(){
		return this.sunriseGreaterThanOrEqual;
	}
	public void setSunriseGreaterThanOrEqual(Long sunriseGreaterThanOrEqual){
		this.sunriseGreaterThanOrEqual = sunriseGreaterThanOrEqual;
	}

	public void sunriseGreaterThanOrEqual(String multirequestToken){
		setToken("sunriseGreaterThanOrEqual", multirequestToken);
	}

	// sunriseLessThanOrEqual:
	public Long getSunriseLessThanOrEqual(){
		return this.sunriseLessThanOrEqual;
	}
	public void setSunriseLessThanOrEqual(Long sunriseLessThanOrEqual){
		this.sunriseLessThanOrEqual = sunriseLessThanOrEqual;
	}

	public void sunriseLessThanOrEqual(String multirequestToken){
		setToken("sunriseLessThanOrEqual", multirequestToken);
	}

	// sunsetGreaterThanOrEqual:
	public Long getSunsetGreaterThanOrEqual(){
		return this.sunsetGreaterThanOrEqual;
	}
	public void setSunsetGreaterThanOrEqual(Long sunsetGreaterThanOrEqual){
		this.sunsetGreaterThanOrEqual = sunsetGreaterThanOrEqual;
	}

	public void sunsetGreaterThanOrEqual(String multirequestToken){
		setToken("sunsetGreaterThanOrEqual", multirequestToken);
	}

	// sunsetLessThanOrEqual:
	public Long getSunsetLessThanOrEqual(){
		return this.sunsetLessThanOrEqual;
	}
	public void setSunsetLessThanOrEqual(Long sunsetLessThanOrEqual){
		this.sunsetLessThanOrEqual = sunsetLessThanOrEqual;
	}

	public void sunsetLessThanOrEqual(String multirequestToken){
		setToken("sunsetLessThanOrEqual", multirequestToken);
	}


	public EntryDistributionBaseFilter() {
		super();
	}

	public EntryDistributionBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtLessThanOrEqual"));
		submittedAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("submittedAtGreaterThanOrEqual"));
		submittedAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("submittedAtLessThanOrEqual"));
		entryIdEqual = GsonParser.parseString(jsonObject.get("entryIdEqual"));
		entryIdIn = GsonParser.parseString(jsonObject.get("entryIdIn"));
		distributionProfileIdEqual = GsonParser.parseInt(jsonObject.get("distributionProfileIdEqual"));
		distributionProfileIdIn = GsonParser.parseString(jsonObject.get("distributionProfileIdIn"));
		statusEqual = EntryDistributionStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		dirtyStatusEqual = EntryDistributionFlag.get(GsonParser.parseInt(jsonObject.get("dirtyStatusEqual")));
		dirtyStatusIn = GsonParser.parseString(jsonObject.get("dirtyStatusIn"));
		sunriseGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("sunriseGreaterThanOrEqual"));
		sunriseLessThanOrEqual = GsonParser.parseLong(jsonObject.get("sunriseLessThanOrEqual"));
		sunsetGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("sunsetGreaterThanOrEqual"));
		sunsetLessThanOrEqual = GsonParser.parseLong(jsonObject.get("sunsetLessThanOrEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryDistributionBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("submittedAtGreaterThanOrEqual", this.submittedAtGreaterThanOrEqual);
		kparams.add("submittedAtLessThanOrEqual", this.submittedAtLessThanOrEqual);
		kparams.add("entryIdEqual", this.entryIdEqual);
		kparams.add("entryIdIn", this.entryIdIn);
		kparams.add("distributionProfileIdEqual", this.distributionProfileIdEqual);
		kparams.add("distributionProfileIdIn", this.distributionProfileIdIn);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("dirtyStatusEqual", this.dirtyStatusEqual);
		kparams.add("dirtyStatusIn", this.dirtyStatusIn);
		kparams.add("sunriseGreaterThanOrEqual", this.sunriseGreaterThanOrEqual);
		kparams.add("sunriseLessThanOrEqual", this.sunriseLessThanOrEqual);
		kparams.add("sunsetGreaterThanOrEqual", this.sunsetGreaterThanOrEqual);
		kparams.add("sunsetLessThanOrEqual", this.sunsetLessThanOrEqual);
		return kparams;
	}

}

