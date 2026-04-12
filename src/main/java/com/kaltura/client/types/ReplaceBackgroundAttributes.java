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
import com.kaltura.client.types.AudioAttributes;
import com.kaltura.client.types.ContentResource;
import com.kaltura.client.types.Position;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ReplaceBackgroundAttributes.Tokenizer.class)
public class ReplaceBackgroundAttributes extends MediaCompositionAttributes {
	
	public interface Tokenizer extends MediaCompositionAttributes.Tokenizer {
		ContentResource.Tokenizer resource();
		String backgroundColorCode();
		String foregroundScalePercentage();
		Position.Tokenizer foregroundPositionPercentage();
		AudioAttributes.Tokenizer audioAttributes();
	}

	/**
	 * Only KalturaEntryResource and KalturaAssetResource are supported
	 */
	private ContentResource resource;
	private String backgroundColorCode;
	private Double foregroundScalePercentage;
	private Position foregroundPositionPercentage;
	private AudioAttributes audioAttributes;

	// resource:
	public ContentResource getResource(){
		return this.resource;
	}
	public void setResource(ContentResource resource){
		this.resource = resource;
	}

	// backgroundColorCode:
	public String getBackgroundColorCode(){
		return this.backgroundColorCode;
	}
	public void setBackgroundColorCode(String backgroundColorCode){
		this.backgroundColorCode = backgroundColorCode;
	}

	public void backgroundColorCode(String multirequestToken){
		setToken("backgroundColorCode", multirequestToken);
	}

	// foregroundScalePercentage:
	public Double getForegroundScalePercentage(){
		return this.foregroundScalePercentage;
	}
	public void setForegroundScalePercentage(Double foregroundScalePercentage){
		this.foregroundScalePercentage = foregroundScalePercentage;
	}

	public void foregroundScalePercentage(String multirequestToken){
		setToken("foregroundScalePercentage", multirequestToken);
	}

	// foregroundPositionPercentage:
	public Position getForegroundPositionPercentage(){
		return this.foregroundPositionPercentage;
	}
	public void setForegroundPositionPercentage(Position foregroundPositionPercentage){
		this.foregroundPositionPercentage = foregroundPositionPercentage;
	}

	// audioAttributes:
	public AudioAttributes getAudioAttributes(){
		return this.audioAttributes;
	}
	public void setAudioAttributes(AudioAttributes audioAttributes){
		this.audioAttributes = audioAttributes;
	}


	public ReplaceBackgroundAttributes() {
		super();
	}

	public ReplaceBackgroundAttributes(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		resource = GsonParser.parseObject(jsonObject.getAsJsonObject("resource"), ContentResource.class);
		backgroundColorCode = GsonParser.parseString(jsonObject.get("backgroundColorCode"));
		foregroundScalePercentage = GsonParser.parseDouble(jsonObject.get("foregroundScalePercentage"));
		foregroundPositionPercentage = GsonParser.parseObject(jsonObject.getAsJsonObject("foregroundPositionPercentage"), Position.class);
		audioAttributes = GsonParser.parseObject(jsonObject.getAsJsonObject("audioAttributes"), AudioAttributes.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReplaceBackgroundAttributes");
		kparams.add("resource", this.resource);
		kparams.add("backgroundColorCode", this.backgroundColorCode);
		kparams.add("foregroundScalePercentage", this.foregroundScalePercentage);
		kparams.add("foregroundPositionPercentage", this.foregroundPositionPercentage);
		kparams.add("audioAttributes", this.audioAttributes);
		return kparams;
	}

}

