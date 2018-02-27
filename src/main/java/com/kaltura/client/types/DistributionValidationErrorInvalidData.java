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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.DistributionValidationErrorType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DistributionValidationErrorInvalidData.Tokenizer.class)
public class DistributionValidationErrorInvalidData extends DistributionValidationError {
	
	public interface Tokenizer extends DistributionValidationError.Tokenizer {
		String fieldName();
		String validationErrorType();
		String validationErrorParam();
	}

	private String fieldName;
	private DistributionValidationErrorType validationErrorType;
	/**
	 * Parameter of the validation error   For example, minimum value for
	  KalturaDistributionValidationErrorType::STRING_TOO_SHORT validation error
	 */
	private String validationErrorParam;

	// fieldName:
	public String getFieldName(){
		return this.fieldName;
	}
	public void setFieldName(String fieldName){
		this.fieldName = fieldName;
	}

	public void fieldName(String multirequestToken){
		setToken("fieldName", multirequestToken);
	}

	// validationErrorType:
	public DistributionValidationErrorType getValidationErrorType(){
		return this.validationErrorType;
	}
	public void setValidationErrorType(DistributionValidationErrorType validationErrorType){
		this.validationErrorType = validationErrorType;
	}

	public void validationErrorType(String multirequestToken){
		setToken("validationErrorType", multirequestToken);
	}

	// validationErrorParam:
	public String getValidationErrorParam(){
		return this.validationErrorParam;
	}
	public void setValidationErrorParam(String validationErrorParam){
		this.validationErrorParam = validationErrorParam;
	}

	public void validationErrorParam(String multirequestToken){
		setToken("validationErrorParam", multirequestToken);
	}


	public DistributionValidationErrorInvalidData() {
		super();
	}

	public DistributionValidationErrorInvalidData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fieldName = GsonParser.parseString(jsonObject.get("fieldName"));
		validationErrorType = DistributionValidationErrorType.get(GsonParser.parseInt(jsonObject.get("validationErrorType")));
		validationErrorParam = GsonParser.parseString(jsonObject.get("validationErrorParam"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDistributionValidationErrorInvalidData");
		kparams.add("fieldName", this.fieldName);
		kparams.add("validationErrorType", this.validationErrorType);
		kparams.add("validationErrorParam", this.validationErrorParam);
		return kparams;
	}

}

