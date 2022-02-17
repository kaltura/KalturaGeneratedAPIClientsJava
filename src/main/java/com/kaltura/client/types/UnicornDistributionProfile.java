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
// Copyright (C) 2006-2022  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(UnicornDistributionProfile.Tokenizer.class)
public class UnicornDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String username();
		String password();
		String domainName();
		String channelGuid();
		String apiHostUrl();
		String domainGuid();
		String adFreeApplicationGuid();
		String remoteAssetParamsId();
		String storageProfileId();
	}

	/**
	 * The email address associated with the Upload User, used to authorize the
	  incoming request.
	 */
	private String username;
	/**
	 * The password used in association with the email to determine if the Upload User
	  is authorized the incoming request.
	 */
	private String password;
	/**
	 * The name of the Domain that the Upload User should have access to, Used for
	  authentication.
	 */
	private String domainName;
	/**
	 * The Channel GUID assigned to this Publication Rule. Must be a valid Channel in
	  the Domain that was used in authentication.
	 */
	private String channelGuid;
	/**
	 * The API host URL that the Upload User should have access to, Used for HTTP
	  content submission.
	 */
	private String apiHostUrl;
	/**
	 * The GUID of the Customer Domain in the Unicorn system obtained by contacting
	  your Unicorn representative.
	 */
	private String domainGuid;
	/**
	 * The GUID for the application in which to record metrics and enforce business
	  rules obtained through your Unicorn representative.
	 */
	private String adFreeApplicationGuid;
	/**
	 * The flavor-params that will be used for the remote asset.
	 */
	private Integer remoteAssetParamsId;
	/**
	 * The remote storage that should be used for the remote asset.
	 */
	private String storageProfileId;

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

	// domainName:
	public String getDomainName(){
		return this.domainName;
	}
	public void setDomainName(String domainName){
		this.domainName = domainName;
	}

	public void domainName(String multirequestToken){
		setToken("domainName", multirequestToken);
	}

	// channelGuid:
	public String getChannelGuid(){
		return this.channelGuid;
	}
	public void setChannelGuid(String channelGuid){
		this.channelGuid = channelGuid;
	}

	public void channelGuid(String multirequestToken){
		setToken("channelGuid", multirequestToken);
	}

	// apiHostUrl:
	public String getApiHostUrl(){
		return this.apiHostUrl;
	}
	public void setApiHostUrl(String apiHostUrl){
		this.apiHostUrl = apiHostUrl;
	}

	public void apiHostUrl(String multirequestToken){
		setToken("apiHostUrl", multirequestToken);
	}

	// domainGuid:
	public String getDomainGuid(){
		return this.domainGuid;
	}
	public void setDomainGuid(String domainGuid){
		this.domainGuid = domainGuid;
	}

	public void domainGuid(String multirequestToken){
		setToken("domainGuid", multirequestToken);
	}

	// adFreeApplicationGuid:
	public String getAdFreeApplicationGuid(){
		return this.adFreeApplicationGuid;
	}
	public void setAdFreeApplicationGuid(String adFreeApplicationGuid){
		this.adFreeApplicationGuid = adFreeApplicationGuid;
	}

	public void adFreeApplicationGuid(String multirequestToken){
		setToken("adFreeApplicationGuid", multirequestToken);
	}

	// remoteAssetParamsId:
	public Integer getRemoteAssetParamsId(){
		return this.remoteAssetParamsId;
	}
	public void setRemoteAssetParamsId(Integer remoteAssetParamsId){
		this.remoteAssetParamsId = remoteAssetParamsId;
	}

	public void remoteAssetParamsId(String multirequestToken){
		setToken("remoteAssetParamsId", multirequestToken);
	}

	// storageProfileId:
	public String getStorageProfileId(){
		return this.storageProfileId;
	}
	public void setStorageProfileId(String storageProfileId){
		this.storageProfileId = storageProfileId;
	}

	public void storageProfileId(String multirequestToken){
		setToken("storageProfileId", multirequestToken);
	}


	public UnicornDistributionProfile() {
		super();
	}

	public UnicornDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		username = GsonParser.parseString(jsonObject.get("username"));
		password = GsonParser.parseString(jsonObject.get("password"));
		domainName = GsonParser.parseString(jsonObject.get("domainName"));
		channelGuid = GsonParser.parseString(jsonObject.get("channelGuid"));
		apiHostUrl = GsonParser.parseString(jsonObject.get("apiHostUrl"));
		domainGuid = GsonParser.parseString(jsonObject.get("domainGuid"));
		adFreeApplicationGuid = GsonParser.parseString(jsonObject.get("adFreeApplicationGuid"));
		remoteAssetParamsId = GsonParser.parseInt(jsonObject.get("remoteAssetParamsId"));
		storageProfileId = GsonParser.parseString(jsonObject.get("storageProfileId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUnicornDistributionProfile");
		kparams.add("username", this.username);
		kparams.add("password", this.password);
		kparams.add("domainName", this.domainName);
		kparams.add("channelGuid", this.channelGuid);
		kparams.add("apiHostUrl", this.apiHostUrl);
		kparams.add("domainGuid", this.domainGuid);
		kparams.add("adFreeApplicationGuid", this.adFreeApplicationGuid);
		kparams.add("remoteAssetParamsId", this.remoteAssetParamsId);
		kparams.add("storageProfileId", this.storageProfileId);
		return kparams;
	}

}

