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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TvinciDistributionProfile.Tokenizer.class)
public class TvinciDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String ingestUrl();
		String username();
		String password();
		RequestBuilder.ListTokenizer<TvinciDistributionTag.Tokenizer> tags();
		String xsltFile();
	}

	private String ingestUrl;
	private String username;
	private String password;
	/**  Tags array for Tvinci distribution  */
	private List<TvinciDistributionTag> tags;
	private String xsltFile;

	// ingestUrl:
	public String getIngestUrl(){
		return this.ingestUrl;
	}
	public void setIngestUrl(String ingestUrl){
		this.ingestUrl = ingestUrl;
	}

	public void ingestUrl(String multirequestToken){
		setToken("ingestUrl", multirequestToken);
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

	// tags:
	public List<TvinciDistributionTag> getTags(){
		return this.tags;
	}
	public void setTags(List<TvinciDistributionTag> tags){
		this.tags = tags;
	}

	// xsltFile:
	public String getXsltFile(){
		return this.xsltFile;
	}
	public void setXsltFile(String xsltFile){
		this.xsltFile = xsltFile;
	}

	public void xsltFile(String multirequestToken){
		setToken("xsltFile", multirequestToken);
	}


	public TvinciDistributionProfile() {
		super();
	}

	public TvinciDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		ingestUrl = GsonParser.parseString(jsonObject.get("ingestUrl"));
		username = GsonParser.parseString(jsonObject.get("username"));
		password = GsonParser.parseString(jsonObject.get("password"));
		tags = GsonParser.parseArray(jsonObject.getAsJsonArray("tags"), TvinciDistributionTag.class);
		xsltFile = GsonParser.parseString(jsonObject.get("xsltFile"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTvinciDistributionProfile");
		kparams.add("ingestUrl", this.ingestUrl);
		kparams.add("username", this.username);
		kparams.add("password", this.password);
		kparams.add("tags", this.tags);
		kparams.add("xsltFile", this.xsltFile);
		return kparams;
	}

}

