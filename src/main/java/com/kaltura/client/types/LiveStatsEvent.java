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
import com.kaltura.client.enums.LiveStatsEventType;
import com.kaltura.client.enums.PlaybackProtocol;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Will hold data from the Kaltura Player components to be passed on to the live
  analytics system
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveStatsEvent.Tokenizer.class)
public class LiveStatsEvent extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String partnerId();
		String entryId();
		String eventType();
		String sessionId();
		String eventIndex();
		String bufferTime();
		String bitrate();
		String referrer();
		String isLive();
		String startTime();
		String deliveryType();
	}

	private Integer partnerId;
	private String entryId;
	/**
	 * an integer representing the type of event being sent from the player
	 */
	private LiveStatsEventType eventType;
	/**
	 * a unique string generated by the client that will represent the client-side
	  session: the primary component will pass it on to other components that sprout
	  from it
	 */
	private String sessionId;
	/**
	 * incremental sequence of the event
	 */
	private Integer eventIndex;
	/**
	 * buffer time in seconds from the last 10 seconds
	 */
	private Integer bufferTime;
	/**
	 * bitrate used in the last 10 seconds
	 */
	private Integer bitrate;
	/**
	 * the referrer of the client
	 */
	private String referrer;
	private Boolean isLive;
	/**
	 * the event start time as string
	 */
	private String startTime;
	/**
	 * delivery type used for this stream
	 */
	private PlaybackProtocol deliveryType;

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	public void setPartnerId(Integer partnerId){
		this.partnerId = partnerId;
	}

	public void partnerId(String multirequestToken){
		setToken("partnerId", multirequestToken);
	}

	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}

	// eventType:
	public LiveStatsEventType getEventType(){
		return this.eventType;
	}
	public void setEventType(LiveStatsEventType eventType){
		this.eventType = eventType;
	}

	public void eventType(String multirequestToken){
		setToken("eventType", multirequestToken);
	}

	// sessionId:
	public String getSessionId(){
		return this.sessionId;
	}
	public void setSessionId(String sessionId){
		this.sessionId = sessionId;
	}

	public void sessionId(String multirequestToken){
		setToken("sessionId", multirequestToken);
	}

	// eventIndex:
	public Integer getEventIndex(){
		return this.eventIndex;
	}
	public void setEventIndex(Integer eventIndex){
		this.eventIndex = eventIndex;
	}

	public void eventIndex(String multirequestToken){
		setToken("eventIndex", multirequestToken);
	}

	// bufferTime:
	public Integer getBufferTime(){
		return this.bufferTime;
	}
	public void setBufferTime(Integer bufferTime){
		this.bufferTime = bufferTime;
	}

	public void bufferTime(String multirequestToken){
		setToken("bufferTime", multirequestToken);
	}

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

	// referrer:
	public String getReferrer(){
		return this.referrer;
	}
	public void setReferrer(String referrer){
		this.referrer = referrer;
	}

	public void referrer(String multirequestToken){
		setToken("referrer", multirequestToken);
	}

	// isLive:
	public Boolean getIsLive(){
		return this.isLive;
	}
	public void setIsLive(Boolean isLive){
		this.isLive = isLive;
	}

	public void isLive(String multirequestToken){
		setToken("isLive", multirequestToken);
	}

	// startTime:
	public String getStartTime(){
		return this.startTime;
	}
	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public void startTime(String multirequestToken){
		setToken("startTime", multirequestToken);
	}

	// deliveryType:
	public PlaybackProtocol getDeliveryType(){
		return this.deliveryType;
	}
	public void setDeliveryType(PlaybackProtocol deliveryType){
		this.deliveryType = deliveryType;
	}

	public void deliveryType(String multirequestToken){
		setToken("deliveryType", multirequestToken);
	}


	public LiveStatsEvent() {
		super();
	}

	public LiveStatsEvent(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		eventType = LiveStatsEventType.get(GsonParser.parseInt(jsonObject.get("eventType")));
		sessionId = GsonParser.parseString(jsonObject.get("sessionId"));
		eventIndex = GsonParser.parseInt(jsonObject.get("eventIndex"));
		bufferTime = GsonParser.parseInt(jsonObject.get("bufferTime"));
		bitrate = GsonParser.parseInt(jsonObject.get("bitrate"));
		referrer = GsonParser.parseString(jsonObject.get("referrer"));
		isLive = GsonParser.parseBoolean(jsonObject.get("isLive"));
		startTime = GsonParser.parseString(jsonObject.get("startTime"));
		deliveryType = PlaybackProtocol.get(GsonParser.parseString(jsonObject.get("deliveryType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveStatsEvent");
		kparams.add("partnerId", this.partnerId);
		kparams.add("entryId", this.entryId);
		kparams.add("eventType", this.eventType);
		kparams.add("sessionId", this.sessionId);
		kparams.add("eventIndex", this.eventIndex);
		kparams.add("bufferTime", this.bufferTime);
		kparams.add("bitrate", this.bitrate);
		kparams.add("referrer", this.referrer);
		kparams.add("isLive", this.isLive);
		kparams.add("startTime", this.startTime);
		kparams.add("deliveryType", this.deliveryType);
		return kparams;
	}

}

