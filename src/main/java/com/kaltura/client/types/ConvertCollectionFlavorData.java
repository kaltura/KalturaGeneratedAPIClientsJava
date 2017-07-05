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
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ConvertCollectionFlavorData extends ObjectBase {

    private String flavorAssetId;
    private Integer flavorParamsOutputId;
    private Integer readyBehavior;
    private Integer videoBitrate;
    private Integer audioBitrate;
    private String destFileSyncLocalPath;
    private String destFileSyncRemoteUrl;

    // flavorAssetId:
    public String getFlavorAssetId(){
        return this.flavorAssetId;
    }
    public void setFlavorAssetId(String flavorAssetId){
        this.flavorAssetId = flavorAssetId;
    }

    // flavorParamsOutputId:
    public Integer getFlavorParamsOutputId(){
        return this.flavorParamsOutputId;
    }
    public void setFlavorParamsOutputId(Integer flavorParamsOutputId){
        this.flavorParamsOutputId = flavorParamsOutputId;
    }

    // readyBehavior:
    public Integer getReadyBehavior(){
        return this.readyBehavior;
    }
    public void setReadyBehavior(Integer readyBehavior){
        this.readyBehavior = readyBehavior;
    }

    // videoBitrate:
    public Integer getVideoBitrate(){
        return this.videoBitrate;
    }
    public void setVideoBitrate(Integer videoBitrate){
        this.videoBitrate = videoBitrate;
    }

    // audioBitrate:
    public Integer getAudioBitrate(){
        return this.audioBitrate;
    }
    public void setAudioBitrate(Integer audioBitrate){
        this.audioBitrate = audioBitrate;
    }

    // destFileSyncLocalPath:
    public String getDestFileSyncLocalPath(){
        return this.destFileSyncLocalPath;
    }
    public void setDestFileSyncLocalPath(String destFileSyncLocalPath){
        this.destFileSyncLocalPath = destFileSyncLocalPath;
    }

    // destFileSyncRemoteUrl:
    public String getDestFileSyncRemoteUrl(){
        return this.destFileSyncRemoteUrl;
    }
    public void setDestFileSyncRemoteUrl(String destFileSyncRemoteUrl){
        this.destFileSyncRemoteUrl = destFileSyncRemoteUrl;
    }


    public ConvertCollectionFlavorData() {
       super();
    }

    public ConvertCollectionFlavorData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
        flavorParamsOutputId = GsonParser.parseInt(jsonObject.get("flavorParamsOutputId"));
        readyBehavior = GsonParser.parseInt(jsonObject.get("readyBehavior"));
        videoBitrate = GsonParser.parseInt(jsonObject.get("videoBitrate"));
        audioBitrate = GsonParser.parseInt(jsonObject.get("audioBitrate"));
        destFileSyncLocalPath = GsonParser.parseString(jsonObject.get("destFileSyncLocalPath"));
        destFileSyncRemoteUrl = GsonParser.parseString(jsonObject.get("destFileSyncRemoteUrl"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaConvertCollectionFlavorData");
        kparams.add("flavorAssetId", this.flavorAssetId);
        kparams.add("flavorParamsOutputId", this.flavorParamsOutputId);
        kparams.add("readyBehavior", this.readyBehavior);
        kparams.add("videoBitrate", this.videoBitrate);
        kparams.add("audioBitrate", this.audioBitrate);
        kparams.add("destFileSyncLocalPath", this.destFileSyncLocalPath);
        kparams.add("destFileSyncRemoteUrl", this.destFileSyncRemoteUrl);
        return kparams;
    }

}

