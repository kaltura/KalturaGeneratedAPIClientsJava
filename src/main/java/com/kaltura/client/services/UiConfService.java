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

import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.UiConf;
import com.kaltura.client.types.UiConfFilter;
import com.kaltura.client.types.UiConfTypeInfo;
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
 * UiConf service lets you create and manage your UIConfs for the various flash
  components  This service is used by the KMC-ApplicationStudio
 * 
 * @param uiConf Mandatory input parameter of type KalturaUiConf
 * @param id 
 * @param id 
 * @param id 
 * @param filter 
 * @param pager 
 * @param filter 
 * @param pager 
 * @param id 
 * @param uiConf 
 */
public class UiConfService {
	
	public static class AddUiConfBuilder extends RequestBuilder<UiConf, UiConf.Tokenizer, AddUiConfBuilder> {
		
		public AddUiConfBuilder(UiConf uiConf) {
			super(UiConf.class, "uiconf", "add");
			params.add("uiConf", uiConf);
		}
	}

	/**
	 * UIConf Add action allows you to add a UIConf to Kaltura DB
	 * 
	 * @param uiConf Mandatory input parameter of type KalturaUiConf
	 */
    public static AddUiConfBuilder add(UiConf uiConf)  {
		return new AddUiConfBuilder(uiConf);
	}
	
	public static class CloneUiConfBuilder extends RequestBuilder<UiConf, UiConf.Tokenizer, CloneUiConfBuilder> {
		
		public CloneUiConfBuilder(int id) {
			super(UiConf.class, "uiconf", "clone");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Clone an existing UIConf
	 * 
	 * @param id 
	 */
    public static CloneUiConfBuilder clone(int id)  {
		return new CloneUiConfBuilder(id);
	}
	
	public static class DeleteUiConfBuilder extends NullRequestBuilder {
		
		public DeleteUiConfBuilder(int id) {
			super("uiconf", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete an existing UIConf
	 * 
	 * @param id 
	 */
    public static DeleteUiConfBuilder delete(int id)  {
		return new DeleteUiConfBuilder(id);
	}
	
	public static class GetUiConfBuilder extends RequestBuilder<UiConf, UiConf.Tokenizer, GetUiConfBuilder> {
		
		public GetUiConfBuilder(int id) {
			super(UiConf.class, "uiconf", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Retrieve a UIConf by id
	 * 
	 * @param id 
	 */
    public static GetUiConfBuilder get(int id)  {
		return new GetUiConfBuilder(id);
	}
	
	public static class GetAvailableTypesUiConfBuilder extends ArrayRequestBuilder<UiConfTypeInfo, UiConfTypeInfo.Tokenizer, GetAvailableTypesUiConfBuilder> {
		
		public GetAvailableTypesUiConfBuilder() {
			super(UiConfTypeInfo.class, "uiconf", "getAvailableTypes");
		}
	}

	/**
	 * Retrieve a list of all available versions by object type
	 */
    public static GetAvailableTypesUiConfBuilder getAvailableTypes()  {
		return new GetAvailableTypesUiConfBuilder();
	}
	
	public static class ListUiConfBuilder extends ListResponseRequestBuilder<UiConf, UiConf.Tokenizer, ListUiConfBuilder> {
		
		public ListUiConfBuilder(UiConfFilter filter, FilterPager pager) {
			super(UiConf.class, "uiconf", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListUiConfBuilder list()  {
		return list(null);
	}

	public static ListUiConfBuilder list(UiConfFilter filter)  {
		return list(filter, null);
	}

	/**
	 * Retrieve a list of available UIConfs
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListUiConfBuilder list(UiConfFilter filter, FilterPager pager)  {
		return new ListUiConfBuilder(filter, pager);
	}
	
	public static class ListTemplatesUiConfBuilder extends ListResponseRequestBuilder<UiConf, UiConf.Tokenizer, ListTemplatesUiConfBuilder> {
		
		public ListTemplatesUiConfBuilder(UiConfFilter filter, FilterPager pager) {
			super(UiConf.class, "uiconf", "listTemplates");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListTemplatesUiConfBuilder listTemplates()  {
		return listTemplates(null);
	}

	public static ListTemplatesUiConfBuilder listTemplates(UiConfFilter filter)  {
		return listTemplates(filter, null);
	}

	/**
	 * retrieve a list of available template UIConfs
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListTemplatesUiConfBuilder listTemplates(UiConfFilter filter, FilterPager pager)  {
		return new ListTemplatesUiConfBuilder(filter, pager);
	}
	
	public static class UpdateUiConfBuilder extends RequestBuilder<UiConf, UiConf.Tokenizer, UpdateUiConfBuilder> {
		
		public UpdateUiConfBuilder(int id, UiConf uiConf) {
			super(UiConf.class, "uiconf", "update");
			params.add("id", id);
			params.add("uiConf", uiConf);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update an existing UIConf
	 * 
	 * @param id 
	 * @param uiConf 
	 */
    public static UpdateUiConfBuilder update(int id, UiConf uiConf)  {
		return new UpdateUiConfBuilder(id, uiConf);
	}
}
