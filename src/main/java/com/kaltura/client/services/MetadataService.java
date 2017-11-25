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
import com.kaltura.client.enums.MetadataObjectType;
import com.kaltura.client.types.FilterPager;
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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Metadata service
 * 
 * @param metadataProfileId 
 * @param objectType 
 * @param objectId 
 * @param xmlData XML metadata
 * @param metadataProfileId 
 * @param objectType 
 * @param objectId 
 * @param url XML metadata remote url
 * @param metadataProfileId 
 * @param objectType 
 * @param objectId 
 * @param xmlFile XML metadata
 * @param metadataProfileId 
 * @param objectType 
 * @param objectId 
 * @param url XML metadata remote url
 * @param id 
 * @param id 
 * @param id 
 * @param shouldUpdate 
 * @param id 
 * @param version Enable update only if the metadata object version did not change by other
 * process
 * @param filter 
 * @param pager 
 * @param id 
 * @param id 
 * @param xmlData XML metadata
 * @param version Enable update only if the metadata object version did not change by other
 * process
 * @param id 
 * @param xmlFile XML metadata
 * @param id 
 * @param xslFile 
 */
public class MetadataService {
	
	public static class AddMetadataBuilder extends RequestBuilder<Metadata, Metadata.Tokenizer, AddMetadataBuilder> {
		
		public AddMetadataBuilder(int metadataProfileId, MetadataObjectType objectType, String objectId, String xmlData) {
			super(Metadata.class, "metadata_metadata", "add");
			params.add("metadataProfileId", metadataProfileId);
			params.add("objectType", objectType);
			params.add("objectId", objectId);
			params.add("xmlData", xmlData);
		}
		
		public void metadataProfileId(String multirequestToken) {
			params.add("metadataProfileId", multirequestToken);
		}
		
		public void objectType(String multirequestToken) {
			params.add("objectType", multirequestToken);
		}
		
		public void objectId(String multirequestToken) {
			params.add("objectId", multirequestToken);
		}
		
		public void xmlData(String multirequestToken) {
			params.add("xmlData", multirequestToken);
		}
	}

	/**
	 * Allows you to add a metadata object and metadata content associated with Kaltura
	  object
	 * 
	 * @param metadataProfileId 
	 * @param objectType 
	 * @param objectId 
	 * @param xmlData XML metadata
	 */
    public static AddMetadataBuilder add(int metadataProfileId, MetadataObjectType objectType, String objectId, String xmlData)  {
		return new AddMetadataBuilder(metadataProfileId, objectType, objectId, xmlData);
	}
	
	public static class AddFromBulkMetadataBuilder extends RequestBuilder<Metadata, Metadata.Tokenizer, AddFromBulkMetadataBuilder> {
		
		public AddFromBulkMetadataBuilder(int metadataProfileId, MetadataObjectType objectType, String objectId, String url) {
			super(Metadata.class, "metadata_metadata", "addFromBulk");
			params.add("metadataProfileId", metadataProfileId);
			params.add("objectType", objectType);
			params.add("objectId", objectId);
			params.add("url", url);
		}
		
		public void metadataProfileId(String multirequestToken) {
			params.add("metadataProfileId", multirequestToken);
		}
		
		public void objectType(String multirequestToken) {
			params.add("objectType", multirequestToken);
		}
		
		public void objectId(String multirequestToken) {
			params.add("objectId", multirequestToken);
		}
		
		public void url(String multirequestToken) {
			params.add("url", multirequestToken);
		}
	}

	/**
	 * Allows you to add a metadata xml data from remote URL.   Enables different
	  permissions than addFromUrl action.
	 * 
	 * @param metadataProfileId 
	 * @param objectType 
	 * @param objectId 
	 * @param url XML metadata remote url
	 */
    public static AddFromBulkMetadataBuilder addFromBulk(int metadataProfileId, MetadataObjectType objectType, String objectId, String url)  {
		return new AddFromBulkMetadataBuilder(metadataProfileId, objectType, objectId, url);
	}
	
	public static class AddFromFileMetadataBuilder extends RequestBuilder<Metadata, Metadata.Tokenizer, AddFromFileMetadataBuilder> {
		
		public AddFromFileMetadataBuilder(int metadataProfileId, MetadataObjectType objectType, String objectId, FileHolder xmlFile) {
			super(Metadata.class, "metadata_metadata", "addFromFile");
			params.add("metadataProfileId", metadataProfileId);
			params.add("objectType", objectType);
			params.add("objectId", objectId);
			files = new Files();
			files.add("xmlFile", xmlFile);
		}
		
		public void metadataProfileId(String multirequestToken) {
			params.add("metadataProfileId", multirequestToken);
		}
		
		public void objectType(String multirequestToken) {
			params.add("objectType", multirequestToken);
		}
		
		public void objectId(String multirequestToken) {
			params.add("objectId", multirequestToken);
		}
	}

	public static AddFromFileMetadataBuilder addFromFile(int metadataProfileId, MetadataObjectType objectType, String objectId, File xmlFile)  {
		return addFromFile(metadataProfileId, objectType, objectId, new FileHolder(xmlFile));
	}

