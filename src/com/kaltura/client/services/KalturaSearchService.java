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
import com.kaltura.client.enums.*;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Tue, 14 Jul 15 16:47:53 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Search service allows you to search for media in various media providers  This
  service is being used mostly by the CW component    */
@SuppressWarnings("serial")
public class KalturaSearchService extends KalturaServiceBase {
    public KalturaSearchService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public KalturaSearchResultResponse search(KalturaSearch search) throws KalturaApiException {
        return this.search(search, null);
    }

	/**  Search for media in one of the supported media providers     */
    public KalturaSearchResultResponse search(KalturaSearch search, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("search", search);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("search", "search", kparams, KalturaSearchResultResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaSearchResultResponse.class, resultXmlElement);
    }

	/**  Retrieve extra information about media found in search action   Some providers
	  return only part of the fields needed to create entry from, use this action to
	  get the rest of the fields.     */
    public KalturaSearchResult getMediaInfo(KalturaSearchResult searchResult) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("searchResult", searchResult);
        this.kalturaClient.queueServiceCall("search", "getMediaInfo", kparams, KalturaSearchResult.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaSearchResult.class, resultXmlElement);
    }

	/**  Search for media given a specific URL   Kaltura supports a searchURL action on
	  some of the media providers.   This action will return a KalturaSearchResult
	  object based on a given URL (assuming the media provider is supported)     */
    public KalturaSearchResult searchUrl(KalturaMediaType mediaType, String url) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("mediaType", mediaType);
        kparams.add("url", url);
        this.kalturaClient.queueServiceCall("search", "searchUrl", kparams, KalturaSearchResult.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaSearchResult.class, resultXmlElement);
    }

    public KalturaSearchAuthData externalLogin(KalturaSearchProviderType searchSource, String userName, String password) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("searchSource", searchSource);
        kparams.add("userName", userName);
        kparams.add("password", password);
        this.kalturaClient.queueServiceCall("search", "externalLogin", kparams, KalturaSearchAuthData.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaSearchAuthData.class, resultXmlElement);
    }
}
