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

import com.kaltura.client.FileHolder;
import com.kaltura.client.Files;
import com.kaltura.client.Params;
import com.kaltura.client.enums.BulkUploadType;
import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Bulk upload service is used to upload &amp; manage bulk uploads using CSV files.
   This service manages only entry bulk uploads.  */
public class BulkUploadService {

	/**  Aborts the bulk upload and all its child jobs  */
    public static RequestBuilder<BulkUpload> abort(long id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<BulkUpload>(BulkUpload.class, "bulkupload", "abort", kparams);
    }

    public static RequestBuilder<BulkUpload> add(int conversionProfileId, FileHolder csvFileData)  {
        return add(conversionProfileId, csvFileData, null);
    }

    public static RequestBuilder<BulkUpload> add(int conversionProfileId, File csvFileData)  {
        return add(conversionProfileId, new FileHolder(csvFileData), null);
    }

    public static RequestBuilder<BulkUpload> add(int conversionProfileId, InputStream csvFileData, String csvFileDataMimeType, String csvFileDataName, long csvFileDataSize)  {
        return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName, csvFileDataSize), null);
    }

    public static RequestBuilder<BulkUpload> add(int conversionProfileId, FileInputStream csvFileData, String csvFileDataMimeType, String csvFileDataName)  {
        return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName), null);
    }

    public static RequestBuilder<BulkUpload> add(int conversionProfileId, FileHolder csvFileData, BulkUploadType bulkUploadType)  {
        return add(conversionProfileId, csvFileData, bulkUploadType, null);
    }

    public static RequestBuilder<BulkUpload> add(int conversionProfileId, File csvFileData, BulkUploadType bulkUploadType)  {
        return add(conversionProfileId, new FileHolder(csvFileData), bulkUploadType, null);
    }

    public static RequestBuilder<BulkUpload> add(int conversionProfileId, InputStream csvFileData, String csvFileDataMimeType, String csvFileDataName, long csvFileDataSize, BulkUploadType bulkUploadType)  {
        return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName, csvFileDataSize), bulkUploadType, null);
    }

    public static RequestBuilder<BulkUpload> add(int conversionProfileId, FileInputStream csvFileData, String csvFileDataMimeType, String csvFileDataName, BulkUploadType bulkUploadType)  {
        return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName), bulkUploadType, null);
    }

    public static RequestBuilder<BulkUpload> add(int conversionProfileId, FileHolder csvFileData, BulkUploadType bulkUploadType, String uploadedBy)  {
        return add(conversionProfileId, csvFileData, bulkUploadType, uploadedBy, null);
    }

    public static RequestBuilder<BulkUpload> add(int conversionProfileId, File csvFileData, BulkUploadType bulkUploadType, String uploadedBy)  {
        return add(conversionProfileId, new FileHolder(csvFileData), bulkUploadType, uploadedBy, null);
    }

    public static RequestBuilder<BulkUpload> add(int conversionProfileId, InputStream csvFileData, String csvFileDataMimeType, String csvFileDataName, long csvFileDataSize, BulkUploadType bulkUploadType, String uploadedBy)  {
        return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName, csvFileDataSize), bulkUploadType, uploadedBy, null);
    }

    public static RequestBuilder<BulkUpload> add(int conversionProfileId, FileInputStream csvFileData, String csvFileDataMimeType, String csvFileDataName, BulkUploadType bulkUploadType, String uploadedBy)  {
        return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName), bulkUploadType, uploadedBy, null);
    }

    public static RequestBuilder<BulkUpload> add(int conversionProfileId, File csvFileData, BulkUploadType bulkUploadType, String uploadedBy, String fileName)  {
        return add(conversionProfileId, new FileHolder(csvFileData), bulkUploadType, uploadedBy, fileName);
    }

    public static RequestBuilder<BulkUpload> add(int conversionProfileId, InputStream csvFileData, String csvFileDataMimeType, String csvFileDataName, long csvFileDataSize, BulkUploadType bulkUploadType, String uploadedBy, String fileName)  {
        return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName, csvFileDataSize), bulkUploadType, uploadedBy, fileName);
    }

    public static RequestBuilder<BulkUpload> add(int conversionProfileId, FileInputStream csvFileData, String csvFileDataMimeType, String csvFileDataName, BulkUploadType bulkUploadType, String uploadedBy, String fileName)  {
        return add(conversionProfileId, new FileHolder(csvFileData, csvFileDataMimeType, csvFileDataName), bulkUploadType, uploadedBy, fileName);
    }

	/**  Add new bulk upload batch job   Conversion profile id can be specified in the
	  API or in the CSV file, the one in the CSV file will be stronger.   If no
	  conversion profile was specified, partner's default will be used  */
    public static RequestBuilder<BulkUpload> add(int conversionProfileId, FileHolder csvFileData, BulkUploadType bulkUploadType, String uploadedBy, String fileName)  {
        Params kparams = new Params();
        kparams.add("conversionProfileId", conversionProfileId);
        Files kfiles = new Files();
        kfiles.add("csvFileData", csvFileData);
        kparams.add("bulkUploadType", bulkUploadType);
        kparams.add("uploadedBy", uploadedBy);
        kparams.add("fileName", fileName);

        return new RequestBuilder<BulkUpload>(BulkUpload.class, "bulkupload", "add", kparams, kfiles);
    }

	/**  Get bulk upload batch job by id  */
    public static RequestBuilder<BulkUpload> get(long id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<BulkUpload>(BulkUpload.class, "bulkupload", "get", kparams);
    }

    public static RequestBuilder<ListResponse<BulkUpload>> list()  {
        return list(null);
    }

	/**  List bulk upload batch jobs  */
    public static RequestBuilder<ListResponse<BulkUpload>> list(FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<BulkUpload>(BulkUpload.class, "bulkupload", "list", kparams);
    }

	/**  serve action returan the original file.  */
    public static RequestBuilder<String> serve(long id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new ServeRequestBuilder("bulkupload", "serve", kparams);
    }

	/**  serveLog action returan the original file.  */
    public static RequestBuilder<String> serveLog(long id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new ServeRequestBuilder("bulkupload", "serveLog", kparams);
    }
}
