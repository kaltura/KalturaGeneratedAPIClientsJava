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

    public static RequestBuilder<MetadataProfile> add(MetadataProfile metadataProfile, String xsdData)  {
        return add(metadataProfile, xsdData, null);
    }

	/**  Allows you to add a metadata profile object and metadata profile content
	  associated with Kaltura object type  */
    public static RequestBuilder<MetadataProfile> add(MetadataProfile metadataProfile, String xsdData, String viewsData)  {
        Params kparams = new Params();
        kparams.add("metadataProfile", metadataProfile);
        kparams.add("xsdData", xsdData);
        kparams.add("viewsData", viewsData);

        return new RequestBuilder<MetadataProfile>(MetadataProfile.class, "metadata_metadataprofile", "add", kparams);
    }

    public static RequestBuilder<MetadataProfile> addFromFile(MetadataProfile metadataProfile, FileHolder xsdFile)  {
        return addFromFile(metadataProfile, xsdFile, (FileHolder)null);
    }

    public static RequestBuilder<MetadataProfile> addFromFile(MetadataProfile metadataProfile, File xsdFile)  {
        return addFromFile(metadataProfile, new FileHolder(xsdFile), (FileHolder)null);
    }

    public static RequestBuilder<MetadataProfile> addFromFile(MetadataProfile metadataProfile, InputStream xsdFile, String xsdFileMimeType, String xsdFileName, long xsdFileSize)  {
        return addFromFile(metadataProfile, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName, xsdFileSize), (FileHolder)null);
    }

    public static RequestBuilder<MetadataProfile> addFromFile(MetadataProfile metadataProfile, FileInputStream xsdFile, String xsdFileMimeType, String xsdFileName)  {
        return addFromFile(metadataProfile, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName), (FileHolder)null);
    }

    public static RequestBuilder<MetadataProfile> addFromFile(MetadataProfile metadataProfile, File xsdFile, File viewsFile)  {
        return addFromFile(metadataProfile, new FileHolder(xsdFile), new FileHolder(viewsFile));
    }

    public static RequestBuilder<MetadataProfile> addFromFile(MetadataProfile metadataProfile, InputStream xsdFile, String xsdFileMimeType, String xsdFileName, long xsdFileSize, InputStream viewsFile, String viewsFileMimeType, String viewsFileName, long viewsFileSize)  {
        return addFromFile(metadataProfile, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName, xsdFileSize), new FileHolder(viewsFile, viewsFileMimeType, viewsFileName, viewsFileSize));
    }

    public static RequestBuilder<MetadataProfile> addFromFile(MetadataProfile metadataProfile, FileInputStream xsdFile, String xsdFileMimeType, String xsdFileName, FileInputStream viewsFile, String viewsFileMimeType, String viewsFileName)  {
        return addFromFile(metadataProfile, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName), new FileHolder(viewsFile, viewsFileMimeType, viewsFileName));
    }

	/**  Allows you to add a metadata profile object and metadata profile file associated
	  with Kaltura object type  */
    public static RequestBuilder<MetadataProfile> addFromFile(MetadataProfile metadataProfile, FileHolder xsdFile, FileHolder viewsFile)  {
        Params kparams = new Params();
        kparams.add("metadataProfile", metadataProfile);
        Files kfiles = new Files();
        kfiles.add("xsdFile", xsdFile);
        kfiles.add("viewsFile", viewsFile);

        return new RequestBuilder<MetadataProfile>(MetadataProfile.class, "metadata_metadataprofile", "addFromFile", kparams, kfiles);
    }

	/**  Delete an existing metadata profile  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("metadata_metadataprofile", "delete", kparams);
    }

	/**  Retrieve a metadata profile object by id  */
    public static RequestBuilder<MetadataProfile> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<MetadataProfile>(MetadataProfile.class, "metadata_metadataprofile", "get", kparams);
    }

    public static RequestBuilder<ListResponse<MetadataProfile>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<MetadataProfile>> list(MetadataProfileFilter filter)  {
        return list(filter, null);
    }

	/**  List metadata profile objects by filter and pager  */
    public static RequestBuilder<ListResponse<MetadataProfile>> list(MetadataProfileFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<MetadataProfile>(MetadataProfile.class, "metadata_metadataprofile", "list", kparams);
    }

	/**  List metadata profile fields by metadata profile id  */
    public static RequestBuilder<ListResponse<MetadataProfileField>> listFields(int metadataProfileId)  {
        Params kparams = new Params();
        kparams.add("metadataProfileId", metadataProfileId);

        return new ListResponseRequestBuilder<MetadataProfileField>(MetadataProfileField.class, "metadata_metadataprofile", "listFields", kparams);
    }

	/**  Update an existing metadata object definition file  */
    public static RequestBuilder<MetadataProfile> revert(int id, int toVersion)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("toVersion", toVersion);

        return new RequestBuilder<MetadataProfile>(MetadataProfile.class, "metadata_metadataprofile", "revert", kparams);
    }

	/**  Serves metadata profile XSD file  */
    public static RequestBuilder<String> serve(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new ServeRequestBuilder("metadata_metadataprofile", "serve", kparams);
    }

	/**  Serves metadata profile view file  */
    public static RequestBuilder<String> serveView(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new ServeRequestBuilder("metadata_metadataprofile", "serveView", kparams);
    }

    public static RequestBuilder<MetadataProfile> update(int id, MetadataProfile metadataProfile)  {
        return update(id, metadataProfile, null);
    }

    public static RequestBuilder<MetadataProfile> update(int id, MetadataProfile metadataProfile, String xsdData)  {
        return update(id, metadataProfile, xsdData, null);
    }

	/**  Update an existing metadata object  */
    public static RequestBuilder<MetadataProfile> update(int id, MetadataProfile metadataProfile, String xsdData, String viewsData)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("metadataProfile", metadataProfile);
        kparams.add("xsdData", xsdData);
        kparams.add("viewsData", viewsData);

        return new RequestBuilder<MetadataProfile>(MetadataProfile.class, "metadata_metadataprofile", "update", kparams);
    }

    public static RequestBuilder<MetadataProfile> updateDefinitionFromFile(int id, File xsdFile)  {
        return updateDefinitionFromFile(id, new FileHolder(xsdFile));
    }

    public static RequestBuilder<MetadataProfile> updateDefinitionFromFile(int id, InputStream xsdFile, String xsdFileMimeType, String xsdFileName, long xsdFileSize)  {
        return updateDefinitionFromFile(id, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName, xsdFileSize));
    }

    public static RequestBuilder<MetadataProfile> updateDefinitionFromFile(int id, FileInputStream xsdFile, String xsdFileMimeType, String xsdFileName)  {
        return updateDefinitionFromFile(id, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName));
    }

	/**  Update an existing metadata object definition file  */
    public static RequestBuilder<MetadataProfile> updateDefinitionFromFile(int id, FileHolder xsdFile)  {
        Params kparams = new Params();
        kparams.add("id", id);
        Files kfiles = new Files();
        kfiles.add("xsdFile", xsdFile);

        return new RequestBuilder<MetadataProfile>(MetadataProfile.class, "metadata_metadataprofile", "updateDefinitionFromFile", kparams, kfiles);
    }

    public static RequestBuilder<MetadataProfile> updateTransformationFromFile(int id, File xsltFile)  {
        return updateTransformationFromFile(id, new FileHolder(xsltFile));
    }

    public static RequestBuilder<MetadataProfile> updateTransformationFromFile(int id, InputStream xsltFile, String xsltFileMimeType, String xsltFileName, long xsltFileSize)  {
        return updateTransformationFromFile(id, new FileHolder(xsltFile, xsltFileMimeType, xsltFileName, xsltFileSize));
    }

    public static RequestBuilder<MetadataProfile> updateTransformationFromFile(int id, FileInputStream xsltFile, String xsltFileMimeType, String xsltFileName)  {
        return updateTransformationFromFile(id, new FileHolder(xsltFile, xsltFileMimeType, xsltFileName));
    }

	/**  Update an existing metadata object xslt file  */
    public static RequestBuilder<MetadataProfile> updateTransformationFromFile(int id, FileHolder xsltFile)  {
        Params kparams = new Params();
        kparams.add("id", id);
        Files kfiles = new Files();
        kfiles.add("xsltFile", xsltFile);

        return new RequestBuilder<MetadataProfile>(MetadataProfile.class, "metadata_metadataprofile", "updateTransformationFromFile", kparams, kfiles);
    }

    public static RequestBuilder<MetadataProfile> updateViewsFromFile(int id, File viewsFile)  {
        return updateViewsFromFile(id, new FileHolder(viewsFile));
    }

    public static RequestBuilder<MetadataProfile> updateViewsFromFile(int id, InputStream viewsFile, String viewsFileMimeType, String viewsFileName, long viewsFileSize)  {
        return updateViewsFromFile(id, new FileHolder(viewsFile, viewsFileMimeType, viewsFileName, viewsFileSize));
    }

    public static RequestBuilder<MetadataProfile> updateViewsFromFile(int id, FileInputStream viewsFile, String viewsFileMimeType, String viewsFileName)  {
        return updateViewsFromFile(id, new FileHolder(viewsFile, viewsFileMimeType, viewsFileName));
    }

	/**  Update an existing metadata object views file  */
    public static RequestBuilder<MetadataProfile> updateViewsFromFile(int id, FileHolder viewsFile)  {
        Params kparams = new Params();
        kparams.add("id", id);
        Files kfiles = new Files();
        kfiles.add("viewsFile", viewsFile);

        return new RequestBuilder<MetadataProfile>(MetadataProfile.class, "metadata_metadataprofile", "updateViewsFromFile", kparams, kfiles);
    }
}
