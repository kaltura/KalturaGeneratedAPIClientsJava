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
// Copyright (C) 2006-2018  Kaltura Inc.
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

import com.kaltura.client.types.DataEntry;
import com.kaltura.client.types.DataEntryFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.GenericDataCenterContentResource;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Data service lets you manage data content (textual content)
 * 
 * @param dataEntry Data entry
 * @param entryId 
 * @param resource 
 * @param entryId Data entry id to delete
 * @param entryId Data entry id
 * @param version Desired version of the data
 * @param filter Document entry filter
 * @param pager Pager
 * @param entryId Data entry id
 * @param version Desired version of the data
 * @param forceProxy force to get the content without redirect
 * @param entryId Data entry id to update
 * @param documentEntry Data entry metadata to update
 */
public class DataService {
	
	public static class AddDataBuilder extends RequestBuilder<DataEntry, DataEntry.Tokenizer, AddDataBuilder> {
		
		public AddDataBuilder(DataEntry dataEntry) {
			super(DataEntry.class, "data", "add");
			params.add("dataEntry", dataEntry);
		}
	}

	/**
	 * Adds a new data entry
	 * 
	 * @param dataEntry Data entry
	 */
    public static AddDataBuilder add(DataEntry dataEntry)  {
		return new AddDataBuilder(dataEntry);
	}
	
	public static class AddContentDataBuilder extends RequestBuilder<String, String, AddContentDataBuilder> {
		
		public AddContentDataBuilder(String entryId, GenericDataCenterContentResource resource) {
			super(String.class, "data", "addContent");
			params.add("entryId", entryId);
			params.add("resource", resource);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Update the dataContent of data entry using a resource
	 * 
	 * @param entryId 
	 * @param resource 
	 */
    public static AddContentDataBuilder addContent(String entryId, GenericDataCenterContentResource resource)  {
		return new AddContentDataBuilder(entryId, resource);
	}
	
	public static class DeleteDataBuilder extends NullRequestBuilder {
		
		public DeleteDataBuilder(String entryId) {
			super("data", "delete");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Delete a data entry.
	 * 
	 * @param entryId Data entry id to delete
	 */
    public static DeleteDataBuilder delete(String entryId)  {
		return new DeleteDataBuilder(entryId);
	}
	
	public static class GetDataBuilder extends RequestBuilder<DataEntry, DataEntry.Tokenizer, GetDataBuilder> {
		
		public GetDataBuilder(String entryId, int version) {
			super(DataEntry.class, "data", "get");
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

	public static GetDataBuilder get(String entryId)  {
		return get(entryId, -1);
	}

	/**
	 * Get data entry by ID.
	 * 
	 * @param entryId Data entry id
	 * @param version Desired version of the data
	 */
    public static GetDataBuilder get(String entryId, int version)  {
		return new GetDataBuilder(entryId, version);
	}
	
	public static class ListDataBuilder extends ListResponseRequestBuilder<DataEntry, DataEntry.Tokenizer, ListDataBuilder> {
		
		public ListDataBuilder(DataEntryFilter filter, FilterPager pager) {
			super(DataEntry.class, "data", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListDataBuilder list()  {
		return list(null);
	}

	public static ListDataBuilder list(DataEntryFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List data entries by filter with paging support.
	 * 
	 * @param filter Document entry filter
	 * @param pager Pager
	 */
    public static ListDataBuilder list(DataEntryFilter filter, FilterPager pager)  {
		return new ListDataBuilder(filter, pager);
	}
	
	public static class ServeDataBuilder extends ServeRequestBuilder {
		
		public ServeDataBuilder(String entryId, int version, boolean forceProxy) {
			super("data", "serve");
			params.add("entryId", entryId);
			params.add("version", version);
			params.add("forceProxy", forceProxy);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void version(String multirequestToken) {
			params.add("version", multirequestToken);
		}
		
		public void forceProxy(String multirequestToken) {
			params.add("forceProxy", multirequestToken);
		}
	}

	public static ServeDataBuilder serve(String entryId)  {
		return serve(entryId, -1);
	}

	public static ServeDataBuilder serve(String entryId, int version)  {
		return serve(entryId, version, false);
	}

	/**
	 * return the file from dataContent field.
	 * 
	 * @param entryId Data entry id
	 * @param version Desired version of the data
	 * @param forceProxy force to get the content without redirect
	 */
    public static ServeDataBuilder serve(String entryId, int version, boolean forceProxy)  {
		return new ServeDataBuilder(entryId, version, forceProxy);
	}
	
	public static class UpdateDataBuilder extends RequestBuilder<DataEntry, DataEntry.Tokenizer, UpdateDataBuilder> {
		
		public UpdateDataBuilder(String entryId, DataEntry documentEntry) {
			super(DataEntry.class, "data", "update");
			params.add("entryId", entryId);
			params.add("documentEntry", documentEntry);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Update data entry. Only the properties that were set will be updated.
	 * 
	 * @param entryId Data entry id to update
	 * @param documentEntry Data entry metadata to update
	 */
    public static UpdateDataBuilder update(String entryId, DataEntry documentEntry)  {
		return new UpdateDataBuilder(entryId, documentEntry);
	}
}
