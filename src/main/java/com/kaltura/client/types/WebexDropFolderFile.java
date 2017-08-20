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
// Copyright (C) 2006-2017  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(WebexDropFolderFile.Tokenizer.class)
public class WebexDropFolderFile extends DropFolderFile {
	
	public interface Tokenizer extends DropFolderFile.Tokenizer {
		String recordingId();
		String webexHostId();
		String description();
		String confId();
		String contentUrl();
	}

	private Integer recordingId;
	private String webexHostId;
	private String description;
	private String confId;
	private String contentUrl;

	// recordingId:
	public Integer getRecordingId(){
		return this.recordingId;
	}
	public void setRecordingId(Integer recordingId){
		this.recordingId = recordingId;
	}

	public void recordingId(String multirequestToken){
		setToken("recordingId", multirequestToken);
	}

	// webexHostId:
	public String getWebexHostId(){
		return this.webexHostId;
	}
	public void setWebexHostId(String webexHostId){
		this.webexHostId = webexHostId;
	}

	public void webexHostId(String multirequestToken){
		setToken("webexHostId", multirequestToken);
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

	// confId:
	public String getConfId(){
		return this.confId;
	}
	public void setConfId(String confId){
		this.confId = confId;
	}

	public void confId(String multirequestToken){
		setToken("confId", multirequestToken);
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


	public WebexDropFolderFile() {
		super();
	}

	public WebexDropFolderFile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		recordingId = GsonParser.parseInt(jsonObject.get("recordingId"));
		webexHostId = GsonParser.parseString(jsonObject.get("webexHostId"));
		description = GsonParser.parseString(jsonObject.get("description"));
		confId = GsonParser.parseString(jsonObject.get("confId"));
		contentUrl = GsonParser.parseString(jsonObject.get("contentUrl"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaWebexDropFolderFile");
		kparams.add("recordingId", this.recordingId);
		kparams.add("webexHostId", this.webexHostId);
		kparams.add("description", this.description);
		kparams.add("confId", this.confId);
		kparams.add("contentUrl", this.contentUrl);
		return kparams;
	}

}

