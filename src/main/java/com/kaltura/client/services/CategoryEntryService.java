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
import com.kaltura.client.types.BulkServiceData;
import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.BulkUploadCategoryEntryData;
import com.kaltura.client.types.BulkUploadJobData;
import com.kaltura.client.types.CategoryEntry;
import com.kaltura.client.types.CategoryEntryFilter;
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
 * Add &amp; Manage CategoryEntry - assign entry to category
 * 
 * @param entryId 
 * @param categoryId 
 * @param categoryEntry 
 * @param bulkUploadData 
 * @param bulkUploadCategoryEntryData 
 * @param entryId 
 * @param categoryId 
 * @param entryId 
 * @param categoryId 
 * @param shouldUpdate 
 * @param filter 
 * @param pager 
 * @param entryId 
 * @param categoryId 
 * @param entryId 
 * @param categoryId 
 * @param fileData 
 * @param bulkUploadData 
 * @param bulkUploadCategoryEntryData 
 */
public class CategoryEntryService {
	
	public static class ActivateCategoryEntryBuilder extends NullRequestBuilder {
		
		public ActivateCategoryEntryBuilder(String entryId, int categoryId) {
			super("categoryentry", "activate");
			params.add("entryId", entryId);
			params.add("categoryId", categoryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void categoryId(String multirequestToken) {
			params.add("categoryId", multirequestToken);
		}
	}

	/**
	 * activate CategoryEntry when it is pending moderation
	 * 
	 * @param entryId 
	 * @param categoryId 
	 */
    public static ActivateCategoryEntryBuilder activate(String entryId, int categoryId)  {
		return new ActivateCategoryEntryBuilder(entryId, categoryId);
	}
	
	public static class AddCategoryEntryBuilder extends RequestBuilder<CategoryEntry, CategoryEntry.Tokenizer, AddCategoryEntryBuilder> {
		
		public AddCategoryEntryBuilder(CategoryEntry categoryEntry) {
			super(CategoryEntry.class, "categoryentry", "add");
			params.add("categoryEntry", categoryEntry);
		}
	}

	/**
	 * Add new CategoryEntry
	 * 
	 * @param categoryEntry 
	 */
    public static AddCategoryEntryBuilder add(CategoryEntry categoryEntry)  {
		return new AddCategoryEntryBuilder(categoryEntry);
	}
	
	public static class AddFromBulkUploadCategoryEntryBuilder extends RequestBuilder<BulkUpload, BulkUpload.Tokenizer, AddFromBulkUploadCategoryEntryBuilder> {
		
		public AddFromBulkUploadCategoryEntryBuilder(BulkServiceData bulkUploadData, BulkUploadCategoryEntryData bulkUploadCategoryEntryData) {
			super(BulkUpload.class, "categoryentry", "addFromBulkUpload");
			params.add("bulkUploadData", bulkUploadData);
			params.add("bulkUploadCategoryEntryData", bulkUploadCategoryEntryData);
		}
	}

	public static AddFromBulkUploadCategoryEntryBuilder addFromBulkUpload(BulkServiceData bulkUploadData)  {
		return addFromBulkUpload(bulkUploadData, null);
	}

    public static AddFromBulkUploadCategoryEntryBuilder addFromBulkUpload(BulkServiceData bulkUploadData, BulkUploadCategoryEntryData bulkUploadCategoryEntryData)  {
		return new AddFromBulkUploadCategoryEntryBuilder(bulkUploadData, bulkUploadCategoryEntryData);
	}
	
	public static class DeleteCategoryEntryBuilder extends NullRequestBuilder {
		
		public DeleteCategoryEntryBuilder(String entryId, int categoryId) {
			super("categoryentry", "delete");
			params.add("entryId", entryId);
			params.add("categoryId", categoryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void categoryId(String multirequestToken) {
			params.add("categoryId", multirequestToken);
		}
	}

	/**
	 * Delete CategoryEntry
	 * 
	 * @param entryId 
	 * @param categoryId 
	 */
    public static DeleteCategoryEntryBuilder delete(String entryId, int categoryId)  {
		return new DeleteCategoryEntryBuilder(entryId, categoryId);
	}
	
	public static class IndexCategoryEntryBuilder extends RequestBuilder<Integer, String, IndexCategoryEntryBuilder> {
		
		public IndexCategoryEntryBuilder(String entryId, int categoryId, boolean shouldUpdate) {
			super(Integer.class, "categoryentry", "index");
			params.add("entryId", entryId);
			params.add("categoryId", categoryId);
			params.add("shouldUpdate", shouldUpdate);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void categoryId(String multirequestToken) {
			params.add("categoryId", multirequestToken);
		}
		
		public void shouldUpdate(String multirequestToken) {
			params.add("shouldUpdate", multirequestToken);
		}
	}

	public static IndexCategoryEntryBuilder index(String entryId, int categoryId)  {
		return index(entryId, categoryId, true);
	}

	/**
	 * Index CategoryEntry by Id
	 * 
	 * @param entryId 
	 * @param categoryId 
	 * @param shouldUpdate 
	 */
    public static IndexCategoryEntryBuilder index(String entryId, int categoryId, boolean shouldUpdate)  {
		return new IndexCategoryEntryBuilder(entryId, categoryId, shouldUpdate);
	}
	
	public static class ListCategoryEntryBuilder extends ListResponseRequestBuilder<CategoryEntry, CategoryEntry.Tokenizer, ListCategoryEntryBuilder> {
		
		public ListCategoryEntryBuilder(CategoryEntryFilter filter, FilterPager pager) {
			super(CategoryEntry.class, "categoryentry", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListCategoryEntryBuilder list()  {
		return list(null);
	}

	public static ListCategoryEntryBuilder list(CategoryEntryFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List all categoryEntry
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListCategoryEntryBuilder list(CategoryEntryFilter filter, FilterPager pager)  {
		return new ListCategoryEntryBuilder(filter, pager);
	}
	
	public static class RejectCategoryEntryBuilder extends NullRequestBuilder {
		
		public RejectCategoryEntryBuilder(String entryId, int categoryId) {
			super("categoryentry", "reject");
			params.add("entryId", entryId);
			params.add("categoryId", categoryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void categoryId(String multirequestToken) {
			params.add("categoryId", multirequestToken);
		}
	}

	/**
	 * activate CategoryEntry when it is pending moderation
	 * 
	 * @param entryId 
	 * @param categoryId 
	 */
    public static RejectCategoryEntryBuilder reject(String entryId, int categoryId)  {
		return new RejectCategoryEntryBuilder(entryId, categoryId);
	}
	
	public static class SyncPrivacyContextCategoryEntryBuilder extends NullRequestBuilder {
		
		public SyncPrivacyContextCategoryEntryBuilder(String entryId, int categoryId) {
			super("categoryentry", "syncPrivacyContext");
			params.add("entryId", entryId);
			params.add("categoryId", categoryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void categoryId(String multirequestToken) {
			params.add("categoryId", multirequestToken);
		}
	}

	/**
	 * update privacy context from the category
	 * 
	 * @param entryId 
	 * @param categoryId 
	 */
    public static SyncPrivacyContextCategoryEntryBuilder syncPrivacyContext(String entryId, int categoryId)  {
		return new SyncPrivacyContextCategoryEntryBuilder(entryId, categoryId);
	}
	
	public static class UpdateStatusFromBulkCategoryEntryBuilder extends RequestBuilder<BulkUpload, BulkUpload.Tokenizer, UpdateStatusFromBulkCategoryEntryBuilder> {
		
		public UpdateStatusFromBulkCategoryEntryBuilder(FileHolder fileData, BulkUploadJobData bulkUploadData, BulkUploadCategoryEntryData bulkUploadCategoryEntryData) {
			super(BulkUpload.class, "categoryentry", "updateStatusFromBulk");
			files = new Files();
			files.add("fileData", fileData);
			params.add("bulkUploadData", bulkUploadData);
			params.add("bulkUploadCategoryEntryData", bulkUploadCategoryEntryData);
		}
	}

	public static UpdateStatusFromBulkCategoryEntryBuilder updateStatusFromBulk(FileHolder fileData)  {
		return updateStatusFromBulk(fileData, null);
	}

	public static UpdateStatusFromBulkCategoryEntryBuilder updateStatusFromBulk(File fileData)  {
		return updateStatusFromBulk(new FileHolder(fileData), null);
	}

	public static UpdateStatusFromBulkCategoryEntryBuilder updateStatusFromBulk(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return updateStatusFromBulk(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), null);
	}

	public static UpdateStatusFromBulkCategoryEntryBuilder updateStatusFromBulk(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return updateStatusFromBulk(new FileHolder(fileData, fileDataMimeType, fileDataName), null);
	}

	public static UpdateStatusFromBulkCategoryEntryBuilder updateStatusFromBulk(FileHolder fileData, BulkUploadJobData bulkUploadData)  {
		return updateStatusFromBulk(fileData, bulkUploadData, null);
	}

	public static UpdateStatusFromBulkCategoryEntryBuilder updateStatusFromBulk(File fileData, BulkUploadJobData bulkUploadData)  {
		return updateStatusFromBulk(new FileHolder(fileData), bulkUploadData, null);
	}

	public static UpdateStatusFromBulkCategoryEntryBuilder updateStatusFromBulk(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData)  {
		return updateStatusFromBulk(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, null);
	}

	public static UpdateStatusFromBulkCategoryEntryBuilder updateStatusFromBulk(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData)  {
		return updateStatusFromBulk(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, null);
	}

	public static UpdateStatusFromBulkCategoryEntryBuilder updateStatusFromBulk(File fileData, BulkUploadJobData bulkUploadData, BulkUploadCategoryEntryData bulkUploadCategoryEntryData)  {
		return updateStatusFromBulk(new FileHolder(fileData), bulkUploadData, bulkUploadCategoryEntryData);
	}

	public static UpdateStatusFromBulkCategoryEntryBuilder updateStatusFromBulk(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData, BulkUploadCategoryEntryData bulkUploadCategoryEntryData)  {
		return updateStatusFromBulk(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, bulkUploadCategoryEntryData);
	}

	public static UpdateStatusFromBulkCategoryEntryBuilder updateStatusFromBulk(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData, BulkUploadCategoryEntryData bulkUploadCategoryEntryData)  {
		return updateStatusFromBulk(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, bulkUploadCategoryEntryData);
	}

    public static UpdateStatusFromBulkCategoryEntryBuilder updateStatusFromBulk(FileHolder fileData, BulkUploadJobData bulkUploadData, BulkUploadCategoryEntryData bulkUploadCategoryEntryData)  {
		return new UpdateStatusFromBulkCategoryEntryBuilder(fileData, bulkUploadData, bulkUploadCategoryEntryData);
	}
}
