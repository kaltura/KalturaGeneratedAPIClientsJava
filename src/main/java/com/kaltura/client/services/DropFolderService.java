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
import com.kaltura.client.types.DropFolder;
import com.kaltura.client.types.DropFolderFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  DropFolder service lets you create and manage drop folders  */
public class DropFolderService {

	/**  Allows you to add a new KalturaDropFolder object  */
    public static RequestBuilder<DropFolder> add(DropFolder dropFolder)  {
        Params kparams = new Params();
        kparams.add("dropFolder", dropFolder);

        return new RequestBuilder<DropFolder>(DropFolder.class, "dropfolder_dropfolder", "add", kparams);
    }

	/**  Mark the KalturaDropFolder object as deleted  */
    public static RequestBuilder<DropFolder> delete(int dropFolderId)  {
        Params kparams = new Params();
        kparams.add("dropFolderId", dropFolderId);

        return new RequestBuilder<DropFolder>(DropFolder.class, "dropfolder_dropfolder", "delete", kparams);
    }

    public static RequestBuilder<DropFolder> freeExclusiveDropFolder(int dropFolderId, int status)  {
        return freeExclusiveDropFolder(dropFolderId, status, null);
    }

    public static RequestBuilder<DropFolder> freeExclusiveDropFolder(int dropFolderId, int status, String errorCode)  {
        return freeExclusiveDropFolder(dropFolderId, status, errorCode, null);
    }

	/**  freeExclusive KalturaDropFolder object  */
    public static RequestBuilder<DropFolder> freeExclusiveDropFolder(int dropFolderId, int status, String errorCode, String errorDescription)  {
        Params kparams = new Params();
        kparams.add("dropFolderId", dropFolderId);
        kparams.add("status", status);
        kparams.add("errorCode", errorCode);
        kparams.add("errorDescription", errorDescription);

        return new RequestBuilder<DropFolder>(DropFolder.class, "dropfolder_dropfolder", "freeExclusiveDropFolder", kparams);
    }

	/**  Retrieve a KalturaDropFolder object by ID  */
    public static RequestBuilder<DropFolder> get(int dropFolderId)  {
        Params kparams = new Params();
        kparams.add("dropFolderId", dropFolderId);

        return new RequestBuilder<DropFolder>(DropFolder.class, "dropfolder_dropfolder", "get", kparams);
    }

	/**  getExclusive KalturaDropFolder object  */
    public static RequestBuilder<DropFolder> getExclusiveDropFolder(String tag, int maxTime)  {
        Params kparams = new Params();
        kparams.add("tag", tag);
        kparams.add("maxTime", maxTime);

        return new RequestBuilder<DropFolder>(DropFolder.class, "dropfolder_dropfolder", "getExclusiveDropFolder", kparams);
    }

    public static RequestBuilder<ListResponse<DropFolder>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<DropFolder>> list(DropFolderFilter filter)  {
        return list(filter, null);
    }

	/**  List KalturaDropFolder objects  */
    public static RequestBuilder<ListResponse<DropFolder>> list(DropFolderFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<DropFolder>(DropFolder.class, "dropfolder_dropfolder", "list", kparams);
    }

	/**  Update an existing KalturaDropFolder object  */
    public static RequestBuilder<DropFolder> update(int dropFolderId, DropFolder dropFolder)  {
        Params kparams = new Params();
        kparams.add("dropFolderId", dropFolderId);
        kparams.add("dropFolder", dropFolder);

        return new RequestBuilder<DropFolder>(DropFolder.class, "dropfolder_dropfolder", "update", kparams);
    }
}
