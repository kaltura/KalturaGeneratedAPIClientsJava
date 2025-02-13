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
import com.kaltura.client.types.ZoomMeetingMetadata;
import com.kaltura.client.types.ZoomRecordingFile;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ZoomDropFolderFile.Tokenizer.class)
public class ZoomDropFolderFile extends DropFolderFile {
	
	public interface Tokenizer extends DropFolderFile.Tokenizer {
		ZoomMeetingMetadata.Tokenizer meetingMetadata();
		ZoomRecordingFile.Tokenizer recordingFile();
		String parentEntryId();
		String isParentEntry();
	}

	private ZoomMeetingMetadata meetingMetadata;
	private ZoomRecordingFile recordingFile;
	private String parentEntryId;
	private Boolean isParentEntry;

	// meetingMetadata:
	public ZoomMeetingMetadata getMeetingMetadata(){
		return this.meetingMetadata;
	}
	public void setMeetingMetadata(ZoomMeetingMetadata meetingMetadata){
		this.meetingMetadata = meetingMetadata;
	}

	// recordingFile:
	public ZoomRecordingFile getRecordingFile(){
		return this.recordingFile;
	}
	public void setRecordingFile(ZoomRecordingFile recordingFile){
		this.recordingFile = recordingFile;
	}

	// parentEntryId:
	public String getParentEntryId(){
		return this.parentEntryId;
	}
	public void setParentEntryId(String parentEntryId){
		this.parentEntryId = parentEntryId;
	}

	public void parentEntryId(String multirequestToken){
		setToken("parentEntryId", multirequestToken);
	}

	// isParentEntry:
	public Boolean getIsParentEntry(){
		return this.isParentEntry;
	}
	public void setIsParentEntry(Boolean isParentEntry){
		this.isParentEntry = isParentEntry;
	}

	public void isParentEntry(String multirequestToken){
		setToken("isParentEntry", multirequestToken);
	}


	public ZoomDropFolderFile() {
		super();
	}

	public ZoomDropFolderFile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		meetingMetadata = GsonParser.parseObject(jsonObject.getAsJsonObject("meetingMetadata"), ZoomMeetingMetadata.class);
		recordingFile = GsonParser.parseObject(jsonObject.getAsJsonObject("recordingFile"), ZoomRecordingFile.class);
		parentEntryId = GsonParser.parseString(jsonObject.get("parentEntryId"));
		isParentEntry = GsonParser.parseBoolean(jsonObject.get("isParentEntry"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaZoomDropFolderFile");
		kparams.add("meetingMetadata", this.meetingMetadata);
		kparams.add("recordingFile", this.recordingFile);
		kparams.add("parentEntryId", this.parentEntryId);
		kparams.add("isParentEntry", this.isParentEntry);
		return kparams;
	}

}

