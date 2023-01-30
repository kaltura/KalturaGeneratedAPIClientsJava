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

import com.kaltura.client.enums.ConversionProfileType;
import com.kaltura.client.types.ConversionProfile;
import com.kaltura.client.types.ConversionProfileFilter;
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
 * Add &amp; Manage Conversion Profiles
 * 
 * @param conversionProfile 
 * @param id 
 * @param id 
 * @param type 
 * @param filter 
 * @param pager 
 * @param id 
 * @param id 
 * @param conversionProfile 
 */
public class ConversionProfileService {
	
	public static class AddConversionProfileBuilder extends RequestBuilder<ConversionProfile, ConversionProfile.Tokenizer, AddConversionProfileBuilder> {
		
		public AddConversionProfileBuilder(ConversionProfile conversionProfile) {
			super(ConversionProfile.class, "conversionprofile", "add");
			params.add("conversionProfile", conversionProfile);
		}
	}

	/**
	 * Add new Conversion Profile
	 * 
	 * @param conversionProfile 
	 */
    public static AddConversionProfileBuilder add(ConversionProfile conversionProfile)  {
		return new AddConversionProfileBuilder(conversionProfile);
	}
	
	public static class DeleteConversionProfileBuilder extends NullRequestBuilder {
		
		public DeleteConversionProfileBuilder(long id) {
			super("conversionprofile", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete Conversion Profile by ID
	 * 
	 * @param id 
	 */
    public static DeleteConversionProfileBuilder delete(long id)  {
		return new DeleteConversionProfileBuilder(id);
	}
	
	public static class GetConversionProfileBuilder extends RequestBuilder<ConversionProfile, ConversionProfile.Tokenizer, GetConversionProfileBuilder> {
		
		public GetConversionProfileBuilder(long id) {
			super(ConversionProfile.class, "conversionprofile", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get Conversion Profile by ID
	 * 
	 * @param id 
	 */
    public static GetConversionProfileBuilder get(long id)  {
		return new GetConversionProfileBuilder(id);
	}
	
	public static class GetDefaultConversionProfileBuilder extends RequestBuilder<ConversionProfile, ConversionProfile.Tokenizer, GetDefaultConversionProfileBuilder> {
		
		public GetDefaultConversionProfileBuilder(ConversionProfileType type) {
			super(ConversionProfile.class, "conversionprofile", "getDefault");
			params.add("type", type);
		}
		
		public void type(String multirequestToken) {
			params.add("type", multirequestToken);
		}
	}

	public static GetDefaultConversionProfileBuilder getDefault()  {
		return getDefault(null);
	}

	/**
	 * Get the partner's default conversion profile
	 * 
	 * @param type 
	 */
    public static GetDefaultConversionProfileBuilder getDefault(ConversionProfileType type)  {
		return new GetDefaultConversionProfileBuilder(type);
	}
	
	public static class ListConversionProfileBuilder extends ListResponseRequestBuilder<ConversionProfile, ConversionProfile.Tokenizer, ListConversionProfileBuilder> {
		
		public ListConversionProfileBuilder(ConversionProfileFilter filter, FilterPager pager) {
			super(ConversionProfile.class, "conversionprofile", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListConversionProfileBuilder list()  {
		return list(null);
	}

	public static ListConversionProfileBuilder list(ConversionProfileFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List Conversion Profiles by filter with paging support
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListConversionProfileBuilder list(ConversionProfileFilter filter, FilterPager pager)  {
		return new ListConversionProfileBuilder(filter, pager);
	}
	
	public static class SetAsDefaultConversionProfileBuilder extends RequestBuilder<ConversionProfile, ConversionProfile.Tokenizer, SetAsDefaultConversionProfileBuilder> {
		
		public SetAsDefaultConversionProfileBuilder(long id) {
			super(ConversionProfile.class, "conversionprofile", "setAsDefault");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Set Conversion Profile to be the partner default
	 * 
	 * @param id 
	 */
    public static SetAsDefaultConversionProfileBuilder setAsDefault(long id)  {
		return new SetAsDefaultConversionProfileBuilder(id);
	}
	
	public static class UpdateConversionProfileBuilder extends RequestBuilder<ConversionProfile, ConversionProfile.Tokenizer, UpdateConversionProfileBuilder> {
		
		public UpdateConversionProfileBuilder(long id, ConversionProfile conversionProfile) {
			super(ConversionProfile.class, "conversionprofile", "update");
			params.add("id", id);
			params.add("conversionProfile", conversionProfile);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update Conversion Profile by ID
	 * 
	 * @param id 
	 * @param conversionProfile 
	 */
    public static UpdateConversionProfileBuilder update(long id, ConversionProfile conversionProfile)  {
		return new UpdateConversionProfileBuilder(id, conversionProfile);
	}
}
