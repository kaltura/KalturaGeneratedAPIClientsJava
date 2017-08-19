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
import com.kaltura.client.enums.PlaylistType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Playlist.Tokenizer.class)
public class Playlist extends BaseEntry {
	
	public interface Tokenizer extends BaseEntry.Tokenizer {
		String playlistContent();
		RequestBuilder.ListTokenizer<MediaEntryFilterForPlaylist.Tokenizer> filters();
		String totalResults();
		String playlistType();
		String plays();
		String views();
		String duration();
		String executeUrl();
	}

	/**  Content of the playlist -    XML if the playlistType is dynamic    text if the
	  playlistType is static    url if the playlistType is mRss  */
	private String playlistContent;
	private List<MediaEntryFilterForPlaylist> filters;
	/**  Maximum count of results to be returned in playlist execution  */
	private Integer totalResults;
	/**  Type of playlist  */
	private PlaylistType playlistType;
	/**  Number of plays  */
	private Integer plays;
	/**  Number of views  */
	private Integer views;
	/**  The duration in seconds  */
	private Integer duration;
	/**  The url for this playlist  */
	private String executeUrl;

	// playlistContent:
	public String getPlaylistContent(){
		return this.playlistContent;
	}
	public void setPlaylistContent(String playlistContent){
		this.playlistContent = playlistContent;
	}

	public void playlistContent(String multirequestToken){
		setToken("playlistContent", multirequestToken);
	}

	// filters:
	public List<MediaEntryFilterForPlaylist> getFilters(){
		return this.filters;
	}
	public void setFilters(List<MediaEntryFilterForPlaylist> filters){
		this.filters = filters;
	}

	// totalResults:
	public Integer getTotalResults(){
		return this.totalResults;
	}
	public void setTotalResults(Integer totalResults){
		this.totalResults = totalResults;
	}

	public void totalResults(String multirequestToken){
		setToken("totalResults", multirequestToken);
	}

	// playlistType:
	public PlaylistType getPlaylistType(){
		return this.playlistType;
	}
	public void setPlaylistType(PlaylistType playlistType){
		this.playlistType = playlistType;
	}

	public void playlistType(String multirequestToken){
		setToken("playlistType", multirequestToken);
	}

	// plays:
	public Integer getPlays(){
		return this.plays;
	}
	public void setPlays(Integer plays){
		this.plays = plays;
	}

	public void plays(String multirequestToken){
		setToken("plays", multirequestToken);
	}

	// views:
	public Integer getViews(){
		return this.views;
	}
	public void setViews(Integer views){
		this.views = views;
	}

	public void views(String multirequestToken){
		setToken("views", multirequestToken);
	}

	// duration:
	public Integer getDuration(){
		return this.duration;
	}
	public void setDuration(Integer duration){
		this.duration = duration;
	}

	public void duration(String multirequestToken){
		setToken("duration", multirequestToken);
	}

	// executeUrl:
	public String getExecuteUrl(){
		return this.executeUrl;
	}
	public void setExecuteUrl(String executeUrl){
		this.executeUrl = executeUrl;
	}

	public void executeUrl(String multirequestToken){
		setToken("executeUrl", multirequestToken);
	}


	public Playlist() {
		super();
	}

	public Playlist(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		playlistContent = GsonParser.parseString(jsonObject.get("playlistContent"));
		filters = GsonParser.parseArray(jsonObject.getAsJsonArray("filters"), MediaEntryFilterForPlaylist.class);
		totalResults = GsonParser.parseInt(jsonObject.get("totalResults"));
		playlistType = PlaylistType.get(GsonParser.parseInt(jsonObject.get("playlistType")));
		plays = GsonParser.parseInt(jsonObject.get("plays"));
		views = GsonParser.parseInt(jsonObject.get("views"));
		duration = GsonParser.parseInt(jsonObject.get("duration"));
		executeUrl = GsonParser.parseString(jsonObject.get("executeUrl"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPlaylist");
		kparams.add("playlistContent", this.playlistContent);
		kparams.add("filters", this.filters);
		kparams.add("totalResults", this.totalResults);
		kparams.add("playlistType", this.playlistType);
		return kparams;
	}

}

