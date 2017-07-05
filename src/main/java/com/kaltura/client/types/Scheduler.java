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
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class Scheduler extends ObjectBase {

	/**  The id of the Scheduler  */
    private Integer id;
	/**  The id as configured in the batch config  */
    private Integer configuredId;
	/**  The scheduler name  */
    private String name;
	/**  The host name  */
    private String host;
	/**  Array of the last statuses  */
    private List<SchedulerStatus> statuses;
	/**  Array of the last configs  */
    private List<SchedulerConfig> configs;
	/**  Array of the workers  */
    private List<SchedulerWorker> workers;
	/**  creation time  */
    private Integer createdAt;
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

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // host:
    public String getHost(){
        return this.host;
    }
    public void setHost(String host){
        this.host = host;
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

    // workers:
    public List<SchedulerWorker> getWorkers(){
        return this.workers;
    }
    public void setWorkers(List<SchedulerWorker> workers){
        this.workers = workers;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
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


    public Scheduler() {
       super();
    }

    public Scheduler(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        configuredId = GsonParser.parseInt(jsonObject.get("configuredId"));
        name = GsonParser.parseString(jsonObject.get("name"));
        host = GsonParser.parseString(jsonObject.get("host"));
        statuses = GsonParser.parseArray(jsonObject.getAsJsonArray("statuses"), SchedulerStatus.class);
        configs = GsonParser.parseArray(jsonObject.getAsJsonArray("configs"), SchedulerConfig.class);
        workers = GsonParser.parseArray(jsonObject.getAsJsonArray("workers"), SchedulerWorker.class);
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        lastStatus = GsonParser.parseInt(jsonObject.get("lastStatus"));
        lastStatusStr = GsonParser.parseString(jsonObject.get("lastStatusStr"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaScheduler");
        kparams.add("configuredId", this.configuredId);
        kparams.add("name", this.name);
        kparams.add("host", this.host);
        return kparams;
    }

}

