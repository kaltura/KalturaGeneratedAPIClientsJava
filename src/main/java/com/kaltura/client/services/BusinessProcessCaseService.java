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

import com.kaltura.client.enums.EventNotificationEventObjectType;
import com.kaltura.client.types.BusinessProcessCase;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Business-process case service lets you get information about processes  */
public class BusinessProcessCaseService {
	
	public static class AbortBusinessProcessCaseBuilder extends NullRequestBuilder {
		
		public AbortBusinessProcessCaseBuilder(EventNotificationEventObjectType objectType, String objectId, int businessProcessStartNotificationTemplateId) {
			super("businessprocessnotification_businessprocesscase", "abort");
			params.add("objectType", objectType);
			params.add("objectId", objectId);
			params.add("businessProcessStartNotificationTemplateId", businessProcessStartNotificationTemplateId);
		}
		
		public void objectType(String multirequestToken) {
			params.add("objectType", multirequestToken);
		}
		
		public void objectId(String multirequestToken) {
			params.add("objectId", multirequestToken);
		}
		
		public void businessProcessStartNotificationTemplateId(String multirequestToken) {
			params.add("businessProcessStartNotificationTemplateId", multirequestToken);
		}
	}

	/**  Abort business-process case  */
    public static AbortBusinessProcessCaseBuilder abort(EventNotificationEventObjectType objectType, String objectId, int businessProcessStartNotificationTemplateId)  {
		return new AbortBusinessProcessCaseBuilder(objectType, objectId, businessProcessStartNotificationTemplateId);
	}
	
	public static class ListBusinessProcessCaseBuilder extends ArrayRequestBuilder<BusinessProcessCase, BusinessProcessCase.Tokenizer, ListBusinessProcessCaseBuilder> {
		
		public ListBusinessProcessCaseBuilder(EventNotificationEventObjectType objectType, String objectId) {
			super(BusinessProcessCase.class, "businessprocessnotification_businessprocesscase", "list");
			params.add("objectType", objectType);
			params.add("objectId", objectId);
		}
		
		public void objectType(String multirequestToken) {
			params.add("objectType", multirequestToken);
		}
		
		public void objectId(String multirequestToken) {
			params.add("objectId", multirequestToken);
		}
	}

	/**  list business-process cases  */
    public static ListBusinessProcessCaseBuilder list(EventNotificationEventObjectType objectType, String objectId)  {
		return new ListBusinessProcessCaseBuilder(objectType, objectId);
	}
	
	public static class ServeDiagramBusinessProcessCaseBuilder extends ServeRequestBuilder {
		
		public ServeDiagramBusinessProcessCaseBuilder(EventNotificationEventObjectType objectType, String objectId, int businessProcessStartNotificationTemplateId) {
			super("businessprocessnotification_businessprocesscase", "serveDiagram");
			params.add("objectType", objectType);
			params.add("objectId", objectId);
			params.add("businessProcessStartNotificationTemplateId", businessProcessStartNotificationTemplateId);
		}
		
		public void objectType(String multirequestToken) {
			params.add("objectType", multirequestToken);
		}
		
		public void objectId(String multirequestToken) {
			params.add("objectId", multirequestToken);
		}
		
		public void businessProcessStartNotificationTemplateId(String multirequestToken) {
			params.add("businessProcessStartNotificationTemplateId", multirequestToken);
		}
	}

	/**  Server business-process case diagram  */
    public static ServeDiagramBusinessProcessCaseBuilder serveDiagram(EventNotificationEventObjectType objectType, String objectId, int businessProcessStartNotificationTemplateId)  {
		return new ServeDiagramBusinessProcessCaseBuilder(objectType, objectId, businessProcessStartNotificationTemplateId);
	}
}
