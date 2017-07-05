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
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.UploadToken;
import com.kaltura.client.types.UploadTokenFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class UploadTokenService {

    public static RequestBuilder<UploadToken> add()  {
        return add(null);
    }

	/**  Adds new upload token to upload a file  */
    public static RequestBuilder<UploadToken> add(UploadToken uploadToken)  {
        Params kparams = new Params();
        kparams.add("uploadToken", uploadToken);

        return new RequestBuilder<UploadToken>(UploadToken.class, "uploadtoken", "add", kparams);
    }

	/**  Deletes the upload token by upload token id  */
    public static RequestBuilder<Void> delete(String uploadTokenId)  {
        Params kparams = new Params();
        kparams.add("uploadTokenId", uploadTokenId);

        return new NullRequestBuilder("uploadtoken", "delete", kparams);
    }

	/**  Get upload token by id  */
    public static RequestBuilder<UploadToken> get(String uploadTokenId)  {
        Params kparams = new Params();
        kparams.add("uploadTokenId", uploadTokenId);

        return new RequestBuilder<UploadToken>(UploadToken.class, "uploadtoken", "get", kparams);
    }

    public static RequestBuilder<ListResponse<UploadToken>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<UploadToken>> list(UploadTokenFilter filter)  {
        return list(filter, null);
    }

	/**  List upload token by filter with pager support.    When using a user session the
	  service will be restricted to users objects only.  */
    public static RequestBuilder<ListResponse<UploadToken>> list(UploadTokenFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<UploadToken>(UploadToken.class, "uploadtoken", "list", kparams);
    }

    public static RequestBuilder<UploadToken> upload(String uploadTokenId, FileHolder fileData)  {
        return upload(uploadTokenId, fileData, false);
    }

    public static RequestBuilder<UploadToken> upload(String uploadTokenId, File fileData)  {
        return upload(uploadTokenId, new FileHolder(fileData), false);
    }

    public static RequestBuilder<UploadToken> upload(String uploadTokenId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
        return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), false);
    }

    public static RequestBuilder<UploadToken> upload(String uploadTokenId, FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
        return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName), false);
    }

    public static RequestBuilder<UploadToken> upload(String uploadTokenId, FileHolder fileData, boolean resume)  {
        return upload(uploadTokenId, fileData, resume, true);
    }

    public static RequestBuilder<UploadToken> upload(String uploadTokenId, File fileData, boolean resume)  {
        return upload(uploadTokenId, new FileHolder(fileData), resume, true);
    }

    public static RequestBuilder<UploadToken> upload(String uploadTokenId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, boolean resume)  {
        return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), resume, true);
    }

    public static RequestBuilder<UploadToken> upload(String uploadTokenId, FileInputStream fileData, String fileDataMimeType, String fileDataName, boolean resume)  {
        return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName), resume, true);
    }

    public static RequestBuilder<UploadToken> upload(String uploadTokenId, FileHolder fileData, boolean resume, boolean finalChunk)  {
        return upload(uploadTokenId, fileData, resume, finalChunk, -1);
    }

    public static RequestBuilder<UploadToken> upload(String uploadTokenId, File fileData, boolean resume, boolean finalChunk)  {
        return upload(uploadTokenId, new FileHolder(fileData), resume, finalChunk, -1);
    }

    public static RequestBuilder<UploadToken> upload(String uploadTokenId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, boolean resume, boolean finalChunk)  {
        return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), resume, finalChunk, -1);
    }

    public static RequestBuilder<UploadToken> upload(String uploadTokenId, FileInputStream fileData, String fileDataMimeType, String fileDataName, boolean resume, boolean finalChunk)  {
        return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName), resume, finalChunk, -1);
    }

    public static RequestBuilder<UploadToken> upload(String uploadTokenId, File fileData, boolean resume, boolean finalChunk, double resumeAt)  {
        return upload(uploadTokenId, new FileHolder(fileData), resume, finalChunk, resumeAt);
    }

    public static RequestBuilder<UploadToken> upload(String uploadTokenId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, boolean resume, boolean finalChunk, double resumeAt)  {
        return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), resume, finalChunk, resumeAt);
    }

    public static RequestBuilder<UploadToken> upload(String uploadTokenId, FileInputStream fileData, String fileDataMimeType, String fileDataName, boolean resume, boolean finalChunk, double resumeAt)  {
        return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName), resume, finalChunk, resumeAt);
    }

	/**  Upload a file using the upload token id, returns an error on failure (an
	  exception will be thrown when using one of the Kaltura clients)   Chunks can be
	  uploaded in parallel and they will be appended according to their resumeAt
	  position.   A parallel upload session should have three stages:   1. A single
	  upload with resume=false and finalChunk=false   2. Parallel upload requests each
	  with resume=true,finalChunk=false and the expected resumetAt position.   If a
	  chunk fails to upload it can be re-uploaded.   3. After all of the chunks have
	  been uploaded a final chunk (can be of zero size) should be uploaded    with
	  resume=true, finalChunk=true and the expected resumeAt position. In case an
	  UPLOAD_TOKEN_CANNOT_MATCH_EXPECTED_SIZE exception   has been returned
	  (indicating not all of the chunks were appended yet) the final request can be
	  retried.  */
    public static RequestBuilder<UploadToken> upload(String uploadTokenId, FileHolder fileData, boolean resume, boolean finalChunk, double resumeAt)  {
        Params kparams = new Params();
        kparams.add("uploadTokenId", uploadTokenId);
        Files kfiles = new Files();
        kfiles.add("fileData", fileData);
        kparams.add("resume", resume);
        kparams.add("finalChunk", finalChunk);
        kparams.add("resumeAt", resumeAt);

        return new RequestBuilder<UploadToken>(UploadToken.class, "uploadtoken", "upload", kparams, kfiles);
    }
}
