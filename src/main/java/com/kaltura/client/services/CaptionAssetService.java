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
import com.kaltura.client.types.CaptionAsset;
import com.kaltura.client.types.ContentResource;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.RemotePath;
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

/**  Retrieve information and invoke actions on caption Asset  */
public class CaptionAssetService {

	/**  Add caption asset  */
    public static RequestBuilder<CaptionAsset> add(String entryId, CaptionAsset captionAsset)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("captionAsset", captionAsset);

        return new RequestBuilder<CaptionAsset>(CaptionAsset.class, "caption_captionasset", "add", kparams);
    }

    public static RequestBuilder<Void> delete(String captionAssetId)  {
        Params kparams = new Params();
        kparams.add("captionAssetId", captionAssetId);

        return new NullRequestBuilder("caption_captionasset", "delete", kparams);
    }

    public static RequestBuilder<CaptionAsset> get(String captionAssetId)  {
        Params kparams = new Params();
        kparams.add("captionAssetId", captionAssetId);

        return new RequestBuilder<CaptionAsset>(CaptionAsset.class, "caption_captionasset", "get", kparams);
    }

	/**  Get remote storage existing paths for the asset  */
    public static RequestBuilder<ListResponse<RemotePath>> getRemotePaths(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new ListResponseRequestBuilder<RemotePath>(RemotePath.class, "caption_captionasset", "getRemotePaths", kparams);
    }

    public static RequestBuilder<String> getUrl(String id)  {
        return getUrl(id, Integer.MIN_VALUE);
    }

	/**  Get download URL for the asset  */
    public static RequestBuilder<String> getUrl(String id, int storageId)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("storageId", storageId);

        return new RequestBuilder<String>(String.class, "caption_captionasset", "getUrl", kparams);
    }

    public static RequestBuilder<ListResponse<CaptionAsset>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<CaptionAsset>> list(AssetFilter filter)  {
        return list(filter, null);
    }

	/**  List caption Assets by filter and pager  */
    public static RequestBuilder<ListResponse<CaptionAsset>> list(AssetFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<CaptionAsset>(CaptionAsset.class, "caption_captionasset", "list", kparams);
    }

	/**  Serves caption by its id  */
    public static RequestBuilder<String> serve(String captionAssetId)  {
        Params kparams = new Params();
        kparams.add("captionAssetId", captionAssetId);

        return new ServeRequestBuilder("caption_captionasset", "serve", kparams);
    }

    public static RequestBuilder<String> serveByEntryId(String entryId)  {
        return serveByEntryId(entryId, Integer.MIN_VALUE);
    }

	/**  Serves caption by entry id and thumnail params id  */
    public static RequestBuilder<String> serveByEntryId(String entryId, int captionParamId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("captionParamId", captionParamId);

        return new ServeRequestBuilder("caption_captionasset", "serveByEntryId", kparams);
    }

    public static RequestBuilder<String> serveWebVTT(String captionAssetId)  {
        return serveWebVTT(captionAssetId, 30);
    }

    public static RequestBuilder<String> serveWebVTT(String captionAssetId, int segmentDuration)  {
        return serveWebVTT(captionAssetId, segmentDuration, Integer.MIN_VALUE);
    }

    public static RequestBuilder<String> serveWebVTT(String captionAssetId, int segmentDuration, int segmentIndex)  {
        return serveWebVTT(captionAssetId, segmentDuration, segmentIndex, 10000);
    }

	/**  Serves caption by its id converting it to segmented WebVTT  */
    public static RequestBuilder<String> serveWebVTT(String captionAssetId, int segmentDuration, int segmentIndex, int localTimestamp)  {
        Params kparams = new Params();
        kparams.add("captionAssetId", captionAssetId);
        kparams.add("segmentDuration", segmentDuration);
        kparams.add("segmentIndex", segmentIndex);
        kparams.add("localTimestamp", localTimestamp);

        return new ServeRequestBuilder("caption_captionasset", "serveWebVTT", kparams);
    }

	/**  Markss the caption as default and removes that mark from all other caption
	  assets of the entry.  */
    public static RequestBuilder<Void> setAsDefault(String captionAssetId)  {
        Params kparams = new Params();
        kparams.add("captionAssetId", captionAssetId);

        return new NullRequestBuilder("caption_captionasset", "setAsDefault", kparams);
    }

	/**  Update content of caption asset  */
    public static RequestBuilder<CaptionAsset> setContent(String id, ContentResource contentResource)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("contentResource", contentResource);

        return new RequestBuilder<CaptionAsset>(CaptionAsset.class, "caption_captionasset", "setContent", kparams);
    }

	/**  Update caption asset  */
    public static RequestBuilder<CaptionAsset> update(String id, CaptionAsset captionAsset)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("captionAsset", captionAsset);

        return new RequestBuilder<CaptionAsset>(CaptionAsset.class, "caption_captionasset", "update", kparams);
    }
}
