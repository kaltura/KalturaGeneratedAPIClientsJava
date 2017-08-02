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
import com.kaltura.client.enums.SessionType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class SessionInfo extends ObjectBase {

    private String ks;
    private SessionType sessionType;
    private Integer partnerId;
    private String userId;
    private Integer expiry;
    private String privileges;

    // ks:
    public String getKs(){
        return this.ks;
    }
    public void setKs(String ks){
        this.ks = ks;
    }

    // sessionType:
    public SessionType getSessionType(){
        return this.sessionType;
    }
    public void setSessionType(SessionType sessionType){
        this.sessionType = sessionType;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // userId:
    public String getUserId(){
        return this.userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }

    // expiry:
    public Integer getExpiry(){
        return this.expiry;
    }
    public void setExpiry(Integer expiry){
        this.expiry = expiry;
    }

    // privileges:
    public String getPrivileges(){
        return this.privileges;
    }
    public void setPrivileges(String privileges){
        this.privileges = privileges;
    }


    public SessionInfo() {
       super();
    }

    public SessionInfo(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        ks = GsonParser.parseString(jsonObject.get("ks"));
        sessionType = SessionType.get(GsonParser.parseInt(jsonObject.get("sessionType")));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        userId = GsonParser.parseString(jsonObject.get("userId"));
        expiry = GsonParser.parseInt(jsonObject.get("expiry"));
        privileges = GsonParser.parseString(jsonObject.get("privileges"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaSessionInfo");
        return kparams;
    }

}

