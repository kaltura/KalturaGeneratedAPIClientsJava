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

import com.kaltura.client.types.EmailIngestionProfile;
import com.kaltura.client.types.MediaEntry;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  EmailIngestionProfile service lets you manage email ingestion profile records  */
public class EmailIngestionProfileService {
	
	public static class AddEmailIngestionProfileBuilder extends RequestBuilder<EmailIngestionProfile, EmailIngestionProfile.Tokenizer, AddEmailIngestionProfileBuilder> {
		
		public AddEmailIngestionProfileBuilder(EmailIngestionProfile EmailIP) {
			super(EmailIngestionProfile.class, "emailingestionprofile", "add");
			params.add("EmailIP", EmailIP);
		}
	}

	/**  EmailIngestionProfile Add action allows you to add a EmailIngestionProfile to
	  Kaltura DB  */
    public static AddEmailIngestionProfileBuilder add(EmailIngestionProfile EmailIP)  {
		return new AddEmailIngestionProfileBuilder(EmailIP);
	}
	
	public static class AddMediaEntryEmailIngestionProfileBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, AddMediaEntryEmailIngestionProfileBuilder> {
		
		public AddMediaEntryEmailIngestionProfileBuilder(MediaEntry mediaEntry, String uploadTokenId, int emailProfId, String fromAddress, String emailMsgId) {
			super(MediaEntry.class, "emailingestionprofile", "addMediaEntry");
			params.add("mediaEntry", mediaEntry);
			params.add("uploadTokenId", uploadTokenId);
			params.add("emailProfId", emailProfId);
			params.add("fromAddress", fromAddress);
			params.add("emailMsgId", emailMsgId);
		}
		
		public void uploadTokenId(String multirequestToken) {
			params.add("uploadTokenId", multirequestToken);
		}
		
		public void emailProfId(String multirequestToken) {
			params.add("emailProfId", multirequestToken);
		}
		
		public void fromAddress(String multirequestToken) {
			params.add("fromAddress", multirequestToken);
		}
		
		public void emailMsgId(String multirequestToken) {
			params.add("emailMsgId", multirequestToken);
		}
	}

	/**  add KalturaMediaEntry from email ingestion  */
    public static AddMediaEntryEmailIngestionProfileBuilder addMediaEntry(MediaEntry mediaEntry, String uploadTokenId, int emailProfId, String fromAddress, String emailMsgId)  {
		return new AddMediaEntryEmailIngestionProfileBuilder(mediaEntry, uploadTokenId, emailProfId, fromAddress, emailMsgId);
	}
	
	public static class DeleteEmailIngestionProfileBuilder extends NullRequestBuilder {
		
		public DeleteEmailIngestionProfileBuilder(int id) {
			super("emailingestionprofile", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Delete an existing EmailIngestionProfile  */
    public static DeleteEmailIngestionProfileBuilder delete(int id)  {
		return new DeleteEmailIngestionProfileBuilder(id);
	}
	
	public static class GetEmailIngestionProfileBuilder extends RequestBuilder<EmailIngestionProfile, EmailIngestionProfile.Tokenizer, GetEmailIngestionProfileBuilder> {
		
		public GetEmailIngestionProfileBuilder(int id) {
			super(EmailIngestionProfile.class, "emailingestionprofile", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Retrieve a EmailIngestionProfile by id  */
    public static GetEmailIngestionProfileBuilder get(int id)  {
		return new GetEmailIngestionProfileBuilder(id);
	}
	
	public static class GetByEmailAddressEmailIngestionProfileBuilder extends RequestBuilder<EmailIngestionProfile, EmailIngestionProfile.Tokenizer, GetByEmailAddressEmailIngestionProfileBuilder> {
		
		public GetByEmailAddressEmailIngestionProfileBuilder(String emailAddress) {
			super(EmailIngestionProfile.class, "emailingestionprofile", "getByEmailAddress");
			params.add("emailAddress", emailAddress);
		}
		
		public void emailAddress(String multirequestToken) {
			params.add("emailAddress", multirequestToken);
		}
	}

	/**  Retrieve a EmailIngestionProfile by email address  */
    public static GetByEmailAddressEmailIngestionProfileBuilder getByEmailAddress(String emailAddress)  {
		return new GetByEmailAddressEmailIngestionProfileBuilder(emailAddress);
	}
	
	public static class UpdateEmailIngestionProfileBuilder extends RequestBuilder<EmailIngestionProfile, EmailIngestionProfile.Tokenizer, UpdateEmailIngestionProfileBuilder> {
		
		public UpdateEmailIngestionProfileBuilder(int id, EmailIngestionProfile EmailIP) {
			super(EmailIngestionProfile.class, "emailingestionprofile", "update");
			params.add("id", id);
			params.add("EmailIP", EmailIP);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Update an existing EmailIngestionProfile  */
    public static UpdateEmailIngestionProfileBuilder update(int id, EmailIngestionProfile EmailIP)  {
		return new UpdateEmailIngestionProfileBuilder(id, EmailIP);
	}
}
