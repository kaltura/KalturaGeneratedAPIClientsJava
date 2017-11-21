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
@MultiRequestBuilder.Tokenizer(FileContainer.Tokenizer.class)
public class FileContainer extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String filePath();
		String encryptionKey();
		String fileSize();
	}

	private String filePath;
	private String encryptionKey;
	private Integer fileSize;

	// filePath:
	public String getFilePath(){
		return this.filePath;
	}
	public void setFilePath(String filePath){
		this.filePath = filePath;
	}

	public void filePath(String multirequestToken){
		setToken("filePath", multirequestToken);
	}

	// encryptionKey:
	public String getEncryptionKey(){
		return this.encryptionKey;
	}
	public void setEncryptionKey(String encryptionKey){
		this.encryptionKey = encryptionKey;
	}

	public void encryptionKey(String multirequestToken){
		setToken("encryptionKey", multirequestToken);
	}

	// fileSize:
	public Integer getFileSize(){
		return this.fileSize;
	}
	public void setFileSize(Integer fileSize){
		this.fileSize = fileSize;
	}

	public void fileSize(String multirequestToken){
		setToken("fileSize", multirequestToken);
	}


	public FileContainer() {
		super();
	}

	public FileContainer(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		filePath = GsonParser.parseString(jsonObject.get("filePath"));
		encryptionKey = GsonParser.parseString(jsonObject.get("encryptionKey"));
		fileSize = GsonParser.parseInt(jsonObject.get("fileSize"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFileContainer");
		kparams.add("filePath", this.filePath);
		kparams.add("encryptionKey", this.encryptionKey);
		kparams.add("fileSize", this.fileSize);
		return kparams;
	}

}

