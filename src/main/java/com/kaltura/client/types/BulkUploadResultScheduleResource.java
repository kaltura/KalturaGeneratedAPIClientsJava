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
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class BulkUploadResultScheduleResource extends BulkUploadResult {

    private String resourceId;
    private String name;
    private String type;
    private String systemName;
    private String description;
    private String tags;
    private String parentType;
    private String parentSystemName;

    // resourceId:
    public String getResourceId(){
        return this.resourceId;
    }
    public void setResourceId(String resourceId){
        this.resourceId = resourceId;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // type:
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
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

    // tags:
    public String getTags(){
        return this.tags;
    }
    public void setTags(String tags){
        this.tags = tags;
    }

    // parentType:
    public String getParentType(){
        return this.parentType;
    }
    public void setParentType(String parentType){
        this.parentType = parentType;
    }

    // parentSystemName:
    public String getParentSystemName(){
        return this.parentSystemName;
    }
    public void setParentSystemName(String parentSystemName){
        this.parentSystemName = parentSystemName;
    }


    public BulkUploadResultScheduleResource() {
       super();
    }

    public BulkUploadResultScheduleResource(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        resourceId = GsonParser.parseString(jsonObject.get("resourceId"));
        name = GsonParser.parseString(jsonObject.get("name"));
        type = GsonParser.parseString(jsonObject.get("type"));
        systemName = GsonParser.parseString(jsonObject.get("systemName"));
        description = GsonParser.parseString(jsonObject.get("description"));
        tags = GsonParser.parseString(jsonObject.get("tags"));
        parentType = GsonParser.parseString(jsonObject.get("parentType"));
        parentSystemName = GsonParser.parseString(jsonObject.get("parentSystemName"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaBulkUploadResultScheduleResource");
        kparams.add("resourceId", this.resourceId);
        kparams.add("name", this.name);
        kparams.add("type", this.type);
        kparams.add("systemName", this.systemName);
        kparams.add("description", this.description);
        kparams.add("tags", this.tags);
        kparams.add("parentType", this.parentType);
        kparams.add("parentSystemName", this.parentSystemName);
        return kparams;
    }

}

