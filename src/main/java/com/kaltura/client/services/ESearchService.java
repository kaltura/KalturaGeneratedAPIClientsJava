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

import com.kaltura.client.types.ESearchItem;
import com.kaltura.client.types.ESearchParams;
import com.kaltura.client.types.ESearchResponse;
import com.kaltura.client.types.KeyValue;
import com.kaltura.client.types.Pager;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class ESearchService {
	
	public static class GetAllowedSearchTypesESearchBuilder extends ArrayRequestBuilder<KeyValue, KeyValue.Tokenizer, GetAllowedSearchTypesESearchBuilder> {
		
		public GetAllowedSearchTypesESearchBuilder(ESearchItem searchItem) {
			super(KeyValue.class, "elasticsearch_esearch", "getAllowedSearchTypes");
			params.add("searchItem", searchItem);
		}
	}

    public static GetAllowedSearchTypesESearchBuilder getAllowedSearchTypes(ESearchItem searchItem)  {
		return new GetAllowedSearchTypesESearchBuilder(searchItem);
	}
	
	public static class SearchCategoryESearchBuilder extends RequestBuilder<ESearchResponse, ESearchResponse.Tokenizer, SearchCategoryESearchBuilder> {
		
		public SearchCategoryESearchBuilder(ESearchParams searchParams, Pager pager) {
			super(ESearchResponse.class, "elasticsearch_esearch", "searchCategory");
			params.add("searchParams", searchParams);
			params.add("pager", pager);
		}
	}

	public static SearchCategoryESearchBuilder searchCategory(ESearchParams searchParams)  {
		return searchCategory(searchParams, null);
	}

    public static SearchCategoryESearchBuilder searchCategory(ESearchParams searchParams, Pager pager)  {
		return new SearchCategoryESearchBuilder(searchParams, pager);
	}
	
	public static class SearchEntryESearchBuilder extends RequestBuilder<ESearchResponse, ESearchResponse.Tokenizer, SearchEntryESearchBuilder> {
		
		public SearchEntryESearchBuilder(ESearchParams searchParams, Pager pager) {
			super(ESearchResponse.class, "elasticsearch_esearch", "searchEntry");
			params.add("searchParams", searchParams);
			params.add("pager", pager);
		}
	}

	public static SearchEntryESearchBuilder searchEntry(ESearchParams searchParams)  {
		return searchEntry(searchParams, null);
	}

    public static SearchEntryESearchBuilder searchEntry(ESearchParams searchParams, Pager pager)  {
		return new SearchEntryESearchBuilder(searchParams, pager);
	}
	
	public static class SearchUserESearchBuilder extends RequestBuilder<ESearchResponse, ESearchResponse.Tokenizer, SearchUserESearchBuilder> {
		
		public SearchUserESearchBuilder(ESearchParams searchParams, Pager pager) {
			super(ESearchResponse.class, "elasticsearch_esearch", "searchUser");
			params.add("searchParams", searchParams);
			params.add("pager", pager);
		}
	}

	public static SearchUserESearchBuilder searchUser(ESearchParams searchParams)  {
		return searchUser(searchParams, null);
	}

    public static SearchUserESearchBuilder searchUser(ESearchParams searchParams, Pager pager)  {
		return new SearchUserESearchBuilder(searchParams, pager);
	}
}
