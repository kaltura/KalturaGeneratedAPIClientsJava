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
import com.kaltura.client.enums.SipSourceType;
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
		String primarySecuredBroadcastingUrl();
		String secondarySecuredBroadcastingUrl();
		String primaryRtspBroadcastingUrl();
		String secondaryRtspBroadcastingUrl();
		String primarySrtBroadcastingUrl();
		String primarySrtStreamId();
		String secondarySrtBroadcastingUrl();
		String secondarySrtStreamId();
		String streamName();
		String streamUrl();
		String hlsStreamUrl();
		String urlManager();
		String encodingIP1();
		String encodingIP2();
		String streamPassword();
		String streamUsername();
		String srtPass();
		String primaryServerNodeId();
		String sipToken();
		String sipSourceType();
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
	private String primarySecuredBroadcastingUrl;
	private String secondarySecuredBroadcastingUrl;
	private String primaryRtspBroadcastingUrl;
	private String secondaryRtspBroadcastingUrl;
	private String primarySrtBroadcastingUrl;
	private String primarySrtStreamId;
	private String secondarySrtBroadcastingUrl;
	private String secondarySrtStreamId;
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
	private String srtPass;
	/**
	 * The Streams primary server node id
	 */
	private Integer primaryServerNodeId;
	private String sipToken;
	private SipSourceType sipSourceType;

	// streamRemoteId:
	public String getStreamRemoteId(){
		return this.streamRemoteId;
	}
	// streamRemoteBackupId:
	public String getStreamRemoteBackupId(){
		return this.streamRemoteBackupId;
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

	// primarySecuredBroadcastingUrl:
	public String getPrimarySecuredBroadcastingUrl(){
		return this.primarySecuredBroadcastingUrl;
	}
	public void setPrimarySecuredBroadcastingUrl(String primarySecuredBroadcastingUrl){
		this.primarySecuredBroadcastingUrl = primarySecuredBroadcastingUrl;
	}

	public void primarySecuredBroadcastingUrl(String multirequestToken){
		setToken("primarySecuredBroadcastingUrl", multirequestToken);
	}

	// secondarySecuredBroadcastingUrl:
	public String getSecondarySecuredBroadcastingUrl(){
		return this.secondarySecuredBroadcastingUrl;
	}
	public void setSecondarySecuredBroadcastingUrl(String secondarySecuredBroadcastingUrl){
		this.secondarySecuredBroadcastingUrl = secondarySecuredBroadcastingUrl;
	}

	public void secondarySecuredBroadcastingUrl(String multirequestToken){
		setToken("secondarySecuredBroadcastingUrl", multirequestToken);
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

	// primarySrtBroadcastingUrl:
	public String getPrimarySrtBroadcastingUrl(){
		return this.primarySrtBroadcastingUrl;
	}
	public void setPrimarySrtBroadcastingUrl(String primarySrtBroadcastingUrl){
		this.primarySrtBroadcastingUrl = primarySrtBroadcastingUrl;
	}

	public void primarySrtBroadcastingUrl(String multirequestToken){
		setToken("primarySrtBroadcastingUrl", multirequestToken);
	}

	// primarySrtStreamId:
	public String getPrimarySrtStreamId(){
		return this.primarySrtStreamId;
	}
	public void setPrimarySrtStreamId(String primarySrtStreamId){
		this.primarySrtStreamId = primarySrtStreamId;
	}

	public void primarySrtStreamId(String multirequestToken){
		setToken("primarySrtStreamId", multirequestToken);
	}

	// secondarySrtBroadcastingUrl:
	public String getSecondarySrtBroadcastingUrl(){
		return this.secondarySrtBroadcastingUrl;
	}
	public void setSecondarySrtBroadcastingUrl(String secondarySrtBroadcastingUrl){
		this.secondarySrtBroadcastingUrl = secondarySrtBroadcastingUrl;
	}

	public void secondarySrtBroadcastingUrl(String multirequestToken){
		setToken("secondarySrtBroadcastingUrl", multirequestToken);
	}

	// secondarySrtStreamId:
	public String getSecondarySrtStreamId(){
		return this.secondarySrtStreamId;
	}
	public void setSecondarySrtStreamId(String secondarySrtStreamId){
		this.secondarySrtStreamId = secondarySrtStreamId;
	}

	public void secondarySrtStreamId(String multirequestToken){
		setToken("secondarySrtStreamId", multirequestToken);
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
	// srtPass:
	public String getSrtPass(){
		return this.srtPass;
	}
	public void setSrtPass(String srtPass){
		this.srtPass = srtPass;
	}

	public void srtPass(String multirequestToken){
		setToken("srtPass", multirequestToken);
	}

	// primaryServerNodeId:
	public Integer getPrimaryServerNodeId(){
		return this.primaryServerNodeId;
	}
	// sipToken:
	public String getSipToken(){
		return this.sipToken;
	}
	// sipSourceType:
	public SipSourceType getSipSourceType(){
		return this.sipSourceType;
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
		primarySecuredBroadcastingUrl = GsonParser.parseString(jsonObject.get("primarySecuredBroadcastingUrl"));
		secondarySecuredBroadcastingUrl = GsonParser.parseString(jsonObject.get("secondarySecuredBroadcastingUrl"));
		primaryRtspBroadcastingUrl = GsonParser.parseString(jsonObject.get("primaryRtspBroadcastingUrl"));
		secondaryRtspBroadcastingUrl = GsonParser.parseString(jsonObject.get("secondaryRtspBroadcastingUrl"));
		primarySrtBroadcastingUrl = GsonParser.parseString(jsonObject.get("primarySrtBroadcastingUrl"));
		primarySrtStreamId = GsonParser.parseString(jsonObject.get("primarySrtStreamId"));
		secondarySrtBroadcastingUrl = GsonParser.parseString(jsonObject.get("secondarySrtBroadcastingUrl"));
		secondarySrtStreamId = GsonParser.parseString(jsonObject.get("secondarySrtStreamId"));
		streamName = GsonParser.parseString(jsonObject.get("streamName"));
		streamUrl = GsonParser.parseString(jsonObject.get("streamUrl"));
		hlsStreamUrl = GsonParser.parseString(jsonObject.get("hlsStreamUrl"));
		urlManager = GsonParser.parseString(jsonObject.get("urlManager"));
		encodingIP1 = GsonParser.parseString(jsonObject.get("encodingIP1"));
		encodingIP2 = GsonParser.parseString(jsonObject.get("encodingIP2"));
		streamPassword = GsonParser.parseString(jsonObject.get("streamPassword"));
		streamUsername = GsonParser.parseString(jsonObject.get("streamUsername"));
		srtPass = GsonParser.parseString(jsonObject.get("srtPass"));
		primaryServerNodeId = GsonParser.parseInt(jsonObject.get("primaryServerNodeId"));
		sipToken = GsonParser.parseString(jsonObject.get("sipToken"));
		sipSourceType = SipSourceType.get(GsonParser.parseInt(jsonObject.get("sipSourceType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveStreamEntry");
		kparams.add("bitrates", this.bitrates);
		kparams.add("primaryBroadcastingUrl", this.primaryBroadcastingUrl);
		kparams.add("secondaryBroadcastingUrl", this.secondaryBroadcastingUrl);
		kparams.add("primarySecuredBroadcastingUrl", this.primarySecuredBroadcastingUrl);
		kparams.add("secondarySecuredBroadcastingUrl", this.secondarySecuredBroadcastingUrl);
		kparams.add("primaryRtspBroadcastingUrl", this.primaryRtspBroadcastingUrl);
		kparams.add("secondaryRtspBroadcastingUrl", this.secondaryRtspBroadcastingUrl);
		kparams.add("primarySrtBroadcastingUrl", this.primarySrtBroadcastingUrl);
		kparams.add("primarySrtStreamId", this.primarySrtStreamId);
		kparams.add("secondarySrtBroadcastingUrl", this.secondarySrtBroadcastingUrl);
		kparams.add("secondarySrtStreamId", this.secondarySrtStreamId);
		kparams.add("streamName", this.streamName);
		kparams.add("streamUrl", this.streamUrl);
		kparams.add("hlsStreamUrl", this.hlsStreamUrl);
		kparams.add("urlManager", this.urlManager);
		kparams.add("encodingIP1", this.encodingIP1);
		kparams.add("encodingIP2", this.encodingIP2);
		kparams.add("streamPassword", this.streamPassword);
		kparams.add("srtPass", this.srtPass);
		return kparams;
	}

}

