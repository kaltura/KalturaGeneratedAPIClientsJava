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
// Copyright (C) 2006-2021  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(ThumbParamsOutput.Tokenizer.class)
public class ThumbParamsOutput extends ThumbParams {
	
	public interface Tokenizer extends ThumbParams.Tokenizer {
		String thumbParamsId();
		String thumbParamsVersion();
		String thumbAssetId();
		String thumbAssetVersion();
		String rotate();
	}

	private Integer thumbParamsId;
	private String thumbParamsVersion;
	private String thumbAssetId;
	private String thumbAssetVersion;
	private Integer rotate;

	// thumbParamsId:
	public Integer getThumbParamsId(){
		return this.thumbParamsId;
	}
	public void setThumbParamsId(Integer thumbParamsId){
		this.thumbParamsId = thumbParamsId;
	}

	public void thumbParamsId(String multirequestToken){
		setToken("thumbParamsId", multirequestToken);
	}

	// thumbParamsVersion:
	public String getThumbParamsVersion(){
		return this.thumbParamsVersion;
	}
	public void setThumbParamsVersion(String thumbParamsVersion){
		this.thumbParamsVersion = thumbParamsVersion;
	}

	public void thumbParamsVersion(String multirequestToken){
		setToken("thumbParamsVersion", multirequestToken);
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

	// thumbAssetVersion:
	public String getThumbAssetVersion(){
		return this.thumbAssetVersion;
	}
	public void setThumbAssetVersion(String thumbAssetVersion){
		this.thumbAssetVersion = thumbAssetVersion;
	}

	public void thumbAssetVersion(String multirequestToken){
		setToken("thumbAssetVersion", multirequestToken);
	}

	// rotate:
	public Integer getRotate(){
		return this.rotate;
	}
	public void setRotate(Integer rotate){
		this.rotate = rotate;
	}

	public void rotate(String multirequestToken){
		setToken("rotate", multirequestToken);
	}


	public ThumbParamsOutput() {
		super();
	}

	public ThumbParamsOutput(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		thumbParamsId = GsonParser.parseInt(jsonObject.get("thumbParamsId"));
		thumbParamsVersion = GsonParser.parseString(jsonObject.get("thumbParamsVersion"));
		thumbAssetId = GsonParser.parseString(jsonObject.get("thumbAssetId"));
		thumbAssetVersion = GsonParser.parseString(jsonObject.get("thumbAssetVersion"));
		rotate = GsonParser.parseInt(jsonObject.get("rotate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaThumbParamsOutput");
		kparams.add("thumbParamsId", this.thumbParamsId);
		kparams.add("thumbParamsVersion", this.thumbParamsVersion);
		kparams.add("thumbAssetId", this.thumbAssetId);
		kparams.add("thumbAssetVersion", this.thumbAssetVersion);
		kparams.add("rotate", this.rotate);
		return kparams;
	}

}

