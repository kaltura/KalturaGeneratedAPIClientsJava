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
import com.kaltura.client.types.AttachmentAsset;
import com.kaltura.client.types.AttachmentServeOptions;
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

/**  Retrieve information and invoke actions on attachment Asset  */
public class AttachmentAssetService {

	/**  Add attachment asset  */
    public static RequestBuilder<AttachmentAsset> add(String entryId, AttachmentAsset attachmentAsset)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("attachmentAsset", attachmentAsset);

        return new RequestBuilder<AttachmentAsset>(AttachmentAsset.class, "attachment_attachmentasset", "add", kparams);
    }

    public static RequestBuilder<Void> delete(String attachmentAssetId)  {
        Params kparams = new Params();
        kparams.add("attachmentAssetId", attachmentAssetId);

        return new NullRequestBuilder("attachment_attachmentasset", "delete", kparams);
    }

    public static RequestBuilder<AttachmentAsset> get(String attachmentAssetId)  {
        Params kparams = new Params();
        kparams.add("attachmentAssetId", attachmentAssetId);

        return new RequestBuilder<AttachmentAsset>(AttachmentAsset.class, "attachment_attachmentasset", "get", kparams);
    }

	/**  Get remote storage existing paths for the asset  */
    public static RequestBuilder<ListResponse<RemotePath>> getRemotePaths(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new ListResponseRequestBuilder<RemotePath>(RemotePath.class, "attachment_attachmentasset", "getRemotePaths", kparams);
    }

    public static RequestBuilder<String> getUrl(String id)  {
        return getUrl(id, Integer.MIN_VALUE);
    }

	/**  Get download URL for the asset  */
    public static RequestBuilder<String> getUrl(String id, int storageId)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("storageId", storageId);

        return new RequestBuilder<String>(String.class, "attachment_attachmentasset", "getUrl", kparams);
    }

    public static RequestBuilder<ListResponse<AttachmentAsset>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<AttachmentAsset>> list(AssetFilter filter)  {
        return list(filter, null);
    }

	/**  List attachment Assets by filter and pager  */
    public static RequestBuilder<ListResponse<AttachmentAsset>> list(AssetFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<AttachmentAsset>(AttachmentAsset.class, "attachment_attachmentasset", "list", kparams);
    }

    public static RequestBuilder<String> serve(String attachmentAssetId)  {
        return serve(attachmentAssetId, null);
    }

	/**  Serves attachment by its id  */
    public static RequestBuilder<String> serve(String attachmentAssetId, AttachmentServeOptions serveOptions)  {
        Params kparams = new Params();
        kparams.add("attachmentAssetId", attachmentAssetId);
        kparams.add("serveOptions", serveOptions);

        return new ServeRequestBuilder("attachment_attachmentasset", "serve", kparams);
    }

	/**  Update content of attachment asset  */
    public static RequestBuilder<AttachmentAsset> setContent(String id, ContentResource contentResource)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("contentResource", contentResource);

        return new RequestBuilder<AttachmentAsset>(AttachmentAsset.class, "attachment_attachmentasset", "setContent", kparams);
    }

	/**  Update attachment asset  */
    public static RequestBuilder<AttachmentAsset> update(String id, AttachmentAsset attachmentAsset)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("attachmentAsset", attachmentAsset);

        return new RequestBuilder<AttachmentAsset>(AttachmentAsset.class, "attachment_attachmentasset", "update", kparams);
    }
}
