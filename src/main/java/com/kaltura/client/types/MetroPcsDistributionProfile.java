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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MetroPcsDistributionProfile.Tokenizer.class)
public class MetroPcsDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String ftpHost();
		String ftpLogin();
		String ftpPass();
		String ftpPath();
		String providerName();
		String providerId();
		String copyright();
		String entitlements();
		String rating();
		String itemType();
	}

	private String ftpHost;
	private String ftpLogin;
	private String ftpPass;
	private String ftpPath;
	private String providerName;
	private String providerId;
	private String copyright;
	private String entitlements;
	private String rating;
	private String itemType;

	// ftpHost:
	public String getFtpHost(){
		return this.ftpHost;
	}
	public void setFtpHost(String ftpHost){
		this.ftpHost = ftpHost;
	}

	public void ftpHost(String multirequestToken){
		setToken("ftpHost", multirequestToken);
	}

	// ftpLogin:
	public String getFtpLogin(){
		return this.ftpLogin;
	}
	public void setFtpLogin(String ftpLogin){
		this.ftpLogin = ftpLogin;
	}

	public void ftpLogin(String multirequestToken){
		setToken("ftpLogin", multirequestToken);
	}

	// ftpPass:
	public String getFtpPass(){
		return this.ftpPass;
	}
	public void setFtpPass(String ftpPass){
		this.ftpPass = ftpPass;
	}

	public void ftpPass(String multirequestToken){
		setToken("ftpPass", multirequestToken);
	}

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

	// providerName:
	public String getProviderName(){
		return this.providerName;
	}
	public void setProviderName(String providerName){
		this.providerName = providerName;
	}

	public void providerName(String multirequestToken){
		setToken("providerName", multirequestToken);
	}

	// providerId:
	public String getProviderId(){
		return this.providerId;
	}
	public void setProviderId(String providerId){
		this.providerId = providerId;
	}

	public void providerId(String multirequestToken){
		setToken("providerId", multirequestToken);
	}

	// copyright:
	public String getCopyright(){
		return this.copyright;
	}
	public void setCopyright(String copyright){
		this.copyright = copyright;
	}

	public void copyright(String multirequestToken){
		setToken("copyright", multirequestToken);
	}

	// entitlements:
	public String getEntitlements(){
		return this.entitlements;
	}
	public void setEntitlements(String entitlements){
		this.entitlements = entitlements;
	}

	public void entitlements(String multirequestToken){
		setToken("entitlements", multirequestToken);
	}

	// rating:
	public String getRating(){
		return this.rating;
	}
	public void setRating(String rating){
		this.rating = rating;
	}

	public void rating(String multirequestToken){
		setToken("rating", multirequestToken);
	}

	// itemType:
	public String getItemType(){
		return this.itemType;
	}
	public void setItemType(String itemType){
		this.itemType = itemType;
	}

	public void itemType(String multirequestToken){
		setToken("itemType", multirequestToken);
	}


	public MetroPcsDistributionProfile() {
		super();
	}

	public MetroPcsDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		ftpHost = GsonParser.parseString(jsonObject.get("ftpHost"));
		ftpLogin = GsonParser.parseString(jsonObject.get("ftpLogin"));
		ftpPass = GsonParser.parseString(jsonObject.get("ftpPass"));
		ftpPath = GsonParser.parseString(jsonObject.get("ftpPath"));
		providerName = GsonParser.parseString(jsonObject.get("providerName"));
		providerId = GsonParser.parseString(jsonObject.get("providerId"));
		copyright = GsonParser.parseString(jsonObject.get("copyright"));
		entitlements = GsonParser.parseString(jsonObject.get("entitlements"));
		rating = GsonParser.parseString(jsonObject.get("rating"));
		itemType = GsonParser.parseString(jsonObject.get("itemType"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMetroPcsDistributionProfile");
		kparams.add("ftpHost", this.ftpHost);
		kparams.add("ftpLogin", this.ftpLogin);
		kparams.add("ftpPass", this.ftpPass);
		kparams.add("ftpPath", this.ftpPath);
		kparams.add("providerName", this.providerName);
		kparams.add("providerId", this.providerId);
		kparams.add("copyright", this.copyright);
		kparams.add("entitlements", this.entitlements);
		kparams.add("rating", this.rating);
		kparams.add("itemType", this.itemType);
		return kparams;
	}

}

