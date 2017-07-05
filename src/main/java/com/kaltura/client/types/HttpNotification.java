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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.enums.EventNotificationEventObjectType;
import com.kaltura.client.enums.EventNotificationEventType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Wrapper for sent notifications  */
@SuppressWarnings("serial")
public class HttpNotification extends ObjectBase {

	/**  Object that triggered the notification  */
    private ObjectBase object;
	/**  Object type that triggered the notification  */
    private EventNotificationEventObjectType eventObjectType;
	/**  ID of the batch job that execute the notification  */
    private Long eventNotificationJobId;
	/**  ID of the template that triggered the notification  */
    private Integer templateId;
	/**  Name of the template that triggered the notification  */
    private String templateName;
	/**  System name of the template that triggered the notification  */
    private String templateSystemName;
	/**  Ecent type that triggered the notification  */
    private EventNotificationEventType eventType;

    // object:
    public ObjectBase getObject(){
        return this.object;
    }
    public void setObject(ObjectBase object){
        this.object = object;
    }

    // eventObjectType:
    public EventNotificationEventObjectType getEventObjectType(){
        return this.eventObjectType;
    }
    public void setEventObjectType(EventNotificationEventObjectType eventObjectType){
        this.eventObjectType = eventObjectType;
    }

    // eventNotificationJobId:
    public Long getEventNotificationJobId(){
        return this.eventNotificationJobId;
    }
    public void setEventNotificationJobId(Long eventNotificationJobId){
        this.eventNotificationJobId = eventNotificationJobId;
    }

    // templateId:
    public Integer getTemplateId(){
        return this.templateId;
    }
    public void setTemplateId(Integer templateId){
        this.templateId = templateId;
    }

    // templateName:
    public String getTemplateName(){
        return this.templateName;
    }
    public void setTemplateName(String templateName){
        this.templateName = templateName;
    }

    // templateSystemName:
    public String getTemplateSystemName(){
        return this.templateSystemName;
    }
    public void setTemplateSystemName(String templateSystemName){
        this.templateSystemName = templateSystemName;
    }

    // eventType:
    public EventNotificationEventType getEventType(){
        return this.eventType;
    }
    public void setEventType(EventNotificationEventType eventType){
        this.eventType = eventType;
    }


    public HttpNotification() {
       super();
    }

    public HttpNotification(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        object = GsonParser.parseObject(jsonObject.getAsJsonObject("object"), ObjectBase.class);
        eventObjectType = EventNotificationEventObjectType.get(GsonParser.parseString(jsonObject.get("eventObjectType")));
        eventNotificationJobId = GsonParser.parseLong(jsonObject.get("eventNotificationJobId"));
        templateId = GsonParser.parseInt(jsonObject.get("templateId"));
        templateName = GsonParser.parseString(jsonObject.get("templateName"));
        templateSystemName = GsonParser.parseString(jsonObject.get("templateSystemName"));
        eventType = EventNotificationEventType.get(GsonParser.parseString(jsonObject.get("eventType")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaHttpNotification");
        kparams.add("object", this.object);
        kparams.add("eventObjectType", this.eventObjectType);
        kparams.add("eventNotificationJobId", this.eventNotificationJobId);
        kparams.add("templateId", this.templateId);
        kparams.add("templateName", this.templateName);
        kparams.add("templateSystemName", this.templateSystemName);
        kparams.add("eventType", this.eventType);
        return kparams;
    }

}

