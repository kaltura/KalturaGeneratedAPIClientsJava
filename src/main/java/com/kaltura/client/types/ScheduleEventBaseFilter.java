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
import com.kaltura.client.enums.ScheduleEventRecurrenceType;
import com.kaltura.client.enums.ScheduleEventStatus;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class ScheduleEventBaseFilter extends RelatedFilter {

    private Integer idEqual;
    private String idIn;
    private String idNotIn;
    private Integer parentIdEqual;
    private String parentIdIn;
    private String parentIdNotIn;
    private ScheduleEventStatus statusEqual;
    private String statusIn;
    private Integer startDateGreaterThanOrEqual;
    private Integer startDateLessThanOrEqual;
    private Integer endDateGreaterThanOrEqual;
    private Integer endDateLessThanOrEqual;
    private String referenceIdEqual;
    private String referenceIdIn;
    private String ownerIdEqual;
    private String ownerIdIn;
    private Integer priorityEqual;
    private String priorityIn;
    private Integer priorityGreaterThanOrEqual;
    private Integer priorityLessThanOrEqual;
    private ScheduleEventRecurrenceType recurrenceTypeEqual;
    private String recurrenceTypeIn;
    private String tagsLike;
    private String tagsMultiLikeOr;
    private String tagsMultiLikeAnd;
    private Integer createdAtGreaterThanOrEqual;
    private Integer createdAtLessThanOrEqual;
    private Integer updatedAtGreaterThanOrEqual;
    private Integer updatedAtLessThanOrEqual;

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

    // idNotIn:
    public String getIdNotIn(){
        return this.idNotIn;
    }
    public void setIdNotIn(String idNotIn){
        this.idNotIn = idNotIn;
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

    // parentIdNotIn:
    public String getParentIdNotIn(){
        return this.parentIdNotIn;
    }
    public void setParentIdNotIn(String parentIdNotIn){
        this.parentIdNotIn = parentIdNotIn;
    }

    // statusEqual:
    public ScheduleEventStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(ScheduleEventStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // startDateGreaterThanOrEqual:
    public Integer getStartDateGreaterThanOrEqual(){
        return this.startDateGreaterThanOrEqual;
    }
    public void setStartDateGreaterThanOrEqual(Integer startDateGreaterThanOrEqual){
        this.startDateGreaterThanOrEqual = startDateGreaterThanOrEqual;
    }

    // startDateLessThanOrEqual:
    public Integer getStartDateLessThanOrEqual(){
        return this.startDateLessThanOrEqual;
    }
    public void setStartDateLessThanOrEqual(Integer startDateLessThanOrEqual){
        this.startDateLessThanOrEqual = startDateLessThanOrEqual;
    }

    // endDateGreaterThanOrEqual:
    public Integer getEndDateGreaterThanOrEqual(){
        return this.endDateGreaterThanOrEqual;
    }
    public void setEndDateGreaterThanOrEqual(Integer endDateGreaterThanOrEqual){
        this.endDateGreaterThanOrEqual = endDateGreaterThanOrEqual;
    }

    // endDateLessThanOrEqual:
    public Integer getEndDateLessThanOrEqual(){
        return this.endDateLessThanOrEqual;
    }
    public void setEndDateLessThanOrEqual(Integer endDateLessThanOrEqual){
        this.endDateLessThanOrEqual = endDateLessThanOrEqual;
    }

    // referenceIdEqual:
    public String getReferenceIdEqual(){
        return this.referenceIdEqual;
    }
    public void setReferenceIdEqual(String referenceIdEqual){
        this.referenceIdEqual = referenceIdEqual;
    }

    // referenceIdIn:
    public String getReferenceIdIn(){
        return this.referenceIdIn;
    }
    public void setReferenceIdIn(String referenceIdIn){
        this.referenceIdIn = referenceIdIn;
    }

    // ownerIdEqual:
    public String getOwnerIdEqual(){
        return this.ownerIdEqual;
    }
    public void setOwnerIdEqual(String ownerIdEqual){
        this.ownerIdEqual = ownerIdEqual;
    }

    // ownerIdIn:
    public String getOwnerIdIn(){
        return this.ownerIdIn;
    }
    public void setOwnerIdIn(String ownerIdIn){
        this.ownerIdIn = ownerIdIn;
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

    // recurrenceTypeEqual:
    public ScheduleEventRecurrenceType getRecurrenceTypeEqual(){
        return this.recurrenceTypeEqual;
    }
    public void setRecurrenceTypeEqual(ScheduleEventRecurrenceType recurrenceTypeEqual){
        this.recurrenceTypeEqual = recurrenceTypeEqual;
    }

    // recurrenceTypeIn:
    public String getRecurrenceTypeIn(){
        return this.recurrenceTypeIn;
    }
    public void setRecurrenceTypeIn(String recurrenceTypeIn){
        this.recurrenceTypeIn = recurrenceTypeIn;
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


    public ScheduleEventBaseFilter() {
       super();
    }

    public ScheduleEventBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
        idIn = GsonParser.parseString(jsonObject.get("idIn"));
        idNotIn = GsonParser.parseString(jsonObject.get("idNotIn"));
        parentIdEqual = GsonParser.parseInt(jsonObject.get("parentIdEqual"));
        parentIdIn = GsonParser.parseString(jsonObject.get("parentIdIn"));
        parentIdNotIn = GsonParser.parseString(jsonObject.get("parentIdNotIn"));
        statusEqual = ScheduleEventStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        startDateGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("startDateGreaterThanOrEqual"));
        startDateLessThanOrEqual = GsonParser.parseInt(jsonObject.get("startDateLessThanOrEqual"));
        endDateGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("endDateGreaterThanOrEqual"));
        endDateLessThanOrEqual = GsonParser.parseInt(jsonObject.get("endDateLessThanOrEqual"));
        referenceIdEqual = GsonParser.parseString(jsonObject.get("referenceIdEqual"));
        referenceIdIn = GsonParser.parseString(jsonObject.get("referenceIdIn"));
        ownerIdEqual = GsonParser.parseString(jsonObject.get("ownerIdEqual"));
        ownerIdIn = GsonParser.parseString(jsonObject.get("ownerIdIn"));
        priorityEqual = GsonParser.parseInt(jsonObject.get("priorityEqual"));
        priorityIn = GsonParser.parseString(jsonObject.get("priorityIn"));
        priorityGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("priorityGreaterThanOrEqual"));
        priorityLessThanOrEqual = GsonParser.parseInt(jsonObject.get("priorityLessThanOrEqual"));
        recurrenceTypeEqual = ScheduleEventRecurrenceType.get(GsonParser.parseInt(jsonObject.get("recurrenceTypeEqual")));
        recurrenceTypeIn = GsonParser.parseString(jsonObject.get("recurrenceTypeIn"));
        tagsLike = GsonParser.parseString(jsonObject.get("tagsLike"));
        tagsMultiLikeOr = GsonParser.parseString(jsonObject.get("tagsMultiLikeOr"));
        tagsMultiLikeAnd = GsonParser.parseString(jsonObject.get("tagsMultiLikeAnd"));
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
        updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaScheduleEventBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("idNotIn", this.idNotIn);
        kparams.add("parentIdEqual", this.parentIdEqual);
        kparams.add("parentIdIn", this.parentIdIn);
        kparams.add("parentIdNotIn", this.parentIdNotIn);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("startDateGreaterThanOrEqual", this.startDateGreaterThanOrEqual);
        kparams.add("startDateLessThanOrEqual", this.startDateLessThanOrEqual);
        kparams.add("endDateGreaterThanOrEqual", this.endDateGreaterThanOrEqual);
        kparams.add("endDateLessThanOrEqual", this.endDateLessThanOrEqual);
        kparams.add("referenceIdEqual", this.referenceIdEqual);
        kparams.add("referenceIdIn", this.referenceIdIn);
        kparams.add("ownerIdEqual", this.ownerIdEqual);
        kparams.add("ownerIdIn", this.ownerIdIn);
        kparams.add("priorityEqual", this.priorityEqual);
        kparams.add("priorityIn", this.priorityIn);
        kparams.add("priorityGreaterThanOrEqual", this.priorityGreaterThanOrEqual);
        kparams.add("priorityLessThanOrEqual", this.priorityLessThanOrEqual);
        kparams.add("recurrenceTypeEqual", this.recurrenceTypeEqual);
        kparams.add("recurrenceTypeIn", this.recurrenceTypeIn);
        kparams.add("tagsLike", this.tagsLike);
        kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
        kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        return kparams;
    }

}

