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
import com.kaltura.client.enums.LiveReportExportType;
import com.kaltura.client.enums.LiveReportType;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.LiveReportExportParams;
import com.kaltura.client.types.LiveReportExportResponse;
import com.kaltura.client.types.LiveReportInputFilter;
import com.kaltura.client.types.ReportGraph;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class LiveReportsService {

    public static RequestBuilder<LiveReportExportResponse> exportToCsv(LiveReportExportType reportType, LiveReportExportParams params)  {
        Params kparams = new Params();
        kparams.add("reportType", reportType);
        kparams.add("params", params);

        return new RequestBuilder<LiveReportExportResponse>(LiveReportExportResponse.class, "livereports", "exportToCsv", kparams);
    }

    public static RequestBuilder<List<ReportGraph>> getEvents(LiveReportType reportType)  {
        return getEvents(reportType, null);
    }

    public static RequestBuilder<List<ReportGraph>> getEvents(LiveReportType reportType, LiveReportInputFilter filter)  {
        return getEvents(reportType, filter, null);
    }

    public static RequestBuilder<List<ReportGraph>> getEvents(LiveReportType reportType, LiveReportInputFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("reportType", reportType);
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ArrayRequestBuilder<ReportGraph>(ReportGraph.class, "livereports", "getEvents", kparams);
    }

	/**  Will serve a requested report  */
    public static RequestBuilder<String> serveReport(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<String>(String.class, "livereports", "serveReport", kparams);
    }
}
