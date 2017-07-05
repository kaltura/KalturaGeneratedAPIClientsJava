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
public class CodeCuePoint extends CuePoint {

    private String code;
    private String description;
    private Integer endTime;
	/**  Duration in milliseconds  */
    private Integer duration;

    // code:
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // endTime:
    public Integer getEndTime(){
        return this.endTime;
    }
    public void setEndTime(Integer endTime){
        this.endTime = endTime;
    }

    // duration:
    public Integer getDuration(){
        return this.duration;
    }
    public void setDuration(Integer duration){
        this.duration = duration;
    }


    public CodeCuePoint() {
       super();
    }

    public CodeCuePoint(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        code = GsonParser.parseString(jsonObject.get("code"));
        description = GsonParser.parseString(jsonObject.get("description"));
        endTime = GsonParser.parseInt(jsonObject.get("endTime"));
        duration = GsonParser.parseInt(jsonObject.get("duration"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaCodeCuePoint");
        kparams.add("code", this.code);
        kparams.add("description", this.description);
        kparams.add("endTime", this.endTime);
        return kparams;
    }

}

