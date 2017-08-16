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

import com.kaltura.client.FileHolder;
import com.kaltura.client.Files;
import com.kaltura.client.Params;
import com.kaltura.client.enums.EntryServerNodeStatus;
import com.kaltura.client.enums.EntryServerNodeType;
import com.kaltura.client.enums.PlaybackProtocol;
import com.kaltura.client.enums.SourceType;
import com.kaltura.client.types.DataCenterContentResource;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.LiveEntry;
import com.kaltura.client.types.LiveStreamConfiguration;
import com.kaltura.client.types.LiveStreamEntry;
import com.kaltura.client.types.LiveStreamEntryFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Live Stream service lets you manage live stream entries  */
public class LiveStreamService {

    public static RequestBuilder<LiveStreamEntry> add(LiveStreamEntry liveStreamEntry)  {
        return add(liveStreamEntry, null);
    }

	/**  Adds new live stream entry.   The entry will be queued for provision.  */
    public static RequestBuilder<LiveStreamEntry> add(LiveStreamEntry liveStreamEntry, SourceType sourceType)  {
        Params kparams = new Params();
        kparams.add("liveStreamEntry", liveStreamEntry);
        kparams.add("sourceType", sourceType);

        return new RequestBuilder<LiveStreamEntry>(LiveStreamEntry.class, "livestream", "add", kparams);
    }

    public static RequestBuilder<LiveStreamEntry> addLiveStreamPushPublishConfiguration(String entryId, PlaybackProtocol protocol)  {
        return addLiveStreamPushPublishConfiguration(entryId, protocol, null);
    }

    public static RequestBuilder<LiveStreamEntry> addLiveStreamPushPublishConfiguration(String entryId, PlaybackProtocol protocol, String url)  {
        return addLiveStreamPushPublishConfiguration(entryId, protocol, url, null);
    }

	/**  Add new pushPublish configuration to entry  */
    public static RequestBuilder<LiveStreamEntry> addLiveStreamPushPublishConfiguration(String entryId, PlaybackProtocol protocol, String url, LiveStreamConfiguration liveStreamConfiguration)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("protocol", protocol);
        kparams.add("url", url);
        kparams.add("liveStreamConfiguration", liveStreamConfiguration);

        return new RequestBuilder<LiveStreamEntry>(LiveStreamEntry.class, "livestream", "addLiveStreamPushPublishConfiguration", kparams);
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

