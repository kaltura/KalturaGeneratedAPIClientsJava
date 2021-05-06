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
import com.kaltura.client.enums.EntryDistributionFlag;
import com.kaltura.client.enums.EntryDistributionStatus;
import com.kaltura.client.enums.EntryDistributionSunStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ContentDistributionSearchItem.Tokenizer.class)
public class ContentDistributionSearchItem extends SearchItem {
	
	public interface Tokenizer extends SearchItem.Tokenizer {
		String noDistributionProfiles();
		String distributionProfileId();
		String distributionSunStatus();
		String entryDistributionFlag();
		String entryDistributionStatus();
		String hasEntryDistributionValidationErrors();
		String entryDistributionValidationErrors();
	}

	private Boolean noDistributionProfiles;
	private Integer distributionProfileId;
	private EntryDistributionSunStatus distributionSunStatus;
	private EntryDistributionFlag entryDistributionFlag;
	private EntryDistributionStatus entryDistributionStatus;
	private Boolean hasEntryDistributionValidationErrors;
	/**
	 * Comma seperated validation error types
	 */
	private String entryDistributionValidationErrors;

	// noDistributionProfiles:
	public Boolean getNoDistributionProfiles(){
		return this.noDistributionProfiles;
	}
	public void setNoDistributionProfiles(Boolean noDistributionProfiles){
		this.noDistributionProfiles = noDistributionProfiles;
	}

	public void noDistributionProfiles(String multirequestToken){
		setToken("noDistributionProfiles", multirequestToken);
	}

	// distributionProfileId:
	public Integer getDistributionProfileId(){
		return this.distributionProfileId;
	}
	public void setDistributionProfileId(Integer distributionProfileId){
		this.distributionProfileId = distributionProfileId;
	}

	public void distributionProfileId(String multirequestToken){
		setToken("distributionProfileId", multirequestToken);
	}

	// distributionSunStatus:
	public EntryDistributionSunStatus getDistributionSunStatus(){
		return this.distributionSunStatus;
	}
	public void setDistributionSunStatus(EntryDistributionSunStatus distributionSunStatus){
		this.distributionSunStatus = distributionSunStatus;
	}

	public void distributionSunStatus(String multirequestToken){
		setToken("distributionSunStatus", multirequestToken);
	}

	// entryDistributionFlag:
	public EntryDistributionFlag getEntryDistributionFlag(){
		return this.entryDistributionFlag;
	}
	public void setEntryDistributionFlag(EntryDistributionFlag entryDistributionFlag){
		this.entryDistributionFlag = entryDistributionFlag;
	}

	public void entryDistributionFlag(String multirequestToken){
		setToken("entryDistributionFlag", multirequestToken);
	}

	// entryDistributionStatus:
	public EntryDistributionStatus getEntryDistributionStatus(){
		return this.entryDistributionStatus;
	}
	public void setEntryDistributionStatus(EntryDistributionStatus entryDistributionStatus){
		this.entryDistributionStatus = entryDistributionStatus;
	}

	public void entryDistributionStatus(String multirequestToken){
		setToken("entryDistributionStatus", multirequestToken);
	}

	// hasEntryDistributionValidationErrors:
	public Boolean getHasEntryDistributionValidationErrors(){
		return this.hasEntryDistributionValidationErrors;
	}
	public void setHasEntryDistributionValidationErrors(Boolean hasEntryDistributionValidationErrors){
		this.hasEntryDistributionValidationErrors = hasEntryDistributionValidationErrors;
	}

	public void hasEntryDistributionValidationErrors(String multirequestToken){
		setToken("hasEntryDistributionValidationErrors", multirequestToken);
	}

	// entryDistributionValidationErrors:
	public String getEntryDistributionValidationErrors(){
		return this.entryDistributionValidationErrors;
	}
	public void setEntryDistributionValidationErrors(String entryDistributionValidationErrors){
		this.entryDistributionValidationErrors = entryDistributionValidationErrors;
	}

	public void entryDistributionValidationErrors(String multirequestToken){
		setToken("entryDistributionValidationErrors", multirequestToken);
	}


	public ContentDistributionSearchItem() {
		super();
	}

	public ContentDistributionSearchItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		noDistributionProfiles = GsonParser.parseBoolean(jsonObject.get("noDistributionProfiles"));
		distributionProfileId = GsonParser.parseInt(jsonObject.get("distributionProfileId"));
		distributionSunStatus = EntryDistributionSunStatus.get(GsonParser.parseInt(jsonObject.get("distributionSunStatus")));
		entryDistributionFlag = EntryDistributionFlag.get(GsonParser.parseInt(jsonObject.get("entryDistributionFlag")));
		entryDistributionStatus = EntryDistributionStatus.get(GsonParser.parseInt(jsonObject.get("entryDistributionStatus")));
		hasEntryDistributionValidationErrors = GsonParser.parseBoolean(jsonObject.get("hasEntryDistributionValidationErrors"));
		entryDistributionValidationErrors = GsonParser.parseString(jsonObject.get("entryDistributionValidationErrors"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaContentDistributionSearchItem");
		kparams.add("noDistributionProfiles", this.noDistributionProfiles);
		kparams.add("distributionProfileId", this.distributionProfileId);
		kparams.add("distributionSunStatus", this.distributionSunStatus);
		kparams.add("entryDistributionFlag", this.entryDistributionFlag);
		kparams.add("entryDistributionStatus", this.entryDistributionStatus);
		kparams.add("hasEntryDistributionValidationErrors", this.hasEntryDistributionValidationErrors);
		kparams.add("entryDistributionValidationErrors", this.entryDistributionValidationErrors);
		return kparams;
	}

}

