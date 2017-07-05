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
import com.kaltura.client.enums.SocialNetwork;
import com.kaltura.client.types.LoginResponse;
import com.kaltura.client.types.Social;
import com.kaltura.client.types.SocialConfig;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class SocialService {

	/**  Return the user object with social information according to a provided external
	  social token  */
    public static RequestBuilder<Social> get(SocialNetwork type)  {
        Params kparams = new Params();
        kparams.add("type", type);

        return new RequestBuilder<Social>(Social.class, "social", "get", kparams);
    }

	/**  Return the user object with social information according to a provided external
	  social token  */
    public static RequestBuilder<Social> getByToken(int partnerId, String token, SocialNetwork type)  {
        Params kparams = new Params();
        kparams.add("partnerId", partnerId);
        kparams.add("token", token);
        kparams.add("type", type);

        return new RequestBuilder<Social>(Social.class, "social", "getByToken", kparams);
    }

	/**  Retrieve the social network’s configuration information  */
    public static RequestBuilder<SocialConfig> getConfiguration(int partnerId, SocialNetwork type)  {
        Params kparams = new Params();
        kparams.add("partnerId", partnerId);
        kparams.add("type", type);

        return new RequestBuilder<SocialConfig>(SocialConfig.class, "social", "getConfiguration", kparams);
    }

    public static RequestBuilder<LoginResponse> login(int partnerId, String token, SocialNetwork type)  {
        return login(partnerId, token, type, null);
    }

	/**  Login using social token  */
    public static RequestBuilder<LoginResponse> login(int partnerId, String token, SocialNetwork type, String udid)  {
        Params kparams = new Params();
        kparams.add("partnerId", partnerId);
        kparams.add("token", token);
        kparams.add("type", type);
        kparams.add("udid", udid);

        return new RequestBuilder<LoginResponse>(LoginResponse.class, "social", "login", kparams);
    }

	/**  Connect an existing user in the system to an external social network user  */
    public static RequestBuilder<Social> merge(String token, SocialNetwork type)  {
        Params kparams = new Params();
        kparams.add("token", token);
        kparams.add("type", type);

        return new RequestBuilder<Social>(Social.class, "social", "merge", kparams);
    }

	/**  Create a new user in the system using a provided external social token  */
    public static RequestBuilder<Social> register(int partnerId, String token, SocialNetwork type)  {
        Params kparams = new Params();
        kparams.add("partnerId", partnerId);
        kparams.add("token", token);
        kparams.add("type", type);

        return new RequestBuilder<Social>(Social.class, "social", "register", kparams);
    }

	/**  Disconnect an existing user in the system from its external social network user  */
    public static RequestBuilder<Social> unmerge(SocialNetwork type)  {
        Params kparams = new Params();
        kparams.add("type", type);

        return new RequestBuilder<Social>(Social.class, "social", "unmerge", kparams);
    }
}
