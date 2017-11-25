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
// Copyright (C) 2006-2017  Kaltura Inc.
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
import com.kaltura.client.enums.ResponseType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Evaluates PHP statement, depends on the execution context
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(HttpNotificationObjectData.Tokenizer.class)
public class HttpNotificationObjectData extends HttpNotificationData {
	
	public interface Tokenizer extends HttpNotificationData.Tokenizer {
		String apiObjectType();
		String format();
		String ignoreNull();
		String code();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> dataStringReplacements();
	}

	/**
	 * Kaltura API object type
	 */
	private String apiObjectType;
	/**
	 * Data format
	 */
	private ResponseType format;
	/**
	 * Ignore null attributes during serialization
	 */
	private Boolean ignoreNull;
	/**
	 * PHP code
	 */
	private String code;
	/**
	 * An array of pattern-replacement pairs used for data string regex replacements
	 */
	private List<KeyValue> dataStringReplacements;

	// apiObjectType:
	public String getApiObjectType(){
		return this.apiObjectType;
	}
	public void setApiObjectType(String apiObjectType){
		this.apiObjectType = apiObjectType;
	}

	public void apiObjectType(String multirequestToken){
		setToken("apiObjectType", multirequestToken);
	}

	// format:
	public ResponseType getFormat(){
		return this.format;
	}
	public void setFormat(ResponseType format){
		this.format = format;
	}

	public void format(String multirequestToken){
		setToken("format", multirequestToken);
	}

	// ignoreNull:
	public Boolean getIgnoreNull(){
		return this.ignoreNull;
	}
	public void setIgnoreNull(Boolean ignoreNull){
		this.ignoreNull = ignoreNull;
	}

	public void ignoreNull(String multirequestToken){
		setToken("ignoreNull", multirequestToken);
	}

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

	// dataStringReplacements:
	public List<KeyValue> getDataStringReplacements(){
		return this.dataStringReplacements;
	}
	public void setDataStringReplacements(List<KeyValue> dataStringReplacements){
		this.dataStringReplacements = dataStringReplacements;
	}


	public HttpNotificationObjectData() {
		super();
	}

	public HttpNotificationObjectData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		apiObjectType = GsonParser.parseString(jsonObject.get("apiObjectType"));
		format = ResponseType.get(GsonParser.parseInt(jsonObject.get("format")));
		ignoreNull = GsonParser.parseBoolean(jsonObject.get("ignoreNull"));
		code = GsonParser.parseString(jsonObject.get("code"));
		dataStringReplacements = GsonParser.parseArray(jsonObject.getAsJsonArray("dataStringReplacements"), KeyValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaHttpNotificationObjectData");
		kparams.add("apiObjectType", this.apiObjectType);
		kparams.add("format", this.format);
		kparams.add("ignoreNull", this.ignoreNull);
		kparams.add("code", this.code);
		kparams.add("dataStringReplacements", this.dataStringReplacements);
		return kparams;
	}

}

