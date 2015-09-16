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
import java.util.List;
import com.kaltura.client.types.*;
import com.kaltura.client.enums.*;
import org.w3c.dom.Element;
import com.kaltura.client.utils.ParseUtils;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Wed, 16 Sep 15 15:33:32 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaLiveReportsService extends KalturaServiceBase {
    public KalturaLiveReportsService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public List<KalturaReportGraph> getEvents(KalturaLiveReportType reportType) throws KalturaApiException {
        return this.getEvents(reportType, null);
    }

    public List<KalturaReportGraph> getEvents(KalturaLiveReportType reportType, KalturaLiveReportInputFilter filter) throws KalturaApiException {
        return this.getEvents(reportType, filter, null);
    }

    public List<KalturaReportGraph> getEvents(KalturaLiveReportType reportType, KalturaLiveReportInputFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("reportType", reportType);
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("livereports", "getEvents", kparams, KalturaReportGraph.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaReportGraph.class, resultXmlElement);
    }

    public KalturaLiveStatsListResponse getReport(KalturaLiveReportType reportType) throws KalturaApiException {
        return this.getReport(reportType, null);
    }

    public KalturaLiveStatsListResponse getReport(KalturaLiveReportType reportType, KalturaLiveReportInputFilter filter) throws KalturaApiException {
        return this.getReport(reportType, filter, null);
    }

    public KalturaLiveStatsListResponse getReport(KalturaLiveReportType reportType, KalturaLiveReportInputFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("reportType", reportType);
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("livereports", "getReport", kparams, KalturaLiveStatsListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaLiveStatsListResponse.class, resultXmlElement);
    }

    public KalturaLiveReportExportResponse exportToCsv(KalturaLiveReportExportType reportType, KalturaLiveReportExportParams params) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("reportType", reportType);
        kparams.add("params", params);
        this.kalturaClient.queueServiceCall("livereports", "exportToCsv", kparams, KalturaLiveReportExportResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaLiveReportExportResponse.class, resultXmlElement);
    }

	/**  Will serve a requested report     */
    public String serveReport(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("livereports", "serveReport", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }
}
