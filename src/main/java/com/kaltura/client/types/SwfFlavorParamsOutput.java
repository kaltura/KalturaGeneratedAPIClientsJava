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
// Copyright (C) 2006-2022  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(SwfFlavorParamsOutput.Tokenizer.class)
public class SwfFlavorParamsOutput extends FlavorParamsOutput {
	
	public interface Tokenizer extends FlavorParamsOutput.Tokenizer {
		String flashVersion();
		String poly2Bitmap();
	}

	private Integer flashVersion;
	private Boolean poly2Bitmap;

	// flashVersion:
	public Integer getFlashVersion(){
		return this.flashVersion;
	}
	public void setFlashVersion(Integer flashVersion){
		this.flashVersion = flashVersion;
	}

	public void flashVersion(String multirequestToken){
		setToken("flashVersion", multirequestToken);
	}

	// poly2Bitmap:
	public Boolean getPoly2Bitmap(){
		return this.poly2Bitmap;
	}
	public void setPoly2Bitmap(Boolean poly2Bitmap){
		this.poly2Bitmap = poly2Bitmap;
	}

	public void poly2Bitmap(String multirequestToken){
		setToken("poly2Bitmap", multirequestToken);
	}


	public SwfFlavorParamsOutput() {
		super();
	}

	public SwfFlavorParamsOutput(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		flashVersion = GsonParser.parseInt(jsonObject.get("flashVersion"));
		poly2Bitmap = GsonParser.parseBoolean(jsonObject.get("poly2Bitmap"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSwfFlavorParamsOutput");
		kparams.add("flashVersion", this.flashVersion);
		kparams.add("poly2Bitmap", this.poly2Bitmap);
		return kparams;
	}

}

