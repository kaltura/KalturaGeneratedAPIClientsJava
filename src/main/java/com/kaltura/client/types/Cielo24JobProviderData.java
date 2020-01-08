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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.enums.Cielo24Fidelity;
import com.kaltura.client.enums.Cielo24Priority;
import com.kaltura.client.enums.Language;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Cielo24JobProviderData.Tokenizer.class)
public class Cielo24JobProviderData extends IntegrationJobProviderData {
	
	public interface Tokenizer extends IntegrationJobProviderData.Tokenizer {
		String entryId();
		String flavorAssetId();
		String captionAssetFormats();
		String priority();
		String fidelity();
		String username();
		String password();
		String baseUrl();
		String spokenLanguage();
		String replaceMediaContent();
		String additionalParameters();
	}

	/**
	 * Entry ID
	 */
	private String entryId;
	/**
	 * Flavor ID
	 */
	private String flavorAssetId;
	/**
	 * Caption formats
	 */
	private String captionAssetFormats;
	private Cielo24Priority priority;
	private Cielo24Fidelity fidelity;
	/**
	 * Api key for service provider
	 */
	private String username;
	/**
	 * Api key for service provider
	 */
	private String password;
	/**
	 * Base url for service provider
	 */
	private String baseUrl;
	/**
	 * Transcript content language
	 */
	private Language spokenLanguage;
	/**
	 * should replace remote media content
	 */
	private Boolean replaceMediaContent;
	/**
	 * additional parameters to send to Cielo24
	 */
	private String additionalParameters;

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

	// flavorAssetId:
	public String getFlavorAssetId(){
		return this.flavorAssetId;
	}
	public void setFlavorAssetId(String flavorAssetId){
		this.flavorAssetId = flavorAssetId;
	}

	public void flavorAssetId(String multirequestToken){
		setToken("flavorAssetId", multirequestToken);
	}

	// captionAssetFormats:
	public String getCaptionAssetFormats(){
		return this.captionAssetFormats;
	}
	public void setCaptionAssetFormats(String captionAssetFormats){
		this.captionAssetFormats = captionAssetFormats;
	}

	public void captionAssetFormats(String multirequestToken){
		setToken("captionAssetFormats", multirequestToken);
	}

	// priority:
	public Cielo24Priority getPriority(){
		return this.priority;
	}
	public void setPriority(Cielo24Priority priority){
		this.priority = priority;
	}

	public void priority(String multirequestToken){
		setToken("priority", multirequestToken);
	}

	// fidelity:
	public Cielo24Fidelity getFidelity(){
		return this.fidelity;
	}
	public void setFidelity(Cielo24Fidelity fidelity){
		this.fidelity = fidelity;
	}

	public void fidelity(String multirequestToken){
		setToken("fidelity", multirequestToken);
	}

	// username:
	public String getUsername(){
		return this.username;
	}
	// password:
	public String getPassword(){
		return this.password;
	}
	// baseUrl:
	public String getBaseUrl(){
		return this.baseUrl;
	}
	// spokenLanguage:
	public Language getSpokenLanguage(){
		return this.spokenLanguage;
	}
	public void setSpokenLanguage(Language spokenLanguage){
		this.spokenLanguage = spokenLanguage;
	}

	public void spokenLanguage(String multirequestToken){
		setToken("spokenLanguage", multirequestToken);
	}

	// replaceMediaContent:
	public Boolean getReplaceMediaContent(){
		return this.replaceMediaContent;
	}
	public void setReplaceMediaContent(Boolean replaceMediaContent){
		this.replaceMediaContent = replaceMediaContent;
	}

	public void replaceMediaContent(String multirequestToken){
		setToken("replaceMediaContent", multirequestToken);
	}

	// additionalParameters:
	public String getAdditionalParameters(){
		return this.additionalParameters;
	}
	public void setAdditionalParameters(String additionalParameters){
		this.additionalParameters = additionalParameters;
	}

	public void additionalParameters(String multirequestToken){
		setToken("additionalParameters", multirequestToken);
	}


	public Cielo24JobProviderData() {
		super();
	}

	public Cielo24JobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
		captionAssetFormats = GsonParser.parseString(jsonObject.get("captionAssetFormats"));
		priority = Cielo24Priority.get(GsonParser.parseString(jsonObject.get("priority")));
		fidelity = Cielo24Fidelity.get(GsonParser.parseString(jsonObject.get("fidelity")));
		username = GsonParser.parseString(jsonObject.get("username"));
		password = GsonParser.parseString(jsonObject.get("password"));
		baseUrl = GsonParser.parseString(jsonObject.get("baseUrl"));
		spokenLanguage = Language.get(GsonParser.parseString(jsonObject.get("spokenLanguage")));
		replaceMediaContent = GsonParser.parseBoolean(jsonObject.get("replaceMediaContent"));
		additionalParameters = GsonParser.parseString(jsonObject.get("additionalParameters"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCielo24JobProviderData");
		kparams.add("entryId", this.entryId);
		kparams.add("flavorAssetId", this.flavorAssetId);
		kparams.add("captionAssetFormats", this.captionAssetFormats);
		kparams.add("priority", this.priority);
		kparams.add("fidelity", this.fidelity);
		kparams.add("spokenLanguage", this.spokenLanguage);
		kparams.add("replaceMediaContent", this.replaceMediaContent);
		kparams.add("additionalParameters", this.additionalParameters);
		return kparams;
	}

}

