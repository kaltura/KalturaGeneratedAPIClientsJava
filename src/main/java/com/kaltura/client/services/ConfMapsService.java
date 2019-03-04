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

import com.kaltura.client.types.ConfMaps;
import com.kaltura.client.types.ConfMapsFilter;
import com.kaltura.client.types.StringHolder;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class ConfMapsService {
	
	public static class AddConfMapsBuilder extends RequestBuilder<ConfMaps, ConfMaps.Tokenizer, AddConfMapsBuilder> {
		
		public AddConfMapsBuilder(ConfMaps map) {
			super(ConfMaps.class, "confmaps_confmaps", "add");
			params.add("map", map);
		}
	}

	/**
	 * Add configuration map
	 * 
	 * @param map 
	 */
    public static AddConfMapsBuilder add(ConfMaps map)  {
		return new AddConfMapsBuilder(map);
	}
	
	public static class GetConfMapsBuilder extends RequestBuilder<ConfMaps, ConfMaps.Tokenizer, GetConfMapsBuilder> {
		
		public GetConfMapsBuilder(ConfMapsFilter filter) {
			super(ConfMaps.class, "confmaps_confmaps", "get");
			params.add("filter", filter);
		}
	}

	/**
	 * Get configuration map
	 * 
	 * @param filter 
	 */
    public static GetConfMapsBuilder get(ConfMapsFilter filter)  {
		return new GetConfMapsBuilder(filter);
	}
	
	public static class GetMapNamesConfMapsBuilder extends ArrayRequestBuilder<StringHolder, StringHolder.Tokenizer, GetMapNamesConfMapsBuilder> {
		
		public GetMapNamesConfMapsBuilder() {
			super(StringHolder.class, "confmaps_confmaps", "getMapNames");
		}
	}

	/**
	 * List configuration maps names
	 */
    public static GetMapNamesConfMapsBuilder getMapNames()  {
		return new GetMapNamesConfMapsBuilder();
	}
	
	public static class ListConfMapsBuilder extends ListResponseRequestBuilder<ConfMaps, ConfMaps.Tokenizer, ListConfMapsBuilder> {
		
		public ListConfMapsBuilder(ConfMapsFilter filter) {
			super(ConfMaps.class, "confmaps_confmaps", "list");
			params.add("filter", filter);
		}
	}

	/**
	 * List configuration maps
	 * 
	 * @param filter 
	 */
    public static ListConfMapsBuilder list(ConfMapsFilter filter)  {
		return new ListConfMapsBuilder(filter);
	}
	
	public static class UpdateConfMapsBuilder extends RequestBuilder<ConfMaps, ConfMaps.Tokenizer, UpdateConfMapsBuilder> {
		
		public UpdateConfMapsBuilder(ConfMaps map) {
			super(ConfMaps.class, "confmaps_confmaps", "update");
			params.add("map", map);
		}
	}

	/**
	 * Update configuration map
	 * 
	 * @param map 
	 */
    public static UpdateConfMapsBuilder update(ConfMaps map)  {
		return new UpdateConfMapsBuilder(map);
	}
}
