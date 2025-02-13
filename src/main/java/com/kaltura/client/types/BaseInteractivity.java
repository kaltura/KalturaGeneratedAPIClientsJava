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
@MultiRequestBuilder.Tokenizer(BaseInteractivity.Tokenizer.class)
public abstract class BaseInteractivity extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String data();
		String version();
		String entryId();
		String updatedAt();
	}

	private String data;
	private Integer version;
	private String entryId;
	/**
	 * Interactivity update date as Unix timestamp (In seconds)
	 */
	private Long updatedAt;

	// data:
	public String getData(){
		return this.data;
	}
	public void setData(String data){
		this.data = data;
	}

	public void data(String multirequestToken){
		setToken("data", multirequestToken);
	}

	// version:
	public Integer getVersion(){
		return this.version;
	}
	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	// updatedAt:
	public Long getUpdatedAt(){
		return this.updatedAt;
	}

	public BaseInteractivity() {
		super();
	}

	public BaseInteractivity(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		data = GsonParser.parseString(jsonObject.get("data"));
		version = GsonParser.parseInt(jsonObject.get("version"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		updatedAt = GsonParser.parseLong(jsonObject.get("updatedAt"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBaseInteractivity");
		kparams.add("data", this.data);
		return kparams;
	}

}

