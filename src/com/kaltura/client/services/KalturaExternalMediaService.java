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
 * @date Sun, 28 Jun 15 06:41:52 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  External media service lets you upload and manage embed codes and external
  playable content    */
@SuppressWarnings("serial")
public class KalturaExternalMediaService extends KalturaServiceBase {
    public KalturaExternalMediaService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add external media entry     */
    public KalturaExternalMediaEntry add(KalturaExternalMediaEntry entry) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entry", entry);
        this.kalturaClient.queueServiceCall("externalmedia_externalmedia", "add", kparams, KalturaExternalMediaEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaExternalMediaEntry.class, resultXmlElement);
    }

	/**  Get external media entry by ID.     */
    public KalturaExternalMediaEntry get(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("externalmedia_externalmedia", "get", kparams, KalturaExternalMediaEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaExternalMediaEntry.class, resultXmlElement);
    }

	/**  Update external media entry. Only the properties that were set will be updated. 
	     */
    public KalturaExternalMediaEntry update(String id, KalturaExternalMediaEntry entry) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("entry", entry);
        this.kalturaClient.queueServiceCall("externalmedia_externalmedia", "update", kparams, KalturaExternalMediaEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaExternalMediaEntry.class, resultXmlElement);
    }

	/**  Delete a external media entry.     */
    public void delete(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("externalmedia_externalmedia", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaExternalMediaEntryListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaExternalMediaEntryListResponse list(KalturaExternalMediaEntryFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List media entries by filter with paging support.     */
    public KalturaExternalMediaEntryListResponse list(KalturaExternalMediaEntryFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("externalmedia_externalmedia", "list", kparams, KalturaExternalMediaEntryListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaExternalMediaEntryListResponse.class, resultXmlElement);
    }

    public int count() throws KalturaApiException {
        return this.count(null);
    }

	/**  Count media entries by filter.     */
    public int count(KalturaExternalMediaEntryFilter filter) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        this.kalturaClient.queueServiceCall("externalmedia_externalmedia", "count", kparams);
        if (this.kalturaClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }
}
