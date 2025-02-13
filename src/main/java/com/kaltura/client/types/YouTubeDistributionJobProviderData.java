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
@MultiRequestBuilder.Tokenizer(YouTubeDistributionJobProviderData.Tokenizer.class)
public class YouTubeDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		String videoAssetFilePath();
		String thumbAssetFilePath();
		String thumbAssetId();
		String captionAssetIds();
		String sftpDirectory();
		String sftpMetadataFilename();
		String currentPlaylists();
		String newPlaylists();
		String submitXml();
		String updateXml();
		String deleteXml();
		String googleClientId();
		String googleClientSecret();
		String googleTokenData();
		String captionsCsvMap();
		String submitCsvMap();
		String updateCsvMap();
		String deleteVideoIds();
	}

	private String videoAssetFilePath;
	private String thumbAssetFilePath;
	private String thumbAssetId;
	private String captionAssetIds;
	private String sftpDirectory;
	private String sftpMetadataFilename;
	private String currentPlaylists;
	private String newPlaylists;
	private String submitXml;
	private String updateXml;
	private String deleteXml;
	private String googleClientId;
	private String googleClientSecret;
	private String googleTokenData;
	private String captionsCsvMap;
	private String submitCsvMap;
	private String updateCsvMap;
	private String deleteVideoIds;

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

	// captionAssetIds:
	public String getCaptionAssetIds(){
		return this.captionAssetIds;
	}
	public void setCaptionAssetIds(String captionAssetIds){
		this.captionAssetIds = captionAssetIds;
	}

	public void captionAssetIds(String multirequestToken){
		setToken("captionAssetIds", multirequestToken);
	}

	// sftpDirectory:
	public String getSftpDirectory(){
		return this.sftpDirectory;
	}
	public void setSftpDirectory(String sftpDirectory){
		this.sftpDirectory = sftpDirectory;
	}

	public void sftpDirectory(String multirequestToken){
		setToken("sftpDirectory", multirequestToken);
	}

	// sftpMetadataFilename:
	public String getSftpMetadataFilename(){
		return this.sftpMetadataFilename;
	}
	public void setSftpMetadataFilename(String sftpMetadataFilename){
		this.sftpMetadataFilename = sftpMetadataFilename;
	}

	public void sftpMetadataFilename(String multirequestToken){
		setToken("sftpMetadataFilename", multirequestToken);
	}

	// currentPlaylists:
	public String getCurrentPlaylists(){
		return this.currentPlaylists;
	}
	public void setCurrentPlaylists(String currentPlaylists){
		this.currentPlaylists = currentPlaylists;
	}

	public void currentPlaylists(String multirequestToken){
		setToken("currentPlaylists", multirequestToken);
	}

	// newPlaylists:
	public String getNewPlaylists(){
		return this.newPlaylists;
	}
	public void setNewPlaylists(String newPlaylists){
		this.newPlaylists = newPlaylists;
	}

	public void newPlaylists(String multirequestToken){
		setToken("newPlaylists", multirequestToken);
	}

	// submitXml:
	public String getSubmitXml(){
		return this.submitXml;
	}
	public void setSubmitXml(String submitXml){
		this.submitXml = submitXml;
	}

	public void submitXml(String multirequestToken){
		setToken("submitXml", multirequestToken);
	}

	// updateXml:
	public String getUpdateXml(){
		return this.updateXml;
	}
	public void setUpdateXml(String updateXml){
		this.updateXml = updateXml;
	}

	public void updateXml(String multirequestToken){
		setToken("updateXml", multirequestToken);
	}

	// deleteXml:
	public String getDeleteXml(){
		return this.deleteXml;
	}
	public void setDeleteXml(String deleteXml){
		this.deleteXml = deleteXml;
	}

	public void deleteXml(String multirequestToken){
		setToken("deleteXml", multirequestToken);
	}

	// googleClientId:
	public String getGoogleClientId(){
		return this.googleClientId;
	}
	public void setGoogleClientId(String googleClientId){
		this.googleClientId = googleClientId;
	}

	public void googleClientId(String multirequestToken){
		setToken("googleClientId", multirequestToken);
	}

	// googleClientSecret:
	public String getGoogleClientSecret(){
		return this.googleClientSecret;
	}
	public void setGoogleClientSecret(String googleClientSecret){
		this.googleClientSecret = googleClientSecret;
	}

	public void googleClientSecret(String multirequestToken){
		setToken("googleClientSecret", multirequestToken);
	}

	// googleTokenData:
	public String getGoogleTokenData(){
		return this.googleTokenData;
	}
	public void setGoogleTokenData(String googleTokenData){
		this.googleTokenData = googleTokenData;
	}

	public void googleTokenData(String multirequestToken){
		setToken("googleTokenData", multirequestToken);
	}

	// captionsCsvMap:
	public String getCaptionsCsvMap(){
		return this.captionsCsvMap;
	}
	public void setCaptionsCsvMap(String captionsCsvMap){
		this.captionsCsvMap = captionsCsvMap;
	}

	public void captionsCsvMap(String multirequestToken){
		setToken("captionsCsvMap", multirequestToken);
	}

	// submitCsvMap:
	public String getSubmitCsvMap(){
		return this.submitCsvMap;
	}
	public void setSubmitCsvMap(String submitCsvMap){
		this.submitCsvMap = submitCsvMap;
	}

	public void submitCsvMap(String multirequestToken){
		setToken("submitCsvMap", multirequestToken);
	}

	// updateCsvMap:
	public String getUpdateCsvMap(){
		return this.updateCsvMap;
	}
	public void setUpdateCsvMap(String updateCsvMap){
		this.updateCsvMap = updateCsvMap;
	}

	public void updateCsvMap(String multirequestToken){
		setToken("updateCsvMap", multirequestToken);
	}

	// deleteVideoIds:
	public String getDeleteVideoIds(){
		return this.deleteVideoIds;
	}
	public void setDeleteVideoIds(String deleteVideoIds){
		this.deleteVideoIds = deleteVideoIds;
	}

	public void deleteVideoIds(String multirequestToken){
		setToken("deleteVideoIds", multirequestToken);
	}


	public YouTubeDistributionJobProviderData() {
		super();
	}

	public YouTubeDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		videoAssetFilePath = GsonParser.parseString(jsonObject.get("videoAssetFilePath"));
		thumbAssetFilePath = GsonParser.parseString(jsonObject.get("thumbAssetFilePath"));
		thumbAssetId = GsonParser.parseString(jsonObject.get("thumbAssetId"));
		captionAssetIds = GsonParser.parseString(jsonObject.get("captionAssetIds"));
		sftpDirectory = GsonParser.parseString(jsonObject.get("sftpDirectory"));
		sftpMetadataFilename = GsonParser.parseString(jsonObject.get("sftpMetadataFilename"));
		currentPlaylists = GsonParser.parseString(jsonObject.get("currentPlaylists"));
		newPlaylists = GsonParser.parseString(jsonObject.get("newPlaylists"));
		submitXml = GsonParser.parseString(jsonObject.get("submitXml"));
		updateXml = GsonParser.parseString(jsonObject.get("updateXml"));
		deleteXml = GsonParser.parseString(jsonObject.get("deleteXml"));
		googleClientId = GsonParser.parseString(jsonObject.get("googleClientId"));
		googleClientSecret = GsonParser.parseString(jsonObject.get("googleClientSecret"));
		googleTokenData = GsonParser.parseString(jsonObject.get("googleTokenData"));
		captionsCsvMap = GsonParser.parseString(jsonObject.get("captionsCsvMap"));
		submitCsvMap = GsonParser.parseString(jsonObject.get("submitCsvMap"));
		updateCsvMap = GsonParser.parseString(jsonObject.get("updateCsvMap"));
		deleteVideoIds = GsonParser.parseString(jsonObject.get("deleteVideoIds"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaYouTubeDistributionJobProviderData");
		kparams.add("videoAssetFilePath", this.videoAssetFilePath);
		kparams.add("thumbAssetFilePath", this.thumbAssetFilePath);
		kparams.add("thumbAssetId", this.thumbAssetId);
		kparams.add("captionAssetIds", this.captionAssetIds);
		kparams.add("sftpDirectory", this.sftpDirectory);
		kparams.add("sftpMetadataFilename", this.sftpMetadataFilename);
		kparams.add("currentPlaylists", this.currentPlaylists);
		kparams.add("newPlaylists", this.newPlaylists);
		kparams.add("submitXml", this.submitXml);
		kparams.add("updateXml", this.updateXml);
		kparams.add("deleteXml", this.deleteXml);
		kparams.add("googleClientId", this.googleClientId);
		kparams.add("googleClientSecret", this.googleClientSecret);
		kparams.add("googleTokenData", this.googleTokenData);
		kparams.add("captionsCsvMap", this.captionsCsvMap);
		kparams.add("submitCsvMap", this.submitCsvMap);
		kparams.add("updateCsvMap", this.updateCsvMap);
		kparams.add("deleteVideoIds", this.deleteVideoIds);
		return kparams;
	}

}

