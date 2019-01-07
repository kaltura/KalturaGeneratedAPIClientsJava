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
// Copyright (C) 2006-2019  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(DailymotionDistributionJobProviderData.Tokenizer.class)
public class DailymotionDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		String videoAssetFilePath();
		String accessControlGeoBlockingOperation();
		String accessControlGeoBlockingCountryList();
		RequestBuilder.ListTokenizer<DailymotionDistributionCaptionInfo.Tokenizer> captionsInfo();
	}

	private String videoAssetFilePath;
	private String accessControlGeoBlockingOperation;
	private String accessControlGeoBlockingCountryList;
	private List<DailymotionDistributionCaptionInfo> captionsInfo;

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

	// accessControlGeoBlockingOperation:
	public String getAccessControlGeoBlockingOperation(){
		return this.accessControlGeoBlockingOperation;
	}
	public void setAccessControlGeoBlockingOperation(String accessControlGeoBlockingOperation){
		this.accessControlGeoBlockingOperation = accessControlGeoBlockingOperation;
	}

	public void accessControlGeoBlockingOperation(String multirequestToken){
		setToken("accessControlGeoBlockingOperation", multirequestToken);
	}

	// accessControlGeoBlockingCountryList:
	public String getAccessControlGeoBlockingCountryList(){
		return this.accessControlGeoBlockingCountryList;
	}
	public void setAccessControlGeoBlockingCountryList(String accessControlGeoBlockingCountryList){
		this.accessControlGeoBlockingCountryList = accessControlGeoBlockingCountryList;
	}

	public void accessControlGeoBlockingCountryList(String multirequestToken){
		setToken("accessControlGeoBlockingCountryList", multirequestToken);
	}

	// captionsInfo:
	public List<DailymotionDistributionCaptionInfo> getCaptionsInfo(){
		return this.captionsInfo;
	}
	public void setCaptionsInfo(List<DailymotionDistributionCaptionInfo> captionsInfo){
		this.captionsInfo = captionsInfo;
	}


	public DailymotionDistributionJobProviderData() {
		super();
	}

	public DailymotionDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		videoAssetFilePath = GsonParser.parseString(jsonObject.get("videoAssetFilePath"));
		accessControlGeoBlockingOperation = GsonParser.parseString(jsonObject.get("accessControlGeoBlockingOperation"));
		accessControlGeoBlockingCountryList = GsonParser.parseString(jsonObject.get("accessControlGeoBlockingCountryList"));
		captionsInfo = GsonParser.parseArray(jsonObject.getAsJsonArray("captionsInfo"), DailymotionDistributionCaptionInfo.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDailymotionDistributionJobProviderData");
		kparams.add("videoAssetFilePath", this.videoAssetFilePath);
		kparams.add("accessControlGeoBlockingOperation", this.accessControlGeoBlockingOperation);
		kparams.add("accessControlGeoBlockingCountryList", this.accessControlGeoBlockingCountryList);
		kparams.add("captionsInfo", this.captionsInfo);
		return kparams;
	}

}

