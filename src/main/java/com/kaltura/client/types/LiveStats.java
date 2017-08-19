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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveStats.Tokenizer.class)
public class LiveStats extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String audience();
		String dvrAudience();
		String avgBitrate();
		String bufferTime();
		String plays();
		String secondsViewed();
		String startEvent();
		String timestamp();
	}

	private Integer audience;
	private Integer dvrAudience;
	private Double avgBitrate;
	private Integer bufferTime;
	private Integer plays;
	private Integer secondsViewed;
	private Long startEvent;
	private Integer timestamp;

	// audience:
	public Integer getAudience(){
		return this.audience;
	}
	public void setAudience(Integer audience){
		this.audience = audience;
	}

	public void audience(String multirequestToken){
		setToken("audience", multirequestToken);
	}

	// dvrAudience:
	public Integer getDvrAudience(){
		return this.dvrAudience;
	}
	public void setDvrAudience(Integer dvrAudience){
		this.dvrAudience = dvrAudience;
	}

	public void dvrAudience(String multirequestToken){
		setToken("dvrAudience", multirequestToken);
	}

	// avgBitrate:
	public Double getAvgBitrate(){
		return this.avgBitrate;
	}
	public void setAvgBitrate(Double avgBitrate){
		this.avgBitrate = avgBitrate;
	}

	public void avgBitrate(String multirequestToken){
		setToken("avgBitrate", multirequestToken);
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

	// plays:
	public Integer getPlays(){
		return this.plays;
	}
	public void setPlays(Integer plays){
		this.plays = plays;
	}

	public void plays(String multirequestToken){
		setToken("plays", multirequestToken);
	}

	// secondsViewed:
	public Integer getSecondsViewed(){
		return this.secondsViewed;
	}
	public void setSecondsViewed(Integer secondsViewed){
		this.secondsViewed = secondsViewed;
	}

	public void secondsViewed(String multirequestToken){
		setToken("secondsViewed", multirequestToken);
	}

	// startEvent:
	public Long getStartEvent(){
		return this.startEvent;
	}
	public void setStartEvent(Long startEvent){
		this.startEvent = startEvent;
	}

	public void startEvent(String multirequestToken){
		setToken("startEvent", multirequestToken);
	}

	// timestamp:
	public Integer getTimestamp(){
		return this.timestamp;
	}
	public void setTimestamp(Integer timestamp){
		this.timestamp = timestamp;
	}

	public void timestamp(String multirequestToken){
		setToken("timestamp", multirequestToken);
	}


	public LiveStats() {
		super();
	}

	public LiveStats(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		audience = GsonParser.parseInt(jsonObject.get("audience"));
		dvrAudience = GsonParser.parseInt(jsonObject.get("dvrAudience"));
		avgBitrate = GsonParser.parseDouble(jsonObject.get("avgBitrate"));
		bufferTime = GsonParser.parseInt(jsonObject.get("bufferTime"));
		plays = GsonParser.parseInt(jsonObject.get("plays"));
		secondsViewed = GsonParser.parseInt(jsonObject.get("secondsViewed"));
		startEvent = GsonParser.parseLong(jsonObject.get("startEvent"));
		timestamp = GsonParser.parseInt(jsonObject.get("timestamp"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveStats");
		kparams.add("audience", this.audience);
		kparams.add("dvrAudience", this.dvrAudience);
		kparams.add("avgBitrate", this.avgBitrate);
		kparams.add("bufferTime", this.bufferTime);
		kparams.add("plays", this.plays);
		kparams.add("secondsViewed", this.secondsViewed);
		kparams.add("startEvent", this.startEvent);
		kparams.add("timestamp", this.timestamp);
		return kparams;
	}

}

