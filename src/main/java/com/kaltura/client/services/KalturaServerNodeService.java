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
// Copyright (C) 2006-2016  Kaltura Inc.
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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Server Node service  */
@SuppressWarnings("serial")
public class KalturaServerNodeService extends KalturaServiceBase {
    public KalturaServerNodeService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Adds a server node to the Kaltura DB.  */
    public KalturaServerNode add(KalturaServerNode serverNode) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("serverNode", serverNode);
        this.kalturaClient.queueServiceCall("servernode", "add", kparams, KalturaServerNode.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaServerNode.class, resultXmlElement);
    }

	/**  Get server node by id  */
    public KalturaServerNode get(int serverNodeId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("serverNodeId", serverNodeId);
        this.kalturaClient.queueServiceCall("servernode", "get", kparams, KalturaServerNode.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaServerNode.class, resultXmlElement);
    }

	/**  Update server node by id  */
    public KalturaServerNode update(int serverNodeId, KalturaServerNode serverNode) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("serverNodeId", serverNodeId);
        kparams.add("serverNode", serverNode);
        this.kalturaClient.queueServiceCall("servernode", "update", kparams, KalturaServerNode.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaServerNode.class, resultXmlElement);
    }

	/**  delete server node by id  */
    public void delete(String serverNodeId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("serverNodeId", serverNodeId);
        this.kalturaClient.queueServiceCall("servernode", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

	/**  Disable server node by id  */
    public KalturaServerNode disable(String serverNodeId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("serverNodeId", serverNodeId);
        this.kalturaClient.queueServiceCall("servernode", "disable", kparams, KalturaServerNode.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaServerNode.class, resultXmlElement);
    }

	/**  Enable server node by id  */
    public KalturaServerNode enable(String serverNodeId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("serverNodeId", serverNodeId);
        this.kalturaClient.queueServiceCall("servernode", "enable", kparams, KalturaServerNode.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaServerNode.class, resultXmlElement);
    }

    public KalturaServerNodeListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaServerNodeListResponse list(KalturaServerNodeFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

    public KalturaServerNodeListResponse list(KalturaServerNodeFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("servernode", "list", kparams, KalturaServerNodeListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaServerNodeListResponse.class, resultXmlElement);
    }

    public KalturaServerNode reportStatus(String hostName) throws KalturaApiException {
        return this.reportStatus(hostName, null);
    }

	/**  Update server node status  */
    public KalturaServerNode reportStatus(String hostName, KalturaServerNode serverNode) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("hostName", hostName);
        kparams.add("serverNode", serverNode);
        this.kalturaClient.queueServiceCall("servernode", "reportStatus", kparams, KalturaServerNode.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaServerNode.class, resultXmlElement);
    }
}
