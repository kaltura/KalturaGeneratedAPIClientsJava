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
// Copyright (C) 2006-2018  Kaltura Inc.
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

import com.kaltura.client.enums.MediaType;
import com.kaltura.client.enums.SearchProviderType;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.Search;
import com.kaltura.client.types.SearchAuthData;
import com.kaltura.client.types.SearchResult;
import com.kaltura.client.types.SearchResultResponse;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Search service allows you to search for media in various media providers  This
  service is being used mostly by the CW component
 * 
 * @param searchSource 
 * @param userName 
 * @param password 
 * @param searchResult KalturaSearchResult object extends KalturaSearch and has all fields required for
 * media:add
 * @param search A KalturaSearch object contains the search keywords, media provider and media
 * type
 * @param pager 
 * @param mediaType 
 * @param url 
 */
public class SearchService {
	
	public static class ExternalLoginSearchBuilder extends RequestBuilder<SearchAuthData, SearchAuthData.Tokenizer, ExternalLoginSearchBuilder> {
		
		public ExternalLoginSearchBuilder(SearchProviderType searchSource, String userName, String password) {
			super(SearchAuthData.class, "search", "externalLogin");
			params.add("searchSource", searchSource);
			params.add("userName", userName);
			params.add("password", password);
		}
		
		public void searchSource(String multirequestToken) {
			params.add("searchSource", multirequestToken);
		}
		
		public void userName(String multirequestToken) {
			params.add("userName", multirequestToken);
		}
		
		public void password(String multirequestToken) {
			params.add("password", multirequestToken);
		}
	}

    public static ExternalLoginSearchBuilder externalLogin(SearchProviderType searchSource, String userName, String password)  {
		return new ExternalLoginSearchBuilder(searchSource, userName, password);
	}
	
	public static class GetMediaInfoSearchBuilder extends RequestBuilder<SearchResult, SearchResult.Tokenizer, GetMediaInfoSearchBuilder> {
		
		public GetMediaInfoSearchBuilder(SearchResult searchResult) {
			super(SearchResult.class, "search", "getMediaInfo");
			params.add("searchResult", searchResult);
		}
	}

	/**
	 * Retrieve extra information about media found in search action   Some providers
	  return only part of the fields needed to create entry from, use this action to
	  get the rest of the fields.
	 * 
	 * @param searchResult KalturaSearchResult object extends KalturaSearch and has all fields required for
	 * media:add
	 */
    public static GetMediaInfoSearchBuilder getMediaInfo(SearchResult searchResult)  {
		return new GetMediaInfoSearchBuilder(searchResult);
	}
	
	public static class SearchSearchBuilder extends RequestBuilder<SearchResultResponse, SearchResultResponse.Tokenizer, SearchSearchBuilder> {
		
		public SearchSearchBuilder(Search search, FilterPager pager) {
			super(SearchResultResponse.class, "search", "search");
			params.add("search", search);
			params.add("pager", pager);
		}
	}

	public static SearchSearchBuilder search(Search search)  {
		return search(search, null);
	}

	/**
	 * Search for media in one of the supported media providers
	 * 
	 * @param search A KalturaSearch object contains the search keywords, media provider and media
	 * type
	 * @param pager 
	 */
    public static SearchSearchBuilder search(Search search, FilterPager pager)  {
		return new SearchSearchBuilder(search, pager);
	}
	
	public static class SearchUrlSearchBuilder extends RequestBuilder<SearchResult, SearchResult.Tokenizer, SearchUrlSearchBuilder> {
		
		public SearchUrlSearchBuilder(MediaType mediaType, String url) {
			super(SearchResult.class, "search", "searchUrl");
			params.add("mediaType", mediaType);
			params.add("url", url);
		}
		
		public void mediaType(String multirequestToken) {
			params.add("mediaType", multirequestToken);
		}
		
		public void url(String multirequestToken) {
			params.add("url", multirequestToken);
		}
	}

	/**
	 * Search for media given a specific URL   Kaltura supports a searchURL action on
	  some of the media providers.   This action will return a KalturaSearchResult
	  object based on a given URL (assuming the media provider is supported)
	 * 
	 * @param mediaType 
	 * @param url 
	 */
    public static SearchUrlSearchBuilder searchUrl(MediaType mediaType, String url)  {
		return new SearchUrlSearchBuilder(mediaType, url);
	}
}
