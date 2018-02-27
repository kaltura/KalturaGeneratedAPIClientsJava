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
// Copyright (C) 2006-2018  Kaltura Inc.
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
	public void setId(Long id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	public void setPartnerId(Integer partnerId){
		this.partnerId = partnerId;
	}

	public void partnerId(String multirequestToken){
		setToken("partnerId", multirequestToken);
	}

	// fileObjectType:
	public FileSyncObjectType getFileObjectType(){
		return this.fileObjectType;
	}
	public void setFileObjectType(FileSyncObjectType fileObjectType){
		this.fileObjectType = fileObjectType;
	}

	public void fileObjectType(String multirequestToken){
		setToken("fileObjectType", multirequestToken);
	}

	// objectId:
	public String getObjectId(){
		return this.objectId;
	}
	public void setObjectId(String objectId){
		this.objectId = objectId;
	}

	public void objectId(String multirequestToken){
		setToken("objectId", multirequestToken);
	}

	// version:
	public String getVersion(){
		return this.version;
	}
	public void setVersion(String version){
		this.version = version;
	}

	public void version(String multirequestToken){
		setToken("version", multirequestToken);
	}

	// objectSubType:
	public Integer getObjectSubType(){
		return this.objectSubType;
	}
	public void setObjectSubType(Integer objectSubType){
		this.objectSubType = objectSubType;
	}

	public void objectSubType(String multirequestToken){
		setToken("objectSubType", multirequestToken);
	}

	// dc:
	public String getDc(){
		return this.dc;
	}
	public void setDc(String dc){
		this.dc = dc;
	}

	public void dc(String multirequestToken){
		setToken("dc", multirequestToken);
	}

	// original:
	public Integer getOriginal(){
		return this.original;
	}
	public void setOriginal(Integer original){
		this.original = original;
	}

	public void original(String multirequestToken){
		setToken("original", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	public void setCreatedAt(Integer createdAt){
		this.createdAt = createdAt;
	}

	public void createdAt(String multirequestToken){
		setToken("createdAt", multirequestToken);
	}

	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	public void setUpdatedAt(Integer updatedAt){
		this.updatedAt = updatedAt;
	}

	public void updatedAt(String multirequestToken){
		setToken("updatedAt", multirequestToken);
	}

	// readyAt:
	public Integer getReadyAt(){
		return this.readyAt;
	}
	public void setReadyAt(Integer readyAt){
		this.readyAt = readyAt;
	}

	public void readyAt(String multirequestToken){
		setToken("readyAt", multirequestToken);
	}

	// syncTime:
	public Integer getSyncTime(){
		return this.syncTime;
	}
	public void setSyncTime(Integer syncTime){
		this.syncTime = syncTime;
	}

	public void syncTime(String multirequestToken){
		setToken("syncTime", multirequestToken);
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
	public void setFileType(FileSyncType fileType){
		this.fileType = fileType;
	}

	public void fileType(String multirequestToken){
		setToken("fileType", multirequestToken);
	}

	// linkedId:
	public Integer getLinkedId(){
		return this.linkedId;
	}
	public void setLinkedId(Integer linkedId){
		this.linkedId = linkedId;
	}

	public void linkedId(String multirequestToken){
		setToken("linkedId", multirequestToken);
	}

	// linkCount:
	public Integer getLinkCount(){
		return this.linkCount;
	}
	public void setLinkCount(Integer linkCount){
		this.linkCount = linkCount;
	}

	public void linkCount(String multirequestToken){
		setToken("linkCount", multirequestToken);
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
	public void setFileSize(Double fileSize){
		this.fileSize = fileSize;
	}

	public void fileSize(String multirequestToken){
		setToken("fileSize", multirequestToken);
	}

	// fileUrl:
	public String getFileUrl(){
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl){
		this.fileUrl = fileUrl;
	}

	public void fileUrl(String multirequestToken){
		setToken("fileUrl", multirequestToken);
	}

	// fileContent:
	public String getFileContent(){
		return this.fileContent;
	}
	public void setFileContent(String fileContent){
		this.fileContent = fileContent;
	}

	public void fileContent(String multirequestToken){
		setToken("fileContent", multirequestToken);
	}

	// fileDiscSize:
	public Double getFileDiscSize(){
		return this.fileDiscSize;
	}
	public void setFileDiscSize(Double fileDiscSize){
		this.fileDiscSize = fileDiscSize;
	}

	public void fileDiscSize(String multirequestToken){
		setToken("fileDiscSize", multirequestToken);
	}

	// isCurrentDc:
	public Boolean getIsCurrentDc(){
		return this.isCurrentDc;
	}
	public void setIsCurrentDc(Boolean isCurrentDc){
		this.isCurrentDc = isCurrentDc;
	}

	public void isCurrentDc(String multirequestToken){
		setToken("isCurrentDc", multirequestToken);
	}

	// isDir:
	public Boolean getIsDir(){
		return this.isDir;
	}
	public void setIsDir(Boolean isDir){
		this.isDir = isDir;
	}

	public void isDir(String multirequestToken){
		setToken("isDir", multirequestToken);
	}

	// originalId:
	public Integer getOriginalId(){
		return this.originalId;
	}
	public void setOriginalId(Integer originalId){
		this.originalId = originalId;
	}

	public void originalId(String multirequestToken){
		setToken("originalId", multirequestToken);
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

