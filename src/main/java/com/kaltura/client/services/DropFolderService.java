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

import com.kaltura.client.types.DropFolder;
import com.kaltura.client.types.DropFolderFilter;
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
 * DropFolder service lets you create and manage drop folders
 * 
 * @param dropFolder 
 * @param dropFolderId 
 * @param dropFolderId 
 * @param errorCode 
 * @param errorDescription 
 * @param dropFolderId 
 * @param tag 
 * @param maxTime 
 * @param filter 
 * @param pager 
 * @param dropFolderId 
 * @param dropFolder Id
 */
public class DropFolderService {
	
	public static class AddDropFolderBuilder extends RequestBuilder<DropFolder, DropFolder.Tokenizer, AddDropFolderBuilder> {
		
		public AddDropFolderBuilder(DropFolder dropFolder) {
			super(DropFolder.class, "dropfolder_dropfolder", "add");
			params.add("dropFolder", dropFolder);
		}
	}

	/**
	 * Allows you to add a new KalturaDropFolder object
	 * 
	 * @param dropFolder 
	 */
    public static AddDropFolderBuilder add(DropFolder dropFolder)  {
		return new AddDropFolderBuilder(dropFolder);
	}
	
	public static class DeleteDropFolderBuilder extends RequestBuilder<DropFolder, DropFolder.Tokenizer, DeleteDropFolderBuilder> {
		
		public DeleteDropFolderBuilder(int dropFolderId) {
			super(DropFolder.class, "dropfolder_dropfolder", "delete");
			params.add("dropFolderId", dropFolderId);
		}
		
		public void dropFolderId(String multirequestToken) {
			params.add("dropFolderId", multirequestToken);
		}
	}

	/**
	 * Mark the KalturaDropFolder object as deleted
	 * 
	 * @param dropFolderId 
	 */
    public static DeleteDropFolderBuilder delete(int dropFolderId)  {
		return new DeleteDropFolderBuilder(dropFolderId);
	}
	
	public static class FreeExclusiveDropFolderDropFolderBuilder extends RequestBuilder<DropFolder, DropFolder.Tokenizer, FreeExclusiveDropFolderDropFolderBuilder> {
		
		public FreeExclusiveDropFolderDropFolderBuilder(int dropFolderId, String errorCode, String errorDescription) {
			super(DropFolder.class, "dropfolder_dropfolder", "freeExclusiveDropFolder");
			params.add("dropFolderId", dropFolderId);
			params.add("errorCode", errorCode);
			params.add("errorDescription", errorDescription);
		}
		
		public void dropFolderId(String multirequestToken) {
			params.add("dropFolderId", multirequestToken);
		}
		
		public void errorCode(String multirequestToken) {
			params.add("errorCode", multirequestToken);
		}
		
		public void errorDescription(String multirequestToken) {
			params.add("errorDescription", multirequestToken);
		}
	}

	public static FreeExclusiveDropFolderDropFolderBuilder freeExclusiveDropFolder(int dropFolderId)  {
		return freeExclusiveDropFolder(dropFolderId, null);
	}

	public static FreeExclusiveDropFolderDropFolderBuilder freeExclusiveDropFolder(int dropFolderId, String errorCode)  {
		return freeExclusiveDropFolder(dropFolderId, errorCode, null);
	}

	/**
	 * freeExclusive KalturaDropFolder object
	 * 
	 * @param dropFolderId 
	 * @param errorCode 
	 * @param errorDescription 
	 */
    public static FreeExclusiveDropFolderDropFolderBuilder freeExclusiveDropFolder(int dropFolderId, String errorCode, String errorDescription)  {
		return new FreeExclusiveDropFolderDropFolderBuilder(dropFolderId, errorCode, errorDescription);
	}
	
	public static class GetDropFolderBuilder extends RequestBuilder<DropFolder, DropFolder.Tokenizer, GetDropFolderBuilder> {
		
		public GetDropFolderBuilder(int dropFolderId) {
			super(DropFolder.class, "dropfolder_dropfolder", "get");
			params.add("dropFolderId", dropFolderId);
		}
		
		public void dropFolderId(String multirequestToken) {
			params.add("dropFolderId", multirequestToken);
		}
	}

	/**
	 * Retrieve a KalturaDropFolder object by ID
	 * 
	 * @param dropFolderId 
	 */
    public static GetDropFolderBuilder get(int dropFolderId)  {
		return new GetDropFolderBuilder(dropFolderId);
	}
	
	public static class GetExclusiveDropFolderDropFolderBuilder extends RequestBuilder<DropFolder, DropFolder.Tokenizer, GetExclusiveDropFolderDropFolderBuilder> {
		
		public GetExclusiveDropFolderDropFolderBuilder(String tag, int maxTime) {
			super(DropFolder.class, "dropfolder_dropfolder", "getExclusiveDropFolder");
			params.add("tag", tag);
			params.add("maxTime", maxTime);
		}
		
		public void tag(String multirequestToken) {
			params.add("tag", multirequestToken);
		}
		
		public void maxTime(String multirequestToken) {
			params.add("maxTime", multirequestToken);
		}
	}

	/**
	 * getExclusive KalturaDropFolder object
	 * 
	 * @param tag 
	 * @param maxTime 
	 */
    public static GetExclusiveDropFolderDropFolderBuilder getExclusiveDropFolder(String tag, int maxTime)  {
		return new GetExclusiveDropFolderDropFolderBuilder(tag, maxTime);
	}
	
	public static class ListDropFolderBuilder extends ListResponseRequestBuilder<DropFolder, DropFolder.Tokenizer, ListDropFolderBuilder> {
		
		public ListDropFolderBuilder(DropFolderFilter filter, FilterPager pager) {
			super(DropFolder.class, "dropfolder_dropfolder", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListDropFolderBuilder list()  {
		return list(null);
	}

	public static ListDropFolderBuilder list(DropFolderFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List KalturaDropFolder objects
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListDropFolderBuilder list(DropFolderFilter filter, FilterPager pager)  {
		return new ListDropFolderBuilder(filter, pager);
	}
	
	public static class UpdateDropFolderBuilder extends RequestBuilder<DropFolder, DropFolder.Tokenizer, UpdateDropFolderBuilder> {
		
		public UpdateDropFolderBuilder(int dropFolderId, DropFolder dropFolder) {
			super(DropFolder.class, "dropfolder_dropfolder", "update");
			params.add("dropFolderId", dropFolderId);
			params.add("dropFolder", dropFolder);
		}
		
		public void dropFolderId(String multirequestToken) {
			params.add("dropFolderId", multirequestToken);
		}
	}

	/**
	 * Update an existing KalturaDropFolder object
	 * 
	 * @param dropFolderId 
	 * @param dropFolder Id
	 */
    public static UpdateDropFolderBuilder update(int dropFolderId, DropFolder dropFolder)  {
		return new UpdateDropFolderBuilder(dropFolderId, dropFolder);
	}
}
