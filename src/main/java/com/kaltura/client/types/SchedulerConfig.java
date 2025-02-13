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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SchedulerConfig.Tokenizer.class)
public class SchedulerConfig extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String createdBy();
		String updatedBy();
		String commandId();
		String commandStatus();
		String schedulerId();
		String schedulerConfiguredId();
		String schedulerName();
		String workerId();
		String workerConfiguredId();
		String workerName();
		String variable();
		String variablePart();
		String value();
	}

	/**
	 * The id of the Category
	 */
	private Integer id;
	/**
	 * Creator name
	 */
	private String createdBy;
	/**
	 * Updater name
	 */
	private String updatedBy;
	/**
	 * Id of the control panel command that created this config item
	 */
	private String commandId;
	/**
	 * The status of the control panel command
	 */
	private String commandStatus;
	/**
	 * The id of the scheduler
	 */
	private Integer schedulerId;
	/**
	 * The configured id of the scheduler
	 */
	private Integer schedulerConfiguredId;
	/**
	 * The name of the scheduler
	 */
	private String schedulerName;
	/**
	 * The id of the job worker
	 */
	private Integer workerId;
	/**
	 * The configured id of the job worker
	 */
	private Integer workerConfiguredId;
	/**
	 * The name of the job worker
	 */
	private String workerName;
	/**
	 * The name of the variable
	 */
	private String variable;
	/**
	 * The part of the variable
	 */
	private String variablePart;
	/**
	 * The value of the variable
	 */
	private String value;

	// id:
	public Integer getId(){
		return this.id;
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

	// commandId:
	public String getCommandId(){
		return this.commandId;
	}
	public void setCommandId(String commandId){
		this.commandId = commandId;
	}

	public void commandId(String multirequestToken){
		setToken("commandId", multirequestToken);
	}

	// commandStatus:
	public String getCommandStatus(){
		return this.commandStatus;
	}
	public void setCommandStatus(String commandStatus){
		this.commandStatus = commandStatus;
	}

	public void commandStatus(String multirequestToken){
		setToken("commandStatus", multirequestToken);
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

	// schedulerConfiguredId:
	public Integer getSchedulerConfiguredId(){
		return this.schedulerConfiguredId;
	}
	public void setSchedulerConfiguredId(Integer schedulerConfiguredId){
		this.schedulerConfiguredId = schedulerConfiguredId;
	}

	public void schedulerConfiguredId(String multirequestToken){
		setToken("schedulerConfiguredId", multirequestToken);
	}

	// schedulerName:
	public String getSchedulerName(){
		return this.schedulerName;
	}
	public void setSchedulerName(String schedulerName){
		this.schedulerName = schedulerName;
	}

	public void schedulerName(String multirequestToken){
		setToken("schedulerName", multirequestToken);
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
	public String getWorkerName(){
		return this.workerName;
	}
	public void setWorkerName(String workerName){
		this.workerName = workerName;
	}

	public void workerName(String multirequestToken){
		setToken("workerName", multirequestToken);
	}

	// variable:
	public String getVariable(){
		return this.variable;
	}
	public void setVariable(String variable){
		this.variable = variable;
	}

	public void variable(String multirequestToken){
		setToken("variable", multirequestToken);
	}

	// variablePart:
	public String getVariablePart(){
		return this.variablePart;
	}
	public void setVariablePart(String variablePart){
		this.variablePart = variablePart;
	}

	public void variablePart(String multirequestToken){
		setToken("variablePart", multirequestToken);
	}

	// value:
	public String getValue(){
		return this.value;
	}
	public void setValue(String value){
		this.value = value;
	}

	public void value(String multirequestToken){
		setToken("value", multirequestToken);
	}


	public SchedulerConfig() {
		super();
	}

	public SchedulerConfig(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		createdBy = GsonParser.parseString(jsonObject.get("createdBy"));
		updatedBy = GsonParser.parseString(jsonObject.get("updatedBy"));
		commandId = GsonParser.parseString(jsonObject.get("commandId"));
		commandStatus = GsonParser.parseString(jsonObject.get("commandStatus"));
		schedulerId = GsonParser.parseInt(jsonObject.get("schedulerId"));
		schedulerConfiguredId = GsonParser.parseInt(jsonObject.get("schedulerConfiguredId"));
		schedulerName = GsonParser.parseString(jsonObject.get("schedulerName"));
		workerId = GsonParser.parseInt(jsonObject.get("workerId"));
		workerConfiguredId = GsonParser.parseInt(jsonObject.get("workerConfiguredId"));
		workerName = GsonParser.parseString(jsonObject.get("workerName"));
		variable = GsonParser.parseString(jsonObject.get("variable"));
		variablePart = GsonParser.parseString(jsonObject.get("variablePart"));
		value = GsonParser.parseString(jsonObject.get("value"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSchedulerConfig");
		kparams.add("createdBy", this.createdBy);
		kparams.add("updatedBy", this.updatedBy);
		kparams.add("commandId", this.commandId);
		kparams.add("commandStatus", this.commandStatus);
		kparams.add("schedulerId", this.schedulerId);
		kparams.add("schedulerConfiguredId", this.schedulerConfiguredId);
		kparams.add("schedulerName", this.schedulerName);
		kparams.add("workerId", this.workerId);
		kparams.add("workerConfiguredId", this.workerConfiguredId);
		kparams.add("workerName", this.workerName);
		kparams.add("variable", this.variable);
		kparams.add("variablePart", this.variablePart);
		kparams.add("value", this.value);
		return kparams;
	}

}

