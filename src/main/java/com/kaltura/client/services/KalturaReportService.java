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
import java.util.ArrayList;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Wed, 09 Sep 15 02:17:13 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  api for getting reports data by the report type and some inputFilter    */
@SuppressWarnings("serial")
public class KalturaReportService extends KalturaServiceBase {
    public KalturaReportService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public List<KalturaReportGraph> getGraphs(KalturaReportType reportType, KalturaReportInputFilter reportInputFilter) throws KalturaApiException {
        return this.getGraphs(reportType, reportInputFilter, null);
    }

    public List<KalturaReportGraph> getGraphs(KalturaReportType reportType, KalturaReportInputFilter reportInputFilter, String dimension) throws KalturaApiException {
        return this.getGraphs(reportType, reportInputFilter, dimension, null);
    }

	/**  report getGraphs action allows to get a graph data for a specific report.      */
    public List<KalturaReportGraph> getGraphs(KalturaReportType reportType, KalturaReportInputFilter reportInputFilter, String dimension, String objectIds) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("reportType", reportType);
        kparams.add("reportInputFilter", reportInputFilter);
        kparams.add("dimension", dimension);
        kparams.add("objectIds", objectIds);
        this.kalturaClient.queueServiceCall("report", "getGraphs", kparams, KalturaReportGraph.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaReportGraph.class, resultXmlElement);
    }

    public KalturaReportTotal getTotal(KalturaReportType reportType, KalturaReportInputFilter reportInputFilter) throws KalturaApiException {
        return this.getTotal(reportType, reportInputFilter, null);
    }

	/**  report getTotal action allows to get a graph data for a specific report.      */
    public KalturaReportTotal getTotal(KalturaReportType reportType, KalturaReportInputFilter reportInputFilter, String objectIds) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("reportType", reportType);
        kparams.add("reportInputFilter", reportInputFilter);
        kparams.add("objectIds", objectIds);
        this.kalturaClient.queueServiceCall("report", "getTotal", kparams, KalturaReportTotal.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaReportTotal.class, resultXmlElement);
    }

    public List<KalturaReportBaseTotal> getBaseTotal(KalturaReportType reportType, KalturaReportInputFilter reportInputFilter) throws KalturaApiException {
        return this.getBaseTotal(reportType, reportInputFilter, null);
    }

	/**  report getBaseTotal action allows to get a the total base for storage reports   
	     */
    public List<KalturaReportBaseTotal> getBaseTotal(KalturaReportType reportType, KalturaReportInputFilter reportInputFilter, String objectIds) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("reportType", reportType);
        kparams.add("reportInputFilter", reportInputFilter);
        kparams.add("objectIds", objectIds);
        this.kalturaClient.queueServiceCall("report", "getBaseTotal", kparams, KalturaReportBaseTotal.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaReportBaseTotal.class, resultXmlElement);
    }

    public KalturaReportTable getTable(KalturaReportType reportType, KalturaReportInputFilter reportInputFilter, KalturaFilterPager pager) throws KalturaApiException {
        return this.getTable(reportType, reportInputFilter, pager, null);
    }

    public KalturaReportTable getTable(KalturaReportType reportType, KalturaReportInputFilter reportInputFilter, KalturaFilterPager pager, String order) throws KalturaApiException {
        return this.getTable(reportType, reportInputFilter, pager, order, null);
    }

	/**  report getTable action allows to get a graph data for a specific report.      */
    public KalturaReportTable getTable(KalturaReportType reportType, KalturaReportInputFilter reportInputFilter, KalturaFilterPager pager, String order, String objectIds) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("reportType", reportType);
        kparams.add("reportInputFilter", reportInputFilter);
        kparams.add("pager", pager);
        kparams.add("order", order);
        kparams.add("objectIds", objectIds);
        this.kalturaClient.queueServiceCall("report", "getTable", kparams, KalturaReportTable.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaReportTable.class, resultXmlElement);
    }

    public String getUrlForReportAsCsv(String reportTitle, String reportText, String headers, KalturaReportType reportType, KalturaReportInputFilter reportInputFilter) throws KalturaApiException {
        return this.getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, null);
    }

    public String getUrlForReportAsCsv(String reportTitle, String reportText, String headers, KalturaReportType reportType, KalturaReportInputFilter reportInputFilter, String dimension) throws KalturaApiException {
        return this.getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, dimension, null);
    }

    public String getUrlForReportAsCsv(String reportTitle, String reportText, String headers, KalturaReportType reportType, KalturaReportInputFilter reportInputFilter, String dimension, KalturaFilterPager pager) throws KalturaApiException {
        return this.getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, dimension, pager, null);
    }

    public String getUrlForReportAsCsv(String reportTitle, String reportText, String headers, KalturaReportType reportType, KalturaReportInputFilter reportInputFilter, String dimension, KalturaFilterPager pager, String order) throws KalturaApiException {
        return this.getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, dimension, pager, order, null);
    }

	/**  will create a Csv file for the given report and return the URL to access it     */
    public String getUrlForReportAsCsv(String reportTitle, String reportText, String headers, KalturaReportType reportType, KalturaReportInputFilter reportInputFilter, String dimension, KalturaFilterPager pager, String order, String objectIds) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("reportTitle", reportTitle);
        kparams.add("reportText", reportText);
        kparams.add("headers", headers);
        kparams.add("reportType", reportType);
        kparams.add("reportInputFilter", reportInputFilter);
        kparams.add("dimension", dimension);
        kparams.add("pager", pager);
        kparams.add("order", order);
        kparams.add("objectIds", objectIds);
        this.kalturaClient.queueServiceCall("report", "getUrlForReportAsCsv", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

	/**  Will serve a requested report     */
    public String serve(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("report", "serve", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public KalturaReportResponse execute(int id) throws KalturaApiException {
        return this.execute(id, null);
    }

    public KalturaReportResponse execute(int id, ArrayList<KalturaKeyValue> params) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("params", params);
        this.kalturaClient.queueServiceCall("report", "execute", kparams, KalturaReportResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaReportResponse.class, resultXmlElement);
    }

    public String getCsv(int id) throws KalturaApiException {
        return this.getCsv(id, null);
    }

    public String getCsv(int id, ArrayList<KalturaKeyValue> params) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("params", params);
        this.kalturaClient.queueServiceCall("report", "getCsv", kparams);
        return this.kalturaClient.serve();
    }

    public String getCsvFromStringParams(int id) throws KalturaApiException {
        return this.getCsvFromStringParams(id, null);
    }

	/**  Returns report CSV file executed by string params with the following convention:
	  param1=value1;param2=value2      */
    public String getCsvFromStringParams(int id, String params) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("params", params);
        this.kalturaClient.queueServiceCall("report", "getCsvFromStringParams", kparams);
        return this.kalturaClient.serve();
    }
}
