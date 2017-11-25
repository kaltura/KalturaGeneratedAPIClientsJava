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
import com.kaltura.client.enums.ObjectFilterEngineType;
import com.kaltura.client.enums.ScheduledTaskProfileStatus;
import com.kaltura.client.types.Filter;
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
@MultiRequestBuilder.Tokenizer(ScheduledTaskProfile.Tokenizer.class)
public class ScheduledTaskProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String partnerId();
		String name();
		String systemName();
		String description();
		String status();
		String objectFilterEngineType();
		Filter.Tokenizer objectFilter();
		RequestBuilder.ListTokenizer<ObjectTask.Tokenizer> objectTasks();
		String createdAt();
		String updatedAt();
		String lastExecutionStartedAt();
		String maxTotalCountAllowed();
	}

	private Integer id;
	private Integer partnerId;
	private String name;
	private String systemName;
	private String description;
	private ScheduledTaskProfileStatus status;
	/**
	 * The type of engine to use to list objects using the given "objectFilter"
	 */
	private ObjectFilterEngineType objectFilterEngineType;
	/**
	 * A filter object (inherits KalturaFilter) that is used to list objects for
	  scheduled tasks
	 */
	private Filter objectFilter;
	/**
	 * A list of tasks to execute on the founded objects
	 */
	private List<ObjectTask> objectTasks;
	private Integer createdAt;
	private Integer updatedAt;
	private Integer lastExecutionStartedAt;
	/**
	 * The maximum number of result count allowed to be processed by this profile per
	  execution
	 */
	private Integer maxTotalCountAllowed;

	// id:
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	public void setPartnerId(Integer partnerId){
		this.partnerId = partnerId;
	}

	public void partnerId(String multirequestToken){
		setToken("partnerId", multirequestToken);
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

	// status:
	public ScheduledTaskProfileStatus getStatus(){
		return this.status;
	}
	public void setStatus(ScheduledTaskProfileStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// objectFilterEngineType:
	public ObjectFilterEngineType getObjectFilterEngineType(){
		return this.objectFilterEngineType;
	}
	public void setObjectFilterEngineType(ObjectFilterEngineType objectFilterEngineType){
		this.objectFilterEngineType = objectFilterEngineType;
	}

	public void objectFilterEngineType(String multirequestToken){
		setToken("objectFilterEngineType", multirequestToken);
	}

	// objectFilter:
	public Filter getObjectFilter(){
		return this.objectFilter;
	}
	public void setObjectFilter(Filter objectFilter){
		this.objectFilter = objectFilter;
	}

	// objectTasks:
	public List<ObjectTask> getObjectTasks(){
		return this.objectTasks;
	}
	public void setObjectTasks(List<ObjectTask> objectTasks){
		this.objectTasks = objectTasks;
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	public void setCreatedAt(Integer createdAt){
		this.createdAt = createdAt;
	}

	public void createdAt(String multirequestToken){
		setToken("createdAt", multirequestToken);
	}

	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	public void setUpdatedAt(Integer updatedAt){
		this.updatedAt = updatedAt;
	}

	public void updatedAt(String multirequestToken){
		setToken("updatedAt", multirequestToken);
	}

	// lastExecutionStartedAt:
	public Integer getLastExecutionStartedAt(){
		return this.lastExecutionStartedAt;
	}
	public void setLastExecutionStartedAt(Integer lastExecutionStartedAt){
		this.lastExecutionStartedAt = lastExecutionStartedAt;
	}

	public void lastExecutionStartedAt(String multirequestToken){
		setToken("lastExecutionStartedAt", multirequestToken);
	}

	// maxTotalCountAllowed:
	public Integer getMaxTotalCountAllowed(){
		return this.maxTotalCountAllowed;
	}
	public void setMaxTotalCountAllowed(Integer maxTotalCountAllowed){
		this.maxTotalCountAllowed = maxTotalCountAllowed;
	}

	public void maxTotalCountAllowed(String multirequestToken){
		setToken("maxTotalCountAllowed", multirequestToken);
	}


	public ScheduledTaskProfile() {
		super();
	}

	public ScheduledTaskProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		description = GsonParser.parseString(jsonObject.get("description"));
		status = ScheduledTaskProfileStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		objectFilterEngineType = ObjectFilterEngineType.get(GsonParser.parseString(jsonObject.get("objectFilterEngineType")));
		objectFilter = GsonParser.parseObject(jsonObject.getAsJsonObject("objectFilter"), Filter.class);
		objectTasks = GsonParser.parseArray(jsonObject.getAsJsonArray("objectTasks"), ObjectTask.class);
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		lastExecutionStartedAt = GsonParser.parseInt(jsonObject.get("lastExecutionStartedAt"));
		maxTotalCountAllowed = GsonParser.parseInt(jsonObject.get("maxTotalCountAllowed"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaScheduledTaskProfile");
		kparams.add("name", this.name);
		kparams.add("systemName", this.systemName);
		kparams.add("description", this.description);
		kparams.add("status", this.status);
		kparams.add("objectFilterEngineType", this.objectFilterEngineType);
		kparams.add("objectFilter", this.objectFilter);
		kparams.add("objectTasks", this.objectTasks);
		kparams.add("lastExecutionStartedAt", this.lastExecutionStartedAt);
		kparams.add("maxTotalCountAllowed", this.maxTotalCountAllowed);
		return kparams;
	}

}

