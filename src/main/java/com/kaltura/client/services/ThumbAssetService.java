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
import com.kaltura.client.types.AssetFilter;
import com.kaltura.client.types.ContentResource;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.FlavorAsset;
import com.kaltura.client.types.RemotePath;
import com.kaltura.client.types.ThumbAsset;
import com.kaltura.client.types.ThumbParams;
import com.kaltura.client.types.ThumbnailServeOptions;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Retrieve information and invoke actions on Thumb Asset  */
public class ThumbAssetService {
	
	public static class AddThumbAssetBuilder extends RequestBuilder<ThumbAsset, ThumbAsset.Tokenizer, AddThumbAssetBuilder> {
		
		public AddThumbAssetBuilder(String entryId, ThumbAsset thumbAsset) {
			super(ThumbAsset.class, "thumbasset", "add");
			params.add("entryId", entryId);
			params.add("thumbAsset", thumbAsset);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**  Add thumbnail asset  */
    public static AddThumbAssetBuilder add(String entryId, ThumbAsset thumbAsset)  {
		return new AddThumbAssetBuilder(entryId, thumbAsset);
	}
	
	public static class AddFromImageThumbAssetBuilder extends RequestBuilder<ThumbAsset, ThumbAsset.Tokenizer, AddFromImageThumbAssetBuilder> {
		
		public AddFromImageThumbAssetBuilder(String entryId, FileHolder fileData) {
			super(ThumbAsset.class, "thumbasset", "addFromImage");
			params.add("entryId", entryId);
			files = new Files();
			files.add("fileData", fileData);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	public static AddFromImageThumbAssetBuilder addFromImage(String entryId, File fileData)  {
		return addFromImage(entryId, new FileHolder(fileData));
	}

	public static AddFromImageThumbAssetBuilder addFromImage(String entryId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return addFromImage(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
	}

	public static AddFromImageThumbAssetBuilder addFromImage(String entryId, FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return addFromImage(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName));
	}

    public static AddFromImageThumbAssetBuilder addFromImage(String entryId, FileHolder fileData)  {
		return new AddFromImageThumbAssetBuilder(entryId, fileData);
	}
	
	public static class AddFromUrlThumbAssetBuilder extends RequestBuilder<ThumbAsset, ThumbAsset.Tokenizer, AddFromUrlThumbAssetBuilder> {
		
		public AddFromUrlThumbAssetBuilder(String entryId, String url) {
			super(ThumbAsset.class, "thumbasset", "addFromUrl");
			params.add("entryId", entryId);
			params.add("url", url);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void url(String multirequestToken) {
			params.add("url", multirequestToken);
		}
	}

    public static AddFromUrlThumbAssetBuilder addFromUrl(String entryId, String url)  {
		return new AddFromUrlThumbAssetBuilder(entryId, url);
	}
	
	public static class DeleteThumbAssetBuilder extends NullRequestBuilder {
		
		public DeleteThumbAssetBuilder(String thumbAssetId) {
			super("thumbasset", "delete");
			params.add("thumbAssetId", thumbAssetId);
		}
		
		public void thumbAssetId(String multirequestToken) {
			params.add("thumbAssetId", multirequestToken);
		}
	}

    public static DeleteThumbAssetBuilder delete(String thumbAssetId)  {
		return new DeleteThumbAssetBuilder(thumbAssetId);
	}
	
	public static class ExportThumbAssetBuilder extends RequestBuilder<FlavorAsset, FlavorAsset.Tokenizer, ExportThumbAssetBuilder> {
		
		public ExportThumbAssetBuilder(String assetId, int storageProfileId) {
			super(FlavorAsset.class, "thumbasset", "export");
			params.add("assetId", assetId);
			params.add("storageProfileId", storageProfileId);
		}
		
		public void assetId(String multirequestToken) {
			params.add("assetId", multirequestToken);
		}
		
		public void storageProfileId(String multirequestToken) {
			params.add("storageProfileId", multirequestToken);
		}
	}

	/**  manually export an asset  */
    public static ExportThumbAssetBuilder export(String assetId, int storageProfileId)  {
		return new ExportThumbAssetBuilder(assetId, storageProfileId);
	}
	
	public static class GenerateThumbAssetBuilder extends RequestBuilder<ThumbAsset, ThumbAsset.Tokenizer, GenerateThumbAssetBuilder> {
		
		public GenerateThumbAssetBuilder(String entryId, ThumbParams thumbParams, String sourceAssetId) {
			super(ThumbAsset.class, "thumbasset", "generate");
			params.add("entryId", entryId);
			params.add("thumbParams", thumbParams);
			params.add("sourceAssetId", sourceAssetId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void sourceAssetId(String multirequestToken) {
			params.add("sourceAssetId", multirequestToken);
		}
	}

	public static GenerateThumbAssetBuilder generate(String entryId, ThumbParams thumbParams)  {
		return generate(entryId, thumbParams, null);
	}

    public static GenerateThumbAssetBuilder generate(String entryId, ThumbParams thumbParams, String sourceAssetId)  {
		return new GenerateThumbAssetBuilder(entryId, thumbParams, sourceAssetId);
	}
	
	public static class GenerateByEntryIdThumbAssetBuilder extends RequestBuilder<ThumbAsset, ThumbAsset.Tokenizer, GenerateByEntryIdThumbAssetBuilder> {
		
		public GenerateByEntryIdThumbAssetBuilder(String entryId, int destThumbParamsId) {
			super(ThumbAsset.class, "thumbasset", "generateByEntryId");
			params.add("entryId", entryId);
			params.add("destThumbParamsId", destThumbParamsId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void destThumbParamsId(String multirequestToken) {
			params.add("destThumbParamsId", multirequestToken);
		}
	}

    public static GenerateByEntryIdThumbAssetBuilder generateByEntryId(String entryId, int destThumbParamsId)  {
		return new GenerateByEntryIdThumbAssetBuilder(entryId, destThumbParamsId);
	}
	
	public static class GetThumbAssetBuilder extends RequestBuilder<ThumbAsset, ThumbAsset.Tokenizer, GetThumbAssetBuilder> {
		
		public GetThumbAssetBuilder(String thumbAssetId) {
			super(ThumbAsset.class, "thumbasset", "get");
			params.add("thumbAssetId", thumbAssetId);
		}
		
		public void thumbAssetId(String multirequestToken) {
			params.add("thumbAssetId", multirequestToken);
		}
	}

    public static GetThumbAssetBuilder get(String thumbAssetId)  {
		return new GetThumbAssetBuilder(thumbAssetId);
	}
	
	public static class GetByEntryIdThumbAssetBuilder extends ArrayRequestBuilder<ThumbAsset, ThumbAsset.Tokenizer, GetByEntryIdThumbAssetBuilder> {
		
		public GetByEntryIdThumbAssetBuilder(String entryId) {
			super(ThumbAsset.class, "thumbasset", "getByEntryId");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

    public static GetByEntryIdThumbAssetBuilder getByEntryId(String entryId)  {
		return new GetByEntryIdThumbAssetBuilder(entryId);
	}
	
	public static class GetRemotePathsThumbAssetBuilder extends ListResponseRequestBuilder<RemotePath, RemotePath.Tokenizer, GetRemotePathsThumbAssetBuilder> {
		
		public GetRemotePathsThumbAssetBuilder(String id) {
			super(RemotePath.class, "thumbasset", "getRemotePaths");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Get remote storage existing paths for the asset  */
    public static GetRemotePathsThumbAssetBuilder getRemotePaths(String id)  {
		return new GetRemotePathsThumbAssetBuilder(id);
	}
	
	public static class GetUrlThumbAssetBuilder extends RequestBuilder<String, String, GetUrlThumbAssetBuilder> {
		
		public GetUrlThumbAssetBuilder(String id, int storageId, ThumbParams thumbParams) {
			super(String.class, "thumbasset", "getUrl");
			params.add("id", id);
			params.add("storageId", storageId);
			params.add("thumbParams", thumbParams);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void storageId(String multirequestToken) {
			params.add("storageId", multirequestToken);
		}
	}

	public static GetUrlThumbAssetBuilder getUrl(String id)  {
		return getUrl(id, Integer.MIN_VALUE);
	}

	public static GetUrlThumbAssetBuilder getUrl(String id, int storageId)  {
		return getUrl(id, storageId, null);
	}

	/**  Get download URL for the asset  */
    public static GetUrlThumbAssetBuilder getUrl(String id, int storageId, ThumbParams thumbParams)  {
		return new GetUrlThumbAssetBuilder(id, storageId, thumbParams);
	}
	
	public static class ListThumbAssetBuilder extends ListResponseRequestBuilder<ThumbAsset, ThumbAsset.Tokenizer, ListThumbAssetBuilder> {
		
		public ListThumbAssetBuilder(AssetFilter filter, FilterPager pager) {
			super(ThumbAsset.class, "thumbasset", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListThumbAssetBuilder list()  {
		return list(null);
	}

	public static ListThumbAssetBuilder list(AssetFilter filter)  {
		return list(filter, null);
	}

	/**  List Thumbnail Assets by filter and pager  */
    public static ListThumbAssetBuilder list(AssetFilter filter, FilterPager pager)  {
		return new ListThumbAssetBuilder(filter, pager);
	}
	
	public static class RegenerateThumbAssetBuilder extends RequestBuilder<ThumbAsset, ThumbAsset.Tokenizer, RegenerateThumbAssetBuilder> {
		
		public RegenerateThumbAssetBuilder(String thumbAssetId) {
			super(ThumbAsset.class, "thumbasset", "regenerate");
			params.add("thumbAssetId", thumbAssetId);
		}
		
		public void thumbAssetId(String multirequestToken) {
			params.add("thumbAssetId", multirequestToken);
		}
	}

    public static RegenerateThumbAssetBuilder regenerate(String thumbAssetId)  {
		return new RegenerateThumbAssetBuilder(thumbAssetId);
	}
	
	public static class ServeThumbAssetBuilder extends ServeRequestBuilder {
		
		public ServeThumbAssetBuilder(String thumbAssetId, int version, ThumbParams thumbParams, ThumbnailServeOptions options) {
			super("thumbasset", "serve");
			params.add("thumbAssetId", thumbAssetId);
			params.add("version", version);
			params.add("thumbParams", thumbParams);
			params.add("options", options);
		}
		
		public void thumbAssetId(String multirequestToken) {
			params.add("thumbAssetId", multirequestToken);
		}
		
		public void version(String multirequestToken) {
			params.add("version", multirequestToken);
		}
	}

	public static ServeThumbAssetBuilder serve(String thumbAssetId)  {
		return serve(thumbAssetId, Integer.MIN_VALUE);
	}

	public static ServeThumbAssetBuilder serve(String thumbAssetId, int version)  {
		return serve(thumbAssetId, version, null);
	}

	public static ServeThumbAssetBuilder serve(String thumbAssetId, int version, ThumbParams thumbParams)  {
		return serve(thumbAssetId, version, thumbParams, null);
	}

	/**  Serves thumbnail by its id  */
    public static ServeThumbAssetBuilder serve(String thumbAssetId, int version, ThumbParams thumbParams, ThumbnailServeOptions options)  {
		return new ServeThumbAssetBuilder(thumbAssetId, version, thumbParams, options);
	}
	
	public static class ServeByEntryIdThumbAssetBuilder extends ServeRequestBuilder {
		
		public ServeByEntryIdThumbAssetBuilder(String entryId, int thumbParamId) {
			super("thumbasset", "serveByEntryId");
			params.add("entryId", entryId);
			params.add("thumbParamId", thumbParamId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void thumbParamId(String multirequestToken) {
			params.add("thumbParamId", multirequestToken);
		}
	}

	public static ServeByEntryIdThumbAssetBuilder serveByEntryId(String entryId)  {
		return serveByEntryId(entryId, Integer.MIN_VALUE);
	}

	/**  Serves thumbnail by entry id and thumnail params id  */
    public static ServeByEntryIdThumbAssetBuilder serveByEntryId(String entryId, int thumbParamId)  {
		return new ServeByEntryIdThumbAssetBuilder(entryId, thumbParamId);
	}
	
	public static class SetAsDefaultThumbAssetBuilder extends NullRequestBuilder {
		
		public SetAsDefaultThumbAssetBuilder(String thumbAssetId) {
			super("thumbasset", "setAsDefault");
			params.add("thumbAssetId", thumbAssetId);
		}
		
		public void thumbAssetId(String multirequestToken) {
			params.add("thumbAssetId", multirequestToken);
		}
	}

	/**  Tags the thumbnail as DEFAULT_THUMB and removes that tag from all other
	  thumbnail assets of the entry.   Create a new file sync link on the entry
	  thumbnail that points to the thumbnail asset file sync.  */
    public static SetAsDefaultThumbAssetBuilder setAsDefault(String thumbAssetId)  {
		return new SetAsDefaultThumbAssetBuilder(thumbAssetId);
	}
	
	public static class SetContentThumbAssetBuilder extends RequestBuilder<ThumbAsset, ThumbAsset.Tokenizer, SetContentThumbAssetBuilder> {
		
		public SetContentThumbAssetBuilder(String id, ContentResource contentResource) {
			super(ThumbAsset.class, "thumbasset", "setContent");
			params.add("id", id);
			params.add("contentResource", contentResource);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Update content of thumbnail asset  */
    public static SetContentThumbAssetBuilder setContent(String id, ContentResource contentResource)  {
		return new SetContentThumbAssetBuilder(id, contentResource);
	}
	
	public static class UpdateThumbAssetBuilder extends RequestBuilder<ThumbAsset, ThumbAsset.Tokenizer, UpdateThumbAssetBuilder> {
		
		public UpdateThumbAssetBuilder(String id, ThumbAsset thumbAsset) {
			super(ThumbAsset.class, "thumbasset", "update");
			params.add("id", id);
			params.add("thumbAsset", thumbAsset);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Update thumbnail asset  */
    public static UpdateThumbAssetBuilder update(String id, ThumbAsset thumbAsset)  {
		return new UpdateThumbAssetBuilder(id, thumbAsset);
	}
}
