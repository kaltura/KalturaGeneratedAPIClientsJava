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
@MultiRequestBuilder.Tokenizer(EntryLiveStats.Tokenizer.class)
public class EntryLiveStats extends LiveStats {
	
	public interface Tokenizer extends LiveStats.Tokenizer {
		String entryId();
		String peakAudience();
		String peakDvrAudience();
	}

	private String entryId;
	private Integer peakAudience;
	private Integer peakDvrAudience;

	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}

	// peakAudience:
	public Integer getPeakAudience(){
		return this.peakAudience;
	}
	public void setPeakAudience(Integer peakAudience){
		this.peakAudience = peakAudience;
	}

	public void peakAudience(String multirequestToken){
		setToken("peakAudience", multirequestToken);
	}

	// peakDvrAudience:
	public Integer getPeakDvrAudience(){
		return this.peakDvrAudience;
	}
	public void setPeakDvrAudience(Integer peakDvrAudience){
		this.peakDvrAudience = peakDvrAudience;
	}

	public void peakDvrAudience(String multirequestToken){
		setToken("peakDvrAudience", multirequestToken);
	}


	public EntryLiveStats() {
		super();
	}

	public EntryLiveStats(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		peakAudience = GsonParser.parseInt(jsonObject.get("peakAudience"));
		peakDvrAudience = GsonParser.parseInt(jsonObject.get("peakDvrAudience"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryLiveStats");
		kparams.add("entryId", this.entryId);
		kparams.add("peakAudience", this.peakAudience);
		kparams.add("peakDvrAudience", this.peakDvrAudience);
		return kparams;
	}

}

