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
// Copyright (C) 2006-2020  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(AnswerCuePointBaseFilter.Tokenizer.class)
public abstract class AnswerCuePointBaseFilter extends CuePointFilter {
	
	public interface Tokenizer extends CuePointFilter.Tokenizer {
		String parentIdEqual();
		String parentIdIn();
		String quizUserEntryIdEqual();
		String quizUserEntryIdIn();
	}

	private String parentIdEqual;
	private String parentIdIn;
	private String quizUserEntryIdEqual;
	private String quizUserEntryIdIn;

	// parentIdEqual:
	public String getParentIdEqual(){
		return this.parentIdEqual;
	}
	public void setParentIdEqual(String parentIdEqual){
		this.parentIdEqual = parentIdEqual;
	}

	public void parentIdEqual(String multirequestToken){
		setToken("parentIdEqual", multirequestToken);
	}

	// parentIdIn:
	public String getParentIdIn(){
		return this.parentIdIn;
	}
	public void setParentIdIn(String parentIdIn){
		this.parentIdIn = parentIdIn;
	}

	public void parentIdIn(String multirequestToken){
		setToken("parentIdIn", multirequestToken);
	}

	// quizUserEntryIdEqual:
	public String getQuizUserEntryIdEqual(){
		return this.quizUserEntryIdEqual;
	}
	public void setQuizUserEntryIdEqual(String quizUserEntryIdEqual){
		this.quizUserEntryIdEqual = quizUserEntryIdEqual;
	}

	public void quizUserEntryIdEqual(String multirequestToken){
		setToken("quizUserEntryIdEqual", multirequestToken);
	}

	// quizUserEntryIdIn:
	public String getQuizUserEntryIdIn(){
		return this.quizUserEntryIdIn;
	}
	public void setQuizUserEntryIdIn(String quizUserEntryIdIn){
		this.quizUserEntryIdIn = quizUserEntryIdIn;
	}

	public void quizUserEntryIdIn(String multirequestToken){
		setToken("quizUserEntryIdIn", multirequestToken);
	}


	public AnswerCuePointBaseFilter() {
		super();
	}

	public AnswerCuePointBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		parentIdEqual = GsonParser.parseString(jsonObject.get("parentIdEqual"));
		parentIdIn = GsonParser.parseString(jsonObject.get("parentIdIn"));
		quizUserEntryIdEqual = GsonParser.parseString(jsonObject.get("quizUserEntryIdEqual"));
		quizUserEntryIdIn = GsonParser.parseString(jsonObject.get("quizUserEntryIdIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAnswerCuePointBaseFilter");
		kparams.add("parentIdEqual", this.parentIdEqual);
		kparams.add("parentIdIn", this.parentIdIn);
		kparams.add("quizUserEntryIdEqual", this.quizUserEntryIdEqual);
		kparams.add("quizUserEntryIdIn", this.quizUserEntryIdIn);
		return kparams;
	}

}

