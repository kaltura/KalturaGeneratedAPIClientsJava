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
package com.kaltura.client.services;

import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.MediaEntry;
import com.kaltura.client.types.RoomEntry;
import com.kaltura.client.types.RoomEntryFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class RoomService {
	
	public static class AddRoomBuilder extends RequestBuilder<RoomEntry, RoomEntry.Tokenizer, AddRoomBuilder> {
		
		public AddRoomBuilder(RoomEntry entry) {
			super(RoomEntry.class, "room_room", "add");
			params.add("entry", entry);
		}
	}

    public static AddRoomBuilder add(RoomEntry entry)  {
		return new AddRoomBuilder(entry);
	}
	
	public static class AttachRecordedEntryRoomBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, AttachRecordedEntryRoomBuilder> {
		
		public AttachRecordedEntryRoomBuilder(String roomEntryId, String mediaEntryId) {
			super(MediaEntry.class, "room_room", "attachRecordedEntry");
			params.add("roomEntryId", roomEntryId);
			params.add("mediaEntryId", mediaEntryId);
		}
		
		public void roomEntryId(String multirequestToken) {
			params.add("roomEntryId", multirequestToken);
		}
		
		public void mediaEntryId(String multirequestToken) {
			params.add("mediaEntryId", multirequestToken);
		}
	}

    public static AttachRecordedEntryRoomBuilder attachRecordedEntry(String roomEntryId, String mediaEntryId)  {
		return new AttachRecordedEntryRoomBuilder(roomEntryId, mediaEntryId);
	}
	
	public static class DeleteRoomBuilder extends NullRequestBuilder {
		
		public DeleteRoomBuilder(String roomId) {
			super("room_room", "delete");
			params.add("roomId", roomId);
		}
		
		public void roomId(String multirequestToken) {
			params.add("roomId", multirequestToken);
		}
	}

    public static DeleteRoomBuilder delete(String roomId)  {
		return new DeleteRoomBuilder(roomId);
	}
	
	public static class GetRoomBuilder extends RequestBuilder<RoomEntry, RoomEntry.Tokenizer, GetRoomBuilder> {
		
		public GetRoomBuilder(String roomId) {
			super(RoomEntry.class, "room_room", "get");
			params.add("roomId", roomId);
		}
		
		public void roomId(String multirequestToken) {
			params.add("roomId", multirequestToken);
		}
	}

    public static GetRoomBuilder get(String roomId)  {
		return new GetRoomBuilder(roomId);
	}
	
	public static class ListRoomBuilder extends ListResponseRequestBuilder<RoomEntry, RoomEntry.Tokenizer, ListRoomBuilder> {
		
		public ListRoomBuilder(RoomEntryFilter filter, FilterPager pager) {
			super(RoomEntry.class, "room_room", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListRoomBuilder list()  {
		return list(null);
	}

	public static ListRoomBuilder list(RoomEntryFilter filter)  {
		return list(filter, null);
	}

    public static ListRoomBuilder list(RoomEntryFilter filter, FilterPager pager)  {
		return new ListRoomBuilder(filter, pager);
	}
	
	public static class UpdateRoomBuilder extends RequestBuilder<RoomEntry, RoomEntry.Tokenizer, UpdateRoomBuilder> {
		
		public UpdateRoomBuilder(String roomId, RoomEntry room) {
			super(RoomEntry.class, "room_room", "update");
			params.add("roomId", roomId);
			params.add("room", room);
		}
		
		public void roomId(String multirequestToken) {
			params.add("roomId", multirequestToken);
		}
	}

    public static UpdateRoomBuilder update(String roomId, RoomEntry room)  {
		return new UpdateRoomBuilder(roomId, room);
	}
}
