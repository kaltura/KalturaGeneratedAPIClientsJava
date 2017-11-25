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
// Copyright (C) 2006-2017  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(LiveStreamEntry.Tokenizer.class)
public class LiveStreamEntry extends LiveEntry {
	
	public interface Tokenizer extends LiveEntry.Tokenizer {
		String streamRemoteId();
		String streamRemoteBackupId();
		RequestBuilder.ListTokenizer<LiveStreamBitrate.Tokenizer> bitrates();
		String primaryBroadcastingUrl();
		String secondaryBroadcastingUrl();
		String primaryRtspBroadcastingUrl();
		String secondaryRtspBroadcastingUrl();
		String streamName();
		String streamUrl();
		String hlsStreamUrl();
		String urlManager();
		String encodingIP1();
		String encodingIP2();
		String streamPassword();
		String streamUsername();
		String primaryServerNodeId();
	}

	/**
	 * The stream id as provided by the provider
	 */
	private String streamRemoteId;
	/**
	 * The backup stream id as provided by the provider
	 */
	private String streamRemoteBackupId;
	/**
	 * Array of supported bitrates
	 */
	private List<LiveStreamBitrate> bitrates;
	private String primaryBroadcastingUrl;
	private String secondaryBroadcastingUrl;
	private String primaryRtspBroadcastingUrl;
	private String secondaryRtspBroadcastingUrl;
	private String streamName;
	/**
	 * The stream url
	 */
	private String streamUrl;
	/**
	 * HLS URL - URL for live stream playback on mobile device
	 */
	private String hlsStreamUrl;
	/**
	 * URL Manager to handle the live stream URL (for instance, add token)
	 */
	private String urlManager;
	/**
	 * The broadcast primary ip
	 */
	private String encodingIP1;
	/**
	 * The broadcast secondary ip
	 */
	private String encodingIP2;
	/**
	 * The broadcast password
	 */
	private String streamPassword;
	/**
	 * The broadcast username
	 */
	private String streamUsername;
	/**
	 * The Streams primary server node id
	 */
	private Integer primaryServerNodeId;

	// streamRemoteId:
	public String getStreamRemoteId(){
		return this.streamRemoteId;
	}
	public void setStreamRemoteId(String streamRemoteId){
		this.streamRemoteId = streamRemoteId;
	}

	public void streamRemoteId(String multirequestToken){
		setToken("streamRemoteId", multirequestToken);
	}

	// streamRemoteBackupId:
	public String getStreamRemoteBackupId(){
		return this.streamRemoteBackupId;
	}
	public void setStreamRemoteBackupId(String streamRemoteBackupId){
		this.streamRemoteBackupId = streamRemoteBackupId;
	}

	public void streamRemoteBackupId(String multirequestToken){
		setToken("streamRemoteBackupId", multirequestToken);
	}

	// bitrates:
	public List<LiveStreamBitrate> getBitrates(){
		return this.bitrates;
	}
	public void setBitrates(List<LiveStreamBitrate> bitrates){
		this.bitrates = bitrates;
	}

	// primaryBroadcastingUrl:
	public String getPrimaryBroadcastingUrl(){
		return this.primaryBroadcastingUrl;
	}
	public void setPrimaryBroadcastingUrl(String primaryBroadcastingUrl){
		this.primaryBroadcastingUrl = primaryBroadcastingUrl;
	}

	public void primaryBroadcastingUrl(String multirequestToken){
		setToken("primaryBroadcastingUrl", multirequestToken);
	}

	// secondaryBroadcastingUrl:
	public String getSecondaryBroadcastingUrl(){
		return this.secondaryBroadcastingUrl;
	}
	public void setSecondaryBroadcastingUrl(String secondaryBroadcastingUrl){
		this.secondaryBroadcastingUrl = secondaryBroadcastingUrl;
	}

	public void secondaryBroadcastingUrl(String multirequestToken){
		setToken("secondaryBroadcastingUrl", multirequestToken);
	}

	// primaryRtspBroadcastingUrl:
	public String getPrimaryRtspBroadcastingUrl(){
		return this.primaryRtspBroadcastingUrl;
	}
	public void setPrimaryRtspBroadcastingUrl(String primaryRtspBroadcastingUrl){
		this.primaryRtspBroadcastingUrl = primaryRtspBroadcastingUrl;
	}

	public void primaryRtspBroadcastingUrl(String multirequestToken){
		setToken("primaryRtspBroadcastingUrl", multirequestToken);
	}

	// secondaryRtspBroadcastingUrl:
	public String getSecondaryRtspBroadcastingUrl(){
		return this.secondaryRtspBroadcastingUrl;
	}
	public void setSecondaryRtspBroadcastingUrl(String secondaryRtspBroadcastingUrl){
		this.secondaryRtspBroadcastingUrl = secondaryRtspBroadcastingUrl;
	}

