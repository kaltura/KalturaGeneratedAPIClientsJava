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

import com.kaltura.client.enums.EntryServerNodeStatus;
import com.kaltura.client.types.EntryServerNode;
import com.kaltura.client.types.EntryServerNodeFilter;
import com.kaltura.client.types.FilterPager;
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
 * Base class for entry server node
 * 
 * @param id 
 * @param filter 
 * @param pager 
 * @param id 
 * @param entryServerNode 
 * @param id 
 * @param status 
 * @param id entry server node id
 */
public class EntryServerNodeService {
	
	public static class GetEntryServerNodeBuilder extends RequestBuilder<EntryServerNode, EntryServerNode.Tokenizer, GetEntryServerNodeBuilder> {
		
		public GetEntryServerNodeBuilder(String id) {
			super(EntryServerNode.class, "entryservernode", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

    public static GetEntryServerNodeBuilder get(String id)  {
		return new GetEntryServerNodeBuilder(id);
	}
	
	public static class ListEntryServerNodeBuilder extends ListResponseRequestBuilder<EntryServerNode, EntryServerNode.Tokenizer, ListEntryServerNodeBuilder> {
		
		public ListEntryServerNodeBuilder(EntryServerNodeFilter filter, FilterPager pager) {
			super(EntryServerNode.class, "entryservernode", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListEntryServerNodeBuilder list()  {
		return list(null);
	}

	public static ListEntryServerNodeBuilder list(EntryServerNodeFilter filter)  {
		return list(filter, null);
	}

    public static ListEntryServerNodeBuilder list(EntryServerNodeFilter filter, FilterPager pager)  {
		return new ListEntryServerNodeBuilder(filter, pager);
	}
	
	public static class UpdateEntryServerNodeBuilder extends RequestBuilder<EntryServerNode, EntryServerNode.Tokenizer, UpdateEntryServerNodeBuilder> {
		
		public UpdateEntryServerNodeBuilder(int id, EntryServerNode entryServerNode) {
			super(EntryServerNode.class, "entryservernode", "update");
			params.add("id", id);
			params.add("entryServerNode", entryServerNode);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

    public static UpdateEntryServerNodeBuilder update(int id, EntryServerNode entryServerNode)  {
		return new UpdateEntryServerNodeBuilder(id, entryServerNode);
	}
	
	public static class UpdateStatusEntryServerNodeBuilder extends RequestBuilder<EntryServerNode, EntryServerNode.Tokenizer, UpdateStatusEntryServerNodeBuilder> {
		
		public UpdateStatusEntryServerNodeBuilder(String id, EntryServerNodeStatus status) {
			super(EntryServerNode.class, "entryservernode", "updateStatus");
			params.add("id", id);
			params.add("status", status);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void status(String multirequestToken) {
			params.add("status", multirequestToken);
		}
	}

    public static UpdateStatusEntryServerNodeBuilder updateStatus(String id, EntryServerNodeStatus status)  {
		return new UpdateStatusEntryServerNodeBuilder(id, status);
	}
	
	public static class ValidateRegisteredEntryServerNodeEntryServerNodeBuilder extends NullRequestBuilder {
		
		public ValidateRegisteredEntryServerNodeEntryServerNodeBuilder(int id) {
			super("entryservernode", "validateRegisteredEntryServerNode");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Validates server node still registered on entry
	 * 
	 * @param id entry server node id
	 */
    public static ValidateRegisteredEntryServerNodeEntryServerNodeBuilder validateRegisteredEntryServerNode(int id)  {
		return new ValidateRegisteredEntryServerNodeEntryServerNodeBuilder(id);
	}
}
