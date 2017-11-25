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

import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.MediaEntry;
import com.kaltura.client.types.MediaEntryFilter;
import com.kaltura.client.types.MixEntry;
import com.kaltura.client.types.MixEntryFilter;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
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
 * A Mix is an XML unique format invented by Kaltura, it allows the user to create
  a mix of videos and images, in and out points, transitions, text overlays,
  soundtrack, effects and much more...  Mixing service lets you create a new mix,
  manage its metadata and make basic manipulations.
 * 
 * @param mixEntry Mix entry metadata
 * @param entryId 
 * @param rank 
 * @param mixEntryId Mix entry to append to its timeline
 * @param mediaEntryId Media entry to append to the timeline
 * @param entryId Mix entry id to clone
 * @param filter Media entry filter
 * @param entryId Mix entry id to delete
 * @param entryId Mix entry id
 * @param version Desired version of the data
 * @param mediaEntryId 
 * @param mixId 
 * @param version Desired version to get the data from
 * @param filter Mix entry filter
 * @param pager Pager
 * @param entryId Mix entry id to update
 * @param mixEntry Mix entry metadata to update
 */
public class MixingService {
	
	public static class AddMixingBuilder extends RequestBuilder<MixEntry, MixEntry.Tokenizer, AddMixingBuilder> {
		
		public AddMixingBuilder(MixEntry mixEntry) {
			super(MixEntry.class, "mixing", "add");
			params.add("mixEntry", mixEntry);
		}
	}

	/**
	 * Adds a new mix.   If the dataContent is null, a default timeline will be
	  created.
	 * 
	 * @param mixEntry Mix entry metadata
	 */
    public static AddMixingBuilder add(MixEntry mixEntry)  {
		return new AddMixingBuilder(mixEntry);
	}
	
	public static class AnonymousRankMixingBuilder extends NullRequestBuilder {
		
		public AnonymousRankMixingBuilder(String entryId, int rank) {
			super("mixing", "anonymousRank");
			params.add("entryId", entryId);
			params.add("rank", rank);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void rank(String multirequestToken) {
			params.add("rank", multirequestToken);
		}
	}

	/**
	 * Anonymously rank a mix entry, no validation is done on duplicate rankings
	 * 
	 * @param entryId 
	 * @param rank 
	 */
    public static AnonymousRankMixingBuilder anonymousRank(String entryId, int rank)  {
		return new AnonymousRankMixingBuilder(entryId, rank);
	}
	
	public static class AppendMediaEntryMixingBuilder extends RequestBuilder<MixEntry, MixEntry.Tokenizer, AppendMediaEntryMixingBuilder> {
		
		public AppendMediaEntryMixingBuilder(String mixEntryId, String mediaEntryId) {
			super(MixEntry.class, "mixing", "appendMediaEntry");
			params.add("mixEntryId", mixEntryId);
			params.add("mediaEntryId", mediaEntryId);
		}
		
		public void mixEntryId(String multirequestToken) {
			params.add("mixEntryId", multirequestToken);
		}
		
		public void mediaEntryId(String multirequestToken) {
			params.add("mediaEntryId", multirequestToken);
		}
	}

	/**
	 * Appends a media entry to a the end of the mix timeline, this will save the mix
	  timeline as a new version.
	 * 
	 * @param mixEntryId Mix entry to append to its timeline
	 * @param mediaEntryId Media entry to append to the timeline
	 */
    public static AppendMediaEntryMixingBuilder appendMediaEntry(String mixEntryId, String mediaEntryId)  {
		return new AppendMediaEntryMixingBuilder(mixEntryId, mediaEntryId);
	}
	
	public static class CloneMixingBuilder extends RequestBuilder<MixEntry, MixEntry.Tokenizer, CloneMixingBuilder> {
		
