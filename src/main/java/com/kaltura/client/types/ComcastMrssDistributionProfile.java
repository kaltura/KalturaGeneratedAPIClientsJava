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
@MultiRequestBuilder.Tokenizer(ComcastMrssDistributionProfile.Tokenizer.class)
public class ComcastMrssDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String metadataProfileId();
		String feedUrl();
		String feedTitle();
		String feedLink();
		String feedDescription();
		String feedLastBuildDate();
		String itemLink();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> cPlatformTvSeries();
		String cPlatformTvSeriesField();
		String shouldIncludeCuePoints();
		String shouldIncludeCaptions();
		String shouldAddThumbExtension();
	}

	private Integer metadataProfileId;
	private String feedUrl;
	private String feedTitle;
	private String feedLink;
	private String feedDescription;
	private String feedLastBuildDate;
	private String itemLink;
	private List<KeyValue> cPlatformTvSeries;
	private String cPlatformTvSeriesField;
	private Boolean shouldIncludeCuePoints;
	private Boolean shouldIncludeCaptions;
	private Boolean shouldAddThumbExtension;

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

	// feedLastBuildDate:
	public String getFeedLastBuildDate(){
		return this.feedLastBuildDate;
	}
	public void setFeedLastBuildDate(String feedLastBuildDate){
		this.feedLastBuildDate = feedLastBuildDate;
	}

	public void feedLastBuildDate(String multirequestToken){
		setToken("feedLastBuildDate", multirequestToken);
	}

	// itemLink:
	public String getItemLink(){
		return this.itemLink;
	}
	public void setItemLink(String itemLink){
		this.itemLink = itemLink;
	}

	public void itemLink(String multirequestToken){
		setToken("itemLink", multirequestToken);
	}

	// cPlatformTvSeries:
	public List<KeyValue> getCPlatformTvSeries(){
		return this.cPlatformTvSeries;
	}
	public void setCPlatformTvSeries(List<KeyValue> cPlatformTvSeries){
		this.cPlatformTvSeries = cPlatformTvSeries;
	}

	// cPlatformTvSeriesField:
	public String getCPlatformTvSeriesField(){
		return this.cPlatformTvSeriesField;
	}
	public void setCPlatformTvSeriesField(String cPlatformTvSeriesField){
		this.cPlatformTvSeriesField = cPlatformTvSeriesField;
	}

	public void cPlatformTvSeriesField(String multirequestToken){
		setToken("cPlatformTvSeriesField", multirequestToken);
	}

	// shouldIncludeCuePoints:
	public Boolean getShouldIncludeCuePoints(){
		return this.shouldIncludeCuePoints;
	}
	public void setShouldIncludeCuePoints(Boolean shouldIncludeCuePoints){
		this.shouldIncludeCuePoints = shouldIncludeCuePoints;
	}

	public void shouldIncludeCuePoints(String multirequestToken){
		setToken("shouldIncludeCuePoints", multirequestToken);
	}

	// shouldIncludeCaptions:
	public Boolean getShouldIncludeCaptions(){
		return this.shouldIncludeCaptions;
	}
	public void setShouldIncludeCaptions(Boolean shouldIncludeCaptions){
		this.shouldIncludeCaptions = shouldIncludeCaptions;
	}

	public void shouldIncludeCaptions(String multirequestToken){
		setToken("shouldIncludeCaptions", multirequestToken);
	}

	// shouldAddThumbExtension:
	public Boolean getShouldAddThumbExtension(){
		return this.shouldAddThumbExtension;
	}
	public void setShouldAddThumbExtension(Boolean shouldAddThumbExtension){
		this.shouldAddThumbExtension = shouldAddThumbExtension;
	}

	public void shouldAddThumbExtension(String multirequestToken){
		setToken("shouldAddThumbExtension", multirequestToken);
	}


	public ComcastMrssDistributionProfile() {
		super();
	}

	public ComcastMrssDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));
		feedUrl = GsonParser.parseString(jsonObject.get("feedUrl"));
		feedTitle = GsonParser.parseString(jsonObject.get("feedTitle"));
		feedLink = GsonParser.parseString(jsonObject.get("feedLink"));
		feedDescription = GsonParser.parseString(jsonObject.get("feedDescription"));
		feedLastBuildDate = GsonParser.parseString(jsonObject.get("feedLastBuildDate"));
		itemLink = GsonParser.parseString(jsonObject.get("itemLink"));
		cPlatformTvSeries = GsonParser.parseArray(jsonObject.getAsJsonArray("cPlatformTvSeries"), KeyValue.class);
		cPlatformTvSeriesField = GsonParser.parseString(jsonObject.get("cPlatformTvSeriesField"));
		shouldIncludeCuePoints = GsonParser.parseBoolean(jsonObject.get("shouldIncludeCuePoints"));
		shouldIncludeCaptions = GsonParser.parseBoolean(jsonObject.get("shouldIncludeCaptions"));
		shouldAddThumbExtension = GsonParser.parseBoolean(jsonObject.get("shouldAddThumbExtension"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaComcastMrssDistributionProfile");
		kparams.add("metadataProfileId", this.metadataProfileId);
		kparams.add("feedTitle", this.feedTitle);
		kparams.add("feedLink", this.feedLink);
		kparams.add("feedDescription", this.feedDescription);
		kparams.add("feedLastBuildDate", this.feedLastBuildDate);
		kparams.add("itemLink", this.itemLink);
		kparams.add("cPlatformTvSeries", this.cPlatformTvSeries);
		kparams.add("cPlatformTvSeriesField", this.cPlatformTvSeriesField);
		kparams.add("shouldIncludeCuePoints", this.shouldIncludeCuePoints);
		kparams.add("shouldIncludeCaptions", this.shouldIncludeCaptions);
		kparams.add("shouldAddThumbExtension", this.shouldAddThumbExtension);
		return kparams;
	}

}

