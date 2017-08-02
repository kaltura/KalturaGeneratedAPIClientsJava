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
import com.kaltura.client.enums.PartnerGroupType;
import com.kaltura.client.enums.PartnerStatus;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class PartnerBaseFilter extends Filter {

    private Integer idEqual;
    private String idIn;
    private String idNotIn;
    private String nameLike;
    private String nameMultiLikeOr;
    private String nameMultiLikeAnd;
    private String nameEqual;
    private PartnerStatus statusEqual;
    private String statusIn;
    private Integer partnerPackageEqual;
    private Integer partnerPackageGreaterThanOrEqual;
    private Integer partnerPackageLessThanOrEqual;
    private String partnerPackageIn;
    private PartnerGroupType partnerGroupTypeEqual;
    private String partnerNameDescriptionWebsiteAdminNameAdminEmailLike;

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

    // idNotIn:
    public String getIdNotIn(){
        return this.idNotIn;
    }
    public void setIdNotIn(String idNotIn){
        this.idNotIn = idNotIn;
    }

    // nameLike:
    public String getNameLike(){
        return this.nameLike;
    }
    public void setNameLike(String nameLike){
        this.nameLike = nameLike;
    }

    // nameMultiLikeOr:
    public String getNameMultiLikeOr(){
        return this.nameMultiLikeOr;
    }
    public void setNameMultiLikeOr(String nameMultiLikeOr){
        this.nameMultiLikeOr = nameMultiLikeOr;
    }

    // nameMultiLikeAnd:
    public String getNameMultiLikeAnd(){
        return this.nameMultiLikeAnd;
    }
    public void setNameMultiLikeAnd(String nameMultiLikeAnd){
        this.nameMultiLikeAnd = nameMultiLikeAnd;
    }

    // nameEqual:
    public String getNameEqual(){
        return this.nameEqual;
    }
    public void setNameEqual(String nameEqual){
        this.nameEqual = nameEqual;
    }

    // statusEqual:
    public PartnerStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(PartnerStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // partnerPackageEqual:
    public Integer getPartnerPackageEqual(){
        return this.partnerPackageEqual;
    }
    public void setPartnerPackageEqual(Integer partnerPackageEqual){
        this.partnerPackageEqual = partnerPackageEqual;
    }

    // partnerPackageGreaterThanOrEqual:
    public Integer getPartnerPackageGreaterThanOrEqual(){
        return this.partnerPackageGreaterThanOrEqual;
    }
    public void setPartnerPackageGreaterThanOrEqual(Integer partnerPackageGreaterThanOrEqual){
        this.partnerPackageGreaterThanOrEqual = partnerPackageGreaterThanOrEqual;
    }

    // partnerPackageLessThanOrEqual:
    public Integer getPartnerPackageLessThanOrEqual(){
        return this.partnerPackageLessThanOrEqual;
    }
    public void setPartnerPackageLessThanOrEqual(Integer partnerPackageLessThanOrEqual){
        this.partnerPackageLessThanOrEqual = partnerPackageLessThanOrEqual;
    }

    // partnerPackageIn:
    public String getPartnerPackageIn(){
        return this.partnerPackageIn;
    }
    public void setPartnerPackageIn(String partnerPackageIn){
        this.partnerPackageIn = partnerPackageIn;
    }

    // partnerGroupTypeEqual:
    public PartnerGroupType getPartnerGroupTypeEqual(){
        return this.partnerGroupTypeEqual;
    }
    public void setPartnerGroupTypeEqual(PartnerGroupType partnerGroupTypeEqual){
        this.partnerGroupTypeEqual = partnerGroupTypeEqual;
    }

    // partnerNameDescriptionWebsiteAdminNameAdminEmailLike:
    public String getPartnerNameDescriptionWebsiteAdminNameAdminEmailLike(){
        return this.partnerNameDescriptionWebsiteAdminNameAdminEmailLike;
    }
    public void setPartnerNameDescriptionWebsiteAdminNameAdminEmailLike(String partnerNameDescriptionWebsiteAdminNameAdminEmailLike){
        this.partnerNameDescriptionWebsiteAdminNameAdminEmailLike = partnerNameDescriptionWebsiteAdminNameAdminEmailLike;
    }


    public PartnerBaseFilter() {
       super();
    }

    public PartnerBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
        idIn = GsonParser.parseString(jsonObject.get("idIn"));
        idNotIn = GsonParser.parseString(jsonObject.get("idNotIn"));
        nameLike = GsonParser.parseString(jsonObject.get("nameLike"));
        nameMultiLikeOr = GsonParser.parseString(jsonObject.get("nameMultiLikeOr"));
        nameMultiLikeAnd = GsonParser.parseString(jsonObject.get("nameMultiLikeAnd"));
        nameEqual = GsonParser.parseString(jsonObject.get("nameEqual"));
        statusEqual = PartnerStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        partnerPackageEqual = GsonParser.parseInt(jsonObject.get("partnerPackageEqual"));
        partnerPackageGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("partnerPackageGreaterThanOrEqual"));
        partnerPackageLessThanOrEqual = GsonParser.parseInt(jsonObject.get("partnerPackageLessThanOrEqual"));
        partnerPackageIn = GsonParser.parseString(jsonObject.get("partnerPackageIn"));
        partnerGroupTypeEqual = PartnerGroupType.get(GsonParser.parseInt(jsonObject.get("partnerGroupTypeEqual")));
        partnerNameDescriptionWebsiteAdminNameAdminEmailLike = GsonParser.parseString(jsonObject.get("partnerNameDescriptionWebsiteAdminNameAdminEmailLike"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaPartnerBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("idNotIn", this.idNotIn);
        kparams.add("nameLike", this.nameLike);
        kparams.add("nameMultiLikeOr", this.nameMultiLikeOr);
        kparams.add("nameMultiLikeAnd", this.nameMultiLikeAnd);
        kparams.add("nameEqual", this.nameEqual);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("partnerPackageEqual", this.partnerPackageEqual);
        kparams.add("partnerPackageGreaterThanOrEqual", this.partnerPackageGreaterThanOrEqual);
        kparams.add("partnerPackageLessThanOrEqual", this.partnerPackageLessThanOrEqual);
        kparams.add("partnerPackageIn", this.partnerPackageIn);
        kparams.add("partnerGroupTypeEqual", this.partnerGroupTypeEqual);
        kparams.add("partnerNameDescriptionWebsiteAdminNameAdminEmailLike", this.partnerNameDescriptionWebsiteAdminNameAdminEmailLike);
        return kparams;
    }

}

