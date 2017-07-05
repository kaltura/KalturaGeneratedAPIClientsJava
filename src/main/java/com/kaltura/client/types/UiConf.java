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
import com.kaltura.client.enums.UiConfObjType;
import com.kaltura.client.enums.UiConfCreationMode;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class UiConf extends ObjectBase {

    private Integer id;
	/**  Name of the uiConf, this is not a primary key  */
    private String name;
    private String description;
    private Integer partnerId;
    private UiConfObjType objType;
    private String objTypeAsString;
    private Integer width;
    private Integer height;
    private String htmlParams;
    private String swfUrl;
    private String confFilePath;
    private String confFile;
    private String confFileFeatures;
    private String config;
    private String confVars;
    private Boolean useCdn;
    private String tags;
    private String swfUrlVersion;
	/**  Entry creation date as Unix timestamp (In seconds)  */
    private Integer createdAt;
	/**  Entry creation date as Unix timestamp (In seconds)  */
    private Integer updatedAt;
    private UiConfCreationMode creationMode;
    private String html5Url;
	/**  UiConf version  */
    private String version;
    private String partnerTags;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // objType:
    public UiConfObjType getObjType(){
        return this.objType;
    }
    public void setObjType(UiConfObjType objType){
        this.objType = objType;
    }

    // objTypeAsString:
    public String getObjTypeAsString(){
        return this.objTypeAsString;
    }
    public void setObjTypeAsString(String objTypeAsString){
        this.objTypeAsString = objTypeAsString;
    }

    // width:
    public Integer getWidth(){
        return this.width;
    }
    public void setWidth(Integer width){
        this.width = width;
    }

    // height:
    public Integer getHeight(){
        return this.height;
    }
    public void setHeight(Integer height){
        this.height = height;
    }

    // htmlParams:
    public String getHtmlParams(){
        return this.htmlParams;
    }
    public void setHtmlParams(String htmlParams){
        this.htmlParams = htmlParams;
    }

    // swfUrl:
    public String getSwfUrl(){
        return this.swfUrl;
    }
    public void setSwfUrl(String swfUrl){
        this.swfUrl = swfUrl;
    }

    // confFilePath:
    public String getConfFilePath(){
        return this.confFilePath;
    }
    public void setConfFilePath(String confFilePath){
        this.confFilePath = confFilePath;
    }

    // confFile:
    public String getConfFile(){
        return this.confFile;
    }
    public void setConfFile(String confFile){
        this.confFile = confFile;
    }

    // confFileFeatures:
    public String getConfFileFeatures(){
        return this.confFileFeatures;
    }
    public void setConfFileFeatures(String confFileFeatures){
        this.confFileFeatures = confFileFeatures;
    }

    // config:
    public String getConfig(){
        return this.config;
    }
    public void setConfig(String config){
        this.config = config;
    }

    // confVars:
    public String getConfVars(){
        return this.confVars;
    }
    public void setConfVars(String confVars){
        this.confVars = confVars;
    }

    // useCdn:
    public Boolean getUseCdn(){
        return this.useCdn;
    }
    public void setUseCdn(Boolean useCdn){
        this.useCdn = useCdn;
    }

    // tags:
    public String getTags(){
        return this.tags;
    }
    public void setTags(String tags){
        this.tags = tags;
    }

    // swfUrlVersion:
    public String getSwfUrlVersion(){
        return this.swfUrlVersion;
    }
    public void setSwfUrlVersion(String swfUrlVersion){
        this.swfUrlVersion = swfUrlVersion;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // updatedAt:
    public Integer getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(Integer updatedAt){
        this.updatedAt = updatedAt;
    }

    // creationMode:
    public UiConfCreationMode getCreationMode(){
        return this.creationMode;
    }
    public void setCreationMode(UiConfCreationMode creationMode){
        this.creationMode = creationMode;
    }

    // html5Url:
    public String getHtml5Url(){
        return this.html5Url;
    }
    public void setHtml5Url(String html5Url){
        this.html5Url = html5Url;
    }

    // version:
    public String getVersion(){
        return this.version;
    }
    public void setVersion(String version){
        this.version = version;
    }

    // partnerTags:
    public String getPartnerTags(){
        return this.partnerTags;
    }
    public void setPartnerTags(String partnerTags){
        this.partnerTags = partnerTags;
    }


    public UiConf() {
       super();
    }

    public UiConf(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        name = GsonParser.parseString(jsonObject.get("name"));
        description = GsonParser.parseString(jsonObject.get("description"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        objType = UiConfObjType.get(GsonParser.parseInt(jsonObject.get("objType")));
        objTypeAsString = GsonParser.parseString(jsonObject.get("objTypeAsString"));
        width = GsonParser.parseInt(jsonObject.get("width"));
        height = GsonParser.parseInt(jsonObject.get("height"));
        htmlParams = GsonParser.parseString(jsonObject.get("htmlParams"));
        swfUrl = GsonParser.parseString(jsonObject.get("swfUrl"));
        confFilePath = GsonParser.parseString(jsonObject.get("confFilePath"));
        confFile = GsonParser.parseString(jsonObject.get("confFile"));
        confFileFeatures = GsonParser.parseString(jsonObject.get("confFileFeatures"));
        config = GsonParser.parseString(jsonObject.get("config"));
        confVars = GsonParser.parseString(jsonObject.get("confVars"));
        useCdn = GsonParser.parseBoolean(jsonObject.get("useCdn"));
        tags = GsonParser.parseString(jsonObject.get("tags"));
        swfUrlVersion = GsonParser.parseString(jsonObject.get("swfUrlVersion"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        creationMode = UiConfCreationMode.get(GsonParser.parseInt(jsonObject.get("creationMode")));
        html5Url = GsonParser.parseString(jsonObject.get("html5Url"));
        version = GsonParser.parseString(jsonObject.get("version"));
        partnerTags = GsonParser.parseString(jsonObject.get("partnerTags"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaUiConf");
        kparams.add("name", this.name);
        kparams.add("description", this.description);
        kparams.add("objType", this.objType);
        kparams.add("width", this.width);
        kparams.add("height", this.height);
        kparams.add("htmlParams", this.htmlParams);
        kparams.add("swfUrl", this.swfUrl);
        kparams.add("confFile", this.confFile);
        kparams.add("confFileFeatures", this.confFileFeatures);
        kparams.add("config", this.config);
        kparams.add("confVars", this.confVars);
        kparams.add("useCdn", this.useCdn);
        kparams.add("tags", this.tags);
        kparams.add("swfUrlVersion", this.swfUrlVersion);
        kparams.add("creationMode", this.creationMode);
        kparams.add("html5Url", this.html5Url);
        kparams.add("partnerTags", this.partnerTags);
        return kparams;
    }

}

