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
import com.kaltura.client.enums.ContainerFormat;
import com.kaltura.client.enums.ThumbCropType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ThumbParams.Tokenizer.class)
public class ThumbParams extends AssetParams {
	
	public interface Tokenizer extends AssetParams.Tokenizer {
		String cropType();
		String quality();
		String cropX();
		String cropY();
		String cropWidth();
		String cropHeight();
		String videoOffset();
		String width();
		String height();
		String scaleWidth();
		String scaleHeight();
		String backgroundColor();
		String sourceParamsId();
		String format();
		String density();
		String stripProfiles();
		String videoOffsetInPercentage();
	}

	private ThumbCropType cropType;
	private Integer quality;
	private Integer cropX;
	private Integer cropY;
	private Integer cropWidth;
	private Integer cropHeight;
	private Double videoOffset;
	private Integer width;
	private Integer height;
	private Double scaleWidth;
	private Double scaleHeight;
	/**  Hexadecimal value  */
	private String backgroundColor;
	/**  Id of the flavor params or the thumbnail params to be used as source for the
	  thumbnail creation  */
	private Integer sourceParamsId;
	/**  The container format of the Flavor Params  */
	private ContainerFormat format;
	/**  The image density (dpi) for example: 72 or 96  */
	private Integer density;
	/**  Strip profiles and comments  */
	private Boolean stripProfiles;
	/**  Create thumbnail from the videoLengthpercentage second  */
	private Integer videoOffsetInPercentage;

	// cropType:
	public ThumbCropType getCropType(){
		return this.cropType;
	}
	public void setCropType(ThumbCropType cropType){
		this.cropType = cropType;
	}

	public void cropType(String multirequestToken){
		setToken("cropType", multirequestToken);
	}

	// quality:
	public Integer getQuality(){
		return this.quality;
	}
	public void setQuality(Integer quality){
		this.quality = quality;
	}

	public void quality(String multirequestToken){
		setToken("quality", multirequestToken);
	}

	// cropX:
	public Integer getCropX(){
		return this.cropX;
	}
	public void setCropX(Integer cropX){
		this.cropX = cropX;
	}

	public void cropX(String multirequestToken){
		setToken("cropX", multirequestToken);
	}

	// cropY:
	public Integer getCropY(){
		return this.cropY;
	}
	public void setCropY(Integer cropY){
		this.cropY = cropY;
	}

	public void cropY(String multirequestToken){
		setToken("cropY", multirequestToken);
	}

	// cropWidth:
	public Integer getCropWidth(){
		return this.cropWidth;
	}
	public void setCropWidth(Integer cropWidth){
		this.cropWidth = cropWidth;
	}

	public void cropWidth(String multirequestToken){
		setToken("cropWidth", multirequestToken);
	}

	// cropHeight:
	public Integer getCropHeight(){
		return this.cropHeight;
	}
	public void setCropHeight(Integer cropHeight){
		this.cropHeight = cropHeight;
	}

	public void cropHeight(String multirequestToken){
		setToken("cropHeight", multirequestToken);
	}

	// videoOffset:
	public Double getVideoOffset(){
		return this.videoOffset;
	}
	public void setVideoOffset(Double videoOffset){
		this.videoOffset = videoOffset;
	}

	public void videoOffset(String multirequestToken){
		setToken("videoOffset", multirequestToken);
	}

	// width:
	public Integer getWidth(){
		return this.width;
	}
	public void setWidth(Integer width){
		this.width = width;
	}

	public void width(String multirequestToken){
		setToken("width", multirequestToken);
	}

	// height:
	public Integer getHeight(){
		return this.height;
	}
	public void setHeight(Integer height){
		this.height = height;
	}

	public void height(String multirequestToken){
		setToken("height", multirequestToken);
	}

	// scaleWidth:
	public Double getScaleWidth(){
		return this.scaleWidth;
	}
	public void setScaleWidth(Double scaleWidth){
		this.scaleWidth = scaleWidth;
	}

	public void scaleWidth(String multirequestToken){
		setToken("scaleWidth", multirequestToken);
	}

	// scaleHeight:
	public Double getScaleHeight(){
		return this.scaleHeight;
	}
	public void setScaleHeight(Double scaleHeight){
		this.scaleHeight = scaleHeight;
	}

