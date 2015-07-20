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
 * @date Mon, 20 Jul 15 01:15:46 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Edge Server service    */
@SuppressWarnings("serial")
public class KalturaEdgeServerService extends KalturaServiceBase {
    public KalturaEdgeServerService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Adds a edge server to the Kaltura DB.     */
    public KalturaEdgeServer add(KalturaEdgeServer edgeServer) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("edgeServer", edgeServer);
        this.kalturaClient.queueServiceCall("edgeserver", "add", kparams, KalturaEdgeServer.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEdgeServer.class, resultXmlElement);
    }

	/**  Get edge server by id     */
    public KalturaEdgeServer get(int edgeServerId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("edgeServerId", edgeServerId);
        this.kalturaClient.queueServiceCall("edgeserver", "get", kparams, KalturaEdgeServer.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEdgeServer.class, resultXmlElement);
    }

	/**  Update edge server by id      */
    public KalturaEdgeServer update(int edgeServerId, KalturaEdgeServer edgeServer) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("edgeServerId", edgeServerId);
        kparams.add("edgeServer", edgeServer);
        this.kalturaClient.queueServiceCall("edgeserver", "update", kparams, KalturaEdgeServer.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEdgeServer.class, resultXmlElement);
    }

	/**  delete edge server by id     */
    public void delete(String edgeServerId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("edgeServerId", edgeServerId);
        this.kalturaClient.queueServiceCall("edgeserver", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaEdgeServerListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaEdgeServerListResponse list(KalturaEdgeServerFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

    public KalturaEdgeServerListResponse list(KalturaEdgeServerFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("edgeserver", "list", kparams, KalturaEdgeServerListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEdgeServerListResponse.class, resultXmlElement);
    }
}
