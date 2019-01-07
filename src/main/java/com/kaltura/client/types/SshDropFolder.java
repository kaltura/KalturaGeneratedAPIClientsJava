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
@MultiRequestBuilder.Tokenizer(SshDropFolder.Tokenizer.class)
public abstract class SshDropFolder extends RemoteDropFolder {
	
	public interface Tokenizer extends RemoteDropFolder.Tokenizer {
		String host();
		String port();
		String username();
		String password();
		String privateKey();
		String publicKey();
		String passPhrase();
	}

	private String host;
	private Integer port;
	private String username;
	private String password;
	private String privateKey;
	private String publicKey;
	private String passPhrase;

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

	// port:
	public Integer getPort(){
		return this.port;
	}
	public void setPort(Integer port){
		this.port = port;
	}

	public void port(String multirequestToken){
		setToken("port", multirequestToken);
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

	// privateKey:
	public String getPrivateKey(){
		return this.privateKey;
	}
	public void setPrivateKey(String privateKey){
		this.privateKey = privateKey;
	}

	public void privateKey(String multirequestToken){
		setToken("privateKey", multirequestToken);
	}

	// publicKey:
	public String getPublicKey(){
		return this.publicKey;
	}
	public void setPublicKey(String publicKey){
		this.publicKey = publicKey;
	}

	public void publicKey(String multirequestToken){
		setToken("publicKey", multirequestToken);
	}

	// passPhrase:
	public String getPassPhrase(){
		return this.passPhrase;
	}
	public void setPassPhrase(String passPhrase){
		this.passPhrase = passPhrase;
	}

	public void passPhrase(String multirequestToken){
		setToken("passPhrase", multirequestToken);
	}


	public SshDropFolder() {
		super();
	}

	public SshDropFolder(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		host = GsonParser.parseString(jsonObject.get("host"));
		port = GsonParser.parseInt(jsonObject.get("port"));
		username = GsonParser.parseString(jsonObject.get("username"));
		password = GsonParser.parseString(jsonObject.get("password"));
		privateKey = GsonParser.parseString(jsonObject.get("privateKey"));
		publicKey = GsonParser.parseString(jsonObject.get("publicKey"));
		passPhrase = GsonParser.parseString(jsonObject.get("passPhrase"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSshDropFolder");
		kparams.add("host", this.host);
		kparams.add("port", this.port);
		kparams.add("username", this.username);
		kparams.add("password", this.password);
		kparams.add("privateKey", this.privateKey);
		kparams.add("publicKey", this.publicKey);
		kparams.add("passPhrase", this.passPhrase);
		return kparams;
	}

}

