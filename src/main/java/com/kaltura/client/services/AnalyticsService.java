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
// Copyright (C) 2006-2021  Kaltura Inc.
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

import com.kaltura.client.types.AnalyticsFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ReportResponse;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * api for getting analytics data
 * 
 * @param filter the analytics query filter
 * @param pager the analytics query result pager
 */
public class AnalyticsService {
	
	public static class QueryAnalyticsBuilder extends RequestBuilder<ReportResponse, ReportResponse.Tokenizer, QueryAnalyticsBuilder> {
		
		public QueryAnalyticsBuilder(AnalyticsFilter filter, FilterPager pager) {
			super(ReportResponse.class, "analytics", "query");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static QueryAnalyticsBuilder query(AnalyticsFilter filter)  {
		return query(filter, null);
	}

	/**
	 * report query action allows to get a analytics data for specific query
	  dimensions, metrics and filters.
	 * 
	 * @param filter the analytics query filter
	 * @param pager the analytics query result pager
	 */
    public static QueryAnalyticsBuilder query(AnalyticsFilter filter, FilterPager pager)  {
		return new QueryAnalyticsBuilder(filter, pager);
	}
}
