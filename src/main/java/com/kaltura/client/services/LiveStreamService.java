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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.enums.EntryServerNodeStatus;
import com.kaltura.client.enums.EntryServerNodeType;
import com.kaltura.client.enums.PlaybackProtocol;
import com.kaltura.client.enums.SourceType;
import com.kaltura.client.types.DataCenterContentResource;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.LiveEntry;
import com.kaltura.client.types.LiveStreamConfiguration;
import com.kaltura.client.types.LiveStreamDetails;
import com.kaltura.client.types.LiveStreamEntry;
import com.kaltura.client.types.LiveStreamEntryFilter;
import com.kaltura.client.types.RoomDetails;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Live Stream service lets you manage live stream entries
 * 
 * @param liveStreamEntry Live stream entry metadata
 * @param sourceType Live stream source type
 * @param entryId 
 * @param protocol 
 * @param url 
 * @param liveStreamConfiguration 
 * @param entryId 
 * @param env 
 * @param entryId Live entry id
 * @param assetId Live asset id
 * @param mediaServerIndex 
 * @param resource 
 * @param duration in seconds
 * @param isLastChunk Is this the last recorded chunk in the current session (i.e. following a stream
 * stop event)
 * @param liveEntryId 
 * @param vodEntryId 
 * @param entryId Live stream entry id
 * @param token Live stream broadcasting token
 * @param hostname Media server host name
 * @param mediaServerIndex Media server index primary / secondary
 * @param applicationName the application to which entry is being broadcast
 * @param entryId Kaltura live-stream entry id
 * @param interval Events interval in seconds
 * @param duration Duration in seconds
 * @param entryId Live entry id
 * @param mediaServerIndex Media server index primary / secondary
 * @param liveEntryStatus the status KalturaEntryServerNodeStatus::PLAYABLE |
 * KalturaEntryServerNodeStatus::BROADCASTING
 * @param entryId Live stream entry id to delete
 * @param entryId 
 * @param serverNodeId 
 * @param entryId Live stream entry id
 * @param version Desired version of the data
 * @param id ID of the live stream entry
 * @param id ID of the live stream
 * @param protocol protocol of the stream to test.
 * @param filter live stream entry filter
 * @param pager Pager
 * @param entryId Live stream entry id to regenerate secure token for
 * @param entryId 
 * @param entryId Live entry id
 * @param hostname Media server host name
 * @param mediaServerIndex Media server index primary / secondary
 * @param applicationName the application to which entry is being broadcast
 * @param liveEntryStatus the status KalturaEntryServerNodeStatus::PLAYABLE |
 * KalturaEntryServerNodeStatus::BROADCASTING
 * @param shouldCreateRecordedEntry 
 * @param entryId 
 * @param protocol 
 * @param entryId Live entry id
 * @param mediaServerIndex 
 * @param resource 
 * @param duration in seconds
 * @param recordedEntryId Recorded entry Id
 * @param flavorParamsId Recorded entry Id
 * @param entryId Live entry id
 * @param hostname Media server host name
 * @param mediaServerIndex Media server index primary / secondary
 * @param entryId Live stream entry id to update
 * @param liveStreamEntry Live stream entry metadata to update
 * @param entryId live stream entry id
 * @param url file url
 * @param entryId live stream entry id
 * @param fileData Jpeg file data
 * @param entryId Live entry id
 */
public class LiveStreamService {
	
	public static class AddLiveStreamBuilder extends RequestBuilder<LiveStreamEntry, LiveStreamEntry.Tokenizer, AddLiveStreamBuilder> {
		
		public AddLiveStreamBuilder(LiveStreamEntry liveStreamEntry, SourceType sourceType) {
			super(LiveStreamEntry.class, "livestream", "add");
			params.add("liveStreamEntry", liveStreamEntry);
			params.add("sourceType", sourceType);
		}
		
		public void sourceType(String multirequestToken) {
			params.add("sourceType", multirequestToken);
		}
	}

