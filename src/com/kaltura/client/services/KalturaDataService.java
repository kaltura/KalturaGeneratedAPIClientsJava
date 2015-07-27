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
 * @date Mon, 27 Jul 15 07:10:07 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Data service lets you manage data content (textual content)    */
@SuppressWarnings("serial")
public class KalturaDataService extends KalturaServiceBase {
    public KalturaDataService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Adds a new data entry     */
    public KalturaDataEntry add(KalturaDataEntry dataEntry) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("dataEntry", dataEntry);
        this.kalturaClient.queueServiceCall("data", "add", kparams, KalturaDataEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDataEntry.class, resultXmlElement);
    }

    public KalturaDataEntry get(String entryId) throws KalturaApiException {
        return this.get(entryId, -1);
    }

	/**  Get data entry by ID.     */
    public KalturaDataEntry get(String entryId, int version) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("version", version);
        this.kalturaClient.queueServiceCall("data", "get", kparams, KalturaDataEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDataEntry.class, resultXmlElement);
    }

	/**  Update data entry. Only the properties that were set will be updated.     */
    public KalturaDataEntry update(String entryId, KalturaDataEntry documentEntry) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("documentEntry", documentEntry);
        this.kalturaClient.queueServiceCall("data", "update", kparams, KalturaDataEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDataEntry.class, resultXmlElement);
    }

	/**  Delete a data entry.     */
    public void delete(String entryId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        this.kalturaClient.queueServiceCall("data", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaDataListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaDataListResponse list(KalturaDataEntryFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List data entries by filter with paging support.     */
    public KalturaDataListResponse list(KalturaDataEntryFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("data", "list", kparams, KalturaDataListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDataListResponse.class, resultXmlElement);
    }

    public String serve(String entryId) throws KalturaApiException {
        return this.serve(entryId, -1);
    }

    public String serve(String entryId, int version) throws KalturaApiException {
        return this.serve(entryId, version, false);
    }

	/**  serve action returan the file from dataContent field.     */
    public String serve(String entryId, int version, boolean forceProxy) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("version", version);
        kparams.add("forceProxy", forceProxy);
        this.kalturaClient.queueServiceCall("data", "serve", kparams);
        return this.kalturaClient.serve();
    }
}
