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
// Copyright (C) 2006-2021  Kaltura Inc.
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

import com.kaltura.client.FileHolder;
import com.kaltura.client.Files;
import com.kaltura.client.enums.BulkUploadType;
import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Bulk upload service is used to upload &amp; manage bulk uploads using CSV files.
   This service manages only entry bulk uploads.
 * 
 * @param id job id
 * @param conversionProfileId Conversion profile id to use for converting the current bulk (-1 to use
 * partner's default)
 * @param csvFileData bulk upload file
 * @param bulkUploadType 
 * @param uploadedBy 
 * @param fileName Friendly name of the file, used to be recognized later in the logs.
 * @param id 
 * @param pager 
 * @param id job id
 * @param id job id
 */
public class BulkUploadService {
	
	public static class AbortBulkUploadBuilder extends RequestBuilder<BulkUpload, BulkUpload.Tokenizer, AbortBulkUploadBuilder> {
		
		public AbortBulkUploadBuilder(long id) {
			super(BulkUpload.class, "bulkupload", "abort");
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
    public static AbortBulkUploadBuilder abort(long id)  {
		return new AbortBulkUploadBuilder(id);
	}
	
	public static class AddBulkUploadBuilder extends RequestBuilder<BulkUpload, BulkUpload.Tokenizer, AddBulkUploadBuilder> {
		
		public AddBulkUploadBuilder(int conversionProfileId, FileHolder csvFileData, BulkUploadType bulkUploadType, String uploadedBy, String fileName) {
			super(BulkUpload.class, "bulkupload", "add");
			params.add("conversionProfileId", conversionProfileId);
			files = new Files();
			files.add("csvFileData", csvFileData);
			params.add("bulkUploadType", bulkUploadType);
			params.add("uploadedBy", uploadedBy);
			params.add("fileName", fileName);
		}
		
		public void conversionProfileId(String multirequestToken) {
			params.add("conversionProfileId", multirequestToken);
		}
		
		public void bulkUploadType(String multirequestToken) {
			params.add("bulkUploadType", multirequestToken);
		}
		
		public void uploadedBy(String multirequestToken) {
			params.add("uploadedBy", multirequestToken);
		}
		
		public void fileName(String multirequestToken) {
			params.add("fileName", multirequestToken);
		}
	}

	public static AddBulkUploadBuilder add(int conversionProfileId, FileHolder csvFileData)  {
		return add(conversionProfileId, csvFileData, null);
	}

	public static AddBulkUploadBuilder add(int conversionProfileId, File csvFileData)  {
		return add(conversionProfileId, new FileHolder(csvFileData), null);
	}

	public static AddBulkUploadBuilder add(int conversionProfileId, InputStream csvFileData, String csvFileDataMimeType, String csvFileDataName, long csvFileDataSize)  {
		return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName, csvFileDataSize), null);
	}

	public static AddBulkUploadBuilder add(int conversionProfileId, FileInputStream csvFileData, String csvFileDataMimeType, String csvFileDataName)  {
		return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName), null);
	}

	public static AddBulkUploadBuilder add(int conversionProfileId, FileHolder csvFileData, BulkUploadType bulkUploadType)  {
		return add(conversionProfileId, csvFileData, bulkUploadType, null);
	}

	public static AddBulkUploadBuilder add(int conversionProfileId, File csvFileData, BulkUploadType bulkUploadType)  {
		return add(conversionProfileId, new FileHolder(csvFileData), bulkUploadType, null);
	}

	public static AddBulkUploadBuilder add(int conversionProfileId, InputStream csvFileData, String csvFileDataMimeType, String csvFileDataName, long csvFileDataSize, BulkUploadType bulkUploadType)  {
		return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName, csvFileDataSize), bulkUploadType, null);
	}

	public static AddBulkUploadBuilder add(int conversionProfileId, FileInputStream csvFileData, String csvFileDataMimeType, String csvFileDataName, BulkUploadType bulkUploadType)  {
		return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName), bulkUploadType, null);
	}

	public static AddBulkUploadBuilder add(int conversionProfileId, FileHolder csvFileData, BulkUploadType bulkUploadType, String uploadedBy)  {
		return add(conversionProfileId, csvFileData, bulkUploadType, uploadedBy, null);
	}

	public static AddBulkUploadBuilder add(int conversionProfileId, File csvFileData, BulkUploadType bulkUploadType, String uploadedBy)  {
		return add(conversionProfileId, new FileHolder(csvFileData), bulkUploadType, uploadedBy, null);
	}

	public static AddBulkUploadBuilder add(int conversionProfileId, InputStream csvFileData, String csvFileDataMimeType, String csvFileDataName, long csvFileDataSize, BulkUploadType bulkUploadType, String uploadedBy)  {
		return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName, csvFileDataSize), bulkUploadType, uploadedBy, null);
	}

	public static AddBulkUploadBuilder add(int conversionProfileId, FileInputStream csvFileData, String csvFileDataMimeType, String csvFileDataName, BulkUploadType bulkUploadType, String uploadedBy)  {
		return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName), bulkUploadType, uploadedBy, null);
	}

	public static AddBulkUploadBuilder add(int conversionProfileId, File csvFileData, BulkUploadType bulkUploadType, String uploadedBy, String fileName)  {
		return add(conversionProfileId, new FileHolder(csvFileData), bulkUploadType, uploadedBy, fileName);
	}

	public static AddBulkUploadBuilder add(int conversionProfileId, InputStream csvFileData, String csvFileDataMimeType, String csvFileDataName, long csvFileDataSize, BulkUploadType bulkUploadType, String uploadedBy, String fileName)  {
		return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName, csvFileDataSize), bulkUploadType, uploadedBy, fileName);
	}

	public static AddBulkUploadBuilder add(int conversionProfileId, FileInputStream csvFileData, String csvFileDataMimeType, String csvFileDataName, BulkUploadType bulkUploadType, String uploadedBy, String fileName)  {
		return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName), bulkUploadType, uploadedBy, fileName);
	}

	/**
	 * Add new bulk upload batch job   Conversion profile id can be specified in the
	  API or in the CSV file, the one in the CSV file will be stronger.   If no
	  conversion profile was specified, partner's default will be used
	 * 
	 * @param conversionProfileId Conversion profile id to use for converting the current bulk (-1 to use
	 * partner's default)
	 * @param csvFileData bulk upload file
	 * @param bulkUploadType 
	 * @param uploadedBy 
	 * @param fileName Friendly name of the file, used to be recognized later in the logs.
	 */
    public static AddBulkUploadBuilder add(int conversionProfileId, FileHolder csvFileData, BulkUploadType bulkUploadType, String uploadedBy, String fileName)  {
		return new AddBulkUploadBuilder(conversionProfileId, csvFileData, bulkUploadType, uploadedBy, fileName);
	}
	
	public static class GetBulkUploadBuilder extends RequestBuilder<BulkUpload, BulkUpload.Tokenizer, GetBulkUploadBuilder> {
		
		public GetBulkUploadBuilder(long id) {
			super(BulkUpload.class, "bulkupload", "get");
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
    public static GetBulkUploadBuilder get(long id)  {
		return new GetBulkUploadBuilder(id);
	}
	
	public static class ListBulkUploadBuilder extends ListResponseRequestBuilder<BulkUpload, BulkUpload.Tokenizer, ListBulkUploadBuilder> {
		
		public ListBulkUploadBuilder(FilterPager pager) {
			super(BulkUpload.class, "bulkupload", "list");
			params.add("pager", pager);
		}
	}

	public static ListBulkUploadBuilder list()  {
		return list(null);
	}

	/**
	 * List bulk upload batch jobs
	 * 
	 * @param pager 
	 */
    public static ListBulkUploadBuilder list(FilterPager pager)  {
		return new ListBulkUploadBuilder(pager);
	}
	
	public static class ServeBulkUploadBuilder extends ServeRequestBuilder {
		
		public ServeBulkUploadBuilder(long id) {
			super("bulkupload", "serve");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * serve action return the original file.
	 * 
	 * @param id job id
	 */
    public static ServeBulkUploadBuilder serve(long id)  {
		return new ServeBulkUploadBuilder(id);
	}
	
	public static class ServeLogBulkUploadBuilder extends ServeRequestBuilder {
		
		public ServeLogBulkUploadBuilder(long id) {
			super("bulkupload", "serveLog");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * serveLog action return the original file.
	 * 
	 * @param id job id
	 */
    public static ServeLogBulkUploadBuilder serveLog(long id)  {
		return new ServeLogBulkUploadBuilder(id);
	}
}
