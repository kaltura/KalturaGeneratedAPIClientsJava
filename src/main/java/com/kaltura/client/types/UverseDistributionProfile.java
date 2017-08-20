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

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UverseDistributionProfile.Tokenizer.class)
public class UverseDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String feedUrl();
		String channelTitle();
		String channelLink();
		String channelDescription();
		String channelLanguage();
		String channelCopyright();
		String channelImageTitle();
		String channelImageUrl();
		String channelImageLink();
		String ftpHost();
		String ftpLogin();
		String ftpPassword();
	}

	private String feedUrl;
	private String channelTitle;
	private String channelLink;
	private String channelDescription;
	private String channelLanguage;
	private String channelCopyright;
	private String channelImageTitle;
	private String channelImageUrl;
	private String channelImageLink;
	private String ftpHost;
	private String ftpLogin;
	private String ftpPassword;

	// feedUrl:
	public String getFeedUrl(){
		return this.feedUrl;
	}
	public void setFeedUrl(String feedUrl){
		this.feedUrl = feedUrl;
	}

	public void feedUrl(String multirequestToken){
		setToken("feedUrl", multirequestToken);
	}

	// channelTitle:
	public String getChannelTitle(){
		return this.channelTitle;
	}
	public void setChannelTitle(String channelTitle){
		this.channelTitle = channelTitle;
	}

	public void channelTitle(String multirequestToken){
		setToken("channelTitle", multirequestToken);
	}

	// channelLink:
	public String getChannelLink(){
		return this.channelLink;
	}
	public void setChannelLink(String channelLink){
		this.channelLink = channelLink;
	}

	public void channelLink(String multirequestToken){
		setToken("channelLink", multirequestToken);
	}

	// channelDescription:
	public String getChannelDescription(){
		return this.channelDescription;
	}
	public void setChannelDescription(String channelDescription){
		this.channelDescription = channelDescription;
	}

	public void channelDescription(String multirequestToken){
		setToken("channelDescription", multirequestToken);
	}

	// channelLanguage:
	public String getChannelLanguage(){
		return this.channelLanguage;
	}
	public void setChannelLanguage(String channelLanguage){
		this.channelLanguage = channelLanguage;
	}

	public void channelLanguage(String multirequestToken){
		setToken("channelLanguage", multirequestToken);
	}

	// channelCopyright:
	public String getChannelCopyright(){
		return this.channelCopyright;
	}
	public void setChannelCopyright(String channelCopyright){
		this.channelCopyright = channelCopyright;
	}

	public void channelCopyright(String multirequestToken){
		setToken("channelCopyright", multirequestToken);
	}

	// channelImageTitle:
	public String getChannelImageTitle(){
		return this.channelImageTitle;
	}
	public void setChannelImageTitle(String channelImageTitle){
		this.channelImageTitle = channelImageTitle;
	}

	public void channelImageTitle(String multirequestToken){
		setToken("channelImageTitle", multirequestToken);
	}

	// channelImageUrl:
	public String getChannelImageUrl(){
		return this.channelImageUrl;
	}
	public void setChannelImageUrl(String channelImageUrl){
		this.channelImageUrl = channelImageUrl;
	}

	public void channelImageUrl(String multirequestToken){
		setToken("channelImageUrl", multirequestToken);
	}

	// channelImageLink:
	public String getChannelImageLink(){
		return this.channelImageLink;
	}
	public void setChannelImageLink(String channelImageLink){
		this.channelImageLink = channelImageLink;
	}

	public void channelImageLink(String multirequestToken){
		setToken("channelImageLink", multirequestToken);
	}

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

	// ftpPassword:
	public String getFtpPassword(){
		return this.ftpPassword;
	}
	public void setFtpPassword(String ftpPassword){
		this.ftpPassword = ftpPassword;
	}

	public void ftpPassword(String multirequestToken){
		setToken("ftpPassword", multirequestToken);
	}


	public UverseDistributionProfile() {
		super();
	}

	public UverseDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		feedUrl = GsonParser.parseString(jsonObject.get("feedUrl"));
		channelTitle = GsonParser.parseString(jsonObject.get("channelTitle"));
		channelLink = GsonParser.parseString(jsonObject.get("channelLink"));
		channelDescription = GsonParser.parseString(jsonObject.get("channelDescription"));
		channelLanguage = GsonParser.parseString(jsonObject.get("channelLanguage"));
		channelCopyright = GsonParser.parseString(jsonObject.get("channelCopyright"));
		channelImageTitle = GsonParser.parseString(jsonObject.get("channelImageTitle"));
		channelImageUrl = GsonParser.parseString(jsonObject.get("channelImageUrl"));
		channelImageLink = GsonParser.parseString(jsonObject.get("channelImageLink"));
		ftpHost = GsonParser.parseString(jsonObject.get("ftpHost"));
		ftpLogin = GsonParser.parseString(jsonObject.get("ftpLogin"));
		ftpPassword = GsonParser.parseString(jsonObject.get("ftpPassword"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUverseDistributionProfile");
		kparams.add("channelTitle", this.channelTitle);
		kparams.add("channelLink", this.channelLink);
		kparams.add("channelDescription", this.channelDescription);
		kparams.add("channelLanguage", this.channelLanguage);
		kparams.add("channelCopyright", this.channelCopyright);
		kparams.add("channelImageTitle", this.channelImageTitle);
		kparams.add("channelImageUrl", this.channelImageUrl);
		kparams.add("channelImageLink", this.channelImageLink);
		kparams.add("ftpHost", this.ftpHost);
		kparams.add("ftpLogin", this.ftpLogin);
		kparams.add("ftpPassword", this.ftpPassword);
		return kparams;
	}

}

