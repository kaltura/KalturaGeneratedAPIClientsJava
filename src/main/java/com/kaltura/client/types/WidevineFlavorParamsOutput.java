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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(WidevineFlavorParamsOutput.Tokenizer.class)
public class WidevineFlavorParamsOutput extends FlavorParamsOutput {
	
	public interface Tokenizer extends FlavorParamsOutput.Tokenizer {
		String widevineDistributionStartDate();
		String widevineDistributionEndDate();
	}

	/**  License distribution window start date  */
	private Integer widevineDistributionStartDate;
	/**  License distribution window end date  */
	private Integer widevineDistributionEndDate;

	// widevineDistributionStartDate:
	public Integer getWidevineDistributionStartDate(){
		return this.widevineDistributionStartDate;
	}
	public void setWidevineDistributionStartDate(Integer widevineDistributionStartDate){
		this.widevineDistributionStartDate = widevineDistributionStartDate;
	}

	public void widevineDistributionStartDate(String multirequestToken){
		setToken("widevineDistributionStartDate", multirequestToken);
	}

	// widevineDistributionEndDate:
	public Integer getWidevineDistributionEndDate(){
		return this.widevineDistributionEndDate;
	}
	public void setWidevineDistributionEndDate(Integer widevineDistributionEndDate){
		this.widevineDistributionEndDate = widevineDistributionEndDate;
	}

	public void widevineDistributionEndDate(String multirequestToken){
		setToken("widevineDistributionEndDate", multirequestToken);
	}


	public WidevineFlavorParamsOutput() {
		super();
	}

	public WidevineFlavorParamsOutput(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		widevineDistributionStartDate = GsonParser.parseInt(jsonObject.get("widevineDistributionStartDate"));
		widevineDistributionEndDate = GsonParser.parseInt(jsonObject.get("widevineDistributionEndDate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaWidevineFlavorParamsOutput");
		kparams.add("widevineDistributionStartDate", this.widevineDistributionStartDate);
		kparams.add("widevineDistributionEndDate", this.widevineDistributionEndDate);
		return kparams;
	}

}

