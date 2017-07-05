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
import com.kaltura.client.enums.DeviceStatus;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Device details  */
@SuppressWarnings("serial")
public class HouseholdDevice extends ObjectBase {

	/**  Household identifier  */
    private Integer householdId;
	/**  Device UDID  */
    private String udid;
	/**  Device name  */
    private String name;
	/**  Device brand name  */
    private String brand;
	/**  Device brand identifier  */
    private Integer brandId;
	/**  Device activation date (epoch)  */
    private Long activatedOn;
	/**  Device state  */
    private DeviceStatus status;

    // householdId:
    public Integer getHouseholdId(){
        return this.householdId;
    }
    public void setHouseholdId(Integer householdId){
        this.householdId = householdId;
    }

    // udid:
    public String getUdid(){
        return this.udid;
    }
    public void setUdid(String udid){
        this.udid = udid;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // brand:
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    // brandId:
    public Integer getBrandId(){
        return this.brandId;
    }
    public void setBrandId(Integer brandId){
        this.brandId = brandId;
    }

    // activatedOn:
    public Long getActivatedOn(){
        return this.activatedOn;
    }
    public void setActivatedOn(Long activatedOn){
        this.activatedOn = activatedOn;
    }

    // status:
    public DeviceStatus getStatus(){
        return this.status;
    }
    public void setStatus(DeviceStatus status){
        this.status = status;
    }


    public HouseholdDevice() {
       super();
    }

    public HouseholdDevice(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        householdId = GsonParser.parseInt(jsonObject.get("householdId"));
        udid = GsonParser.parseString(jsonObject.get("udid"));
        name = GsonParser.parseString(jsonObject.get("name"));
        brand = GsonParser.parseString(jsonObject.get("brand"));
        brandId = GsonParser.parseInt(jsonObject.get("brandId"));
        activatedOn = GsonParser.parseLong(jsonObject.get("activatedOn"));
        status = DeviceStatus.get(GsonParser.parseString(jsonObject.get("status")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaHouseholdDevice");
        kparams.add("householdId", this.householdId);
        kparams.add("udid", this.udid);
        kparams.add("name", this.name);
        kparams.add("brand", this.brand);
        kparams.add("brandId", this.brandId);
        kparams.add("activatedOn", this.activatedOn);
        return kparams;
    }

}

