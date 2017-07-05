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

import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.enums.DropFolderFileStatus;
import com.kaltura.client.enums.DropFolderFileErrorCode;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class DropFolderFileBaseFilter extends Filter {

    private Integer idEqual;
    private String idIn;
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
    private Integer createdAtGreaterThanOrEqual;
    private Integer createdAtLessThanOrEqual;
    private Integer updatedAtGreaterThanOrEqual;
    private Integer updatedAtLessThanOrEqual;

    // idEqual:
    public Integer getIdEqual(){
        return this.idEqual;
    }
    public void setIdEqual(Integer idEqual){
        this.idEqual = idEqual;
    }

    // idIn:
    public String getIdIn(){
        return this.idIn;
    }
    public void setIdIn(String idIn){
        this.idIn = idIn;
    }

    // partnerIdEqual:
    public Integer getPartnerIdEqual(){
        return this.partnerIdEqual;
    }
    public void setPartnerIdEqual(Integer partnerIdEqual){
        this.partnerIdEqual = partnerIdEqual;
    }

    // partnerIdIn:
    public String getPartnerIdIn(){
        return this.partnerIdIn;
    }
    public void setPartnerIdIn(String partnerIdIn){
        this.partnerIdIn = partnerIdIn;
    }

    // dropFolderIdEqual:
    public Integer getDropFolderIdEqual(){
        return this.dropFolderIdEqual;
    }
    public void setDropFolderIdEqual(Integer dropFolderIdEqual){
        this.dropFolderIdEqual = dropFolderIdEqual;
    }

    // dropFolderIdIn:
    public String getDropFolderIdIn(){
        return this.dropFolderIdIn;
    }
    public void setDropFolderIdIn(String dropFolderIdIn){
        this.dropFolderIdIn = dropFolderIdIn;
    }

    // fileNameEqual:
    public String getFileNameEqual(){
        return this.fileNameEqual;
    }
    public void setFileNameEqual(String fileNameEqual){
        this.fileNameEqual = fileNameEqual;
    }

    // fileNameIn:
    public String getFileNameIn(){
        return this.fileNameIn;
    }
    public void setFileNameIn(String fileNameIn){
        this.fileNameIn = fileNameIn;
    }

    // fileNameLike:
    public String getFileNameLike(){
        return this.fileNameLike;
    }
    public void setFileNameLike(String fileNameLike){
        this.fileNameLike = fileNameLike;
    }

    // statusEqual:
    public DropFolderFileStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(DropFolderFileStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // statusNotIn:
    public String getStatusNotIn(){
        return this.statusNotIn;
    }
    public void setStatusNotIn(String statusNotIn){
        this.statusNotIn = statusNotIn;
    }

    // parsedSlugEqual:
    public String getParsedSlugEqual(){
        return this.parsedSlugEqual;
    }
    public void setParsedSlugEqual(String parsedSlugEqual){
        this.parsedSlugEqual = parsedSlugEqual;
    }

    // parsedSlugIn:
    public String getParsedSlugIn(){
        return this.parsedSlugIn;
    }
    public void setParsedSlugIn(String parsedSlugIn){
        this.parsedSlugIn = parsedSlugIn;
    }

    // parsedSlugLike:
    public String getParsedSlugLike(){
        return this.parsedSlugLike;
    }
    public void setParsedSlugLike(String parsedSlugLike){
        this.parsedSlugLike = parsedSlugLike;
    }

    // parsedFlavorEqual:
    public String getParsedFlavorEqual(){
        return this.parsedFlavorEqual;
    }
    public void setParsedFlavorEqual(String parsedFlavorEqual){
        this.parsedFlavorEqual = parsedFlavorEqual;
    }

    // parsedFlavorIn:
    public String getParsedFlavorIn(){
        return this.parsedFlavorIn;
    }
    public void setParsedFlavorIn(String parsedFlavorIn){
        this.parsedFlavorIn = parsedFlavorIn;
    }

    // parsedFlavorLike:
    public String getParsedFlavorLike(){
        return this.parsedFlavorLike;
    }
    public void setParsedFlavorLike(String parsedFlavorLike){
        this.parsedFlavorLike = parsedFlavorLike;
    }

    // leadDropFolderFileIdEqual:
    public Integer getLeadDropFolderFileIdEqual(){
        return this.leadDropFolderFileIdEqual;
    }
    public void setLeadDropFolderFileIdEqual(Integer leadDropFolderFileIdEqual){
        this.leadDropFolderFileIdEqual = leadDropFolderFileIdEqual;
    }

    // deletedDropFolderFileIdEqual:
    public Integer getDeletedDropFolderFileIdEqual(){
        return this.deletedDropFolderFileIdEqual;
    }
    public void setDeletedDropFolderFileIdEqual(Integer deletedDropFolderFileIdEqual){
        this.deletedDropFolderFileIdEqual = deletedDropFolderFileIdEqual;
    }

    // entryIdEqual:
    public String getEntryIdEqual(){
        return this.entryIdEqual;
    }
    public void setEntryIdEqual(String entryIdEqual){
        this.entryIdEqual = entryIdEqual;
    }

    // errorCodeEqual:
    public DropFolderFileErrorCode getErrorCodeEqual(){
        return this.errorCodeEqual;
    }
    public void setErrorCodeEqual(DropFolderFileErrorCode errorCodeEqual){
        this.errorCodeEqual = errorCodeEqual;
    }

    // errorCodeIn:
    public String getErrorCodeIn(){
        return this.errorCodeIn;
    }
    public void setErrorCodeIn(String errorCodeIn){
        this.errorCodeIn = errorCodeIn;
    }

    // createdAtGreaterThanOrEqual:
    public Integer getCreatedAtGreaterThanOrEqual(){
        return this.createdAtGreaterThanOrEqual;
    }
    public void setCreatedAtGreaterThanOrEqual(Integer createdAtGreaterThanOrEqual){
        this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
    }

    // createdAtLessThanOrEqual:
    public Integer getCreatedAtLessThanOrEqual(){
        return this.createdAtLessThanOrEqual;
    }
    public void setCreatedAtLessThanOrEqual(Integer createdAtLessThanOrEqual){
        this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
    }

    // updatedAtGreaterThanOrEqual:
    public Integer getUpdatedAtGreaterThanOrEqual(){
        return this.updatedAtGreaterThanOrEqual;
    }
    public void setUpdatedAtGreaterThanOrEqual(Integer updatedAtGreaterThanOrEqual){
        this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
    }

    // updatedAtLessThanOrEqual:
    public Integer getUpdatedAtLessThanOrEqual(){
        return this.updatedAtLessThanOrEqual;
    }
    public void setUpdatedAtLessThanOrEqual(Integer updatedAtLessThanOrEqual){
        this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
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
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
        updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaDropFolderFileBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
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

