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
// Copyright (C) 2006-2021  Kaltura Inc.
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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AnalyticsFilter.Tokenizer.class)
public class AnalyticsFilter extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String from_time();
		String to_time();
		String metrics();
		String utcOffset();
		String dimensions();
		RequestBuilder.ListTokenizer<ReportFilter.Tokenizer> filters();
		String orderBy();
	}

	/**
	 * Query start time (in local time) MM/dd/yyyy HH:mi
	 */
	private String from_time;
	/**
	 * Query end time (in local time) MM/dd/yyyy HH:mi
	 */
	private String to_time;
	/**
	 * Comma separated metrics list
	 */
	private String metrics;
	/**
	 * Timezone offset from UTC (in minutes)
	 */
	private Double utcOffset;
	/**
	 * Comma separated dimensions list
	 */
	private String dimensions;
	/**
	 * Array of filters
	 */
	private List<ReportFilter> filters;
	/**
	 * Query order by metric/dimension
	 */
	private String orderBy;

	// from_time:
	public String getFrom_time(){
		return this.from_time;
	}
	public void setFrom_time(String from_time){
		this.from_time = from_time;
	}

	public void from_time(String multirequestToken){
		setToken("from_time", multirequestToken);
	}

	// to_time:
	public String getTo_time(){
		return this.to_time;
	}
	public void setTo_time(String to_time){
		this.to_time = to_time;
	}

	public void to_time(String multirequestToken){
		setToken("to_time", multirequestToken);
	}

	// metrics:
	public String getMetrics(){
		return this.metrics;
	}
	public void setMetrics(String metrics){
		this.metrics = metrics;
	}

	public void metrics(String multirequestToken){
		setToken("metrics", multirequestToken);
	}

	// utcOffset:
	public Double getUtcOffset(){
		return this.utcOffset;
	}
	public void setUtcOffset(Double utcOffset){
		this.utcOffset = utcOffset;
	}

	public void utcOffset(String multirequestToken){
		setToken("utcOffset", multirequestToken);
	}

	// dimensions:
	public String getDimensions(){
		return this.dimensions;
	}
	public void setDimensions(String dimensions){
		this.dimensions = dimensions;
	}

	public void dimensions(String multirequestToken){
		setToken("dimensions", multirequestToken);
	}

	// filters:
	public List<ReportFilter> getFilters(){
		return this.filters;
	}
	public void setFilters(List<ReportFilter> filters){
		this.filters = filters;
	}

	// orderBy:
	public String getOrderBy(){
		return this.orderBy;
	}
	public void setOrderBy(String orderBy){
		this.orderBy = orderBy;
	}

	public void orderBy(String multirequestToken){
		setToken("orderBy", multirequestToken);
	}


	public AnalyticsFilter() {
		super();
	}

	public AnalyticsFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		from_time = GsonParser.parseString(jsonObject.get("from_time"));
		to_time = GsonParser.parseString(jsonObject.get("to_time"));
		metrics = GsonParser.parseString(jsonObject.get("metrics"));
		utcOffset = GsonParser.parseDouble(jsonObject.get("utcOffset"));
		dimensions = GsonParser.parseString(jsonObject.get("dimensions"));
		filters = GsonParser.parseArray(jsonObject.getAsJsonArray("filters"), ReportFilter.class);
		orderBy = GsonParser.parseString(jsonObject.get("orderBy"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAnalyticsFilter");
		kparams.add("from_time", this.from_time);
		kparams.add("to_time", this.to_time);
		kparams.add("metrics", this.metrics);
		kparams.add("utcOffset", this.utcOffset);
		kparams.add("dimensions", this.dimensions);
		kparams.add("filters", this.filters);
		kparams.add("orderBy", this.orderBy);
		return kparams;
	}

}

