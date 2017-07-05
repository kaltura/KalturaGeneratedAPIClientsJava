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

import com.kaltura.client.Params;
import com.kaltura.client.enums.PlaylistType;
import com.kaltura.client.types.BaseEntry;
import com.kaltura.client.types.Context;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.MediaEntryFilterForPlaylist;
import com.kaltura.client.types.Playlist;
import com.kaltura.client.types.PlaylistFilter;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Playlist service lets you create,manage and play your playlists  Playlists could
  be static (containing a fixed list of entries) or dynamic (baseed on a filter)  */
public class PlaylistService {

    public static RequestBuilder<Playlist> add(Playlist playlist)  {
        return add(playlist, false);
    }

	/**  Add new playlist   Note that all entries used in a playlist will become public
	  and may appear in KalturaNetwork  */
    public static RequestBuilder<Playlist> add(Playlist playlist, boolean updateStats)  {
        Params kparams = new Params();
        kparams.add("playlist", playlist);
        kparams.add("updateStats", updateStats);

        return new RequestBuilder<Playlist>(Playlist.class, "playlist", "add", kparams);
    }

    public static RequestBuilder<Playlist> clone(String id)  {
        return clone(id, null);
    }

	/**  Clone an existing playlist  */
    public static RequestBuilder<Playlist> clone(String id, Playlist newPlaylist)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("newPlaylist", newPlaylist);

        return new RequestBuilder<Playlist>(Playlist.class, "playlist", "clone", kparams);
    }

	/**  Delete existing playlist  */
    public static RequestBuilder<Void> delete(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("playlist", "delete", kparams);
    }

    public static RequestBuilder<List<BaseEntry>> execute(String id)  {
        return execute(id, "");
    }

    public static RequestBuilder<List<BaseEntry>> execute(String id, String detailed)  {
        return execute(id, detailed, null);
    }

    public static RequestBuilder<List<BaseEntry>> execute(String id, String detailed, Context playlistContext)  {
        return execute(id, detailed, playlistContext, null);
    }

    public static RequestBuilder<List<BaseEntry>> execute(String id, String detailed, Context playlistContext, MediaEntryFilterForPlaylist filter)  {
        return execute(id, detailed, playlistContext, filter, null);
    }

	/**  Retrieve playlist for playing purpose  */
    public static RequestBuilder<List<BaseEntry>> execute(String id, String detailed, Context playlistContext, MediaEntryFilterForPlaylist filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("detailed", detailed);
        kparams.add("playlistContext", playlistContext);
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ArrayRequestBuilder<BaseEntry>(BaseEntry.class, "playlist", "execute", kparams);
    }

    public static RequestBuilder<List<BaseEntry>> executeFromContent(PlaylistType playlistType, String playlistContent)  {
        return executeFromContent(playlistType, playlistContent, "");
    }

    public static RequestBuilder<List<BaseEntry>> executeFromContent(PlaylistType playlistType, String playlistContent, String detailed)  {
        return executeFromContent(playlistType, playlistContent, detailed, null);
    }

	/**  Retrieve playlist for playing purpose, based on content  */
    public static RequestBuilder<List<BaseEntry>> executeFromContent(PlaylistType playlistType, String playlistContent, String detailed, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("playlistType", playlistType);
        kparams.add("playlistContent", playlistContent);
        kparams.add("detailed", detailed);
        kparams.add("pager", pager);

        return new ArrayRequestBuilder<BaseEntry>(BaseEntry.class, "playlist", "executeFromContent", kparams);
    }

    public static RequestBuilder<List<BaseEntry>> executeFromFilters(List<MediaEntryFilterForPlaylist> filters, int totalResults)  {
        return executeFromFilters(filters, totalResults, "1");
    }

    public static RequestBuilder<List<BaseEntry>> executeFromFilters(List<MediaEntryFilterForPlaylist> filters, int totalResults, String detailed)  {
        return executeFromFilters(filters, totalResults, detailed, null);
    }

	/**  Revrieve playlist for playing purpose, based on media entry filters  */
    public static RequestBuilder<List<BaseEntry>> executeFromFilters(List<MediaEntryFilterForPlaylist> filters, int totalResults, String detailed, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filters", filters);
        kparams.add("totalResults", totalResults);
        kparams.add("detailed", detailed);
        kparams.add("pager", pager);

        return new ArrayRequestBuilder<BaseEntry>(BaseEntry.class, "playlist", "executeFromFilters", kparams);
    }

    public static RequestBuilder<Playlist> get(String id)  {
        return get(id, -1);
    }

	/**  Retrieve a playlist  */
    public static RequestBuilder<Playlist> get(String id, int version)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("version", version);

        return new RequestBuilder<Playlist>(Playlist.class, "playlist", "get", kparams);
    }

	/**  Retrieve playlist statistics  */
    public static RequestBuilder<Playlist> getStatsFromContent(PlaylistType playlistType, String playlistContent)  {
        Params kparams = new Params();
        kparams.add("playlistType", playlistType);
        kparams.add("playlistContent", playlistContent);

        return new RequestBuilder<Playlist>(Playlist.class, "playlist", "getStatsFromContent", kparams);
    }

    public static RequestBuilder<ListResponse<Playlist>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<Playlist>> list(PlaylistFilter filter)  {
        return list(filter, null);
    }

	/**  List available playlists  */
    public static RequestBuilder<ListResponse<Playlist>> list(PlaylistFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<Playlist>(Playlist.class, "playlist", "list", kparams);
    }

    public static RequestBuilder<Playlist> update(String id, Playlist playlist)  {
        return update(id, playlist, false);
    }

	/**  Update existing playlist   Note - you cannot change playlist type. updated
	  playlist must be of the same type.  */
    public static RequestBuilder<Playlist> update(String id, Playlist playlist, boolean updateStats)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("playlist", playlist);
        kparams.add("updateStats", updateStats);

        return new RequestBuilder<Playlist>(Playlist.class, "playlist", "update", kparams);
    }
}
