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
import com.kaltura.client.enums.PlaybackProtocol;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * A representation of a live stream configuration
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveStreamConfiguration.Tokenizer.class)
public class LiveStreamConfiguration extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String protocol();
		String url();
		String publishUrl();
		String backupUrl();
		String streamName();
	}

	private PlaybackProtocol protocol;
	private String url;
	private String publishUrl;
	private String backupUrl;
	private String streamName;

	// protocol:
	public PlaybackProtocol getProtocol(){
		return this.protocol;
	}
	public void setProtocol(PlaybackProtocol protocol){
		this.protocol = protocol;
	}

	public void protocol(String multirequestToken){
		setToken("protocol", multirequestToken);
	}

	// url:
	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url = url;
	}

	public void url(String multirequestToken){
		setToken("url", multirequestToken);
	}

	// publishUrl:
	public String getPublishUrl(){
		return this.publishUrl;
	}
	public void setPublishUrl(String publishUrl){
		this.publishUrl = publishUrl;
	}

	public void publishUrl(String multirequestToken){
		setToken("publishUrl", multirequestToken);
	}

	// backupUrl:
	public String getBackupUrl(){
		return this.backupUrl;
	}
	public void setBackupUrl(String backupUrl){
		this.backupUrl = backupUrl;
	}

	public void backupUrl(String multirequestToken){
		setToken("backupUrl", multirequestToken);
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


	public LiveStreamConfiguration() {
		super();
	}

	public LiveStreamConfiguration(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		protocol = PlaybackProtocol.get(GsonParser.parseString(jsonObject.get("protocol")));
		url = GsonParser.parseString(jsonObject.get("url"));
		publishUrl = GsonParser.parseString(jsonObject.get("publishUrl"));
		backupUrl = GsonParser.parseString(jsonObject.get("backupUrl"));
		streamName = GsonParser.parseString(jsonObject.get("streamName"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveStreamConfiguration");
		kparams.add("protocol", this.protocol);
		kparams.add("url", this.url);
		kparams.add("publishUrl", this.publishUrl);
		kparams.add("backupUrl", this.backupUrl);
		kparams.add("streamName", this.streamName);
		return kparams;
	}

}

