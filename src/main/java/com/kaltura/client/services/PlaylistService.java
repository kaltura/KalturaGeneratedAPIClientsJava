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
package com.kaltura.client.services;

import com.kaltura.client.enums.PlaylistType;
import com.kaltura.client.types.BaseEntry;
import com.kaltura.client.types.Context;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.MediaEntryFilterForPlaylist;
import com.kaltura.client.types.Playlist;
import com.kaltura.client.types.PlaylistFilter;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Playlist service lets you create,manage and play your playlists  Playlists could
  be static (containing a fixed list of entries) or dynamic (baseed on a filter)  */
public class PlaylistService {
	
	public static class AddPlaylistBuilder extends RequestBuilder<Playlist, Playlist.Tokenizer, AddPlaylistBuilder> {
		
		public AddPlaylistBuilder(Playlist playlist, boolean updateStats) {
			super(Playlist.class, "playlist", "add");
			params.add("playlist", playlist);
			params.add("updateStats", updateStats);
		}
		
		public void updateStats(String multirequestToken) {
			params.add("updateStats", multirequestToken);
		}
	}

	public static AddPlaylistBuilder add(Playlist playlist)  {
		return add(playlist, false);
	}

	/**  Add new playlist   Note that all entries used in a playlist will become public
	  and may appear in KalturaNetwork  */
    public static AddPlaylistBuilder add(Playlist playlist, boolean updateStats)  {
		return new AddPlaylistBuilder(playlist, updateStats);
	}
	
	public static class ClonePlaylistBuilder extends RequestBuilder<Playlist, Playlist.Tokenizer, ClonePlaylistBuilder> {
		