	public static AddLiveStreamBuilder add(LiveStreamEntry liveStreamEntry)  {
		return add(liveStreamEntry, null);
	}

	/**
	 * Adds new live stream entry.   The entry will be queued for provision.
	 * 
	 * @param liveStreamEntry Live stream entry metadata
	 * @param sourceType Live stream source type
	 */
    public static AddLiveStreamBuilder add(LiveStreamEntry liveStreamEntry, SourceType sourceType)  {
		return new AddLiveStreamBuilder(liveStreamEntry, sourceType);
	}
	
	public static class AddLiveStreamPushPublishConfigurationLiveStreamBuilder extends RequestBuilder<LiveStreamEntry, LiveStreamEntry.Tokenizer, AddLiveStreamPushPublishConfigurationLiveStreamBuilder> {
		
		public AddLiveStreamPushPublishConfigurationLiveStreamBuilder(String entryId, PlaybackProtocol protocol, String url, LiveStreamConfiguration liveStreamConfiguration) {
			super(LiveStreamEntry.class, "livestream", "addLiveStreamPushPublishConfiguration");
			params.add("entryId", entryId);
			params.add("protocol", protocol);
			params.add("url", url);
			params.add("liveStreamConfiguration", liveStreamConfiguration);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void protocol(String multirequestToken) {
			params.add("protocol", multirequestToken);
		}
		
		public void url(String multirequestToken) {
			params.add("url", multirequestToken);
		}
	}

	public static AddLiveStreamPushPublishConfigurationLiveStreamBuilder addLiveStreamPushPublishConfiguration(String entryId, PlaybackProtocol protocol)  {
		return addLiveStreamPushPublishConfiguration(entryId, protocol, null);
	}

	public static AddLiveStreamPushPublishConfigurationLiveStreamBuilder addLiveStreamPushPublishConfiguration(String entryId, PlaybackProtocol protocol, String url)  {
		return addLiveStreamPushPublishConfiguration(entryId, protocol, url, null);
	}

	/**
	 * Add new pushPublish configuration to entry
	 * 
	 * @param entryId 
	 * @param protocol 
	 * @param url 
	 * @param liveStreamConfiguration 
	 */
    public static AddLiveStreamPushPublishConfigurationLiveStreamBuilder addLiveStreamPushPublishConfiguration(String entryId, PlaybackProtocol protocol, String url, LiveStreamConfiguration liveStreamConfiguration)  {
		return new AddLiveStreamPushPublishConfigurationLiveStreamBuilder(entryId, protocol, url, liveStreamConfiguration);
	}
	
	public static class AllocateConferenceRoomLiveStreamBuilder extends RequestBuilder<RoomDetails, RoomDetails.Tokenizer, AllocateConferenceRoomLiveStreamBuilder> {
		
		public AllocateConferenceRoomLiveStreamBuilder(String entryId, String env) {
			super(RoomDetails.class, "livestream", "allocateConferenceRoom");
			params.add("entryId", entryId);
			params.add("env", env);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void env(String multirequestToken) {
			params.add("env", multirequestToken);
		}
	}

	public static AllocateConferenceRoomLiveStreamBuilder allocateConferenceRoom(String entryId)  {
		return allocateConferenceRoom(entryId, "");
	}

	/**
	 * Allocates a conference room or returns ones that has already been allocated
	 * 
	 * @param entryId 
	 * @param env 
	 */
    public static AllocateConferenceRoomLiveStreamBuilder allocateConferenceRoom(String entryId, String env)  {
		return new AllocateConferenceRoomLiveStreamBuilder(entryId, env);
	}
	
	public static class AppendRecordingLiveStreamBuilder extends RequestBuilder<LiveEntry, LiveEntry.Tokenizer, AppendRecordingLiveStreamBuilder> {
		
