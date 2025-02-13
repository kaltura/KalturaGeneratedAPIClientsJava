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
import com.kaltura.client.types.Coordinate;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(GeoTimeLiveStats.Tokenizer.class)
public class GeoTimeLiveStats extends EntryLiveStats {
	
	public interface Tokenizer extends EntryLiveStats.Tokenizer {
		Coordinate.Tokenizer city();
		Coordinate.Tokenizer country();
	}

	private Coordinate city;
	private Coordinate country;

	// city:
	public Coordinate getCity(){
		return this.city;
	}
	public void setCity(Coordinate city){
		this.city = city;
	}

	// country:
	public Coordinate getCountry(){
		return this.country;
	}
	public void setCountry(Coordinate country){
		this.country = country;
	}


	public GeoTimeLiveStats() {
		super();
	}

	public GeoTimeLiveStats(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		city = GsonParser.parseObject(jsonObject.getAsJsonObject("city"), Coordinate.class);
		country = GsonParser.parseObject(jsonObject.getAsJsonObject("country"), Coordinate.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaGeoTimeLiveStats");
		kparams.add("city", this.city);
		kparams.add("country", this.country);
		return kparams;
	}

}

