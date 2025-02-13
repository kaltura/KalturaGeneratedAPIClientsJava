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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ConfigurableDistributionProfile.Tokenizer.class)
public abstract class ConfigurableDistributionProfile extends DistributionProfile {
	
	public interface Tokenizer extends DistributionProfile.Tokenizer {
		RequestBuilder.ListTokenizer<DistributionFieldConfig.Tokenizer> fieldConfigArray();
		RequestBuilder.ListTokenizer<ExtendingItemMrssParameter.Tokenizer> itemXpathsToExtend();
		String useCategoryEntries();
	}

	private List<DistributionFieldConfig> fieldConfigArray;
	private List<ExtendingItemMrssParameter> itemXpathsToExtend;
	/**
	 * When checking custom XSLT conditions using the fieldConfigArray - address only
	  categories associated with the entry via the categoryEntry object
	 */
	private Boolean useCategoryEntries;

	// fieldConfigArray:
	public List<DistributionFieldConfig> getFieldConfigArray(){
		return this.fieldConfigArray;
	}
	public void setFieldConfigArray(List<DistributionFieldConfig> fieldConfigArray){
		this.fieldConfigArray = fieldConfigArray;
	}

	// itemXpathsToExtend:
	public List<ExtendingItemMrssParameter> getItemXpathsToExtend(){
		return this.itemXpathsToExtend;
	}
	public void setItemXpathsToExtend(List<ExtendingItemMrssParameter> itemXpathsToExtend){
		this.itemXpathsToExtend = itemXpathsToExtend;
	}

	// useCategoryEntries:
	public Boolean getUseCategoryEntries(){
		return this.useCategoryEntries;
	}
	public void setUseCategoryEntries(Boolean useCategoryEntries){
		this.useCategoryEntries = useCategoryEntries;
	}

	public void useCategoryEntries(String multirequestToken){
		setToken("useCategoryEntries", multirequestToken);
	}


	public ConfigurableDistributionProfile() {
		super();
	}

	public ConfigurableDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fieldConfigArray = GsonParser.parseArray(jsonObject.getAsJsonArray("fieldConfigArray"), DistributionFieldConfig.class);
		itemXpathsToExtend = GsonParser.parseArray(jsonObject.getAsJsonArray("itemXpathsToExtend"), ExtendingItemMrssParameter.class);
		useCategoryEntries = GsonParser.parseBoolean(jsonObject.get("useCategoryEntries"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaConfigurableDistributionProfile");
		kparams.add("fieldConfigArray", this.fieldConfigArray);
		kparams.add("itemXpathsToExtend", this.itemXpathsToExtend);
		kparams.add("useCategoryEntries", this.useCategoryEntries);
		return kparams;
	}

}

