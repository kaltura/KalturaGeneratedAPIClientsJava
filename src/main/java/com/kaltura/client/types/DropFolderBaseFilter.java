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
import com.kaltura.client.enums.DropFolderErrorCode;
import com.kaltura.client.enums.DropFolderFileHandlerType;
import com.kaltura.client.enums.DropFolderStatus;
import com.kaltura.client.enums.DropFolderType;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class DropFolderBaseFilter extends Filter {

    private Integer idEqual;
    private String idIn;
    private Integer partnerIdEqual;
    private String partnerIdIn;
    private String nameLike;
    private DropFolderType typeEqual;
    private String typeIn;
    private DropFolderStatus statusEqual;
    private String statusIn;
    private Integer conversionProfileIdEqual;
    private String conversionProfileIdIn;
    private Integer dcEqual;
    private String dcIn;
    private String pathEqual;
    private String pathLike;
    private DropFolderFileHandlerType fileHandlerTypeEqual;
    private String fileHandlerTypeIn;
    private String fileNamePatternsLike;
    private String fileNamePatternsMultiLikeOr;
    private String fileNamePatternsMultiLikeAnd;
    private String tagsLike;
    private String tagsMultiLikeOr;
    private String tagsMultiLikeAnd;
    private DropFolderErrorCode errorCodeEqual;
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

    // nameLike:
    public String getNameLike(){
        return this.nameLike;
    }
    public void setNameLike(String nameLike){
        this.nameLike = nameLike;
    }

    // typeEqual:
    public DropFolderType getTypeEqual(){
        return this.typeEqual;
    }
    public void setTypeEqual(DropFolderType typeEqual){
        this.typeEqual = typeEqual;
    }

    // typeIn:
    public String getTypeIn(){
        return this.typeIn;
    }
    public void setTypeIn(String typeIn){
        this.typeIn = typeIn;
    }

    // statusEqual:
    public DropFolderStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(DropFolderStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // conversionProfileIdEqual:
    public Integer getConversionProfileIdEqual(){
        return this.conversionProfileIdEqual;
    }
    public void setConversionProfileIdEqual(Integer conversionProfileIdEqual){
        this.conversionProfileIdEqual = conversionProfileIdEqual;
    }

    // conversionProfileIdIn:
    public String getConversionProfileIdIn(){
        return this.conversionProfileIdIn;
    }
    public void setConversionProfileIdIn(String conversionProfileIdIn){
        this.conversionProfileIdIn = conversionProfileIdIn;
    }

    // dcEqual:
    public Integer getDcEqual(){
        return this.dcEqual;
    }
    public void setDcEqual(Integer dcEqual){
        this.dcEqual = dcEqual;
    }

    // dcIn:
    public String getDcIn(){
        return this.dcIn;
    }
    public void setDcIn(String dcIn){
        this.dcIn = dcIn;
    }

    // pathEqual:
    public String getPathEqual(){
        return this.pathEqual;
    }
    public void setPathEqual(String pathEqual){
        this.pathEqual = pathEqual;
    }

    // pathLike:
    public String getPathLike(){
        return this.pathLike;
    }
    public void setPathLike(String pathLike){
        this.pathLike = pathLike;
    }

    // fileHandlerTypeEqual:
    public DropFolderFileHandlerType getFileHandlerTypeEqual(){
        return this.fileHandlerTypeEqual;
    }
    public void setFileHandlerTypeEqual(DropFolderFileHandlerType fileHandlerTypeEqual){
        this.fileHandlerTypeEqual = fileHandlerTypeEqual;
    }

    // fileHandlerTypeIn:
    public String getFileHandlerTypeIn(){
        return this.fileHandlerTypeIn;
    }
    public void setFileHandlerTypeIn(String fileHandlerTypeIn){
        this.fileHandlerTypeIn = fileHandlerTypeIn;
    }

    // fileNamePatternsLike:
    public String getFileNamePatternsLike(){
        return this.fileNamePatternsLike;
    }
    public void setFileNamePatternsLike(String fileNamePatternsLike){
        this.fileNamePatternsLike = fileNamePatternsLike;
    }

    // fileNamePatternsMultiLikeOr:
    public String getFileNamePatternsMultiLikeOr(){
        return this.fileNamePatternsMultiLikeOr;
    }
    public void setFileNamePatternsMultiLikeOr(String fileNamePatternsMultiLikeOr){
        this.fileNamePatternsMultiLikeOr = fileNamePatternsMultiLikeOr;
    }

    // fileNamePatternsMultiLikeAnd:
    public String getFileNamePatternsMultiLikeAnd(){
        return this.fileNamePatternsMultiLikeAnd;
    }
    public void setFileNamePatternsMultiLikeAnd(String fileNamePatternsMultiLikeAnd){
        this.fileNamePatternsMultiLikeAnd = fileNamePatternsMultiLikeAnd;
    }

    // tagsLike:
    public String getTagsLike(){
        return this.tagsLike;
    }
    public void setTagsLike(String tagsLike){
        this.tagsLike = tagsLike;
    }

    // tagsMultiLikeOr:
    public String getTagsMultiLikeOr(){
        return this.tagsMultiLikeOr;
    }
    public void setTagsMultiLikeOr(String tagsMultiLikeOr){
        this.tagsMultiLikeOr = tagsMultiLikeOr;
    }

    // tagsMultiLikeAnd:
    public String getTagsMultiLikeAnd(){
        return this.tagsMultiLikeAnd;
    }
    public void setTagsMultiLikeAnd(String tagsMultiLikeAnd){
        this.tagsMultiLikeAnd = tagsMultiLikeAnd;
    }

    // errorCodeEqual:
    public DropFolderErrorCode getErrorCodeEqual(){
        return this.errorCodeEqual;
    }
    public void setErrorCodeEqual(DropFolderErrorCode errorCodeEqual){
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


    public DropFolderBaseFilter() {
       super();
    }

    public DropFolderBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
        idIn = GsonParser.parseString(jsonObject.get("idIn"));
        partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
        partnerIdIn = GsonParser.parseString(jsonObject.get("partnerIdIn"));
        nameLike = GsonParser.parseString(jsonObject.get("nameLike"));
        typeEqual = DropFolderType.get(GsonParser.parseString(jsonObject.get("typeEqual")));
        typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
        statusEqual = DropFolderStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        conversionProfileIdEqual = GsonParser.parseInt(jsonObject.get("conversionProfileIdEqual"));
        conversionProfileIdIn = GsonParser.parseString(jsonObject.get("conversionProfileIdIn"));
        dcEqual = GsonParser.parseInt(jsonObject.get("dcEqual"));
        dcIn = GsonParser.parseString(jsonObject.get("dcIn"));
        pathEqual = GsonParser.parseString(jsonObject.get("pathEqual"));
        pathLike = GsonParser.parseString(jsonObject.get("pathLike"));
        fileHandlerTypeEqual = DropFolderFileHandlerType.get(GsonParser.parseString(jsonObject.get("fileHandlerTypeEqual")));
        fileHandlerTypeIn = GsonParser.parseString(jsonObject.get("fileHandlerTypeIn"));
        fileNamePatternsLike = GsonParser.parseString(jsonObject.get("fileNamePatternsLike"));
        fileNamePatternsMultiLikeOr = GsonParser.parseString(jsonObject.get("fileNamePatternsMultiLikeOr"));
        fileNamePatternsMultiLikeAnd = GsonParser.parseString(jsonObject.get("fileNamePatternsMultiLikeAnd"));
        tagsLike = GsonParser.parseString(jsonObject.get("tagsLike"));
        tagsMultiLikeOr = GsonParser.parseString(jsonObject.get("tagsMultiLikeOr"));
        tagsMultiLikeAnd = GsonParser.parseString(jsonObject.get("tagsMultiLikeAnd"));
        errorCodeEqual = DropFolderErrorCode.get(GsonParser.parseString(jsonObject.get("errorCodeEqual")));
        errorCodeIn = GsonParser.parseString(jsonObject.get("errorCodeIn"));
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
        updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaDropFolderBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("partnerIdIn", this.partnerIdIn);
        kparams.add("nameLike", this.nameLike);
        kparams.add("typeEqual", this.typeEqual);
        kparams.add("typeIn", this.typeIn);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("conversionProfileIdEqual", this.conversionProfileIdEqual);
        kparams.add("conversionProfileIdIn", this.conversionProfileIdIn);
        kparams.add("dcEqual", this.dcEqual);
        kparams.add("dcIn", this.dcIn);
        kparams.add("pathEqual", this.pathEqual);
        kparams.add("pathLike", this.pathLike);
        kparams.add("fileHandlerTypeEqual", this.fileHandlerTypeEqual);
        kparams.add("fileHandlerTypeIn", this.fileHandlerTypeIn);
        kparams.add("fileNamePatternsLike", this.fileNamePatternsLike);
        kparams.add("fileNamePatternsMultiLikeOr", this.fileNamePatternsMultiLikeOr);
        kparams.add("fileNamePatternsMultiLikeAnd", this.fileNamePatternsMultiLikeAnd);
        kparams.add("tagsLike", this.tagsLike);
        kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
        kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
        kparams.add("errorCodeEqual", this.errorCodeEqual);
        kparams.add("errorCodeIn", this.errorCodeIn);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        return kparams;
    }

}

