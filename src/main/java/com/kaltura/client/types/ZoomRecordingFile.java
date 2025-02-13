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
import com.kaltura.client.enums.RecordingFileType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ZoomRecordingFile.Tokenizer.class)
public class ZoomRecordingFile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String recordingStart();
		String fileType();
		String downloadUrl();
		String fileExtension();
		String downloadToken();
	}

	private String id;
	private String recordingStart;
	private RecordingFileType fileType;
	private String downloadUrl;
	private String fileExtension;
	private String downloadToken;

	// id:
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// recordingStart:
	public String getRecordingStart(){
		return this.recordingStart;
	}
	public void setRecordingStart(String recordingStart){
		this.recordingStart = recordingStart;
	}

	public void recordingStart(String multirequestToken){
		setToken("recordingStart", multirequestToken);
	}

	// fileType:
	public RecordingFileType getFileType(){
		return this.fileType;
	}
	public void setFileType(RecordingFileType fileType){
		this.fileType = fileType;
	}

	public void fileType(String multirequestToken){
		setToken("fileType", multirequestToken);
	}

	// downloadUrl:
	public String getDownloadUrl(){
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl){
		this.downloadUrl = downloadUrl;
	}

	public void downloadUrl(String multirequestToken){
		setToken("downloadUrl", multirequestToken);
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

	// downloadToken:
	public String getDownloadToken(){
		return this.downloadToken;
	}
	public void setDownloadToken(String downloadToken){
		this.downloadToken = downloadToken;
	}

	public void downloadToken(String multirequestToken){
		setToken("downloadToken", multirequestToken);
	}


	public ZoomRecordingFile() {
		super();
	}

	public ZoomRecordingFile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		recordingStart = GsonParser.parseString(jsonObject.get("recordingStart"));
		fileType = RecordingFileType.get(GsonParser.parseInt(jsonObject.get("fileType")));
		downloadUrl = GsonParser.parseString(jsonObject.get("downloadUrl"));
		fileExtension = GsonParser.parseString(jsonObject.get("fileExtension"));
		downloadToken = GsonParser.parseString(jsonObject.get("downloadToken"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaZoomRecordingFile");
		kparams.add("id", this.id);
		kparams.add("recordingStart", this.recordingStart);
		kparams.add("fileType", this.fileType);
		kparams.add("downloadUrl", this.downloadUrl);
		kparams.add("fileExtension", this.fileExtension);
		kparams.add("downloadToken", this.downloadToken);
		return kparams;
	}

}

