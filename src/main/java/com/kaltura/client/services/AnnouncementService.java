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
import com.kaltura.client.types.Announcement;
import com.kaltura.client.types.AnnouncementFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class AnnouncementService {

	/**  Add a new future scheduled system announcement push notification  */
    public static RequestBuilder<Announcement> add(Announcement announcement)  {
        Params kparams = new Params();
        kparams.add("announcement", announcement);

        return new RequestBuilder<Announcement>(Announcement.class, "announcement", "add", kparams);
    }

	/**  Delete an existing announcing. Announcement cannot be delete while being sent.  */
    public static RequestBuilder<Boolean> delete(long id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Boolean>(Boolean.class, "announcement", "delete", kparams);
    }

	/**  Enable system announcements  */
    public static RequestBuilder<Boolean> enableSystemAnnouncements()  {
        Params kparams = new Params();

        return new RequestBuilder<Boolean>(Boolean.class, "announcement", "enableSystemAnnouncements", kparams);
    }

    public static RequestBuilder<ListResponse<Announcement>> list(AnnouncementFilter filter)  {
        return list(filter, null);
    }

	/**  Lists all announcements in the system.  */
    public static RequestBuilder<ListResponse<Announcement>> list(AnnouncementFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<Announcement>(Announcement.class, "announcement", "list", kparams);
    }

	/**  Update an existing future system announcement push notification. Announcement
	  can only be updated only before sending  */
    public static RequestBuilder<Announcement> update(int announcementId, Announcement announcement)  {
        Params kparams = new Params();
        kparams.add("announcementId", announcementId);
        kparams.add("announcement", announcement);

        return new RequestBuilder<Announcement>(Announcement.class, "announcement", "update", kparams);
    }

	/**  Update a system announcement status  */
    public static RequestBuilder<Boolean> updateStatus(long id, boolean status)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("status", status);

        return new RequestBuilder<Boolean>(Boolean.class, "announcement", "updateStatus", kparams);
    }
}
