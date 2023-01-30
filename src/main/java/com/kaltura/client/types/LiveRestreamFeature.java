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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveRestreamFeature.Tokenizer.class)
public class LiveRestreamFeature extends LiveFeature {
	
	public interface Tokenizer extends LiveFeature.Tokenizer {
		String primaryUrl();
		String secondaryUrl();
		String streamKey();
	}

	private String primaryUrl;
	private String secondaryUrl;
	private String streamKey;

	// primaryUrl:
	public String getPrimaryUrl(){
		return this.primaryUrl;
	}
	public void setPrimaryUrl(String primaryUrl){
		this.primaryUrl = primaryUrl;
	}

	public void primaryUrl(String multirequestToken){
		setToken("primaryUrl", multirequestToken);
	}

	// secondaryUrl:
	public String getSecondaryUrl(){
		return this.secondaryUrl;
	}
	public void setSecondaryUrl(String secondaryUrl){
		this.secondaryUrl = secondaryUrl;
	}

	public void secondaryUrl(String multirequestToken){
		setToken("secondaryUrl", multirequestToken);
	}

	// streamKey:
	public String getStreamKey(){
		return this.streamKey;
	}
	public void setStreamKey(String streamKey){
		this.streamKey = streamKey;
	}

	public void streamKey(String multirequestToken){
		setToken("streamKey", multirequestToken);
	}


	public LiveRestreamFeature() {
		super();
	}

	public LiveRestreamFeature(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		primaryUrl = GsonParser.parseString(jsonObject.get("primaryUrl"));
		secondaryUrl = GsonParser.parseString(jsonObject.get("secondaryUrl"));
		streamKey = GsonParser.parseString(jsonObject.get("streamKey"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveRestreamFeature");
		kparams.add("primaryUrl", this.primaryUrl);
		kparams.add("secondaryUrl", this.secondaryUrl);
		kparams.add("streamKey", this.streamKey);
		return kparams;
	}

}

