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
// Copyright (C) 2006-2020  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(LiveStreamScheduleEvent.Tokenizer.class)
public class LiveStreamScheduleEvent extends EntryScheduleEvent {
	
	public interface Tokenizer extends EntryScheduleEvent.Tokenizer {
		String projectedAudience();
		String sourceEntryId();
		String preStartTime();
	}

	/**
	 * Defines the expected audience.
	 */
	private Integer projectedAudience;
	/**
	 * The entry ID of the source entry (for simulive)
	 */
	private String sourceEntryId;
	/**
	 * The time relative time before the startTime considered as preStart time
	 */
	private Integer preStartTime;

	// projectedAudience:
	public Integer getProjectedAudience(){
		return this.projectedAudience;
	}
	public void setProjectedAudience(Integer projectedAudience){
		this.projectedAudience = projectedAudience;
	}

	public void projectedAudience(String multirequestToken){
		setToken("projectedAudience", multirequestToken);
	}

	// sourceEntryId:
	public String getSourceEntryId(){
		return this.sourceEntryId;
	}
	public void setSourceEntryId(String sourceEntryId){
		this.sourceEntryId = sourceEntryId;
	}

	public void sourceEntryId(String multirequestToken){
		setToken("sourceEntryId", multirequestToken);
	}

	// preStartTime:
	public Integer getPreStartTime(){
		return this.preStartTime;
	}
	public void setPreStartTime(Integer preStartTime){
		this.preStartTime = preStartTime;
	}

	public void preStartTime(String multirequestToken){
		setToken("preStartTime", multirequestToken);
	}


	public LiveStreamScheduleEvent() {
		super();
	}

	public LiveStreamScheduleEvent(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		projectedAudience = GsonParser.parseInt(jsonObject.get("projectedAudience"));
		sourceEntryId = GsonParser.parseString(jsonObject.get("sourceEntryId"));
		preStartTime = GsonParser.parseInt(jsonObject.get("preStartTime"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveStreamScheduleEvent");
		kparams.add("projectedAudience", this.projectedAudience);
		kparams.add("sourceEntryId", this.sourceEntryId);
		kparams.add("preStartTime", this.preStartTime);
		return kparams;
	}

}

