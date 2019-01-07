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
import com.kaltura.client.enums.DVRStatus;
import com.kaltura.client.enums.EntryServerNodeStatus;
import com.kaltura.client.enums.LivePublishStatus;
import com.kaltura.client.enums.RecordStatus;
import com.kaltura.client.enums.RecordingStatus;
import com.kaltura.client.enums.ViewMode;
import com.kaltura.client.types.LiveEntryRecordingOptions;
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
@MultiRequestBuilder.Tokenizer(LiveEntry.Tokenizer.class)
public abstract class LiveEntry extends MediaEntry {
	
	public interface Tokenizer extends MediaEntry.Tokenizer {
		String offlineMessage();
		String recordStatus();
		String dvrStatus();
		String dvrWindow();
		String lastElapsedRecordingTime();
		RequestBuilder.ListTokenizer<LiveStreamConfiguration.Tokenizer> liveStreamConfigurations();
		String recordedEntryId();
		String pushPublishEnabled();
		RequestBuilder.ListTokenizer<LiveStreamPushPublishConfiguration.Tokenizer> publishConfigurations();
		String firstBroadcast();
		String lastBroadcast();
		String currentBroadcastStartTime();
		LiveEntryRecordingOptions.Tokenizer recordingOptions();
		String liveStatus();
		String segmentDuration();
		String explicitLive();
		String viewMode();
		String recordingStatus();
		String lastBroadcastEndTime();
	}

	/**
	 * The message to be presented when the stream is offline
	 */
	private String offlineMessage;
	/**
	 * Recording Status Enabled/Disabled
	 */
	private RecordStatus recordStatus;
	/**
	 * DVR Status Enabled/Disabled
	 */
	private DVRStatus dvrStatus;
	/**
	 * Window of time which the DVR allows for backwards scrubbing (in minutes)
	 */
	private Integer dvrWindow;
	/**
	 * Elapsed recording time (in msec) up to the point where the live stream was last
	  stopped (unpublished).
	 */
	private Integer lastElapsedRecordingTime;
	/**
	 * Array of key value protocol-&gt;live stream url objects
	 */
	private List<LiveStreamConfiguration> liveStreamConfigurations;
	/**
	 * Recorded entry id
	 */
	private String recordedEntryId;
	/**
	 * Flag denoting whether entry should be published by the media server
	 */
	private LivePublishStatus pushPublishEnabled;
	/**
	 * Array of publish configurations
	 */
	private List<LiveStreamPushPublishConfiguration> publishConfigurations;
	/**
	 * The first time in which the entry was broadcast
	 */
	private Integer firstBroadcast;
	/**
	 * The Last time in which the entry was broadcast
	 */
	private Integer lastBroadcast;
	/**
	 * The time (unix timestamp in milliseconds) in which the entry broadcast started
	  or 0 when the entry is off the air
	 */
	private Double currentBroadcastStartTime;
	private LiveEntryRecordingOptions recordingOptions;
	/**
	 * the status of the entry of type EntryServerNodeStatus
	 */
	private EntryServerNodeStatus liveStatus;
	/**
	 * The chunk duration value in milliseconds
	 */
	private Integer segmentDuration;
	private Boolean explicitLive;
	private ViewMode viewMode;
	private RecordingStatus recordingStatus;
	/**
	 * The time the last broadcast finished.
	 */
	private Integer lastBroadcastEndTime;

	// offlineMessage:
	public String getOfflineMessage(){
		return this.offlineMessage;
	}
	public void setOfflineMessage(String offlineMessage){
		this.offlineMessage = offlineMessage;
	}

	public void offlineMessage(String multirequestToken){
		setToken("offlineMessage", multirequestToken);
	}

	// recordStatus:
	public RecordStatus getRecordStatus(){
		return this.recordStatus;
	}
	public void setRecordStatus(RecordStatus recordStatus){
		this.recordStatus = recordStatus;
	}

	public void recordStatus(String multirequestToken){
		setToken("recordStatus", multirequestToken);
	}

