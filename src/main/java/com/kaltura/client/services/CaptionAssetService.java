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

import com.kaltura.client.types.AssetFilter;
import com.kaltura.client.types.CaptionAsset;
import com.kaltura.client.types.ContentResource;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.FlavorAsset;
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
 * Retrieve information and invoke actions on caption Asset
 * 
 * @param entryId 
 * @param captionAsset 
 * @param captionAssetId 
 * @param assetId 
 * @param storageProfileId 
 * @param captionAssetId 
 * @param id 
 * @param id 
 * @param storageId 
 * @param filter 
 * @param pager 
 * @param captionAssetId 
 * @param entryId 
 * @param captionParamId if not set, default caption will be used.
 * @param captionAssetId 
 * @param segmentDuration 
 * @param segmentIndex 
 * @param localTimestamp 
 * @param captionAssetId 
 * @param id 
 * @param contentResource 
 * @param id 
 * @param captionAsset 
 */
public class CaptionAssetService {
	
	public static class AddCaptionAssetBuilder extends RequestBuilder<CaptionAsset, CaptionAsset.Tokenizer, AddCaptionAssetBuilder> {
		
		public AddCaptionAssetBuilder(String entryId, CaptionAsset captionAsset) {
			super(CaptionAsset.class, "caption_captionasset", "add");
			params.add("entryId", entryId);
			params.add("captionAsset", captionAsset);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Add caption asset
	 * 
	 * @param entryId 
	 * @param captionAsset 
	 */
    public static AddCaptionAssetBuilder add(String entryId, CaptionAsset captionAsset)  {
		return new AddCaptionAssetBuilder(entryId, captionAsset);
	}
	
	public static class DeleteCaptionAssetBuilder extends NullRequestBuilder {
		
		public DeleteCaptionAssetBuilder(String captionAssetId) {
			super("caption_captionasset", "delete");
			params.add("captionAssetId", captionAssetId);
		}
		
		public void captionAssetId(String multirequestToken) {
			params.add("captionAssetId", multirequestToken);
		}
	}

    public static DeleteCaptionAssetBuilder delete(String captionAssetId)  {
		return new DeleteCaptionAssetBuilder(captionAssetId);
	}
	
	public static class ExportCaptionAssetBuilder extends RequestBuilder<FlavorAsset, FlavorAsset.Tokenizer, ExportCaptionAssetBuilder> {
		
		public ExportCaptionAssetBuilder(String assetId, int storageProfileId) {
			super(FlavorAsset.class, "caption_captionasset", "export");
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

	/**
	 * manually export an asset
	 * 
	 * @param assetId 
	 * @param storageProfileId 
	 */
    public static ExportCaptionAssetBuilder export(String assetId, int storageProfileId)  {
		return new ExportCaptionAssetBuilder(assetId, storageProfileId);
	}
	
	public static class GetCaptionAssetBuilder extends RequestBuilder<CaptionAsset, CaptionAsset.Tokenizer, GetCaptionAssetBuilder> {
		
		public GetCaptionAssetBuilder(String captionAssetId) {
			super(CaptionAsset.class, "caption_captionasset", "get");
			params.add("captionAssetId", captionAssetId);
		}
		
		public void captionAssetId(String multirequestToken) {
			params.add("captionAssetId", multirequestToken);
		}
	}

    public static GetCaptionAssetBuilder get(String captionAssetId)  {
		return new GetCaptionAssetBuilder(captionAssetId);
	}
	
	public static class GetRemotePathsCaptionAssetBuilder extends ListResponseRequestBuilder<RemotePath, RemotePath.Tokenizer, GetRemotePathsCaptionAssetBuilder> {
		
		public GetRemotePathsCaptionAssetBuilder(String id) {
			super(RemotePath.class, "caption_captionasset", "getRemotePaths");
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
    public static GetRemotePathsCaptionAssetBuilder getRemotePaths(String id)  {
		return new GetRemotePathsCaptionAssetBuilder(id);
	}
	
	public static class GetUrlCaptionAssetBuilder extends RequestBuilder<String, String, GetUrlCaptionAssetBuilder> {
		
		public GetUrlCaptionAssetBuilder(String id, int storageId) {
			super(String.class, "caption_captionasset", "getUrl");
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

	public static GetUrlCaptionAssetBuilder getUrl(String id)  {
		return getUrl(id, Integer.MIN_VALUE);
	}

	/**
	 * Get download URL for the asset
	 * 
	 * @param id 
	 * @param storageId 
	 */
    public static GetUrlCaptionAssetBuilder getUrl(String id, int storageId)  {
		return new GetUrlCaptionAssetBuilder(id, storageId);
	}
	
	public static class ListCaptionAssetBuilder extends ListResponseRequestBuilder<CaptionAsset, CaptionAsset.Tokenizer, ListCaptionAssetBuilder> {
		
		public ListCaptionAssetBuilder(AssetFilter filter, FilterPager pager) {
			super(CaptionAsset.class, "caption_captionasset", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListCaptionAssetBuilder list()  {
		return list(null);
	}

	public static ListCaptionAssetBuilder list(AssetFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List caption Assets by filter and pager
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListCaptionAssetBuilder list(AssetFilter filter, FilterPager pager)  {
		return new ListCaptionAssetBuilder(filter, pager);
	}
	
	public static class ServeCaptionAssetBuilder extends ServeRequestBuilder {
		
		public ServeCaptionAssetBuilder(String captionAssetId) {
			super("caption_captionasset", "serve");
			params.add("captionAssetId", captionAssetId);
		}
		
		public void captionAssetId(String multirequestToken) {
			params.add("captionAssetId", multirequestToken);
		}
	}

	/**
	 * Serves caption by its id
	 * 
	 * @param captionAssetId 
	 */
    public static ServeCaptionAssetBuilder serve(String captionAssetId)  {
		return new ServeCaptionAssetBuilder(captionAssetId);
	}
	
	public static class ServeByEntryIdCaptionAssetBuilder extends ServeRequestBuilder {
		
		public ServeByEntryIdCaptionAssetBuilder(String entryId, int captionParamId) {
			super("caption_captionasset", "serveByEntryId");
			params.add("entryId", entryId);
			params.add("captionParamId", captionParamId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void captionParamId(String multirequestToken) {
			params.add("captionParamId", multirequestToken);
		}
	}

	public static ServeByEntryIdCaptionAssetBuilder serveByEntryId(String entryId)  {
		return serveByEntryId(entryId, Integer.MIN_VALUE);
	}

	/**
	 * Serves caption by entry id and thumnail params id
	 * 
	 * @param entryId 
	 * @param captionParamId if not set, default caption will be used.
	 */
    public static ServeByEntryIdCaptionAssetBuilder serveByEntryId(String entryId, int captionParamId)  {
		return new ServeByEntryIdCaptionAssetBuilder(entryId, captionParamId);
	}
	
	public static class ServeWebVTTCaptionAssetBuilder extends ServeRequestBuilder {
		
		public ServeWebVTTCaptionAssetBuilder(String captionAssetId, int segmentDuration, int segmentIndex, int localTimestamp) {
			super("caption_captionasset", "serveWebVTT");
			params.add("captionAssetId", captionAssetId);
			params.add("segmentDuration", segmentDuration);
			params.add("segmentIndex", segmentIndex);
			params.add("localTimestamp", localTimestamp);
		}
		
		public void captionAssetId(String multirequestToken) {
			params.add("captionAssetId", multirequestToken);
		}
		
		public void segmentDuration(String multirequestToken) {
			params.add("segmentDuration", multirequestToken);
		}
		
		public void segmentIndex(String multirequestToken) {
			params.add("segmentIndex", multirequestToken);
		}
		
		public void localTimestamp(String multirequestToken) {
			params.add("localTimestamp", multirequestToken);
		}
	}

	public static ServeWebVTTCaptionAssetBuilder serveWebVTT(String captionAssetId)  {
		return serveWebVTT(captionAssetId, 30);
	}

	public static ServeWebVTTCaptionAssetBuilder serveWebVTT(String captionAssetId, int segmentDuration)  {
		return serveWebVTT(captionAssetId, segmentDuration, Integer.MIN_VALUE);
	}

	public static ServeWebVTTCaptionAssetBuilder serveWebVTT(String captionAssetId, int segmentDuration, int segmentIndex)  {
		return serveWebVTT(captionAssetId, segmentDuration, segmentIndex, 10000);
	}

	/**
	 * Serves caption by its id converting it to segmented WebVTT
	 * 
	 * @param captionAssetId 
	 * @param segmentDuration 
	 * @param segmentIndex 
	 * @param localTimestamp 
	 */
    public static ServeWebVTTCaptionAssetBuilder serveWebVTT(String captionAssetId, int segmentDuration, int segmentIndex, int localTimestamp)  {
		return new ServeWebVTTCaptionAssetBuilder(captionAssetId, segmentDuration, segmentIndex, localTimestamp);
	}
	
	public static class SetAsDefaultCaptionAssetBuilder extends NullRequestBuilder {
		
		public SetAsDefaultCaptionAssetBuilder(String captionAssetId) {
			super("caption_captionasset", "setAsDefault");
			params.add("captionAssetId", captionAssetId);
		}
		
		public void captionAssetId(String multirequestToken) {
			params.add("captionAssetId", multirequestToken);
		}
	}

	/**
	 * Markss the caption as default and removes that mark from all other caption
	  assets of the entry.
	 * 
	 * @param captionAssetId 
	 */
    public static SetAsDefaultCaptionAssetBuilder setAsDefault(String captionAssetId)  {
		return new SetAsDefaultCaptionAssetBuilder(captionAssetId);
	}
	
	public static class SetContentCaptionAssetBuilder extends RequestBuilder<CaptionAsset, CaptionAsset.Tokenizer, SetContentCaptionAssetBuilder> {
		
		public SetContentCaptionAssetBuilder(String id, ContentResource contentResource) {
			super(CaptionAsset.class, "caption_captionasset", "setContent");
			params.add("id", id);
			params.add("contentResource", contentResource);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update content of caption asset
	 * 
	 * @param id 
	 * @param contentResource 
	 */
    public static SetContentCaptionAssetBuilder setContent(String id, ContentResource contentResource)  {
		return new SetContentCaptionAssetBuilder(id, contentResource);
	}
	
	public static class UpdateCaptionAssetBuilder extends RequestBuilder<CaptionAsset, CaptionAsset.Tokenizer, UpdateCaptionAssetBuilder> {
		
		public UpdateCaptionAssetBuilder(String id, CaptionAsset captionAsset) {
			super(CaptionAsset.class, "caption_captionasset", "update");
			params.add("id", id);
			params.add("captionAsset", captionAsset);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update caption asset
	 * 
	 * @param id 
	 * @param captionAsset 
	 */
    public static UpdateCaptionAssetBuilder update(String id, CaptionAsset captionAsset)  {
		return new UpdateCaptionAssetBuilder(id, captionAsset);
	}
}
