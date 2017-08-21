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
import com.kaltura.client.types.GenericDistributionProvider;
import com.kaltura.client.types.GenericDistributionProviderFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Generic Distribution Provider service  */
public class GenericDistributionProviderService {
	
	public static class AddGenericDistributionProviderBuilder extends RequestBuilder<GenericDistributionProvider, GenericDistributionProvider.Tokenizer, AddGenericDistributionProviderBuilder> {
		
		public AddGenericDistributionProviderBuilder(GenericDistributionProvider genericDistributionProvider) {
			super(GenericDistributionProvider.class, "contentdistribution_genericdistributionprovider", "add");
			params.add("genericDistributionProvider", genericDistributionProvider);
		}
	}

	/**  Add new Generic Distribution Provider  */
    public static AddGenericDistributionProviderBuilder add(GenericDistributionProvider genericDistributionProvider)  {
		return new AddGenericDistributionProviderBuilder(genericDistributionProvider);
	}
	
	public static class DeleteGenericDistributionProviderBuilder extends NullRequestBuilder {
		
		public DeleteGenericDistributionProviderBuilder(int id) {
			super("contentdistribution_genericdistributionprovider", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Delete Generic Distribution Provider by id  */
    public static DeleteGenericDistributionProviderBuilder delete(int id)  {
		return new DeleteGenericDistributionProviderBuilder(id);
	}
	
	public static class GetGenericDistributionProviderBuilder extends RequestBuilder<GenericDistributionProvider, GenericDistributionProvider.Tokenizer, GetGenericDistributionProviderBuilder> {
		
		public GetGenericDistributionProviderBuilder(int id) {
			super(GenericDistributionProvider.class, "contentdistribution_genericdistributionprovider", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Get Generic Distribution Provider by id  */
    public static GetGenericDistributionProviderBuilder get(int id)  {
		return new GetGenericDistributionProviderBuilder(id);
	}
	
	public static class ListGenericDistributionProviderBuilder extends ListResponseRequestBuilder<GenericDistributionProvider, GenericDistributionProvider.Tokenizer, ListGenericDistributionProviderBuilder> {
		
		public ListGenericDistributionProviderBuilder(GenericDistributionProviderFilter filter, FilterPager pager) {
			super(GenericDistributionProvider.class, "contentdistribution_genericdistributionprovider", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListGenericDistributionProviderBuilder list()  {
		return list(null);
	}

	public static ListGenericDistributionProviderBuilder list(GenericDistributionProviderFilter filter)  {
		return list(filter, null);
	}

	/**  List all distribution providers  */
    public static ListGenericDistributionProviderBuilder list(GenericDistributionProviderFilter filter, FilterPager pager)  {
		return new ListGenericDistributionProviderBuilder(filter, pager);
	}
	
	public static class UpdateGenericDistributionProviderBuilder extends RequestBuilder<GenericDistributionProvider, GenericDistributionProvider.Tokenizer, UpdateGenericDistributionProviderBuilder> {
		
		public UpdateGenericDistributionProviderBuilder(int id, GenericDistributionProvider genericDistributionProvider) {
			super(GenericDistributionProvider.class, "contentdistribution_genericdistributionprovider", "update");
			params.add("id", id);
			params.add("genericDistributionProvider", genericDistributionProvider);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Update Generic Distribution Provider by id  */
    public static UpdateGenericDistributionProviderBuilder update(int id, GenericDistributionProvider genericDistributionProvider)  {
		return new UpdateGenericDistributionProviderBuilder(id, genericDistributionProvider);
	}
}
