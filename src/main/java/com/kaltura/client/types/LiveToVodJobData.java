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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveToVodJobData.Tokenizer.class)
public class LiveToVodJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String vodEntryId();
		String liveEntryId();
		String totalVodDuration();
		String lastSegmentDuration();
		String amfArray();
		String lastCuePointSyncTime();
		String lastSegmentDrift();
	}

	/**
	 * $vod Entry Id
	 */
	private String vodEntryId;
	/**
	 * live Entry Id
	 */
	private String liveEntryId;
	/**
	 * total VOD Duration
	 */
	private Double totalVodDuration;
	/**
	 * last Segment Duration
	 */
	private Double lastSegmentDuration;
	/**
	 * amf Array File Path
	 */
	private String amfArray;
	/**
	 * last live to vod sync time
	 */
	private Integer lastCuePointSyncTime;
	/**
	 * last segment drift
	 */
	private Integer lastSegmentDrift;

	// vodEntryId:
	public String getVodEntryId(){
		return this.vodEntryId;
	}
	public void setVodEntryId(String vodEntryId){
		this.vodEntryId = vodEntryId;
	}

	public void vodEntryId(String multirequestToken){
		setToken("vodEntryId", multirequestToken);
	}

	// liveEntryId:
	public String getLiveEntryId(){
		return this.liveEntryId;
	}
	public void setLiveEntryId(String liveEntryId){
		this.liveEntryId = liveEntryId;
	}

	public void liveEntryId(String multirequestToken){
		setToken("liveEntryId", multirequestToken);
	}

	// totalVodDuration:
	public Double getTotalVodDuration(){
		return this.totalVodDuration;
	}
	public void setTotalVodDuration(Double totalVodDuration){
		this.totalVodDuration = totalVodDuration;
	}

	public void totalVodDuration(String multirequestToken){
		setToken("totalVodDuration", multirequestToken);
	}

	// lastSegmentDuration:
	public Double getLastSegmentDuration(){
		return this.lastSegmentDuration;
	}
	public void setLastSegmentDuration(Double lastSegmentDuration){
		this.lastSegmentDuration = lastSegmentDuration;
	}

	public void lastSegmentDuration(String multirequestToken){
		setToken("lastSegmentDuration", multirequestToken);
	}

	// amfArray:
	public String getAmfArray(){
		return this.amfArray;
	}
	public void setAmfArray(String amfArray){
		this.amfArray = amfArray;
	}

	public void amfArray(String multirequestToken){
		setToken("amfArray", multirequestToken);
	}

	// lastCuePointSyncTime:
	public Integer getLastCuePointSyncTime(){
		return this.lastCuePointSyncTime;
	}
	public void setLastCuePointSyncTime(Integer lastCuePointSyncTime){
		this.lastCuePointSyncTime = lastCuePointSyncTime;
	}

	public void lastCuePointSyncTime(String multirequestToken){
		setToken("lastCuePointSyncTime", multirequestToken);
	}

	// lastSegmentDrift:
	public Integer getLastSegmentDrift(){
		return this.lastSegmentDrift;
	}
	public void setLastSegmentDrift(Integer lastSegmentDrift){
		this.lastSegmentDrift = lastSegmentDrift;
	}

	public void lastSegmentDrift(String multirequestToken){
		setToken("lastSegmentDrift", multirequestToken);
	}


	public LiveToVodJobData() {
		super();
	}

	public LiveToVodJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		vodEntryId = GsonParser.parseString(jsonObject.get("vodEntryId"));
		liveEntryId = GsonParser.parseString(jsonObject.get("liveEntryId"));
		totalVodDuration = GsonParser.parseDouble(jsonObject.get("totalVodDuration"));
		lastSegmentDuration = GsonParser.parseDouble(jsonObject.get("lastSegmentDuration"));
		amfArray = GsonParser.parseString(jsonObject.get("amfArray"));
		lastCuePointSyncTime = GsonParser.parseInt(jsonObject.get("lastCuePointSyncTime"));
		lastSegmentDrift = GsonParser.parseInt(jsonObject.get("lastSegmentDrift"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveToVodJobData");
		kparams.add("vodEntryId", this.vodEntryId);
		kparams.add("liveEntryId", this.liveEntryId);
		kparams.add("totalVodDuration", this.totalVodDuration);
		kparams.add("lastSegmentDuration", this.lastSegmentDuration);
		kparams.add("amfArray", this.amfArray);
		kparams.add("lastCuePointSyncTime", this.lastCuePointSyncTime);
		kparams.add("lastSegmentDrift", this.lastSegmentDrift);
		return kparams;
	}

}