	public void secondaryRtspBroadcastingUrl(String multirequestToken){
		setToken("secondaryRtspBroadcastingUrl", multirequestToken);
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

	// streamUrl:
	public String getStreamUrl(){
		return this.streamUrl;
	}
	public void setStreamUrl(String streamUrl){
		this.streamUrl = streamUrl;
	}

	public void streamUrl(String multirequestToken){
		setToken("streamUrl", multirequestToken);
	}

	// hlsStreamUrl:
	public String getHlsStreamUrl(){
		return this.hlsStreamUrl;
	}
	public void setHlsStreamUrl(String hlsStreamUrl){
		this.hlsStreamUrl = hlsStreamUrl;
	}

	public void hlsStreamUrl(String multirequestToken){
		setToken("hlsStreamUrl", multirequestToken);
	}

	// urlManager:
	public String getUrlManager(){
		return this.urlManager;
	}
	public void setUrlManager(String urlManager){
		this.urlManager = urlManager;
	}

	public void urlManager(String multirequestToken){
		setToken("urlManager", multirequestToken);
	}

	// encodingIP1:
	public String getEncodingIP1(){
		return this.encodingIP1;
	}
	public void setEncodingIP1(String encodingIP1){
		this.encodingIP1 = encodingIP1;
	}

	public void encodingIP1(String multirequestToken){
		setToken("encodingIP1", multirequestToken);
	}

	// encodingIP2:
	public String getEncodingIP2(){
		return this.encodingIP2;
	}
	public void setEncodingIP2(String encodingIP2){
		this.encodingIP2 = encodingIP2;
	}

	public void encodingIP2(String multirequestToken){
		setToken("encodingIP2", multirequestToken);
	}

	// streamPassword:
	public String getStreamPassword(){
		return this.streamPassword;
	}
	public void setStreamPassword(String streamPassword){
		this.streamPassword = streamPassword;
	}

	public void streamPassword(String multirequestToken){
		setToken("streamPassword", multirequestToken);
	}

	// streamUsername:
	public String getStreamUsername(){
		return this.streamUsername;
	}
	public void setStreamUsername(String streamUsername){
		this.streamUsername = streamUsername;
	}

	public void streamUsername(String multirequestToken){
		setToken("streamUsername", multirequestToken);
	}

	// primaryServerNodeId:
	public Integer getPrimaryServerNodeId(){
		return this.primaryServerNodeId;
	}
	public void setPrimaryServerNodeId(Integer primaryServerNodeId){
		this.primaryServerNodeId = primaryServerNodeId;
	}

	public void primaryServerNodeId(String multirequestToken){
		setToken("primaryServerNodeId", multirequestToken);
	}


	public LiveStreamEntry() {
		super();
	}

	public LiveStreamEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		streamRemoteId = GsonParser.parseString(jsonObject.get("streamRemoteId"));
		streamRemoteBackupId = GsonParser.parseString(jsonObject.get("streamRemoteBackupId"));
		bitrates = GsonParser.parseArray(jsonObject.getAsJsonArray("bitrates"), LiveStreamBitrate.class);
		primaryBroadcastingUrl = GsonParser.parseString(jsonObject.get("primaryBroadcastingUrl"));
		secondaryBroadcastingUrl = GsonParser.parseString(jsonObject.get("secondaryBroadcastingUrl"));
		primaryRtspBroadcastingUrl = GsonParser.parseString(jsonObject.get("primaryRtspBroadcastingUrl"));
		secondaryRtspBroadcastingUrl = GsonParser.parseString(jsonObject.get("secondaryRtspBroadcastingUrl"));
		streamName = GsonParser.parseString(jsonObject.get("streamName"));
		streamUrl = GsonParser.parseString(jsonObject.get("streamUrl"));
		hlsStreamUrl = GsonParser.parseString(jsonObject.get("hlsStreamUrl"));
		urlManager = GsonParser.parseString(jsonObject.get("urlManager"));
		encodingIP1 = GsonParser.parseString(jsonObject.get("encodingIP1"));
		encodingIP2 = GsonParser.parseString(jsonObject.get("encodingIP2"));
		streamPassword = GsonParser.parseString(jsonObject.get("streamPassword"));
		streamUsername = GsonParser.parseString(jsonObject.get("streamUsername"));
		primaryServerNodeId = GsonParser.parseInt(jsonObject.get("primaryServerNodeId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveStreamEntry");
		kparams.add("bitrates", this.bitrates);
		kparams.add("primaryBroadcastingUrl", this.primaryBroadcastingUrl);
		kparams.add("secondaryBroadcastingUrl", this.secondaryBroadcastingUrl);
		kparams.add("primaryRtspBroadcastingUrl", this.primaryRtspBroadcastingUrl);
		kparams.add("secondaryRtspBroadcastingUrl", this.secondaryRtspBroadcastingUrl);
		kparams.add("streamName", this.streamName);
		kparams.add("streamUrl", this.streamUrl);
		kparams.add("hlsStreamUrl", this.hlsStreamUrl);
		kparams.add("urlManager", this.urlManager);
		kparams.add("encodingIP1", this.encodingIP1);
		kparams.add("encodingIP2", this.encodingIP2);
		kparams.add("streamPassword", this.streamPassword);
		return kparams;
	}

}

