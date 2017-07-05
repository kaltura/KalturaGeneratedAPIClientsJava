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
public class BulkUploadResultUser extends BulkUploadResult {

    private String userId;
    private String screenName;
    private String email;
    private String description;
    private String tags;
    private Integer dateOfBirth;
    private String country;
    private String state;
    private String city;
    private String zip;
    private Integer gender;
    private String firstName;
    private String lastName;
    private String group;

    // userId:
    public String getUserId(){
        return this.userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }

    // screenName:
    public String getScreenName(){
        return this.screenName;
    }
    public void setScreenName(String screenName){
        this.screenName = screenName;
    }

    // email:
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // tags:
    public String getTags(){
        return this.tags;
    }
    public void setTags(String tags){
        this.tags = tags;
    }

    // dateOfBirth:
    public Integer getDateOfBirth(){
        return this.dateOfBirth;
    }
    public void setDateOfBirth(Integer dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    // country:
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
    }

    // state:
    public String getState(){
        return this.state;
    }
    public void setState(String state){
        this.state = state;
    }

    // city:
    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        this.city = city;
    }

    // zip:
    public String getZip(){
        return this.zip;
    }
    public void setZip(String zip){
        this.zip = zip;
    }

    // gender:
    public Integer getGender(){
        return this.gender;
    }
    public void setGender(Integer gender){
        this.gender = gender;
    }

    // firstName:
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    // lastName:
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // group:
    public String getGroup(){
        return this.group;
    }
    public void setGroup(String group){
        this.group = group;
    }


    public BulkUploadResultUser() {
       super();
    }

    public BulkUploadResultUser(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        userId = GsonParser.parseString(jsonObject.get("userId"));
        screenName = GsonParser.parseString(jsonObject.get("screenName"));
        email = GsonParser.parseString(jsonObject.get("email"));
        description = GsonParser.parseString(jsonObject.get("description"));
        tags = GsonParser.parseString(jsonObject.get("tags"));
        dateOfBirth = GsonParser.parseInt(jsonObject.get("dateOfBirth"));
        country = GsonParser.parseString(jsonObject.get("country"));
        state = GsonParser.parseString(jsonObject.get("state"));
        city = GsonParser.parseString(jsonObject.get("city"));
        zip = GsonParser.parseString(jsonObject.get("zip"));
        gender = GsonParser.parseInt(jsonObject.get("gender"));
        firstName = GsonParser.parseString(jsonObject.get("firstName"));
        lastName = GsonParser.parseString(jsonObject.get("lastName"));
        group = GsonParser.parseString(jsonObject.get("group"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaBulkUploadResultUser");
        kparams.add("userId", this.userId);
        kparams.add("screenName", this.screenName);
        kparams.add("email", this.email);
        kparams.add("description", this.description);
        kparams.add("tags", this.tags);
        kparams.add("dateOfBirth", this.dateOfBirth);
        kparams.add("country", this.country);
        kparams.add("state", this.state);
        kparams.add("city", this.city);
        kparams.add("zip", this.zip);
        kparams.add("gender", this.gender);
        kparams.add("firstName", this.firstName);
        kparams.add("lastName", this.lastName);
        kparams.add("group", this.group);
        return kparams;
    }

}

