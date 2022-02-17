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
@MultiRequestBuilder.Tokenizer(Coordinate.Tokenizer.class)
public class Coordinate extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String latitude();
		String longitude();
		String name();
	}

	private Double latitude;
	private Double longitude;
	private String name;

	// latitude:
	public Double getLatitude(){
		return this.latitude;
	}
	public void setLatitude(Double latitude){
		this.latitude = latitude;
	}

	public void latitude(String multirequestToken){
		setToken("latitude", multirequestToken);
	}

	// longitude:
	public Double getLongitude(){
		return this.longitude;
	}
	public void setLongitude(Double longitude){
		this.longitude = longitude;
	}

	public void longitude(String multirequestToken){
		setToken("longitude", multirequestToken);
	}

	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}


	public Coordinate() {
		super();
	}

	public Coordinate(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		latitude = GsonParser.parseDouble(jsonObject.get("latitude"));
		longitude = GsonParser.parseDouble(jsonObject.get("longitude"));
		name = GsonParser.parseString(jsonObject.get("name"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCoordinate");
		kparams.add("latitude", this.latitude);
		kparams.add("longitude", this.longitude);
		kparams.add("name", this.name);
		return kparams;
	}

}

