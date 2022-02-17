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
// Copyright (C) 2006-2022  Kaltura Inc.
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

import com.kaltura.client.enums.ReportType;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.KeyValue;
import com.kaltura.client.types.ReportBaseTotal;
import com.kaltura.client.types.ReportExportParams;
import com.kaltura.client.types.ReportExportResponse;
import com.kaltura.client.types.ReportGraph;
import com.kaltura.client.types.ReportInputFilter;
import com.kaltura.client.types.ReportResponse;
import com.kaltura.client.types.ReportResponseOptions;
import com.kaltura.client.types.ReportTable;
import com.kaltura.client.types.ReportTotal;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * api for getting reports data by the report type and some inputFilter
 * 
 * @param id 
 * @param params_ 
 * @param params_ 
 * @param reportType 
 * @param reportInputFilter 
 * @param objectIds - one ID or more (separated by ',') of specific objects to query
 * @param responseOptions 
 * @param id 
 * @param params_ 
 * @param excludedFields 
 * @param id 
 * @param params_ 
 * @param excludedFields 
 * @param reportType 
 * @param reportInputFilter 
 * @param dimension 
 * @param objectIds - one ID or more (separated by ',') of specific objects to query
 * @param responseOptions 
 * @param reportType 
 * @param reportInputFilter 
 * @param pager 
 * @param order 
 * @param objectIds - one ID or more (separated by ',') of specific objects to query
 * @param responseOptions 
 * @param reportType 
 * @param reportInputFilter 
 * @param objectIds - one ID or more (separated by ',') of specific objects to query
 * @param responseOptions 
 * @param reportTitle The title of the report to display at top of CSV
 * @param reportText The text of the filter of the report
 * @param headers The headers of the columns - a map between the enumerations on the server side
 * and the their display text
 * @param reportType 
 * @param reportInputFilter 
 * @param dimension 
 * @param pager 
 * @param order 
 * @param objectIds - one ID or more (separated by ',') of specific objects to query
 * @param responseOptions 
 * @param id - the requested id
 */
public class ReportService {
	
	public static class ExecuteReportBuilder extends RequestBuilder<ReportResponse, ReportResponse.Tokenizer, ExecuteReportBuilder> {
		
