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
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class BusinessProcessCase extends ObjectBase {

    private String id;
    private String businessProcessId;
    private Integer businessProcessStartNotificationTemplateId;
    private Boolean suspended;
    private String activityId;

    // id:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    // businessProcessId:
    public String getBusinessProcessId(){
        return this.businessProcessId;
    }
    public void setBusinessProcessId(String businessProcessId){
        this.businessProcessId = businessProcessId;
    }

    // businessProcessStartNotificationTemplateId:
    public Integer getBusinessProcessStartNotificationTemplateId(){
        return this.businessProcessStartNotificationTemplateId;
    }
    public void setBusinessProcessStartNotificationTemplateId(Integer businessProcessStartNotificationTemplateId){
        this.businessProcessStartNotificationTemplateId = businessProcessStartNotificationTemplateId;
    }

    // suspended:
    public Boolean getSuspended(){
        return this.suspended;
    }
    public void setSuspended(Boolean suspended){
        this.suspended = suspended;
    }

    // activityId:
    public String getActivityId(){
        return this.activityId;
    }
    public void setActivityId(String activityId){
        this.activityId = activityId;
    }


    public BusinessProcessCase() {
       super();
    }

    public BusinessProcessCase(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseString(jsonObject.get("id"));
        businessProcessId = GsonParser.parseString(jsonObject.get("businessProcessId"));
        businessProcessStartNotificationTemplateId = GsonParser.parseInt(jsonObject.get("businessProcessStartNotificationTemplateId"));
        suspended = GsonParser.parseBoolean(jsonObject.get("suspended"));
        activityId = GsonParser.parseString(jsonObject.get("activityId"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaBusinessProcessCase");
        kparams.add("id", this.id);
        kparams.add("businessProcessId", this.businessProcessId);
        kparams.add("businessProcessStartNotificationTemplateId", this.businessProcessStartNotificationTemplateId);
        kparams.add("suspended", this.suspended);
        kparams.add("activityId", this.activityId);
        return kparams;
    }

}

