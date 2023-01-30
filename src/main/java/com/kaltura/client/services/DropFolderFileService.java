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

import com.kaltura.client.enums.DropFolderFileStatus;
import com.kaltura.client.types.DropFolderFile;
import com.kaltura.client.types.DropFolderFileFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * DropFolderFile service lets you create and manage drop folder files
 * 
 * @param dropFolderFile 
 * @param dropFolderFileId 
 * @param dropFolderFileId 
 * @param dropFolderFileId 
 * @param filter 
 * @param pager 
 * @param dropFolderFileId 
 * @param dropFolderFile Id
 * @param dropFolderFileId 
 * @param status 
 */
public class DropFolderFileService {
	
	public static class AddDropFolderFileBuilder extends RequestBuilder<DropFolderFile, DropFolderFile.Tokenizer, AddDropFolderFileBuilder> {
		
		public AddDropFolderFileBuilder(DropFolderFile dropFolderFile) {
			super(DropFolderFile.class, "dropfolder_dropfolderfile", "add");
			params.add("dropFolderFile", dropFolderFile);
		}
	}

	/**
	 * Allows you to add a new KalturaDropFolderFile object
	 * 
	 * @param dropFolderFile 
	 */
    public static AddDropFolderFileBuilder add(DropFolderFile dropFolderFile)  {
		return new AddDropFolderFileBuilder(dropFolderFile);
	}
	
	public static class DeleteDropFolderFileBuilder extends RequestBuilder<DropFolderFile, DropFolderFile.Tokenizer, DeleteDropFolderFileBuilder> {
		
		public DeleteDropFolderFileBuilder(int dropFolderFileId) {
			super(DropFolderFile.class, "dropfolder_dropfolderfile", "delete");
			params.add("dropFolderFileId", dropFolderFileId);
		}
		
		public void dropFolderFileId(String multirequestToken) {
			params.add("dropFolderFileId", multirequestToken);
		}
	}

	/**
	 * Mark the KalturaDropFolderFile object as deleted
	 * 
	 * @param dropFolderFileId 
	 */
    public static DeleteDropFolderFileBuilder delete(int dropFolderFileId)  {
		return new DeleteDropFolderFileBuilder(dropFolderFileId);
	}
	
	public static class GetDropFolderFileBuilder extends RequestBuilder<DropFolderFile, DropFolderFile.Tokenizer, GetDropFolderFileBuilder> {
		
		public GetDropFolderFileBuilder(int dropFolderFileId) {
			super(DropFolderFile.class, "dropfolder_dropfolderfile", "get");
			params.add("dropFolderFileId", dropFolderFileId);
		}
		
		public void dropFolderFileId(String multirequestToken) {
			params.add("dropFolderFileId", multirequestToken);
		}
	}

	/**
	 * Retrieve a KalturaDropFolderFile object by ID
	 * 
	 * @param dropFolderFileId 
	 */
    public static GetDropFolderFileBuilder get(int dropFolderFileId)  {
		return new GetDropFolderFileBuilder(dropFolderFileId);
	}
	
	public static class IgnoreDropFolderFileBuilder extends RequestBuilder<DropFolderFile, DropFolderFile.Tokenizer, IgnoreDropFolderFileBuilder> {
		
		public IgnoreDropFolderFileBuilder(int dropFolderFileId) {
			super(DropFolderFile.class, "dropfolder_dropfolderfile", "ignore");
			params.add("dropFolderFileId", dropFolderFileId);
		}
		
		public void dropFolderFileId(String multirequestToken) {
			params.add("dropFolderFileId", multirequestToken);
		}
	}

	/**
	 * Set the KalturaDropFolderFile status to ignore
	  (KalturaDropFolderFileStatus::IGNORE)
	 * 
	 * @param dropFolderFileId 
	 */
    public static IgnoreDropFolderFileBuilder ignore(int dropFolderFileId)  {
		return new IgnoreDropFolderFileBuilder(dropFolderFileId);
	}
	
	public static class ListDropFolderFileBuilder extends ListResponseRequestBuilder<DropFolderFile, DropFolderFile.Tokenizer, ListDropFolderFileBuilder> {
		
		public ListDropFolderFileBuilder(DropFolderFileFilter filter, FilterPager pager) {
			super(DropFolderFile.class, "dropfolder_dropfolderfile", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListDropFolderFileBuilder list()  {
		return list(null);
	}

	public static ListDropFolderFileBuilder list(DropFolderFileFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List KalturaDropFolderFile objects
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListDropFolderFileBuilder list(DropFolderFileFilter filter, FilterPager pager)  {
		return new ListDropFolderFileBuilder(filter, pager);
	}
	
	public static class UpdateDropFolderFileBuilder extends RequestBuilder<DropFolderFile, DropFolderFile.Tokenizer, UpdateDropFolderFileBuilder> {
		
		public UpdateDropFolderFileBuilder(int dropFolderFileId, DropFolderFile dropFolderFile) {
			super(DropFolderFile.class, "dropfolder_dropfolderfile", "update");
			params.add("dropFolderFileId", dropFolderFileId);
			params.add("dropFolderFile", dropFolderFile);
		}
		
		public void dropFolderFileId(String multirequestToken) {
			params.add("dropFolderFileId", multirequestToken);
		}
	}

	/**
	 * Update an existing KalturaDropFolderFile object
	 * 
	 * @param dropFolderFileId 
	 * @param dropFolderFile Id
	 */
    public static UpdateDropFolderFileBuilder update(int dropFolderFileId, DropFolderFile dropFolderFile)  {
		return new UpdateDropFolderFileBuilder(dropFolderFileId, dropFolderFile);
	}
	
	public static class UpdateStatusDropFolderFileBuilder extends RequestBuilder<DropFolderFile, DropFolderFile.Tokenizer, UpdateStatusDropFolderFileBuilder> {
		
		public UpdateStatusDropFolderFileBuilder(int dropFolderFileId, DropFolderFileStatus status) {
			super(DropFolderFile.class, "dropfolder_dropfolderfile", "updateStatus");
			params.add("dropFolderFileId", dropFolderFileId);
			params.add("status", status);
		}
		
		public void dropFolderFileId(String multirequestToken) {
			params.add("dropFolderFileId", multirequestToken);
		}
		
		public void status(String multirequestToken) {
			params.add("status", multirequestToken);
		}
	}

	/**
	 * Update status of KalturaDropFolderFile
	 * 
	 * @param dropFolderFileId 
	 * @param status 
	 */
    public static UpdateStatusDropFolderFileBuilder updateStatus(int dropFolderFileId, DropFolderFileStatus status)  {
		return new UpdateStatusDropFolderFileBuilder(dropFolderFileId, status);
	}
}
