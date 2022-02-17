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
// Copyright (C) 2006-2022  Kaltura Inc.
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
import com.kaltura.client.enums.DurationType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PlayableEntry.Tokenizer.class)
public class PlayableEntry extends BaseEntry {
	
	public interface Tokenizer extends BaseEntry.Tokenizer {
		String plays();
		String views();
		String lastPlayedAt();
		String width();
		String height();
		String duration();
		String msDuration();
		String durationType();
	}

	/**
	 * Number of plays
	 */
	private Integer plays;
	/**
	 * Number of views
	 */
	private Integer views;
	/**
	 * The last time the entry was played
	 */
	private Integer lastPlayedAt;
	/**
	 * The width in pixels
	 */
	private Integer width;
	/**
	 * The height in pixels
	 */
	private Integer height;
	/**
	 * The duration in seconds
	 */
	private Integer duration;
	/**
	 * The duration in miliseconds
	 */
	private Integer msDuration;
	/**
	 * The duration type (short for 0-4 mins, medium for 4-20 mins, long for 20+ mins)
	 */
	private DurationType durationType;

	// plays:
	public Integer getPlays(){
		return this.plays;
	}
	// views:
	public Integer getViews(){
		return this.views;
	}
	// lastPlayedAt:
	public Integer getLastPlayedAt(){
		return this.lastPlayedAt;
	}
	// width:
	public Integer getWidth(){
		return this.width;
	}
	// height:
	public Integer getHeight(){
		return this.height;
	}
	// duration:
	public Integer getDuration(){
		return this.duration;
	}
	// msDuration:
	public Integer getMsDuration(){
		return this.msDuration;
	}
	public void setMsDuration(Integer msDuration){
		this.msDuration = msDuration;
	}

	public void msDuration(String multirequestToken){
		setToken("msDuration", multirequestToken);
	}

	// durationType:
	public DurationType getDurationType(){
		return this.durationType;
	}

	public PlayableEntry() {
		super();
	}

	public PlayableEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		plays = GsonParser.parseInt(jsonObject.get("plays"));
		views = GsonParser.parseInt(jsonObject.get("views"));
		lastPlayedAt = GsonParser.parseInt(jsonObject.get("lastPlayedAt"));
		width = GsonParser.parseInt(jsonObject.get("width"));
		height = GsonParser.parseInt(jsonObject.get("height"));
		duration = GsonParser.parseInt(jsonObject.get("duration"));
		msDuration = GsonParser.parseInt(jsonObject.get("msDuration"));
		durationType = DurationType.get(GsonParser.parseString(jsonObject.get("durationType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPlayableEntry");
		kparams.add("msDuration", this.msDuration);
		return kparams;
	}

}

