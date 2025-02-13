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
@MultiRequestBuilder.Tokenizer(SessionCuePoint.Tokenizer.class)
public class SessionCuePoint extends CuePoint {
	
	public interface Tokenizer extends CuePoint.Tokenizer {
		String name();
		String endTime();
		String duration();
		String sessionOwner();
	}

	private String name;
	private Integer endTime;
	/**
	 * Duration in milliseconds
	 */
	private Integer duration;
	private String sessionOwner;

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
	// sessionOwner:
	public String getSessionOwner(){
		return this.sessionOwner;
	}
	public void setSessionOwner(String sessionOwner){
		this.sessionOwner = sessionOwner;
	}

	public void sessionOwner(String multirequestToken){
		setToken("sessionOwner", multirequestToken);
	}


	public SessionCuePoint() {
		super();
	}

	public SessionCuePoint(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		name = GsonParser.parseString(jsonObject.get("name"));
		endTime = GsonParser.parseInt(jsonObject.get("endTime"));
		duration = GsonParser.parseInt(jsonObject.get("duration"));
		sessionOwner = GsonParser.parseString(jsonObject.get("sessionOwner"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSessionCuePoint");
		kparams.add("name", this.name);
		kparams.add("endTime", this.endTime);
		kparams.add("sessionOwner", this.sessionOwner);
		return kparams;
	}

}

