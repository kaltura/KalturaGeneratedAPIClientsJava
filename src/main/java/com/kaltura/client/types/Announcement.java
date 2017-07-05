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
import com.kaltura.client.enums.AnnouncementStatus;
import com.kaltura.client.enums.AnnouncementRecipientsType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class Announcement extends ObjectBase {

    private String name;
    private String message;
    private Boolean enabled;
    private Long startTime;
    private String timezone;
    private AnnouncementStatus status;
    private AnnouncementRecipientsType recipients;
    private Integer id;

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // message:
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message = message;
    }

    // enabled:
    public Boolean getEnabled(){
        return this.enabled;
    }
    public void setEnabled(Boolean enabled){
        this.enabled = enabled;
    }

    // startTime:
    public Long getStartTime(){
        return this.startTime;
    }
    public void setStartTime(Long startTime){
        this.startTime = startTime;
    }

    // timezone:
    public String getTimezone(){
        return this.timezone;
    }
    public void setTimezone(String timezone){
        this.timezone = timezone;
    }

    // status:
    public AnnouncementStatus getStatus(){
        return this.status;
    }
    public void setStatus(AnnouncementStatus status){
        this.status = status;
    }

    // recipients:
    public AnnouncementRecipientsType getRecipients(){
        return this.recipients;
    }
    public void setRecipients(AnnouncementRecipientsType recipients){
        this.recipients = recipients;
    }

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }


    public Announcement() {
       super();
    }

    public Announcement(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        name = GsonParser.parseString(jsonObject.get("name"));
        message = GsonParser.parseString(jsonObject.get("message"));
        enabled = GsonParser.parseBoolean(jsonObject.get("enabled"));
        startTime = GsonParser.parseLong(jsonObject.get("startTime"));
        timezone = GsonParser.parseString(jsonObject.get("timezone"));
        status = AnnouncementStatus.get(GsonParser.parseString(jsonObject.get("status")));
        recipients = AnnouncementRecipientsType.get(GsonParser.parseString(jsonObject.get("recipients")));
        id = GsonParser.parseInt(jsonObject.get("id"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAnnouncement");
        kparams.add("name", this.name);
        kparams.add("message", this.message);
        kparams.add("enabled", this.enabled);
        kparams.add("startTime", this.startTime);
        kparams.add("timezone", this.timezone);
        kparams.add("recipients", this.recipients);
        return kparams;
    }

}

