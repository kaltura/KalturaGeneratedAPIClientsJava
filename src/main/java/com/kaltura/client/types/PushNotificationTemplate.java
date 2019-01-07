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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PushNotificationTemplate.Tokenizer.class)
public class PushNotificationTemplate extends EventNotificationTemplate {
	
	public interface Tokenizer extends EventNotificationTemplate.Tokenizer {
		RequestBuilder.ListTokenizer<PushEventNotificationParameter.Tokenizer> queueNameParameters();
		RequestBuilder.ListTokenizer<PushEventNotificationParameter.Tokenizer> queueKeyParameters();
		String apiObjectType();
		String objectFormat();
		String responseProfileId();
	}

	/**
	 * Define the content dynamic parameters
	 */
	private List<PushEventNotificationParameter> queueNameParameters;
	/**
	 * Define the content dynamic parameters
	 */
	private List<PushEventNotificationParameter> queueKeyParameters;
	/**
	 * Kaltura API object type
	 */
	private String apiObjectType;
	/**
	 * Kaltura Object format
	 */
	private ResponseType objectFormat;
	/**
	 * Kaltura response-profile id
	 */
	private Integer responseProfileId;

	// queueNameParameters:
	public List<PushEventNotificationParameter> getQueueNameParameters(){
		return this.queueNameParameters;
	}
	public void setQueueNameParameters(List<PushEventNotificationParameter> queueNameParameters){
		this.queueNameParameters = queueNameParameters;
	}

	// queueKeyParameters:
	public List<PushEventNotificationParameter> getQueueKeyParameters(){
		return this.queueKeyParameters;
	}
	public void setQueueKeyParameters(List<PushEventNotificationParameter> queueKeyParameters){
		this.queueKeyParameters = queueKeyParameters;
	}

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

	// objectFormat:
	public ResponseType getObjectFormat(){
		return this.objectFormat;
	}
	public void setObjectFormat(ResponseType objectFormat){
		this.objectFormat = objectFormat;
	}

	public void objectFormat(String multirequestToken){
		setToken("objectFormat", multirequestToken);
	}

	// responseProfileId:
	public Integer getResponseProfileId(){
		return this.responseProfileId;
	}
	public void setResponseProfileId(Integer responseProfileId){
		this.responseProfileId = responseProfileId;
	}

	public void responseProfileId(String multirequestToken){
		setToken("responseProfileId", multirequestToken);
	}


	public PushNotificationTemplate() {
		super();
	}

	public PushNotificationTemplate(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		queueNameParameters = GsonParser.parseArray(jsonObject.getAsJsonArray("queueNameParameters"), PushEventNotificationParameter.class);
		queueKeyParameters = GsonParser.parseArray(jsonObject.getAsJsonArray("queueKeyParameters"), PushEventNotificationParameter.class);
		apiObjectType = GsonParser.parseString(jsonObject.get("apiObjectType"));
		objectFormat = ResponseType.get(GsonParser.parseInt(jsonObject.get("objectFormat")));
		responseProfileId = GsonParser.parseInt(jsonObject.get("responseProfileId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPushNotificationTemplate");
		kparams.add("queueNameParameters", this.queueNameParameters);
		kparams.add("queueKeyParameters", this.queueKeyParameters);
		kparams.add("apiObjectType", this.apiObjectType);
		kparams.add("objectFormat", this.objectFormat);
		kparams.add("responseProfileId", this.responseProfileId);
		return kparams;
	}

}

