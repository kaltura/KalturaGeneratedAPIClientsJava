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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.UiConfCreationMode;
import com.kaltura.client.enums.UiConfObjType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UiConf.Tokenizer.class)
public class UiConf extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String name();
		String description();
		String objType();
		String width();
		String height();
		String htmlParams();
		String swfUrl();
		String confFile();
		String confFileFeatures();
		String config();
		String confVars();
		String useCdn();
		String tags();
		String swfUrlVersion();
		String creationMode();
		String html5Url();
		String partnerTags();
	}

	private Integer id;
	/**
	 * Name of the uiConf, this is not a primary key
	 */
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
	/**
	 * Entry creation date as Unix timestamp (In seconds)
	 */
	private Integer createdAt;
	/**
	 * Entry creation date as Unix timestamp (In seconds)
	 */
	private Integer updatedAt;
	private UiConfCreationMode creationMode;
	private String html5Url;
	/**
	 * UiConf version
	 */
	private String version;
	private String partnerTags;

	// id:
	public Integer getId(){
		return this.id;
	}
	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// objType:
	public UiConfObjType getObjType(){
		return this.objType;
	}
	public void setObjType(UiConfObjType objType){
		this.objType = objType;
	}

	public void objType(String multirequestToken){
		setToken("objType", multirequestToken);
	}

	// objTypeAsString:
	public String getObjTypeAsString(){
		return this.objTypeAsString;
	}
	// width:
	public Integer getWidth(){
		return this.width;
	}
	public void setWidth(Integer width){
		this.width = width;
	}

	public void width(String multirequestToken){
		setToken("width", multirequestToken);
	}

	// height:
	public Integer getHeight(){
		return this.height;
	}
	public void setHeight(Integer height){
		this.height = height;
	}

	public void height(String multirequestToken){
		setToken("height", multirequestToken);
	}

	// htmlParams:
	public String getHtmlParams(){
		return this.htmlParams;
	}
	public void setHtmlParams(String htmlParams){
		this.htmlParams = htmlParams;
	}

	public void htmlParams(String multirequestToken){
		setToken("htmlParams", multirequestToken);
	}

	// swfUrl:
	public String getSwfUrl(){
		return this.swfUrl;
	}
	public void setSwfUrl(String swfUrl){
		this.swfUrl = swfUrl;
	}

	public void swfUrl(String multirequestToken){
		setToken("swfUrl", multirequestToken);
	}

	// confFilePath:
	public String getConfFilePath(){
		return this.confFilePath;
	}
	// confFile:
	public String getConfFile(){
		return this.confFile;
	}
	public void setConfFile(String confFile){
		this.confFile = confFile;
	}

	public void confFile(String multirequestToken){
		setToken("confFile", multirequestToken);
	}

	// confFileFeatures:
	public String getConfFileFeatures(){
		return this.confFileFeatures;
	}
	public void setConfFileFeatures(String confFileFeatures){
		this.confFileFeatures = confFileFeatures;
	}

	public void confFileFeatures(String multirequestToken){
		setToken("confFileFeatures", multirequestToken);
	}

	// config:
	public String getConfig(){
		return this.config;
	}
	public void setConfig(String config){
		this.config = config;
	}

	public void config(String multirequestToken){
		setToken("config", multirequestToken);
	}

	// confVars:
	public String getConfVars(){
		return this.confVars;
	}
	public void setConfVars(String confVars){
		this.confVars = confVars;
	}

	public void confVars(String multirequestToken){
		setToken("confVars", multirequestToken);
	}

	// useCdn:
	public Boolean getUseCdn(){
		return this.useCdn;
	}
	public void setUseCdn(Boolean useCdn){
		this.useCdn = useCdn;
	}

	public void useCdn(String multirequestToken){
		setToken("useCdn", multirequestToken);
	}

	// tags:
	public String getTags(){
		return this.tags;
	}
	public void setTags(String tags){
		this.tags = tags;
	}

	public void tags(String multirequestToken){
		setToken("tags", multirequestToken);
	}

	// swfUrlVersion:
	public String getSwfUrlVersion(){
		return this.swfUrlVersion;
	}
	public void setSwfUrlVersion(String swfUrlVersion){
		this.swfUrlVersion = swfUrlVersion;
	}

	public void swfUrlVersion(String multirequestToken){
		setToken("swfUrlVersion", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// creationMode:
	public UiConfCreationMode getCreationMode(){
		return this.creationMode;
	}
	public void setCreationMode(UiConfCreationMode creationMode){
		this.creationMode = creationMode;
	}

	public void creationMode(String multirequestToken){
		setToken("creationMode", multirequestToken);
	}

	// html5Url:
	public String getHtml5Url(){
		return this.html5Url;
	}
	public void setHtml5Url(String html5Url){
		this.html5Url = html5Url;
	}

	public void html5Url(String multirequestToken){
		setToken("html5Url", multirequestToken);
	}

	// version:
	public String getVersion(){
		return this.version;
	}
	// partnerTags:
	public String getPartnerTags(){
		return this.partnerTags;
	}
	public void setPartnerTags(String partnerTags){
		this.partnerTags = partnerTags;
	}

	public void partnerTags(String multirequestToken){
		setToken("partnerTags", multirequestToken);
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

