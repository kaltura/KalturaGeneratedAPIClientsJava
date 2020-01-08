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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.enums.ShortLinkStatus;
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
@MultiRequestBuilder.Tokenizer(ShortLink.Tokenizer.class)
public class ShortLink extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String createdAt();
		String updatedAt();
		String expiresAt();
		String partnerId();
		String userId();
		String name();
		String systemName();
		String fullUrl();
		String status();
	}

	private String id;
	private Integer createdAt;
	private Integer updatedAt;
	private Integer expiresAt;
	private Integer partnerId;
	private String userId;
	private String name;
	private String systemName;
	private String fullUrl;
	private ShortLinkStatus status;

	// id:
	public String getId(){
		return this.id;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// expiresAt:
	public Integer getExpiresAt(){
		return this.expiresAt;
	}
	public void setExpiresAt(Integer expiresAt){
		this.expiresAt = expiresAt;
	}

	public void expiresAt(String multirequestToken){
		setToken("expiresAt", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// userId:
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
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

	// systemName:
	public String getSystemName(){
		return this.systemName;
	}
	public void setSystemName(String systemName){
		this.systemName = systemName;
	}

	public void systemName(String multirequestToken){
		setToken("systemName", multirequestToken);
	}

	// fullUrl:
	public String getFullUrl(){
		return this.fullUrl;
	}
	public void setFullUrl(String fullUrl){
		this.fullUrl = fullUrl;
	}

	public void fullUrl(String multirequestToken){
		setToken("fullUrl", multirequestToken);
	}

	// status:
	public ShortLinkStatus getStatus(){
		return this.status;
	}
	public void setStatus(ShortLinkStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}


	public ShortLink() {
		super();
	}

	public ShortLink(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		expiresAt = GsonParser.parseInt(jsonObject.get("expiresAt"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		fullUrl = GsonParser.parseString(jsonObject.get("fullUrl"));
		status = ShortLinkStatus.get(GsonParser.parseInt(jsonObject.get("status")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaShortLink");
		kparams.add("expiresAt", this.expiresAt);
		kparams.add("userId", this.userId);
		kparams.add("name", this.name);
		kparams.add("systemName", this.systemName);
		kparams.add("fullUrl", this.fullUrl);
		kparams.add("status", this.status);
		return kparams;
	}

}

