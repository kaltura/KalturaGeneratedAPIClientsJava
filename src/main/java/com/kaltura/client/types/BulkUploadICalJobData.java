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
import com.kaltura.client.enums.ScheduleEventType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Represents the Bulk upload job data for iCal bulk upload
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUploadICalJobData.Tokenizer.class)
public class BulkUploadICalJobData extends BulkUploadScheduleEventJobData {
	
	public interface Tokenizer extends BulkUploadScheduleEventJobData.Tokenizer {
		String eventsType();
	}

	/**
	 * The type of the events that ill be created by this upload
	 */
	private ScheduleEventType eventsType;

	// eventsType:
	public ScheduleEventType getEventsType(){
		return this.eventsType;
	}
	public void setEventsType(ScheduleEventType eventsType){
		this.eventsType = eventsType;
	}

	public void eventsType(String multirequestToken){
		setToken("eventsType", multirequestToken);
	}


	public BulkUploadICalJobData() {
		super();
	}

	public BulkUploadICalJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		eventsType = ScheduleEventType.get(GsonParser.parseInt(jsonObject.get("eventsType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUploadICalJobData");
		kparams.add("eventsType", this.eventsType);
		return kparams;
	}

}

