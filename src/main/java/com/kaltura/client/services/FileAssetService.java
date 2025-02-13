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
// Copyright (C) 2006-2023  Kaltura Inc.
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

import com.kaltura.client.types.ContentResource;
import com.kaltura.client.types.FileAsset;
import com.kaltura.client.types.FileAssetFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Manage file assets
 * 
 * @param fileAsset 
 * @param id 
 * @param id 
 * @param filter 
 * @param pager 
 * @param id 
 * @param id 
 * @param contentResource 
 * @param id 
 * @param fileAsset 
 */
public class FileAssetService {
	
	public static class AddFileAssetBuilder extends RequestBuilder<FileAsset, FileAsset.Tokenizer, AddFileAssetBuilder> {
		
		public AddFileAssetBuilder(FileAsset fileAsset) {
			super(FileAsset.class, "fileasset", "add");
			params.add("fileAsset", fileAsset);
		}
	}

	/**
	 * Add new file asset
	 * 
	 * @param fileAsset 
	 */
    public static AddFileAssetBuilder add(FileAsset fileAsset)  {
		return new AddFileAssetBuilder(fileAsset);
	}
	
	public static class DeleteFileAssetBuilder extends NullRequestBuilder {
		
		public DeleteFileAssetBuilder(long id) {
			super("fileasset", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete file asset by id
	 * 
	 * @param id 
	 */
    public static DeleteFileAssetBuilder delete(long id)  {
		return new DeleteFileAssetBuilder(id);
	}
	
	public static class GetFileAssetBuilder extends RequestBuilder<FileAsset, FileAsset.Tokenizer, GetFileAssetBuilder> {
		
		public GetFileAssetBuilder(long id) {
			super(FileAsset.class, "fileasset", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get file asset by id
	 * 
	 * @param id 
	 */
    public static GetFileAssetBuilder get(long id)  {
		return new GetFileAssetBuilder(id);
	}
	
	public static class ListFileAssetBuilder extends ListResponseRequestBuilder<FileAsset, FileAsset.Tokenizer, ListFileAssetBuilder> {
		
		public ListFileAssetBuilder(FileAssetFilter filter, FilterPager pager) {
			super(FileAsset.class, "fileasset", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListFileAssetBuilder list(FileAssetFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List file assets by filter and pager
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListFileAssetBuilder list(FileAssetFilter filter, FilterPager pager)  {
		return new ListFileAssetBuilder(filter, pager);
	}
	
	public static class ServeFileAssetBuilder extends ServeRequestBuilder {
		
		public ServeFileAssetBuilder(long id) {
			super("fileasset", "serve");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Serve file asset by id
	 * 
	 * @param id 
	 */
    public static ServeFileAssetBuilder serve(long id)  {
		return new ServeFileAssetBuilder(id);
	}
	
	public static class SetContentFileAssetBuilder extends RequestBuilder<FileAsset, FileAsset.Tokenizer, SetContentFileAssetBuilder> {
		
		public SetContentFileAssetBuilder(long id, ContentResource contentResource) {
			super(FileAsset.class, "fileasset", "setContent");
			params.add("id", id);
			params.add("contentResource", contentResource);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Set content of file asset
	 * 
	 * @param id 
	 * @param contentResource 
	 */
    public static SetContentFileAssetBuilder setContent(long id, ContentResource contentResource)  {
		return new SetContentFileAssetBuilder(id, contentResource);
	}
	
	public static class UpdateFileAssetBuilder extends RequestBuilder<FileAsset, FileAsset.Tokenizer, UpdateFileAssetBuilder> {
		
		public UpdateFileAssetBuilder(long id, FileAsset fileAsset) {
			super(FileAsset.class, "fileasset", "update");
			params.add("id", id);
			params.add("fileAsset", fileAsset);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update file asset by id
	 * 
	 * @param id 
	 * @param fileAsset 
	 */
    public static UpdateFileAssetBuilder update(long id, FileAsset fileAsset)  {
		return new UpdateFileAssetBuilder(id, fileAsset);
	}
}
