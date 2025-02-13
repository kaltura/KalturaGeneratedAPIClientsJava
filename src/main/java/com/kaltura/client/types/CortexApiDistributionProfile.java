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
@MultiRequestBuilder.Tokenizer(CortexApiDistributionProfile.Tokenizer.class)
public class CortexApiDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String username();
		String host();
		String password();
		String folderrecordid();
		String metadataprofileid();
		String metadataprofileidpushing();
	}

	private String username;
	private String host;
	private String password;
	private String folderrecordid;
	private String metadataprofileid;
	private String metadataprofileidpushing;

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

	// host:
	public String getHost(){
		return this.host;
	}
	public void setHost(String host){
		this.host = host;
	}

	public void host(String multirequestToken){
		setToken("host", multirequestToken);
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

	// folderrecordid:
	public String getFolderrecordid(){
		return this.folderrecordid;
	}
	public void setFolderrecordid(String folderrecordid){
		this.folderrecordid = folderrecordid;
	}

	public void folderrecordid(String multirequestToken){
		setToken("folderrecordid", multirequestToken);
	}

	// metadataprofileid:
	public String getMetadataprofileid(){
		return this.metadataprofileid;
	}
	public void setMetadataprofileid(String metadataprofileid){
		this.metadataprofileid = metadataprofileid;
	}

	public void metadataprofileid(String multirequestToken){
		setToken("metadataprofileid", multirequestToken);
	}

	// metadataprofileidpushing:
	public String getMetadataprofileidpushing(){
		return this.metadataprofileidpushing;
	}
	public void setMetadataprofileidpushing(String metadataprofileidpushing){
		this.metadataprofileidpushing = metadataprofileidpushing;
	}

	public void metadataprofileidpushing(String multirequestToken){
		setToken("metadataprofileidpushing", multirequestToken);
	}


	public CortexApiDistributionProfile() {
		super();
	}

	public CortexApiDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		username = GsonParser.parseString(jsonObject.get("username"));
		host = GsonParser.parseString(jsonObject.get("host"));
		password = GsonParser.parseString(jsonObject.get("password"));
		folderrecordid = GsonParser.parseString(jsonObject.get("folderrecordid"));
		metadataprofileid = GsonParser.parseString(jsonObject.get("metadataprofileid"));
		metadataprofileidpushing = GsonParser.parseString(jsonObject.get("metadataprofileidpushing"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCortexApiDistributionProfile");
		kparams.add("username", this.username);
		kparams.add("host", this.host);
		kparams.add("password", this.password);
		kparams.add("folderrecordid", this.folderrecordid);
		kparams.add("metadataprofileid", this.metadataprofileid);
		kparams.add("metadataprofileidpushing", this.metadataprofileidpushing);
		return kparams;
	}

}

