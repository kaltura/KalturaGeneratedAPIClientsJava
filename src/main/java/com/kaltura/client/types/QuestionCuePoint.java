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
package com.kaltura.client.types;

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.enums.QuestionType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(QuestionCuePoint.Tokenizer.class)
public class QuestionCuePoint extends CuePoint {
	
	public interface Tokenizer extends CuePoint.Tokenizer {
		RequestBuilder.ListTokenizer<OptionalAnswer.Tokenizer> optionalAnswers();
		String hint();
		String question();
		String explanation();
		String questionType();
	}

	/**
	 * Array of key value answerKey-&gt;optionAnswer objects
	 */
	private List<OptionalAnswer> optionalAnswers;
	private String hint;
	private String question;
	private String explanation;
	private QuestionType questionType;

	// optionalAnswers:
	public List<OptionalAnswer> getOptionalAnswers(){
		return this.optionalAnswers;
	}
	public void setOptionalAnswers(List<OptionalAnswer> optionalAnswers){
		this.optionalAnswers = optionalAnswers;
	}

	// hint:
	public String getHint(){
		return this.hint;
	}
	public void setHint(String hint){
		this.hint = hint;
	}

	public void hint(String multirequestToken){
		setToken("hint", multirequestToken);
	}

	// question:
	public String getQuestion(){
		return this.question;
	}
	public void setQuestion(String question){
		this.question = question;
	}

	public void question(String multirequestToken){
		setToken("question", multirequestToken);
	}

	// explanation:
	public String getExplanation(){
		return this.explanation;
	}
	public void setExplanation(String explanation){
		this.explanation = explanation;
	}

	public void explanation(String multirequestToken){
		setToken("explanation", multirequestToken);
	}

	// questionType:
	public QuestionType getQuestionType(){
		return this.questionType;
	}
	public void setQuestionType(QuestionType questionType){
		this.questionType = questionType;
	}

	public void questionType(String multirequestToken){
		setToken("questionType", multirequestToken);
	}


	public QuestionCuePoint() {
		super();
	}

	public QuestionCuePoint(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		optionalAnswers = GsonParser.parseArray(jsonObject.getAsJsonArray("optionalAnswers"), OptionalAnswer.class);
		hint = GsonParser.parseString(jsonObject.get("hint"));
		question = GsonParser.parseString(jsonObject.get("question"));
		explanation = GsonParser.parseString(jsonObject.get("explanation"));
		questionType = QuestionType.get(GsonParser.parseInt(jsonObject.get("questionType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaQuestionCuePoint");
		kparams.add("optionalAnswers", this.optionalAnswers);
		kparams.add("hint", this.hint);
		kparams.add("question", this.question);
		kparams.add("explanation", this.explanation);
		kparams.add("questionType", this.questionType);
		return kparams;
	}

}

