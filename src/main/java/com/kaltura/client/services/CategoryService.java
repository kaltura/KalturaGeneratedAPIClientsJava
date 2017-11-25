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
import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.BulkUploadCategoryData;
import com.kaltura.client.types.BulkUploadJobData;
import com.kaltura.client.types.Category;
import com.kaltura.client.types.CategoryFilter;
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
 * Add &amp; Manage Categories
 * 
 * @param category 
 * @param fileData 
 * @param bulkUploadData 
 * @param bulkUploadCategoryData 
 * @param id 
 * @param moveEntriesToParentCategory 
 * @param id 
 * @param id 
 * @param shouldUpdate 
 * @param filter 
 * @param pager 
 * @param categoryIds 
 * @param targetCategoryParentId 
 * @param id 
 * @param category 
 */
public class CategoryService {
	
	public static class AddCategoryBuilder extends RequestBuilder<Category, Category.Tokenizer, AddCategoryBuilder> {
		
		public AddCategoryBuilder(Category category) {
			super(Category.class, "category", "add");
			params.add("category", category);
		}
	}

	/**
	 * Add new Category
	 * 
	 * @param category 
	 */
    public static AddCategoryBuilder add(Category category)  {
		return new AddCategoryBuilder(category);
	}
	
	public static class AddFromBulkUploadCategoryBuilder extends RequestBuilder<BulkUpload, BulkUpload.Tokenizer, AddFromBulkUploadCategoryBuilder> {
		
		public AddFromBulkUploadCategoryBuilder(FileHolder fileData, BulkUploadJobData bulkUploadData, BulkUploadCategoryData bulkUploadCategoryData) {
			super(BulkUpload.class, "category", "addFromBulkUpload");
			files = new Files();
			files.add("fileData", fileData);
			params.add("bulkUploadData", bulkUploadData);
			params.add("bulkUploadCategoryData", bulkUploadCategoryData);
		}
	}

	public static AddFromBulkUploadCategoryBuilder addFromBulkUpload(FileHolder fileData)  {
		return addFromBulkUpload(fileData, null);
	}

	public static AddFromBulkUploadCategoryBuilder addFromBulkUpload(File fileData)  {
		return addFromBulkUpload(new FileHolder(fileData), null);
	}

