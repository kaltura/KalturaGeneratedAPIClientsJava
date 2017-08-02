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
import com.kaltura.client.enums.LiveChannelSegmentStatus;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class LiveChannelSegmentBaseFilter extends RelatedFilter {

    private Integer createdAtGreaterThanOrEqual;
    private Integer createdAtLessThanOrEqual;
    private Integer updatedAtGreaterThanOrEqual;
    private Integer updatedAtLessThanOrEqual;
    private LiveChannelSegmentStatus statusEqual;
    private String statusIn;
    private String channelIdEqual;
    private String channelIdIn;
    private Double startTimeGreaterThanOrEqual;
    private Double startTimeLessThanOrEqual;

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
    public LiveChannelSegmentStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(LiveChannelSegmentStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // channelIdEqual:
    public String getChannelIdEqual(){
        return this.channelIdEqual;
    }
    public void setChannelIdEqual(String channelIdEqual){
        this.channelIdEqual = channelIdEqual;
    }

    // channelIdIn:
    public String getChannelIdIn(){
        return this.channelIdIn;
    }
    public void setChannelIdIn(String channelIdIn){
        this.channelIdIn = channelIdIn;
    }

    // startTimeGreaterThanOrEqual:
    public Double getStartTimeGreaterThanOrEqual(){
        return this.startTimeGreaterThanOrEqual;
    }
    public void setStartTimeGreaterThanOrEqual(Double startTimeGreaterThanOrEqual){
        this.startTimeGreaterThanOrEqual = startTimeGreaterThanOrEqual;
    }

    // startTimeLessThanOrEqual:
    public Double getStartTimeLessThanOrEqual(){
        return this.startTimeLessThanOrEqual;
    }
    public void setStartTimeLessThanOrEqual(Double startTimeLessThanOrEqual){
        this.startTimeLessThanOrEqual = startTimeLessThanOrEqual;
    }


    public LiveChannelSegmentBaseFilter() {
       super();
    }

    public LiveChannelSegmentBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
        updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
        statusEqual = LiveChannelSegmentStatus.get(GsonParser.parseString(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        channelIdEqual = GsonParser.parseString(jsonObject.get("channelIdEqual"));
        channelIdIn = GsonParser.parseString(jsonObject.get("channelIdIn"));
        startTimeGreaterThanOrEqual = GsonParser.parseDouble(jsonObject.get("startTimeGreaterThanOrEqual"));
        startTimeLessThanOrEqual = GsonParser.parseDouble(jsonObject.get("startTimeLessThanOrEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaLiveChannelSegmentBaseFilter");
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("channelIdEqual", this.channelIdEqual);
        kparams.add("channelIdIn", this.channelIdIn);
        kparams.add("startTimeGreaterThanOrEqual", this.startTimeGreaterThanOrEqual);
        kparams.add("startTimeLessThanOrEqual", this.startTimeLessThanOrEqual);
        return kparams;
    }

}

