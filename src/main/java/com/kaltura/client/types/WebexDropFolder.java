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
public class WebexDropFolder extends DropFolder {

    private String webexUserId;
    private String webexPassword;
    private Integer webexSiteId;
    private String webexPartnerId;
    private String webexServiceUrl;
    private String webexHostIdMetadataFieldName;

    // webexUserId:
    public String getWebexUserId(){
        return this.webexUserId;
    }
    public void setWebexUserId(String webexUserId){
        this.webexUserId = webexUserId;
    }

    // webexPassword:
    public String getWebexPassword(){
        return this.webexPassword;
    }
    public void setWebexPassword(String webexPassword){
        this.webexPassword = webexPassword;
    }

    // webexSiteId:
    public Integer getWebexSiteId(){
        return this.webexSiteId;
    }
    public void setWebexSiteId(Integer webexSiteId){
        this.webexSiteId = webexSiteId;
    }

    // webexPartnerId:
    public String getWebexPartnerId(){
        return this.webexPartnerId;
    }
    public void setWebexPartnerId(String webexPartnerId){
        this.webexPartnerId = webexPartnerId;
    }

    // webexServiceUrl:
    public String getWebexServiceUrl(){
        return this.webexServiceUrl;
    }
    public void setWebexServiceUrl(String webexServiceUrl){
        this.webexServiceUrl = webexServiceUrl;
    }

    // webexHostIdMetadataFieldName:
    public String getWebexHostIdMetadataFieldName(){
        return this.webexHostIdMetadataFieldName;
    }
    public void setWebexHostIdMetadataFieldName(String webexHostIdMetadataFieldName){
        this.webexHostIdMetadataFieldName = webexHostIdMetadataFieldName;
    }


    public WebexDropFolder() {
       super();
    }

    public WebexDropFolder(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        webexUserId = GsonParser.parseString(jsonObject.get("webexUserId"));
        webexPassword = GsonParser.parseString(jsonObject.get("webexPassword"));
        webexSiteId = GsonParser.parseInt(jsonObject.get("webexSiteId"));
        webexPartnerId = GsonParser.parseString(jsonObject.get("webexPartnerId"));
        webexServiceUrl = GsonParser.parseString(jsonObject.get("webexServiceUrl"));
        webexHostIdMetadataFieldName = GsonParser.parseString(jsonObject.get("webexHostIdMetadataFieldName"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaWebexDropFolder");
        kparams.add("webexUserId", this.webexUserId);
        kparams.add("webexPassword", this.webexPassword);
        kparams.add("webexSiteId", this.webexSiteId);
        kparams.add("webexPartnerId", this.webexPartnerId);
        kparams.add("webexServiceUrl", this.webexServiceUrl);
        kparams.add("webexHostIdMetadataFieldName", this.webexHostIdMetadataFieldName);
        return kparams;
    }

}

