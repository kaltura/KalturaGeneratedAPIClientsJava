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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class SchedulerConfig extends ObjectBase {

	/**  The id of the Category  */
    private Integer id;
	/**  Creator name  */
    private String createdBy;
	/**  Updater name  */
    private String updatedBy;
	/**  Id of the control panel command that created this config item  */
    private String commandId;
	/**  The status of the control panel command  */
    private String commandStatus;
	/**  The id of the scheduler  */
    private Integer schedulerId;
	/**  The configured id of the scheduler  */
    private Integer schedulerConfiguredId;
	/**  The name of the scheduler  */
    private String schedulerName;
	/**  The id of the job worker  */
    private Integer workerId;
	/**  The configured id of the job worker  */
    private Integer workerConfiguredId;
	/**  The name of the job worker  */
    private String workerName;
	/**  The name of the variable  */
    private String variable;
	/**  The part of the variable  */
    private String variablePart;
	/**  The value of the variable  */
    private String value;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // createdBy:
    public String getCreatedBy(){
        return this.createdBy;
    }
    public void setCreatedBy(String createdBy){
        this.createdBy = createdBy;
    }

    // updatedBy:
    public String getUpdatedBy(){
        return this.updatedBy;
    }
    public void setUpdatedBy(String updatedBy){
        this.updatedBy = updatedBy;
    }

    // commandId:
    public String getCommandId(){
        return this.commandId;
    }
    public void setCommandId(String commandId){
        this.commandId = commandId;
    }

    // commandStatus:
    public String getCommandStatus(){
        return this.commandStatus;
    }
    public void setCommandStatus(String commandStatus){
        this.commandStatus = commandStatus;
    }

    // schedulerId:
    public Integer getSchedulerId(){
        return this.schedulerId;
    }
    public void setSchedulerId(Integer schedulerId){
        this.schedulerId = schedulerId;
    }

    // schedulerConfiguredId:
    public Integer getSchedulerConfiguredId(){
        return this.schedulerConfiguredId;
    }
    public void setSchedulerConfiguredId(Integer schedulerConfiguredId){
        this.schedulerConfiguredId = schedulerConfiguredId;
    }

    // schedulerName:
    public String getSchedulerName(){
        return this.schedulerName;
    }
    public void setSchedulerName(String schedulerName){
        this.schedulerName = schedulerName;
    }

    // workerId:
    public Integer getWorkerId(){
        return this.workerId;
    }
    public void setWorkerId(Integer workerId){
        this.workerId = workerId;
    }

    // workerConfiguredId:
    public Integer getWorkerConfiguredId(){
        return this.workerConfiguredId;
    }
    public void setWorkerConfiguredId(Integer workerConfiguredId){
        this.workerConfiguredId = workerConfiguredId;
    }

    // workerName:
    public String getWorkerName(){
        return this.workerName;
    }
    public void setWorkerName(String workerName){
        this.workerName = workerName;
    }

    // variable:
    public String getVariable(){
        return this.variable;
    }
    public void setVariable(String variable){
        this.variable = variable;
    }

    // variablePart:
    public String getVariablePart(){
        return this.variablePart;
    }
    public void setVariablePart(String variablePart){
        this.variablePart = variablePart;
    }

    // value:
    public String getValue(){
        return this.value;
    }
    public void setValue(String value){
        this.value = value;
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

