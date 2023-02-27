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
import com.kaltura.client.enums.ControlPanelCommandStatus;
import com.kaltura.client.enums.ControlPanelCommandTargetType;
import com.kaltura.client.enums.ControlPanelCommandType;
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
@MultiRequestBuilder.Tokenizer(ControlPanelCommand.Tokenizer.class)
public class ControlPanelCommand extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String createdAt();
		String createdBy();
		String updatedAt();
		String updatedBy();
		String createdById();
		String schedulerId();
		String workerId();
		String workerConfiguredId();
		String workerName();
		String batchIndex();
		String type();
		String targetType();
		String status();
		String cause();
		String description();
		String errorDescription();
	}

	/**
	 * The id of the Category
	 */
	private Integer id;
	/**
	 * Creation date as Unix timestamp (In seconds)
	 */
	private Long createdAt;
	/**
	 * Creator name
	 */
	private String createdBy;
	/**
	 * Update date as Unix timestamp (In seconds)
	 */
	private Long updatedAt;
	/**
	 * Updater name
	 */
	private String updatedBy;
	/**
	 * Creator id
	 */
	private Integer createdById;
	/**
	 * The id of the scheduler that the command refers to
	 */
	private Integer schedulerId;
	/**
	 * The id of the scheduler worker that the command refers to
	 */
	private Integer workerId;
	/**
	 * The id of the scheduler worker as configured in the ini file
	 */
	private Integer workerConfiguredId;
	/**
	 * The name of the scheduler worker that the command refers to
	 */
	private Integer workerName;
	/**
	 * The index of the batch process that the command refers to
	 */
	private Integer batchIndex;
	/**
	 * The command type - stop / start / config
	 */
	private ControlPanelCommandType type;
	/**
	 * The command target type - data center / scheduler / job / job type
	 */
	private ControlPanelCommandTargetType targetType;
	/**
	 * The command status
	 */
	private ControlPanelCommandStatus status;
	/**
	 * The reason for the command
	 */
	private String cause;
	/**
	 * Command description
	 */
	private String description;
	/**
	 * Error description
	 */
	private String errorDescription;

	// id:
	public Integer getId(){
		return this.id;
	}
	// createdAt:
	public Long getCreatedAt(){
		return this.createdAt;
	}
	// createdBy:
	public String getCreatedBy(){
		return this.createdBy;
	}
	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public void createdBy(String multirequestToken){
		setToken("createdBy", multirequestToken);
	}

	// updatedAt:
	public Long getUpdatedAt(){
		return this.updatedAt;
	}
	// updatedBy:
	public String getUpdatedBy(){
		return this.updatedBy;
	}
	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public void updatedBy(String multirequestToken){
		setToken("updatedBy", multirequestToken);
	}

	// createdById:
	public Integer getCreatedById(){
		return this.createdById;
	}
	public void setCreatedById(Integer createdById){
		this.createdById = createdById;
	}

	public void createdById(String multirequestToken){
		setToken("createdById", multirequestToken);
	}

	// schedulerId:
	public Integer getSchedulerId(){
		return this.schedulerId;
	}
	public void setSchedulerId(Integer schedulerId){
		this.schedulerId = schedulerId;
	}

	public void schedulerId(String multirequestToken){
		setToken("schedulerId", multirequestToken);
	}

	// workerId:
	public Integer getWorkerId(){
		return this.workerId;
	}
	public void setWorkerId(Integer workerId){
		this.workerId = workerId;
	}

	public void workerId(String multirequestToken){
		setToken("workerId", multirequestToken);
	}

	// workerConfiguredId:
	public Integer getWorkerConfiguredId(){
		return this.workerConfiguredId;
	}
	public void setWorkerConfiguredId(Integer workerConfiguredId){
		this.workerConfiguredId = workerConfiguredId;
	}

	public void workerConfiguredId(String multirequestToken){
		setToken("workerConfiguredId", multirequestToken);
	}

	// workerName:
	public Integer getWorkerName(){
		return this.workerName;
	}
	public void setWorkerName(Integer workerName){
		this.workerName = workerName;
	}

	public void workerName(String multirequestToken){
		setToken("workerName", multirequestToken);
	}

	// batchIndex:
	public Integer getBatchIndex(){
		return this.batchIndex;
	}
	public void setBatchIndex(Integer batchIndex){
		this.batchIndex = batchIndex;
	}

	public void batchIndex(String multirequestToken){
		setToken("batchIndex", multirequestToken);
	}

	// type:
	public ControlPanelCommandType getType(){
		return this.type;
	}
	public void setType(ControlPanelCommandType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// targetType:
	public ControlPanelCommandTargetType getTargetType(){
		return this.targetType;
	}
	public void setTargetType(ControlPanelCommandTargetType targetType){
		this.targetType = targetType;
	}

	public void targetType(String multirequestToken){
		setToken("targetType", multirequestToken);
	}

	// status:
	public ControlPanelCommandStatus getStatus(){
		return this.status;
	}
	public void setStatus(ControlPanelCommandStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// cause:
	public String getCause(){
		return this.cause;
	}
	public void setCause(String cause){
		this.cause = cause;
	}

	public void cause(String multirequestToken){
		setToken("cause", multirequestToken);
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

	// errorDescription:
	public String getErrorDescription(){
		return this.errorDescription;
	}
	public void setErrorDescription(String errorDescription){
		this.errorDescription = errorDescription;
	}

	public void errorDescription(String multirequestToken){
		setToken("errorDescription", multirequestToken);
	}


	public ControlPanelCommand() {
		super();
	}

	public ControlPanelCommand(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		createdAt = GsonParser.parseLong(jsonObject.get("createdAt"));
		createdBy = GsonParser.parseString(jsonObject.get("createdBy"));
		updatedAt = GsonParser.parseLong(jsonObject.get("updatedAt"));
		updatedBy = GsonParser.parseString(jsonObject.get("updatedBy"));
		createdById = GsonParser.parseInt(jsonObject.get("createdById"));
		schedulerId = GsonParser.parseInt(jsonObject.get("schedulerId"));
		workerId = GsonParser.parseInt(jsonObject.get("workerId"));
		workerConfiguredId = GsonParser.parseInt(jsonObject.get("workerConfiguredId"));
		workerName = GsonParser.parseInt(jsonObject.get("workerName"));
		batchIndex = GsonParser.parseInt(jsonObject.get("batchIndex"));
		type = ControlPanelCommandType.get(GsonParser.parseInt(jsonObject.get("type")));
		targetType = ControlPanelCommandTargetType.get(GsonParser.parseInt(jsonObject.get("targetType")));
		status = ControlPanelCommandStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		cause = GsonParser.parseString(jsonObject.get("cause"));
		description = GsonParser.parseString(jsonObject.get("description"));
		errorDescription = GsonParser.parseString(jsonObject.get("errorDescription"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaControlPanelCommand");
		kparams.add("createdBy", this.createdBy);
		kparams.add("updatedBy", this.updatedBy);
		kparams.add("createdById", this.createdById);
		kparams.add("schedulerId", this.schedulerId);
		kparams.add("workerId", this.workerId);
		kparams.add("workerConfiguredId", this.workerConfiguredId);
		kparams.add("workerName", this.workerName);
		kparams.add("batchIndex", this.batchIndex);
		kparams.add("type", this.type);
		kparams.add("targetType", this.targetType);
		kparams.add("status", this.status);
		kparams.add("cause", this.cause);
		kparams.add("description", this.description);
		kparams.add("errorDescription", this.errorDescription);
		return kparams;
	}

}

