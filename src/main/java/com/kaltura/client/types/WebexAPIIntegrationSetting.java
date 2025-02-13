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
import com.kaltura.client.enums.WebexAPIGroupParticipationType;
import com.kaltura.client.enums.WebexAPIUsersMatching;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(WebexAPIIntegrationSetting.Tokenizer.class)
public class WebexAPIIntegrationSetting extends IntegrationSetting {
	
	public interface Tokenizer extends IntegrationSetting.Tokenizer {
		String webexCategory();
		String enableRecordingUpload();
		String enableTranscription();
		String userMatchingMode();
		String userPostfix();
		String webexAccountDescription();
		String groupParticipationType();
		String optOutGroupNames();
		String optInGroupNames();
		String siteUrl();
	}

	private String webexCategory;
	private Boolean enableRecordingUpload;
	private Boolean enableTranscription;
	private WebexAPIUsersMatching userMatchingMode;
	private String userPostfix;
	private String webexAccountDescription;
	private WebexAPIGroupParticipationType groupParticipationType;
	private String optOutGroupNames;
	private String optInGroupNames;
	private String siteUrl;

	// webexCategory:
	public String getWebexCategory(){
		return this.webexCategory;
	}
	public void setWebexCategory(String webexCategory){
		this.webexCategory = webexCategory;
	}

	public void webexCategory(String multirequestToken){
		setToken("webexCategory", multirequestToken);
	}

	// enableRecordingUpload:
	public Boolean getEnableRecordingUpload(){
		return this.enableRecordingUpload;
	}
	public void setEnableRecordingUpload(Boolean enableRecordingUpload){
		this.enableRecordingUpload = enableRecordingUpload;
	}

	public void enableRecordingUpload(String multirequestToken){
		setToken("enableRecordingUpload", multirequestToken);
	}

	// enableTranscription:
	public Boolean getEnableTranscription(){
		return this.enableTranscription;
	}
	public void setEnableTranscription(Boolean enableTranscription){
		this.enableTranscription = enableTranscription;
	}

	public void enableTranscription(String multirequestToken){
		setToken("enableTranscription", multirequestToken);
	}

	// userMatchingMode:
	public WebexAPIUsersMatching getUserMatchingMode(){
		return this.userMatchingMode;
	}
	public void setUserMatchingMode(WebexAPIUsersMatching userMatchingMode){
		this.userMatchingMode = userMatchingMode;
	}

	public void userMatchingMode(String multirequestToken){
		setToken("userMatchingMode", multirequestToken);
	}

	// userPostfix:
	public String getUserPostfix(){
		return this.userPostfix;
	}
	public void setUserPostfix(String userPostfix){
		this.userPostfix = userPostfix;
	}

	public void userPostfix(String multirequestToken){
		setToken("userPostfix", multirequestToken);
	}

	// webexAccountDescription:
	public String getWebexAccountDescription(){
		return this.webexAccountDescription;
	}
	public void setWebexAccountDescription(String webexAccountDescription){
		this.webexAccountDescription = webexAccountDescription;
	}

	public void webexAccountDescription(String multirequestToken){
		setToken("webexAccountDescription", multirequestToken);
	}

	// groupParticipationType:
	public WebexAPIGroupParticipationType getGroupParticipationType(){
		return this.groupParticipationType;
	}
	public void setGroupParticipationType(WebexAPIGroupParticipationType groupParticipationType){
		this.groupParticipationType = groupParticipationType;
	}

	public void groupParticipationType(String multirequestToken){
		setToken("groupParticipationType", multirequestToken);
	}

	// optOutGroupNames:
	public String getOptOutGroupNames(){
		return this.optOutGroupNames;
	}
	public void setOptOutGroupNames(String optOutGroupNames){
		this.optOutGroupNames = optOutGroupNames;
	}

	public void optOutGroupNames(String multirequestToken){
		setToken("optOutGroupNames", multirequestToken);
	}

	// optInGroupNames:
	public String getOptInGroupNames(){
		return this.optInGroupNames;
	}
	public void setOptInGroupNames(String optInGroupNames){
		this.optInGroupNames = optInGroupNames;
	}

	public void optInGroupNames(String multirequestToken){
		setToken("optInGroupNames", multirequestToken);
	}

	// siteUrl:
	public String getSiteUrl(){
		return this.siteUrl;
	}
	public void setSiteUrl(String siteUrl){
		this.siteUrl = siteUrl;
	}

	public void siteUrl(String multirequestToken){
		setToken("siteUrl", multirequestToken);
	}


	public WebexAPIIntegrationSetting() {
		super();
	}

	public WebexAPIIntegrationSetting(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		webexCategory = GsonParser.parseString(jsonObject.get("webexCategory"));
		enableRecordingUpload = GsonParser.parseBoolean(jsonObject.get("enableRecordingUpload"));
		enableTranscription = GsonParser.parseBoolean(jsonObject.get("enableTranscription"));
		userMatchingMode = WebexAPIUsersMatching.get(GsonParser.parseInt(jsonObject.get("userMatchingMode")));
		userPostfix = GsonParser.parseString(jsonObject.get("userPostfix"));
		webexAccountDescription = GsonParser.parseString(jsonObject.get("webexAccountDescription"));
		groupParticipationType = WebexAPIGroupParticipationType.get(GsonParser.parseInt(jsonObject.get("groupParticipationType")));
		optOutGroupNames = GsonParser.parseString(jsonObject.get("optOutGroupNames"));
		optInGroupNames = GsonParser.parseString(jsonObject.get("optInGroupNames"));
		siteUrl = GsonParser.parseString(jsonObject.get("siteUrl"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaWebexAPIIntegrationSetting");
		kparams.add("webexCategory", this.webexCategory);
		kparams.add("enableRecordingUpload", this.enableRecordingUpload);
		kparams.add("enableTranscription", this.enableTranscription);
		kparams.add("userMatchingMode", this.userMatchingMode);
		kparams.add("userPostfix", this.userPostfix);
		kparams.add("webexAccountDescription", this.webexAccountDescription);
		kparams.add("groupParticipationType", this.groupParticipationType);
		kparams.add("optOutGroupNames", this.optOutGroupNames);
		kparams.add("optInGroupNames", this.optInGroupNames);
		kparams.add("siteUrl", this.siteUrl);
		return kparams;
	}

}

