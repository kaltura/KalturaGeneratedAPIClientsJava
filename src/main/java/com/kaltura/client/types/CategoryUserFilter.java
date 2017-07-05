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
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class CategoryUserFilter extends CategoryUserBaseFilter {

	/**  Return the list of categoryUser that are not inherited from parent category -
	  only the direct categoryUsers.  */
    private Boolean categoryDirectMembers;
	/**  Free text search on user id or screen name  */
    private String freeText;
	/**  Return a list of categoryUser that related to the userId in this field by groups  */
    private String relatedGroupsByUserId;

    // categoryDirectMembers:
    public Boolean getCategoryDirectMembers(){
        return this.categoryDirectMembers;
    }
    public void setCategoryDirectMembers(Boolean categoryDirectMembers){
        this.categoryDirectMembers = categoryDirectMembers;
    }

    // freeText:
    public String getFreeText(){
        return this.freeText;
    }
    public void setFreeText(String freeText){
        this.freeText = freeText;
    }

    // relatedGroupsByUserId:
    public String getRelatedGroupsByUserId(){
        return this.relatedGroupsByUserId;
    }
    public void setRelatedGroupsByUserId(String relatedGroupsByUserId){
        this.relatedGroupsByUserId = relatedGroupsByUserId;
    }


    public CategoryUserFilter() {
       super();
    }

    public CategoryUserFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        categoryDirectMembers = GsonParser.parseBoolean(jsonObject.get("categoryDirectMembers"));
        freeText = GsonParser.parseString(jsonObject.get("freeText"));
        relatedGroupsByUserId = GsonParser.parseString(jsonObject.get("relatedGroupsByUserId"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaCategoryUserFilter");
        kparams.add("categoryDirectMembers", this.categoryDirectMembers);
        kparams.add("freeText", this.freeText);
        kparams.add("relatedGroupsByUserId", this.relatedGroupsByUserId);
        return kparams;
    }

}

