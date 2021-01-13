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
// Copyright (C) 2006-2021  Kaltura Inc.
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
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FreewheelGenericDistributionJobProviderData.Tokenizer.class)
public class FreewheelGenericDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		RequestBuilder.ListTokenizer<StringHolder.Tokenizer> videoAssetFilePaths();
		String thumbAssetFilePath();
		RequestBuilder.ListTokenizer<CuePoint.Tokenizer> cuePoints();
	}

	/**
	 * Demonstrate passing array of paths to the job
	 */
	private List<StringHolder> videoAssetFilePaths;
	/**
	 * Demonstrate passing single path to the job
	 */
	private String thumbAssetFilePath;
	private List<CuePoint> cuePoints;

	// videoAssetFilePaths:
	public List<StringHolder> getVideoAssetFilePaths(){
		return this.videoAssetFilePaths;
	}
	public void setVideoAssetFilePaths(List<StringHolder> videoAssetFilePaths){
		this.videoAssetFilePaths = videoAssetFilePaths;
	}

	// thumbAssetFilePath:
	public String getThumbAssetFilePath(){
		return this.thumbAssetFilePath;
	}
	public void setThumbAssetFilePath(String thumbAssetFilePath){
		this.thumbAssetFilePath = thumbAssetFilePath;
	}

	public void thumbAssetFilePath(String multirequestToken){
		setToken("thumbAssetFilePath", multirequestToken);
	}

	// cuePoints:
	public List<CuePoint> getCuePoints(){
		return this.cuePoints;
	}
	public void setCuePoints(List<CuePoint> cuePoints){
		this.cuePoints = cuePoints;
	}


	public FreewheelGenericDistributionJobProviderData() {
		super();
	}

	public FreewheelGenericDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		videoAssetFilePaths = GsonParser.parseArray(jsonObject.getAsJsonArray("videoAssetFilePaths"), StringHolder.class);
		thumbAssetFilePath = GsonParser.parseString(jsonObject.get("thumbAssetFilePath"));
		cuePoints = GsonParser.parseArray(jsonObject.getAsJsonArray("cuePoints"), CuePoint.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFreewheelGenericDistributionJobProviderData");
		kparams.add("videoAssetFilePaths", this.videoAssetFilePaths);
		kparams.add("thumbAssetFilePath", this.thumbAssetFilePath);
		kparams.add("cuePoints", this.cuePoints);
		return kparams;
	}

}

