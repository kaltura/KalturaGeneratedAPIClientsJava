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
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ConvertProfileJobData extends JobData {

    private String inputFileSyncLocalPath;
	/**  The height of last created thumbnail, will be used to comapare if this thumbnail
	  is the best we can have  */
    private Integer thumbHeight;
	/**  The bit rate of last created thumbnail, will be used to comapare if this
	  thumbnail is the best we can have  */
    private Integer thumbBitrate;

    // inputFileSyncLocalPath:
    public String getInputFileSyncLocalPath(){
        return this.inputFileSyncLocalPath;
    }
    public void setInputFileSyncLocalPath(String inputFileSyncLocalPath){
        this.inputFileSyncLocalPath = inputFileSyncLocalPath;
    }

    // thumbHeight:
    public Integer getThumbHeight(){
        return this.thumbHeight;
    }
    public void setThumbHeight(Integer thumbHeight){
        this.thumbHeight = thumbHeight;
    }

    // thumbBitrate:
    public Integer getThumbBitrate(){
        return this.thumbBitrate;
    }
    public void setThumbBitrate(Integer thumbBitrate){
        this.thumbBitrate = thumbBitrate;
    }


    public ConvertProfileJobData() {
       super();
    }

    public ConvertProfileJobData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        inputFileSyncLocalPath = GsonParser.parseString(jsonObject.get("inputFileSyncLocalPath"));
        thumbHeight = GsonParser.parseInt(jsonObject.get("thumbHeight"));
        thumbBitrate = GsonParser.parseInt(jsonObject.get("thumbBitrate"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaConvertProfileJobData");
        kparams.add("inputFileSyncLocalPath", this.inputFileSyncLocalPath);
        kparams.add("thumbHeight", this.thumbHeight);
        kparams.add("thumbBitrate", this.thumbBitrate);
        return kparams;
    }

}

