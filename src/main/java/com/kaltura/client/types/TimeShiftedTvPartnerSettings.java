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
public class TimeShiftedTvPartnerSettings extends ObjectBase {

	/**  Is catch-up enabled  */
    private Boolean catchUpEnabled;
	/**  Is c-dvr enabled  */
    private Boolean cdvrEnabled;
	/**  Is start-over enabled  */
    private Boolean startOverEnabled;
	/**  Is trick-play enabled  */
    private Boolean trickPlayEnabled;
	/**  Is recording schedule window enabled  */
    private Boolean recordingScheduleWindowEnabled;
	/**  Is recording protection enabled  */
    private Boolean protectionEnabled;
	/**  Catch-up buffer length  */
    private Long catchUpBufferLength;
	/**  Trick play buffer length  */
    private Long trickPlayBufferLength;
	/**  Recording schedule window. Indicates how long (in minutes) after the program
	  starts it is allowed to schedule the recording  */
    private Long recordingScheduleWindow;
	/**  Indicates how long (in seconds) before the program starts the recording will
	  begin  */
    private Long paddingBeforeProgramStarts;
	/**  Indicates how long (in seconds) after the program ends the recording will end  */
    private Long paddingAfterProgramEnds;
	/**  Specify the time in days that a recording should be protected. Start time begins
	  at protection request.  */
    private Integer protectionPeriod;
	/**  Indicates how many percent of the quota can be used for protection  */
    private Integer protectionQuotaPercentage;
	/**  Specify the time in days that a recording should be kept for user. Start time
	  begins with the program end date.  */
    private Integer recordingLifetimePeriod;
	/**  The time in days before the recording lifetime is due from which the client
	  should be able to warn user about deletion.  */
    private Integer cleanupNoticePeroid;
	/**  Is recording of series enabled  */
    private Boolean seriesRecordingEnabled;
	/**  Is recording playback for non-entitled channel enables  */
    private Boolean nonEntitledChannelPlaybackEnabled;
	/**  Is recording playback for non-existing channel enables  */
    private Boolean nonExistingChannelPlaybackEnabled;

    // catchUpEnabled:
    public Boolean getCatchUpEnabled(){
        return this.catchUpEnabled;
    }
    public void setCatchUpEnabled(Boolean catchUpEnabled){
        this.catchUpEnabled = catchUpEnabled;
    }

    // cdvrEnabled:
    public Boolean getCdvrEnabled(){
        return this.cdvrEnabled;
    }
    public void setCdvrEnabled(Boolean cdvrEnabled){
        this.cdvrEnabled = cdvrEnabled;
    }

    // startOverEnabled:
    public Boolean getStartOverEnabled(){
        return this.startOverEnabled;
    }
    public void setStartOverEnabled(Boolean startOverEnabled){
        this.startOverEnabled = startOverEnabled;
    }

    // trickPlayEnabled:
    public Boolean getTrickPlayEnabled(){
        return this.trickPlayEnabled;
    }
    public void setTrickPlayEnabled(Boolean trickPlayEnabled){
        this.trickPlayEnabled = trickPlayEnabled;
    }

    // recordingScheduleWindowEnabled:
    public Boolean getRecordingScheduleWindowEnabled(){
        return this.recordingScheduleWindowEnabled;
    }
    public void setRecordingScheduleWindowEnabled(Boolean recordingScheduleWindowEnabled){
        this.recordingScheduleWindowEnabled = recordingScheduleWindowEnabled;
    }

    // protectionEnabled:
    public Boolean getProtectionEnabled(){
        return this.protectionEnabled;
    }
    public void setProtectionEnabled(Boolean protectionEnabled){
        this.protectionEnabled = protectionEnabled;
    }

    // catchUpBufferLength:
    public Long getCatchUpBufferLength(){
        return this.catchUpBufferLength;
    }
    public void setCatchUpBufferLength(Long catchUpBufferLength){
        this.catchUpBufferLength = catchUpBufferLength;
    }

    // trickPlayBufferLength:
    public Long getTrickPlayBufferLength(){
        return this.trickPlayBufferLength;
    }
    public void setTrickPlayBufferLength(Long trickPlayBufferLength){
        this.trickPlayBufferLength = trickPlayBufferLength;
    }

    // recordingScheduleWindow:
    public Long getRecordingScheduleWindow(){
        return this.recordingScheduleWindow;
    }
    public void setRecordingScheduleWindow(Long recordingScheduleWindow){
        this.recordingScheduleWindow = recordingScheduleWindow;
    }

    // paddingBeforeProgramStarts:
    public Long getPaddingBeforeProgramStarts(){
        return this.paddingBeforeProgramStarts;
    }
    public void setPaddingBeforeProgramStarts(Long paddingBeforeProgramStarts){
        this.paddingBeforeProgramStarts = paddingBeforeProgramStarts;
    }

    // paddingAfterProgramEnds:
    public Long getPaddingAfterProgramEnds(){
        return this.paddingAfterProgramEnds;
    }
    public void setPaddingAfterProgramEnds(Long paddingAfterProgramEnds){
        this.paddingAfterProgramEnds = paddingAfterProgramEnds;
    }

    // protectionPeriod:
    public Integer getProtectionPeriod(){
        return this.protectionPeriod;
    }
    public void setProtectionPeriod(Integer protectionPeriod){
        this.protectionPeriod = protectionPeriod;
    }

    // protectionQuotaPercentage:
    public Integer getProtectionQuotaPercentage(){
        return this.protectionQuotaPercentage;
    }
    public void setProtectionQuotaPercentage(Integer protectionQuotaPercentage){
        this.protectionQuotaPercentage = protectionQuotaPercentage;
    }

