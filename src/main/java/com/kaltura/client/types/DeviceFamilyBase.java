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

/**  Device family details  */
@SuppressWarnings("serial")
public class DeviceFamilyBase extends ObjectBase {

	/**  Device family identifier  */
    private Long id;
	/**  Device family name  */
    private String name;
	/**  Max number of devices allowed for this family  */
    private Integer deviceLimit;
	/**  Max number of streams allowed for this family  */
    private Integer concurrentLimit;

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

    // deviceLimit:
    public Integer getDeviceLimit(){
        return this.deviceLimit;
    }
    public void setDeviceLimit(Integer deviceLimit){
        this.deviceLimit = deviceLimit;
    }

    // concurrentLimit:
    public Integer getConcurrentLimit(){
        return this.concurrentLimit;
    }
    public void setConcurrentLimit(Integer concurrentLimit){
        this.concurrentLimit = concurrentLimit;
    }


    public DeviceFamilyBase() {
       super();
    }

    public DeviceFamilyBase(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseLong(jsonObject.get("id"));
        name = GsonParser.parseString(jsonObject.get("name"));
        deviceLimit = GsonParser.parseInt(jsonObject.get("deviceLimit"));
        concurrentLimit = GsonParser.parseInt(jsonObject.get("concurrentLimit"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaDeviceFamilyBase");
        kparams.add("name", this.name);
        kparams.add("deviceLimit", this.deviceLimit);
        kparams.add("concurrentLimit", this.concurrentLimit);
        return kparams;
    }

}

