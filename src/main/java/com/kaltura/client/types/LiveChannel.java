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
// Copyright (C) 2006-2019  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(LiveChannel.Tokenizer.class)
public class LiveChannel extends LiveEntry {
	
	public interface Tokenizer extends LiveEntry.Tokenizer {
		String playlistId();
		String repeat();
	}

	/**
	 * Playlist id to be played
	 */
	private String playlistId;
	/**
	 * Indicates that the segments should be repeated for ever
	 */
	private Boolean repeat;

	// playlistId:
	public String getPlaylistId(){
		return this.playlistId;
	}
	public void setPlaylistId(String playlistId){
		this.playlistId = playlistId;
	}

	public void playlistId(String multirequestToken){
		setToken("playlistId", multirequestToken);
	}

	// repeat:
	public Boolean getRepeat(){
		return this.repeat;
	}
	public void setRepeat(Boolean repeat){
		this.repeat = repeat;
	}

	public void repeat(String multirequestToken){
		setToken("repeat", multirequestToken);
	}


	public LiveChannel() {
		super();
	}

	public LiveChannel(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		playlistId = GsonParser.parseString(jsonObject.get("playlistId"));
		repeat = GsonParser.parseBoolean(jsonObject.get("repeat"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveChannel");
		kparams.add("playlistId", this.playlistId);
		kparams.add("repeat", this.repeat);
		return kparams;
	}

}

