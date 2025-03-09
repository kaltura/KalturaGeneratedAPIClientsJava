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
import com.kaltura.client.enums.DropFolderFileErrorCode;
import com.kaltura.client.enums.DropFolderFileStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DropFolderFileBaseFilter.Tokenizer.class)
public abstract class DropFolderFileBaseFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idEqual();
		String idIn();
		String idGreaterThanOrEqual();
		String partnerIdEqual();
		String partnerIdIn();
		String dropFolderIdEqual();
		String dropFolderIdIn();
		String fileNameEqual();
		String fileNameIn();
		String fileNameLike();
		String statusEqual();
		String statusIn();
		String statusNotIn();
		String parsedSlugEqual();
		String parsedSlugIn();
		String parsedSlugLike();
		String parsedFlavorEqual();
		String parsedFlavorIn();
		String parsedFlavorLike();
		String leadDropFolderFileIdEqual();
		String deletedDropFolderFileIdEqual();
		String entryIdEqual();
		String errorCodeEqual();
		String errorCodeIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
	}

	private Integer idEqual;
	private String idIn;
	private Integer idGreaterThanOrEqual;
	private Integer partnerIdEqual;
	private String partnerIdIn;
	private Integer dropFolderIdEqual;
	private String dropFolderIdIn;
	private String fileNameEqual;
	private String fileNameIn;
	private String fileNameLike;
	private DropFolderFileStatus statusEqual;
	private String statusIn;
	private String statusNotIn;
	private String parsedSlugEqual;
	private String parsedSlugIn;
	private String parsedSlugLike;
	private String parsedFlavorEqual;
	private String parsedFlavorIn;
	private String parsedFlavorLike;
	private Integer leadDropFolderFileIdEqual;
	private Integer deletedDropFolderFileIdEqual;
	private String entryIdEqual;
	private DropFolderFileErrorCode errorCodeEqual;
	private String errorCodeIn;
	private Long createdAtGreaterThanOrEqual;
	private Long createdAtLessThanOrEqual;
	private Long updatedAtGreaterThanOrEqual;
	private Long updatedAtLessThanOrEqual;

	// idEqual:
	public Integer getIdEqual(){
		return this.idEqual;
	}
	public void setIdEqual(Integer idEqual){
		this.idEqual = idEqual;
	}

	public void idEqual(String multirequestToken){
		setToken("idEqual", multirequestToken);
	}

	// idIn:
	public String getIdIn(){
		return this.idIn;
	}
	public void setIdIn(String idIn){
		this.idIn = idIn;
	}

	public void idIn(String multirequestToken){
		setToken("idIn", multirequestToken);
	}

	// idGreaterThanOrEqual:
	public Integer getIdGreaterThanOrEqual(){
		return this.idGreaterThanOrEqual;
	}
	public void setIdGreaterThanOrEqual(Integer idGreaterThanOrEqual){
		this.idGreaterThanOrEqual = idGreaterThanOrEqual;
	}

	public void idGreaterThanOrEqual(String multirequestToken){
		setToken("idGreaterThanOrEqual", multirequestToken);
	}

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

	// partnerIdIn:
	public String getPartnerIdIn(){
		return this.partnerIdIn;
	}
	public void setPartnerIdIn(String partnerIdIn){
		this.partnerIdIn = partnerIdIn;
	}

	public void partnerIdIn(String multirequestToken){
		setToken("partnerIdIn", multirequestToken);
	}

	// dropFolderIdEqual:
	public Integer getDropFolderIdEqual(){
		return this.dropFolderIdEqual;
	}
	public void setDropFolderIdEqual(Integer dropFolderIdEqual){
		this.dropFolderIdEqual = dropFolderIdEqual;
	}

	public void dropFolderIdEqual(String multirequestToken){
		setToken("dropFolderIdEqual", multirequestToken);
	}

	// dropFolderIdIn:
	public String getDropFolderIdIn(){
		return this.dropFolderIdIn;
	}
	public void setDropFolderIdIn(String dropFolderIdIn){
		this.dropFolderIdIn = dropFolderIdIn;
	}

	public void dropFolderIdIn(String multirequestToken){
		setToken("dropFolderIdIn", multirequestToken);
	}

	// fileNameEqual:
	public String getFileNameEqual(){
		return this.fileNameEqual;
	}
	public void setFileNameEqual(String fileNameEqual){
		this.fileNameEqual = fileNameEqual;
	}

	public void fileNameEqual(String multirequestToken){
		setToken("fileNameEqual", multirequestToken);
	}

	// fileNameIn:
	public String getFileNameIn(){
		return this.fileNameIn;
	}
	public void setFileNameIn(String fileNameIn){
		this.fileNameIn = fileNameIn;
	}

	public void fileNameIn(String multirequestToken){
		setToken("fileNameIn", multirequestToken);
	}

	// fileNameLike:
	public String getFileNameLike(){
		return this.fileNameLike;
	}
	public void setFileNameLike(String fileNameLike){
		this.fileNameLike = fileNameLike;
	}

	public void fileNameLike(String multirequestToken){
		setToken("fileNameLike", multirequestToken);
	}

	// statusEqual:
	public DropFolderFileStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(DropFolderFileStatus statusEqual){
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

	// statusNotIn:
	public String getStatusNotIn(){
		return this.statusNotIn;
	}
	public void setStatusNotIn(String statusNotIn){
		this.statusNotIn = statusNotIn;
	}

	public void statusNotIn(String multirequestToken){
		setToken("statusNotIn", multirequestToken);
	}

	// parsedSlugEqual:
	public String getParsedSlugEqual(){
		return this.parsedSlugEqual;
	}
	public void setParsedSlugEqual(String parsedSlugEqual){
		this.parsedSlugEqual = parsedSlugEqual;
	}

	public void parsedSlugEqual(String multirequestToken){
		setToken("parsedSlugEqual", multirequestToken);
	}

	// parsedSlugIn:
	public String getParsedSlugIn(){
		return this.parsedSlugIn;
	}
	public void setParsedSlugIn(String parsedSlugIn){
		this.parsedSlugIn = parsedSlugIn;
	}

	public void parsedSlugIn(String multirequestToken){
		setToken("parsedSlugIn", multirequestToken);
	}

	// parsedSlugLike:
	public String getParsedSlugLike(){
		return this.parsedSlugLike;
	}
	public void setParsedSlugLike(String parsedSlugLike){
		this.parsedSlugLike = parsedSlugLike;
	}

	public void parsedSlugLike(String multirequestToken){
		setToken("parsedSlugLike", multirequestToken);
	}

	// parsedFlavorEqual:
	public String getParsedFlavorEqual(){
		return this.parsedFlavorEqual;
	}
	public void setParsedFlavorEqual(String parsedFlavorEqual){
		this.parsedFlavorEqual = parsedFlavorEqual;
	}

	public void parsedFlavorEqual(String multirequestToken){
		setToken("parsedFlavorEqual", multirequestToken);
	}

	// parsedFlavorIn:
	public String getParsedFlavorIn(){
		return this.parsedFlavorIn;
	}
	public void setParsedFlavorIn(String parsedFlavorIn){
		this.parsedFlavorIn = parsedFlavorIn;
	}

	public void parsedFlavorIn(String multirequestToken){
		setToken("parsedFlavorIn", multirequestToken);
	}

	// parsedFlavorLike:
	public String getParsedFlavorLike(){
		return this.parsedFlavorLike;
	}
	public void setParsedFlavorLike(String parsedFlavorLike){
		this.parsedFlavorLike = parsedFlavorLike;
	}

	public void parsedFlavorLike(String multirequestToken){
		setToken("parsedFlavorLike", multirequestToken);
	}

	// leadDropFolderFileIdEqual:
	public Integer getLeadDropFolderFileIdEqual(){
		return this.leadDropFolderFileIdEqual;
	}
	public void setLeadDropFolderFileIdEqual(Integer leadDropFolderFileIdEqual){
		this.leadDropFolderFileIdEqual = leadDropFolderFileIdEqual;
	}

	public void leadDropFolderFileIdEqual(String multirequestToken){
		setToken("leadDropFolderFileIdEqual", multirequestToken);
	}

	// deletedDropFolderFileIdEqual:
	public Integer getDeletedDropFolderFileIdEqual(){
		return this.deletedDropFolderFileIdEqual;
	}
	public void setDeletedDropFolderFileIdEqual(Integer deletedDropFolderFileIdEqual){
		this.deletedDropFolderFileIdEqual = deletedDropFolderFileIdEqual;
	}

	public void deletedDropFolderFileIdEqual(String multirequestToken){
		setToken("deletedDropFolderFileIdEqual", multirequestToken);
	}

	// entryIdEqual:
	public String getEntryIdEqual(){
		return this.entryIdEqual;
	}
	public void setEntryIdEqual(String entryIdEqual){
		this.entryIdEqual = entryIdEqual;
	}

	public void entryIdEqual(String multirequestToken){
		setToken("entryIdEqual", multirequestToken);
	}

	// errorCodeEqual:
	public DropFolderFileErrorCode getErrorCodeEqual(){
		return this.errorCodeEqual;
	}
	public void setErrorCodeEqual(DropFolderFileErrorCode errorCodeEqual){
		this.errorCodeEqual = errorCodeEqual;
	}

	public void errorCodeEqual(String multirequestToken){
		setToken("errorCodeEqual", multirequestToken);
	}

	// errorCodeIn:
	public String getErrorCodeIn(){
		return this.errorCodeIn;
	}
	public void setErrorCodeIn(String errorCodeIn){
		this.errorCodeIn = errorCodeIn;
	}

	public void errorCodeIn(String multirequestToken){
		setToken("errorCodeIn", multirequestToken);
	}

	// createdAtGreaterThanOrEqual:
	public Long getCreatedAtGreaterThanOrEqual(){
		return this.createdAtGreaterThanOrEqual;
	}
	public void setCreatedAtGreaterThanOrEqual(Long createdAtGreaterThanOrEqual){
		this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
	}

	public void createdAtGreaterThanOrEqual(String multirequestToken){
		setToken("createdAtGreaterThanOrEqual", multirequestToken);
	}

	// createdAtLessThanOrEqual:
	public Long getCreatedAtLessThanOrEqual(){
		return this.createdAtLessThanOrEqual;
	}
	public void setCreatedAtLessThanOrEqual(Long createdAtLessThanOrEqual){
		this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
	}

	public void createdAtLessThanOrEqual(String multirequestToken){
		setToken("createdAtLessThanOrEqual", multirequestToken);
	}

	// updatedAtGreaterThanOrEqual:
	public Long getUpdatedAtGreaterThanOrEqual(){
		return this.updatedAtGreaterThanOrEqual;
	}
	public void setUpdatedAtGreaterThanOrEqual(Long updatedAtGreaterThanOrEqual){
		this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
	}

	public void updatedAtGreaterThanOrEqual(String multirequestToken){
		setToken("updatedAtGreaterThanOrEqual", multirequestToken);
	}

	// updatedAtLessThanOrEqual:
	public Long getUpdatedAtLessThanOrEqual(){
		return this.updatedAtLessThanOrEqual;
	}
	public void setUpdatedAtLessThanOrEqual(Long updatedAtLessThanOrEqual){
		this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
	}

	public void updatedAtLessThanOrEqual(String multirequestToken){
		setToken("updatedAtLessThanOrEqual", multirequestToken);
	}


	public DropFolderFileBaseFilter() {
		super();
	}

	public DropFolderFileBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		idGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("idGreaterThanOrEqual"));
		partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
		partnerIdIn = GsonParser.parseString(jsonObject.get("partnerIdIn"));
		dropFolderIdEqual = GsonParser.parseInt(jsonObject.get("dropFolderIdEqual"));
		dropFolderIdIn = GsonParser.parseString(jsonObject.get("dropFolderIdIn"));
		fileNameEqual = GsonParser.parseString(jsonObject.get("fileNameEqual"));
		fileNameIn = GsonParser.parseString(jsonObject.get("fileNameIn"));
		fileNameLike = GsonParser.parseString(jsonObject.get("fileNameLike"));
		statusEqual = DropFolderFileStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		statusNotIn = GsonParser.parseString(jsonObject.get("statusNotIn"));
		parsedSlugEqual = GsonParser.parseString(jsonObject.get("parsedSlugEqual"));
		parsedSlugIn = GsonParser.parseString(jsonObject.get("parsedSlugIn"));
		parsedSlugLike = GsonParser.parseString(jsonObject.get("parsedSlugLike"));
		parsedFlavorEqual = GsonParser.parseString(jsonObject.get("parsedFlavorEqual"));
		parsedFlavorIn = GsonParser.parseString(jsonObject.get("parsedFlavorIn"));
		parsedFlavorLike = GsonParser.parseString(jsonObject.get("parsedFlavorLike"));
		leadDropFolderFileIdEqual = GsonParser.parseInt(jsonObject.get("leadDropFolderFileIdEqual"));
		deletedDropFolderFileIdEqual = GsonParser.parseInt(jsonObject.get("deletedDropFolderFileIdEqual"));
		entryIdEqual = GsonParser.parseString(jsonObject.get("entryIdEqual"));
		errorCodeEqual = DropFolderFileErrorCode.get(GsonParser.parseString(jsonObject.get("errorCodeEqual")));
		errorCodeIn = GsonParser.parseString(jsonObject.get("errorCodeIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtLessThanOrEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDropFolderFileBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("idGreaterThanOrEqual", this.idGreaterThanOrEqual);
		kparams.add("partnerIdEqual", this.partnerIdEqual);
		kparams.add("partnerIdIn", this.partnerIdIn);
		kparams.add("dropFolderIdEqual", this.dropFolderIdEqual);
		kparams.add("dropFolderIdIn", this.dropFolderIdIn);
		kparams.add("fileNameEqual", this.fileNameEqual);
		kparams.add("fileNameIn", this.fileNameIn);
		kparams.add("fileNameLike", this.fileNameLike);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("statusNotIn", this.statusNotIn);
		kparams.add("parsedSlugEqual", this.parsedSlugEqual);
		kparams.add("parsedSlugIn", this.parsedSlugIn);
		kparams.add("parsedSlugLike", this.parsedSlugLike);
		kparams.add("parsedFlavorEqual", this.parsedFlavorEqual);
		kparams.add("parsedFlavorIn", this.parsedFlavorIn);
		kparams.add("parsedFlavorLike", this.parsedFlavorLike);
		kparams.add("leadDropFolderFileIdEqual", this.leadDropFolderFileIdEqual);
		kparams.add("deletedDropFolderFileIdEqual", this.deletedDropFolderFileIdEqual);
		kparams.add("entryIdEqual", this.entryIdEqual);
		kparams.add("errorCodeEqual", this.errorCodeEqual);
		kparams.add("errorCodeIn", this.errorCodeIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		return kparams;
	}

}

