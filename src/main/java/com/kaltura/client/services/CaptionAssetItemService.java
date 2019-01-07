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
// Copyright (C) 2006-2019  Kaltura Inc.
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

import com.kaltura.client.types.BaseEntry;
import com.kaltura.client.types.BaseEntryFilter;
import com.kaltura.client.types.CaptionAssetItem;
import com.kaltura.client.types.CaptionAssetItemFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Search caption asset items
 * 
 * @param captionAssetId 
 * @param captionAssetItemFilter 
 * @param captionAssetItemPager 
 * @param captionAssetId 
 * @param entryFilter 
 * @param captionAssetItemFilter 
 * @param captionAssetItemPager 
 * @param entryFilter 
 * @param captionAssetItemFilter 
 * @param captionAssetItemPager 
 */
public class CaptionAssetItemService {
	
	public static class ListCaptionAssetItemBuilder extends ListResponseRequestBuilder<CaptionAssetItem, CaptionAssetItem.Tokenizer, ListCaptionAssetItemBuilder> {
		
		public ListCaptionAssetItemBuilder(String captionAssetId, CaptionAssetItemFilter captionAssetItemFilter, FilterPager captionAssetItemPager) {
			super(CaptionAssetItem.class, "captionsearch_captionassetitem", "list");
			params.add("captionAssetId", captionAssetId);
			params.add("captionAssetItemFilter", captionAssetItemFilter);
			params.add("captionAssetItemPager", captionAssetItemPager);
		}
		
		public void captionAssetId(String multirequestToken) {
			params.add("captionAssetId", multirequestToken);
		}
	}

	public static ListCaptionAssetItemBuilder list(String captionAssetId)  {
		return list(captionAssetId, null);
	}

	public static ListCaptionAssetItemBuilder list(String captionAssetId, CaptionAssetItemFilter captionAssetItemFilter)  {
		return list(captionAssetId, captionAssetItemFilter, null);
	}

	/**
	 * List caption asset items by filter and pager
	 * 
	 * @param captionAssetId 
	 * @param captionAssetItemFilter 
	 * @param captionAssetItemPager 
	 */
    public static ListCaptionAssetItemBuilder list(String captionAssetId, CaptionAssetItemFilter captionAssetItemFilter, FilterPager captionAssetItemPager)  {
		return new ListCaptionAssetItemBuilder(captionAssetId, captionAssetItemFilter, captionAssetItemPager);
	}
	
	public static class SearchCaptionAssetItemBuilder extends ListResponseRequestBuilder<CaptionAssetItem, CaptionAssetItem.Tokenizer, SearchCaptionAssetItemBuilder> {
		
		public SearchCaptionAssetItemBuilder(BaseEntryFilter entryFilter, CaptionAssetItemFilter captionAssetItemFilter, FilterPager captionAssetItemPager) {
			super(CaptionAssetItem.class, "captionsearch_captionassetitem", "search");
			params.add("entryFilter", entryFilter);
			params.add("captionAssetItemFilter", captionAssetItemFilter);
			params.add("captionAssetItemPager", captionAssetItemPager);
		}
	}

	public static SearchCaptionAssetItemBuilder search()  {
		return search(null);
	}

	public static SearchCaptionAssetItemBuilder search(BaseEntryFilter entryFilter)  {
		return search(entryFilter, null);
	}

	public static SearchCaptionAssetItemBuilder search(BaseEntryFilter entryFilter, CaptionAssetItemFilter captionAssetItemFilter)  {
		return search(entryFilter, captionAssetItemFilter, null);
	}

	/**
	 * Search caption asset items by filter, pager and free text
	 * 
	 * @param entryFilter 
	 * @param captionAssetItemFilter 
	 * @param captionAssetItemPager 
	 */
    public static SearchCaptionAssetItemBuilder search(BaseEntryFilter entryFilter, CaptionAssetItemFilter captionAssetItemFilter, FilterPager captionAssetItemPager)  {
		return new SearchCaptionAssetItemBuilder(entryFilter, captionAssetItemFilter, captionAssetItemPager);
	}
	
	public static class SearchEntriesCaptionAssetItemBuilder extends ListResponseRequestBuilder<BaseEntry, BaseEntry.Tokenizer, SearchEntriesCaptionAssetItemBuilder> {
		
		public SearchEntriesCaptionAssetItemBuilder(BaseEntryFilter entryFilter, CaptionAssetItemFilter captionAssetItemFilter, FilterPager captionAssetItemPager) {
			super(BaseEntry.class, "captionsearch_captionassetitem", "searchEntries");
			params.add("entryFilter", entryFilter);
			params.add("captionAssetItemFilter", captionAssetItemFilter);
			params.add("captionAssetItemPager", captionAssetItemPager);
		}
	}

	public static SearchEntriesCaptionAssetItemBuilder searchEntries()  {
		return searchEntries(null);
	}

	public static SearchEntriesCaptionAssetItemBuilder searchEntries(BaseEntryFilter entryFilter)  {
		return searchEntries(entryFilter, null);
	}

	public static SearchEntriesCaptionAssetItemBuilder searchEntries(BaseEntryFilter entryFilter, CaptionAssetItemFilter captionAssetItemFilter)  {
		return searchEntries(entryFilter, captionAssetItemFilter, null);
	}

	/**
	 * Search caption asset items by filter, pager and free text
	 * 
	 * @param entryFilter 
	 * @param captionAssetItemFilter 
	 * @param captionAssetItemPager 
	 */
    public static SearchEntriesCaptionAssetItemBuilder searchEntries(BaseEntryFilter entryFilter, CaptionAssetItemFilter captionAssetItemFilter, FilterPager captionAssetItemPager)  {
		return new SearchEntriesCaptionAssetItemBuilder(entryFilter, captionAssetItemFilter, captionAssetItemPager);
	}
}
