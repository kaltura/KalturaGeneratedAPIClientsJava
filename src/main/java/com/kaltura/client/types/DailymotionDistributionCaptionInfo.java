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
import com.kaltura.client.enums.DailymotionDistributionCaptionAction;
import com.kaltura.client.enums.DailymotionDistributionCaptionFormat;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class DailymotionDistributionCaptionInfo extends ObjectBase {

    private String language;
    private String filePath;
    private String remoteId;
    private DailymotionDistributionCaptionAction action;
    private String version;
    private String assetId;
    private DailymotionDistributionCaptionFormat format;

    // language:
    public String getLanguage(){
        return this.language;
    }
    public void setLanguage(String language){
        this.language = language;
    }

    // filePath:
    public String getFilePath(){
        return this.filePath;
    }
    public void setFilePath(String filePath){
        this.filePath = filePath;
    }

    // remoteId:
    public String getRemoteId(){
        return this.remoteId;
    }
    public void setRemoteId(String remoteId){
        this.remoteId = remoteId;
    }

    // action:
    public DailymotionDistributionCaptionAction getAction(){
        return this.action;
    }
    public void setAction(DailymotionDistributionCaptionAction action){
        this.action = action;
    }

    // version:
    public String getVersion(){
        return this.version;
    }
    public void setVersion(String version){
        this.version = version;
    }

    // assetId:
    public String getAssetId(){
        return this.assetId;
    }
    public void setAssetId(String assetId){
        this.assetId = assetId;
    }

    // format:
    public DailymotionDistributionCaptionFormat getFormat(){
        return this.format;
    }
    public void setFormat(DailymotionDistributionCaptionFormat format){
        this.format = format;
    }


    public DailymotionDistributionCaptionInfo() {
       super();
    }

    public DailymotionDistributionCaptionInfo(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        language = GsonParser.parseString(jsonObject.get("language"));
        filePath = GsonParser.parseString(jsonObject.get("filePath"));
        remoteId = GsonParser.parseString(jsonObject.get("remoteId"));
        action = DailymotionDistributionCaptionAction.get(GsonParser.parseInt(jsonObject.get("action")));
        version = GsonParser.parseString(jsonObject.get("version"));
        assetId = GsonParser.parseString(jsonObject.get("assetId"));
        format = DailymotionDistributionCaptionFormat.get(GsonParser.parseInt(jsonObject.get("format")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaDailymotionDistributionCaptionInfo");
        kparams.add("language", this.language);
        kparams.add("filePath", this.filePath);
        kparams.add("remoteId", this.remoteId);
        kparams.add("action", this.action);
        kparams.add("version", this.version);
        kparams.add("assetId", this.assetId);
        kparams.add("format", this.format);
        return kparams;
    }

}

