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
import com.kaltura.client.types.ScheduleEventResource;
import com.kaltura.client.types.ScheduleEventResourceFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  The ScheduleEventResource service enables you create and manage (update, delete,
  retrieve, etc.) the connections between recording events and the resources
  required for these events (cameras, capture devices, etc.).  */
public class ScheduleEventResourceService {

	/**  Allows you to add a new KalturaScheduleEventResource object  */
    public static RequestBuilder<ScheduleEventResource> add(ScheduleEventResource scheduleEventResource)  {
        Params kparams = new Params();
        kparams.add("scheduleEventResource", scheduleEventResource);

        return new RequestBuilder<ScheduleEventResource>(ScheduleEventResource.class, "schedule_scheduleeventresource", "add", kparams);
    }

	/**  Mark the KalturaScheduleEventResource object as deleted  */
    public static RequestBuilder<Void> delete(int scheduleEventId, int scheduleResourceId)  {
        Params kparams = new Params();
        kparams.add("scheduleEventId", scheduleEventId);
        kparams.add("scheduleResourceId", scheduleResourceId);

        return new NullRequestBuilder("schedule_scheduleeventresource", "delete", kparams);
    }

	/**  Retrieve a KalturaScheduleEventResource object by ID  */
    public static RequestBuilder<ScheduleEventResource> get(int scheduleEventId, int scheduleResourceId)  {
        Params kparams = new Params();
        kparams.add("scheduleEventId", scheduleEventId);
        kparams.add("scheduleResourceId", scheduleResourceId);

        return new RequestBuilder<ScheduleEventResource>(ScheduleEventResource.class, "schedule_scheduleeventresource", "get", kparams);
    }

    public static RequestBuilder<ListResponse<ScheduleEventResource>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<ScheduleEventResource>> list(ScheduleEventResourceFilter filter)  {
        return list(filter, null);
    }

	/**  List KalturaScheduleEventResource objects  */
    public static RequestBuilder<ListResponse<ScheduleEventResource>> list(ScheduleEventResourceFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<ScheduleEventResource>(ScheduleEventResource.class, "schedule_scheduleeventresource", "list", kparams);
    }

	/**  Update an existing KalturaScheduleEventResource object  */
    public static RequestBuilder<ScheduleEventResource> update(int scheduleEventId, int scheduleResourceId, ScheduleEventResource scheduleEventResource)  {
        Params kparams = new Params();
        kparams.add("scheduleEventId", scheduleEventId);
        kparams.add("scheduleResourceId", scheduleResourceId);
        kparams.add("scheduleEventResource", scheduleEventResource);

        return new RequestBuilder<ScheduleEventResource>(ScheduleEventResource.class, "schedule_scheduleeventresource", "update", kparams);
    }
}
