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
import com.kaltura.client.enums.MetadataObjectType;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.Metadata;
import com.kaltura.client.types.MetadataFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Metadata service  */
public class MetadataService {

	/**  Allows you to add a metadata object and metadata content associated with Kaltura
	  object  */
    public static RequestBuilder<Metadata> add(int metadataProfileId, MetadataObjectType objectType, String objectId, String xmlData)  {
        Params kparams = new Params();
        kparams.add("metadataProfileId", metadataProfileId);
        kparams.add("objectType", objectType);
        kparams.add("objectId", objectId);
        kparams.add("xmlData", xmlData);

        return new RequestBuilder<Metadata>(Metadata.class, "metadata_metadata", "add", kparams);
    }

	/**  Allows you to add a metadata xml data from remote URL.   Enables different
	  permissions than addFromUrl action.  */
    public static RequestBuilder<Metadata> addFromBulk(int metadataProfileId, MetadataObjectType objectType, String objectId, String url)  {
        Params kparams = new Params();
        kparams.add("metadataProfileId", metadataProfileId);
        kparams.add("objectType", objectType);
        kparams.add("objectId", objectId);
        kparams.add("url", url);

        return new RequestBuilder<Metadata>(Metadata.class, "metadata_metadata", "addFromBulk", kparams);
    }

    public static RequestBuilder<Metadata> addFromFile(int metadataProfileId, MetadataObjectType objectType, String objectId, File xmlFile)  {
        return addFromFile(metadataProfileId, objectType, objectId, new FileHolder(xmlFile));
    }

    public static RequestBuilder<Metadata> addFromFile(int metadataProfileId, MetadataObjectType objectType, String objectId, InputStream xmlFile, String xmlFileMimeType, String xmlFileName, long xmlFileSize)  {
        return addFromFile(metadataProfileId, objectType, objectId, new FileHolder(xmlFile, xmlFileMimeType, xmlFileName, xmlFileSize));
    }

    public static RequestBuilder<Metadata> addFromFile(int metadataProfileId, MetadataObjectType objectType, String objectId, FileInputStream xmlFile, String xmlFileMimeType, String xmlFileName)  {
        return addFromFile(metadataProfileId, objectType, objectId, new FileHolder(xmlFile, xmlFileMimeType, xmlFileName));
    }

	/**  Allows you to add a metadata object and metadata file associated with Kaltura
	  object  */
    public static RequestBuilder<Metadata> addFromFile(int metadataProfileId, MetadataObjectType objectType, String objectId, FileHolder xmlFile)  {
        Params kparams = new Params();
        kparams.add("metadataProfileId", metadataProfileId);
        kparams.add("objectType", objectType);
        kparams.add("objectId", objectId);
        Files kfiles = new Files();
        kfiles.add("xmlFile", xmlFile);

        return new RequestBuilder<Metadata>(Metadata.class, "metadata_metadata", "addFromFile", kparams, kfiles);
    }

	/**  Allows you to add a metadata xml data from remote URL  */
    public static RequestBuilder<Metadata> addFromUrl(int metadataProfileId, MetadataObjectType objectType, String objectId, String url)  {
        Params kparams = new Params();
        kparams.add("metadataProfileId", metadataProfileId);
        kparams.add("objectType", objectType);
        kparams.add("objectId", objectId);
        kparams.add("url", url);

        return new RequestBuilder<Metadata>(Metadata.class, "metadata_metadata", "addFromUrl", kparams);
    }

