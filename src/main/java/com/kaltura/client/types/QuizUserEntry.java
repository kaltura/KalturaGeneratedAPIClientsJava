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
import com.kaltura.client.enums.UserEntryExtendedStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(QuizUserEntry.Tokenizer.class)
public class QuizUserEntry extends UserEntry {
	
	public interface Tokenizer extends UserEntry.Tokenizer {
		String score();
		String calculatedScore();
		String feedback();
		String version();
		String extendedStatus();
	}

	private Double score;
	private Double calculatedScore;
	private String feedback;
	private Integer version;
	private UserEntryExtendedStatus extendedStatus;

	// score:
	public Double getScore(){
		return this.score;
	}
	// calculatedScore:
	public Double getCalculatedScore(){
		return this.calculatedScore;
	}
	// feedback:
	public String getFeedback(){
		return this.feedback;
	}
	public void setFeedback(String feedback){
		this.feedback = feedback;
	}

	public void feedback(String multirequestToken){
		setToken("feedback", multirequestToken);
	}

	// version:
	public Integer getVersion(){
		return this.version;
	}
	// extendedStatus:
	public UserEntryExtendedStatus getExtendedStatus(){
		return this.extendedStatus;
	}
	public void setExtendedStatus(UserEntryExtendedStatus extendedStatus){
		this.extendedStatus = extendedStatus;
	}

	public void extendedStatus(String multirequestToken){
		setToken("extendedStatus", multirequestToken);
	}


	public QuizUserEntry() {
		super();
	}

	public QuizUserEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		score = GsonParser.parseDouble(jsonObject.get("score"));
		calculatedScore = GsonParser.parseDouble(jsonObject.get("calculatedScore"));
		feedback = GsonParser.parseString(jsonObject.get("feedback"));
		version = GsonParser.parseInt(jsonObject.get("version"));
		extendedStatus = UserEntryExtendedStatus.get(GsonParser.parseString(jsonObject.get("extendedStatus")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaQuizUserEntry");
		kparams.add("feedback", this.feedback);
		kparams.add("extendedStatus", this.extendedStatus);
		return kparams;
	}

}

