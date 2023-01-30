// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platforms allow them to do with
// text.
//
// Copyright (C) 2006-2023  Kaltura Inc.
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

import com.kaltura.client.enums.LiveReportExportType;
import com.kaltura.client.enums.LiveReportType;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.LiveReportExportParams;
import com.kaltura.client.types.LiveReportExportResponse;
import com.kaltura.client.types.LiveReportInputFilter;
import com.kaltura.client.types.ReportGraph;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class LiveReportsService {
	
	public static class ExportToCsvLiveReportsBuilder extends RequestBuilder<LiveReportExportResponse, LiveReportExportResponse.Tokenizer, ExportToCsvLiveReportsBuilder> {
		
		public ExportToCsvLiveReportsBuilder(LiveReportExportType reportType, LiveReportExportParams params_) {
			super(LiveReportExportResponse.class, "livereports", "exportToCsv");
			params.add("reportType", reportType);
			params.add("params", params_);
		}
		
		public void reportType(String multirequestToken) {
			params.add("reportType", multirequestToken);
		}
	}

    public static ExportToCsvLiveReportsBuilder exportToCsv(LiveReportExportType reportType, LiveReportExportParams params)  {
		return new ExportToCsvLiveReportsBuilder(reportType, params);
	}
	
	public static class GetEventsLiveReportsBuilder extends ArrayRequestBuilder<ReportGraph, ReportGraph.Tokenizer, GetEventsLiveReportsBuilder> {
		
		public GetEventsLiveReportsBuilder(LiveReportType reportType, LiveReportInputFilter filter, FilterPager pager) {
			super(ReportGraph.class, "livereports", "getEvents");
			params.add("reportType", reportType);
			params.add("filter", filter);
			params.add("pager", pager);
		}
		
		public void reportType(String multirequestToken) {
			params.add("reportType", multirequestToken);
		}
	}

	public static GetEventsLiveReportsBuilder getEvents(LiveReportType reportType)  {
		return getEvents(reportType, null);
	}

	public static GetEventsLiveReportsBuilder getEvents(LiveReportType reportType, LiveReportInputFilter filter)  {
		return getEvents(reportType, filter, null);
	}

    public static GetEventsLiveReportsBuilder getEvents(LiveReportType reportType, LiveReportInputFilter filter, FilterPager pager)  {
		return new GetEventsLiveReportsBuilder(reportType, filter, pager);
	}
	
	public static class ServeReportLiveReportsBuilder extends RequestBuilder<String, String, ServeReportLiveReportsBuilder> {
		
		public ServeReportLiveReportsBuilder(String id) {
			super(String.class, "livereports", "serveReport");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Will serve a requested report
	 * 
	 * @param id - the requested id
	 */
    public static ServeReportLiveReportsBuilder serveReport(String id)  {
		return new ServeReportLiveReportsBuilder(id);
	}
}
