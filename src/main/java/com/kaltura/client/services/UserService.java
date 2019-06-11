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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.types.Authentication;
import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.BulkUploadJobData;
import com.kaltura.client.types.BulkUploadUserData;
import com.kaltura.client.types.CsvAdditionalFieldInfo;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.SessionResponse;
import com.kaltura.client.types.User;
import com.kaltura.client.types.UserFilter;
import com.kaltura.client.types.UserLoginDataFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Manage partner users on Kaltura's side  The userId in kaltura is the unique ID
  in the partner's system, and the [partnerId,Id] couple are unique key in
  kaltura's DB
 * 
 * @param user The new user
 * @param fileData 
 * @param bulkUploadData 
 * @param bulkUploadUserData 
 * @param filter 
 * @param userId The user's unique identifier in the partner's system
 * @param userId The user's unique identifier in the partner's system
 * @param loginId The user's email address that identifies the user for login
 * @param userId The user's unique identifier in the partner's system
 * @param loginId The user's email address that identifies the user for login
 * @param password The user's password
 * @param filter A filter used to exclude specific types of users
 * @param metadataProfileId 
 * @param additionalFields 
 * @param hashKey 
 * @param userId The user's unique identifier in the partner's system
 * @param loginId The user's email address that identifies the user for login
 * @param id 
 * @param shouldUpdate 
 * @param filter A filter used to exclude specific types of users
 * @param pager A limit for the number of records to display on a page
 * @param partnerId The identifier of the partner account
 * @param userId The user's unique identifier in the partner's system
 * @param password The user's password
 * @param expiry The requested time (in seconds) before the generated KS expires (By default, a
 * KS expires after 24 hours).
 * @param privileges Special privileges
 * @param requestedPartnerId 
 * @param loginId The user's email address that identifies the user for login
 * @param password The user's password
 * @param partnerId The identifier of the partner account
 * @param expiry The requested time (in seconds) before the generated KS expires (By default, a
 * KS expires after 24 hours).
 * @param privileges Special privileges
 * @param otp the user's one-time password
 * @param userId The user's unique identifier in the partner's system
 * @param email The user's email address (login email)
 * @param id - the requested file id
 * @param hashKey The hash key used to identify the user (retrieved by email)
 * @param newPassword The new password to set for the user
 * @param userId The user's unique identifier in the partner's system
 * @param user Id The user's unique identifier in the partner's system
 * @param oldLoginId The user's current email address that identified the user for login
 * @param password The user's current email address that identified the user for login
 * @param newLoginId Optional, The user's email address that will identify the user for login
 * @param newPassword Optional, The user's new password
 * @param newFirstName Optional, The user's new first name
 * @param newLastName Optional, The user's new last name
 */
public class UserService {
	
	public static class AddUserBuilder extends RequestBuilder<User, User.Tokenizer, AddUserBuilder> {
		
		public AddUserBuilder(User user) {
			super(User.class, "user", "add");
			params.add("user", user);
		}
	}

	/**
	 * Adds a new user to an existing account in the Kaltura database.   Input param
	  $id is the unique identifier in the partner's system.
	 * 
	 * @param user The new user
	 */
    public static AddUserBuilder add(User user)  {
		return new AddUserBuilder(user);
	}
	
	public static class AddFromBulkUploadUserBuilder extends RequestBuilder<BulkUpload, BulkUpload.Tokenizer, AddFromBulkUploadUserBuilder> {
		
		public AddFromBulkUploadUserBuilder(FileHolder fileData, BulkUploadJobData bulkUploadData, BulkUploadUserData bulkUploadUserData) {
			super(BulkUpload.class, "user", "addFromBulkUpload");
			files = new Files();
			files.add("fileData", fileData);
			params.add("bulkUploadData", bulkUploadData);
			params.add("bulkUploadUserData", bulkUploadUserData);
		}
	}

	public static AddFromBulkUploadUserBuilder addFromBulkUpload(FileHolder fileData)  {
		return addFromBulkUpload(fileData, null);
	}

	public static AddFromBulkUploadUserBuilder addFromBulkUpload(File fileData)  {
		return addFromBulkUpload(new FileHolder(fileData), null);
	}