	public void scaleHeight(String multirequestToken){
		setToken("scaleHeight", multirequestToken);
	}

	// backgroundColor:
	public String getBackgroundColor(){
		return this.backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor){
		this.backgroundColor = backgroundColor;
	}

	public void backgroundColor(String multirequestToken){
		setToken("backgroundColor", multirequestToken);
	}

	// sourceParamsId:
	public Integer getSourceParamsId(){
		return this.sourceParamsId;
	}
	public void setSourceParamsId(Integer sourceParamsId){
		this.sourceParamsId = sourceParamsId;
	}

	public void sourceParamsId(String multirequestToken){
		setToken("sourceParamsId", multirequestToken);
	}

	// format:
	public ContainerFormat getFormat(){
		return this.format;
	}
	public void setFormat(ContainerFormat format){
		this.format = format;
	}

	public void format(String multirequestToken){
		setToken("format", multirequestToken);
	}

	// density:
	public Integer getDensity(){
		return this.density;
	}
	public void setDensity(Integer density){
		this.density = density;
	}

	public void density(String multirequestToken){
		setToken("density", multirequestToken);
	}

	// stripProfiles:
	public Boolean getStripProfiles(){
		return this.stripProfiles;
	}
	public void setStripProfiles(Boolean stripProfiles){
		this.stripProfiles = stripProfiles;
	}

	public void stripProfiles(String multirequestToken){
		setToken("stripProfiles", multirequestToken);
	}

	// videoOffsetInPercentage:
	public Integer getVideoOffsetInPercentage(){
		return this.videoOffsetInPercentage;
	}
	public void setVideoOffsetInPercentage(Integer videoOffsetInPercentage){
		this.videoOffsetInPercentage = videoOffsetInPercentage;
	}

	public void videoOffsetInPercentage(String multirequestToken){
		setToken("videoOffsetInPercentage", multirequestToken);
	}


	public ThumbParams() {
		super();
	}

	public ThumbParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		cropType = ThumbCropType.get(GsonParser.parseInt(jsonObject.get("cropType")));
		quality = GsonParser.parseInt(jsonObject.get("quality"));
		cropX = GsonParser.parseInt(jsonObject.get("cropX"));
		cropY = GsonParser.parseInt(jsonObject.get("cropY"));
		cropWidth = GsonParser.parseInt(jsonObject.get("cropWidth"));
		cropHeight = GsonParser.parseInt(jsonObject.get("cropHeight"));
		videoOffset = GsonParser.parseDouble(jsonObject.get("videoOffset"));
		width = GsonParser.parseInt(jsonObject.get("width"));
		height = GsonParser.parseInt(jsonObject.get("height"));
		scaleWidth = GsonParser.parseDouble(jsonObject.get("scaleWidth"));
		scaleHeight = GsonParser.parseDouble(jsonObject.get("scaleHeight"));
		backgroundColor = GsonParser.parseString(jsonObject.get("backgroundColor"));
		sourceParamsId = GsonParser.parseInt(jsonObject.get("sourceParamsId"));
		format = ContainerFormat.get(GsonParser.parseString(jsonObject.get("format")));
		density = GsonParser.parseInt(jsonObject.get("density"));
		stripProfiles = GsonParser.parseBoolean(jsonObject.get("stripProfiles"));
		videoOffsetInPercentage = GsonParser.parseInt(jsonObject.get("videoOffsetInPercentage"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaThumbParams");
		kparams.add("cropType", this.cropType);
		kparams.add("quality", this.quality);
		kparams.add("cropX", this.cropX);
		kparams.add("cropY", this.cropY);
		kparams.add("cropWidth", this.cropWidth);
		kparams.add("cropHeight", this.cropHeight);
		kparams.add("videoOffset", this.videoOffset);
		kparams.add("width", this.width);
		kparams.add("height", this.height);
		kparams.add("scaleWidth", this.scaleWidth);
		kparams.add("scaleHeight", this.scaleHeight);
		kparams.add("backgroundColor", this.backgroundColor);
		kparams.add("sourceParamsId", this.sourceParamsId);
		kparams.add("format", this.format);
		kparams.add("density", this.density);
		kparams.add("stripProfiles", this.stripProfiles);
		kparams.add("videoOffsetInPercentage", this.videoOffsetInPercentage);
		return kparams;
	}

}

