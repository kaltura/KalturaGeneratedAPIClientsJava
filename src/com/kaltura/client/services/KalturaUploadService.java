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
// Copyright (C) 2006-2015  Kaltura Inc.
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

import com.kaltura.client.KalturaClient;
import com.kaltura.client.KalturaServiceBase;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.kaltura.client.KalturaFiles;
import com.kaltura.client.KalturaFile;
import org.w3c.dom.Element;
import com.kaltura.client.utils.ParseUtils;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import com.kaltura.client.types.*;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Tue, 23 Jun 15 03:40:46 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaUploadService extends KalturaServiceBase {
    public KalturaUploadService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public String upload(File fileData) throws KalturaApiException {
        return this.upload(new KalturaFile(fileData));
    }

    public String upload(InputStream fileData, String fileDataName, long fileDataSize) throws KalturaApiException {
        return this.upload(new KalturaFile(fileData, fileDataName, fileDataSize));
    }

    public String upload(FileInputStream fileData, String fileDataName) throws KalturaApiException {
        return this.upload(new KalturaFile(fileData, fileDataName));
    }

    public String upload(KalturaFile fileData) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        KalturaFiles kfiles = new KalturaFiles();
        kfiles.add("fileData", fileData);
        this.kalturaClient.queueServiceCall("upload", "upload", kparams, kfiles);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public KalturaUploadResponse getUploadedFileTokenByFileName(String fileName) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("fileName", fileName);
        this.kalturaClient.queueServiceCall("upload", "getUploadedFileTokenByFileName", kparams, KalturaUploadResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUploadResponse.class, resultXmlElement);
    }
}