	/**  Delete an existing metadata  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("metadata_metadata", "delete", kparams);
    }

	/**  Retrieve a metadata object by id  */
    public static RequestBuilder<Metadata> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Metadata>(Metadata.class, "metadata_metadata", "get", kparams);
    }

	/**  Index metadata by id, will also index the related object  */
    public static RequestBuilder<Integer> index(String id, boolean shouldUpdate)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("shouldUpdate", shouldUpdate);

        return new RequestBuilder<Integer>(Integer.class, "metadata_metadata", "index", kparams);
    }

    public static RequestBuilder<Void> invalidate(int id)  {
        return invalidate(id, Integer.MIN_VALUE);
    }

	/**  Mark existing metadata as invalid   Used by batch metadata transform  */
    public static RequestBuilder<Void> invalidate(int id, int version)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("version", version);

        return new NullRequestBuilder("metadata_metadata", "invalidate", kparams);
    }

    public static RequestBuilder<ListResponse<Metadata>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<Metadata>> list(MetadataFilter filter)  {
        return list(filter, null);
    }

	/**  List metadata objects by filter and pager  */
    public static RequestBuilder<ListResponse<Metadata>> list(MetadataFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<Metadata>(Metadata.class, "metadata_metadata", "list", kparams);
    }

	/**  Serves metadata XML file  */
    public static RequestBuilder<String> serve(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new ServeRequestBuilder("metadata_metadata", "serve", kparams);
    }

    public static RequestBuilder<Metadata> update(int id)  {
        return update(id, null);
    }

    public static RequestBuilder<Metadata> update(int id, String xmlData)  {
        return update(id, xmlData, Integer.MIN_VALUE);
    }

	/**  Update an existing metadata object with new XML content  */
    public static RequestBuilder<Metadata> update(int id, String xmlData, int version)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("xmlData", xmlData);
        kparams.add("version", version);

        return new RequestBuilder<Metadata>(Metadata.class, "metadata_metadata", "update", kparams);
    }

    public static RequestBuilder<Metadata> updateFromFile(int id)  {
        return updateFromFile(id, (FileHolder)null);
    }

    public static RequestBuilder<Metadata> updateFromFile(int id, File xmlFile)  {
        return updateFromFile(id, new FileHolder(xmlFile));
    }

    public static RequestBuilder<Metadata> updateFromFile(int id, InputStream xmlFile, String xmlFileMimeType, String xmlFileName, long xmlFileSize)  {
        return updateFromFile(id, new FileHolder(xmlFile, xmlFileMimeType, xmlFileName, xmlFileSize));
    }

    public static RequestBuilder<Metadata> updateFromFile(int id, FileInputStream xmlFile, String xmlFileMimeType, String xmlFileName)  {
        return updateFromFile(id, new FileHolder(xmlFile, xmlFileMimeType, xmlFileName));
    }

	/**  Update an existing metadata object with new XML file  */
    public static RequestBuilder<Metadata> updateFromFile(int id, FileHolder xmlFile)  {
        Params kparams = new Params();
        kparams.add("id", id);
        Files kfiles = new Files();
        kfiles.add("xmlFile", xmlFile);

        return new RequestBuilder<Metadata>(Metadata.class, "metadata_metadata", "updateFromFile", kparams, kfiles);
    }

    public static RequestBuilder<Metadata> updateFromXSL(int id, File xslFile)  {
        return updateFromXSL(id, new FileHolder(xslFile));
    }

    public static RequestBuilder<Metadata> updateFromXSL(int id, InputStream xslFile, String xslFileMimeType, String xslFileName, long xslFileSize)  {
        return updateFromXSL(id, new FileHolder(xslFile, xslFileMimeType, xslFileName, xslFileSize));
    }

    public static RequestBuilder<Metadata> updateFromXSL(int id, FileInputStream xslFile, String xslFileMimeType, String xslFileName)  {
        return updateFromXSL(id, new FileHolder(xslFile, xslFileMimeType, xslFileName));
    }

	/**  Action transforms current metadata object XML using a provided XSL.  */
    public static RequestBuilder<Metadata> updateFromXSL(int id, FileHolder xslFile)  {
        Params kparams = new Params();
        kparams.add("id", id);
        Files kfiles = new Files();
        kfiles.add("xslFile", xslFile);

        return new RequestBuilder<Metadata>(Metadata.class, "metadata_metadata", "updateFromXSL", kparams, kfiles);
    }
}
