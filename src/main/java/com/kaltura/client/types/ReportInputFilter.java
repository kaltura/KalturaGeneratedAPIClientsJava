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
// Copyright (C) 2006-2019  Kaltura Inc.
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
		String categoriesIdsIn();
		String customVar1In();
		String customVar2In();
		String customVar3In();
		String deviceIn();
		String countryIn();
		String regionIn();
		String citiesIn();
		String operatingSystemFamilyIn();
		String browserFamilyIn();
		String timeZoneOffset();
		String interval();
		String mediaTypeIn();
		String sourceTypeIn();
	}

	/**
	 * Search keywords to filter objects
	 */
	private String keywords;
	/**
	 * Search keywords in objects tags
	 */
	private Boolean searchInTags;
	/**
	 * Search keywords in objects admin tags
	 */
	private Boolean searchInAdminTags;
	/**
	 * Search objects in specified categories
	 */
	private String categories;
	/**
	 * Search objects in specified category ids
	 */
	private String categoriesIdsIn;
	/**
	 * Filter by customVar1
	 */
	private String customVar1In;
	/**
	 * Filter by customVar2
	 */
	private String customVar2In;
	/**
	 * Filter by customVar3
	 */
	private String customVar3In;
	/**
	 * Filter by device
	 */
	private String deviceIn;
	/**
	 * Filter by country
	 */
	private String countryIn;
	/**
	 * Filter by region
	 */
	private String regionIn;
	/**
	 * Filter by city
	 */
	private String citiesIn;
	/**
	 * Filter by operating system family
	 */
	private String operatingSystemFamilyIn;
	/**
	 * Filter by browser family
	 */
	private String browserFamilyIn;
	/**
	 * Time zone offset in minutes
	 */
	private Integer timeZoneOffset;
	/**
	 * Aggregated results according to interval
	 */
	private ReportInterval interval;
	/**
	 * Filter by media types
	 */
	private String mediaTypeIn;
	/**
	 * Filter by source types
	 */
	private String sourceTypeIn;

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

	// categoriesIdsIn:
	public String getCategoriesIdsIn(){
		return this.categoriesIdsIn;
	}
	public void setCategoriesIdsIn(String categoriesIdsIn){
		this.categoriesIdsIn = categoriesIdsIn;
	}

	public void categoriesIdsIn(String multirequestToken){
		setToken("categoriesIdsIn", multirequestToken);
	}

	// customVar1In:
	public String getCustomVar1In(){
		return this.customVar1In;
	}
	public void setCustomVar1In(String customVar1In){
		this.customVar1In = customVar1In;
	}

	public void customVar1In(String multirequestToken){
		setToken("customVar1In", multirequestToken);
	}

	// customVar2In:
	public String getCustomVar2In(){
		return this.customVar2In;
	}
	public void setCustomVar2In(String customVar2In){
		this.customVar2In = customVar2In;
	}

	public void customVar2In(String multirequestToken){
		setToken("customVar2In", multirequestToken);
	}

	// customVar3In:
	public String getCustomVar3In(){
		return this.customVar3In;
	}
	public void setCustomVar3In(String customVar3In){
		this.customVar3In = customVar3In;
	}

	public void customVar3In(String multirequestToken){
		setToken("customVar3In", multirequestToken);
	}

	// deviceIn:
	public String getDeviceIn(){
		return this.deviceIn;
	}
	public void setDeviceIn(String deviceIn){
		this.deviceIn = deviceIn;
	}

	public void deviceIn(String multirequestToken){
		setToken("deviceIn", multirequestToken);
	}

	// countryIn:
	public String getCountryIn(){
		return this.countryIn;
	}
	public void setCountryIn(String countryIn){
		this.countryIn = countryIn;
	}

	public void countryIn(String multirequestToken){
		setToken("countryIn", multirequestToken);
	}

	// regionIn:
	public String getRegionIn(){
		return this.regionIn;
	}
	public void setRegionIn(String regionIn){
		this.regionIn = regionIn;
	}

	public void regionIn(String multirequestToken){
		setToken("regionIn", multirequestToken);
	}

	// citiesIn:
	public String getCitiesIn(){
		return this.citiesIn;
	}
	public void setCitiesIn(String citiesIn){
		this.citiesIn = citiesIn;
	}

	public void citiesIn(String multirequestToken){
		setToken("citiesIn", multirequestToken);
	}

	// operatingSystemFamilyIn:
	public String getOperatingSystemFamilyIn(){
		return this.operatingSystemFamilyIn;
	}
	public void setOperatingSystemFamilyIn(String operatingSystemFamilyIn){
		this.operatingSystemFamilyIn = operatingSystemFamilyIn;
	}

	public void operatingSystemFamilyIn(String multirequestToken){
		setToken("operatingSystemFamilyIn", multirequestToken);
	}

	// browserFamilyIn:
	public String getBrowserFamilyIn(){
		return this.browserFamilyIn;
	}
	public void setBrowserFamilyIn(String browserFamilyIn){
		this.browserFamilyIn = browserFamilyIn;
	}

	public void browserFamilyIn(String multirequestToken){
		setToken("browserFamilyIn", multirequestToken);
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

	// mediaTypeIn:
	public String getMediaTypeIn(){
		return this.mediaTypeIn;
	}
	public void setMediaTypeIn(String mediaTypeIn){
		this.mediaTypeIn = mediaTypeIn;
	}

	public void mediaTypeIn(String multirequestToken){
		setToken("mediaTypeIn", multirequestToken);
	}

	// sourceTypeIn:
	public String getSourceTypeIn(){
		return this.sourceTypeIn;
	}
	public void setSourceTypeIn(String sourceTypeIn){
		this.sourceTypeIn = sourceTypeIn;
	}

	public void sourceTypeIn(String multirequestToken){
		setToken("sourceTypeIn", multirequestToken);
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
		categoriesIdsIn = GsonParser.parseString(jsonObject.get("categoriesIdsIn"));
		customVar1In = GsonParser.parseString(jsonObject.get("customVar1In"));
		customVar2In = GsonParser.parseString(jsonObject.get("customVar2In"));
		customVar3In = GsonParser.parseString(jsonObject.get("customVar3In"));
		deviceIn = GsonParser.parseString(jsonObject.get("deviceIn"));
		countryIn = GsonParser.parseString(jsonObject.get("countryIn"));
		regionIn = GsonParser.parseString(jsonObject.get("regionIn"));
		citiesIn = GsonParser.parseString(jsonObject.get("citiesIn"));
		operatingSystemFamilyIn = GsonParser.parseString(jsonObject.get("operatingSystemFamilyIn"));
		browserFamilyIn = GsonParser.parseString(jsonObject.get("browserFamilyIn"));
		timeZoneOffset = GsonParser.parseInt(jsonObject.get("timeZoneOffset"));
		interval = ReportInterval.get(GsonParser.parseString(jsonObject.get("interval")));
		mediaTypeIn = GsonParser.parseString(jsonObject.get("mediaTypeIn"));
		sourceTypeIn = GsonParser.parseString(jsonObject.get("sourceTypeIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReportInputFilter");
		kparams.add("keywords", this.keywords);
		kparams.add("searchInTags", this.searchInTags);
		kparams.add("searchInAdminTags", this.searchInAdminTags);
		kparams.add("categories", this.categories);
		kparams.add("categoriesIdsIn", this.categoriesIdsIn);
		kparams.add("customVar1In", this.customVar1In);
		kparams.add("customVar2In", this.customVar2In);
		kparams.add("customVar3In", this.customVar3In);
		kparams.add("deviceIn", this.deviceIn);
		kparams.add("countryIn", this.countryIn);
		kparams.add("regionIn", this.regionIn);
		kparams.add("citiesIn", this.citiesIn);
		kparams.add("operatingSystemFamilyIn", this.operatingSystemFamilyIn);
		kparams.add("browserFamilyIn", this.browserFamilyIn);
		kparams.add("timeZoneOffset", this.timeZoneOffset);
		kparams.add("interval", this.interval);
		kparams.add("mediaTypeIn", this.mediaTypeIn);
		kparams.add("sourceTypeIn", this.sourceTypeIn);
		return kparams;
	}

}

