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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LinkedScheduleEvent.Tokenizer.class)
public class LinkedScheduleEvent extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String offset();
		String eventId();
	}

	/**
	 * The time between the end of the event which it's id is in $eventId and the start
	  of the event holding this object
	 */
	private Integer offset;
	/**
	 * The id of the event influencing the start of the event holding this object
	 */
	private Integer eventId;

	// offset:
	public Integer getOffset(){
		return this.offset;
	}
	public void setOffset(Integer offset){
		this.offset = offset;
	}

	public void offset(String multirequestToken){
		setToken("offset", multirequestToken);
	}

	// eventId:
	public Integer getEventId(){
		return this.eventId;
	}
	public void setEventId(Integer eventId){
		this.eventId = eventId;
	}

	public void eventId(String multirequestToken){
		setToken("eventId", multirequestToken);
	}


	public LinkedScheduleEvent() {
		super();
	}

	public LinkedScheduleEvent(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		offset = GsonParser.parseInt(jsonObject.get("offset"));
		eventId = GsonParser.parseInt(jsonObject.get("eventId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLinkedScheduleEvent");
		kparams.add("offset", this.offset);
		kparams.add("eventId", this.eventId);
		return kparams;
	}

}

