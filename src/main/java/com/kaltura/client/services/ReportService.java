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

import com.kaltura.client.Params;
import com.kaltura.client.enums.ReportType;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.KeyValue;
import com.kaltura.client.types.ReportBaseTotal;
import com.kaltura.client.types.ReportGraph;
import com.kaltura.client.types.ReportInputFilter;
import com.kaltura.client.types.ReportResponse;
import com.kaltura.client.types.ReportTable;
import com.kaltura.client.types.ReportTotal;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  api for getting reports data by the report type and some inputFilter  */
public class ReportService {

    public static RequestBuilder<ReportResponse> execute(int id)  {
        return execute(id, null);
    }

    public static RequestBuilder<ReportResponse> execute(int id, List<KeyValue> params)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("params", params);

        return new RequestBuilder<ReportResponse>(ReportResponse.class, "report", "execute", kparams);
    }

    public static RequestBuilder<List<ReportBaseTotal>> getBaseTotal(ReportType reportType, ReportInputFilter reportInputFilter)  {
        return getBaseTotal(reportType, reportInputFilter, null);
    }

	/**  report getBaseTotal action allows to get a the total base for storage reports  */
    public static RequestBuilder<List<ReportBaseTotal>> getBaseTotal(ReportType reportType, ReportInputFilter reportInputFilter, String objectIds)  {
        Params kparams = new Params();
        kparams.add("reportType", reportType);
        kparams.add("reportInputFilter", reportInputFilter);
        kparams.add("objectIds", objectIds);

        return new ArrayRequestBuilder<ReportBaseTotal>(ReportBaseTotal.class, "report", "getBaseTotal", kparams);
    }

    public static RequestBuilder<String> getCsv(int id)  {
        return getCsv(id, null);
    }

    public static RequestBuilder<String> getCsv(int id, List<KeyValue> params)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("params", params);

        return new ServeRequestBuilder("report", "getCsv", kparams);
    }

    public static RequestBuilder<String> getCsvFromStringParams(int id)  {
        return getCsvFromStringParams(id, null);
    }

	/**  Returns report CSV file executed by string params with the following convention:
	  param1=value1;param2=value2  */
    public static RequestBuilder<String> getCsvFromStringParams(int id, String params)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("params", params);

        return new ServeRequestBuilder("report", "getCsvFromStringParams", kparams);
    }

    public static RequestBuilder<List<ReportGraph>> getGraphs(ReportType reportType, ReportInputFilter reportInputFilter)  {
        return getGraphs(reportType, reportInputFilter, null);
    }

    public static RequestBuilder<List<ReportGraph>> getGraphs(ReportType reportType, ReportInputFilter reportInputFilter, String dimension)  {
        return getGraphs(reportType, reportInputFilter, dimension, null);
    }

	/**  report getGraphs action allows to get a graph data for a specific report.  */
    public static RequestBuilder<List<ReportGraph>> getGraphs(ReportType reportType, ReportInputFilter reportInputFilter, String dimension, String objectIds)  {
        Params kparams = new Params();
        kparams.add("reportType", reportType);
        kparams.add("reportInputFilter", reportInputFilter);
        kparams.add("dimension", dimension);
        kparams.add("objectIds", objectIds);

        return new ArrayRequestBuilder<ReportGraph>(ReportGraph.class, "report", "getGraphs", kparams);
    }

    public static RequestBuilder<ReportTable> getTable(ReportType reportType, ReportInputFilter reportInputFilter, FilterPager pager)  {
        return getTable(reportType, reportInputFilter, pager, null);
    }

    public static RequestBuilder<ReportTable> getTable(ReportType reportType, ReportInputFilter reportInputFilter, FilterPager pager, String order)  {
        return getTable(reportType, reportInputFilter, pager, order, null);
    }

	/**  report getTable action allows to get a graph data for a specific report.  */
    public static RequestBuilder<ReportTable> getTable(ReportType reportType, ReportInputFilter reportInputFilter, FilterPager pager, String order, String objectIds)  {
        Params kparams = new Params();
        kparams.add("reportType", reportType);
        kparams.add("reportInputFilter", reportInputFilter);
        kparams.add("pager", pager);
        kparams.add("order", order);
        kparams.add("objectIds", objectIds);

        return new RequestBuilder<ReportTable>(ReportTable.class, "report", "getTable", kparams);
    }

    public static RequestBuilder<ReportTotal> getTotal(ReportType reportType, ReportInputFilter reportInputFilter)  {
        return getTotal(reportType, reportInputFilter, null);
    }

	/**  report getTotal action allows to get a graph data for a specific report.  */
    public static RequestBuilder<ReportTotal> getTotal(ReportType reportType, ReportInputFilter reportInputFilter, String objectIds)  {
        Params kparams = new Params();
        kparams.add("reportType", reportType);
        kparams.add("reportInputFilter", reportInputFilter);
        kparams.add("objectIds", objectIds);

        return new RequestBuilder<ReportTotal>(ReportTotal.class, "report", "getTotal", kparams);
    }

    public static RequestBuilder<String> getUrlForReportAsCsv(String reportTitle, String reportText, String headers, ReportType reportType, ReportInputFilter reportInputFilter)  {
        return getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, null);
    }

    public static RequestBuilder<String> getUrlForReportAsCsv(String reportTitle, String reportText, String headers, ReportType reportType, ReportInputFilter reportInputFilter, String dimension)  {
        return getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, dimension, null);
    }

    public static RequestBuilder<String> getUrlForReportAsCsv(String reportTitle, String reportText, String headers, ReportType reportType, ReportInputFilter reportInputFilter, String dimension, FilterPager pager)  {
        return getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, dimension, pager, null);
    }

    public static RequestBuilder<String> getUrlForReportAsCsv(String reportTitle, String reportText, String headers, ReportType reportType, ReportInputFilter reportInputFilter, String dimension, FilterPager pager, String order)  {
        return getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, dimension, pager, order, null);
    }

	/**  will create a Csv file for the given report and return the URL to access it  */
    public static RequestBuilder<String> getUrlForReportAsCsv(String reportTitle, String reportText, String headers, ReportType reportType, ReportInputFilter reportInputFilter, String dimension, FilterPager pager, String order, String objectIds)  {
        Params kparams = new Params();
        kparams.add("reportTitle", reportTitle);
        kparams.add("reportText", reportText);
        kparams.add("headers", headers);
        kparams.add("reportType", reportType);
        kparams.add("reportInputFilter", reportInputFilter);
        kparams.add("dimension", dimension);
        kparams.add("pager", pager);
        kparams.add("order", order);
        kparams.add("objectIds", objectIds);

        return new RequestBuilder<String>(String.class, "report", "getUrlForReportAsCsv", kparams);
    }

	/**  Will serve a requested report  */
    public static RequestBuilder<String> serve(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<String>(String.class, "report", "serve", kparams);
    }
}
