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
public abstract class CodeCuePointBaseFilter extends CuePointFilter {

    private String codeLike;
    private String codeMultiLikeOr;
    private String codeMultiLikeAnd;
    private String codeEqual;
    private String codeIn;
    private String descriptionLike;
    private String descriptionMultiLikeOr;
    private String descriptionMultiLikeAnd;
    private Integer endTimeGreaterThanOrEqual;
    private Integer endTimeLessThanOrEqual;
    private Integer durationGreaterThanOrEqual;
    private Integer durationLessThanOrEqual;

    // codeLike:
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    // codeMultiLikeOr:
    public String getCodeMultiLikeOr(){
        return this.codeMultiLikeOr;
    }
    public void setCodeMultiLikeOr(String codeMultiLikeOr){
        this.codeMultiLikeOr = codeMultiLikeOr;
    }

    // codeMultiLikeAnd:
    public String getCodeMultiLikeAnd(){
        return this.codeMultiLikeAnd;
    }
    public void setCodeMultiLikeAnd(String codeMultiLikeAnd){
        this.codeMultiLikeAnd = codeMultiLikeAnd;
    }

    // codeEqual:
    public String getCodeEqual(){
        return this.codeEqual;
    }
    public void setCodeEqual(String codeEqual){
        this.codeEqual = codeEqual;
    }

    // codeIn:
    public String getCodeIn(){
        return this.codeIn;
    }
    public void setCodeIn(String codeIn){
        this.codeIn = codeIn;
    }

    // descriptionLike:
    public String getDescriptionLike(){
        return this.descriptionLike;
    }
    public void setDescriptionLike(String descriptionLike){
        this.descriptionLike = descriptionLike;
    }

    // descriptionMultiLikeOr:
    public String getDescriptionMultiLikeOr(){
        return this.descriptionMultiLikeOr;
    }
    public void setDescriptionMultiLikeOr(String descriptionMultiLikeOr){
        this.descriptionMultiLikeOr = descriptionMultiLikeOr;
    }

    // descriptionMultiLikeAnd:
    public String getDescriptionMultiLikeAnd(){
        return this.descriptionMultiLikeAnd;
    }
    public void setDescriptionMultiLikeAnd(String descriptionMultiLikeAnd){
        this.descriptionMultiLikeAnd = descriptionMultiLikeAnd;
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


    public CodeCuePointBaseFilter() {
       super();
    }

    public CodeCuePointBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        codeLike = GsonParser.parseString(jsonObject.get("codeLike"));
        codeMultiLikeOr = GsonParser.parseString(jsonObject.get("codeMultiLikeOr"));
        codeMultiLikeAnd = GsonParser.parseString(jsonObject.get("codeMultiLikeAnd"));
        codeEqual = GsonParser.parseString(jsonObject.get("codeEqual"));
        codeIn = GsonParser.parseString(jsonObject.get("codeIn"));
        descriptionLike = GsonParser.parseString(jsonObject.get("descriptionLike"));
        descriptionMultiLikeOr = GsonParser.parseString(jsonObject.get("descriptionMultiLikeOr"));
        descriptionMultiLikeAnd = GsonParser.parseString(jsonObject.get("descriptionMultiLikeAnd"));
        endTimeGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("endTimeGreaterThanOrEqual"));
        endTimeLessThanOrEqual = GsonParser.parseInt(jsonObject.get("endTimeLessThanOrEqual"));
        durationGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("durationGreaterThanOrEqual"));
        durationLessThanOrEqual = GsonParser.parseInt(jsonObject.get("durationLessThanOrEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaCodeCuePointBaseFilter");
        kparams.add("codeLike", this.codeLike);
        kparams.add("codeMultiLikeOr", this.codeMultiLikeOr);
        kparams.add("codeMultiLikeAnd", this.codeMultiLikeAnd);
        kparams.add("codeEqual", this.codeEqual);
        kparams.add("codeIn", this.codeIn);
        kparams.add("descriptionLike", this.descriptionLike);
        kparams.add("descriptionMultiLikeOr", this.descriptionMultiLikeOr);
        kparams.add("descriptionMultiLikeAnd", this.descriptionMultiLikeAnd);
        kparams.add("endTimeGreaterThanOrEqual", this.endTimeGreaterThanOrEqual);
        kparams.add("endTimeLessThanOrEqual", this.endTimeLessThanOrEqual);
        kparams.add("durationGreaterThanOrEqual", this.durationGreaterThanOrEqual);
        kparams.add("durationLessThanOrEqual", this.durationLessThanOrEqual);
        return kparams;
    }

}

