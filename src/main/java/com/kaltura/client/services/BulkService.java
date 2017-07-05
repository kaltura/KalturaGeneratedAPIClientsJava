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

import com.kaltura.client.Params;
import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.BulkUploadFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Bulk upload service is used to upload &amp; manage bulk uploads  */
public class BulkService {

	/**  Aborts the bulk upload and all its child jobs  */
    public static RequestBuilder<BulkUpload> abort(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<BulkUpload>(BulkUpload.class, "bulkupload_bulk", "abort", kparams);
    }

	/**  Get bulk upload batch job by id  */
    public static RequestBuilder<BulkUpload> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<BulkUpload>(BulkUpload.class, "bulkupload_bulk", "get", kparams);
    }

    public static RequestBuilder<ListResponse<BulkUpload>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<BulkUpload>> list(BulkUploadFilter bulkUploadFilter)  {
        return list(bulkUploadFilter, null);
    }

	/**  List bulk upload batch jobs  */
    public static RequestBuilder<ListResponse<BulkUpload>> list(BulkUploadFilter bulkUploadFilter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("bulkUploadFilter", bulkUploadFilter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<BulkUpload>(BulkUpload.class, "bulkupload_bulk", "list", kparams);
    }

	/**  serve action returns the original file.  */
    public static RequestBuilder<String> serve(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new ServeRequestBuilder("bulkupload_bulk", "serve", kparams);
    }

	/**  serveLog action returns the log file for the bulk-upload job.  */
    public static RequestBuilder<String> serveLog(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new ServeRequestBuilder("bulkupload_bulk", "serveLog", kparams);
    }
}
