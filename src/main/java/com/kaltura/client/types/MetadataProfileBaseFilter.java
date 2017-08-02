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
import com.kaltura.client.enums.MetadataObjectType;
import com.kaltura.client.enums.MetadataProfileCreateMode;
import com.kaltura.client.enums.MetadataProfileStatus;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class MetadataProfileBaseFilter extends Filter {

    private Integer idEqual;
    private Integer partnerIdEqual;
    private MetadataObjectType metadataObjectTypeEqual;
    private String metadataObjectTypeIn;
    private Integer versionEqual;
    private String nameEqual;
    private String systemNameEqual;
    private String systemNameIn;
    private Integer createdAtGreaterThanOrEqual;
    private Integer createdAtLessThanOrEqual;
    private Integer updatedAtGreaterThanOrEqual;
    private Integer updatedAtLessThanOrEqual;
    private MetadataProfileStatus statusEqual;
    private String statusIn;
    private MetadataProfileCreateMode createModeEqual;
    private MetadataProfileCreateMode createModeNotEqual;
    private String createModeIn;
    private String createModeNotIn;

    // idEqual:
    public Integer getIdEqual(){
        return this.idEqual;
    }
    public void setIdEqual(Integer idEqual){
        this.idEqual = idEqual;
    }

    // partnerIdEqual:
    public Integer getPartnerIdEqual(){
        return this.partnerIdEqual;
    }
    public void setPartnerIdEqual(Integer partnerIdEqual){
        this.partnerIdEqual = partnerIdEqual;
    }

    // metadataObjectTypeEqual:
    public MetadataObjectType getMetadataObjectTypeEqual(){
        return this.metadataObjectTypeEqual;
    }
    public void setMetadataObjectTypeEqual(MetadataObjectType metadataObjectTypeEqual){
        this.metadataObjectTypeEqual = metadataObjectTypeEqual;
    }

    // metadataObjectTypeIn:
    public String getMetadataObjectTypeIn(){
        return this.metadataObjectTypeIn;
    }
    public void setMetadataObjectTypeIn(String metadataObjectTypeIn){
        this.metadataObjectTypeIn = metadataObjectTypeIn;
    }

    // versionEqual:
    public Integer getVersionEqual(){
        return this.versionEqual;
    }
    public void setVersionEqual(Integer versionEqual){
        this.versionEqual = versionEqual;
    }

    // nameEqual:
    public String getNameEqual(){
        return this.nameEqual;
    }
    public void setNameEqual(String nameEqual){
        this.nameEqual = nameEqual;
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

    // statusEqual:
    public MetadataProfileStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(MetadataProfileStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // createModeEqual:
    public MetadataProfileCreateMode getCreateModeEqual(){
        return this.createModeEqual;
    }
    public void setCreateModeEqual(MetadataProfileCreateMode createModeEqual){
        this.createModeEqual = createModeEqual;
    }

    // createModeNotEqual:
    public MetadataProfileCreateMode getCreateModeNotEqual(){
        return this.createModeNotEqual;
    }
    public void setCreateModeNotEqual(MetadataProfileCreateMode createModeNotEqual){
        this.createModeNotEqual = createModeNotEqual;
    }

    // createModeIn:
    public String getCreateModeIn(){
        return this.createModeIn;
    }
    public void setCreateModeIn(String createModeIn){
        this.createModeIn = createModeIn;
    }

    // createModeNotIn:
    public String getCreateModeNotIn(){
        return this.createModeNotIn;
    }
    public void setCreateModeNotIn(String createModeNotIn){
        this.createModeNotIn = createModeNotIn;
    }


    public MetadataProfileBaseFilter() {
       super();
    }

    public MetadataProfileBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
        partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
        metadataObjectTypeEqual = MetadataObjectType.get(GsonParser.parseString(jsonObject.get("metadataObjectTypeEqual")));
        metadataObjectTypeIn = GsonParser.parseString(jsonObject.get("metadataObjectTypeIn"));
        versionEqual = GsonParser.parseInt(jsonObject.get("versionEqual"));
        nameEqual = GsonParser.parseString(jsonObject.get("nameEqual"));
        systemNameEqual = GsonParser.parseString(jsonObject.get("systemNameEqual"));
        systemNameIn = GsonParser.parseString(jsonObject.get("systemNameIn"));
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
        updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
        statusEqual = MetadataProfileStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        createModeEqual = MetadataProfileCreateMode.get(GsonParser.parseInt(jsonObject.get("createModeEqual")));
        createModeNotEqual = MetadataProfileCreateMode.get(GsonParser.parseInt(jsonObject.get("createModeNotEqual")));
        createModeIn = GsonParser.parseString(jsonObject.get("createModeIn"));
        createModeNotIn = GsonParser.parseString(jsonObject.get("createModeNotIn"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaMetadataProfileBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("metadataObjectTypeEqual", this.metadataObjectTypeEqual);
        kparams.add("metadataObjectTypeIn", this.metadataObjectTypeIn);
        kparams.add("versionEqual", this.versionEqual);
        kparams.add("nameEqual", this.nameEqual);
        kparams.add("systemNameEqual", this.systemNameEqual);
        kparams.add("systemNameIn", this.systemNameIn);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("createModeEqual", this.createModeEqual);
        kparams.add("createModeNotEqual", this.createModeNotEqual);
        kparams.add("createModeIn", this.createModeIn);
        kparams.add("createModeNotIn", this.createModeNotIn);
        return kparams;
    }

}

