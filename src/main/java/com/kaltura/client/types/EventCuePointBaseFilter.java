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
import com.kaltura.client.enums.EventType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EventCuePointBaseFilter.Tokenizer.class)
public abstract class EventCuePointBaseFilter extends CuePointFilter {
	
	public interface Tokenizer extends CuePointFilter.Tokenizer {
		String eventTypeEqual();
		String eventTypeIn();
	}

	private EventType eventTypeEqual;
	private String eventTypeIn;

	// eventTypeEqual:
	public EventType getEventTypeEqual(){
		return this.eventTypeEqual;
	}
	public void setEventTypeEqual(EventType eventTypeEqual){
		this.eventTypeEqual = eventTypeEqual;
	}

	public void eventTypeEqual(String multirequestToken){
		setToken("eventTypeEqual", multirequestToken);
	}

	// eventTypeIn:
	public String getEventTypeIn(){
		return this.eventTypeIn;
	}
	public void setEventTypeIn(String eventTypeIn){
		this.eventTypeIn = eventTypeIn;
	}

	public void eventTypeIn(String multirequestToken){
		setToken("eventTypeIn", multirequestToken);
	}


	public EventCuePointBaseFilter() {
		super();
	}

	public EventCuePointBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		eventTypeEqual = EventType.get(GsonParser.parseString(jsonObject.get("eventTypeEqual")));
		eventTypeIn = GsonParser.parseString(jsonObject.get("eventTypeIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEventCuePointBaseFilter");
		kparams.add("eventTypeEqual", this.eventTypeEqual);
		kparams.add("eventTypeIn", this.eventTypeIn);
		return kparams;
	}

}

