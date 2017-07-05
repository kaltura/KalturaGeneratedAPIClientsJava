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
import com.kaltura.client.enums.CategoryEntryAdvancedOrderBy;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class CategoryEntryAdvancedFilter extends SearchItem {

    private String categoriesMatchOr;
    private String categoryEntryStatusIn;
    private CategoryEntryAdvancedOrderBy orderBy;
    private Integer categoryIdEqual;

    // categoriesMatchOr:
    public String getCategoriesMatchOr(){
        return this.categoriesMatchOr;
    }
    public void setCategoriesMatchOr(String categoriesMatchOr){
        this.categoriesMatchOr = categoriesMatchOr;
    }

    // categoryEntryStatusIn:
    public String getCategoryEntryStatusIn(){
        return this.categoryEntryStatusIn;
    }
    public void setCategoryEntryStatusIn(String categoryEntryStatusIn){
        this.categoryEntryStatusIn = categoryEntryStatusIn;
    }

    // orderBy:
    public CategoryEntryAdvancedOrderBy getOrderBy(){
        return this.orderBy;
    }
    public void setOrderBy(CategoryEntryAdvancedOrderBy orderBy){
        this.orderBy = orderBy;
    }

    // categoryIdEqual:
    public Integer getCategoryIdEqual(){
        return this.categoryIdEqual;
    }
    public void setCategoryIdEqual(Integer categoryIdEqual){
        this.categoryIdEqual = categoryIdEqual;
    }


    public CategoryEntryAdvancedFilter() {
       super();
    }

    public CategoryEntryAdvancedFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        categoriesMatchOr = GsonParser.parseString(jsonObject.get("categoriesMatchOr"));
        categoryEntryStatusIn = GsonParser.parseString(jsonObject.get("categoryEntryStatusIn"));
        orderBy = CategoryEntryAdvancedOrderBy.get(GsonParser.parseString(jsonObject.get("orderBy")));
        categoryIdEqual = GsonParser.parseInt(jsonObject.get("categoryIdEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaCategoryEntryAdvancedFilter");
        kparams.add("categoriesMatchOr", this.categoriesMatchOr);
        kparams.add("categoryEntryStatusIn", this.categoryEntryStatusIn);
        kparams.add("orderBy", this.orderBy);
        kparams.add("categoryIdEqual", this.categoryIdEqual);
        return kparams;
    }

}