		public ExecuteReportBuilder(int id, List<KeyValue> params_) {
			super(ReportResponse.class, "report", "execute");
			params.add("id", id);
			params.add("params", params_);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	public static ExecuteReportBuilder execute(int id)  {
		return execute(id, null);
	}

    public static ExecuteReportBuilder execute(int id, List<KeyValue> params)  {
		return new ExecuteReportBuilder(id, params);
	}
	
	public static class ExportToCsvReportBuilder extends RequestBuilder<ReportExportResponse, ReportExportResponse.Tokenizer, ExportToCsvReportBuilder> {
		
		public ExportToCsvReportBuilder(ReportExportParams params_) {
			super(ReportExportResponse.class, "report", "exportToCsv");
			params.add("params", params_);
		}
	}

    public static ExportToCsvReportBuilder exportToCsv(ReportExportParams params)  {
		return new ExportToCsvReportBuilder(params);
	}
	
	public static class GetBaseTotalReportBuilder extends ArrayRequestBuilder<ReportBaseTotal, ReportBaseTotal.Tokenizer, GetBaseTotalReportBuilder> {
		
		public GetBaseTotalReportBuilder(ReportType reportType, ReportInputFilter reportInputFilter, String objectIds, ReportResponseOptions responseOptions) {
			super(ReportBaseTotal.class, "report", "getBaseTotal");
			params.add("reportType", reportType);
			params.add("reportInputFilter", reportInputFilter);
			params.add("objectIds", objectIds);
			params.add("responseOptions", responseOptions);
		}
		
		public void reportType(String multirequestToken) {
			params.add("reportType", multirequestToken);
		}
		
		public void objectIds(String multirequestToken) {
			params.add("objectIds", multirequestToken);
		}
	}

	public static GetBaseTotalReportBuilder getBaseTotal(ReportType reportType, ReportInputFilter reportInputFilter)  {
		return getBaseTotal(reportType, reportInputFilter, null);
	}

	public static GetBaseTotalReportBuilder getBaseTotal(ReportType reportType, ReportInputFilter reportInputFilter, String objectIds)  {
		return getBaseTotal(reportType, reportInputFilter, objectIds, null);
	}

	/**
	 * report getBaseTotal action allows to get the total base for storage reports
	 * 
	 * @param reportType 
	 * @param reportInputFilter 
	 * @param objectIds - one ID or more (separated by ',') of specific objects to query
	 * @param responseOptions 
	 */
    public static GetBaseTotalReportBuilder getBaseTotal(ReportType reportType, ReportInputFilter reportInputFilter, String objectIds, ReportResponseOptions responseOptions)  {
		return new GetBaseTotalReportBuilder(reportType, reportInputFilter, objectIds, responseOptions);
	}
	
	public static class GetCsvReportBuilder extends ServeRequestBuilder {
		
		public GetCsvReportBuilder(int id, List<KeyValue> params_, String excludedFields) {
			super("report", "getCsv");
			params.add("id", id);
			params.add("params", params_);
			params.add("excludedFields", excludedFields);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void excludedFields(String multirequestToken) {
			params.add("excludedFields", multirequestToken);
		}
	}

	public static GetCsvReportBuilder getCsv(int id)  {
		return getCsv(id, null);
	}

	public static GetCsvReportBuilder getCsv(int id, List<KeyValue> params)  {
		return getCsv(id, params, null);
	}

    public static GetCsvReportBuilder getCsv(int id, List<KeyValue> params, String excludedFields)  {
		return new GetCsvReportBuilder(id, params, excludedFields);
	}
	
	public static class GetCsvFromStringParamsReportBuilder extends ServeRequestBuilder {
		
		public GetCsvFromStringParamsReportBuilder(int id, String params_, String excludedFields) {
			super("report", "getCsvFromStringParams");
			params.add("id", id);
			params.add("params", params_);
			params.add("excludedFields", excludedFields);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void params(String multirequestToken) {
			params.add("params", multirequestToken);
		}
		
		public void excludedFields(String multirequestToken) {
			params.add("excludedFields", multirequestToken);
		}
	}

	public static GetCsvFromStringParamsReportBuilder getCsvFromStringParams(int id)  {
		return getCsvFromStringParams(id, null);
	}

	public static GetCsvFromStringParamsReportBuilder getCsvFromStringParams(int id, String params)  {
		return getCsvFromStringParams(id, params, null);
	}

	/**
	 * Returns report CSV file executed by string params with the following convention:
	  param1=value1;param2=value2   excludedFields can be supplied comma separated
	 * 
	 * @param id 
	 * @param params_ 
	 * @param excludedFields 
	 */
    public static GetCsvFromStringParamsReportBuilder getCsvFromStringParams(int id, String params, String excludedFields)  {
		return new GetCsvFromStringParamsReportBuilder(id, params, excludedFields);
	}
	
	public static class GetGraphsReportBuilder extends ArrayRequestBuilder<ReportGraph, ReportGraph.Tokenizer, GetGraphsReportBuilder> {
		
		public GetGraphsReportBuilder(ReportType reportType, ReportInputFilter reportInputFilter, String dimension, String objectIds, ReportResponseOptions responseOptions) {
			super(ReportGraph.class, "report", "getGraphs");
			params.add("reportType", reportType);
			params.add("reportInputFilter", reportInputFilter);
			params.add("dimension", dimension);
			params.add("objectIds", objectIds);
			params.add("responseOptions", responseOptions);
		}
		
		public void reportType(String multirequestToken) {
			params.add("reportType", multirequestToken);
		}
		
		public void dimension(String multirequestToken) {
			params.add("dimension", multirequestToken);
		}
		
		public void objectIds(String multirequestToken) {
			params.add("objectIds", multirequestToken);
		}
	}

	public static GetGraphsReportBuilder getGraphs(ReportType reportType, ReportInputFilter reportInputFilter)  {
		return getGraphs(reportType, reportInputFilter, null);
	}

	public static GetGraphsReportBuilder getGraphs(ReportType reportType, ReportInputFilter reportInputFilter, String dimension)  {
		return getGraphs(reportType, reportInputFilter, dimension, null);
	}

	public static GetGraphsReportBuilder getGraphs(ReportType reportType, ReportInputFilter reportInputFilter, String dimension, String objectIds)  {
		return getGraphs(reportType, reportInputFilter, dimension, objectIds, null);
	}

	/**
	 * report getGraphs action allows to get a graph data for a specific report.
	 * 
	 * @param reportType 
	 * @param reportInputFilter 
	 * @param dimension 
	 * @param objectIds - one ID or more (separated by ',') of specific objects to query
	 * @param responseOptions 
	 */
    public static GetGraphsReportBuilder getGraphs(ReportType reportType, ReportInputFilter reportInputFilter, String dimension, String objectIds, ReportResponseOptions responseOptions)  {
		return new GetGraphsReportBuilder(reportType, reportInputFilter, dimension, objectIds, responseOptions);
	}
	
	public static class GetTableReportBuilder extends RequestBuilder<ReportTable, ReportTable.Tokenizer, GetTableReportBuilder> {
		
		public GetTableReportBuilder(ReportType reportType, ReportInputFilter reportInputFilter, FilterPager pager, String order, String objectIds, ReportResponseOptions responseOptions) {
			super(ReportTable.class, "report", "getTable");
			params.add("reportType", reportType);
			params.add("reportInputFilter", reportInputFilter);
			params.add("pager", pager);
			params.add("order", order);
			params.add("objectIds", objectIds);
			params.add("responseOptions", responseOptions);
		}
		
		public void reportType(String multirequestToken) {
			params.add("reportType", multirequestToken);
		}
		
		public void order(String multirequestToken) {
			params.add("order", multirequestToken);
		}
		
		public void objectIds(String multirequestToken) {
			params.add("objectIds", multirequestToken);
		}
	}

	public static GetTableReportBuilder getTable(ReportType reportType, ReportInputFilter reportInputFilter, FilterPager pager)  {
		return getTable(reportType, reportInputFilter, pager, null);
	}

	public static GetTableReportBuilder getTable(ReportType reportType, ReportInputFilter reportInputFilter, FilterPager pager, String order)  {
		return getTable(reportType, reportInputFilter, pager, order, null);
	}

	public static GetTableReportBuilder getTable(ReportType reportType, ReportInputFilter reportInputFilter, FilterPager pager, String order, String objectIds)  {
		return getTable(reportType, reportInputFilter, pager, order, objectIds, null);
	}

	/**
	 * report getTable action allows to get a graph data for a specific report.
	 * 
	 * @param reportType 
	 * @param reportInputFilter 
	 * @param pager 
	 * @param order 
	 * @param objectIds - one ID or more (separated by ',') of specific objects to query
	 * @param responseOptions 
	 */
    public static GetTableReportBuilder getTable(ReportType reportType, ReportInputFilter reportInputFilter, FilterPager pager, String order, String objectIds, ReportResponseOptions responseOptions)  {
		return new GetTableReportBuilder(reportType, reportInputFilter, pager, order, objectIds, responseOptions);
	}
	
	public static class GetTotalReportBuilder extends RequestBuilder<ReportTotal, ReportTotal.Tokenizer, GetTotalReportBuilder> {
		
		public GetTotalReportBuilder(ReportType reportType, ReportInputFilter reportInputFilter, String objectIds, ReportResponseOptions responseOptions) {
			super(ReportTotal.class, "report", "getTotal");
			params.add("reportType", reportType);
			params.add("reportInputFilter", reportInputFilter);
			params.add("objectIds", objectIds);
			params.add("responseOptions", responseOptions);
		}
		
		public void reportType(String multirequestToken) {
			params.add("reportType", multirequestToken);
		}
		
		public void objectIds(String multirequestToken) {
			params.add("objectIds", multirequestToken);
		}
	}

	public static GetTotalReportBuilder getTotal(ReportType reportType, ReportInputFilter reportInputFilter)  {
		return getTotal(reportType, reportInputFilter, null);
	}

	public static GetTotalReportBuilder getTotal(ReportType reportType, ReportInputFilter reportInputFilter, String objectIds)  {
		return getTotal(reportType, reportInputFilter, objectIds, null);
	}

	/**
	 * report getTotal action allows to get a graph data for a specific report.
	 * 
	 * @param reportType 
	 * @param reportInputFilter 
	 * @param objectIds - one ID or more (separated by ',') of specific objects to query
	 * @param responseOptions 
	 */
    public static GetTotalReportBuilder getTotal(ReportType reportType, ReportInputFilter reportInputFilter, String objectIds, ReportResponseOptions responseOptions)  {
		return new GetTotalReportBuilder(reportType, reportInputFilter, objectIds, responseOptions);
	}
	
	public static class GetUrlForReportAsCsvReportBuilder extends RequestBuilder<String, String, GetUrlForReportAsCsvReportBuilder> {
		
		public GetUrlForReportAsCsvReportBuilder(String reportTitle, String reportText, String headers, ReportType reportType, ReportInputFilter reportInputFilter, String dimension, FilterPager pager, String order, String objectIds, ReportResponseOptions responseOptions) {
			super(String.class, "report", "getUrlForReportAsCsv");
			params.add("reportTitle", reportTitle);
			params.add("reportText", reportText);
			params.add("headers", headers);
			params.add("reportType", reportType);
			params.add("reportInputFilter", reportInputFilter);
			params.add("dimension", dimension);
			params.add("pager", pager);
			params.add("order", order);
			params.add("objectIds", objectIds);
			params.add("responseOptions", responseOptions);
		}
		
		public void reportTitle(String multirequestToken) {
			params.add("reportTitle", multirequestToken);
		}
		
		public void reportText(String multirequestToken) {
			params.add("reportText", multirequestToken);
		}
		
		public void headers(String multirequestToken) {
			params.add("headers", multirequestToken);
		}
		
		public void reportType(String multirequestToken) {
			params.add("reportType", multirequestToken);
		}
		
		public void dimension(String multirequestToken) {
			params.add("dimension", multirequestToken);
		}
		
		public void order(String multirequestToken) {
			params.add("order", multirequestToken);
		}
		
		public void objectIds(String multirequestToken) {
			params.add("objectIds", multirequestToken);
		}
	}

	public static GetUrlForReportAsCsvReportBuilder getUrlForReportAsCsv(String reportTitle, String reportText, String headers, ReportType reportType, ReportInputFilter reportInputFilter)  {
		return getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, null);
	}

	public static GetUrlForReportAsCsvReportBuilder getUrlForReportAsCsv(String reportTitle, String reportText, String headers, ReportType reportType, ReportInputFilter reportInputFilter, String dimension)  {
		return getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, dimension, null);
	}

	public static GetUrlForReportAsCsvReportBuilder getUrlForReportAsCsv(String reportTitle, String reportText, String headers, ReportType reportType, ReportInputFilter reportInputFilter, String dimension, FilterPager pager)  {
		return getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, dimension, pager, null);
	}

