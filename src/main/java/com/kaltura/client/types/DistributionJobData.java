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
import com.kaltura.client.enums.DistributionProviderType;
import com.kaltura.client.types.DistributionJobProviderData;
import com.kaltura.client.types.DistributionProfile;
import com.kaltura.client.types.EntryDistribution;
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
@MultiRequestBuilder.Tokenizer(DistributionJobData.Tokenizer.class)
public class DistributionJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String distributionProfileId();
		DistributionProfile.Tokenizer distributionProfile();
		String entryDistributionId();
		EntryDistribution.Tokenizer entryDistribution();
		String remoteId();
		String providerType();
		DistributionJobProviderData.Tokenizer providerData();
		String results();
		String sentData();
		RequestBuilder.ListTokenizer<DistributionRemoteMediaFile.Tokenizer> mediaFiles();
	}

	private Integer distributionProfileId;
	private DistributionProfile distributionProfile;
	private Integer entryDistributionId;
	private EntryDistribution entryDistribution;
	/**
	 * Id of the media in the remote system
	 */
	private String remoteId;
	private DistributionProviderType providerType;
	/**
	 * Additional data that relevant for the provider only
	 */
	private DistributionJobProviderData providerData;
	/**
	 * The results as returned from the remote destination
	 */
	private String results;
	/**
	 * The data as sent to the remote destination
	 */
	private String sentData;
	/**
	 * Stores array of media files that submitted to the destination site   Could be
	  used later for media update
	 */
	private List<DistributionRemoteMediaFile> mediaFiles;

	// distributionProfileId:
	public Integer getDistributionProfileId(){
		return this.distributionProfileId;
	}
	public void setDistributionProfileId(Integer distributionProfileId){
		this.distributionProfileId = distributionProfileId;
	}

	public void distributionProfileId(String multirequestToken){
		setToken("distributionProfileId", multirequestToken);
	}

	// distributionProfile:
	public DistributionProfile getDistributionProfile(){
		return this.distributionProfile;
	}
	public void setDistributionProfile(DistributionProfile distributionProfile){
		this.distributionProfile = distributionProfile;
	}

	// entryDistributionId:
	public Integer getEntryDistributionId(){
		return this.entryDistributionId;
	}
	public void setEntryDistributionId(Integer entryDistributionId){
		this.entryDistributionId = entryDistributionId;
	}

	public void entryDistributionId(String multirequestToken){
		setToken("entryDistributionId", multirequestToken);
	}

	// entryDistribution:
	public EntryDistribution getEntryDistribution(){
		return this.entryDistribution;
	}
	public void setEntryDistribution(EntryDistribution entryDistribution){
		this.entryDistribution = entryDistribution;
	}

	// remoteId:
	public String getRemoteId(){
		return this.remoteId;
	}
	public void setRemoteId(String remoteId){
		this.remoteId = remoteId;
	}

	public void remoteId(String multirequestToken){
		setToken("remoteId", multirequestToken);
	}

	// providerType:
	public DistributionProviderType getProviderType(){
		return this.providerType;
	}
	public void setProviderType(DistributionProviderType providerType){
		this.providerType = providerType;
	}

	public void providerType(String multirequestToken){
		setToken("providerType", multirequestToken);
	}

	// providerData:
	public DistributionJobProviderData getProviderData(){
		return this.providerData;
	}
	public void setProviderData(DistributionJobProviderData providerData){
		this.providerData = providerData;
	}

	// results:
	public String getResults(){
		return this.results;
	}
	public void setResults(String results){
		this.results = results;
	}

	public void results(String multirequestToken){
		setToken("results", multirequestToken);
	}

	// sentData:
	public String getSentData(){
		return this.sentData;
	}
	public void setSentData(String sentData){
		this.sentData = sentData;
	}

	public void sentData(String multirequestToken){
		setToken("sentData", multirequestToken);
	}

	// mediaFiles:
	public List<DistributionRemoteMediaFile> getMediaFiles(){
		return this.mediaFiles;
	}
	public void setMediaFiles(List<DistributionRemoteMediaFile> mediaFiles){
		this.mediaFiles = mediaFiles;
	}


	public DistributionJobData() {
		super();
	}

	public DistributionJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		distributionProfileId = GsonParser.parseInt(jsonObject.get("distributionProfileId"));
		distributionProfile = GsonParser.parseObject(jsonObject.getAsJsonObject("distributionProfile"), DistributionProfile.class);
		entryDistributionId = GsonParser.parseInt(jsonObject.get("entryDistributionId"));
		entryDistribution = GsonParser.parseObject(jsonObject.getAsJsonObject("entryDistribution"), EntryDistribution.class);
		remoteId = GsonParser.parseString(jsonObject.get("remoteId"));
		providerType = DistributionProviderType.get(GsonParser.parseString(jsonObject.get("providerType")));
		providerData = GsonParser.parseObject(jsonObject.getAsJsonObject("providerData"), DistributionJobProviderData.class);
		results = GsonParser.parseString(jsonObject.get("results"));
		sentData = GsonParser.parseString(jsonObject.get("sentData"));
		mediaFiles = GsonParser.parseArray(jsonObject.getAsJsonArray("mediaFiles"), DistributionRemoteMediaFile.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDistributionJobData");
		kparams.add("distributionProfileId", this.distributionProfileId);
		kparams.add("distributionProfile", this.distributionProfile);
		kparams.add("entryDistributionId", this.entryDistributionId);
		kparams.add("entryDistribution", this.entryDistribution);
		kparams.add("remoteId", this.remoteId);
		kparams.add("providerType", this.providerType);
		kparams.add("providerData", this.providerData);
		kparams.add("results", this.results);
		kparams.add("sentData", this.sentData);
		kparams.add("mediaFiles", this.mediaFiles);
		return kparams;
	}

}

