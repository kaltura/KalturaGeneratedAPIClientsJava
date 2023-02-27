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
import com.kaltura.client.enums.CategoryEntryStatus;
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
@MultiRequestBuilder.Tokenizer(CategoryEntry.Tokenizer.class)
public class CategoryEntry extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String categoryId();
		String entryId();
		String createdAt();
		String categoryFullIds();
		String status();
		String creatorUserId();
	}

	private Integer categoryId;
	/**
	 * entry id
	 */
	private String entryId;
	/**
	 * Creation date as Unix timestamp (In seconds)
	 */
	private Long createdAt;
	/**
	 * The full ids of the Category
	 */
	private String categoryFullIds;
	/**
	 * CategroyEntry status
	 */
	private CategoryEntryStatus status;
	/**
	 * CategroyEntry creator puser ID
	 */
	private String creatorUserId;

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

	// createdAt:
	public Long getCreatedAt(){
		return this.createdAt;
	}
	// categoryFullIds:
	public String getCategoryFullIds(){
		return this.categoryFullIds;
	}
	// status:
	public CategoryEntryStatus getStatus(){
		return this.status;
	}
	// creatorUserId:
	public String getCreatorUserId(){
		return this.creatorUserId;
	}

	public CategoryEntry() {
		super();
	}

	public CategoryEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		categoryId = GsonParser.parseInt(jsonObject.get("categoryId"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		createdAt = GsonParser.parseLong(jsonObject.get("createdAt"));
		categoryFullIds = GsonParser.parseString(jsonObject.get("categoryFullIds"));
		status = CategoryEntryStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		creatorUserId = GsonParser.parseString(jsonObject.get("creatorUserId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCategoryEntry");
		kparams.add("categoryId", this.categoryId);
		kparams.add("entryId", this.entryId);
		return kparams;
	}

}

