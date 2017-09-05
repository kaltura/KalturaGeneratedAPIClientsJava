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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(QuickPlayDistributionProfile.Tokenizer.class)
public class QuickPlayDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String sftpHost();
		String sftpLogin();
		String sftpPass();
		String sftpBasePath();
		String channelTitle();
		String channelLink();
		String channelDescription();
		String channelManagingEditor();
		String channelLanguage();
		String channelImageTitle();
		String channelImageWidth();
		String channelImageHeight();
		String channelImageLink();
		String channelImageUrl();
		String channelCopyright();
		String channelGenerator();
		String channelRating();
	}

	private String sftpHost;
	private String sftpLogin;
	private String sftpPass;
	private String sftpBasePath;
	private String channelTitle;
	private String channelLink;
	private String channelDescription;
	private String channelManagingEditor;
	private String channelLanguage;
	private String channelImageTitle;
	private String channelImageWidth;
	private String channelImageHeight;
	private String channelImageLink;
	private String channelImageUrl;
	private String channelCopyright;
	private String channelGenerator;
	private String channelRating;

	// sftpHost:
	public String getSftpHost(){
		return this.sftpHost;
	}
	public void setSftpHost(String sftpHost){
		this.sftpHost = sftpHost;
	}

	public void sftpHost(String multirequestToken){
		setToken("sftpHost", multirequestToken);
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

	// sftpBasePath:
	public String getSftpBasePath(){
		return this.sftpBasePath;
	}
	public void setSftpBasePath(String sftpBasePath){
		this.sftpBasePath = sftpBasePath;
	}

	public void sftpBasePath(String multirequestToken){
		setToken("sftpBasePath", multirequestToken);
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

	// channelManagingEditor:
	public String getChannelManagingEditor(){
		return this.channelManagingEditor;
	}
	public void setChannelManagingEditor(String channelManagingEditor){
		this.channelManagingEditor = channelManagingEditor;
	}

	public void channelManagingEditor(String multirequestToken){
		setToken("channelManagingEditor", multirequestToken);
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

	// channelImageWidth:
	public String getChannelImageWidth(){
		return this.channelImageWidth;
	}
	public void setChannelImageWidth(String channelImageWidth){
		this.channelImageWidth = channelImageWidth;
	}

	public void channelImageWidth(String multirequestToken){
		setToken("channelImageWidth", multirequestToken);
	}

	// channelImageHeight:
	public String getChannelImageHeight(){
		return this.channelImageHeight;
	}
	public void setChannelImageHeight(String channelImageHeight){
		this.channelImageHeight = channelImageHeight;
	}

	public void channelImageHeight(String multirequestToken){
		setToken("channelImageHeight", multirequestToken);
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

	// channelGenerator:
	public String getChannelGenerator(){
		return this.channelGenerator;
	}
	public void setChannelGenerator(String channelGenerator){
		this.channelGenerator = channelGenerator;
	}

	public void channelGenerator(String multirequestToken){
		setToken("channelGenerator", multirequestToken);
	}

	// channelRating:
	public String getChannelRating(){
		return this.channelRating;
	}
	public void setChannelRating(String channelRating){
		this.channelRating = channelRating;
	}

	public void channelRating(String multirequestToken){
		setToken("channelRating", multirequestToken);
	}


	public QuickPlayDistributionProfile() {
		super();
	}

	public QuickPlayDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		sftpHost = GsonParser.parseString(jsonObject.get("sftpHost"));
		sftpLogin = GsonParser.parseString(jsonObject.get("sftpLogin"));
		sftpPass = GsonParser.parseString(jsonObject.get("sftpPass"));
		sftpBasePath = GsonParser.parseString(jsonObject.get("sftpBasePath"));
		channelTitle = GsonParser.parseString(jsonObject.get("channelTitle"));
		channelLink = GsonParser.parseString(jsonObject.get("channelLink"));
		channelDescription = GsonParser.parseString(jsonObject.get("channelDescription"));
		channelManagingEditor = GsonParser.parseString(jsonObject.get("channelManagingEditor"));
		channelLanguage = GsonParser.parseString(jsonObject.get("channelLanguage"));
		channelImageTitle = GsonParser.parseString(jsonObject.get("channelImageTitle"));
		channelImageWidth = GsonParser.parseString(jsonObject.get("channelImageWidth"));
		channelImageHeight = GsonParser.parseString(jsonObject.get("channelImageHeight"));
		channelImageLink = GsonParser.parseString(jsonObject.get("channelImageLink"));
		channelImageUrl = GsonParser.parseString(jsonObject.get("channelImageUrl"));
		channelCopyright = GsonParser.parseString(jsonObject.get("channelCopyright"));
		channelGenerator = GsonParser.parseString(jsonObject.get("channelGenerator"));
		channelRating = GsonParser.parseString(jsonObject.get("channelRating"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaQuickPlayDistributionProfile");
		kparams.add("sftpHost", this.sftpHost);
		kparams.add("sftpLogin", this.sftpLogin);
		kparams.add("sftpPass", this.sftpPass);
		kparams.add("sftpBasePath", this.sftpBasePath);
		kparams.add("channelTitle", this.channelTitle);
		kparams.add("channelLink", this.channelLink);
		kparams.add("channelDescription", this.channelDescription);
		kparams.add("channelManagingEditor", this.channelManagingEditor);
		kparams.add("channelLanguage", this.channelLanguage);
		kparams.add("channelImageTitle", this.channelImageTitle);
		kparams.add("channelImageWidth", this.channelImageWidth);
		kparams.add("channelImageHeight", this.channelImageHeight);
		kparams.add("channelImageLink", this.channelImageLink);
		kparams.add("channelImageUrl", this.channelImageUrl);
		kparams.add("channelCopyright", this.channelCopyright);
		kparams.add("channelGenerator", this.channelGenerator);
		kparams.add("channelRating", this.channelRating);
		return kparams;
	}

}

