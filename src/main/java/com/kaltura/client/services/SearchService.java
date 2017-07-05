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

import com.kaltura.client.Params;
import com.kaltura.client.enums.MediaType;
import com.kaltura.client.enums.SearchProviderType;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.Search;
import com.kaltura.client.types.SearchAuthData;
import com.kaltura.client.types.SearchResult;
import com.kaltura.client.types.SearchResultResponse;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Search service allows you to search for media in various media providers  This
  service is being used mostly by the CW component  */
public class SearchService {

    public static RequestBuilder<SearchAuthData> externalLogin(SearchProviderType searchSource, String userName, String password)  {
        Params kparams = new Params();
        kparams.add("searchSource", searchSource);
        kparams.add("userName", userName);
        kparams.add("password", password);

        return new RequestBuilder<SearchAuthData>(SearchAuthData.class, "search", "externalLogin", kparams);
    }

	/**  Retrieve extra information about media found in search action   Some providers
	  return only part of the fields needed to create entry from, use this action to
	  get the rest of the fields.  */
    public static RequestBuilder<SearchResult> getMediaInfo(SearchResult searchResult)  {
        Params kparams = new Params();
        kparams.add("searchResult", searchResult);

        return new RequestBuilder<SearchResult>(SearchResult.class, "search", "getMediaInfo", kparams);
    }

    public static RequestBuilder<SearchResultResponse> search(Search search)  {
        return search(search, null);
    }

	/**  Search for media in one of the supported media providers  */
    public static RequestBuilder<SearchResultResponse> search(Search search, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("search", search);
        kparams.add("pager", pager);

        return new RequestBuilder<SearchResultResponse>(SearchResultResponse.class, "search", "search", kparams);
    }

	/**  Search for media given a specific URL   Kaltura supports a searchURL action on
	  some of the media providers.   This action will return a KalturaSearchResult
	  object based on a given URL (assuming the media provider is supported)  */
    public static RequestBuilder<SearchResult> searchUrl(MediaType mediaType, String url)  {
        Params kparams = new Params();
        kparams.add("mediaType", mediaType);
        kparams.add("url", url);

        return new RequestBuilder<SearchResult>(SearchResult.class, "search", "searchUrl", kparams);
    }
}
