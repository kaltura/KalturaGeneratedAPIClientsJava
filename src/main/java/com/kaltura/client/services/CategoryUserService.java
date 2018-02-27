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

import com.kaltura.client.FileHolder;
import com.kaltura.client.Files;
import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.BulkUploadCategoryUserData;
import com.kaltura.client.types.BulkUploadJobData;
import com.kaltura.client.types.CategoryUser;
import com.kaltura.client.types.CategoryUserFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
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
 * Add &amp; Manage CategoryUser - membership of a user in a category
 * 
 * @param categoryId 
 * @param userId 
 * @param categoryUser 
 * @param fileData 
 * @param bulkUploadData 
 * @param bulkUploadCategoryUserData 
 * @param categoryId 
 * @param categoryId 
 * @param userId 
 * @param categoryId 
 * @param userId 
 * @param categoryId 
 * @param userId 
 * @param userId 
 * @param categoryId 
 * @param shouldUpdate 
 * @param filter 
 * @param pager 
 * @param categoryId 
 * @param userId 
 * @param categoryUser 
 * @param override - to override manual changes
 */
public class CategoryUserService {
	
	public static class ActivateCategoryUserBuilder extends RequestBuilder<CategoryUser, CategoryUser.Tokenizer, ActivateCategoryUserBuilder> {
		
		public ActivateCategoryUserBuilder(int categoryId, String userId) {
			super(CategoryUser.class, "categoryuser", "activate");
			params.add("categoryId", categoryId);
			params.add("userId", userId);
		}
		
		public void categoryId(String multirequestToken) {
			params.add("categoryId", multirequestToken);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
	}

	/**
	 * activate CategoryUser
	 * 
	 * @param categoryId 
	 * @param userId 
	 */
    public static ActivateCategoryUserBuilder activate(int categoryId, String userId)  {
		return new ActivateCategoryUserBuilder(categoryId, userId);
	}
	
	public static class AddCategoryUserBuilder extends RequestBuilder<CategoryUser, CategoryUser.Tokenizer, AddCategoryUserBuilder> {
		
		public AddCategoryUserBuilder(CategoryUser categoryUser) {
			super(CategoryUser.class, "categoryuser", "add");
			params.add("categoryUser", categoryUser);
		}
	}

	/**
	 * Add new CategoryUser
	 * 
	 * @param categoryUser 
	 */
    public static AddCategoryUserBuilder add(CategoryUser categoryUser)  {
		return new AddCategoryUserBuilder(categoryUser);
	}
	
	public static class AddFromBulkUploadCategoryUserBuilder extends RequestBuilder<BulkUpload, BulkUpload.Tokenizer, AddFromBulkUploadCategoryUserBuilder> {
		
		public AddFromBulkUploadCategoryUserBuilder(FileHolder fileData, BulkUploadJobData bulkUploadData, BulkUploadCategoryUserData bulkUploadCategoryUserData) {
			super(BulkUpload.class, "categoryuser", "addFromBulkUpload");
			files = new Files();
			files.add("fileData", fileData);
			params.add("bulkUploadData", bulkUploadData);
			params.add("bulkUploadCategoryUserData", bulkUploadCategoryUserData);
		}
	}

	public static AddFromBulkUploadCategoryUserBuilder addFromBulkUpload(FileHolder fileData)  {
		return addFromBulkUpload(fileData, null);
	}

	public static AddFromBulkUploadCategoryUserBuilder addFromBulkUpload(File fileData)  {
		return addFromBulkUpload(new FileHolder(fileData), null);
	}

