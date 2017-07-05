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
import com.kaltura.client.types.BulkUploadCategoryUserData;
import com.kaltura.client.types.BulkUploadJobData;
import com.kaltura.client.types.CategoryUser;
import com.kaltura.client.types.CategoryUserFilter;
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

/**  Add &amp; Manage CategoryUser - membership of a user in a category  */
public class CategoryUserService {

	/**  activate CategoryUser  */
    public static RequestBuilder<CategoryUser> activate(int categoryId, String userId)  {
        Params kparams = new Params();
        kparams.add("categoryId", categoryId);
        kparams.add("userId", userId);

        return new RequestBuilder<CategoryUser>(CategoryUser.class, "categoryuser", "activate", kparams);
    }

	/**  Add new CategoryUser  */
    public static RequestBuilder<CategoryUser> add(CategoryUser categoryUser)  {
        Params kparams = new Params();
        kparams.add("categoryUser", categoryUser);

        return new RequestBuilder<CategoryUser>(CategoryUser.class, "categoryuser", "add", kparams);
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

    public static RequestBuilder<BulkUpload> addFromBulkUpload(File fileData, BulkUploadJobData bulkUploadData, BulkUploadCategoryUserData bulkUploadCategoryUserData)  {
        return addFromBulkUpload(new FileHolder(fileData), bulkUploadData, bulkUploadCategoryUserData);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData, BulkUploadCategoryUserData bulkUploadCategoryUserData)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, bulkUploadCategoryUserData);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData, BulkUploadCategoryUserData bulkUploadCategoryUserData)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, bulkUploadCategoryUserData);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileHolder fileData, BulkUploadJobData bulkUploadData, BulkUploadCategoryUserData bulkUploadCategoryUserData)  {
        Params kparams = new Params();
        Files kfiles = new Files();
        kfiles.add("fileData", fileData);
        kparams.add("bulkUploadData", bulkUploadData);
        kparams.add("bulkUploadCategoryUserData", bulkUploadCategoryUserData);

        return new RequestBuilder<BulkUpload>(BulkUpload.class, "categoryuser", "addFromBulkUpload", kparams, kfiles);
    }

	/**  Copy all memeber from parent category  */
    public static RequestBuilder<Void> copyFromCategory(int categoryId)  {
        Params kparams = new Params();
        kparams.add("categoryId", categoryId);

        return new NullRequestBuilder("categoryuser", "copyFromCategory", kparams);
    }

	/**  reject CategoryUser  */
    public static RequestBuilder<CategoryUser> deactivate(int categoryId, String userId)  {
        Params kparams = new Params();
        kparams.add("categoryId", categoryId);
        kparams.add("userId", userId);

        return new RequestBuilder<CategoryUser>(CategoryUser.class, "categoryuser", "deactivate", kparams);
    }

	/**  Delete a CategoryUser  */
    public static RequestBuilder<Void> delete(int categoryId, String userId)  {
        Params kparams = new Params();
        kparams.add("categoryId", categoryId);
        kparams.add("userId", userId);

        return new NullRequestBuilder("categoryuser", "delete", kparams);
    }

	/**  Get CategoryUser by id  */
    public static RequestBuilder<CategoryUser> get(int categoryId, String userId)  {
        Params kparams = new Params();
        kparams.add("categoryId", categoryId);
        kparams.add("userId", userId);

        return new RequestBuilder<CategoryUser>(CategoryUser.class, "categoryuser", "get", kparams);
    }

    public static RequestBuilder<Integer> index(String userId, int categoryId)  {
        return index(userId, categoryId, true);
    }

	/**  Index CategoryUser by userid and category id  */
    public static RequestBuilder<Integer> index(String userId, int categoryId, boolean shouldUpdate)  {
        Params kparams = new Params();
        kparams.add("userId", userId);
        kparams.add("categoryId", categoryId);
        kparams.add("shouldUpdate", shouldUpdate);

        return new RequestBuilder<Integer>(Integer.class, "categoryuser", "index", kparams);
    }

    public static RequestBuilder<ListResponse<CategoryUser>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<CategoryUser>> list(CategoryUserFilter filter)  {
        return list(filter, null);
    }

	/**  List all categories  */
    public static RequestBuilder<ListResponse<CategoryUser>> list(CategoryUserFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<CategoryUser>(CategoryUser.class, "categoryuser", "list", kparams);
    }

    public static RequestBuilder<CategoryUser> update(int categoryId, String userId, CategoryUser categoryUser)  {
        return update(categoryId, userId, categoryUser, false);
    }

	/**  Update CategoryUser by id  */
    public static RequestBuilder<CategoryUser> update(int categoryId, String userId, CategoryUser categoryUser, boolean override)  {
        Params kparams = new Params();
        kparams.add("categoryId", categoryId);
        kparams.add("userId", userId);
        kparams.add("categoryUser", categoryUser);
        kparams.add("override", override);

        return new RequestBuilder<CategoryUser>(CategoryUser.class, "categoryuser", "update", kparams);
    }
}
