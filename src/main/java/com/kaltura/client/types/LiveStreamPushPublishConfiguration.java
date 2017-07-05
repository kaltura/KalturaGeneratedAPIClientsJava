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

/**  Basic push-publish configuration for Kaltura live stream entry  */
@SuppressWarnings("serial")
public class LiveStreamPushPublishConfiguration extends ObjectBase {

    private String publishUrl;
    private String backupPublishUrl;
    private String port;

    // publishUrl:
    public String getPublishUrl(){
        return this.publishUrl;
    }
    public void setPublishUrl(String publishUrl){
        this.publishUrl = publishUrl;
    }

    // backupPublishUrl:
    public String getBackupPublishUrl(){
        return this.backupPublishUrl;
    }
    public void setBackupPublishUrl(String backupPublishUrl){
        this.backupPublishUrl = backupPublishUrl;
    }

    // port:
    public String getPort(){
        return this.port;
    }
    public void setPort(String port){
        this.port = port;
    }


    public LiveStreamPushPublishConfiguration() {
       super();
    }

    public LiveStreamPushPublishConfiguration(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        publishUrl = GsonParser.parseString(jsonObject.get("publishUrl"));
        backupPublishUrl = GsonParser.parseString(jsonObject.get("backupPublishUrl"));
        port = GsonParser.parseString(jsonObject.get("port"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaLiveStreamPushPublishConfiguration");
        kparams.add("publishUrl", this.publishUrl);
        kparams.add("backupPublishUrl", this.backupPublishUrl);
        kparams.add("port", this.port);
        return kparams;
    }

}

