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
import com.kaltura.client.enums.UserAssetsListItemType;
import com.kaltura.client.enums.UserAssetsListType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  An item of user asset list  */
@SuppressWarnings("serial")
public class UserAssetsListItem extends ObjectBase {

	/**  Asset identifier  */
    private String id;
	/**  The order index of the asset in the list  */
    private Integer orderIndex;
	/**  The type of the asset  */
    private UserAssetsListItemType type;
	/**  The identifier of the user who added the item to the list  */
    private String userId;
	/**  The type of the list  */
    private UserAssetsListType listType;

    // id:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    // orderIndex:
    public Integer getOrderIndex(){
        return this.orderIndex;
    }
    public void setOrderIndex(Integer orderIndex){
        this.orderIndex = orderIndex;
    }

    // type:
    public UserAssetsListItemType getType(){
        return this.type;
    }
    public void setType(UserAssetsListItemType type){
        this.type = type;
    }

    // userId:
    public String getUserId(){
        return this.userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }

    // listType:
    public UserAssetsListType getListType(){
        return this.listType;
    }
    public void setListType(UserAssetsListType listType){
        this.listType = listType;
    }


    public UserAssetsListItem() {
       super();
    }

    public UserAssetsListItem(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseString(jsonObject.get("id"));
        orderIndex = GsonParser.parseInt(jsonObject.get("orderIndex"));
        type = UserAssetsListItemType.get(GsonParser.parseString(jsonObject.get("type")));
        userId = GsonParser.parseString(jsonObject.get("userId"));
        listType = UserAssetsListType.get(GsonParser.parseString(jsonObject.get("listType")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaUserAssetsListItem");
        kparams.add("id", this.id);
        kparams.add("orderIndex", this.orderIndex);
        kparams.add("type", this.type);
        kparams.add("listType", this.listType);
        return kparams;
    }

}

