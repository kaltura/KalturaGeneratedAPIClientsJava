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
import com.kaltura.client.enums.CategoryEntryStatus;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class CategoryEntryBaseFilter extends RelatedFilter {

    private Integer categoryIdEqual;
    private String categoryIdIn;
    private String entryIdEqual;
    private String entryIdIn;
    private Integer createdAtGreaterThanOrEqual;
    private Integer createdAtLessThanOrEqual;
    private String categoryFullIdsStartsWith;
    private CategoryEntryStatus statusEqual;
    private String statusIn;
    private String creatorUserIdEqual;
    private String creatorUserIdIn;

    // categoryIdEqual:
    public Integer getCategoryIdEqual(){
        return this.categoryIdEqual;
    }
    public void setCategoryIdEqual(Integer categoryIdEqual){
        this.categoryIdEqual = categoryIdEqual;
    }

    // categoryIdIn:
    public String getCategoryIdIn(){
        return this.categoryIdIn;
    }
    public void setCategoryIdIn(String categoryIdIn){
        this.categoryIdIn = categoryIdIn;
    }

    // entryIdEqual:
    public String getEntryIdEqual(){
        return this.entryIdEqual;
    }
    public void setEntryIdEqual(String entryIdEqual){
        this.entryIdEqual = entryIdEqual;
    }

    // entryIdIn:
    public String getEntryIdIn(){
        return this.entryIdIn;
    }
    public void setEntryIdIn(String entryIdIn){
        this.entryIdIn = entryIdIn;
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

    // categoryFullIdsStartsWith:
    public String getCategoryFullIdsStartsWith(){
        return this.categoryFullIdsStartsWith;
    }
    public void setCategoryFullIdsStartsWith(String categoryFullIdsStartsWith){
        this.categoryFullIdsStartsWith = categoryFullIdsStartsWith;
    }

    // statusEqual:
    public CategoryEntryStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(CategoryEntryStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // creatorUserIdEqual:
    public String getCreatorUserIdEqual(){
        return this.creatorUserIdEqual;
    }
    public void setCreatorUserIdEqual(String creatorUserIdEqual){
        this.creatorUserIdEqual = creatorUserIdEqual;
    }

    // creatorUserIdIn:
    public String getCreatorUserIdIn(){
        return this.creatorUserIdIn;
    }
    public void setCreatorUserIdIn(String creatorUserIdIn){
        this.creatorUserIdIn = creatorUserIdIn;
    }


    public CategoryEntryBaseFilter() {
       super();
    }

    public CategoryEntryBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        categoryIdEqual = GsonParser.parseInt(jsonObject.get("categoryIdEqual"));
        categoryIdIn = GsonParser.parseString(jsonObject.get("categoryIdIn"));
        entryIdEqual = GsonParser.parseString(jsonObject.get("entryIdEqual"));
        entryIdIn = GsonParser.parseString(jsonObject.get("entryIdIn"));
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        categoryFullIdsStartsWith = GsonParser.parseString(jsonObject.get("categoryFullIdsStartsWith"));
        statusEqual = CategoryEntryStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        creatorUserIdEqual = GsonParser.parseString(jsonObject.get("creatorUserIdEqual"));
        creatorUserIdIn = GsonParser.parseString(jsonObject.get("creatorUserIdIn"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaCategoryEntryBaseFilter");
        kparams.add("categoryIdEqual", this.categoryIdEqual);
        kparams.add("categoryIdIn", this.categoryIdIn);
        kparams.add("entryIdEqual", this.entryIdEqual);
        kparams.add("entryIdIn", this.entryIdIn);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("categoryFullIdsStartsWith", this.categoryFullIdsStartsWith);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("creatorUserIdEqual", this.creatorUserIdEqual);
        kparams.add("creatorUserIdIn", this.creatorUserIdIn);
        return kparams;
    }

}

