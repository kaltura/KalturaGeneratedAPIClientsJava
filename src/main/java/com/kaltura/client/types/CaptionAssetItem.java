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
import com.kaltura.client.types.CaptionAsset;
import com.kaltura.client.types.BaseEntry;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class CaptionAssetItem extends ObjectBase {

	/**  The Caption Asset object  */
    private CaptionAsset asset;
	/**  The entry object  */
    private BaseEntry entry;
    private Integer startTime;
    private Integer endTime;
    private String content;

    // asset:
    public CaptionAsset getAsset(){
        return this.asset;
    }
    public void setAsset(CaptionAsset asset){
        this.asset = asset;
    }

    // entry:
    public BaseEntry getEntry(){
        return this.entry;
    }
    public void setEntry(BaseEntry entry){
        this.entry = entry;
    }

    // startTime:
    public Integer getStartTime(){
        return this.startTime;
    }
    public void setStartTime(Integer startTime){
        this.startTime = startTime;
    }

    // endTime:
    public Integer getEndTime(){
        return this.endTime;
    }
    public void setEndTime(Integer endTime){
        this.endTime = endTime;
    }

    // content:
    public String getContent(){
        return this.content;
    }
    public void setContent(String content){
        this.content = content;
    }


    public CaptionAssetItem() {
       super();
    }

    public CaptionAssetItem(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        asset = GsonParser.parseObject(jsonObject.getAsJsonObject("asset"), CaptionAsset.class);
        entry = GsonParser.parseObject(jsonObject.getAsJsonObject("entry"), BaseEntry.class);
        startTime = GsonParser.parseInt(jsonObject.get("startTime"));
        endTime = GsonParser.parseInt(jsonObject.get("endTime"));
        content = GsonParser.parseString(jsonObject.get("content"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaCaptionAssetItem");
        kparams.add("asset", this.asset);
        kparams.add("entry", this.entry);
        kparams.add("startTime", this.startTime);
        kparams.add("endTime", this.endTime);
        kparams.add("content", this.content);
        return kparams;
    }

}

