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
import com.kaltura.client.enums.LiveReportOrderBy;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class LiveReportInputFilter extends ObjectBase {

    private String entryIds;
    private Integer fromTime;
    private Integer toTime;
    private Boolean live;
    private LiveReportOrderBy orderBy;

    // entryIds:
    public String getEntryIds(){
        return this.entryIds;
    }
    public void setEntryIds(String entryIds){
        this.entryIds = entryIds;
    }

    // fromTime:
    public Integer getFromTime(){
        return this.fromTime;
    }
    public void setFromTime(Integer fromTime){
        this.fromTime = fromTime;
    }

    // toTime:
    public Integer getToTime(){
        return this.toTime;
    }
    public void setToTime(Integer toTime){
        this.toTime = toTime;
    }

    // live:
    public Boolean getLive(){
        return this.live;
    }
    public void setLive(Boolean live){
        this.live = live;
    }

    // orderBy:
    public LiveReportOrderBy getOrderBy(){
        return this.orderBy;
    }
    public void setOrderBy(LiveReportOrderBy orderBy){
        this.orderBy = orderBy;
    }


    public LiveReportInputFilter() {
       super();
    }

    public LiveReportInputFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        entryIds = GsonParser.parseString(jsonObject.get("entryIds"));
        fromTime = GsonParser.parseInt(jsonObject.get("fromTime"));
        toTime = GsonParser.parseInt(jsonObject.get("toTime"));
        live = GsonParser.parseBoolean(jsonObject.get("live"));
        orderBy = LiveReportOrderBy.get(GsonParser.parseString(jsonObject.get("orderBy")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaLiveReportInputFilter");
        kparams.add("entryIds", this.entryIds);
        kparams.add("fromTime", this.fromTime);
        kparams.add("toTime", this.toTime);
        kparams.add("live", this.live);
        kparams.add("orderBy", this.orderBy);
        return kparams;
    }

}