	// dvrStatus:
	public DVRStatus getDvrStatus(){
		return this.dvrStatus;
	}
	public void setDvrStatus(DVRStatus dvrStatus){
		this.dvrStatus = dvrStatus;
	}

	public void dvrStatus(String multirequestToken){
		setToken("dvrStatus", multirequestToken);
	}

	// dvrWindow:
	public Integer getDvrWindow(){
		return this.dvrWindow;
	}
	public void setDvrWindow(Integer dvrWindow){
		this.dvrWindow = dvrWindow;
	}

	public void dvrWindow(String multirequestToken){
		setToken("dvrWindow", multirequestToken);
	}

	// lastElapsedRecordingTime:
	public Integer getLastElapsedRecordingTime(){
		return this.lastElapsedRecordingTime;
	}
	public void setLastElapsedRecordingTime(Integer lastElapsedRecordingTime){
		this.lastElapsedRecordingTime = lastElapsedRecordingTime;
	}

	public void lastElapsedRecordingTime(String multirequestToken){
		setToken("lastElapsedRecordingTime", multirequestToken);
	}

	// liveStreamConfigurations:
	public List<LiveStreamConfiguration> getLiveStreamConfigurations(){
		return this.liveStreamConfigurations;
	}
	public void setLiveStreamConfigurations(List<LiveStreamConfiguration> liveStreamConfigurations){
		this.liveStreamConfigurations = liveStreamConfigurations;
	}

	// recordedEntryId:
	public String getRecordedEntryId(){
		return this.recordedEntryId;
	}
	public void setRecordedEntryId(String recordedEntryId){
		this.recordedEntryId = recordedEntryId;
	}

	public void recordedEntryId(String multirequestToken){
		setToken("recordedEntryId", multirequestToken);
	}

	// pushPublishEnabled:
	public LivePublishStatus getPushPublishEnabled(){
		return this.pushPublishEnabled;
	}
	public void setPushPublishEnabled(LivePublishStatus pushPublishEnabled){
		this.pushPublishEnabled = pushPublishEnabled;
	}

	public void pushPublishEnabled(String multirequestToken){
		setToken("pushPublishEnabled", multirequestToken);
	}

	// publishConfigurations:
	public List<LiveStreamPushPublishConfiguration> getPublishConfigurations(){
		return this.publishConfigurations;
	}
	public void setPublishConfigurations(List<LiveStreamPushPublishConfiguration> publishConfigurations){
		this.publishConfigurations = publishConfigurations;
	}

	// firstBroadcast:
	public Integer getFirstBroadcast(){
		return this.firstBroadcast;
	}
	// lastBroadcast:
	public Integer getLastBroadcast(){
		return this.lastBroadcast;
	}
	// currentBroadcastStartTime:
	public Double getCurrentBroadcastStartTime(){
		return this.currentBroadcastStartTime;
	}
	public void setCurrentBroadcastStartTime(Double currentBroadcastStartTime){
		this.currentBroadcastStartTime = currentBroadcastStartTime;
	}

	public void currentBroadcastStartTime(String multirequestToken){
		setToken("currentBroadcastStartTime", multirequestToken);
	}

	// recordingOptions:
	public LiveEntryRecordingOptions getRecordingOptions(){
		return this.recordingOptions;
	}
	public void setRecordingOptions(LiveEntryRecordingOptions recordingOptions){
		this.recordingOptions = recordingOptions;
	}

	// liveStatus:
	public EntryServerNodeStatus getLiveStatus(){
		return this.liveStatus;
	}
	// segmentDuration:
	public Integer getSegmentDuration(){
		return this.segmentDuration;
	}
	public void setSegmentDuration(Integer segmentDuration){
		this.segmentDuration = segmentDuration;
	}

	public void segmentDuration(String multirequestToken){
		setToken("segmentDuration", multirequestToken);
	}

	// explicitLive:
	public Boolean getExplicitLive(){
		return this.explicitLive;
	}
	public void setExplicitLive(Boolean explicitLive){
		this.explicitLive = explicitLive;
	}

	public void explicitLive(String multirequestToken){
		setToken("explicitLive", multirequestToken);
	}

