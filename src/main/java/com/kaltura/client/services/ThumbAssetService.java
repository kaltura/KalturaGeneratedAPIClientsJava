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
import com.kaltura.client.Params;
import com.kaltura.client.types.AssetFilter;
import com.kaltura.client.types.ContentResource;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.FlavorAsset;
import com.kaltura.client.types.ListResponse;
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
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Retrieve information and invoke actions on Thumb Asset  */
public class ThumbAssetService {

	/**  Add thumbnail asset  */
    public static RequestBuilder<ThumbAsset> add(String entryId, ThumbAsset thumbAsset)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("thumbAsset", thumbAsset);

        return new RequestBuilder<ThumbAsset>(ThumbAsset.class, "thumbasset", "add", kparams);
    }

    public static RequestBuilder<ThumbAsset> addFromImage(String entryId, File fileData)  {
        return addFromImage(entryId, new FileHolder(fileData));
    }

    public static RequestBuilder<ThumbAsset> addFromImage(String entryId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
        return addFromImage(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
    }

    public static RequestBuilder<ThumbAsset> addFromImage(String entryId, FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
        return addFromImage(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName));
    }

    public static RequestBuilder<ThumbAsset> addFromImage(String entryId, FileHolder fileData)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        Files kfiles = new Files();
        kfiles.add("fileData", fileData);

        return new RequestBuilder<ThumbAsset>(ThumbAsset.class, "thumbasset", "addFromImage", kparams, kfiles);
    }

    public static RequestBuilder<ThumbAsset> addFromUrl(String entryId, String url)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("url", url);

        return new RequestBuilder<ThumbAsset>(ThumbAsset.class, "thumbasset", "addFromUrl", kparams);
    }

    public static RequestBuilder<Void> delete(String thumbAssetId)  {
        Params kparams = new Params();
        kparams.add("thumbAssetId", thumbAssetId);

        return new NullRequestBuilder("thumbasset", "delete", kparams);
    }

	/**  manually export an asset  */
    public static RequestBuilder<FlavorAsset> export(String assetId, int storageProfileId)  {
        Params kparams = new Params();
        kparams.add("assetId", assetId);
        kparams.add("storageProfileId", storageProfileId);

        return new RequestBuilder<FlavorAsset>(FlavorAsset.class, "thumbasset", "export", kparams);
    }

    public static RequestBuilder<ThumbAsset> generate(String entryId, ThumbParams thumbParams)  {
        return generate(entryId, thumbParams, null);
    }

    public static RequestBuilder<ThumbAsset> generate(String entryId, ThumbParams thumbParams, String sourceAssetId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("thumbParams", thumbParams);
        kparams.add("sourceAssetId", sourceAssetId);

        return new RequestBuilder<ThumbAsset>(ThumbAsset.class, "thumbasset", "generate", kparams);
    }

    public static RequestBuilder<ThumbAsset> generateByEntryId(String entryId, int destThumbParamsId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("destThumbParamsId", destThumbParamsId);

        return new RequestBuilder<ThumbAsset>(ThumbAsset.class, "thumbasset", "generateByEntryId", kparams);
    }

    public static RequestBuilder<ThumbAsset> get(String thumbAssetId)  {
        Params kparams = new Params();
        kparams.add("thumbAssetId", thumbAssetId);

        return new RequestBuilder<ThumbAsset>(ThumbAsset.class, "thumbasset", "get", kparams);
    }

    public static RequestBuilder<List<ThumbAsset>> getByEntryId(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new ArrayRequestBuilder<ThumbAsset>(ThumbAsset.class, "thumbasset", "getByEntryId", kparams);
    }

	/**  Get remote storage existing paths for the asset  */
    public static RequestBuilder<ListResponse<RemotePath>> getRemotePaths(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new ListResponseRequestBuilder<RemotePath>(RemotePath.class, "thumbasset", "getRemotePaths", kparams);
    }

    public static RequestBuilder<String> getUrl(String id)  {
        return getUrl(id, Integer.MIN_VALUE);
    }

    public static RequestBuilder<String> getUrl(String id, int storageId)  {
        return getUrl(id, storageId, null);
    }

	/**  Get download URL for the asset  */
    public static RequestBuilder<String> getUrl(String id, int storageId, ThumbParams thumbParams)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("storageId", storageId);
        kparams.add("thumbParams", thumbParams);

        return new RequestBuilder<String>(String.class, "thumbasset", "getUrl", kparams);
    }

    public static RequestBuilder<ListResponse<ThumbAsset>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<ThumbAsset>> list(AssetFilter filter)  {
        return list(filter, null);
    }

	/**  List Thumbnail Assets by filter and pager  */
    public static RequestBuilder<ListResponse<ThumbAsset>> list(AssetFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<ThumbAsset>(ThumbAsset.class, "thumbasset", "list", kparams);
    }

    public static RequestBuilder<ThumbAsset> regenerate(String thumbAssetId)  {
        Params kparams = new Params();
        kparams.add("thumbAssetId", thumbAssetId);

        return new RequestBuilder<ThumbAsset>(ThumbAsset.class, "thumbasset", "regenerate", kparams);
    }

    public static RequestBuilder<String> serve(String thumbAssetId)  {
        return serve(thumbAssetId, Integer.MIN_VALUE);
    }

    public static RequestBuilder<String> serve(String thumbAssetId, int version)  {
        return serve(thumbAssetId, version, null);
    }

    public static RequestBuilder<String> serve(String thumbAssetId, int version, ThumbParams thumbParams)  {
        return serve(thumbAssetId, version, thumbParams, null);
    }

	/**  Serves thumbnail by its id  */
    public static RequestBuilder<String> serve(String thumbAssetId, int version, ThumbParams thumbParams, ThumbnailServeOptions options)  {
        Params kparams = new Params();
        kparams.add("thumbAssetId", thumbAssetId);
        kparams.add("version", version);
        kparams.add("thumbParams", thumbParams);
        kparams.add("options", options);

        return new ServeRequestBuilder("thumbasset", "serve", kparams);
    }

    public static RequestBuilder<String> serveByEntryId(String entryId)  {
        return serveByEntryId(entryId, Integer.MIN_VALUE);
    }

	/**  Serves thumbnail by entry id and thumnail params id  */
    public static RequestBuilder<String> serveByEntryId(String entryId, int thumbParamId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("thumbParamId", thumbParamId);

        return new ServeRequestBuilder("thumbasset", "serveByEntryId", kparams);
    }

	/**  Tags the thumbnail as DEFAULT_THUMB and removes that tag from all other
	  thumbnail assets of the entry.   Create a new file sync link on the entry
	  thumbnail that points to the thumbnail asset file sync.  */
    public static RequestBuilder<Void> setAsDefault(String thumbAssetId)  {
        Params kparams = new Params();
        kparams.add("thumbAssetId", thumbAssetId);

        return new NullRequestBuilder("thumbasset", "setAsDefault", kparams);
    }

	/**  Update content of thumbnail asset  */
    public static RequestBuilder<ThumbAsset> setContent(String id, ContentResource contentResource)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("contentResource", contentResource);

        return new RequestBuilder<ThumbAsset>(ThumbAsset.class, "thumbasset", "setContent", kparams);
    }

	/**  Update thumbnail asset  */
    public static RequestBuilder<ThumbAsset> update(String id, ThumbAsset thumbAsset)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("thumbAsset", thumbAsset);

        return new RequestBuilder<ThumbAsset>(ThumbAsset.class, "thumbasset", "update", kparams);
    }
}
