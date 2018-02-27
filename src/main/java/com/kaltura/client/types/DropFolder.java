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
import com.kaltura.client.enums.DropFolderErrorCode;
import com.kaltura.client.enums.DropFolderFileDeletePolicy;
import com.kaltura.client.enums.DropFolderFileHandlerType;
import com.kaltura.client.enums.DropFolderStatus;
import com.kaltura.client.enums.DropFolderType;
import com.kaltura.client.types.DropFolderFileHandlerConfig;
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
@MultiRequestBuilder.Tokenizer(DropFolder.Tokenizer.class)
public class DropFolder extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String name();
		String description();
		String type();
		String status();
		String conversionProfileId();
		String dc();
		String path();
		String fileSizeCheckInterval();
		String fileDeletePolicy();
		String autoFileDeleteDays();
		String fileHandlerType();
		String fileNamePatterns();
		DropFolderFileHandlerConfig.Tokenizer fileHandlerConfig();
		String tags();
		String errorCode();
		String errorDescription();
		String ignoreFileNamePatterns();
		String createdAt();
		String updatedAt();
		String lastAccessedAt();
		String incremental();
		String lastFileTimestamp();
		String metadataProfileId();
		String categoriesMetadataFieldName();
		String enforceEntitlement();
		String shouldValidateKS();
	}

	private Integer id;
	private Integer partnerId;
	private String name;
	private String description;
	private DropFolderType type;
	private DropFolderStatus status;
	private Integer conversionProfileId;
	private Integer dc;
	private String path;
	/**
	 * The ammount of time, in seconds, that should pass so that a file with no change
	  in size we'll be treated as "finished uploading to folder"
	 */
	private Integer fileSizeCheckInterval;
	private DropFolderFileDeletePolicy fileDeletePolicy;
	private Integer autoFileDeleteDays;
	private DropFolderFileHandlerType fileHandlerType;
	private String fileNamePatterns;
	private DropFolderFileHandlerConfig fileHandlerConfig;
	private String tags;
	private DropFolderErrorCode errorCode;
	private String errorDescription;
	private String ignoreFileNamePatterns;
	private Integer createdAt;
	private Integer updatedAt;
	private Integer lastAccessedAt;
	private Boolean incremental;
	private Integer lastFileTimestamp;
	private Integer metadataProfileId;
	private String categoriesMetadataFieldName;
	private Boolean enforceEntitlement;
	private Boolean shouldValidateKS;

	// id:
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
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

	// type:
	public DropFolderType getType(){
		return this.type;
	}
	public void setType(DropFolderType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// status:
	public DropFolderStatus getStatus(){
		return this.status;
	}
	public void setStatus(DropFolderStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// conversionProfileId:
	public Integer getConversionProfileId(){
		return this.conversionProfileId;
	}
	public void setConversionProfileId(Integer conversionProfileId){
		this.conversionProfileId = conversionProfileId;
	}

	public void conversionProfileId(String multirequestToken){
		setToken("conversionProfileId", multirequestToken);
	}

	// dc:
	public Integer getDc(){
		return this.dc;
	}
	public void setDc(Integer dc){
		this.dc = dc;
	}

	public void dc(String multirequestToken){
		setToken("dc", multirequestToken);
	}

	// path:
	public String getPath(){
		return this.path;
	}
	public void setPath(String path){
		this.path = path;
	}

	public void path(String multirequestToken){
		setToken("path", multirequestToken);
	}

	// fileSizeCheckInterval:
	public Integer getFileSizeCheckInterval(){
		return this.fileSizeCheckInterval;
	}
	public void setFileSizeCheckInterval(Integer fileSizeCheckInterval){
		this.fileSizeCheckInterval = fileSizeCheckInterval;
	}

	public void fileSizeCheckInterval(String multirequestToken){
		setToken("fileSizeCheckInterval", multirequestToken);
	}

	// fileDeletePolicy:
	public DropFolderFileDeletePolicy getFileDeletePolicy(){
		return this.fileDeletePolicy;
	}
	public void setFileDeletePolicy(DropFolderFileDeletePolicy fileDeletePolicy){
		this.fileDeletePolicy = fileDeletePolicy;
	}

	public void fileDeletePolicy(String multirequestToken){
		setToken("fileDeletePolicy", multirequestToken);
	}

	// autoFileDeleteDays:
	public Integer getAutoFileDeleteDays(){
		return this.autoFileDeleteDays;
	}
	public void setAutoFileDeleteDays(Integer autoFileDeleteDays){
		this.autoFileDeleteDays = autoFileDeleteDays;
	}

	public void autoFileDeleteDays(String multirequestToken){
		setToken("autoFileDeleteDays", multirequestToken);
	}

	// fileHandlerType:
	public DropFolderFileHandlerType getFileHandlerType(){
		return this.fileHandlerType;
	}
	public void setFileHandlerType(DropFolderFileHandlerType fileHandlerType){
		this.fileHandlerType = fileHandlerType;
	}

	public void fileHandlerType(String multirequestToken){
		setToken("fileHandlerType", multirequestToken);
	}

	// fileNamePatterns:
	public String getFileNamePatterns(){
		return this.fileNamePatterns;
	}
	public void setFileNamePatterns(String fileNamePatterns){
		this.fileNamePatterns = fileNamePatterns;
	}

	public void fileNamePatterns(String multirequestToken){
		setToken("fileNamePatterns", multirequestToken);
	}

	// fileHandlerConfig:
	public DropFolderFileHandlerConfig getFileHandlerConfig(){
		return this.fileHandlerConfig;
	}
	public void setFileHandlerConfig(DropFolderFileHandlerConfig fileHandlerConfig){
		this.fileHandlerConfig = fileHandlerConfig;
	}

	// tags:
	public String getTags(){
		return this.tags;
	}
	public void setTags(String tags){
		this.tags = tags;
	}

	public void tags(String multirequestToken){
		setToken("tags", multirequestToken);
	}

	// errorCode:
	public DropFolderErrorCode getErrorCode(){
		return this.errorCode;
	}
	public void setErrorCode(DropFolderErrorCode errorCode){
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

	// ignoreFileNamePatterns:
	public String getIgnoreFileNamePatterns(){
		return this.ignoreFileNamePatterns;
	}
	public void setIgnoreFileNamePatterns(String ignoreFileNamePatterns){
		this.ignoreFileNamePatterns = ignoreFileNamePatterns;
	}

	public void ignoreFileNamePatterns(String multirequestToken){
		setToken("ignoreFileNamePatterns", multirequestToken);
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

	// lastAccessedAt:
	public Integer getLastAccessedAt(){
		return this.lastAccessedAt;
	}
	public void setLastAccessedAt(Integer lastAccessedAt){
		this.lastAccessedAt = lastAccessedAt;
	}

	public void lastAccessedAt(String multirequestToken){
		setToken("lastAccessedAt", multirequestToken);
	}

	// incremental:
	public Boolean getIncremental(){
		return this.incremental;
	}
	public void setIncremental(Boolean incremental){
		this.incremental = incremental;
	}

	public void incremental(String multirequestToken){
		setToken("incremental", multirequestToken);
	}

	// lastFileTimestamp:
	public Integer getLastFileTimestamp(){
		return this.lastFileTimestamp;
	}
	public void setLastFileTimestamp(Integer lastFileTimestamp){
		this.lastFileTimestamp = lastFileTimestamp;
	}

	public void lastFileTimestamp(String multirequestToken){
		setToken("lastFileTimestamp", multirequestToken);
	}

	// metadataProfileId:
	public Integer getMetadataProfileId(){
		return this.metadataProfileId;
	}
	public void setMetadataProfileId(Integer metadataProfileId){
		this.metadataProfileId = metadataProfileId;
	}

	public void metadataProfileId(String multirequestToken){
		setToken("metadataProfileId", multirequestToken);
	}

	// categoriesMetadataFieldName:
	public String getCategoriesMetadataFieldName(){
		return this.categoriesMetadataFieldName;
	}
	public void setCategoriesMetadataFieldName(String categoriesMetadataFieldName){
		this.categoriesMetadataFieldName = categoriesMetadataFieldName;
	}

	public void categoriesMetadataFieldName(String multirequestToken){
		setToken("categoriesMetadataFieldName", multirequestToken);
	}

	// enforceEntitlement:
	public Boolean getEnforceEntitlement(){
		return this.enforceEntitlement;
	}
	public void setEnforceEntitlement(Boolean enforceEntitlement){
		this.enforceEntitlement = enforceEntitlement;
	}

	public void enforceEntitlement(String multirequestToken){
		setToken("enforceEntitlement", multirequestToken);
	}

	// shouldValidateKS:
	public Boolean getShouldValidateKS(){
		return this.shouldValidateKS;
	}
	public void setShouldValidateKS(Boolean shouldValidateKS){
		this.shouldValidateKS = shouldValidateKS;
	}

	public void shouldValidateKS(String multirequestToken){
		setToken("shouldValidateKS", multirequestToken);
	}


	public DropFolder() {
		super();
	}

	public DropFolder(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		description = GsonParser.parseString(jsonObject.get("description"));
		type = DropFolderType.get(GsonParser.parseString(jsonObject.get("type")));
		status = DropFolderStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		conversionProfileId = GsonParser.parseInt(jsonObject.get("conversionProfileId"));
		dc = GsonParser.parseInt(jsonObject.get("dc"));
		path = GsonParser.parseString(jsonObject.get("path"));
		fileSizeCheckInterval = GsonParser.parseInt(jsonObject.get("fileSizeCheckInterval"));
		fileDeletePolicy = DropFolderFileDeletePolicy.get(GsonParser.parseInt(jsonObject.get("fileDeletePolicy")));
		autoFileDeleteDays = GsonParser.parseInt(jsonObject.get("autoFileDeleteDays"));
		fileHandlerType = DropFolderFileHandlerType.get(GsonParser.parseString(jsonObject.get("fileHandlerType")));
		fileNamePatterns = GsonParser.parseString(jsonObject.get("fileNamePatterns"));
		fileHandlerConfig = GsonParser.parseObject(jsonObject.getAsJsonObject("fileHandlerConfig"), DropFolderFileHandlerConfig.class);
		tags = GsonParser.parseString(jsonObject.get("tags"));
		errorCode = DropFolderErrorCode.get(GsonParser.parseString(jsonObject.get("errorCode")));
		errorDescription = GsonParser.parseString(jsonObject.get("errorDescription"));
		ignoreFileNamePatterns = GsonParser.parseString(jsonObject.get("ignoreFileNamePatterns"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		lastAccessedAt = GsonParser.parseInt(jsonObject.get("lastAccessedAt"));
		incremental = GsonParser.parseBoolean(jsonObject.get("incremental"));
		lastFileTimestamp = GsonParser.parseInt(jsonObject.get("lastFileTimestamp"));
		metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));
		categoriesMetadataFieldName = GsonParser.parseString(jsonObject.get("categoriesMetadataFieldName"));
		enforceEntitlement = GsonParser.parseBoolean(jsonObject.get("enforceEntitlement"));
		shouldValidateKS = GsonParser.parseBoolean(jsonObject.get("shouldValidateKS"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDropFolder");
		kparams.add("partnerId", this.partnerId);
		kparams.add("name", this.name);
		kparams.add("description", this.description);
		kparams.add("type", this.type);
		kparams.add("status", this.status);
		kparams.add("conversionProfileId", this.conversionProfileId);
		kparams.add("dc", this.dc);
		kparams.add("path", this.path);
		kparams.add("fileSizeCheckInterval", this.fileSizeCheckInterval);
		kparams.add("fileDeletePolicy", this.fileDeletePolicy);
		kparams.add("autoFileDeleteDays", this.autoFileDeleteDays);
		kparams.add("fileHandlerType", this.fileHandlerType);
		kparams.add("fileNamePatterns", this.fileNamePatterns);
		kparams.add("fileHandlerConfig", this.fileHandlerConfig);
		kparams.add("tags", this.tags);
		kparams.add("errorCode", this.errorCode);
		kparams.add("errorDescription", this.errorDescription);
		kparams.add("ignoreFileNamePatterns", this.ignoreFileNamePatterns);
		kparams.add("lastAccessedAt", this.lastAccessedAt);
		kparams.add("incremental", this.incremental);
		kparams.add("lastFileTimestamp", this.lastFileTimestamp);
		kparams.add("metadataProfileId", this.metadataProfileId);
		kparams.add("categoriesMetadataFieldName", this.categoriesMetadataFieldName);
		kparams.add("enforceEntitlement", this.enforceEntitlement);
		kparams.add("shouldValidateKS", this.shouldValidateKS);
		return kparams;
	}

}

