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
// Copyright (C) 2006-2022  Kaltura Inc.
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

/**
 * Defines the condition to match a property and value on core asset object (or one
  if its inherited objects)
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetDistributionPropertyCondition.Tokenizer.class)
public class AssetDistributionPropertyCondition extends AssetDistributionCondition {
	
	public interface Tokenizer extends AssetDistributionCondition.Tokenizer {
		String propertyName();
		String propertyValue();
	}

	/**
	 * The property name to look for, this will match to a getter on the asset object. 
	   Should be camelCase naming convention (defining "myPropertyName" will look for
	  getMyPropertyName())
	 */
	private String propertyName;
	/**
	 * The value to compare
	 */
	private String propertyValue;

	// propertyName:
	public String getPropertyName(){
		return this.propertyName;
	}
	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}

	public void propertyName(String multirequestToken){
		setToken("propertyName", multirequestToken);
	}

	// propertyValue:
	public String getPropertyValue(){
		return this.propertyValue;
	}
	public void setPropertyValue(String propertyValue){
		this.propertyValue = propertyValue;
	}

	public void propertyValue(String multirequestToken){
		setToken("propertyValue", multirequestToken);
	}


	public AssetDistributionPropertyCondition() {
		super();
	}

	public AssetDistributionPropertyCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		propertyName = GsonParser.parseString(jsonObject.get("propertyName"));
		propertyValue = GsonParser.parseString(jsonObject.get("propertyValue"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetDistributionPropertyCondition");
		kparams.add("propertyName", this.propertyName);
		kparams.add("propertyValue", this.propertyValue);
		return kparams;
	}

}