    // recordingLifetimePeriod:
    public Integer getRecordingLifetimePeriod(){
        return this.recordingLifetimePeriod;
    }
    public void setRecordingLifetimePeriod(Integer recordingLifetimePeriod){
        this.recordingLifetimePeriod = recordingLifetimePeriod;
    }

    // cleanupNoticePeroid:
    public Integer getCleanupNoticePeroid(){
        return this.cleanupNoticePeroid;
    }
    public void setCleanupNoticePeroid(Integer cleanupNoticePeroid){
        this.cleanupNoticePeroid = cleanupNoticePeroid;
    }

    // seriesRecordingEnabled:
    public Boolean getSeriesRecordingEnabled(){
        return this.seriesRecordingEnabled;
    }
    public void setSeriesRecordingEnabled(Boolean seriesRecordingEnabled){
        this.seriesRecordingEnabled = seriesRecordingEnabled;
    }

    // nonEntitledChannelPlaybackEnabled:
    public Boolean getNonEntitledChannelPlaybackEnabled(){
        return this.nonEntitledChannelPlaybackEnabled;
    }
    public void setNonEntitledChannelPlaybackEnabled(Boolean nonEntitledChannelPlaybackEnabled){
        this.nonEntitledChannelPlaybackEnabled = nonEntitledChannelPlaybackEnabled;
    }

    // nonExistingChannelPlaybackEnabled:
    public Boolean getNonExistingChannelPlaybackEnabled(){
        return this.nonExistingChannelPlaybackEnabled;
    }
    public void setNonExistingChannelPlaybackEnabled(Boolean nonExistingChannelPlaybackEnabled){
        this.nonExistingChannelPlaybackEnabled = nonExistingChannelPlaybackEnabled;
    }


    public TimeShiftedTvPartnerSettings() {
       super();
    }

    public TimeShiftedTvPartnerSettings(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        catchUpEnabled = GsonParser.parseBoolean(jsonObject.get("catchUpEnabled"));
        cdvrEnabled = GsonParser.parseBoolean(jsonObject.get("cdvrEnabled"));
        startOverEnabled = GsonParser.parseBoolean(jsonObject.get("startOverEnabled"));
        trickPlayEnabled = GsonParser.parseBoolean(jsonObject.get("trickPlayEnabled"));
        recordingScheduleWindowEnabled = GsonParser.parseBoolean(jsonObject.get("recordingScheduleWindowEnabled"));
        protectionEnabled = GsonParser.parseBoolean(jsonObject.get("protectionEnabled"));
        catchUpBufferLength = GsonParser.parseLong(jsonObject.get("catchUpBufferLength"));
        trickPlayBufferLength = GsonParser.parseLong(jsonObject.get("trickPlayBufferLength"));
        recordingScheduleWindow = GsonParser.parseLong(jsonObject.get("recordingScheduleWindow"));
        paddingBeforeProgramStarts = GsonParser.parseLong(jsonObject.get("paddingBeforeProgramStarts"));
        paddingAfterProgramEnds = GsonParser.parseLong(jsonObject.get("paddingAfterProgramEnds"));
        protectionPeriod = GsonParser.parseInt(jsonObject.get("protectionPeriod"));
        protectionQuotaPercentage = GsonParser.parseInt(jsonObject.get("protectionQuotaPercentage"));
        recordingLifetimePeriod = GsonParser.parseInt(jsonObject.get("recordingLifetimePeriod"));
        cleanupNoticePeroid = GsonParser.parseInt(jsonObject.get("cleanupNoticePeroid"));
        seriesRecordingEnabled = GsonParser.parseBoolean(jsonObject.get("seriesRecordingEnabled"));
        nonEntitledChannelPlaybackEnabled = GsonParser.parseBoolean(jsonObject.get("nonEntitledChannelPlaybackEnabled"));
        nonExistingChannelPlaybackEnabled = GsonParser.parseBoolean(jsonObject.get("nonExistingChannelPlaybackEnabled"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaTimeShiftedTvPartnerSettings");
        kparams.add("catchUpEnabled", this.catchUpEnabled);
        kparams.add("cdvrEnabled", this.cdvrEnabled);
        kparams.add("startOverEnabled", this.startOverEnabled);
        kparams.add("trickPlayEnabled", this.trickPlayEnabled);
        kparams.add("recordingScheduleWindowEnabled", this.recordingScheduleWindowEnabled);
        kparams.add("protectionEnabled", this.protectionEnabled);
        kparams.add("catchUpBufferLength", this.catchUpBufferLength);
        kparams.add("trickPlayBufferLength", this.trickPlayBufferLength);
        kparams.add("recordingScheduleWindow", this.recordingScheduleWindow);
        kparams.add("paddingBeforeProgramStarts", this.paddingBeforeProgramStarts);
        kparams.add("paddingAfterProgramEnds", this.paddingAfterProgramEnds);
        kparams.add("protectionPeriod", this.protectionPeriod);
        kparams.add("protectionQuotaPercentage", this.protectionQuotaPercentage);
        kparams.add("recordingLifetimePeriod", this.recordingLifetimePeriod);
        kparams.add("cleanupNoticePeroid", this.cleanupNoticePeroid);
        kparams.add("seriesRecordingEnabled", this.seriesRecordingEnabled);
        kparams.add("nonEntitledChannelPlaybackEnabled", this.nonEntitledChannelPlaybackEnabled);
        kparams.add("nonExistingChannelPlaybackEnabled", this.nonExistingChannelPlaybackEnabled);
        return kparams;
    }

}

