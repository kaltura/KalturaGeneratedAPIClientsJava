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
import com.kaltura.client.enums.BatchJobType;
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class SchedulerWorker extends ObjectBase {

	/**  The id of the Worker  */
    private Integer id;
	/**  The id as configured in the batch config  */
    private Integer configuredId;
	/**  The id of the Scheduler  */
    private Integer schedulerId;
	/**  The id of the scheduler as configured in the batch config  */
    private Integer schedulerConfiguredId;
	/**  The worker type  */
    private BatchJobType type;
	/**  The friendly name of the type  */
    private String typeName;
	/**  The scheduler name  */
    private String name;
	/**  Array of the last statuses  */
    private List<SchedulerStatus> statuses;
	/**  Array of the last configs  */
    private List<SchedulerConfig> configs;
	/**  Array of jobs that locked to this worker  */
    private List<BatchJob> lockedJobs;
	/**  Avarage time between creation and queue time  */
    private Integer avgWait;
	/**  Avarage time between queue time end finish time  */
    private Integer avgWork;
	/**  last status time  */
    private Integer lastStatus;
	/**  last status formated  */
    private String lastStatusStr;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // configuredId:
    public Integer getConfiguredId(){
        return this.configuredId;
    }
    public void setConfiguredId(Integer configuredId){
        this.configuredId = configuredId;
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

    // type:
    public BatchJobType getType(){
        return this.type;
    }
    public void setType(BatchJobType type){
        this.type = type;
    }

    // typeName:
    public String getTypeName(){
        return this.typeName;
    }
    public void setTypeName(String typeName){
        this.typeName = typeName;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // statuses:
    public List<SchedulerStatus> getStatuses(){
        return this.statuses;
    }
    public void setStatuses(List<SchedulerStatus> statuses){
        this.statuses = statuses;
    }

    // configs:
    public List<SchedulerConfig> getConfigs(){
        return this.configs;
    }
    public void setConfigs(List<SchedulerConfig> configs){
        this.configs = configs;
    }

    // lockedJobs:
    public List<BatchJob> getLockedJobs(){
        return this.lockedJobs;
    }
    public void setLockedJobs(List<BatchJob> lockedJobs){
        this.lockedJobs = lockedJobs;
    }

    // avgWait:
    public Integer getAvgWait(){
        return this.avgWait;
    }
    public void setAvgWait(Integer avgWait){
        this.avgWait = avgWait;
    }

    // avgWork:
    public Integer getAvgWork(){
        return this.avgWork;
    }
    public void setAvgWork(Integer avgWork){
        this.avgWork = avgWork;
    }

    // lastStatus:
    public Integer getLastStatus(){
        return this.lastStatus;
    }
    public void setLastStatus(Integer lastStatus){
        this.lastStatus = lastStatus;
    }

    // lastStatusStr:
    public String getLastStatusStr(){
        return this.lastStatusStr;
    }
    public void setLastStatusStr(String lastStatusStr){
        this.lastStatusStr = lastStatusStr;
    }


    public SchedulerWorker() {
       super();
    }

    public SchedulerWorker(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        configuredId = GsonParser.parseInt(jsonObject.get("configuredId"));
        schedulerId = GsonParser.parseInt(jsonObject.get("schedulerId"));
        schedulerConfiguredId = GsonParser.parseInt(jsonObject.get("schedulerConfiguredId"));
        type = BatchJobType.get(GsonParser.parseString(jsonObject.get("type")));
        typeName = GsonParser.parseString(jsonObject.get("typeName"));
        name = GsonParser.parseString(jsonObject.get("name"));
        statuses = GsonParser.parseArray(jsonObject.getAsJsonArray("statuses"), SchedulerStatus.class);
        configs = GsonParser.parseArray(jsonObject.getAsJsonArray("configs"), SchedulerConfig.class);
        lockedJobs = GsonParser.parseArray(jsonObject.getAsJsonArray("lockedJobs"), BatchJob.class);
        avgWait = GsonParser.parseInt(jsonObject.get("avgWait"));
        avgWork = GsonParser.parseInt(jsonObject.get("avgWork"));
        lastStatus = GsonParser.parseInt(jsonObject.get("lastStatus"));
        lastStatusStr = GsonParser.parseString(jsonObject.get("lastStatusStr"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaSchedulerWorker");
        kparams.add("configuredId", this.configuredId);
        kparams.add("schedulerId", this.schedulerId);
        kparams.add("schedulerConfiguredId", this.schedulerConfiguredId);
        kparams.add("type", this.type);
        kparams.add("typeName", this.typeName);
        kparams.add("name", this.name);
        kparams.add("statuses", this.statuses);
        kparams.add("configs", this.configs);
        kparams.add("lockedJobs", this.lockedJobs);
        kparams.add("avgWait", this.avgWait);
        kparams.add("avgWork", this.avgWork);
        kparams.add("lastStatus", this.lastStatus);
        kparams.add("lastStatusStr", this.lastStatusStr);
        return kparams;
    }

}

