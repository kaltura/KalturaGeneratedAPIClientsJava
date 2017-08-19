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

import com.kaltura.client.enums.BatchJobObjectType;
import com.kaltura.client.types.IntegrationJobData;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Integration service lets you dispatch integration tasks  */
public class IntegrationService {
	
	public static class DispatchIntegrationBuilder extends RequestBuilder<Integer, String, DispatchIntegrationBuilder> {
		
		public DispatchIntegrationBuilder(IntegrationJobData data, BatchJobObjectType objectType, String objectId) {
			super(Integer.class, "integration_integration", "dispatch");
			params.add("data", data);
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

	/**  Dispatch integration task  */
    public static DispatchIntegrationBuilder dispatch(IntegrationJobData data, BatchJobObjectType objectType, String objectId)  {
		return new DispatchIntegrationBuilder(data, objectType, objectId);
	}
	
	public static class NotifyIntegrationBuilder extends NullRequestBuilder {
		
		public NotifyIntegrationBuilder(int id) {
			super("integration_integration", "notify");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

    public static NotifyIntegrationBuilder notify_(int id)  {
		return new NotifyIntegrationBuilder(id);
	}
}
