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
// Copyright (C) 2006-2021  Kaltura Inc.
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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FileSyncDescriptor.Tokenizer.class)
public class FileSyncDescriptor extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String fileSyncLocalPath();
		String fileEncryptionKey();
		String fileSyncRemoteUrl();
		String fileSyncObjectSubType();
	}

	private String fileSyncLocalPath;
	private String fileEncryptionKey;
	/**
	 * The translated path as used by the scheduler
	 */
	private String fileSyncRemoteUrl;
	private Integer fileSyncObjectSubType;

	// fileSyncLocalPath:
	public String getFileSyncLocalPath(){
		return this.fileSyncLocalPath;
	}
	public void setFileSyncLocalPath(String fileSyncLocalPath){
		this.fileSyncLocalPath = fileSyncLocalPath;
	}

	public void fileSyncLocalPath(String multirequestToken){
		setToken("fileSyncLocalPath", multirequestToken);
	}

	// fileEncryptionKey:
	public String getFileEncryptionKey(){
		return this.fileEncryptionKey;
	}
	public void setFileEncryptionKey(String fileEncryptionKey){
		this.fileEncryptionKey = fileEncryptionKey;
	}

	public void fileEncryptionKey(String multirequestToken){
		setToken("fileEncryptionKey", multirequestToken);
	}

	// fileSyncRemoteUrl:
	public String getFileSyncRemoteUrl(){
		return this.fileSyncRemoteUrl;
	}
	public void setFileSyncRemoteUrl(String fileSyncRemoteUrl){
		this.fileSyncRemoteUrl = fileSyncRemoteUrl;
	}

	public void fileSyncRemoteUrl(String multirequestToken){
		setToken("fileSyncRemoteUrl", multirequestToken);
	}

	// fileSyncObjectSubType:
	public Integer getFileSyncObjectSubType(){
		return this.fileSyncObjectSubType;
	}
	public void setFileSyncObjectSubType(Integer fileSyncObjectSubType){
		this.fileSyncObjectSubType = fileSyncObjectSubType;
	}

	public void fileSyncObjectSubType(String multirequestToken){
		setToken("fileSyncObjectSubType", multirequestToken);
	}


	public FileSyncDescriptor() {
		super();
	}

	public FileSyncDescriptor(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fileSyncLocalPath = GsonParser.parseString(jsonObject.get("fileSyncLocalPath"));
		fileEncryptionKey = GsonParser.parseString(jsonObject.get("fileEncryptionKey"));
		fileSyncRemoteUrl = GsonParser.parseString(jsonObject.get("fileSyncRemoteUrl"));
		fileSyncObjectSubType = GsonParser.parseInt(jsonObject.get("fileSyncObjectSubType"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFileSyncDescriptor");
		kparams.add("fileSyncLocalPath", this.fileSyncLocalPath);
		kparams.add("fileEncryptionKey", this.fileEncryptionKey);
		kparams.add("fileSyncRemoteUrl", this.fileSyncRemoteUrl);
		kparams.add("fileSyncObjectSubType", this.fileSyncObjectSubType);
		return kparams;
	}

}

