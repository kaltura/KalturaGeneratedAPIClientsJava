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
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.MetadataProfile;
import com.kaltura.client.types.MetadataProfileField;
import com.kaltura.client.types.MetadataProfileFilter;
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

/**  Metadata Profile service  */
public class MetadataProfileService {
	
	public static class AddMetadataProfileBuilder extends RequestBuilder<MetadataProfile, MetadataProfile.Tokenizer, AddMetadataProfileBuilder> {
		
		public AddMetadataProfileBuilder(MetadataProfile metadataProfile, String xsdData, String viewsData) {
			super(MetadataProfile.class, "metadata_metadataprofile", "add");
			params.add("metadataProfile", metadataProfile);
			params.add("xsdData", xsdData);
			params.add("viewsData", viewsData);
		}
		
		public void xsdData(String multirequestToken) {
			params.add("xsdData", multirequestToken);
		}
		
		public void viewsData(String multirequestToken) {
			params.add("viewsData", multirequestToken);
		}
	}

	public static AddMetadataProfileBuilder add(MetadataProfile metadataProfile, String xsdData)  {
		return add(metadataProfile, xsdData, null);
	}

	/**  Allows you to add a metadata profile object and metadata profile content
	  associated with Kaltura object type  */
    public static AddMetadataProfileBuilder add(MetadataProfile metadataProfile, String xsdData, String viewsData)  {
		return new AddMetadataProfileBuilder(metadataProfile, xsdData, viewsData);
	}
	
	public static class AddFromFileMetadataProfileBuilder extends RequestBuilder<MetadataProfile, MetadataProfile.Tokenizer, AddFromFileMetadataProfileBuilder> {
		
		public AddFromFileMetadataProfileBuilder(MetadataProfile metadataProfile, FileHolder xsdFile, FileHolder viewsFile) {
			super(MetadataProfile.class, "metadata_metadataprofile", "addFromFile");
			params.add("metadataProfile", metadataProfile);
			files = new Files();
			files.add("xsdFile", xsdFile);
			files.add("viewsFile", viewsFile);
		}
	}

	public static AddFromFileMetadataProfileBuilder addFromFile(MetadataProfile metadataProfile, FileHolder xsdFile)  {
		return addFromFile(metadataProfile, xsdFile, (FileHolder)null);
	}

	public static AddFromFileMetadataProfileBuilder addFromFile(MetadataProfile metadataProfile, File xsdFile)  {
		return addFromFile(metadataProfile, new FileHolder(xsdFile), (FileHolder)null);
	}