		public AppendRecordingLiveStreamBuilder(String entryId, String assetId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration, boolean isLastChunk) {
			super(LiveEntry.class, "livestream", "appendRecording");
			params.add("entryId", entryId);
			params.add("assetId", assetId);
			params.add("mediaServerIndex", mediaServerIndex);
			params.add("resource", resource);
			params.add("duration", duration);
			params.add("isLastChunk", isLastChunk);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void assetId(String multirequestToken) {
			params.add("assetId", multirequestToken);
		}
		
		public void mediaServerIndex(String multirequestToken) {
			params.add("mediaServerIndex", multirequestToken);
		}
		
		public void duration(String multirequestToken) {
			params.add("duration", multirequestToken);
		}
		
		public void isLastChunk(String multirequestToken) {
			params.add("isLastChunk", multirequestToken);
		}
	}

	public static AppendRecordingLiveStreamBuilder appendRecording(String entryId, String assetId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration)  {
		return appendRecording(entryId, assetId, mediaServerIndex, resource, duration, false);
	}

	/**
	 * Append recorded video to live entry
	 * 
	 * @param entryId Live entry id
	 * @param assetId Live asset id
	 * @param mediaServerIndex 
	 * @param resource 
	 * @param duration in seconds
	 * @param isLastChunk Is this the last recorded chunk in the current session (i.e. following a stream
	 * stop event)
	 */
    public static AppendRecordingLiveStreamBuilder appendRecording(String entryId, String assetId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration, boolean isLastChunk)  {
		return new AppendRecordingLiveStreamBuilder(entryId, assetId, mediaServerIndex, resource, duration, isLastChunk);
	}
	
	public static class ArchiveLiveStreamBuilder extends RequestBuilder<Boolean, String, ArchiveLiveStreamBuilder> {
		
		public ArchiveLiveStreamBuilder(String liveEntryId, String vodEntryId) {
			super(Boolean.class, "livestream", "archive");
			params.add("liveEntryId", liveEntryId);
			params.add("vodEntryId", vodEntryId);
		}
		
		public void liveEntryId(String multirequestToken) {
			params.add("liveEntryId", multirequestToken);
		}
		
		public void vodEntryId(String multirequestToken) {
			params.add("vodEntryId", multirequestToken);
		}
	}

	/**
	 * Archive a live entry which was recorded
	 * 
	 * @param liveEntryId 
	 * @param vodEntryId 
	 */
    public static ArchiveLiveStreamBuilder archive(String liveEntryId, String vodEntryId)  {
		return new ArchiveLiveStreamBuilder(liveEntryId, vodEntryId);
	}
	
	public static class AuthenticateLiveStreamBuilder extends RequestBuilder<LiveStreamEntry, LiveStreamEntry.Tokenizer, AuthenticateLiveStreamBuilder> {
		
		public AuthenticateLiveStreamBuilder(String entryId, String token, String hostname, EntryServerNodeType mediaServerIndex, String applicationName) {
			super(LiveStreamEntry.class, "livestream", "authenticate");
			params.add("entryId", entryId);
			params.add("token", token);
			params.add("hostname", hostname);
			params.add("mediaServerIndex", mediaServerIndex);
			params.add("applicationName", applicationName);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void token(String multirequestToken) {
			params.add("token", multirequestToken);
		}
		
		public void hostname(String multirequestToken) {
			params.add("hostname", multirequestToken);
		}
		
		public void mediaServerIndex(String multirequestToken) {
			params.add("mediaServerIndex", multirequestToken);
		}
		
		public void applicationName(String multirequestToken) {
			params.add("applicationName", multirequestToken);
		}
	}

	public static AuthenticateLiveStreamBuilder authenticate(String entryId, String token)  {
		return authenticate(entryId, token, null);
	}

	public static AuthenticateLiveStreamBuilder authenticate(String entryId, String token, String hostname)  {
		return authenticate(entryId, token, hostname, null);
	}

	public static AuthenticateLiveStreamBuilder authenticate(String entryId, String token, String hostname, EntryServerNodeType mediaServerIndex)  {
		return authenticate(entryId, token, hostname, mediaServerIndex, null);
	}

