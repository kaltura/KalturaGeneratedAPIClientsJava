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
import com.kaltura.client.enums.SessionType;
import com.kaltura.client.types.AppToken;
import com.kaltura.client.types.AppTokenFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.SessionInfo;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Manage application authentication tokens  */
public class AppTokenService {

	/**  Add new application authentication token  */
    public static RequestBuilder<AppToken> add(AppToken appToken)  {
        Params kparams = new Params();
        kparams.add("appToken", appToken);

        return new RequestBuilder<AppToken>(AppToken.class, "apptoken", "add", kparams);
    }

	/**  Delete application authentication token by id  */
    public static RequestBuilder<Void> delete(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("apptoken", "delete", kparams);
    }

	/**  Get application authentication token by id  */
    public static RequestBuilder<AppToken> get(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<AppToken>(AppToken.class, "apptoken", "get", kparams);
    }

    public static RequestBuilder<ListResponse<AppToken>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<AppToken>> list(AppTokenFilter filter)  {
        return list(filter, null);
    }

	/**  List application authentication tokens by filter and pager  */
    public static RequestBuilder<ListResponse<AppToken>> list(AppTokenFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<AppToken>(AppToken.class, "apptoken", "list", kparams);
    }

    public static RequestBuilder<SessionInfo> startSession(String id, String tokenHash)  {
        return startSession(id, tokenHash, null);
    }

    public static RequestBuilder<SessionInfo> startSession(String id, String tokenHash, String userId)  {
        return startSession(id, tokenHash, userId, SessionType.get(Integer.MIN_VALUE));
    }

    public static RequestBuilder<SessionInfo> startSession(String id, String tokenHash, String userId, SessionType type)  {
        return startSession(id, tokenHash, userId, type, Integer.MIN_VALUE);
    }

	/**  Starts a new KS (kaltura Session) based on application authentication token id  */
    public static RequestBuilder<SessionInfo> startSession(String id, String tokenHash, String userId, SessionType type, int expiry)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("tokenHash", tokenHash);
        kparams.add("userId", userId);
        kparams.add("type", type);
        kparams.add("expiry", expiry);

        return new RequestBuilder<SessionInfo>(SessionInfo.class, "apptoken", "startSession", kparams);
    }

	/**  Update application authentication token by id  */
    public static RequestBuilder<AppToken> update(String id, AppToken appToken)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("appToken", appToken);

        return new RequestBuilder<AppToken>(AppToken.class, "apptoken", "update", kparams);
    }
}
