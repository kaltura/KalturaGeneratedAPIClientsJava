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
import com.kaltura.client.types.JobData;
import com.kaltura.client.enums.BatchJobType;
import com.kaltura.client.enums.BatchJobStatus;
import com.kaltura.client.enums.BatchJobErrorTypes;
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class BatchJob extends ObjectBase {

    private Long id;
    private Integer partnerId;
    private Integer createdAt;
    private Integer updatedAt;
    private Integer deletedAt;
    private Integer lockExpiration;
    private Integer executionAttempts;
    private Integer lockVersion;
    private String entryId;
    private String entryName;
    private BatchJobType jobType;
    private Integer jobSubType;
    private JobData data;
    private BatchJobStatus status;
    private Integer abort;
    private Integer checkAgainTimeout;
    private String message;
    private String description;
    private Integer priority;
    private List<BatchHistoryData> history;
	/**  The id of the bulk upload job that initiated this job  */
    private Integer bulkJobId;
    private Integer batchVersion;
	/**  When one job creates another - the parent should set this parentJobId to be its
	  own id.  */
    private Integer parentJobId;
	/**  The id of the root parent job  */
    private Integer rootJobId;
	/**  The time that the job was pulled from the queue  */
    private Integer queueTime;
	/**  The time that the job was finished or closed as failed  */
    private Integer finishTime;
    private BatchJobErrorTypes errType;
    private Integer errNumber;
    private Integer estimatedEffort;
    private Integer urgency;
    private Integer schedulerId;
    private Integer workerId;
    private Integer batchIndex;
    private Integer lastSchedulerId;
    private Integer lastWorkerId;
    private Integer dc;
    private String jobObjectId;
    private Integer jobObjectType;

    // id:
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // updatedAt:
    public Integer getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(Integer updatedAt){
        this.updatedAt = updatedAt;
    }

    // deletedAt:
    public Integer getDeletedAt(){
        return this.deletedAt;
    }
    public void setDeletedAt(Integer deletedAt){
        this.deletedAt = deletedAt;
    }

    // lockExpiration:
    public Integer getLockExpiration(){
        return this.lockExpiration;
    }
    public void setLockExpiration(Integer lockExpiration){
        this.lockExpiration = lockExpiration;
    }

    // executionAttempts:
    public Integer getExecutionAttempts(){
        return this.executionAttempts;
    }
    public void setExecutionAttempts(Integer executionAttempts){
        this.executionAttempts = executionAttempts;
    }

    // lockVersion:
    public Integer getLockVersion(){
        return this.lockVersion;
    }
    public void setLockVersion(Integer lockVersion){
        this.lockVersion = lockVersion;
    }

    // entryId:
    public String getEntryId(){
        return this.entryId;
    }
    public void setEntryId(String entryId){
        this.entryId = entryId;
    }

    // entryName:
    public String getEntryName(){
        return this.entryName;
    }
    public void setEntryName(String entryName){
        this.entryName = entryName;
    }

    // jobType:
    public BatchJobType getJobType(){
        return this.jobType;
    }
    public void setJobType(BatchJobType jobType){
        this.jobType = jobType;
    }

    // jobSubType:
    public Integer getJobSubType(){
        return this.jobSubType;
    }
    public void setJobSubType(Integer jobSubType){
        this.jobSubType = jobSubType;
    }

    // data:
    public JobData getData(){
        return this.data;
    }
    public void setData(JobData data){
        this.data = data;
    }

    // status:
    public BatchJobStatus getStatus(){
        return this.status;
    }
    public void setStatus(BatchJobStatus status){
        this.status = status;
    }

    // abort:
    public Integer getAbort(){
        return this.abort;
    }
    public void setAbort(Integer abort){
        this.abort = abort;
    }

    // checkAgainTimeout:
    public Integer getCheckAgainTimeout(){
        return this.checkAgainTimeout;
    }
    public void setCheckAgainTimeout(Integer checkAgainTimeout){
        this.checkAgainTimeout = checkAgainTimeout;
    }

    // message:
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message = message;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // priority:
    public Integer getPriority(){
        return this.priority;
    }
    public void setPriority(Integer priority){
        this.priority = priority;
    }

    // history:
    public List<BatchHistoryData> getHistory(){
        return this.history;
    }
    public void setHistory(List<BatchHistoryData> history){
        this.history = history;
    }

    // bulkJobId:
    public Integer getBulkJobId(){
        return this.bulkJobId;
    }
    public void setBulkJobId(Integer bulkJobId){
        this.bulkJobId = bulkJobId;
    }

    // batchVersion:
    public Integer getBatchVersion(){
        return this.batchVersion;
    }
    public void setBatchVersion(Integer batchVersion){
        this.batchVersion = batchVersion;
    }

    // parentJobId:
    public Integer getParentJobId(){
        return this.parentJobId;
    }
    public void setParentJobId(Integer parentJobId){
        this.parentJobId = parentJobId;
    }

    // rootJobId:
    public Integer getRootJobId(){
        return this.rootJobId;
    }
    public void setRootJobId(Integer rootJobId){
        this.rootJobId = rootJobId;
    }

    // queueTime:
    public Integer getQueueTime(){
        return this.queueTime;
    }
    public void setQueueTime(Integer queueTime){
        this.queueTime = queueTime;
    }

    // finishTime:
    public Integer getFinishTime(){
        return this.finishTime;
    }
    public void setFinishTime(Integer finishTime){
        this.finishTime = finishTime;
    }

    // errType:
    public BatchJobErrorTypes getErrType(){
        return this.errType;
    }
    public void setErrType(BatchJobErrorTypes errType){
        this.errType = errType;
    }

    // errNumber:
    public Integer getErrNumber(){
        return this.errNumber;
    }
    public void setErrNumber(Integer errNumber){
        this.errNumber = errNumber;
    }

    // estimatedEffort:
    public Integer getEstimatedEffort(){
        return this.estimatedEffort;
    }
    public void setEstimatedEffort(Integer estimatedEffort){
        this.estimatedEffort = estimatedEffort;
    }

    // urgency:
    public Integer getUrgency(){
        return this.urgency;
    }
    public void setUrgency(Integer urgency){
        this.urgency = urgency;
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

    // batchIndex:
    public Integer getBatchIndex(){
        return this.batchIndex;
    }
    public void setBatchIndex(Integer batchIndex){
        this.batchIndex = batchIndex;
    }

    // lastSchedulerId:
    public Integer getLastSchedulerId(){
        return this.lastSchedulerId;
    }
    public void setLastSchedulerId(Integer lastSchedulerId){
        this.lastSchedulerId = lastSchedulerId;
    }

    // lastWorkerId:
    public Integer getLastWorkerId(){
        return this.lastWorkerId;
    }
    public void setLastWorkerId(Integer lastWorkerId){
        this.lastWorkerId = lastWorkerId;
    }

    // dc:
    public Integer getDc(){
        return this.dc;
    }
    public void setDc(Integer dc){
        this.dc = dc;
    }

    // jobObjectId:
    public String getJobObjectId(){
        return this.jobObjectId;
    }
    public void setJobObjectId(String jobObjectId){
        this.jobObjectId = jobObjectId;
    }

    // jobObjectType:
    public Integer getJobObjectType(){
        return this.jobObjectType;
    }
    public void setJobObjectType(Integer jobObjectType){
        this.jobObjectType = jobObjectType;
    }


    public BatchJob() {
       super();
    }

    public BatchJob(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseLong(jsonObject.get("id"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        deletedAt = GsonParser.parseInt(jsonObject.get("deletedAt"));
        lockExpiration = GsonParser.parseInt(jsonObject.get("lockExpiration"));
        executionAttempts = GsonParser.parseInt(jsonObject.get("executionAttempts"));
        lockVersion = GsonParser.parseInt(jsonObject.get("lockVersion"));
        entryId = GsonParser.parseString(jsonObject.get("entryId"));
        entryName = GsonParser.parseString(jsonObject.get("entryName"));
        jobType = BatchJobType.get(GsonParser.parseString(jsonObject.get("jobType")));
        jobSubType = GsonParser.parseInt(jsonObject.get("jobSubType"));
        data = GsonParser.parseObject(jsonObject.getAsJsonObject("data"), JobData.class);
        status = BatchJobStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        abort = GsonParser.parseInt(jsonObject.get("abort"));
        checkAgainTimeout = GsonParser.parseInt(jsonObject.get("checkAgainTimeout"));
        message = GsonParser.parseString(jsonObject.get("message"));
        description = GsonParser.parseString(jsonObject.get("description"));
        priority = GsonParser.parseInt(jsonObject.get("priority"));
        history = GsonParser.parseArray(jsonObject.getAsJsonArray("history"), BatchHistoryData.class);
        bulkJobId = GsonParser.parseInt(jsonObject.get("bulkJobId"));
        batchVersion = GsonParser.parseInt(jsonObject.get("batchVersion"));
        parentJobId = GsonParser.parseInt(jsonObject.get("parentJobId"));
        rootJobId = GsonParser.parseInt(jsonObject.get("rootJobId"));
        queueTime = GsonParser.parseInt(jsonObject.get("queueTime"));
        finishTime = GsonParser.parseInt(jsonObject.get("finishTime"));
        errType = BatchJobErrorTypes.get(GsonParser.parseInt(jsonObject.get("errType")));
        errNumber = GsonParser.parseInt(jsonObject.get("errNumber"));
        estimatedEffort = GsonParser.parseInt(jsonObject.get("estimatedEffort"));
        urgency = GsonParser.parseInt(jsonObject.get("urgency"));
        schedulerId = GsonParser.parseInt(jsonObject.get("schedulerId"));
        workerId = GsonParser.parseInt(jsonObject.get("workerId"));
        batchIndex = GsonParser.parseInt(jsonObject.get("batchIndex"));
        lastSchedulerId = GsonParser.parseInt(jsonObject.get("lastSchedulerId"));
        lastWorkerId = GsonParser.parseInt(jsonObject.get("lastWorkerId"));
        dc = GsonParser.parseInt(jsonObject.get("dc"));
        jobObjectId = GsonParser.parseString(jsonObject.get("jobObjectId"));
        jobObjectType = GsonParser.parseInt(jsonObject.get("jobObjectType"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaBatchJob");
        kparams.add("entryId", this.entryId);
        kparams.add("entryName", this.entryName);
        kparams.add("jobSubType", this.jobSubType);
        kparams.add("data", this.data);
        kparams.add("status", this.status);
        kparams.add("abort", this.abort);
        kparams.add("checkAgainTimeout", this.checkAgainTimeout);
        kparams.add("message", this.message);
        kparams.add("description", this.description);
        kparams.add("priority", this.priority);
        kparams.add("history", this.history);
        kparams.add("bulkJobId", this.bulkJobId);
        kparams.add("batchVersion", this.batchVersion);
        kparams.add("parentJobId", this.parentJobId);
        kparams.add("rootJobId", this.rootJobId);
        kparams.add("queueTime", this.queueTime);
        kparams.add("finishTime", this.finishTime);
        kparams.add("errType", this.errType);
        kparams.add("errNumber", this.errNumber);
        kparams.add("estimatedEffort", this.estimatedEffort);
        kparams.add("urgency", this.urgency);
        kparams.add("schedulerId", this.schedulerId);
        kparams.add("workerId", this.workerId);
        kparams.add("batchIndex", this.batchIndex);
        kparams.add("lastSchedulerId", this.lastSchedulerId);
        kparams.add("lastWorkerId", this.lastWorkerId);
        kparams.add("dc", this.dc);
        kparams.add("jobObjectId", this.jobObjectId);
        kparams.add("jobObjectType", this.jobObjectType);
        return kparams;
    }

}

