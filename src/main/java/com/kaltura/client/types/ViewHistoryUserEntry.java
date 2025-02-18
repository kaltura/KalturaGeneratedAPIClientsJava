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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ViewHistoryUserEntry.Tokenizer.class)
public class ViewHistoryUserEntry extends UserEntry {
	
	public interface Tokenizer extends UserEntry.Tokenizer {
		String playbackContext();
		String lastTimeReached();
		String lastUpdateTime();
		String playlistLastEntryId();
	}

	/**
	 * Playback context
	 */
	private String playbackContext;
	/**
	 * Last playback time reached by user
	 */
	private Integer lastTimeReached;
	private Long lastUpdateTime;
	/**
	 * Property to save last entry ID played in a playlist.
	 */
	private String playlistLastEntryId;

	// playbackContext:
	public String getPlaybackContext(){
		return this.playbackContext;
	}
	public void setPlaybackContext(String playbackContext){
		this.playbackContext = playbackContext;
	}

	public void playbackContext(String multirequestToken){
		setToken("playbackContext", multirequestToken);
	}

	// lastTimeReached:
	public Integer getLastTimeReached(){
		return this.lastTimeReached;
	}
	public void setLastTimeReached(Integer lastTimeReached){
		this.lastTimeReached = lastTimeReached;
	}

	public void lastTimeReached(String multirequestToken){
		setToken("lastTimeReached", multirequestToken);
	}

	// lastUpdateTime:
	public Long getLastUpdateTime(){
		return this.lastUpdateTime;
	}
	public void setLastUpdateTime(Long lastUpdateTime){
		this.lastUpdateTime = lastUpdateTime;
	}

	public void lastUpdateTime(String multirequestToken){
		setToken("lastUpdateTime", multirequestToken);
	}

	// playlistLastEntryId:
	public String getPlaylistLastEntryId(){
		return this.playlistLastEntryId;
	}
	public void setPlaylistLastEntryId(String playlistLastEntryId){
		this.playlistLastEntryId = playlistLastEntryId;
	}

	public void playlistLastEntryId(String multirequestToken){
		setToken("playlistLastEntryId", multirequestToken);
	}


	public ViewHistoryUserEntry() {
		super();
	}

	public ViewHistoryUserEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		playbackContext = GsonParser.parseString(jsonObject.get("playbackContext"));
		lastTimeReached = GsonParser.parseInt(jsonObject.get("lastTimeReached"));
		lastUpdateTime = GsonParser.parseLong(jsonObject.get("lastUpdateTime"));
		playlistLastEntryId = GsonParser.parseString(jsonObject.get("playlistLastEntryId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaViewHistoryUserEntry");
		kparams.add("playbackContext", this.playbackContext);
		kparams.add("lastTimeReached", this.lastTimeReached);
		kparams.add("lastUpdateTime", this.lastUpdateTime);
		kparams.add("playlistLastEntryId", this.playlistLastEntryId);
		return kparams;
	}

}

