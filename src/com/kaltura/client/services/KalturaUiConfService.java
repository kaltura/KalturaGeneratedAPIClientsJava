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
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Mon, 04 May 15 00:19:39 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  UiConf service lets you create and manage your UIConfs for the various flash
  components  This service is used by the KMC-ApplicationStudio    */
@SuppressWarnings("serial")
public class KalturaUiConfService extends KalturaServiceBase {
    public KalturaUiConfService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  UIConf Add action allows you to add a UIConf to Kaltura DB     */
    public KalturaUiConf add(KalturaUiConf uiConf) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("uiConf", uiConf);
        this.kalturaClient.queueServiceCall("uiconf", "add", kparams, KalturaUiConf.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUiConf.class, resultXmlElement);
    }

	/**  Update an existing UIConf     */
    public KalturaUiConf update(int id, KalturaUiConf uiConf) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("uiConf", uiConf);
        this.kalturaClient.queueServiceCall("uiconf", "update", kparams, KalturaUiConf.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUiConf.class, resultXmlElement);
    }

	/**  Retrieve a UIConf by id     */
    public KalturaUiConf get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("uiconf", "get", kparams, KalturaUiConf.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUiConf.class, resultXmlElement);
    }

	/**  Delete an existing UIConf     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("uiconf", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

	/**  Clone an existing UIConf     */
    public KalturaUiConf clone(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("uiconf", "clone", kparams, KalturaUiConf.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUiConf.class, resultXmlElement);
    }

    public KalturaUiConfListResponse listTemplates() throws KalturaApiException {
        return this.listTemplates(null);
    }

    public KalturaUiConfListResponse listTemplates(KalturaUiConfFilter filter) throws KalturaApiException {
        return this.listTemplates(filter, null);
    }

	/**  retrieve a list of available template UIConfs     */
    public KalturaUiConfListResponse listTemplates(KalturaUiConfFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("uiconf", "listTemplates", kparams, KalturaUiConfListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUiConfListResponse.class, resultXmlElement);
    }

    public KalturaUiConfListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaUiConfListResponse list(KalturaUiConfFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  Retrieve a list of available UIConfs     */
    public KalturaUiConfListResponse list(KalturaUiConfFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("uiconf", "list", kparams, KalturaUiConfListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUiConfListResponse.class, resultXmlElement);
    }

	/**  Retrieve a list of all available versions by object type     */
    public List<KalturaUiConfTypeInfo> getAvailableTypes() throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        this.kalturaClient.queueServiceCall("uiconf", "getAvailableTypes", kparams, KalturaUiConfTypeInfo.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaUiConfTypeInfo.class, resultXmlElement);
    }
}
