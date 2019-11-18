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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MediaInfo.Tokenizer.class)
public class MediaInfo extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String flavorAssetId();
		String fileSize();
		String containerFormat();
		String containerId();
		String containerProfile();
		String containerDuration();
		String containerBitRate();
		String videoFormat();
		String videoCodecId();
		String videoDuration();
		String videoBitRate();
		String videoBitRateMode();
		String videoWidth();
		String videoHeight();
		String videoFrameRate();
		String videoDar();
		String videoRotation();
		String audioFormat();
		String audioCodecId();
		String audioDuration();
		String audioBitRate();
		String audioBitRateMode();
		String audioChannels();
		String audioSamplingRate();
		String audioResolution();
		String writingLib();
		String rawData();
		String multiStreamInfo();
		String scanType();
		String multiStream();
		String isFastStart();
		String contentStreams();
		String complexityValue();
		String maxGOP();
		String matrixCoefficients();
		String colorTransfer();
		String colorPrimaries();
		String pixelFormat();
		String chromaSubsampling();
		String bitsDepth();
	}

	/**
	 * The id of the media info
	 */
	private Integer id;
	/**
	 * The id of the related flavor asset
	 */
	private String flavorAssetId;
	/**
	 * The file size
	 */
	private Integer fileSize;
	/**
	 * The container format
	 */
	private String containerFormat;
	/**
	 * The container id
	 */
	private String containerId;
	/**
	 * The container profile
	 */
	private String containerProfile;
	/**
	 * The container duration
	 */
	private Integer containerDuration;
	/**
	 * The container bit rate
	 */
	private Integer containerBitRate;
	/**
	 * The video format
	 */
	private String videoFormat;
	/**
	 * The video codec id
	 */
	private String videoCodecId;
	/**
	 * The video duration
	 */
	private Integer videoDuration;
	/**
	 * The video bit rate
	 */
	private Integer videoBitRate;
	/**
	 * The video bit rate mode
	 */
	private BitRateMode videoBitRateMode;
	/**
	 * The video width
	 */
	private Integer videoWidth;
	/**
	 * The video height
	 */
	private Integer videoHeight;
	/**
	 * The video frame rate
	 */
	private Double videoFrameRate;
	/**
	 * The video display aspect ratio (dar)
	 */
	private Double videoDar;
	private Integer videoRotation;
	/**
	 * The audio format
	 */
	private String audioFormat;
	/**
	 * The audio codec id
	 */
	private String audioCodecId;
	/**
	 * The audio duration
	 */
	private Integer audioDuration;
	/**
	 * The audio bit rate
	 */
	private Integer audioBitRate;
	/**
	 * The audio bit rate mode
	 */
	private BitRateMode audioBitRateMode;
	/**
	 * The number of audio channels
	 */
	private Integer audioChannels;
	/**
	 * The audio sampling rate
	 */
	private Integer audioSamplingRate;
	/**
	 * The audio resolution
	 */
	private Integer audioResolution;
	/**
	 * The writing library
	 */
	private String writingLib;
	/**
	 * The data as returned by the mediainfo command line
	 */
	private String rawData;
	private String multiStreamInfo;
	private Integer scanType;
	private String multiStream;
	private Integer isFastStart;
	private String contentStreams;
	private Integer complexityValue;
	private Double maxGOP;
	private String matrixCoefficients;
	private String colorTransfer;
	private String colorPrimaries;
	private String pixelFormat;
	private String chromaSubsampling;
	private Integer bitsDepth;

	// id:
	public Integer getId(){
		return this.id;
	}
	// flavorAssetId:
	public String getFlavorAssetId(){
		return this.flavorAssetId;
	}
	public void setFlavorAssetId(String flavorAssetId){
		this.flavorAssetId = flavorAssetId;
	}

	public void flavorAssetId(String multirequestToken){
		setToken("flavorAssetId", multirequestToken);
	}

	// fileSize:
	public Integer getFileSize(){
		return this.fileSize;
	}
	public void setFileSize(Integer fileSize){
		this.fileSize = fileSize;
	}

	public void fileSize(String multirequestToken){
		setToken("fileSize", multirequestToken);
	}

	// containerFormat:
	public String getContainerFormat(){
		return this.containerFormat;
	}
	public void setContainerFormat(String containerFormat){
		this.containerFormat = containerFormat;
	}

	public void containerFormat(String multirequestToken){
		setToken("containerFormat", multirequestToken);
	}

	// containerId:
	public String getContainerId(){
		return this.containerId;
	}
	public void setContainerId(String containerId){
		this.containerId = containerId;
	}

	public void containerId(String multirequestToken){
		setToken("containerId", multirequestToken);
	}

	// containerProfile:
	public String getContainerProfile(){
		return this.containerProfile;
	}
	public void setContainerProfile(String containerProfile){
		this.containerProfile = containerProfile;
	}

	public void containerProfile(String multirequestToken){
		setToken("containerProfile", multirequestToken);
	}

	// containerDuration:
	public Integer getContainerDuration(){
		return this.containerDuration;
	}
	public void setContainerDuration(Integer containerDuration){
		this.containerDuration = containerDuration;
	}

	public void containerDuration(String multirequestToken){
		setToken("containerDuration", multirequestToken);
	}

	// containerBitRate:
	public Integer getContainerBitRate(){
		return this.containerBitRate;
	}
	public void setContainerBitRate(Integer containerBitRate){
		this.containerBitRate = containerBitRate;
	}

	public void containerBitRate(String multirequestToken){
		setToken("containerBitRate", multirequestToken);
	}

	// videoFormat:
	public String getVideoFormat(){
		return this.videoFormat;
	}
	public void setVideoFormat(String videoFormat){
		this.videoFormat = videoFormat;
	}

	public void videoFormat(String multirequestToken){
		setToken("videoFormat", multirequestToken);
	}

	// videoCodecId:
	public String getVideoCodecId(){
		return this.videoCodecId;
	}
	public void setVideoCodecId(String videoCodecId){
		this.videoCodecId = videoCodecId;
	}

	public void videoCodecId(String multirequestToken){
		setToken("videoCodecId", multirequestToken);
	}

	// videoDuration:
	public Integer getVideoDuration(){
		return this.videoDuration;
	}
	public void setVideoDuration(Integer videoDuration){
		this.videoDuration = videoDuration;
	}

	public void videoDuration(String multirequestToken){
		setToken("videoDuration", multirequestToken);
	}

	// videoBitRate:
	public Integer getVideoBitRate(){
		return this.videoBitRate;
	}
	public void setVideoBitRate(Integer videoBitRate){
		this.videoBitRate = videoBitRate;
	}

	public void videoBitRate(String multirequestToken){
		setToken("videoBitRate", multirequestToken);
	}

	// videoBitRateMode:
	public BitRateMode getVideoBitRateMode(){
		return this.videoBitRateMode;
	}
	public void setVideoBitRateMode(BitRateMode videoBitRateMode){
		this.videoBitRateMode = videoBitRateMode;
	}

	public void videoBitRateMode(String multirequestToken){
		setToken("videoBitRateMode", multirequestToken);
	}

	// videoWidth:
	public Integer getVideoWidth(){
		return this.videoWidth;
	}
	public void setVideoWidth(Integer videoWidth){
		this.videoWidth = videoWidth;
	}

	public void videoWidth(String multirequestToken){
		setToken("videoWidth", multirequestToken);
	}

	// videoHeight:
	public Integer getVideoHeight(){
		return this.videoHeight;
	}
	public void setVideoHeight(Integer videoHeight){
		this.videoHeight = videoHeight;
	}

	public void videoHeight(String multirequestToken){
		setToken("videoHeight", multirequestToken);
	}

	// videoFrameRate:
	public Double getVideoFrameRate(){
		return this.videoFrameRate;
	}
	public void setVideoFrameRate(Double videoFrameRate){
		this.videoFrameRate = videoFrameRate;
	}

	public void videoFrameRate(String multirequestToken){
		setToken("videoFrameRate", multirequestToken);
	}

	// videoDar:
	public Double getVideoDar(){
		return this.videoDar;
	}
	public void setVideoDar(Double videoDar){
		this.videoDar = videoDar;
	}

	public void videoDar(String multirequestToken){
		setToken("videoDar", multirequestToken);
	}

	// videoRotation:
	public Integer getVideoRotation(){
		return this.videoRotation;
	}
	public void setVideoRotation(Integer videoRotation){
		this.videoRotation = videoRotation;
	}

	public void videoRotation(String multirequestToken){
		setToken("videoRotation", multirequestToken);
	}

	// audioFormat:
	public String getAudioFormat(){
		return this.audioFormat;
	}
	public void setAudioFormat(String audioFormat){
		this.audioFormat = audioFormat;
	}

	public void audioFormat(String multirequestToken){
		setToken("audioFormat", multirequestToken);
	}

	// audioCodecId:
	public String getAudioCodecId(){
		return this.audioCodecId;
	}
	public void setAudioCodecId(String audioCodecId){
		this.audioCodecId = audioCodecId;
	}

	public void audioCodecId(String multirequestToken){
		setToken("audioCodecId", multirequestToken);
	}

	// audioDuration:
	public Integer getAudioDuration(){
		return this.audioDuration;
	}
	public void setAudioDuration(Integer audioDuration){
		this.audioDuration = audioDuration;
	}

	public void audioDuration(String multirequestToken){
		setToken("audioDuration", multirequestToken);
	}

	// audioBitRate:
	public Integer getAudioBitRate(){
		return this.audioBitRate;
	}
	public void setAudioBitRate(Integer audioBitRate){
		this.audioBitRate = audioBitRate;
	}

	public void audioBitRate(String multirequestToken){
		setToken("audioBitRate", multirequestToken);
	}

	// audioBitRateMode:
	public BitRateMode getAudioBitRateMode(){
		return this.audioBitRateMode;
	}
	public void setAudioBitRateMode(BitRateMode audioBitRateMode){
		this.audioBitRateMode = audioBitRateMode;
	}

	public void audioBitRateMode(String multirequestToken){
		setToken("audioBitRateMode", multirequestToken);
	}

	// audioChannels:
	public Integer getAudioChannels(){
		return this.audioChannels;
	}
	public void setAudioChannels(Integer audioChannels){
		this.audioChannels = audioChannels;
	}

	public void audioChannels(String multirequestToken){
		setToken("audioChannels", multirequestToken);
	}

	// audioSamplingRate:
	public Integer getAudioSamplingRate(){
		return this.audioSamplingRate;
	}
	public void setAudioSamplingRate(Integer audioSamplingRate){
		this.audioSamplingRate = audioSamplingRate;
	}

	public void audioSamplingRate(String multirequestToken){
		setToken("audioSamplingRate", multirequestToken);
	}

	// audioResolution:
	public Integer getAudioResolution(){
		return this.audioResolution;
	}
	public void setAudioResolution(Integer audioResolution){
		this.audioResolution = audioResolution;
	}

	public void audioResolution(String multirequestToken){
		setToken("audioResolution", multirequestToken);
	}

	// writingLib:
	public String getWritingLib(){
		return this.writingLib;
	}
	public void setWritingLib(String writingLib){
		this.writingLib = writingLib;
	}

	public void writingLib(String multirequestToken){
		setToken("writingLib", multirequestToken);
	}

	// rawData:
	public String getRawData(){
		return this.rawData;
	}
	public void setRawData(String rawData){
		this.rawData = rawData;
	}

	public void rawData(String multirequestToken){
		setToken("rawData", multirequestToken);
	}

	// multiStreamInfo:
	public String getMultiStreamInfo(){
		return this.multiStreamInfo;
	}
	public void setMultiStreamInfo(String multiStreamInfo){
		this.multiStreamInfo = multiStreamInfo;
	}

	public void multiStreamInfo(String multirequestToken){
		setToken("multiStreamInfo", multirequestToken);
	}

	// scanType:
	public Integer getScanType(){
		return this.scanType;
	}
	public void setScanType(Integer scanType){
		this.scanType = scanType;
	}

	public void scanType(String multirequestToken){
		setToken("scanType", multirequestToken);
	}

	// multiStream:
	public String getMultiStream(){
		return this.multiStream;
	}
	public void setMultiStream(String multiStream){
		this.multiStream = multiStream;
	}

	public void multiStream(String multirequestToken){
		setToken("multiStream", multirequestToken);
	}

	// isFastStart:
	public Integer getIsFastStart(){
		return this.isFastStart;
	}
	public void setIsFastStart(Integer isFastStart){
		this.isFastStart = isFastStart;
	}

	public void isFastStart(String multirequestToken){
		setToken("isFastStart", multirequestToken);
	}

	// contentStreams:
	public String getContentStreams(){
		return this.contentStreams;
	}
	public void setContentStreams(String contentStreams){
		this.contentStreams = contentStreams;
	}

	public void contentStreams(String multirequestToken){
		setToken("contentStreams", multirequestToken);
	}

	// complexityValue:
	public Integer getComplexityValue(){
		return this.complexityValue;
	}
	public void setComplexityValue(Integer complexityValue){
		this.complexityValue = complexityValue;
	}

	public void complexityValue(String multirequestToken){
		setToken("complexityValue", multirequestToken);
	}

	// maxGOP:
	public Double getMaxGOP(){
		return this.maxGOP;
	}
	public void setMaxGOP(Double maxGOP){
		this.maxGOP = maxGOP;
	}

	public void maxGOP(String multirequestToken){
		setToken("maxGOP", multirequestToken);
	}

	// matrixCoefficients:
	public String getMatrixCoefficients(){
		return this.matrixCoefficients;
	}
	public void setMatrixCoefficients(String matrixCoefficients){
		this.matrixCoefficients = matrixCoefficients;
	}

	public void matrixCoefficients(String multirequestToken){
		setToken("matrixCoefficients", multirequestToken);
	}

	// colorTransfer:
	public String getColorTransfer(){
		return this.colorTransfer;
	}
	public void setColorTransfer(String colorTransfer){
		this.colorTransfer = colorTransfer;
	}

	public void colorTransfer(String multirequestToken){
		setToken("colorTransfer", multirequestToken);
	}

	// colorPrimaries:
	public String getColorPrimaries(){
		return this.colorPrimaries;
	}
	public void setColorPrimaries(String colorPrimaries){
		this.colorPrimaries = colorPrimaries;
	}

	public void colorPrimaries(String multirequestToken){
		setToken("colorPrimaries", multirequestToken);
	}

	// pixelFormat:
	public String getPixelFormat(){
		return this.pixelFormat;
	}
	public void setPixelFormat(String pixelFormat){
		this.pixelFormat = pixelFormat;
	}

	public void pixelFormat(String multirequestToken){
		setToken("pixelFormat", multirequestToken);
	}

	// chromaSubsampling:
	public String getChromaSubsampling(){
		return this.chromaSubsampling;
	}
	public void setChromaSubsampling(String chromaSubsampling){
		this.chromaSubsampling = chromaSubsampling;
	}

	public void chromaSubsampling(String multirequestToken){
		setToken("chromaSubsampling", multirequestToken);
	}

	// bitsDepth:
	public Integer getBitsDepth(){
		return this.bitsDepth;
	}
	public void setBitsDepth(Integer bitsDepth){
		this.bitsDepth = bitsDepth;
	}

	public void bitsDepth(String multirequestToken){
		setToken("bitsDepth", multirequestToken);
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
		matrixCoefficients = GsonParser.parseString(jsonObject.get("matrixCoefficients"));
		colorTransfer = GsonParser.parseString(jsonObject.get("colorTransfer"));
		colorPrimaries = GsonParser.parseString(jsonObject.get("colorPrimaries"));
		pixelFormat = GsonParser.parseString(jsonObject.get("pixelFormat"));
		chromaSubsampling = GsonParser.parseString(jsonObject.get("chromaSubsampling"));
		bitsDepth = GsonParser.parseInt(jsonObject.get("bitsDepth"));

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
		kparams.add("matrixCoefficients", this.matrixCoefficients);
		kparams.add("colorTransfer", this.colorTransfer);
		kparams.add("colorPrimaries", this.colorPrimaries);
		kparams.add("pixelFormat", this.pixelFormat);
		kparams.add("chromaSubsampling", this.chromaSubsampling);
		kparams.add("bitsDepth", this.bitsDepth);
		return kparams;
	}

}

