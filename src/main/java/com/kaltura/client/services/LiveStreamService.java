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
import com.kaltura.client.enums.EntryServerNodeStatus;
import com.kaltura.client.enums.EntryServerNodeType;
import com.kaltura.client.enums.PlaybackProtocol;
import com.kaltura.client.enums.SourceType;
import com.kaltura.client.types.DataCenterContentResource;
import com.kaltura.client.types.FilterPager;
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

	/**  Adds new live stream entry.   The entry will be queued for provision.  */
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

	/**  Add new pushPublish configuration to entry  */
    public static AddLiveStreamPushPublishConfigurationLiveStreamBuilder addLiveStreamPushPublishConfiguration(String entryId, PlaybackProtocol protocol, String url, LiveStreamConfiguration liveStreamConfiguration)  {
		return new AddLiveStreamPushPublishConfigurationLiveStreamBuilder(entryId, protocol, url, liveStreamConfiguration);
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

	/**  Append recorded video to live entry  */
    public static AppendRecordingLiveStreamBuilder appendRecording(String entryId, String assetId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration, boolean isLastChunk)  {
		return new AppendRecordingLiveStreamBuilder(entryId, assetId, mediaServerIndex, resource, duration, isLastChunk);
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

	/**  Authenticate live-stream entry against stream token and partner limitations  */
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

	/**  Creates perioding metadata sync-point events on a live stream  */
    public static CreatePeriodicSyncPointsLiveStreamBuilder createPeriodicSyncPoints(String entryId, int interval, int duration)  {
		return new CreatePeriodicSyncPointsLiveStreamBuilder(entryId, interval, duration);
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

	/**  Delete a live stream entry.  */
    public static DeleteLiveStreamBuilder delete(String entryId)  {
		return new DeleteLiveStreamBuilder(entryId);
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

	/**  Get live stream entry by ID.  */
    public static GetLiveStreamBuilder get(String entryId, int version)  {
		return new GetLiveStreamBuilder(entryId, version);
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

	/**  Delivering the status of a live stream (on-air/offline) if it is possible  */
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

	/**  List live stream entries by filter with paging support.  */
    public static ListLiveStreamBuilder list(LiveStreamEntryFilter filter, FilterPager pager)  {
		return new ListLiveStreamBuilder(filter, pager);
	}
	
	public static class RegenerateStreamTokenLiveStreamBuilder extends NullRequestBuilder {
		
		public RegenerateStreamTokenLiveStreamBuilder(String entryId) {
			super("livestream", "regenerateStreamToken");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**  Regenerate new secure token for liveStream  */
    public static RegenerateStreamTokenLiveStreamBuilder regenerateStreamToken(String entryId)  {
		return new RegenerateStreamTokenLiveStreamBuilder(entryId);
	}
	
	public static class RegisterMediaServerLiveStreamBuilder extends RequestBuilder<LiveEntry, LiveEntry.Tokenizer, RegisterMediaServerLiveStreamBuilder> {
		
		public RegisterMediaServerLiveStreamBuilder(String entryId, String hostname, EntryServerNodeType mediaServerIndex, String applicationName, EntryServerNodeStatus liveEntryStatus) {
			super(LiveEntry.class, "livestream", "registerMediaServer");
			params.add("entryId", entryId);
			params.add("hostname", hostname);
			params.add("mediaServerIndex", mediaServerIndex);
			params.add("applicationName", applicationName);
			params.add("liveEntryStatus", liveEntryStatus);
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
	}

	public static RegisterMediaServerLiveStreamBuilder registerMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex)  {
		return registerMediaServer(entryId, hostname, mediaServerIndex, null);
	}

	public static RegisterMediaServerLiveStreamBuilder registerMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex, String applicationName)  {
		return registerMediaServer(entryId, hostname, mediaServerIndex, applicationName, EntryServerNodeStatus.get(1));
	}

	/**  Register media server to live entry  */
    public static RegisterMediaServerLiveStreamBuilder registerMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex, String applicationName, EntryServerNodeStatus liveEntryStatus)  {
		return new RegisterMediaServerLiveStreamBuilder(entryId, hostname, mediaServerIndex, applicationName, liveEntryStatus);
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

	/**  Remove push publish configuration from entry  */
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

	/**  Sey recorded video to live entry  */
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

	/**  Unregister media server from live entry  */
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

	/**  Update live stream entry. Only the properties that were set will be updated.  */
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

	/**  Update entry thumbnail using url  */
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

	/**  Update live stream entry thumbnail using a raw jpeg file  */
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

	/**  Validates all registered media servers  */
    public static ValidateRegisteredMediaServersLiveStreamBuilder validateRegisteredMediaServers(String entryId)  {
		return new ValidateRegisteredMediaServersLiveStreamBuilder(entryId);
	}
}
