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
@MultiRequestBuilder.Tokenizer(CropAspectRatio.Tokenizer.class)
public class CropAspectRatio extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String crop();
		String aspectRatio();
	}

	private Boolean crop;
	private Double aspectRatio;

	// crop:
	public Boolean getCrop(){
		return this.crop;
	}
	public void setCrop(Boolean crop){
		this.crop = crop;
	}

	public void crop(String multirequestToken){
		setToken("crop", multirequestToken);
	}

	// aspectRatio:
	public Double getAspectRatio(){
		return this.aspectRatio;
	}
	public void setAspectRatio(Double aspectRatio){
		this.aspectRatio = aspectRatio;
	}

	public void aspectRatio(String multirequestToken){
		setToken("aspectRatio", multirequestToken);
	}


	public CropAspectRatio() {
		super();
	}

	public CropAspectRatio(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		crop = GsonParser.parseBoolean(jsonObject.get("crop"));
		aspectRatio = GsonParser.parseDouble(jsonObject.get("aspectRatio"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCropAspectRatio");
		kparams.add("crop", this.crop);
		kparams.add("aspectRatio", this.aspectRatio);
		return kparams;
	}

}

