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
@MultiRequestBuilder.Tokenizer(ConvertEntryFlavorsObjectTask.Tokenizer.class)
public class ConvertEntryFlavorsObjectTask extends ObjectTask {
	
	public interface Tokenizer extends ObjectTask.Tokenizer {
		String flavorParamsIds();
		String reconvert();
	}

	/**  Comma separated list of flavor param ids to convert  */
	private String flavorParamsIds;
	/**  Should reconvert when flavor already exists?  */
	private Boolean reconvert;

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

	// reconvert:
	public Boolean getReconvert(){
		return this.reconvert;
	}
	public void setReconvert(Boolean reconvert){
		this.reconvert = reconvert;
	}

	public void reconvert(String multirequestToken){
		setToken("reconvert", multirequestToken);
	}


	public ConvertEntryFlavorsObjectTask() {
		super();
	}

	public ConvertEntryFlavorsObjectTask(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		flavorParamsIds = GsonParser.parseString(jsonObject.get("flavorParamsIds"));
		reconvert = GsonParser.parseBoolean(jsonObject.get("reconvert"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaConvertEntryFlavorsObjectTask");
		kparams.add("flavorParamsIds", this.flavorParamsIds);
		kparams.add("reconvert", this.reconvert);
		return kparams;
	}

}

