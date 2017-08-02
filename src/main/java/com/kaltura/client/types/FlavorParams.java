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
import com.kaltura.client.enums.AudioCodec;
import com.kaltura.client.enums.ContainerFormat;
import com.kaltura.client.enums.VideoCodec;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class FlavorParams extends AssetParams {

	/**  The video codec of the Flavor Params  */
    private VideoCodec videoCodec;
	/**  The video bitrate (in KBits) of the Flavor Params  */
    private Integer videoBitrate;
	/**  The audio codec of the Flavor Params  */
    private AudioCodec audioCodec;
	/**  The audio bitrate (in KBits) of the Flavor Params  */
    private Integer audioBitrate;
	/**  The number of audio channels for "downmixing"  */
    private Integer audioChannels;
	/**  The audio sample rate of the Flavor Params  */
    private Integer audioSampleRate;
	/**  The desired width of the Flavor Params  */
    private Integer width;
	/**  The desired height of the Flavor Params  */
    private Integer height;
	/**  The frame rate of the Flavor Params  */
    private Double frameRate;
	/**  The gop size of the Flavor Params  */
    private Integer gopSize;
	/**  The list of conversion engines (comma separated)  */
    private String conversionEngines;
	/**  The list of conversion engines extra params (separated with "|")  */
    private String conversionEnginesExtraParams;
    private Boolean twoPass;
    private Integer deinterlice;
    private Integer rotate;
    private String operators;
    private Integer engineVersion;
	/**  The container format of the Flavor Params  */
    private ContainerFormat format;
    private Integer aspectRatioProcessingMode;
    private Integer forceFrameToMultiplication16;
    private Integer isGopInSec;
    private Integer isAvoidVideoShrinkFramesizeToSource;
    private Integer isAvoidVideoShrinkBitrateToSource;
    private Integer isVideoFrameRateForLowBrAppleHls;
    private String multiStream;
    private Double anamorphicPixels;
    private Integer isAvoidForcedKeyFrames;
    private Integer forcedKeyFramesMode;
    private Integer isCropIMX;
    private Integer optimizationPolicy;
    private Integer maxFrameRate;
    private Integer videoConstantBitrate;
    private Integer videoBitrateTolerance;
    private String watermarkData;
    private String subtitlesData;
    private Integer isEncrypted;
    private Double contentAwareness;
    private Integer chunkedEncodeMode;
    private Integer clipOffset;
    private Integer clipDuration;

    // videoCodec:
    public VideoCodec getVideoCodec(){
        return this.videoCodec;
    }
    public void setVideoCodec(VideoCodec videoCodec){
        this.videoCodec = videoCodec;
    }

    // videoBitrate:
    public Integer getVideoBitrate(){
        return this.videoBitrate;
    }
    public void setVideoBitrate(Integer videoBitrate){
        this.videoBitrate = videoBitrate;
    }

    // audioCodec:
    public AudioCodec getAudioCodec(){
        return this.audioCodec;
    }
    public void setAudioCodec(AudioCodec audioCodec){
        this.audioCodec = audioCodec;
    }

    // audioBitrate:
    public Integer getAudioBitrate(){
        return this.audioBitrate;
    }
    public void setAudioBitrate(Integer audioBitrate){
        this.audioBitrate = audioBitrate;
    }

    // audioChannels:
    public Integer getAudioChannels(){
        return this.audioChannels;
    }
    public void setAudioChannels(Integer audioChannels){
        this.audioChannels = audioChannels;
    }

    // audioSampleRate:
    public Integer getAudioSampleRate(){
        return this.audioSampleRate;
    }
    public void setAudioSampleRate(Integer audioSampleRate){
        this.audioSampleRate = audioSampleRate;
    }

    // width:
    public Integer getWidth(){
        return this.width;
    }
    public void setWidth(Integer width){
        this.width = width;
    }

    // height:
    public Integer getHeight(){
        return this.height;
    }
    public void setHeight(Integer height){
        this.height = height;
    }

    // frameRate:
    public Double getFrameRate(){
        return this.frameRate;
    }
    public void setFrameRate(Double frameRate){
        this.frameRate = frameRate;
    }

    // gopSize:
    public Integer getGopSize(){
        return this.gopSize;
    }
    public void setGopSize(Integer gopSize){
        this.gopSize = gopSize;
    }

    // conversionEngines:
    public String getConversionEngines(){
        return this.conversionEngines;
    }
    public void setConversionEngines(String conversionEngines){
        this.conversionEngines = conversionEngines;
    }

    // conversionEnginesExtraParams:
    public String getConversionEnginesExtraParams(){
        return this.conversionEnginesExtraParams;
    }
    public void setConversionEnginesExtraParams(String conversionEnginesExtraParams){
        this.conversionEnginesExtraParams = conversionEnginesExtraParams;
    }

    // twoPass:
    public Boolean getTwoPass(){
        return this.twoPass;
    }
    public void setTwoPass(Boolean twoPass){
        this.twoPass = twoPass;
    }

    // deinterlice:
    public Integer getDeinterlice(){
        return this.deinterlice;
    }
    public void setDeinterlice(Integer deinterlice){
        this.deinterlice = deinterlice;
    }

    // rotate:
    public Integer getRotate(){
        return this.rotate;
    }
    public void setRotate(Integer rotate){
        this.rotate = rotate;
    }

    // operators:
    public String getOperators(){
        return this.operators;
    }
    public void setOperators(String operators){
        this.operators = operators;
    }

    // engineVersion:
    public Integer getEngineVersion(){
        return this.engineVersion;
    }
    public void setEngineVersion(Integer engineVersion){
        this.engineVersion = engineVersion;
    }

    // format:
    public ContainerFormat getFormat(){
        return this.format;
    }
    public void setFormat(ContainerFormat format){
        this.format = format;
    }

    // aspectRatioProcessingMode:
    public Integer getAspectRatioProcessingMode(){
        return this.aspectRatioProcessingMode;
    }
    public void setAspectRatioProcessingMode(Integer aspectRatioProcessingMode){
        this.aspectRatioProcessingMode = aspectRatioProcessingMode;
    }

    // forceFrameToMultiplication16:
    public Integer getForceFrameToMultiplication16(){
        return this.forceFrameToMultiplication16;
    }
    public void setForceFrameToMultiplication16(Integer forceFrameToMultiplication16){
        this.forceFrameToMultiplication16 = forceFrameToMultiplication16;
    }

    // isGopInSec:
    public Integer getIsGopInSec(){
        return this.isGopInSec;
    }
    public void setIsGopInSec(Integer isGopInSec){
        this.isGopInSec = isGopInSec;
    }

    // isAvoidVideoShrinkFramesizeToSource:
    public Integer getIsAvoidVideoShrinkFramesizeToSource(){
        return this.isAvoidVideoShrinkFramesizeToSource;
    }
    public void setIsAvoidVideoShrinkFramesizeToSource(Integer isAvoidVideoShrinkFramesizeToSource){
        this.isAvoidVideoShrinkFramesizeToSource = isAvoidVideoShrinkFramesizeToSource;
    }

    // isAvoidVideoShrinkBitrateToSource:
    public Integer getIsAvoidVideoShrinkBitrateToSource(){
        return this.isAvoidVideoShrinkBitrateToSource;
    }
    public void setIsAvoidVideoShrinkBitrateToSource(Integer isAvoidVideoShrinkBitrateToSource){
        this.isAvoidVideoShrinkBitrateToSource = isAvoidVideoShrinkBitrateToSource;
    }

    // isVideoFrameRateForLowBrAppleHls:
    public Integer getIsVideoFrameRateForLowBrAppleHls(){
        return this.isVideoFrameRateForLowBrAppleHls;
    }
    public void setIsVideoFrameRateForLowBrAppleHls(Integer isVideoFrameRateForLowBrAppleHls){
        this.isVideoFrameRateForLowBrAppleHls = isVideoFrameRateForLowBrAppleHls;
    }

    // multiStream:
    public String getMultiStream(){
        return this.multiStream;
    }
    public void setMultiStream(String multiStream){
        this.multiStream = multiStream;
    }

    // anamorphicPixels:
    public Double getAnamorphicPixels(){
        return this.anamorphicPixels;
    }
    public void setAnamorphicPixels(Double anamorphicPixels){
        this.anamorphicPixels = anamorphicPixels;
    }

    // isAvoidForcedKeyFrames:
    public Integer getIsAvoidForcedKeyFrames(){
        return this.isAvoidForcedKeyFrames;
    }
    public void setIsAvoidForcedKeyFrames(Integer isAvoidForcedKeyFrames){
        this.isAvoidForcedKeyFrames = isAvoidForcedKeyFrames;
    }

    // forcedKeyFramesMode:
    public Integer getForcedKeyFramesMode(){
        return this.forcedKeyFramesMode;
    }
    public void setForcedKeyFramesMode(Integer forcedKeyFramesMode){
        this.forcedKeyFramesMode = forcedKeyFramesMode;
    }

    // isCropIMX:
    public Integer getIsCropIMX(){
        return this.isCropIMX;
    }
    public void setIsCropIMX(Integer isCropIMX){
        this.isCropIMX = isCropIMX;
    }

    // optimizationPolicy:
    public Integer getOptimizationPolicy(){
        return this.optimizationPolicy;
    }
    public void setOptimizationPolicy(Integer optimizationPolicy){
        this.optimizationPolicy = optimizationPolicy;
    }

    // maxFrameRate:
    public Integer getMaxFrameRate(){
        return this.maxFrameRate;
    }
    public void setMaxFrameRate(Integer maxFrameRate){
        this.maxFrameRate = maxFrameRate;
    }

    // videoConstantBitrate:
    public Integer getVideoConstantBitrate(){
        return this.videoConstantBitrate;
    }
    public void setVideoConstantBitrate(Integer videoConstantBitrate){
        this.videoConstantBitrate = videoConstantBitrate;
    }

    // videoBitrateTolerance:
    public Integer getVideoBitrateTolerance(){
        return this.videoBitrateTolerance;
    }
    public void setVideoBitrateTolerance(Integer videoBitrateTolerance){
        this.videoBitrateTolerance = videoBitrateTolerance;
    }

    // watermarkData:
    public String getWatermarkData(){
        return this.watermarkData;
    }
    public void setWatermarkData(String watermarkData){
        this.watermarkData = watermarkData;
    }

    // subtitlesData:
    public String getSubtitlesData(){
        return this.subtitlesData;
    }
    public void setSubtitlesData(String subtitlesData){
        this.subtitlesData = subtitlesData;
    }

    // isEncrypted:
    public Integer getIsEncrypted(){
        return this.isEncrypted;
    }
    public void setIsEncrypted(Integer isEncrypted){
        this.isEncrypted = isEncrypted;
    }

    // contentAwareness:
    public Double getContentAwareness(){
        return this.contentAwareness;
    }
    public void setContentAwareness(Double contentAwareness){
        this.contentAwareness = contentAwareness;
    }

    // chunkedEncodeMode:
    public Integer getChunkedEncodeMode(){
        return this.chunkedEncodeMode;
    }
    public void setChunkedEncodeMode(Integer chunkedEncodeMode){
        this.chunkedEncodeMode = chunkedEncodeMode;
    }

    // clipOffset:
    public Integer getClipOffset(){
        return this.clipOffset;
    }
    public void setClipOffset(Integer clipOffset){
        this.clipOffset = clipOffset;
    }

    // clipDuration:
    public Integer getClipDuration(){
        return this.clipDuration;
    }
    public void setClipDuration(Integer clipDuration){
        this.clipDuration = clipDuration;
    }


    public FlavorParams() {
       super();
    }

    public FlavorParams(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        videoCodec = VideoCodec.get(GsonParser.parseString(jsonObject.get("videoCodec")));
        videoBitrate = GsonParser.parseInt(jsonObject.get("videoBitrate"));
        audioCodec = AudioCodec.get(GsonParser.parseString(jsonObject.get("audioCodec")));
        audioBitrate = GsonParser.parseInt(jsonObject.get("audioBitrate"));
        audioChannels = GsonParser.parseInt(jsonObject.get("audioChannels"));
        audioSampleRate = GsonParser.parseInt(jsonObject.get("audioSampleRate"));
        width = GsonParser.parseInt(jsonObject.get("width"));
        height = GsonParser.parseInt(jsonObject.get("height"));
        frameRate = GsonParser.parseDouble(jsonObject.get("frameRate"));
        gopSize = GsonParser.parseInt(jsonObject.get("gopSize"));
        conversionEngines = GsonParser.parseString(jsonObject.get("conversionEngines"));
        conversionEnginesExtraParams = GsonParser.parseString(jsonObject.get("conversionEnginesExtraParams"));
        twoPass = GsonParser.parseBoolean(jsonObject.get("twoPass"));
        deinterlice = GsonParser.parseInt(jsonObject.get("deinterlice"));
        rotate = GsonParser.parseInt(jsonObject.get("rotate"));
        operators = GsonParser.parseString(jsonObject.get("operators"));
        engineVersion = GsonParser.parseInt(jsonObject.get("engineVersion"));
        format = ContainerFormat.get(GsonParser.parseString(jsonObject.get("format")));
        aspectRatioProcessingMode = GsonParser.parseInt(jsonObject.get("aspectRatioProcessingMode"));
        forceFrameToMultiplication16 = GsonParser.parseInt(jsonObject.get("forceFrameToMultiplication16"));
        isGopInSec = GsonParser.parseInt(jsonObject.get("isGopInSec"));
        isAvoidVideoShrinkFramesizeToSource = GsonParser.parseInt(jsonObject.get("isAvoidVideoShrinkFramesizeToSource"));
        isAvoidVideoShrinkBitrateToSource = GsonParser.parseInt(jsonObject.get("isAvoidVideoShrinkBitrateToSource"));
        isVideoFrameRateForLowBrAppleHls = GsonParser.parseInt(jsonObject.get("isVideoFrameRateForLowBrAppleHls"));
        multiStream = GsonParser.parseString(jsonObject.get("multiStream"));
        anamorphicPixels = GsonParser.parseDouble(jsonObject.get("anamorphicPixels"));
        isAvoidForcedKeyFrames = GsonParser.parseInt(jsonObject.get("isAvoidForcedKeyFrames"));
        forcedKeyFramesMode = GsonParser.parseInt(jsonObject.get("forcedKeyFramesMode"));
        isCropIMX = GsonParser.parseInt(jsonObject.get("isCropIMX"));
        optimizationPolicy = GsonParser.parseInt(jsonObject.get("optimizationPolicy"));
        maxFrameRate = GsonParser.parseInt(jsonObject.get("maxFrameRate"));
        videoConstantBitrate = GsonParser.parseInt(jsonObject.get("videoConstantBitrate"));
        videoBitrateTolerance = GsonParser.parseInt(jsonObject.get("videoBitrateTolerance"));
        watermarkData = GsonParser.parseString(jsonObject.get("watermarkData"));
        subtitlesData = GsonParser.parseString(jsonObject.get("subtitlesData"));
        isEncrypted = GsonParser.parseInt(jsonObject.get("isEncrypted"));
        contentAwareness = GsonParser.parseDouble(jsonObject.get("contentAwareness"));
        chunkedEncodeMode = GsonParser.parseInt(jsonObject.get("chunkedEncodeMode"));
        clipOffset = GsonParser.parseInt(jsonObject.get("clipOffset"));
        clipDuration = GsonParser.parseInt(jsonObject.get("clipDuration"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaFlavorParams");
        kparams.add("videoCodec", this.videoCodec);
        kparams.add("videoBitrate", this.videoBitrate);
        kparams.add("audioCodec", this.audioCodec);
        kparams.add("audioBitrate", this.audioBitrate);
        kparams.add("audioChannels", this.audioChannels);
        kparams.add("audioSampleRate", this.audioSampleRate);
        kparams.add("width", this.width);
        kparams.add("height", this.height);
        kparams.add("frameRate", this.frameRate);
        kparams.add("gopSize", this.gopSize);
        kparams.add("conversionEngines", this.conversionEngines);
        kparams.add("conversionEnginesExtraParams", this.conversionEnginesExtraParams);
        kparams.add("twoPass", this.twoPass);
        kparams.add("deinterlice", this.deinterlice);
        kparams.add("rotate", this.rotate);
        kparams.add("operators", this.operators);
        kparams.add("engineVersion", this.engineVersion);
        kparams.add("format", this.format);
        kparams.add("aspectRatioProcessingMode", this.aspectRatioProcessingMode);
        kparams.add("forceFrameToMultiplication16", this.forceFrameToMultiplication16);
        kparams.add("isGopInSec", this.isGopInSec);
        kparams.add("isAvoidVideoShrinkFramesizeToSource", this.isAvoidVideoShrinkFramesizeToSource);
        kparams.add("isAvoidVideoShrinkBitrateToSource", this.isAvoidVideoShrinkBitrateToSource);
        kparams.add("isVideoFrameRateForLowBrAppleHls", this.isVideoFrameRateForLowBrAppleHls);
        kparams.add("multiStream", this.multiStream);
        kparams.add("anamorphicPixels", this.anamorphicPixels);
        kparams.add("isAvoidForcedKeyFrames", this.isAvoidForcedKeyFrames);
        kparams.add("forcedKeyFramesMode", this.forcedKeyFramesMode);
        kparams.add("isCropIMX", this.isCropIMX);
        kparams.add("optimizationPolicy", this.optimizationPolicy);
        kparams.add("maxFrameRate", this.maxFrameRate);
        kparams.add("videoConstantBitrate", this.videoConstantBitrate);
        kparams.add("videoBitrateTolerance", this.videoBitrateTolerance);
        kparams.add("watermarkData", this.watermarkData);
        kparams.add("subtitlesData", this.subtitlesData);
        kparams.add("isEncrypted", this.isEncrypted);
        kparams.add("contentAwareness", this.contentAwareness);
        kparams.add("chunkedEncodeMode", this.chunkedEncodeMode);
        kparams.add("clipOffset", this.clipOffset);
        kparams.add("clipDuration", this.clipDuration);
        return kparams;
    }

}

