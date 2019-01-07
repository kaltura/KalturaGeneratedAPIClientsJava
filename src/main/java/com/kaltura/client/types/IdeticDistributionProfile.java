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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(IdeticDistributionProfile.Tokenizer.class)
public class IdeticDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String ftpPath();
		String username();
		String password();
		String domain();
	}

	private String ftpPath;
	private String username;
	private String password;
	private String domain;

	// ftpPath:
	public String getFtpPath(){
		return this.ftpPath;
	}
	public void setFtpPath(String ftpPath){
		this.ftpPath = ftpPath;
	}

	public void ftpPath(String multirequestToken){
		setToken("ftpPath", multirequestToken);
	}

	// username:
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username;
	}

	public void username(String multirequestToken){
		setToken("username", multirequestToken);
	}

	// password:
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public void password(String multirequestToken){
		setToken("password", multirequestToken);
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


	public IdeticDistributionProfile() {
		super();
	}

	public IdeticDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		ftpPath = GsonParser.parseString(jsonObject.get("ftpPath"));
		username = GsonParser.parseString(jsonObject.get("username"));
		password = GsonParser.parseString(jsonObject.get("password"));
		domain = GsonParser.parseString(jsonObject.get("domain"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIdeticDistributionProfile");
		kparams.add("ftpPath", this.ftpPath);
		kparams.add("username", this.username);
		kparams.add("password", this.password);
		kparams.add("domain", this.domain);
		return kparams;
	}

}

