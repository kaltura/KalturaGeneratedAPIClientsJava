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
import com.kaltura.client.types.*;
import org.w3c.dom.Element;
import com.kaltura.client.utils.ParseUtils;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.kaltura.client.KalturaFiles;
import com.kaltura.client.KalturaFile;
import com.kaltura.client.enums.*;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Wed, 29 Apr 15 00:20:29 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Generic Distribution Provider Actions service    */
@SuppressWarnings("serial")
public class KalturaGenericDistributionProviderActionService extends KalturaServiceBase {
    public KalturaGenericDistributionProviderActionService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new Generic Distribution Provider Action     */
    public KalturaGenericDistributionProviderAction add(KalturaGenericDistributionProviderAction genericDistributionProviderAction) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("genericDistributionProviderAction", genericDistributionProviderAction);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "add", kparams, KalturaGenericDistributionProviderAction.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Add MRSS transform file to generic distribution provider action     */
    public KalturaGenericDistributionProviderAction addMrssTransform(int id, String xslData) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("xslData", xslData);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "addMrssTransform", kparams, KalturaGenericDistributionProviderAction.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProviderAction.class, resultXmlElement);
    }

    public KalturaGenericDistributionProviderAction addMrssTransformFromFile(int id, File xslFile) throws KalturaApiException {
        return this.addMrssTransformFromFile(id, new KalturaFile(xslFile));
    }

    public KalturaGenericDistributionProviderAction addMrssTransformFromFile(int id, InputStream xslFile, String xslFileName, long xslFileSize) throws KalturaApiException {
        return this.addMrssTransformFromFile(id, new KalturaFile(xslFile, xslFileName, xslFileSize));
    }

    public KalturaGenericDistributionProviderAction addMrssTransformFromFile(int id, FileInputStream xslFile, String xslFileName) throws KalturaApiException {
        return this.addMrssTransformFromFile(id, new KalturaFile(xslFile, xslFileName));
    }

	/**  Add MRSS transform file to generic distribution provider action     */
    public KalturaGenericDistributionProviderAction addMrssTransformFromFile(int id, KalturaFile xslFile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        KalturaFiles kfiles = new KalturaFiles();
        kfiles.add("xslFile", xslFile);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "addMrssTransformFromFile", kparams, kfiles, KalturaGenericDistributionProviderAction.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Add MRSS validate file to generic distribution provider action     */
    public KalturaGenericDistributionProviderAction addMrssValidate(int id, String xsdData) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("xsdData", xsdData);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "addMrssValidate", kparams, KalturaGenericDistributionProviderAction.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProviderAction.class, resultXmlElement);
    }

    public KalturaGenericDistributionProviderAction addMrssValidateFromFile(int id, File xsdFile) throws KalturaApiException {
        return this.addMrssValidateFromFile(id, new KalturaFile(xsdFile));
    }

    public KalturaGenericDistributionProviderAction addMrssValidateFromFile(int id, InputStream xsdFile, String xsdFileName, long xsdFileSize) throws KalturaApiException {
        return this.addMrssValidateFromFile(id, new KalturaFile(xsdFile, xsdFileName, xsdFileSize));
    }

    public KalturaGenericDistributionProviderAction addMrssValidateFromFile(int id, FileInputStream xsdFile, String xsdFileName) throws KalturaApiException {
        return this.addMrssValidateFromFile(id, new KalturaFile(xsdFile, xsdFileName));
    }

	/**  Add MRSS validate file to generic distribution provider action     */
    public KalturaGenericDistributionProviderAction addMrssValidateFromFile(int id, KalturaFile xsdFile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        KalturaFiles kfiles = new KalturaFiles();
        kfiles.add("xsdFile", xsdFile);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "addMrssValidateFromFile", kparams, kfiles, KalturaGenericDistributionProviderAction.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Add results transform file to generic distribution provider action     */
    public KalturaGenericDistributionProviderAction addResultsTransform(int id, String transformData) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("transformData", transformData);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "addResultsTransform", kparams, KalturaGenericDistributionProviderAction.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProviderAction.class, resultXmlElement);
    }

    public KalturaGenericDistributionProviderAction addResultsTransformFromFile(int id, File transformFile) throws KalturaApiException {
        return this.addResultsTransformFromFile(id, new KalturaFile(transformFile));
    }

    public KalturaGenericDistributionProviderAction addResultsTransformFromFile(int id, InputStream transformFile, String transformFileName, long transformFileSize) throws KalturaApiException {
        return this.addResultsTransformFromFile(id, new KalturaFile(transformFile, transformFileName, transformFileSize));
    }

    public KalturaGenericDistributionProviderAction addResultsTransformFromFile(int id, FileInputStream transformFile, String transformFileName) throws KalturaApiException {
        return this.addResultsTransformFromFile(id, new KalturaFile(transformFile, transformFileName));
    }

	/**  Add MRSS transform file to generic distribution provider action     */
    public KalturaGenericDistributionProviderAction addResultsTransformFromFile(int id, KalturaFile transformFile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        KalturaFiles kfiles = new KalturaFiles();
        kfiles.add("transformFile", transformFile);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "addResultsTransformFromFile", kparams, kfiles, KalturaGenericDistributionProviderAction.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Get Generic Distribution Provider Action by id     */
    public KalturaGenericDistributionProviderAction get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "get", kparams, KalturaGenericDistributionProviderAction.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Get Generic Distribution Provider Action by provider id     */
    public KalturaGenericDistributionProviderAction getByProviderId(int genericDistributionProviderId, KalturaDistributionAction actionType) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("genericDistributionProviderId", genericDistributionProviderId);
        kparams.add("actionType", actionType);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "getByProviderId", kparams, KalturaGenericDistributionProviderAction.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Update Generic Distribution Provider Action by provider id     */
    public KalturaGenericDistributionProviderAction updateByProviderId(int genericDistributionProviderId, KalturaDistributionAction actionType, KalturaGenericDistributionProviderAction genericDistributionProviderAction) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("genericDistributionProviderId", genericDistributionProviderId);
        kparams.add("actionType", actionType);
        kparams.add("genericDistributionProviderAction", genericDistributionProviderAction);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "updateByProviderId", kparams, KalturaGenericDistributionProviderAction.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Update Generic Distribution Provider Action by id     */
    public KalturaGenericDistributionProviderAction update(int id, KalturaGenericDistributionProviderAction genericDistributionProviderAction) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("genericDistributionProviderAction", genericDistributionProviderAction);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "update", kparams, KalturaGenericDistributionProviderAction.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProviderAction.class, resultXmlElement);
    }

	/**  Delete Generic Distribution Provider Action by id     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

	/**  Delete Generic Distribution Provider Action by provider id     */
    public void deleteByProviderId(int genericDistributionProviderId, KalturaDistributionAction actionType) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("genericDistributionProviderId", genericDistributionProviderId);
        kparams.add("actionType", actionType);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "deleteByProviderId", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaGenericDistributionProviderActionListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaGenericDistributionProviderActionListResponse list(KalturaGenericDistributionProviderActionFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List all distribution providers     */
    public KalturaGenericDistributionProviderActionListResponse list(KalturaGenericDistributionProviderActionFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovideraction", "list", kparams, KalturaGenericDistributionProviderActionListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProviderActionListResponse.class, resultXmlElement);
    }
}
