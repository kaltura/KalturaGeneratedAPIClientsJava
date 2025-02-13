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

import com.kaltura.client.types.AssetFilter;
import com.kaltura.client.types.ContentResource;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.FlavorAsset;
import com.kaltura.client.types.FlavorAssetUrlOptions;
import com.kaltura.client.types.FlavorAssetWithParams;
import com.kaltura.client.types.RemotePath;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
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
 * Retrieve information and invoke actions on Flavor Asset
 * 
 * @param entryId 
 * @param flavorAsset 
 * @param entryId 
 * @param flavorParamsId 
 * @param priority 
 * @param id 
 * @param assetId 
 * @param assetId 
 * @param storageProfileId 
 * @param id 
 * @param entryId 
 * @param id 
 * @param useCdn 
 * @param entryId 
 * @param id 
 * @param id 
 * @param storageId 
 * @param forceProxy 
 * @param options 
 * @param flavorId Flavor id
 * @param entryId 
 * @param filter 
 * @param pager 
 * @param id Flavor Asset ID
 * @param assetId 
 * @param ffprobeJson 
 * @param duration 
 * @param assetId 
 * @param id 
 * @param contentResource 
 * @param id 
 * @param flavorAsset 
 */
public class FlavorAssetService {
	
	public static class AddFlavorAssetBuilder extends RequestBuilder<FlavorAsset, FlavorAsset.Tokenizer, AddFlavorAssetBuilder> {
		