	/**
	 * Authenticate live-stream entry against stream token and partner limitations
	 * 
	 * @param entryId Live stream entry id
	 * @param token Live stream broadcasting token
	 * @param hostname Media server host name
	 * @param mediaServerIndex Media server index primary / secondary
	 * @param applicationName the application to which entry is being broadcast
	 */
    public static AuthenticateLiveStreamBuilder authenticate(String entryId, String token, String hostname, EntryServerNodeType mediaServerIndex, String applicationName)  {
		return new AuthenticateLiveStreamBuilder(entryId, token, hostname, mediaServerIndex, applicationName);
	}
	
	public static class CreatePeriodicSyncPointsLiveStreamBuilder extends NullRequestBuilder {
		
		public CreatePeriodicSyncPointsLiveStreamBuilder(String entryId, int interval, int duration) {
			super("livestream", "createPeriodicSyncPoints");
			params.add("entryId", entryId);
			params.add("interval", interval);
			params.add("duration", duration);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void interval(String multirequestToken) {
			params.add("interval", multirequestToken);
		}
		
		public void duration(String multirequestToken) {
			params.add("duration", multirequestToken);
		}
	}

	/**
	 * Creates periodic metadata sync-point events on a live stream
	 * 
	 * @param entryId Kaltura live-stream entry id
	 * @param interval Events interval in seconds
	 * @param duration Duration in seconds
	 */
    public static CreatePeriodicSyncPointsLiveStreamBuilder createPeriodicSyncPoints(String entryId, int interval, int duration)  {
		return new CreatePeriodicSyncPointsLiveStreamBuilder(entryId, interval, duration);
	}
	
	public static class CreateRecordedEntryLiveStreamBuilder extends RequestBuilder<LiveEntry, LiveEntry.Tokenizer, CreateRecordedEntryLiveStreamBuilder> {
		
		public CreateRecordedEntryLiveStreamBuilder(String entryId, EntryServerNodeType mediaServerIndex, EntryServerNodeStatus liveEntryStatus) {
			super(LiveEntry.class, "livestream", "createRecordedEntry");
			params.add("entryId", entryId);
			params.add("mediaServerIndex", mediaServerIndex);
			params.add("liveEntryStatus", liveEntryStatus);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void mediaServerIndex(String multirequestToken) {
			params.add("mediaServerIndex", multirequestToken);
		}
		
		public void liveEntryStatus(String multirequestToken) {
			params.add("liveEntryStatus", multirequestToken);
		}
	}

	/**
	 * Create recorded entry id if it doesn't exist and make sure it happens on the DC
	  that the live entry was created on.
	 * 
	 * @param entryId Live entry id
	 * @param mediaServerIndex Media server index primary / secondary
	 * @param liveEntryStatus the status KalturaEntryServerNodeStatus::PLAYABLE |
	 * KalturaEntryServerNodeStatus::BROADCASTING
	 */
    public static CreateRecordedEntryLiveStreamBuilder createRecordedEntry(String entryId, EntryServerNodeType mediaServerIndex, EntryServerNodeStatus liveEntryStatus)  {
		return new CreateRecordedEntryLiveStreamBuilder(entryId, mediaServerIndex, liveEntryStatus);
	}
	
	public static class DeleteLiveStreamBuilder extends NullRequestBuilder {
		
