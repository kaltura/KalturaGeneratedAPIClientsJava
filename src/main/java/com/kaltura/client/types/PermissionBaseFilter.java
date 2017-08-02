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
import com.kaltura.client.enums.PermissionStatus;
import com.kaltura.client.enums.PermissionType;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class PermissionBaseFilter extends RelatedFilter {

    private Integer idEqual;
    private String idIn;
    private PermissionType typeEqual;
    private String typeIn;
    private String nameEqual;
    private String nameIn;
    private String friendlyNameLike;
    private String descriptionLike;
    private PermissionStatus statusEqual;
    private String statusIn;
    private Integer partnerIdEqual;
    private String partnerIdIn;
    private String dependsOnPermissionNamesMultiLikeOr;
    private String dependsOnPermissionNamesMultiLikeAnd;
    private String tagsMultiLikeOr;
    private String tagsMultiLikeAnd;
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

    // typeEqual:
    public PermissionType getTypeEqual(){
        return this.typeEqual;
    }
    public void setTypeEqual(PermissionType typeEqual){
        this.typeEqual = typeEqual;
    }

    // typeIn:
    public String getTypeIn(){
        return this.typeIn;
    }
    public void setTypeIn(String typeIn){
        this.typeIn = typeIn;
    }

    // nameEqual:
    public String getNameEqual(){
        return this.nameEqual;
    }
    public void setNameEqual(String nameEqual){
        this.nameEqual = nameEqual;
    }

    // nameIn:
    public String getNameIn(){
        return this.nameIn;
    }
    public void setNameIn(String nameIn){
        this.nameIn = nameIn;
    }

    // friendlyNameLike:
    public String getFriendlyNameLike(){
        return this.friendlyNameLike;
    }
    public void setFriendlyNameLike(String friendlyNameLike){
        this.friendlyNameLike = friendlyNameLike;
    }

    // descriptionLike:
    public String getDescriptionLike(){
        return this.descriptionLike;
    }
    public void setDescriptionLike(String descriptionLike){
        this.descriptionLike = descriptionLike;
    }

    // statusEqual:
    public PermissionStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(PermissionStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
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

    // dependsOnPermissionNamesMultiLikeOr:
    public String getDependsOnPermissionNamesMultiLikeOr(){
        return this.dependsOnPermissionNamesMultiLikeOr;
    }
    public void setDependsOnPermissionNamesMultiLikeOr(String dependsOnPermissionNamesMultiLikeOr){
        this.dependsOnPermissionNamesMultiLikeOr = dependsOnPermissionNamesMultiLikeOr;
    }

    // dependsOnPermissionNamesMultiLikeAnd:
    public String getDependsOnPermissionNamesMultiLikeAnd(){
        return this.dependsOnPermissionNamesMultiLikeAnd;
    }
    public void setDependsOnPermissionNamesMultiLikeAnd(String dependsOnPermissionNamesMultiLikeAnd){
        this.dependsOnPermissionNamesMultiLikeAnd = dependsOnPermissionNamesMultiLikeAnd;
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


    public PermissionBaseFilter() {
       super();
    }

    public PermissionBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
        idIn = GsonParser.parseString(jsonObject.get("idIn"));
        typeEqual = PermissionType.get(GsonParser.parseInt(jsonObject.get("typeEqual")));
        typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
        nameEqual = GsonParser.parseString(jsonObject.get("nameEqual"));
        nameIn = GsonParser.parseString(jsonObject.get("nameIn"));
        friendlyNameLike = GsonParser.parseString(jsonObject.get("friendlyNameLike"));
        descriptionLike = GsonParser.parseString(jsonObject.get("descriptionLike"));
        statusEqual = PermissionStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
        partnerIdIn = GsonParser.parseString(jsonObject.get("partnerIdIn"));
        dependsOnPermissionNamesMultiLikeOr = GsonParser.parseString(jsonObject.get("dependsOnPermissionNamesMultiLikeOr"));
        dependsOnPermissionNamesMultiLikeAnd = GsonParser.parseString(jsonObject.get("dependsOnPermissionNamesMultiLikeAnd"));
        tagsMultiLikeOr = GsonParser.parseString(jsonObject.get("tagsMultiLikeOr"));
        tagsMultiLikeAnd = GsonParser.parseString(jsonObject.get("tagsMultiLikeAnd"));
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
        updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaPermissionBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("typeEqual", this.typeEqual);
        kparams.add("typeIn", this.typeIn);
        kparams.add("nameEqual", this.nameEqual);
        kparams.add("nameIn", this.nameIn);
        kparams.add("friendlyNameLike", this.friendlyNameLike);
        kparams.add("descriptionLike", this.descriptionLike);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("partnerIdIn", this.partnerIdIn);
        kparams.add("dependsOnPermissionNamesMultiLikeOr", this.dependsOnPermissionNamesMultiLikeOr);
        kparams.add("dependsOnPermissionNamesMultiLikeAnd", this.dependsOnPermissionNamesMultiLikeAnd);
        kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
        kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        return kparams;
    }

}

