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
import com.kaltura.client.enums.DistributionAction;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.GenericDistributionProviderAction;
import com.kaltura.client.types.GenericDistributionProviderActionFilter;
import com.kaltura.client.types.ListResponse;
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

/**  Generic Distribution Provider Actions service  */
public class GenericDistributionProviderActionService {

	/**  Add new Generic Distribution Provider Action  */
    public static RequestBuilder<GenericDistributionProviderAction> add(GenericDistributionProviderAction genericDistributionProviderAction)  {
        Params kparams = new Params();
        kparams.add("genericDistributionProviderAction", genericDistributionProviderAction);

        return new RequestBuilder<GenericDistributionProviderAction>(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "add", kparams);
    }

	/**  Add MRSS transform file to generic distribution provider action  */
    public static RequestBuilder<GenericDistributionProviderAction> addMrssTransform(int id, String xslData)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("xslData", xslData);

        return new RequestBuilder<GenericDistributionProviderAction>(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "addMrssTransform", kparams);
    }

    public static RequestBuilder<GenericDistributionProviderAction> addMrssTransformFromFile(int id, File xslFile)  {
        return addMrssTransformFromFile(id, new FileHolder(xslFile));
    }

    public static RequestBuilder<GenericDistributionProviderAction> addMrssTransformFromFile(int id, InputStream xslFile, String xslFileMimeType, String xslFileName, long xslFileSize)  {
        return addMrssTransformFromFile(id, new FileHolder(xslFile, xslFileMimeType, xslFileName, xslFileSize));
    }

    public static RequestBuilder<GenericDistributionProviderAction> addMrssTransformFromFile(int id, FileInputStream xslFile, String xslFileMimeType, String xslFileName)  {
        return addMrssTransformFromFile(id, new FileHolder(xslFile, xslFileMimeType, xslFileName));
    }

	/**  Add MRSS transform file to generic distribution provider action  */
    public static RequestBuilder<GenericDistributionProviderAction> addMrssTransformFromFile(int id, FileHolder xslFile)  {
        Params kparams = new Params();
        kparams.add("id", id);
        Files kfiles = new Files();
        kfiles.add("xslFile", xslFile);

        return new RequestBuilder<GenericDistributionProviderAction>(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "addMrssTransformFromFile", kparams, kfiles);
    }

	/**  Add MRSS validate file to generic distribution provider action  */
    public static RequestBuilder<GenericDistributionProviderAction> addMrssValidate(int id, String xsdData)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("xsdData", xsdData);

        return new RequestBuilder<GenericDistributionProviderAction>(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "addMrssValidate", kparams);
    }

    public static RequestBuilder<GenericDistributionProviderAction> addMrssValidateFromFile(int id, File xsdFile)  {
        return addMrssValidateFromFile(id, new FileHolder(xsdFile));
    }

    public static RequestBuilder<GenericDistributionProviderAction> addMrssValidateFromFile(int id, InputStream xsdFile, String xsdFileMimeType, String xsdFileName, long xsdFileSize)  {
        return addMrssValidateFromFile(id, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName, xsdFileSize));
    }

    public static RequestBuilder<GenericDistributionProviderAction> addMrssValidateFromFile(int id, FileInputStream xsdFile, String xsdFileMimeType, String xsdFileName)  {
        return addMrssValidateFromFile(id, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName));
    }

	/**  Add MRSS validate file to generic distribution provider action  */
    public static RequestBuilder<GenericDistributionProviderAction> addMrssValidateFromFile(int id, FileHolder xsdFile)  {
        Params kparams = new Params();
        kparams.add("id", id);
        Files kfiles = new Files();
        kfiles.add("xsdFile", xsdFile);

        return new RequestBuilder<GenericDistributionProviderAction>(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "addMrssValidateFromFile", kparams, kfiles);
    }

	/**  Add results transform file to generic distribution provider action  */
    public static RequestBuilder<GenericDistributionProviderAction> addResultsTransform(int id, String transformData)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("transformData", transformData);

        return new RequestBuilder<GenericDistributionProviderAction>(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "addResultsTransform", kparams);
    }

    public static RequestBuilder<GenericDistributionProviderAction> addResultsTransformFromFile(int id, File transformFile)  {
        return addResultsTransformFromFile(id, new FileHolder(transformFile));
    }

    public static RequestBuilder<GenericDistributionProviderAction> addResultsTransformFromFile(int id, InputStream transformFile, String transformFileMimeType, String transformFileName, long transformFileSize)  {
        return addResultsTransformFromFile(id, new FileHolder(transformFile, transformFileMimeType, transformFileName, transformFileSize));
    }

    public static RequestBuilder<GenericDistributionProviderAction> addResultsTransformFromFile(int id, FileInputStream transformFile, String transformFileMimeType, String transformFileName)  {
        return addResultsTransformFromFile(id, new FileHolder(transformFile, transformFileMimeType, transformFileName));
    }

	/**  Add MRSS transform file to generic distribution provider action  */
    public static RequestBuilder<GenericDistributionProviderAction> addResultsTransformFromFile(int id, FileHolder transformFile)  {
        Params kparams = new Params();
        kparams.add("id", id);
        Files kfiles = new Files();
        kfiles.add("transformFile", transformFile);

        return new RequestBuilder<GenericDistributionProviderAction>(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "addResultsTransformFromFile", kparams, kfiles);
    }

	/**  Delete Generic Distribution Provider Action by id  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("contentdistribution_genericdistributionprovideraction", "delete", kparams);
    }

	/**  Delete Generic Distribution Provider Action by provider id  */
    public static RequestBuilder<Void> deleteByProviderId(int genericDistributionProviderId, DistributionAction actionType)  {
        Params kparams = new Params();
        kparams.add("genericDistributionProviderId", genericDistributionProviderId);
        kparams.add("actionType", actionType);

        return new NullRequestBuilder("contentdistribution_genericdistributionprovideraction", "deleteByProviderId", kparams);
    }

	/**  Get Generic Distribution Provider Action by id  */
    public static RequestBuilder<GenericDistributionProviderAction> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<GenericDistributionProviderAction>(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "get", kparams);
    }

	/**  Get Generic Distribution Provider Action by provider id  */
    public static RequestBuilder<GenericDistributionProviderAction> getByProviderId(int genericDistributionProviderId, DistributionAction actionType)  {
        Params kparams = new Params();
        kparams.add("genericDistributionProviderId", genericDistributionProviderId);
        kparams.add("actionType", actionType);

        return new RequestBuilder<GenericDistributionProviderAction>(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "getByProviderId", kparams);
    }

    public static RequestBuilder<ListResponse<GenericDistributionProviderAction>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<GenericDistributionProviderAction>> list(GenericDistributionProviderActionFilter filter)  {
        return list(filter, null);
    }

	/**  List all distribution providers  */
    public static RequestBuilder<ListResponse<GenericDistributionProviderAction>> list(GenericDistributionProviderActionFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<GenericDistributionProviderAction>(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "list", kparams);
    }

	/**  Update Generic Distribution Provider Action by id  */
    public static RequestBuilder<GenericDistributionProviderAction> update(int id, GenericDistributionProviderAction genericDistributionProviderAction)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("genericDistributionProviderAction", genericDistributionProviderAction);

        return new RequestBuilder<GenericDistributionProviderAction>(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "update", kparams);
    }

	/**  Update Generic Distribution Provider Action by provider id  */
    public static RequestBuilder<GenericDistributionProviderAction> updateByProviderId(int genericDistributionProviderId, DistributionAction actionType, GenericDistributionProviderAction genericDistributionProviderAction)  {
        Params kparams = new Params();
        kparams.add("genericDistributionProviderId", genericDistributionProviderId);
        kparams.add("actionType", actionType);
        kparams.add("genericDistributionProviderAction", genericDistributionProviderAction);

        return new RequestBuilder<GenericDistributionProviderAction>(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "updateByProviderId", kparams);
    }
}
