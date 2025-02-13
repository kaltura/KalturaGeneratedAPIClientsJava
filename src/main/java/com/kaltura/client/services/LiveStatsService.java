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
// Copyright (C) 2006-2023  Kaltura Inc.
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

import com.kaltura.client.types.LiveStatsEvent;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Stats Service
 * 
 * @param event 
 */
public class LiveStatsService {
	
	public static class CollectLiveStatsBuilder extends RequestBuilder<Boolean, String, CollectLiveStatsBuilder> {
		
		public CollectLiveStatsBuilder(LiveStatsEvent event) {
			super(Boolean.class, "livestats", "collect");
			params.add("event", event);
		}
	}

	/**
	 * Will write to the event log a single line representing the event  
	  KalturaStatsEvent $event
	 * 
	 * @param event 
	 */
    public static CollectLiveStatsBuilder collect(LiveStatsEvent event)  {
		return new CollectLiveStatsBuilder(event);
	}
}
