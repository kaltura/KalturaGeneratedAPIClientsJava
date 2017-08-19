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
import com.kaltura.client.types.ConversionAttribute;
import com.kaltura.client.types.DocumentEntry;
import com.kaltura.client.types.DocumentEntryFilter;
import com.kaltura.client.types.FilterPager;
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
	
	public static class AddFromEntryDocumentsBuilder extends RequestBuilder<DocumentEntry, DocumentEntry.Tokenizer, AddFromEntryDocumentsBuilder> {
		
		public AddFromEntryDocumentsBuilder(String sourceEntryId, DocumentEntry documentEntry, int sourceFlavorParamsId) {
			super(DocumentEntry.class, "document_documents", "addFromEntry");
			params.add("sourceEntryId", sourceEntryId);
			params.add("documentEntry", documentEntry);
			params.add("sourceFlavorParamsId", sourceFlavorParamsId);
		}
		
		public void sourceEntryId(String multirequestToken) {
			params.add("sourceEntryId", multirequestToken);
		}
		
		public void sourceFlavorParamsId(String multirequestToken) {
			params.add("sourceFlavorParamsId", multirequestToken);
		}
	}

	public static AddFromEntryDocumentsBuilder addFromEntry(String sourceEntryId)  {
		return addFromEntry(sourceEntryId, null);
	}

	public static AddFromEntryDocumentsBuilder addFromEntry(String sourceEntryId, DocumentEntry documentEntry)  {
		return addFromEntry(sourceEntryId, documentEntry, Integer.MIN_VALUE);
	}

	/**  Copy entry into new entry  */
    public static AddFromEntryDocumentsBuilder addFromEntry(String sourceEntryId, DocumentEntry documentEntry, int sourceFlavorParamsId)  {
		return new AddFromEntryDocumentsBuilder(sourceEntryId, documentEntry, sourceFlavorParamsId);
	}
	
	public static class AddFromFlavorAssetDocumentsBuilder extends RequestBuilder<DocumentEntry, DocumentEntry.Tokenizer, AddFromFlavorAssetDocumentsBuilder> {
		
		public AddFromFlavorAssetDocumentsBuilder(String sourceFlavorAssetId, DocumentEntry documentEntry) {
			super(DocumentEntry.class, "document_documents", "addFromFlavorAsset");
			params.add("sourceFlavorAssetId", sourceFlavorAssetId);
			params.add("documentEntry", documentEntry);
		}
		
		public void sourceFlavorAssetId(String multirequestToken) {
			params.add("sourceFlavorAssetId", multirequestToken);
		}
	}

	public static AddFromFlavorAssetDocumentsBuilder addFromFlavorAsset(String sourceFlavorAssetId)  {
		return addFromFlavorAsset(sourceFlavorAssetId, null);
	}

	/**  Copy flavor asset into new entry  */
    public static AddFromFlavorAssetDocumentsBuilder addFromFlavorAsset(String sourceFlavorAssetId, DocumentEntry documentEntry)  {
		return new AddFromFlavorAssetDocumentsBuilder(sourceFlavorAssetId, documentEntry);
	}
	
	public static class AddFromUploadedFileDocumentsBuilder extends RequestBuilder<DocumentEntry, DocumentEntry.Tokenizer, AddFromUploadedFileDocumentsBuilder> {
		
		public AddFromUploadedFileDocumentsBuilder(DocumentEntry documentEntry, String uploadTokenId) {
			super(DocumentEntry.class, "document_documents", "addFromUploadedFile");
			params.add("documentEntry", documentEntry);
			params.add("uploadTokenId", uploadTokenId);
		}
		
		public void uploadTokenId(String multirequestToken) {
			params.add("uploadTokenId", multirequestToken);
		}
	}

	/**  Add new document entry after the specific document file was uploaded and the
	  upload token id exists  */
    public static AddFromUploadedFileDocumentsBuilder addFromUploadedFile(DocumentEntry documentEntry, String uploadTokenId)  {
		return new AddFromUploadedFileDocumentsBuilder(documentEntry, uploadTokenId);
	}
	
	public static class ApproveReplaceDocumentsBuilder extends RequestBuilder<DocumentEntry, DocumentEntry.Tokenizer, ApproveReplaceDocumentsBuilder> {
		
		public ApproveReplaceDocumentsBuilder(String entryId) {
			super(DocumentEntry.class, "document_documents", "approveReplace");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**  Approves document replacement  */
    public static ApproveReplaceDocumentsBuilder approveReplace(String entryId)  {
		return new ApproveReplaceDocumentsBuilder(entryId);
	}
	
	public static class CancelReplaceDocumentsBuilder extends RequestBuilder<DocumentEntry, DocumentEntry.Tokenizer, CancelReplaceDocumentsBuilder> {
		
		public CancelReplaceDocumentsBuilder(String entryId) {
			super(DocumentEntry.class, "document_documents", "cancelReplace");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**  Cancels document replacement  */
    public static CancelReplaceDocumentsBuilder cancelReplace(String entryId)  {
		return new CancelReplaceDocumentsBuilder(entryId);
	}
	
	public static class ConvertDocumentsBuilder extends RequestBuilder<Long, String, ConvertDocumentsBuilder> {
		
		public ConvertDocumentsBuilder(String entryId, int conversionProfileId, List<ConversionAttribute> dynamicConversionAttributes) {
			super(Long.class, "document_documents", "convert");
			params.add("entryId", entryId);
			params.add("conversionProfileId", conversionProfileId);
			params.add("dynamicConversionAttributes", dynamicConversionAttributes);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void conversionProfileId(String multirequestToken) {
			params.add("conversionProfileId", multirequestToken);
		}
	}

	public static ConvertDocumentsBuilder convert(String entryId)  {
		return convert(entryId, Integer.MIN_VALUE);
	}

	public static ConvertDocumentsBuilder convert(String entryId, int conversionProfileId)  {
		return convert(entryId, conversionProfileId, null);
	}

	/**  Convert entry  */
    public static ConvertDocumentsBuilder convert(String entryId, int conversionProfileId, List<ConversionAttribute> dynamicConversionAttributes)  {
		return new ConvertDocumentsBuilder(entryId, conversionProfileId, dynamicConversionAttributes);
	}
	
	public static class ConvertPptToSwfDocumentsBuilder extends RequestBuilder<String, String, ConvertPptToSwfDocumentsBuilder> {
		
		public ConvertPptToSwfDocumentsBuilder(String entryId) {
			super(String.class, "document_documents", "convertPptToSwf");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**  This will queue a batch job for converting the document file to swf   Returns
	  the URL where the new swf will be available  */
    public static ConvertPptToSwfDocumentsBuilder convertPptToSwf(String entryId)  {
		return new ConvertPptToSwfDocumentsBuilder(entryId);
	}
	
	public static class DeleteDocumentsBuilder extends NullRequestBuilder {
		
		public DeleteDocumentsBuilder(String entryId) {
			super("document_documents", "delete");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**  Delete a document entry.  */
    public static DeleteDocumentsBuilder delete(String entryId)  {
		return new DeleteDocumentsBuilder(entryId);
	}
	
	public static class GetDocumentsBuilder extends RequestBuilder<DocumentEntry, DocumentEntry.Tokenizer, GetDocumentsBuilder> {
		
		public GetDocumentsBuilder(String entryId, int version) {
			super(DocumentEntry.class, "document_documents", "get");
			params.add("entryId", entryId);
			params.add("version", version);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void version(String multirequestToken) {
			params.add("version", multirequestToken);
		}
	}

	public static GetDocumentsBuilder get(String entryId)  {
		return get(entryId, -1);
	}

	/**  Get document entry by ID.  */
    public static GetDocumentsBuilder get(String entryId, int version)  {
		return new GetDocumentsBuilder(entryId, version);
	}
	
	public static class ListDocumentsBuilder extends ListResponseRequestBuilder<DocumentEntry, DocumentEntry.Tokenizer, ListDocumentsBuilder> {
		
		public ListDocumentsBuilder(DocumentEntryFilter filter, FilterPager pager) {
			super(DocumentEntry.class, "document_documents", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListDocumentsBuilder list()  {
		return list(null);
	}

	public static ListDocumentsBuilder list(DocumentEntryFilter filter)  {
		return list(filter, null);
	}

	/**  List document entries by filter with paging support.  */
    public static ListDocumentsBuilder list(DocumentEntryFilter filter, FilterPager pager)  {
		return new ListDocumentsBuilder(filter, pager);
	}
	
	public static class ServeDocumentsBuilder extends ServeRequestBuilder {
		
		public ServeDocumentsBuilder(String entryId, String flavorAssetId, boolean forceProxy) {
			super("document_documents", "serve");
			params.add("entryId", entryId);
			params.add("flavorAssetId", flavorAssetId);
			params.add("forceProxy", forceProxy);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void flavorAssetId(String multirequestToken) {
			params.add("flavorAssetId", multirequestToken);
		}
		
		public void forceProxy(String multirequestToken) {
			params.add("forceProxy", multirequestToken);
		}
	}

	public static ServeDocumentsBuilder serve(String entryId)  {
		return serve(entryId, null);
	}

	public static ServeDocumentsBuilder serve(String entryId, String flavorAssetId)  {
		return serve(entryId, flavorAssetId, false);
	}

	/**  Serves the file content  */
    public static ServeDocumentsBuilder serve(String entryId, String flavorAssetId, boolean forceProxy)  {
		return new ServeDocumentsBuilder(entryId, flavorAssetId, forceProxy);
	}
	
	public static class ServeByFlavorParamsIdDocumentsBuilder extends ServeRequestBuilder {
		
		public ServeByFlavorParamsIdDocumentsBuilder(String entryId, String flavorParamsId, boolean forceProxy) {
			super("document_documents", "serveByFlavorParamsId");
			params.add("entryId", entryId);
			params.add("flavorParamsId", flavorParamsId);
			params.add("forceProxy", forceProxy);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void flavorParamsId(String multirequestToken) {
			params.add("flavorParamsId", multirequestToken);
		}
		
		public void forceProxy(String multirequestToken) {
			params.add("forceProxy", multirequestToken);
		}
	}

	public static ServeByFlavorParamsIdDocumentsBuilder serveByFlavorParamsId(String entryId)  {
		return serveByFlavorParamsId(entryId, null);
	}

	public static ServeByFlavorParamsIdDocumentsBuilder serveByFlavorParamsId(String entryId, String flavorParamsId)  {
		return serveByFlavorParamsId(entryId, flavorParamsId, false);
	}

	/**  Serves the file content  */
    public static ServeByFlavorParamsIdDocumentsBuilder serveByFlavorParamsId(String entryId, String flavorParamsId, boolean forceProxy)  {
		return new ServeByFlavorParamsIdDocumentsBuilder(entryId, flavorParamsId, forceProxy);
	}
	
	public static class UpdateDocumentsBuilder extends RequestBuilder<DocumentEntry, DocumentEntry.Tokenizer, UpdateDocumentsBuilder> {
		
		public UpdateDocumentsBuilder(String entryId, DocumentEntry documentEntry) {
			super(DocumentEntry.class, "document_documents", "update");
			params.add("entryId", entryId);
			params.add("documentEntry", documentEntry);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**  Update document entry. Only the properties that were set will be updated.  */
    public static UpdateDocumentsBuilder update(String entryId, DocumentEntry documentEntry)  {
		return new UpdateDocumentsBuilder(entryId, documentEntry);
	}
	
	public static class UpdateContentDocumentsBuilder extends RequestBuilder<DocumentEntry, DocumentEntry.Tokenizer, UpdateContentDocumentsBuilder> {
		
		public UpdateContentDocumentsBuilder(String entryId, Resource resource, int conversionProfileId) {
			super(DocumentEntry.class, "document_documents", "updateContent");
			params.add("entryId", entryId);
			params.add("resource", resource);
			params.add("conversionProfileId", conversionProfileId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void conversionProfileId(String multirequestToken) {
			params.add("conversionProfileId", multirequestToken);
		}
	}

	public static UpdateContentDocumentsBuilder updateContent(String entryId, Resource resource)  {
		return updateContent(entryId, resource, Integer.MIN_VALUE);
	}

	/**  Replace content associated with the given document entry.  */
    public static UpdateContentDocumentsBuilder updateContent(String entryId, Resource resource, int conversionProfileId)  {
		return new UpdateContentDocumentsBuilder(entryId, resource, conversionProfileId);
	}
	
	public static class UploadDocumentsBuilder extends RequestBuilder<String, String, UploadDocumentsBuilder> {
		
		public UploadDocumentsBuilder(FileHolder fileData) {
			super(String.class, "document_documents", "upload");
			files = new Files();
			files.add("fileData", fileData);
		}
	}

	public static UploadDocumentsBuilder upload(File fileData)  {
		return upload(new FileHolder(fileData));
	}

	public static UploadDocumentsBuilder upload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return upload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
	}

	public static UploadDocumentsBuilder upload(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return upload(new FileHolder(fileData, fileDataMimeType, fileDataName));
	}

	/**  Upload a document file to Kaltura, then the file can be used to create a
	  document entry.  */
    public static UploadDocumentsBuilder upload(FileHolder fileData)  {
		return new UploadDocumentsBuilder(fileData);
	}
}
