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
import com.kaltura.client.enums.UploadErrorCode;
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
@MultiRequestBuilder.Tokenizer(UploadResponse.Tokenizer.class)
public class UploadResponse extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String uploadTokenId();
		String fileSize();
		String errorCode();
		String errorDescription();
	}

	private String uploadTokenId;
	private Integer fileSize;
	private UploadErrorCode errorCode;
	private String errorDescription;

	// uploadTokenId:
	public String getUploadTokenId(){
		return this.uploadTokenId;
	}
	public void setUploadTokenId(String uploadTokenId){
		this.uploadTokenId = uploadTokenId;
	}

	public void uploadTokenId(String multirequestToken){
		setToken("uploadTokenId", multirequestToken);
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

	// errorCode:
	public UploadErrorCode getErrorCode(){
		return this.errorCode;
	}
	public void setErrorCode(UploadErrorCode errorCode){
		this.errorCode = errorCode;
	}

	public void errorCode(String multirequestToken){
		setToken("errorCode", multirequestToken);
	}

	// errorDescription:
	public String getErrorDescription(){
		return this.errorDescription;
	}
	public void setErrorDescription(String errorDescription){
		this.errorDescription = errorDescription;
	}

	public void errorDescription(String multirequestToken){
		setToken("errorDescription", multirequestToken);
	}


	public UploadResponse() {
		super();
	}

	public UploadResponse(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		uploadTokenId = GsonParser.parseString(jsonObject.get("uploadTokenId"));
		fileSize = GsonParser.parseInt(jsonObject.get("fileSize"));
		errorCode = UploadErrorCode.get(GsonParser.parseInt(jsonObject.get("errorCode")));
		errorDescription = GsonParser.parseString(jsonObject.get("errorDescription"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUploadResponse");
		kparams.add("uploadTokenId", this.uploadTokenId);
		kparams.add("fileSize", this.fileSize);
		kparams.add("errorCode", this.errorCode);
		kparams.add("errorDescription", this.errorDescription);
		return kparams;
	}

}