	public static AddFromFileMetadataBuilder addFromFile(int metadataProfileId, MetadataObjectType objectType, String objectId, InputStream xmlFile, String xmlFileMimeType, String xmlFileName, long xmlFileSize)  {
		return addFromFile(metadataProfileId, objectType, objectId, new FileHolder(xmlFile, xmlFileMimeType, xmlFileName, xmlFileSize));
	}

	public static AddFromFileMetadataBuilder addFromFile(int metadataProfileId, MetadataObjectType objectType, String objectId, FileInputStream xmlFile, String xmlFileMimeType, String xmlFileName)  {
		return addFromFile(metadataProfileId, objectType, objectId, new FileHolder(xmlFile, xmlFileMimeType, xmlFileName));
	}

	/**
	 * Allows you to add a metadata object and metadata file associated with Kaltura
	  object
	 * 
	 * @param metadataProfileId 
	 * @param objectType 
	 * @param objectId 
	 * @param xmlFile XML metadata
	 */
    public static AddFromFileMetadataBuilder addFromFile(int metadataProfileId, MetadataObjectType objectType, String objectId, FileHolder xmlFile)  {
		return new AddFromFileMetadataBuilder(metadataProfileId, objectType, objectId, xmlFile);
	}
	
	public static class AddFromUrlMetadataBuilder extends RequestBuilder<Metadata, Metadata.Tokenizer, AddFromUrlMetadataBuilder> {
		
		public AddFromUrlMetadataBuilder(int metadataProfileId, MetadataObjectType objectType, String objectId, String url) {
			super(Metadata.class, "metadata_metadata", "addFromUrl");
			params.add("metadataProfileId", metadataProfileId);
			params.add("objectType", objectType);
			params.add("objectId", objectId);
			params.add("url", url);
		}
		
		public void metadataProfileId(String multirequestToken) {
			params.add("metadataProfileId", multirequestToken);
		}
		
		public void objectType(String multirequestToken) {
			params.add("objectType", multirequestToken);
		}
		
		public void objectId(String multirequestToken) {
			params.add("objectId", multirequestToken);
		}
		
		public void url(String multirequestToken) {
			params.add("url", multirequestToken);
		}
	}

	/**
	 * Allows you to add a metadata xml data from remote URL
	 * 
	 * @param metadataProfileId 
	 * @param objectType 
	 * @param objectId 
	 * @param url XML metadata remote url
	 */
    public static AddFromUrlMetadataBuilder addFromUrl(int metadataProfileId, MetadataObjectType objectType, String objectId, String url)  {
		return new AddFromUrlMetadataBuilder(metadataProfileId, objectType, objectId, url);
	}
	
	public static class DeleteMetadataBuilder extends NullRequestBuilder {
		
