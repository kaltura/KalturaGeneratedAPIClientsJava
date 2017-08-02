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
import com.kaltura.client.enums.ServerNodeStatus;
import com.kaltura.client.enums.ServerNodeType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class ServerNode extends ObjectBase {

    private Integer id;
    private Integer partnerId;
    private Integer createdAt;
    private Integer updatedAt;
    private Integer heartbeatTime;
	/**  serverNode name  */
    private String name;
	/**  serverNode uniqe system name  */
    private String systemName;
    private String description;
	/**  serverNode hostName  */
    private String hostName;
    private ServerNodeStatus status;
    private ServerNodeType type;
	/**  serverNode tags  */
    private String tags;
	/**  DC where the serverNode is located  */
    private Integer dc;
	/**  Id of the parent serverNode  */
    private String parentId;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
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

    // heartbeatTime:
    public Integer getHeartbeatTime(){
        return this.heartbeatTime;
    }
    public void setHeartbeatTime(Integer heartbeatTime){
        this.heartbeatTime = heartbeatTime;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // systemName:
    public String getSystemName(){
        return this.systemName;
    }
    public void setSystemName(String systemName){
        this.systemName = systemName;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // hostName:
    public String getHostName(){
        return this.hostName;
    }
    public void setHostName(String hostName){
        this.hostName = hostName;
    }

    // status:
    public ServerNodeStatus getStatus(){
        return this.status;
    }
    public void setStatus(ServerNodeStatus status){
        this.status = status;
    }

    // type:
    public ServerNodeType getType(){
        return this.type;
    }
    public void setType(ServerNodeType type){
        this.type = type;
    }

    // tags:
    public String getTags(){
        return this.tags;
    }
    public void setTags(String tags){
        this.tags = tags;
    }

    // dc:
    public Integer getDc(){
        return this.dc;
    }
    public void setDc(Integer dc){
        this.dc = dc;
    }

    // parentId:
    public String getParentId(){
        return this.parentId;
    }
    public void setParentId(String parentId){
        this.parentId = parentId;
    }


    public ServerNode() {
       super();
    }

    public ServerNode(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        heartbeatTime = GsonParser.parseInt(jsonObject.get("heartbeatTime"));
        name = GsonParser.parseString(jsonObject.get("name"));
        systemName = GsonParser.parseString(jsonObject.get("systemName"));
        description = GsonParser.parseString(jsonObject.get("description"));
        hostName = GsonParser.parseString(jsonObject.get("hostName"));
        status = ServerNodeStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        type = ServerNodeType.get(GsonParser.parseString(jsonObject.get("type")));
        tags = GsonParser.parseString(jsonObject.get("tags"));
        dc = GsonParser.parseInt(jsonObject.get("dc"));
        parentId = GsonParser.parseString(jsonObject.get("parentId"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaServerNode");
        kparams.add("name", this.name);
        kparams.add("systemName", this.systemName);
        kparams.add("description", this.description);
        kparams.add("hostName", this.hostName);
        kparams.add("tags", this.tags);
        kparams.add("parentId", this.parentId);
        return kparams;
    }

}

