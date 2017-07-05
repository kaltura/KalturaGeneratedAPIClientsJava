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

import com.kaltura.client.FileHolder;
import com.kaltura.client.Files;
import com.kaltura.client.Params;
import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.BulkUploadJobData;
import com.kaltura.client.types.BulkUploadUserData;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.User;
import com.kaltura.client.types.UserFilter;
import com.kaltura.client.types.UserLoginDataFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Manage partner users on Kaltura's side  The userId in kaltura is the unique Id
  in the partner's system, and the [partnerId,Id] couple are unique key in
  kaltura's DB  */
public class UserService {

	/**  Adds a new user to an existing account in the Kaltura database.   Input param
	  $id is the unique identifier in the partner's system.  */
    public static RequestBuilder<User> add(User user)  {
        Params kparams = new Params();
        kparams.add("user", user);

        return new RequestBuilder<User>(User.class, "user", "add", kparams);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileHolder fileData)  {
        return addFromBulkUpload(fileData, null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(File fileData)  {
        return addFromBulkUpload(new FileHolder(fileData), null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileHolder fileData, BulkUploadJobData bulkUploadData)  {
        return addFromBulkUpload(fileData, bulkUploadData, null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(File fileData, BulkUploadJobData bulkUploadData)  {
        return addFromBulkUpload(new FileHolder(fileData), bulkUploadData, null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, null);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(File fileData, BulkUploadJobData bulkUploadData, BulkUploadUserData bulkUploadUserData)  {
        return addFromBulkUpload(new FileHolder(fileData), bulkUploadData, bulkUploadUserData);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData, BulkUploadUserData bulkUploadUserData)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, bulkUploadUserData);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData, BulkUploadUserData bulkUploadUserData)  {
        return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, bulkUploadUserData);
    }

    public static RequestBuilder<BulkUpload> addFromBulkUpload(FileHolder fileData, BulkUploadJobData bulkUploadData, BulkUploadUserData bulkUploadUserData)  {
        Params kparams = new Params();
        Files kfiles = new Files();
        kfiles.add("fileData", fileData);
        kparams.add("bulkUploadData", bulkUploadData);
        kparams.add("bulkUploadUserData", bulkUploadUserData);

        return new RequestBuilder<BulkUpload>(BulkUpload.class, "user", "addFromBulkUpload", kparams, kfiles);
    }

	/**  Action which checks whther user login  */
    public static RequestBuilder<Boolean> checkLoginDataExists(UserLoginDataFilter filter)  {
        Params kparams = new Params();
        kparams.add("filter", filter);

        return new RequestBuilder<Boolean>(Boolean.class, "user", "checkLoginDataExists", kparams);
    }

	/**  Deletes a user from a partner account.  */
    public static RequestBuilder<User> delete(String userId)  {
        Params kparams = new Params();
        kparams.add("userId", userId);

        return new RequestBuilder<User>(User.class, "user", "delete", kparams);
    }

    public static RequestBuilder<User> disableLogin()  {
        return disableLogin(null);
    }

    public static RequestBuilder<User> disableLogin(String userId)  {
        return disableLogin(userId, null);
    }

	/**  Disables a user's ability to log into a partner account using an email address
	  and a password.   You may use either a userId or a loginId parameter for this
	  action.  */
    public static RequestBuilder<User> disableLogin(String userId, String loginId)  {
        Params kparams = new Params();
        kparams.add("userId", userId);
        kparams.add("loginId", loginId);

        return new RequestBuilder<User>(User.class, "user", "disableLogin", kparams);
    }

    public static RequestBuilder<User> enableLogin(String userId, String loginId)  {
        return enableLogin(userId, loginId, null);
    }

	/**  Enables a user to log into a partner account using an email address and a
	  password  */
    public static RequestBuilder<User> enableLogin(String userId, String loginId, String password)  {
        Params kparams = new Params();
        kparams.add("userId", userId);
        kparams.add("loginId", loginId);
        kparams.add("password", password);

        return new RequestBuilder<User>(User.class, "user", "enableLogin", kparams);
    }

    public static RequestBuilder<User> get()  {
        return get(null);
    }

	/**  Retrieves a user object for a specified user ID.  */
    public static RequestBuilder<User> get(String userId)  {
        Params kparams = new Params();
        kparams.add("userId", userId);

        return new RequestBuilder<User>(User.class, "user", "get", kparams);
    }

	/**  Retrieves a user object for a user's login ID and partner ID.   A login ID is
	  the email address used by a user to log into the system.  */
    public static RequestBuilder<User> getByLoginId(String loginId)  {
        Params kparams = new Params();
        kparams.add("loginId", loginId);

        return new RequestBuilder<User>(User.class, "user", "getByLoginId", kparams);
    }

    public static RequestBuilder<String> index(String id)  {
        return index(id, true);
    }

	/**  Index an entry by id.  */
    public static RequestBuilder<String> index(String id, boolean shouldUpdate)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("shouldUpdate", shouldUpdate);

        return new RequestBuilder<String>(String.class, "user", "index", kparams);
    }

    public static RequestBuilder<ListResponse<User>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<User>> list(UserFilter filter)  {
        return list(filter, null);
    }

	/**  Lists user objects that are associated with an account.   Blocked users are
	  listed unless you use a filter to exclude them.   Deleted users are not listed
	  unless you use a filter to include them.  */
    public static RequestBuilder<ListResponse<User>> list(UserFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<User>(User.class, "user", "list", kparams);
    }

    public static RequestBuilder<String> login(int partnerId, String userId, String password)  {
        return login(partnerId, userId, password, 86400);
    }

    public static RequestBuilder<String> login(int partnerId, String userId, String password, int expiry)  {
        return login(partnerId, userId, password, expiry, "*");
    }

	/**  Logs a user into a partner account with a partner ID, a partner user ID (puser),
	  and a user password.  */
    public static RequestBuilder<String> login(int partnerId, String userId, String password, int expiry, String privileges)  {
        Params kparams = new Params();
        kparams.add("partnerId", partnerId);
        kparams.add("userId", userId);
        kparams.add("password", password);
        kparams.add("expiry", expiry);
        kparams.add("privileges", privileges);

        return new RequestBuilder<String>(String.class, "user", "login", kparams);
    }

    public static RequestBuilder<String> loginByLoginId(String loginId, String password)  {
        return loginByLoginId(loginId, password, Integer.MIN_VALUE);
    }

    public static RequestBuilder<String> loginByLoginId(String loginId, String password, int partnerId)  {
        return loginByLoginId(loginId, password, partnerId, 86400);
    }

    public static RequestBuilder<String> loginByLoginId(String loginId, String password, int partnerId, int expiry)  {
        return loginByLoginId(loginId, password, partnerId, expiry, "*");
    }

    public static RequestBuilder<String> loginByLoginId(String loginId, String password, int partnerId, int expiry, String privileges)  {
        return loginByLoginId(loginId, password, partnerId, expiry, privileges, null);
    }

	/**  Logs a user into a partner account with a user login ID and a user password.  */
    public static RequestBuilder<String> loginByLoginId(String loginId, String password, int partnerId, int expiry, String privileges, String otp)  {
        Params kparams = new Params();
        kparams.add("loginId", loginId);
        kparams.add("password", password);
        kparams.add("partnerId", partnerId);
        kparams.add("expiry", expiry);
        kparams.add("privileges", privileges);
        kparams.add("otp", otp);

        return new RequestBuilder<String>(String.class, "user", "loginByLoginId", kparams);
    }

	/**  Notifies that a user is banned from an account.  */
    public static RequestBuilder<Void> notifyBan(String userId)  {
        Params kparams = new Params();
        kparams.add("userId", userId);

        return new NullRequestBuilder("user", "notifyBan", kparams);
    }

	/**  Reset user's password and send the user an email to generate a new one.  */
    public static RequestBuilder<Void> resetPassword(String email)  {
        Params kparams = new Params();
        kparams.add("email", email);

        return new NullRequestBuilder("user", "resetPassword", kparams);
    }

	/**  Set initial users password  */
    public static RequestBuilder<Void> setInitialPassword(String hashKey, String newPassword)  {
        Params kparams = new Params();
        kparams.add("hashKey", hashKey);
        kparams.add("newPassword", newPassword);

        return new NullRequestBuilder("user", "setInitialPassword", kparams);
    }

	/**  Updates an existing user object.   You can also use this action to update the
	  userId.  */
    public static RequestBuilder<User> update(String userId, User user)  {
        Params kparams = new Params();
        kparams.add("userId", userId);
        kparams.add("user", user);

        return new RequestBuilder<User>(User.class, "user", "update", kparams);
    }

    public static RequestBuilder<Void> updateLoginData(String oldLoginId, String password)  {
        return updateLoginData(oldLoginId, password, "");
    }

    public static RequestBuilder<Void> updateLoginData(String oldLoginId, String password, String newLoginId)  {
        return updateLoginData(oldLoginId, password, newLoginId, "");
    }

    public static RequestBuilder<Void> updateLoginData(String oldLoginId, String password, String newLoginId, String newPassword)  {
        return updateLoginData(oldLoginId, password, newLoginId, newPassword, null);
    }

    public static RequestBuilder<Void> updateLoginData(String oldLoginId, String password, String newLoginId, String newPassword, String newFirstName)  {
        return updateLoginData(oldLoginId, password, newLoginId, newPassword, newFirstName, null);
    }

	/**  Updates a user's login data: email, password, name.  */
    public static RequestBuilder<Void> updateLoginData(String oldLoginId, String password, String newLoginId, String newPassword, String newFirstName, String newLastName)  {
        Params kparams = new Params();
        kparams.add("oldLoginId", oldLoginId);
        kparams.add("password", password);
        kparams.add("newLoginId", newLoginId);
        kparams.add("newPassword", newPassword);
        kparams.add("newFirstName", newFirstName);
        kparams.add("newLastName", newLastName);

        return new NullRequestBuilder("user", "updateLoginData", kparams);
    }
}