		public DeleteLiveStreamBuilder(String entryId) {
			super("livestream", "delete");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Delete a live stream entry.
	 * 
	 * @param entryId Live stream entry id to delete
	 */
    public static DeleteLiveStreamBuilder delete(String entryId)  {
		return new DeleteLiveStreamBuilder(entryId);
	}
	
	public static class FinishConfLiveStreamBuilder extends RequestBuilder<Boolean, String, FinishConfLiveStreamBuilder> {
		
		public FinishConfLiveStreamBuilder(String entryId, int serverNodeId) {
			super(Boolean.class, "livestream", "finishConf");
			params.add("entryId", entryId);
			params.add("serverNodeId", serverNodeId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void serverNodeId(String multirequestToken) {
			params.add("serverNodeId", multirequestToken);
		}
	}

	public static FinishConfLiveStreamBuilder finishConf(String entryId)  {
		return finishConf(entryId, Integer.MIN_VALUE);
	}

	/**
	 * When the conf is finished this API should be called.
	 * 
	 * @param entryId 
	 * @param serverNodeId 
	 */
    public static FinishConfLiveStreamBuilder finishConf(String entryId, int serverNodeId)  {
		return new FinishConfLiveStreamBuilder(entryId, serverNodeId);
	}
	
	public static class GetLiveStreamBuilder extends RequestBuilder<LiveStreamEntry, LiveStreamEntry.Tokenizer, GetLiveStreamBuilder> {
		
		public GetLiveStreamBuilder(String entryId, int version) {
			super(LiveStreamEntry.class, "livestream", "get");
			params.add("entryId", entryId);
			params.add("version", version);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void version(String multirequestToken) {
			params.add("version", multirequestToken);
		}
	}

	public static GetLiveStreamBuilder get(String entryId)  {
		return get(entryId, -1);
	}

	/**
	 * Get live stream entry by ID.
	 * 
	 * @param entryId Live stream entry id
	 * @param version Desired version of the data
	 */
    public static GetLiveStreamBuilder get(String entryId, int version)  {
		return new GetLiveStreamBuilder(entryId, version);
	}
	
	public static class GetDetailsLiveStreamBuilder extends RequestBuilder<LiveStreamDetails, LiveStreamDetails.Tokenizer, GetDetailsLiveStreamBuilder> {
		
		public GetDetailsLiveStreamBuilder(String id) {
			super(LiveStreamDetails.class, "livestream", "getDetails");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delivering the status of a live stream (on-air/offline) if it is possible
	 * 
	 * @param id ID of the live stream entry
	 */
    public static GetDetailsLiveStreamBuilder getDetails(String id)  {
		return new GetDetailsLiveStreamBuilder(id);
	}
	
	public static class IsLiveLiveStreamBuilder extends RequestBuilder<Boolean, String, IsLiveLiveStreamBuilder> {
		
		public IsLiveLiveStreamBuilder(String id, PlaybackProtocol protocol) {
			super(Boolean.class, "livestream", "isLive");
			params.add("id", id);
			params.add("protocol", protocol);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void protocol(String multirequestToken) {
			params.add("protocol", multirequestToken);
		}
	}

	public static IsLiveLiveStreamBuilder isLive(String id)  {
		return isLive(id, null);
	}

	/**
	 * Delivering the status of a live stream (on-air/offline) if it is possible
	 * 
	 * @param id ID of the live stream
	 * @param protocol protocol of the stream to test.
	 */
    public static IsLiveLiveStreamBuilder isLive(String id, PlaybackProtocol protocol)  {
		return new IsLiveLiveStreamBuilder(id, protocol);
	}
	
	public static class ListLiveStreamBuilder extends ListResponseRequestBuilder<LiveStreamEntry, LiveStreamEntry.Tokenizer, ListLiveStreamBuilder> {
		
		public ListLiveStreamBuilder(LiveStreamEntryFilter filter, FilterPager pager) {
			super(LiveStreamEntry.class, "livestream", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListLiveStreamBuilder list()  {
		return list(null);
	}

	public static ListLiveStreamBuilder list(LiveStreamEntryFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List live stream entries by filter with paging support.
	 * 
	 * @param filter live stream entry filter
	 * @param pager Pager
	 */
    public static ListLiveStreamBuilder list(LiveStreamEntryFilter filter, FilterPager pager)  {
		return new ListLiveStreamBuilder(filter, pager);
	}
	
	public static class RegenerateStreamTokenLiveStreamBuilder extends RequestBuilder<LiveEntry, LiveEntry.Tokenizer, RegenerateStreamTokenLiveStreamBuilder> {
		
		public RegenerateStreamTokenLiveStreamBuilder(String entryId) {
			super(LiveEntry.class, "livestream", "regenerateStreamToken");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Regenerate new secure token for liveStream
	 * 
	 * @param entryId Live stream entry id to regenerate secure token for
	 */
    public static RegenerateStreamTokenLiveStreamBuilder regenerateStreamToken(String entryId)  {
		return new RegenerateStreamTokenLiveStreamBuilder(entryId);
	}
	
	public static class RegisterConfLiveStreamBuilder extends RequestBuilder<Boolean, String, RegisterConfLiveStreamBuilder> {
		
		public RegisterConfLiveStreamBuilder(String entryId) {
			super(Boolean.class, "livestream", "registerConf");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Mark that the conference has actually started
	 * 
	 * @param entryId 
	 */
    public static RegisterConfLiveStreamBuilder registerConf(String entryId)  {
		return new RegisterConfLiveStreamBuilder(entryId);
	}
	
	public static class RegisterMediaServerLiveStreamBuilder extends RequestBuilder<LiveEntry, LiveEntry.Tokenizer, RegisterMediaServerLiveStreamBuilder> {
		
		public RegisterMediaServerLiveStreamBuilder(String entryId, String hostname, EntryServerNodeType mediaServerIndex, String applicationName, EntryServerNodeStatus liveEntryStatus, boolean shouldCreateRecordedEntry) {
			super(LiveEntry.class, "livestream", "registerMediaServer");
			params.add("entryId", entryId);
			params.add("hostname", hostname);
			params.add("mediaServerIndex", mediaServerIndex);
			params.add("applicationName", applicationName);
			params.add("liveEntryStatus", liveEntryStatus);
			params.add("shouldCreateRecordedEntry", shouldCreateRecordedEntry);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void hostname(String multirequestToken) {
			params.add("hostname", multirequestToken);
		}
		
		public void mediaServerIndex(String multirequestToken) {
			params.add("mediaServerIndex", multirequestToken);
		}
		
		public void applicationName(String multirequestToken) {
			params.add("applicationName", multirequestToken);
		}
		
		public void liveEntryStatus(String multirequestToken) {
			params.add("liveEntryStatus", multirequestToken);
		}
		
		public void shouldCreateRecordedEntry(String multirequestToken) {
			params.add("shouldCreateRecordedEntry", multirequestToken);
		}
	}

	public static RegisterMediaServerLiveStreamBuilder registerMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex)  {
		return registerMediaServer(entryId, hostname, mediaServerIndex, null);
	}

	public static RegisterMediaServerLiveStreamBuilder registerMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex, String applicationName)  {
		return registerMediaServer(entryId, hostname, mediaServerIndex, applicationName, EntryServerNodeStatus.get(1));
	}

	public static RegisterMediaServerLiveStreamBuilder registerMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex, String applicationName, EntryServerNodeStatus liveEntryStatus)  {
		return registerMediaServer(entryId, hostname, mediaServerIndex, applicationName, liveEntryStatus, true);
	}

	/**
	 * Register media server to live entry
	 * 
	 * @param entryId Live entry id
	 * @param hostname Media server host name
	 * @param mediaServerIndex Media server index primary / secondary
	 * @param applicationName the application to which entry is being broadcast
	 * @param liveEntryStatus the status KalturaEntryServerNodeStatus::PLAYABLE |
	 * KalturaEntryServerNodeStatus::BROADCASTING
	 * @param shouldCreateRecordedEntry 
	 */
    public static RegisterMediaServerLiveStreamBuilder registerMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex, String applicationName, EntryServerNodeStatus liveEntryStatus, boolean shouldCreateRecordedEntry)  {
		return new RegisterMediaServerLiveStreamBuilder(entryId, hostname, mediaServerIndex, applicationName, liveEntryStatus, shouldCreateRecordedEntry);
	}
	
	public static class RemoveLiveStreamPushPublishConfigurationLiveStreamBuilder extends RequestBuilder<LiveStreamEntry, LiveStreamEntry.Tokenizer, RemoveLiveStreamPushPublishConfigurationLiveStreamBuilder> {
		
		public RemoveLiveStreamPushPublishConfigurationLiveStreamBuilder(String entryId, PlaybackProtocol protocol) {
			super(LiveStreamEntry.class, "livestream", "removeLiveStreamPushPublishConfiguration");
			params.add("entryId", entryId);
			params.add("protocol", protocol);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void protocol(String multirequestToken) {
			params.add("protocol", multirequestToken);
		}
	}

	/**
	 * Remove push publish configuration from entry
	 * 
	 * @param entryId 
	 * @param protocol 
	 */
    public static RemoveLiveStreamPushPublishConfigurationLiveStreamBuilder removeLiveStreamPushPublishConfiguration(String entryId, PlaybackProtocol protocol)  {
		return new RemoveLiveStreamPushPublishConfigurationLiveStreamBuilder(entryId, protocol);
	}
	
	public static class SetRecordedContentLiveStreamBuilder extends RequestBuilder<LiveEntry, LiveEntry.Tokenizer, SetRecordedContentLiveStreamBuilder> {
		
		public SetRecordedContentLiveStreamBuilder(String entryId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration, String recordedEntryId, int flavorParamsId) {
			super(LiveEntry.class, "livestream", "setRecordedContent");
			params.add("entryId", entryId);
			params.add("mediaServerIndex", mediaServerIndex);
			params.add("resource", resource);
			params.add("duration", duration);
			params.add("recordedEntryId", recordedEntryId);
			params.add("flavorParamsId", flavorParamsId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void mediaServerIndex(String multirequestToken) {
			params.add("mediaServerIndex", multirequestToken);
		}
		
		public void duration(String multirequestToken) {
			params.add("duration", multirequestToken);
		}
		
		public void recordedEntryId(String multirequestToken) {
			params.add("recordedEntryId", multirequestToken);
		}
		
		public void flavorParamsId(String multirequestToken) {
			params.add("flavorParamsId", multirequestToken);
		}
	}

	public static SetRecordedContentLiveStreamBuilder setRecordedContent(String entryId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration)  {
		return setRecordedContent(entryId, mediaServerIndex, resource, duration, null);
	}

	public static SetRecordedContentLiveStreamBuilder setRecordedContent(String entryId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration, String recordedEntryId)  {
		return setRecordedContent(entryId, mediaServerIndex, resource, duration, recordedEntryId, Integer.MIN_VALUE);
	}

	/**
	 * Set recorded video to live entry
	 * 
	 * @param entryId Live entry id
	 * @param mediaServerIndex 
	 * @param resource 
	 * @param duration in seconds
	 * @param recordedEntryId Recorded entry Id
	 * @param flavorParamsId Recorded entry Id
	 */
    public static SetRecordedContentLiveStreamBuilder setRecordedContent(String entryId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration, String recordedEntryId, int flavorParamsId)  {
		return new SetRecordedContentLiveStreamBuilder(entryId, mediaServerIndex, resource, duration, recordedEntryId, flavorParamsId);
	}
	
	public static class UnregisterMediaServerLiveStreamBuilder extends RequestBuilder<LiveEntry, LiveEntry.Tokenizer, UnregisterMediaServerLiveStreamBuilder> {
		
		public UnregisterMediaServerLiveStreamBuilder(String entryId, String hostname, EntryServerNodeType mediaServerIndex) {
			super(LiveEntry.class, "livestream", "unregisterMediaServer");
			params.add("entryId", entryId);
			params.add("hostname", hostname);
			params.add("mediaServerIndex", mediaServerIndex);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void hostname(String multirequestToken) {
			params.add("hostname", multirequestToken);
		}
		
		public void mediaServerIndex(String multirequestToken) {
			params.add("mediaServerIndex", multirequestToken);
		}
	}

	/**
	 * Unregister media server from live entry
	 * 
	 * @param entryId Live entry id
	 * @param hostname Media server host name
	 * @param mediaServerIndex Media server index primary / secondary
	 */
    public static UnregisterMediaServerLiveStreamBuilder unregisterMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex)  {
		return new UnregisterMediaServerLiveStreamBuilder(entryId, hostname, mediaServerIndex);
	}
	
	public static class UpdateLiveStreamBuilder extends RequestBuilder<LiveStreamEntry, LiveStreamEntry.Tokenizer, UpdateLiveStreamBuilder> {
		
		public UpdateLiveStreamBuilder(String entryId, LiveStreamEntry liveStreamEntry) {
			super(LiveStreamEntry.class, "livestream", "update");
			params.add("entryId", entryId);
			params.add("liveStreamEntry", liveStreamEntry);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Update live stream entry. Only the properties that were set will be updated.
	 * 
	 * @param entryId Live stream entry id to update
	 * @param liveStreamEntry Live stream entry metadata to update
	 */
    public static UpdateLiveStreamBuilder update(String entryId, LiveStreamEntry liveStreamEntry)  {
		return new UpdateLiveStreamBuilder(entryId, liveStreamEntry);
	}
	
	public static class UpdateOfflineThumbnailFromUrlLiveStreamBuilder extends RequestBuilder<LiveStreamEntry, LiveStreamEntry.Tokenizer, UpdateOfflineThumbnailFromUrlLiveStreamBuilder> {
		
		public UpdateOfflineThumbnailFromUrlLiveStreamBuilder(String entryId, String url) {
			super(LiveStreamEntry.class, "livestream", "updateOfflineThumbnailFromUrl");
			params.add("entryId", entryId);
			params.add("url", url);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void url(String multirequestToken) {
			params.add("url", multirequestToken);
		}
	}

	/**
	 * Update entry thumbnail using url
	 * 
	 * @param entryId live stream entry id
	 * @param url file url
	 */
    public static UpdateOfflineThumbnailFromUrlLiveStreamBuilder updateOfflineThumbnailFromUrl(String entryId, String url)  {
		return new UpdateOfflineThumbnailFromUrlLiveStreamBuilder(entryId, url);
	}
	
	public static class UpdateOfflineThumbnailJpegLiveStreamBuilder extends RequestBuilder<LiveStreamEntry, LiveStreamEntry.Tokenizer, UpdateOfflineThumbnailJpegLiveStreamBuilder> {
		
		public UpdateOfflineThumbnailJpegLiveStreamBuilder(String entryId, FileHolder fileData) {
			super(LiveStreamEntry.class, "livestream", "updateOfflineThumbnailJpeg");
			params.add("entryId", entryId);
			files = new Files();
			files.add("fileData", fileData);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	public static UpdateOfflineThumbnailJpegLiveStreamBuilder updateOfflineThumbnailJpeg(String entryId, File fileData)  {
		return updateOfflineThumbnailJpeg(entryId, new FileHolder(fileData));
	}

	public static UpdateOfflineThumbnailJpegLiveStreamBuilder updateOfflineThumbnailJpeg(String entryId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return updateOfflineThumbnailJpeg(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
	}

	public static UpdateOfflineThumbnailJpegLiveStreamBuilder updateOfflineThumbnailJpeg(String entryId, FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return updateOfflineThumbnailJpeg(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName));
	}

	/**
	 * Update live stream entry thumbnail using a raw jpeg file
	 * 
	 * @param entryId live stream entry id
	 * @param fileData Jpeg file data
	 */
    public static UpdateOfflineThumbnailJpegLiveStreamBuilder updateOfflineThumbnailJpeg(String entryId, FileHolder fileData)  {
		return new UpdateOfflineThumbnailJpegLiveStreamBuilder(entryId, fileData);
	}
	
	public static class ValidateRegisteredMediaServersLiveStreamBuilder extends NullRequestBuilder {
		
		public ValidateRegisteredMediaServersLiveStreamBuilder(String entryId) {
			super("livestream", "validateRegisteredMediaServers");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Validates all registered media servers
	 * 
	 * @param entryId Live entry id
	 */
    public static ValidateRegisteredMediaServersLiveStreamBuilder validateRegisteredMediaServers(String entryId)  {
		return new ValidateRegisteredMediaServersLiveStreamBuilder(entryId);
	}
}
