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
import com.kaltura.client.enums.BusinessProcessServerStatus;
import com.kaltura.client.enums.BusinessProcessProvider;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class BusinessProcessServerBaseFilter extends Filter {

    private Integer idEqual;
    private String idIn;
    private String idNotIn;
    private Integer createdAtGreaterThanOrEqual;
    private Integer createdAtLessThanOrEqual;
    private Integer updatedAtGreaterThanOrEqual;
    private Integer updatedAtLessThanOrEqual;
    private Integer partnerIdEqual;
    private String partnerIdIn;
    private BusinessProcessServerStatus statusEqual;
    private BusinessProcessServerStatus statusNotEqual;
    private String statusIn;
    private String statusNotIn;
    private BusinessProcessProvider typeEqual;
    private String typeIn;
    private Integer dcEqual;
    private Integer dcEqOrNull;

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

    // statusEqual:
    public BusinessProcessServerStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(BusinessProcessServerStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusNotEqual:
    public BusinessProcessServerStatus getStatusNotEqual(){
        return this.statusNotEqual;
    }
    public void setStatusNotEqual(BusinessProcessServerStatus statusNotEqual){
        this.statusNotEqual = statusNotEqual;
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

    // typeEqual:
    public BusinessProcessProvider getTypeEqual(){
        return this.typeEqual;
    }
    public void setTypeEqual(BusinessProcessProvider typeEqual){
        this.typeEqual = typeEqual;
    }

    // typeIn:
    public String getTypeIn(){
        return this.typeIn;
    }
    public void setTypeIn(String typeIn){
        this.typeIn = typeIn;
    }

    // dcEqual:
    public Integer getDcEqual(){
        return this.dcEqual;
    }
    public void setDcEqual(Integer dcEqual){
        this.dcEqual = dcEqual;
    }

    // dcEqOrNull:
    public Integer getDcEqOrNull(){
        return this.dcEqOrNull;
    }
    public void setDcEqOrNull(Integer dcEqOrNull){
        this.dcEqOrNull = dcEqOrNull;
    }


    public BusinessProcessServerBaseFilter() {
       super();
    }

    public BusinessProcessServerBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
        idIn = GsonParser.parseString(jsonObject.get("idIn"));
        idNotIn = GsonParser.parseString(jsonObject.get("idNotIn"));
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
        updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
        partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
        partnerIdIn = GsonParser.parseString(jsonObject.get("partnerIdIn"));
        statusEqual = BusinessProcessServerStatus.get(GsonParser.parseString(jsonObject.get("statusEqual")));
        statusNotEqual = BusinessProcessServerStatus.get(GsonParser.parseString(jsonObject.get("statusNotEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        statusNotIn = GsonParser.parseString(jsonObject.get("statusNotIn"));
        typeEqual = BusinessProcessProvider.get(GsonParser.parseString(jsonObject.get("typeEqual")));
        typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
        dcEqual = GsonParser.parseInt(jsonObject.get("dcEqual"));
        dcEqOrNull = GsonParser.parseInt(jsonObject.get("dcEqOrNull"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaBusinessProcessServerBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("idNotIn", this.idNotIn);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("partnerIdIn", this.partnerIdIn);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusNotEqual", this.statusNotEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("statusNotIn", this.statusNotIn);
        kparams.add("typeEqual", this.typeEqual);
        kparams.add("typeIn", this.typeIn);
        kparams.add("dcEqual", this.dcEqual);
        kparams.add("dcEqOrNull", this.dcEqOrNull);
        return kparams;
    }

}

