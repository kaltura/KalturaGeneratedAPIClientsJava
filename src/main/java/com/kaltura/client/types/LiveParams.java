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
@MultiRequestBuilder.Tokenizer(LiveParams.Tokenizer.class)
public class LiveParams extends FlavorParams {
	
	public interface Tokenizer extends FlavorParams.Tokenizer {
		String streamSuffix();
	}

	/**
	 * Suffix to be added to the stream name after the entry id
	  {entry_id}_{stream_suffix}, e.g. for entry id 0_kjdu5jr6 and suffix 1, the
	  stream name will be 0_kjdu5jr6_1
	 */
	private String streamSuffix;

	// streamSuffix:
	public String getStreamSuffix(){
		return this.streamSuffix;
	}
	public void setStreamSuffix(String streamSuffix){
		this.streamSuffix = streamSuffix;
	}

	public void streamSuffix(String multirequestToken){
		setToken("streamSuffix", multirequestToken);
	}


	public LiveParams() {
		super();
	}

	public LiveParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		streamSuffix = GsonParser.parseString(jsonObject.get("streamSuffix"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveParams");
		kparams.add("streamSuffix", this.streamSuffix);
		return kparams;
	}

}

