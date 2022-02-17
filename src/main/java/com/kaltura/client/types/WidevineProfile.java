// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platforms allow them to do with
// text.
//
// Copyright (C) 2006-2022  Kaltura Inc.
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
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(WidevineProfile.Tokenizer.class)
public class WidevineProfile extends DrmProfile {
	
	public interface Tokenizer extends DrmProfile.Tokenizer {
		String key();
		String iv();
		String owner();
		String portal();
		String maxGop();
		String regServerHost();
	}

	private String key;
	private String iv;
	private String owner;
	private String portal;
	private Integer maxGop;
	private String regServerHost;

	// key:
	public String getKey(){
		return this.key;
	}
	public void setKey(String key){
		this.key = key;
	}

	public void key(String multirequestToken){
		setToken("key", multirequestToken);
	}

	// iv:
	public String getIv(){
		return this.iv;
	}
	public void setIv(String iv){
		this.iv = iv;
	}

	public void iv(String multirequestToken){
		setToken("iv", multirequestToken);
	}

	// owner:
	public String getOwner(){
		return this.owner;
	}
	public void setOwner(String owner){
		this.owner = owner;
	}

	public void owner(String multirequestToken){
		setToken("owner", multirequestToken);
	}

	// portal:
	public String getPortal(){
		return this.portal;
	}
	public void setPortal(String portal){
		this.portal = portal;
	}

	public void portal(String multirequestToken){
		setToken("portal", multirequestToken);
	}

	// maxGop:
	public Integer getMaxGop(){
		return this.maxGop;
	}
	public void setMaxGop(Integer maxGop){
		this.maxGop = maxGop;
	}

	public void maxGop(String multirequestToken){
		setToken("maxGop", multirequestToken);
	}

	// regServerHost:
	public String getRegServerHost(){
		return this.regServerHost;
	}
	public void setRegServerHost(String regServerHost){
		this.regServerHost = regServerHost;
	}

	public void regServerHost(String multirequestToken){
		setToken("regServerHost", multirequestToken);
	}


	public WidevineProfile() {
		super();
	}

	public WidevineProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		key = GsonParser.parseString(jsonObject.get("key"));
		iv = GsonParser.parseString(jsonObject.get("iv"));
		owner = GsonParser.parseString(jsonObject.get("owner"));
		portal = GsonParser.parseString(jsonObject.get("portal"));
		maxGop = GsonParser.parseInt(jsonObject.get("maxGop"));
		regServerHost = GsonParser.parseString(jsonObject.get("regServerHost"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaWidevineProfile");
		kparams.add("key", this.key);
		kparams.add("iv", this.iv);
		kparams.add("owner", this.owner);
		kparams.add("portal", this.portal);
		kparams.add("maxGop", this.maxGop);
		kparams.add("regServerHost", this.regServerHost);
		return kparams;
	}

}

