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
import com.kaltura.client.enums.WidevineRepositorySyncMode;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class WidevineRepositorySyncJobData extends JobData {

    private WidevineRepositorySyncMode syncMode;
    private String wvAssetIds;
    private String modifiedAttributes;
    private Integer monitorSyncCompletion;

    // syncMode:
    public WidevineRepositorySyncMode getSyncMode(){
        return this.syncMode;
    }
    public void setSyncMode(WidevineRepositorySyncMode syncMode){
        this.syncMode = syncMode;
    }

    // wvAssetIds:
    public String getWvAssetIds(){
        return this.wvAssetIds;
    }
    public void setWvAssetIds(String wvAssetIds){
        this.wvAssetIds = wvAssetIds;
    }

    // modifiedAttributes:
    public String getModifiedAttributes(){
        return this.modifiedAttributes;
    }
    public void setModifiedAttributes(String modifiedAttributes){
        this.modifiedAttributes = modifiedAttributes;
    }

    // monitorSyncCompletion:
    public Integer getMonitorSyncCompletion(){
        return this.monitorSyncCompletion;
    }
    public void setMonitorSyncCompletion(Integer monitorSyncCompletion){
        this.monitorSyncCompletion = monitorSyncCompletion;
    }


    public WidevineRepositorySyncJobData() {
       super();
    }

    public WidevineRepositorySyncJobData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        syncMode = WidevineRepositorySyncMode.get(GsonParser.parseInt(jsonObject.get("syncMode")));
        wvAssetIds = GsonParser.parseString(jsonObject.get("wvAssetIds"));
        modifiedAttributes = GsonParser.parseString(jsonObject.get("modifiedAttributes"));
        monitorSyncCompletion = GsonParser.parseInt(jsonObject.get("monitorSyncCompletion"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaWidevineRepositorySyncJobData");
        kparams.add("syncMode", this.syncMode);
        kparams.add("wvAssetIds", this.wvAssetIds);
        kparams.add("modifiedAttributes", this.modifiedAttributes);
        kparams.add("monitorSyncCompletion", this.monitorSyncCompletion);
        return kparams;
    }

}

