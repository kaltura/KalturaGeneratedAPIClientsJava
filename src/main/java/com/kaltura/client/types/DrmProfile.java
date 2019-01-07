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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.enums.DrmProfileStatus;
import com.kaltura.client.enums.DrmProviderType;
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
@MultiRequestBuilder.Tokenizer(DrmProfile.Tokenizer.class)
public class DrmProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String name();
		String description();
		String provider();
		String status();
		String licenseServerUrl();
		String defaultPolicy();
		String createdAt();
		String updatedAt();
		String signingKey();
	}

	private Integer id;
	private Integer partnerId;
	private String name;
	private String description;
	private DrmProviderType provider;
	private DrmProfileStatus status;
	private String licenseServerUrl;
	private String defaultPolicy;
	private Integer createdAt;
	private Integer updatedAt;
	private String signingKey;

	// id:
	public Integer getId(){
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

	// provider:
	public DrmProviderType getProvider(){
		return this.provider;
	}
	public void setProvider(DrmProviderType provider){
		this.provider = provider;
	}

	public void provider(String multirequestToken){
		setToken("provider", multirequestToken);
	}

	// status:
	public DrmProfileStatus getStatus(){
		return this.status;
	}
	public void setStatus(DrmProfileStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// licenseServerUrl:
	public String getLicenseServerUrl(){
		return this.licenseServerUrl;
	}
	public void setLicenseServerUrl(String licenseServerUrl){
		this.licenseServerUrl = licenseServerUrl;
	}

	public void licenseServerUrl(String multirequestToken){
		setToken("licenseServerUrl", multirequestToken);
	}

	// defaultPolicy:
	public String getDefaultPolicy(){
		return this.defaultPolicy;
	}
	public void setDefaultPolicy(String defaultPolicy){
		this.defaultPolicy = defaultPolicy;
	}

	public void defaultPolicy(String multirequestToken){
		setToken("defaultPolicy", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// signingKey:
	public String getSigningKey(){
		return this.signingKey;
	}
	public void setSigningKey(String signingKey){
		this.signingKey = signingKey;
	}

	public void signingKey(String multirequestToken){
		setToken("signingKey", multirequestToken);
	}


	public DrmProfile() {
		super();
	}

	public DrmProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		description = GsonParser.parseString(jsonObject.get("description"));
		provider = DrmProviderType.get(GsonParser.parseString(jsonObject.get("provider")));
		status = DrmProfileStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		licenseServerUrl = GsonParser.parseString(jsonObject.get("licenseServerUrl"));
		defaultPolicy = GsonParser.parseString(jsonObject.get("defaultPolicy"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		signingKey = GsonParser.parseString(jsonObject.get("signingKey"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDrmProfile");
		kparams.add("partnerId", this.partnerId);
		kparams.add("name", this.name);
		kparams.add("description", this.description);
		kparams.add("provider", this.provider);
		kparams.add("status", this.status);
		kparams.add("licenseServerUrl", this.licenseServerUrl);
		kparams.add("defaultPolicy", this.defaultPolicy);
		kparams.add("signingKey", this.signingKey);
		return kparams;
	}

}

