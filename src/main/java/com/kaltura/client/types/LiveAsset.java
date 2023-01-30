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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveAsset.Tokenizer.class)
public class LiveAsset extends FlavorAsset {
	
	public interface Tokenizer extends FlavorAsset.Tokenizer {
		String multicastIP();
		String multicastPort();
	}

	private String multicastIP;
	private Integer multicastPort;

	// multicastIP:
	public String getMulticastIP(){
		return this.multicastIP;
	}
	public void setMulticastIP(String multicastIP){
		this.multicastIP = multicastIP;
	}

	public void multicastIP(String multirequestToken){
		setToken("multicastIP", multirequestToken);
	}

	// multicastPort:
	public Integer getMulticastPort(){
		return this.multicastPort;
	}
	public void setMulticastPort(Integer multicastPort){
		this.multicastPort = multicastPort;
	}

	public void multicastPort(String multirequestToken){
		setToken("multicastPort", multirequestToken);
	}


	public LiveAsset() {
		super();
	}

	public LiveAsset(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		multicastIP = GsonParser.parseString(jsonObject.get("multicastIP"));
		multicastPort = GsonParser.parseInt(jsonObject.get("multicastPort"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveAsset");
		kparams.add("multicastIP", this.multicastIP);
		kparams.add("multicastPort", this.multicastPort);
		return kparams;
	}

}

