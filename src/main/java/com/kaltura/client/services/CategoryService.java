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
import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.BulkUploadCategoryData;
import com.kaltura.client.types.BulkUploadJobData;
import com.kaltura.client.types.Category;
import com.kaltura.client.types.CategoryFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Add &amp; Manage Categories  */
public class CategoryService {

	/**  Add new Category  */
    public static RequestBuilder<Category> add(Category category)  {
        Params kparams = new Params();
        kparams.add("category", category);

        return new RequestBuilder<Category>(Category.class, "category", "add", kparams);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileHolder fileData)  {
        return addFromBulkUpload(fileData, null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(File fileData)  {
        return addFromBulkUpload(new FileHolder(fileData), null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileHolder fileData, BulkUploadJobData bulkUploadData)  {
        return addFromBulkUpload(fileData, bulkUploadData, null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(File fileData, BulkUploadJobData bulkUploadData)  {
        return addFromBulkUpload(new FileHolder(fileData), bulkUploadData, null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(File fileData, BulkUploadJobData bulkUploadData, BulkUploadCategoryData bulkUploadCategoryData)  {
        return addFromBulkUpload(new FileHolder(fileData), bulkUploadData, bulkUploadCategoryData);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData, BulkUploadCategoryData bulkUploadCategoryData)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, bulkUploadCategoryData);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData, BulkUploadCategoryData bulkUploadCategoryData)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, bulkUploadCategoryData);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileHolder fileData, BulkUploadJobData bulkUploadData, BulkUploadCategoryData bulkUploadCategoryData)  {
        Params kparams = new Params();
        Files kfiles = new Files();
        kfiles.add("fileData", fileData);
        kparams.add("bulkUploadData", bulkUploadData);
        kparams.add("bulkUploadCategoryData", bulkUploadCategoryData);

        return new RequestBuilder<BulkUpload>(BulkUpload.class, "category", "addFromBulkUpload", kparams, kfiles);
    }

    public static RequestBuilder<Void> delete(int id)  {
        return delete(id, true);
    }

	/**  Delete a Category  */
    public static RequestBuilder<Void> delete(int id, Boolean moveEntriesToParentCategory)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("moveEntriesToParentCategory", moveEntriesToParentCategory);

        return new NullRequestBuilder("category", "delete", kparams);
    }

	/**  Get Category by id  */
    public static RequestBuilder<Category> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Category>(Category.class, "category", "get", kparams);
    }

    public static RequestBuilder<Integer> index(int id)  {
        return index(id, true);
    }

	/**  Index Category by id  */
    public static RequestBuilder<Integer> index(int id, boolean shouldUpdate)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("shouldUpdate", shouldUpdate);

        return new RequestBuilder<Integer>(Integer.class, "category", "index", kparams);
    }

    public static RequestBuilder<ListResponse<Category>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<Category>> list(CategoryFilter filter)  {
        return list(filter, null);
    }

	/**  List all categories  */
    public static RequestBuilder<ListResponse<Category>> list(CategoryFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<Category>(Category.class, "category", "list", kparams);
    }

	/**  Move categories that belong to the same parent category to a target categroy -
	  enabled only for ks with disable entitlement  */
    public static RequestBuilder<ListResponse<Category>> move(String categoryIds, int targetCategoryParentId)  {
        Params kparams = new Params();
        kparams.add("categoryIds", categoryIds);
        kparams.add("targetCategoryParentId", targetCategoryParentId);

        return new ListResponseRequestBuilder<Category>(Category.class, "category", "move", kparams);
    }

	/**  Unlock categories  */
    public static RequestBuilder<Void> unlockCategories()  {
        Params kparams = new Params();

        return new NullRequestBuilder("category", "unlockCategories", kparams);
    }

	/**  Update Category  */
    public static RequestBuilder<Category> update(int id, Category category)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("category", category);

        return new RequestBuilder<Category>(Category.class, "category", "update", kparams);
    }
}
