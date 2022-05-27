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
import com.kaltura.client.types.ThumbParams;
import com.kaltura.client.types.ThumbParamsFilter;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
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
 * Add &amp; Manage Thumb Params
 * 
 * @param thumbParams 
 * @param id 
 * @param id 
 * @param conversionProfileId 
 * @param filter 
 * @param pager 
 * @param id 
 * @param thumbParams 
 */
public class ThumbParamsService {
	
	public static class AddThumbParamsBuilder extends RequestBuilder<ThumbParams, ThumbParams.Tokenizer, AddThumbParamsBuilder> {
		
		public AddThumbParamsBuilder(ThumbParams thumbParams) {
			super(ThumbParams.class, "thumbparams", "add");
			params.add("thumbParams", thumbParams);
		}
	}

	/**
	 * Add new Thumb Params
	 * 
	 * @param thumbParams 
	 */
    public static AddThumbParamsBuilder add(ThumbParams thumbParams)  {
		return new AddThumbParamsBuilder(thumbParams);
	}
	
	public static class DeleteThumbParamsBuilder extends NullRequestBuilder {
		
		public DeleteThumbParamsBuilder(long id) {
			super("thumbparams", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete Thumb Params by ID
	 * 
	 * @param id 
	 */
    public static DeleteThumbParamsBuilder delete(long id)  {
		return new DeleteThumbParamsBuilder(id);
	}
	
	public static class GetThumbParamsBuilder extends RequestBuilder<ThumbParams, ThumbParams.Tokenizer, GetThumbParamsBuilder> {
		
		public GetThumbParamsBuilder(long id) {
			super(ThumbParams.class, "thumbparams", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get Thumb Params by ID
	 * 
	 * @param id 
	 */
    public static GetThumbParamsBuilder get(long id)  {
		return new GetThumbParamsBuilder(id);
	}
	
	public static class GetByConversionProfileIdThumbParamsBuilder extends ArrayRequestBuilder<ThumbParams, ThumbParams.Tokenizer, GetByConversionProfileIdThumbParamsBuilder> {
		
		public GetByConversionProfileIdThumbParamsBuilder(int conversionProfileId) {
			super(ThumbParams.class, "thumbparams", "getByConversionProfileId");
			params.add("conversionProfileId", conversionProfileId);
		}
		
		public void conversionProfileId(String multirequestToken) {
			params.add("conversionProfileId", multirequestToken);
		}
	}

	/**
	 * Get Thumb Params by Conversion Profile ID
	 * 
	 * @param conversionProfileId 
	 */
    public static GetByConversionProfileIdThumbParamsBuilder getByConversionProfileId(int conversionProfileId)  {
		return new GetByConversionProfileIdThumbParamsBuilder(conversionProfileId);
	}
	
	public static class ListThumbParamsBuilder extends ListResponseRequestBuilder<ThumbParams, ThumbParams.Tokenizer, ListThumbParamsBuilder> {
		
		public ListThumbParamsBuilder(ThumbParamsFilter filter, FilterPager pager) {
			super(ThumbParams.class, "thumbparams", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListThumbParamsBuilder list()  {
		return list(null);
	}

	public static ListThumbParamsBuilder list(ThumbParamsFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List Thumb Params by filter with paging support (By default - all system default
	  params will be listed too)
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListThumbParamsBuilder list(ThumbParamsFilter filter, FilterPager pager)  {
		return new ListThumbParamsBuilder(filter, pager);
	}
	
	public static class UpdateThumbParamsBuilder extends RequestBuilder<ThumbParams, ThumbParams.Tokenizer, UpdateThumbParamsBuilder> {
		
		public UpdateThumbParamsBuilder(long id, ThumbParams thumbParams) {
			super(ThumbParams.class, "thumbparams", "update");
			params.add("id", id);
			params.add("thumbParams", thumbParams);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update Thumb Params by ID
	 * 
	 * @param id 
	 * @param thumbParams 
	 */
    public static UpdateThumbParamsBuilder update(long id, ThumbParams thumbParams)  {
		return new UpdateThumbParamsBuilder(id, thumbParams);
	}
}
