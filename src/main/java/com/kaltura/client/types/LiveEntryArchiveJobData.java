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
// Copyright (C) 2006-2020  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(LiveEntryArchiveJobData.Tokenizer.class)
public class LiveEntryArchiveJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String liveEntryId();
		String vodEntryId();
	}

	private String liveEntryId;
	private String vodEntryId;

	// liveEntryId:
	public String getLiveEntryId(){
		return this.liveEntryId;
	}
	public void setLiveEntryId(String liveEntryId){
		this.liveEntryId = liveEntryId;
	}

	public void liveEntryId(String multirequestToken){
		setToken("liveEntryId", multirequestToken);
	}

	// vodEntryId:
	public String getVodEntryId(){
		return this.vodEntryId;
	}
	public void setVodEntryId(String vodEntryId){
		this.vodEntryId = vodEntryId;
	}

	public void vodEntryId(String multirequestToken){
		setToken("vodEntryId", multirequestToken);
	}


	public LiveEntryArchiveJobData() {
		super();
	}

	public LiveEntryArchiveJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		liveEntryId = GsonParser.parseString(jsonObject.get("liveEntryId"));
		vodEntryId = GsonParser.parseString(jsonObject.get("vodEntryId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveEntryArchiveJobData");
		kparams.add("liveEntryId", this.liveEntryId);
		kparams.add("vodEntryId", this.vodEntryId);
		return kparams;
	}

}

