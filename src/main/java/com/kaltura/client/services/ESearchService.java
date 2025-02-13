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

import com.kaltura.client.types.ESearchCategoryParams;
import com.kaltura.client.types.ESearchCategoryResponse;
import com.kaltura.client.types.ESearchEntryParams;
import com.kaltura.client.types.ESearchEntryResponse;
import com.kaltura.client.types.ESearchGroupParams;
import com.kaltura.client.types.ESearchGroupResponse;
import com.kaltura.client.types.ESearchUserParams;
import com.kaltura.client.types.ESearchUserResponse;
import com.kaltura.client.types.Pager;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class ESearchService {
	
	public static class SearchCategoryESearchBuilder extends RequestBuilder<ESearchCategoryResponse, ESearchCategoryResponse.Tokenizer, SearchCategoryESearchBuilder> {
		
		public SearchCategoryESearchBuilder(ESearchCategoryParams searchParams, Pager pager) {
			super(ESearchCategoryResponse.class, "elasticsearch_esearch", "searchCategory");
			params.add("searchParams", searchParams);
			params.add("pager", pager);
		}
	}

	public static SearchCategoryESearchBuilder searchCategory(ESearchCategoryParams searchParams)  {
		return searchCategory(searchParams, null);
	}

    public static SearchCategoryESearchBuilder searchCategory(ESearchCategoryParams searchParams, Pager pager)  {
		return new SearchCategoryESearchBuilder(searchParams, pager);
	}
	
	public static class SearchEntryESearchBuilder extends RequestBuilder<ESearchEntryResponse, ESearchEntryResponse.Tokenizer, SearchEntryESearchBuilder> {
		
		public SearchEntryESearchBuilder(ESearchEntryParams searchParams, Pager pager) {
			super(ESearchEntryResponse.class, "elasticsearch_esearch", "searchEntry");
			params.add("searchParams", searchParams);
			params.add("pager", pager);
		}
	}

	public static SearchEntryESearchBuilder searchEntry(ESearchEntryParams searchParams)  {
		return searchEntry(searchParams, null);
	}

    public static SearchEntryESearchBuilder searchEntry(ESearchEntryParams searchParams, Pager pager)  {
		return new SearchEntryESearchBuilder(searchParams, pager);
	}
	
	public static class SearchGroupESearchBuilder extends RequestBuilder<ESearchGroupResponse, ESearchGroupResponse.Tokenizer, SearchGroupESearchBuilder> {
		
		public SearchGroupESearchBuilder(ESearchGroupParams searchParams, Pager pager) {
			super(ESearchGroupResponse.class, "elasticsearch_esearch", "searchGroup");
			params.add("searchParams", searchParams);
			params.add("pager", pager);
		}
	}

	public static SearchGroupESearchBuilder searchGroup(ESearchGroupParams searchParams)  {
		return searchGroup(searchParams, null);
	}

    public static SearchGroupESearchBuilder searchGroup(ESearchGroupParams searchParams, Pager pager)  {
		return new SearchGroupESearchBuilder(searchParams, pager);
	}
	
	public static class SearchUserESearchBuilder extends RequestBuilder<ESearchUserResponse, ESearchUserResponse.Tokenizer, SearchUserESearchBuilder> {
		
		public SearchUserESearchBuilder(ESearchUserParams searchParams, Pager pager) {
			super(ESearchUserResponse.class, "elasticsearch_esearch", "searchUser");
			params.add("searchParams", searchParams);
			params.add("pager", pager);
		}
	}

	public static SearchUserESearchBuilder searchUser(ESearchUserParams searchParams)  {
		return searchUser(searchParams, null);
	}

    public static SearchUserESearchBuilder searchUser(ESearchUserParams searchParams, Pager pager)  {
		return new SearchUserESearchBuilder(searchParams, pager);
	}
}
