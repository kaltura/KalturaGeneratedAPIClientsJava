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
@MultiRequestBuilder.Tokenizer(CEError.Tokenizer.class)
public class CEError extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String browser();
		String serverIp();
		String serverOs();
		String phpVersion();
		String ceAdminEmail();
		String type();
		String description();
		String data();
	}

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
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	public void setPartnerId(Integer partnerId){
		this.partnerId = partnerId;
	}

	public void partnerId(String multirequestToken){
		setToken("partnerId", multirequestToken);
	}

	// browser:
	public String getBrowser(){
		return this.browser;
	}
	public void setBrowser(String browser){
		this.browser = browser;
	}

	public void browser(String multirequestToken){
		setToken("browser", multirequestToken);
	}

	// serverIp:
	public String getServerIp(){
		return this.serverIp;
	}
	public void setServerIp(String serverIp){
		this.serverIp = serverIp;
	}

	public void serverIp(String multirequestToken){
		setToken("serverIp", multirequestToken);
	}

	// serverOs:
	public String getServerOs(){
		return this.serverOs;
	}
	public void setServerOs(String serverOs){
		this.serverOs = serverOs;
	}

	public void serverOs(String multirequestToken){
		setToken("serverOs", multirequestToken);
	}

	// phpVersion:
	public String getPhpVersion(){
		return this.phpVersion;
	}
	public void setPhpVersion(String phpVersion){
		this.phpVersion = phpVersion;
	}

	public void phpVersion(String multirequestToken){
		setToken("phpVersion", multirequestToken);
	}

	// ceAdminEmail:
	public String getCeAdminEmail(){
		return this.ceAdminEmail;
	}
	public void setCeAdminEmail(String ceAdminEmail){
		this.ceAdminEmail = ceAdminEmail;
	}

	public void ceAdminEmail(String multirequestToken){
		setToken("ceAdminEmail", multirequestToken);
	}

	// type:
	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
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

	// data:
	public String getData(){
		return this.data;
	}
	public void setData(String data){
		this.data = data;
	}

	public void data(String multirequestToken){
		setToken("data", multirequestToken);
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

