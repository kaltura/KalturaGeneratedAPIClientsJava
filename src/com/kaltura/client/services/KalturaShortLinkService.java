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
 * @date Mon, 04 May 15 15:02:13 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Short link service    */
@SuppressWarnings("serial")
public class KalturaShortLinkService extends KalturaServiceBase {
    public KalturaShortLinkService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public KalturaShortLinkListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaShortLinkListResponse list(KalturaShortLinkFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List short link objects by filter and pager     */
    public KalturaShortLinkListResponse list(KalturaShortLinkFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("shortlink_shortlink", "list", kparams, KalturaShortLinkListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaShortLinkListResponse.class, resultXmlElement);
    }

	/**  Allows you to add a short link object     */
    public KalturaShortLink add(KalturaShortLink shortLink) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("shortLink", shortLink);
        this.kalturaClient.queueServiceCall("shortlink_shortlink", "add", kparams, KalturaShortLink.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaShortLink.class, resultXmlElement);
    }

	/**  Retrieve an short link object by id     */
    public KalturaShortLink get(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("shortlink_shortlink", "get", kparams, KalturaShortLink.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaShortLink.class, resultXmlElement);
    }

	/**  Update exisitng short link     */
    public KalturaShortLink update(String id, KalturaShortLink shortLink) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("shortLink", shortLink);
        this.kalturaClient.queueServiceCall("shortlink_shortlink", "update", kparams, KalturaShortLink.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaShortLink.class, resultXmlElement);
    }

	/**  Mark the short link as deleted     */
    public KalturaShortLink delete(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("shortlink_shortlink", "delete", kparams, KalturaShortLink.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaShortLink.class, resultXmlElement);
    }

    public String goto_(String id) throws KalturaApiException {
        return this.goto_(id, false);
    }

	/**  Serves short link     */
    public String goto_(String id, boolean proxy) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("proxy", proxy);
        this.kalturaClient.queueServiceCall("shortlink_shortlink", "goto_", kparams);
        return this.kalturaClient.serve();
    }
}
