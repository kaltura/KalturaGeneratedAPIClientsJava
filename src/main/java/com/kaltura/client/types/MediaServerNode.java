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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MediaServerNode.Tokenizer.class)
public abstract class MediaServerNode extends DeliveryServerNode {
	
	public interface Tokenizer extends DeliveryServerNode.Tokenizer {
		String applicationName();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> mediaServerPortConfig();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> mediaServerPlaybackDomainConfig();
	}

	/**
	 * Media server application name
	 */
	private String applicationName;
	/**
	 * Media server playback port configuration by protocol and format
	 */
	private List<KeyValue> mediaServerPortConfig;
	/**
	 * Media server playback Domain configuration by protocol and format
	 */
	private List<KeyValue> mediaServerPlaybackDomainConfig;

	// applicationName:
	public String getApplicationName(){
		return this.applicationName;
	}
	public void setApplicationName(String applicationName){
		this.applicationName = applicationName;
	}

	public void applicationName(String multirequestToken){
		setToken("applicationName", multirequestToken);
	}

	// mediaServerPortConfig:
	public List<KeyValue> getMediaServerPortConfig(){
		return this.mediaServerPortConfig;
	}
	public void setMediaServerPortConfig(List<KeyValue> mediaServerPortConfig){
		this.mediaServerPortConfig = mediaServerPortConfig;
	}

	// mediaServerPlaybackDomainConfig:
	public List<KeyValue> getMediaServerPlaybackDomainConfig(){
		return this.mediaServerPlaybackDomainConfig;
	}
	public void setMediaServerPlaybackDomainConfig(List<KeyValue> mediaServerPlaybackDomainConfig){
		this.mediaServerPlaybackDomainConfig = mediaServerPlaybackDomainConfig;
	}


	public MediaServerNode() {
		super();
	}

	public MediaServerNode(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		applicationName = GsonParser.parseString(jsonObject.get("applicationName"));
		mediaServerPortConfig = GsonParser.parseArray(jsonObject.getAsJsonArray("mediaServerPortConfig"), KeyValue.class);
		mediaServerPlaybackDomainConfig = GsonParser.parseArray(jsonObject.getAsJsonArray("mediaServerPlaybackDomainConfig"), KeyValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMediaServerNode");
		kparams.add("applicationName", this.applicationName);
		kparams.add("mediaServerPortConfig", this.mediaServerPortConfig);
		kparams.add("mediaServerPlaybackDomainConfig", this.mediaServerPlaybackDomainConfig);
		return kparams;
	}

}