		public DeleteMetadataBuilder(int id) {
			super("metadata_metadata", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete an existing metadata
	 * 
	 * @param id 
	 */
    public static DeleteMetadataBuilder delete(int id)  {
		return new DeleteMetadataBuilder(id);
	}
	
	public static class GetMetadataBuilder extends RequestBuilder<Metadata, Metadata.Tokenizer, GetMetadataBuilder> {
		
		public GetMetadataBuilder(int id) {
			super(Metadata.class, "metadata_metadata", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Retrieve a metadata object by id
	 * 
	 * @param id 
	 */
    public static GetMetadataBuilder get(int id)  {
		return new GetMetadataBuilder(id);
	}
	
	public static class IndexMetadataBuilder extends RequestBuilder<Integer, String, IndexMetadataBuilder> {
		
		public IndexMetadataBuilder(String id, boolean shouldUpdate) {
			super(Integer.class, "metadata_metadata", "index");
			params.add("id", id);
			params.add("shouldUpdate", shouldUpdate);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void shouldUpdate(String multirequestToken) {
			params.add("shouldUpdate", multirequestToken);
		}
	}

	/**
	 * Index metadata by id, will also index the related object
	 * 
	 * @param id 
	 * @param shouldUpdate 
	 */
    public static IndexMetadataBuilder index(String id, boolean shouldUpdate)  {
		return new IndexMetadataBuilder(id, shouldUpdate);
	}
	
	public static class InvalidateMetadataBuilder extends NullRequestBuilder {
		
		public InvalidateMetadataBuilder(int id, int version) {
			super("metadata_metadata", "invalidate");
			params.add("id", id);
			params.add("version", version);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void version(String multirequestToken) {
			params.add("version", multirequestToken);
		}
	}

	public static InvalidateMetadataBuilder invalidate(int id)  {
		return invalidate(id, Integer.MIN_VALUE);
	}

	/**
	 * Mark existing metadata as invalid   Used by batch metadata transform
	 * 
	 * @param id 
	 * @param version Enable update only if the metadata object version did not change by other
	 * process
	 */
    public static InvalidateMetadataBuilder invalidate(int id, int version)  {
		return new InvalidateMetadataBuilder(id, version);
	}
	
	public static class ListMetadataBuilder extends ListResponseRequestBuilder<Metadata, Metadata.Tokenizer, ListMetadataBuilder> {
		
		public ListMetadataBuilder(MetadataFilter filter, FilterPager pager) {
			super(Metadata.class, "metadata_metadata", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListMetadataBuilder list()  {
		return list(null);
	}

	public static ListMetadataBuilder list(MetadataFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List metadata objects by filter and pager
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListMetadataBuilder list(MetadataFilter filter, FilterPager pager)  {
		return new ListMetadataBuilder(filter, pager);
	}
	
	public static class ServeMetadataBuilder extends ServeRequestBuilder {
		
		public ServeMetadataBuilder(int id) {
			super("metadata_metadata", "serve");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Serves metadata XML file
	 * 
	 * @param id 
	 */
    public static ServeMetadataBuilder serve(int id)  {
		return new ServeMetadataBuilder(id);
	}
	
	public static class UpdateMetadataBuilder extends RequestBuilder<Metadata, Metadata.Tokenizer, UpdateMetadataBuilder> {
		
		public UpdateMetadataBuilder(int id, String xmlData, int version) {
			super(Metadata.class, "metadata_metadata", "update");
			params.add("id", id);
			params.add("xmlData", xmlData);
			params.add("version", version);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void xmlData(String multirequestToken) {
			params.add("xmlData", multirequestToken);
		}
		
		public void version(String multirequestToken) {
			params.add("version", multirequestToken);
		}
	}

	public static UpdateMetadataBuilder update(int id)  {
		return update(id, null);
	}

	public static UpdateMetadataBuilder update(int id, String xmlData)  {
		return update(id, xmlData, Integer.MIN_VALUE);
	}

	/**
	 * Update an existing metadata object with new XML content
	 * 
	 * @param id 
	 * @param xmlData XML metadata
	 * @param version Enable update only if the metadata object version did not change by other
	 * process
	 */
    public static UpdateMetadataBuilder update(int id, String xmlData, int version)  {
		return new UpdateMetadataBuilder(id, xmlData, version);
	}
	
	public static class UpdateFromFileMetadataBuilder extends RequestBuilder<Metadata, Metadata.Tokenizer, UpdateFromFileMetadataBuilder> {
		
		public UpdateFromFileMetadataBuilder(int id, FileHolder xmlFile) {
			super(Metadata.class, "metadata_metadata", "updateFromFile");
			params.add("id", id);
			files = new Files();
			files.add("xmlFile", xmlFile);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	public static UpdateFromFileMetadataBuilder updateFromFile(int id)  {
		return updateFromFile(id, (FileHolder)null);
	}

	public static UpdateFromFileMetadataBuilder updateFromFile(int id, File xmlFile)  {
		return updateFromFile(id, new FileHolder(xmlFile));
	}

	public static UpdateFromFileMetadataBuilder updateFromFile(int id, InputStream xmlFile, String xmlFileMimeType, String xmlFileName, long xmlFileSize)  {
		return updateFromFile(id, new FileHolder(xmlFile, xmlFileMimeType, xmlFileName, xmlFileSize));
	}

	public static UpdateFromFileMetadataBuilder updateFromFile(int id, FileInputStream xmlFile, String xmlFileMimeType, String xmlFileName)  {
		return updateFromFile(id, new FileHolder(xmlFile, xmlFileMimeType, xmlFileName));
	}

	/**
	 * Update an existing metadata object with new XML file
	 * 
	 * @param id 
	 * @param xmlFile XML metadata
	 */
    public static UpdateFromFileMetadataBuilder updateFromFile(int id, FileHolder xmlFile)  {
		return new UpdateFromFileMetadataBuilder(id, xmlFile);
	}
	
	public static class UpdateFromXSLMetadataBuilder extends RequestBuilder<Metadata, Metadata.Tokenizer, UpdateFromXSLMetadataBuilder> {
		
		public UpdateFromXSLMetadataBuilder(int id, FileHolder xslFile) {
			super(Metadata.class, "metadata_metadata", "updateFromXSL");
			params.add("id", id);
			files = new Files();
			files.add("xslFile", xslFile);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	public static UpdateFromXSLMetadataBuilder updateFromXSL(int id, File xslFile)  {
		return updateFromXSL(id, new FileHolder(xslFile));
	}

	public static UpdateFromXSLMetadataBuilder updateFromXSL(int id, InputStream xslFile, String xslFileMimeType, String xslFileName, long xslFileSize)  {
		return updateFromXSL(id, new FileHolder(xslFile, xslFileMimeType, xslFileName, xslFileSize));
	}

	public static UpdateFromXSLMetadataBuilder updateFromXSL(int id, FileInputStream xslFile, String xslFileMimeType, String xslFileName)  {
		return updateFromXSL(id, new FileHolder(xslFile, xslFileMimeType, xslFileName));
	}

	/**
	 * Action transforms current metadata object XML using a provided XSL.
	 * 
	 * @param id 
	 * @param xslFile 
	 */
    public static UpdateFromXSLMetadataBuilder updateFromXSL(int id, FileHolder xslFile)  {
		return new UpdateFromXSLMetadataBuilder(id, xslFile);
	}
}
