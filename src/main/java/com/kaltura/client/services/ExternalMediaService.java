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

import com.kaltura.client.types.ExternalMediaEntry;
import com.kaltura.client.types.ExternalMediaEntryFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * External media service lets you upload and manage embed codes and external
  playable content
 * 
 * @param entry 
 * @param filter External media entry filter
 * @param id External media entry id to delete
 * @param id External media entry id
 * @param filter External media entry filter
 * @param pager Pager
 * @param id External media entry id to update
 * @param entry External media entry object to update
 */
public class ExternalMediaService {
	
	public static class AddExternalMediaBuilder extends RequestBuilder<ExternalMediaEntry, ExternalMediaEntry.Tokenizer, AddExternalMediaBuilder> {
		
		public AddExternalMediaBuilder(ExternalMediaEntry entry) {
			super(ExternalMediaEntry.class, "externalmedia_externalmedia", "add");
			params.add("entry", entry);
		}
	}

	/**
	 * Add external media entry
	 * 
	 * @param entry 
	 */
    public static AddExternalMediaBuilder add(ExternalMediaEntry entry)  {
		return new AddExternalMediaBuilder(entry);
	}
	
	public static class CountExternalMediaBuilder extends RequestBuilder<Integer, String, CountExternalMediaBuilder> {
		
		public CountExternalMediaBuilder(ExternalMediaEntryFilter filter) {
			super(Integer.class, "externalmedia_externalmedia", "count");
			params.add("filter", filter);
		}
	}

	public static CountExternalMediaBuilder count()  {
		return count(null);
	}

	/**
	 * Count media entries by filter.
	 * 
	 * @param filter External media entry filter
	 */
    public static CountExternalMediaBuilder count(ExternalMediaEntryFilter filter)  {
		return new CountExternalMediaBuilder(filter);
	}
	
	public static class DeleteExternalMediaBuilder extends NullRequestBuilder {
		
		public DeleteExternalMediaBuilder(String id) {
			super("externalmedia_externalmedia", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete a external media entry.
	 * 
	 * @param id External media entry id to delete
	 */
    public static DeleteExternalMediaBuilder delete(String id)  {
		return new DeleteExternalMediaBuilder(id);
	}
	
	public static class GetExternalMediaBuilder extends RequestBuilder<ExternalMediaEntry, ExternalMediaEntry.Tokenizer, GetExternalMediaBuilder> {
		
		public GetExternalMediaBuilder(String id) {
			super(ExternalMediaEntry.class, "externalmedia_externalmedia", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get external media entry by ID.
	 * 
	 * @param id External media entry id
	 */
    public static GetExternalMediaBuilder get(String id)  {
		return new GetExternalMediaBuilder(id);
	}
	
	public static class ListExternalMediaBuilder extends ListResponseRequestBuilder<ExternalMediaEntry, ExternalMediaEntry.Tokenizer, ListExternalMediaBuilder> {
		
		public ListExternalMediaBuilder(ExternalMediaEntryFilter filter, FilterPager pager) {
			super(ExternalMediaEntry.class, "externalmedia_externalmedia", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListExternalMediaBuilder list()  {
		return list(null);
	}

	public static ListExternalMediaBuilder list(ExternalMediaEntryFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List media entries by filter with paging support.
	 * 
	 * @param filter External media entry filter
	 * @param pager Pager
	 */
    public static ListExternalMediaBuilder list(ExternalMediaEntryFilter filter, FilterPager pager)  {
		return new ListExternalMediaBuilder(filter, pager);
	}
	
	public static class UpdateExternalMediaBuilder extends RequestBuilder<ExternalMediaEntry, ExternalMediaEntry.Tokenizer, UpdateExternalMediaBuilder> {
		
		public UpdateExternalMediaBuilder(String id, ExternalMediaEntry entry) {
			super(ExternalMediaEntry.class, "externalmedia_externalmedia", "update");
			params.add("id", id);
			params.add("entry", entry);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update external media entry. Only the properties that were set will be updated.
	 * 
	 * @param id External media entry id to update
	 * @param entry External media entry object to update
	 */
    public static UpdateExternalMediaBuilder update(String id, ExternalMediaEntry entry)  {
		return new UpdateExternalMediaBuilder(id, entry);
	}
}
