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
@MultiRequestBuilder.Tokenizer(RainFocusDistributionProfile.Tokenizer.class)
public class RainFocusDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String oauthTokenUrl();
		String videoPublishEndpointUrl();
		String oauthScope();
		String clientId();
		String clientSecretPrimary();
		String clientSecretSecondary();
		String activeSecret();
		String mediaType();
		String playerId();
		String metadataProfileId();
		String metadataFieldNames();
	}

	private String oauthTokenUrl;
	private String videoPublishEndpointUrl;
	private String oauthScope;
	private String clientId;
	private String clientSecretPrimary;
	private String clientSecretSecondary;
	private String activeSecret;
	private Integer mediaType;
	private String playerId;
	private String metadataProfileId;
	private String metadataFieldNames;

	// oauthTokenUrl:
	public String getOauthTokenUrl(){
		return this.oauthTokenUrl;
	}
	public void setOauthTokenUrl(String oauthTokenUrl){
		this.oauthTokenUrl = oauthTokenUrl;
	}

	public void oauthTokenUrl(String multirequestToken){
		setToken("oauthTokenUrl", multirequestToken);
	}

	// videoPublishEndpointUrl:
	public String getVideoPublishEndpointUrl(){
		return this.videoPublishEndpointUrl;
	}
	public void setVideoPublishEndpointUrl(String videoPublishEndpointUrl){
		this.videoPublishEndpointUrl = videoPublishEndpointUrl;
	}

	public void videoPublishEndpointUrl(String multirequestToken){
		setToken("videoPublishEndpointUrl", multirequestToken);
	}

	// oauthScope:
	public String getOauthScope(){
		return this.oauthScope;
	}
	public void setOauthScope(String oauthScope){
		this.oauthScope = oauthScope;
	}

	public void oauthScope(String multirequestToken){
		setToken("oauthScope", multirequestToken);
	}

	// clientId:
	public String getClientId(){
		return this.clientId;
	}
	public void setClientId(String clientId){
		this.clientId = clientId;
	}

	public void clientId(String multirequestToken){
		setToken("clientId", multirequestToken);
	}

	// clientSecretPrimary:
	public String getClientSecretPrimary(){
		return this.clientSecretPrimary;
	}
	public void setClientSecretPrimary(String clientSecretPrimary){
		this.clientSecretPrimary = clientSecretPrimary;
	}

	public void clientSecretPrimary(String multirequestToken){
		setToken("clientSecretPrimary", multirequestToken);
	}

	// clientSecretSecondary:
	public String getClientSecretSecondary(){
		return this.clientSecretSecondary;
	}
	public void setClientSecretSecondary(String clientSecretSecondary){
		this.clientSecretSecondary = clientSecretSecondary;
	}

	public void clientSecretSecondary(String multirequestToken){
		setToken("clientSecretSecondary", multirequestToken);
	}

	// activeSecret:
	public String getActiveSecret(){
		return this.activeSecret;
	}
	public void setActiveSecret(String activeSecret){
		this.activeSecret = activeSecret;
	}

	public void activeSecret(String multirequestToken){
		setToken("activeSecret", multirequestToken);
	}

	// mediaType:
	public Integer getMediaType(){
		return this.mediaType;
	}
	public void setMediaType(Integer mediaType){
		this.mediaType = mediaType;
	}

	public void mediaType(String multirequestToken){
		setToken("mediaType", multirequestToken);
	}

	// playerId:
	public String getPlayerId(){
		return this.playerId;
	}
	public void setPlayerId(String playerId){
		this.playerId = playerId;
	}

	public void playerId(String multirequestToken){
		setToken("playerId", multirequestToken);
	}

	// metadataProfileId:
	public String getMetadataProfileId(){
		return this.metadataProfileId;
	}
	public void setMetadataProfileId(String metadataProfileId){
		this.metadataProfileId = metadataProfileId;
	}

	public void metadataProfileId(String multirequestToken){
		setToken("metadataProfileId", multirequestToken);
	}

	// metadataFieldNames:
	public String getMetadataFieldNames(){
		return this.metadataFieldNames;
	}
	public void setMetadataFieldNames(String metadataFieldNames){
		this.metadataFieldNames = metadataFieldNames;
	}

	public void metadataFieldNames(String multirequestToken){
		setToken("metadataFieldNames", multirequestToken);
	}


	public RainFocusDistributionProfile() {
		super();
	}

	public RainFocusDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		oauthTokenUrl = GsonParser.parseString(jsonObject.get("oauthTokenUrl"));
		videoPublishEndpointUrl = GsonParser.parseString(jsonObject.get("videoPublishEndpointUrl"));
		oauthScope = GsonParser.parseString(jsonObject.get("oauthScope"));
		clientId = GsonParser.parseString(jsonObject.get("clientId"));
		clientSecretPrimary = GsonParser.parseString(jsonObject.get("clientSecretPrimary"));
		clientSecretSecondary = GsonParser.parseString(jsonObject.get("clientSecretSecondary"));
		activeSecret = GsonParser.parseString(jsonObject.get("activeSecret"));
		mediaType = GsonParser.parseInt(jsonObject.get("mediaType"));
		playerId = GsonParser.parseString(jsonObject.get("playerId"));
		metadataProfileId = GsonParser.parseString(jsonObject.get("metadataProfileId"));
		metadataFieldNames = GsonParser.parseString(jsonObject.get("metadataFieldNames"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRainFocusDistributionProfile");
		kparams.add("oauthTokenUrl", this.oauthTokenUrl);
		kparams.add("videoPublishEndpointUrl", this.videoPublishEndpointUrl);
		kparams.add("oauthScope", this.oauthScope);
		kparams.add("clientId", this.clientId);
		kparams.add("clientSecretPrimary", this.clientSecretPrimary);
		kparams.add("clientSecretSecondary", this.clientSecretSecondary);
		kparams.add("activeSecret", this.activeSecret);
		kparams.add("mediaType", this.mediaType);
		kparams.add("playerId", this.playerId);
		kparams.add("metadataProfileId", this.metadataProfileId);
		kparams.add("metadataFieldNames", this.metadataFieldNames);
		return kparams;
	}

}

