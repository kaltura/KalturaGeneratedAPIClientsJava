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
@MultiRequestBuilder.Tokenizer(UverseDistributionJobProviderData.Tokenizer.class)
public class UverseDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		String localAssetFilePath();
		String remoteAssetUrl();
		String remoteAssetFileName();
	}

	/**
	 * The local file path of the video asset that needs to be distributed
	 */
	private String localAssetFilePath;
	/**
	 * The remote URL of the video asset that was distributed
	 */
	private String remoteAssetUrl;
	/**
	 * The file name of the remote video asset that was distributed
	 */
	private String remoteAssetFileName;

	// localAssetFilePath:
	public String getLocalAssetFilePath(){
		return this.localAssetFilePath;
	}
	public void setLocalAssetFilePath(String localAssetFilePath){
		this.localAssetFilePath = localAssetFilePath;
	}

	public void localAssetFilePath(String multirequestToken){
		setToken("localAssetFilePath", multirequestToken);
	}

	// remoteAssetUrl:
	public String getRemoteAssetUrl(){
		return this.remoteAssetUrl;
	}
	public void setRemoteAssetUrl(String remoteAssetUrl){
		this.remoteAssetUrl = remoteAssetUrl;
	}

	public void remoteAssetUrl(String multirequestToken){
		setToken("remoteAssetUrl", multirequestToken);
	}

	// remoteAssetFileName:
	public String getRemoteAssetFileName(){
		return this.remoteAssetFileName;
	}
	public void setRemoteAssetFileName(String remoteAssetFileName){
		this.remoteAssetFileName = remoteAssetFileName;
	}

	public void remoteAssetFileName(String multirequestToken){
		setToken("remoteAssetFileName", multirequestToken);
	}


	public UverseDistributionJobProviderData() {
		super();
	}

	public UverseDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		localAssetFilePath = GsonParser.parseString(jsonObject.get("localAssetFilePath"));
		remoteAssetUrl = GsonParser.parseString(jsonObject.get("remoteAssetUrl"));
		remoteAssetFileName = GsonParser.parseString(jsonObject.get("remoteAssetFileName"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUverseDistributionJobProviderData");
		kparams.add("localAssetFilePath", this.localAssetFilePath);
		kparams.add("remoteAssetUrl", this.remoteAssetUrl);
		kparams.add("remoteAssetFileName", this.remoteAssetFileName);
		return kparams;
	}

}

