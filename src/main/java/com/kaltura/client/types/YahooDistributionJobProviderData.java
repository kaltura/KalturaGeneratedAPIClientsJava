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
// Copyright (C) 2006-2020  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(YahooDistributionJobProviderData.Tokenizer.class)
public class YahooDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		String smallThumbPath();
		String largeThumbPath();
		String videoAssetFilePath();
	}

	private String smallThumbPath;
	private String largeThumbPath;
	private String videoAssetFilePath;

	// smallThumbPath:
	public String getSmallThumbPath(){
		return this.smallThumbPath;
	}
	public void setSmallThumbPath(String smallThumbPath){
		this.smallThumbPath = smallThumbPath;
	}

	public void smallThumbPath(String multirequestToken){
		setToken("smallThumbPath", multirequestToken);
	}

	// largeThumbPath:
	public String getLargeThumbPath(){
		return this.largeThumbPath;
	}
	public void setLargeThumbPath(String largeThumbPath){
		this.largeThumbPath = largeThumbPath;
	}

	public void largeThumbPath(String multirequestToken){
		setToken("largeThumbPath", multirequestToken);
	}

	// videoAssetFilePath:
	public String getVideoAssetFilePath(){
		return this.videoAssetFilePath;
	}
	public void setVideoAssetFilePath(String videoAssetFilePath){
		this.videoAssetFilePath = videoAssetFilePath;
	}

	public void videoAssetFilePath(String multirequestToken){
		setToken("videoAssetFilePath", multirequestToken);
	}


	public YahooDistributionJobProviderData() {
		super();
	}

	public YahooDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		smallThumbPath = GsonParser.parseString(jsonObject.get("smallThumbPath"));
		largeThumbPath = GsonParser.parseString(jsonObject.get("largeThumbPath"));
		videoAssetFilePath = GsonParser.parseString(jsonObject.get("videoAssetFilePath"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaYahooDistributionJobProviderData");
		kparams.add("smallThumbPath", this.smallThumbPath);
		kparams.add("largeThumbPath", this.largeThumbPath);
		kparams.add("videoAssetFilePath", this.videoAssetFilePath);
		return kparams;
	}

}

