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
public abstract class PlayableEntryBaseFilter extends BaseEntryFilter {

    private Integer lastPlayedAtGreaterThanOrEqual;
    private Integer lastPlayedAtLessThanOrEqual;
    private Integer durationLessThan;
    private Integer durationGreaterThan;
    private Integer durationLessThanOrEqual;
    private Integer durationGreaterThanOrEqual;
    private String durationTypeMatchOr;

    // lastPlayedAtGreaterThanOrEqual:
    public Integer getLastPlayedAtGreaterThanOrEqual(){
        return this.lastPlayedAtGreaterThanOrEqual;
    }
    public void setLastPlayedAtGreaterThanOrEqual(Integer lastPlayedAtGreaterThanOrEqual){
        this.lastPlayedAtGreaterThanOrEqual = lastPlayedAtGreaterThanOrEqual;
    }

    // lastPlayedAtLessThanOrEqual:
    public Integer getLastPlayedAtLessThanOrEqual(){
        return this.lastPlayedAtLessThanOrEqual;
    }
    public void setLastPlayedAtLessThanOrEqual(Integer lastPlayedAtLessThanOrEqual){
        this.lastPlayedAtLessThanOrEqual = lastPlayedAtLessThanOrEqual;
    }

    // durationLessThan:
    public Integer getDurationLessThan(){
        return this.durationLessThan;
    }
    public void setDurationLessThan(Integer durationLessThan){
        this.durationLessThan = durationLessThan;
    }

    // durationGreaterThan:
    public Integer getDurationGreaterThan(){
        return this.durationGreaterThan;
    }
    public void setDurationGreaterThan(Integer durationGreaterThan){
        this.durationGreaterThan = durationGreaterThan;
    }

    // durationLessThanOrEqual:
    public Integer getDurationLessThanOrEqual(){
        return this.durationLessThanOrEqual;
    }
    public void setDurationLessThanOrEqual(Integer durationLessThanOrEqual){
        this.durationLessThanOrEqual = durationLessThanOrEqual;
    }

    // durationGreaterThanOrEqual:
    public Integer getDurationGreaterThanOrEqual(){
        return this.durationGreaterThanOrEqual;
    }
    public void setDurationGreaterThanOrEqual(Integer durationGreaterThanOrEqual){
        this.durationGreaterThanOrEqual = durationGreaterThanOrEqual;
    }

    // durationTypeMatchOr:
    public String getDurationTypeMatchOr(){
        return this.durationTypeMatchOr;
    }
    public void setDurationTypeMatchOr(String durationTypeMatchOr){
        this.durationTypeMatchOr = durationTypeMatchOr;
    }


    public PlayableEntryBaseFilter() {
       super();
    }

    public PlayableEntryBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        lastPlayedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("lastPlayedAtGreaterThanOrEqual"));
        lastPlayedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("lastPlayedAtLessThanOrEqual"));
        durationLessThan = GsonParser.parseInt(jsonObject.get("durationLessThan"));
        durationGreaterThan = GsonParser.parseInt(jsonObject.get("durationGreaterThan"));
        durationLessThanOrEqual = GsonParser.parseInt(jsonObject.get("durationLessThanOrEqual"));
        durationGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("durationGreaterThanOrEqual"));
        durationTypeMatchOr = GsonParser.parseString(jsonObject.get("durationTypeMatchOr"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaPlayableEntryBaseFilter");
        kparams.add("lastPlayedAtGreaterThanOrEqual", this.lastPlayedAtGreaterThanOrEqual);
        kparams.add("lastPlayedAtLessThanOrEqual", this.lastPlayedAtLessThanOrEqual);
        kparams.add("durationLessThan", this.durationLessThan);
        kparams.add("durationGreaterThan", this.durationGreaterThan);
        kparams.add("durationLessThanOrEqual", this.durationLessThanOrEqual);
        kparams.add("durationGreaterThanOrEqual", this.durationGreaterThanOrEqual);
        kparams.add("durationTypeMatchOr", this.durationTypeMatchOr);
        return kparams;
    }

}

