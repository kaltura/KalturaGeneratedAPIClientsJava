// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platforms allow them to do with
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
package com.kaltura.client.types;

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(QuestionCuePointBaseFilter.Tokenizer.class)
public abstract class QuestionCuePointBaseFilter extends CuePointFilter {
	
	public interface Tokenizer extends CuePointFilter.Tokenizer {
		String questionLike();
		String questionMultiLikeOr();
		String questionMultiLikeAnd();
	}

	private String questionLike;
	private String questionMultiLikeOr;
	private String questionMultiLikeAnd;

	// questionLike:
	public String getQuestionLike(){
		return this.questionLike;
	}
	public void setQuestionLike(String questionLike){
		this.questionLike = questionLike;
	}

	public void questionLike(String multirequestToken){
		setToken("questionLike", multirequestToken);
	}

	// questionMultiLikeOr:
	public String getQuestionMultiLikeOr(){
		return this.questionMultiLikeOr;
	}
	public void setQuestionMultiLikeOr(String questionMultiLikeOr){
		this.questionMultiLikeOr = questionMultiLikeOr;
	}

	public void questionMultiLikeOr(String multirequestToken){
		setToken("questionMultiLikeOr", multirequestToken);
	}

	// questionMultiLikeAnd:
	public String getQuestionMultiLikeAnd(){
		return this.questionMultiLikeAnd;
	}
	public void setQuestionMultiLikeAnd(String questionMultiLikeAnd){
		this.questionMultiLikeAnd = questionMultiLikeAnd;
	}

	public void questionMultiLikeAnd(String multirequestToken){
		setToken("questionMultiLikeAnd", multirequestToken);
	}


	public QuestionCuePointBaseFilter() {
		super();
	}

	public QuestionCuePointBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		questionLike = GsonParser.parseString(jsonObject.get("questionLike"));
		questionMultiLikeOr = GsonParser.parseString(jsonObject.get("questionMultiLikeOr"));
		questionMultiLikeAnd = GsonParser.parseString(jsonObject.get("questionMultiLikeAnd"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaQuestionCuePointBaseFilter");
		kparams.add("questionLike", this.questionLike);
		kparams.add("questionMultiLikeOr", this.questionMultiLikeOr);
		kparams.add("questionMultiLikeAnd", this.questionMultiLikeAnd);
		return kparams;
	}

}

