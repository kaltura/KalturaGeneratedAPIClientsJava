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

import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.enums.ControlPanelCommandType;
import com.kaltura.client.enums.ControlPanelCommandTargetType;
import com.kaltura.client.enums.ControlPanelCommandStatus;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ControlPanelCommand extends ObjectBase {

	/**  The id of the Category  */
    private Integer id;
	/**  Creation date as Unix timestamp (In seconds)  */
    private Integer createdAt;
	/**  Creator name  */
    private String createdBy;
	/**  Update date as Unix timestamp (In seconds)  */
    private Integer updatedAt;
	/**  Updater name  */
    private String updatedBy;
	/**  Creator id  */
    private Integer createdById;
	/**  The id of the scheduler that the command refers to  */
    private Integer schedulerId;
	/**  The id of the scheduler worker that the command refers to  */
    private Integer workerId;
	/**  The id of the scheduler worker as configured in the ini file  */
    private Integer workerConfiguredId;
	/**  The name of the scheduler worker that the command refers to  */
    private Integer workerName;
	/**  The index of the batch process that the command refers to  */
    private Integer batchIndex;
	/**  The command type - stop / start / config  */
    private ControlPanelCommandType type;
	/**  The command target type - data center / scheduler / job / job type  */
    private ControlPanelCommandTargetType targetType;
	/**  The command status  */
    private ControlPanelCommandStatus status;
	/**  The reason for the command  */
    private String cause;
	/**  Command description  */
    private String description;
	/**  Error description  */
    private String errorDescription;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // createdBy:
    public String getCreatedBy(){
        return this.createdBy;
    }
    public void setCreatedBy(String createdBy){
        this.createdBy = createdBy;
    }

    // updatedAt:
    public Integer getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(Integer updatedAt){
        this.updatedAt = updatedAt;
    }

    // updatedBy:
    public String getUpdatedBy(){
        return this.updatedBy;
    }
    public void setUpdatedBy(String updatedBy){
        this.updatedBy = updatedBy;
    }

    // createdById:
    public Integer getCreatedById(){
        return this.createdById;
    }
    public void setCreatedById(Integer createdById){
        this.createdById = createdById;
    }

    // schedulerId:
    public Integer getSchedulerId(){
        return this.schedulerId;
    }
    public void setSchedulerId(Integer schedulerId){
        this.schedulerId = schedulerId;
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
    public Integer getWorkerName(){
        return this.workerName;
    }
    public void setWorkerName(Integer workerName){
        this.workerName = workerName;
    }

    // batchIndex:
    public Integer getBatchIndex(){
        return this.batchIndex;
    }
    public void setBatchIndex(Integer batchIndex){
        this.batchIndex = batchIndex;
    }

    // type:
    public ControlPanelCommandType getType(){
        return this.type;
    }
    public void setType(ControlPanelCommandType type){
        this.type = type;
    }

    // targetType:
    public ControlPanelCommandTargetType getTargetType(){
        return this.targetType;
    }
    public void setTargetType(ControlPanelCommandTargetType targetType){
        this.targetType = targetType;
    }

    // status:
    public ControlPanelCommandStatus getStatus(){
        return this.status;
    }
    public void setStatus(ControlPanelCommandStatus status){
        this.status = status;
    }

    // cause:
    public String getCause(){
        return this.cause;
    }
    public void setCause(String cause){
        this.cause = cause;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // errorDescription:
    public String getErrorDescription(){
        return this.errorDescription;
    }
    public void setErrorDescription(String errorDescription){
        this.errorDescription = errorDescription;
    }


    public ControlPanelCommand() {
       super();
    }

    public ControlPanelCommand(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        createdBy = GsonParser.parseString(jsonObject.get("createdBy"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
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

