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
import com.kaltura.client.types.Country;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class SystemService {

    public static RequestBuilder<Country> getCountry()  {
        return getCountry(null);
    }

	/**  Returns country details by the provided IP, if not provided - by the client IP  */
    public static RequestBuilder<Country> getCountry(String ip)  {
        Params kparams = new Params();
        kparams.add("ip", ip);

        return new RequestBuilder<Country>(Country.class, "system", "getCountry", kparams);
    }

	/**  Returns current server timestamp  */
    public static RequestBuilder<Long> getTime()  {
        Params kparams = new Params();

        return new RequestBuilder<Long>(Long.class, "system", "getTime", kparams);
    }

	/**  Returns current server version  */
    public static RequestBuilder<String> getVersion()  {
        Params kparams = new Params();

        return new RequestBuilder<String>(String.class, "system", "getVersion", kparams);
    }

	/**  Returns true  */
    public static RequestBuilder<Boolean> ping()  {
        Params kparams = new Params();

        return new RequestBuilder<Boolean>(Boolean.class, "system", "ping", kparams);
    }
}
