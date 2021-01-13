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

import com.kaltura.client.types.AssetFilter;
import com.kaltura.client.types.AttachmentAsset;
import com.kaltura.client.types.AttachmentServeOptions;
import com.kaltura.client.types.ContentResource;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.RemotePath;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Retrieve information and invoke actions on attachment Asset
 * 
 * @param entryId 
 * @param attachmentAsset 
 * @param attachmentAssetId 
 * @param attachmentAssetId 
 * @param id 
 * @param id 
 * @param storageId 
 * @param filter 
 * @param pager 
 * @param attachmentAssetId 
 * @param serveOptions 
 * @param id 
 * @param contentResource 
 * @param id 
 * @param attachmentAsset 
 */
public class AttachmentAssetService {
	
	public static class AddAttachmentAssetBuilder extends RequestBuilder<AttachmentAsset, AttachmentAsset.Tokenizer, AddAttachmentAssetBuilder> {
		
		public AddAttachmentAssetBuilder(String entryId, AttachmentAsset attachmentAsset) {
			super(AttachmentAsset.class, "attachment_attachmentasset", "add");
			params.add("entryId", entryId);
			params.add("attachmentAsset", attachmentAsset);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Add attachment asset
	 * 
	 * @param entryId 
	 * @param attachmentAsset 
	 */
    public static AddAttachmentAssetBuilder add(String entryId, AttachmentAsset attachmentAsset)  {
		return new AddAttachmentAssetBuilder(entryId, attachmentAsset);
	}
	
	public static class DeleteAttachmentAssetBuilder extends NullRequestBuilder {
		
		public DeleteAttachmentAssetBuilder(String attachmentAssetId) {
			super("attachment_attachmentasset", "delete");
			params.add("attachmentAssetId", attachmentAssetId);
		}
		
		public void attachmentAssetId(String multirequestToken) {
			params.add("attachmentAssetId", multirequestToken);
		}
	}

    public static DeleteAttachmentAssetBuilder delete(String attachmentAssetId)  {
		return new DeleteAttachmentAssetBuilder(attachmentAssetId);
	}
	
	public static class GetAttachmentAssetBuilder extends RequestBuilder<AttachmentAsset, AttachmentAsset.Tokenizer, GetAttachmentAssetBuilder> {
		
		public GetAttachmentAssetBuilder(String attachmentAssetId) {
			super(AttachmentAsset.class, "attachment_attachmentasset", "get");
			params.add("attachmentAssetId", attachmentAssetId);
		}
		
		public void attachmentAssetId(String multirequestToken) {
			params.add("attachmentAssetId", multirequestToken);
		}
	}

    public static GetAttachmentAssetBuilder get(String attachmentAssetId)  {
		return new GetAttachmentAssetBuilder(attachmentAssetId);
	}
	
	public static class GetRemotePathsAttachmentAssetBuilder extends ListResponseRequestBuilder<RemotePath, RemotePath.Tokenizer, GetRemotePathsAttachmentAssetBuilder> {
		
		public GetRemotePathsAttachmentAssetBuilder(String id) {
			super(RemotePath.class, "attachment_attachmentasset", "getRemotePaths");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get remote storage existing paths for the asset
	 * 
	 * @param id 
	 */
    public static GetRemotePathsAttachmentAssetBuilder getRemotePaths(String id)  {
		return new GetRemotePathsAttachmentAssetBuilder(id);
	}
	
	public static class GetUrlAttachmentAssetBuilder extends RequestBuilder<String, String, GetUrlAttachmentAssetBuilder> {
		
		public GetUrlAttachmentAssetBuilder(String id, int storageId) {
			super(String.class, "attachment_attachmentasset", "getUrl");
			params.add("id", id);
			params.add("storageId", storageId);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void storageId(String multirequestToken) {
			params.add("storageId", multirequestToken);
		}
	}

	public static GetUrlAttachmentAssetBuilder getUrl(String id)  {
		return getUrl(id, Integer.MIN_VALUE);
	}

	/**
	 * Get download URL for the asset
	 * 
	 * @param id 
	 * @param storageId 
	 */
    public static GetUrlAttachmentAssetBuilder getUrl(String id, int storageId)  {
		return new GetUrlAttachmentAssetBuilder(id, storageId);
	}
	
	public static class ListAttachmentAssetBuilder extends ListResponseRequestBuilder<AttachmentAsset, AttachmentAsset.Tokenizer, ListAttachmentAssetBuilder> {
		
		public ListAttachmentAssetBuilder(AssetFilter filter, FilterPager pager) {
			super(AttachmentAsset.class, "attachment_attachmentasset", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListAttachmentAssetBuilder list()  {
		return list(null);
	}

	public static ListAttachmentAssetBuilder list(AssetFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List attachment Assets by filter and pager
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListAttachmentAssetBuilder list(AssetFilter filter, FilterPager pager)  {
		return new ListAttachmentAssetBuilder(filter, pager);
	}
	
	public static class ServeAttachmentAssetBuilder extends ServeRequestBuilder {
		
		public ServeAttachmentAssetBuilder(String attachmentAssetId, AttachmentServeOptions serveOptions) {
			super("attachment_attachmentasset", "serve");
			params.add("attachmentAssetId", attachmentAssetId);
			params.add("serveOptions", serveOptions);
		}
		
		public void attachmentAssetId(String multirequestToken) {
			params.add("attachmentAssetId", multirequestToken);
		}
	}

	public static ServeAttachmentAssetBuilder serve(String attachmentAssetId)  {
		return serve(attachmentAssetId, null);
	}

	/**
	 * Serves attachment by its id
	 * 
	 * @param attachmentAssetId 
	 * @param serveOptions 
	 */
    public static ServeAttachmentAssetBuilder serve(String attachmentAssetId, AttachmentServeOptions serveOptions)  {
		return new ServeAttachmentAssetBuilder(attachmentAssetId, serveOptions);
	}
	
	public static class SetContentAttachmentAssetBuilder extends RequestBuilder<AttachmentAsset, AttachmentAsset.Tokenizer, SetContentAttachmentAssetBuilder> {
		
		public SetContentAttachmentAssetBuilder(String id, ContentResource contentResource) {
			super(AttachmentAsset.class, "attachment_attachmentasset", "setContent");
			params.add("id", id);
			params.add("contentResource", contentResource);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update content of attachment asset
	 * 
	 * @param id 
	 * @param contentResource 
	 */
    public static SetContentAttachmentAssetBuilder setContent(String id, ContentResource contentResource)  {
		return new SetContentAttachmentAssetBuilder(id, contentResource);
	}
	
	public static class UpdateAttachmentAssetBuilder extends RequestBuilder<AttachmentAsset, AttachmentAsset.Tokenizer, UpdateAttachmentAssetBuilder> {
		
		public UpdateAttachmentAssetBuilder(String id, AttachmentAsset attachmentAsset) {
			super(AttachmentAsset.class, "attachment_attachmentasset", "update");
			params.add("id", id);
			params.add("attachmentAsset", attachmentAsset);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update attachment asset
	 * 
	 * @param id 
	 * @param attachmentAsset 
	 */
    public static UpdateAttachmentAssetBuilder update(String id, AttachmentAsset attachmentAsset)  {
		return new UpdateAttachmentAssetBuilder(id, attachmentAsset);
	}
}
