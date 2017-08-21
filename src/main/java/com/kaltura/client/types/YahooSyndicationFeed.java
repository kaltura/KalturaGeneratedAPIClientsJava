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
import com.kaltura.client.enums.YahooSyndicationFeedAdultValues;
import com.kaltura.client.enums.YahooSyndicationFeedCategories;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(YahooSyndicationFeed.Tokenizer.class)
public class YahooSyndicationFeed extends BaseSyndicationFeed {
	
	public interface Tokenizer extends BaseSyndicationFeed.Tokenizer {
		String category();
		String adultContent();
		String feedDescription();
		String feedLandingPage();
	}

	private YahooSyndicationFeedCategories category;
	private YahooSyndicationFeedAdultValues adultContent;
	/**  feed description  */
	private String feedDescription;
	/**  feed landing page (i.e publisher website)  */
	private String feedLandingPage;

	// category:
	public YahooSyndicationFeedCategories getCategory(){
		return this.category;
	}
	public void setCategory(YahooSyndicationFeedCategories category){
		this.category = category;
	}

	public void category(String multirequestToken){
		setToken("category", multirequestToken);
	}

	// adultContent:
	public YahooSyndicationFeedAdultValues getAdultContent(){
		return this.adultContent;
	}
	public void setAdultContent(YahooSyndicationFeedAdultValues adultContent){
		this.adultContent = adultContent;
	}

	public void adultContent(String multirequestToken){
		setToken("adultContent", multirequestToken);
	}

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


	public YahooSyndicationFeed() {
		super();
	}

	public YahooSyndicationFeed(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		category = YahooSyndicationFeedCategories.get(GsonParser.parseString(jsonObject.get("category")));
		adultContent = YahooSyndicationFeedAdultValues.get(GsonParser.parseString(jsonObject.get("adultContent")));
		feedDescription = GsonParser.parseString(jsonObject.get("feedDescription"));
		feedLandingPage = GsonParser.parseString(jsonObject.get("feedLandingPage"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaYahooSyndicationFeed");
		kparams.add("adultContent", this.adultContent);
		kparams.add("feedDescription", this.feedDescription);
		kparams.add("feedLandingPage", this.feedLandingPage);
		return kparams;
	}

}

