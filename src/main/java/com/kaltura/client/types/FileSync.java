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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.enums.FileSyncObjectType;
import com.kaltura.client.enums.FileSyncStatus;
import com.kaltura.client.enums.FileSyncType;
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
@MultiRequestBuilder.Tokenizer(FileSync.Tokenizer.class)
public class FileSync extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String fileObjectType();
		String objectId();
		String version();
		String objectSubType();
		String dc();
		String original();
		String createdAt();
		String updatedAt();
		String readyAt();
		String syncTime();
		String status();
		String fileType();
		String linkedId();
		String linkCount();
		String fileRoot();
		String filePath();
		String fileSize();
		String fileUrl();
		String fileContent();
		String fileDiscSize();
		String isCurrentDc();
		String isDir();
		String originalId();
	}

	private Long id;
	private Integer partnerId;
	private FileSyncObjectType fileObjectType;
	private String objectId;
	private String version;
	private Integer objectSubType;
	private String dc;
	private Integer original;
	private Integer createdAt;
	private Integer updatedAt;
	private Integer readyAt;
	private Integer syncTime;
	private FileSyncStatus status;
	private FileSyncType fileType;
	private Integer linkedId;
	private Integer linkCount;
	private String fileRoot;
	private String filePath;
	private Double fileSize;
	private String fileUrl;
	private String fileContent;
	private Double fileDiscSize;
	private Boolean isCurrentDc;
	private Boolean isDir;
	private Integer originalId;

	// id:
	public Long getId(){
		return this.id;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// fileObjectType:
	public FileSyncObjectType getFileObjectType(){
		return this.fileObjectType;
	}
	// objectId:
	public String getObjectId(){
		return this.objectId;
	}
	// version:
	public String getVersion(){
		return this.version;
	}
	// objectSubType:
	public Integer getObjectSubType(){
		return this.objectSubType;
	}
	// dc:
	public String getDc(){
		return this.dc;
	}
	// original:
	public Integer getOriginal(){
		return this.original;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// readyAt:
	public Integer getReadyAt(){
		return this.readyAt;
	}
	// syncTime:
	public Integer getSyncTime(){
		return this.syncTime;
	}
	// status:
	public FileSyncStatus getStatus(){
		return this.status;
	}
	public void setStatus(FileSyncStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// fileType:
	public FileSyncType getFileType(){
		return this.fileType;
	}
	// linkedId:
	public Integer getLinkedId(){
		return this.linkedId;
	}
	// linkCount:
	public Integer getLinkCount(){
		return this.linkCount;
	}
	// fileRoot:
	public String getFileRoot(){
		return this.fileRoot;
	}
	public void setFileRoot(String fileRoot){
		this.fileRoot = fileRoot;
	}

	public void fileRoot(String multirequestToken){
		setToken("fileRoot", multirequestToken);
	}

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

	// fileSize:
	public Double getFileSize(){
		return this.fileSize;
	}
	// fileUrl:
	public String getFileUrl(){
		return this.fileUrl;
	}
	// fileContent:
	public String getFileContent(){
		return this.fileContent;
	}
	// fileDiscSize:
	public Double getFileDiscSize(){
		return this.fileDiscSize;
	}
	// isCurrentDc:
	public Boolean getIsCurrentDc(){
		return this.isCurrentDc;
	}
	// isDir:
	public Boolean getIsDir(){
		return this.isDir;
	}
	// originalId:
	public Integer getOriginalId(){
		return this.originalId;
	}

	public FileSync() {
		super();
	}

	public FileSync(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		fileObjectType = FileSyncObjectType.get(GsonParser.parseString(jsonObject.get("fileObjectType")));
		objectId = GsonParser.parseString(jsonObject.get("objectId"));
		version = GsonParser.parseString(jsonObject.get("version"));
		objectSubType = GsonParser.parseInt(jsonObject.get("objectSubType"));
		dc = GsonParser.parseString(jsonObject.get("dc"));
		original = GsonParser.parseInt(jsonObject.get("original"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		readyAt = GsonParser.parseInt(jsonObject.get("readyAt"));
		syncTime = GsonParser.parseInt(jsonObject.get("syncTime"));
		status = FileSyncStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		fileType = FileSyncType.get(GsonParser.parseInt(jsonObject.get("fileType")));
		linkedId = GsonParser.parseInt(jsonObject.get("linkedId"));
		linkCount = GsonParser.parseInt(jsonObject.get("linkCount"));
		fileRoot = GsonParser.parseString(jsonObject.get("fileRoot"));
		filePath = GsonParser.parseString(jsonObject.get("filePath"));
		fileSize = GsonParser.parseDouble(jsonObject.get("fileSize"));
		fileUrl = GsonParser.parseString(jsonObject.get("fileUrl"));
		fileContent = GsonParser.parseString(jsonObject.get("fileContent"));
		fileDiscSize = GsonParser.parseDouble(jsonObject.get("fileDiscSize"));
		isCurrentDc = GsonParser.parseBoolean(jsonObject.get("isCurrentDc"));
		isDir = GsonParser.parseBoolean(jsonObject.get("isDir"));
		originalId = GsonParser.parseInt(jsonObject.get("originalId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFileSync");
		kparams.add("status", this.status);
		kparams.add("fileRoot", this.fileRoot);
		kparams.add("filePath", this.filePath);
		return kparams;
	}

}