	public static AddFromFileMetadataProfileBuilder addFromFile(MetadataProfile metadataProfile, InputStream xsdFile, String xsdFileMimeType, String xsdFileName, long xsdFileSize)  {
		return addFromFile(metadataProfile, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName, xsdFileSize), (FileHolder)null);
	}

	public static AddFromFileMetadataProfileBuilder addFromFile(MetadataProfile metadataProfile, FileInputStream xsdFile, String xsdFileMimeType, String xsdFileName)  {
		return addFromFile(metadataProfile, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName), (FileHolder)null);
	}

	public static AddFromFileMetadataProfileBuilder addFromFile(MetadataProfile metadataProfile, File xsdFile, File viewsFile)  {
		return addFromFile(metadataProfile, new FileHolder(xsdFile), new FileHolder(viewsFile));
	}

	public static AddFromFileMetadataProfileBuilder addFromFile(MetadataProfile metadataProfile, InputStream xsdFile, String xsdFileMimeType, String xsdFileName, long xsdFileSize, InputStream viewsFile, String viewsFileMimeType, String viewsFileName, long viewsFileSize)  {
		return addFromFile(metadataProfile, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName, xsdFileSize), new FileHolder(viewsFile, viewsFileMimeType, viewsFileName, viewsFileSize));
	}

	public static AddFromFileMetadataProfileBuilder addFromFile(MetadataProfile metadataProfile, FileInputStream xsdFile, String xsdFileMimeType, String xsdFileName, FileInputStream viewsFile, String viewsFileMimeType, String viewsFileName)  {
		return addFromFile(metadataProfile, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName), new FileHolder(viewsFile, viewsFileMimeType, viewsFileName));
	}

	/**  Allows you to add a metadata profile object and metadata profile file associated
	  with Kaltura object type  */
    public static AddFromFileMetadataProfileBuilder addFromFile(MetadataProfile metadataProfile, FileHolder xsdFile, FileHolder viewsFile)  {
		return new AddFromFileMetadataProfileBuilder(metadataProfile, xsdFile, viewsFile);
	}
	
	public static class DeleteMetadataProfileBuilder extends NullRequestBuilder {
		
		public DeleteMetadataProfileBuilder(int id) {
			super("metadata_metadataprofile", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Delete an existing metadata profile  */
    public static DeleteMetadataProfileBuilder delete(int id)  {
		return new DeleteMetadataProfileBuilder(id);
	}
	
	public static class GetMetadataProfileBuilder extends RequestBuilder<MetadataProfile, MetadataProfile.Tokenizer, GetMetadataProfileBuilder> {
		
		public GetMetadataProfileBuilder(int id) {
			super(MetadataProfile.class, "metadata_metadataprofile", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Retrieve a metadata profile object by id  */
    public static GetMetadataProfileBuilder get(int id)  {
		return new GetMetadataProfileBuilder(id);
	}
	
	public static class ListMetadataProfileBuilder extends ListResponseRequestBuilder<MetadataProfile, MetadataProfile.Tokenizer, ListMetadataProfileBuilder> {
		
		public ListMetadataProfileBuilder(MetadataProfileFilter filter, FilterPager pager) {
			super(MetadataProfile.class, "metadata_metadataprofile", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListMetadataProfileBuilder list()  {
		return list(null);
	}

	public static ListMetadataProfileBuilder list(MetadataProfileFilter filter)  {
		return list(filter, null);
	}

	/**  List metadata profile objects by filter and pager  */
    public static ListMetadataProfileBuilder list(MetadataProfileFilter filter, FilterPager pager)  {
		return new ListMetadataProfileBuilder(filter, pager);
	}
	
	public static class ListFieldsMetadataProfileBuilder extends ListResponseRequestBuilder<MetadataProfileField, MetadataProfileField.Tokenizer, ListFieldsMetadataProfileBuilder> {
		
		public ListFieldsMetadataProfileBuilder(int metadataProfileId) {
			super(MetadataProfileField.class, "metadata_metadataprofile", "listFields");
			params.add("metadataProfileId", metadataProfileId);
		}
		
		public void metadataProfileId(String multirequestToken) {
			params.add("metadataProfileId", multirequestToken);
		}
	}

	/**  List metadata profile fields by metadata profile id  */
    public static ListFieldsMetadataProfileBuilder listFields(int metadataProfileId)  {
		return new ListFieldsMetadataProfileBuilder(metadataProfileId);
	}
	
	public static class RevertMetadataProfileBuilder extends RequestBuilder<MetadataProfile, MetadataProfile.Tokenizer, RevertMetadataProfileBuilder> {
		
		public RevertMetadataProfileBuilder(int id, int toVersion) {
			super(MetadataProfile.class, "metadata_metadataprofile", "revert");
			params.add("id", id);
			params.add("toVersion", toVersion);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void toVersion(String multirequestToken) {
			params.add("toVersion", multirequestToken);
		}
	}

	/**  Update an existing metadata object definition file  */
    public static RevertMetadataProfileBuilder revert(int id, int toVersion)  {
		return new RevertMetadataProfileBuilder(id, toVersion);
	}
	
	public static class ServeMetadataProfileBuilder extends ServeRequestBuilder {
		
		public ServeMetadataProfileBuilder(int id) {
			super("metadata_metadataprofile", "serve");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Serves metadata profile XSD file  */
    public static ServeMetadataProfileBuilder serve(int id)  {
		return new ServeMetadataProfileBuilder(id);
	}
	
	public static class ServeViewMetadataProfileBuilder extends ServeRequestBuilder {
		
		public ServeViewMetadataProfileBuilder(int id) {
			super("metadata_metadataprofile", "serveView");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Serves metadata profile view file  */
    public static ServeViewMetadataProfileBuilder serveView(int id)  {
		return new ServeViewMetadataProfileBuilder(id);
	}
	
	public static class UpdateMetadataProfileBuilder extends RequestBuilder<MetadataProfile, MetadataProfile.Tokenizer, UpdateMetadataProfileBuilder> {
		
		public UpdateMetadataProfileBuilder(int id, MetadataProfile metadataProfile, String xsdData, String viewsData) {
			super(MetadataProfile.class, "metadata_metadataprofile", "update");
			params.add("id", id);
			params.add("metadataProfile", metadataProfile);
			params.add("xsdData", xsdData);
			params.add("viewsData", viewsData);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void xsdData(String multirequestToken) {
			params.add("xsdData", multirequestToken);
		}
		
		public void viewsData(String multirequestToken) {
			params.add("viewsData", multirequestToken);
		}
	}

	public static UpdateMetadataProfileBuilder update(int id, MetadataProfile metadataProfile)  {
		return update(id, metadataProfile, null);
	}

	public static UpdateMetadataProfileBuilder update(int id, MetadataProfile metadataProfile, String xsdData)  {
		return update(id, metadataProfile, xsdData, null);
	}

	/**  Update an existing metadata object  */
    public static UpdateMetadataProfileBuilder update(int id, MetadataProfile metadataProfile, String xsdData, String viewsData)  {
		return new UpdateMetadataProfileBuilder(id, metadataProfile, xsdData, viewsData);
	}
	
	public static class UpdateDefinitionFromFileMetadataProfileBuilder extends RequestBuilder<MetadataProfile, MetadataProfile.Tokenizer, UpdateDefinitionFromFileMetadataProfileBuilder> {
		
		public UpdateDefinitionFromFileMetadataProfileBuilder(int id, FileHolder xsdFile) {
			super(MetadataProfile.class, "metadata_metadataprofile", "updateDefinitionFromFile");
			params.add("id", id);
			files = new Files();
			files.add("xsdFile", xsdFile);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	public static UpdateDefinitionFromFileMetadataProfileBuilder updateDefinitionFromFile(int id, File xsdFile)  {
		return updateDefinitionFromFile(id, new FileHolder(xsdFile));
	}

	public static UpdateDefinitionFromFileMetadataProfileBuilder updateDefinitionFromFile(int id, InputStream xsdFile, String xsdFileMimeType, String xsdFileName, long xsdFileSize)  {
		return updateDefinitionFromFile(id, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName, xsdFileSize));
	}

	public static UpdateDefinitionFromFileMetadataProfileBuilder updateDefinitionFromFile(int id, FileInputStream xsdFile, String xsdFileMimeType, String xsdFileName)  {
		return updateDefinitionFromFile(id, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName));
	}

	/**  Update an existing metadata object definition file  */
    public static UpdateDefinitionFromFileMetadataProfileBuilder updateDefinitionFromFile(int id, FileHolder xsdFile)  {
		return new UpdateDefinitionFromFileMetadataProfileBuilder(id, xsdFile);
	}
	
	public static class UpdateTransformationFromFileMetadataProfileBuilder extends RequestBuilder<MetadataProfile, MetadataProfile.Tokenizer, UpdateTransformationFromFileMetadataProfileBuilder> {
		
		public UpdateTransformationFromFileMetadataProfileBuilder(int id, FileHolder xsltFile) {
			super(MetadataProfile.class, "metadata_metadataprofile", "updateTransformationFromFile");
			params.add("id", id);
			files = new Files();
			files.add("xsltFile", xsltFile);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	public static UpdateTransformationFromFileMetadataProfileBuilder updateTransformationFromFile(int id, File xsltFile)  {
		return updateTransformationFromFile(id, new FileHolder(xsltFile));
	}

	public static UpdateTransformationFromFileMetadataProfileBuilder updateTransformationFromFile(int id, InputStream xsltFile, String xsltFileMimeType, String xsltFileName, long xsltFileSize)  {
		return updateTransformationFromFile(id, new FileHolder(xsltFile, xsltFileMimeType, xsltFileName, xsltFileSize));
	}

	public static UpdateTransformationFromFileMetadataProfileBuilder updateTransformationFromFile(int id, FileInputStream xsltFile, String xsltFileMimeType, String xsltFileName)  {
		return updateTransformationFromFile(id, new FileHolder(xsltFile, xsltFileMimeType, xsltFileName));
	}

	/**  Update an existing metadata object xslt file  */
    public static UpdateTransformationFromFileMetadataProfileBuilder updateTransformationFromFile(int id, FileHolder xsltFile)  {
		return new UpdateTransformationFromFileMetadataProfileBuilder(id, xsltFile);
	}
	
	public static class UpdateViewsFromFileMetadataProfileBuilder extends RequestBuilder<MetadataProfile, MetadataProfile.Tokenizer, UpdateViewsFromFileMetadataProfileBuilder> {
		
		public UpdateViewsFromFileMetadataProfileBuilder(int id, FileHolder viewsFile) {
			super(MetadataProfile.class, "metadata_metadataprofile", "updateViewsFromFile");
			params.add("id", id);
			files = new Files();
			files.add("viewsFile", viewsFile);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	public static UpdateViewsFromFileMetadataProfileBuilder updateViewsFromFile(int id, File viewsFile)  {
		return updateViewsFromFile(id, new FileHolder(viewsFile));
	}

	public static UpdateViewsFromFileMetadataProfileBuilder updateViewsFromFile(int id, InputStream viewsFile, String viewsFileMimeType, String viewsFileName, long viewsFileSize)  {
		return updateViewsFromFile(id, new FileHolder(viewsFile, viewsFileMimeType, viewsFileName, viewsFileSize));
	}

	public static UpdateViewsFromFileMetadataProfileBuilder updateViewsFromFile(int id, FileInputStream viewsFile, String viewsFileMimeType, String viewsFileName)  {
		return updateViewsFromFile(id, new FileHolder(viewsFile, viewsFileMimeType, viewsFileName));
	}

	/**  Update an existing metadata object views file  */
    public static UpdateViewsFromFileMetadataProfileBuilder updateViewsFromFile(int id, FileHolder viewsFile)  {
		return new UpdateViewsFromFileMetadataProfileBuilder(id, viewsFile);
	}
}
