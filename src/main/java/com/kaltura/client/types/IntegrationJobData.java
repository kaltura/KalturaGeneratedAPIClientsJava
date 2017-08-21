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
import com.kaltura.client.enums.IntegrationProviderType;
import com.kaltura.client.enums.IntegrationTriggerType;
import com.kaltura.client.types.IntegrationJobProviderData;
import com.kaltura.client.types.IntegrationJobTriggerData;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(IntegrationJobData.Tokenizer.class)
public class IntegrationJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String callbackNotificationUrl();
		String providerType();
		IntegrationJobProviderData.Tokenizer providerData();
		String triggerType();
		IntegrationJobTriggerData.Tokenizer triggerData();
	}

	private String callbackNotificationUrl;
	private IntegrationProviderType providerType;
	/**  Additional data that relevant for the provider only  */
	private IntegrationJobProviderData providerData;
	private IntegrationTriggerType triggerType;
	/**  Additional data that relevant for the trigger only  */
	private IntegrationJobTriggerData triggerData;

	// callbackNotificationUrl:
	public String getCallbackNotificationUrl(){
		return this.callbackNotificationUrl;
	}
	public void setCallbackNotificationUrl(String callbackNotificationUrl){
		this.callbackNotificationUrl = callbackNotificationUrl;
	}

	public void callbackNotificationUrl(String multirequestToken){
		setToken("callbackNotificationUrl", multirequestToken);
	}

	// providerType:
	public IntegrationProviderType getProviderType(){
		return this.providerType;
	}
	public void setProviderType(IntegrationProviderType providerType){
		this.providerType = providerType;
	}

	public void providerType(String multirequestToken){
		setToken("providerType", multirequestToken);
	}

	// providerData:
	public IntegrationJobProviderData getProviderData(){
		return this.providerData;
	}
	public void setProviderData(IntegrationJobProviderData providerData){
		this.providerData = providerData;
	}

	// triggerType:
	public IntegrationTriggerType getTriggerType(){
		return this.triggerType;
	}
	public void setTriggerType(IntegrationTriggerType triggerType){
		this.triggerType = triggerType;
	}

	public void triggerType(String multirequestToken){
		setToken("triggerType", multirequestToken);
	}

	// triggerData:
	public IntegrationJobTriggerData getTriggerData(){
		return this.triggerData;
	}
	public void setTriggerData(IntegrationJobTriggerData triggerData){
		this.triggerData = triggerData;
	}


	public IntegrationJobData() {
		super();
	}

	public IntegrationJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		callbackNotificationUrl = GsonParser.parseString(jsonObject.get("callbackNotificationUrl"));
		providerType = IntegrationProviderType.get(GsonParser.parseString(jsonObject.get("providerType")));
		providerData = GsonParser.parseObject(jsonObject.getAsJsonObject("providerData"), IntegrationJobProviderData.class);
		triggerType = IntegrationTriggerType.get(GsonParser.parseString(jsonObject.get("triggerType")));
		triggerData = GsonParser.parseObject(jsonObject.getAsJsonObject("triggerData"), IntegrationJobTriggerData.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIntegrationJobData");
		kparams.add("providerType", this.providerType);
		kparams.add("providerData", this.providerData);
		kparams.add("triggerType", this.triggerType);
		kparams.add("triggerData", this.triggerData);
		return kparams;
	}

}

