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
import com.kaltura.client.enums.AssetOrderBy;
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Channel details  */
@SuppressWarnings("serial")
public class Channel extends BaseChannel {

	/**  Cannel description  */
    private String description;
	/**  Channel images  */
    private List<MediaImage> images;
	/**  Asset types in the channel.              -26 is EPG  */
    private List<IntegerValue> assetTypes;
	/**  Filter expression  */
    private String filterExpression;
	/**  active status  */
    private Boolean isActive;
	/**  Channel order  */
    private AssetOrderBy order;

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // images:
    public List<MediaImage> getImages(){
        return this.images;
    }
    public void setImages(List<MediaImage> images){
        this.images = images;
    }

    // assetTypes:
    public List<IntegerValue> getAssetTypes(){
        return this.assetTypes;
    }
    public void setAssetTypes(List<IntegerValue> assetTypes){
        this.assetTypes = assetTypes;
    }

    // filterExpression:
    public String getFilterExpression(){
        return this.filterExpression;
    }
    public void setFilterExpression(String filterExpression){
        this.filterExpression = filterExpression;
    }

    // isActive:
    public Boolean getIsActive(){
        return this.isActive;
    }
    public void setIsActive(Boolean isActive){
        this.isActive = isActive;
    }

    // order:
    public AssetOrderBy getOrder(){
        return this.order;
    }
    public void setOrder(AssetOrderBy order){
        this.order = order;
    }


    public Channel() {
       super();
    }

    public Channel(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        description = GsonParser.parseString(jsonObject.get("description"));
        images = GsonParser.parseArray(jsonObject.getAsJsonArray("images"), MediaImage.class);
        assetTypes = GsonParser.parseArray(jsonObject.getAsJsonArray("assetTypes"), IntegerValue.class);
        filterExpression = GsonParser.parseString(jsonObject.get("filterExpression"));
        isActive = GsonParser.parseBoolean(jsonObject.get("isActive"));
        order = AssetOrderBy.get(GsonParser.parseString(jsonObject.get("order")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaChannel");
        kparams.add("description", this.description);
        kparams.add("images", this.images);
        kparams.add("assetTypes", this.assetTypes);
        kparams.add("filterExpression", this.filterExpression);
        kparams.add("isActive", this.isActive);
        kparams.add("order", this.order);
        return kparams;
    }

}

