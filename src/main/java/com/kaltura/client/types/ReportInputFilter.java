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
import com.kaltura.client.enums.ReportInterval;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ReportInputFilter.Tokenizer.class)
public class ReportInputFilter extends ReportInputBaseFilter {
	
	public interface Tokenizer extends ReportInputBaseFilter.Tokenizer {
		String keywords();
		String searchInTags();
		String searchInAdminTags();
		String categories();
		String timeZoneOffset();
		String interval();
	}

	/**
	 * Search keywords to filter objects
	 */
	private String keywords;
	/**
	 * Search keywords in onjects tags
	 */
	private Boolean searchInTags;
	/**
	 * Search keywords in onjects admin tags
	 */
	private Boolean searchInAdminTags;
	/**
	 * Search onjects in specified categories
	 */
	private String categories;
	/**
	 * Time zone offset in minutes
	 */
	private Integer timeZoneOffset;
	/**
	 * Aggregated results according to interval
	 */
	private ReportInterval interval;

	// keywords:
	public String getKeywords(){
		return this.keywords;
	}
	public void setKeywords(String keywords){
		this.keywords = keywords;
	}

	public void keywords(String multirequestToken){
		setToken("keywords", multirequestToken);
	}

	// searchInTags:
	public Boolean getSearchInTags(){
		return this.searchInTags;
	}
	public void setSearchInTags(Boolean searchInTags){
		this.searchInTags = searchInTags;
	}

	public void searchInTags(String multirequestToken){
		setToken("searchInTags", multirequestToken);
	}

	// searchInAdminTags:
	public Boolean getSearchInAdminTags(){
		return this.searchInAdminTags;
	}
	public void setSearchInAdminTags(Boolean searchInAdminTags){
		this.searchInAdminTags = searchInAdminTags;
	}

	public void searchInAdminTags(String multirequestToken){
		setToken("searchInAdminTags", multirequestToken);
	}

	// categories:
	public String getCategories(){
		return this.categories;
	}
	public void setCategories(String categories){
		this.categories = categories;
	}

	public void categories(String multirequestToken){
		setToken("categories", multirequestToken);
	}

	// timeZoneOffset:
	public Integer getTimeZoneOffset(){
		return this.timeZoneOffset;
	}
	public void setTimeZoneOffset(Integer timeZoneOffset){
		this.timeZoneOffset = timeZoneOffset;
	}

	public void timeZoneOffset(String multirequestToken){
		setToken("timeZoneOffset", multirequestToken);
	}

	// interval:
	public ReportInterval getInterval(){
		return this.interval;
	}
	public void setInterval(ReportInterval interval){
		this.interval = interval;
	}

	public void interval(String multirequestToken){
		setToken("interval", multirequestToken);
	}


	public ReportInputFilter() {
		super();
	}

	public ReportInputFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		keywords = GsonParser.parseString(jsonObject.get("keywords"));
		searchInTags = GsonParser.parseBoolean(jsonObject.get("searchInTags"));
		searchInAdminTags = GsonParser.parseBoolean(jsonObject.get("searchInAdminTags"));
		categories = GsonParser.parseString(jsonObject.get("categories"));
		timeZoneOffset = GsonParser.parseInt(jsonObject.get("timeZoneOffset"));
		interval = ReportInterval.get(GsonParser.parseString(jsonObject.get("interval")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReportInputFilter");
		kparams.add("keywords", this.keywords);
		kparams.add("searchInTags", this.searchInTags);
		kparams.add("searchInAdminTags", this.searchInAdminTags);
		kparams.add("categories", this.categories);
		kparams.add("timeZoneOffset", this.timeZoneOffset);
		kparams.add("interval", this.interval);
		return kparams;
	}

}

