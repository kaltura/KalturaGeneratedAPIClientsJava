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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.UploadToken;
import com.kaltura.client.types.UploadTokenFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class UploadTokenService {
	
	public static class AddUploadTokenBuilder extends RequestBuilder<UploadToken, UploadToken.Tokenizer, AddUploadTokenBuilder> {
		
		public AddUploadTokenBuilder(UploadToken uploadToken) {
			super(UploadToken.class, "uploadtoken", "add");
			params.add("uploadToken", uploadToken);
		}
	}

	public static AddUploadTokenBuilder add()  {
		return add(null);
	}

	/**
	 * Adds new upload token to upload a file
	 * 
	 * @param uploadToken 
	 */
    public static AddUploadTokenBuilder add(UploadToken uploadToken)  {
		return new AddUploadTokenBuilder(uploadToken);
	}
	
	public static class DeleteUploadTokenBuilder extends NullRequestBuilder {
		
		public DeleteUploadTokenBuilder(String uploadTokenId) {
			super("uploadtoken", "delete");
			params.add("uploadTokenId", uploadTokenId);
		}
		
		public void uploadTokenId(String multirequestToken) {
			params.add("uploadTokenId", multirequestToken);
		}
	}

	/**
	 * Deletes the upload token by upload token id
	 * 
	 * @param uploadTokenId 
	 */
    public static DeleteUploadTokenBuilder delete(String uploadTokenId)  {
		return new DeleteUploadTokenBuilder(uploadTokenId);
	}
	
	public static class GetUploadTokenBuilder extends RequestBuilder<UploadToken, UploadToken.Tokenizer, GetUploadTokenBuilder> {
		
		public GetUploadTokenBuilder(String uploadTokenId) {
			super(UploadToken.class, "uploadtoken", "get");
			params.add("uploadTokenId", uploadTokenId);
		}
		
		public void uploadTokenId(String multirequestToken) {
			params.add("uploadTokenId", multirequestToken);
		}
	}

	/**
	 * Get upload token by id
	 * 
	 * @param uploadTokenId 
	 */
    public static GetUploadTokenBuilder get(String uploadTokenId)  {
		return new GetUploadTokenBuilder(uploadTokenId);
	}
	
	public static class ListUploadTokenBuilder extends ListResponseRequestBuilder<UploadToken, UploadToken.Tokenizer, ListUploadTokenBuilder> {
		
		public ListUploadTokenBuilder(UploadTokenFilter filter, FilterPager pager) {
			super(UploadToken.class, "uploadtoken", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListUploadTokenBuilder list()  {
		return list(null);
	}

	public static ListUploadTokenBuilder list(UploadTokenFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List upload token by filter with pager support.    When using a user session the
	  service will be restricted to users objects only.
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListUploadTokenBuilder list(UploadTokenFilter filter, FilterPager pager)  {
		return new ListUploadTokenBuilder(filter, pager);
	}
	
	public static class UploadUploadTokenBuilder extends RequestBuilder<UploadToken, UploadToken.Tokenizer, UploadUploadTokenBuilder> {
		
		public UploadUploadTokenBuilder(String uploadTokenId, FileHolder fileData, boolean resume, boolean finalChunk, double resumeAt) {
			super(UploadToken.class, "uploadtoken", "upload");
			params.add("uploadTokenId", uploadTokenId);
			files = new Files();
			files.add("fileData", fileData);
			params.add("resume", resume);
			params.add("finalChunk", finalChunk);
			params.add("resumeAt", resumeAt);
		}
		
		public void uploadTokenId(String multirequestToken) {
			params.add("uploadTokenId", multirequestToken);
		}
		
		public void resume(String multirequestToken) {
			params.add("resume", multirequestToken);
		}
		
		public void finalChunk(String multirequestToken) {
			params.add("finalChunk", multirequestToken);
		}
		
		public void resumeAt(String multirequestToken) {
			params.add("resumeAt", multirequestToken);
		}
	}

	public static UploadUploadTokenBuilder upload(String uploadTokenId, FileHolder fileData)  {
		return upload(uploadTokenId, fileData, false);
	}

	public static UploadUploadTokenBuilder upload(String uploadTokenId, File fileData)  {
		return upload(uploadTokenId, new FileHolder(fileData), false);
	}

	public static UploadUploadTokenBuilder upload(String uploadTokenId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), false);
	}

	public static UploadUploadTokenBuilder upload(String uploadTokenId, FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName), false);
	}

	public static UploadUploadTokenBuilder upload(String uploadTokenId, FileHolder fileData, boolean resume)  {
		return upload(uploadTokenId, fileData, resume, true);
	}

	public static UploadUploadTokenBuilder upload(String uploadTokenId, File fileData, boolean resume)  {
		return upload(uploadTokenId, new FileHolder(fileData), resume, true);
	}

	public static UploadUploadTokenBuilder upload(String uploadTokenId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, boolean resume)  {
		return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), resume, true);
	}

	public static UploadUploadTokenBuilder upload(String uploadTokenId, FileInputStream fileData, String fileDataMimeType, String fileDataName, boolean resume)  {
		return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName), resume, true);
	}

	public static UploadUploadTokenBuilder upload(String uploadTokenId, FileHolder fileData, boolean resume, boolean finalChunk)  {
		return upload(uploadTokenId, fileData, resume, finalChunk, -1);
	}

	public static UploadUploadTokenBuilder upload(String uploadTokenId, File fileData, boolean resume, boolean finalChunk)  {
		return upload(uploadTokenId, new FileHolder(fileData), resume, finalChunk, -1);
	}

	public static UploadUploadTokenBuilder upload(String uploadTokenId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, boolean resume, boolean finalChunk)  {
		return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), resume, finalChunk, -1);
	}

	public static UploadUploadTokenBuilder upload(String uploadTokenId, FileInputStream fileData, String fileDataMimeType, String fileDataName, boolean resume, boolean finalChunk)  {
		return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName), resume, finalChunk, -1);
	}

	public static UploadUploadTokenBuilder upload(String uploadTokenId, File fileData, boolean resume, boolean finalChunk, double resumeAt)  {
		return upload(uploadTokenId, new FileHolder(fileData), resume, finalChunk, resumeAt);
	}

	public static UploadUploadTokenBuilder upload(String uploadTokenId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, boolean resume, boolean finalChunk, double resumeAt)  {
		return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), resume, finalChunk, resumeAt);
	}

	public static UploadUploadTokenBuilder upload(String uploadTokenId, FileInputStream fileData, String fileDataMimeType, String fileDataName, boolean resume, boolean finalChunk, double resumeAt)  {
		return upload(uploadTokenId, new FileHolder(fileData, fileDataMimeType, fileDataName), resume, finalChunk, resumeAt);
	}

	/**
	 * Upload a file using the upload token id, returns an error on failure (an
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
	  retried.
	 * 
	 * @param uploadTokenId 
	 * @param fileData 
	 * @param resume 
	 * @param finalChunk 
	 * @param resumeAt 
	 */
    public static UploadUploadTokenBuilder upload(String uploadTokenId, FileHolder fileData, boolean resume, boolean finalChunk, double resumeAt)  {
		return new UploadUploadTokenBuilder(uploadTokenId, fileData, resume, finalChunk, resumeAt);
	}
}
