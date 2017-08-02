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
import com.kaltura.client.enums.BatchJobErrorTypes;
import com.kaltura.client.enums.BatchJobStatus;
import com.kaltura.client.enums.BatchJobType;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class BatchJobBaseFilter extends Filter {

    private Long idEqual;
    private Long idGreaterThanOrEqual;
    private Integer partnerIdEqual;
    private String partnerIdIn;
    private String partnerIdNotIn;
    private Integer createdAtGreaterThanOrEqual;
    private Integer createdAtLessThanOrEqual;
    private Integer updatedAtGreaterThanOrEqual;
    private Integer updatedAtLessThanOrEqual;
    private Integer executionAttemptsGreaterThanOrEqual;
    private Integer executionAttemptsLessThanOrEqual;
    private Integer lockVersionGreaterThanOrEqual;
    private Integer lockVersionLessThanOrEqual;
    private String entryIdEqual;
    private BatchJobType jobTypeEqual;
    private String jobTypeIn;
    private String jobTypeNotIn;
    private Integer jobSubTypeEqual;
    private String jobSubTypeIn;
    private String jobSubTypeNotIn;
    private BatchJobStatus statusEqual;
    private String statusIn;
    private String statusNotIn;
    private Integer priorityGreaterThanOrEqual;
    private Integer priorityLessThanOrEqual;
    private Integer priorityEqual;
    private String priorityIn;
    private String priorityNotIn;
    private Integer batchVersionGreaterThanOrEqual;
    private Integer batchVersionLessThanOrEqual;
    private Integer batchVersionEqual;
    private Integer queueTimeGreaterThanOrEqual;
    private Integer queueTimeLessThanOrEqual;
    private Integer finishTimeGreaterThanOrEqual;
    private Integer finishTimeLessThanOrEqual;
    private BatchJobErrorTypes errTypeEqual;
    private String errTypeIn;
    private String errTypeNotIn;
    private Integer errNumberEqual;
    private String errNumberIn;
    private String errNumberNotIn;
    private Integer estimatedEffortLessThan;
    private Integer estimatedEffortGreaterThan;
    private Integer urgencyLessThanOrEqual;
    private Integer urgencyGreaterThanOrEqual;

    // idEqual:
    public Long getIdEqual(){
        return this.idEqual;
    }
    public void setIdEqual(Long idEqual){
        this.idEqual = idEqual;
    }

    // idGreaterThanOrEqual:
    public Long getIdGreaterThanOrEqual(){
        return this.idGreaterThanOrEqual;
    }
    public void setIdGreaterThanOrEqual(Long idGreaterThanOrEqual){
        this.idGreaterThanOrEqual = idGreaterThanOrEqual;
    }

    // partnerIdEqual:
    public Integer getPartnerIdEqual(){
        return this.partnerIdEqual;
    }
    public void setPartnerIdEqual(Integer partnerIdEqual){
        this.partnerIdEqual = partnerIdEqual;
    }

    // partnerIdIn:
    public String getPartnerIdIn(){
        return this.partnerIdIn;
    }
    public void setPartnerIdIn(String partnerIdIn){
        this.partnerIdIn = partnerIdIn;
    }

    // partnerIdNotIn:
    public String getPartnerIdNotIn(){
        return this.partnerIdNotIn;
    }
    public void setPartnerIdNotIn(String partnerIdNotIn){
        this.partnerIdNotIn = partnerIdNotIn;
    }

    // createdAtGreaterThanOrEqual:
    public Integer getCreatedAtGreaterThanOrEqual(){
        return this.createdAtGreaterThanOrEqual;
    }
    public void setCreatedAtGreaterThanOrEqual(Integer createdAtGreaterThanOrEqual){
        this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
    }

    // createdAtLessThanOrEqual:
    public Integer getCreatedAtLessThanOrEqual(){
        return this.createdAtLessThanOrEqual;
    }
    public void setCreatedAtLessThanOrEqual(Integer createdAtLessThanOrEqual){
        this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
    }

    // updatedAtGreaterThanOrEqual:
    public Integer getUpdatedAtGreaterThanOrEqual(){
        return this.updatedAtGreaterThanOrEqual;
    }
    public void setUpdatedAtGreaterThanOrEqual(Integer updatedAtGreaterThanOrEqual){
        this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
    }

    // updatedAtLessThanOrEqual:
    public Integer getUpdatedAtLessThanOrEqual(){
        return this.updatedAtLessThanOrEqual;
    }
    public void setUpdatedAtLessThanOrEqual(Integer updatedAtLessThanOrEqual){
        this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
    }

    // executionAttemptsGreaterThanOrEqual:
    public Integer getExecutionAttemptsGreaterThanOrEqual(){
        return this.executionAttemptsGreaterThanOrEqual;
    }
    public void setExecutionAttemptsGreaterThanOrEqual(Integer executionAttemptsGreaterThanOrEqual){
        this.executionAttemptsGreaterThanOrEqual = executionAttemptsGreaterThanOrEqual;
    }

    // executionAttemptsLessThanOrEqual:
    public Integer getExecutionAttemptsLessThanOrEqual(){
        return this.executionAttemptsLessThanOrEqual;
    }
    public void setExecutionAttemptsLessThanOrEqual(Integer executionAttemptsLessThanOrEqual){
        this.executionAttemptsLessThanOrEqual = executionAttemptsLessThanOrEqual;
    }

    // lockVersionGreaterThanOrEqual:
    public Integer getLockVersionGreaterThanOrEqual(){
        return this.lockVersionGreaterThanOrEqual;
    }
    public void setLockVersionGreaterThanOrEqual(Integer lockVersionGreaterThanOrEqual){
        this.lockVersionGreaterThanOrEqual = lockVersionGreaterThanOrEqual;
    }

    // lockVersionLessThanOrEqual:
    public Integer getLockVersionLessThanOrEqual(){
        return this.lockVersionLessThanOrEqual;
    }
    public void setLockVersionLessThanOrEqual(Integer lockVersionLessThanOrEqual){
        this.lockVersionLessThanOrEqual = lockVersionLessThanOrEqual;
    }

    // entryIdEqual:
    public String getEntryIdEqual(){
        return this.entryIdEqual;
    }
    public void setEntryIdEqual(String entryIdEqual){
        this.entryIdEqual = entryIdEqual;
    }

    // jobTypeEqual:
    public BatchJobType getJobTypeEqual(){
        return this.jobTypeEqual;
    }
    public void setJobTypeEqual(BatchJobType jobTypeEqual){
        this.jobTypeEqual = jobTypeEqual;
    }

    // jobTypeIn:
    public String getJobTypeIn(){
        return this.jobTypeIn;
    }
    public void setJobTypeIn(String jobTypeIn){
        this.jobTypeIn = jobTypeIn;
    }

    // jobTypeNotIn:
    public String getJobTypeNotIn(){
        return this.jobTypeNotIn;
    }
    public void setJobTypeNotIn(String jobTypeNotIn){
        this.jobTypeNotIn = jobTypeNotIn;
    }

    // jobSubTypeEqual:
    public Integer getJobSubTypeEqual(){
        return this.jobSubTypeEqual;
    }
    public void setJobSubTypeEqual(Integer jobSubTypeEqual){
        this.jobSubTypeEqual = jobSubTypeEqual;
    }

    // jobSubTypeIn:
    public String getJobSubTypeIn(){
        return this.jobSubTypeIn;
    }
    public void setJobSubTypeIn(String jobSubTypeIn){
        this.jobSubTypeIn = jobSubTypeIn;
    }

    // jobSubTypeNotIn:
    public String getJobSubTypeNotIn(){
        return this.jobSubTypeNotIn;
    }
    public void setJobSubTypeNotIn(String jobSubTypeNotIn){
        this.jobSubTypeNotIn = jobSubTypeNotIn;
    }

    // statusEqual:
    public BatchJobStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(BatchJobStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // statusNotIn:
    public String getStatusNotIn(){
        return this.statusNotIn;
    }
    public void setStatusNotIn(String statusNotIn){
        this.statusNotIn = statusNotIn;
    }

    // priorityGreaterThanOrEqual:
    public Integer getPriorityGreaterThanOrEqual(){
        return this.priorityGreaterThanOrEqual;
    }
    public void setPriorityGreaterThanOrEqual(Integer priorityGreaterThanOrEqual){
        this.priorityGreaterThanOrEqual = priorityGreaterThanOrEqual;
    }

    // priorityLessThanOrEqual:
    public Integer getPriorityLessThanOrEqual(){
        return this.priorityLessThanOrEqual;
    }
    public void setPriorityLessThanOrEqual(Integer priorityLessThanOrEqual){
        this.priorityLessThanOrEqual = priorityLessThanOrEqual;
    }

    // priorityEqual:
    public Integer getPriorityEqual(){
        return this.priorityEqual;
    }
    public void setPriorityEqual(Integer priorityEqual){
        this.priorityEqual = priorityEqual;
    }

    // priorityIn:
    public String getPriorityIn(){
        return this.priorityIn;
    }
    public void setPriorityIn(String priorityIn){
        this.priorityIn = priorityIn;
    }

    // priorityNotIn:
    public String getPriorityNotIn(){
        return this.priorityNotIn;
    }
    public void setPriorityNotIn(String priorityNotIn){
        this.priorityNotIn = priorityNotIn;
    }

    // batchVersionGreaterThanOrEqual:
    public Integer getBatchVersionGreaterThanOrEqual(){
        return this.batchVersionGreaterThanOrEqual;
    }
    public void setBatchVersionGreaterThanOrEqual(Integer batchVersionGreaterThanOrEqual){
        this.batchVersionGreaterThanOrEqual = batchVersionGreaterThanOrEqual;
    }

    // batchVersionLessThanOrEqual:
    public Integer getBatchVersionLessThanOrEqual(){
        return this.batchVersionLessThanOrEqual;
    }
    public void setBatchVersionLessThanOrEqual(Integer batchVersionLessThanOrEqual){
        this.batchVersionLessThanOrEqual = batchVersionLessThanOrEqual;
    }

    // batchVersionEqual:
    public Integer getBatchVersionEqual(){
        return this.batchVersionEqual;
    }
    public void setBatchVersionEqual(Integer batchVersionEqual){
        this.batchVersionEqual = batchVersionEqual;
    }

    // queueTimeGreaterThanOrEqual:
    public Integer getQueueTimeGreaterThanOrEqual(){
        return this.queueTimeGreaterThanOrEqual;
    }
    public void setQueueTimeGreaterThanOrEqual(Integer queueTimeGreaterThanOrEqual){
        this.queueTimeGreaterThanOrEqual = queueTimeGreaterThanOrEqual;
    }

    // queueTimeLessThanOrEqual:
    public Integer getQueueTimeLessThanOrEqual(){
        return this.queueTimeLessThanOrEqual;
    }
    public void setQueueTimeLessThanOrEqual(Integer queueTimeLessThanOrEqual){
        this.queueTimeLessThanOrEqual = queueTimeLessThanOrEqual;
    }

    // finishTimeGreaterThanOrEqual:
    public Integer getFinishTimeGreaterThanOrEqual(){
        return this.finishTimeGreaterThanOrEqual;
    }
    public void setFinishTimeGreaterThanOrEqual(Integer finishTimeGreaterThanOrEqual){
        this.finishTimeGreaterThanOrEqual = finishTimeGreaterThanOrEqual;
    }

    // finishTimeLessThanOrEqual:
    public Integer getFinishTimeLessThanOrEqual(){
        return this.finishTimeLessThanOrEqual;
    }
    public void setFinishTimeLessThanOrEqual(Integer finishTimeLessThanOrEqual){
        this.finishTimeLessThanOrEqual = finishTimeLessThanOrEqual;
    }

    // errTypeEqual:
    public BatchJobErrorTypes getErrTypeEqual(){
        return this.errTypeEqual;
    }
    public void setErrTypeEqual(BatchJobErrorTypes errTypeEqual){
        this.errTypeEqual = errTypeEqual;
    }

    // errTypeIn:
    public String getErrTypeIn(){
        return this.errTypeIn;
    }
    public void setErrTypeIn(String errTypeIn){
        this.errTypeIn = errTypeIn;
    }

    // errTypeNotIn:
    public String getErrTypeNotIn(){
        return this.errTypeNotIn;
    }
    public void setErrTypeNotIn(String errTypeNotIn){
        this.errTypeNotIn = errTypeNotIn;
    }

    // errNumberEqual:
    public Integer getErrNumberEqual(){
        return this.errNumberEqual;
    }
    public void setErrNumberEqual(Integer errNumberEqual){
        this.errNumberEqual = errNumberEqual;
    }

    // errNumberIn:
    public String getErrNumberIn(){
        return this.errNumberIn;
    }
    public void setErrNumberIn(String errNumberIn){
        this.errNumberIn = errNumberIn;
    }

    // errNumberNotIn:
    public String getErrNumberNotIn(){
        return this.errNumberNotIn;
    }
    public void setErrNumberNotIn(String errNumberNotIn){
        this.errNumberNotIn = errNumberNotIn;
    }

    // estimatedEffortLessThan:
    public Integer getEstimatedEffortLessThan(){
        return this.estimatedEffortLessThan;
    }
    public void setEstimatedEffortLessThan(Integer estimatedEffortLessThan){
        this.estimatedEffortLessThan = estimatedEffortLessThan;
    }

    // estimatedEffortGreaterThan:
    public Integer getEstimatedEffortGreaterThan(){
        return this.estimatedEffortGreaterThan;
    }
    public void setEstimatedEffortGreaterThan(Integer estimatedEffortGreaterThan){
        this.estimatedEffortGreaterThan = estimatedEffortGreaterThan;
    }

    // urgencyLessThanOrEqual:
    public Integer getUrgencyLessThanOrEqual(){
        return this.urgencyLessThanOrEqual;
    }
    public void setUrgencyLessThanOrEqual(Integer urgencyLessThanOrEqual){
        this.urgencyLessThanOrEqual = urgencyLessThanOrEqual;
    }

    // urgencyGreaterThanOrEqual:
    public Integer getUrgencyGreaterThanOrEqual(){
        return this.urgencyGreaterThanOrEqual;
    }
    public void setUrgencyGreaterThanOrEqual(Integer urgencyGreaterThanOrEqual){
        this.urgencyGreaterThanOrEqual = urgencyGreaterThanOrEqual;
    }


    public BatchJobBaseFilter() {
       super();
    }

    public BatchJobBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseLong(jsonObject.get("idEqual"));
        idGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("idGreaterThanOrEqual"));
        partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
        partnerIdIn = GsonParser.parseString(jsonObject.get("partnerIdIn"));
        partnerIdNotIn = GsonParser.parseString(jsonObject.get("partnerIdNotIn"));
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
        updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
        executionAttemptsGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("executionAttemptsGreaterThanOrEqual"));
        executionAttemptsLessThanOrEqual = GsonParser.parseInt(jsonObject.get("executionAttemptsLessThanOrEqual"));
        lockVersionGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("lockVersionGreaterThanOrEqual"));
        lockVersionLessThanOrEqual = GsonParser.parseInt(jsonObject.get("lockVersionLessThanOrEqual"));
        entryIdEqual = GsonParser.parseString(jsonObject.get("entryIdEqual"));
        jobTypeEqual = BatchJobType.get(GsonParser.parseString(jsonObject.get("jobTypeEqual")));
        jobTypeIn = GsonParser.parseString(jsonObject.get("jobTypeIn"));
        jobTypeNotIn = GsonParser.parseString(jsonObject.get("jobTypeNotIn"));
        jobSubTypeEqual = GsonParser.parseInt(jsonObject.get("jobSubTypeEqual"));
        jobSubTypeIn = GsonParser.parseString(jsonObject.get("jobSubTypeIn"));
        jobSubTypeNotIn = GsonParser.parseString(jsonObject.get("jobSubTypeNotIn"));
        statusEqual = BatchJobStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        statusNotIn = GsonParser.parseString(jsonObject.get("statusNotIn"));
        priorityGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("priorityGreaterThanOrEqual"));
        priorityLessThanOrEqual = GsonParser.parseInt(jsonObject.get("priorityLessThanOrEqual"));
        priorityEqual = GsonParser.parseInt(jsonObject.get("priorityEqual"));
        priorityIn = GsonParser.parseString(jsonObject.get("priorityIn"));
        priorityNotIn = GsonParser.parseString(jsonObject.get("priorityNotIn"));
        batchVersionGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("batchVersionGreaterThanOrEqual"));
        batchVersionLessThanOrEqual = GsonParser.parseInt(jsonObject.get("batchVersionLessThanOrEqual"));
        batchVersionEqual = GsonParser.parseInt(jsonObject.get("batchVersionEqual"));
        queueTimeGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("queueTimeGreaterThanOrEqual"));
        queueTimeLessThanOrEqual = GsonParser.parseInt(jsonObject.get("queueTimeLessThanOrEqual"));
        finishTimeGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("finishTimeGreaterThanOrEqual"));
        finishTimeLessThanOrEqual = GsonParser.parseInt(jsonObject.get("finishTimeLessThanOrEqual"));
        errTypeEqual = BatchJobErrorTypes.get(GsonParser.parseInt(jsonObject.get("errTypeEqual")));
        errTypeIn = GsonParser.parseString(jsonObject.get("errTypeIn"));
        errTypeNotIn = GsonParser.parseString(jsonObject.get("errTypeNotIn"));
        errNumberEqual = GsonParser.parseInt(jsonObject.get("errNumberEqual"));
        errNumberIn = GsonParser.parseString(jsonObject.get("errNumberIn"));
        errNumberNotIn = GsonParser.parseString(jsonObject.get("errNumberNotIn"));
        estimatedEffortLessThan = GsonParser.parseInt(jsonObject.get("estimatedEffortLessThan"));
        estimatedEffortGreaterThan = GsonParser.parseInt(jsonObject.get("estimatedEffortGreaterThan"));
        urgencyLessThanOrEqual = GsonParser.parseInt(jsonObject.get("urgencyLessThanOrEqual"));
        urgencyGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("urgencyGreaterThanOrEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaBatchJobBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idGreaterThanOrEqual", this.idGreaterThanOrEqual);
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("partnerIdIn", this.partnerIdIn);
        kparams.add("partnerIdNotIn", this.partnerIdNotIn);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        kparams.add("executionAttemptsGreaterThanOrEqual", this.executionAttemptsGreaterThanOrEqual);
        kparams.add("executionAttemptsLessThanOrEqual", this.executionAttemptsLessThanOrEqual);
        kparams.add("lockVersionGreaterThanOrEqual", this.lockVersionGreaterThanOrEqual);
        kparams.add("lockVersionLessThanOrEqual", this.lockVersionLessThanOrEqual);
        kparams.add("entryIdEqual", this.entryIdEqual);
        kparams.add("jobTypeEqual", this.jobTypeEqual);
        kparams.add("jobTypeIn", this.jobTypeIn);
        kparams.add("jobTypeNotIn", this.jobTypeNotIn);
        kparams.add("jobSubTypeEqual", this.jobSubTypeEqual);
        kparams.add("jobSubTypeIn", this.jobSubTypeIn);
        kparams.add("jobSubTypeNotIn", this.jobSubTypeNotIn);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("statusNotIn", this.statusNotIn);
        kparams.add("priorityGreaterThanOrEqual", this.priorityGreaterThanOrEqual);
        kparams.add("priorityLessThanOrEqual", this.priorityLessThanOrEqual);
        kparams.add("priorityEqual", this.priorityEqual);
        kparams.add("priorityIn", this.priorityIn);
        kparams.add("priorityNotIn", this.priorityNotIn);
        kparams.add("batchVersionGreaterThanOrEqual", this.batchVersionGreaterThanOrEqual);
        kparams.add("batchVersionLessThanOrEqual", this.batchVersionLessThanOrEqual);
        kparams.add("batchVersionEqual", this.batchVersionEqual);
        kparams.add("queueTimeGreaterThanOrEqual", this.queueTimeGreaterThanOrEqual);
        kparams.add("queueTimeLessThanOrEqual", this.queueTimeLessThanOrEqual);
        kparams.add("finishTimeGreaterThanOrEqual", this.finishTimeGreaterThanOrEqual);
        kparams.add("finishTimeLessThanOrEqual", this.finishTimeLessThanOrEqual);
        kparams.add("errTypeEqual", this.errTypeEqual);
        kparams.add("errTypeIn", this.errTypeIn);
        kparams.add("errTypeNotIn", this.errTypeNotIn);
        kparams.add("errNumberEqual", this.errNumberEqual);
        kparams.add("errNumberIn", this.errNumberIn);
        kparams.add("errNumberNotIn", this.errNumberNotIn);
        kparams.add("estimatedEffortLessThan", this.estimatedEffortLessThan);
        kparams.add("estimatedEffortGreaterThan", this.estimatedEffortGreaterThan);
        kparams.add("urgencyLessThanOrEqual", this.urgencyLessThanOrEqual);
        kparams.add("urgencyGreaterThanOrEqual", this.urgencyGreaterThanOrEqual);
        return kparams;
    }

}

