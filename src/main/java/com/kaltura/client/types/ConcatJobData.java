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
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ConcatJobData extends JobData {

	/**  Source files to be concatenated  */
    private List<StringHolder> srcFiles;
	/**  Output file  */
    private String destFilePath;
	/**  Flavor asset to be ingested with the output  */
    private String flavorAssetId;
	/**  Clipping offset in seconds  */
    private Double offset;
	/**  Clipping duration in seconds  */
    private Double duration;
	/**  duration of the concated video  */
    private Double concatenatedDuration;

    // srcFiles:
    public List<StringHolder> getSrcFiles(){
        return this.srcFiles;
    }
    public void setSrcFiles(List<StringHolder> srcFiles){
        this.srcFiles = srcFiles;
    }

    // destFilePath:
    public String getDestFilePath(){
        return this.destFilePath;
    }
    public void setDestFilePath(String destFilePath){
        this.destFilePath = destFilePath;
    }

    // flavorAssetId:
    public String getFlavorAssetId(){
        return this.flavorAssetId;
    }
    public void setFlavorAssetId(String flavorAssetId){
        this.flavorAssetId = flavorAssetId;
    }

    // offset:
    public Double getOffset(){
        return this.offset;
    }
    public void setOffset(Double offset){
        this.offset = offset;
    }

    // duration:
    public Double getDuration(){
        return this.duration;
    }
    public void setDuration(Double duration){
        this.duration = duration;
    }

    // concatenatedDuration:
    public Double getConcatenatedDuration(){
        return this.concatenatedDuration;
    }
    public void setConcatenatedDuration(Double concatenatedDuration){
        this.concatenatedDuration = concatenatedDuration;
    }


    public ConcatJobData() {
       super();
    }

    public ConcatJobData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        srcFiles = GsonParser.parseArray(jsonObject.getAsJsonArray("srcFiles"), StringHolder.class);
        destFilePath = GsonParser.parseString(jsonObject.get("destFilePath"));
        flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
        offset = GsonParser.parseDouble(jsonObject.get("offset"));
        duration = GsonParser.parseDouble(jsonObject.get("duration"));
        concatenatedDuration = GsonParser.parseDouble(jsonObject.get("concatenatedDuration"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaConcatJobData");
        kparams.add("srcFiles", this.srcFiles);
        kparams.add("destFilePath", this.destFilePath);
        kparams.add("flavorAssetId", this.flavorAssetId);
        kparams.add("offset", this.offset);
        kparams.add("duration", this.duration);
        kparams.add("concatenatedDuration", this.concatenatedDuration);
        return kparams;
    }

}

