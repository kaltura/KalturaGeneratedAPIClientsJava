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

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UverseClickToOrderDistributionProfile.Tokenizer.class)
public class UverseClickToOrderDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String feedUrl();
		String backgroundImageWide();
		String backgroundImageStandard();
	}

	private String feedUrl;
	private String backgroundImageWide;
	private String backgroundImageStandard;

	// feedUrl:
	public String getFeedUrl(){
		return this.feedUrl;
	}
	// backgroundImageWide:
	public String getBackgroundImageWide(){
		return this.backgroundImageWide;
	}
	public void setBackgroundImageWide(String backgroundImageWide){
		this.backgroundImageWide = backgroundImageWide;
	}

	public void backgroundImageWide(String multirequestToken){
		setToken("backgroundImageWide", multirequestToken);
	}

	// backgroundImageStandard:
	public String getBackgroundImageStandard(){
		return this.backgroundImageStandard;
	}
	public void setBackgroundImageStandard(String backgroundImageStandard){
		this.backgroundImageStandard = backgroundImageStandard;
	}

	public void backgroundImageStandard(String multirequestToken){
		setToken("backgroundImageStandard", multirequestToken);
	}


	public UverseClickToOrderDistributionProfile() {
		super();
	}

	public UverseClickToOrderDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		feedUrl = GsonParser.parseString(jsonObject.get("feedUrl"));
		backgroundImageWide = GsonParser.parseString(jsonObject.get("backgroundImageWide"));
		backgroundImageStandard = GsonParser.parseString(jsonObject.get("backgroundImageStandard"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUverseClickToOrderDistributionProfile");
		kparams.add("backgroundImageWide", this.backgroundImageWide);
		kparams.add("backgroundImageStandard", this.backgroundImageStandard);
		return kparams;
	}

}

