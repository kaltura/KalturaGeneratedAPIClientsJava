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
// Copyright (C) 2006-2019  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(CodeCuePoint.Tokenizer.class)
public class CodeCuePoint extends CuePoint {
	
	public interface Tokenizer extends CuePoint.Tokenizer {
		String code();
		String description();
		String endTime();
		String duration();
	}

	private String code;
	private String description;
	private Integer endTime;
	/**
	 * Duration in milliseconds
	 */
	private Integer duration;

	// code:
	public String getCode(){
		return this.code;
	}
	public void setCode(String code){
		this.code = code;
	}

	public void code(String multirequestToken){
		setToken("code", multirequestToken);
	}

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// endTime:
	public Integer getEndTime(){
		return this.endTime;
	}
	public void setEndTime(Integer endTime){
		this.endTime = endTime;
	}

	public void endTime(String multirequestToken){
		setToken("endTime", multirequestToken);
	}

	// duration:
	public Integer getDuration(){
		return this.duration;
	}

	public CodeCuePoint() {
		super();
	}

	public CodeCuePoint(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		code = GsonParser.parseString(jsonObject.get("code"));
		description = GsonParser.parseString(jsonObject.get("description"));
		endTime = GsonParser.parseInt(jsonObject.get("endTime"));
		duration = GsonParser.parseInt(jsonObject.get("duration"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCodeCuePoint");
		kparams.add("code", this.code);
		kparams.add("description", this.description);
		kparams.add("endTime", this.endTime);
		return kparams;
	}

}

