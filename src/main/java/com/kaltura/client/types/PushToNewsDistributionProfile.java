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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.DistributionProtocol;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PushToNewsDistributionProfile.Tokenizer.class)
public class PushToNewsDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String protocol();
		String host();
		String ips();
		String port();
		String basePath();
		String username();
		String password();
		String certificateKey();
		String bodyXslt();
		String recentNewsTimeInterval();
	}

	private DistributionProtocol protocol;
	private String host;
	private String ips;
	private Integer port;
	private String basePath;
	private String username;
	private String password;
	private String certificateKey;
	private String bodyXslt;
	private Integer recentNewsTimeInterval;

	// protocol:
	public DistributionProtocol getProtocol(){
		return this.protocol;
	}
	public void setProtocol(DistributionProtocol protocol){
		this.protocol = protocol;
	}

	public void protocol(String multirequestToken){
		setToken("protocol", multirequestToken);
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

	// ips:
	public String getIps(){
		return this.ips;
	}
	public void setIps(String ips){
		this.ips = ips;
	}

	public void ips(String multirequestToken){
		setToken("ips", multirequestToken);
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

	// basePath:
	public String getBasePath(){
		return this.basePath;
	}
	public void setBasePath(String basePath){
		this.basePath = basePath;
	}

	public void basePath(String multirequestToken){
		setToken("basePath", multirequestToken);
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

	// certificateKey:
	public String getCertificateKey(){
		return this.certificateKey;
	}
	public void setCertificateKey(String certificateKey){
		this.certificateKey = certificateKey;
	}

	public void certificateKey(String multirequestToken){
		setToken("certificateKey", multirequestToken);
	}

	// bodyXslt:
	public String getBodyXslt(){
		return this.bodyXslt;
	}
	public void setBodyXslt(String bodyXslt){
		this.bodyXslt = bodyXslt;
	}

	public void bodyXslt(String multirequestToken){
		setToken("bodyXslt", multirequestToken);
	}

	// recentNewsTimeInterval:
	public Integer getRecentNewsTimeInterval(){
		return this.recentNewsTimeInterval;
	}
	public void setRecentNewsTimeInterval(Integer recentNewsTimeInterval){
		this.recentNewsTimeInterval = recentNewsTimeInterval;
	}

	public void recentNewsTimeInterval(String multirequestToken){
		setToken("recentNewsTimeInterval", multirequestToken);
	}


	public PushToNewsDistributionProfile() {
		super();
	}

	public PushToNewsDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		protocol = DistributionProtocol.get(GsonParser.parseInt(jsonObject.get("protocol")));
		host = GsonParser.parseString(jsonObject.get("host"));
		ips = GsonParser.parseString(jsonObject.get("ips"));
		port = GsonParser.parseInt(jsonObject.get("port"));
		basePath = GsonParser.parseString(jsonObject.get("basePath"));
		username = GsonParser.parseString(jsonObject.get("username"));
		password = GsonParser.parseString(jsonObject.get("password"));
		certificateKey = GsonParser.parseString(jsonObject.get("certificateKey"));
		bodyXslt = GsonParser.parseString(jsonObject.get("bodyXslt"));
		recentNewsTimeInterval = GsonParser.parseInt(jsonObject.get("recentNewsTimeInterval"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPushToNewsDistributionProfile");
		kparams.add("protocol", this.protocol);
		kparams.add("host", this.host);
		kparams.add("ips", this.ips);
		kparams.add("port", this.port);
		kparams.add("basePath", this.basePath);
		kparams.add("username", this.username);
		kparams.add("password", this.password);
		kparams.add("certificateKey", this.certificateKey);
		kparams.add("bodyXslt", this.bodyXslt);
		kparams.add("recentNewsTimeInterval", this.recentNewsTimeInterval);
		return kparams;
	}

}