		public AddFlavorAssetBuilder(String entryId, FlavorAsset flavorAsset) {
			super(FlavorAsset.class, "flavorasset", "add");
			params.add("entryId", entryId);
			params.add("flavorAsset", flavorAsset);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Add flavor asset
	 * 
	 * @param entryId 
	 * @param flavorAsset 
	 */
    public static AddFlavorAssetBuilder add(String entryId, FlavorAsset flavorAsset)  {
		return new AddFlavorAssetBuilder(entryId, flavorAsset);
	}
	
	public static class ConvertFlavorAssetBuilder extends NullRequestBuilder {
		
		public ConvertFlavorAssetBuilder(String entryId, int flavorParamsId, int priority) {
			super("flavorasset", "convert");
			params.add("entryId", entryId);
			params.add("flavorParamsId", flavorParamsId);
			params.add("priority", priority);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void flavorParamsId(String multirequestToken) {
			params.add("flavorParamsId", multirequestToken);
		}
		
		public void priority(String multirequestToken) {
			params.add("priority", multirequestToken);
		}
	}

	public static ConvertFlavorAssetBuilder convert(String entryId, int flavorParamsId)  {
		return convert(entryId, flavorParamsId, 0);
	}

	/**
	 * Add and convert new Flavor Asset for Entry with specific Flavor Params
	 * 
	 * @param entryId 
	 * @param flavorParamsId 
	 * @param priority 
	 */
    public static ConvertFlavorAssetBuilder convert(String entryId, int flavorParamsId, int priority)  {
		return new ConvertFlavorAssetBuilder(entryId, flavorParamsId, priority);
	}
	
	public static class DeleteFlavorAssetBuilder extends NullRequestBuilder {
		
		public DeleteFlavorAssetBuilder(String id) {
			super("flavorasset", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete Flavor Asset by ID
	 * 
	 * @param id 
	 */
    public static DeleteFlavorAssetBuilder delete(String id)  {
		return new DeleteFlavorAssetBuilder(id);
	}
	
	public static class DeleteLocalContentFlavorAssetBuilder extends NullRequestBuilder {
		
		public DeleteLocalContentFlavorAssetBuilder(String assetId) {
			super("flavorasset", "deleteLocalContent");
			params.add("assetId", assetId);
		}
		
		public void assetId(String multirequestToken) {
			params.add("assetId", multirequestToken);
		}
	}

	/**
	 * delete all local file syncs for this asset
	 * 
	 * @param assetId 
	 */
    public static DeleteLocalContentFlavorAssetBuilder deleteLocalContent(String assetId)  {
		return new DeleteLocalContentFlavorAssetBuilder(assetId);
	}
	
	public static class ExportFlavorAssetBuilder extends RequestBuilder<FlavorAsset, FlavorAsset.Tokenizer, ExportFlavorAssetBuilder> {
		
		public ExportFlavorAssetBuilder(String assetId, int storageProfileId) {
			super(FlavorAsset.class, "flavorasset", "export");
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
    public static ExportFlavorAssetBuilder export(String assetId, int storageProfileId)  {
		return new ExportFlavorAssetBuilder(assetId, storageProfileId);
	}
	
	public static class GetFlavorAssetBuilder extends RequestBuilder<FlavorAsset, FlavorAsset.Tokenizer, GetFlavorAssetBuilder> {
		
		public GetFlavorAssetBuilder(String id) {
			super(FlavorAsset.class, "flavorasset", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get Flavor Asset by ID
	 * 
	 * @param id 
	 */
    public static GetFlavorAssetBuilder get(String id)  {
		return new GetFlavorAssetBuilder(id);
	}
	
	public static class GetByEntryIdFlavorAssetBuilder extends ArrayRequestBuilder<FlavorAsset, FlavorAsset.Tokenizer, GetByEntryIdFlavorAssetBuilder> {
		
		public GetByEntryIdFlavorAssetBuilder(String entryId) {
			super(FlavorAsset.class, "flavorasset", "getByEntryId");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Get Flavor Assets for Entry
	 * 
	 * @param entryId 
	 */
    public static GetByEntryIdFlavorAssetBuilder getByEntryId(String entryId)  {
		return new GetByEntryIdFlavorAssetBuilder(entryId);
	}
	
	public static class GetDownloadUrlFlavorAssetBuilder extends RequestBuilder<String, String, GetDownloadUrlFlavorAssetBuilder> {
		
		public GetDownloadUrlFlavorAssetBuilder(String id, boolean useCdn) {
			super(String.class, "flavorasset", "getDownloadUrl");
			params.add("id", id);
			params.add("useCdn", useCdn);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void useCdn(String multirequestToken) {
			params.add("useCdn", multirequestToken);
		}
	}

	public static GetDownloadUrlFlavorAssetBuilder getDownloadUrl(String id)  {
		return getDownloadUrl(id, false);
	}

	/**
	 * Get download URL for the Flavor Asset
	 * 
	 * @param id 
	 * @param useCdn 
	 */
    public static GetDownloadUrlFlavorAssetBuilder getDownloadUrl(String id, boolean useCdn)  {
		return new GetDownloadUrlFlavorAssetBuilder(id, useCdn);
	}
	
	public static class GetFlavorAssetsWithParamsFlavorAssetBuilder extends ArrayRequestBuilder<FlavorAssetWithParams, FlavorAssetWithParams.Tokenizer, GetFlavorAssetsWithParamsFlavorAssetBuilder> {
		
		public GetFlavorAssetsWithParamsFlavorAssetBuilder(String entryId) {
			super(FlavorAssetWithParams.class, "flavorasset", "getFlavorAssetsWithParams");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Get Flavor Asset with the relevant Flavor Params (Flavor Params can exist
	  without Flavor Asset &amp; vice versa)
	 * 
	 * @param entryId 
	 */
    public static GetFlavorAssetsWithParamsFlavorAssetBuilder getFlavorAssetsWithParams(String entryId)  {
		return new GetFlavorAssetsWithParamsFlavorAssetBuilder(entryId);
	}
	
	public static class GetRemotePathsFlavorAssetBuilder extends ListResponseRequestBuilder<RemotePath, RemotePath.Tokenizer, GetRemotePathsFlavorAssetBuilder> {
		
		public GetRemotePathsFlavorAssetBuilder(String id) {
			super(RemotePath.class, "flavorasset", "getRemotePaths");
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
    public static GetRemotePathsFlavorAssetBuilder getRemotePaths(String id)  {
		return new GetRemotePathsFlavorAssetBuilder(id);
	}
	
	public static class GetUrlFlavorAssetBuilder extends RequestBuilder<String, String, GetUrlFlavorAssetBuilder> {
		
		public GetUrlFlavorAssetBuilder(String id, int storageId, boolean forceProxy, FlavorAssetUrlOptions options) {
			super(String.class, "flavorasset", "getUrl");
			params.add("id", id);
			params.add("storageId", storageId);
			params.add("forceProxy", forceProxy);
			params.add("options", options);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void storageId(String multirequestToken) {
			params.add("storageId", multirequestToken);
		}
		
		public void forceProxy(String multirequestToken) {
			params.add("forceProxy", multirequestToken);
		}
	}

	public static GetUrlFlavorAssetBuilder getUrl(String id)  {
		return getUrl(id, Integer.MIN_VALUE);
	}

	public static GetUrlFlavorAssetBuilder getUrl(String id, int storageId)  {
		return getUrl(id, storageId, false);
	}

	public static GetUrlFlavorAssetBuilder getUrl(String id, int storageId, boolean forceProxy)  {
		return getUrl(id, storageId, forceProxy, null);
	}

	/**
	 * Get download URL for the asset
	 * 
	 * @param id 
	 * @param storageId 
	 * @param forceProxy 
	 * @param options 
	 */
    public static GetUrlFlavorAssetBuilder getUrl(String id, int storageId, boolean forceProxy, FlavorAssetUrlOptions options)  {
		return new GetUrlFlavorAssetBuilder(id, storageId, forceProxy, options);
	}
	
	public static class GetVolumeMapFlavorAssetBuilder extends ServeRequestBuilder {
		
		public GetVolumeMapFlavorAssetBuilder(String flavorId) {
			super("flavorasset", "getVolumeMap");
			params.add("flavorId", flavorId);
		}
		
		public void flavorId(String multirequestToken) {
			params.add("flavorId", multirequestToken);
		}
	}

	/**
	 * Get volume map by entry id
	 * 
	 * @param flavorId Flavor id
	 */
    public static GetVolumeMapFlavorAssetBuilder getVolumeMap(String flavorId)  {
		return new GetVolumeMapFlavorAssetBuilder(flavorId);
	}
	
	public static class GetWebPlayableByEntryIdFlavorAssetBuilder extends ArrayRequestBuilder<FlavorAsset, FlavorAsset.Tokenizer, GetWebPlayableByEntryIdFlavorAssetBuilder> {
		
		public GetWebPlayableByEntryIdFlavorAssetBuilder(String entryId) {
			super(FlavorAsset.class, "flavorasset", "getWebPlayableByEntryId");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Get web playable Flavor Assets for Entry
	 * 
	 * @param entryId 
	 */
    public static GetWebPlayableByEntryIdFlavorAssetBuilder getWebPlayableByEntryId(String entryId)  {
		return new GetWebPlayableByEntryIdFlavorAssetBuilder(entryId);
	}
	
	public static class ListFlavorAssetBuilder extends ListResponseRequestBuilder<FlavorAsset, FlavorAsset.Tokenizer, ListFlavorAssetBuilder> {
		
		public ListFlavorAssetBuilder(AssetFilter filter, FilterPager pager) {
			super(FlavorAsset.class, "flavorasset", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListFlavorAssetBuilder list()  {
		return list(null);
	}

	public static ListFlavorAssetBuilder list(AssetFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List Flavor Assets by filter and pager
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListFlavorAssetBuilder list(AssetFilter filter, FilterPager pager)  {
		return new ListFlavorAssetBuilder(filter, pager);
	}
	
	public static class ReconvertFlavorAssetBuilder extends NullRequestBuilder {
		
		public ReconvertFlavorAssetBuilder(String id) {
			super("flavorasset", "reconvert");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Reconvert Flavor Asset by ID
	 * 
	 * @param id Flavor Asset ID
	 */
    public static ReconvertFlavorAssetBuilder reconvert(String id)  {
		return new ReconvertFlavorAssetBuilder(id);
	}
	
	public static class ServeAdStitchCmdFlavorAssetBuilder extends RequestBuilder<String, String, ServeAdStitchCmdFlavorAssetBuilder> {
		
		public ServeAdStitchCmdFlavorAssetBuilder(String assetId, String ffprobeJson, String duration) {
			super(String.class, "flavorasset", "serveAdStitchCmd");
			params.add("assetId", assetId);
			params.add("ffprobeJson", ffprobeJson);
			params.add("duration", duration);
		}
		
		public void assetId(String multirequestToken) {
			params.add("assetId", multirequestToken);
		}
		
		public void ffprobeJson(String multirequestToken) {
			params.add("ffprobeJson", multirequestToken);
		}
		
		public void duration(String multirequestToken) {
			params.add("duration", multirequestToken);
		}
	}

	public static ServeAdStitchCmdFlavorAssetBuilder serveAdStitchCmd(String assetId)  {
		return serveAdStitchCmd(assetId, null);
	}

	public static ServeAdStitchCmdFlavorAssetBuilder serveAdStitchCmd(String assetId, String ffprobeJson)  {
		return serveAdStitchCmd(assetId, ffprobeJson, null);
	}

	/**
	 * serve cmd line to transcode the ad
	 * 
	 * @param assetId 
	 * @param ffprobeJson 
	 * @param duration 
	 */
    public static ServeAdStitchCmdFlavorAssetBuilder serveAdStitchCmd(String assetId, String ffprobeJson, String duration)  {
		return new ServeAdStitchCmdFlavorAssetBuilder(assetId, ffprobeJson, duration);
	}
	
	public static class SetAsSourceFlavorAssetBuilder extends NullRequestBuilder {
		
		public SetAsSourceFlavorAssetBuilder(String assetId) {
			super("flavorasset", "setAsSource");
			params.add("assetId", assetId);
		}
		
		public void assetId(String multirequestToken) {
			params.add("assetId", multirequestToken);
		}
	}

	/**
	 * Set a given flavor as the original flavor
	 * 
	 * @param assetId 
	 */
    public static SetAsSourceFlavorAssetBuilder setAsSource(String assetId)  {
		return new SetAsSourceFlavorAssetBuilder(assetId);
	}
	
	public static class SetContentFlavorAssetBuilder extends RequestBuilder<FlavorAsset, FlavorAsset.Tokenizer, SetContentFlavorAssetBuilder> {
		
		public SetContentFlavorAssetBuilder(String id, ContentResource contentResource) {
			super(FlavorAsset.class, "flavorasset", "setContent");
			params.add("id", id);
			params.add("contentResource", contentResource);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update content of flavor asset
	 * 
	 * @param id 
	 * @param contentResource 
	 */
    public static SetContentFlavorAssetBuilder setContent(String id, ContentResource contentResource)  {
		return new SetContentFlavorAssetBuilder(id, contentResource);
	}
	
	public static class UpdateFlavorAssetBuilder extends RequestBuilder<FlavorAsset, FlavorAsset.Tokenizer, UpdateFlavorAssetBuilder> {
		
		public UpdateFlavorAssetBuilder(String id, FlavorAsset flavorAsset) {
			super(FlavorAsset.class, "flavorasset", "update");
			params.add("id", id);
			params.add("flavorAsset", flavorAsset);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update flavor asset
	 * 
	 * @param id 
	 * @param flavorAsset 
	 */
    public static UpdateFlavorAssetBuilder update(String id, FlavorAsset flavorAsset)  {
		return new UpdateFlavorAssetBuilder(id, flavorAsset);
	}
}
