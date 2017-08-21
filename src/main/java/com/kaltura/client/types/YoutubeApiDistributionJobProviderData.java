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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(YoutubeApiDistributionJobProviderData.Tokenizer.class)
public class YoutubeApiDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		String videoAssetFilePath();
		String thumbAssetFilePath();
		RequestBuilder.ListTokenizer<YouTubeApiCaptionDistributionInfo.Tokenizer> captionsInfo();
	}

	private String videoAssetFilePath;
	private String thumbAssetFilePath;
	private List<YouTubeApiCaptionDistributionInfo> captionsInfo;

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

	// captionsInfo:
	public List<YouTubeApiCaptionDistributionInfo> getCaptionsInfo(){
		return this.captionsInfo;
	}
	public void setCaptionsInfo(List<YouTubeApiCaptionDistributionInfo> captionsInfo){
		this.captionsInfo = captionsInfo;
	}


	public YoutubeApiDistributionJobProviderData() {
		super();
	}

	public YoutubeApiDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		videoAssetFilePath = GsonParser.parseString(jsonObject.get("videoAssetFilePath"));
		thumbAssetFilePath = GsonParser.parseString(jsonObject.get("thumbAssetFilePath"));
		captionsInfo = GsonParser.parseArray(jsonObject.getAsJsonArray("captionsInfo"), YouTubeApiCaptionDistributionInfo.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaYoutubeApiDistributionJobProviderData");
		kparams.add("videoAssetFilePath", this.videoAssetFilePath);
		kparams.add("thumbAssetFilePath", this.thumbAssetFilePath);
		kparams.add("captionsInfo", this.captionsInfo);
		return kparams;
	}

}

