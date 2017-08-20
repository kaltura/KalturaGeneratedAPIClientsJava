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
import com.kaltura.client.enums.YahooDistributionProcessFeedActionStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(YahooDistributionProfile.Tokenizer.class)
public class YahooDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String ftpPath();
		String ftpUsername();
		String ftpPassword();
		String ftpHost();
		String contactTelephone();
		String contactEmail();
		String processFeed();
	}

	private String ftpPath;
	private String ftpUsername;
	private String ftpPassword;
	private String ftpHost;
	private String contactTelephone;
	private String contactEmail;
	private YahooDistributionProcessFeedActionStatus processFeed;

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

	// ftpUsername:
	public String getFtpUsername(){
		return this.ftpUsername;
	}
	public void setFtpUsername(String ftpUsername){
		this.ftpUsername = ftpUsername;
	}

	public void ftpUsername(String multirequestToken){
		setToken("ftpUsername", multirequestToken);
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

	// contactTelephone:
	public String getContactTelephone(){
		return this.contactTelephone;
	}
	public void setContactTelephone(String contactTelephone){
		this.contactTelephone = contactTelephone;
	}

	public void contactTelephone(String multirequestToken){
		setToken("contactTelephone", multirequestToken);
	}

	// contactEmail:
	public String getContactEmail(){
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail){
		this.contactEmail = contactEmail;
	}

	public void contactEmail(String multirequestToken){
		setToken("contactEmail", multirequestToken);
	}

	// processFeed:
	public YahooDistributionProcessFeedActionStatus getProcessFeed(){
		return this.processFeed;
	}
	public void setProcessFeed(YahooDistributionProcessFeedActionStatus processFeed){
		this.processFeed = processFeed;
	}

	public void processFeed(String multirequestToken){
		setToken("processFeed", multirequestToken);
	}


	public YahooDistributionProfile() {
		super();
	}

	public YahooDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		ftpPath = GsonParser.parseString(jsonObject.get("ftpPath"));
		ftpUsername = GsonParser.parseString(jsonObject.get("ftpUsername"));
		ftpPassword = GsonParser.parseString(jsonObject.get("ftpPassword"));
		ftpHost = GsonParser.parseString(jsonObject.get("ftpHost"));
		contactTelephone = GsonParser.parseString(jsonObject.get("contactTelephone"));
		contactEmail = GsonParser.parseString(jsonObject.get("contactEmail"));
		processFeed = YahooDistributionProcessFeedActionStatus.get(GsonParser.parseInt(jsonObject.get("processFeed")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaYahooDistributionProfile");
		kparams.add("ftpPath", this.ftpPath);
		kparams.add("ftpUsername", this.ftpUsername);
		kparams.add("ftpPassword", this.ftpPassword);
		kparams.add("ftpHost", this.ftpHost);
		kparams.add("contactTelephone", this.contactTelephone);
		kparams.add("contactEmail", this.contactEmail);
		kparams.add("processFeed", this.processFeed);
		return kparams;
	}

}

