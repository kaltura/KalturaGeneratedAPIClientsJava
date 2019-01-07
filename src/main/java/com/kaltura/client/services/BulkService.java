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
// Copyright (C) 2006-2019  Kaltura Inc.
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

import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.BulkUploadFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Bulk upload service is used to upload &amp; manage bulk uploads
 * 
 * @param id job id
 * @param id 
 * @param bulkUploadFilter 
 * @param pager 
 * @param id job id
 * @param id job id
 */
public class BulkService {
	
	public static class AbortBulkBuilder extends RequestBuilder<BulkUpload, BulkUpload.Tokenizer, AbortBulkBuilder> {
		
		public AbortBulkBuilder(int id) {
			super(BulkUpload.class, "bulkupload_bulk", "abort");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Aborts the bulk upload and all its child jobs
	 * 
	 * @param id job id
	 */
    public static AbortBulkBuilder abort(int id)  {
		return new AbortBulkBuilder(id);
	}
	
	public static class GetBulkBuilder extends RequestBuilder<BulkUpload, BulkUpload.Tokenizer, GetBulkBuilder> {
		
		public GetBulkBuilder(int id) {
			super(BulkUpload.class, "bulkupload_bulk", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get bulk upload batch job by id
	 * 
	 * @param id 
	 */
    public static GetBulkBuilder get(int id)  {
		return new GetBulkBuilder(id);
	}
	
	public static class ListBulkBuilder extends ListResponseRequestBuilder<BulkUpload, BulkUpload.Tokenizer, ListBulkBuilder> {
		
		public ListBulkBuilder(BulkUploadFilter bulkUploadFilter, FilterPager pager) {
			super(BulkUpload.class, "bulkupload_bulk", "list");
			params.add("bulkUploadFilter", bulkUploadFilter);
			params.add("pager", pager);
		}
	}

	public static ListBulkBuilder list()  {
		return list(null);
	}

	public static ListBulkBuilder list(BulkUploadFilter bulkUploadFilter)  {
		return list(bulkUploadFilter, null);
	}

	/**
	 * List bulk upload batch jobs
	 * 
	 * @param bulkUploadFilter 
	 * @param pager 
	 */
    public static ListBulkBuilder list(BulkUploadFilter bulkUploadFilter, FilterPager pager)  {
		return new ListBulkBuilder(bulkUploadFilter, pager);
	}
	
	public static class ServeBulkBuilder extends ServeRequestBuilder {
		
		public ServeBulkBuilder(int id) {
			super("bulkupload_bulk", "serve");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * serve action returns the original file.
	 * 
	 * @param id job id
	 */
    public static ServeBulkBuilder serve(int id)  {
		return new ServeBulkBuilder(id);
	}
	
	public static class ServeLogBulkBuilder extends ServeRequestBuilder {
		
		public ServeLogBulkBuilder(int id) {
			super("bulkupload_bulk", "serveLog");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * serveLog action returns the log file for the bulk-upload job.
	 * 
	 * @param id job id
	 */
    public static ServeLogBulkBuilder serveLog(int id)  {
		return new ServeLogBulkBuilder(id);
	}
}
