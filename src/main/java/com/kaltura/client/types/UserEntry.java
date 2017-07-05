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
import com.kaltura.client.enums.UserEntryStatus;
import com.kaltura.client.enums.UserEntryType;
import com.kaltura.client.enums.UserEntryExtendedStatus;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class UserEntry extends ObjectBase {

	/**  unique auto-generated identifier  */
    private Integer id;
    private String entryId;
    private String userId;
    private Integer partnerId;
    private UserEntryStatus status;
    private Integer createdAt;
    private Integer updatedAt;
    private UserEntryType type;
    private UserEntryExtendedStatus extendedStatus;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // entryId:
    public String getEntryId(){
        return this.entryId;
    }
    public void setEntryId(String entryId){
        this.entryId = entryId;
    }

    // userId:
    public String getUserId(){
        return this.userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // status:
    public UserEntryStatus getStatus(){
        return this.status;
    }
    public void setStatus(UserEntryStatus status){
        this.status = status;
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

    // type:
    public UserEntryType getType(){
        return this.type;
    }
    public void setType(UserEntryType type){
        this.type = type;
    }

    // extendedStatus:
    public UserEntryExtendedStatus getExtendedStatus(){
        return this.extendedStatus;
    }
    public void setExtendedStatus(UserEntryExtendedStatus extendedStatus){
        this.extendedStatus = extendedStatus;
    }


    public UserEntry() {
       super();
    }

    public UserEntry(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        entryId = GsonParser.parseString(jsonObject.get("entryId"));
        userId = GsonParser.parseString(jsonObject.get("userId"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        status = UserEntryStatus.get(GsonParser.parseString(jsonObject.get("status")));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        type = UserEntryType.get(GsonParser.parseString(jsonObject.get("type")));
        extendedStatus = UserEntryExtendedStatus.get(GsonParser.parseString(jsonObject.get("extendedStatus")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaUserEntry");
        kparams.add("entryId", this.entryId);
        kparams.add("userId", this.userId);
        kparams.add("extendedStatus", this.extendedStatus);
        return kparams;
    }

}

