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
// Copyright (C) 2006-2018  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(BusinessProcessSignalNotificationTemplate.Tokenizer.class)
public class BusinessProcessSignalNotificationTemplate extends BusinessProcessNotificationTemplate {
	
	public interface Tokenizer extends BusinessProcessNotificationTemplate.Tokenizer {
		String message();
		String eventId();
	}

	/**
	 * Define the message to be sent
	 */
	private String message;
	/**
	 * Define the event that waiting to the signal
	 */
	private String eventId;

	// message:
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}

	public void message(String multirequestToken){
		setToken("message", multirequestToken);
	}

	// eventId:
	public String getEventId(){
		return this.eventId;
	}
	public void setEventId(String eventId){
		this.eventId = eventId;
	}

	public void eventId(String multirequestToken){
		setToken("eventId", multirequestToken);
	}


	public BusinessProcessSignalNotificationTemplate() {
		super();
	}

	public BusinessProcessSignalNotificationTemplate(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		message = GsonParser.parseString(jsonObject.get("message"));
		eventId = GsonParser.parseString(jsonObject.get("eventId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBusinessProcessSignalNotificationTemplate");
		kparams.add("message", this.message);
		kparams.add("eventId", this.eventId);
		return kparams;
	}

}

