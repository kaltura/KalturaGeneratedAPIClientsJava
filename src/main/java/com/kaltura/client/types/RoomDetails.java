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
// Copyright (C) 2006-2023  Kaltura Inc.
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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(RoomDetails.Tokenizer.class)
public class RoomDetails extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String serverUrl();
		String entryId();
		String token();
		String expiry();
		String serverName();
	}

	private String serverUrl;
	private String entryId;
	private String token;
	private Integer expiry;
	private String serverName;

	// serverUrl:
	public String getServerUrl(){
		return this.serverUrl;
	}
	public void setServerUrl(String serverUrl){
		this.serverUrl = serverUrl;
	}

	public void serverUrl(String multirequestToken){
		setToken("serverUrl", multirequestToken);
	}

	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}

	// token:
	public String getToken(){
		return this.token;
	}
	public void setToken(String token){
		this.token = token;
	}

	public void token(String multirequestToken){
		setToken("token", multirequestToken);
	}

	// expiry:
	public Integer getExpiry(){
		return this.expiry;
	}
	public void setExpiry(Integer expiry){
		this.expiry = expiry;
	}

	public void expiry(String multirequestToken){
		setToken("expiry", multirequestToken);
	}

	// serverName:
	public String getServerName(){
		return this.serverName;
	}
	public void setServerName(String serverName){
		this.serverName = serverName;
	}

	public void serverName(String multirequestToken){
		setToken("serverName", multirequestToken);
	}


	public RoomDetails() {
		super();
	}

	public RoomDetails(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		serverUrl = GsonParser.parseString(jsonObject.get("serverUrl"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		token = GsonParser.parseString(jsonObject.get("token"));
		expiry = GsonParser.parseInt(jsonObject.get("expiry"));
		serverName = GsonParser.parseString(jsonObject.get("serverName"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRoomDetails");
		kparams.add("serverUrl", this.serverUrl);
		kparams.add("entryId", this.entryId);
		kparams.add("token", this.token);
		kparams.add("expiry", this.expiry);
		kparams.add("serverName", this.serverName);
		return kparams;
	}

}

