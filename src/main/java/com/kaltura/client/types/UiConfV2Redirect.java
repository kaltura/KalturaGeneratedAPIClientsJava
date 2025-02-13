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
@MultiRequestBuilder.Tokenizer(UiConfV2Redirect.Tokenizer.class)
public class UiConfV2Redirect extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String v7id();
		String isApproved();
		String translatePlugins();
	}

	private Integer v7id;
	private Boolean isApproved;
	private Boolean translatePlugins;

	// v7id:
	public Integer getV7id(){
		return this.v7id;
	}
	public void setV7id(Integer v7id){
		this.v7id = v7id;
	}

	public void v7id(String multirequestToken){
		setToken("v7id", multirequestToken);
	}

	// isApproved:
	public Boolean getIsApproved(){
		return this.isApproved;
	}
	public void setIsApproved(Boolean isApproved){
		this.isApproved = isApproved;
	}

	public void isApproved(String multirequestToken){
		setToken("isApproved", multirequestToken);
	}

	// translatePlugins:
	public Boolean getTranslatePlugins(){
		return this.translatePlugins;
	}
	public void setTranslatePlugins(Boolean translatePlugins){
		this.translatePlugins = translatePlugins;
	}

	public void translatePlugins(String multirequestToken){
		setToken("translatePlugins", multirequestToken);
	}


	public UiConfV2Redirect() {
		super();
	}

	public UiConfV2Redirect(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		v7id = GsonParser.parseInt(jsonObject.get("v7id"));
		isApproved = GsonParser.parseBoolean(jsonObject.get("isApproved"));
		translatePlugins = GsonParser.parseBoolean(jsonObject.get("translatePlugins"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUiConfV2Redirect");
		kparams.add("v7id", this.v7id);
		kparams.add("isApproved", this.isApproved);
		kparams.add("translatePlugins", this.translatePlugins);
		return kparams;
	}

}

