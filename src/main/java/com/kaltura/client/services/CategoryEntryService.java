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
import com.kaltura.client.types.BulkServiceData;
import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.BulkUploadCategoryEntryData;
import com.kaltura.client.types.CategoryEntry;
import com.kaltura.client.types.CategoryEntryFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Add &amp; Manage CategoryEntry - assign entry to category  */
public class CategoryEntryService {

	/**  activate CategoryEntry when it is pending moderation  */
    public static RequestBuilder<Void> activate(String entryId, int categoryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("categoryId", categoryId);

        return new NullRequestBuilder("categoryentry", "activate", kparams);
    }

	/**  Add new CategoryEntry  */
    public static RequestBuilder<CategoryEntry> add(CategoryEntry categoryEntry)  {
        Params kparams = new Params();
        kparams.add("categoryEntry", categoryEntry);

        return new RequestBuilder<CategoryEntry>(CategoryEntry.class, "categoryentry", "add", kparams);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(BulkServiceData bulkUploadData)  {
        return addFromBulkUpload(bulkUploadData, null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(BulkServiceData bulkUploadData, BulkUploadCategoryEntryData bulkUploadCategoryEntryData)  {
        Params kparams = new Params();
        kparams.add("bulkUploadData", bulkUploadData);
        kparams.add("bulkUploadCategoryEntryData", bulkUploadCategoryEntryData);

        return new RequestBuilder<BulkUpload>(BulkUpload.class, "categoryentry", "addFromBulkUpload", kparams);
    }

	/**  Delete CategoryEntry  */
    public static RequestBuilder<Void> delete(String entryId, int categoryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("categoryId", categoryId);

        return new NullRequestBuilder("categoryentry", "delete", kparams);
    }

    public static RequestBuilder<Integer> index(String entryId, int categoryId)  {
        return index(entryId, categoryId, true);
    }

	/**  Index CategoryEntry by Id  */
    public static RequestBuilder<Integer> index(String entryId, int categoryId, boolean shouldUpdate)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("categoryId", categoryId);
        kparams.add("shouldUpdate", shouldUpdate);

        return new RequestBuilder<Integer>(Integer.class, "categoryentry", "index", kparams);
    }

    public static RequestBuilder<ListResponse<CategoryEntry>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<CategoryEntry>> list(CategoryEntryFilter filter)  {
        return list(filter, null);
    }

	/**  List all categoryEntry  */
    public static RequestBuilder<ListResponse<CategoryEntry>> list(CategoryEntryFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<CategoryEntry>(CategoryEntry.class, "categoryentry", "list", kparams);
    }

	/**  activate CategoryEntry when it is pending moderation  */
    public static RequestBuilder<Void> reject(String entryId, int categoryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("categoryId", categoryId);

        return new NullRequestBuilder("categoryentry", "reject", kparams);
    }

	/**  update privacy context from the category  */
    public static RequestBuilder<Void> syncPrivacyContext(String entryId, int categoryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("categoryId", categoryId);

        return new NullRequestBuilder("categoryentry", "syncPrivacyContext", kparams);
    }
}
