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

import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ThumbParamsOutput;
import com.kaltura.client.types.ThumbParamsOutputFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Thumbnail Params Output service
 * 
 * @param id 
 * @param filter 
 * @param pager 
 */
public class ThumbParamsOutputService {
	
	public static class GetThumbParamsOutputBuilder extends RequestBuilder<ThumbParamsOutput, ThumbParamsOutput.Tokenizer, GetThumbParamsOutputBuilder> {
		
		public GetThumbParamsOutputBuilder(long id) {
			super(ThumbParamsOutput.class, "thumbparamsoutput", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get thumb params output object by ID
	 * 
	 * @param id 
	 */
    public static GetThumbParamsOutputBuilder get(long id)  {
		return new GetThumbParamsOutputBuilder(id);
	}
	
	public static class ListThumbParamsOutputBuilder extends ListResponseRequestBuilder<ThumbParamsOutput, ThumbParamsOutput.Tokenizer, ListThumbParamsOutputBuilder> {
		
		public ListThumbParamsOutputBuilder(ThumbParamsOutputFilter filter, FilterPager pager) {
			super(ThumbParamsOutput.class, "thumbparamsoutput", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListThumbParamsOutputBuilder list()  {
		return list(null);
	}

	public static ListThumbParamsOutputBuilder list(ThumbParamsOutputFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List thumb params output objects by filter and pager
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListThumbParamsOutputBuilder list(ThumbParamsOutputFilter filter, FilterPager pager)  {
		return new ListThumbParamsOutputBuilder(filter, pager);
	}
}
