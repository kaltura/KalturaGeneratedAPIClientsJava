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

@SuppressWarnings("serial")
public abstract class Social extends ObjectBase {

	/**  Facebook identifier  */
    private String id;
	/**  Full name  */
    private String name;
	/**  First name  */
    private String firstName;
	/**  Last name  */
    private String lastName;
	/**  User email  */
    private String email;
	/**  Gender  */
    private String gender;
	/**  User identifier  */
    private String userId;
	/**  User birthday  */
    private String birthday;
	/**  User model status              Possible values: UNKNOWN, OK, ERROR, NOACTION,
	  NOTEXIST, CONFLICT, MERGE, MERGEOK, NEWUSER, MINFRIENDS, INVITEOK, INVITEERROR,
	  ACCESSDENIED, WRONGPASSWORDORUSERNAME, UNMERGEOK  */
    private String status;
	/**  Profile picture URL  */
    private String pictureUrl;

    // id:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
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

    // email:
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    // gender:
    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    // userId:
    public String getUserId(){
        return this.userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }

    // birthday:
    public String getBirthday(){
        return this.birthday;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }

    // status:
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    // pictureUrl:
    public String getPictureUrl(){
        return this.pictureUrl;
    }
    public void setPictureUrl(String pictureUrl){
        this.pictureUrl = pictureUrl;
    }


    public Social() {
       super();
    }

    public Social(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseString(jsonObject.get("id"));
        name = GsonParser.parseString(jsonObject.get("name"));
        firstName = GsonParser.parseString(jsonObject.get("firstName"));
        lastName = GsonParser.parseString(jsonObject.get("lastName"));
        email = GsonParser.parseString(jsonObject.get("email"));
        gender = GsonParser.parseString(jsonObject.get("gender"));
        userId = GsonParser.parseString(jsonObject.get("userId"));
        birthday = GsonParser.parseString(jsonObject.get("birthday"));
        status = GsonParser.parseString(jsonObject.get("status"));
        pictureUrl = GsonParser.parseString(jsonObject.get("pictureUrl"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaSocial");
        kparams.add("name", this.name);
        kparams.add("firstName", this.firstName);
        kparams.add("lastName", this.lastName);
        kparams.add("email", this.email);
        kparams.add("gender", this.gender);
        kparams.add("birthday", this.birthday);
        kparams.add("pictureUrl", this.pictureUrl);
        return kparams;
    }

}

