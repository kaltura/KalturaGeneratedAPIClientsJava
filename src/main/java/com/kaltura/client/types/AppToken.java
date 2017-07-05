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
import com.kaltura.client.enums.AppTokenHashType;
import com.kaltura.client.enums.SessionType;
import com.kaltura.client.enums.AppTokenStatus;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Application token  */
@SuppressWarnings("serial")
public class AppToken extends ObjectBase {

	/**  The id of the application token  */
    private String id;
	/**  Expiry time of current token (unix timestamp in seconds)  */
    private Integer expiry;
	/**  Partner identifier  */
    private Integer partnerId;
	/**  Expiry duration of KS (Kaltura Session) that created using the current token (in
	  seconds)  */
    private Integer sessionDuration;
	/**  The hash type of the token  */
    private AppTokenHashType hashType;
	/**  Comma separated privileges to be applied on KS (Kaltura Session) that created
	  using the current token  */
    private String sessionPrivileges;
	/**  Type of KS (Kaltura Session) that created using the current token  */
    private SessionType sessionType;
	/**  Application token status  */
    private AppTokenStatus status;
	/**  The application token  */
    private String token;
	/**  User id of KS (Kaltura Session) that created using the current token  */
    private String sessionUserId;

    // id:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    // expiry:
    public Integer getExpiry(){
        return this.expiry;
    }
    public void setExpiry(Integer expiry){
        this.expiry = expiry;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // sessionDuration:
    public Integer getSessionDuration(){
        return this.sessionDuration;
    }
    public void setSessionDuration(Integer sessionDuration){
        this.sessionDuration = sessionDuration;
    }

    // hashType:
    public AppTokenHashType getHashType(){
        return this.hashType;
    }
    public void setHashType(AppTokenHashType hashType){
        this.hashType = hashType;
    }

    // sessionPrivileges:
    public String getSessionPrivileges(){
        return this.sessionPrivileges;
    }
    public void setSessionPrivileges(String sessionPrivileges){
        this.sessionPrivileges = sessionPrivileges;
    }

    // sessionType:
    public SessionType getSessionType(){
        return this.sessionType;
    }
    public void setSessionType(SessionType sessionType){
        this.sessionType = sessionType;
    }

    // status:
    public AppTokenStatus getStatus(){
        return this.status;
    }
    public void setStatus(AppTokenStatus status){
        this.status = status;
    }

    // token:
    public String getToken(){
        return this.token;
    }
    public void setToken(String token){
        this.token = token;
    }

    // sessionUserId:
    public String getSessionUserId(){
        return this.sessionUserId;
    }
    public void setSessionUserId(String sessionUserId){
        this.sessionUserId = sessionUserId;
    }


    public AppToken() {
       super();
    }

    public AppToken(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseString(jsonObject.get("id"));
        expiry = GsonParser.parseInt(jsonObject.get("expiry"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        sessionDuration = GsonParser.parseInt(jsonObject.get("sessionDuration"));
        hashType = AppTokenHashType.get(GsonParser.parseString(jsonObject.get("hashType")));
        sessionPrivileges = GsonParser.parseString(jsonObject.get("sessionPrivileges"));
        sessionType = SessionType.get(GsonParser.parseInt(jsonObject.get("sessionType")));
        status = AppTokenStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        token = GsonParser.parseString(jsonObject.get("token"));
        sessionUserId = GsonParser.parseString(jsonObject.get("sessionUserId"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAppToken");
        kparams.add("expiry", this.expiry);
        kparams.add("partnerId", this.partnerId);
        kparams.add("sessionDuration", this.sessionDuration);
        kparams.add("hashType", this.hashType);
        kparams.add("sessionPrivileges", this.sessionPrivileges);
        kparams.add("sessionType", this.sessionType);
        kparams.add("token", this.token);
        kparams.add("sessionUserId", this.sessionUserId);
        return kparams;
    }

}

