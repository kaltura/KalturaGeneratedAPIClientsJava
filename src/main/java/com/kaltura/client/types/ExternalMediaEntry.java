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
import com.kaltura.client.enums.ExternalMediaSourceType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ExternalMediaEntry.Tokenizer.class)
public class ExternalMediaEntry extends MediaEntry {
	
	public interface Tokenizer extends MediaEntry.Tokenizer {
		String externalSourceType();
		String assetParamsIds();
	}

	/**
	 * The source type of the external media
	 */
	private ExternalMediaSourceType externalSourceType;
	/**
	 * Comma separated asset params ids that exists for this external media entry
	 */
	private String assetParamsIds;

	// externalSourceType:
	public ExternalMediaSourceType getExternalSourceType(){
		return this.externalSourceType;
	}
	public void setExternalSourceType(ExternalMediaSourceType externalSourceType){
		this.externalSourceType = externalSourceType;
	}

	public void externalSourceType(String multirequestToken){
		setToken("externalSourceType", multirequestToken);
	}

	// assetParamsIds:
	public String getAssetParamsIds(){
		return this.assetParamsIds;
	}

	public ExternalMediaEntry() {
		super();
	}

	public ExternalMediaEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		externalSourceType = ExternalMediaSourceType.get(GsonParser.parseString(jsonObject.get("externalSourceType")));
		assetParamsIds = GsonParser.parseString(jsonObject.get("assetParamsIds"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaExternalMediaEntry");
		kparams.add("externalSourceType", this.externalSourceType);
		return kparams;
	}

}