        return new RequestBuilder<LiveEntry>(LiveEntry.class, "livestream", "appendRecording", kparams);
    }

    public static RequestBuilder<LiveStreamEntry> authenticate(String entryId, String token)  {
        return authenticate(entryId, token, null);
    }

    public static RequestBuilder<LiveStreamEntry> authenticate(String entryId, String token, String hostname)  {
        return authenticate(entryId, token, hostname, null);
    }

    public static RequestBuilder<LiveStreamEntry> authenticate(String entryId, String token, String hostname, EntryServerNodeType mediaServerIndex)  {
        return authenticate(entryId, token, hostname, mediaServerIndex, null);
    }

	/**  Authenticate live-stream entry against stream token and partner limitations  */
    public static RequestBuilder<LiveStreamEntry> authenticate(String entryId, String token, String hostname, EntryServerNodeType mediaServerIndex, String applicationName)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("token", token);
        kparams.add("hostname", hostname);
        kparams.add("mediaServerIndex", mediaServerIndex);
        kparams.add("applicationName", applicationName);

        return new RequestBuilder<LiveStreamEntry>(LiveStreamEntry.class, "livestream", "authenticate", kparams);
    }

	/**  Creates perioding metadata sync-point events on a live stream  */
    public static RequestBuilder<Void> createPeriodicSyncPoints(String entryId, int interval, int duration)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("interval", interval);
        kparams.add("duration", duration);

        return new NullRequestBuilder("livestream", "createPeriodicSyncPoints", kparams);
    }

    public static RequestBuilder<LiveEntry> createRecordedEntry(String entryId, EntryServerNodeType mediaServerIndex, EntryServerNodeStatus liveEntryStatus)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("mediaServerIndex", mediaServerIndex);
        kparams.add("liveEntryStatus", liveEntryStatus);

        return new RequestBuilder<LiveEntry>(LiveEntry.class, "livestream", "createRecordedEntry", kparams);
    }

	/**  Delete a live stream entry.  */
    public static RequestBuilder<Void> delete(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new NullRequestBuilder("livestream", "delete", kparams);
    }

    public static RequestBuilder<LiveStreamEntry> get(String entryId)  {
        return get(entryId, -1);
    }

	/**  Get live stream entry by ID.  */
    public static RequestBuilder<LiveStreamEntry> get(String entryId, int version)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("version", version);

        return new RequestBuilder<LiveStreamEntry>(LiveStreamEntry.class, "livestream", "get", kparams);
    }

	/**  Delivering the status of a live stream (on-air/offline) if it is possible  */
    public static RequestBuilder<Boolean> isLive(String id, PlaybackProtocol protocol)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("protocol", protocol);

        return new RequestBuilder<Boolean>(Boolean.class, "livestream", "isLive", kparams);
    }

    public static RequestBuilder<ListResponse<LiveStreamEntry>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<LiveStreamEntry>> list(LiveStreamEntryFilter filter)  {
        return list(filter, null);
    }

	/**  List live stream entries by filter with paging support.  */
    public static RequestBuilder<ListResponse<LiveStreamEntry>> list(LiveStreamEntryFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<LiveStreamEntry>(LiveStreamEntry.class, "livestream", "list", kparams);
    }

	/**  Regenerate new secure token for liveStream  */
    public static RequestBuilder<Void> regenerateStreamToken(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new NullRequestBuilder("livestream", "regenerateStreamToken", kparams);
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

        return new RequestBuilder<LiveEntry>(LiveEntry.class, "livestream", "registerMediaServer", kparams);
    }

	/**  Remove push publish configuration from entry  */
    public static RequestBuilder<LiveStreamEntry> removeLiveStreamPushPublishConfiguration(String entryId, PlaybackProtocol protocol)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("protocol", protocol);

        return new RequestBuilder<LiveStreamEntry>(LiveStreamEntry.class, "livestream", "removeLiveStreamPushPublishConfiguration", kparams);
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

        return new RequestBuilder<LiveEntry>(LiveEntry.class, "livestream", "setRecordedContent", kparams);
    }

	/**  Unregister media server from live entry  */
    public static RequestBuilder<LiveEntry> unregisterMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("hostname", hostname);
        kparams.add("mediaServerIndex", mediaServerIndex);

        return new RequestBuilder<LiveEntry>(LiveEntry.class, "livestream", "unregisterMediaServer", kparams);
    }

	/**  Update live stream entry. Only the properties that were set will be updated.  */
    public static RequestBuilder<LiveStreamEntry> update(String entryId, LiveStreamEntry liveStreamEntry)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("liveStreamEntry", liveStreamEntry);

        return new RequestBuilder<LiveStreamEntry>(LiveStreamEntry.class, "livestream", "update", kparams);
    }

	/**  Update entry thumbnail using url  */
    public static RequestBuilder<LiveStreamEntry> updateOfflineThumbnailFromUrl(String entryId, String url)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("url", url);

        return new RequestBuilder<LiveStreamEntry>(LiveStreamEntry.class, "livestream", "updateOfflineThumbnailFromUrl", kparams);
    }

    public static RequestBuilder<LiveStreamEntry> updateOfflineThumbnailJpeg(String entryId, File fileData)  {
        return updateOfflineThumbnailJpeg(entryId, new FileHolder(fileData));
    }

    public static RequestBuilder<LiveStreamEntry> updateOfflineThumbnailJpeg(String entryId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
        return updateOfflineThumbnailJpeg(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
    }

    public static RequestBuilder<LiveStreamEntry> updateOfflineThumbnailJpeg(String entryId, FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
        return updateOfflineThumbnailJpeg(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName));
    }

	/**  Update live stream entry thumbnail using a raw jpeg file  */
    public static RequestBuilder<LiveStreamEntry> updateOfflineThumbnailJpeg(String entryId, FileHolder fileData)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        Files kfiles = new Files();
        kfiles.add("fileData", fileData);

        return new RequestBuilder<LiveStreamEntry>(LiveStreamEntry.class, "livestream", "updateOfflineThumbnailJpeg", kparams, kfiles);
    }

	/**  Validates all registered media servers  */
    public static RequestBuilder<Void> validateRegisteredMediaServers(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new NullRequestBuilder("livestream", "validateRegisteredMediaServers", kparams);
    }
}