	public static AddFromBulkUploadCategoryBuilder addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), null);
	}

	public static AddFromBulkUploadCategoryBuilder addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), null);
	}

	public static AddFromBulkUploadCategoryBuilder addFromBulkUpload(FileHolder fileData, BulkUploadJobData bulkUploadData)  {
		return addFromBulkUpload(fileData, bulkUploadData, null);
	}

	public static AddFromBulkUploadCategoryBuilder addFromBulkUpload(File fileData, BulkUploadJobData bulkUploadData)  {
		return addFromBulkUpload(new FileHolder(fileData), bulkUploadData, null);
	}

	public static AddFromBulkUploadCategoryBuilder addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, null);
	}

	public static AddFromBulkUploadCategoryBuilder addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, null);
	}

	public static AddFromBulkUploadCategoryBuilder addFromBulkUpload(File fileData, BulkUploadJobData bulkUploadData, BulkUploadCategoryData bulkUploadCategoryData)  {
		return addFromBulkUpload(new FileHolder(fileData), bulkUploadData, bulkUploadCategoryData);
	}

	public static AddFromBulkUploadCategoryBuilder addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData, BulkUploadCategoryData bulkUploadCategoryData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, bulkUploadCategoryData);
	}

	public static AddFromBulkUploadCategoryBuilder addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData, BulkUploadCategoryData bulkUploadCategoryData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, bulkUploadCategoryData);
	}

    public static AddFromBulkUploadCategoryBuilder addFromBulkUpload(FileHolder fileData, BulkUploadJobData bulkUploadData, BulkUploadCategoryData bulkUploadCategoryData)  {
		return new AddFromBulkUploadCategoryBuilder(fileData, bulkUploadData, bulkUploadCategoryData);
	}
	
	public static class DeleteCategoryBuilder extends NullRequestBuilder {
		
		public DeleteCategoryBuilder(int id, Boolean moveEntriesToParentCategory) {
			super("category", "delete");
			params.add("id", id);
			params.add("moveEntriesToParentCategory", moveEntriesToParentCategory);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void moveEntriesToParentCategory(String multirequestToken) {
			params.add("moveEntriesToParentCategory", multirequestToken);
		}
	}

	public static DeleteCategoryBuilder delete(int id)  {
		return delete(id, true);
	}

	/**
	 * Delete a Category
	 * 
	 * @param id 
	 * @param moveEntriesToParentCategory 
	 */
    public static DeleteCategoryBuilder delete(int id, Boolean moveEntriesToParentCategory)  {
		return new DeleteCategoryBuilder(id, moveEntriesToParentCategory);
	}
	
	public static class GetCategoryBuilder extends RequestBuilder<Category, Category.Tokenizer, GetCategoryBuilder> {
		
		public GetCategoryBuilder(int id) {
			super(Category.class, "category", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get Category by id
	 * 
	 * @param id 
	 */
    public static GetCategoryBuilder get(int id)  {
		return new GetCategoryBuilder(id);
	}
	
	public static class IndexCategoryBuilder extends RequestBuilder<Integer, String, IndexCategoryBuilder> {
		
		public IndexCategoryBuilder(int id, boolean shouldUpdate) {
			super(Integer.class, "category", "index");
			params.add("id", id);
			params.add("shouldUpdate", shouldUpdate);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void shouldUpdate(String multirequestToken) {
			params.add("shouldUpdate", multirequestToken);
		}
	}

	public static IndexCategoryBuilder index(int id)  {
		return index(id, true);
	}

	/**
	 * Index Category by id
	 * 
	 * @param id 
	 * @param shouldUpdate 
	 */
    public static IndexCategoryBuilder index(int id, boolean shouldUpdate)  {
		return new IndexCategoryBuilder(id, shouldUpdate);
	}
	
	public static class ListCategoryBuilder extends ListResponseRequestBuilder<Category, Category.Tokenizer, ListCategoryBuilder> {
		
		public ListCategoryBuilder(CategoryFilter filter, FilterPager pager) {
			super(Category.class, "category", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListCategoryBuilder list()  {
		return list(null);
	}

	public static ListCategoryBuilder list(CategoryFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List all categories
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListCategoryBuilder list(CategoryFilter filter, FilterPager pager)  {
		return new ListCategoryBuilder(filter, pager);
	}
	
	public static class MoveCategoryBuilder extends RequestBuilder<Boolean, String, MoveCategoryBuilder> {
		
		public MoveCategoryBuilder(String categoryIds, int targetCategoryParentId) {
			super(Boolean.class, "category", "move");
			params.add("categoryIds", categoryIds);
			params.add("targetCategoryParentId", targetCategoryParentId);
		}
		
		public void categoryIds(String multirequestToken) {
			params.add("categoryIds", multirequestToken);
		}
		
		public void targetCategoryParentId(String multirequestToken) {
			params.add("targetCategoryParentId", multirequestToken);
		}
	}

	/**
	 * Move categories that belong to the same parent category to a target categroy -
	  enabled only for ks with disable entitlement
	 * 
	 * @param categoryIds 
	 * @param targetCategoryParentId 
	 */
    public static MoveCategoryBuilder move(String categoryIds, int targetCategoryParentId)  {
		return new MoveCategoryBuilder(categoryIds, targetCategoryParentId);
	}
	
	public static class UnlockCategoriesCategoryBuilder extends NullRequestBuilder {
		
		public UnlockCategoriesCategoryBuilder() {
			super("category", "unlockCategories");
		}
	}

	/**
	 * Unlock categories
	 */
    public static UnlockCategoriesCategoryBuilder unlockCategories()  {
		return new UnlockCategoriesCategoryBuilder();
	}
	
	public static class UpdateCategoryBuilder extends RequestBuilder<Category, Category.Tokenizer, UpdateCategoryBuilder> {
		
		public UpdateCategoryBuilder(int id, Category category) {
			super(Category.class, "category", "update");
			params.add("id", id);
			params.add("category", category);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update Category
	 * 
	 * @param id 
	 * @param category 
	 */
    public static UpdateCategoryBuilder update(int id, Category category)  {
		return new UpdateCategoryBuilder(id, category);
	}
}
