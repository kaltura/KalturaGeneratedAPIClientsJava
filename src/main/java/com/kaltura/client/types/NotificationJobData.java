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
import com.kaltura.client.enums.NotificationObjectType;
import com.kaltura.client.enums.NotificationStatus;
import com.kaltura.client.enums.NotificationType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(NotificationJobData.Tokenizer.class)
public class NotificationJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String userId();
		String type();
		String typeAsString();
		String objectId();
		String status();
		String data();
		String numberOfAttempts();
		String notificationResult();
		String objType();
	}

	private String userId;
	private NotificationType type;
	private String typeAsString;
	private String objectId;
	private NotificationStatus status;
	private String data;
	private Integer numberOfAttempts;
	private String notificationResult;
	private NotificationObjectType objType;

	// userId:
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
	}

	// type:
	public NotificationType getType(){
		return this.type;
	}
	public void setType(NotificationType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// typeAsString:
	public String getTypeAsString(){
		return this.typeAsString;
	}
	public void setTypeAsString(String typeAsString){
		this.typeAsString = typeAsString;
	}

	public void typeAsString(String multirequestToken){
		setToken("typeAsString", multirequestToken);
	}

	// objectId:
	public String getObjectId(){
		return this.objectId;
	}
	public void setObjectId(String objectId){
		this.objectId = objectId;
	}

	public void objectId(String multirequestToken){
		setToken("objectId", multirequestToken);
	}

	// status:
	public NotificationStatus getStatus(){
		return this.status;
	}
	public void setStatus(NotificationStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

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

	// numberOfAttempts:
	public Integer getNumberOfAttempts(){
		return this.numberOfAttempts;
	}
	public void setNumberOfAttempts(Integer numberOfAttempts){
		this.numberOfAttempts = numberOfAttempts;
	}

	public void numberOfAttempts(String multirequestToken){
		setToken("numberOfAttempts", multirequestToken);
	}

	// notificationResult:
	public String getNotificationResult(){
		return this.notificationResult;
	}
	public void setNotificationResult(String notificationResult){
		this.notificationResult = notificationResult;
	}

	public void notificationResult(String multirequestToken){
		setToken("notificationResult", multirequestToken);
	}

	// objType:
	public NotificationObjectType getObjType(){
		return this.objType;
	}
	public void setObjType(NotificationObjectType objType){
		this.objType = objType;
	}

	public void objType(String multirequestToken){
		setToken("objType", multirequestToken);
	}


	public NotificationJobData() {
		super();
	}

	public NotificationJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		userId = GsonParser.parseString(jsonObject.get("userId"));
		type = NotificationType.get(GsonParser.parseInt(jsonObject.get("type")));
		typeAsString = GsonParser.parseString(jsonObject.get("typeAsString"));
		objectId = GsonParser.parseString(jsonObject.get("objectId"));
		status = NotificationStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		data = GsonParser.parseString(jsonObject.get("data"));
		numberOfAttempts = GsonParser.parseInt(jsonObject.get("numberOfAttempts"));
		notificationResult = GsonParser.parseString(jsonObject.get("notificationResult"));
		objType = NotificationObjectType.get(GsonParser.parseInt(jsonObject.get("objType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaNotificationJobData");
		kparams.add("userId", this.userId);
		kparams.add("type", this.type);
		kparams.add("typeAsString", this.typeAsString);
		kparams.add("objectId", this.objectId);
		kparams.add("status", this.status);
		kparams.add("data", this.data);
		kparams.add("numberOfAttempts", this.numberOfAttempts);
		kparams.add("notificationResult", this.notificationResult);
		kparams.add("objType", this.objType);
		return kparams;
	}

}

