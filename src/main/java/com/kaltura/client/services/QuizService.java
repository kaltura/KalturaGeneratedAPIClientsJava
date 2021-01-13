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

import com.kaltura.client.enums.QuizOutputType;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.Quiz;
import com.kaltura.client.types.QuizFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Allows user to handle quizzes
 * 
 * @param entryId 
 * @param quiz 
 * @param entryId 
 * @param entryId 
 * @param quizOutputType 
 * @param filter 
 * @param pager 
 * @param entryId 
 * @param quizOutputType 
 * @param entryId 
 * @param quiz 
 */
public class QuizService {
	
	public static class AddQuizBuilder extends RequestBuilder<Quiz, Quiz.Tokenizer, AddQuizBuilder> {
		
		public AddQuizBuilder(String entryId, Quiz quiz) {
			super(Quiz.class, "quiz_quiz", "add");
			params.add("entryId", entryId);
			params.add("quiz", quiz);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Allows to add a quiz to an entry
	 * 
	 * @param entryId 
	 * @param quiz 
	 */
    public static AddQuizBuilder add(String entryId, Quiz quiz)  {
		return new AddQuizBuilder(entryId, quiz);
	}
	
	public static class GetQuizBuilder extends RequestBuilder<Quiz, Quiz.Tokenizer, GetQuizBuilder> {
		
		public GetQuizBuilder(String entryId) {
			super(Quiz.class, "quiz_quiz", "get");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Allows to get a quiz
	 * 
	 * @param entryId 
	 */
    public static GetQuizBuilder get(String entryId)  {
		return new GetQuizBuilder(entryId);
	}
	
	public static class GetUrlQuizBuilder extends RequestBuilder<String, String, GetUrlQuizBuilder> {
		
		public GetUrlQuizBuilder(String entryId, QuizOutputType quizOutputType) {
			super(String.class, "quiz_quiz", "getUrl");
			params.add("entryId", entryId);
			params.add("quizOutputType", quizOutputType);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void quizOutputType(String multirequestToken) {
			params.add("quizOutputType", multirequestToken);
		}
	}

	/**
	 * sends a with an api request for pdf from quiz object
	 * 
	 * @param entryId 
	 * @param quizOutputType 
	 */
    public static GetUrlQuizBuilder getUrl(String entryId, QuizOutputType quizOutputType)  {
		return new GetUrlQuizBuilder(entryId, quizOutputType);
	}
	
	public static class ListQuizBuilder extends ListResponseRequestBuilder<Quiz, Quiz.Tokenizer, ListQuizBuilder> {
		
		public ListQuizBuilder(QuizFilter filter, FilterPager pager) {
			super(Quiz.class, "quiz_quiz", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListQuizBuilder list()  {
		return list(null);
	}

	public static ListQuizBuilder list(QuizFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List quiz objects by filter and pager
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListQuizBuilder list(QuizFilter filter, FilterPager pager)  {
		return new ListQuizBuilder(filter, pager);
	}
	
	public static class ServeQuizBuilder extends ServeRequestBuilder {
		
		public ServeQuizBuilder(String entryId, QuizOutputType quizOutputType) {
			super("quiz_quiz", "serve");
			params.add("entryId", entryId);
			params.add("quizOutputType", quizOutputType);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void quizOutputType(String multirequestToken) {
			params.add("quizOutputType", multirequestToken);
		}
	}

	/**
	 * creates a pdf from quiz object   The Output type defines the file format in
	  which the quiz will be generated   Currently only PDF files are supported
	 * 
	 * @param entryId 
	 * @param quizOutputType 
	 */
    public static ServeQuizBuilder serve(String entryId, QuizOutputType quizOutputType)  {
		return new ServeQuizBuilder(entryId, quizOutputType);
	}
	
	public static class UpdateQuizBuilder extends RequestBuilder<Quiz, Quiz.Tokenizer, UpdateQuizBuilder> {
		
		public UpdateQuizBuilder(String entryId, Quiz quiz) {
			super(Quiz.class, "quiz_quiz", "update");
			params.add("entryId", entryId);
			params.add("quiz", quiz);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Allows to update a quiz
	 * 
	 * @param entryId 
	 * @param quiz 
	 */
    public static UpdateQuizBuilder update(String entryId, Quiz quiz)  {
		return new UpdateQuizBuilder(entryId, quiz);
	}
}
