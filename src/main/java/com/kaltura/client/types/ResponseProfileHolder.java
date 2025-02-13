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
@MultiRequestBuilder.Tokenizer(ResponseProfileHolder.Tokenizer.class)
public class ResponseProfileHolder extends BaseResponseProfile {
	
	public interface Tokenizer extends BaseResponseProfile.Tokenizer {
		String id();
		String systemName();
	}

	/**
	 * Auto generated numeric identifier
	 */
	private Long id;
	/**
	 * Unique system name
	 */
	private String systemName;

	// id:
	public Long getId(){
		return this.id;
	}
	public void setId(Long id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

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


	public ResponseProfileHolder() {
		super();
	}

	public ResponseProfileHolder(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaResponseProfileHolder");
		kparams.add("id", this.id);
		kparams.add("systemName", this.systemName);
		return kparams;
	}

}

