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
public class FtpDistributionFile extends ObjectBase {

    private String assetId;
    private String filename;
    private String contents;
    private String localFilePath;
    private String version;
    private String hash;

    // assetId:
    public String getAssetId(){
        return this.assetId;
    }
    public void setAssetId(String assetId){
        this.assetId = assetId;
    }

    // filename:
    public String getFilename(){
        return this.filename;
    }
    public void setFilename(String filename){
        this.filename = filename;
    }

    // contents:
    public String getContents(){
        return this.contents;
    }
    public void setContents(String contents){
        this.contents = contents;
    }

    // localFilePath:
    public String getLocalFilePath(){
        return this.localFilePath;
    }
    public void setLocalFilePath(String localFilePath){
        this.localFilePath = localFilePath;
    }

    // version:
    public String getVersion(){
        return this.version;
    }
    public void setVersion(String version){
        this.version = version;
    }

    // hash:
    public String getHash(){
        return this.hash;
    }
    public void setHash(String hash){
        this.hash = hash;
    }


    public FtpDistributionFile() {
       super();
    }

    public FtpDistributionFile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        assetId = GsonParser.parseString(jsonObject.get("assetId"));
        filename = GsonParser.parseString(jsonObject.get("filename"));
        contents = GsonParser.parseString(jsonObject.get("contents"));
        localFilePath = GsonParser.parseString(jsonObject.get("localFilePath"));
        version = GsonParser.parseString(jsonObject.get("version"));
        hash = GsonParser.parseString(jsonObject.get("hash"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaFtpDistributionFile");
        kparams.add("assetId", this.assetId);
        kparams.add("filename", this.filename);
        kparams.add("contents", this.contents);
        kparams.add("localFilePath", this.localFilePath);
        kparams.add("version", this.version);
        kparams.add("hash", this.hash);
        return kparams;
    }

}
