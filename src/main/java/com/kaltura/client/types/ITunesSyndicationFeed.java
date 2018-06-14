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
import com.kaltura.client.enums.ITunesSyndicationFeedAdultValues;
import com.kaltura.client.enums.ITunesSyndicationFeedCategories;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ITunesSyndicationFeed.Tokenizer.class)
public class ITunesSyndicationFeed extends BaseSyndicationFeed {
	
	public interface Tokenizer extends BaseSyndicationFeed.Tokenizer {
		String feedDescription();
		String language();
		String feedLandingPage();
		String ownerName();
		String ownerEmail();
		String feedImageUrl();
		String category();
		String adultContent();
		String feedAuthor();
		String enforceOrder();
	}

	/**
	 * feed description
	 */
	private String feedDescription;
	/**
	 * feed language
	 */
	private String language;
	/**
	 * feed landing page (i.e publisher website)
	 */
	private String feedLandingPage;
	/**
	 * author/publisher name
	 */
	private String ownerName;
	/**
	 * publisher email
	 */
	private String ownerEmail;
	/**
	 * podcast thumbnail
	 */
	private String feedImageUrl;
	private ITunesSyndicationFeedCategories category;
	private ITunesSyndicationFeedAdultValues adultContent;
	private String feedAuthor;
	/**
	 * true in case you want to enfore the palylist order on the
	 */
	private Boolean enforceOrder;

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

	// language:
	public String getLanguage(){
		return this.language;
	}
	public void setLanguage(String language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
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

	// ownerName:
	public String getOwnerName(){
		return this.ownerName;
	}
	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;
	}

	public void ownerName(String multirequestToken){
		setToken("ownerName", multirequestToken);
	}

	// ownerEmail:
	public String getOwnerEmail(){
		return this.ownerEmail;
	}
	public void setOwnerEmail(String ownerEmail){
		this.ownerEmail = ownerEmail;
	}

	public void ownerEmail(String multirequestToken){
		setToken("ownerEmail", multirequestToken);
	}

	// feedImageUrl:
	public String getFeedImageUrl(){
		return this.feedImageUrl;
	}
	public void setFeedImageUrl(String feedImageUrl){
		this.feedImageUrl = feedImageUrl;
	}

	public void feedImageUrl(String multirequestToken){
		setToken("feedImageUrl", multirequestToken);
	}

	// category:
	public ITunesSyndicationFeedCategories getCategory(){
		return this.category;
	}
	// adultContent:
	public ITunesSyndicationFeedAdultValues getAdultContent(){
		return this.adultContent;
	}
	public void setAdultContent(ITunesSyndicationFeedAdultValues adultContent){
		this.adultContent = adultContent;
	}

	public void adultContent(String multirequestToken){
		setToken("adultContent", multirequestToken);
	}

	// feedAuthor:
	public String getFeedAuthor(){
		return this.feedAuthor;
	}
	public void setFeedAuthor(String feedAuthor){
		this.feedAuthor = feedAuthor;
	}

	public void feedAuthor(String multirequestToken){
		setToken("feedAuthor", multirequestToken);
	}

	// enforceOrder:
	public Boolean getEnforceOrder(){
		return this.enforceOrder;
	}
	public void setEnforceOrder(Boolean enforceOrder){
		this.enforceOrder = enforceOrder;
	}

	public void enforceOrder(String multirequestToken){
		setToken("enforceOrder", multirequestToken);
	}


	public ITunesSyndicationFeed() {
		super();
	}

	public ITunesSyndicationFeed(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		feedDescription = GsonParser.parseString(jsonObject.get("feedDescription"));
		language = GsonParser.parseString(jsonObject.get("language"));
		feedLandingPage = GsonParser.parseString(jsonObject.get("feedLandingPage"));
		ownerName = GsonParser.parseString(jsonObject.get("ownerName"));
		ownerEmail = GsonParser.parseString(jsonObject.get("ownerEmail"));
		feedImageUrl = GsonParser.parseString(jsonObject.get("feedImageUrl"));
		category = ITunesSyndicationFeedCategories.get(GsonParser.parseString(jsonObject.get("category")));
		adultContent = ITunesSyndicationFeedAdultValues.get(GsonParser.parseString(jsonObject.get("adultContent")));
		feedAuthor = GsonParser.parseString(jsonObject.get("feedAuthor"));
		enforceOrder = GsonParser.parseBoolean(jsonObject.get("enforceOrder"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaITunesSyndicationFeed");
		kparams.add("feedDescription", this.feedDescription);
		kparams.add("language", this.language);
		kparams.add("feedLandingPage", this.feedLandingPage);
		kparams.add("ownerName", this.ownerName);
		kparams.add("ownerEmail", this.ownerEmail);
		kparams.add("feedImageUrl", this.feedImageUrl);
		kparams.add("adultContent", this.adultContent);
		kparams.add("feedAuthor", this.feedAuthor);
		kparams.add("enforceOrder", this.enforceOrder);
		return kparams;
	}

}

