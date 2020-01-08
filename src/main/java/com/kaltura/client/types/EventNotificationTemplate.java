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
import com.kaltura.client.enums.EventNotificationEventObjectType;
import com.kaltura.client.enums.EventNotificationEventType;
import com.kaltura.client.enums.EventNotificationTemplateStatus;
import com.kaltura.client.enums.EventNotificationTemplateType;
import com.kaltura.client.types.ObjectBase;
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
@MultiRequestBuilder.Tokenizer(EventNotificationTemplate.Tokenizer.class)
public class EventNotificationTemplate extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String name();
		String systemName();
		String description();
		String type();
		String status();
		String createdAt();
		String updatedAt();
		String manualDispatchEnabled();
		String automaticDispatchEnabled();
		String eventType();
		String eventObjectType();
		RequestBuilder.ListTokenizer<Condition.Tokenizer> eventConditions();
		RequestBuilder.ListTokenizer<EventNotificationParameter.Tokenizer> contentParameters();
		RequestBuilder.ListTokenizer<EventNotificationParameter.Tokenizer> userParameters();
	}

	private Integer id;
	private Integer partnerId;
	private String name;
	private String systemName;
	private String description;
	private EventNotificationTemplateType type;
	private EventNotificationTemplateStatus status;
	private Integer createdAt;
	private Integer updatedAt;
	/**
	 * Define that the template could be dispatched manually from the API
	 */
	private Boolean manualDispatchEnabled;
	/**
	 * Define that the template could be dispatched automatically by the system
	 */
	private Boolean automaticDispatchEnabled;
	/**
	 * Define the event that should trigger this notification
	 */
	private EventNotificationEventType eventType;
	/**
	 * Define the object that raied the event that should trigger this notification
	 */
	private EventNotificationEventObjectType eventObjectType;
	/**
	 * Define the conditions that cause this notification to be triggered
	 */
	private List<Condition> eventConditions;
	/**
	 * Define the content dynamic parameters
	 */
	private List<EventNotificationParameter> contentParameters;
	/**
	 * Define the content dynamic parameters
	 */
	private List<EventNotificationParameter> userParameters;

	// id:
	public Integer getId(){
		return this.id;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
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

	// type:
	public EventNotificationTemplateType getType(){
		return this.type;
	}
	public void setType(EventNotificationTemplateType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// status:
	public EventNotificationTemplateStatus getStatus(){
		return this.status;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// manualDispatchEnabled:
	public Boolean getManualDispatchEnabled(){
		return this.manualDispatchEnabled;
	}
	public void setManualDispatchEnabled(Boolean manualDispatchEnabled){
		this.manualDispatchEnabled = manualDispatchEnabled;
	}

	public void manualDispatchEnabled(String multirequestToken){
		setToken("manualDispatchEnabled", multirequestToken);
	}

	// automaticDispatchEnabled:
	public Boolean getAutomaticDispatchEnabled(){
		return this.automaticDispatchEnabled;
	}
	public void setAutomaticDispatchEnabled(Boolean automaticDispatchEnabled){
		this.automaticDispatchEnabled = automaticDispatchEnabled;
	}

	public void automaticDispatchEnabled(String multirequestToken){
		setToken("automaticDispatchEnabled", multirequestToken);
	}

	// eventType:
	public EventNotificationEventType getEventType(){
		return this.eventType;
	}
	public void setEventType(EventNotificationEventType eventType){
		this.eventType = eventType;
	}

	public void eventType(String multirequestToken){
		setToken("eventType", multirequestToken);
	}

	// eventObjectType:
	public EventNotificationEventObjectType getEventObjectType(){
		return this.eventObjectType;
	}
	public void setEventObjectType(EventNotificationEventObjectType eventObjectType){
		this.eventObjectType = eventObjectType;
	}

	public void eventObjectType(String multirequestToken){
		setToken("eventObjectType", multirequestToken);
	}

	// eventConditions:
	public List<Condition> getEventConditions(){
		return this.eventConditions;
	}
	public void setEventConditions(List<Condition> eventConditions){
		this.eventConditions = eventConditions;
	}

	// contentParameters:
	public List<EventNotificationParameter> getContentParameters(){
		return this.contentParameters;
	}
	public void setContentParameters(List<EventNotificationParameter> contentParameters){
		this.contentParameters = contentParameters;
	}

	// userParameters:
	public List<EventNotificationParameter> getUserParameters(){
		return this.userParameters;
	}
	public void setUserParameters(List<EventNotificationParameter> userParameters){
		this.userParameters = userParameters;
	}


	public EventNotificationTemplate() {
		super();
	}

	public EventNotificationTemplate(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		description = GsonParser.parseString(jsonObject.get("description"));
		type = EventNotificationTemplateType.get(GsonParser.parseString(jsonObject.get("type")));
		status = EventNotificationTemplateStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		manualDispatchEnabled = GsonParser.parseBoolean(jsonObject.get("manualDispatchEnabled"));
		automaticDispatchEnabled = GsonParser.parseBoolean(jsonObject.get("automaticDispatchEnabled"));
		eventType = EventNotificationEventType.get(GsonParser.parseString(jsonObject.get("eventType")));
		eventObjectType = EventNotificationEventObjectType.get(GsonParser.parseString(jsonObject.get("eventObjectType")));
		eventConditions = GsonParser.parseArray(jsonObject.getAsJsonArray("eventConditions"), Condition.class);
		contentParameters = GsonParser.parseArray(jsonObject.getAsJsonArray("contentParameters"), EventNotificationParameter.class);
		userParameters = GsonParser.parseArray(jsonObject.getAsJsonArray("userParameters"), EventNotificationParameter.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEventNotificationTemplate");
		kparams.add("name", this.name);
		kparams.add("systemName", this.systemName);
		kparams.add("description", this.description);
		kparams.add("type", this.type);
		kparams.add("manualDispatchEnabled", this.manualDispatchEnabled);
		kparams.add("automaticDispatchEnabled", this.automaticDispatchEnabled);
		kparams.add("eventType", this.eventType);
		kparams.add("eventObjectType", this.eventObjectType);
		kparams.add("eventConditions", this.eventConditions);
		kparams.add("contentParameters", this.contentParameters);
		kparams.add("userParameters", this.userParameters);
		return kparams;
	}

}

