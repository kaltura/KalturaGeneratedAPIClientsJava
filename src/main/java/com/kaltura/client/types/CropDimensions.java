// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platforms allow them to do with
// text.
//
// Copyright (C) 2006-2023  Kaltura Inc.
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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CropDimensions.Tokenizer.class)
public class CropDimensions extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String left();
		String top();
		String width();
		String height();
	}

	/**
	 * Crop left point
	 */
	private Integer left;
	/**
	 * Crop top point
	 */
	private Integer top;
	/**
	 * Crop width
	 */
	private Integer width;
	/**
	 * Crop height
	 */
	private Integer height;

	// left:
	public Integer getLeft(){
		return this.left;
	}
	public void setLeft(Integer left){
		this.left = left;
	}

	public void left(String multirequestToken){
		setToken("left", multirequestToken);
	}

	// top:
	public Integer getTop(){
		return this.top;
	}
	public void setTop(Integer top){
		this.top = top;
	}

	public void top(String multirequestToken){
		setToken("top", multirequestToken);
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


	public CropDimensions() {
		super();
	}

	public CropDimensions(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		left = GsonParser.parseInt(jsonObject.get("left"));
		top = GsonParser.parseInt(jsonObject.get("top"));
		width = GsonParser.parseInt(jsonObject.get("width"));
		height = GsonParser.parseInt(jsonObject.get("height"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCropDimensions");
		kparams.add("left", this.left);
		kparams.add("top", this.top);
		kparams.add("width", this.width);
		kparams.add("height", this.height);
		return kparams;
	}

}

