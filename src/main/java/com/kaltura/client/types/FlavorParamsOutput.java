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
public class FlavorParamsOutput extends FlavorParams {

    private Integer flavorParamsId;
    private String commandLinesStr;
    private String flavorParamsVersion;
    private String flavorAssetId;
    private String flavorAssetVersion;
    private Integer readyBehavior;

    // flavorParamsId:
    public Integer getFlavorParamsId(){
        return this.flavorParamsId;
    }
    public void setFlavorParamsId(Integer flavorParamsId){
        this.flavorParamsId = flavorParamsId;
    }

    // commandLinesStr:
    public String getCommandLinesStr(){
        return this.commandLinesStr;
    }
    public void setCommandLinesStr(String commandLinesStr){
        this.commandLinesStr = commandLinesStr;
    }

    // flavorParamsVersion:
    public String getFlavorParamsVersion(){
        return this.flavorParamsVersion;
    }
    public void setFlavorParamsVersion(String flavorParamsVersion){
        this.flavorParamsVersion = flavorParamsVersion;
    }

    // flavorAssetId:
    public String getFlavorAssetId(){
        return this.flavorAssetId;
    }
    public void setFlavorAssetId(String flavorAssetId){
        this.flavorAssetId = flavorAssetId;
    }

    // flavorAssetVersion:
    public String getFlavorAssetVersion(){
        return this.flavorAssetVersion;
    }
    public void setFlavorAssetVersion(String flavorAssetVersion){
        this.flavorAssetVersion = flavorAssetVersion;
    }

    // readyBehavior:
    public Integer getReadyBehavior(){
        return this.readyBehavior;
    }
    public void setReadyBehavior(Integer readyBehavior){
        this.readyBehavior = readyBehavior;
    }


    public FlavorParamsOutput() {
       super();
    }

    public FlavorParamsOutput(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        flavorParamsId = GsonParser.parseInt(jsonObject.get("flavorParamsId"));
        commandLinesStr = GsonParser.parseString(jsonObject.get("commandLinesStr"));
        flavorParamsVersion = GsonParser.parseString(jsonObject.get("flavorParamsVersion"));
        flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
        flavorAssetVersion = GsonParser.parseString(jsonObject.get("flavorAssetVersion"));
        readyBehavior = GsonParser.parseInt(jsonObject.get("readyBehavior"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaFlavorParamsOutput");
        kparams.add("flavorParamsId", this.flavorParamsId);
        kparams.add("commandLinesStr", this.commandLinesStr);
        kparams.add("flavorParamsVersion", this.flavorParamsVersion);
        kparams.add("flavorAssetId", this.flavorAssetId);
        kparams.add("flavorAssetVersion", this.flavorAssetVersion);
        kparams.add("readyBehavior", this.readyBehavior);
        return kparams;
    }

}

