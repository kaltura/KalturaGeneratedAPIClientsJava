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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserScoreProperties.Tokenizer.class)
public class UserScoreProperties extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String rank();
		String userId();
		String score();
	}

	private Integer rank;
	private String userId;
	private Integer score;

	// rank:
	public Integer getRank(){
		return this.rank;
	}
	public void setRank(Integer rank){
		this.rank = rank;
	}

	public void rank(String multirequestToken){
		setToken("rank", multirequestToken);
	}

	// userId:
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
	}

	// score:
	public Integer getScore(){
		return this.score;
	}
	public void setScore(Integer score){
		this.score = score;
	}

	public void score(String multirequestToken){
		setToken("score", multirequestToken);
	}


	public UserScoreProperties() {
		super();
	}

	public UserScoreProperties(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		rank = GsonParser.parseInt(jsonObject.get("rank"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		score = GsonParser.parseInt(jsonObject.get("score"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserScoreProperties");
		kparams.add("rank", this.rank);
		kparams.add("userId", this.userId);
		kparams.add("score", this.score);
		return kparams;
	}

}

