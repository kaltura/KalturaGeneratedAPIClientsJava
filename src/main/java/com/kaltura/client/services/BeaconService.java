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
// Copyright (C) 2006-2021  Kaltura Inc.
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

import com.kaltura.client.types.Beacon;
import com.kaltura.client.types.BeaconEnhanceFilter;
import com.kaltura.client.types.BeaconFilter;
import com.kaltura.client.types.BeaconSearchParams;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.Pager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Sending beacons on objects
 * 
 * @param beacon 
 * @param shouldLog 
 * @param filter 
 * @param pager 
 * @param filter 
 * @param pager 
 * @param searchParams 
 * @param pager 
 */
public class BeaconService {
	
	public static class AddBeaconBuilder extends RequestBuilder<Boolean, String, AddBeaconBuilder> {
		
		public AddBeaconBuilder(Beacon beacon, Boolean shouldLog) {
			super(Boolean.class, "beacon_beacon", "add");
			params.add("beacon", beacon);
			params.add("shouldLog", shouldLog);
		}
		
		public void shouldLog(String multirequestToken) {
			params.add("shouldLog", multirequestToken);
		}
	}

	public static AddBeaconBuilder add(Beacon beacon)  {
		return add(beacon, false);
	}

    public static AddBeaconBuilder add(Beacon beacon, Boolean shouldLog)  {
		return new AddBeaconBuilder(beacon, shouldLog);
	}
	
	public static class EnhanceSearchBeaconBuilder extends ListResponseRequestBuilder<Beacon, Beacon.Tokenizer, EnhanceSearchBeaconBuilder> {
		
		public EnhanceSearchBeaconBuilder(BeaconEnhanceFilter filter, FilterPager pager) {
			super(Beacon.class, "beacon_beacon", "enhanceSearch");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static EnhanceSearchBeaconBuilder enhanceSearch()  {
		return enhanceSearch(null);
	}

	public static EnhanceSearchBeaconBuilder enhanceSearch(BeaconEnhanceFilter filter)  {
		return enhanceSearch(filter, null);
	}

    public static EnhanceSearchBeaconBuilder enhanceSearch(BeaconEnhanceFilter filter, FilterPager pager)  {
		return new EnhanceSearchBeaconBuilder(filter, pager);
	}
	
	public static class ListBeaconBuilder extends ListResponseRequestBuilder<Beacon, Beacon.Tokenizer, ListBeaconBuilder> {
		
		public ListBeaconBuilder(BeaconFilter filter, FilterPager pager) {
			super(Beacon.class, "beacon_beacon", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListBeaconBuilder list()  {
		return list(null);
	}

	public static ListBeaconBuilder list(BeaconFilter filter)  {
		return list(filter, null);
	}

    public static ListBeaconBuilder list(BeaconFilter filter, FilterPager pager)  {
		return new ListBeaconBuilder(filter, pager);
	}
	
	public static class SearchScheduledResourceBeaconBuilder extends ListResponseRequestBuilder<Beacon, Beacon.Tokenizer, SearchScheduledResourceBeaconBuilder> {
		
		public SearchScheduledResourceBeaconBuilder(BeaconSearchParams searchParams, Pager pager) {
			super(Beacon.class, "beacon_beacon", "searchScheduledResource");
			params.add("searchParams", searchParams);
			params.add("pager", pager);
		}
	}

	public static SearchScheduledResourceBeaconBuilder searchScheduledResource(BeaconSearchParams searchParams)  {
		return searchScheduledResource(searchParams, null);
	}

    public static SearchScheduledResourceBeaconBuilder searchScheduledResource(BeaconSearchParams searchParams, Pager pager)  {
		return new SearchScheduledResourceBeaconBuilder(searchParams, pager);
	}
}
