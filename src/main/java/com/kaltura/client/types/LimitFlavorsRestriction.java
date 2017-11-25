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
import com.kaltura.client.enums.LimitFlavorsRestrictionType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LimitFlavorsRestriction.Tokenizer.class)
public class LimitFlavorsRestriction extends BaseRestriction {
	
	public interface Tokenizer extends BaseRestriction.Tokenizer {
		String limitFlavorsRestrictionType();
		String flavorParamsIds();
	}

	/**
	 * Limit flavors restriction type (Allow or deny)
	 */
	private LimitFlavorsRestrictionType limitFlavorsRestrictionType;
	/**
	 * Comma separated list of flavor params ids to allow to deny
	 */
	private String flavorParamsIds;

	// limitFlavorsRestrictionType:
	public LimitFlavorsRestrictionType getLimitFlavorsRestrictionType(){
		return this.limitFlavorsRestrictionType;
	}
	public void setLimitFlavorsRestrictionType(LimitFlavorsRestrictionType limitFlavorsRestrictionType){
		this.limitFlavorsRestrictionType = limitFlavorsRestrictionType;
	}

	public void limitFlavorsRestrictionType(String multirequestToken){
		setToken("limitFlavorsRestrictionType", multirequestToken);
	}

	// flavorParamsIds:
	public String getFlavorParamsIds(){
		return this.flavorParamsIds;
	}
	public void setFlavorParamsIds(String flavorParamsIds){
		this.flavorParamsIds = flavorParamsIds;
	}

	public void flavorParamsIds(String multirequestToken){
		setToken("flavorParamsIds", multirequestToken);
	}


	public LimitFlavorsRestriction() {
		super();
	}

	public LimitFlavorsRestriction(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		limitFlavorsRestrictionType = LimitFlavorsRestrictionType.get(GsonParser.parseInt(jsonObject.get("limitFlavorsRestrictionType")));
		flavorParamsIds = GsonParser.parseString(jsonObject.get("flavorParamsIds"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLimitFlavorsRestriction");
		kparams.add("limitFlavorsRestrictionType", this.limitFlavorsRestrictionType);
		kparams.add("flavorParamsIds", this.flavorParamsIds);
		return kparams;
	}

}

