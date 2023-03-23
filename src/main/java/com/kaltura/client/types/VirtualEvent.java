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
import com.kaltura.client.enums.VirtualEventStatus;
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
@MultiRequestBuilder.Tokenizer(VirtualEvent.Tokenizer.class)
public class VirtualEvent extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String name();
		String description();
		String status();
		String tags();
		String attendeesGroupIds();
		String adminsGroupIds();
		String registrationScheduleEventId();
		String agendaScheduleEventId();
		String mainEventScheduleEventId();
		String createdAt();
		String updatedAt();
		String deletionDueDate();
		String registrationFormSchema();
	}

	private Integer id;
	private Integer partnerId;
	private String name;
	private String description;
	private VirtualEventStatus status;
	private String tags;
	private String attendeesGroupIds;
	private String adminsGroupIds;
	private Integer registrationScheduleEventId;
	private Integer agendaScheduleEventId;
	private Integer mainEventScheduleEventId;
	private Long createdAt;
	private Long updatedAt;
	private Long deletionDueDate;
	/**
	 * JSON-Schema of the Registration Form
	 */
	private String registrationFormSchema;

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

	// status:
	public VirtualEventStatus getStatus(){
		return this.status;
	}
	// tags:
	public String getTags(){
		return this.tags;
	}
	public void setTags(String tags){
		this.tags = tags;
	}

	public void tags(String multirequestToken){
		setToken("tags", multirequestToken);
	}

	// attendeesGroupIds:
	public String getAttendeesGroupIds(){
		return this.attendeesGroupIds;
	}
	public void setAttendeesGroupIds(String attendeesGroupIds){
		this.attendeesGroupIds = attendeesGroupIds;
	}

	public void attendeesGroupIds(String multirequestToken){
		setToken("attendeesGroupIds", multirequestToken);
	}

	// adminsGroupIds:
	public String getAdminsGroupIds(){
		return this.adminsGroupIds;
	}
	public void setAdminsGroupIds(String adminsGroupIds){
		this.adminsGroupIds = adminsGroupIds;
	}

	public void adminsGroupIds(String multirequestToken){
		setToken("adminsGroupIds", multirequestToken);
	}

	// registrationScheduleEventId:
	public Integer getRegistrationScheduleEventId(){
		return this.registrationScheduleEventId;
	}
	public void setRegistrationScheduleEventId(Integer registrationScheduleEventId){
		this.registrationScheduleEventId = registrationScheduleEventId;
	}

	public void registrationScheduleEventId(String multirequestToken){
		setToken("registrationScheduleEventId", multirequestToken);
	}

	// agendaScheduleEventId:
	public Integer getAgendaScheduleEventId(){
		return this.agendaScheduleEventId;
	}
	public void setAgendaScheduleEventId(Integer agendaScheduleEventId){
		this.agendaScheduleEventId = agendaScheduleEventId;
	}

	public void agendaScheduleEventId(String multirequestToken){
		setToken("agendaScheduleEventId", multirequestToken);
	}

	// mainEventScheduleEventId:
	public Integer getMainEventScheduleEventId(){
		return this.mainEventScheduleEventId;
	}
	public void setMainEventScheduleEventId(Integer mainEventScheduleEventId){
		this.mainEventScheduleEventId = mainEventScheduleEventId;
	}

	public void mainEventScheduleEventId(String multirequestToken){
		setToken("mainEventScheduleEventId", multirequestToken);
	}

	// createdAt:
	public Long getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Long getUpdatedAt(){
		return this.updatedAt;
	}
	// deletionDueDate:
	public Long getDeletionDueDate(){
		return this.deletionDueDate;
	}
	public void setDeletionDueDate(Long deletionDueDate){
		this.deletionDueDate = deletionDueDate;
	}

	public void deletionDueDate(String multirequestToken){
		setToken("deletionDueDate", multirequestToken);
	}

	// registrationFormSchema:
	public String getRegistrationFormSchema(){
		return this.registrationFormSchema;
	}
	public void setRegistrationFormSchema(String registrationFormSchema){
		this.registrationFormSchema = registrationFormSchema;
	}

	public void registrationFormSchema(String multirequestToken){
		setToken("registrationFormSchema", multirequestToken);
	}


	public VirtualEvent() {
		super();
	}

	public VirtualEvent(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		description = GsonParser.parseString(jsonObject.get("description"));
		status = VirtualEventStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		tags = GsonParser.parseString(jsonObject.get("tags"));
		attendeesGroupIds = GsonParser.parseString(jsonObject.get("attendeesGroupIds"));
		adminsGroupIds = GsonParser.parseString(jsonObject.get("adminsGroupIds"));
		registrationScheduleEventId = GsonParser.parseInt(jsonObject.get("registrationScheduleEventId"));
		agendaScheduleEventId = GsonParser.parseInt(jsonObject.get("agendaScheduleEventId"));
		mainEventScheduleEventId = GsonParser.parseInt(jsonObject.get("mainEventScheduleEventId"));
		createdAt = GsonParser.parseLong(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseLong(jsonObject.get("updatedAt"));
		deletionDueDate = GsonParser.parseLong(jsonObject.get("deletionDueDate"));
		registrationFormSchema = GsonParser.parseString(jsonObject.get("registrationFormSchema"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVirtualEvent");
		kparams.add("name", this.name);
		kparams.add("description", this.description);
		kparams.add("tags", this.tags);
		kparams.add("attendeesGroupIds", this.attendeesGroupIds);
		kparams.add("adminsGroupIds", this.adminsGroupIds);
		kparams.add("registrationScheduleEventId", this.registrationScheduleEventId);
		kparams.add("agendaScheduleEventId", this.agendaScheduleEventId);
		kparams.add("mainEventScheduleEventId", this.mainEventScheduleEventId);
		kparams.add("deletionDueDate", this.deletionDueDate);
		kparams.add("registrationFormSchema", this.registrationFormSchema);
		return kparams;
	}

}

