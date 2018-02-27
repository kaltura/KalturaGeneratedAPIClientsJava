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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.ESearchCategoryEntryFieldName;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchCategoryEntryItem.Tokenizer.class)
public class ESearchCategoryEntryItem extends ESearchAbstractEntryItem {
	
	public interface Tokenizer extends ESearchAbstractEntryItem.Tokenizer {
		String fieldName();
		String categoryEntryStatus();
	}

	private ESearchCategoryEntryFieldName fieldName;
	private CategoryEntryStatus categoryEntryStatus;

	// fieldName:
	public ESearchCategoryEntryFieldName getFieldName(){
		return this.fieldName;
	}
	public void setFieldName(ESearchCategoryEntryFieldName fieldName){
		this.fieldName = fieldName;
	}

	public void fieldName(String multirequestToken){
		setToken("fieldName", multirequestToken);
	}

	// categoryEntryStatus:
	public CategoryEntryStatus getCategoryEntryStatus(){
		return this.categoryEntryStatus;
	}
	public void setCategoryEntryStatus(CategoryEntryStatus categoryEntryStatus){
		this.categoryEntryStatus = categoryEntryStatus;
	}

	public void categoryEntryStatus(String multirequestToken){
		setToken("categoryEntryStatus", multirequestToken);
	}


	public ESearchCategoryEntryItem() {
		super();
	}

	public ESearchCategoryEntryItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fieldName = ESearchCategoryEntryFieldName.get(GsonParser.parseString(jsonObject.get("fieldName")));
		categoryEntryStatus = CategoryEntryStatus.get(GsonParser.parseInt(jsonObject.get("categoryEntryStatus")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchCategoryEntryItem");
		kparams.add("fieldName", this.fieldName);
		kparams.add("categoryEntryStatus", this.categoryEntryStatus);
		return kparams;
	}

}

