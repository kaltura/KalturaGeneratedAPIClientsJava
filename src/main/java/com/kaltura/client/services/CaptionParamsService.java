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
// Copyright (C) 2006-2020  Kaltura Inc.
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

import com.kaltura.client.types.CaptionParams;
import com.kaltura.client.types.CaptionParamsFilter;
import com.kaltura.client.types.FilterPager;
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
 * Add &amp; Manage Caption Params
 * 
 * @param captionParams 
 * @param id 
 * @param id 
 * @param filter 
 * @param pager 
 * @param id 
 * @param captionParams 
 */
public class CaptionParamsService {
	
	public static class AddCaptionParamsBuilder extends RequestBuilder<CaptionParams, CaptionParams.Tokenizer, AddCaptionParamsBuilder> {
		
		public AddCaptionParamsBuilder(CaptionParams captionParams) {
			super(CaptionParams.class, "caption_captionparams", "add");
			params.add("captionParams", captionParams);
		}
	}

	/**
	 * Add new Caption Params
	 * 
	 * @param captionParams 
	 */
    public static AddCaptionParamsBuilder add(CaptionParams captionParams)  {
		return new AddCaptionParamsBuilder(captionParams);
	}
	
	public static class DeleteCaptionParamsBuilder extends NullRequestBuilder {
		
		public DeleteCaptionParamsBuilder(int id) {
			super("caption_captionparams", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete Caption Params by ID
	 * 
	 * @param id 
	 */
    public static DeleteCaptionParamsBuilder delete(int id)  {
		return new DeleteCaptionParamsBuilder(id);
	}
	
	public static class GetCaptionParamsBuilder extends RequestBuilder<CaptionParams, CaptionParams.Tokenizer, GetCaptionParamsBuilder> {
		
		public GetCaptionParamsBuilder(int id) {
			super(CaptionParams.class, "caption_captionparams", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get Caption Params by ID
	 * 
	 * @param id 
	 */
    public static GetCaptionParamsBuilder get(int id)  {
		return new GetCaptionParamsBuilder(id);
	}
	
	public static class ListCaptionParamsBuilder extends ListResponseRequestBuilder<CaptionParams, CaptionParams.Tokenizer, ListCaptionParamsBuilder> {
		
		public ListCaptionParamsBuilder(CaptionParamsFilter filter, FilterPager pager) {
			super(CaptionParams.class, "caption_captionparams", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListCaptionParamsBuilder list()  {
		return list(null);
	}

	public static ListCaptionParamsBuilder list(CaptionParamsFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List Caption Params by filter with paging support (By default - all system
	  default params will be listed too)
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListCaptionParamsBuilder list(CaptionParamsFilter filter, FilterPager pager)  {
		return new ListCaptionParamsBuilder(filter, pager);
	}
	
	public static class UpdateCaptionParamsBuilder extends RequestBuilder<CaptionParams, CaptionParams.Tokenizer, UpdateCaptionParamsBuilder> {
		
		public UpdateCaptionParamsBuilder(int id, CaptionParams captionParams) {
			super(CaptionParams.class, "caption_captionparams", "update");
			params.add("id", id);
			params.add("captionParams", captionParams);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update Caption Params by ID
	 * 
	 * @param id 
	 * @param captionParams 
	 */
    public static UpdateCaptionParamsBuilder update(int id, CaptionParams captionParams)  {
		return new UpdateCaptionParamsBuilder(id, captionParams);
	}
}
