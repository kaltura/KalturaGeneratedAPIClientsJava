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
import com.kaltura.client.enums.EntryServerNodeStatus;
import com.kaltura.client.enums.EntryServerNodeType;
import com.kaltura.client.types.DataCenterContentResource;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.LiveChannel;
import com.kaltura.client.types.LiveChannelFilter;
import com.kaltura.client.types.LiveEntry;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Live Channel service lets you manage live channels  */
public class LiveChannelService {

	/**  Adds new live channel.  */
    public static RequestBuilder<LiveChannel> add(LiveChannel liveChannel)  {
        Params kparams = new Params();
        kparams.add("liveChannel", liveChannel);

        return new RequestBuilder<LiveChannel>(LiveChannel.class, "livechannel", "add", kparams);
    }

    public static RequestBuilder<LiveEntry> appendRecording(String entryId, String assetId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration)  {
        return appendRecording(entryId, assetId, mediaServerIndex, resource, duration, false);
    }

	/**  Append recorded video to live entry  */
    public static RequestBuilder<LiveEntry> appendRecording(String entryId, String assetId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration, boolean isLastChunk)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("assetId", assetId);
        kparams.add("mediaServerIndex", mediaServerIndex);
        kparams.add("resource", resource);
        kparams.add("duration", duration);
        kparams.add("isLastChunk", isLastChunk);

        return new RequestBuilder<LiveEntry>(LiveEntry.class, "livechannel", "appendRecording", kparams);
    }

    public static RequestBuilder<LiveEntry> createRecordedEntry(String entryId, EntryServerNodeType mediaServerIndex, EntryServerNodeStatus liveEntryStatus)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("mediaServerIndex", mediaServerIndex);
        kparams.add("liveEntryStatus", liveEntryStatus);

        return new RequestBuilder<LiveEntry>(LiveEntry.class, "livechannel", "createRecordedEntry", kparams);
    }

	/**  Delete a live channel.  */
    public static RequestBuilder<Void> delete(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("livechannel", "delete", kparams);
    }

	/**  Get live channel by ID.  */
    public static RequestBuilder<LiveChannel> get(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<LiveChannel>(LiveChannel.class, "livechannel", "get", kparams);
    }

	/**  Delivering the status of a live channel (on-air/offline)  */
    public static RequestBuilder<Boolean> isLive(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Boolean>(Boolean.class, "livechannel", "isLive", kparams);
    }

    public static RequestBuilder<ListResponse<LiveChannel>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<LiveChannel>> list(LiveChannelFilter filter)  {
        return list(filter, null);
    }

	/**  List live channels by filter with paging support.  */
    public static RequestBuilder<ListResponse<LiveChannel>> list(LiveChannelFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<LiveChannel>(LiveChannel.class, "livechannel", "list", kparams);
    }

    public static RequestBuilder<LiveEntry> registerMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex)  {
        return registerMediaServer(entryId, hostname, mediaServerIndex, null);
    }

    public static RequestBuilder<LiveEntry> registerMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex, String applicationName)  {
        return registerMediaServer(entryId, hostname, mediaServerIndex, applicationName, EntryServerNodeStatus.get(1));
    }

    public static RequestBuilder<LiveEntry> registerMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex, String applicationName, EntryServerNodeStatus liveEntryStatus)  {
        return registerMediaServer(entryId, hostname, mediaServerIndex, applicationName, liveEntryStatus, true);
    }

	/**  Register media server to live entry  */
    public static RequestBuilder<LiveEntry> registerMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex, String applicationName, EntryServerNodeStatus liveEntryStatus, boolean shouldCreateRecordedEntry)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("hostname", hostname);
        kparams.add("mediaServerIndex", mediaServerIndex);
        kparams.add("applicationName", applicationName);
        kparams.add("liveEntryStatus", liveEntryStatus);
        kparams.add("shouldCreateRecordedEntry", shouldCreateRecordedEntry);

        return new RequestBuilder<LiveEntry>(LiveEntry.class, "livechannel", "registerMediaServer", kparams);
    }

    public static RequestBuilder<LiveEntry> setRecordedContent(String entryId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration)  {
        return setRecordedContent(entryId, mediaServerIndex, resource, duration, null);
    }

    public static RequestBuilder<LiveEntry> setRecordedContent(String entryId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration, String recordedEntryId)  {
        return setRecordedContent(entryId, mediaServerIndex, resource, duration, recordedEntryId, Integer.MIN_VALUE);
    }

	/**  Sey recorded video to live entry  */
    public static RequestBuilder<LiveEntry> setRecordedContent(String entryId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration, String recordedEntryId, int flavorParamsId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("mediaServerIndex", mediaServerIndex);
        kparams.add("resource", resource);
        kparams.add("duration", duration);
        kparams.add("recordedEntryId", recordedEntryId);
        kparams.add("flavorParamsId", flavorParamsId);

        return new RequestBuilder<LiveEntry>(LiveEntry.class, "livechannel", "setRecordedContent", kparams);
    }

	/**  Unregister media server from live entry  */
    public static RequestBuilder<LiveEntry> unregisterMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("hostname", hostname);
        kparams.add("mediaServerIndex", mediaServerIndex);

        return new RequestBuilder<LiveEntry>(LiveEntry.class, "livechannel", "unregisterMediaServer", kparams);
    }

	/**  Update live channel. Only the properties that were set will be updated.  */
    public static RequestBuilder<LiveChannel> update(String id, LiveChannel liveChannel)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("liveChannel", liveChannel);

        return new RequestBuilder<LiveChannel>(LiveChannel.class, "livechannel", "update", kparams);
    }

	/**  Validates all registered media servers  */
    public static RequestBuilder<Void> validateRegisteredMediaServers(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new NullRequestBuilder("livechannel", "validateRegisteredMediaServers", kparams);
    }
}
