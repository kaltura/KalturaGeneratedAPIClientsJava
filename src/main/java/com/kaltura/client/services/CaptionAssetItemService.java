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
import com.kaltura.client.types.BaseEntry;
import com.kaltura.client.types.BaseEntryFilter;
import com.kaltura.client.types.CaptionAssetItem;
import com.kaltura.client.types.CaptionAssetItemFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Search caption asset items  */
public class CaptionAssetItemService {

    public static RequestBuilder<ListResponse<CaptionAssetItem>> search()  {
        return search(null);
    }

    public static RequestBuilder<ListResponse<CaptionAssetItem>> search(BaseEntryFilter entryFilter)  {
        return search(entryFilter, null);
    }

    public static RequestBuilder<ListResponse<CaptionAssetItem>> search(BaseEntryFilter entryFilter, CaptionAssetItemFilter captionAssetItemFilter)  {
        return search(entryFilter, captionAssetItemFilter, null);
    }

	/**  Search caption asset items by filter, pager and free text  */
    public static RequestBuilder<ListResponse<CaptionAssetItem>> search(BaseEntryFilter entryFilter, CaptionAssetItemFilter captionAssetItemFilter, FilterPager captionAssetItemPager)  {
        Params kparams = new Params();
        kparams.add("entryFilter", entryFilter);
        kparams.add("captionAssetItemFilter", captionAssetItemFilter);
        kparams.add("captionAssetItemPager", captionAssetItemPager);

        return new ListResponseRequestBuilder<CaptionAssetItem>(CaptionAssetItem.class, "captionsearch_captionassetitem", "search", kparams);
    }

    public static RequestBuilder<ListResponse<BaseEntry>> searchEntries()  {
        return searchEntries(null);
    }

    public static RequestBuilder<ListResponse<BaseEntry>> searchEntries(BaseEntryFilter entryFilter)  {
        return searchEntries(entryFilter, null);
    }

    public static RequestBuilder<ListResponse<BaseEntry>> searchEntries(BaseEntryFilter entryFilter, CaptionAssetItemFilter captionAssetItemFilter)  {
        return searchEntries(entryFilter, captionAssetItemFilter, null);
    }

	/**  Search caption asset items by filter, pager and free text  */
    public static RequestBuilder<ListResponse<BaseEntry>> searchEntries(BaseEntryFilter entryFilter, CaptionAssetItemFilter captionAssetItemFilter, FilterPager captionAssetItemPager)  {
        Params kparams = new Params();
        kparams.add("entryFilter", entryFilter);
        kparams.add("captionAssetItemFilter", captionAssetItemFilter);
        kparams.add("captionAssetItemPager", captionAssetItemPager);

        return new ListResponseRequestBuilder<BaseEntry>(BaseEntry.class, "captionsearch_captionassetitem", "searchEntries", kparams);
    }
}
