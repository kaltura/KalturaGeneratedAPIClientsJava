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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FreewheelDistributionProfile.Tokenizer.class)
public class FreewheelDistributionProfile extends DistributionProfile {
	
	public interface Tokenizer extends DistributionProfile.Tokenizer {
		String apikey();
		String email();
		String sftpPass();
		String sftpLogin();
		String accountId();
		String metadataProfileId();
	}

	private String apikey;
	private String email;
	private String sftpPass;
	private String sftpLogin;
	private String accountId;
	private Integer metadataProfileId;

	// apikey:
	public String getApikey(){
		return this.apikey;
	}
	public void setApikey(String apikey){
		this.apikey = apikey;
	}

	public void apikey(String multirequestToken){
		setToken("apikey", multirequestToken);
	}

	// email:
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}

	public void email(String multirequestToken){
		setToken("email", multirequestToken);
	}

	// sftpPass:
	public String getSftpPass(){
		return this.sftpPass;
	}
	public void setSftpPass(String sftpPass){
		this.sftpPass = sftpPass;
	}

	public void sftpPass(String multirequestToken){
		setToken("sftpPass", multirequestToken);
	}

	// sftpLogin:
	public String getSftpLogin(){
		return this.sftpLogin;
	}
	public void setSftpLogin(String sftpLogin){
		this.sftpLogin = sftpLogin;
	}

	public void sftpLogin(String multirequestToken){
		setToken("sftpLogin", multirequestToken);
	}

	// accountId:
	public String getAccountId(){
		return this.accountId;
	}
	public void setAccountId(String accountId){
		this.accountId = accountId;
	}

	public void accountId(String multirequestToken){
		setToken("accountId", multirequestToken);
	}

	// metadataProfileId:
	public Integer getMetadataProfileId(){
		return this.metadataProfileId;
	}
	public void setMetadataProfileId(Integer metadataProfileId){
		this.metadataProfileId = metadataProfileId;
	}

	public void metadataProfileId(String multirequestToken){
		setToken("metadataProfileId", multirequestToken);
	}


	public FreewheelDistributionProfile() {
		super();
	}

	public FreewheelDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		apikey = GsonParser.parseString(jsonObject.get("apikey"));
		email = GsonParser.parseString(jsonObject.get("email"));
		sftpPass = GsonParser.parseString(jsonObject.get("sftpPass"));
		sftpLogin = GsonParser.parseString(jsonObject.get("sftpLogin"));
		accountId = GsonParser.parseString(jsonObject.get("accountId"));
		metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFreewheelDistributionProfile");
		kparams.add("apikey", this.apikey);
		kparams.add("email", this.email);
		kparams.add("sftpPass", this.sftpPass);
		kparams.add("sftpLogin", this.sftpLogin);
		kparams.add("accountId", this.accountId);
		kparams.add("metadataProfileId", this.metadataProfileId);
		return kparams;
	}

}

