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
// Copyright (C) 2006-2022  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(ScheduledVendorTaskData.Tokenizer.class)
public class ScheduledVendorTaskData extends VendorTaskData {
	
	public interface Tokenizer extends VendorTaskData.Tokenizer {
		String startDate();
		String endDate();
		String scheduledEventId();
	}

	private Integer startDate;
	private Integer endDate;
	private Integer scheduledEventId;

	// startDate:
	public Integer getStartDate(){
		return this.startDate;
	}
	public void setStartDate(Integer startDate){
		this.startDate = startDate;
	}

	public void startDate(String multirequestToken){
		setToken("startDate", multirequestToken);
	}

	// endDate:
	public Integer getEndDate(){
		return this.endDate;
	}
	public void setEndDate(Integer endDate){
		this.endDate = endDate;
	}

	public void endDate(String multirequestToken){
		setToken("endDate", multirequestToken);
	}

	// scheduledEventId:
	public Integer getScheduledEventId(){
		return this.scheduledEventId;
	}
	public void setScheduledEventId(Integer scheduledEventId){
		this.scheduledEventId = scheduledEventId;
	}

	public void scheduledEventId(String multirequestToken){
		setToken("scheduledEventId", multirequestToken);
	}


	public ScheduledVendorTaskData() {
		super();
	}

	public ScheduledVendorTaskData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		startDate = GsonParser.parseInt(jsonObject.get("startDate"));
		endDate = GsonParser.parseInt(jsonObject.get("endDate"));
		scheduledEventId = GsonParser.parseInt(jsonObject.get("scheduledEventId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaScheduledVendorTaskData");
		kparams.add("startDate", this.startDate);
		kparams.add("endDate", this.endDate);
		kparams.add("scheduledEventId", this.scheduledEventId);
		return kparams;
	}

}

