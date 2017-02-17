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
import org.w3c.dom.Element;
import com.kaltura.client.utils.ParseUtils;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import com.kaltura.client.types.*;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Manage details for the administrative user  */
@SuppressWarnings("serial")
public class KalturaAdminUserService extends KalturaServiceBase {
    public KalturaAdminUserService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public String login(String email, String password) throws KalturaApiException {
        return this.login(email, password, Integer.MIN_VALUE);
    }

	/**  Get an admin session using admin email and password (Used for login to the KMC
	  application)  */
    public String login(String email, String password, int partnerId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("email", email);
        kparams.add("password", password);
        kparams.add("partnerId", partnerId);
        this.kalturaClient.queueServiceCall("adminuser", "login", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

	/**  Reset admin user password and send it to the users email address  */
    public void resetPassword(String email) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("email", email);
        this.kalturaClient.queueServiceCall("adminuser", "resetPassword", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

	/**  Set initial users password  */
    public void setInitialPassword(String hashKey, String newPassword) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("hashKey", hashKey);
        kparams.add("newPassword", newPassword);
        this.kalturaClient.queueServiceCall("adminuser", "setInitialPassword", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaAdminUser updatePassword(String email, String password) throws KalturaApiException {
        return this.updatePassword(email, password, "");
    }

    public KalturaAdminUser updatePassword(String email, String password, String newEmail) throws KalturaApiException {
        return this.updatePassword(email, password, newEmail, "");
    }

	/**  Update admin user password and email  */
    public KalturaAdminUser updatePassword(String email, String password, String newEmail, String newPassword) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("email", email);
        kparams.add("password", password);
        kparams.add("newEmail", newEmail);
        kparams.add("newPassword", newPassword);
        this.kalturaClient.queueServiceCall("adminuser", "updatePassword", kparams, KalturaAdminUser.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAdminUser.class, resultXmlElement);
    }
}
