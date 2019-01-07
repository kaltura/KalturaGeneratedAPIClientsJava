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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveStreamParams.Tokenizer.class)
public class LiveStreamParams extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String bitrate();
		String flavorId();
		String width();
		String height();
		String codec();
		String frameRate();
		String keyFrameInterval();
		String language();
	}

	/**
	 * Bit rate of the stream. (i.e. 900)
	 */
	private Integer bitrate;
	/**
	 * flavor asset id
	 */
	private String flavorId;
	/**
	 * Stream's width
	 */
	private Integer width;
	/**
	 * Stream's height
	 */
	private Integer height;
	/**
	 * Live stream's codec
	 */
	private String codec;
	/**
	 * Live stream's farme rate
	 */
	private Integer frameRate;
	/**
	 * Live stream's key frame interval
	 */
	private Double keyFrameInterval;
	/**
	 * Live stream's language
	 */
	private String language;

	// bitrate:
	public Integer getBitrate(){
		return this.bitrate;
	}
	public void setBitrate(Integer bitrate){
		this.bitrate = bitrate;
	}

	public void bitrate(String multirequestToken){
		setToken("bitrate", multirequestToken);
	}

	// flavorId:
	public String getFlavorId(){
		return this.flavorId;
	}
	public void setFlavorId(String flavorId){
		this.flavorId = flavorId;
	}

	public void flavorId(String multirequestToken){
		setToken("flavorId", multirequestToken);
	}

	// width:
	public Integer getWidth(){
		return this.width;
	}
	public void setWidth(Integer width){
		this.width = width;
	}

	public void width(String multirequestToken){
		setToken("width", multirequestToken);
	}

	// height:
	public Integer getHeight(){
		return this.height;
	}
	public void setHeight(Integer height){
		this.height = height;
	}

	public void height(String multirequestToken){
		setToken("height", multirequestToken);
	}

	// codec:
	public String getCodec(){
		return this.codec;
	}
	public void setCodec(String codec){
		this.codec = codec;
	}

	public void codec(String multirequestToken){
		setToken("codec", multirequestToken);
	}

	// frameRate:
	public Integer getFrameRate(){
		return this.frameRate;
	}
	public void setFrameRate(Integer frameRate){
		this.frameRate = frameRate;
	}

	public void frameRate(String multirequestToken){
		setToken("frameRate", multirequestToken);
	}

	// keyFrameInterval:
	public Double getKeyFrameInterval(){
		return this.keyFrameInterval;
	}
	public void setKeyFrameInterval(Double keyFrameInterval){
		this.keyFrameInterval = keyFrameInterval;
	}

	public void keyFrameInterval(String multirequestToken){
		setToken("keyFrameInterval", multirequestToken);
	}

	// language:
	public String getLanguage(){
		return this.language;
	}
	public void setLanguage(String language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
	}


	public LiveStreamParams() {
		super();
	}

	public LiveStreamParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		bitrate = GsonParser.parseInt(jsonObject.get("bitrate"));
		flavorId = GsonParser.parseString(jsonObject.get("flavorId"));
		width = GsonParser.parseInt(jsonObject.get("width"));
		height = GsonParser.parseInt(jsonObject.get("height"));
		codec = GsonParser.parseString(jsonObject.get("codec"));
		frameRate = GsonParser.parseInt(jsonObject.get("frameRate"));
		keyFrameInterval = GsonParser.parseDouble(jsonObject.get("keyFrameInterval"));
		language = GsonParser.parseString(jsonObject.get("language"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveStreamParams");
		kparams.add("bitrate", this.bitrate);
		kparams.add("flavorId", this.flavorId);
		kparams.add("width", this.width);
		kparams.add("height", this.height);
		kparams.add("codec", this.codec);
		kparams.add("frameRate", this.frameRate);
		kparams.add("keyFrameInterval", this.keyFrameInterval);
		kparams.add("language", this.language);
		return kparams;
	}

}