	public static GetUrlForReportAsCsvReportBuilder getUrlForReportAsCsv(String reportTitle, String reportText, String headers, ReportType reportType, ReportInputFilter reportInputFilter, String dimension, FilterPager pager, String order)  {
		return getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, dimension, pager, order, null);
	}

	public static GetUrlForReportAsCsvReportBuilder getUrlForReportAsCsv(String reportTitle, String reportText, String headers, ReportType reportType, ReportInputFilter reportInputFilter, String dimension, FilterPager pager, String order, String objectIds)  {
		return getUrlForReportAsCsv(reportTitle, reportText, headers, reportType, reportInputFilter, dimension, pager, order, objectIds, null);
	}

	/**
	 * will create a CSV file for the given report and return the URL to access it
	 * 
	 * @param reportTitle The title of the report to display at top of CSV
	 * @param reportText The text of the filter of the report
	 * @param headers The headers of the columns - a map between the enumerations on the server side
	 * and the their display text
	 * @param reportType 
	 * @param reportInputFilter 
	 * @param dimension 
	 * @param pager 
	 * @param order 
	 * @param objectIds - one ID or more (separated by ',') of specific objects to query
	 * @param responseOptions 
	 */
    public static GetUrlForReportAsCsvReportBuilder getUrlForReportAsCsv(String reportTitle, String reportText, String headers, ReportType reportType, ReportInputFilter reportInputFilter, String dimension, FilterPager pager, String order, String objectIds, ReportResponseOptions responseOptions)  {
		return new GetUrlForReportAsCsvReportBuilder(reportTitle, reportText, headers, reportType, reportInputFilter, dimension, pager, order, objectIds, responseOptions);
	}
	
	public static class ServeReportBuilder extends RequestBuilder<String, String, ServeReportBuilder> {
		
		public ServeReportBuilder(String id) {
			super(String.class, "report", "serve");
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
    public static ServeReportBuilder serve(String id)  {
		return new ServeReportBuilder(id);
	}
}
