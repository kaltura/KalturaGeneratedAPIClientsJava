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
// Copyright (C) 2006-2017  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(SystemPartnerUsageFilter.Tokenizer.class)
public class SystemPartnerUsageFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String fromDate();
		String toDate();
		String timezoneOffset();
	}

	/**  Date range from  */
	private Integer fromDate;
	/**  Date range to  */
	private Integer toDate;
	/**  Time zone offset  */
	private Integer timezoneOffset;

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

	// timezoneOffset:
	public Integer getTimezoneOffset(){
		return this.timezoneOffset;
	}
	public void setTimezoneOffset(Integer timezoneOffset){
		this.timezoneOffset = timezoneOffset;
	}

	public void timezoneOffset(String multirequestToken){
		setToken("timezoneOffset", multirequestToken);
	}


	public SystemPartnerUsageFilter() {
		super();
	}

	public SystemPartnerUsageFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fromDate = GsonParser.parseInt(jsonObject.get("fromDate"));
		toDate = GsonParser.parseInt(jsonObject.get("toDate"));
		timezoneOffset = GsonParser.parseInt(jsonObject.get("timezoneOffset"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSystemPartnerUsageFilter");
		kparams.add("fromDate", this.fromDate);
		kparams.add("toDate", this.toDate);
		kparams.add("timezoneOffset", this.timezoneOffset);
		return kparams;
	}

}

