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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchCuePointItemData.Tokenizer.class)
public class ESearchCuePointItemData extends ESearchItemData {
	
	public interface Tokenizer extends ESearchItemData.Tokenizer {
		String cuePointType();
		String id();
		String name();
		String text();
		String tags();
		String startTime();
		String endTime();
		String subType();
		String answers();
		String hint();
		String explanation();
	}

	private String cuePointType;
	private String id;
	private String name;
	private String text;
	private String tags;
	private String startTime;
	private String endTime;
	private String subType;
	private String answers;
	private String hint;
	private String explanation;

	// cuePointType:
	public String getCuePointType(){
		return this.cuePointType;
	}
	public void setCuePointType(String cuePointType){
		this.cuePointType = cuePointType;
	}

	public void cuePointType(String multirequestToken){
		setToken("cuePointType", multirequestToken);
	}

	// id:
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
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

	// tags:
	public String getTags(){
		return this.tags;
	}
	public void setTags(String tags){
		this.tags = tags;
	}

	public void tags(String multirequestToken){
		setToken("tags", multirequestToken);
	}

	// startTime:
	public String getStartTime(){
		return this.startTime;
	}
	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public void startTime(String multirequestToken){
		setToken("startTime", multirequestToken);
	}

	// endTime:
	public String getEndTime(){
		return this.endTime;
	}
	public void setEndTime(String endTime){
		this.endTime = endTime;
	}

	public void endTime(String multirequestToken){
		setToken("endTime", multirequestToken);
	}

	// subType:
	public String getSubType(){
		return this.subType;
	}
	public void setSubType(String subType){
		this.subType = subType;
	}

	public void subType(String multirequestToken){
		setToken("subType", multirequestToken);
	}

	// answers:
	public String getAnswers(){
		return this.answers;
	}
	public void setAnswers(String answers){
		this.answers = answers;
	}

	public void answers(String multirequestToken){
		setToken("answers", multirequestToken);
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


	public ESearchCuePointItemData() {
		super();
	}

	public ESearchCuePointItemData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		cuePointType = GsonParser.parseString(jsonObject.get("cuePointType"));
		id = GsonParser.parseString(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		text = GsonParser.parseString(jsonObject.get("text"));
		tags = GsonParser.parseString(jsonObject.get("tags"));
		startTime = GsonParser.parseString(jsonObject.get("startTime"));
		endTime = GsonParser.parseString(jsonObject.get("endTime"));
		subType = GsonParser.parseString(jsonObject.get("subType"));
		answers = GsonParser.parseString(jsonObject.get("answers"));
		hint = GsonParser.parseString(jsonObject.get("hint"));
		explanation = GsonParser.parseString(jsonObject.get("explanation"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchCuePointItemData");
		kparams.add("cuePointType", this.cuePointType);
		kparams.add("id", this.id);
		kparams.add("name", this.name);
		kparams.add("text", this.text);
		kparams.add("tags", this.tags);
		kparams.add("startTime", this.startTime);
		kparams.add("endTime", this.endTime);
		kparams.add("subType", this.subType);
		kparams.add("answers", this.answers);
		kparams.add("hint", this.hint);
		kparams.add("explanation", this.explanation);
		return kparams;
	}

}

