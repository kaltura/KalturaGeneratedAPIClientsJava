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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * A representation of an RTMP live stream configuration
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveStreamPushPublishRTMPConfiguration.Tokenizer.class)
public class LiveStreamPushPublishRTMPConfiguration extends LiveStreamPushPublishConfiguration {
	
	public interface Tokenizer extends LiveStreamPushPublishConfiguration.Tokenizer {
		String userId();
		String password();
		String streamName();
		String applicationName();
	}

	private String userId;
	private String password;
	private String streamName;
	private String applicationName;

	// userId:
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
	}

	// password:
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public void password(String multirequestToken){
		setToken("password", multirequestToken);
	}

	// streamName:
	public String getStreamName(){
		return this.streamName;
	}
	public void setStreamName(String streamName){
		this.streamName = streamName;
	}

	public void streamName(String multirequestToken){
		setToken("streamName", multirequestToken);
	}

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


	public LiveStreamPushPublishRTMPConfiguration() {
		super();
	}

	public LiveStreamPushPublishRTMPConfiguration(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		userId = GsonParser.parseString(jsonObject.get("userId"));
		password = GsonParser.parseString(jsonObject.get("password"));
		streamName = GsonParser.parseString(jsonObject.get("streamName"));
		applicationName = GsonParser.parseString(jsonObject.get("applicationName"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveStreamPushPublishRTMPConfiguration");
		kparams.add("userId", this.userId);
		kparams.add("password", this.password);
		kparams.add("streamName", this.streamName);
		kparams.add("applicationName", this.applicationName);
		return kparams;
	}

}

