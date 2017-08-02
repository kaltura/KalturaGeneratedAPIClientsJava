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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class MetadataProfile extends ObjectBase {

    private Integer id;
    private Integer partnerId;
    private MetadataObjectType metadataObjectType;
    private Integer version;
    private String name;
    private String systemName;
    private String description;
    private Integer createdAt;
    private Integer updatedAt;
    private MetadataProfileStatus status;
    private String xsd;
    private String views;
    private String xslt;
    private MetadataProfileCreateMode createMode;
    private Boolean disableReIndexing;

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

    // metadataObjectType:
    public MetadataObjectType getMetadataObjectType(){
        return this.metadataObjectType;
    }
    public void setMetadataObjectType(MetadataObjectType metadataObjectType){
        this.metadataObjectType = metadataObjectType;
    }

    // version:
    public Integer getVersion(){
        return this.version;
    }
    public void setVersion(Integer version){
        this.version = version;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // systemName:
    public String getSystemName(){
        return this.systemName;
    }
    public void setSystemName(String systemName){
        this.systemName = systemName;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
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
    public MetadataProfileStatus getStatus(){
        return this.status;
    }
    public void setStatus(MetadataProfileStatus status){
        this.status = status;
    }

    // xsd:
    public String getXsd(){
        return this.xsd;
    }
    public void setXsd(String xsd){
        this.xsd = xsd;
    }

    // views:
    public String getViews(){
        return this.views;
    }
    public void setViews(String views){
        this.views = views;
    }

    // xslt:
    public String getXslt(){
        return this.xslt;
    }
    public void setXslt(String xslt){
        this.xslt = xslt;
    }

    // createMode:
    public MetadataProfileCreateMode getCreateMode(){
        return this.createMode;
    }
    public void setCreateMode(MetadataProfileCreateMode createMode){
        this.createMode = createMode;
    }

    // disableReIndexing:
    public Boolean getDisableReIndexing(){
        return this.disableReIndexing;
    }
    public void setDisableReIndexing(Boolean disableReIndexing){
        this.disableReIndexing = disableReIndexing;
    }


    public MetadataProfile() {
       super();
    }

    public MetadataProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        metadataObjectType = MetadataObjectType.get(GsonParser.parseString(jsonObject.get("metadataObjectType")));
        version = GsonParser.parseInt(jsonObject.get("version"));
        name = GsonParser.parseString(jsonObject.get("name"));
        systemName = GsonParser.parseString(jsonObject.get("systemName"));
        description = GsonParser.parseString(jsonObject.get("description"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        status = MetadataProfileStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        xsd = GsonParser.parseString(jsonObject.get("xsd"));
        views = GsonParser.parseString(jsonObject.get("views"));
        xslt = GsonParser.parseString(jsonObject.get("xslt"));
        createMode = MetadataProfileCreateMode.get(GsonParser.parseInt(jsonObject.get("createMode")));
        disableReIndexing = GsonParser.parseBoolean(jsonObject.get("disableReIndexing"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaMetadataProfile");
        kparams.add("metadataObjectType", this.metadataObjectType);
        kparams.add("name", this.name);
        kparams.add("systemName", this.systemName);
        kparams.add("description", this.description);
        kparams.add("createMode", this.createMode);
        kparams.add("disableReIndexing", this.disableReIndexing);
        return kparams;
    }

}

