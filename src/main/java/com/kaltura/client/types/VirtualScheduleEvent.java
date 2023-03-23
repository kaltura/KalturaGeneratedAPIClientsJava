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
import com.kaltura.client.enums.VirtualScheduleEventSubType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VirtualScheduleEvent.Tokenizer.class)
public class VirtualScheduleEvent extends ScheduleEvent {
	
	public interface Tokenizer extends ScheduleEvent.Tokenizer {
		String virtualEventId();
		String virtualScheduleEventSubType();
	}

	/**
	 * The ID of the virtual event connected to this Schedule Event
	 */
	private Integer virtualEventId;
	/**
	 * The type of the Virtual Schedule Event
	 */
	private VirtualScheduleEventSubType virtualScheduleEventSubType;

	// virtualEventId:
	public Integer getVirtualEventId(){
		return this.virtualEventId;
	}
	public void setVirtualEventId(Integer virtualEventId){
		this.virtualEventId = virtualEventId;
	}

	public void virtualEventId(String multirequestToken){
		setToken("virtualEventId", multirequestToken);
	}

	// virtualScheduleEventSubType:
	public VirtualScheduleEventSubType getVirtualScheduleEventSubType(){
		return this.virtualScheduleEventSubType;
	}
	public void setVirtualScheduleEventSubType(VirtualScheduleEventSubType virtualScheduleEventSubType){
		this.virtualScheduleEventSubType = virtualScheduleEventSubType;
	}

	public void virtualScheduleEventSubType(String multirequestToken){
		setToken("virtualScheduleEventSubType", multirequestToken);
	}


	public VirtualScheduleEvent() {
		super();
	}

	public VirtualScheduleEvent(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		virtualEventId = GsonParser.parseInt(jsonObject.get("virtualEventId"));
		virtualScheduleEventSubType = VirtualScheduleEventSubType.get(GsonParser.parseInt(jsonObject.get("virtualScheduleEventSubType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVirtualScheduleEvent");
		kparams.add("virtualEventId", this.virtualEventId);
		kparams.add("virtualScheduleEventSubType", this.virtualScheduleEventSubType);
		return kparams;
	}

}

