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
@MultiRequestBuilder.Tokenizer(ReportInputBaseFilter.Tokenizer.class)
public class ReportInputBaseFilter extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String fromDate();
		String toDate();
		String fromDay();
		String toDay();
	}

	/**
	 * Start date as Unix timestamp (In seconds)
	 */
	private Integer fromDate;
	/**
	 * End date as Unix timestamp (In seconds)
	 */
	private Integer toDate;
	/**
	 * Start day as string (YYYYMMDD)
	 */
	private String fromDay;
	/**
	 * End date as string (YYYYMMDD)
	 */
	private String toDay;

	// fromDate:
	public Integer getFromDate(){
		return this.fromDate;
	}
	public void setFromDate(Integer fromDate){
		this.fromDate = fromDate;
	}

	public void fromDate(String multirequestToken){
		setToken("fromDate", multirequestToken);
	}

	// toDate:
	public Integer getToDate(){
		return this.toDate;
	}
	public void setToDate(Integer toDate){
		this.toDate = toDate;
	}

	public void toDate(String multirequestToken){
		setToken("toDate", multirequestToken);
	}

	// fromDay:
	public String getFromDay(){
		return this.fromDay;
	}
	public void setFromDay(String fromDay){
		this.fromDay = fromDay;
	}

	public void fromDay(String multirequestToken){
		setToken("fromDay", multirequestToken);
	}

	// toDay:
	public String getToDay(){
		return this.toDay;
	}
	public void setToDay(String toDay){
		this.toDay = toDay;
	}

	public void toDay(String multirequestToken){
		setToken("toDay", multirequestToken);
	}


	public ReportInputBaseFilter() {
		super();
	}

	public ReportInputBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fromDate = GsonParser.parseInt(jsonObject.get("fromDate"));
		toDate = GsonParser.parseInt(jsonObject.get("toDate"));
		fromDay = GsonParser.parseString(jsonObject.get("fromDay"));
		toDay = GsonParser.parseString(jsonObject.get("toDay"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReportInputBaseFilter");
		kparams.add("fromDate", this.fromDate);
		kparams.add("toDate", this.toDate);
		kparams.add("fromDay", this.fromDay);
		kparams.add("toDay", this.toDay);
		return kparams;
	}

}

