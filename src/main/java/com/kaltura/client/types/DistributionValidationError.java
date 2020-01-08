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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.enums.DistributionAction;
import com.kaltura.client.enums.DistributionErrorType;
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
@MultiRequestBuilder.Tokenizer(DistributionValidationError.Tokenizer.class)
public abstract class DistributionValidationError extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String action();
		String errorType();
		String description();
	}

	private DistributionAction action;
	private DistributionErrorType errorType;
	private String description;

	// action:
	public DistributionAction getAction(){
		return this.action;
	}
	public void setAction(DistributionAction action){
		this.action = action;
	}

	public void action(String multirequestToken){
		setToken("action", multirequestToken);
	}

	// errorType:
	public DistributionErrorType getErrorType(){
		return this.errorType;
	}
	public void setErrorType(DistributionErrorType errorType){
		this.errorType = errorType;
	}

	public void errorType(String multirequestToken){
		setToken("errorType", multirequestToken);
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


	public DistributionValidationError() {
		super();
	}

	public DistributionValidationError(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		action = DistributionAction.get(GsonParser.parseInt(jsonObject.get("action")));
		errorType = DistributionErrorType.get(GsonParser.parseInt(jsonObject.get("errorType")));
		description = GsonParser.parseString(jsonObject.get("description"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDistributionValidationError");
		kparams.add("action", this.action);
		kparams.add("errorType", this.errorType);
		kparams.add("description", this.description);
		return kparams;
	}

}

