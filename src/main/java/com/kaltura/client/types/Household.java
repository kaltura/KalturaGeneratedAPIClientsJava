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
import com.kaltura.client.enums.HouseholdState;
import com.kaltura.client.enums.HouseholdRestriction;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Household details  */
@SuppressWarnings("serial")
public class Household extends ObjectBase {

	/**  Household identifier  */
    private Long id;
	/**  Household name  */
    private String name;
	/**  Household description  */
    private String description;
	/**  Household external identifier  */
    private String externalId;
	/**  Household limitation module identifier  */
    private Integer householdLimitationsId;
	/**  The max number of the devices that can be added to the household  */
    private Integer devicesLimit;
	/**  The max number of the users that can be added to the household  */
    private Integer usersLimit;
	/**  The max number of concurrent streams in the household  */
    private Integer concurrentLimit;
	/**  The households region identifier  */
    private Integer regionId;
	/**  Household state  */
    private HouseholdState state;
	/**  Is household frequency enabled  */
    private Boolean isFrequencyEnabled;
	/**  The next time a device is allowed to be removed from the household (epoch)  */
    private Long frequencyNextDeviceAction;
	/**  The next time a user is allowed to be removed from the household (epoch)  */
    private Long frequencyNextUserAction;
	/**  Household restriction  */
    private HouseholdRestriction restriction;

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

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // externalId:
    public String getExternalId(){
        return this.externalId;
    }
    public void setExternalId(String externalId){
        this.externalId = externalId;
    }

    // householdLimitationsId:
    public Integer getHouseholdLimitationsId(){
        return this.householdLimitationsId;
    }
    public void setHouseholdLimitationsId(Integer householdLimitationsId){
        this.householdLimitationsId = householdLimitationsId;
    }

    // devicesLimit:
    public Integer getDevicesLimit(){
        return this.devicesLimit;
    }
    public void setDevicesLimit(Integer devicesLimit){
        this.devicesLimit = devicesLimit;
    }

    // usersLimit:
    public Integer getUsersLimit(){
        return this.usersLimit;
    }
    public void setUsersLimit(Integer usersLimit){
        this.usersLimit = usersLimit;
    }

    // concurrentLimit:
    public Integer getConcurrentLimit(){
        return this.concurrentLimit;
    }
    public void setConcurrentLimit(Integer concurrentLimit){
        this.concurrentLimit = concurrentLimit;
    }

    // regionId:
    public Integer getRegionId(){
        return this.regionId;
    }
    public void setRegionId(Integer regionId){
        this.regionId = regionId;
    }

    // state:
    public HouseholdState getState(){
        return this.state;
    }
    public void setState(HouseholdState state){
        this.state = state;
    }

    // isFrequencyEnabled:
    public Boolean getIsFrequencyEnabled(){
        return this.isFrequencyEnabled;
    }
    public void setIsFrequencyEnabled(Boolean isFrequencyEnabled){
        this.isFrequencyEnabled = isFrequencyEnabled;
    }

    // frequencyNextDeviceAction:
    public Long getFrequencyNextDeviceAction(){
        return this.frequencyNextDeviceAction;
    }
    public void setFrequencyNextDeviceAction(Long frequencyNextDeviceAction){
        this.frequencyNextDeviceAction = frequencyNextDeviceAction;
    }

    // frequencyNextUserAction:
    public Long getFrequencyNextUserAction(){
        return this.frequencyNextUserAction;
    }
    public void setFrequencyNextUserAction(Long frequencyNextUserAction){
        this.frequencyNextUserAction = frequencyNextUserAction;
    }

    // restriction:
    public HouseholdRestriction getRestriction(){
        return this.restriction;
    }
    public void setRestriction(HouseholdRestriction restriction){
        this.restriction = restriction;
    }


    public Household() {
       super();
    }

    public Household(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseLong(jsonObject.get("id"));
        name = GsonParser.parseString(jsonObject.get("name"));
        description = GsonParser.parseString(jsonObject.get("description"));
        externalId = GsonParser.parseString(jsonObject.get("externalId"));
        householdLimitationsId = GsonParser.parseInt(jsonObject.get("householdLimitationsId"));
        devicesLimit = GsonParser.parseInt(jsonObject.get("devicesLimit"));
        usersLimit = GsonParser.parseInt(jsonObject.get("usersLimit"));
        concurrentLimit = GsonParser.parseInt(jsonObject.get("concurrentLimit"));
        regionId = GsonParser.parseInt(jsonObject.get("regionId"));
        state = HouseholdState.get(GsonParser.parseString(jsonObject.get("state")));
        isFrequencyEnabled = GsonParser.parseBoolean(jsonObject.get("isFrequencyEnabled"));
        frequencyNextDeviceAction = GsonParser.parseLong(jsonObject.get("frequencyNextDeviceAction"));
        frequencyNextUserAction = GsonParser.parseLong(jsonObject.get("frequencyNextUserAction"));
        restriction = HouseholdRestriction.get(GsonParser.parseString(jsonObject.get("restriction")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaHousehold");
        kparams.add("name", this.name);
        kparams.add("description", this.description);
        kparams.add("externalId", this.externalId);
        kparams.add("householdLimitationsId", this.householdLimitationsId);
        kparams.add("devicesLimit", this.devicesLimit);
        kparams.add("usersLimit", this.usersLimit);
        kparams.add("concurrentLimit", this.concurrentLimit);
        kparams.add("regionId", this.regionId);
        kparams.add("isFrequencyEnabled", this.isFrequencyEnabled);
        kparams.add("frequencyNextDeviceAction", this.frequencyNextDeviceAction);
        kparams.add("frequencyNextUserAction", this.frequencyNextUserAction);
        kparams.add("restriction", this.restriction);
        return kparams;
    }

}