	public static AddFromBulkUploadUserBuilder addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), null);
	}

	public static AddFromBulkUploadUserBuilder addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), null);
	}

	public static AddFromBulkUploadUserBuilder addFromBulkUpload(FileHolder fileData, BulkUploadJobData bulkUploadData)  {
		return addFromBulkUpload(fileData, bulkUploadData, null);
	}

	public static AddFromBulkUploadUserBuilder addFromBulkUpload(File fileData, BulkUploadJobData bulkUploadData)  {
		return addFromBulkUpload(new FileHolder(fileData), bulkUploadData, null);
	}

	public static AddFromBulkUploadUserBuilder addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, null);
	}

	public static AddFromBulkUploadUserBuilder addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, null);
	}

	public static AddFromBulkUploadUserBuilder addFromBulkUpload(File fileData, BulkUploadJobData bulkUploadData, BulkUploadUserData bulkUploadUserData)  {
		return addFromBulkUpload(new FileHolder(fileData), bulkUploadData, bulkUploadUserData);
	}

	public static AddFromBulkUploadUserBuilder addFromBulkUpload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData, BulkUploadUserData bulkUploadUserData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, bulkUploadUserData);
	}

	public static AddFromBulkUploadUserBuilder addFromBulkUpload(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData, BulkUploadUserData bulkUploadUserData)  {
		return addFromBulkUpload(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, bulkUploadUserData);
	}

    public static AddFromBulkUploadUserBuilder addFromBulkUpload(FileHolder fileData, BulkUploadJobData bulkUploadData, BulkUploadUserData bulkUploadUserData)  {
		return new AddFromBulkUploadUserBuilder(fileData, bulkUploadData, bulkUploadUserData);
	}
	
	public static class CheckLoginDataExistsUserBuilder extends RequestBuilder<Boolean, String, CheckLoginDataExistsUserBuilder> {
		
		public CheckLoginDataExistsUserBuilder(UserLoginDataFilter filter) {
			super(Boolean.class, "user", "checkLoginDataExists");
			params.add("filter", filter);
		}
	}

	/**
	 * Action which checks whther user login
	 * 
	 * @param filter 
	 */
    public static CheckLoginDataExistsUserBuilder checkLoginDataExists(UserLoginDataFilter filter)  {
		return new CheckLoginDataExistsUserBuilder(filter);
	}
	
	public static class DeleteUserBuilder extends RequestBuilder<User, User.Tokenizer, DeleteUserBuilder> {
		
		public DeleteUserBuilder(String userId) {
			super(User.class, "user", "delete");
			params.add("userId", userId);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
	}

	/**
	 * Deletes a user from a partner account.
	 * 
	 * @param userId The user's unique identifier in the partner's system
	 */
    public static DeleteUserBuilder delete(String userId)  {
		return new DeleteUserBuilder(userId);
	}
	
	public static class DisableLoginUserBuilder extends RequestBuilder<User, User.Tokenizer, DisableLoginUserBuilder> {
		
		public DisableLoginUserBuilder(String userId, String loginId) {
			super(User.class, "user", "disableLogin");
			params.add("userId", userId);
			params.add("loginId", loginId);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
		
		public void loginId(String multirequestToken) {
			params.add("loginId", multirequestToken);
		}
	}

	public static DisableLoginUserBuilder disableLogin()  {
		return disableLogin(null);
	}

	public static DisableLoginUserBuilder disableLogin(String userId)  {
		return disableLogin(userId, null);
	}

	/**
	 * Disables a user's ability to log into a partner account using an email address
	  and a password.   You may use either a userId or a loginId parameter for this
	  action.
	 * 
	 * @param userId The user's unique identifier in the partner's system
	 * @param loginId The user's email address that identifies the user for login
	 */
    public static DisableLoginUserBuilder disableLogin(String userId, String loginId)  {
		return new DisableLoginUserBuilder(userId, loginId);
	}
	
	public static class EnableLoginUserBuilder extends RequestBuilder<User, User.Tokenizer, EnableLoginUserBuilder> {
		
		public EnableLoginUserBuilder(String userId, String loginId, String password) {
			super(User.class, "user", "enableLogin");
			params.add("userId", userId);
			params.add("loginId", loginId);
			params.add("password", password);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
		
		public void loginId(String multirequestToken) {
			params.add("loginId", multirequestToken);
		}
		
		public void password(String multirequestToken) {
			params.add("password", multirequestToken);
		}
	}

	public static EnableLoginUserBuilder enableLogin(String userId, String loginId)  {
		return enableLogin(userId, loginId, null);
	}

	/**
	 * Enables a user to log into a partner account using an email address and a
	  password
	 * 
	 * @param userId The user's unique identifier in the partner's system
	 * @param loginId The user's email address that identifies the user for login
	 * @param password The user's password
	 */
    public static EnableLoginUserBuilder enableLogin(String userId, String loginId, String password)  {
		return new EnableLoginUserBuilder(userId, loginId, password);
	}
	
	public static class ExportToCsvUserBuilder extends RequestBuilder<String, String, ExportToCsvUserBuilder> {
		
		public ExportToCsvUserBuilder(UserFilter filter, int metadataProfileId, List<CsvAdditionalFieldInfo> additionalFields) {
			super(String.class, "user", "exportToCsv");
			params.add("filter", filter);
			params.add("metadataProfileId", metadataProfileId);
			params.add("additionalFields", additionalFields);
		}
		
		public void metadataProfileId(String multirequestToken) {
			params.add("metadataProfileId", multirequestToken);
		}
	}

	public static ExportToCsvUserBuilder exportToCsv()  {
		return exportToCsv(null);
	}

	public static ExportToCsvUserBuilder exportToCsv(UserFilter filter)  {
		return exportToCsv(filter, Integer.MIN_VALUE);
	}

	public static ExportToCsvUserBuilder exportToCsv(UserFilter filter, int metadataProfileId)  {
		return exportToCsv(filter, metadataProfileId, null);
	}

	/**
	 * Creates a batch job that sends an email with a link to download a CSV containing
	  a list of users
	 * 
	 * @param filter A filter used to exclude specific types of users
	 * @param metadataProfileId 
	 * @param additionalFields 
	 */
    public static ExportToCsvUserBuilder exportToCsv(UserFilter filter, int metadataProfileId, List<CsvAdditionalFieldInfo> additionalFields)  {
		return new ExportToCsvUserBuilder(filter, metadataProfileId, additionalFields);
	}
	
	public static class GenerateQrCodeUserBuilder extends RequestBuilder<String, String, GenerateQrCodeUserBuilder> {
		
		public GenerateQrCodeUserBuilder(String hashKey) {
			super(String.class, "user", "generateQrCode");
			params.add("hashKey", hashKey);
		}
		
		public void hashKey(String multirequestToken) {
			params.add("hashKey", multirequestToken);
		}
	}

	/**
	 * get QR image content
	 * 
	 * @param hashKey 
	 */
    public static GenerateQrCodeUserBuilder generateQrCode(String hashKey)  {
		return new GenerateQrCodeUserBuilder(hashKey);
	}
	
	public static class GetUserBuilder extends RequestBuilder<User, User.Tokenizer, GetUserBuilder> {
		
		public GetUserBuilder(String userId) {
			super(User.class, "user", "get");
			params.add("userId", userId);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
	}

	public static GetUserBuilder get()  {
		return get(null);
	}

	/**
	 * Retrieves a user object for a specified user ID.
	 * 
	 * @param userId The user's unique identifier in the partner's system
	 */
    public static GetUserBuilder get(String userId)  {
		return new GetUserBuilder(userId);
	}
	
	public static class GetByLoginIdUserBuilder extends RequestBuilder<User, User.Tokenizer, GetByLoginIdUserBuilder> {
		
		public GetByLoginIdUserBuilder(String loginId) {
			super(User.class, "user", "getByLoginId");
			params.add("loginId", loginId);
		}
		
		public void loginId(String multirequestToken) {
			params.add("loginId", multirequestToken);
		}
	}

	/**
	 * Retrieves a user object for a user's login ID and partner ID.   A login ID is
	  the email address used by a user to log into the system.
	 * 
	 * @param loginId The user's email address that identifies the user for login
	 */
    public static GetByLoginIdUserBuilder getByLoginId(String loginId)  {
		return new GetByLoginIdUserBuilder(loginId);
	}
	
	public static class IndexUserBuilder extends RequestBuilder<String, String, IndexUserBuilder> {
		
		public IndexUserBuilder(String id, boolean shouldUpdate) {
			super(String.class, "user", "index");
			params.add("id", id);
			params.add("shouldUpdate", shouldUpdate);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void shouldUpdate(String multirequestToken) {
			params.add("shouldUpdate", multirequestToken);
		}
	}

	public static IndexUserBuilder index(String id)  {
		return index(id, true);
	}

	/**
	 * Index an entry by id.
	 * 
	 * @param id 
	 * @param shouldUpdate 
	 */
    public static IndexUserBuilder index(String id, boolean shouldUpdate)  {
		return new IndexUserBuilder(id, shouldUpdate);
	}
	
	public static class ListUserBuilder extends ListResponseRequestBuilder<User, User.Tokenizer, ListUserBuilder> {
		
		public ListUserBuilder(UserFilter filter, FilterPager pager) {
			super(User.class, "user", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListUserBuilder list()  {
		return list(null);
	}

	public static ListUserBuilder list(UserFilter filter)  {
		return list(filter, null);
	}

	/**
	 * Lists user objects that are associated with an account.   Blocked users are
	  listed unless you use a filter to exclude them.   Deleted users are not listed
	  unless you use a filter to include them.
	 * 
	 * @param filter A filter used to exclude specific types of users
	 * @param pager A limit for the number of records to display on a page
	 */
    public static ListUserBuilder list(UserFilter filter, FilterPager pager)  {
		return new ListUserBuilder(filter, pager);
	}
	
	public static class LoginUserBuilder extends RequestBuilder<String, String, LoginUserBuilder> {
		
		public LoginUserBuilder(int partnerId, String userId, String password, int expiry, String privileges) {
			super(String.class, "user", "login");
			params.add("partnerId", partnerId);
			params.add("userId", userId);
			params.add("password", password);
			params.add("expiry", expiry);
			params.add("privileges", privileges);
		}
		
		public void partnerId(String multirequestToken) {
			params.add("partnerId", multirequestToken);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
		
		public void password(String multirequestToken) {
			params.add("password", multirequestToken);
		}
		
		public void expiry(String multirequestToken) {
			params.add("expiry", multirequestToken);
		}
		
		public void privileges(String multirequestToken) {
			params.add("privileges", multirequestToken);
		}
	}

	public static LoginUserBuilder login(int partnerId, String userId, String password)  {
		return login(partnerId, userId, password, 86400);
	}

	public static LoginUserBuilder login(int partnerId, String userId, String password, int expiry)  {
		return login(partnerId, userId, password, expiry, "*");
	}

	/**
	 * Logs a user into a partner account with a partner ID, a partner user ID (puser),
	  and a user password.
	 * 
	 * @param partnerId The identifier of the partner account
	 * @param userId The user's unique identifier in the partner's system
	 * @param password The user's password
	 * @param expiry The requested time (in seconds) before the generated KS expires (By default, a
	 * KS expires after 24 hours).
	 * @param privileges Special privileges
	 */
    public static LoginUserBuilder login(int partnerId, String userId, String password, int expiry, String privileges)  {
		return new LoginUserBuilder(partnerId, userId, password, expiry, privileges);
	}
	
	public static class LoginByKsUserBuilder extends RequestBuilder<SessionResponse, SessionResponse.Tokenizer, LoginByKsUserBuilder> {
		
		public LoginByKsUserBuilder(int requestedPartnerId) {
			super(SessionResponse.class, "user", "loginByKs");
			params.add("requestedPartnerId", requestedPartnerId);
		}
		
		public void requestedPartnerId(String multirequestToken) {
			params.add("requestedPartnerId", multirequestToken);
		}
	}

	/**
	 * Logs a user to the destination account provided the KS' user ID is associated
	  with the destination account and the loginData ID matches
	 * 
	 * @param requestedPartnerId 
	 */
    public static LoginByKsUserBuilder loginByKs(int requestedPartnerId)  {
		return new LoginByKsUserBuilder(requestedPartnerId);
	}
	
	public static class LoginByLoginIdUserBuilder extends RequestBuilder<String, String, LoginByLoginIdUserBuilder> {
		
		public LoginByLoginIdUserBuilder(String loginId, String password, int partnerId, int expiry, String privileges, String otp) {
			super(String.class, "user", "loginByLoginId");
			params.add("loginId", loginId);
			params.add("password", password);
			params.add("partnerId", partnerId);
			params.add("expiry", expiry);
			params.add("privileges", privileges);
			params.add("otp", otp);
		}
		
		public void loginId(String multirequestToken) {
			params.add("loginId", multirequestToken);
		}
		
		public void password(String multirequestToken) {
			params.add("password", multirequestToken);
		}
		
		public void partnerId(String multirequestToken) {
			params.add("partnerId", multirequestToken);
		}
		
		public void expiry(String multirequestToken) {
			params.add("expiry", multirequestToken);
		}
		
		public void privileges(String multirequestToken) {
			params.add("privileges", multirequestToken);
		}
		
		public void otp(String multirequestToken) {
			params.add("otp", multirequestToken);
		}
	}

	public static LoginByLoginIdUserBuilder loginByLoginId(String loginId, String password)  {
		return loginByLoginId(loginId, password, Integer.MIN_VALUE);
	}

	public static LoginByLoginIdUserBuilder loginByLoginId(String loginId, String password, int partnerId)  {
		return loginByLoginId(loginId, password, partnerId, 86400);
	}

	public static LoginByLoginIdUserBuilder loginByLoginId(String loginId, String password, int partnerId, int expiry)  {
		return loginByLoginId(loginId, password, partnerId, expiry, "*");
	}

	public static LoginByLoginIdUserBuilder loginByLoginId(String loginId, String password, int partnerId, int expiry, String privileges)  {
		return loginByLoginId(loginId, password, partnerId, expiry, privileges, null);
	}

	/**
	 * Logs a user into a partner account with a user login ID and a user password.
	 * 
	 * @param loginId The user's email address that identifies the user for login
	 * @param password The user's password
	 * @param partnerId The identifier of the partner account
	 * @param expiry The requested time (in seconds) before the generated KS expires (By default, a
	 * KS expires after 24 hours).
	 * @param privileges Special privileges
	 * @param otp the user's one-time password
	 */
    public static LoginByLoginIdUserBuilder loginByLoginId(String loginId, String password, int partnerId, int expiry, String privileges, String otp)  {
		return new LoginByLoginIdUserBuilder(loginId, password, partnerId, expiry, privileges, otp);
	}
	
	public static class NotifyBanUserBuilder extends NullRequestBuilder {
		
		public NotifyBanUserBuilder(String userId) {
			super("user", "notifyBan");
			params.add("userId", userId);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
	}

	/**
	 * Notifies that a user is banned from an account.
	 * 
	 * @param userId The user's unique identifier in the partner's system
	 */
    public static NotifyBanUserBuilder notifyBan(String userId)  {
		return new NotifyBanUserBuilder(userId);
	}
	
	public static class ResetPasswordUserBuilder extends NullRequestBuilder {
		
		public ResetPasswordUserBuilder(String email) {
			super("user", "resetPassword");
			params.add("email", email);
		}
		
		public void email(String multirequestToken) {
			params.add("email", multirequestToken);
		}
	}

	/**
	 * Reset user's password and send the user an email to generate a new one.
	 * 
	 * @param email The user's email address (login email)
	 */
    public static ResetPasswordUserBuilder resetPassword(String email)  {
		return new ResetPasswordUserBuilder(email);
	}
	
	public static class ServeCsvUserBuilder extends RequestBuilder<String, String, ServeCsvUserBuilder> {
		
		public ServeCsvUserBuilder(String id) {
			super(String.class, "user", "serveCsv");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Will serve a requested CSV
	 * 
	 * @param id - the requested file id
	 */
    public static ServeCsvUserBuilder serveCsv(String id)  {
		return new ServeCsvUserBuilder(id);
	}
	
	public static class SetInitialPasswordUserBuilder extends RequestBuilder<Authentication, Authentication.Tokenizer, SetInitialPasswordUserBuilder> {
		
		public SetInitialPasswordUserBuilder(String hashKey, String newPassword) {
			super(Authentication.class, "user", "setInitialPassword");
			params.add("hashKey", hashKey);
			params.add("newPassword", newPassword);
		}
		
		public void hashKey(String multirequestToken) {
			params.add("hashKey", multirequestToken);
		}
		
		public void newPassword(String multirequestToken) {
			params.add("newPassword", multirequestToken);
		}
	}

	/**
	 * Set initial user password
	 * 
	 * @param hashKey The hash key used to identify the user (retrieved by email)
	 * @param newPassword The new password to set for the user
	 */
    public static SetInitialPasswordUserBuilder setInitialPassword(String hashKey, String newPassword)  {
		return new SetInitialPasswordUserBuilder(hashKey, newPassword);
	}
	
	public static class UpdateUserBuilder extends RequestBuilder<User, User.Tokenizer, UpdateUserBuilder> {
		
		public UpdateUserBuilder(String userId, User user) {
			super(User.class, "user", "update");
			params.add("userId", userId);
			params.add("user", user);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
	}

	/**
	 * Updates an existing user object.   You can also use this action to update the
	  userId.
	 * 
	 * @param userId The user's unique identifier in the partner's system
	 * @param user Id The user's unique identifier in the partner's system
	 */
    public static UpdateUserBuilder update(String userId, User user)  {
		return new UpdateUserBuilder(userId, user);
	}
	
	public static class UpdateLoginDataUserBuilder extends NullRequestBuilder {
		
		public UpdateLoginDataUserBuilder(String oldLoginId, String password, String newLoginId, String newPassword, String newFirstName, String newLastName) {
			super("user", "updateLoginData");
			params.add("oldLoginId", oldLoginId);
			params.add("password", password);
			params.add("newLoginId", newLoginId);
			params.add("newPassword", newPassword);
			params.add("newFirstName", newFirstName);
			params.add("newLastName", newLastName);
		}
		
		public void oldLoginId(String multirequestToken) {
			params.add("oldLoginId", multirequestToken);
		}
		
		public void password(String multirequestToken) {
			params.add("password", multirequestToken);
		}
		
		public void newLoginId(String multirequestToken) {
			params.add("newLoginId", multirequestToken);
		}
		
		public void newPassword(String multirequestToken) {
			params.add("newPassword", multirequestToken);
		}
		
		public void newFirstName(String multirequestToken) {
			params.add("newFirstName", multirequestToken);
		}
		
		public void newLastName(String multirequestToken) {
			params.add("newLastName", multirequestToken);
		}
	}

	public static UpdateLoginDataUserBuilder updateLoginData(String oldLoginId, String password)  {
		return updateLoginData(oldLoginId, password, "");
	}

	public static UpdateLoginDataUserBuilder updateLoginData(String oldLoginId, String password, String newLoginId)  {
		return updateLoginData(oldLoginId, password, newLoginId, "");
	}

	public static UpdateLoginDataUserBuilder updateLoginData(String oldLoginId, String password, String newLoginId, String newPassword)  {
		return updateLoginData(oldLoginId, password, newLoginId, newPassword, null);
	}

	public static UpdateLoginDataUserBuilder updateLoginData(String oldLoginId, String password, String newLoginId, String newPassword, String newFirstName)  {
		return updateLoginData(oldLoginId, password, newLoginId, newPassword, newFirstName, null);
	}

	/**
	 * Updates a user's login data: email, password, name.
	 * 
	 * @param oldLoginId The user's current email address that identified the user for login
	 * @param password The user's current email address that identified the user for login
	 * @param newLoginId Optional, The user's email address that will identify the user for login
	 * @param newPassword Optional, The user's new password
	 * @param newFirstName Optional, The user's new first name
	 * @param newLastName Optional, The user's new last name
	 */
    public static UpdateLoginDataUserBuilder updateLoginData(String oldLoginId, String password, String newLoginId, String newPassword, String newFirstName, String newLastName)  {
		return new UpdateLoginDataUserBuilder(oldLoginId, password, newLoginId, newPassword, newFirstName, newLastName);
	}
}
