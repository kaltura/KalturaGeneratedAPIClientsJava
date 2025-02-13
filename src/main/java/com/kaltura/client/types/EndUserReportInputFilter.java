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
// Copyright (C) 2006-2023  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(EndUserReportInputFilter.Tokenizer.class)
public class EndUserReportInputFilter extends ReportInputFilter {
	
	public interface Tokenizer extends ReportInputFilter.Tokenizer {
		String application();
		String userIds();
		String playbackContext();
		String ancestorPlaybackContext();
	}

	private String application;
	private String userIds;
	private String playbackContext;
	private String ancestorPlaybackContext;

	// application:
	public String getApplication(){
		return this.application;
	}
	public void setApplication(String application){
		this.application = application;
	}

	public void application(String multirequestToken){
		setToken("application", multirequestToken);
	}

	// userIds:
	public String getUserIds(){
		return this.userIds;
	}
	public void setUserIds(String userIds){
		this.userIds = userIds;
	}

	public void userIds(String multirequestToken){
		setToken("userIds", multirequestToken);
	}

	// playbackContext:
	public String getPlaybackContext(){
		return this.playbackContext;
	}
	public void setPlaybackContext(String playbackContext){
		this.playbackContext = playbackContext;
	}

	public void playbackContext(String multirequestToken){
		setToken("playbackContext", multirequestToken);
	}

	// ancestorPlaybackContext:
	public String getAncestorPlaybackContext(){
		return this.ancestorPlaybackContext;
	}
	public void setAncestorPlaybackContext(String ancestorPlaybackContext){
		this.ancestorPlaybackContext = ancestorPlaybackContext;
	}

	public void ancestorPlaybackContext(String multirequestToken){
		setToken("ancestorPlaybackContext", multirequestToken);
	}


	public EndUserReportInputFilter() {
		super();
	}

	public EndUserReportInputFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		application = GsonParser.parseString(jsonObject.get("application"));
		userIds = GsonParser.parseString(jsonObject.get("userIds"));
		playbackContext = GsonParser.parseString(jsonObject.get("playbackContext"));
		ancestorPlaybackContext = GsonParser.parseString(jsonObject.get("ancestorPlaybackContext"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEndUserReportInputFilter");
		kparams.add("application", this.application);
		kparams.add("userIds", this.userIds);
		kparams.add("playbackContext", this.playbackContext);
		kparams.add("ancestorPlaybackContext", this.ancestorPlaybackContext);
		return kparams;
	}

}

