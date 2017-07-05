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
import com.kaltura.client.enums.RecordingType;
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class SeriesRecording extends ObjectBase {

	/**  Kaltura unique ID representing the series recording identifier  */
    private Long id;
	/**  Kaltura EpgId  */
    private Long epgId;
	/**  Kaltura ChannelId  */
    private Long channelId;
	/**  Kaltura SeriesId  */
    private String seriesId;
	/**  Kaltura SeasonNumber  */
    private Integer seasonNumber;
	/**  Recording Type: single/series/season  */
    private RecordingType type;
	/**  Specifies when was the series recording created. Date and time represented as
	  epoch.  */
    private Long createDate;
	/**  Specifies when was the series recording last updated. Date and time represented
	  as epoch.  */
    private Long updateDate;
	/**  List of the season numbers to exclude.  */
    private List<IntegerValue> excludedSeasons;

    // id:
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }

    // epgId:
    public Long getEpgId(){
        return this.epgId;
    }
    public void setEpgId(Long epgId){
        this.epgId = epgId;
    }

    // channelId:
    public Long getChannelId(){
        return this.channelId;
    }
    public void setChannelId(Long channelId){
        this.channelId = channelId;
    }

    // seriesId:
    public String getSeriesId(){
        return this.seriesId;
    }
    public void setSeriesId(String seriesId){
        this.seriesId = seriesId;
    }

    // seasonNumber:
    public Integer getSeasonNumber(){
        return this.seasonNumber;
    }
    public void setSeasonNumber(Integer seasonNumber){
        this.seasonNumber = seasonNumber;
    }

    // type:
    public RecordingType getType(){
        return this.type;
    }
    public void setType(RecordingType type){
        this.type = type;
    }

    // createDate:
    public Long getCreateDate(){
        return this.createDate;
    }
    public void setCreateDate(Long createDate){
        this.createDate = createDate;
    }

    // updateDate:
    public Long getUpdateDate(){
        return this.updateDate;
    }
    public void setUpdateDate(Long updateDate){
        this.updateDate = updateDate;
    }

    // excludedSeasons:
    public List<IntegerValue> getExcludedSeasons(){
        return this.excludedSeasons;
    }
    public void setExcludedSeasons(List<IntegerValue> excludedSeasons){
        this.excludedSeasons = excludedSeasons;
    }


    public SeriesRecording() {
       super();
    }

    public SeriesRecording(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseLong(jsonObject.get("id"));
        epgId = GsonParser.parseLong(jsonObject.get("epgId"));
        channelId = GsonParser.parseLong(jsonObject.get("channelId"));
        seriesId = GsonParser.parseString(jsonObject.get("seriesId"));
        seasonNumber = GsonParser.parseInt(jsonObject.get("seasonNumber"));
        type = RecordingType.get(GsonParser.parseString(jsonObject.get("type")));
        createDate = GsonParser.parseLong(jsonObject.get("createDate"));
        updateDate = GsonParser.parseLong(jsonObject.get("updateDate"));
        excludedSeasons = GsonParser.parseArray(jsonObject.getAsJsonArray("excludedSeasons"), IntegerValue.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaSeriesRecording");
        kparams.add("epgId", this.epgId);
        kparams.add("channelId", this.channelId);
        kparams.add("seriesId", this.seriesId);
        kparams.add("seasonNumber", this.seasonNumber);
        kparams.add("type", this.type);
        return kparams;
    }

}

