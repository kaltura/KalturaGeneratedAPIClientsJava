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
import com.kaltura.client.types.UserLoginPin;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class UserLoginPinService {

    public static RequestBuilder<UserLoginPin> add()  {
        return add(null);
    }

	/**  Generate a time and usage expiry login-PIN that can allow a single login per
	  PIN. If an active login-PIN already exists. Calling this API again for same user
	  will add another login-PIN  */
    public static RequestBuilder<UserLoginPin> add(String secret)  {
        Params kparams = new Params();
        kparams.add("secret", secret);

        return new RequestBuilder<UserLoginPin>(UserLoginPin.class, "userloginpin", "add", kparams);
    }

	/**  Immediately expire all active login-PINs for a user  */
    public static RequestBuilder<Boolean> delete(String pinCode)  {
        Params kparams = new Params();
        kparams.add("pinCode", pinCode);

        return new RequestBuilder<Boolean>(Boolean.class, "userloginpin", "delete", kparams);
    }

	/**  Immediately expire all active login-PINs for a user  */
    public static RequestBuilder<Boolean> deleteAll()  {
        Params kparams = new Params();

        return new RequestBuilder<Boolean>(Boolean.class, "userloginpin", "deleteAll", kparams);
    }

    public static RequestBuilder<UserLoginPin> update(String pinCode)  {
        return update(pinCode, null);
    }

	/**  Set a time and usage expiry login-PIN that can allow a single login per PIN. If
	  an active login-PIN already exists. Calling this API again for same user will
	  add another login-PIN  */
    public static RequestBuilder<UserLoginPin> update(String pinCode, String secret)  {
        Params kparams = new Params();
        kparams.add("pinCode", pinCode);
        kparams.add("secret", secret);

        return new RequestBuilder<UserLoginPin>(UserLoginPin.class, "userloginpin", "update", kparams);
    }
}
