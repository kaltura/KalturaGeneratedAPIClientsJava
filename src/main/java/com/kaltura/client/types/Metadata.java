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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.enums.MetadataObjectType;
import com.kaltura.client.enums.MetadataStatus;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class Metadata extends ObjectBase {

    private Integer id;
    private Integer partnerId;
    private Integer metadataProfileId;
    private Integer metadataProfileVersion;
    private MetadataObjectType metadataObjectType;
    private String objectId;
    private Integer version;
    private Integer createdAt;
    private Integer updatedAt;
    private MetadataStatus status;
    private String xml;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // metadataProfileId:
    public Integer getMetadataProfileId(){
        return this.metadataProfileId;
    }
    public void setMetadataProfileId(Integer metadataProfileId){
        this.metadataProfileId = metadataProfileId;
    }

    // metadataProfileVersion:
    public Integer getMetadataProfileVersion(){
        return this.metadataProfileVersion;
    }
    public void setMetadataProfileVersion(Integer metadataProfileVersion){
        this.metadataProfileVersion = metadataProfileVersion;
    }

    // metadataObjectType:
    public MetadataObjectType getMetadataObjectType(){
        return this.metadataObjectType;
    }
    public void setMetadataObjectType(MetadataObjectType metadataObjectType){
        this.metadataObjectType = metadataObjectType;
    }

    // objectId:
    public String getObjectId(){
        return this.objectId;
    }
    public void setObjectId(String objectId){
        this.objectId = objectId;
    }

    // version:
    public Integer getVersion(){
        return this.version;
    }
    public void setVersion(Integer version){
        this.version = version;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // updatedAt:
    public Integer getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(Integer updatedAt){
        this.updatedAt = updatedAt;
    }

    // status:
    public MetadataStatus getStatus(){
        return this.status;
    }
    public void setStatus(MetadataStatus status){
        this.status = status;
    }

    // xml:
    public String getXml(){
        return this.xml;
    }
    public void setXml(String xml){
        this.xml = xml;
    }


    public Metadata() {
       super();
    }

    public Metadata(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));
        metadataProfileVersion = GsonParser.parseInt(jsonObject.get("metadataProfileVersion"));
        metadataObjectType = MetadataObjectType.get(GsonParser.parseString(jsonObject.get("metadataObjectType")));
        objectId = GsonParser.parseString(jsonObject.get("objectId"));
        version = GsonParser.parseInt(jsonObject.get("version"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        status = MetadataStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        xml = GsonParser.parseString(jsonObject.get("xml"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaMetadata");
        return kparams;
    }

}

