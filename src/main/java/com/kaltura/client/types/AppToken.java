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
import com.kaltura.client.enums.AppTokenHashType;
import com.kaltura.client.enums.AppTokenStatus;
import com.kaltura.client.enums.SessionType;
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
@MultiRequestBuilder.Tokenizer(AppToken.Tokenizer.class)
public class AppToken extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String token();
		String partnerId();
		String createdAt();
		String updatedAt();
		String status();
		String expiry();
		String sessionType();
		String sessionUserId();
		String sessionDuration();
		String sessionPrivileges();
		String hashType();
	}

	/**  The id of the application token  */
	private String id;
	/**  The application token  */
	private String token;
	private Integer partnerId;
	/**  Creation time as Unix timestamp (In seconds)  */
	private Integer createdAt;
	/**  Update time as Unix timestamp (In seconds)  */
	private Integer updatedAt;
	/**  Application token status  */
	private AppTokenStatus status;
	/**  Expiry time of current token (unix timestamp in seconds)  */
	private Integer expiry;
	/**  Type of KS (Kaltura Session) that created using the current token  */
	private SessionType sessionType;
	/**  User id of KS (Kaltura Session) that created using the current token  */
	private String sessionUserId;
	/**  Expiry duration of KS (Kaltura Session) that created using the current token (in
	  seconds)  */
	private Integer sessionDuration;
	/**  Comma separated privileges to be applied on KS (Kaltura Session) that created
	  using the current token  */
	private String sessionPrivileges;
	private AppTokenHashType hashType;

	// id:
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
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

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	public void setCreatedAt(Integer createdAt){
		this.createdAt = createdAt;
	}

	public void createdAt(String multirequestToken){
		setToken("createdAt", multirequestToken);
	}

	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	public void setUpdatedAt(Integer updatedAt){
		this.updatedAt = updatedAt;
	}

	public void updatedAt(String multirequestToken){
		setToken("updatedAt", multirequestToken);
	}

	// status:
	public AppTokenStatus getStatus(){
		return this.status;
	}
	public void setStatus(AppTokenStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
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

	// sessionType:
	public SessionType getSessionType(){
		return this.sessionType;
	}
	public void setSessionType(SessionType sessionType){
		this.sessionType = sessionType;
	}

	public void sessionType(String multirequestToken){
		setToken("sessionType", multirequestToken);
	}

	// sessionUserId:
	public String getSessionUserId(){
		return this.sessionUserId;
	}
	public void setSessionUserId(String sessionUserId){
		this.sessionUserId = sessionUserId;
	}

	public void sessionUserId(String multirequestToken){
		setToken("sessionUserId", multirequestToken);
	}

	// sessionDuration:
	public Integer getSessionDuration(){
		return this.sessionDuration;
	}
	public void setSessionDuration(Integer sessionDuration){
		this.sessionDuration = sessionDuration;
	}

	public void sessionDuration(String multirequestToken){
		setToken("sessionDuration", multirequestToken);
	}

	// sessionPrivileges:
	public String getSessionPrivileges(){
		return this.sessionPrivileges;
	}
	public void setSessionPrivileges(String sessionPrivileges){
		this.sessionPrivileges = sessionPrivileges;
	}

	public void sessionPrivileges(String multirequestToken){
		setToken("sessionPrivileges", multirequestToken);
	}

	// hashType:
	public AppTokenHashType getHashType(){
		return this.hashType;
	}
	public void setHashType(AppTokenHashType hashType){
		this.hashType = hashType;
	}

	public void hashType(String multirequestToken){
		setToken("hashType", multirequestToken);
	}


	public AppToken() {
		super();
	}

	public AppToken(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		token = GsonParser.parseString(jsonObject.get("token"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		status = AppTokenStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		expiry = GsonParser.parseInt(jsonObject.get("expiry"));
		sessionType = SessionType.get(GsonParser.parseInt(jsonObject.get("sessionType")));
		sessionUserId = GsonParser.parseString(jsonObject.get("sessionUserId"));
		sessionDuration = GsonParser.parseInt(jsonObject.get("sessionDuration"));
		sessionPrivileges = GsonParser.parseString(jsonObject.get("sessionPrivileges"));
		hashType = AppTokenHashType.get(GsonParser.parseString(jsonObject.get("hashType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAppToken");
		kparams.add("expiry", this.expiry);
		kparams.add("sessionType", this.sessionType);
		kparams.add("sessionUserId", this.sessionUserId);
		kparams.add("sessionDuration", this.sessionDuration);
		kparams.add("sessionPrivileges", this.sessionPrivileges);
		kparams.add("hashType", this.hashType);
		return kparams;
	}

}

