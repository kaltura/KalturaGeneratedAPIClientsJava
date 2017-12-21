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
@MultiRequestBuilder.Tokenizer(MediaEntryFilter.Tokenizer.class)
public class MediaEntryFilter extends MediaEntryBaseFilter {
	
	public interface Tokenizer extends MediaEntryBaseFilter.Tokenizer {
		String isSequenceEntry();
		String sequenceEntryIdsIn();
	}

	private Boolean isSequenceEntry;
	private String sequenceEntryIdsIn;

	// isSequenceEntry:
	public Boolean getIsSequenceEntry(){
		return this.isSequenceEntry;
	}
	public void setIsSequenceEntry(Boolean isSequenceEntry){
		this.isSequenceEntry = isSequenceEntry;
	}

	public void isSequenceEntry(String multirequestToken){
		setToken("isSequenceEntry", multirequestToken);
	}

	// sequenceEntryIdsIn:
	public String getSequenceEntryIdsIn(){
		return this.sequenceEntryIdsIn;
	}
	public void setSequenceEntryIdsIn(String sequenceEntryIdsIn){
		this.sequenceEntryIdsIn = sequenceEntryIdsIn;
	}

	public void sequenceEntryIdsIn(String multirequestToken){
		setToken("sequenceEntryIdsIn", multirequestToken);
	}


	public MediaEntryFilter() {
		super();
	}

	public MediaEntryFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		isSequenceEntry = GsonParser.parseBoolean(jsonObject.get("isSequenceEntry"));
		sequenceEntryIdsIn = GsonParser.parseString(jsonObject.get("sequenceEntryIdsIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMediaEntryFilter");
		kparams.add("isSequenceEntry", this.isSequenceEntry);
		kparams.add("sequenceEntryIdsIn", this.sequenceEntryIdsIn);
		return kparams;
	}

}

