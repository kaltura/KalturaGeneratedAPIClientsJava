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
import com.kaltura.client.enums.LiveReportOrderBy;
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
@MultiRequestBuilder.Tokenizer(LiveReportInputFilter.Tokenizer.class)
public class LiveReportInputFilter extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String entryIds();
		String fromTime();
		String toTime();
		String live();
		String orderBy();
	}

	private String entryIds;
	private Long fromTime;
	private Long toTime;
	private Boolean live;
	private LiveReportOrderBy orderBy;

	// entryIds:
	public String getEntryIds(){
		return this.entryIds;
	}
	public void setEntryIds(String entryIds){
		this.entryIds = entryIds;
	}

	public void entryIds(String multirequestToken){
		setToken("entryIds", multirequestToken);
	}

	// fromTime:
	public Long getFromTime(){
		return this.fromTime;
	}
	public void setFromTime(Long fromTime){
		this.fromTime = fromTime;
	}

	public void fromTime(String multirequestToken){
		setToken("fromTime", multirequestToken);
	}

	// toTime:
	public Long getToTime(){
		return this.toTime;
	}
	public void setToTime(Long toTime){
		this.toTime = toTime;
	}

	public void toTime(String multirequestToken){
		setToken("toTime", multirequestToken);
	}

	// live:
	public Boolean getLive(){
		return this.live;
	}
	public void setLive(Boolean live){
		this.live = live;
	}

	public void live(String multirequestToken){
		setToken("live", multirequestToken);
	}

	// orderBy:
	public LiveReportOrderBy getOrderBy(){
		return this.orderBy;
	}
	public void setOrderBy(LiveReportOrderBy orderBy){
		this.orderBy = orderBy;
	}

	public void orderBy(String multirequestToken){
		setToken("orderBy", multirequestToken);
	}


	public LiveReportInputFilter() {
		super();
	}

	public LiveReportInputFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		entryIds = GsonParser.parseString(jsonObject.get("entryIds"));
		fromTime = GsonParser.parseLong(jsonObject.get("fromTime"));
		toTime = GsonParser.parseLong(jsonObject.get("toTime"));
		live = GsonParser.parseBoolean(jsonObject.get("live"));
		orderBy = LiveReportOrderBy.get(GsonParser.parseString(jsonObject.get("orderBy")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveReportInputFilter");
		kparams.add("entryIds", this.entryIds);
		kparams.add("fromTime", this.fromTime);
		kparams.add("toTime", this.toTime);
		kparams.add("live", this.live);
		kparams.add("orderBy", this.orderBy);
		return kparams;
	}

}

