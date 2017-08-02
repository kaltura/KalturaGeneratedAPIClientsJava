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
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class AnnotationBaseFilter extends CuePointFilter {

    private String parentIdEqual;
    private String parentIdIn;
    private String textLike;
    private String textMultiLikeOr;
    private String textMultiLikeAnd;
    private Integer endTimeGreaterThanOrEqual;
    private Integer endTimeLessThanOrEqual;
    private Integer durationGreaterThanOrEqual;
    private Integer durationLessThanOrEqual;
    private Boolean isPublicEqual;

    // parentIdEqual:
    public String getParentIdEqual(){
        return this.parentIdEqual;
    }
    public void setParentIdEqual(String parentIdEqual){
        this.parentIdEqual = parentIdEqual;
    }

    // parentIdIn:
    public String getParentIdIn(){
        return this.parentIdIn;
    }
    public void setParentIdIn(String parentIdIn){
        this.parentIdIn = parentIdIn;
    }

    // textLike:
    public String getTextLike(){
        return this.textLike;
    }
    public void setTextLike(String textLike){
        this.textLike = textLike;
    }

    // textMultiLikeOr:
    public String getTextMultiLikeOr(){
        return this.textMultiLikeOr;
    }
    public void setTextMultiLikeOr(String textMultiLikeOr){
        this.textMultiLikeOr = textMultiLikeOr;
    }

    // textMultiLikeAnd:
    public String getTextMultiLikeAnd(){
        return this.textMultiLikeAnd;
    }
    public void setTextMultiLikeAnd(String textMultiLikeAnd){
        this.textMultiLikeAnd = textMultiLikeAnd;
    }

    // endTimeGreaterThanOrEqual:
    public Integer getEndTimeGreaterThanOrEqual(){
        return this.endTimeGreaterThanOrEqual;
    }
    public void setEndTimeGreaterThanOrEqual(Integer endTimeGreaterThanOrEqual){
        this.endTimeGreaterThanOrEqual = endTimeGreaterThanOrEqual;
    }

    // endTimeLessThanOrEqual:
    public Integer getEndTimeLessThanOrEqual(){
        return this.endTimeLessThanOrEqual;
    }
    public void setEndTimeLessThanOrEqual(Integer endTimeLessThanOrEqual){
        this.endTimeLessThanOrEqual = endTimeLessThanOrEqual;
    }

    // durationGreaterThanOrEqual:
    public Integer getDurationGreaterThanOrEqual(){
        return this.durationGreaterThanOrEqual;
    }
    public void setDurationGreaterThanOrEqual(Integer durationGreaterThanOrEqual){
        this.durationGreaterThanOrEqual = durationGreaterThanOrEqual;
    }

    // durationLessThanOrEqual:
    public Integer getDurationLessThanOrEqual(){
        return this.durationLessThanOrEqual;
    }
    public void setDurationLessThanOrEqual(Integer durationLessThanOrEqual){
        this.durationLessThanOrEqual = durationLessThanOrEqual;
    }

    // isPublicEqual:
    public Boolean getIsPublicEqual(){
        return this.isPublicEqual;
    }
    public void setIsPublicEqual(Boolean isPublicEqual){
        this.isPublicEqual = isPublicEqual;
    }


    public AnnotationBaseFilter() {
       super();
    }

    public AnnotationBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        parentIdEqual = GsonParser.parseString(jsonObject.get("parentIdEqual"));
        parentIdIn = GsonParser.parseString(jsonObject.get("parentIdIn"));
        textLike = GsonParser.parseString(jsonObject.get("textLike"));
        textMultiLikeOr = GsonParser.parseString(jsonObject.get("textMultiLikeOr"));
        textMultiLikeAnd = GsonParser.parseString(jsonObject.get("textMultiLikeAnd"));
        endTimeGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("endTimeGreaterThanOrEqual"));
        endTimeLessThanOrEqual = GsonParser.parseInt(jsonObject.get("endTimeLessThanOrEqual"));
        durationGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("durationGreaterThanOrEqual"));
        durationLessThanOrEqual = GsonParser.parseInt(jsonObject.get("durationLessThanOrEqual"));
        isPublicEqual = GsonParser.parseBoolean(jsonObject.get("isPublicEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAnnotationBaseFilter");
        kparams.add("parentIdEqual", this.parentIdEqual);
        kparams.add("parentIdIn", this.parentIdIn);
        kparams.add("textLike", this.textLike);
        kparams.add("textMultiLikeOr", this.textMultiLikeOr);
        kparams.add("textMultiLikeAnd", this.textMultiLikeAnd);
        kparams.add("endTimeGreaterThanOrEqual", this.endTimeGreaterThanOrEqual);
        kparams.add("endTimeLessThanOrEqual", this.endTimeLessThanOrEqual);
        kparams.add("durationGreaterThanOrEqual", this.durationGreaterThanOrEqual);
        kparams.add("durationLessThanOrEqual", this.durationLessThanOrEqual);
        kparams.add("isPublicEqual", this.isPublicEqual);
        return kparams;
    }

}

