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

import com.kaltura.client.types.AdminUser;
import com.kaltura.client.types.Authentication;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Manage details for the administrative user
 * 
 * @param email 
 * @param password 
 * @param partnerId 
 * @param email 
 * @param hashKey 
 * @param newPassword new password to set
 * @param email 
 * @param password 
 * @param newEmail Optional, provide only when you want to update the email
 * @param newPassword 
 * @param otp the user's one-time password
 */
public class AdminUserService {
	
	public static class LoginAdminUserBuilder extends RequestBuilder<String, String, LoginAdminUserBuilder> {
		
		public LoginAdminUserBuilder(String email, String password, int partnerId) {
			super(String.class, "adminuser", "login");
			params.add("email", email);
			params.add("password", password);
			params.add("partnerId", partnerId);
		}
		
		public void email(String multirequestToken) {
			params.add("email", multirequestToken);
		}
		
		public void password(String multirequestToken) {
			params.add("password", multirequestToken);
		}
		
		public void partnerId(String multirequestToken) {
			params.add("partnerId", multirequestToken);
		}
	}

	public static LoginAdminUserBuilder login(String email, String password)  {
		return login(email, password, Integer.MIN_VALUE);
	}

	/**
	 * Get an admin session using admin email and password (Used for login to the KMC
	  application)
	 * 
	 * @param email 
	 * @param password 
	 * @param partnerId 
	 */
    public static LoginAdminUserBuilder login(String email, String password, int partnerId)  {
		return new LoginAdminUserBuilder(email, password, partnerId);
	}
	
	public static class ResetPasswordAdminUserBuilder extends NullRequestBuilder {
		
		public ResetPasswordAdminUserBuilder(String email) {
			super("adminuser", "resetPassword");
			params.add("email", email);
		}
		
		public void email(String multirequestToken) {
			params.add("email", multirequestToken);
		}
	}

	/**
	 * Reset admin user password and send it to the users email address
	 * 
	 * @param email 
	 */
    public static ResetPasswordAdminUserBuilder resetPassword(String email)  {
		return new ResetPasswordAdminUserBuilder(email);
	}
	
	public static class SetInitialPasswordAdminUserBuilder extends RequestBuilder<Authentication, Authentication.Tokenizer, SetInitialPasswordAdminUserBuilder> {
		
		public SetInitialPasswordAdminUserBuilder(String hashKey, String newPassword) {
			super(Authentication.class, "adminuser", "setInitialPassword");
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
	 * Set initial users password
	 * 
	 * @param hashKey 
	 * @param newPassword new password to set
	 */
    public static SetInitialPasswordAdminUserBuilder setInitialPassword(String hashKey, String newPassword)  {
		return new SetInitialPasswordAdminUserBuilder(hashKey, newPassword);
	}
	
	public static class UpdatePasswordAdminUserBuilder extends RequestBuilder<AdminUser, AdminUser.Tokenizer, UpdatePasswordAdminUserBuilder> {
		
		public UpdatePasswordAdminUserBuilder(String email, String password, String newEmail, String newPassword, String otp) {
			super(AdminUser.class, "adminuser", "updatePassword");
			params.add("email", email);
			params.add("password", password);
			params.add("newEmail", newEmail);
			params.add("newPassword", newPassword);
			params.add("otp", otp);
		}
		
		public void email(String multirequestToken) {
			params.add("email", multirequestToken);
		}
		
		public void password(String multirequestToken) {
			params.add("password", multirequestToken);
		}
		
		public void newEmail(String multirequestToken) {
			params.add("newEmail", multirequestToken);
		}
		
		public void newPassword(String multirequestToken) {
			params.add("newPassword", multirequestToken);
		}
		
		public void otp(String multirequestToken) {
			params.add("otp", multirequestToken);
		}
	}

	public static UpdatePasswordAdminUserBuilder updatePassword(String email, String password)  {
		return updatePassword(email, password, "");
	}

	public static UpdatePasswordAdminUserBuilder updatePassword(String email, String password, String newEmail)  {
		return updatePassword(email, password, newEmail, "");
	}

	public static UpdatePasswordAdminUserBuilder updatePassword(String email, String password, String newEmail, String newPassword)  {
		return updatePassword(email, password, newEmail, newPassword, null);
	}

	/**
	 * Update admin user password and email
	 * 
	 * @param email 
	 * @param password 
	 * @param newEmail Optional, provide only when you want to update the email
	 * @param newPassword 
	 * @param otp the user's one-time password
	 */
    public static UpdatePasswordAdminUserBuilder updatePassword(String email, String password, String newEmail, String newPassword, String otp)  {
		return new UpdatePasswordAdminUserBuilder(email, password, newEmail, newPassword, otp);
	}
}