		public ClonePlaylistBuilder(String id, Playlist newPlaylist) {
			super(Playlist.class, "playlist", "clone");
			params.add("id", id);
			params.add("newPlaylist", newPlaylist);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	public static ClonePlaylistBuilder clone(String id)  {
		return clone(id, null);
	}

	/**  Clone an existing playlist  */
    public static ClonePlaylistBuilder clone(String id, Playlist newPlaylist)  {
		return new ClonePlaylistBuilder(id, newPlaylist);
	}
	
	public static class DeletePlaylistBuilder extends NullRequestBuilder {
		
		public DeletePlaylistBuilder(String id) {
			super("playlist", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Delete existing playlist  */
    public static DeletePlaylistBuilder delete(String id)  {
		return new DeletePlaylistBuilder(id);
	}
	
	public static class ExecutePlaylistBuilder extends ArrayRequestBuilder<BaseEntry, BaseEntry.Tokenizer, ExecutePlaylistBuilder> {
		
		public ExecutePlaylistBuilder(String id, String detailed, Context playlistContext, MediaEntryFilterForPlaylist filter, FilterPager pager) {
			super(BaseEntry.class, "playlist", "execute");
			params.add("id", id);
			params.add("detailed", detailed);
			params.add("playlistContext", playlistContext);
			params.add("filter", filter);
			params.add("pager", pager);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void detailed(String multirequestToken) {
			params.add("detailed", multirequestToken);
		}
	}

	public static ExecutePlaylistBuilder execute(String id)  {
		return execute(id, "");
	}

	public static ExecutePlaylistBuilder execute(String id, String detailed)  {
		return execute(id, detailed, null);
	}

	public static ExecutePlaylistBuilder execute(String id, String detailed, Context playlistContext)  {
		return execute(id, detailed, playlistContext, null);
	}

	public static ExecutePlaylistBuilder execute(String id, String detailed, Context playlistContext, MediaEntryFilterForPlaylist filter)  {
		return execute(id, detailed, playlistContext, filter, null);
	}

	/**  Retrieve playlist for playing purpose  */
    public static ExecutePlaylistBuilder execute(String id, String detailed, Context playlistContext, MediaEntryFilterForPlaylist filter, FilterPager pager)  {
		return new ExecutePlaylistBuilder(id, detailed, playlistContext, filter, pager);
	}
	
	public static class ExecuteFromContentPlaylistBuilder extends ArrayRequestBuilder<BaseEntry, BaseEntry.Tokenizer, ExecuteFromContentPlaylistBuilder> {
		
		public ExecuteFromContentPlaylistBuilder(PlaylistType playlistType, String playlistContent, String detailed, FilterPager pager) {
			super(BaseEntry.class, "playlist", "executeFromContent");
			params.add("playlistType", playlistType);
			params.add("playlistContent", playlistContent);
			params.add("detailed", detailed);
			params.add("pager", pager);
		}
		
		public void playlistType(String multirequestToken) {
			params.add("playlistType", multirequestToken);
		}
		
		public void playlistContent(String multirequestToken) {
			params.add("playlistContent", multirequestToken);
		}
		
		public void detailed(String multirequestToken) {
			params.add("detailed", multirequestToken);
		}
	}

	public static ExecuteFromContentPlaylistBuilder executeFromContent(PlaylistType playlistType, String playlistContent)  {
		return executeFromContent(playlistType, playlistContent, "");
	}

	public static ExecuteFromContentPlaylistBuilder executeFromContent(PlaylistType playlistType, String playlistContent, String detailed)  {
		return executeFromContent(playlistType, playlistContent, detailed, null);
	}

	/**  Retrieve playlist for playing purpose, based on content  */
    public static ExecuteFromContentPlaylistBuilder executeFromContent(PlaylistType playlistType, String playlistContent, String detailed, FilterPager pager)  {
		return new ExecuteFromContentPlaylistBuilder(playlistType, playlistContent, detailed, pager);
	}
	
	public static class ExecuteFromFiltersPlaylistBuilder extends ArrayRequestBuilder<BaseEntry, BaseEntry.Tokenizer, ExecuteFromFiltersPlaylistBuilder> {
		
		public ExecuteFromFiltersPlaylistBuilder(List<MediaEntryFilterForPlaylist> filters, int totalResults, String detailed, FilterPager pager) {
			super(BaseEntry.class, "playlist", "executeFromFilters");
			params.add("filters", filters);
			params.add("totalResults", totalResults);
			params.add("detailed", detailed);
			params.add("pager", pager);
		}
		
		public void totalResults(String multirequestToken) {
			params.add("totalResults", multirequestToken);
		}
		
		public void detailed(String multirequestToken) {
			params.add("detailed", multirequestToken);
		}
	}

	public static ExecuteFromFiltersPlaylistBuilder executeFromFilters(List<MediaEntryFilterForPlaylist> filters, int totalResults)  {
		return executeFromFilters(filters, totalResults, "1");
	}

	public static ExecuteFromFiltersPlaylistBuilder executeFromFilters(List<MediaEntryFilterForPlaylist> filters, int totalResults, String detailed)  {
		return executeFromFilters(filters, totalResults, detailed, null);
	}

	/**  Revrieve playlist for playing purpose, based on media entry filters  */
    public static ExecuteFromFiltersPlaylistBuilder executeFromFilters(List<MediaEntryFilterForPlaylist> filters, int totalResults, String detailed, FilterPager pager)  {
		return new ExecuteFromFiltersPlaylistBuilder(filters, totalResults, detailed, pager);
	}
	
	public static class GetPlaylistBuilder extends RequestBuilder<Playlist, Playlist.Tokenizer, GetPlaylistBuilder> {
		
		public GetPlaylistBuilder(String id, int version) {
			super(Playlist.class, "playlist", "get");
			params.add("id", id);
			params.add("version", version);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void version(String multirequestToken) {
			params.add("version", multirequestToken);
		}
	}

	public static GetPlaylistBuilder get(String id)  {
		return get(id, -1);
	}

	/**  Retrieve a playlist  */
    public static GetPlaylistBuilder get(String id, int version)  {
		return new GetPlaylistBuilder(id, version);
	}
	
	public static class GetStatsFromContentPlaylistBuilder extends RequestBuilder<Playlist, Playlist.Tokenizer, GetStatsFromContentPlaylistBuilder> {
		
		public GetStatsFromContentPlaylistBuilder(PlaylistType playlistType, String playlistContent) {
			super(Playlist.class, "playlist", "getStatsFromContent");
			params.add("playlistType", playlistType);
			params.add("playlistContent", playlistContent);
		}
		
		public void playlistType(String multirequestToken) {
			params.add("playlistType", multirequestToken);
		}
		
		public void playlistContent(String multirequestToken) {
			params.add("playlistContent", multirequestToken);
		}
	}

	/**  Retrieve playlist statistics  */
    public static GetStatsFromContentPlaylistBuilder getStatsFromContent(PlaylistType playlistType, String playlistContent)  {
		return new GetStatsFromContentPlaylistBuilder(playlistType, playlistContent);
	}
	
	public static class ListPlaylistBuilder extends ListResponseRequestBuilder<Playlist, Playlist.Tokenizer, ListPlaylistBuilder> {
		
		public ListPlaylistBuilder(PlaylistFilter filter, FilterPager pager) {
			super(Playlist.class, "playlist", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListPlaylistBuilder list()  {
		return list(null);
	}

	public static ListPlaylistBuilder list(PlaylistFilter filter)  {
		return list(filter, null);
	}

	/**  List available playlists  */
    public static ListPlaylistBuilder list(PlaylistFilter filter, FilterPager pager)  {
		return new ListPlaylistBuilder(filter, pager);
	}
	
	public static class UpdatePlaylistBuilder extends RequestBuilder<Playlist, Playlist.Tokenizer, UpdatePlaylistBuilder> {
		
		public UpdatePlaylistBuilder(String id, Playlist playlist, boolean updateStats) {
			super(Playlist.class, "playlist", "update");
			params.add("id", id);
			params.add("playlist", playlist);
			params.add("updateStats", updateStats);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void updateStats(String multirequestToken) {
			params.add("updateStats", multirequestToken);
		}
	}

	public static UpdatePlaylistBuilder update(String id, Playlist playlist)  {
		return update(id, playlist, false);
	}

	/**  Update existing playlist   Note - you cannot change playlist type. updated
	  playlist must be of the same type.  */
    public static UpdatePlaylistBuilder update(String id, Playlist playlist, boolean updateStats)  {
		return new UpdatePlaylistBuilder(id, playlist, updateStats);
	}
}
