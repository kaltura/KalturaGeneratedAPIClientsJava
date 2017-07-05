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
public class NotificationsSettings extends ObjectBase {

	/**  Specify if the user want to receive push notifications or not  */
    private Boolean pushNotificationEnabled;
	/**  Specify if the user will be notified for followed content via push. (requires
	  push_notification_enabled to be enabled)  */
    private Boolean pushFollowEnabled;

    // pushNotificationEnabled:
    public Boolean getPushNotificationEnabled(){
        return this.pushNotificationEnabled;
    }
    public void setPushNotificationEnabled(Boolean pushNotificationEnabled){
        this.pushNotificationEnabled = pushNotificationEnabled;
    }

    // pushFollowEnabled:
    public Boolean getPushFollowEnabled(){
        return this.pushFollowEnabled;
    }
    public void setPushFollowEnabled(Boolean pushFollowEnabled){
        this.pushFollowEnabled = pushFollowEnabled;
    }


    public NotificationsSettings() {
       super();
    }

    public NotificationsSettings(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        pushNotificationEnabled = GsonParser.parseBoolean(jsonObject.get("pushNotificationEnabled"));
        pushFollowEnabled = GsonParser.parseBoolean(jsonObject.get("pushFollowEnabled"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaNotificationsSettings");
        kparams.add("pushNotificationEnabled", this.pushNotificationEnabled);
        kparams.add("pushFollowEnabled", this.pushFollowEnabled);
        return kparams;
    }

}

