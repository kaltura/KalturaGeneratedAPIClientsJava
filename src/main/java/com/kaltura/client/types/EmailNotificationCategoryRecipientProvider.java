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
import com.kaltura.client.types.CategoryUserProviderFilter;
import com.kaltura.client.types.StringValue;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  API object which provides the recipients of category related notifications.  */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EmailNotificationCategoryRecipientProvider.Tokenizer.class)
public class EmailNotificationCategoryRecipientProvider extends EmailNotificationRecipientProvider {
	
	public interface Tokenizer extends EmailNotificationRecipientProvider.Tokenizer {
		StringValue.Tokenizer categoryId();
		StringValue.Tokenizer categoryIds();
		CategoryUserProviderFilter.Tokenizer categoryUserFilter();
	}

	/**  The ID of the category whose subscribers should receive the email notification.  */
	private StringValue categoryId;
	/**  The IDs of the categories whose subscribers should receive the email
	  notification.  */
	private StringValue categoryIds;
	private CategoryUserProviderFilter categoryUserFilter;

	// categoryId:
	public StringValue getCategoryId(){
		return this.categoryId;
	}
	public void setCategoryId(StringValue categoryId){
		this.categoryId = categoryId;
	}

	// categoryIds:
	public StringValue getCategoryIds(){
		return this.categoryIds;
	}
	public void setCategoryIds(StringValue categoryIds){
		this.categoryIds = categoryIds;
	}

	// categoryUserFilter:
	public CategoryUserProviderFilter getCategoryUserFilter(){
		return this.categoryUserFilter;
	}
	public void setCategoryUserFilter(CategoryUserProviderFilter categoryUserFilter){
		this.categoryUserFilter = categoryUserFilter;
	}


	public EmailNotificationCategoryRecipientProvider() {
		super();
	}

	public EmailNotificationCategoryRecipientProvider(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		categoryId = GsonParser.parseObject(jsonObject.getAsJsonObject("categoryId"), StringValue.class);
		categoryIds = GsonParser.parseObject(jsonObject.getAsJsonObject("categoryIds"), StringValue.class);
		categoryUserFilter = GsonParser.parseObject(jsonObject.getAsJsonObject("categoryUserFilter"), CategoryUserProviderFilter.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEmailNotificationCategoryRecipientProvider");
		kparams.add("categoryId", this.categoryId);
		kparams.add("categoryIds", this.categoryIds);
		kparams.add("categoryUserFilter", this.categoryUserFilter);
		return kparams;
	}

}

