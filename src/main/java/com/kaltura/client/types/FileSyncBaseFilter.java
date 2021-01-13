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
import com.kaltura.client.enums.FileSyncObjectType;
import com.kaltura.client.enums.FileSyncStatus;
import com.kaltura.client.enums.FileSyncType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FileSyncBaseFilter.Tokenizer.class)
public abstract class FileSyncBaseFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String partnerIdEqual();
		String fileObjectTypeEqual();
		String fileObjectTypeIn();
		String objectIdEqual();
		String objectIdIn();
		String versionEqual();
		String versionIn();
		String objectSubTypeEqual();
		String objectSubTypeIn();
		String dcEqual();
		String dcIn();
		String originalEqual();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String readyAtGreaterThanOrEqual();
		String readyAtLessThanOrEqual();
		String syncTimeGreaterThanOrEqual();
		String syncTimeLessThanOrEqual();
		String statusEqual();
		String statusIn();
		String fileTypeEqual();
		String fileTypeIn();
		String linkedIdEqual();
		String linkCountGreaterThanOrEqual();
		String linkCountLessThanOrEqual();
		String fileSizeGreaterThanOrEqual();
		String fileSizeLessThanOrEqual();
	}

	private Integer partnerIdEqual;
	private FileSyncObjectType fileObjectTypeEqual;
	private String fileObjectTypeIn;
	private String objectIdEqual;
	private String objectIdIn;
	private String versionEqual;
	private String versionIn;
	private Integer objectSubTypeEqual;
	private String objectSubTypeIn;
	private String dcEqual;
	private String dcIn;
	private Integer originalEqual;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer updatedAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;
	private Integer readyAtGreaterThanOrEqual;
	private Integer readyAtLessThanOrEqual;
	private Integer syncTimeGreaterThanOrEqual;
	private Integer syncTimeLessThanOrEqual;
	private FileSyncStatus statusEqual;
	private String statusIn;
	private FileSyncType fileTypeEqual;
	private String fileTypeIn;
	private Integer linkedIdEqual;
	private Integer linkCountGreaterThanOrEqual;
	private Integer linkCountLessThanOrEqual;
	private Double fileSizeGreaterThanOrEqual;
	private Double fileSizeLessThanOrEqual;

	// partnerIdEqual:
	public Integer getPartnerIdEqual(){
		return this.partnerIdEqual;
	}
	public void setPartnerIdEqual(Integer partnerIdEqual){
		this.partnerIdEqual = partnerIdEqual;
	}

	public void partnerIdEqual(String multirequestToken){
		setToken("partnerIdEqual", multirequestToken);
	}

	// fileObjectTypeEqual:
	public FileSyncObjectType getFileObjectTypeEqual(){
		return this.fileObjectTypeEqual;
	}
	public void setFileObjectTypeEqual(FileSyncObjectType fileObjectTypeEqual){
		this.fileObjectTypeEqual = fileObjectTypeEqual;
	}

	public void fileObjectTypeEqual(String multirequestToken){
		setToken("fileObjectTypeEqual", multirequestToken);
	}

	// fileObjectTypeIn:
	public String getFileObjectTypeIn(){
		return this.fileObjectTypeIn;
	}
	public void setFileObjectTypeIn(String fileObjectTypeIn){
		this.fileObjectTypeIn = fileObjectTypeIn;
	}

	public void fileObjectTypeIn(String multirequestToken){
		setToken("fileObjectTypeIn", multirequestToken);
	}

	// objectIdEqual:
	public String getObjectIdEqual(){
		return this.objectIdEqual;
	}
	public void setObjectIdEqual(String objectIdEqual){
		this.objectIdEqual = objectIdEqual;
	}

	public void objectIdEqual(String multirequestToken){
		setToken("objectIdEqual", multirequestToken);
	}

	// objectIdIn:
	public String getObjectIdIn(){
		return this.objectIdIn;
	}
	public void setObjectIdIn(String objectIdIn){
		this.objectIdIn = objectIdIn;
	}

	public void objectIdIn(String multirequestToken){
		setToken("objectIdIn", multirequestToken);
	}

	// versionEqual:
	public String getVersionEqual(){
		return this.versionEqual;
	}
	public void setVersionEqual(String versionEqual){
		this.versionEqual = versionEqual;
	}

	public void versionEqual(String multirequestToken){
		setToken("versionEqual", multirequestToken);
	}

	// versionIn:
	public String getVersionIn(){
		return this.versionIn;
	}
	public void setVersionIn(String versionIn){
		this.versionIn = versionIn;
	}

	public void versionIn(String multirequestToken){
		setToken("versionIn", multirequestToken);
	}

	// objectSubTypeEqual:
	public Integer getObjectSubTypeEqual(){
		return this.objectSubTypeEqual;
	}
	public void setObjectSubTypeEqual(Integer objectSubTypeEqual){
		this.objectSubTypeEqual = objectSubTypeEqual;
	}

	public void objectSubTypeEqual(String multirequestToken){
		setToken("objectSubTypeEqual", multirequestToken);
	}

	// objectSubTypeIn:
	public String getObjectSubTypeIn(){
		return this.objectSubTypeIn;
	}
	public void setObjectSubTypeIn(String objectSubTypeIn){
		this.objectSubTypeIn = objectSubTypeIn;
	}

	public void objectSubTypeIn(String multirequestToken){
		setToken("objectSubTypeIn", multirequestToken);
	}

	// dcEqual:
	public String getDcEqual(){
		return this.dcEqual;
	}
	public void setDcEqual(String dcEqual){
		this.dcEqual = dcEqual;
	}

	public void dcEqual(String multirequestToken){
		setToken("dcEqual", multirequestToken);
	}

	// dcIn:
	public String getDcIn(){
		return this.dcIn;
	}
	public void setDcIn(String dcIn){
		this.dcIn = dcIn;
	}

	public void dcIn(String multirequestToken){
		setToken("dcIn", multirequestToken);
	}

	// originalEqual:
	public Integer getOriginalEqual(){
		return this.originalEqual;
	}
	public void setOriginalEqual(Integer originalEqual){
		this.originalEqual = originalEqual;
	}

	public void originalEqual(String multirequestToken){
		setToken("originalEqual", multirequestToken);
	}

	// createdAtGreaterThanOrEqual:
	public Integer getCreatedAtGreaterThanOrEqual(){
		return this.createdAtGreaterThanOrEqual;
	}
	public void setCreatedAtGreaterThanOrEqual(Integer createdAtGreaterThanOrEqual){
		this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
	}

	public void createdAtGreaterThanOrEqual(String multirequestToken){
		setToken("createdAtGreaterThanOrEqual", multirequestToken);
	}

	// createdAtLessThanOrEqual:
	public Integer getCreatedAtLessThanOrEqual(){
		return this.createdAtLessThanOrEqual;
	}
	public void setCreatedAtLessThanOrEqual(Integer createdAtLessThanOrEqual){
		this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
	}

	public void createdAtLessThanOrEqual(String multirequestToken){
		setToken("createdAtLessThanOrEqual", multirequestToken);
	}

	// updatedAtGreaterThanOrEqual:
	public Integer getUpdatedAtGreaterThanOrEqual(){
		return this.updatedAtGreaterThanOrEqual;
	}
	public void setUpdatedAtGreaterThanOrEqual(Integer updatedAtGreaterThanOrEqual){
		this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
	}

	public void updatedAtGreaterThanOrEqual(String multirequestToken){
		setToken("updatedAtGreaterThanOrEqual", multirequestToken);
	}

	// updatedAtLessThanOrEqual:
	public Integer getUpdatedAtLessThanOrEqual(){
		return this.updatedAtLessThanOrEqual;
	}
	public void setUpdatedAtLessThanOrEqual(Integer updatedAtLessThanOrEqual){
		this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
	}

	public void updatedAtLessThanOrEqual(String multirequestToken){
		setToken("updatedAtLessThanOrEqual", multirequestToken);
	}

	// readyAtGreaterThanOrEqual:
	public Integer getReadyAtGreaterThanOrEqual(){
		return this.readyAtGreaterThanOrEqual;
	}
	public void setReadyAtGreaterThanOrEqual(Integer readyAtGreaterThanOrEqual){
		this.readyAtGreaterThanOrEqual = readyAtGreaterThanOrEqual;
	}

	public void readyAtGreaterThanOrEqual(String multirequestToken){
		setToken("readyAtGreaterThanOrEqual", multirequestToken);
	}

	// readyAtLessThanOrEqual:
	public Integer getReadyAtLessThanOrEqual(){
		return this.readyAtLessThanOrEqual;
	}
	public void setReadyAtLessThanOrEqual(Integer readyAtLessThanOrEqual){
		this.readyAtLessThanOrEqual = readyAtLessThanOrEqual;
	}

	public void readyAtLessThanOrEqual(String multirequestToken){
		setToken("readyAtLessThanOrEqual", multirequestToken);
	}

	// syncTimeGreaterThanOrEqual:
	public Integer getSyncTimeGreaterThanOrEqual(){
		return this.syncTimeGreaterThanOrEqual;
	}
	public void setSyncTimeGreaterThanOrEqual(Integer syncTimeGreaterThanOrEqual){
		this.syncTimeGreaterThanOrEqual = syncTimeGreaterThanOrEqual;
	}

	public void syncTimeGreaterThanOrEqual(String multirequestToken){
		setToken("syncTimeGreaterThanOrEqual", multirequestToken);
	}

	// syncTimeLessThanOrEqual:
	public Integer getSyncTimeLessThanOrEqual(){
		return this.syncTimeLessThanOrEqual;
	}
	public void setSyncTimeLessThanOrEqual(Integer syncTimeLessThanOrEqual){
		this.syncTimeLessThanOrEqual = syncTimeLessThanOrEqual;
	}

	public void syncTimeLessThanOrEqual(String multirequestToken){
		setToken("syncTimeLessThanOrEqual", multirequestToken);
	}

	// statusEqual:
	public FileSyncStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(FileSyncStatus statusEqual){
		this.statusEqual = statusEqual;
	}

	public void statusEqual(String multirequestToken){
		setToken("statusEqual", multirequestToken);
	}

	// statusIn:
	public String getStatusIn(){
		return this.statusIn;
	}
	public void setStatusIn(String statusIn){
		this.statusIn = statusIn;
	}

	public void statusIn(String multirequestToken){
		setToken("statusIn", multirequestToken);
	}

	// fileTypeEqual:
	public FileSyncType getFileTypeEqual(){
		return this.fileTypeEqual;
	}
	public void setFileTypeEqual(FileSyncType fileTypeEqual){
		this.fileTypeEqual = fileTypeEqual;
	}

	public void fileTypeEqual(String multirequestToken){
		setToken("fileTypeEqual", multirequestToken);
	}

	// fileTypeIn:
	public String getFileTypeIn(){
		return this.fileTypeIn;
	}
	public void setFileTypeIn(String fileTypeIn){
		this.fileTypeIn = fileTypeIn;
	}

	public void fileTypeIn(String multirequestToken){
		setToken("fileTypeIn", multirequestToken);
	}

	// linkedIdEqual:
	public Integer getLinkedIdEqual(){
		return this.linkedIdEqual;
	}
	public void setLinkedIdEqual(Integer linkedIdEqual){
		this.linkedIdEqual = linkedIdEqual;
	}

	public void linkedIdEqual(String multirequestToken){
		setToken("linkedIdEqual", multirequestToken);
	}

	// linkCountGreaterThanOrEqual:
	public Integer getLinkCountGreaterThanOrEqual(){
		return this.linkCountGreaterThanOrEqual;
	}
	public void setLinkCountGreaterThanOrEqual(Integer linkCountGreaterThanOrEqual){
		this.linkCountGreaterThanOrEqual = linkCountGreaterThanOrEqual;
	}

	public void linkCountGreaterThanOrEqual(String multirequestToken){
		setToken("linkCountGreaterThanOrEqual", multirequestToken);
	}

	// linkCountLessThanOrEqual:
	public Integer getLinkCountLessThanOrEqual(){
		return this.linkCountLessThanOrEqual;
	}
	public void setLinkCountLessThanOrEqual(Integer linkCountLessThanOrEqual){
		this.linkCountLessThanOrEqual = linkCountLessThanOrEqual;
	}

	public void linkCountLessThanOrEqual(String multirequestToken){
		setToken("linkCountLessThanOrEqual", multirequestToken);
	}

	// fileSizeGreaterThanOrEqual:
	public Double getFileSizeGreaterThanOrEqual(){
		return this.fileSizeGreaterThanOrEqual;
	}
	public void setFileSizeGreaterThanOrEqual(Double fileSizeGreaterThanOrEqual){
		this.fileSizeGreaterThanOrEqual = fileSizeGreaterThanOrEqual;
	}

	public void fileSizeGreaterThanOrEqual(String multirequestToken){
		setToken("fileSizeGreaterThanOrEqual", multirequestToken);
	}

	// fileSizeLessThanOrEqual:
	public Double getFileSizeLessThanOrEqual(){
		return this.fileSizeLessThanOrEqual;
	}
	public void setFileSizeLessThanOrEqual(Double fileSizeLessThanOrEqual){
		this.fileSizeLessThanOrEqual = fileSizeLessThanOrEqual;
	}

	public void fileSizeLessThanOrEqual(String multirequestToken){
		setToken("fileSizeLessThanOrEqual", multirequestToken);
	}


	public FileSyncBaseFilter() {
		super();
	}

	public FileSyncBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
		fileObjectTypeEqual = FileSyncObjectType.get(GsonParser.parseString(jsonObject.get("fileObjectTypeEqual")));
		fileObjectTypeIn = GsonParser.parseString(jsonObject.get("fileObjectTypeIn"));
		objectIdEqual = GsonParser.parseString(jsonObject.get("objectIdEqual"));
		objectIdIn = GsonParser.parseString(jsonObject.get("objectIdIn"));
		versionEqual = GsonParser.parseString(jsonObject.get("versionEqual"));
		versionIn = GsonParser.parseString(jsonObject.get("versionIn"));
		objectSubTypeEqual = GsonParser.parseInt(jsonObject.get("objectSubTypeEqual"));
		objectSubTypeIn = GsonParser.parseString(jsonObject.get("objectSubTypeIn"));
		dcEqual = GsonParser.parseString(jsonObject.get("dcEqual"));
		dcIn = GsonParser.parseString(jsonObject.get("dcIn"));
		originalEqual = GsonParser.parseInt(jsonObject.get("originalEqual"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
		readyAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("readyAtGreaterThanOrEqual"));
		readyAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("readyAtLessThanOrEqual"));
		syncTimeGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("syncTimeGreaterThanOrEqual"));
		syncTimeLessThanOrEqual = GsonParser.parseInt(jsonObject.get("syncTimeLessThanOrEqual"));
		statusEqual = FileSyncStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		fileTypeEqual = FileSyncType.get(GsonParser.parseInt(jsonObject.get("fileTypeEqual")));
		fileTypeIn = GsonParser.parseString(jsonObject.get("fileTypeIn"));
		linkedIdEqual = GsonParser.parseInt(jsonObject.get("linkedIdEqual"));
		linkCountGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("linkCountGreaterThanOrEqual"));
		linkCountLessThanOrEqual = GsonParser.parseInt(jsonObject.get("linkCountLessThanOrEqual"));
		fileSizeGreaterThanOrEqual = GsonParser.parseDouble(jsonObject.get("fileSizeGreaterThanOrEqual"));
		fileSizeLessThanOrEqual = GsonParser.parseDouble(jsonObject.get("fileSizeLessThanOrEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFileSyncBaseFilter");
		kparams.add("partnerIdEqual", this.partnerIdEqual);
		kparams.add("fileObjectTypeEqual", this.fileObjectTypeEqual);
		kparams.add("fileObjectTypeIn", this.fileObjectTypeIn);
		kparams.add("objectIdEqual", this.objectIdEqual);
		kparams.add("objectIdIn", this.objectIdIn);
		kparams.add("versionEqual", this.versionEqual);
		kparams.add("versionIn", this.versionIn);
		kparams.add("objectSubTypeEqual", this.objectSubTypeEqual);
		kparams.add("objectSubTypeIn", this.objectSubTypeIn);
		kparams.add("dcEqual", this.dcEqual);
		kparams.add("dcIn", this.dcIn);
		kparams.add("originalEqual", this.originalEqual);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("readyAtGreaterThanOrEqual", this.readyAtGreaterThanOrEqual);
		kparams.add("readyAtLessThanOrEqual", this.readyAtLessThanOrEqual);
		kparams.add("syncTimeGreaterThanOrEqual", this.syncTimeGreaterThanOrEqual);
		kparams.add("syncTimeLessThanOrEqual", this.syncTimeLessThanOrEqual);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("fileTypeEqual", this.fileTypeEqual);
		kparams.add("fileTypeIn", this.fileTypeIn);
		kparams.add("linkedIdEqual", this.linkedIdEqual);
		kparams.add("linkCountGreaterThanOrEqual", this.linkCountGreaterThanOrEqual);
		kparams.add("linkCountLessThanOrEqual", this.linkCountLessThanOrEqual);
		kparams.add("fileSizeGreaterThanOrEqual", this.fileSizeGreaterThanOrEqual);
		kparams.add("fileSizeLessThanOrEqual", this.fileSizeLessThanOrEqual);
		return kparams;
	}

}

