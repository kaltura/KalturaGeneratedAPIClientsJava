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
import com.kaltura.client.enums.ScheduledTaskAddOrRemoveType;
import com.kaltura.client.utils.GsonParser;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ModifyCategoriesObjectTask extends ObjectTask {

	/**  Should the object task add or remove categories?  */
    private ScheduledTaskAddOrRemoveType addRemoveType;
	/**  The list of category ids to add or remove  */
    private List<IntegerValue> categoryIds;

    // addRemoveType:
    public ScheduledTaskAddOrRemoveType getAddRemoveType(){
        return this.addRemoveType;
    }
    public void setAddRemoveType(ScheduledTaskAddOrRemoveType addRemoveType){
        this.addRemoveType = addRemoveType;
    }

    // categoryIds:
    public List<IntegerValue> getCategoryIds(){
        return this.categoryIds;
    }
    public void setCategoryIds(List<IntegerValue> categoryIds){
        this.categoryIds = categoryIds;
    }


    public ModifyCategoriesObjectTask() {
       super();
    }

    public ModifyCategoriesObjectTask(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        addRemoveType = ScheduledTaskAddOrRemoveType.get(GsonParser.parseInt(jsonObject.get("addRemoveType")));
        categoryIds = GsonParser.parseArray(jsonObject.getAsJsonArray("categoryIds"), IntegerValue.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaModifyCategoriesObjectTask");
        kparams.add("addRemoveType", this.addRemoveType);
        kparams.add("categoryIds", this.categoryIds);
        return kparams;
    }

}

