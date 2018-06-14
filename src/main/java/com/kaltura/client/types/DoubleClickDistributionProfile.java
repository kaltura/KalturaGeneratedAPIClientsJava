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

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DoubleClickDistributionProfile.Tokenizer.class)
public class DoubleClickDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String channelTitle();
		String channelLink();
		String channelDescription();
		String feedUrl();
		String cuePointsProvider();
		String itemsPerPage();
		String ignoreSchedulingInFeed();
	}

	private String channelTitle;
	private String channelLink;
	private String channelDescription;
	private String feedUrl;
	private String cuePointsProvider;
	private String itemsPerPage;
	private Boolean ignoreSchedulingInFeed;

	// channelTitle:
	public String getChannelTitle(){
		return this.channelTitle;
	}
	public void setChannelTitle(String channelTitle){
		this.channelTitle = channelTitle;
	}

	public void channelTitle(String multirequestToken){
		setToken("channelTitle", multirequestToken);
	}

	// channelLink:
	public String getChannelLink(){
		return this.channelLink;
	}
	public void setChannelLink(String channelLink){
		this.channelLink = channelLink;
	}

	public void channelLink(String multirequestToken){
		setToken("channelLink", multirequestToken);
	}

	// channelDescription:
	public String getChannelDescription(){
		return this.channelDescription;
	}
	public void setChannelDescription(String channelDescription){
		this.channelDescription = channelDescription;
	}

	public void channelDescription(String multirequestToken){
		setToken("channelDescription", multirequestToken);
	}

	// feedUrl:
	public String getFeedUrl(){
		return this.feedUrl;
	}
	// cuePointsProvider:
	public String getCuePointsProvider(){
		return this.cuePointsProvider;
	}
	public void setCuePointsProvider(String cuePointsProvider){
		this.cuePointsProvider = cuePointsProvider;
	}

	public void cuePointsProvider(String multirequestToken){
		setToken("cuePointsProvider", multirequestToken);
	}

	// itemsPerPage:
	public String getItemsPerPage(){
		return this.itemsPerPage;
	}
	public void setItemsPerPage(String itemsPerPage){
		this.itemsPerPage = itemsPerPage;
	}

	public void itemsPerPage(String multirequestToken){
		setToken("itemsPerPage", multirequestToken);
	}

	// ignoreSchedulingInFeed:
	public Boolean getIgnoreSchedulingInFeed(){
		return this.ignoreSchedulingInFeed;
	}
	public void setIgnoreSchedulingInFeed(Boolean ignoreSchedulingInFeed){
		this.ignoreSchedulingInFeed = ignoreSchedulingInFeed;
	}

	public void ignoreSchedulingInFeed(String multirequestToken){
		setToken("ignoreSchedulingInFeed", multirequestToken);
	}


	public DoubleClickDistributionProfile() {
		super();
	}

	public DoubleClickDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		channelTitle = GsonParser.parseString(jsonObject.get("channelTitle"));
		channelLink = GsonParser.parseString(jsonObject.get("channelLink"));
		channelDescription = GsonParser.parseString(jsonObject.get("channelDescription"));
		feedUrl = GsonParser.parseString(jsonObject.get("feedUrl"));
		cuePointsProvider = GsonParser.parseString(jsonObject.get("cuePointsProvider"));
		itemsPerPage = GsonParser.parseString(jsonObject.get("itemsPerPage"));
		ignoreSchedulingInFeed = GsonParser.parseBoolean(jsonObject.get("ignoreSchedulingInFeed"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDoubleClickDistributionProfile");
		kparams.add("channelTitle", this.channelTitle);
		kparams.add("channelLink", this.channelLink);
		kparams.add("channelDescription", this.channelDescription);
		kparams.add("cuePointsProvider", this.cuePointsProvider);
		kparams.add("itemsPerPage", this.itemsPerPage);
		kparams.add("ignoreSchedulingInFeed", this.ignoreSchedulingInFeed);
		return kparams;
	}

}

