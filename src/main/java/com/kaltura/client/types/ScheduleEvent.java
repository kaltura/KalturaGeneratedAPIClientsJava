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
// Copyright (C) 2006-2021  Kaltura Inc.
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
import com.kaltura.client.enums.ScheduleEventClassificationType;
import com.kaltura.client.enums.ScheduleEventRecurrenceType;
import com.kaltura.client.enums.ScheduleEventStatus;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.types.ScheduleEventRecurrence;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ScheduleEvent.Tokenizer.class)
public abstract class ScheduleEvent extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String parentId();
		String summary();
		String description();
		String status();
		String startDate();
		String endDate();
		String referenceId();
		String classificationType();
		String geoLatitude();
		String geoLongitude();
		String location();
		String organizer();
		String ownerId();
		String priority();
		String sequence();
		String recurrenceType();
		String duration();
		String contact();
		String comment();
		String tags();
		String createdAt();
		String updatedAt();
		ScheduleEventRecurrence.Tokenizer recurrence();
	}

	/**
	 * Auto-generated unique identifier
	 */
	private Integer id;
	private Integer partnerId;
	private Integer parentId;
	/**
	 * Defines a short summary or subject for the event
	 */
	private String summary;
	private String description;
	private ScheduleEventStatus status;
	private Integer startDate;
	private Integer endDate;
	private String referenceId;
	private ScheduleEventClassificationType classificationType;
	/**
	 * Specifies the global position for the activity
	 */
	private Double geoLatitude;
	/**
	 * Specifies the global position for the activity
	 */
	private Double geoLongitude;
	/**
	 * Defines the intended venue for the activity
	 */
	private String location;
	private String organizer;
	private String ownerId;
	/**
	 * The value for the priority field.
	 */
	private Integer priority;
	/**
	 * Defines the revision sequence number.
	 */
	private Integer sequence;
	private ScheduleEventRecurrenceType recurrenceType;
	/**
	 * Duration in seconds
	 */
	private Integer duration;
	/**
	 * Used to represent contact information or alternately a reference to contact
	  information.
	 */
	private String contact;
	/**
	 * Specifies non-processing information intended to provide a comment to the
	  calendar user.
	 */
	private String comment;
	private String tags;
	/**
	 * Creation date as Unix timestamp (In seconds)
	 */
	private Integer createdAt;
	/**
	 * Last update as Unix timestamp (In seconds)
	 */
	private Integer updatedAt;
	private ScheduleEventRecurrence recurrence;

	// id:
	public Integer getId(){
		return this.id;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// parentId:
	public Integer getParentId(){
		return this.parentId;
	}
	// summary:
	public String getSummary(){
		return this.summary;
	}
	public void setSummary(String summary){
		this.summary = summary;
	}

	public void summary(String multirequestToken){
		setToken("summary", multirequestToken);
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
	public ScheduleEventStatus getStatus(){
		return this.status;
	}
	// startDate:
	public Integer getStartDate(){
		return this.startDate;
	}
	public void setStartDate(Integer startDate){
		this.startDate = startDate;
	}

	public void startDate(String multirequestToken){
		setToken("startDate", multirequestToken);
	}

	// endDate:
	public Integer getEndDate(){
		return this.endDate;
	}
	public void setEndDate(Integer endDate){
		this.endDate = endDate;
	}

	public void endDate(String multirequestToken){
		setToken("endDate", multirequestToken);
	}

	// referenceId:
	public String getReferenceId(){
		return this.referenceId;
	}
	public void setReferenceId(String referenceId){
		this.referenceId = referenceId;
	}

	public void referenceId(String multirequestToken){
		setToken("referenceId", multirequestToken);
	}

	// classificationType:
	public ScheduleEventClassificationType getClassificationType(){
		return this.classificationType;
	}
	public void setClassificationType(ScheduleEventClassificationType classificationType){
		this.classificationType = classificationType;
	}

	public void classificationType(String multirequestToken){
		setToken("classificationType", multirequestToken);
	}

	// geoLatitude:
	public Double getGeoLatitude(){
		return this.geoLatitude;
	}
	public void setGeoLatitude(Double geoLatitude){
		this.geoLatitude = geoLatitude;
	}

	public void geoLatitude(String multirequestToken){
		setToken("geoLatitude", multirequestToken);
	}

	// geoLongitude:
	public Double getGeoLongitude(){
		return this.geoLongitude;
	}
	public void setGeoLongitude(Double geoLongitude){
		this.geoLongitude = geoLongitude;
	}

	public void geoLongitude(String multirequestToken){
		setToken("geoLongitude", multirequestToken);
	}

	// location:
	public String getLocation(){
		return this.location;
	}
	public void setLocation(String location){
		this.location = location;
	}

	public void location(String multirequestToken){
		setToken("location", multirequestToken);
	}

	// organizer:
	public String getOrganizer(){
		return this.organizer;
	}
	public void setOrganizer(String organizer){
		this.organizer = organizer;
	}

	public void organizer(String multirequestToken){
		setToken("organizer", multirequestToken);
	}

	// ownerId:
	public String getOwnerId(){
		return this.ownerId;
	}
	public void setOwnerId(String ownerId){
		this.ownerId = ownerId;
	}

	public void ownerId(String multirequestToken){
		setToken("ownerId", multirequestToken);
	}

	// priority:
	public Integer getPriority(){
		return this.priority;
	}
	public void setPriority(Integer priority){
		this.priority = priority;
	}

	public void priority(String multirequestToken){
		setToken("priority", multirequestToken);
	}

	// sequence:
	public Integer getSequence(){
		return this.sequence;
	}
	public void setSequence(Integer sequence){
		this.sequence = sequence;
	}

	public void sequence(String multirequestToken){
		setToken("sequence", multirequestToken);
	}

	// recurrenceType:
	public ScheduleEventRecurrenceType getRecurrenceType(){
		return this.recurrenceType;
	}
	public void setRecurrenceType(ScheduleEventRecurrenceType recurrenceType){
		this.recurrenceType = recurrenceType;
	}

	public void recurrenceType(String multirequestToken){
		setToken("recurrenceType", multirequestToken);
	}

	// duration:
	public Integer getDuration(){
		return this.duration;
	}
	public void setDuration(Integer duration){
		this.duration = duration;
	}

	public void duration(String multirequestToken){
		setToken("duration", multirequestToken);
	}

	// contact:
	public String getContact(){
		return this.contact;
	}
	public void setContact(String contact){
		this.contact = contact;
	}

	public void contact(String multirequestToken){
		setToken("contact", multirequestToken);
	}

	// comment:
	public String getComment(){
		return this.comment;
	}
	public void setComment(String comment){
		this.comment = comment;
	}

	public void comment(String multirequestToken){
		setToken("comment", multirequestToken);
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

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// recurrence:
	public ScheduleEventRecurrence getRecurrence(){
		return this.recurrence;
	}
	public void setRecurrence(ScheduleEventRecurrence recurrence){
		this.recurrence = recurrence;
	}


	public ScheduleEvent() {
		super();
	}

	public ScheduleEvent(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		parentId = GsonParser.parseInt(jsonObject.get("parentId"));
		summary = GsonParser.parseString(jsonObject.get("summary"));
		description = GsonParser.parseString(jsonObject.get("description"));
		status = ScheduleEventStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		startDate = GsonParser.parseInt(jsonObject.get("startDate"));
		endDate = GsonParser.parseInt(jsonObject.get("endDate"));
		referenceId = GsonParser.parseString(jsonObject.get("referenceId"));
		classificationType = ScheduleEventClassificationType.get(GsonParser.parseInt(jsonObject.get("classificationType")));
		geoLatitude = GsonParser.parseDouble(jsonObject.get("geoLatitude"));
		geoLongitude = GsonParser.parseDouble(jsonObject.get("geoLongitude"));
		location = GsonParser.parseString(jsonObject.get("location"));
		organizer = GsonParser.parseString(jsonObject.get("organizer"));
		ownerId = GsonParser.parseString(jsonObject.get("ownerId"));
		priority = GsonParser.parseInt(jsonObject.get("priority"));
		sequence = GsonParser.parseInt(jsonObject.get("sequence"));
		recurrenceType = ScheduleEventRecurrenceType.get(GsonParser.parseInt(jsonObject.get("recurrenceType")));
		duration = GsonParser.parseInt(jsonObject.get("duration"));
		contact = GsonParser.parseString(jsonObject.get("contact"));
		comment = GsonParser.parseString(jsonObject.get("comment"));
		tags = GsonParser.parseString(jsonObject.get("tags"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		recurrence = GsonParser.parseObject(jsonObject.getAsJsonObject("recurrence"), ScheduleEventRecurrence.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaScheduleEvent");
		kparams.add("summary", this.summary);
		kparams.add("description", this.description);
		kparams.add("startDate", this.startDate);
		kparams.add("endDate", this.endDate);
		kparams.add("referenceId", this.referenceId);
		kparams.add("classificationType", this.classificationType);
		kparams.add("geoLatitude", this.geoLatitude);
		kparams.add("geoLongitude", this.geoLongitude);
		kparams.add("location", this.location);
		kparams.add("organizer", this.organizer);
		kparams.add("ownerId", this.ownerId);
		kparams.add("priority", this.priority);
		kparams.add("sequence", this.sequence);
		kparams.add("recurrenceType", this.recurrenceType);
		kparams.add("duration", this.duration);
		kparams.add("contact", this.contact);
		kparams.add("comment", this.comment);
		kparams.add("tags", this.tags);
		kparams.add("recurrence", this.recurrence);
		return kparams;
	}

}

