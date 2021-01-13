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
package com.kaltura.client.types;

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
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
@MultiRequestBuilder.Tokenizer(ESearchCuePointItemData.Tokenizer.class)
public class ESearchCuePointItemData extends ESearchItemData {
	
	public interface Tokenizer extends ESearchItemData.Tokenizer {
		String cuePointType();
		String id();
		String name();
		String text();
		RequestBuilder.ListTokenizer<StringHolder.Tokenizer> tags();
		String startTime();
		String endTime();
		String subType();
		String question();
		RequestBuilder.ListTokenizer<StringHolder.Tokenizer> answers();
		String hint();
		String explanation();
		String assetId();
	}

	private String cuePointType;
	private String id;
	private String name;
	private String text;
	private List<StringHolder> tags;
	private String startTime;
	private String endTime;
	private String subType;
	private String question;
	private List<StringHolder> answers;
	private String hint;
	private String explanation;
	private String assetId;

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
	public List<StringHolder> getTags(){
		return this.tags;
	}
	public void setTags(List<StringHolder> tags){
		this.tags = tags;
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

	// answers:
	public List<StringHolder> getAnswers(){
		return this.answers;
	}
	public void setAnswers(List<StringHolder> answers){
		this.answers = answers;
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

	// assetId:
	public String getAssetId(){
		return this.assetId;
	}
	public void setAssetId(String assetId){
		this.assetId = assetId;
	}

	public void assetId(String multirequestToken){
		setToken("assetId", multirequestToken);
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
		tags = GsonParser.parseArray(jsonObject.getAsJsonArray("tags"), StringHolder.class);
		startTime = GsonParser.parseString(jsonObject.get("startTime"));
		endTime = GsonParser.parseString(jsonObject.get("endTime"));
		subType = GsonParser.parseString(jsonObject.get("subType"));
		question = GsonParser.parseString(jsonObject.get("question"));
		answers = GsonParser.parseArray(jsonObject.getAsJsonArray("answers"), StringHolder.class);
		hint = GsonParser.parseString(jsonObject.get("hint"));
		explanation = GsonParser.parseString(jsonObject.get("explanation"));
		assetId = GsonParser.parseString(jsonObject.get("assetId"));

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
		kparams.add("question", this.question);
		kparams.add("answers", this.answers);
		kparams.add("hint", this.hint);
		kparams.add("explanation", this.explanation);
		kparams.add("assetId", this.assetId);
		return kparams;
	}

}

