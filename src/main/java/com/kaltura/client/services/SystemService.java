// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platforms allow them to do with
// text.
//
// Copyright (C) 2006-2022  Kaltura Inc.
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

import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * System service is used for internal system helpers &amp; to retrieve system
  level information
 */
public class SystemService {
	
	public static class GetHealthCheckSystemBuilder extends RequestBuilder<String, String, GetHealthCheckSystemBuilder> {
		
		public GetHealthCheckSystemBuilder() {
			super(String.class, "system", "getHealthCheck");
		}
	}

    public static GetHealthCheckSystemBuilder getHealthCheck()  {
		return new GetHealthCheckSystemBuilder();
	}
	
	public static class GetTimeSystemBuilder extends RequestBuilder<Integer, String, GetTimeSystemBuilder> {
		
		public GetTimeSystemBuilder() {
			super(Integer.class, "system", "getTime");
		}
	}

    public static GetTimeSystemBuilder getTime()  {
		return new GetTimeSystemBuilder();
	}
	
	public static class GetVersionSystemBuilder extends RequestBuilder<String, String, GetVersionSystemBuilder> {
		
		public GetVersionSystemBuilder() {
			super(String.class, "system", "getVersion");
		}
	}

    public static GetVersionSystemBuilder getVersion()  {
		return new GetVersionSystemBuilder();
	}
	
	public static class PingSystemBuilder extends RequestBuilder<Boolean, String, PingSystemBuilder> {
		
		public PingSystemBuilder() {
			super(Boolean.class, "system", "ping");
		}
	}

    public static PingSystemBuilder ping()  {
		return new PingSystemBuilder();
	}
	
	public static class PingDatabaseSystemBuilder extends RequestBuilder<Boolean, String, PingDatabaseSystemBuilder> {
		
		public PingDatabaseSystemBuilder() {
			super(Boolean.class, "system", "pingDatabase");
		}
	}

    public static PingDatabaseSystemBuilder pingDatabase()  {
		return new PingDatabaseSystemBuilder();
	}
}
