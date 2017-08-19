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
import com.kaltura.client.types.FlavorParams;
import com.kaltura.client.types.FlavorParamsFilter;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Add &amp; Manage Flavor Params  */
public class FlavorParamsService {
	
	public static class AddFlavorParamsBuilder extends RequestBuilder<FlavorParams, FlavorParams.Tokenizer, AddFlavorParamsBuilder> {
		
		public AddFlavorParamsBuilder(FlavorParams flavorParams) {
			super(FlavorParams.class, "flavorparams", "add");
			params.add("flavorParams", flavorParams);
		}
	}

	/**  Add new Flavor Params  */
    public static AddFlavorParamsBuilder add(FlavorParams flavorParams)  {
		return new AddFlavorParamsBuilder(flavorParams);
	}
	
	public static class DeleteFlavorParamsBuilder extends NullRequestBuilder {
		
		public DeleteFlavorParamsBuilder(int id) {
			super("flavorparams", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Delete Flavor Params by ID  */
    public static DeleteFlavorParamsBuilder delete(int id)  {
		return new DeleteFlavorParamsBuilder(id);
	}
	
	public static class GetFlavorParamsBuilder extends RequestBuilder<FlavorParams, FlavorParams.Tokenizer, GetFlavorParamsBuilder> {
		
		public GetFlavorParamsBuilder(int id) {
			super(FlavorParams.class, "flavorparams", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Get Flavor Params by ID  */
    public static GetFlavorParamsBuilder get(int id)  {
		return new GetFlavorParamsBuilder(id);
	}
	
	public static class GetByConversionProfileIdFlavorParamsBuilder extends ArrayRequestBuilder<FlavorParams, FlavorParams.Tokenizer, GetByConversionProfileIdFlavorParamsBuilder> {
		
		public GetByConversionProfileIdFlavorParamsBuilder(int conversionProfileId) {
			super(FlavorParams.class, "flavorparams", "getByConversionProfileId");
			params.add("conversionProfileId", conversionProfileId);
		}
		
		public void conversionProfileId(String multirequestToken) {
			params.add("conversionProfileId", multirequestToken);
		}
	}

	/**  Get Flavor Params by Conversion Profile ID  */
    public static GetByConversionProfileIdFlavorParamsBuilder getByConversionProfileId(int conversionProfileId)  {
		return new GetByConversionProfileIdFlavorParamsBuilder(conversionProfileId);
	}
	
	public static class ListFlavorParamsBuilder extends ListResponseRequestBuilder<FlavorParams, FlavorParams.Tokenizer, ListFlavorParamsBuilder> {
		
		public ListFlavorParamsBuilder(FlavorParamsFilter filter, FilterPager pager) {
			super(FlavorParams.class, "flavorparams", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListFlavorParamsBuilder list()  {
		return list(null);
	}

	public static ListFlavorParamsBuilder list(FlavorParamsFilter filter)  {
		return list(filter, null);
	}

	/**  List Flavor Params by filter with paging support (By default - all system
	  default params will be listed too)  */
    public static ListFlavorParamsBuilder list(FlavorParamsFilter filter, FilterPager pager)  {
		return new ListFlavorParamsBuilder(filter, pager);
	}
	
	public static class UpdateFlavorParamsBuilder extends RequestBuilder<FlavorParams, FlavorParams.Tokenizer, UpdateFlavorParamsBuilder> {
		
		public UpdateFlavorParamsBuilder(int id, FlavorParams flavorParams) {
			super(FlavorParams.class, "flavorparams", "update");
			params.add("id", id);
			params.add("flavorParams", flavorParams);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Update Flavor Params by ID  */
    public static UpdateFlavorParamsBuilder update(int id, FlavorParams flavorParams)  {
		return new UpdateFlavorParamsBuilder(id, flavorParams);
	}
}
