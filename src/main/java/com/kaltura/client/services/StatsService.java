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
import com.kaltura.client.types.CEError;
import com.kaltura.client.types.StatsEvent;
import com.kaltura.client.types.StatsKmcEvent;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Stats Service  */
public class StatsService {

	/**  Will write to the event log a single line representing the event   client
	  version - will help interprete the line structure. different client versions
	  might have slightly different data/data formats in the line event_id - number is
	  the row number in yuval's excel datetime - same format as MySql's datetime - can
	  change and should reflect the time zone session id - can be some big random
	  number or guid partner id entry id unique viewer widget id ui_conf id uid - the
	  puser id as set by the ppartner current point - in milliseconds duration -
	  milliseconds user ip process duration - in milliseconds control id seek new
	  point referrer       KalturaStatsEvent $event  */
    public static RequestBuilder<Boolean> collect(StatsEvent event)  {
        Params kparams = new Params();
        kparams.add("event", event);

        return new RequestBuilder<Boolean>(Boolean.class, "stats", "collect", kparams);
    }

	/**  Will collect the kmcEvent sent form the KMC client   // this will actually be an
	  empty function because all events will be sent using GET and will anyway be
	  logged in the apache log  */
    public static RequestBuilder<Void> kmcCollect(StatsKmcEvent kmcEvent)  {
        Params kparams = new Params();
        kparams.add("kmcEvent", kmcEvent);

        return new NullRequestBuilder("stats", "kmcCollect", kparams);
    }

	/**  Use this action to report errors to the kaltura server.  */
    public static RequestBuilder<Void> reportError(String errorCode, String errorMessage)  {
        Params kparams = new Params();
        kparams.add("errorCode", errorCode);
        kparams.add("errorMessage", errorMessage);

        return new NullRequestBuilder("stats", "reportError", kparams);
    }

    public static RequestBuilder<CEError> reportKceError(CEError kalturaCEError)  {
        Params kparams = new Params();
        kparams.add("kalturaCEError", kalturaCEError);

        return new RequestBuilder<CEError>(CEError.class, "stats", "reportKceError", kparams);
    }
}
