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
// Copyright (C) 2006-2022  Kaltura Inc.
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

import com.kaltura.client.enums.EntryServerNodeStatus;
import com.kaltura.client.enums.EntryServerNodeType;
import com.kaltura.client.types.DataCenterContentResource;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.LiveChannel;
import com.kaltura.client.types.LiveChannelFilter;
import com.kaltura.client.types.LiveEntry;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Live Channel service lets you manage live channels
 * 
 * @param liveChannel Live channel metadata
 * @param entryId Live entry id
 * @param assetId Live asset id
 * @param mediaServerIndex 
 * @param resource 
 * @param duration in seconds
 * @param isLastChunk Is this the last recorded chunk in the current session (i.e. following a stream
 * stop event)
 * @param entryId Live entry id
 * @param mediaServerIndex Media server index primary / secondary
 * @param liveEntryStatus the status KalturaEntryServerNodeStatus::PLAYABLE |
 * KalturaEntryServerNodeStatus::BROADCASTING
 * @param id Live channel id to delete
 * @param id Live channel id
 * @param id ID of the live channel
 * @param filter live channel filter
 * @param pager Pager
 * @param entryId Live entry id
 * @param hostname Media server host name
 * @param mediaServerIndex Media server index primary / secondary
 * @param applicationName the application to which entry is being broadcast
 * @param liveEntryStatus the status KalturaEntryServerNodeStatus::PLAYABLE |
 * KalturaEntryServerNodeStatus::BROADCASTING
 * @param shouldCreateRecordedEntry 
 * @param entryId Live entry id
 * @param mediaServerIndex 
 * @param resource 
 * @param duration in seconds
 * @param recordedEntryId Recorded entry Id
 * @param flavorParamsId Recorded entry Id
 * @param entryId Live entry id
 * @param hostname Media server host name
 * @param mediaServerIndex Media server index primary / secondary
 * @param id Live channel id to update
 * @param liveChannel Live channel metadata to update
 * @param entryId Live entry id
 */
public class LiveChannelService {
	
	public static class AddLiveChannelBuilder extends RequestBuilder<LiveChannel, LiveChannel.Tokenizer, AddLiveChannelBuilder> {
		
		public AddLiveChannelBuilder(LiveChannel liveChannel) {
			super(LiveChannel.class, "livechannel", "add");
			params.add("liveChannel", liveChannel);
		}
	}

	/**
	 * Adds new live channel.
	 * 
	 * @param liveChannel Live channel metadata
	 */
    public static AddLiveChannelBuilder add(LiveChannel liveChannel)  {
		return new AddLiveChannelBuilder(liveChannel);
	}
	
	public static class AppendRecordingLiveChannelBuilder extends RequestBuilder<LiveEntry, LiveEntry.Tokenizer, AppendRecordingLiveChannelBuilder> {
		
