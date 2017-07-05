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
import com.kaltura.client.types.Country;
import com.kaltura.client.types.OTTUserType;
import com.kaltura.client.enums.HouseholdSuspentionState;
import com.kaltura.client.enums.UserState;
import java.util.Map;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  User  */
@SuppressWarnings("serial")
public class OTTUser extends BaseOTTUser {

	/**  Household identifier  */
    private Integer householdId;
	/**  Email  */
    private String email;
	/**  Address  */
    private String address;
	/**  City  */
    private String city;
	/**  Country  */
    private Country country;
	/**  Zip code  */
    private String zip;
	/**  Phone  */
    private String phone;
	/**  Affiliate code  */
    private String affiliateCode;
	/**  External user identifier  */
    private String externalId;
	/**  User type  */
    private OTTUserType userType;
	/**  Dynamic data  */
    private Map<String, StringValue> dynamicData;
	/**  Is the user the household master  */
    private Boolean isHouseholdMaster;
	/**  Suspention state  */
    private HouseholdSuspentionState suspentionState;
	/**  User state  */
    private UserState userState;

    // householdId:
    public Integer getHouseholdId(){
        return this.householdId;
    }
    public void setHouseholdId(Integer householdId){
        this.householdId = householdId;
    }

    // email:
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    // address:
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    // city:
    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        this.city = city;
    }

    // country:
    public Country getCountry(){
        return this.country;
    }
    public void setCountry(Country country){
        this.country = country;
    }

    // zip:
    public String getZip(){
        return this.zip;
    }
    public void setZip(String zip){
        this.zip = zip;
    }

    // phone:
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    // affiliateCode:
    public String getAffiliateCode(){
        return this.affiliateCode;
    }
    public void setAffiliateCode(String affiliateCode){
        this.affiliateCode = affiliateCode;
    }

    // externalId:
    public String getExternalId(){
        return this.externalId;
    }
    public void setExternalId(String externalId){
        this.externalId = externalId;
    }

    // userType:
    public OTTUserType getUserType(){
        return this.userType;
    }
    public void setUserType(OTTUserType userType){
        this.userType = userType;
    }

    // dynamicData:
    public Map<String, StringValue> getDynamicData(){
        return this.dynamicData;
    }
    public void setDynamicData(Map<String, StringValue> dynamicData){
        this.dynamicData = dynamicData;
    }

    // isHouseholdMaster:
    public Boolean getIsHouseholdMaster(){
        return this.isHouseholdMaster;
    }
    public void setIsHouseholdMaster(Boolean isHouseholdMaster){
        this.isHouseholdMaster = isHouseholdMaster;
    }

    // suspentionState:
    public HouseholdSuspentionState getSuspentionState(){
        return this.suspentionState;
    }
    public void setSuspentionState(HouseholdSuspentionState suspentionState){
        this.suspentionState = suspentionState;
    }

    // userState:
    public UserState getUserState(){
        return this.userState;
    }
    public void setUserState(UserState userState){
        this.userState = userState;
    }


    public OTTUser() {
       super();
    }

    public OTTUser(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        householdId = GsonParser.parseInt(jsonObject.get("householdId"));
        email = GsonParser.parseString(jsonObject.get("email"));
        address = GsonParser.parseString(jsonObject.get("address"));
        city = GsonParser.parseString(jsonObject.get("city"));
        country = GsonParser.parseObject(jsonObject.getAsJsonObject("country"), Country.class);
        zip = GsonParser.parseString(jsonObject.get("zip"));
        phone = GsonParser.parseString(jsonObject.get("phone"));
        affiliateCode = GsonParser.parseString(jsonObject.get("affiliateCode"));
        externalId = GsonParser.parseString(jsonObject.get("externalId"));
        userType = GsonParser.parseObject(jsonObject.getAsJsonObject("userType"), OTTUserType.class);
        dynamicData = GsonParser.parseMap(jsonObject.getAsJsonObject("dynamicData"), StringValue.class);
        isHouseholdMaster = GsonParser.parseBoolean(jsonObject.get("isHouseholdMaster"));
        suspentionState = HouseholdSuspentionState.get(GsonParser.parseString(jsonObject.get("suspentionState")));
        userState = UserState.get(GsonParser.parseString(jsonObject.get("userState")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaOTTUser");
        kparams.add("email", this.email);
        kparams.add("address", this.address);
        kparams.add("city", this.city);
        kparams.add("country", this.country);
        kparams.add("zip", this.zip);
        kparams.add("phone", this.phone);
        kparams.add("affiliateCode", this.affiliateCode);
        kparams.add("externalId", this.externalId);
        kparams.add("userType", this.userType);
        kparams.add("dynamicData", this.dynamicData);
        return kparams;
    }

}

