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
@MultiRequestBuilder.Tokenizer(LiveCaptionFeature.Tokenizer.class)
public class LiveCaptionFeature extends LiveFeature {
	
	public interface Tokenizer extends LiveFeature.Tokenizer {
		String mediaUrl();
		String mediaKey();
		String captionUrl();
		String captionToken();
		String inputDelay();
	}

	private String mediaUrl;
	private String mediaKey;
	private String captionUrl;
	private String captionToken;
	private Integer inputDelay;

	// mediaUrl:
	public String getMediaUrl(){
		return this.mediaUrl;
	}
	public void setMediaUrl(String mediaUrl){
		this.mediaUrl = mediaUrl;
	}

	public void mediaUrl(String multirequestToken){
		setToken("mediaUrl", multirequestToken);
	}

	// mediaKey:
	public String getMediaKey(){
		return this.mediaKey;
	}
	public void setMediaKey(String mediaKey){
		this.mediaKey = mediaKey;
	}

	public void mediaKey(String multirequestToken){
		setToken("mediaKey", multirequestToken);
	}

	// captionUrl:
	public String getCaptionUrl(){
		return this.captionUrl;
	}
	public void setCaptionUrl(String captionUrl){
		this.captionUrl = captionUrl;
	}

	public void captionUrl(String multirequestToken){
		setToken("captionUrl", multirequestToken);
	}

	// captionToken:
	public String getCaptionToken(){
		return this.captionToken;
	}
	public void setCaptionToken(String captionToken){
		this.captionToken = captionToken;
	}

	public void captionToken(String multirequestToken){
		setToken("captionToken", multirequestToken);
	}

	// inputDelay:
	public Integer getInputDelay(){
		return this.inputDelay;
	}
	public void setInputDelay(Integer inputDelay){
		this.inputDelay = inputDelay;
	}

	public void inputDelay(String multirequestToken){
		setToken("inputDelay", multirequestToken);
	}


	public LiveCaptionFeature() {
		super();
	}

	public LiveCaptionFeature(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		mediaUrl = GsonParser.parseString(jsonObject.get("mediaUrl"));
		mediaKey = GsonParser.parseString(jsonObject.get("mediaKey"));
		captionUrl = GsonParser.parseString(jsonObject.get("captionUrl"));
		captionToken = GsonParser.parseString(jsonObject.get("captionToken"));
		inputDelay = GsonParser.parseInt(jsonObject.get("inputDelay"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveCaptionFeature");
		kparams.add("mediaUrl", this.mediaUrl);
		kparams.add("mediaKey", this.mediaKey);
		kparams.add("captionUrl", this.captionUrl);
		kparams.add("captionToken", this.captionToken);
		kparams.add("inputDelay", this.inputDelay);
		return kparams;
	}

}