		public AppendRecordingLiveChannelBuilder(String entryId, String assetId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration, boolean isLastChunk) {
			super(LiveEntry.class, "livechannel", "appendRecording");
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

	public static AppendRecordingLiveChannelBuilder appendRecording(String entryId, String assetId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration)  {
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
    public static AppendRecordingLiveChannelBuilder appendRecording(String entryId, String assetId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration, boolean isLastChunk)  {
		return new AppendRecordingLiveChannelBuilder(entryId, assetId, mediaServerIndex, resource, duration, isLastChunk);
	}
	
	public static class CreateRecordedEntryLiveChannelBuilder extends RequestBuilder<LiveEntry, LiveEntry.Tokenizer, CreateRecordedEntryLiveChannelBuilder> {
		
		public CreateRecordedEntryLiveChannelBuilder(String entryId, EntryServerNodeType mediaServerIndex, EntryServerNodeStatus liveEntryStatus) {
			super(LiveEntry.class, "livechannel", "createRecordedEntry");
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
    public static CreateRecordedEntryLiveChannelBuilder createRecordedEntry(String entryId, EntryServerNodeType mediaServerIndex, EntryServerNodeStatus liveEntryStatus)  {
		return new CreateRecordedEntryLiveChannelBuilder(entryId, mediaServerIndex, liveEntryStatus);
	}
	
	public static class DeleteLiveChannelBuilder extends NullRequestBuilder {
		
		public DeleteLiveChannelBuilder(String id) {
			super("livechannel", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete a live channel.
	 * 
	 * @param id Live channel id to delete
	 */
    public static DeleteLiveChannelBuilder delete(String id)  {
		return new DeleteLiveChannelBuilder(id);
	}
	
	public static class GetLiveChannelBuilder extends RequestBuilder<LiveChannel, LiveChannel.Tokenizer, GetLiveChannelBuilder> {
		
		public GetLiveChannelBuilder(String id) {
			super(LiveChannel.class, "livechannel", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get live channel by ID.
	 * 
	 * @param id Live channel id
	 */
    public static GetLiveChannelBuilder get(String id)  {
		return new GetLiveChannelBuilder(id);
	}
	
	public static class IsLiveLiveChannelBuilder extends RequestBuilder<Boolean, String, IsLiveLiveChannelBuilder> {
		
		public IsLiveLiveChannelBuilder(String id) {
			super(Boolean.class, "livechannel", "isLive");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delivering the status of a live channel (on-air/offline)
	 * 
	 * @param id ID of the live channel
	 */
    public static IsLiveLiveChannelBuilder isLive(String id)  {
		return new IsLiveLiveChannelBuilder(id);
	}
	
	public static class ListLiveChannelBuilder extends ListResponseRequestBuilder<LiveChannel, LiveChannel.Tokenizer, ListLiveChannelBuilder> {
		
		public ListLiveChannelBuilder(LiveChannelFilter filter, FilterPager pager) {
			super(LiveChannel.class, "livechannel", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListLiveChannelBuilder list()  {
		return list(null);
	}

	public static ListLiveChannelBuilder list(LiveChannelFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List live channels by filter with paging support.
	 * 
	 * @param filter live channel filter
	 * @param pager Pager
	 */
    public static ListLiveChannelBuilder list(LiveChannelFilter filter, FilterPager pager)  {
		return new ListLiveChannelBuilder(filter, pager);
	}
	
	public static class RegisterMediaServerLiveChannelBuilder extends RequestBuilder<LiveEntry, LiveEntry.Tokenizer, RegisterMediaServerLiveChannelBuilder> {
		
		public RegisterMediaServerLiveChannelBuilder(String entryId, String hostname, EntryServerNodeType mediaServerIndex, String applicationName, EntryServerNodeStatus liveEntryStatus, boolean shouldCreateRecordedEntry) {
			super(LiveEntry.class, "livechannel", "registerMediaServer");
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

	public static RegisterMediaServerLiveChannelBuilder registerMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex)  {
		return registerMediaServer(entryId, hostname, mediaServerIndex, null);
	}

	public static RegisterMediaServerLiveChannelBuilder registerMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex, String applicationName)  {
		return registerMediaServer(entryId, hostname, mediaServerIndex, applicationName, EntryServerNodeStatus.get(1));
	}

	public static RegisterMediaServerLiveChannelBuilder registerMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex, String applicationName, EntryServerNodeStatus liveEntryStatus)  {
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
    public static RegisterMediaServerLiveChannelBuilder registerMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex, String applicationName, EntryServerNodeStatus liveEntryStatus, boolean shouldCreateRecordedEntry)  {
		return new RegisterMediaServerLiveChannelBuilder(entryId, hostname, mediaServerIndex, applicationName, liveEntryStatus, shouldCreateRecordedEntry);
	}
	
	public static class SetRecordedContentLiveChannelBuilder extends RequestBuilder<LiveEntry, LiveEntry.Tokenizer, SetRecordedContentLiveChannelBuilder> {
		
		public SetRecordedContentLiveChannelBuilder(String entryId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration, String recordedEntryId, int flavorParamsId) {
			super(LiveEntry.class, "livechannel", "setRecordedContent");
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

	public static SetRecordedContentLiveChannelBuilder setRecordedContent(String entryId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration)  {
		return setRecordedContent(entryId, mediaServerIndex, resource, duration, null);
	}

	public static SetRecordedContentLiveChannelBuilder setRecordedContent(String entryId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration, String recordedEntryId)  {
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
    public static SetRecordedContentLiveChannelBuilder setRecordedContent(String entryId, EntryServerNodeType mediaServerIndex, DataCenterContentResource resource, double duration, String recordedEntryId, int flavorParamsId)  {
		return new SetRecordedContentLiveChannelBuilder(entryId, mediaServerIndex, resource, duration, recordedEntryId, flavorParamsId);
	}
	
	public static class UnregisterMediaServerLiveChannelBuilder extends RequestBuilder<LiveEntry, LiveEntry.Tokenizer, UnregisterMediaServerLiveChannelBuilder> {
		
		public UnregisterMediaServerLiveChannelBuilder(String entryId, String hostname, EntryServerNodeType mediaServerIndex) {
			super(LiveEntry.class, "livechannel", "unregisterMediaServer");
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
    public static UnregisterMediaServerLiveChannelBuilder unregisterMediaServer(String entryId, String hostname, EntryServerNodeType mediaServerIndex)  {
		return new UnregisterMediaServerLiveChannelBuilder(entryId, hostname, mediaServerIndex);
	}
	
	public static class UpdateLiveChannelBuilder extends RequestBuilder<LiveChannel, LiveChannel.Tokenizer, UpdateLiveChannelBuilder> {
		
		public UpdateLiveChannelBuilder(String id, LiveChannel liveChannel) {
			super(LiveChannel.class, "livechannel", "update");
			params.add("id", id);
			params.add("liveChannel", liveChannel);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update live channel. Only the properties that were set will be updated.
	 * 
	 * @param id Live channel id to update
	 * @param liveChannel Live channel metadata to update
	 */
    public static UpdateLiveChannelBuilder update(String id, LiveChannel liveChannel)  {
		return new UpdateLiveChannelBuilder(id, liveChannel);
	}
	
	public static class ValidateRegisteredMediaServersLiveChannelBuilder extends NullRequestBuilder {
		
		public ValidateRegisteredMediaServersLiveChannelBuilder(String entryId) {
			super("livechannel", "validateRegisteredMediaServers");
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
    public static ValidateRegisteredMediaServersLiveChannelBuilder validateRegisteredMediaServers(String entryId)  {
		return new ValidateRegisteredMediaServersLiveChannelBuilder(entryId);
	}
}
