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
import com.kaltura.client.types.ConversionAttribute;
import com.kaltura.client.types.DocumentEntry;
import com.kaltura.client.types.DocumentEntryFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.Resource;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Document service lets you upload and manage document files  */
public class DocumentsService {

    public static RequestBuilder<DocumentEntry> addFromEntry(String sourceEntryId)  {
        return addFromEntry(sourceEntryId, null);
    }

    public static RequestBuilder<DocumentEntry> addFromEntry(String sourceEntryId, DocumentEntry documentEntry)  {
        return addFromEntry(sourceEntryId, documentEntry, Integer.MIN_VALUE);
    }

	/**  Copy entry into new entry  */
    public static RequestBuilder<DocumentEntry> addFromEntry(String sourceEntryId, DocumentEntry documentEntry, int sourceFlavorParamsId)  {
        Params kparams = new Params();
        kparams.add("sourceEntryId", sourceEntryId);
        kparams.add("documentEntry", documentEntry);
        kparams.add("sourceFlavorParamsId", sourceFlavorParamsId);

        return new RequestBuilder<DocumentEntry>(DocumentEntry.class, "document_documents", "addFromEntry", kparams);
    }

    public static RequestBuilder<DocumentEntry> addFromFlavorAsset(String sourceFlavorAssetId)  {
        return addFromFlavorAsset(sourceFlavorAssetId, null);
    }

	/**  Copy flavor asset into new entry  */
    public static RequestBuilder<DocumentEntry> addFromFlavorAsset(String sourceFlavorAssetId, DocumentEntry documentEntry)  {
        Params kparams = new Params();
        kparams.add("sourceFlavorAssetId", sourceFlavorAssetId);
        kparams.add("documentEntry", documentEntry);

        return new RequestBuilder<DocumentEntry>(DocumentEntry.class, "document_documents", "addFromFlavorAsset", kparams);
    }

	/**  Add new document entry after the specific document file was uploaded and the
	  upload token id exists  */
    public static RequestBuilder<DocumentEntry> addFromUploadedFile(DocumentEntry documentEntry, String uploadTokenId)  {
        Params kparams = new Params();
        kparams.add("documentEntry", documentEntry);
        kparams.add("uploadTokenId", uploadTokenId);

        return new RequestBuilder<DocumentEntry>(DocumentEntry.class, "document_documents", "addFromUploadedFile", kparams);
    }

	/**  Approves document replacement  */
    public static RequestBuilder<DocumentEntry> approveReplace(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new RequestBuilder<DocumentEntry>(DocumentEntry.class, "document_documents", "approveReplace", kparams);
    }

	/**  Cancels document replacement  */
    public static RequestBuilder<DocumentEntry> cancelReplace(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new RequestBuilder<DocumentEntry>(DocumentEntry.class, "document_documents", "cancelReplace", kparams);
    }

    public static RequestBuilder<Long> convert(String entryId)  {
        return convert(entryId, Integer.MIN_VALUE);
    }

    public static RequestBuilder<Long> convert(String entryId, int conversionProfileId)  {
        return convert(entryId, conversionProfileId, null);
    }

	/**  Convert entry  */
    public static RequestBuilder<Long> convert(String entryId, int conversionProfileId, List<ConversionAttribute> dynamicConversionAttributes)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("conversionProfileId", conversionProfileId);
        kparams.add("dynamicConversionAttributes", dynamicConversionAttributes);

        return new RequestBuilder<Long>(Long.class, "document_documents", "convert", kparams);
    }

	/**  This will queue a batch job for converting the document file to swf   Returns
	  the URL where the new swf will be available  */
    public static RequestBuilder<String> convertPptToSwf(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new RequestBuilder<String>(String.class, "document_documents", "convertPptToSwf", kparams);
    }

	/**  Delete a document entry.  */
    public static RequestBuilder<Void> delete(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new NullRequestBuilder("document_documents", "delete", kparams);
    }

    public static RequestBuilder<DocumentEntry> get(String entryId)  {
        return get(entryId, -1);
    }

	/**  Get document entry by ID.  */
    public static RequestBuilder<DocumentEntry> get(String entryId, int version)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("version", version);

        return new RequestBuilder<DocumentEntry>(DocumentEntry.class, "document_documents", "get", kparams);
    }

    public static RequestBuilder<ListResponse<DocumentEntry>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<DocumentEntry>> list(DocumentEntryFilter filter)  {
        return list(filter, null);
    }

	/**  List document entries by filter with paging support.  */
    public static RequestBuilder<ListResponse<DocumentEntry>> list(DocumentEntryFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<DocumentEntry>(DocumentEntry.class, "document_documents", "list", kparams);
    }

    public static RequestBuilder<String> serve(String entryId)  {
        return serve(entryId, null);
    }

    public static RequestBuilder<String> serve(String entryId, String flavorAssetId)  {
        return serve(entryId, flavorAssetId, false);
    }

	/**  Serves the file content  */
    public static RequestBuilder<String> serve(String entryId, String flavorAssetId, boolean forceProxy)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("flavorAssetId", flavorAssetId);
        kparams.add("forceProxy", forceProxy);

        return new ServeRequestBuilder("document_documents", "serve", kparams);
    }

    public static RequestBuilder<String> serveByFlavorParamsId(String entryId)  {
        return serveByFlavorParamsId(entryId, null);
    }

    public static RequestBuilder<String> serveByFlavorParamsId(String entryId, String flavorParamsId)  {
        return serveByFlavorParamsId(entryId, flavorParamsId, false);
    }

	/**  Serves the file content  */
    public static RequestBuilder<String> serveByFlavorParamsId(String entryId, String flavorParamsId, boolean forceProxy)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("flavorParamsId", flavorParamsId);
        kparams.add("forceProxy", forceProxy);

        return new ServeRequestBuilder("document_documents", "serveByFlavorParamsId", kparams);
    }

	/**  Update document entry. Only the properties that were set will be updated.  */
    public static RequestBuilder<DocumentEntry> update(String entryId, DocumentEntry documentEntry)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("documentEntry", documentEntry);

        return new RequestBuilder<DocumentEntry>(DocumentEntry.class, "document_documents", "update", kparams);
    }

    public static RequestBuilder<DocumentEntry> updateContent(String entryId, Resource resource)  {
        return updateContent(entryId, resource, Integer.MIN_VALUE);
    }

	/**  Replace content associated with the given document entry.  */
    public static RequestBuilder<DocumentEntry> updateContent(String entryId, Resource resource, int conversionProfileId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("resource", resource);
        kparams.add("conversionProfileId", conversionProfileId);

        return new RequestBuilder<DocumentEntry>(DocumentEntry.class, "document_documents", "updateContent", kparams);
    }

    public static RequestBuilder<String> upload(File fileData)  {
        return upload(new FileHolder(fileData));
    }

    public static RequestBuilder<String> upload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
        return upload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
    }

    public static RequestBuilder<String> upload(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
        return upload(new FileHolder(fileData, fileDataMimeType, fileDataName));
    }

	/**  Upload a document file to Kaltura, then the file can be used to create a
	  document entry.  */
    public static RequestBuilder<String> upload(FileHolder fileData)  {
        Params kparams = new Params();
        Files kfiles = new Files();
        kfiles.add("fileData", fileData);

        return new RequestBuilder<String>(String.class, "document_documents", "upload", kparams, kfiles);
    }
}
