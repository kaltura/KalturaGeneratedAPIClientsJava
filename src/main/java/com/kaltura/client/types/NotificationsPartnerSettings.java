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
public class NotificationsPartnerSettings extends ObjectBase {

	/**  Push notification capability is enabled for the account  */
    private Boolean pushNotificationEnabled;
	/**  System announcement capability is enabled for the account  */
    private Boolean pushSystemAnnouncementsEnabled;
	/**  Window start time (UTC) for send automated push messages  */
    private Integer pushStartHour;
	/**  Window end time (UTC) for send automated push messages  */
    private Integer pushEndHour;
	/**  Inbox enabled  */
    private Boolean inboxEnabled;
	/**  Message TTL in days  */
    private Integer messageTTLDays;
	/**  Automatic issue follow notification  */
    private Boolean automaticIssueFollowNotification;
	/**  Topic expiration duration in days  */
    private Integer topicExpirationDurationDays;

    // pushNotificationEnabled:
    public Boolean getPushNotificationEnabled(){
        return this.pushNotificationEnabled;
    }
    public void setPushNotificationEnabled(Boolean pushNotificationEnabled){
        this.pushNotificationEnabled = pushNotificationEnabled;
    }

    // pushSystemAnnouncementsEnabled:
    public Boolean getPushSystemAnnouncementsEnabled(){
        return this.pushSystemAnnouncementsEnabled;
    }
    public void setPushSystemAnnouncementsEnabled(Boolean pushSystemAnnouncementsEnabled){
        this.pushSystemAnnouncementsEnabled = pushSystemAnnouncementsEnabled;
    }

    // pushStartHour:
    public Integer getPushStartHour(){
        return this.pushStartHour;
    }
    public void setPushStartHour(Integer pushStartHour){
        this.pushStartHour = pushStartHour;
    }

    // pushEndHour:
    public Integer getPushEndHour(){
        return this.pushEndHour;
    }
    public void setPushEndHour(Integer pushEndHour){
        this.pushEndHour = pushEndHour;
    }

    // inboxEnabled:
    public Boolean getInboxEnabled(){
        return this.inboxEnabled;
    }
    public void setInboxEnabled(Boolean inboxEnabled){
        this.inboxEnabled = inboxEnabled;
    }

    // messageTTLDays:
    public Integer getMessageTTLDays(){
        return this.messageTTLDays;
    }
    public void setMessageTTLDays(Integer messageTTLDays){
        this.messageTTLDays = messageTTLDays;
    }

    // automaticIssueFollowNotification:
    public Boolean getAutomaticIssueFollowNotification(){
        return this.automaticIssueFollowNotification;
    }
    public void setAutomaticIssueFollowNotification(Boolean automaticIssueFollowNotification){
        this.automaticIssueFollowNotification = automaticIssueFollowNotification;
    }

    // topicExpirationDurationDays:
    public Integer getTopicExpirationDurationDays(){
        return this.topicExpirationDurationDays;
    }
    public void setTopicExpirationDurationDays(Integer topicExpirationDurationDays){
        this.topicExpirationDurationDays = topicExpirationDurationDays;
    }


    public NotificationsPartnerSettings() {
       super();
    }

    public NotificationsPartnerSettings(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        pushNotificationEnabled = GsonParser.parseBoolean(jsonObject.get("pushNotificationEnabled"));
        pushSystemAnnouncementsEnabled = GsonParser.parseBoolean(jsonObject.get("pushSystemAnnouncementsEnabled"));
        pushStartHour = GsonParser.parseInt(jsonObject.get("pushStartHour"));
        pushEndHour = GsonParser.parseInt(jsonObject.get("pushEndHour"));
        inboxEnabled = GsonParser.parseBoolean(jsonObject.get("inboxEnabled"));
        messageTTLDays = GsonParser.parseInt(jsonObject.get("messageTTLDays"));
        automaticIssueFollowNotification = GsonParser.parseBoolean(jsonObject.get("automaticIssueFollowNotification"));
        topicExpirationDurationDays = GsonParser.parseInt(jsonObject.get("topicExpirationDurationDays"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaNotificationsPartnerSettings");
        kparams.add("pushNotificationEnabled", this.pushNotificationEnabled);
        kparams.add("pushSystemAnnouncementsEnabled", this.pushSystemAnnouncementsEnabled);
        kparams.add("pushStartHour", this.pushStartHour);
        kparams.add("pushEndHour", this.pushEndHour);
        kparams.add("inboxEnabled", this.inboxEnabled);
        kparams.add("messageTTLDays", this.messageTTLDays);
        kparams.add("automaticIssueFollowNotification", this.automaticIssueFollowNotification);
        kparams.add("topicExpirationDurationDays", this.topicExpirationDurationDays);
        return kparams;
    }

}

