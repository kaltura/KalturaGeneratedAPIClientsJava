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
// Copyright (C) 2006-2017  Kaltura Inc.
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

import com.kaltura.client.Params;
import com.kaltura.client.types.AdminUser;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Manage details for the administrative user  */
public class AdminUserService {

    public static RequestBuilder<String> login(String email, String password)  {
        return login(email, password, Integer.MIN_VALUE);
    }

	/**  Get an admin session using admin email and password (Used for login to the KMC
	  application)  */
    public static RequestBuilder<String> login(String email, String password, int partnerId)  {
        Params kparams = new Params();
        kparams.add("email", email);
        kparams.add("password", password);
        kparams.add("partnerId", partnerId);

        return new RequestBuilder<String>(String.class, "adminuser", "login", kparams);
    }

	/**  Reset admin user password and send it to the users email address  */
    public static RequestBuilder<Void> resetPassword(String email)  {
        Params kparams = new Params();
        kparams.add("email", email);

        return new NullRequestBuilder("adminuser", "resetPassword", kparams);
    }

	/**  Set initial users password  */
    public static RequestBuilder<Void> setInitialPassword(String hashKey, String newPassword)  {
        Params kparams = new Params();
        kparams.add("hashKey", hashKey);
        kparams.add("newPassword", newPassword);

        return new NullRequestBuilder("adminuser", "setInitialPassword", kparams);
    }

    public static RequestBuilder<AdminUser> updatePassword(String email, String password)  {
        return updatePassword(email, password, "");
    }

    public static RequestBuilder<AdminUser> updatePassword(String email, String password, String newEmail)  {
        return updatePassword(email, password, newEmail, "");
    }

	/**  Update admin user password and email  */
    public static RequestBuilder<AdminUser> updatePassword(String email, String password, String newEmail, String newPassword)  {
        Params kparams = new Params();
        kparams.add("email", email);
        kparams.add("password", password);
        kparams.add("newEmail", newEmail);
        kparams.add("newPassword", newPassword);

        return new RequestBuilder<AdminUser>(AdminUser.class, "adminuser", "updatePassword", kparams);
    }
}
