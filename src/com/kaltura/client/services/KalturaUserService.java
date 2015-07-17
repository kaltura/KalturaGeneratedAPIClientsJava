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
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.kaltura.client.KalturaFiles;
import com.kaltura.client.KalturaFile;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Fri, 17 Jul 15 08:34:46 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Manage partner users on Kaltura's side  The userId in kaltura is the unique Id
  in the partner's system, and the [partnerId,Id] couple are unique key in
  kaltura's DB    */
@SuppressWarnings("serial")
public class KalturaUserService extends KalturaServiceBase {
    public KalturaUserService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Adds a new user to an existing account in the Kaltura database.   Input param
	  $id is the unique identifier in the partner's system.     */
    public KalturaUser add(KalturaUser user) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("user", user);
        this.kalturaClient.queueServiceCall("user", "add", kparams, KalturaUser.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUser.class, resultXmlElement);
    }

	/**  Updates an existing user object.   You can also use this action to update the
	  userId.     */
    public KalturaUser update(String userId, KalturaUser user) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("userId", userId);
        kparams.add("user", user);
        this.kalturaClient.queueServiceCall("user", "update", kparams, KalturaUser.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUser.class, resultXmlElement);
    }

    public KalturaUser get() throws KalturaApiException {
        return this.get(null);
    }

	/**  Retrieves a user object for a specified user ID.     */
    public KalturaUser get(String userId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("userId", userId);
        this.kalturaClient.queueServiceCall("user", "get", kparams, KalturaUser.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUser.class, resultXmlElement);
    }

	/**  Retrieves a user object for a user's login ID and partner ID.   A login ID is
	  the email address used by a user to log into the system.     */
    public KalturaUser getByLoginId(String loginId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("loginId", loginId);
        this.kalturaClient.queueServiceCall("user", "getByLoginId", kparams, KalturaUser.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUser.class, resultXmlElement);
    }

	/**  Deletes a user from a partner account.     */
    public KalturaUser delete(String userId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("userId", userId);
        this.kalturaClient.queueServiceCall("user", "delete", kparams, KalturaUser.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUser.class, resultXmlElement);
    }

    public KalturaUserListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaUserListResponse list(KalturaUserFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  Lists user objects that are associated with an account.   Blocked users are
	  listed unless you use a filter to exclude them.   Deleted users are not listed
	  unless you use a filter to include them.     */
    public KalturaUserListResponse list(KalturaUserFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("user", "list", kparams, KalturaUserListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUserListResponse.class, resultXmlElement);
    }

	/**  Notifies that a user is banned from an account.     */
    public void notifyBan(String userId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("userId", userId);
        this.kalturaClient.queueServiceCall("user", "notifyBan", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public String login(int partnerId, String userId, String password) throws KalturaApiException {
        return this.login(partnerId, userId, password, 86400);
    }

    public String login(int partnerId, String userId, String password, int expiry) throws KalturaApiException {
        return this.login(partnerId, userId, password, expiry, "*");
    }

	/**  Logs a user into a partner account with a partner ID, a partner user ID (puser),
	  and a user password.     */
    public String login(int partnerId, String userId, String password, int expiry, String privileges) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("partnerId", partnerId);
        kparams.add("userId", userId);
        kparams.add("password", password);
        kparams.add("expiry", expiry);
        kparams.add("privileges", privileges);
        this.kalturaClient.queueServiceCall("user", "login", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public String loginByLoginId(String loginId, String password) throws KalturaApiException {
        return this.loginByLoginId(loginId, password, Integer.MIN_VALUE);
    }

    public String loginByLoginId(String loginId, String password, int partnerId) throws KalturaApiException {
        return this.loginByLoginId(loginId, password, partnerId, 86400);
    }

    public String loginByLoginId(String loginId, String password, int partnerId, int expiry) throws KalturaApiException {
        return this.loginByLoginId(loginId, password, partnerId, expiry, "*");
    }

	/**  Logs a user into a partner account with a user login ID and a user password.     */
    public String loginByLoginId(String loginId, String password, int partnerId, int expiry, String privileges) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("loginId", loginId);
        kparams.add("password", password);
        kparams.add("partnerId", partnerId);
        kparams.add("expiry", expiry);
        kparams.add("privileges", privileges);
        this.kalturaClient.queueServiceCall("user", "loginByLoginId", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public void updateLoginData(String oldLoginId, String password) throws KalturaApiException {
        this.updateLoginData(oldLoginId, password, "");
    }

    public void updateLoginData(String oldLoginId, String password, String newLoginId) throws KalturaApiException {
        this.updateLoginData(oldLoginId, password, newLoginId, "");
    }

    public void updateLoginData(String oldLoginId, String password, String newLoginId, String newPassword) throws KalturaApiException {
        this.updateLoginData(oldLoginId, password, newLoginId, newPassword, null);
    }

    public void updateLoginData(String oldLoginId, String password, String newLoginId, String newPassword, String newFirstName) throws KalturaApiException {
        this.updateLoginData(oldLoginId, password, newLoginId, newPassword, newFirstName, null);
    }

	/**  Updates a user's login data: email, password, name.     */
    public void updateLoginData(String oldLoginId, String password, String newLoginId, String newPassword, String newFirstName, String newLastName) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("oldLoginId", oldLoginId);
        kparams.add("password", password);
        kparams.add("newLoginId", newLoginId);
        kparams.add("newPassword", newPassword);
        kparams.add("newFirstName", newFirstName);
        kparams.add("newLastName", newLastName);
        this.kalturaClient.queueServiceCall("user", "updateLoginData", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

	/**  Reset user's password and send the user an email to generate a new one.     */
    public void resetPassword(String email) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("email", email);
        this.kalturaClient.queueServiceCall("user", "resetPassword", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

	/**  Set initial users password     */
    public void setInitialPassword(String hashKey, String newPassword) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("hashKey", hashKey);
        kparams.add("newPassword", newPassword);
        this.kalturaClient.queueServiceCall("user", "setInitialPassword", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaUser enableLogin(String userId, String loginId) throws KalturaApiException {
        return this.enableLogin(userId, loginId, null);
    }

	/**  Enables a user to log into a partner account using an email address and a
	  password     */
    public KalturaUser enableLogin(String userId, String loginId, String password) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("userId", userId);
        kparams.add("loginId", loginId);
        kparams.add("password", password);
        this.kalturaClient.queueServiceCall("user", "enableLogin", kparams, KalturaUser.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUser.class, resultXmlElement);
    }

    public KalturaUser disableLogin() throws KalturaApiException {
        return this.disableLogin(null);
    }

    public KalturaUser disableLogin(String userId) throws KalturaApiException {
        return this.disableLogin(userId, null);
    }

	/**  Disables a user's ability to log into a partner account using an email address
	  and a password.   You may use either a userId or a loginId parameter for this
	  action.     */
    public KalturaUser disableLogin(String userId, String loginId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("userId", userId);
        kparams.add("loginId", loginId);
        this.kalturaClient.queueServiceCall("user", "disableLogin", kparams, KalturaUser.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUser.class, resultXmlElement);
    }

    public String index(String id) throws KalturaApiException {
        return this.index(id, true);
    }

	/**  Index an entry by id.     */
    public String index(String id, boolean shouldUpdate) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("shouldUpdate", shouldUpdate);
        this.kalturaClient.queueServiceCall("user", "index", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public KalturaBulkUpload addFromBulkUpload(KalturaFile fileData) throws KalturaApiException {
        return this.addFromBulkUpload(fileData, null);
    }

    public KalturaBulkUpload addFromBulkUpload(File fileData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData), null);
    }

    public KalturaBulkUpload addFromBulkUpload(InputStream fileData, String fileDataName, long fileDataSize) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData, fileDataName, fileDataSize), null);
    }

    public KalturaBulkUpload addFromBulkUpload(FileInputStream fileData, String fileDataName) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData, fileDataName), null);
    }

    public KalturaBulkUpload addFromBulkUpload(KalturaFile fileData, KalturaBulkUploadJobData bulkUploadData) throws KalturaApiException {
        return this.addFromBulkUpload(fileData, bulkUploadData, null);
    }

    public KalturaBulkUpload addFromBulkUpload(File fileData, KalturaBulkUploadJobData bulkUploadData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData), bulkUploadData, null);
    }

    public KalturaBulkUpload addFromBulkUpload(InputStream fileData, String fileDataName, long fileDataSize, KalturaBulkUploadJobData bulkUploadData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData, fileDataName, fileDataSize), bulkUploadData, null);
    }

    public KalturaBulkUpload addFromBulkUpload(FileInputStream fileData, String fileDataName, KalturaBulkUploadJobData bulkUploadData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData, fileDataName), bulkUploadData, null);
    }

    public KalturaBulkUpload addFromBulkUpload(File fileData, KalturaBulkUploadJobData bulkUploadData, KalturaBulkUploadUserData bulkUploadUserData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData), bulkUploadData, bulkUploadUserData);
    }

    public KalturaBulkUpload addFromBulkUpload(InputStream fileData, String fileDataName, long fileDataSize, KalturaBulkUploadJobData bulkUploadData, KalturaBulkUploadUserData bulkUploadUserData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData, fileDataName, fileDataSize), bulkUploadData, bulkUploadUserData);
    }

    public KalturaBulkUpload addFromBulkUpload(FileInputStream fileData, String fileDataName, KalturaBulkUploadJobData bulkUploadData, KalturaBulkUploadUserData bulkUploadUserData) throws KalturaApiException {
        return this.addFromBulkUpload(new KalturaFile(fileData, fileDataName), bulkUploadData, bulkUploadUserData);
    }

    public KalturaBulkUpload addFromBulkUpload(KalturaFile fileData, KalturaBulkUploadJobData bulkUploadData, KalturaBulkUploadUserData bulkUploadUserData) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        KalturaFiles kfiles = new KalturaFiles();
        kfiles.add("fileData", fileData);
        kparams.add("bulkUploadData", bulkUploadData);
        kparams.add("bulkUploadUserData", bulkUploadUserData);
        this.kalturaClient.queueServiceCall("user", "addFromBulkUpload", kparams, kfiles, KalturaBulkUpload.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaBulkUpload.class, resultXmlElement);
    }

	/**  Action which checks whther user login         */
    public boolean checkLoginDataExists(KalturaUserLoginDataFilter filter) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        this.kalturaClient.queueServiceCall("user", "checkLoginDataExists", kparams);
        if (this.kalturaClient.isMultiRequest())
            return false;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseBool(resultText);
    }
}
