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
// Copyright (C) 2006-2019  Kaltura Inc.
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

import com.kaltura.client.enums.EventNotificationTemplateStatus;
import com.kaltura.client.enums.PushNotificationCommandType;
import com.kaltura.client.types.EventNotificationScope;
import com.kaltura.client.types.EventNotificationTemplate;
import com.kaltura.client.types.EventNotificationTemplateFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.PartnerFilter;
import com.kaltura.client.types.PushNotificationData;
import com.kaltura.client.types.PushNotificationParams;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Event notification template service lets you create and manage event
  notification templates
 * 
 * @param eventNotificationTemplate 
 * @param id source template to clone
 * @param eventNotificationTemplate overwrite configuration object
 * @param id 
 * @param id 
 * @param scope 
 * @param id 
 * @param filter 
 * @param pager 
 * @param filter 
 * @param pager 
 * @param filter 
 * @param pager 
 * @param notificationTemplateSystemName Existing push notification template system name
 * @param pushNotificationParams 
 * @param notificationTemplateSystemName Existing push notification template system name
 * @param pushNotificationParams 
 * @param command Command to be sent to push server
 * @param id 
 * @param eventNotificationTemplate 
 * @param id 
 * @param status 
 */
public class EventNotificationTemplateService {
	
	public static class AddEventNotificationTemplateBuilder extends RequestBuilder<EventNotificationTemplate, EventNotificationTemplate.Tokenizer, AddEventNotificationTemplateBuilder> {
		
		public AddEventNotificationTemplateBuilder(EventNotificationTemplate eventNotificationTemplate) {
			super(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "add");
			params.add("eventNotificationTemplate", eventNotificationTemplate);
		}
	}

	/**
	 * This action allows for the creation of new backend event types in the system.
	  This action requires access to the Kaltura server Admin Console. If you're
	  looking to register to existing event types, please use the clone action
	  instead.
	 * 
	 * @param eventNotificationTemplate 
	 */
    public static AddEventNotificationTemplateBuilder add(EventNotificationTemplate eventNotificationTemplate)  {
		return new AddEventNotificationTemplateBuilder(eventNotificationTemplate);
	}
	
	public static class CloneEventNotificationTemplateBuilder extends RequestBuilder<EventNotificationTemplate, EventNotificationTemplate.Tokenizer, CloneEventNotificationTemplateBuilder> {
		
