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

/**  Media-asset info  */
@SuppressWarnings("serial")
public class MediaAsset extends Asset {

	/**  Date and time represented as epoch.  */
    private Long systemStartDate;
	/**  Date and time represented as epoch.  */
    private Long systemFinalDate;
	/**  External identifiers  */
    private String externalIds;
	/**  Catch-up buffer  */
    private Long catchUpBuffer;
	/**  Trick-play buffer  */
    private Long trickPlayBuffer;
	/**  Enable Recording playback for non entitled channel  */
    private Boolean enableRecordingPlaybackNonEntitledChannel;
	/**  Enable Recording playback for non existing channel  */
    private Boolean enableRecordingPlaybackNonExistingChannel;

    // systemStartDate:
    public Long getSystemStartDate(){
        return this.systemStartDate;
    }
    public void setSystemStartDate(Long systemStartDate){
        this.systemStartDate = systemStartDate;
    }

    // systemFinalDate:
    public Long getSystemFinalDate(){
        return this.systemFinalDate;
    }
    public void setSystemFinalDate(Long systemFinalDate){
        this.systemFinalDate = systemFinalDate;
    }

    // externalIds:
    public String getExternalIds(){
        return this.externalIds;
    }
    public void setExternalIds(String externalIds){
        this.externalIds = externalIds;
    }

    // catchUpBuffer:
    public Long getCatchUpBuffer(){
        return this.catchUpBuffer;
    }
    public void setCatchUpBuffer(Long catchUpBuffer){
        this.catchUpBuffer = catchUpBuffer;
    }

    // trickPlayBuffer:
    public Long getTrickPlayBuffer(){
        return this.trickPlayBuffer;
    }
    public void setTrickPlayBuffer(Long trickPlayBuffer){
        this.trickPlayBuffer = trickPlayBuffer;
    }

    // enableRecordingPlaybackNonEntitledChannel:
    public Boolean getEnableRecordingPlaybackNonEntitledChannel(){
        return this.enableRecordingPlaybackNonEntitledChannel;
    }
    public void setEnableRecordingPlaybackNonEntitledChannel(Boolean enableRecordingPlaybackNonEntitledChannel){
        this.enableRecordingPlaybackNonEntitledChannel = enableRecordingPlaybackNonEntitledChannel;
    }

    // enableRecordingPlaybackNonExistingChannel:
    public Boolean getEnableRecordingPlaybackNonExistingChannel(){
        return this.enableRecordingPlaybackNonExistingChannel;
    }
    public void setEnableRecordingPlaybackNonExistingChannel(Boolean enableRecordingPlaybackNonExistingChannel){
        this.enableRecordingPlaybackNonExistingChannel = enableRecordingPlaybackNonExistingChannel;
    }


    public MediaAsset() {
       super();
    }

    public MediaAsset(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        systemStartDate = GsonParser.parseLong(jsonObject.get("systemStartDate"));
        systemFinalDate = GsonParser.parseLong(jsonObject.get("systemFinalDate"));
        externalIds = GsonParser.parseString(jsonObject.get("externalIds"));
        catchUpBuffer = GsonParser.parseLong(jsonObject.get("catchUpBuffer"));
        trickPlayBuffer = GsonParser.parseLong(jsonObject.get("trickPlayBuffer"));
        enableRecordingPlaybackNonEntitledChannel = GsonParser.parseBoolean(jsonObject.get("enableRecordingPlaybackNonEntitledChannel"));
        enableRecordingPlaybackNonExistingChannel = GsonParser.parseBoolean(jsonObject.get("enableRecordingPlaybackNonExistingChannel"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaMediaAsset");
        kparams.add("systemStartDate", this.systemStartDate);
        kparams.add("systemFinalDate", this.systemFinalDate);
        kparams.add("externalIds", this.externalIds);
        kparams.add("catchUpBuffer", this.catchUpBuffer);
        kparams.add("trickPlayBuffer", this.trickPlayBuffer);
        return kparams;
    }

}

