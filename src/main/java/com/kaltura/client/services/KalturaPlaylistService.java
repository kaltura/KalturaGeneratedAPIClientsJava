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
// Copyright (C) 2006-2015  Kaltura Inc.
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

import com.kaltura.client.KalturaClient;
import com.kaltura.client.KalturaServiceBase;
import com.kaltura.client.types.*;
import org.w3c.dom.Element;
import com.kaltura.client.utils.ParseUtils;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import java.util.List;
import com.kaltura.client.enums.*;
import java.util.ArrayList;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Fri, 14 Aug 15 01:52:23 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Playlist service lets you create,manage and play your playlists  Playlists could
  be static (containing a fixed list of entries) or dynamic (baseed on a filter)    */
@SuppressWarnings("serial")
public class KalturaPlaylistService extends KalturaServiceBase {
    public KalturaPlaylistService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public KalturaPlaylist add(KalturaPlaylist playlist) throws KalturaApiException {
        return this.add(playlist, false);
    }

	/**  Add new playlist   Note that all entries used in a playlist will become public
	  and may appear in KalturaNetwork     */
    public KalturaPlaylist add(KalturaPlaylist playlist, boolean updateStats) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("playlist", playlist);
        kparams.add("updateStats", updateStats);
        this.kalturaClient.queueServiceCall("playlist", "add", kparams, KalturaPlaylist.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPlaylist.class, resultXmlElement);
    }

    public KalturaPlaylist get(String id) throws KalturaApiException {
        return this.get(id, -1);
    }

	/**  Retrieve a playlist     */
    public KalturaPlaylist get(String id, int version) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("version", version);
        this.kalturaClient.queueServiceCall("playlist", "get", kparams, KalturaPlaylist.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPlaylist.class, resultXmlElement);
    }

    public KalturaPlaylist update(String id, KalturaPlaylist playlist) throws KalturaApiException {
        return this.update(id, playlist, false);
    }

	/**  Update existing playlist   Note - you cannot change playlist type. updated
	  playlist must be of the same type.     */
    public KalturaPlaylist update(String id, KalturaPlaylist playlist, boolean updateStats) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("playlist", playlist);
        kparams.add("updateStats", updateStats);
        this.kalturaClient.queueServiceCall("playlist", "update", kparams, KalturaPlaylist.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPlaylist.class, resultXmlElement);
    }

	/**  Delete existing playlist     */
    public void delete(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("playlist", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaPlaylist clone(String id) throws KalturaApiException {
        return this.clone(id, null);
    }

	/**  Clone an existing playlist     */
    public KalturaPlaylist clone(String id, KalturaPlaylist newPlaylist) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("newPlaylist", newPlaylist);
        this.kalturaClient.queueServiceCall("playlist", "clone", kparams, KalturaPlaylist.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPlaylist.class, resultXmlElement);
    }

    public KalturaPlaylistListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaPlaylistListResponse list(KalturaPlaylistFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List available playlists     */
    public KalturaPlaylistListResponse list(KalturaPlaylistFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("playlist", "list", kparams, KalturaPlaylistListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPlaylistListResponse.class, resultXmlElement);
    }

    public List<KalturaBaseEntry> execute(String id) throws KalturaApiException {
        return this.execute(id, "");
    }

    public List<KalturaBaseEntry> execute(String id, String detailed) throws KalturaApiException {
        return this.execute(id, detailed, null);
    }

    public List<KalturaBaseEntry> execute(String id, String detailed, KalturaContext playlistContext) throws KalturaApiException {
        return this.execute(id, detailed, playlistContext, null);
    }

    public List<KalturaBaseEntry> execute(String id, String detailed, KalturaContext playlistContext, KalturaMediaEntryFilterForPlaylist filter) throws KalturaApiException {
        return this.execute(id, detailed, playlistContext, filter, null);
    }

	/**  Retrieve playlist for playing purpose     */
    public List<KalturaBaseEntry> execute(String id, String detailed, KalturaContext playlistContext, KalturaMediaEntryFilterForPlaylist filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("detailed", detailed);
        kparams.add("playlistContext", playlistContext);
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("playlist", "execute", kparams, KalturaBaseEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaBaseEntry.class, resultXmlElement);
    }

    public List<KalturaBaseEntry> executeFromContent(KalturaPlaylistType playlistType, String playlistContent) throws KalturaApiException {
        return this.executeFromContent(playlistType, playlistContent, "");
    }

    public List<KalturaBaseEntry> executeFromContent(KalturaPlaylistType playlistType, String playlistContent, String detailed) throws KalturaApiException {
        return this.executeFromContent(playlistType, playlistContent, detailed, null);
    }

	/**  Retrieve playlist for playing purpose, based on content     */
    public List<KalturaBaseEntry> executeFromContent(KalturaPlaylistType playlistType, String playlistContent, String detailed, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("playlistType", playlistType);
        kparams.add("playlistContent", playlistContent);
        kparams.add("detailed", detailed);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("playlist", "executeFromContent", kparams, KalturaBaseEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaBaseEntry.class, resultXmlElement);
    }

    public List<KalturaBaseEntry> executeFromFilters(ArrayList<KalturaMediaEntryFilterForPlaylist> filters, int totalResults) throws KalturaApiException {
        return this.executeFromFilters(filters, totalResults, "1");
    }

    public List<KalturaBaseEntry> executeFromFilters(ArrayList<KalturaMediaEntryFilterForPlaylist> filters, int totalResults, String detailed) throws KalturaApiException {
        return this.executeFromFilters(filters, totalResults, detailed, null);
    }

	/**  Revrieve playlist for playing purpose, based on media entry filters     */
    public List<KalturaBaseEntry> executeFromFilters(ArrayList<KalturaMediaEntryFilterForPlaylist> filters, int totalResults, String detailed, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filters", filters);
        kparams.add("totalResults", totalResults);
        kparams.add("detailed", detailed);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("playlist", "executeFromFilters", kparams, KalturaBaseEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaBaseEntry.class, resultXmlElement);
    }

	/**  Retrieve playlist statistics     */
    public KalturaPlaylist getStatsFromContent(KalturaPlaylistType playlistType, String playlistContent) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("playlistType", playlistType);
        kparams.add("playlistContent", playlistContent);
        this.kalturaClient.queueServiceCall("playlist", "getStatsFromContent", kparams, KalturaPlaylist.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPlaylist.class, resultXmlElement);
    }
}
