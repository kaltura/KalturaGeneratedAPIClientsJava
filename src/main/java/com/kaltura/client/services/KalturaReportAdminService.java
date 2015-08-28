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
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Fri, 28 Aug 15 11:14:38 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaReportAdminService extends KalturaServiceBase {
    public KalturaReportAdminService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public KalturaReport add(KalturaReport report) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("report", report);
        this.kalturaClient.queueServiceCall("adminconsole_reportadmin", "add", kparams, KalturaReport.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaReport.class, resultXmlElement);
    }

    public KalturaReport get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("adminconsole_reportadmin", "get", kparams, KalturaReport.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaReport.class, resultXmlElement);
    }

    public KalturaReportListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaReportListResponse list(KalturaReportFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

    public KalturaReportListResponse list(KalturaReportFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("adminconsole_reportadmin", "list", kparams, KalturaReportListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaReportListResponse.class, resultXmlElement);
    }

    public KalturaReport update(int id, KalturaReport report) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("report", report);
        this.kalturaClient.queueServiceCall("adminconsole_reportadmin", "update", kparams, KalturaReport.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaReport.class, resultXmlElement);
    }

    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("adminconsole_reportadmin", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaReportResponse executeDebug(int id) throws KalturaApiException {
        return this.executeDebug(id, null);
    }

    public KalturaReportResponse executeDebug(int id, ArrayList<KalturaKeyValue> params) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("params", params);
        this.kalturaClient.queueServiceCall("adminconsole_reportadmin", "executeDebug", kparams, KalturaReportResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaReportResponse.class, resultXmlElement);
    }

    public List<KalturaString> getParameters(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("adminconsole_reportadmin", "getParameters", kparams, KalturaString.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaString.class, resultXmlElement);
    }

    public String getCsvUrl(int id, int reportPartnerId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("reportPartnerId", reportPartnerId);
        this.kalturaClient.queueServiceCall("adminconsole_reportadmin", "getCsvUrl", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }
}
