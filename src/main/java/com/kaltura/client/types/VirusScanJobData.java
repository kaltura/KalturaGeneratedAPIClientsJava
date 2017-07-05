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
import com.kaltura.client.enums.VirusScanJobResult;
import com.kaltura.client.enums.VirusFoundAction;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class VirusScanJobData extends JobData {

    private String srcFilePath;
    private String flavorAssetId;
    private VirusScanJobResult scanResult;
    private VirusFoundAction virusFoundAction;

    // srcFilePath:
    public String getSrcFilePath(){
        return this.srcFilePath;
    }
    public void setSrcFilePath(String srcFilePath){
        this.srcFilePath = srcFilePath;
    }

    // flavorAssetId:
    public String getFlavorAssetId(){
        return this.flavorAssetId;
    }
    public void setFlavorAssetId(String flavorAssetId){
        this.flavorAssetId = flavorAssetId;
    }

    // scanResult:
    public VirusScanJobResult getScanResult(){
        return this.scanResult;
    }
    public void setScanResult(VirusScanJobResult scanResult){
        this.scanResult = scanResult;
    }

    // virusFoundAction:
    public VirusFoundAction getVirusFoundAction(){
        return this.virusFoundAction;
    }
    public void setVirusFoundAction(VirusFoundAction virusFoundAction){
        this.virusFoundAction = virusFoundAction;
    }


    public VirusScanJobData() {
       super();
    }

    public VirusScanJobData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        srcFilePath = GsonParser.parseString(jsonObject.get("srcFilePath"));
        flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
        scanResult = VirusScanJobResult.get(GsonParser.parseInt(jsonObject.get("scanResult")));
        virusFoundAction = VirusFoundAction.get(GsonParser.parseInt(jsonObject.get("virusFoundAction")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaVirusScanJobData");
        kparams.add("srcFilePath", this.srcFilePath);
        kparams.add("flavorAssetId", this.flavorAssetId);
        kparams.add("scanResult", this.scanResult);
        kparams.add("virusFoundAction", this.virusFoundAction);
        return kparams;
    }

}

