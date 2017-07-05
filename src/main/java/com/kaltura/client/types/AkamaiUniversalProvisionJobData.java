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
import com.kaltura.client.enums.DVRStatus;
import com.kaltura.client.enums.AkamaiUniversalStreamType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class AkamaiUniversalProvisionJobData extends ProvisionJobData {

    private Integer streamId;
    private String systemUserName;
    private String systemPassword;
    private String domainName;
    private DVRStatus dvrEnabled;
    private Integer dvrWindow;
    private String primaryContact;
    private String secondaryContact;
    private AkamaiUniversalStreamType streamType;
    private String notificationEmail;

    // streamId:
    public Integer getStreamId(){
        return this.streamId;
    }
    public void setStreamId(Integer streamId){
        this.streamId = streamId;
    }

    // systemUserName:
    public String getSystemUserName(){
        return this.systemUserName;
    }
    public void setSystemUserName(String systemUserName){
        this.systemUserName = systemUserName;
    }

    // systemPassword:
    public String getSystemPassword(){
        return this.systemPassword;
    }
    public void setSystemPassword(String systemPassword){
        this.systemPassword = systemPassword;
    }

    // domainName:
    public String getDomainName(){
        return this.domainName;
    }
    public void setDomainName(String domainName){
        this.domainName = domainName;
    }

    // dvrEnabled:
    public DVRStatus getDvrEnabled(){
        return this.dvrEnabled;
    }
    public void setDvrEnabled(DVRStatus dvrEnabled){
        this.dvrEnabled = dvrEnabled;
    }

    // dvrWindow:
    public Integer getDvrWindow(){
        return this.dvrWindow;
    }
    public void setDvrWindow(Integer dvrWindow){
        this.dvrWindow = dvrWindow;
    }

    // primaryContact:
    public String getPrimaryContact(){
        return this.primaryContact;
    }
    public void setPrimaryContact(String primaryContact){
        this.primaryContact = primaryContact;
    }

    // secondaryContact:
    public String getSecondaryContact(){
        return this.secondaryContact;
    }
    public void setSecondaryContact(String secondaryContact){
        this.secondaryContact = secondaryContact;
    }

    // streamType:
    public AkamaiUniversalStreamType getStreamType(){
        return this.streamType;
    }
    public void setStreamType(AkamaiUniversalStreamType streamType){
        this.streamType = streamType;
    }

    // notificationEmail:
    public String getNotificationEmail(){
        return this.notificationEmail;
    }
    public void setNotificationEmail(String notificationEmail){
        this.notificationEmail = notificationEmail;
    }


    public AkamaiUniversalProvisionJobData() {
       super();
    }

    public AkamaiUniversalProvisionJobData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        streamId = GsonParser.parseInt(jsonObject.get("streamId"));
        systemUserName = GsonParser.parseString(jsonObject.get("systemUserName"));
        systemPassword = GsonParser.parseString(jsonObject.get("systemPassword"));
        domainName = GsonParser.parseString(jsonObject.get("domainName"));
        dvrEnabled = DVRStatus.get(GsonParser.parseInt(jsonObject.get("dvrEnabled")));
        dvrWindow = GsonParser.parseInt(jsonObject.get("dvrWindow"));
        primaryContact = GsonParser.parseString(jsonObject.get("primaryContact"));
        secondaryContact = GsonParser.parseString(jsonObject.get("secondaryContact"));
        streamType = AkamaiUniversalStreamType.get(GsonParser.parseString(jsonObject.get("streamType")));
        notificationEmail = GsonParser.parseString(jsonObject.get("notificationEmail"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAkamaiUniversalProvisionJobData");
        kparams.add("streamId", this.streamId);
        kparams.add("systemUserName", this.systemUserName);
        kparams.add("systemPassword", this.systemPassword);
        kparams.add("domainName", this.domainName);
        kparams.add("dvrEnabled", this.dvrEnabled);
        kparams.add("dvrWindow", this.dvrWindow);
        kparams.add("primaryContact", this.primaryContact);
        kparams.add("secondaryContact", this.secondaryContact);
        kparams.add("streamType", this.streamType);
        kparams.add("notificationEmail", this.notificationEmail);
        return kparams;
    }

}

