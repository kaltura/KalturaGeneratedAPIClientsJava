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
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.types.ScheduledTaskProfile;
import com.kaltura.client.types.ScheduledTaskProfileFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Schedule task service lets you create and manage scheduled task profiles  */
public class ScheduledTaskProfileService {

	/**  Add a new scheduled task profile  */
    public static RequestBuilder<ScheduledTaskProfile> add(ScheduledTaskProfile scheduledTaskProfile)  {
        Params kparams = new Params();
        kparams.add("scheduledTaskProfile", scheduledTaskProfile);

        return new RequestBuilder<ScheduledTaskProfile>(ScheduledTaskProfile.class, "scheduledtask_scheduledtaskprofile", "add", kparams);
    }

	/**  Delete a scheduled task profile  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("scheduledtask_scheduledtaskprofile", "delete", kparams);
    }

	/**  Retrieve a scheduled task profile by id  */
    public static RequestBuilder<ScheduledTaskProfile> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<ScheduledTaskProfile>(ScheduledTaskProfile.class, "scheduledtask_scheduledtaskprofile", "get", kparams);
    }

    public static RequestBuilder<ListResponse<ObjectBase>> getDryRunResults(int requestId)  {
        Params kparams = new Params();
        kparams.add("requestId", requestId);

        return new ListResponseRequestBuilder<ObjectBase>(ObjectBase.class, "scheduledtask_scheduledtaskprofile", "getDryRunResults", kparams);
    }

    public static RequestBuilder<ListResponse<ScheduledTaskProfile>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<ScheduledTaskProfile>> list(ScheduledTaskProfileFilter filter)  {
        return list(filter, null);
    }

	/**  List scheduled task profiles  */
    public static RequestBuilder<ListResponse<ScheduledTaskProfile>> list(ScheduledTaskProfileFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<ScheduledTaskProfile>(ScheduledTaskProfile.class, "scheduledtask_scheduledtaskprofile", "list", kparams);
    }

    public static RequestBuilder<Integer> requestDryRun(int scheduledTaskProfileId)  {
        return requestDryRun(scheduledTaskProfileId, 500);
    }

    public static RequestBuilder<Integer> requestDryRun(int scheduledTaskProfileId, int maxResults)  {
        Params kparams = new Params();
        kparams.add("scheduledTaskProfileId", scheduledTaskProfileId);
        kparams.add("maxResults", maxResults);

        return new RequestBuilder<Integer>(Integer.class, "scheduledtask_scheduledtaskprofile", "requestDryRun", kparams);
    }

	/**  Update an existing scheduled task profile  */
    public static RequestBuilder<ScheduledTaskProfile> update(int id, ScheduledTaskProfile scheduledTaskProfile)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("scheduledTaskProfile", scheduledTaskProfile);

        return new RequestBuilder<ScheduledTaskProfile>(ScheduledTaskProfile.class, "scheduledtask_scheduledtaskprofile", "update", kparams);
    }
}
