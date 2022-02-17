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
import com.kaltura.client.types.BaseEntryFilter;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(GenericSyndicationFeed.Tokenizer.class)
public class GenericSyndicationFeed extends BaseSyndicationFeed {
	
	public interface Tokenizer extends BaseSyndicationFeed.Tokenizer {
		String feedDescription();
		String feedLandingPage();
		BaseEntryFilter.Tokenizer entryFilter();
		String pageSize();
	}

	/**
	 * feed description
	 */
	private String feedDescription;
	/**
	 * feed landing page (i.e publisher website)
	 */
	private String feedLandingPage;
	/**
	 * entry filter
	 */
	private BaseEntryFilter entryFilter;
	/**
	 * page size
	 */
	private Integer pageSize;

	// feedDescription:
	public String getFeedDescription(){
		return this.feedDescription;
	}
	public void setFeedDescription(String feedDescription){
		this.feedDescription = feedDescription;
	}

	public void feedDescription(String multirequestToken){
		setToken("feedDescription", multirequestToken);
	}

	// feedLandingPage:
	public String getFeedLandingPage(){
		return this.feedLandingPage;
	}
	public void setFeedLandingPage(String feedLandingPage){
		this.feedLandingPage = feedLandingPage;
	}

	public void feedLandingPage(String multirequestToken){
		setToken("feedLandingPage", multirequestToken);
	}

	// entryFilter:
	public BaseEntryFilter getEntryFilter(){
		return this.entryFilter;
	}
	public void setEntryFilter(BaseEntryFilter entryFilter){
		this.entryFilter = entryFilter;
	}

	// pageSize:
	public Integer getPageSize(){
		return this.pageSize;
	}
	public void setPageSize(Integer pageSize){
		this.pageSize = pageSize;
	}

	public void pageSize(String multirequestToken){
		setToken("pageSize", multirequestToken);
	}


	public GenericSyndicationFeed() {
		super();
	}

	public GenericSyndicationFeed(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		feedDescription = GsonParser.parseString(jsonObject.get("feedDescription"));
		feedLandingPage = GsonParser.parseString(jsonObject.get("feedLandingPage"));
		entryFilter = GsonParser.parseObject(jsonObject.getAsJsonObject("entryFilter"), BaseEntryFilter.class);
		pageSize = GsonParser.parseInt(jsonObject.get("pageSize"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaGenericSyndicationFeed");
		kparams.add("feedDescription", this.feedDescription);
		kparams.add("feedLandingPage", this.feedLandingPage);
		kparams.add("entryFilter", this.entryFilter);
		kparams.add("pageSize", this.pageSize);
		return kparams;
	}

}

