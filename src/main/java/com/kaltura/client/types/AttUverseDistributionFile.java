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
import com.kaltura.client.enums.AssetType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class AttUverseDistributionFile extends ObjectBase {

    private String remoteFilename;
    private String localFilePath;
    private AssetType assetType;
    private String assetId;

    // remoteFilename:
    public String getRemoteFilename(){
        return this.remoteFilename;
    }
    public void setRemoteFilename(String remoteFilename){
        this.remoteFilename = remoteFilename;
    }

    // localFilePath:
    public String getLocalFilePath(){
        return this.localFilePath;
    }
    public void setLocalFilePath(String localFilePath){
        this.localFilePath = localFilePath;
    }

    // assetType:
    public AssetType getAssetType(){
        return this.assetType;
    }
    public void setAssetType(AssetType assetType){
        this.assetType = assetType;
    }

    // assetId:
    public String getAssetId(){
        return this.assetId;
    }
    public void setAssetId(String assetId){
        this.assetId = assetId;
    }


    public AttUverseDistributionFile() {
       super();
    }

    public AttUverseDistributionFile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        remoteFilename = GsonParser.parseString(jsonObject.get("remoteFilename"));
        localFilePath = GsonParser.parseString(jsonObject.get("localFilePath"));
        assetType = AssetType.get(GsonParser.parseString(jsonObject.get("assetType")));
        assetId = GsonParser.parseString(jsonObject.get("assetId"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAttUverseDistributionFile");
        kparams.add("remoteFilename", this.remoteFilename);
        kparams.add("localFilePath", this.localFilePath);
        kparams.add("assetType", this.assetType);
        kparams.add("assetId", this.assetId);
        return kparams;
    }

}

