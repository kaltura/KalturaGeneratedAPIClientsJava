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
import com.kaltura.client.enums.EventNotificationTemplateStatus;
import com.kaltura.client.types.EventNotificationScope;
import com.kaltura.client.types.EventNotificationTemplate;
import com.kaltura.client.types.EventNotificationTemplateFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.PartnerFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Event notification template service lets you create and manage event
  notification templates  */
public class EventNotificationTemplateService {

	/**  This action allows for the creation of new backend event types in the system.
	  This action requires access to the Kaltura server Admin Console. If you're
	  looking to register to existing event types, please use the clone action
	  instead.  */
    public static RequestBuilder<EventNotificationTemplate> add(EventNotificationTemplate eventNotificationTemplate)  {
        Params kparams = new Params();
        kparams.add("eventNotificationTemplate", eventNotificationTemplate);

        return new RequestBuilder<EventNotificationTemplate>(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "add", kparams);
    }

    public static RequestBuilder<EventNotificationTemplate> clone(int id)  {
        return clone(id, null);
    }

	/**  This action allows registering to various backend event. Use this action to
	  create notifications that will react to events such as new video was uploaded or
	  metadata field was updated. To see the list of available event types, call the
	  listTemplates action.  */
    public static RequestBuilder<EventNotificationTemplate> clone(int id, EventNotificationTemplate eventNotificationTemplate)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("eventNotificationTemplate", eventNotificationTemplate);

        return new RequestBuilder<EventNotificationTemplate>(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "clone", kparams);
    }

	/**  Delete an event notification template object  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("eventnotification_eventnotificationtemplate", "delete", kparams);
    }

	/**  Dispatch event notification object by id  */
    public static RequestBuilder<Integer> dispatch(int id, EventNotificationScope scope)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("scope", scope);

        return new RequestBuilder<Integer>(Integer.class, "eventnotification_eventnotificationtemplate", "dispatch", kparams);
    }

	/**  Retrieve an event notification template object by id  */
    public static RequestBuilder<EventNotificationTemplate> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<EventNotificationTemplate>(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "get", kparams);
    }

    public static RequestBuilder<ListResponse<EventNotificationTemplate>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<EventNotificationTemplate>> list(EventNotificationTemplateFilter filter)  {
        return list(filter, null);
    }

	/**  list event notification template objects  */
    public static RequestBuilder<ListResponse<EventNotificationTemplate>> list(EventNotificationTemplateFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<EventNotificationTemplate>(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "list", kparams);
    }

    public static RequestBuilder<ListResponse<EventNotificationTemplate>> listByPartner()  {
        return listByPartner(null);
    }

    public static RequestBuilder<ListResponse<EventNotificationTemplate>> listByPartner(PartnerFilter filter)  {
        return listByPartner(filter, null);
    }

    public static RequestBuilder<ListResponse<EventNotificationTemplate>> listByPartner(PartnerFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<EventNotificationTemplate>(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "listByPartner", kparams);
    }

    public static RequestBuilder<ListResponse<EventNotificationTemplate>> listTemplates()  {
        return listTemplates(null);
    }

    public static RequestBuilder<ListResponse<EventNotificationTemplate>> listTemplates(EventNotificationTemplateFilter filter)  {
        return listTemplates(filter, null);
    }

	/**  Action lists the template partner event notification templates.  */
    public static RequestBuilder<ListResponse<EventNotificationTemplate>> listTemplates(EventNotificationTemplateFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<EventNotificationTemplate>(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "listTemplates", kparams);
    }

	/**  Update an existing event notification template object  */
    public static RequestBuilder<EventNotificationTemplate> update(int id, EventNotificationTemplate eventNotificationTemplate)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("eventNotificationTemplate", eventNotificationTemplate);

        return new RequestBuilder<EventNotificationTemplate>(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "update", kparams);
    }

	/**  Update event notification template status by id  */
    public static RequestBuilder<EventNotificationTemplate> updateStatus(int id, EventNotificationTemplateStatus status)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("status", status);

        return new RequestBuilder<EventNotificationTemplate>(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "updateStatus", kparams);
    }
}
