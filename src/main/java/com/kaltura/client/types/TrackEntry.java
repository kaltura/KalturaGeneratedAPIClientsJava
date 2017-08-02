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
import com.kaltura.client.enums.TrackEntryEventType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class TrackEntry extends ObjectBase {

    private Integer id;
    private TrackEntryEventType trackEventType;
    private String psVersion;
    private String context;
    private Integer partnerId;
    private String entryId;
    private String hostName;
    private String userId;
    private String changedProperties;
    private String paramStr1;
    private String paramStr2;
    private String paramStr3;
    private String ks;
    private String description;
    private Integer createdAt;
    private Integer updatedAt;
    private String userIp;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // trackEventType:
    public TrackEntryEventType getTrackEventType(){
        return this.trackEventType;
    }
    public void setTrackEventType(TrackEntryEventType trackEventType){
        this.trackEventType = trackEventType;
    }

    // psVersion:
    public String getPsVersion(){
        return this.psVersion;
    }
    public void setPsVersion(String psVersion){
        this.psVersion = psVersion;
    }

    // context:
    public String getContext(){
        return this.context;
    }
    public void setContext(String context){
        this.context = context;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // entryId:
    public String getEntryId(){
        return this.entryId;
    }
    public void setEntryId(String entryId){
        this.entryId = entryId;
    }

    // hostName:
    public String getHostName(){
        return this.hostName;
    }
    public void setHostName(String hostName){
        this.hostName = hostName;
    }

    // userId:
    public String getUserId(){
        return this.userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }

    // changedProperties:
    public String getChangedProperties(){
        return this.changedProperties;
    }
    public void setChangedProperties(String changedProperties){
        this.changedProperties = changedProperties;
    }

    // paramStr1:
    public String getParamStr1(){
        return this.paramStr1;
    }
    public void setParamStr1(String paramStr1){
        this.paramStr1 = paramStr1;
    }

    // paramStr2:
    public String getParamStr2(){
        return this.paramStr2;
    }
    public void setParamStr2(String paramStr2){
        this.paramStr2 = paramStr2;
    }

    // paramStr3:
    public String getParamStr3(){
        return this.paramStr3;
    }
    public void setParamStr3(String paramStr3){
        this.paramStr3 = paramStr3;
    }

    // ks:
    public String getKs(){
        return this.ks;
    }
    public void setKs(String ks){
        this.ks = ks;
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

    // userIp:
    public String getUserIp(){
        return this.userIp;
    }
    public void setUserIp(String userIp){
        this.userIp = userIp;
    }


    public TrackEntry() {
       super();
    }

    public TrackEntry(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        trackEventType = TrackEntryEventType.get(GsonParser.parseInt(jsonObject.get("trackEventType")));
        psVersion = GsonParser.parseString(jsonObject.get("psVersion"));
        context = GsonParser.parseString(jsonObject.get("context"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        entryId = GsonParser.parseString(jsonObject.get("entryId"));
        hostName = GsonParser.parseString(jsonObject.get("hostName"));
        userId = GsonParser.parseString(jsonObject.get("userId"));
        changedProperties = GsonParser.parseString(jsonObject.get("changedProperties"));
        paramStr1 = GsonParser.parseString(jsonObject.get("paramStr1"));
        paramStr2 = GsonParser.parseString(jsonObject.get("paramStr2"));
        paramStr3 = GsonParser.parseString(jsonObject.get("paramStr3"));
        ks = GsonParser.parseString(jsonObject.get("ks"));
        description = GsonParser.parseString(jsonObject.get("description"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        userIp = GsonParser.parseString(jsonObject.get("userIp"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaTrackEntry");
        kparams.add("id", this.id);
        kparams.add("trackEventType", this.trackEventType);
        kparams.add("psVersion", this.psVersion);
        kparams.add("context", this.context);
        kparams.add("partnerId", this.partnerId);
        kparams.add("entryId", this.entryId);
        kparams.add("hostName", this.hostName);
        kparams.add("userId", this.userId);
        kparams.add("changedProperties", this.changedProperties);
        kparams.add("paramStr1", this.paramStr1);
        kparams.add("paramStr2", this.paramStr2);
        kparams.add("paramStr3", this.paramStr3);
        kparams.add("ks", this.ks);
        kparams.add("description", this.description);
        kparams.add("createdAt", this.createdAt);
        kparams.add("updatedAt", this.updatedAt);
        kparams.add("userIp", this.userIp);
        return kparams;
    }

}

