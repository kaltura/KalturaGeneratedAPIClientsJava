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
@MultiRequestBuilder.Tokenizer(MicrosoftTeamsDropFolderFile.Tokenizer.class)
public class MicrosoftTeamsDropFolderFile extends DropFolderFile {
	
	public interface Tokenizer extends DropFolderFile.Tokenizer {
		String remoteId();
		String ownerId();
		String additionalUserIds();
		String description();
		String targetCategoryIds();
		String name();
		String contentUrl();
	}

	private String remoteId;
	private String ownerId;
	private String additionalUserIds;
	private String description;
	private String targetCategoryIds;
	private String name;
	private String contentUrl;

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

	// ownerId:
	public String getOwnerId(){
		return this.ownerId;
	}
	public void setOwnerId(String ownerId){
		this.ownerId = ownerId;
	}

	public void ownerId(String multirequestToken){
		setToken("ownerId", multirequestToken);
	}

	// additionalUserIds:
	public String getAdditionalUserIds(){
		return this.additionalUserIds;
	}
	public void setAdditionalUserIds(String additionalUserIds){
		this.additionalUserIds = additionalUserIds;
	}

	public void additionalUserIds(String multirequestToken){
		setToken("additionalUserIds", multirequestToken);
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

	// targetCategoryIds:
	public String getTargetCategoryIds(){
		return this.targetCategoryIds;
	}
	public void setTargetCategoryIds(String targetCategoryIds){
		this.targetCategoryIds = targetCategoryIds;
	}

	public void targetCategoryIds(String multirequestToken){
		setToken("targetCategoryIds", multirequestToken);
	}

	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
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


	public MicrosoftTeamsDropFolderFile() {
		super();
	}

	public MicrosoftTeamsDropFolderFile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		remoteId = GsonParser.parseString(jsonObject.get("remoteId"));
		ownerId = GsonParser.parseString(jsonObject.get("ownerId"));
		additionalUserIds = GsonParser.parseString(jsonObject.get("additionalUserIds"));
		description = GsonParser.parseString(jsonObject.get("description"));
		targetCategoryIds = GsonParser.parseString(jsonObject.get("targetCategoryIds"));
		name = GsonParser.parseString(jsonObject.get("name"));
		contentUrl = GsonParser.parseString(jsonObject.get("contentUrl"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMicrosoftTeamsDropFolderFile");
		kparams.add("remoteId", this.remoteId);
		kparams.add("ownerId", this.ownerId);
		kparams.add("additionalUserIds", this.additionalUserIds);
		kparams.add("description", this.description);
		kparams.add("targetCategoryIds", this.targetCategoryIds);
		kparams.add("name", this.name);
		kparams.add("contentUrl", this.contentUrl);
		return kparams;
	}

}

