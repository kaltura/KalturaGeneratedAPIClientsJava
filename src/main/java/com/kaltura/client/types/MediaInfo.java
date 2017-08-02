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

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.enums.BitRateMode;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class MediaInfo extends ObjectBase {

	/**  The id of the media info  */
    private Integer id;
	/**  The id of the related flavor asset  */
    private String flavorAssetId;
	/**  The file size  */
    private Integer fileSize;
	/**  The container format  */
    private String containerFormat;
	/**  The container id  */
    private String containerId;
	/**  The container profile  */
    private String containerProfile;
	/**  The container duration  */
    private Integer containerDuration;
	/**  The container bit rate  */
    private Integer containerBitRate;
	/**  The video format  */
    private String videoFormat;
	/**  The video codec id  */
    private String videoCodecId;
	/**  The video duration  */
    private Integer videoDuration;
	/**  The video bit rate  */
    private Integer videoBitRate;
	/**  The video bit rate mode  */
    private BitRateMode videoBitRateMode;
	/**  The video width  */
    private Integer videoWidth;
	/**  The video height  */
    private Integer videoHeight;
	/**  The video frame rate  */
    private Double videoFrameRate;
	/**  The video display aspect ratio (dar)  */
    private Double videoDar;
    private Integer videoRotation;
	/**  The audio format  */
    private String audioFormat;
	/**  The audio codec id  */
    private String audioCodecId;
	/**  The audio duration  */
    private Integer audioDuration;
	/**  The audio bit rate  */
    private Integer audioBitRate;
	/**  The audio bit rate mode  */
    private BitRateMode audioBitRateMode;
	/**  The number of audio channels  */
    private Integer audioChannels;
	/**  The audio sampling rate  */
    private Integer audioSamplingRate;
	/**  The audio resolution  */
    private Integer audioResolution;
	/**  The writing library  */
    private String writingLib;
	/**  The data as returned by the mediainfo command line  */
    private String rawData;
    private String multiStreamInfo;
    private Integer scanType;
    private String multiStream;
    private Integer isFastStart;
    private String contentStreams;
    private Integer complexityValue;
    private Double maxGOP;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // flavorAssetId:
    public String getFlavorAssetId(){
        return this.flavorAssetId;
    }
    public void setFlavorAssetId(String flavorAssetId){
        this.flavorAssetId = flavorAssetId;
    }

    // fileSize:
    public Integer getFileSize(){
        return this.fileSize;
    }
    public void setFileSize(Integer fileSize){
        this.fileSize = fileSize;
    }

    // containerFormat:
    public String getContainerFormat(){
        return this.containerFormat;
    }
    public void setContainerFormat(String containerFormat){
        this.containerFormat = containerFormat;
    }

    // containerId:
    public String getContainerId(){
        return this.containerId;
    }
    public void setContainerId(String containerId){
        this.containerId = containerId;
    }

    // containerProfile:
    public String getContainerProfile(){
        return this.containerProfile;
    }
    public void setContainerProfile(String containerProfile){
        this.containerProfile = containerProfile;
    }

    // containerDuration:
    public Integer getContainerDuration(){
        return this.containerDuration;
    }
    public void setContainerDuration(Integer containerDuration){
        this.containerDuration = containerDuration;
    }

    // containerBitRate:
    public Integer getContainerBitRate(){
        return this.containerBitRate;
    }
    public void setContainerBitRate(Integer containerBitRate){
        this.containerBitRate = containerBitRate;
    }

    // videoFormat:
    public String getVideoFormat(){
        return this.videoFormat;
    }
    public void setVideoFormat(String videoFormat){
        this.videoFormat = videoFormat;
    }

    // videoCodecId:
    public String getVideoCodecId(){
        return this.videoCodecId;
    }
    public void setVideoCodecId(String videoCodecId){
        this.videoCodecId = videoCodecId;
    }

    // videoDuration:
    public Integer getVideoDuration(){
        return this.videoDuration;
    }
    public void setVideoDuration(Integer videoDuration){
        this.videoDuration = videoDuration;
    }

    // videoBitRate:
    public Integer getVideoBitRate(){
        return this.videoBitRate;
    }
    public void setVideoBitRate(Integer videoBitRate){
        this.videoBitRate = videoBitRate;
    }

    // videoBitRateMode:
    public BitRateMode getVideoBitRateMode(){
        return this.videoBitRateMode;
    }
    public void setVideoBitRateMode(BitRateMode videoBitRateMode){
        this.videoBitRateMode = videoBitRateMode;
    }

    // videoWidth:
    public Integer getVideoWidth(){
        return this.videoWidth;
    }
    public void setVideoWidth(Integer videoWidth){
        this.videoWidth = videoWidth;
    }

    // videoHeight:
    public Integer getVideoHeight(){
        return this.videoHeight;
    }
    public void setVideoHeight(Integer videoHeight){
        this.videoHeight = videoHeight;
    }

    // videoFrameRate:
    public Double getVideoFrameRate(){
        return this.videoFrameRate;
    }
    public void setVideoFrameRate(Double videoFrameRate){
        this.videoFrameRate = videoFrameRate;
    }

    // videoDar:
    public Double getVideoDar(){
        return this.videoDar;
    }
    public void setVideoDar(Double videoDar){
        this.videoDar = videoDar;
    }

    // videoRotation:
    public Integer getVideoRotation(){
        return this.videoRotation;
    }
    public void setVideoRotation(Integer videoRotation){
        this.videoRotation = videoRotation;
    }

    // audioFormat:
    public String getAudioFormat(){
        return this.audioFormat;
    }
    public void setAudioFormat(String audioFormat){
        this.audioFormat = audioFormat;
    }

    // audioCodecId:
    public String getAudioCodecId(){
        return this.audioCodecId;
    }
    public void setAudioCodecId(String audioCodecId){
        this.audioCodecId = audioCodecId;
    }

    // audioDuration:
    public Integer getAudioDuration(){
        return this.audioDuration;
    }
    public void setAudioDuration(Integer audioDuration){
        this.audioDuration = audioDuration;
    }

    // audioBitRate:
    public Integer getAudioBitRate(){
        return this.audioBitRate;
    }
    public void setAudioBitRate(Integer audioBitRate){
        this.audioBitRate = audioBitRate;
    }

    // audioBitRateMode:
    public BitRateMode getAudioBitRateMode(){
        return this.audioBitRateMode;
    }
    public void setAudioBitRateMode(BitRateMode audioBitRateMode){
        this.audioBitRateMode = audioBitRateMode;
    }

    // audioChannels:
    public Integer getAudioChannels(){
        return this.audioChannels;
    }
    public void setAudioChannels(Integer audioChannels){
        this.audioChannels = audioChannels;
    }

    // audioSamplingRate:
    public Integer getAudioSamplingRate(){
        return this.audioSamplingRate;
    }
    public void setAudioSamplingRate(Integer audioSamplingRate){
        this.audioSamplingRate = audioSamplingRate;
    }

    // audioResolution:
    public Integer getAudioResolution(){
        return this.audioResolution;
    }
    public void setAudioResolution(Integer audioResolution){
        this.audioResolution = audioResolution;
    }

    // writingLib:
    public String getWritingLib(){
        return this.writingLib;
    }
    public void setWritingLib(String writingLib){
        this.writingLib = writingLib;
    }

    // rawData:
    public String getRawData(){
        return this.rawData;
    }
    public void setRawData(String rawData){
        this.rawData = rawData;
    }

    // multiStreamInfo:
    public String getMultiStreamInfo(){
        return this.multiStreamInfo;
    }
    public void setMultiStreamInfo(String multiStreamInfo){
        this.multiStreamInfo = multiStreamInfo;
    }

    // scanType:
    public Integer getScanType(){
        return this.scanType;
    }
    public void setScanType(Integer scanType){
        this.scanType = scanType;
    }

    // multiStream:
    public String getMultiStream(){
        return this.multiStream;
    }
    public void setMultiStream(String multiStream){
        this.multiStream = multiStream;
    }

    // isFastStart:
    public Integer getIsFastStart(){
        return this.isFastStart;
    }
    public void setIsFastStart(Integer isFastStart){
        this.isFastStart = isFastStart;
    }

    // contentStreams:
    public String getContentStreams(){
        return this.contentStreams;
    }
    public void setContentStreams(String contentStreams){
        this.contentStreams = contentStreams;
    }

    // complexityValue:
    public Integer getComplexityValue(){
        return this.complexityValue;
    }
    public void setComplexityValue(Integer complexityValue){
        this.complexityValue = complexityValue;
    }

    // maxGOP:
    public Double getMaxGOP(){
        return this.maxGOP;
    }
    public void setMaxGOP(Double maxGOP){
        this.maxGOP = maxGOP;
    }


    public MediaInfo() {
       super();
    }

    public MediaInfo(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
        fileSize = GsonParser.parseInt(jsonObject.get("fileSize"));
        containerFormat = GsonParser.parseString(jsonObject.get("containerFormat"));
        containerId = GsonParser.parseString(jsonObject.get("containerId"));
        containerProfile = GsonParser.parseString(jsonObject.get("containerProfile"));
        containerDuration = GsonParser.parseInt(jsonObject.get("containerDuration"));
        containerBitRate = GsonParser.parseInt(jsonObject.get("containerBitRate"));
        videoFormat = GsonParser.parseString(jsonObject.get("videoFormat"));
        videoCodecId = GsonParser.parseString(jsonObject.get("videoCodecId"));
        videoDuration = GsonParser.parseInt(jsonObject.get("videoDuration"));
        videoBitRate = GsonParser.parseInt(jsonObject.get("videoBitRate"));
        videoBitRateMode = BitRateMode.get(GsonParser.parseInt(jsonObject.get("videoBitRateMode")));
        videoWidth = GsonParser.parseInt(jsonObject.get("videoWidth"));
        videoHeight = GsonParser.parseInt(jsonObject.get("videoHeight"));
        videoFrameRate = GsonParser.parseDouble(jsonObject.get("videoFrameRate"));
        videoDar = GsonParser.parseDouble(jsonObject.get("videoDar"));
        videoRotation = GsonParser.parseInt(jsonObject.get("videoRotation"));
        audioFormat = GsonParser.parseString(jsonObject.get("audioFormat"));
        audioCodecId = GsonParser.parseString(jsonObject.get("audioCodecId"));
        audioDuration = GsonParser.parseInt(jsonObject.get("audioDuration"));
        audioBitRate = GsonParser.parseInt(jsonObject.get("audioBitRate"));
        audioBitRateMode = BitRateMode.get(GsonParser.parseInt(jsonObject.get("audioBitRateMode")));
        audioChannels = GsonParser.parseInt(jsonObject.get("audioChannels"));
        audioSamplingRate = GsonParser.parseInt(jsonObject.get("audioSamplingRate"));
        audioResolution = GsonParser.parseInt(jsonObject.get("audioResolution"));
        writingLib = GsonParser.parseString(jsonObject.get("writingLib"));
        rawData = GsonParser.parseString(jsonObject.get("rawData"));
        multiStreamInfo = GsonParser.parseString(jsonObject.get("multiStreamInfo"));
        scanType = GsonParser.parseInt(jsonObject.get("scanType"));
        multiStream = GsonParser.parseString(jsonObject.get("multiStream"));
        isFastStart = GsonParser.parseInt(jsonObject.get("isFastStart"));
        contentStreams = GsonParser.parseString(jsonObject.get("contentStreams"));
        complexityValue = GsonParser.parseInt(jsonObject.get("complexityValue"));
        maxGOP = GsonParser.parseDouble(jsonObject.get("maxGOP"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaMediaInfo");
        kparams.add("flavorAssetId", this.flavorAssetId);
        kparams.add("fileSize", this.fileSize);
        kparams.add("containerFormat", this.containerFormat);
        kparams.add("containerId", this.containerId);
        kparams.add("containerProfile", this.containerProfile);
        kparams.add("containerDuration", this.containerDuration);
        kparams.add("containerBitRate", this.containerBitRate);
        kparams.add("videoFormat", this.videoFormat);
        kparams.add("videoCodecId", this.videoCodecId);
        kparams.add("videoDuration", this.videoDuration);
        kparams.add("videoBitRate", this.videoBitRate);
        kparams.add("videoBitRateMode", this.videoBitRateMode);
        kparams.add("videoWidth", this.videoWidth);
        kparams.add("videoHeight", this.videoHeight);
        kparams.add("videoFrameRate", this.videoFrameRate);
        kparams.add("videoDar", this.videoDar);
        kparams.add("videoRotation", this.videoRotation);
        kparams.add("audioFormat", this.audioFormat);
        kparams.add("audioCodecId", this.audioCodecId);
        kparams.add("audioDuration", this.audioDuration);
        kparams.add("audioBitRate", this.audioBitRate);
        kparams.add("audioBitRateMode", this.audioBitRateMode);
        kparams.add("audioChannels", this.audioChannels);
        kparams.add("audioSamplingRate", this.audioSamplingRate);
        kparams.add("audioResolution", this.audioResolution);
        kparams.add("writingLib", this.writingLib);
        kparams.add("rawData", this.rawData);
        kparams.add("multiStreamInfo", this.multiStreamInfo);
        kparams.add("scanType", this.scanType);
        kparams.add("multiStream", this.multiStream);
        kparams.add("isFastStart", this.isFastStart);
        kparams.add("contentStreams", this.contentStreams);
        kparams.add("complexityValue", this.complexityValue);
        kparams.add("maxGOP", this.maxGOP);
        return kparams;
    }

}

