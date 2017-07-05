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
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.LoginResponse;
import com.kaltura.client.types.LoginSession;
import com.kaltura.client.types.OTTUser;
import com.kaltura.client.types.OTTUserFilter;
import com.kaltura.client.types.StringValue;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.Map;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class OttUserService {

	/**  Activate the account by activation token  */
    public static RequestBuilder<OTTUser> activate(int partnerId, String username, String activationToken)  {
        Params kparams = new Params();
        kparams.add("partnerId", partnerId);
        kparams.add("username", username);
        kparams.add("activationToken", activationToken);

        return new RequestBuilder<OTTUser>(OTTUser.class, "ottuser", "activate", kparams);
    }

	/**  Edit user details.  */
    public static RequestBuilder<Boolean> addRole(long roleId)  {
        Params kparams = new Params();
        kparams.add("roleId", roleId);

        return new RequestBuilder<Boolean>(Boolean.class, "ottuser", "addRole", kparams);
    }

    public static RequestBuilder<LoginSession> anonymousLogin(int partnerId)  {
        return anonymousLogin(partnerId, null);
    }

	/**  Returns tokens (KS and refresh token) for anonymous access  */
    public static RequestBuilder<LoginSession> anonymousLogin(int partnerId, String udid)  {
        Params kparams = new Params();
        kparams.add("partnerId", partnerId);
        kparams.add("udid", udid);

        return new RequestBuilder<LoginSession>(LoginSession.class, "ottuser", "anonymousLogin", kparams);
    }

	/**  Permanently delete a user. User to delete cannot be an exclusive household
	  master, and cannot be default user.  */
    public static RequestBuilder<Boolean> delete()  {
        Params kparams = new Params();

        return new RequestBuilder<Boolean>(Boolean.class, "ottuser", "delete", kparams);
    }

	/**  Retrieving users&amp;#39; data  */
    public static RequestBuilder<OTTUser> get()  {
        Params kparams = new Params();

        return new RequestBuilder<OTTUser>(OTTUser.class, "ottuser", "get", kparams);
    }

	/**  Resend the activation token to a user  */
    public static RequestBuilder<StringValue> getEncryptedUserId()  {
        Params kparams = new Params();

        return new RequestBuilder<StringValue>(StringValue.class, "ottuser", "getEncryptedUserId", kparams);
    }

	/**  Retrieve user by external identifier or username  */
    public static RequestBuilder<ListResponse<OTTUser>> list(OTTUserFilter filter)  {
        Params kparams = new Params();
        kparams.add("filter", filter);

        return new ListResponseRequestBuilder<OTTUser>(OTTUser.class, "ottuser", "list", kparams);
    }

    public static RequestBuilder<LoginResponse> login(int partnerId)  {
        return login(partnerId, null);
    }

    public static RequestBuilder<LoginResponse> login(int partnerId, String username)  {
        return login(partnerId, username, null);
    }

    public static RequestBuilder<LoginResponse> login(int partnerId, String username, String password)  {
        return login(partnerId, username, password, null);
    }

    public static RequestBuilder<LoginResponse> login(int partnerId, String username, String password, Map<String, StringValue> extraParams)  {
        return login(partnerId, username, password, extraParams, null);
    }

	/**  User sign-in via a time-expired sign-in PIN.  */
    public static RequestBuilder<LoginResponse> login(int partnerId, String username, String password, Map<String, StringValue> extraParams, String udid)  {
        Params kparams = new Params();
        kparams.add("partnerId", partnerId);
        kparams.add("username", username);
        kparams.add("password", password);
        kparams.add("extraParams", extraParams);
        kparams.add("udid", udid);

        return new RequestBuilder<LoginResponse>(LoginResponse.class, "ottuser", "login", kparams);
    }

    public static RequestBuilder<LoginResponse> loginWithPin(int partnerId, String pin)  {
        return loginWithPin(partnerId, pin, null);
    }

    public static RequestBuilder<LoginResponse> loginWithPin(int partnerId, String pin, String udid)  {
        return loginWithPin(partnerId, pin, udid, null);
    }

	/**  User sign-in via a time-expired sign-in PIN.  */
    public static RequestBuilder<LoginResponse> loginWithPin(int partnerId, String pin, String udid, String secret)  {
        Params kparams = new Params();
        kparams.add("partnerId", partnerId);
        kparams.add("pin", pin);
        kparams.add("udid", udid);
        kparams.add("secret", secret);

        return new RequestBuilder<LoginResponse>(LoginResponse.class, "ottuser", "loginWithPin", kparams);
    }

	/**  Logout the calling user.  */
    public static RequestBuilder<Boolean> logout()  {
        Params kparams = new Params();

        return new RequestBuilder<Boolean>(Boolean.class, "ottuser", "logout", kparams);
    }

    public static RequestBuilder<LoginSession> refreshSession(String refreshToken)  {
        return refreshSession(refreshToken, null);
    }

	/**  Returns new Kaltura session (ks) for the user, using the supplied refresh_token
	  (only if it&amp;#39;s valid and not expired)  */
    public static RequestBuilder<LoginSession> refreshSession(String refreshToken, String udid)  {
        Params kparams = new Params();
        kparams.add("refreshToken", refreshToken);
        kparams.add("udid", udid);

        return new RequestBuilder<LoginSession>(LoginSession.class, "ottuser", "refreshSession", kparams);
    }

	/**  Sign up a new user.  */
    public static RequestBuilder<OTTUser> register(int partnerId, OTTUser user, String password)  {
        Params kparams = new Params();
        kparams.add("partnerId", partnerId);
        kparams.add("user", user);
        kparams.add("password", password);

        return new RequestBuilder<OTTUser>(OTTUser.class, "ottuser", "register", kparams);
    }

	/**  Resend the activation token to a user  */
    public static RequestBuilder<Boolean> resendActivationToken(int partnerId, String username)  {
        Params kparams = new Params();
        kparams.add("partnerId", partnerId);
        kparams.add("username", username);

        return new RequestBuilder<Boolean>(Boolean.class, "ottuser", "resendActivationToken", kparams);
    }

	/**  Send an e-mail with URL to enable the user to set new password.  */
    public static RequestBuilder<Boolean> resetPassword(int partnerId, String username)  {
        Params kparams = new Params();
        kparams.add("partnerId", partnerId);
        kparams.add("username", username);

        return new RequestBuilder<Boolean>(Boolean.class, "ottuser", "resetPassword", kparams);
    }

	/**  Renew the user&amp;#39;s password after validating the token that sent as part
	  of URL in e-mail.  */
    public static RequestBuilder<OTTUser> setInitialPassword(int partnerId, String token, String password)  {
        Params kparams = new Params();
        kparams.add("partnerId", partnerId);
        kparams.add("token", token);
        kparams.add("password", password);

        return new RequestBuilder<OTTUser>(OTTUser.class, "ottuser", "setInitialPassword", kparams);
    }

	/**  Given a user name and existing password, change to a new password.  */
    public static RequestBuilder<OTTUser> update(OTTUser user)  {
        Params kparams = new Params();
        kparams.add("user", user);

        return new RequestBuilder<OTTUser>(OTTUser.class, "ottuser", "update", kparams);
    }

	/**  Given a user name and existing password, change to a new password.  */
    public static RequestBuilder<Boolean> updateLoginData(String username, String oldPassword, String newPassword)  {
        Params kparams = new Params();
        kparams.add("username", username);
        kparams.add("oldPassword", oldPassword);
        kparams.add("newPassword", newPassword);

        return new RequestBuilder<Boolean>(Boolean.class, "ottuser", "updateLoginData", kparams);
    }
}
