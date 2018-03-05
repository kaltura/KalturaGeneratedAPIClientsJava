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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FacebookDistributionJobProviderData.Tokenizer.class)
public class FacebookDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		String videoAssetFilePath();
		String thumbAssetId();
		RequestBuilder.ListTokenizer<FacebookCaptionDistributionInfo.Tokenizer> captionsInfo();
	}

	private String videoAssetFilePath;
	private String thumbAssetId;
	private List<FacebookCaptionDistributionInfo> captionsInfo;

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

	// thumbAssetId:
	public String getThumbAssetId(){
		return this.thumbAssetId;
	}
	public void setThumbAssetId(String thumbAssetId){
		this.thumbAssetId = thumbAssetId;
	}

	public void thumbAssetId(String multirequestToken){
		setToken("thumbAssetId", multirequestToken);
	}

	// captionsInfo:
	public List<FacebookCaptionDistributionInfo> getCaptionsInfo(){
		return this.captionsInfo;
	}
	public void setCaptionsInfo(List<FacebookCaptionDistributionInfo> captionsInfo){
		this.captionsInfo = captionsInfo;
	}


	public FacebookDistributionJobProviderData() {
		super();
	}

	public FacebookDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		videoAssetFilePath = GsonParser.parseString(jsonObject.get("videoAssetFilePath"));
		thumbAssetId = GsonParser.parseString(jsonObject.get("thumbAssetId"));
		captionsInfo = GsonParser.parseArray(jsonObject.getAsJsonArray("captionsInfo"), FacebookCaptionDistributionInfo.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFacebookDistributionJobProviderData");
		kparams.add("videoAssetFilePath", this.videoAssetFilePath);
		kparams.add("thumbAssetId", this.thumbAssetId);
		kparams.add("captionsInfo", this.captionsInfo);
		return kparams;
	}

}

