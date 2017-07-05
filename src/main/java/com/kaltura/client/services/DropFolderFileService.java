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
import com.kaltura.client.enums.DropFolderFileStatus;
import com.kaltura.client.types.DropFolderFile;
import com.kaltura.client.types.DropFolderFileFilter;
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

/**  DropFolderFile service lets you create and manage drop folder files  */
public class DropFolderFileService {

	/**  Allows you to add a new KalturaDropFolderFile object  */
    public static RequestBuilder<DropFolderFile> add(DropFolderFile dropFolderFile)  {
        Params kparams = new Params();
        kparams.add("dropFolderFile", dropFolderFile);

        return new RequestBuilder<DropFolderFile>(DropFolderFile.class, "dropfolder_dropfolderfile", "add", kparams);
    }

	/**  Mark the KalturaDropFolderFile object as deleted  */
    public static RequestBuilder<DropFolderFile> delete(int dropFolderFileId)  {
        Params kparams = new Params();
        kparams.add("dropFolderFileId", dropFolderFileId);

        return new RequestBuilder<DropFolderFile>(DropFolderFile.class, "dropfolder_dropfolderfile", "delete", kparams);
    }

	/**  Retrieve a KalturaDropFolderFile object by ID  */
    public static RequestBuilder<DropFolderFile> get(int dropFolderFileId)  {
        Params kparams = new Params();
        kparams.add("dropFolderFileId", dropFolderFileId);

        return new RequestBuilder<DropFolderFile>(DropFolderFile.class, "dropfolder_dropfolderfile", "get", kparams);
    }

	/**  Set the KalturaDropFolderFile status to ignore
	  (KalturaDropFolderFileStatus::IGNORE)  */
    public static RequestBuilder<DropFolderFile> ignore(int dropFolderFileId)  {
        Params kparams = new Params();
        kparams.add("dropFolderFileId", dropFolderFileId);

        return new RequestBuilder<DropFolderFile>(DropFolderFile.class, "dropfolder_dropfolderfile", "ignore", kparams);
    }

    public static RequestBuilder<ListResponse<DropFolderFile>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<DropFolderFile>> list(DropFolderFileFilter filter)  {
        return list(filter, null);
    }

	/**  List KalturaDropFolderFile objects  */
    public static RequestBuilder<ListResponse<DropFolderFile>> list(DropFolderFileFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<DropFolderFile>(DropFolderFile.class, "dropfolder_dropfolderfile", "list", kparams);
    }

	/**  Update an existing KalturaDropFolderFile object  */
    public static RequestBuilder<DropFolderFile> update(int dropFolderFileId, DropFolderFile dropFolderFile)  {
        Params kparams = new Params();
        kparams.add("dropFolderFileId", dropFolderFileId);
        kparams.add("dropFolderFile", dropFolderFile);

        return new RequestBuilder<DropFolderFile>(DropFolderFile.class, "dropfolder_dropfolderfile", "update", kparams);
    }

	/**  Update status of KalturaDropFolderFile  */
    public static RequestBuilder<DropFolderFile> updateStatus(int dropFolderFileId, DropFolderFileStatus status)  {
        Params kparams = new Params();
        kparams.add("dropFolderFileId", dropFolderFileId);
        kparams.add("status", status);

        return new RequestBuilder<DropFolderFile>(DropFolderFile.class, "dropfolder_dropfolderfile", "updateStatus", kparams);
    }
}
