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

import com.kaltura.client.Params;
import com.kaltura.client.types.AssetFilter;
import com.kaltura.client.types.ContentResource;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.FlavorAsset;
import com.kaltura.client.types.FlavorAssetUrlOptions;
import com.kaltura.client.types.FlavorAssetWithParams;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.RemotePath;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Retrieve information and invoke actions on Flavor Asset  */
public class FlavorAssetService {

	/**  Add flavor asset  */
    public static RequestBuilder<FlavorAsset> add(String entryId, FlavorAsset flavorAsset)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("flavorAsset", flavorAsset);

        return new RequestBuilder<FlavorAsset>(FlavorAsset.class, "flavorasset", "add", kparams);
    }

    public static RequestBuilder<Void> convert(String entryId, int flavorParamsId)  {
        return convert(entryId, flavorParamsId, 0);
    }

	/**  Add and convert new Flavor Asset for Entry with specific Flavor Params  */
    public static RequestBuilder<Void> convert(String entryId, int flavorParamsId, int priority)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("flavorParamsId", flavorParamsId);
        kparams.add("priority", priority);

        return new NullRequestBuilder("flavorasset", "convert", kparams);
    }

	/**  Delete Flavor Asset by ID  */
    public static RequestBuilder<Void> delete(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("flavorasset", "delete", kparams);
    }

	/**  delete all local file syncs for this asset  */
    public static RequestBuilder<Void> deleteLocalContent(String assetId)  {
        Params kparams = new Params();
        kparams.add("assetId", assetId);

        return new NullRequestBuilder("flavorasset", "deleteLocalContent", kparams);
    }

	/**  manually export an asset  */
    public static RequestBuilder<FlavorAsset> export(String assetId, int storageProfileId)  {
        Params kparams = new Params();
        kparams.add("assetId", assetId);
        kparams.add("storageProfileId", storageProfileId);

        return new RequestBuilder<FlavorAsset>(FlavorAsset.class, "flavorasset", "export", kparams);
    }

	/**  Get Flavor Asset by ID  */
    public static RequestBuilder<FlavorAsset> get(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<FlavorAsset>(FlavorAsset.class, "flavorasset", "get", kparams);
    }

	/**  Get Flavor Assets for Entry  */
    public static RequestBuilder<List<FlavorAsset>> getByEntryId(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new ArrayRequestBuilder<FlavorAsset>(FlavorAsset.class, "flavorasset", "getByEntryId", kparams);
    }

    public static RequestBuilder<String> getDownloadUrl(String id)  {
        return getDownloadUrl(id, false);
    }

	/**  Get download URL for the Flavor Asset  */
    public static RequestBuilder<String> getDownloadUrl(String id, boolean useCdn)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("useCdn", useCdn);

        return new RequestBuilder<String>(String.class, "flavorasset", "getDownloadUrl", kparams);
    }

	/**  Get Flavor Asset with the relevant Flavor Params (Flavor Params can exist
	  without Flavor Asset &amp; vice versa)  */
    public static RequestBuilder<List<FlavorAssetWithParams>> getFlavorAssetsWithParams(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new ArrayRequestBuilder<FlavorAssetWithParams>(FlavorAssetWithParams.class, "flavorasset", "getFlavorAssetsWithParams", kparams);
    }

	/**  Get remote storage existing paths for the asset  */
    public static RequestBuilder<ListResponse<RemotePath>> getRemotePaths(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new ListResponseRequestBuilder<RemotePath>(RemotePath.class, "flavorasset", "getRemotePaths", kparams);
    }

    public static RequestBuilder<String> getUrl(String id)  {
        return getUrl(id, Integer.MIN_VALUE);
    }

    public static RequestBuilder<String> getUrl(String id, int storageId)  {
        return getUrl(id, storageId, false);
    }

    public static RequestBuilder<String> getUrl(String id, int storageId, boolean forceProxy)  {
        return getUrl(id, storageId, forceProxy, null);
    }

	/**  Get download URL for the asset  */
    public static RequestBuilder<String> getUrl(String id, int storageId, boolean forceProxy, FlavorAssetUrlOptions options)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("storageId", storageId);
        kparams.add("forceProxy", forceProxy);
        kparams.add("options", options);

        return new RequestBuilder<String>(String.class, "flavorasset", "getUrl", kparams);
    }

	/**  Get web playable Flavor Assets for Entry  */
    public static RequestBuilder<List<FlavorAsset>> getWebPlayableByEntryId(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new ArrayRequestBuilder<FlavorAsset>(FlavorAsset.class, "flavorasset", "getWebPlayableByEntryId", kparams);
    }

    public static RequestBuilder<ListResponse<FlavorAsset>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<FlavorAsset>> list(AssetFilter filter)  {
        return list(filter, null);
    }

	/**  List Flavor Assets by filter and pager  */
    public static RequestBuilder<ListResponse<FlavorAsset>> list(AssetFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<FlavorAsset>(FlavorAsset.class, "flavorasset", "list", kparams);
    }

	/**  Reconvert Flavor Asset by ID  */
    public static RequestBuilder<Void> reconvert(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("flavorasset", "reconvert", kparams);
    }

    public static RequestBuilder<String> serveAdStitchCmd(String assetId)  {
        return serveAdStitchCmd(assetId, null);
    }

    public static RequestBuilder<String> serveAdStitchCmd(String assetId, String ffprobeJson)  {
        return serveAdStitchCmd(assetId, ffprobeJson, null);
    }

	/**  serve cmd line to transcode the ad  */
    public static RequestBuilder<String> serveAdStitchCmd(String assetId, String ffprobeJson, String duration)  {
        Params kparams = new Params();
        kparams.add("assetId", assetId);
        kparams.add("ffprobeJson", ffprobeJson);
        kparams.add("duration", duration);

        return new RequestBuilder<String>(String.class, "flavorasset", "serveAdStitchCmd", kparams);
    }

	/**  Set a given flavor as the original flavor  */
    public static RequestBuilder<Void> setAsSource(String assetId)  {
        Params kparams = new Params();
        kparams.add("assetId", assetId);

        return new NullRequestBuilder("flavorasset", "setAsSource", kparams);
    }

	/**  Update content of flavor asset  */
    public static RequestBuilder<FlavorAsset> setContent(String id, ContentResource contentResource)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("contentResource", contentResource);

        return new RequestBuilder<FlavorAsset>(FlavorAsset.class, "flavorasset", "setContent", kparams);
    }

	/**  Update flavor asset  */
    public static RequestBuilder<FlavorAsset> update(String id, FlavorAsset flavorAsset)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("flavorAsset", flavorAsset);

        return new RequestBuilder<FlavorAsset>(FlavorAsset.class, "flavorasset", "update", kparams);
    }
}
