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

import com.kaltura.client.types.CEError;
import com.kaltura.client.types.StatsEvent;
import com.kaltura.client.types.StatsKmcEvent;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Stats Service  */
public class StatsService {
	
	public static class CollectStatsBuilder extends RequestBuilder<Boolean, String, CollectStatsBuilder> {
		
		public CollectStatsBuilder(StatsEvent event) {
			super(Boolean.class, "stats", "collect");
			params.add("event", event);
		}
	}

	/**  Will write to the event log a single line representing the event   client
	  version - will help interprete the line structure. different client versions
	  might have slightly different data/data formats in the line event_id - number is
	  the row number in yuval's excel datetime - same format as MySql's datetime - can
	  change and should reflect the time zone session id - can be some big random
	  number or guid partner id entry id unique viewer widget id ui_conf id uid - the
	  puser id as set by the ppartner current point - in milliseconds duration -
	  milliseconds user ip process duration - in milliseconds control id seek new
	  point referrer       KalturaStatsEvent $event  */
    public static CollectStatsBuilder collect(StatsEvent event)  {
		return new CollectStatsBuilder(event);
	}
	
	public static class KmcCollectStatsBuilder extends NullRequestBuilder {
		
		public KmcCollectStatsBuilder(StatsKmcEvent kmcEvent) {
			super("stats", "kmcCollect");
			params.add("kmcEvent", kmcEvent);
		}
	}

	/**  Will collect the kmcEvent sent form the KMC client   // this will actually be an
	  empty function because all events will be sent using GET and will anyway be
	  logged in the apache log  */
    public static KmcCollectStatsBuilder kmcCollect(StatsKmcEvent kmcEvent)  {
		return new KmcCollectStatsBuilder(kmcEvent);
	}
	
	public static class ReportDeviceCapabilitiesStatsBuilder extends NullRequestBuilder {
		
		public ReportDeviceCapabilitiesStatsBuilder(String data) {
			super("stats", "reportDeviceCapabilities");
			params.add("data", data);
		}
		
		public void data(String multirequestToken) {
			params.add("data", multirequestToken);
		}
	}

	/**  Use this action to report device capabilities to the kaltura server.  */
    public static ReportDeviceCapabilitiesStatsBuilder reportDeviceCapabilities(String data)  {
		return new ReportDeviceCapabilitiesStatsBuilder(data);
	}
	
	public static class ReportErrorStatsBuilder extends NullRequestBuilder {
		
		public ReportErrorStatsBuilder(String errorCode, String errorMessage) {
			super("stats", "reportError");
			params.add("errorCode", errorCode);
			params.add("errorMessage", errorMessage);
		}
		
		public void errorCode(String multirequestToken) {
			params.add("errorCode", multirequestToken);
		}
		
		public void errorMessage(String multirequestToken) {
			params.add("errorMessage", multirequestToken);
		}
	}

	/**  Use this action to report errors to the kaltura server.  */
    public static ReportErrorStatsBuilder reportError(String errorCode, String errorMessage)  {
		return new ReportErrorStatsBuilder(errorCode, errorMessage);
	}
	
	public static class ReportKceErrorStatsBuilder extends RequestBuilder<CEError, CEError.Tokenizer, ReportKceErrorStatsBuilder> {
		
		public ReportKceErrorStatsBuilder(CEError kalturaCEError) {
			super(CEError.class, "stats", "reportKceError");
			params.add("kalturaCEError", kalturaCEError);
		}
	}

    public static ReportKceErrorStatsBuilder reportKceError(CEError kalturaCEError)  {
		return new ReportKceErrorStatsBuilder(kalturaCEError);
	}
}
