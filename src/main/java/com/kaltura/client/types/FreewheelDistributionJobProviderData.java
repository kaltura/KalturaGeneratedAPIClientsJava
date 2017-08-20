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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FreewheelDistributionJobProviderData.Tokenizer.class)
public class FreewheelDistributionJobProviderData extends DistributionJobProviderData {
	
	public interface Tokenizer extends DistributionJobProviderData.Tokenizer {
		RequestBuilder.ListTokenizer<FreewheelDistributionAssetPath.Tokenizer> videoAssetFilePaths();
		String thumbAssetFilePath();
	}

	/**  Demonstrate passing array of paths to the job  */
	private List<FreewheelDistributionAssetPath> videoAssetFilePaths;
	/**  Demonstrate passing single path to the job  */
	private String thumbAssetFilePath;

	// videoAssetFilePaths:
	public List<FreewheelDistributionAssetPath> getVideoAssetFilePaths(){
		return this.videoAssetFilePaths;
	}
	public void setVideoAssetFilePaths(List<FreewheelDistributionAssetPath> videoAssetFilePaths){
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


	public FreewheelDistributionJobProviderData() {
		super();
	}

	public FreewheelDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		videoAssetFilePaths = GsonParser.parseArray(jsonObject.getAsJsonArray("videoAssetFilePaths"), FreewheelDistributionAssetPath.class);
		thumbAssetFilePath = GsonParser.parseString(jsonObject.get("thumbAssetFilePath"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFreewheelDistributionJobProviderData");
		kparams.add("videoAssetFilePaths", this.videoAssetFilePaths);
		kparams.add("thumbAssetFilePath", this.thumbAssetFilePath);
		return kparams;
	}

}

