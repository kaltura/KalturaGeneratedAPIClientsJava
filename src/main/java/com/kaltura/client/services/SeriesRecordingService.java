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
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.SeriesRecording;
import com.kaltura.client.types.SeriesRecordingFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class SeriesRecordingService {

	/**  Issue a record request for a complete season or series  */
    public static RequestBuilder<SeriesRecording> add(SeriesRecording recording)  {
        Params kparams = new Params();
        kparams.add("recording", recording);

        return new RequestBuilder<SeriesRecording>(SeriesRecording.class, "seriesrecording", "add", kparams);
    }

	/**  Cancel a previously requested series recording. Cancel series recording can be
	  called for recording in status Scheduled or Recording Only  */
    public static RequestBuilder<SeriesRecording> cancel(long id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<SeriesRecording>(SeriesRecording.class, "seriesrecording", "cancel", kparams);
    }

	/**  Cancel EPG recording that was recorded as part of series  */
    public static RequestBuilder<SeriesRecording> cancelByEpgId(long id, long epgId)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("epgId", epgId);

        return new RequestBuilder<SeriesRecording>(SeriesRecording.class, "seriesrecording", "cancelByEpgId", kparams);
    }

	/**  Cancel Season recording epgs that was recorded as part of series  */
    public static RequestBuilder<SeriesRecording> cancelBySeasonNumber(long id, long seasonNumber)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("seasonNumber", seasonNumber);

        return new RequestBuilder<SeriesRecording>(SeriesRecording.class, "seriesrecording", "cancelBySeasonNumber", kparams);
    }

	/**  Delete series recording(s). Delete series recording can be called recordings in
	  any status  */
    public static RequestBuilder<SeriesRecording> delete(long id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<SeriesRecording>(SeriesRecording.class, "seriesrecording", "delete", kparams);
    }

	/**  Delete Season recording epgs that was recorded as part of series  */
    public static RequestBuilder<SeriesRecording> deleteBySeasonNumber(long id, int seasonNumber)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("seasonNumber", seasonNumber);

        return new RequestBuilder<SeriesRecording>(SeriesRecording.class, "seriesrecording", "deleteBySeasonNumber", kparams);
    }

    public static RequestBuilder<ListResponse<SeriesRecording>> list()  {
        return list(null);
    }

	/**  Return a list of series recordings for the household with optional filter by
	  status and KSQL.  */
    public static RequestBuilder<ListResponse<SeriesRecording>> list(SeriesRecordingFilter filter)  {
        Params kparams = new Params();
        kparams.add("filter", filter);

        return new ListResponseRequestBuilder<SeriesRecording>(SeriesRecording.class, "seriesrecording", "list", kparams);
    }
}
