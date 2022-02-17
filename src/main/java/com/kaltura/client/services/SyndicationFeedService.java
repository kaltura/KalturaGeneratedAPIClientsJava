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

import com.kaltura.client.types.BaseSyndicationFeed;
import com.kaltura.client.types.BaseSyndicationFeedFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.SyndicationFeedEntryCount;
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
 * Add &amp; Manage Syndication Feeds
 * 
 * @param syndicationFeed 
 * @param id 
 * @param id 
 * @param feedId 
 * @param filter 
 * @param pager 
 * @param feedId 
 * @param id 
 * @param syndicationFeed 
 */
public class SyndicationFeedService {
	
	public static class AddSyndicationFeedBuilder extends RequestBuilder<BaseSyndicationFeed, BaseSyndicationFeed.Tokenizer, AddSyndicationFeedBuilder> {
		
		public AddSyndicationFeedBuilder(BaseSyndicationFeed syndicationFeed) {
			super(BaseSyndicationFeed.class, "syndicationfeed", "add");
			params.add("syndicationFeed", syndicationFeed);
		}
	}

	/**
	 * Add new Syndication Feed
	 * 
	 * @param syndicationFeed 
	 */
    public static AddSyndicationFeedBuilder add(BaseSyndicationFeed syndicationFeed)  {
		return new AddSyndicationFeedBuilder(syndicationFeed);
	}
	
	public static class DeleteSyndicationFeedBuilder extends NullRequestBuilder {
		
		public DeleteSyndicationFeedBuilder(String id) {
			super("syndicationfeed", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete Syndication Feed by ID
	 * 
	 * @param id 
	 */
    public static DeleteSyndicationFeedBuilder delete(String id)  {
		return new DeleteSyndicationFeedBuilder(id);
	}
	
	public static class GetSyndicationFeedBuilder extends RequestBuilder<BaseSyndicationFeed, BaseSyndicationFeed.Tokenizer, GetSyndicationFeedBuilder> {
		
		public GetSyndicationFeedBuilder(String id) {
			super(BaseSyndicationFeed.class, "syndicationfeed", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get Syndication Feed by ID
	 * 
	 * @param id 
	 */
    public static GetSyndicationFeedBuilder get(String id)  {
		return new GetSyndicationFeedBuilder(id);
	}
	
	public static class GetEntryCountSyndicationFeedBuilder extends RequestBuilder<SyndicationFeedEntryCount, SyndicationFeedEntryCount.Tokenizer, GetEntryCountSyndicationFeedBuilder> {
		
		public GetEntryCountSyndicationFeedBuilder(String feedId) {
			super(SyndicationFeedEntryCount.class, "syndicationfeed", "getEntryCount");
			params.add("feedId", feedId);
		}
		
		public void feedId(String multirequestToken) {
			params.add("feedId", multirequestToken);
		}
	}

	/**
	 * get entry count for a syndication feed
	 * 
	 * @param feedId 
	 */
    public static GetEntryCountSyndicationFeedBuilder getEntryCount(String feedId)  {
		return new GetEntryCountSyndicationFeedBuilder(feedId);
	}
	
	public static class ListSyndicationFeedBuilder extends ListResponseRequestBuilder<BaseSyndicationFeed, BaseSyndicationFeed.Tokenizer, ListSyndicationFeedBuilder> {
		
		public ListSyndicationFeedBuilder(BaseSyndicationFeedFilter filter, FilterPager pager) {
			super(BaseSyndicationFeed.class, "syndicationfeed", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListSyndicationFeedBuilder list()  {
		return list(null);
	}

	public static ListSyndicationFeedBuilder list(BaseSyndicationFeedFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List Syndication Feeds by filter with paging support
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListSyndicationFeedBuilder list(BaseSyndicationFeedFilter filter, FilterPager pager)  {
		return new ListSyndicationFeedBuilder(filter, pager);
	}
	
	public static class RequestConversionSyndicationFeedBuilder extends RequestBuilder<String, String, RequestConversionSyndicationFeedBuilder> {
		
		public RequestConversionSyndicationFeedBuilder(String feedId) {
			super(String.class, "syndicationfeed", "requestConversion");
			params.add("feedId", feedId);
		}
		
		public void feedId(String multirequestToken) {
			params.add("feedId", multirequestToken);
		}
	}

	/**
	 * request conversion for all entries that doesn't have the required flavor param  
	  returns a comma-separated ids of conversion jobs
	 * 
	 * @param feedId 
	 */
    public static RequestConversionSyndicationFeedBuilder requestConversion(String feedId)  {
		return new RequestConversionSyndicationFeedBuilder(feedId);
	}
	
	public static class UpdateSyndicationFeedBuilder extends RequestBuilder<BaseSyndicationFeed, BaseSyndicationFeed.Tokenizer, UpdateSyndicationFeedBuilder> {
		
		public UpdateSyndicationFeedBuilder(String id, BaseSyndicationFeed syndicationFeed) {
			super(BaseSyndicationFeed.class, "syndicationfeed", "update");
			params.add("id", id);
			params.add("syndicationFeed", syndicationFeed);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update Syndication Feed by ID
	 * 
	 * @param id 
	 * @param syndicationFeed 
	 */
    public static UpdateSyndicationFeedBuilder update(String id, BaseSyndicationFeed syndicationFeed)  {
		return new UpdateSyndicationFeedBuilder(id, syndicationFeed);
	}
}
