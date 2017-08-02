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
import com.kaltura.client.enums.CuePointStatus;
import com.kaltura.client.enums.CuePointType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class CuePoint extends ObjectBase {

    private String id;
    private CuePointType cuePointType;
    private CuePointStatus status;
    private String entryId;
    private Integer partnerId;
    private Integer createdAt;
    private Integer updatedAt;
    private Integer triggeredAt;
    private String tags;
	/**  Start time in milliseconds  */
    private Integer startTime;
    private String userId;
    private String partnerData;
    private Integer partnerSortValue;
    private Boolean forceStop;
    private Integer thumbOffset;
    private String systemName;

    // id:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    // cuePointType:
    public CuePointType getCuePointType(){
        return this.cuePointType;
    }
    public void setCuePointType(CuePointType cuePointType){
        this.cuePointType = cuePointType;
    }

    // status:
    public CuePointStatus getStatus(){
        return this.status;
    }
    public void setStatus(CuePointStatus status){
        this.status = status;
    }

    // entryId:
    public String getEntryId(){
        return this.entryId;
    }
    public void setEntryId(String entryId){
        this.entryId = entryId;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
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

    // triggeredAt:
    public Integer getTriggeredAt(){
        return this.triggeredAt;
    }
    public void setTriggeredAt(Integer triggeredAt){
        this.triggeredAt = triggeredAt;
    }

    // tags:
    public String getTags(){
        return this.tags;
    }
    public void setTags(String tags){
        this.tags = tags;
    }

    // startTime:
    public Integer getStartTime(){
        return this.startTime;
    }
    public void setStartTime(Integer startTime){
        this.startTime = startTime;
    }

    // userId:
    public String getUserId(){
        return this.userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }

    // partnerData:
    public String getPartnerData(){
        return this.partnerData;
    }
    public void setPartnerData(String partnerData){
        this.partnerData = partnerData;
    }

    // partnerSortValue:
    public Integer getPartnerSortValue(){
        return this.partnerSortValue;
    }
    public void setPartnerSortValue(Integer partnerSortValue){
        this.partnerSortValue = partnerSortValue;
    }

    // forceStop:
    public Boolean getForceStop(){
        return this.forceStop;
    }
    public void setForceStop(Boolean forceStop){
        this.forceStop = forceStop;
    }

    // thumbOffset:
    public Integer getThumbOffset(){
        return this.thumbOffset;
    }
    public void setThumbOffset(Integer thumbOffset){
        this.thumbOffset = thumbOffset;
    }

    // systemName:
    public String getSystemName(){
        return this.systemName;
    }
    public void setSystemName(String systemName){
        this.systemName = systemName;
    }


    public CuePoint() {
       super();
    }

    public CuePoint(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseString(jsonObject.get("id"));
        cuePointType = CuePointType.get(GsonParser.parseString(jsonObject.get("cuePointType")));
        status = CuePointStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        entryId = GsonParser.parseString(jsonObject.get("entryId"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        triggeredAt = GsonParser.parseInt(jsonObject.get("triggeredAt"));
        tags = GsonParser.parseString(jsonObject.get("tags"));
        startTime = GsonParser.parseInt(jsonObject.get("startTime"));
        userId = GsonParser.parseString(jsonObject.get("userId"));
        partnerData = GsonParser.parseString(jsonObject.get("partnerData"));
        partnerSortValue = GsonParser.parseInt(jsonObject.get("partnerSortValue"));
        forceStop = GsonParser.parseBoolean(jsonObject.get("forceStop"));
        thumbOffset = GsonParser.parseInt(jsonObject.get("thumbOffset"));
        systemName = GsonParser.parseString(jsonObject.get("systemName"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaCuePoint");
        kparams.add("entryId", this.entryId);
        kparams.add("triggeredAt", this.triggeredAt);
        kparams.add("tags", this.tags);
        kparams.add("startTime", this.startTime);
        kparams.add("partnerData", this.partnerData);
        kparams.add("partnerSortValue", this.partnerSortValue);
        kparams.add("forceStop", this.forceStop);
        kparams.add("thumbOffset", this.thumbOffset);
        kparams.add("systemName", this.systemName);
        return kparams;
    }

}

