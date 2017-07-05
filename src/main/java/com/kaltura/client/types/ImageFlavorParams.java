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
public class ImageFlavorParams extends FlavorParams {

    private Integer densityWidth;
    private Integer densityHeight;
    private Integer sizeWidth;
    private Integer sizeHeight;
    private Integer depth;

    // densityWidth:
    public Integer getDensityWidth(){
        return this.densityWidth;
    }
    public void setDensityWidth(Integer densityWidth){
        this.densityWidth = densityWidth;
    }

    // densityHeight:
    public Integer getDensityHeight(){
        return this.densityHeight;
    }
    public void setDensityHeight(Integer densityHeight){
        this.densityHeight = densityHeight;
    }

    // sizeWidth:
    public Integer getSizeWidth(){
        return this.sizeWidth;
    }
    public void setSizeWidth(Integer sizeWidth){
        this.sizeWidth = sizeWidth;
    }

    // sizeHeight:
    public Integer getSizeHeight(){
        return this.sizeHeight;
    }
    public void setSizeHeight(Integer sizeHeight){
        this.sizeHeight = sizeHeight;
    }

    // depth:
    public Integer getDepth(){
        return this.depth;
    }
    public void setDepth(Integer depth){
        this.depth = depth;
    }


    public ImageFlavorParams() {
       super();
    }

    public ImageFlavorParams(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        densityWidth = GsonParser.parseInt(jsonObject.get("densityWidth"));
        densityHeight = GsonParser.parseInt(jsonObject.get("densityHeight"));
        sizeWidth = GsonParser.parseInt(jsonObject.get("sizeWidth"));
        sizeHeight = GsonParser.parseInt(jsonObject.get("sizeHeight"));
        depth = GsonParser.parseInt(jsonObject.get("depth"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaImageFlavorParams");
        kparams.add("densityWidth", this.densityWidth);
        kparams.add("densityHeight", this.densityHeight);
        kparams.add("sizeWidth", this.sizeWidth);
        kparams.add("sizeHeight", this.sizeHeight);
        kparams.add("depth", this.depth);
        return kparams;
    }

}

