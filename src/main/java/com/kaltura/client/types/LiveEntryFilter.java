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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveEntryFilter.Tokenizer.class)
public class LiveEntryFilter extends LiveEntryBaseFilter {
	
	public interface Tokenizer extends LiveEntryBaseFilter.Tokenizer {
		String isLive();
		String isRecordedEntryIdEmpty();
		String hasMediaServerHostname();
	}

	private Boolean isLive;
	private Boolean isRecordedEntryIdEmpty;
	private String hasMediaServerHostname;

	// isLive:
	public Boolean getIsLive(){
		return this.isLive;
	}
	public void setIsLive(Boolean isLive){
		this.isLive = isLive;
	}

	public void isLive(String multirequestToken){
		setToken("isLive", multirequestToken);
	}

	// isRecordedEntryIdEmpty:
	public Boolean getIsRecordedEntryIdEmpty(){
		return this.isRecordedEntryIdEmpty;
	}
	public void setIsRecordedEntryIdEmpty(Boolean isRecordedEntryIdEmpty){
		this.isRecordedEntryIdEmpty = isRecordedEntryIdEmpty;
	}

	public void isRecordedEntryIdEmpty(String multirequestToken){
		setToken("isRecordedEntryIdEmpty", multirequestToken);
	}

	// hasMediaServerHostname:
	public String getHasMediaServerHostname(){
		return this.hasMediaServerHostname;
	}
	public void setHasMediaServerHostname(String hasMediaServerHostname){
		this.hasMediaServerHostname = hasMediaServerHostname;
	}

	public void hasMediaServerHostname(String multirequestToken){
		setToken("hasMediaServerHostname", multirequestToken);
	}


	public LiveEntryFilter() {
		super();
	}

	public LiveEntryFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		isLive = GsonParser.parseBoolean(jsonObject.get("isLive"));
		isRecordedEntryIdEmpty = GsonParser.parseBoolean(jsonObject.get("isRecordedEntryIdEmpty"));
		hasMediaServerHostname = GsonParser.parseString(jsonObject.get("hasMediaServerHostname"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveEntryFilter");
		kparams.add("isLive", this.isLive);
		kparams.add("isRecordedEntryIdEmpty", this.isRecordedEntryIdEmpty);
		kparams.add("hasMediaServerHostname", this.hasMediaServerHostname);
		return kparams;
	}

}

