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
@MultiRequestBuilder.Tokenizer(MicrosoftTeamsIntegrationSetting.Tokenizer.class)
public class MicrosoftTeamsIntegrationSetting extends IntegrationSetting {
	
	public interface Tokenizer extends IntegrationSetting.Tokenizer {
		String clientSecret();
		String clientId();
		String userMetadataProfileId();
		String scopes();
		String encryptionKey();
	}

	private String clientSecret;
	private String clientId;
	/**
	 * User-level custom metadata profile ID which will contain encrypted user-level
	  Graph access data.
	 */
	private Integer userMetadataProfileId;
	/**
	 * MS Graph permission scopes for delegate auth
	 */
	private String scopes;
	/**
	 * Encryption key used for encrypting/decrypting user auth data.
	 */
	private String encryptionKey;

	// clientSecret:
	public String getClientSecret(){
		return this.clientSecret;
	}
	public void setClientSecret(String clientSecret){
		this.clientSecret = clientSecret;
	}

	public void clientSecret(String multirequestToken){
		setToken("clientSecret", multirequestToken);
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

	// userMetadataProfileId:
	public Integer getUserMetadataProfileId(){
		return this.userMetadataProfileId;
	}
	public void setUserMetadataProfileId(Integer userMetadataProfileId){
		this.userMetadataProfileId = userMetadataProfileId;
	}

	public void userMetadataProfileId(String multirequestToken){
		setToken("userMetadataProfileId", multirequestToken);
	}

	// scopes:
	public String getScopes(){
		return this.scopes;
	}
	public void setScopes(String scopes){
		this.scopes = scopes;
	}

	public void scopes(String multirequestToken){
		setToken("scopes", multirequestToken);
	}

	// encryptionKey:
	public String getEncryptionKey(){
		return this.encryptionKey;
	}

	public MicrosoftTeamsIntegrationSetting() {
		super();
	}

	public MicrosoftTeamsIntegrationSetting(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		clientSecret = GsonParser.parseString(jsonObject.get("clientSecret"));
		clientId = GsonParser.parseString(jsonObject.get("clientId"));
		userMetadataProfileId = GsonParser.parseInt(jsonObject.get("userMetadataProfileId"));
		scopes = GsonParser.parseString(jsonObject.get("scopes"));
		encryptionKey = GsonParser.parseString(jsonObject.get("encryptionKey"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMicrosoftTeamsIntegrationSetting");
		kparams.add("clientSecret", this.clientSecret);
		kparams.add("clientId", this.clientId);
		kparams.add("userMetadataProfileId", this.userMetadataProfileId);
		kparams.add("scopes", this.scopes);
		return kparams;
	}

}