		public CloneMixingBuilder(String entryId) {
			super(MixEntry.class, "mixing", "clone");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Clones an existing mix.
	 * 
	 * @param entryId Mix entry id to clone
	 */
    public static CloneMixingBuilder clone(String entryId)  {
		return new CloneMixingBuilder(entryId);
	}
	
	public static class CountMixingBuilder extends RequestBuilder<Integer, String, CountMixingBuilder> {
		
		public CountMixingBuilder(MediaEntryFilter filter) {
			super(Integer.class, "mixing", "count");
			params.add("filter", filter);
		}
	}

	public static CountMixingBuilder count()  {
		return count(null);
	}

	/**
	 * Count mix entries by filter.
	 * 
	 * @param filter Media entry filter
	 */
    public static CountMixingBuilder count(MediaEntryFilter filter)  {
		return new CountMixingBuilder(filter);
	}
	
	public static class DeleteMixingBuilder extends NullRequestBuilder {
		
		public DeleteMixingBuilder(String entryId) {
			super("mixing", "delete");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Delete a mix entry.
	 * 
	 * @param entryId Mix entry id to delete
	 */
    public static DeleteMixingBuilder delete(String entryId)  {
		return new DeleteMixingBuilder(entryId);
	}
	
	public static class GetMixingBuilder extends RequestBuilder<MixEntry, MixEntry.Tokenizer, GetMixingBuilder> {
		
		public GetMixingBuilder(String entryId, int version) {
			super(MixEntry.class, "mixing", "get");
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

	public static GetMixingBuilder get(String entryId)  {
		return get(entryId, -1);
	}

	/**
	 * Get mix entry by id.
	 * 
	 * @param entryId Mix entry id
	 * @param version Desired version of the data
	 */
    public static GetMixingBuilder get(String entryId, int version)  {
		return new GetMixingBuilder(entryId, version);
	}
	
	public static class GetMixesByMediaIdMixingBuilder extends ArrayRequestBuilder<MixEntry, MixEntry.Tokenizer, GetMixesByMediaIdMixingBuilder> {
		
		public GetMixesByMediaIdMixingBuilder(String mediaEntryId) {
			super(MixEntry.class, "mixing", "getMixesByMediaId");
			params.add("mediaEntryId", mediaEntryId);
		}
		
		public void mediaEntryId(String multirequestToken) {
			params.add("mediaEntryId", multirequestToken);
		}
	}

	/**
	 * Get the mixes in which the media entry is included
	 * 
	 * @param mediaEntryId 
	 */
    public static GetMixesByMediaIdMixingBuilder getMixesByMediaId(String mediaEntryId)  {
		return new GetMixesByMediaIdMixingBuilder(mediaEntryId);
	}
	
	public static class GetReadyMediaEntriesMixingBuilder extends ArrayRequestBuilder<MediaEntry, MediaEntry.Tokenizer, GetReadyMediaEntriesMixingBuilder> {
		
		public GetReadyMediaEntriesMixingBuilder(String mixId, int version) {
			super(MediaEntry.class, "mixing", "getReadyMediaEntries");
			params.add("mixId", mixId);
			params.add("version", version);
		}
		
		public void mixId(String multirequestToken) {
			params.add("mixId", multirequestToken);
		}
		
		public void version(String multirequestToken) {
			params.add("version", multirequestToken);
		}
	}

	public static GetReadyMediaEntriesMixingBuilder getReadyMediaEntries(String mixId)  {
		return getReadyMediaEntries(mixId, -1);
	}

	/**
	 * Get all ready media entries that exist in the given mix id
	 * 
	 * @param mixId 
	 * @param version Desired version to get the data from
	 */
    public static GetReadyMediaEntriesMixingBuilder getReadyMediaEntries(String mixId, int version)  {
		return new GetReadyMediaEntriesMixingBuilder(mixId, version);
	}
	
	public static class ListMixingBuilder extends ListResponseRequestBuilder<MixEntry, MixEntry.Tokenizer, ListMixingBuilder> {
		
		public ListMixingBuilder(MixEntryFilter filter, FilterPager pager) {
			super(MixEntry.class, "mixing", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListMixingBuilder list()  {
		return list(null);
	}

	public static ListMixingBuilder list(MixEntryFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List entries by filter with paging support.   Return parameter is an array of
	  mix entries.
	 * 
	 * @param filter Mix entry filter
	 * @param pager Pager
	 */
    public static ListMixingBuilder list(MixEntryFilter filter, FilterPager pager)  {
		return new ListMixingBuilder(filter, pager);
	}
	
	public static class UpdateMixingBuilder extends RequestBuilder<MixEntry, MixEntry.Tokenizer, UpdateMixingBuilder> {
		
		public UpdateMixingBuilder(String entryId, MixEntry mixEntry) {
			super(MixEntry.class, "mixing", "update");
			params.add("entryId", entryId);
			params.add("mixEntry", mixEntry);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Update mix entry. Only the properties that were set will be updated.
	 * 
	 * @param entryId Mix entry id to update
	 * @param mixEntry Mix entry metadata to update
	 */
    public static UpdateMixingBuilder update(String entryId, MixEntry mixEntry)  {
		return new UpdateMixingBuilder(entryId, mixEntry);
	}
}
