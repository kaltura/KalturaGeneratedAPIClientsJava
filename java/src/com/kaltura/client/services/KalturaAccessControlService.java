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
 * @date Sat, 07 Mar 15 11:28:10 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Add & Manage Access Controls    */
@SuppressWarnings("serial")
public class KalturaAccessControlService extends KalturaServiceBase {
    public KalturaAccessControlService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new Access Control Profile     */
    public KalturaAccessControl add(KalturaAccessControl accessControl) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("accessControl", accessControl);
        this.kalturaClient.queueServiceCall("accesscontrol", "add", kparams, KalturaAccessControl.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAccessControl.class, resultXmlElement);
    }

	/**  Get Access Control Profile by id     */
    public KalturaAccessControl get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("accesscontrol", "get", kparams, KalturaAccessControl.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAccessControl.class, resultXmlElement);
    }

	/**  Update Access Control Profile by id     */
    public KalturaAccessControl update(int id, KalturaAccessControl accessControl) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("accessControl", accessControl);
        this.kalturaClient.queueServiceCall("accesscontrol", "update", kparams, KalturaAccessControl.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAccessControl.class, resultXmlElement);
    }

	/**  Delete Access Control Profile by id     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("accesscontrol", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaAccessControlListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaAccessControlListResponse list(KalturaAccessControlFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List Access Control Profiles by filter and pager     */
    public KalturaAccessControlListResponse list(KalturaAccessControlFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("accesscontrol", "list", kparams, KalturaAccessControlListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAccessControlListResponse.class, resultXmlElement);
    }
}
