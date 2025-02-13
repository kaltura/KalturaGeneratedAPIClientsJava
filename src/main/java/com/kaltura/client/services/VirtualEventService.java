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
import com.kaltura.client.types.VirtualEvent;
import com.kaltura.client.types.VirtualEventFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class VirtualEventService {
	
	public static class AddVirtualEventBuilder extends RequestBuilder<VirtualEvent, VirtualEvent.Tokenizer, AddVirtualEventBuilder> {
		
		public AddVirtualEventBuilder(VirtualEvent virtualEvent) {
			super(VirtualEvent.class, "virtualevent_virtualevent", "add");
			params.add("virtualEvent", virtualEvent);
		}
	}

	/**
	 * Add a new virtual event
	 * 
	 * @param virtualEvent 
	 */
    public static AddVirtualEventBuilder add(VirtualEvent virtualEvent)  {
		return new AddVirtualEventBuilder(virtualEvent);
	}
	
	public static class DeleteVirtualEventBuilder extends NullRequestBuilder {
		
		public DeleteVirtualEventBuilder(int id) {
			super("virtualevent_virtualevent", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete a virtual event
	 * 
	 * @param id 
	 */
    public static DeleteVirtualEventBuilder delete(int id)  {
		return new DeleteVirtualEventBuilder(id);
	}
	
	public static class GetVirtualEventBuilder extends RequestBuilder<VirtualEvent, VirtualEvent.Tokenizer, GetVirtualEventBuilder> {
		
		public GetVirtualEventBuilder(int id) {
			super(VirtualEvent.class, "virtualevent_virtualevent", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Retrieve a virtual event by id
	 * 
	 * @param id 
	 */
    public static GetVirtualEventBuilder get(int id)  {
		return new GetVirtualEventBuilder(id);
	}
	
	public static class ListVirtualEventBuilder extends ListResponseRequestBuilder<VirtualEvent, VirtualEvent.Tokenizer, ListVirtualEventBuilder> {
		
		public ListVirtualEventBuilder(VirtualEventFilter filter, FilterPager pager) {
			super(VirtualEvent.class, "virtualevent_virtualevent", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListVirtualEventBuilder list()  {
		return list(null);
	}

	public static ListVirtualEventBuilder list(VirtualEventFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List virtual events
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListVirtualEventBuilder list(VirtualEventFilter filter, FilterPager pager)  {
		return new ListVirtualEventBuilder(filter, pager);
	}
	
	public static class UpdateVirtualEventBuilder extends RequestBuilder<VirtualEvent, VirtualEvent.Tokenizer, UpdateVirtualEventBuilder> {
		
		public UpdateVirtualEventBuilder(int id, VirtualEvent virtualEvent) {
			super(VirtualEvent.class, "virtualevent_virtualevent", "update");
			params.add("id", id);
			params.add("virtualEvent", virtualEvent);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update an existing virtual event
	 * 
	 * @param id 
	 * @param virtualEvent 
	 */
    public static UpdateVirtualEventBuilder update(int id, VirtualEvent virtualEvent)  {
		return new UpdateVirtualEventBuilder(id, virtualEvent);
	}
}