		public CloneEventNotificationTemplateBuilder(int id, EventNotificationTemplate eventNotificationTemplate) {
			super(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "clone");
			params.add("id", id);
			params.add("eventNotificationTemplate", eventNotificationTemplate);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	public static CloneEventNotificationTemplateBuilder clone(int id)  {
		return clone(id, null);
	}

	/**
	 * This action allows registering to various backend event. Use this action to
	  create notifications that will react to events such as new video was uploaded or
	  metadata field was updated. To see the list of available event types, call the
	  listTemplates action.
	 * 
	 * @param id source template to clone
	 * @param eventNotificationTemplate overwrite configuration object
	 */
    public static CloneEventNotificationTemplateBuilder clone(int id, EventNotificationTemplate eventNotificationTemplate)  {
		return new CloneEventNotificationTemplateBuilder(id, eventNotificationTemplate);
	}
	
	public static class DeleteEventNotificationTemplateBuilder extends NullRequestBuilder {
		
		public DeleteEventNotificationTemplateBuilder(int id) {
			super("eventnotification_eventnotificationtemplate", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete an event notification template object
	 * 
	 * @param id 
	 */
    public static DeleteEventNotificationTemplateBuilder delete(int id)  {
		return new DeleteEventNotificationTemplateBuilder(id);
	}
	
	public static class DispatchEventNotificationTemplateBuilder extends RequestBuilder<Integer, String, DispatchEventNotificationTemplateBuilder> {
		
		public DispatchEventNotificationTemplateBuilder(int id, EventNotificationScope scope) {
			super(Integer.class, "eventnotification_eventnotificationtemplate", "dispatch");
			params.add("id", id);
			params.add("scope", scope);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Dispatch event notification object by id
	 * 
	 * @param id 
	 * @param scope 
	 */
    public static DispatchEventNotificationTemplateBuilder dispatch(int id, EventNotificationScope scope)  {
		return new DispatchEventNotificationTemplateBuilder(id, scope);
	}
	
	public static class GetEventNotificationTemplateBuilder extends RequestBuilder<EventNotificationTemplate, EventNotificationTemplate.Tokenizer, GetEventNotificationTemplateBuilder> {
		
		public GetEventNotificationTemplateBuilder(int id) {
			super(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Retrieve an event notification template object by id
	 * 
	 * @param id 
	 */
    public static GetEventNotificationTemplateBuilder get(int id)  {
		return new GetEventNotificationTemplateBuilder(id);
	}
	
	public static class ListEventNotificationTemplateBuilder extends ListResponseRequestBuilder<EventNotificationTemplate, EventNotificationTemplate.Tokenizer, ListEventNotificationTemplateBuilder> {
		
		public ListEventNotificationTemplateBuilder(EventNotificationTemplateFilter filter, FilterPager pager) {
			super(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListEventNotificationTemplateBuilder list()  {
		return list(null);
	}

	public static ListEventNotificationTemplateBuilder list(EventNotificationTemplateFilter filter)  {
		return list(filter, null);
	}

	/**
	 * list event notification template objects
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListEventNotificationTemplateBuilder list(EventNotificationTemplateFilter filter, FilterPager pager)  {
		return new ListEventNotificationTemplateBuilder(filter, pager);
	}
	
	public static class ListByPartnerEventNotificationTemplateBuilder extends ListResponseRequestBuilder<EventNotificationTemplate, EventNotificationTemplate.Tokenizer, ListByPartnerEventNotificationTemplateBuilder> {
		
		public ListByPartnerEventNotificationTemplateBuilder(PartnerFilter filter, FilterPager pager) {
			super(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "listByPartner");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListByPartnerEventNotificationTemplateBuilder listByPartner()  {
		return listByPartner(null);
	}

	public static ListByPartnerEventNotificationTemplateBuilder listByPartner(PartnerFilter filter)  {
		return listByPartner(filter, null);
	}

    public static ListByPartnerEventNotificationTemplateBuilder listByPartner(PartnerFilter filter, FilterPager pager)  {
		return new ListByPartnerEventNotificationTemplateBuilder(filter, pager);
	}
	
	public static class ListTemplatesEventNotificationTemplateBuilder extends ListResponseRequestBuilder<EventNotificationTemplate, EventNotificationTemplate.Tokenizer, ListTemplatesEventNotificationTemplateBuilder> {
		
		public ListTemplatesEventNotificationTemplateBuilder(EventNotificationTemplateFilter filter, FilterPager pager) {
			super(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "listTemplates");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListTemplatesEventNotificationTemplateBuilder listTemplates()  {
		return listTemplates(null);
	}

	public static ListTemplatesEventNotificationTemplateBuilder listTemplates(EventNotificationTemplateFilter filter)  {
		return listTemplates(filter, null);
	}

	/**
	 * Action lists the template partner event notification templates.
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListTemplatesEventNotificationTemplateBuilder listTemplates(EventNotificationTemplateFilter filter, FilterPager pager)  {
		return new ListTemplatesEventNotificationTemplateBuilder(filter, pager);
	}
	
	public static class RegisterEventNotificationTemplateBuilder extends RequestBuilder<PushNotificationData, PushNotificationData.Tokenizer, RegisterEventNotificationTemplateBuilder> {
		
		public RegisterEventNotificationTemplateBuilder(String notificationTemplateSystemName, PushNotificationParams pushNotificationParams) {
			super(PushNotificationData.class, "eventnotification_eventnotificationtemplate", "register");
			params.add("notificationTemplateSystemName", notificationTemplateSystemName);
			params.add("pushNotificationParams", pushNotificationParams);
		}
		
		public void notificationTemplateSystemName(String multirequestToken) {
			params.add("notificationTemplateSystemName", multirequestToken);
		}
	}

	/**
	 * Register to a queue from which event messages will be provided according to
	  given template. Queue will be created if not already exists
	 * 
	 * @param notificationTemplateSystemName Existing push notification template system name
	 * @param pushNotificationParams 
	 */
    public static RegisterEventNotificationTemplateBuilder register(String notificationTemplateSystemName, PushNotificationParams pushNotificationParams)  {
		return new RegisterEventNotificationTemplateBuilder(notificationTemplateSystemName, pushNotificationParams);
	}
	
	public static class SendCommandEventNotificationTemplateBuilder extends NullRequestBuilder {
		
		public SendCommandEventNotificationTemplateBuilder(String notificationTemplateSystemName, PushNotificationParams pushNotificationParams, PushNotificationCommandType command) {
			super("eventnotification_eventnotificationtemplate", "sendCommand");
			params.add("notificationTemplateSystemName", notificationTemplateSystemName);
			params.add("pushNotificationParams", pushNotificationParams);
			params.add("command", command);
		}
		
		public void notificationTemplateSystemName(String multirequestToken) {
			params.add("notificationTemplateSystemName", multirequestToken);
		}
		
		public void command(String multirequestToken) {
			params.add("command", multirequestToken);
		}
	}

	/**
	 * Clear queue messages
	 * 
	 * @param notificationTemplateSystemName Existing push notification template system name
	 * @param pushNotificationParams 
	 * @param command Command to be sent to push server
	 */
    public static SendCommandEventNotificationTemplateBuilder sendCommand(String notificationTemplateSystemName, PushNotificationParams pushNotificationParams, PushNotificationCommandType command)  {
		return new SendCommandEventNotificationTemplateBuilder(notificationTemplateSystemName, pushNotificationParams, command);
	}
	
	public static class UpdateEventNotificationTemplateBuilder extends RequestBuilder<EventNotificationTemplate, EventNotificationTemplate.Tokenizer, UpdateEventNotificationTemplateBuilder> {
		
		public UpdateEventNotificationTemplateBuilder(int id, EventNotificationTemplate eventNotificationTemplate) {
			super(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "update");
			params.add("id", id);
			params.add("eventNotificationTemplate", eventNotificationTemplate);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update an existing event notification template object
	 * 
	 * @param id 
	 * @param eventNotificationTemplate 
	 */
    public static UpdateEventNotificationTemplateBuilder update(int id, EventNotificationTemplate eventNotificationTemplate)  {
		return new UpdateEventNotificationTemplateBuilder(id, eventNotificationTemplate);
	}
	
	public static class UpdateStatusEventNotificationTemplateBuilder extends RequestBuilder<EventNotificationTemplate, EventNotificationTemplate.Tokenizer, UpdateStatusEventNotificationTemplateBuilder> {
		
		public UpdateStatusEventNotificationTemplateBuilder(int id, EventNotificationTemplateStatus status) {
			super(EventNotificationTemplate.class, "eventnotification_eventnotificationtemplate", "updateStatus");
			params.add("id", id);
			params.add("status", status);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void status(String multirequestToken) {
			params.add("status", multirequestToken);
		}
	}

	/**
	 * Update event notification template status by id
	 * 
	 * @param id 
	 * @param status 
	 */
    public static UpdateStatusEventNotificationTemplateBuilder updateStatus(int id, EventNotificationTemplateStatus status)  {
		return new UpdateStatusEventNotificationTemplateBuilder(id, status);
	}
}
