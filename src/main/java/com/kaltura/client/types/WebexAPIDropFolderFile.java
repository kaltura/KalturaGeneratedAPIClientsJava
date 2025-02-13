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
@MultiRequestBuilder.Tokenizer(WebexAPIDropFolderFile.Tokenizer.class)
public class WebexAPIDropFolderFile extends DropFolderFile {
	
	public interface Tokenizer extends DropFolderFile.Tokenizer {
		String recordingId();
		String description();
		String contentUrl();
		String urlExpiry();
		String fileExtension();
		String meetingId();
		String recordingStartTime();
		String hostEmail();
	}

	private String recordingId;
	private String description;
	private String contentUrl;
	private Integer urlExpiry;
	private String fileExtension;
	private String meetingId;
	private Integer recordingStartTime;
	private String hostEmail;

	// recordingId:
	public String getRecordingId(){
		return this.recordingId;
	}
	public void setRecordingId(String recordingId){
		this.recordingId = recordingId;
	}

	public void recordingId(String multirequestToken){
		setToken("recordingId", multirequestToken);
	}

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// contentUrl:
	public String getContentUrl(){
		return this.contentUrl;
	}
	public void setContentUrl(String contentUrl){
		this.contentUrl = contentUrl;
	}

	public void contentUrl(String multirequestToken){
		setToken("contentUrl", multirequestToken);
	}

	// urlExpiry:
	public Integer getUrlExpiry(){
		return this.urlExpiry;
	}
	public void setUrlExpiry(Integer urlExpiry){
		this.urlExpiry = urlExpiry;
	}

	public void urlExpiry(String multirequestToken){
		setToken("urlExpiry", multirequestToken);
	}

	// fileExtension:
	public String getFileExtension(){
		return this.fileExtension;
	}
	public void setFileExtension(String fileExtension){
		this.fileExtension = fileExtension;
	}

	public void fileExtension(String multirequestToken){
		setToken("fileExtension", multirequestToken);
	}

	// meetingId:
	public String getMeetingId(){
		return this.meetingId;
	}
	public void setMeetingId(String meetingId){
		this.meetingId = meetingId;
	}

	public void meetingId(String multirequestToken){
		setToken("meetingId", multirequestToken);
	}

	// recordingStartTime:
	public Integer getRecordingStartTime(){
		return this.recordingStartTime;
	}
	public void setRecordingStartTime(Integer recordingStartTime){
		this.recordingStartTime = recordingStartTime;
	}

	public void recordingStartTime(String multirequestToken){
		setToken("recordingStartTime", multirequestToken);
	}

	// hostEmail:
	public String getHostEmail(){
		return this.hostEmail;
	}
	public void setHostEmail(String hostEmail){
		this.hostEmail = hostEmail;
	}

	public void hostEmail(String multirequestToken){
		setToken("hostEmail", multirequestToken);
	}


	public WebexAPIDropFolderFile() {
		super();
	}

	public WebexAPIDropFolderFile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		recordingId = GsonParser.parseString(jsonObject.get("recordingId"));
		description = GsonParser.parseString(jsonObject.get("description"));
		contentUrl = GsonParser.parseString(jsonObject.get("contentUrl"));
		urlExpiry = GsonParser.parseInt(jsonObject.get("urlExpiry"));
		fileExtension = GsonParser.parseString(jsonObject.get("fileExtension"));
		meetingId = GsonParser.parseString(jsonObject.get("meetingId"));
		recordingStartTime = GsonParser.parseInt(jsonObject.get("recordingStartTime"));
		hostEmail = GsonParser.parseString(jsonObject.get("hostEmail"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaWebexAPIDropFolderFile");
		kparams.add("recordingId", this.recordingId);
		kparams.add("description", this.description);
		kparams.add("contentUrl", this.contentUrl);
		kparams.add("urlExpiry", this.urlExpiry);
		kparams.add("fileExtension", this.fileExtension);
		kparams.add("meetingId", this.meetingId);
		kparams.add("recordingStartTime", this.recordingStartTime);
		kparams.add("hostEmail", this.hostEmail);
		return kparams;
	}

}

