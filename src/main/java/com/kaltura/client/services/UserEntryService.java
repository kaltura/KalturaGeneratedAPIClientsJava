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
// Copyright (C) 2006-2021  Kaltura Inc.
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

import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.QuizUserEntry;
import com.kaltura.client.types.UserEntry;
import com.kaltura.client.types.UserEntryFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class UserEntryService {
	
	public static class AddUserEntryBuilder extends RequestBuilder<UserEntry, UserEntry.Tokenizer, AddUserEntryBuilder> {
		
		public AddUserEntryBuilder(UserEntry userEntry) {
			super(UserEntry.class, "userentry", "add");
			params.add("userEntry", userEntry);
		}
	}

	/**
	 * Adds a user_entry to the Kaltura DB.
	 * 
	 * @param userEntry 
	 */
    public static AddUserEntryBuilder add(UserEntry userEntry)  {
		return new AddUserEntryBuilder(userEntry);
	}
	
	public static class BulkDeleteUserEntryBuilder extends RequestBuilder<Integer, String, BulkDeleteUserEntryBuilder> {
		
		public BulkDeleteUserEntryBuilder(UserEntryFilter filter) {
			super(Integer.class, "userentry", "bulkDelete");
			params.add("filter", filter);
		}
	}

    public static BulkDeleteUserEntryBuilder bulkDelete(UserEntryFilter filter)  {
		return new BulkDeleteUserEntryBuilder(filter);
	}
	
	public static class DeleteUserEntryBuilder extends RequestBuilder<UserEntry, UserEntry.Tokenizer, DeleteUserEntryBuilder> {
		
		public DeleteUserEntryBuilder(int id) {
			super(UserEntry.class, "userentry", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

    public static DeleteUserEntryBuilder delete(int id)  {
		return new DeleteUserEntryBuilder(id);
	}
	
	public static class GetUserEntryBuilder extends RequestBuilder<UserEntry, UserEntry.Tokenizer, GetUserEntryBuilder> {
		
		public GetUserEntryBuilder(String id) {
			super(UserEntry.class, "userentry", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

    public static GetUserEntryBuilder get(String id)  {
		return new GetUserEntryBuilder(id);
	}
	
	public static class ListUserEntryBuilder extends ListResponseRequestBuilder<UserEntry, UserEntry.Tokenizer, ListUserEntryBuilder> {
		
		public ListUserEntryBuilder(UserEntryFilter filter, FilterPager pager) {
			super(UserEntry.class, "userentry", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListUserEntryBuilder list()  {
		return list(null);
	}

	public static ListUserEntryBuilder list(UserEntryFilter filter)  {
		return list(filter, null);
	}

    public static ListUserEntryBuilder list(UserEntryFilter filter, FilterPager pager)  {
		return new ListUserEntryBuilder(filter, pager);
	}
	
	public static class SubmitQuizUserEntryBuilder extends RequestBuilder<QuizUserEntry, QuizUserEntry.Tokenizer, SubmitQuizUserEntryBuilder> {
		
		public SubmitQuizUserEntryBuilder(int id) {
			super(QuizUserEntry.class, "userentry", "submitQuiz");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Submits the quiz so that it's status will be submitted and calculates the score
	  for the quiz
	 * 
	 * @param id 
	 */
    public static SubmitQuizUserEntryBuilder submitQuiz(int id)  {
		return new SubmitQuizUserEntryBuilder(id);
	}
	
	public static class UpdateUserEntryBuilder extends RequestBuilder<UserEntry, UserEntry.Tokenizer, UpdateUserEntryBuilder> {
		
		public UpdateUserEntryBuilder(int id, UserEntry userEntry) {
			super(UserEntry.class, "userentry", "update");
			params.add("id", id);
			params.add("userEntry", userEntry);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

    public static UpdateUserEntryBuilder update(int id, UserEntry userEntry)  {
		return new UpdateUserEntryBuilder(id, userEntry);
	}
}
