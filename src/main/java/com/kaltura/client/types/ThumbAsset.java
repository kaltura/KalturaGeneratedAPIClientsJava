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
import com.kaltura.client.enums.ThumbAssetStatus;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ThumbAsset extends Asset {

	/**  The Flavor Params used to create this Flavor Asset  */
    private Integer thumbParamsId;
	/**  The width of the Flavor Asset  */
    private Integer width;
	/**  The height of the Flavor Asset  */
    private Integer height;
	/**  The status of the asset  */
    private ThumbAssetStatus status;

    // thumbParamsId:
    public Integer getThumbParamsId(){
        return this.thumbParamsId;
    }
    public void setThumbParamsId(Integer thumbParamsId){
        this.thumbParamsId = thumbParamsId;
    }

    // width:
    public Integer getWidth(){
        return this.width;
    }
    public void setWidth(Integer width){
        this.width = width;
    }

    // height:
    public Integer getHeight(){
        return this.height;
    }
    public void setHeight(Integer height){
        this.height = height;
    }

    // status:
    public ThumbAssetStatus getStatus(){
        return this.status;
    }
    public void setStatus(ThumbAssetStatus status){
        this.status = status;
    }


    public ThumbAsset() {
       super();
    }

    public ThumbAsset(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        thumbParamsId = GsonParser.parseInt(jsonObject.get("thumbParamsId"));
        width = GsonParser.parseInt(jsonObject.get("width"));
        height = GsonParser.parseInt(jsonObject.get("height"));
        status = ThumbAssetStatus.get(GsonParser.parseInt(jsonObject.get("status")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaThumbAsset");
        kparams.add("thumbParamsId", this.thumbParamsId);
        return kparams;
    }

}

