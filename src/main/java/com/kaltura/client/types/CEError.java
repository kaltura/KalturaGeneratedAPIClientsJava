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
public class CEError extends ObjectBase {

    private String id;
    private Integer partnerId;
    private String browser;
    private String serverIp;
    private String serverOs;
    private String phpVersion;
    private String ceAdminEmail;
    private String type;
    private String description;
    private String data;

    // id:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // browser:
    public String getBrowser(){
        return this.browser;
    }
    public void setBrowser(String browser){
        this.browser = browser;
    }

    // serverIp:
    public String getServerIp(){
        return this.serverIp;
    }
    public void setServerIp(String serverIp){
        this.serverIp = serverIp;
    }

    // serverOs:
    public String getServerOs(){
        return this.serverOs;
    }
    public void setServerOs(String serverOs){
        this.serverOs = serverOs;
    }

    // phpVersion:
    public String getPhpVersion(){
        return this.phpVersion;
    }
    public void setPhpVersion(String phpVersion){
        this.phpVersion = phpVersion;
    }

    // ceAdminEmail:
    public String getCeAdminEmail(){
        return this.ceAdminEmail;
    }
    public void setCeAdminEmail(String ceAdminEmail){
        this.ceAdminEmail = ceAdminEmail;
    }

    // type:
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // data:
    public String getData(){
        return this.data;
    }
    public void setData(String data){
        this.data = data;
    }


    public CEError() {
       super();
    }

    public CEError(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseString(jsonObject.get("id"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        browser = GsonParser.parseString(jsonObject.get("browser"));
        serverIp = GsonParser.parseString(jsonObject.get("serverIp"));
        serverOs = GsonParser.parseString(jsonObject.get("serverOs"));
        phpVersion = GsonParser.parseString(jsonObject.get("phpVersion"));
        ceAdminEmail = GsonParser.parseString(jsonObject.get("ceAdminEmail"));
        type = GsonParser.parseString(jsonObject.get("type"));
        description = GsonParser.parseString(jsonObject.get("description"));
        data = GsonParser.parseString(jsonObject.get("data"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaCEError");
        kparams.add("partnerId", this.partnerId);
        kparams.add("browser", this.browser);
        kparams.add("serverIp", this.serverIp);
        kparams.add("serverOs", this.serverOs);
        kparams.add("phpVersion", this.phpVersion);
        kparams.add("ceAdminEmail", this.ceAdminEmail);
        kparams.add("type", this.type);
        kparams.add("description", this.description);
        kparams.add("data", this.data);
        return kparams;
    }

}

