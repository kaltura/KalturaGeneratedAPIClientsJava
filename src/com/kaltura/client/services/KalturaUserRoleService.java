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
 * @date Fri, 19 Jun 15 00:23:29 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  UserRole service lets you create and manage user roles    */
@SuppressWarnings("serial")
public class KalturaUserRoleService extends KalturaServiceBase {
    public KalturaUserRoleService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Adds a new user role object to the account.     */
    public KalturaUserRole add(KalturaUserRole userRole) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("userRole", userRole);
        this.kalturaClient.queueServiceCall("userrole", "add", kparams, KalturaUserRole.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUserRole.class, resultXmlElement);
    }

	/**  Retrieves a user role object using its ID.     */
    public KalturaUserRole get(int userRoleId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("userRoleId", userRoleId);
        this.kalturaClient.queueServiceCall("userrole", "get", kparams, KalturaUserRole.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUserRole.class, resultXmlElement);
    }

	/**  Updates an existing user role object.     */
    public KalturaUserRole update(int userRoleId, KalturaUserRole userRole) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("userRoleId", userRoleId);
        kparams.add("userRole", userRole);
        this.kalturaClient.queueServiceCall("userrole", "update", kparams, KalturaUserRole.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUserRole.class, resultXmlElement);
    }

	/**  Deletes an existing user role object.     */
    public KalturaUserRole delete(int userRoleId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("userRoleId", userRoleId);
        this.kalturaClient.queueServiceCall("userrole", "delete", kparams, KalturaUserRole.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUserRole.class, resultXmlElement);
    }

    public KalturaUserRoleListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaUserRoleListResponse list(KalturaUserRoleFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  Lists user role objects that are associated with an account.   Blocked user
	  roles are listed unless you use a filter to exclude them.   Deleted user roles
	  are not listed unless you use a filter to include them.     */
    public KalturaUserRoleListResponse list(KalturaUserRoleFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("userrole", "list", kparams, KalturaUserRoleListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUserRoleListResponse.class, resultXmlElement);
    }

	/**  Creates a new user role object that is a duplicate of an existing role.     */
    public KalturaUserRole clone(int userRoleId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("userRoleId", userRoleId);
        this.kalturaClient.queueServiceCall("userrole", "clone", kparams, KalturaUserRole.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUserRole.class, resultXmlElement);
    }
}
