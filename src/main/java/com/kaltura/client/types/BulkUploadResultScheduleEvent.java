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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUploadResultScheduleEvent.Tokenizer.class)
public class BulkUploadResultScheduleEvent extends BulkUploadResult {
	
	public interface Tokenizer extends BulkUploadResult.Tokenizer {
		String referenceId();
		String templateEntryId();
		String eventType();
		String title();
		String description();
		String tags();
		String categoryIds();
		String resourceId();
		String startTime();
		String duration();
		String endTime();
		String recurrence();
		String coEditors();
		String coPublishers();
		String eventOrganizerId();
		String contentOwnerId();
		String templateEntryType();
	}

	private String referenceId;
	private String templateEntryId;
	private Integer eventType;
	private String title;
	private String description;
	private String tags;
	private String categoryIds;
	/**
	 * ID of the resource specified for the new event.
	 */
	private String resourceId;
	private Integer startTime;
	private Integer duration;
	private Integer endTime;
	private String recurrence;
	private String coEditors;
	private String coPublishers;
	private String eventOrganizerId;
	private String contentOwnerId;
	private String templateEntryType;

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

	// templateEntryId:
	public String getTemplateEntryId(){
		return this.templateEntryId;
	}
	public void setTemplateEntryId(String templateEntryId){
		this.templateEntryId = templateEntryId;
	}

	public void templateEntryId(String multirequestToken){
		setToken("templateEntryId", multirequestToken);
	}

	// eventType:
	public Integer getEventType(){
		return this.eventType;
	}
	public void setEventType(Integer eventType){
		this.eventType = eventType;
	}

	public void eventType(String multirequestToken){
		setToken("eventType", multirequestToken);
	}

	// title:
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}

	public void title(String multirequestToken){
		setToken("title", multirequestToken);
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

	// categoryIds:
	public String getCategoryIds(){
		return this.categoryIds;
	}
	public void setCategoryIds(String categoryIds){
		this.categoryIds = categoryIds;
	}

	public void categoryIds(String multirequestToken){
		setToken("categoryIds", multirequestToken);
	}

	// resourceId:
	public String getResourceId(){
		return this.resourceId;
	}
	public void setResourceId(String resourceId){
		this.resourceId = resourceId;
	}

	public void resourceId(String multirequestToken){
		setToken("resourceId", multirequestToken);
	}

	// startTime:
	public Integer getStartTime(){
		return this.startTime;
	}
	public void setStartTime(Integer startTime){
		this.startTime = startTime;
	}

	public void startTime(String multirequestToken){
		setToken("startTime", multirequestToken);
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

	// endTime:
	public Integer getEndTime(){
		return this.endTime;
	}
	public void setEndTime(Integer endTime){
		this.endTime = endTime;
	}

	public void endTime(String multirequestToken){
		setToken("endTime", multirequestToken);
	}

	// recurrence:
	public String getRecurrence(){
		return this.recurrence;
	}
	public void setRecurrence(String recurrence){
		this.recurrence = recurrence;
	}

	public void recurrence(String multirequestToken){
		setToken("recurrence", multirequestToken);
	}

	// coEditors:
	public String getCoEditors(){
		return this.coEditors;
	}
	public void setCoEditors(String coEditors){
		this.coEditors = coEditors;
	}

	public void coEditors(String multirequestToken){
		setToken("coEditors", multirequestToken);
	}

	// coPublishers:
	public String getCoPublishers(){
		return this.coPublishers;
	}
	public void setCoPublishers(String coPublishers){
		this.coPublishers = coPublishers;
	}

	public void coPublishers(String multirequestToken){
		setToken("coPublishers", multirequestToken);
	}

	// eventOrganizerId:
	public String getEventOrganizerId(){
		return this.eventOrganizerId;
	}
	public void setEventOrganizerId(String eventOrganizerId){
		this.eventOrganizerId = eventOrganizerId;
	}

	public void eventOrganizerId(String multirequestToken){
		setToken("eventOrganizerId", multirequestToken);
	}

	// contentOwnerId:
	public String getContentOwnerId(){
		return this.contentOwnerId;
	}
	public void setContentOwnerId(String contentOwnerId){
		this.contentOwnerId = contentOwnerId;
	}

	public void contentOwnerId(String multirequestToken){
		setToken("contentOwnerId", multirequestToken);
	}

	// templateEntryType:
	public String getTemplateEntryType(){
		return this.templateEntryType;
	}
	public void setTemplateEntryType(String templateEntryType){
		this.templateEntryType = templateEntryType;
	}

	public void templateEntryType(String multirequestToken){
		setToken("templateEntryType", multirequestToken);
	}


	public BulkUploadResultScheduleEvent() {
		super();
	}

	public BulkUploadResultScheduleEvent(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		referenceId = GsonParser.parseString(jsonObject.get("referenceId"));
		templateEntryId = GsonParser.parseString(jsonObject.get("templateEntryId"));
		eventType = GsonParser.parseInt(jsonObject.get("eventType"));
		title = GsonParser.parseString(jsonObject.get("title"));
		description = GsonParser.parseString(jsonObject.get("description"));
		tags = GsonParser.parseString(jsonObject.get("tags"));
		categoryIds = GsonParser.parseString(jsonObject.get("categoryIds"));
		resourceId = GsonParser.parseString(jsonObject.get("resourceId"));
		startTime = GsonParser.parseInt(jsonObject.get("startTime"));
		duration = GsonParser.parseInt(jsonObject.get("duration"));
		endTime = GsonParser.parseInt(jsonObject.get("endTime"));
		recurrence = GsonParser.parseString(jsonObject.get("recurrence"));
		coEditors = GsonParser.parseString(jsonObject.get("coEditors"));
		coPublishers = GsonParser.parseString(jsonObject.get("coPublishers"));
		eventOrganizerId = GsonParser.parseString(jsonObject.get("eventOrganizerId"));
		contentOwnerId = GsonParser.parseString(jsonObject.get("contentOwnerId"));
		templateEntryType = GsonParser.parseString(jsonObject.get("templateEntryType"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUploadResultScheduleEvent");
		kparams.add("referenceId", this.referenceId);
		kparams.add("templateEntryId", this.templateEntryId);
		kparams.add("eventType", this.eventType);
		kparams.add("title", this.title);
		kparams.add("description", this.description);
		kparams.add("tags", this.tags);
		kparams.add("categoryIds", this.categoryIds);
		kparams.add("resourceId", this.resourceId);
		kparams.add("startTime", this.startTime);
		kparams.add("duration", this.duration);
		kparams.add("endTime", this.endTime);
		kparams.add("recurrence", this.recurrence);
		kparams.add("coEditors", this.coEditors);
		kparams.add("coPublishers", this.coPublishers);
		kparams.add("eventOrganizerId", this.eventOrganizerId);
		kparams.add("contentOwnerId", this.contentOwnerId);
		kparams.add("templateEntryType", this.templateEntryType);
		return kparams;
	}

}

