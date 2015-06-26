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
 * @date Fri, 26 Jun 15 00:31:57 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  PermissionItem service lets you create and manage permission items    */
@SuppressWarnings("serial")
public class KalturaPermissionItemService extends KalturaServiceBase {
    public KalturaPermissionItemService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Adds a new permission item object to the account.   This action is available
	  only to Kaltura system administrators.     */
    public KalturaPermissionItem add(KalturaPermissionItem permissionItem) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("permissionItem", permissionItem);
        this.kalturaClient.queueServiceCall("permissionitem", "add", kparams, KalturaPermissionItem.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPermissionItem.class, resultXmlElement);
    }

	/**  Retrieves a permission item object using its ID.     */
    public KalturaPermissionItem get(int permissionItemId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("permissionItemId", permissionItemId);
        this.kalturaClient.queueServiceCall("permissionitem", "get", kparams, KalturaPermissionItem.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPermissionItem.class, resultXmlElement);
    }

	/**  Updates an existing permission item object.   This action is available only to
	  Kaltura system administrators.     */
    public KalturaPermissionItem update(int permissionItemId, KalturaPermissionItem permissionItem) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("permissionItemId", permissionItemId);
        kparams.add("permissionItem", permissionItem);
        this.kalturaClient.queueServiceCall("permissionitem", "update", kparams, KalturaPermissionItem.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPermissionItem.class, resultXmlElement);
    }

	/**  Deletes an existing permission item object.   This action is available only to
	  Kaltura system administrators.     */
    public KalturaPermissionItem delete(int permissionItemId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("permissionItemId", permissionItemId);
        this.kalturaClient.queueServiceCall("permissionitem", "delete", kparams, KalturaPermissionItem.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPermissionItem.class, resultXmlElement);
    }

    public KalturaPermissionItemListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaPermissionItemListResponse list(KalturaPermissionItemFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  Lists permission item objects that are associated with an account.     */
    public KalturaPermissionItemListResponse list(KalturaPermissionItemFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("permissionitem", "list", kparams, KalturaPermissionItemListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPermissionItemListResponse.class, resultXmlElement);
    }
}
