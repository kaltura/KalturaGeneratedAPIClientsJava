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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.FlavorAssetStatus;
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
@MultiRequestBuilder.Tokenizer(FlavorAsset.Tokenizer.class)
public class FlavorAsset extends Asset {
	
	public interface Tokenizer extends Asset.Tokenizer {
		String flavorParamsId();
		String language();
		String label();
		String isDefault();
	}

	/**
	 * The Flavor Params used to create this Flavor Asset
	 */
	private Integer flavorParamsId;
	/**
	 * The width of the Flavor Asset
	 */
	private Integer width;
	/**
	 * The height of the Flavor Asset
	 */
	private Integer height;
	/**
	 * The overall bitrate (in KBits) of the Flavor Asset
	 */
	private Integer bitrate;
	/**
	 * The frame rate (in FPS) of the Flavor Asset
	 */
	private Double frameRate;
	/**
	 * True if this Flavor Asset is the original source
	 */
	private Boolean isOriginal;
	/**
	 * True if this Flavor Asset is playable in KDP
	 */
	private Boolean isWeb;
	/**
	 * The container format
	 */
	private String containerFormat;
	/**
	 * The video codec
	 */
	private String videoCodecId;
	/**
	 * The status of the Flavor Asset
	 */
	private FlavorAssetStatus status;
	/**
	 * The language of the flavor asset
	 */
	private Language language;
	/**
	 * The label of the flavor asset
	 */
	private String label;
	/**
	 * Is default flavor asset of the entry (This field will be taken into account
	  selectign which audio flavor will be selected as default)
	 */
	private Boolean isDefault;

	// flavorParamsId:
	public Integer getFlavorParamsId(){
		return this.flavorParamsId;
	}
	public void setFlavorParamsId(Integer flavorParamsId){
		this.flavorParamsId = flavorParamsId;
	}

	public void flavorParamsId(String multirequestToken){
		setToken("flavorParamsId", multirequestToken);
	}

	// width:
	public Integer getWidth(){
		return this.width;
	}
	// height:
	public Integer getHeight(){
		return this.height;
	}
	// bitrate:
	public Integer getBitrate(){
		return this.bitrate;
	}
	// frameRate:
	public Double getFrameRate(){
		return this.frameRate;
	}
	// isOriginal:
	public Boolean getIsOriginal(){
		return this.isOriginal;
	}
	// isWeb:
	public Boolean getIsWeb(){
		return this.isWeb;
	}
	// containerFormat:
	public String getContainerFormat(){
		return this.containerFormat;
	}
	// videoCodecId:
	public String getVideoCodecId(){
		return this.videoCodecId;
	}
	// status:
	public FlavorAssetStatus getStatus(){
		return this.status;
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


	public FlavorAsset() {
		super();
	}

	public FlavorAsset(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		flavorParamsId = GsonParser.parseInt(jsonObject.get("flavorParamsId"));
		width = GsonParser.parseInt(jsonObject.get("width"));
		height = GsonParser.parseInt(jsonObject.get("height"));
		bitrate = GsonParser.parseInt(jsonObject.get("bitrate"));
		frameRate = GsonParser.parseDouble(jsonObject.get("frameRate"));
		isOriginal = GsonParser.parseBoolean(jsonObject.get("isOriginal"));
		isWeb = GsonParser.parseBoolean(jsonObject.get("isWeb"));
		containerFormat = GsonParser.parseString(jsonObject.get("containerFormat"));
		videoCodecId = GsonParser.parseString(jsonObject.get("videoCodecId"));
		status = FlavorAssetStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		language = Language.get(GsonParser.parseString(jsonObject.get("language")));
		label = GsonParser.parseString(jsonObject.get("label"));
		isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFlavorAsset");
		kparams.add("flavorParamsId", this.flavorParamsId);
		kparams.add("language", this.language);
		kparams.add("label", this.label);
		kparams.add("isDefault", this.isDefault);
		return kparams;
	}

}

