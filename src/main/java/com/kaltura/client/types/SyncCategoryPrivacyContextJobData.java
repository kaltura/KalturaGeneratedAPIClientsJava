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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SyncCategoryPrivacyContextJobData.Tokenizer.class)
public class SyncCategoryPrivacyContextJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String categoryId();
		String lastUpdatedCategoryEntryCreatedAt();
		String lastUpdatedCategoryCreatedAt();
	}

	/**
	 * category id
	 */
	private Integer categoryId;
	/**
	 * Saves the last category entry creation date that was updated      In case of
	  crash the batch will restart from that point
	 */
	private Integer lastUpdatedCategoryEntryCreatedAt;
	/**
	 * Saves the last sub category creation date that was updated      In case of crash
	  the batch will restart from that point
	 */
	private Integer lastUpdatedCategoryCreatedAt;

	// categoryId:
	public Integer getCategoryId(){
		return this.categoryId;
	}
	public void setCategoryId(Integer categoryId){
		this.categoryId = categoryId;
	}

	public void categoryId(String multirequestToken){
		setToken("categoryId", multirequestToken);
	}

	// lastUpdatedCategoryEntryCreatedAt:
	public Integer getLastUpdatedCategoryEntryCreatedAt(){
		return this.lastUpdatedCategoryEntryCreatedAt;
	}
	public void setLastUpdatedCategoryEntryCreatedAt(Integer lastUpdatedCategoryEntryCreatedAt){
		this.lastUpdatedCategoryEntryCreatedAt = lastUpdatedCategoryEntryCreatedAt;
	}

	public void lastUpdatedCategoryEntryCreatedAt(String multirequestToken){
		setToken("lastUpdatedCategoryEntryCreatedAt", multirequestToken);
	}

	// lastUpdatedCategoryCreatedAt:
	public Integer getLastUpdatedCategoryCreatedAt(){
		return this.lastUpdatedCategoryCreatedAt;
	}
	public void setLastUpdatedCategoryCreatedAt(Integer lastUpdatedCategoryCreatedAt){
		this.lastUpdatedCategoryCreatedAt = lastUpdatedCategoryCreatedAt;
	}

	public void lastUpdatedCategoryCreatedAt(String multirequestToken){
		setToken("lastUpdatedCategoryCreatedAt", multirequestToken);
	}


	public SyncCategoryPrivacyContextJobData() {
		super();
	}

	public SyncCategoryPrivacyContextJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		categoryId = GsonParser.parseInt(jsonObject.get("categoryId"));
		lastUpdatedCategoryEntryCreatedAt = GsonParser.parseInt(jsonObject.get("lastUpdatedCategoryEntryCreatedAt"));
		lastUpdatedCategoryCreatedAt = GsonParser.parseInt(jsonObject.get("lastUpdatedCategoryCreatedAt"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSyncCategoryPrivacyContextJobData");
		kparams.add("categoryId", this.categoryId);
		kparams.add("lastUpdatedCategoryEntryCreatedAt", this.lastUpdatedCategoryEntryCreatedAt);
		kparams.add("lastUpdatedCategoryCreatedAt", this.lastUpdatedCategoryCreatedAt);
		return kparams;
	}

}

