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
import com.kaltura.client.types.ContentResource;
import com.kaltura.client.types.FileAsset;
import com.kaltura.client.types.FileAssetFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
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

/**  Manage file assets  */
public class FileAssetService {

	/**  Add new file asset  */
    public static RequestBuilder<FileAsset> add(FileAsset fileAsset)  {
        Params kparams = new Params();
        kparams.add("fileAsset", fileAsset);

        return new RequestBuilder<FileAsset>(FileAsset.class, "fileasset", "add", kparams);
    }

	/**  Delete file asset by id  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("fileasset", "delete", kparams);
    }

	/**  Get file asset by id  */
    public static RequestBuilder<FileAsset> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<FileAsset>(FileAsset.class, "fileasset", "get", kparams);
    }

    public static RequestBuilder<ListResponse<FileAsset>> list(FileAssetFilter filter)  {
        return list(filter, null);
    }

	/**  List file assets by filter and pager  */
    public static RequestBuilder<ListResponse<FileAsset>> list(FileAssetFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<FileAsset>(FileAsset.class, "fileasset", "list", kparams);
    }

	/**  Serve file asset by id  */
    public static RequestBuilder<String> serve(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new ServeRequestBuilder("fileasset", "serve", kparams);
    }

	/**  Set content of file asset  */
    public static RequestBuilder<FileAsset> setContent(String id, ContentResource contentResource)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("contentResource", contentResource);

        return new RequestBuilder<FileAsset>(FileAsset.class, "fileasset", "setContent", kparams);
    }

	/**  Update file asset by id  */
    public static RequestBuilder<FileAsset> update(int id, FileAsset fileAsset)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("fileAsset", fileAsset);

        return new RequestBuilder<FileAsset>(FileAsset.class, "fileasset", "update", kparams);
    }
}
