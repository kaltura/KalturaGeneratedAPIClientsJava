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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  A representation of an optional answer for question cue point  */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(OptionalAnswer.Tokenizer.class)
public class OptionalAnswer extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String key();
		String text();
		String weight();
		String isCorrect();
	}

	private String key;
	private String text;
	private Double weight;
	private Boolean isCorrect;

	// key:
	public String getKey(){
		return this.key;
	}
	public void setKey(String key){
		this.key = key;
	}

	public void key(String multirequestToken){
		setToken("key", multirequestToken);
	}

	// text:
	public String getText(){
		return this.text;
	}
	public void setText(String text){
		this.text = text;
	}

	public void text(String multirequestToken){
		setToken("text", multirequestToken);
	}

	// weight:
	public Double getWeight(){
		return this.weight;
	}
	public void setWeight(Double weight){
		this.weight = weight;
	}

	public void weight(String multirequestToken){
		setToken("weight", multirequestToken);
	}

	// isCorrect:
	public Boolean getIsCorrect(){
		return this.isCorrect;
	}
	public void setIsCorrect(Boolean isCorrect){
		this.isCorrect = isCorrect;
	}

	public void isCorrect(String multirequestToken){
		setToken("isCorrect", multirequestToken);
	}


	public OptionalAnswer() {
		super();
	}

	public OptionalAnswer(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		key = GsonParser.parseString(jsonObject.get("key"));
		text = GsonParser.parseString(jsonObject.get("text"));
		weight = GsonParser.parseDouble(jsonObject.get("weight"));
		isCorrect = GsonParser.parseBoolean(jsonObject.get("isCorrect"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaOptionalAnswer");
		kparams.add("key", this.key);
		kparams.add("text", this.text);
		kparams.add("weight", this.weight);
		kparams.add("isCorrect", this.isCorrect);
		return kparams;
	}

}

