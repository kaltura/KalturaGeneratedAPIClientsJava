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
@MultiRequestBuilder.Tokenizer(DexterIntegrationJobProviderData.Tokenizer.class)
public class DexterIntegrationJobProviderData extends IntegrationJobProviderData {
	
	public interface Tokenizer extends IntegrationJobProviderData.Tokenizer {
		String metadataProfileId();
		String transcriptAssetId();
		String entryId();
		String voicebaseApiKey();
		String voicebaseApiPassword();
	}

	/**
	 * ID of the metadata profile for the extracted term metadata
	 */
	private Integer metadataProfileId;
	/**
	 * ID of the transcript asset
	 */
	private String transcriptAssetId;
	/**
	 * ID of the entry
	 */
	private String entryId;
	/**
	 * Voicebase API key to fetch transcript tokens
	 */
	private String voicebaseApiKey;
	/**
	 * Voicebase API password to fetch transcript tokens
	 */
	private String voicebaseApiPassword;

	// metadataProfileId:
	public Integer getMetadataProfileId(){
		return this.metadataProfileId;
	}
	public void setMetadataProfileId(Integer metadataProfileId){
		this.metadataProfileId = metadataProfileId;
	}

	public void metadataProfileId(String multirequestToken){
		setToken("metadataProfileId", multirequestToken);
	}

	// transcriptAssetId:
	public String getTranscriptAssetId(){
		return this.transcriptAssetId;
	}
	public void setTranscriptAssetId(String transcriptAssetId){
		this.transcriptAssetId = transcriptAssetId;
	}

	public void transcriptAssetId(String multirequestToken){
		setToken("transcriptAssetId", multirequestToken);
	}

	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}

	// voicebaseApiKey:
	public String getVoicebaseApiKey(){
		return this.voicebaseApiKey;
	}
	public void setVoicebaseApiKey(String voicebaseApiKey){
		this.voicebaseApiKey = voicebaseApiKey;
	}

	public void voicebaseApiKey(String multirequestToken){
		setToken("voicebaseApiKey", multirequestToken);
	}

	// voicebaseApiPassword:
	public String getVoicebaseApiPassword(){
		return this.voicebaseApiPassword;
	}
	public void setVoicebaseApiPassword(String voicebaseApiPassword){
		this.voicebaseApiPassword = voicebaseApiPassword;
	}

	public void voicebaseApiPassword(String multirequestToken){
		setToken("voicebaseApiPassword", multirequestToken);
	}


	public DexterIntegrationJobProviderData() {
		super();
	}

	public DexterIntegrationJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));
		transcriptAssetId = GsonParser.parseString(jsonObject.get("transcriptAssetId"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		voicebaseApiKey = GsonParser.parseString(jsonObject.get("voicebaseApiKey"));
		voicebaseApiPassword = GsonParser.parseString(jsonObject.get("voicebaseApiPassword"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDexterIntegrationJobProviderData");
		kparams.add("metadataProfileId", this.metadataProfileId);
		kparams.add("transcriptAssetId", this.transcriptAssetId);
		kparams.add("entryId", this.entryId);
		kparams.add("voicebaseApiKey", this.voicebaseApiKey);
		kparams.add("voicebaseApiPassword", this.voicebaseApiPassword);
		return kparams;
	}

}

