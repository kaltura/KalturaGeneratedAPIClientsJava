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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ClipDescription.Tokenizer.class)
public class ClipDescription extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String sourceEntryId();
		String startTime();
		String duration();
		String offsetInDestination();
	}

	private String sourceEntryId;
	private Integer startTime;
	private Integer duration;
	private Integer offsetInDestination;

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

	// startTime:
	public Integer getStartTime(){
		return this.startTime;
	}
	public void setStartTime(Integer startTime){
		this.startTime = startTime;
	}

	public void startTime(String multirequestToken){
		setToken("startTime", multirequestToken);
	}

	// duration:
	public Integer getDuration(){
		return this.duration;
	}
	public void setDuration(Integer duration){
		this.duration = duration;
	}

	public void duration(String multirequestToken){
		setToken("duration", multirequestToken);
	}

	// offsetInDestination:
	public Integer getOffsetInDestination(){
		return this.offsetInDestination;
	}
	public void setOffsetInDestination(Integer offsetInDestination){
		this.offsetInDestination = offsetInDestination;
	}

	public void offsetInDestination(String multirequestToken){
		setToken("offsetInDestination", multirequestToken);
	}


	public ClipDescription() {
		super();
	}

	public ClipDescription(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		sourceEntryId = GsonParser.parseString(jsonObject.get("sourceEntryId"));
		startTime = GsonParser.parseInt(jsonObject.get("startTime"));
		duration = GsonParser.parseInt(jsonObject.get("duration"));
		offsetInDestination = GsonParser.parseInt(jsonObject.get("offsetInDestination"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaClipDescription");
		kparams.add("sourceEntryId", this.sourceEntryId);
		kparams.add("startTime", this.startTime);
		kparams.add("duration", this.duration);
		kparams.add("offsetInDestination", this.offsetInDestination);
		return kparams;
	}

}

