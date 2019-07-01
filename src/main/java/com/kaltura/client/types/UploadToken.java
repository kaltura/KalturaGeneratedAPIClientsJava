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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.enums.UploadTokenStatus;
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
@MultiRequestBuilder.Tokenizer(UploadToken.Tokenizer.class)
public class UploadToken extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String userId();
		String status();
		String fileName();
		String fileSize();
		String uploadedFileSize();
		String createdAt();
		String updatedAt();
		String uploadUrl();
		String autoFinalize();
		String minimumChunkSize();
	}

	/**
	 * Upload token unique ID
	 */
	private String id;
	/**
	 * Partner ID of the upload token
	 */
	private Integer partnerId;
	/**
	 * User id for the upload token
	 */
	private String userId;
	/**
	 * Status of the upload token
	 */
	private UploadTokenStatus status;
	/**
	 * Name of the file for the upload token, can be empty when the upload token is
	  created and will be updated internally after the file is uploaded
	 */
	private String fileName;
	/**
	 * File size in bytes, can be empty when the upload token is created and will be
	  updated internally after the file is uploaded
	 */
	private Double fileSize;
	/**
	 * Uploaded file size in bytes, can be used to identify how many bytes were
	  uploaded before resuming
	 */
	private Double uploadedFileSize;
	/**
	 * Creation date as Unix timestamp (In seconds)
	 */
	private Integer createdAt;
	/**
	 * Last update date as Unix timestamp (In seconds)
	 */
	private Integer updatedAt;
	/**
	 * Upload url - to explicitly determine to which domain to adress the
	  uploadToken-&gt;upload call
	 */
	private String uploadUrl;
	/**
	 * autoFinalize - Should the upload be finalized once the file size on disk matches
	  the file size reproted when adding the upload token.
	 */
	private Boolean autoFinalize;
	/**
	 * set the minimum size in bytes for each uploaded part of the file
	 */
	private Double minimumChunkSize;

	// id:
	public String getId(){
		return this.id;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// userId:
	public String getUserId(){
		return this.userId;
	}
	// status:
	public UploadTokenStatus getStatus(){
		return this.status;
	}
	// fileName:
	public String getFileName(){
		return this.fileName;
	}
	public void setFileName(String fileName){
		this.fileName = fileName;
	}

	public void fileName(String multirequestToken){
		setToken("fileName", multirequestToken);
	}

	// fileSize:
	public Double getFileSize(){
		return this.fileSize;
	}
	public void setFileSize(Double fileSize){
		this.fileSize = fileSize;
	}

	public void fileSize(String multirequestToken){
		setToken("fileSize", multirequestToken);
	}

	// uploadedFileSize:
	public Double getUploadedFileSize(){
		return this.uploadedFileSize;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// uploadUrl:
	public String getUploadUrl(){
		return this.uploadUrl;
	}
	// autoFinalize:
	public Boolean getAutoFinalize(){
		return this.autoFinalize;
	}
	public void setAutoFinalize(Boolean autoFinalize){
		this.autoFinalize = autoFinalize;
	}

	public void autoFinalize(String multirequestToken){
		setToken("autoFinalize", multirequestToken);
	}

	// minimumChunkSize:
	public Double getMinimumChunkSize(){
		return this.minimumChunkSize;
	}
	public void setMinimumChunkSize(Double minimumChunkSize){
		this.minimumChunkSize = minimumChunkSize;
	}

	public void minimumChunkSize(String multirequestToken){
		setToken("minimumChunkSize", multirequestToken);
	}


	public UploadToken() {
		super();
	}

	public UploadToken(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		status = UploadTokenStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		fileName = GsonParser.parseString(jsonObject.get("fileName"));
		fileSize = GsonParser.parseDouble(jsonObject.get("fileSize"));
		uploadedFileSize = GsonParser.parseDouble(jsonObject.get("uploadedFileSize"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		uploadUrl = GsonParser.parseString(jsonObject.get("uploadUrl"));
		autoFinalize = GsonParser.parseBoolean(jsonObject.get("autoFinalize"));
		minimumChunkSize = GsonParser.parseDouble(jsonObject.get("minimumChunkSize"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUploadToken");
		kparams.add("fileName", this.fileName);
		kparams.add("fileSize", this.fileSize);
		kparams.add("autoFinalize", this.autoFinalize);
		kparams.add("minimumChunkSize", this.minimumChunkSize);
		return kparams;
	}

}

