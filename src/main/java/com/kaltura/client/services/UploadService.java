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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.types.UploadResponse;
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

public class UploadService {
	
	public static class GetUploadedFileTokenByFileNameUploadBuilder extends RequestBuilder<UploadResponse, UploadResponse.Tokenizer, GetUploadedFileTokenByFileNameUploadBuilder> {
		
		public GetUploadedFileTokenByFileNameUploadBuilder(String fileName) {
			super(UploadResponse.class, "upload", "getUploadedFileTokenByFileName");
			params.add("fileName", fileName);
		}
		
		public void fileName(String multirequestToken) {
			params.add("fileName", multirequestToken);
		}
	}

    public static GetUploadedFileTokenByFileNameUploadBuilder getUploadedFileTokenByFileName(String fileName)  {
		return new GetUploadedFileTokenByFileNameUploadBuilder(fileName);
	}
	
	public static class UploadUploadBuilder extends RequestBuilder<String, String, UploadUploadBuilder> {
		
		public UploadUploadBuilder(FileHolder fileData) {
			super(String.class, "upload", "upload");
			files = new Files();
			files.add("fileData", fileData);
		}
	}

	public static UploadUploadBuilder upload(File fileData)  {
		return upload(new FileHolder(fileData));
	}

	public static UploadUploadBuilder upload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return upload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
	}

	public static UploadUploadBuilder upload(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return upload(new FileHolder(fileData, fileDataMimeType, fileDataName));
	}

    public static UploadUploadBuilder upload(FileHolder fileData)  {
		return new UploadUploadBuilder(fileData);
	}
}
