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
 * @date Wed, 15 Apr 15 00:21:54 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  UiConf Admin service    */
@SuppressWarnings("serial")
public class KalturaUiConfAdminService extends KalturaServiceBase {
    public KalturaUiConfAdminService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Adds new UIConf with no partner limitation     */
    public KalturaUiConfAdmin add(KalturaUiConfAdmin uiConf) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("uiConf", uiConf);
        this.kalturaClient.queueServiceCall("adminconsole_uiconfadmin", "add", kparams, KalturaUiConfAdmin.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUiConfAdmin.class, resultXmlElement);
    }

	/**  Update an existing UIConf with no partner limitation     */
    public KalturaUiConfAdmin update(int id, KalturaUiConfAdmin uiConf) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("uiConf", uiConf);
        this.kalturaClient.queueServiceCall("adminconsole_uiconfadmin", "update", kparams, KalturaUiConfAdmin.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUiConfAdmin.class, resultXmlElement);
    }

	/**  Retrieve a UIConf by id with no partner limitation     */
    public KalturaUiConfAdmin get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("adminconsole_uiconfadmin", "get", kparams, KalturaUiConfAdmin.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUiConfAdmin.class, resultXmlElement);
    }

	/**  Delete an existing UIConf with no partner limitation     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("adminconsole_uiconfadmin", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaUiConfAdminListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaUiConfAdminListResponse list(KalturaUiConfFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  Retrieve a list of available UIConfs  with no partner limitation     */
    public KalturaUiConfAdminListResponse list(KalturaUiConfFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("adminconsole_uiconfadmin", "list", kparams, KalturaUiConfAdminListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUiConfAdminListResponse.class, resultXmlElement);
    }
}