	// viewMode:
	public ViewMode getViewMode(){
		return this.viewMode;
	}
	public void setViewMode(ViewMode viewMode){
		this.viewMode = viewMode;
	}

	public void viewMode(String multirequestToken){
		setToken("viewMode", multirequestToken);
	}

	// recordingStatus:
	public RecordingStatus getRecordingStatus(){
		return this.recordingStatus;
	}
	public void setRecordingStatus(RecordingStatus recordingStatus){
		this.recordingStatus = recordingStatus;
	}

	public void recordingStatus(String multirequestToken){
		setToken("recordingStatus", multirequestToken);
	}

	// lastBroadcastEndTime:
	public Integer getLastBroadcastEndTime(){
		return this.lastBroadcastEndTime;
	}

	public LiveEntry() {
		super();
	}

	public LiveEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		offlineMessage = GsonParser.parseString(jsonObject.get("offlineMessage"));
		recordStatus = RecordStatus.get(GsonParser.parseInt(jsonObject.get("recordStatus")));
		dvrStatus = DVRStatus.get(GsonParser.parseInt(jsonObject.get("dvrStatus")));
		dvrWindow = GsonParser.parseInt(jsonObject.get("dvrWindow"));
		lastElapsedRecordingTime = GsonParser.parseInt(jsonObject.get("lastElapsedRecordingTime"));
		liveStreamConfigurations = GsonParser.parseArray(jsonObject.getAsJsonArray("liveStreamConfigurations"), LiveStreamConfiguration.class);
		recordedEntryId = GsonParser.parseString(jsonObject.get("recordedEntryId"));
		pushPublishEnabled = LivePublishStatus.get(GsonParser.parseInt(jsonObject.get("pushPublishEnabled")));
		publishConfigurations = GsonParser.parseArray(jsonObject.getAsJsonArray("publishConfigurations"), LiveStreamPushPublishConfiguration.class);
		firstBroadcast = GsonParser.parseInt(jsonObject.get("firstBroadcast"));
		lastBroadcast = GsonParser.parseInt(jsonObject.get("lastBroadcast"));
		currentBroadcastStartTime = GsonParser.parseDouble(jsonObject.get("currentBroadcastStartTime"));
		recordingOptions = GsonParser.parseObject(jsonObject.getAsJsonObject("recordingOptions"), LiveEntryRecordingOptions.class);
		liveStatus = EntryServerNodeStatus.get(GsonParser.parseInt(jsonObject.get("liveStatus")));
		segmentDuration = GsonParser.parseInt(jsonObject.get("segmentDuration"));
		explicitLive = GsonParser.parseBoolean(jsonObject.get("explicitLive"));
		viewMode = ViewMode.get(GsonParser.parseInt(jsonObject.get("viewMode")));
		recordingStatus = RecordingStatus.get(GsonParser.parseInt(jsonObject.get("recordingStatus")));
		lastBroadcastEndTime = GsonParser.parseInt(jsonObject.get("lastBroadcastEndTime"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveEntry");
		kparams.add("offlineMessage", this.offlineMessage);
		kparams.add("recordStatus", this.recordStatus);
		kparams.add("dvrStatus", this.dvrStatus);
		kparams.add("dvrWindow", this.dvrWindow);
		kparams.add("lastElapsedRecordingTime", this.lastElapsedRecordingTime);
		kparams.add("liveStreamConfigurations", this.liveStreamConfigurations);
		kparams.add("recordedEntryId", this.recordedEntryId);
		kparams.add("pushPublishEnabled", this.pushPublishEnabled);
		kparams.add("publishConfigurations", this.publishConfigurations);
		kparams.add("currentBroadcastStartTime", this.currentBroadcastStartTime);
		kparams.add("recordingOptions", this.recordingOptions);
		kparams.add("segmentDuration", this.segmentDuration);
		kparams.add("explicitLive", this.explicitLive);
		kparams.add("viewMode", this.viewMode);
		kparams.add("recordingStatus", this.recordingStatus);
		return kparams;
	}

}

