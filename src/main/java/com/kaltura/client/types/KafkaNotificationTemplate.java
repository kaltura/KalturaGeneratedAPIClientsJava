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
import com.kaltura.client.enums.KafkaNotificationFormat;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(KafkaNotificationTemplate.Tokenizer.class)
public class KafkaNotificationTemplate extends EventNotificationTemplate {
	
	public interface Tokenizer extends EventNotificationTemplate.Tokenizer {
		String topicName();
		String partitionKey();
		String messageFormat();
		String apiObjectType();
		String responseProfileSystemName();
		String requiresPermissions();
	}

	/**
	 * Define the content dynamic parameters
	 */
	private String topicName;
	/**
	 * Define the content dynamic parameters
	 */
	private String partitionKey;
	/**
	 * Define the content dynamic parameters
	 */
	private KafkaNotificationFormat messageFormat;
	/**
	 * Kaltura API object type
	 */
	private String apiObjectType;
	/**
	 * Kaltura response-profile system name
	 */
	private String responseProfileSystemName;
	/**
	 * Partner permissions needed to trigger the notification (comma seperated list of
	  permissions)
	 */
	private String requiresPermissions;

	// topicName:
	public String getTopicName(){
		return this.topicName;
	}
	public void setTopicName(String topicName){
		this.topicName = topicName;
	}

	public void topicName(String multirequestToken){
		setToken("topicName", multirequestToken);
	}

	// partitionKey:
	public String getPartitionKey(){
		return this.partitionKey;
	}
	public void setPartitionKey(String partitionKey){
		this.partitionKey = partitionKey;
	}

	public void partitionKey(String multirequestToken){
		setToken("partitionKey", multirequestToken);
	}

	// messageFormat:
	public KafkaNotificationFormat getMessageFormat(){
		return this.messageFormat;
	}
	public void setMessageFormat(KafkaNotificationFormat messageFormat){
		this.messageFormat = messageFormat;
	}

	public void messageFormat(String multirequestToken){
		setToken("messageFormat", multirequestToken);
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

	// responseProfileSystemName:
	public String getResponseProfileSystemName(){
		return this.responseProfileSystemName;
	}
	public void setResponseProfileSystemName(String responseProfileSystemName){
		this.responseProfileSystemName = responseProfileSystemName;
	}

	public void responseProfileSystemName(String multirequestToken){
		setToken("responseProfileSystemName", multirequestToken);
	}

	// requiresPermissions:
	public String getRequiresPermissions(){
		return this.requiresPermissions;
	}
	public void setRequiresPermissions(String requiresPermissions){
		this.requiresPermissions = requiresPermissions;
	}

	public void requiresPermissions(String multirequestToken){
		setToken("requiresPermissions", multirequestToken);
	}


	public KafkaNotificationTemplate() {
		super();
	}

	public KafkaNotificationTemplate(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		topicName = GsonParser.parseString(jsonObject.get("topicName"));
		partitionKey = GsonParser.parseString(jsonObject.get("partitionKey"));
		messageFormat = KafkaNotificationFormat.get(GsonParser.parseInt(jsonObject.get("messageFormat")));
		apiObjectType = GsonParser.parseString(jsonObject.get("apiObjectType"));
		responseProfileSystemName = GsonParser.parseString(jsonObject.get("responseProfileSystemName"));
		requiresPermissions = GsonParser.parseString(jsonObject.get("requiresPermissions"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaKafkaNotificationTemplate");
		kparams.add("topicName", this.topicName);
		kparams.add("partitionKey", this.partitionKey);
		kparams.add("messageFormat", this.messageFormat);
		kparams.add("apiObjectType", this.apiObjectType);
		kparams.add("responseProfileSystemName", this.responseProfileSystemName);
		kparams.add("requiresPermissions", this.requiresPermissions);
		return kparams;
	}

}

