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
 * @date Tue, 13 Oct 15 01:17:24 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Add & Manage GroupUser    */
@SuppressWarnings("serial")
public class KalturaGroupUserService extends KalturaServiceBase {
    public KalturaGroupUserService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new GroupUser     */
    public KalturaGroupUser add(KalturaGroupUser groupUser) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("groupUser", groupUser);
        this.kalturaClient.queueServiceCall("groupuser", "add", kparams, KalturaGroupUser.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGroupUser.class, resultXmlElement);
    }

	/**  delete by userId and groupId     */
    public void delete(String userId, String groupId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("userId", userId);
        kparams.add("groupId", groupId);
        this.kalturaClient.queueServiceCall("groupuser", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaGroupUserListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaGroupUserListResponse list(KalturaGroupUserFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List all GroupUsers     */
    public KalturaGroupUserListResponse list(KalturaGroupUserFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("groupuser", "list", kparams, KalturaGroupUserListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGroupUserListResponse.class, resultXmlElement);
    }
}
