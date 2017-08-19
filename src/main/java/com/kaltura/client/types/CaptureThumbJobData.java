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
import com.kaltura.client.enums.AssetType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CaptureThumbJobData.Tokenizer.class)
public class CaptureThumbJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String srcFileSyncLocalPath();
		String actualSrcFileSyncLocalPath();
		String srcFileSyncRemoteUrl();
		String thumbParamsOutputId();
		String thumbAssetId();
		String srcAssetId();
		String srcAssetType();
		String thumbPath();
	}

	private String srcFileSyncLocalPath;
	/**  The translated path as used by the scheduler  */
	private String actualSrcFileSyncLocalPath;
	private String srcFileSyncRemoteUrl;
	private Integer thumbParamsOutputId;
	private String thumbAssetId;
	private String srcAssetId;
	private AssetType srcAssetType;
	private String thumbPath;

	// srcFileSyncLocalPath:
	public String getSrcFileSyncLocalPath(){
		return this.srcFileSyncLocalPath;
	}
	public void setSrcFileSyncLocalPath(String srcFileSyncLocalPath){
		this.srcFileSyncLocalPath = srcFileSyncLocalPath;
	}

	public void srcFileSyncLocalPath(String multirequestToken){
		setToken("srcFileSyncLocalPath", multirequestToken);
	}

	// actualSrcFileSyncLocalPath:
	public String getActualSrcFileSyncLocalPath(){
		return this.actualSrcFileSyncLocalPath;
	}
	public void setActualSrcFileSyncLocalPath(String actualSrcFileSyncLocalPath){
		this.actualSrcFileSyncLocalPath = actualSrcFileSyncLocalPath;
	}

	public void actualSrcFileSyncLocalPath(String multirequestToken){
		setToken("actualSrcFileSyncLocalPath", multirequestToken);
	}

	// srcFileSyncRemoteUrl:
	public String getSrcFileSyncRemoteUrl(){
		return this.srcFileSyncRemoteUrl;
	}
	public void setSrcFileSyncRemoteUrl(String srcFileSyncRemoteUrl){
		this.srcFileSyncRemoteUrl = srcFileSyncRemoteUrl;
	}

	public void srcFileSyncRemoteUrl(String multirequestToken){
		setToken("srcFileSyncRemoteUrl", multirequestToken);
	}

	// thumbParamsOutputId:
	public Integer getThumbParamsOutputId(){
		return this.thumbParamsOutputId;
	}
	public void setThumbParamsOutputId(Integer thumbParamsOutputId){
		this.thumbParamsOutputId = thumbParamsOutputId;
	}

	public void thumbParamsOutputId(String multirequestToken){
		setToken("thumbParamsOutputId", multirequestToken);
	}

	// thumbAssetId:
	public String getThumbAssetId(){
		return this.thumbAssetId;
	}
	public void setThumbAssetId(String thumbAssetId){
		this.thumbAssetId = thumbAssetId;
	}

	public void thumbAssetId(String multirequestToken){
		setToken("thumbAssetId", multirequestToken);
	}

	// srcAssetId:
	public String getSrcAssetId(){
		return this.srcAssetId;
	}
	public void setSrcAssetId(String srcAssetId){
		this.srcAssetId = srcAssetId;
	}

	public void srcAssetId(String multirequestToken){
		setToken("srcAssetId", multirequestToken);
	}

	// srcAssetType:
	public AssetType getSrcAssetType(){
		return this.srcAssetType;
	}
	public void setSrcAssetType(AssetType srcAssetType){
		this.srcAssetType = srcAssetType;
	}

	public void srcAssetType(String multirequestToken){
		setToken("srcAssetType", multirequestToken);
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


	public CaptureThumbJobData() {
		super();
	}

	public CaptureThumbJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		srcFileSyncLocalPath = GsonParser.parseString(jsonObject.get("srcFileSyncLocalPath"));
		actualSrcFileSyncLocalPath = GsonParser.parseString(jsonObject.get("actualSrcFileSyncLocalPath"));
		srcFileSyncRemoteUrl = GsonParser.parseString(jsonObject.get("srcFileSyncRemoteUrl"));
		thumbParamsOutputId = GsonParser.parseInt(jsonObject.get("thumbParamsOutputId"));
		thumbAssetId = GsonParser.parseString(jsonObject.get("thumbAssetId"));
		srcAssetId = GsonParser.parseString(jsonObject.get("srcAssetId"));
		srcAssetType = AssetType.get(GsonParser.parseString(jsonObject.get("srcAssetType")));
		thumbPath = GsonParser.parseString(jsonObject.get("thumbPath"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCaptureThumbJobData");
		kparams.add("srcFileSyncLocalPath", this.srcFileSyncLocalPath);
		kparams.add("actualSrcFileSyncLocalPath", this.actualSrcFileSyncLocalPath);
		kparams.add("srcFileSyncRemoteUrl", this.srcFileSyncRemoteUrl);
		kparams.add("thumbParamsOutputId", this.thumbParamsOutputId);
		kparams.add("thumbAssetId", this.thumbAssetId);
		kparams.add("srcAssetId", this.srcAssetId);
		kparams.add("srcAssetType", this.srcAssetType);
		kparams.add("thumbPath", this.thumbPath);
		return kparams;
	}

}

