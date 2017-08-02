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
import com.kaltura.client.enums.MetadataStatus;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class MetadataBaseFilter extends RelatedFilter {

    private Integer partnerIdEqual;
    private Integer metadataProfileIdEqual;
    private String metadataProfileIdIn;
    private Integer metadataProfileVersionEqual;
    private Integer metadataProfileVersionGreaterThanOrEqual;
    private Integer metadataProfileVersionLessThanOrEqual;
	/**  When null, default is KalturaMetadataObjectType::ENTRY  */
    private MetadataObjectType metadataObjectTypeEqual;
    private String objectIdEqual;
    private String objectIdIn;
    private Integer versionEqual;
    private Integer versionGreaterThanOrEqual;
    private Integer versionLessThanOrEqual;
    private Integer createdAtGreaterThanOrEqual;
    private Integer createdAtLessThanOrEqual;
    private Integer updatedAtGreaterThanOrEqual;
    private Integer updatedAtLessThanOrEqual;
    private MetadataStatus statusEqual;
    private String statusIn;

    // partnerIdEqual:
    public Integer getPartnerIdEqual(){
        return this.partnerIdEqual;
    }
    public void setPartnerIdEqual(Integer partnerIdEqual){
        this.partnerIdEqual = partnerIdEqual;
    }

    // metadataProfileIdEqual:
    public Integer getMetadataProfileIdEqual(){
        return this.metadataProfileIdEqual;
    }
    public void setMetadataProfileIdEqual(Integer metadataProfileIdEqual){
        this.metadataProfileIdEqual = metadataProfileIdEqual;
    }

    // metadataProfileIdIn:
    public String getMetadataProfileIdIn(){
        return this.metadataProfileIdIn;
    }
    public void setMetadataProfileIdIn(String metadataProfileIdIn){
        this.metadataProfileIdIn = metadataProfileIdIn;
    }

    // metadataProfileVersionEqual:
    public Integer getMetadataProfileVersionEqual(){
        return this.metadataProfileVersionEqual;
    }
    public void setMetadataProfileVersionEqual(Integer metadataProfileVersionEqual){
        this.metadataProfileVersionEqual = metadataProfileVersionEqual;
    }

    // metadataProfileVersionGreaterThanOrEqual:
    public Integer getMetadataProfileVersionGreaterThanOrEqual(){
        return this.metadataProfileVersionGreaterThanOrEqual;
    }
    public void setMetadataProfileVersionGreaterThanOrEqual(Integer metadataProfileVersionGreaterThanOrEqual){
        this.metadataProfileVersionGreaterThanOrEqual = metadataProfileVersionGreaterThanOrEqual;
    }

    // metadataProfileVersionLessThanOrEqual:
    public Integer getMetadataProfileVersionLessThanOrEqual(){
        return this.metadataProfileVersionLessThanOrEqual;
    }
    public void setMetadataProfileVersionLessThanOrEqual(Integer metadataProfileVersionLessThanOrEqual){
        this.metadataProfileVersionLessThanOrEqual = metadataProfileVersionLessThanOrEqual;
    }

    // metadataObjectTypeEqual:
    public MetadataObjectType getMetadataObjectTypeEqual(){
        return this.metadataObjectTypeEqual;
    }
    public void setMetadataObjectTypeEqual(MetadataObjectType metadataObjectTypeEqual){
        this.metadataObjectTypeEqual = metadataObjectTypeEqual;
    }

    // objectIdEqual:
    public String getObjectIdEqual(){
        return this.objectIdEqual;
    }
    public void setObjectIdEqual(String objectIdEqual){
        this.objectIdEqual = objectIdEqual;
    }

    // objectIdIn:
    public String getObjectIdIn(){
        return this.objectIdIn;
    }
    public void setObjectIdIn(String objectIdIn){
        this.objectIdIn = objectIdIn;
    }

    // versionEqual:
    public Integer getVersionEqual(){
        return this.versionEqual;
    }
    public void setVersionEqual(Integer versionEqual){
        this.versionEqual = versionEqual;
    }

    // versionGreaterThanOrEqual:
    public Integer getVersionGreaterThanOrEqual(){
        return this.versionGreaterThanOrEqual;
    }
    public void setVersionGreaterThanOrEqual(Integer versionGreaterThanOrEqual){
        this.versionGreaterThanOrEqual = versionGreaterThanOrEqual;
    }

    // versionLessThanOrEqual:
    public Integer getVersionLessThanOrEqual(){
        return this.versionLessThanOrEqual;
    }
    public void setVersionLessThanOrEqual(Integer versionLessThanOrEqual){
        this.versionLessThanOrEqual = versionLessThanOrEqual;
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
    public MetadataStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(MetadataStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }


    public MetadataBaseFilter() {
       super();
    }

    public MetadataBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
        metadataProfileIdEqual = GsonParser.parseInt(jsonObject.get("metadataProfileIdEqual"));
        metadataProfileIdIn = GsonParser.parseString(jsonObject.get("metadataProfileIdIn"));
        metadataProfileVersionEqual = GsonParser.parseInt(jsonObject.get("metadataProfileVersionEqual"));
        metadataProfileVersionGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("metadataProfileVersionGreaterThanOrEqual"));
        metadataProfileVersionLessThanOrEqual = GsonParser.parseInt(jsonObject.get("metadataProfileVersionLessThanOrEqual"));
        metadataObjectTypeEqual = MetadataObjectType.get(GsonParser.parseString(jsonObject.get("metadataObjectTypeEqual")));
        objectIdEqual = GsonParser.parseString(jsonObject.get("objectIdEqual"));
        objectIdIn = GsonParser.parseString(jsonObject.get("objectIdIn"));
        versionEqual = GsonParser.parseInt(jsonObject.get("versionEqual"));
        versionGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("versionGreaterThanOrEqual"));
        versionLessThanOrEqual = GsonParser.parseInt(jsonObject.get("versionLessThanOrEqual"));
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
        updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
        statusEqual = MetadataStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaMetadataBaseFilter");
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("metadataProfileIdEqual", this.metadataProfileIdEqual);
        kparams.add("metadataProfileIdIn", this.metadataProfileIdIn);
        kparams.add("metadataProfileVersionEqual", this.metadataProfileVersionEqual);
        kparams.add("metadataProfileVersionGreaterThanOrEqual", this.metadataProfileVersionGreaterThanOrEqual);
        kparams.add("metadataProfileVersionLessThanOrEqual", this.metadataProfileVersionLessThanOrEqual);
        kparams.add("metadataObjectTypeEqual", this.metadataObjectTypeEqual);
        kparams.add("objectIdEqual", this.objectIdEqual);
        kparams.add("objectIdIn", this.objectIdIn);
        kparams.add("versionEqual", this.versionEqual);
        kparams.add("versionGreaterThanOrEqual", this.versionGreaterThanOrEqual);
        kparams.add("versionLessThanOrEqual", this.versionLessThanOrEqual);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        return kparams;
    }

}

