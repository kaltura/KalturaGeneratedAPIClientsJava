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
import com.kaltura.client.enums.QuizOutputType;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.Quiz;
import com.kaltura.client.types.QuizFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Allows user to handle quizzes  */
public class QuizService {

	/**  Allows to add a quiz to an entry  */
    public static RequestBuilder<Quiz> add(String entryId, Quiz quiz)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("quiz", quiz);

        return new RequestBuilder<Quiz>(Quiz.class, "quiz_quiz", "add", kparams);
    }

	/**  Allows to get a quiz  */
    public static RequestBuilder<Quiz> get(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new RequestBuilder<Quiz>(Quiz.class, "quiz_quiz", "get", kparams);
    }

	/**  sends a with an api request for pdf from quiz object  */
    public static RequestBuilder<String> getUrl(String entryId, QuizOutputType quizOutputType)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("quizOutputType", quizOutputType);

        return new RequestBuilder<String>(String.class, "quiz_quiz", "getUrl", kparams);
    }

    public static RequestBuilder<ListResponse<Quiz>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<Quiz>> list(QuizFilter filter)  {
        return list(filter, null);
    }

	/**  List quiz objects by filter and pager  */
    public static RequestBuilder<ListResponse<Quiz>> list(QuizFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<Quiz>(Quiz.class, "quiz_quiz", "list", kparams);
    }

	/**  creates a pdf from quiz object   The Output type defines the file format in
	  which the quiz will be generated   Currently only PDF files are supported  */
    public static RequestBuilder<String> serve(String entryId, QuizOutputType quizOutputType)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("quizOutputType", quizOutputType);

        return new ServeRequestBuilder("quiz_quiz", "serve", kparams);
    }

	/**  Allows to update a quiz  */
    public static RequestBuilder<Quiz> update(String entryId, Quiz quiz)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("quiz", quiz);

        return new RequestBuilder<Quiz>(Quiz.class, "quiz_quiz", "update", kparams);
    }
}
