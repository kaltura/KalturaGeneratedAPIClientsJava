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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveFeature.Tokenizer.class)
public abstract class LiveFeature extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String systemName();
		String preStartTime();
		String postEndTime();
	}

	private String systemName;
	private Integer preStartTime;
	private Integer postEndTime;

	// systemName:
	public String getSystemName(){
		return this.systemName;
	}
	public void setSystemName(String systemName){
		this.systemName = systemName;
	}

	public void systemName(String multirequestToken){
		setToken("systemName", multirequestToken);
	}

	// preStartTime:
	public Integer getPreStartTime(){
		return this.preStartTime;
	}
	public void setPreStartTime(Integer preStartTime){
		this.preStartTime = preStartTime;
	}

	public void preStartTime(String multirequestToken){
		setToken("preStartTime", multirequestToken);
	}

	// postEndTime:
	public Integer getPostEndTime(){
		return this.postEndTime;
	}
	public void setPostEndTime(Integer postEndTime){
		this.postEndTime = postEndTime;
	}

	public void postEndTime(String multirequestToken){
		setToken("postEndTime", multirequestToken);
	}


	public LiveFeature() {
		super();
	}

	public LiveFeature(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		preStartTime = GsonParser.parseInt(jsonObject.get("preStartTime"));
		postEndTime = GsonParser.parseInt(jsonObject.get("postEndTime"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveFeature");
		kparams.add("systemName", this.systemName);
		kparams.add("preStartTime", this.preStartTime);
		kparams.add("postEndTime", this.postEndTime);
		return kparams;
	}

}

