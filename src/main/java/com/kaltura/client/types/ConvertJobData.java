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
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ConvertJobData extends ConvartableJobData {

    private String destFileSyncLocalPath;
    private String destFileSyncRemoteUrl;
    private String logFileSyncLocalPath;
    private String logFileSyncRemoteUrl;
    private String flavorAssetId;
    private String remoteMediaId;
    private String customData;
    private List<DestFileSyncDescriptor> extraDestFileSyncs;
    private String engineMessage;

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

    // logFileSyncLocalPath:
    public String getLogFileSyncLocalPath(){
        return this.logFileSyncLocalPath;
    }
    public void setLogFileSyncLocalPath(String logFileSyncLocalPath){
        this.logFileSyncLocalPath = logFileSyncLocalPath;
    }

    // logFileSyncRemoteUrl:
    public String getLogFileSyncRemoteUrl(){
        return this.logFileSyncRemoteUrl;
    }
    public void setLogFileSyncRemoteUrl(String logFileSyncRemoteUrl){
        this.logFileSyncRemoteUrl = logFileSyncRemoteUrl;
    }

    // flavorAssetId:
    public String getFlavorAssetId(){
        return this.flavorAssetId;
    }
    public void setFlavorAssetId(String flavorAssetId){
        this.flavorAssetId = flavorAssetId;
    }

    // remoteMediaId:
    public String getRemoteMediaId(){
        return this.remoteMediaId;
    }
    public void setRemoteMediaId(String remoteMediaId){
        this.remoteMediaId = remoteMediaId;
    }

    // customData:
    public String getCustomData(){
        return this.customData;
    }
    public void setCustomData(String customData){
        this.customData = customData;
    }

    // extraDestFileSyncs:
    public List<DestFileSyncDescriptor> getExtraDestFileSyncs(){
        return this.extraDestFileSyncs;
    }
    public void setExtraDestFileSyncs(List<DestFileSyncDescriptor> extraDestFileSyncs){
        this.extraDestFileSyncs = extraDestFileSyncs;
    }

    // engineMessage:
    public String getEngineMessage(){
        return this.engineMessage;
    }
    public void setEngineMessage(String engineMessage){
        this.engineMessage = engineMessage;
    }


    public ConvertJobData() {
       super();
    }

    public ConvertJobData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        destFileSyncLocalPath = GsonParser.parseString(jsonObject.get("destFileSyncLocalPath"));
        destFileSyncRemoteUrl = GsonParser.parseString(jsonObject.get("destFileSyncRemoteUrl"));
        logFileSyncLocalPath = GsonParser.parseString(jsonObject.get("logFileSyncLocalPath"));
        logFileSyncRemoteUrl = GsonParser.parseString(jsonObject.get("logFileSyncRemoteUrl"));
        flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
        remoteMediaId = GsonParser.parseString(jsonObject.get("remoteMediaId"));
        customData = GsonParser.parseString(jsonObject.get("customData"));
        extraDestFileSyncs = GsonParser.parseArray(jsonObject.getAsJsonArray("extraDestFileSyncs"), DestFileSyncDescriptor.class);
        engineMessage = GsonParser.parseString(jsonObject.get("engineMessage"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaConvertJobData");
        kparams.add("destFileSyncLocalPath", this.destFileSyncLocalPath);
        kparams.add("destFileSyncRemoteUrl", this.destFileSyncRemoteUrl);
        kparams.add("logFileSyncLocalPath", this.logFileSyncLocalPath);
        kparams.add("logFileSyncRemoteUrl", this.logFileSyncRemoteUrl);
        kparams.add("flavorAssetId", this.flavorAssetId);
        kparams.add("remoteMediaId", this.remoteMediaId);
        kparams.add("customData", this.customData);
        kparams.add("extraDestFileSyncs", this.extraDestFileSyncs);
        kparams.add("engineMessage", this.engineMessage);
        return kparams;
    }

}