	public static AddFromBulkUploadCategoryUserBuilder addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), null);
	}

	public static AddFromBulkUploadCategoryUserBuilder addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), null);
	}

	public static AddFromBulkUploadCategoryUserBuilder addFromBulkUpload(FileHolder fileData, BulkUploadJobData bulkUploadData)  {
		return addFromBulkUpload(fileData, bulkUploadData, null);
	}

	public static AddFromBulkUploadCategoryUserBuilder addFromBulkUpload(File fileData, BulkUploadJobData bulkUploadData)  {
		return addFromBulkUpload(new FileHolder(fileData), bulkUploadData, null);
	}

	public static AddFromBulkUploadCategoryUserBuilder addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, null);
	}

	public static AddFromBulkUploadCategoryUserBuilder addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, null);
	}

	public static AddFromBulkUploadCategoryUserBuilder addFromBulkUpload(File fileData, BulkUploadJobData bulkUploadData, BulkUploadCategoryUserData bulkUploadCategoryUserData)  {
		return addFromBulkUpload(new FileHolder(fileData), bulkUploadData, bulkUploadCategoryUserData);
	}

	public static AddFromBulkUploadCategoryUserBuilder addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData, BulkUploadCategoryUserData bulkUploadCategoryUserData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, bulkUploadCategoryUserData);
	}

	public static AddFromBulkUploadCategoryUserBuilder addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData, BulkUploadCategoryUserData bulkUploadCategoryUserData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, bulkUploadCategoryUserData);
	}

    public static AddFromBulkUploadCategoryUserBuilder addFromBulkUpload(FileHolder fileData, BulkUploadJobData bulkUploadData, BulkUploadCategoryUserData bulkUploadCategoryUserData)  {
		return new AddFromBulkUploadCategoryUserBuilder(fileData, bulkUploadData, bulkUploadCategoryUserData);
	}
	
	public static class CopyFromCategoryCategoryUserBuilder extends NullRequestBuilder {
		
		public CopyFromCategoryCategoryUserBuilder(int categoryId) {
			super("categoryuser", "copyFromCategory");
			params.add("categoryId", categoryId);
		}
		
		public void categoryId(String multirequestToken) {
			params.add("categoryId", multirequestToken);
		}
	}

	/**
	 * Copy all memeber from parent category
	 * 
	 * @param categoryId 
	 */
    public static CopyFromCategoryCategoryUserBuilder copyFromCategory(int categoryId)  {
		return new CopyFromCategoryCategoryUserBuilder(categoryId);
	}
	
	public static class DeactivateCategoryUserBuilder extends RequestBuilder<CategoryUser, CategoryUser.Tokenizer, DeactivateCategoryUserBuilder> {
		
		public DeactivateCategoryUserBuilder(int categoryId, String userId) {
			super(CategoryUser.class, "categoryuser", "deactivate");
			params.add("categoryId", categoryId);
			params.add("userId", userId);
		}
		
		public void categoryId(String multirequestToken) {
			params.add("categoryId", multirequestToken);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
	}

	/**
	 * reject CategoryUser
	 * 
	 * @param categoryId 
	 * @param userId 
	 */
    public static DeactivateCategoryUserBuilder deactivate(int categoryId, String userId)  {
		return new DeactivateCategoryUserBuilder(categoryId, userId);
	}
	
	public static class DeleteCategoryUserBuilder extends NullRequestBuilder {
		
		public DeleteCategoryUserBuilder(int categoryId, String userId) {
			super("categoryuser", "delete");
			params.add("categoryId", categoryId);
			params.add("userId", userId);
		}
		
		public void categoryId(String multirequestToken) {
			params.add("categoryId", multirequestToken);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
	}

	/**
	 * Delete a CategoryUser
	 * 
	 * @param categoryId 
	 * @param userId 
	 */
    public static DeleteCategoryUserBuilder delete(int categoryId, String userId)  {
		return new DeleteCategoryUserBuilder(categoryId, userId);
	}
	
	public static class GetCategoryUserBuilder extends RequestBuilder<CategoryUser, CategoryUser.Tokenizer, GetCategoryUserBuilder> {
		
		public GetCategoryUserBuilder(int categoryId, String userId) {
			super(CategoryUser.class, "categoryuser", "get");
			params.add("categoryId", categoryId);
			params.add("userId", userId);
		}
		
		public void categoryId(String multirequestToken) {
			params.add("categoryId", multirequestToken);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
	}

	/**
	 * Get CategoryUser by id
	 * 
	 * @param categoryId 
	 * @param userId 
	 */
    public static GetCategoryUserBuilder get(int categoryId, String userId)  {
		return new GetCategoryUserBuilder(categoryId, userId);
	}
	
	public static class IndexCategoryUserBuilder extends RequestBuilder<Integer, String, IndexCategoryUserBuilder> {
		
		public IndexCategoryUserBuilder(String userId, int categoryId, boolean shouldUpdate) {
			super(Integer.class, "categoryuser", "index");
			params.add("userId", userId);
			params.add("categoryId", categoryId);
			params.add("shouldUpdate", shouldUpdate);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
		
		public void categoryId(String multirequestToken) {
			params.add("categoryId", multirequestToken);
		}
		
		public void shouldUpdate(String multirequestToken) {
			params.add("shouldUpdate", multirequestToken);
		}
	}

	public static IndexCategoryUserBuilder index(String userId, int categoryId)  {
		return index(userId, categoryId, true);
	}

	/**
	 * Index CategoryUser by userid and category id
	 * 
	 * @param userId 
	 * @param categoryId 
	 * @param shouldUpdate 
	 */
    public static IndexCategoryUserBuilder index(String userId, int categoryId, boolean shouldUpdate)  {
		return new IndexCategoryUserBuilder(userId, categoryId, shouldUpdate);
	}
	
	public static class ListCategoryUserBuilder extends ListResponseRequestBuilder<CategoryUser, CategoryUser.Tokenizer, ListCategoryUserBuilder> {
		
		public ListCategoryUserBuilder(CategoryUserFilter filter, FilterPager pager) {
			super(CategoryUser.class, "categoryuser", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListCategoryUserBuilder list()  {
		return list(null);
	}

	public static ListCategoryUserBuilder list(CategoryUserFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List all categories
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListCategoryUserBuilder list(CategoryUserFilter filter, FilterPager pager)  {
		return new ListCategoryUserBuilder(filter, pager);
	}
	
	public static class UpdateCategoryUserBuilder extends RequestBuilder<CategoryUser, CategoryUser.Tokenizer, UpdateCategoryUserBuilder> {
		
		public UpdateCategoryUserBuilder(int categoryId, String userId, CategoryUser categoryUser, boolean override) {
			super(CategoryUser.class, "categoryuser", "update");
			params.add("categoryId", categoryId);
			params.add("userId", userId);
			params.add("categoryUser", categoryUser);
			params.add("override", override);
		}
		
		public void categoryId(String multirequestToken) {
			params.add("categoryId", multirequestToken);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
		
		public void override(String multirequestToken) {
			params.add("override", multirequestToken);
		}
	}

	public static UpdateCategoryUserBuilder update(int categoryId, String userId, CategoryUser categoryUser)  {
		return update(categoryId, userId, categoryUser, false);
	}

	/**
	 * Update CategoryUser by id
	 * 
	 * @param categoryId 
	 * @param userId 
	 * @param categoryUser 
	 * @param override - to override manual changes
	 */
    public static UpdateCategoryUserBuilder update(int categoryId, String userId, CategoryUser categoryUser, boolean override)  {
		return new UpdateCategoryUserBuilder(categoryId, userId, categoryUser, override);
	}
}
