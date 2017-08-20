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
@MultiRequestBuilder.Tokenizer(FreewheelGenericDistributionProfile.Tokenizer.class)
public class FreewheelGenericDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String apikey();
		String email();
		String sftpPass();
		String sftpLogin();
		String contentOwner();
		String upstreamVideoId();
		String upstreamNetworkName();
		String upstreamNetworkId();
		String categoryId();
		String replaceGroup();
		String replaceAirDates();
	}

	private String apikey;
	private String email;
	private String sftpPass;
	private String sftpLogin;
	private String contentOwner;
	private String upstreamVideoId;
	private String upstreamNetworkName;
	private String upstreamNetworkId;
	private String categoryId;
	private Boolean replaceGroup;
	private Boolean replaceAirDates;

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

	// contentOwner:
	public String getContentOwner(){
		return this.contentOwner;
	}
	public void setContentOwner(String contentOwner){
		this.contentOwner = contentOwner;
	}

	public void contentOwner(String multirequestToken){
		setToken("contentOwner", multirequestToken);
	}

	// upstreamVideoId:
	public String getUpstreamVideoId(){
		return this.upstreamVideoId;
	}
	public void setUpstreamVideoId(String upstreamVideoId){
		this.upstreamVideoId = upstreamVideoId;
	}

	public void upstreamVideoId(String multirequestToken){
		setToken("upstreamVideoId", multirequestToken);
	}

	// upstreamNetworkName:
	public String getUpstreamNetworkName(){
		return this.upstreamNetworkName;
	}
	public void setUpstreamNetworkName(String upstreamNetworkName){
		this.upstreamNetworkName = upstreamNetworkName;
	}

	public void upstreamNetworkName(String multirequestToken){
		setToken("upstreamNetworkName", multirequestToken);
	}

	// upstreamNetworkId:
	public String getUpstreamNetworkId(){
		return this.upstreamNetworkId;
	}
	public void setUpstreamNetworkId(String upstreamNetworkId){
		this.upstreamNetworkId = upstreamNetworkId;
	}

	public void upstreamNetworkId(String multirequestToken){
		setToken("upstreamNetworkId", multirequestToken);
	}

	// categoryId:
	public String getCategoryId(){
		return this.categoryId;
	}
	public void setCategoryId(String categoryId){
		this.categoryId = categoryId;
	}

	public void categoryId(String multirequestToken){
		setToken("categoryId", multirequestToken);
	}

	// replaceGroup:
	public Boolean getReplaceGroup(){
		return this.replaceGroup;
	}
	public void setReplaceGroup(Boolean replaceGroup){
		this.replaceGroup = replaceGroup;
	}

	public void replaceGroup(String multirequestToken){
		setToken("replaceGroup", multirequestToken);
	}

	// replaceAirDates:
	public Boolean getReplaceAirDates(){
		return this.replaceAirDates;
	}
	public void setReplaceAirDates(Boolean replaceAirDates){
		this.replaceAirDates = replaceAirDates;
	}

	public void replaceAirDates(String multirequestToken){
		setToken("replaceAirDates", multirequestToken);
	}


	public FreewheelGenericDistributionProfile() {
		super();
	}

	public FreewheelGenericDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		apikey = GsonParser.parseString(jsonObject.get("apikey"));
		email = GsonParser.parseString(jsonObject.get("email"));
		sftpPass = GsonParser.parseString(jsonObject.get("sftpPass"));
		sftpLogin = GsonParser.parseString(jsonObject.get("sftpLogin"));
		contentOwner = GsonParser.parseString(jsonObject.get("contentOwner"));
		upstreamVideoId = GsonParser.parseString(jsonObject.get("upstreamVideoId"));
		upstreamNetworkName = GsonParser.parseString(jsonObject.get("upstreamNetworkName"));
		upstreamNetworkId = GsonParser.parseString(jsonObject.get("upstreamNetworkId"));
		categoryId = GsonParser.parseString(jsonObject.get("categoryId"));
		replaceGroup = GsonParser.parseBoolean(jsonObject.get("replaceGroup"));
		replaceAirDates = GsonParser.parseBoolean(jsonObject.get("replaceAirDates"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFreewheelGenericDistributionProfile");
		kparams.add("apikey", this.apikey);
		kparams.add("email", this.email);
		kparams.add("sftpPass", this.sftpPass);
		kparams.add("sftpLogin", this.sftpLogin);
		kparams.add("contentOwner", this.contentOwner);
		kparams.add("upstreamVideoId", this.upstreamVideoId);
		kparams.add("upstreamNetworkName", this.upstreamNetworkName);
		kparams.add("upstreamNetworkId", this.upstreamNetworkId);
		kparams.add("categoryId", this.categoryId);
		kparams.add("replaceGroup", this.replaceGroup);
		kparams.add("replaceAirDates", this.replaceAirDates);
		return kparams;
	}

}

