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
import com.kaltura.client.enums.MediaType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CortexApiDistributionJobProviderData.Tokenizer.class)
public class CortexApiDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		String videoAssetFilePath();
		String thumbAssetFilePath();
		RequestBuilder.ListTokenizer<CortexApiCaptionDistributionInfo.Tokenizer> captionsInfo();
		String mediaType();
	}

	private String videoAssetFilePath;
	private String thumbAssetFilePath;
	private List<CortexApiCaptionDistributionInfo> captionsInfo;
	private MediaType mediaType;

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
	public List<CortexApiCaptionDistributionInfo> getCaptionsInfo(){
		return this.captionsInfo;
	}
	public void setCaptionsInfo(List<CortexApiCaptionDistributionInfo> captionsInfo){
		this.captionsInfo = captionsInfo;
	}

	// mediaType:
	public MediaType getMediaType(){
		return this.mediaType;
	}
	public void setMediaType(MediaType mediaType){
		this.mediaType = mediaType;
	}

	public void mediaType(String multirequestToken){
		setToken("mediaType", multirequestToken);
	}


	public CortexApiDistributionJobProviderData() {
		super();
	}

	public CortexApiDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		videoAssetFilePath = GsonParser.parseString(jsonObject.get("videoAssetFilePath"));
		thumbAssetFilePath = GsonParser.parseString(jsonObject.get("thumbAssetFilePath"));
		captionsInfo = GsonParser.parseArray(jsonObject.getAsJsonArray("captionsInfo"), CortexApiCaptionDistributionInfo.class);
		mediaType = MediaType.get(GsonParser.parseInt(jsonObject.get("mediaType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCortexApiDistributionJobProviderData");
		kparams.add("videoAssetFilePath", this.videoAssetFilePath);
		kparams.add("thumbAssetFilePath", this.thumbAssetFilePath);
		kparams.add("captionsInfo", this.captionsInfo);
		kparams.add("mediaType", this.mediaType);
		return kparams;
	}

}

