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
// Copyright (C) 2006-2023  Kaltura Inc.
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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(QuizVendorTaskData.Tokenizer.class)
public class QuizVendorTaskData extends LocalizedVendorTaskData {
	
	public interface Tokenizer extends LocalizedVendorTaskData.Tokenizer {
		String numberOfQuestions();
		String questionsType();
		String context();
		String formalStyle();
		String createQuiz();
		String quizOutput();
		String instruction();
	}

	/**
	 * Number Of Questions.
	 */
	private Integer numberOfQuestions;
	/**
	 * Questions Type.
	 */
	private String questionsType;
	/**
	 * Quiz Context.
	 */
	private String context;
	/**
	 * Formal Style.
	 */
	private String formalStyle;
	/**
	 * Create quiz flag.
	 */
	private Boolean createQuiz;
	/**
	 * Quiz entry Id
	 */
	private String quizOutput;
	/**
	 * Instructions describing what should be taken into account during the quiz
	  creation process.
	 */
	private String instruction;

	// numberOfQuestions:
	public Integer getNumberOfQuestions(){
		return this.numberOfQuestions;
	}
	public void setNumberOfQuestions(Integer numberOfQuestions){
		this.numberOfQuestions = numberOfQuestions;
	}

	public void numberOfQuestions(String multirequestToken){
		setToken("numberOfQuestions", multirequestToken);
	}

	// questionsType:
	public String getQuestionsType(){
		return this.questionsType;
	}
	public void setQuestionsType(String questionsType){
		this.questionsType = questionsType;
	}

	public void questionsType(String multirequestToken){
		setToken("questionsType", multirequestToken);
	}

	// context:
	public String getContext(){
		return this.context;
	}
	public void setContext(String context){
		this.context = context;
	}

	public void context(String multirequestToken){
		setToken("context", multirequestToken);
	}

	// formalStyle:
	public String getFormalStyle(){
		return this.formalStyle;
	}
	public void setFormalStyle(String formalStyle){
		this.formalStyle = formalStyle;
	}

	public void formalStyle(String multirequestToken){
		setToken("formalStyle", multirequestToken);
	}

	// createQuiz:
	public Boolean getCreateQuiz(){
		return this.createQuiz;
	}
	public void setCreateQuiz(Boolean createQuiz){
		this.createQuiz = createQuiz;
	}

	public void createQuiz(String multirequestToken){
		setToken("createQuiz", multirequestToken);
	}

	// quizOutput:
	public String getQuizOutput(){
		return this.quizOutput;
	}
	public void setQuizOutput(String quizOutput){
		this.quizOutput = quizOutput;
	}

	public void quizOutput(String multirequestToken){
		setToken("quizOutput", multirequestToken);
	}

	// instruction:
	public String getInstruction(){
		return this.instruction;
	}
	public void setInstruction(String instruction){
		this.instruction = instruction;
	}

	public void instruction(String multirequestToken){
		setToken("instruction", multirequestToken);
	}


	public QuizVendorTaskData() {
		super();
	}

	public QuizVendorTaskData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		numberOfQuestions = GsonParser.parseInt(jsonObject.get("numberOfQuestions"));
		questionsType = GsonParser.parseString(jsonObject.get("questionsType"));
		context = GsonParser.parseString(jsonObject.get("context"));
		formalStyle = GsonParser.parseString(jsonObject.get("formalStyle"));
		createQuiz = GsonParser.parseBoolean(jsonObject.get("createQuiz"));
		quizOutput = GsonParser.parseString(jsonObject.get("quizOutput"));
		instruction = GsonParser.parseString(jsonObject.get("instruction"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaQuizVendorTaskData");
		kparams.add("numberOfQuestions", this.numberOfQuestions);
		kparams.add("questionsType", this.questionsType);
		kparams.add("context", this.context);
		kparams.add("formalStyle", this.formalStyle);
		kparams.add("createQuiz", this.createQuiz);
		kparams.add("quizOutput", this.quizOutput);
		kparams.add("instruction", this.instruction);
		return kparams;
	}

}

