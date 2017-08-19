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
import com.kaltura.client.types.LiveChannelSegment;
import com.kaltura.client.types.LiveChannelSegmentFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Manage live channel segments  */
public class LiveChannelSegmentService {
	
	public static class AddLiveChannelSegmentBuilder extends RequestBuilder<LiveChannelSegment, LiveChannelSegment.Tokenizer, AddLiveChannelSegmentBuilder> {
		
		public AddLiveChannelSegmentBuilder(LiveChannelSegment liveChannelSegment) {
			super(LiveChannelSegment.class, "livechannelsegment", "add");
			params.add("liveChannelSegment", liveChannelSegment);
		}
	}

	/**  Add new live channel segment  */
    public static AddLiveChannelSegmentBuilder add(LiveChannelSegment liveChannelSegment)  {
		return new AddLiveChannelSegmentBuilder(liveChannelSegment);
	}
	
	public static class DeleteLiveChannelSegmentBuilder extends NullRequestBuilder {
		
		public DeleteLiveChannelSegmentBuilder(int id) {
			super("livechannelsegment", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Delete live channel segment by id  */
    public static DeleteLiveChannelSegmentBuilder delete(int id)  {
		return new DeleteLiveChannelSegmentBuilder(id);
	}
	
	public static class GetLiveChannelSegmentBuilder extends RequestBuilder<LiveChannelSegment, LiveChannelSegment.Tokenizer, GetLiveChannelSegmentBuilder> {
		
		public GetLiveChannelSegmentBuilder(int id) {
			super(LiveChannelSegment.class, "livechannelsegment", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Get live channel segment by id  */
    public static GetLiveChannelSegmentBuilder get(int id)  {
		return new GetLiveChannelSegmentBuilder(id);
	}
	
	public static class ListLiveChannelSegmentBuilder extends ListResponseRequestBuilder<LiveChannelSegment, LiveChannelSegment.Tokenizer, ListLiveChannelSegmentBuilder> {
		
		public ListLiveChannelSegmentBuilder(LiveChannelSegmentFilter filter, FilterPager pager) {
			super(LiveChannelSegment.class, "livechannelsegment", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListLiveChannelSegmentBuilder list()  {
		return list(null);
	}

	public static ListLiveChannelSegmentBuilder list(LiveChannelSegmentFilter filter)  {
		return list(filter, null);
	}

	/**  List live channel segments by filter and pager  */
    public static ListLiveChannelSegmentBuilder list(LiveChannelSegmentFilter filter, FilterPager pager)  {
		return new ListLiveChannelSegmentBuilder(filter, pager);
	}
	
	public static class UpdateLiveChannelSegmentBuilder extends RequestBuilder<LiveChannelSegment, LiveChannelSegment.Tokenizer, UpdateLiveChannelSegmentBuilder> {
		
		public UpdateLiveChannelSegmentBuilder(int id, LiveChannelSegment liveChannelSegment) {
			super(LiveChannelSegment.class, "livechannelsegment", "update");
			params.add("id", id);
			params.add("liveChannelSegment", liveChannelSegment);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Update live channel segment by id  */
    public static UpdateLiveChannelSegmentBuilder update(int id, LiveChannelSegment liveChannelSegment)  {
		return new UpdateLiveChannelSegmentBuilder(id, liveChannelSegment);
	}
}
