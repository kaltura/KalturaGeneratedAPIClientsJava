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
// Copyright (C) 2006-2015  Kaltura Inc.
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

import com.kaltura.client.KalturaClient;
import com.kaltura.client.KalturaServiceBase;
import com.kaltura.client.types.*;
import org.w3c.dom.Element;
import com.kaltura.client.utils.ParseUtils;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Sun, 22 Mar 15 00:07:23 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Search caption asset items    */
@SuppressWarnings("serial")
public class KalturaCaptionAssetItemService extends KalturaServiceBase {
    public KalturaCaptionAssetItemService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public KalturaCaptionAssetItemListResponse search() throws KalturaApiException {
        return this.search(null);
    }

    public KalturaCaptionAssetItemListResponse search(KalturaBaseEntryFilter entryFilter) throws KalturaApiException {
        return this.search(entryFilter, null);
    }

    public KalturaCaptionAssetItemListResponse search(KalturaBaseEntryFilter entryFilter, KalturaCaptionAssetItemFilter captionAssetItemFilter) throws KalturaApiException {
        return this.search(entryFilter, captionAssetItemFilter, null);
    }

	/**  Search caption asset items by filter, pager and free text     */
    public KalturaCaptionAssetItemListResponse search(KalturaBaseEntryFilter entryFilter, KalturaCaptionAssetItemFilter captionAssetItemFilter, KalturaFilterPager captionAssetItemPager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryFilter", entryFilter);
        kparams.add("captionAssetItemFilter", captionAssetItemFilter);
        kparams.add("captionAssetItemPager", captionAssetItemPager);
        this.kalturaClient.queueServiceCall("captionsearch_captionassetitem", "search", kparams, KalturaCaptionAssetItemListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaCaptionAssetItemListResponse.class, resultXmlElement);
    }

    public KalturaBaseEntryListResponse searchEntries() throws KalturaApiException {
        return this.searchEntries(null);
    }

    public KalturaBaseEntryListResponse searchEntries(KalturaBaseEntryFilter entryFilter) throws KalturaApiException {
        return this.searchEntries(entryFilter, null);
    }

    public KalturaBaseEntryListResponse searchEntries(KalturaBaseEntryFilter entryFilter, KalturaCaptionAssetItemFilter captionAssetItemFilter) throws KalturaApiException {
        return this.searchEntries(entryFilter, captionAssetItemFilter, null);
    }

	/**  Search caption asset items by filter, pager and free text     */
    public KalturaBaseEntryListResponse searchEntries(KalturaBaseEntryFilter entryFilter, KalturaCaptionAssetItemFilter captionAssetItemFilter, KalturaFilterPager captionAssetItemPager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryFilter", entryFilter);
        kparams.add("captionAssetItemFilter", captionAssetItemFilter);
        kparams.add("captionAssetItemPager", captionAssetItemPager);
        this.kalturaClient.queueServiceCall("captionsearch_captionassetitem", "searchEntries", kparams, KalturaBaseEntryListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaBaseEntryListResponse.class, resultXmlElement);
    }
}
