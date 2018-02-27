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

/**
 * Advanced metadata configuration for entry replacement process
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MetadataReplacementOptionsItem.Tokenizer.class)
public class MetadataReplacementOptionsItem extends PluginReplacementOptionsItem {
	
	public interface Tokenizer extends PluginReplacementOptionsItem.Tokenizer {
		String shouldCopyMetadata();
	}

	/**
	 * If true custom-metadata transferred to temp entry on entry replacement
	 */
	private Boolean shouldCopyMetadata;

	// shouldCopyMetadata:
	public Boolean getShouldCopyMetadata(){
		return this.shouldCopyMetadata;
	}
	public void setShouldCopyMetadata(Boolean shouldCopyMetadata){
		this.shouldCopyMetadata = shouldCopyMetadata;
	}

	public void shouldCopyMetadata(String multirequestToken){
		setToken("shouldCopyMetadata", multirequestToken);
	}


	public MetadataReplacementOptionsItem() {
		super();
	}

	public MetadataReplacementOptionsItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		shouldCopyMetadata = GsonParser.parseBoolean(jsonObject.get("shouldCopyMetadata"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMetadataReplacementOptionsItem");
		kparams.add("shouldCopyMetadata", this.shouldCopyMetadata);
		return kparams;
	}

}

