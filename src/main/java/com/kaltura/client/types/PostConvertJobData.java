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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PostConvertJobData.Tokenizer.class)
public class PostConvertJobData extends ConvartableJobData {
	
	public interface Tokenizer extends ConvartableJobData.Tokenizer {
		String flavorAssetId();
		String createThumb();
		String thumbPath();
		String thumbOffset();
		String thumbHeight();
		String thumbBitrate();
		String customData();
	}

	private String flavorAssetId;
	/**  Indicates if a thumbnail should be created  */
	private Boolean createThumb;
	/**  The path of the created thumbnail  */
	private String thumbPath;
	/**  The position of the thumbnail in the media file  */
	private Integer thumbOffset;
	/**  The height of the movie, will be used to comapare if this thumbnail is the best
	  we can have  */
	private Integer thumbHeight;
	/**  The bit rate of the movie, will be used to comapare if this thumbnail is the
	  best we can have  */
	private Integer thumbBitrate;
	private String customData;

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

	// createThumb:
	public Boolean getCreateThumb(){
		return this.createThumb;
	}
	public void setCreateThumb(Boolean createThumb){
		this.createThumb = createThumb;
	}

	public void createThumb(String multirequestToken){
		setToken("createThumb", multirequestToken);
	}

	// thumbPath:
	public String getThumbPath(){
		return this.thumbPath;
	}
	public void setThumbPath(String thumbPath){
		this.thumbPath = thumbPath;
	}

	public void thumbPath(String multirequestToken){
		setToken("thumbPath", multirequestToken);
	}

	// thumbOffset:
	public Integer getThumbOffset(){
		return this.thumbOffset;
	}
	public void setThumbOffset(Integer thumbOffset){
		this.thumbOffset = thumbOffset;
	}

	public void thumbOffset(String multirequestToken){
		setToken("thumbOffset", multirequestToken);
	}

	// thumbHeight:
	public Integer getThumbHeight(){
		return this.thumbHeight;
	}
	public void setThumbHeight(Integer thumbHeight){
		this.thumbHeight = thumbHeight;
	}

	public void thumbHeight(String multirequestToken){
		setToken("thumbHeight", multirequestToken);
	}

	// thumbBitrate:
	public Integer getThumbBitrate(){
		return this.thumbBitrate;
	}
	public void setThumbBitrate(Integer thumbBitrate){
		this.thumbBitrate = thumbBitrate;
	}

	public void thumbBitrate(String multirequestToken){
		setToken("thumbBitrate", multirequestToken);
	}

	// customData:
	public String getCustomData(){
		return this.customData;
	}
	public void setCustomData(String customData){
		this.customData = customData;
	}

	public void customData(String multirequestToken){
		setToken("customData", multirequestToken);
	}


	public PostConvertJobData() {
		super();
	}

	public PostConvertJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
		createThumb = GsonParser.parseBoolean(jsonObject.get("createThumb"));
		thumbPath = GsonParser.parseString(jsonObject.get("thumbPath"));
		thumbOffset = GsonParser.parseInt(jsonObject.get("thumbOffset"));
		thumbHeight = GsonParser.parseInt(jsonObject.get("thumbHeight"));
		thumbBitrate = GsonParser.parseInt(jsonObject.get("thumbBitrate"));
		customData = GsonParser.parseString(jsonObject.get("customData"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPostConvertJobData");
		kparams.add("flavorAssetId", this.flavorAssetId);
		kparams.add("createThumb", this.createThumb);
		kparams.add("thumbPath", this.thumbPath);
		kparams.add("thumbOffset", this.thumbOffset);
		kparams.add("thumbHeight", this.thumbHeight);
		kparams.add("thumbBitrate", this.thumbBitrate);
		kparams.add("customData", this.customData);
		return kparams;
	}

}

