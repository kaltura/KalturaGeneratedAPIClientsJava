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
import com.kaltura.client.enums.ShortLinkStatus;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class ShortLinkBaseFilter extends Filter {

    private String idEqual;
    private String idIn;
    private Integer createdAtGreaterThanOrEqual;
    private Integer createdAtLessThanOrEqual;
    private Integer updatedAtGreaterThanOrEqual;
    private Integer updatedAtLessThanOrEqual;
    private Integer expiresAtGreaterThanOrEqual;
    private Integer expiresAtLessThanOrEqual;
    private Integer partnerIdEqual;
    private String partnerIdIn;
    private String userIdEqual;
    private String userIdIn;
    private String systemNameEqual;
    private String systemNameIn;
    private ShortLinkStatus statusEqual;
    private String statusIn;

    // idEqual:
    public String getIdEqual(){
        return this.idEqual;
    }
    public void setIdEqual(String idEqual){
        this.idEqual = idEqual;
    }

    // idIn:
    public String getIdIn(){
        return this.idIn;
    }
    public void setIdIn(String idIn){
        this.idIn = idIn;
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

    // expiresAtGreaterThanOrEqual:
    public Integer getExpiresAtGreaterThanOrEqual(){
        return this.expiresAtGreaterThanOrEqual;
    }
    public void setExpiresAtGreaterThanOrEqual(Integer expiresAtGreaterThanOrEqual){
        this.expiresAtGreaterThanOrEqual = expiresAtGreaterThanOrEqual;
    }

    // expiresAtLessThanOrEqual:
    public Integer getExpiresAtLessThanOrEqual(){
        return this.expiresAtLessThanOrEqual;
    }
    public void setExpiresAtLessThanOrEqual(Integer expiresAtLessThanOrEqual){
        this.expiresAtLessThanOrEqual = expiresAtLessThanOrEqual;
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

    // userIdEqual:
    public String getUserIdEqual(){
        return this.userIdEqual;
    }
    public void setUserIdEqual(String userIdEqual){
        this.userIdEqual = userIdEqual;
    }

    // userIdIn:
    public String getUserIdIn(){
        return this.userIdIn;
    }
    public void setUserIdIn(String userIdIn){
        this.userIdIn = userIdIn;
    }

    // systemNameEqual:
    public String getSystemNameEqual(){
        return this.systemNameEqual;
    }
    public void setSystemNameEqual(String systemNameEqual){
        this.systemNameEqual = systemNameEqual;
    }

    // systemNameIn:
    public String getSystemNameIn(){
        return this.systemNameIn;
    }
    public void setSystemNameIn(String systemNameIn){
        this.systemNameIn = systemNameIn;
    }

    // statusEqual:
    public ShortLinkStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(ShortLinkStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }


    public ShortLinkBaseFilter() {
       super();
    }

    public ShortLinkBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseString(jsonObject.get("idEqual"));
        idIn = GsonParser.parseString(jsonObject.get("idIn"));
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
        updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
        expiresAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("expiresAtGreaterThanOrEqual"));
        expiresAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("expiresAtLessThanOrEqual"));
        partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
        partnerIdIn = GsonParser.parseString(jsonObject.get("partnerIdIn"));
        userIdEqual = GsonParser.parseString(jsonObject.get("userIdEqual"));
        userIdIn = GsonParser.parseString(jsonObject.get("userIdIn"));
        systemNameEqual = GsonParser.parseString(jsonObject.get("systemNameEqual"));
        systemNameIn = GsonParser.parseString(jsonObject.get("systemNameIn"));
        statusEqual = ShortLinkStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaShortLinkBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        kparams.add("expiresAtGreaterThanOrEqual", this.expiresAtGreaterThanOrEqual);
        kparams.add("expiresAtLessThanOrEqual", this.expiresAtLessThanOrEqual);
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("partnerIdIn", this.partnerIdIn);
        kparams.add("userIdEqual", this.userIdEqual);
        kparams.add("userIdIn", this.userIdIn);
        kparams.add("systemNameEqual", this.systemNameEqual);
        kparams.add("systemNameIn", this.systemNameIn);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        return kparams;
    }

}

