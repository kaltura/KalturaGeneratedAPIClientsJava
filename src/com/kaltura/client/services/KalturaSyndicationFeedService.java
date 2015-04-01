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
 * @date Wed, 01 Apr 15 00:22:47 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Add & Manage Syndication Feeds    */
@SuppressWarnings("serial")
public class KalturaSyndicationFeedService extends KalturaServiceBase {
    public KalturaSyndicationFeedService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new Syndication Feed     */
    public KalturaBaseSyndicationFeed add(KalturaBaseSyndicationFeed syndicationFeed) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("syndicationFeed", syndicationFeed);
        this.kalturaClient.queueServiceCall("syndicationfeed", "add", kparams, KalturaBaseSyndicationFeed.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaBaseSyndicationFeed.class, resultXmlElement);
    }

	/**  Get Syndication Feed by ID     */
    public KalturaBaseSyndicationFeed get(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("syndicationfeed", "get", kparams, KalturaBaseSyndicationFeed.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaBaseSyndicationFeed.class, resultXmlElement);
    }

	/**  Update Syndication Feed by ID     */
    public KalturaBaseSyndicationFeed update(String id, KalturaBaseSyndicationFeed syndicationFeed) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("syndicationFeed", syndicationFeed);
        this.kalturaClient.queueServiceCall("syndicationfeed", "update", kparams, KalturaBaseSyndicationFeed.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaBaseSyndicationFeed.class, resultXmlElement);
    }

	/**  Delete Syndication Feed by ID     */
    public void delete(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("syndicationfeed", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaBaseSyndicationFeedListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaBaseSyndicationFeedListResponse list(KalturaBaseSyndicationFeedFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List Syndication Feeds by filter with paging support     */
    public KalturaBaseSyndicationFeedListResponse list(KalturaBaseSyndicationFeedFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("syndicationfeed", "list", kparams, KalturaBaseSyndicationFeedListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaBaseSyndicationFeedListResponse.class, resultXmlElement);
    }

	/**  get entry count for a syndication feed     */
    public KalturaSyndicationFeedEntryCount getEntryCount(String feedId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("feedId", feedId);
        this.kalturaClient.queueServiceCall("syndicationfeed", "getEntryCount", kparams, KalturaSyndicationFeedEntryCount.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaSyndicationFeedEntryCount.class, resultXmlElement);
    }

	/**  request conversion for all entries that doesnt have the required flavor param  
	  returns a comma-separated ids of conversion jobs     */
    public String requestConversion(String feedId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("feedId", feedId);
        this.kalturaClient.queueServiceCall("syndicationfeed", "requestConversion", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }
}
