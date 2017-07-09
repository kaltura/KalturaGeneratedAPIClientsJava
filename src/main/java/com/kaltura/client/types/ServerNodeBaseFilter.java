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
import com.kaltura.client.enums.ServerNodeStatus;
import com.kaltura.client.enums.ServerNodeType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class ServerNodeBaseFilter extends Filter {

    private Integer idEqual;
    private String idIn;
    private Integer createdAtGreaterThanOrEqual;
    private Integer createdAtLessThanOrEqual;
    private Integer updatedAtGreaterThanOrEqual;
    private Integer updatedAtLessThanOrEqual;
    private Integer heartbeatTimeGreaterThanOrEqual;
    private Integer heartbeatTimeLessThanOrEqual;
    private String nameEqual;
    private String nameIn;
    private String systemNameEqual;
    private String systemNameIn;
    private String hostNameLike;
    private String hostNameMultiLikeOr;
    private String hostNameMultiLikeAnd;
    private ServerNodeStatus statusEqual;
    private String statusIn;
    private ServerNodeType typeEqual;
    private String typeIn;
    private String tagsLike;
    private String tagsMultiLikeOr;
    private String tagsMultiLikeAnd;
    private Integer dcEqual;
    private String dcIn;
    private Integer parentIdEqual;
    private String parentIdIn;

    // idEqual:
    public Integer getIdEqual(){
        return this.idEqual;
    }
    public void setIdEqual(Integer idEqual){
        this.idEqual = idEqual;
    }

    // idIn:
    public String getIdIn(){
        return this.idIn;
    }
    public void setIdIn(String idIn){
        this.idIn = idIn;
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

    // heartbeatTimeGreaterThanOrEqual:
    public Integer getHeartbeatTimeGreaterThanOrEqual(){
        return this.heartbeatTimeGreaterThanOrEqual;
    }
    public void setHeartbeatTimeGreaterThanOrEqual(Integer heartbeatTimeGreaterThanOrEqual){
        this.heartbeatTimeGreaterThanOrEqual = heartbeatTimeGreaterThanOrEqual;
    }

    // heartbeatTimeLessThanOrEqual:
    public Integer getHeartbeatTimeLessThanOrEqual(){
        return this.heartbeatTimeLessThanOrEqual;
    }
    public void setHeartbeatTimeLessThanOrEqual(Integer heartbeatTimeLessThanOrEqual){
        this.heartbeatTimeLessThanOrEqual = heartbeatTimeLessThanOrEqual;
    }

    // nameEqual:
    public String getNameEqual(){
        return this.nameEqual;
    }
    public void setNameEqual(String nameEqual){
        this.nameEqual = nameEqual;
    }

    // nameIn:
    public String getNameIn(){
        return this.nameIn;
    }
    public void setNameIn(String nameIn){
        this.nameIn = nameIn;
    }

    // systemNameEqual:
    public String getSystemNameEqual(){
        return this.systemNameEqual;
    }
    public void setSystemNameEqual(String systemNameEqual){
        this.systemNameEqual = systemNameEqual;
    }

    // systemNameIn:
    public String getSystemNameIn(){
        return this.systemNameIn;
    }
    public void setSystemNameIn(String systemNameIn){
        this.systemNameIn = systemNameIn;
    }

    // hostNameLike:
    public String getHostNameLike(){
        return this.hostNameLike;
    }
    public void setHostNameLike(String hostNameLike){
        this.hostNameLike = hostNameLike;
    }

    // hostNameMultiLikeOr:
    public String getHostNameMultiLikeOr(){
        return this.hostNameMultiLikeOr;
    }
    public void setHostNameMultiLikeOr(String hostNameMultiLikeOr){
        this.hostNameMultiLikeOr = hostNameMultiLikeOr;
    }

    // hostNameMultiLikeAnd:
    public String getHostNameMultiLikeAnd(){
        return this.hostNameMultiLikeAnd;
    }
    public void setHostNameMultiLikeAnd(String hostNameMultiLikeAnd){
        this.hostNameMultiLikeAnd = hostNameMultiLikeAnd;
    }

    // statusEqual:
    public ServerNodeStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(ServerNodeStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // typeEqual:
    public ServerNodeType getTypeEqual(){
        return this.typeEqual;
    }
    public void setTypeEqual(ServerNodeType typeEqual){
        this.typeEqual = typeEqual;
    }

    // typeIn:
    public String getTypeIn(){
        return this.typeIn;
    }
    public void setTypeIn(String typeIn){
        this.typeIn = typeIn;
    }

    // tagsLike:
    public String getTagsLike(){
        return this.tagsLike;
    }
    public void setTagsLike(String tagsLike){
        this.tagsLike = tagsLike;
    }

    // tagsMultiLikeOr:
    public String getTagsMultiLikeOr(){
        return this.tagsMultiLikeOr;
    }
    public void setTagsMultiLikeOr(String tagsMultiLikeOr){
        this.tagsMultiLikeOr = tagsMultiLikeOr;
    }

    // tagsMultiLikeAnd:
    public String getTagsMultiLikeAnd(){
        return this.tagsMultiLikeAnd;
    }
    public void setTagsMultiLikeAnd(String tagsMultiLikeAnd){
        this.tagsMultiLikeAnd = tagsMultiLikeAnd;
    }

    // dcEqual:
    public Integer getDcEqual(){
        return this.dcEqual;
    }
    public void setDcEqual(Integer dcEqual){
        this.dcEqual = dcEqual;
    }

    // dcIn:
    public String getDcIn(){
        return this.dcIn;
    }
    public void setDcIn(String dcIn){
        this.dcIn = dcIn;
    }

    // parentIdEqual:
    public Integer getParentIdEqual(){
        return this.parentIdEqual;
    }
    public void setParentIdEqual(Integer parentIdEqual){
        this.parentIdEqual = parentIdEqual;
    }

    // parentIdIn:
    public String getParentIdIn(){
        return this.parentIdIn;
    }
    public void setParentIdIn(String parentIdIn){
        this.parentIdIn = parentIdIn;
    }


    public ServerNodeBaseFilter() {
       super();
    }

    public ServerNodeBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
        idIn = GsonParser.parseString(jsonObject.get("idIn"));
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
        updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
        heartbeatTimeGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("heartbeatTimeGreaterThanOrEqual"));
        heartbeatTimeLessThanOrEqual = GsonParser.parseInt(jsonObject.get("heartbeatTimeLessThanOrEqual"));
        nameEqual = GsonParser.parseString(jsonObject.get("nameEqual"));
        nameIn = GsonParser.parseString(jsonObject.get("nameIn"));
        systemNameEqual = GsonParser.parseString(jsonObject.get("systemNameEqual"));
        systemNameIn = GsonParser.parseString(jsonObject.get("systemNameIn"));
        hostNameLike = GsonParser.parseString(jsonObject.get("hostNameLike"));
        hostNameMultiLikeOr = GsonParser.parseString(jsonObject.get("hostNameMultiLikeOr"));
        hostNameMultiLikeAnd = GsonParser.parseString(jsonObject.get("hostNameMultiLikeAnd"));
        statusEqual = ServerNodeStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        typeEqual = ServerNodeType.get(GsonParser.parseString(jsonObject.get("typeEqual")));
        typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
        tagsLike = GsonParser.parseString(jsonObject.get("tagsLike"));
        tagsMultiLikeOr = GsonParser.parseString(jsonObject.get("tagsMultiLikeOr"));
        tagsMultiLikeAnd = GsonParser.parseString(jsonObject.get("tagsMultiLikeAnd"));
        dcEqual = GsonParser.parseInt(jsonObject.get("dcEqual"));
        dcIn = GsonParser.parseString(jsonObject.get("dcIn"));
        parentIdEqual = GsonParser.parseInt(jsonObject.get("parentIdEqual"));
        parentIdIn = GsonParser.parseString(jsonObject.get("parentIdIn"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaServerNodeBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        kparams.add("heartbeatTimeGreaterThanOrEqual", this.heartbeatTimeGreaterThanOrEqual);
        kparams.add("heartbeatTimeLessThanOrEqual", this.heartbeatTimeLessThanOrEqual);
        kparams.add("nameEqual", this.nameEqual);
        kparams.add("nameIn", this.nameIn);
        kparams.add("systemNameEqual", this.systemNameEqual);
        kparams.add("systemNameIn", this.systemNameIn);
        kparams.add("hostNameLike", this.hostNameLike);
        kparams.add("hostNameMultiLikeOr", this.hostNameMultiLikeOr);
        kparams.add("hostNameMultiLikeAnd", this.hostNameMultiLikeAnd);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("typeEqual", this.typeEqual);
        kparams.add("typeIn", this.typeIn);
        kparams.add("tagsLike", this.tagsLike);
        kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
        kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
        kparams.add("dcEqual", this.dcEqual);
        kparams.add("dcIn", this.dcIn);
        kparams.add("parentIdEqual", this.parentIdEqual);
        kparams.add("parentIdIn", this.parentIdIn);
        return kparams;
    }

}

