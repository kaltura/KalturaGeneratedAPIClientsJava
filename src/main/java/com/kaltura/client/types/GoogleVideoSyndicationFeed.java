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
import com.kaltura.client.enums.GoogleSyndicationFeedAdultValues;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(GoogleVideoSyndicationFeed.Tokenizer.class)
public class GoogleVideoSyndicationFeed extends BaseSyndicationFeed {
	
	public interface Tokenizer extends BaseSyndicationFeed.Tokenizer {
		String adultContent();
	}

	private GoogleSyndicationFeedAdultValues adultContent;

	// adultContent:
	public GoogleSyndicationFeedAdultValues getAdultContent(){
		return this.adultContent;
	}
	public void setAdultContent(GoogleSyndicationFeedAdultValues adultContent){
		this.adultContent = adultContent;
	}

	public void adultContent(String multirequestToken){
		setToken("adultContent", multirequestToken);
	}


	public GoogleVideoSyndicationFeed() {
		super();
	}

	public GoogleVideoSyndicationFeed(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		adultContent = GoogleSyndicationFeedAdultValues.get(GsonParser.parseString(jsonObject.get("adultContent")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaGoogleVideoSyndicationFeed");
		kparams.add("adultContent", this.adultContent);
		return kparams;
	}

}

