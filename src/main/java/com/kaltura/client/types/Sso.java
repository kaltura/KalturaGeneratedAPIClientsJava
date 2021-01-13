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
// Copyright (C) 2006-2021  Kaltura Inc.
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
import com.kaltura.client.enums.SsoStatus;
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
@MultiRequestBuilder.Tokenizer(Sso.Tokenizer.class)
public class Sso extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String applicationType();
		String partnerId();
		String domain();
		String status();
		String createdAt();
		String updatedAt();
		String redirectUrl();
		String data();
	}

	private Integer id;
	private String applicationType;
	private Integer partnerId;
	private String domain;
	private SsoStatus status;
	/**
	 * Creation date as Unix timestamp (In seconds)
	 */
	private Integer createdAt;
	/**
	 * Last update date as Unix timestamp (In seconds)
	 */
	private Integer updatedAt;
	/**
	 * Redirect URL for a specific application type and (partner id or domain)
	 */
	private String redirectUrl;
	private String data;

	// id:
	public Integer getId(){
		return this.id;
	}
	// applicationType:
	public String getApplicationType(){
		return this.applicationType;
	}
	public void setApplicationType(String applicationType){
		this.applicationType = applicationType;
	}

	public void applicationType(String multirequestToken){
		setToken("applicationType", multirequestToken);
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

	// domain:
	public String getDomain(){
		return this.domain;
	}
	public void setDomain(String domain){
		this.domain = domain;
	}

	public void domain(String multirequestToken){
		setToken("domain", multirequestToken);
	}

	// status:
	public SsoStatus getStatus(){
		return this.status;
	}
	public void setStatus(SsoStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// redirectUrl:
	public String getRedirectUrl(){
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl){
		this.redirectUrl = redirectUrl;
	}

	public void redirectUrl(String multirequestToken){
		setToken("redirectUrl", multirequestToken);
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


	public Sso() {
		super();
	}

	public Sso(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		applicationType = GsonParser.parseString(jsonObject.get("applicationType"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		domain = GsonParser.parseString(jsonObject.get("domain"));
		status = SsoStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		redirectUrl = GsonParser.parseString(jsonObject.get("redirectUrl"));
		data = GsonParser.parseString(jsonObject.get("data"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSso");
		kparams.add("applicationType", this.applicationType);
		kparams.add("partnerId", this.partnerId);
		kparams.add("domain", this.domain);
		kparams.add("status", this.status);
		kparams.add("redirectUrl", this.redirectUrl);
		kparams.add("data", this.data);
		return kparams;
	}

}

