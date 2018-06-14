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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PushToNewsDistributionJobProviderData.Tokenizer.class)
public class PushToNewsDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		String currentVersion();
		String bodyParamContent();
	}

	private Integer currentVersion;
	private String bodyParamContent;

	// currentVersion:
	public Integer getCurrentVersion(){
		return this.currentVersion;
	}
	public void setCurrentVersion(Integer currentVersion){
		this.currentVersion = currentVersion;
	}

	public void currentVersion(String multirequestToken){
		setToken("currentVersion", multirequestToken);
	}

	// bodyParamContent:
	public String getBodyParamContent(){
		return this.bodyParamContent;
	}
	public void setBodyParamContent(String bodyParamContent){
		this.bodyParamContent = bodyParamContent;
	}

	public void bodyParamContent(String multirequestToken){
		setToken("bodyParamContent", multirequestToken);
	}


	public PushToNewsDistributionJobProviderData() {
		super();
	}

	public PushToNewsDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		currentVersion = GsonParser.parseInt(jsonObject.get("currentVersion"));
		bodyParamContent = GsonParser.parseString(jsonObject.get("bodyParamContent"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPushToNewsDistributionJobProviderData");
		kparams.add("currentVersion", this.currentVersion);
		kparams.add("bodyParamContent", this.bodyParamContent);
		return kparams;
	}

}

