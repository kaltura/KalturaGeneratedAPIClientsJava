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
@MultiRequestBuilder.Tokenizer(AttUverseDistributionJobProviderData.Tokenizer.class)
public class AttUverseDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		RequestBuilder.ListTokenizer<AttUverseDistributionFile.Tokenizer> filesForDistribution();
		String remoteAssetFileUrls();
		String remoteThumbnailFileUrls();
		String remoteCaptionFileUrls();
	}

	private List<AttUverseDistributionFile> filesForDistribution;
	/**
	 * The remote URL of the video asset that was distributed
	 */
	private String remoteAssetFileUrls;
	/**
	 * The remote URL of the thumbnail asset that was distributed
	 */
	private String remoteThumbnailFileUrls;
	/**
	 * The remote URL of the caption asset that was distributed
	 */
	private String remoteCaptionFileUrls;

	// filesForDistribution:
	public List<AttUverseDistributionFile> getFilesForDistribution(){
		return this.filesForDistribution;
	}
	public void setFilesForDistribution(List<AttUverseDistributionFile> filesForDistribution){
		this.filesForDistribution = filesForDistribution;
	}

	// remoteAssetFileUrls:
	public String getRemoteAssetFileUrls(){
		return this.remoteAssetFileUrls;
	}
	public void setRemoteAssetFileUrls(String remoteAssetFileUrls){
		this.remoteAssetFileUrls = remoteAssetFileUrls;
	}

	public void remoteAssetFileUrls(String multirequestToken){
		setToken("remoteAssetFileUrls", multirequestToken);
	}

	// remoteThumbnailFileUrls:
	public String getRemoteThumbnailFileUrls(){
		return this.remoteThumbnailFileUrls;
	}
	public void setRemoteThumbnailFileUrls(String remoteThumbnailFileUrls){
		this.remoteThumbnailFileUrls = remoteThumbnailFileUrls;
	}

	public void remoteThumbnailFileUrls(String multirequestToken){
		setToken("remoteThumbnailFileUrls", multirequestToken);
	}

	// remoteCaptionFileUrls:
	public String getRemoteCaptionFileUrls(){
		return this.remoteCaptionFileUrls;
	}
	public void setRemoteCaptionFileUrls(String remoteCaptionFileUrls){
		this.remoteCaptionFileUrls = remoteCaptionFileUrls;
	}

	public void remoteCaptionFileUrls(String multirequestToken){
		setToken("remoteCaptionFileUrls", multirequestToken);
	}


	public AttUverseDistributionJobProviderData() {
		super();
	}

	public AttUverseDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		filesForDistribution = GsonParser.parseArray(jsonObject.getAsJsonArray("filesForDistribution"), AttUverseDistributionFile.class);
		remoteAssetFileUrls = GsonParser.parseString(jsonObject.get("remoteAssetFileUrls"));
		remoteThumbnailFileUrls = GsonParser.parseString(jsonObject.get("remoteThumbnailFileUrls"));
		remoteCaptionFileUrls = GsonParser.parseString(jsonObject.get("remoteCaptionFileUrls"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAttUverseDistributionJobProviderData");
		kparams.add("filesForDistribution", this.filesForDistribution);
		kparams.add("remoteAssetFileUrls", this.remoteAssetFileUrls);
		kparams.add("remoteThumbnailFileUrls", this.remoteThumbnailFileUrls);
		kparams.add("remoteCaptionFileUrls", this.remoteCaptionFileUrls);
		return kparams;
	}

}

