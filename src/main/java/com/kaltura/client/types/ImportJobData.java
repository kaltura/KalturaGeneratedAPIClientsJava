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

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ImportJobData extends JobData {

    private String srcFileUrl;
    private String destFileLocalPath;
    private String flavorAssetId;
    private Integer fileSize;

    // srcFileUrl:
    public String getSrcFileUrl(){
        return this.srcFileUrl;
    }
    public void setSrcFileUrl(String srcFileUrl){
        this.srcFileUrl = srcFileUrl;
    }

    // destFileLocalPath:
    public String getDestFileLocalPath(){
        return this.destFileLocalPath;
    }
    public void setDestFileLocalPath(String destFileLocalPath){
        this.destFileLocalPath = destFileLocalPath;
    }

    // flavorAssetId:
    public String getFlavorAssetId(){
        return this.flavorAssetId;
    }
    public void setFlavorAssetId(String flavorAssetId){
        this.flavorAssetId = flavorAssetId;
    }

    // fileSize:
    public Integer getFileSize(){
        return this.fileSize;
    }
    public void setFileSize(Integer fileSize){
        this.fileSize = fileSize;
    }


    public ImportJobData() {
       super();
    }

    public ImportJobData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        srcFileUrl = GsonParser.parseString(jsonObject.get("srcFileUrl"));
        destFileLocalPath = GsonParser.parseString(jsonObject.get("destFileLocalPath"));
        flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
        fileSize = GsonParser.parseInt(jsonObject.get("fileSize"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaImportJobData");
        kparams.add("srcFileUrl", this.srcFileUrl);
        kparams.add("destFileLocalPath", this.destFileLocalPath);
        kparams.add("flavorAssetId", this.flavorAssetId);
        kparams.add("fileSize", this.fileSize);
        return kparams;
    }

}

