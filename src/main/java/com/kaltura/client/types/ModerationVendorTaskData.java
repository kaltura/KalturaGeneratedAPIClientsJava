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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ModerationVendorTaskData.Tokenizer.class)
public class ModerationVendorTaskData extends VendorTaskData {
	
	public interface Tokenizer extends VendorTaskData.Tokenizer {
		String ruleIds();
		String policyIds();
		String categoryIds();
		String moderationOutputJson();
	}

	/**
	 * A comma seperated string of rule IDs.
	 */
	private String ruleIds;
	/**
	 * A comma seperated string of policy IDs.
	 */
	private String policyIds;
	/**
	 * A comma seperated string of category IDs.
	 */
	private String categoryIds;
	/**
	 * JSON string containing the moderation output.
	 */
	private String moderationOutputJson;

	// ruleIds:
	public String getRuleIds(){
		return this.ruleIds;
	}
	public void setRuleIds(String ruleIds){
		this.ruleIds = ruleIds;
	}

	public void ruleIds(String multirequestToken){
		setToken("ruleIds", multirequestToken);
	}

	// policyIds:
	public String getPolicyIds(){
		return this.policyIds;
	}
	public void setPolicyIds(String policyIds){
		this.policyIds = policyIds;
	}

	public void policyIds(String multirequestToken){
		setToken("policyIds", multirequestToken);
	}

	// categoryIds:
	public String getCategoryIds(){
		return this.categoryIds;
	}
	public void setCategoryIds(String categoryIds){
		this.categoryIds = categoryIds;
	}

	public void categoryIds(String multirequestToken){
		setToken("categoryIds", multirequestToken);
	}

	// moderationOutputJson:
	public String getModerationOutputJson(){
		return this.moderationOutputJson;
	}
	public void setModerationOutputJson(String moderationOutputJson){
		this.moderationOutputJson = moderationOutputJson;
	}

	public void moderationOutputJson(String multirequestToken){
		setToken("moderationOutputJson", multirequestToken);
	}


	public ModerationVendorTaskData() {
		super();
	}

	public ModerationVendorTaskData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		ruleIds = GsonParser.parseString(jsonObject.get("ruleIds"));
		policyIds = GsonParser.parseString(jsonObject.get("policyIds"));
		categoryIds = GsonParser.parseString(jsonObject.get("categoryIds"));
		moderationOutputJson = GsonParser.parseString(jsonObject.get("moderationOutputJson"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaModerationVendorTaskData");
		kparams.add("ruleIds", this.ruleIds);
		kparams.add("policyIds", this.policyIds);
		kparams.add("categoryIds", this.categoryIds);
		kparams.add("moderationOutputJson", this.moderationOutputJson);
		return kparams;
	}

}

