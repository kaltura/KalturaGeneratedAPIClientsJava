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

import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.FlavorParamsOutput;
import com.kaltura.client.types.FlavorParamsOutputFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Flavor Params Output service  */
public class FlavorParamsOutputService {
	
	public static class GetFlavorParamsOutputBuilder extends RequestBuilder<FlavorParamsOutput, FlavorParamsOutput.Tokenizer, GetFlavorParamsOutputBuilder> {
		
		public GetFlavorParamsOutputBuilder(int id) {
			super(FlavorParamsOutput.class, "flavorparamsoutput", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Get flavor params output object by ID  */
    public static GetFlavorParamsOutputBuilder get(int id)  {
		return new GetFlavorParamsOutputBuilder(id);
	}
	
	public static class ListFlavorParamsOutputBuilder extends ListResponseRequestBuilder<FlavorParamsOutput, FlavorParamsOutput.Tokenizer, ListFlavorParamsOutputBuilder> {
		
		public ListFlavorParamsOutputBuilder(FlavorParamsOutputFilter filter, FilterPager pager) {
			super(FlavorParamsOutput.class, "flavorparamsoutput", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListFlavorParamsOutputBuilder list()  {
		return list(null);
	}

	public static ListFlavorParamsOutputBuilder list(FlavorParamsOutputFilter filter)  {
		return list(filter, null);
	}

	/**  List flavor params output objects by filter and pager  */
    public static ListFlavorParamsOutputBuilder list(FlavorParamsOutputFilter filter, FilterPager pager)  {
		return new ListFlavorParamsOutputBuilder(filter, pager);
	}
}
