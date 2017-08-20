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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TVComDistributionProfile.Tokenizer.class)
public class TVComDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String metadataProfileId();
		String feedUrl();
		String feedTitle();
		String feedLink();
		String feedDescription();
		String feedLanguage();
		String feedCopyright();
		String feedImageTitle();
		String feedImageUrl();
		String feedImageLink();
		String feedImageWidth();
		String feedImageHeight();
	}

	private Integer metadataProfileId;
	private String feedUrl;
	private String feedTitle;
	private String feedLink;
	private String feedDescription;
	private String feedLanguage;
	private String feedCopyright;
	private String feedImageTitle;
	private String feedImageUrl;
	private String feedImageLink;
	private Integer feedImageWidth;
	private Integer feedImageHeight;

	// metadataProfileId:
	public Integer getMetadataProfileId(){
		return this.metadataProfileId;
	}
	public void setMetadataProfileId(Integer metadataProfileId){
		this.metadataProfileId = metadataProfileId;
	}

	public void metadataProfileId(String multirequestToken){
		setToken("metadataProfileId", multirequestToken);
	}

	// feedUrl:
	public String getFeedUrl(){
		return this.feedUrl;
	}
	public void setFeedUrl(String feedUrl){
		this.feedUrl = feedUrl;
	}

	public void feedUrl(String multirequestToken){
		setToken("feedUrl", multirequestToken);
	}

	// feedTitle:
	public String getFeedTitle(){
		return this.feedTitle;
	}
	public void setFeedTitle(String feedTitle){
		this.feedTitle = feedTitle;
	}

	public void feedTitle(String multirequestToken){
		setToken("feedTitle", multirequestToken);
	}

	// feedLink:
	public String getFeedLink(){
		return this.feedLink;
	}
	public void setFeedLink(String feedLink){
		this.feedLink = feedLink;
	}

	public void feedLink(String multirequestToken){
		setToken("feedLink", multirequestToken);
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

	// feedLanguage:
	public String getFeedLanguage(){
		return this.feedLanguage;
	}
	public void setFeedLanguage(String feedLanguage){
		this.feedLanguage = feedLanguage;
	}

	public void feedLanguage(String multirequestToken){
		setToken("feedLanguage", multirequestToken);
	}

	// feedCopyright:
	public String getFeedCopyright(){
		return this.feedCopyright;
	}
	public void setFeedCopyright(String feedCopyright){
		this.feedCopyright = feedCopyright;
	}

	public void feedCopyright(String multirequestToken){
		setToken("feedCopyright", multirequestToken);
	}

	// feedImageTitle:
	public String getFeedImageTitle(){
		return this.feedImageTitle;
	}
	public void setFeedImageTitle(String feedImageTitle){
		this.feedImageTitle = feedImageTitle;
	}

	public void feedImageTitle(String multirequestToken){
		setToken("feedImageTitle", multirequestToken);
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

	// feedImageLink:
	public String getFeedImageLink(){
		return this.feedImageLink;
	}
	public void setFeedImageLink(String feedImageLink){
		this.feedImageLink = feedImageLink;
	}

	public void feedImageLink(String multirequestToken){
		setToken("feedImageLink", multirequestToken);
	}

	// feedImageWidth:
	public Integer getFeedImageWidth(){
		return this.feedImageWidth;
	}
	public void setFeedImageWidth(Integer feedImageWidth){
		this.feedImageWidth = feedImageWidth;
	}

	public void feedImageWidth(String multirequestToken){
		setToken("feedImageWidth", multirequestToken);
	}

	// feedImageHeight:
	public Integer getFeedImageHeight(){
		return this.feedImageHeight;
	}
	public void setFeedImageHeight(Integer feedImageHeight){
		this.feedImageHeight = feedImageHeight;
	}

	public void feedImageHeight(String multirequestToken){
		setToken("feedImageHeight", multirequestToken);
	}


	public TVComDistributionProfile() {
		super();
	}

	public TVComDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));
		feedUrl = GsonParser.parseString(jsonObject.get("feedUrl"));
		feedTitle = GsonParser.parseString(jsonObject.get("feedTitle"));
		feedLink = GsonParser.parseString(jsonObject.get("feedLink"));
		feedDescription = GsonParser.parseString(jsonObject.get("feedDescription"));
		feedLanguage = GsonParser.parseString(jsonObject.get("feedLanguage"));
		feedCopyright = GsonParser.parseString(jsonObject.get("feedCopyright"));
		feedImageTitle = GsonParser.parseString(jsonObject.get("feedImageTitle"));
		feedImageUrl = GsonParser.parseString(jsonObject.get("feedImageUrl"));
		feedImageLink = GsonParser.parseString(jsonObject.get("feedImageLink"));
		feedImageWidth = GsonParser.parseInt(jsonObject.get("feedImageWidth"));
		feedImageHeight = GsonParser.parseInt(jsonObject.get("feedImageHeight"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTVComDistributionProfile");
		kparams.add("metadataProfileId", this.metadataProfileId);
		kparams.add("feedTitle", this.feedTitle);
		kparams.add("feedLink", this.feedLink);
		kparams.add("feedDescription", this.feedDescription);
		kparams.add("feedLanguage", this.feedLanguage);
		kparams.add("feedCopyright", this.feedCopyright);
		kparams.add("feedImageTitle", this.feedImageTitle);
		kparams.add("feedImageUrl", this.feedImageUrl);
		kparams.add("feedImageLink", this.feedImageLink);
		kparams.add("feedImageWidth", this.feedImageWidth);
		kparams.add("feedImageHeight", this.feedImageHeight);
		return kparams;
	}

}

