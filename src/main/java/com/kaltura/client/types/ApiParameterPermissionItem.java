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
// Copyright (C) 2006-2022  Kaltura Inc.
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
import com.kaltura.client.enums.ApiParameterPermissionItemAction;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ApiParameterPermissionItem.Tokenizer.class)
public class ApiParameterPermissionItem extends PermissionItem {
	
	public interface Tokenizer extends PermissionItem.Tokenizer {
		String object();
		String parameter();
		String action();
	}

	private String object;
	private String parameter;
	private ApiParameterPermissionItemAction action;

	// object:
	public String getObject(){
		return this.object;
	}
	public void setObject(String object){
		this.object = object;
	}

	public void object(String multirequestToken){
		setToken("object", multirequestToken);
	}

	// parameter:
	public String getParameter(){
		return this.parameter;
	}
	public void setParameter(String parameter){
		this.parameter = parameter;
	}

	public void parameter(String multirequestToken){
		setToken("parameter", multirequestToken);
	}

	// action:
	public ApiParameterPermissionItemAction getAction(){
		return this.action;
	}
	public void setAction(ApiParameterPermissionItemAction action){
		this.action = action;
	}

	public void action(String multirequestToken){
		setToken("action", multirequestToken);
	}


	public ApiParameterPermissionItem() {
		super();
	}

	public ApiParameterPermissionItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		object = GsonParser.parseString(jsonObject.get("object"));
		parameter = GsonParser.parseString(jsonObject.get("parameter"));
		action = ApiParameterPermissionItemAction.get(GsonParser.parseString(jsonObject.get("action")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaApiParameterPermissionItem");
		kparams.add("object", this.object);
		kparams.add("parameter", this.parameter);
		kparams.add("action", this.action);
		return kparams;
	}

}

