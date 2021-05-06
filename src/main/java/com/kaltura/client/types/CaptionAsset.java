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
import com.kaltura.client.enums.CaptionAssetStatus;
import com.kaltura.client.enums.CaptionSource;
import com.kaltura.client.enums.CaptionType;
import com.kaltura.client.enums.Language;
import com.kaltura.client.enums.LanguageCode;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CaptionAsset.Tokenizer.class)
public class CaptionAsset extends Asset {
	
	public interface Tokenizer extends Asset.Tokenizer {
		String captionParamsId();
		String language();
		String languageCode();
		String isDefault();
		String label();
		String format();
		String source();
		String status();
		String parentId();
		String accuracy();
		String displayOnPlayer();
		String associatedTranscriptIds();
	}

	/**
	 * The Caption Params used to create this Caption Asset
	 */
	private Integer captionParamsId;
	/**
	 * The language of the caption asset content
	 */
	private Language language;
	/**
	 * The language of the caption asset content
	 */
	private LanguageCode languageCode;
	/**
	 * Is default caption asset of the entry
	 */
	private Boolean isDefault;
	/**
	 * Friendly label
	 */
	private String label;
	/**
	 * The caption format
	 */
	private CaptionType format;
	/**
	 * The source of the asset
	 */
	private CaptionSource source;
	/**
	 * The status of the asset
	 */
	private CaptionAssetStatus status;
	/**
	 * The parent id of the asset
	 */
	private String parentId;
	/**
	 * The Accuracy of the caption content
	 */
	private Integer accuracy;
	/**
	 * The Accuracy of the caption content
	 */
	private Boolean displayOnPlayer;
	/**
	 * List of associated transcript asset id's, comma separated
	 */
	private String associatedTranscriptIds;

	// captionParamsId:
	public Integer getCaptionParamsId(){
		return this.captionParamsId;
	}
	public void setCaptionParamsId(Integer captionParamsId){
		this.captionParamsId = captionParamsId;
	}

	public void captionParamsId(String multirequestToken){
		setToken("captionParamsId", multirequestToken);
	}

	// language:
	public Language getLanguage(){
		return this.language;
	}
	public void setLanguage(Language language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
	}

	// languageCode:
	public LanguageCode getLanguageCode(){
		return this.languageCode;
	}
	// isDefault:
	public Boolean getIsDefault(){
		return this.isDefault;
	}
	public void setIsDefault(Boolean isDefault){
		this.isDefault = isDefault;
	}

	public void isDefault(String multirequestToken){
		setToken("isDefault", multirequestToken);
	}

	// label:
	public String getLabel(){
		return this.label;
	}
	public void setLabel(String label){
		this.label = label;
	}

	public void label(String multirequestToken){
		setToken("label", multirequestToken);
	}

	// format:
	public CaptionType getFormat(){
		return this.format;
	}
	public void setFormat(CaptionType format){
		this.format = format;
	}

	public void format(String multirequestToken){
		setToken("format", multirequestToken);
	}

	// source:
	public CaptionSource getSource(){
		return this.source;
	}
	public void setSource(CaptionSource source){
		this.source = source;
	}

	public void source(String multirequestToken){
		setToken("source", multirequestToken);
	}

	// status:
	public CaptionAssetStatus getStatus(){
		return this.status;
	}
	// parentId:
	public String getParentId(){
		return this.parentId;
	}
	public void setParentId(String parentId){
		this.parentId = parentId;
	}

	public void parentId(String multirequestToken){
		setToken("parentId", multirequestToken);
	}

	// accuracy:
	public Integer getAccuracy(){
		return this.accuracy;
	}
	public void setAccuracy(Integer accuracy){
		this.accuracy = accuracy;
	}

	public void accuracy(String multirequestToken){
		setToken("accuracy", multirequestToken);
	}

	// displayOnPlayer:
	public Boolean getDisplayOnPlayer(){
		return this.displayOnPlayer;
	}
	public void setDisplayOnPlayer(Boolean displayOnPlayer){
		this.displayOnPlayer = displayOnPlayer;
	}

	public void displayOnPlayer(String multirequestToken){
		setToken("displayOnPlayer", multirequestToken);
	}

	// associatedTranscriptIds:
	public String getAssociatedTranscriptIds(){
		return this.associatedTranscriptIds;
	}
	public void setAssociatedTranscriptIds(String associatedTranscriptIds){
		this.associatedTranscriptIds = associatedTranscriptIds;
	}

	public void associatedTranscriptIds(String multirequestToken){
		setToken("associatedTranscriptIds", multirequestToken);
	}


	public CaptionAsset() {
		super();
	}

	public CaptionAsset(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		captionParamsId = GsonParser.parseInt(jsonObject.get("captionParamsId"));
		language = Language.get(GsonParser.parseString(jsonObject.get("language")));
		languageCode = LanguageCode.get(GsonParser.parseString(jsonObject.get("languageCode")));
		isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));
		label = GsonParser.parseString(jsonObject.get("label"));
		format = CaptionType.get(GsonParser.parseString(jsonObject.get("format")));
		source = CaptionSource.get(GsonParser.parseString(jsonObject.get("source")));
		status = CaptionAssetStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		parentId = GsonParser.parseString(jsonObject.get("parentId"));
		accuracy = GsonParser.parseInt(jsonObject.get("accuracy"));
		displayOnPlayer = GsonParser.parseBoolean(jsonObject.get("displayOnPlayer"));
		associatedTranscriptIds = GsonParser.parseString(jsonObject.get("associatedTranscriptIds"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCaptionAsset");
		kparams.add("captionParamsId", this.captionParamsId);
		kparams.add("language", this.language);
		kparams.add("isDefault", this.isDefault);
		kparams.add("label", this.label);
		kparams.add("format", this.format);
		kparams.add("source", this.source);
		kparams.add("parentId", this.parentId);
		kparams.add("accuracy", this.accuracy);
		kparams.add("displayOnPlayer", this.displayOnPlayer);
		kparams.add("associatedTranscriptIds", this.associatedTranscriptIds);
		return kparams;
	}

}

