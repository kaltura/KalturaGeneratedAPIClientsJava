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
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Preview module  */
@SuppressWarnings("serial")
public class PreviewModule extends ObjectBase {

	/**  Preview module identifier  */
    private Long id;
	/**  Preview module name  */
    private String name;
	/**  Preview module life cycle - for how long the preview module is active  */
    private Integer lifeCycle;
	/**  The time you can&amp;#39;t buy the item to which the preview module is assigned
	  to again  */
    private Integer nonRenewablePeriod;

    // id:
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // lifeCycle:
    public Integer getLifeCycle(){
        return this.lifeCycle;
    }
    public void setLifeCycle(Integer lifeCycle){
        this.lifeCycle = lifeCycle;
    }

    // nonRenewablePeriod:
    public Integer getNonRenewablePeriod(){
        return this.nonRenewablePeriod;
    }
    public void setNonRenewablePeriod(Integer nonRenewablePeriod){
        this.nonRenewablePeriod = nonRenewablePeriod;
    }


    public PreviewModule() {
       super();
    }

    public PreviewModule(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseLong(jsonObject.get("id"));
        name = GsonParser.parseString(jsonObject.get("name"));
        lifeCycle = GsonParser.parseInt(jsonObject.get("lifeCycle"));
        nonRenewablePeriod = GsonParser.parseInt(jsonObject.get("nonRenewablePeriod"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaPreviewModule");
        kparams.add("name", this.name);
        kparams.add("lifeCycle", this.lifeCycle);
        kparams.add("nonRenewablePeriod", this.nonRenewablePeriod);
        return kparams;
    }

}

